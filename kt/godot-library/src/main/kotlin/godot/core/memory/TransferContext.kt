package godot.core.memory

import godot.core.KtObject
import godot.core.LongStringQueue
import godot.core.ObjectID
import godot.core.VariantType
import godot.tools.common.constants.Constraints
import godot.util.VoidPtr
import godot.util.threadLocalLazy
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

    private val buffer by threadLocalLazy<ByteBuffer> {
        val buf = ByteBuffer.allocateDirect(bufferSize)
        buf.order(ByteOrder.LITTLE_ENDIAN)
        buf
    }

    fun writeArguments(vararg values: Pair<VariantType, Any?>) {
        buffer.rewind()
        buffer.putInt(values.size)
        for (value in values) {
            value.first.toGodot(buffer, value.second)
        }
    }

    fun readSingleArgument(variantType: VariantType, isNullable: Boolean = false): Any? {
        buffer.rewind()
        val argsSize = buffer.int
        require(argsSize == 1) {
            "Expecting 1 parameter, but got $argsSize instead."
        }
        return variantType.toKotlin(buffer, isNullable)
    }

    fun readArguments(variantTypes: Array<VariantType>, areNullable: Array<Boolean>, returnArray: Array<Any?>) {
        buffer.rewind()
        val argsSize = buffer.int
        val argumentCount = variantTypes.size
        require(argsSize == argumentCount) {
            "Expecting $argumentCount parameter(s), but got $argsSize instead."
        }

        // Assume that variantTypes and areNullable have the same size and that returnArray is big enough
        for (i in 0 until argsSize) {
            returnArray[i] = variantTypes[i].toKotlin(buffer, areNullable[i])
        }
    }

    fun writeReturnValue(value: Any?, type: VariantType) {
        buffer.rewind()
        type.toGodot(buffer, value)
    }

    fun readReturnValue(type: VariantType, isNullable: Boolean = false): Any? {
        buffer.rewind()
        val ret = type.toKotlin(buffer, isNullable)
        return ret
    }

    fun callMethod(ptr: VoidPtr, methodIndex: Int, expectedReturnType: VariantType) {
        icall(
            ptr,
            methodIndex,
            expectedReturnType.ordinal
        )
    }

    fun initializeKtObject(obj: KtObject) {
        buffer.rewind()
        obj.rawPtr = buffer.long
        obj.id = ObjectID(buffer.long)
    }

    fun removeScriptInstance(id: Long) {
        MemoryManager.unregisterScriptInstance(id)
    }

    fun freeObject(obj: KtObject) {
        freeObject(obj.rawPtr)
    }

    external fun createNativeObject(classIndex: Int, instance: KtObject, scriptIndex: Int)
    external fun getSingleton(classIndex: Int)
    external fun freeObject(rawPtr: VoidPtr)

    private external fun icall(ptr: VoidPtr, methodIndex: Int, expectedReturnType: Int)
}
