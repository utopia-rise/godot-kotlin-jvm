package godot.core

import godot.util.VoidPtr
import godot.util.threadLocalLazy
import java.nio.ByteBuffer
import java.nio.ByteOrder

internal object TransferContext {

    private const val ARGUMENT_MAX_COUNT = 5

    private val bufferSize: Int
        get() {
            /**
             * String is the largest type you can send in a buffer, so the buffer size has to be proportional to it.
             * We add +12 to the size because we need 3 extra integers (4 bytes each): The VariantType, the long/short check and the size
             * Finally we had another + 4 because the buffer always starts with the number of arguments sent.
             * In case, the size of the String become too small for the other types. We force a value of at least 52 bytes.
             * 52 bytes is the size of the second biggest CoreType: Transform ( 48 for the data, 4 for the VariantType)
             */
            return (LongStringQueue.stringMaxSize + 12).coerceAtLeast(52) * ARGUMENT_MAX_COUNT + 4
        }

    val buffer by threadLocalLazy<ByteBuffer> {
        val buf = ByteBuffer.allocateDirect(bufferSize)
        buf.order(ByteOrder.LITTLE_ENDIAN)
        buf
    }

    fun writeArguments(vararg values: Pair<VariantType, Any?>) {
        buffer.putInt(values.size)
        for (value in values) {
            value.first.toGodot(buffer, value.second)
        }
        buffer.rewind()
    }

    fun readSingleArgument(variantType: VariantType, isNullable: Boolean = false) =
        variantType.toKotlin(buffer, isNullable)

    fun writeReturnValue(value: Any?, type: VariantType) {
        type.toGodot(buffer, value)
        buffer.rewind()
    }

    fun readReturnValue(type: VariantType, isNullable: Boolean = false): Any? {
        val ret = type.toKotlin(buffer, isNullable)
        buffer.rewind()
        return ret
    }

    fun callMethod(ptr: VoidPtr, methodIndex: Int, expectedReturnType: VariantType) {
        icall(
            ptr,
            methodIndex,
            expectedReturnType.ordinal
        )
    }

    fun freeObject(obj: KtObject) {
        freeObject(obj.rawPtr)
    }

    external fun createNativeObject(classIndex: Int, instance: KtObject, classLoader: ClassLoader, scriptIndex: Int)
    external fun getSingleton(classIndex: Int): VoidPtr
    external fun freeObject(rawPtr: VoidPtr)

    private external fun icall(ptr: VoidPtr, methodIndex: Int, expectedReturnType: Int)
}
