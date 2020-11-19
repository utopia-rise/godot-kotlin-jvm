package godot.core

import godot.util.VoidPtr
import godot.util.threadLocalLazy
import java.nio.ByteBuffer
import java.nio.ByteOrder

object TransferContext {
    val bufferCapacity = 20000000

    private val buffer by threadLocalLazy {
        val buf = ByteBuffer.allocateDirect(bufferCapacity)
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

    /*
     * Returns true if the underlying buffer object was changed.
     */
//    private fun ensureCapacity(capacity: Int): Boolean {
//        val actualCapacity = getRequiredCapacity(capacity)
//        if (buffer.capacity() < actualCapacity) {
//            buffer = ByteBuffer.allocateDirect(actualCapacity)
//            return true
//        }
//        return false
//    }

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

//    private fun getRequiredCapacity(capacity: Int): Int {
//        // extra bytes used for the delimiter
//        return CodedOutputStream.computeUInt32SizeNoTag(capacity) + capacity
//    }

}
