package godot.core

import com.google.protobuf.CodedOutputStream
import godot.util.VoidPtr
import godot.wire.Wire
import java.io.InputStream
import java.io.OutputStream
import java.nio.ByteBuffer
import java.nio.ByteOrder

object TransferContext {
    private var threadLocalBuffer = ThreadLocal.withInitial {
        val buf = ByteBuffer.allocateDirect(512)
        buf.order(ByteOrder.LITTLE_ENDIAN)
        buf
    }
    var buffer: ByteBuffer
        get() = threadLocalBuffer.get()
        set(value) { threadLocalBuffer.set(value) }

    private var outputStream = object : OutputStream() {
        override fun write(b: Int) {
            buffer.put(b.toByte())
        }
    }

    @ExperimentalUnsignedTypes
    private var inputStream = object : InputStream() {
        override fun read(): Int {
            return buffer.get().toUByte().toInt()
        }
    }

    fun writeArguments(vararg values: KtVariant): Boolean {
        val argsBuilder = Wire.FuncArgs.newBuilder()
        for (value in values) {
            argsBuilder.addArgs(value.data)
        }
        val args = argsBuilder.build()
        val bufferChanged = ensureCapacity(args.serializedSize)
        args.writeDelimitedTo(outputStream)
        buffer.rewind()
        return bufferChanged
    }

    @ExperimentalUnsignedTypes
    fun readArguments(): List<KtVariant> {
        val args = Wire.FuncArgs.parseDelimitedFrom(inputStream)
        buffer.rewind()
        val values = mutableListOf<KtVariant>()

        for (tArg in args.argsList) {
            val value = KtVariant(tArg)
            values.add(value)
        }
        return values.toList()
    }

    fun writeReturnValue(value: KtVariant): Boolean {
        val returnValue = Wire.ReturnValue.newBuilder()
            .setData(value.data)
            .build()

        val bufferChanged = ensureCapacity(returnValue.serializedSize)
        returnValue.writeDelimitedTo(outputStream)
        buffer.rewind()
        return bufferChanged
    }

    @ExperimentalUnsignedTypes
    fun readReturnValue(): KtVariant {
        val returnValue = Wire.ReturnValue.parseDelimitedFrom(inputStream)
        buffer.rewind()
        return KtVariant(returnValue.data)
    }

    /*
     * Returns true if the underlying buffer object was changed.
     */
    private fun ensureCapacity(capacity: Int): Boolean {
        val actualCapacity = getRequiredCapacity(capacity)
        if (buffer.capacity() < actualCapacity) {
            buffer = ByteBuffer.allocateDirect(actualCapacity)
            return true
        }
        return false
    }

    fun callMethod(ptr: VoidPtr, classIndex: Int, methodIndex: Int, expectedReturnType: KtVariant.Type, refreshBuffer: Boolean) {
        icall(
                ptr,
                classIndex,
                methodIndex,
                (KtVariant.TYPE_TO_WIRE_VALUE_TYPE[expectedReturnType]
                        ?: error("Unable to map $expectedReturnType to wire value type")).number,
                refreshBuffer
        )
    }

    fun freeObject(obj: KtObject) {
        freeObject(obj.rawPtr)
    }

    external fun setScript(rawPtr: VoidPtr, className: String, obj: KtObject, classLoader: ClassLoader);
    external fun invokeConstructor(classIndex: Int): VoidPtr
    external fun freeObject(rawPtr: VoidPtr)

    private external fun icall(ptr: VoidPtr, classIndex: Int, methodIndex: Int, expectedReturnType: Int, refreshBuffer: Boolean)

    private fun getRequiredCapacity(capacity: Int): Int {
        // extra bytes used for the delimiter
        return CodedOutputStream.computeUInt32SizeNoTag(capacity) + capacity
    }

}
