@file:Suppress("PackageDirectoryMismatch")

package godot.core

import godot.util.IndexedIterator
import godot.util.VoidPtr

@Suppress("MemberVisibilityCanBePrivate", "unused")
class PoolByteArray : NativeCoreType, Iterable<Byte> {

    enum class CompressionMode {
        /**
         * Uses the FastLZ compression method.
         */
        COMPRESSION_FASTLZ,

        /**
         * Uses the DEFLATE compression method.
         */
        COMPRESSION_DEFLATE,

        /**
         * Uses the Zstandard compression method.
         */
        COMPRESSION_ZSTD,

        /**
         * Uses the gzip compression method.
         */
        COMPRESSION_GZIP
    }


    //PROPERTIES
    val size: Int
        get() {
            Bridge.engine_call_size(_handle)
            return TransferContext.readReturnValue(VariantType.JVM_INT) as Int
        }

    //CONSTRUCTOR
    constructor() {
        _handle = Bridge.engine_call_constructor()
        GarbageCollector.registerNativeCoreType(this, VariantType.POOL_BYTE_ARRAY)
    }

    internal constructor(_handle: VoidPtr) {
        this._handle = _handle
        GarbageCollector.registerNativeCoreType(this, VariantType.POOL_BYTE_ARRAY)
    }


    //POOL ARRAY API SHARED
    /**
     * Appends an element at the end of the array (alias of push_back).
     */
    fun append(byte: Byte) {
        TransferContext.writeArguments(VariantType.JVM_BYTE to byte)
        Bridge.engine_call_append(_handle)
    }


    /**
     * Appends a PoolByteArray at the end of this array.
     */
    fun appendArray(array: PoolByteArray) {
        TransferContext.writeArguments(VariantType.POOL_BYTE_ARRAY to array)
        Bridge.engine_call_appendArray(_handle)
    }

    /**
     * Returns a new PoolByteArray with the data compressed.
     * Set the compression mode using one of CompressionMode's constants.
     */
    fun compress(compressionMode: CompressionMode = CompressionMode.COMPRESSION_FASTLZ): PoolByteArray {
        TransferContext.writeArguments(VariantType.JVM_INT to compressionMode.ordinal)
        Bridge.engine_call_compress(_handle)
        return TransferContext.readReturnValue(VariantType.POOL_BYTE_ARRAY) as PoolByteArray
    }

    /**
     * Returns a new PoolByteArray with the data decompressed.
     * Set buffer_size to the size of the uncompressed data.
     * Set the compression mode using one of CompressionMode's constants.
     */
    fun decompress(bufferSize: Int, compressionMode: CompressionMode = CompressionMode.COMPRESSION_FASTLZ): PoolByteArray {
        TransferContext.writeArguments(
            VariantType.JVM_INT to bufferSize,
            VariantType.JVM_INT to compressionMode.ordinal
        )
        Bridge.engine_call_decompress(_handle)
        return TransferContext.readReturnValue(VariantType.POOL_BYTE_ARRAY) as PoolByteArray
    }

    /**
     * Returns true if the array is empty.
     */
    fun empty(): Boolean {
        Bridge.engine_call_empty(_handle)
        return TransferContext.readReturnValue(VariantType.BOOL) as Boolean
    }

    /**
     * Returns a copy of the array's contents as String.
     * Fast alternative to get_string_from_utf8 if the content is ASCII-only.
     * Unlike the UTF-8 function this function maps every byte to a character in the array.
     * Multibyte sequences will not be interpreted correctly.
     * For parsing user input always use get_string_from_utf8.
     */
    fun getStringFromAscii(): String {
        Bridge.engine_call_get_string_from_ascii(_handle)
        return TransferContext.readReturnValue(VariantType.STRING) as String
    }

    /**
     * Returns a copy of the array's contents as String.
     * Slower than get_string_from_ascii but supports UTF-8 encoded data.
     * Use this function if you are unsure about the source of the data.
     * For user input this function should always be preferred.
     */
    fun getStringFromUtf8(): String {
        Bridge.engine_call_get_string_from_utf8(_handle)
        return TransferContext.readReturnValue(VariantType.STRING) as String
    }

