package godot.core.memory

import godot.common.constants.Constraints
import godot.common.interop.ObjectID
import godot.common.interop.VoidPtr
import godot.common.util.threadLocal
import godot.core.KtObject
import godot.core.LongStringQueue
import godot.core.VariantConverter
import kotlincompile.definitions.GodotJvmBuildConfig
import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.Linker
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.lang.invoke.MethodHandle
import java.nio.ByteBuffer
import java.nio.ByteOrder

internal object TransferContext {
    private val bufferSize: Int
        get() {
            /**
             * String is the largest type you can send in a buffer, so the buffer size has to be proportional to it.
             * We add +12 to the size because we need 3 extra integers (4 bytes each): The VariantType, the long/short check and the size
             * Finally we add another +4 because the buffer always starts with the number of arguments sent.
             * In case, the size of the String become smaller than any other types, we force a value of at least 68 bytes.
             * 68 bytes is the size of the second largest CoreType: Projection (64 for the data, 4 for the VariantType)
             */
            return (LongStringQueue.stringMaxSize + 12).coerceAtLeast(68) * Constraints.MAX_FUNCTION_ARG_COUNT + 4
        }

    private val buffer by threadLocal<ByteBuffer> {
        val buf = ByteBuffer.allocateDirect(bufferSize)
        buf.order(ByteOrder.LITTLE_ENDIAN)
        buf
    }

    fun writeArguments(vararg values: Pair<VariantConverter, Any?>) {
        buffer.rewind()
        buffer.putInt(values.size)
        for (value in values) {
            value.first.toGodot(buffer, value.second)
        }
    }

    fun readSingleArgument(variantConverter: VariantConverter): Any? {
        buffer.rewind()
        val argsSize = buffer.int
        if (GodotJvmBuildConfig.DEBUG) {
            require(argsSize == 1) {
                "Expecting 1 parameter, but got $argsSize instead."
            }
        }
        return variantConverter.toKotlin(buffer)
    }

    fun readArguments(variantConverters: Array<VariantConverter>, returnArray: Array<Any?>) {
        buffer.rewind()
        val argsSize = buffer.int
        val argumentCount = variantConverters.size
        if (GodotJvmBuildConfig.DEBUG) {
            require(argsSize == argumentCount) {
                "Expecting $argumentCount parameter(s), but got $argsSize instead."
            }
        }

        // Assume that variantTypes and areNullable have the same size and that returnArray is big enough
        for (i in 0 until argsSize) {
            returnArray[i] = variantConverters[i].toKotlin(buffer)
        }
    }

    fun writeReturnValue(value: Any?, type: VariantConverter) {
        buffer.rewind()
        type.toGodot(buffer, value)
    }

    fun readReturnValue(type: VariantConverter): Any? {
        buffer.rewind()
        return type.toKotlin(buffer)
    }

    fun callMethod(ptr: VoidPtr, methodPtr: VoidPtr, expectedReturnType: VariantConverter) {
        handle.invoke(ptr, methodPtr)
    }

    fun initializeKtObject(obj: KtObject) {
        buffer.rewind()
        obj.ptr = buffer.long
        obj.objectID = ObjectID(buffer.long)
    }


    lateinit var handle: MethodHandle

    fun createIcallStub(icallAddress: VoidPtr) {
        val segment = MemorySegment.ofAddress(icallAddress)
        val descriptor = FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
        handle = Linker.nativeLinker().downcallHandle(segment, descriptor)
    }
}
