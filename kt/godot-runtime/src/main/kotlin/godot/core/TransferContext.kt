package godot.core

import godot.util.VoidPtr
import godot.util.threadLocalLazy
import java.nio.ByteBuffer
import java.nio.ByteOrder

object TransferContext {
    // If changed, remember to change also DEFAULT_SHARED_BUFFER_SIZE in gd_kotlin.cpp
    var bufferSize = 20_000_000

    private val buffer by threadLocalLazy {
        val buf = ByteBuffer.allocateDirect(bufferSize)
        buf.order(ByteOrder.LITTLE_ENDIAN)
        buf
    }

    fun writeArguments(vararg values: Pair<VariantType, Any>) {
        buffer.putInt(values.size)
        for (value in values) {
            value.second.encode(value.first, buffer)
        }
        buffer.rewind()
    }

    @ExperimentalUnsignedTypes
    fun readArguments(): List<Any> {
        val argSize = buffer.int
        val values = mutableListOf<Any>()
        for (i in 0 until argSize) {
            values.add(parse(buffer))
        }
        buffer.rewind()
        return values
    }

    fun writeReturnValue(value: Pair<VariantType, Any>) {
        value.second.encode(value.first, buffer)
        buffer.rewind()
    }

    @ExperimentalUnsignedTypes
    fun readReturnValue(): Any {
        val converted = parse(buffer)
        buffer.rewind()
        return converted
    }

    fun callMethod(ptr: VoidPtr, classIndex: Int, methodIndex: Int, expectedReturnType: VariantType) {
        icall(
                ptr,
                classIndex,
                methodIndex,
                expectedReturnType.ordinal
        )
    }

    fun freeObject(obj: KtObject) {
        freeObject(obj.rawPtr)
    }

    external fun setScript(rawPtr: VoidPtr, className: String, obj: KtObject, classLoader: ClassLoader);
    external fun invokeConstructor(classIndex: Int): VoidPtr
    external fun freeObject(rawPtr: VoidPtr)

    private external fun icall(ptr: VoidPtr, classIndex: Int, methodIndex: Int, expectedReturnType: Int)
}