    /**
     * Returns a hexadecimal representation of this array as a String.
     */
    fun hexEncode(): String {
        Bridge.engine_call_hex_encode(_handle)
        return TransferContext.readReturnValue(VariantType.STRING) as String
    }

    /**
     *  Retrieve the element at the given index.
     */
    operator fun get(idx: Int): Byte {
        TransferContext.writeArguments(VariantType.JVM_INT to idx)
        Bridge.engine_call_get(_handle)
        return TransferContext.readReturnValue(VariantType.JVM_BYTE) as Byte
    }

    /**
     * Inserts a new element at a given position in the array.
     * The position must be valid, or at the end of the array (idx == size()).
     */
    fun insert(idx: Int, data: Byte) {
        TransferContext.writeArguments(VariantType.JVM_INT to idx, VariantType.JVM_BYTE to data)
        Bridge.engine_call_insert(_handle)
    }

    /**
     * Reverses the order of the elements in the array.
     */
    fun invert() {
        Bridge.engine_call_invert(_handle)
    }

    /**
     * Appends a value to the array.
     */
    fun pushBack(data: Byte) {
        TransferContext.writeArguments(VariantType.JVM_BYTE to data)
        Bridge.engine_call_pushback(_handle)
    }

    /**
     * Removes an element from the array by index.
     */
    fun remove(idx: Int) {
        TransferContext.writeArguments(VariantType.JVM_INT to idx)
        Bridge.engine_call_remove(_handle)
    }

    /**
     * Sets the size of the array. If the array is grown, reserves elements at the end of the array.
     * If the array is shrunk, truncates the array to the new size.
     */
    fun resize(size: Int) {
        TransferContext.writeArguments(VariantType.JVM_INT to size)
        Bridge.engine_call_resize(_handle)
    }

    /**
     * Changes the integer at the given index.
     */
    operator fun set(idx: Int, data: Byte) {
        TransferContext.writeArguments(VariantType.JVM_INT to idx, VariantType.JVM_BYTE to data)
        Bridge.engine_call_set(_handle)
    }


    //UTILITIES
    operator fun plus(other: Byte) {
        this.append(other)
    }

    operator fun plus(other: PoolByteArray) {
        this.appendArray(other)
    }

    override fun toString(): String {
        return "PoolByteArray(${size})"
    }

    override fun iterator(): Iterator<Byte> {
        return IndexedIterator(this::size, this::get, this::remove)
    }

    /**
     * WARNING: no equals function is available in the Gdnative API for this Coretype.
     * This methods implementation works but is not the fastest one.
     */
    override fun equals(other: Any?): Boolean {
        return if (other is PoolByteArray) {
            val list1 = this.toList()
            val list2 = other.toList()
            list1 == list2
        } else {
            false
        }
    }

    override fun hashCode(): Int {
        return _handle.hashCode()
    }


    @Suppress("FunctionName")
    private object Bridge {
        external fun engine_call_constructor(): VoidPtr

        external fun engine_call_append(_handle: VoidPtr)
        external fun engine_call_appendArray(_handle: VoidPtr)
        external fun engine_call_compress(_handle: VoidPtr)
        external fun engine_call_decompress(_handle: VoidPtr)
        external fun engine_call_empty(_handle: VoidPtr)
        external fun engine_call_get_string_from_ascii (_handle: VoidPtr)
        external fun engine_call_get_string_from_utf8 (_handle: VoidPtr)
        external fun engine_call_hex_encode(_handle: VoidPtr)
        external fun engine_call_get(_handle: VoidPtr)
        external fun engine_call_insert(_handle: VoidPtr)
        external fun engine_call_invert(_handle: VoidPtr)
        external fun engine_call_pushback(_handle: VoidPtr)
        external fun engine_call_remove(_handle: VoidPtr)
        external fun engine_call_resize(_handle: VoidPtr)
        external fun engine_call_set(_handle: VoidPtr)
        external fun engine_call_size(_handle: VoidPtr)
    }
}
