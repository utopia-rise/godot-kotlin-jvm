package godot.core

import godot.util.VoidPtr
import godot.util.threadLocalLazy
import java.nio.ByteBuffer
import java.nio.ByteOrder

object TransferContext {
    // If changed, remember to change also DEFAULT_SHARED_BUFFER_SIZE in gd_kotlin.cpp
    var bufferSize = 20_000_000

    val buffer by threadLocalLazy {
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

    fun readSingleArgument(variantType: VariantType, isNullable: Boolean = false)
            = variantType.toKotlin(buffer, isNullable)

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

    external fun setScript(rawPtr: VoidPtr, classNameIndex: Int, obj: KtObject, classLoader: ClassLoader);
    external fun invokeConstructor(classIndex: Int)
    external fun getSingleton(classIndex: Int): VoidPtr
    external fun freeObject(rawPtr: VoidPtr)

    private external fun icall(ptr: VoidPtr, methodIndex: Int, expectedReturnType: Int)
}
