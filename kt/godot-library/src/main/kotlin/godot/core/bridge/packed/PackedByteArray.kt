@file:Suppress("PackageDirectoryMismatch")

package godot.core

import godot.core.memory.MemoryManager
import godot.core.memory.TransferContext
import godot.util.IndexedIterator
import godot.util.VoidPtr

@Suppress("MemberVisibilityCanBePrivate", "unused")
class PackedByteArray : NativeCoreType, Iterable<Byte> {

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

    //INTERNALS
    internal constructor(handle: VoidPtr) {
        this._handle = handle
        MemoryManager.registerNativeCoreType(this, VariantType.PACKED_BYTE_ARRAY)
    }

    //PROPERTIES
    val size: Int
        get() {
            Bridge.engine_call_size(_handle)
            return TransferContext.readReturnValue(VariantType.JVM_INT) as Int
        }

    //CONSTRUCTOR
    /**
     * Constructs an empty PackedByteArray.
     */
    constructor() {
        _handle = Bridge.engine_call_constructor()
        MemoryManager.registerNativeCoreType(this, VariantType.PACKED_BYTE_ARRAY)
    }

    /**
     * Constructs a PackedByteArray as a copy of the given PackedByteArray.
     */
    constructor(from: PackedByteArray) {
        TransferContext.writeArguments(VariantType.PACKED_BYTE_ARRAY to from)
        _handle = Bridge.engine_call_constructor_packed_array()
        MemoryManager.registerNativeCoreType(this, VariantType.PACKED_BYTE_ARRAY)
    }

    /**
     * Constructs a new PackedByteArray by converting a `VariantArray<Byte>`.
     */
    constructor(from: VariantArray<Byte>) {
        TransferContext.writeArguments(VariantType.ARRAY to from)
        _handle = Bridge.engine_call_constructor_array()
        MemoryManager.registerNativeCoreType(this, VariantType.PACKED_BYTE_ARRAY)
    }

    /**
     * Constructs a new [PackedByteArray] from an existing Kotlin [ByteArray] or Java byte[].
     */
    constructor(from: ByteArray) {
        _handle = Bridge.engine_convert_byte_array(from)
        MemoryManager.registerNativeCoreType(this, VariantType.PACKED_BYTE_ARRAY)
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
    fun appendArray(array: PackedByteArray) {
        TransferContext.writeArguments(VariantType.PACKED_BYTE_ARRAY to array)
        Bridge.engine_call_appendArray(_handle)
    }

    /**
     * Finds the index of an existing value (or the insertion index that maintains sorting order, if the value is not
     * yet present in the array) using binary search. Optionally, a `before` specifier can be passed. If `false`, the
     * returned index comes after all existing entries of the value in the array.
     *
     * Note: Calling [bsearch] on an unsorted array results in unexpected behavior.
     */
    fun bsearch(value: Byte, before: Boolean = true): Int {
        TransferContext.writeArguments(VariantType.JVM_BYTE to value, VariantType.BOOL to before)
        Bridge.engine_call_bsearch(_handle)
        return TransferContext.readReturnValue(VariantType.JVM_INT) as Int
    }

    /**
     * Clears the array. This is equivalent to using [resize] with a size of `0`.
     */
    fun clear() {
        Bridge.engine_call_clear(_handle)
    }

    /**
     * Returns a new PoolByteArray with the data compressed.
     * Set the compression mode using one of [CompressionMode]'s constants.
     */
    @JvmOverloads
    fun compress(compressionMode: CompressionMode = CompressionMode.COMPRESSION_FASTLZ): PackedByteArray {
        TransferContext.writeArguments(VariantType.JVM_INT to compressionMode.ordinal)
        Bridge.engine_call_compress(_handle)
        return TransferContext.readReturnValue(VariantType.PACKED_BYTE_ARRAY) as PackedByteArray
    }

    /**
     * Returns the number of times an element is in the array.
     */
    fun count(value: Byte): Int {
        TransferContext.writeArguments(VariantType.JVM_BYTE to value)
        Bridge.engine_call_count(_handle)
        return TransferContext.readReturnValue(VariantType.JVM_INT) as Int
    }

    /**
     * Decodes a 64-bit floating point number from the bytes starting at byte_offset. Fails if the byte count is
     * insufficient. Returns 0.0 if a valid number can't be decoded.
     */
    fun decodeDouble(byteOffset: Int): Double {
        TransferContext.writeArguments(VariantType.JVM_INT to byteOffset)
        Bridge.engine_call_decode_double(_handle)
        return TransferContext.readReturnValue(VariantType.DOUBLE) as Double
    }

    /**
     * Decodes a 32-bit floating point number from the bytes starting at byte_offset. Fails if the byte count is
     * insufficient. Returns 0.0 if a valid number can't be decoded.
     */
    fun decodeFloat(byteOffset: Int): Float {
        TransferContext.writeArguments(VariantType.JVM_INT to byteOffset)
        Bridge.engine_call_decode_float(_handle)
        return TransferContext.readReturnValue(VariantType.JVM_FLOAT) as Float
    }

    /**
     * Decodes a 16-bit floating point number from the bytes starting at byte_offset. Fails if the byte count is
     * insufficient. Returns 0.0 if a valid number can't be decoded.
     */
    fun decodeHalf(byteOffset: Int): Float {
        TransferContext.writeArguments(VariantType.JVM_INT to byteOffset)
        Bridge.engine_call_decode_half(_handle)
        return TransferContext.readReturnValue(VariantType.JVM_FLOAT) as Float
    }

    /**
     * Decodes a 16-bit signed integer number from the bytes starting at byte_offset. Fails if the byte count is
     * insufficient. Returns 0 if a valid number can't be decoded.
     */
    fun decodeS16(byteOffset: Int): Int {
        TransferContext.writeArguments(VariantType.JVM_INT to byteOffset)
        Bridge.engine_call_decode_s16(_handle)
        return TransferContext.readReturnValue(VariantType.JVM_INT) as Int
    }

    /**
     * Decodes a 32-bit signed integer number from the bytes starting at byte_offset. Fails if the byte count is
     * insufficient. Returns 0 if a valid number can't be decoded.
     */
    fun decodeS32(byteOffset: Int): Int {
        TransferContext.writeArguments(VariantType.JVM_INT to byteOffset)
        Bridge.engine_call_decode_s32(_handle)
        return TransferContext.readReturnValue(VariantType.JVM_INT) as Int
    }

    /**
     * Decodes a 64-bit signed integer number from the bytes starting at byte_offset. Fails if the byte count is
     * insufficient. Returns 0 if a valid number can't be decoded.
     */
    fun decodeS64(byteOffset: Int): Long {
        TransferContext.writeArguments(VariantType.JVM_INT to byteOffset)
        Bridge.engine_call_decode_s64(_handle)
        return TransferContext.readReturnValue(VariantType.LONG) as Long
    }

    /**
     * Decodes an 8-bit signed integer number from the bytes starting at byte_offset. Fails if the byte count is
     * insufficient. Returns 0 if a valid number can't be decoded.
     */
    fun decodeS8(byteOffset: Int): Int {
        TransferContext.writeArguments(VariantType.JVM_INT to byteOffset)
        Bridge.engine_call_decode_s8(_handle)
        return TransferContext.readReturnValue(VariantType.JVM_INT) as Int
    }

    /**
     * Decodes a 16-bit unsigned integer number from the bytes starting at byte_offset. Fails if the byte count is
     * insufficient. Returns 0 if a valid number can't be decoded.
     */
    fun decodeU16(byteOffset: Int): Int {
        TransferContext.writeArguments(VariantType.JVM_INT to byteOffset)
        Bridge.engine_call_decode_u16(_handle)
        return TransferContext.readReturnValue(VariantType.JVM_INT) as Int
    }

    /**
     * Decodes a 32-bit unsigned integer number from the bytes starting at byte_offset. Fails if the byte count is
     * insufficient. Returns 0 if a valid number can't be decoded.
     */
    fun decodeU32(byteOffset: Int): Int {
        TransferContext.writeArguments(VariantType.JVM_INT to byteOffset)
        Bridge.engine_call_decode_u32(_handle)
        return TransferContext.readReturnValue(VariantType.JVM_INT) as Int
    }

    /**
     * Decodes a 64-bit unsigned integer number from the bytes starting at byte_offset. Fails if the byte count is
     * insufficient. Returns 0 if a valid number can't be decoded.
     */
    fun decodeU64(byteOffset: Int): Long {
        TransferContext.writeArguments(VariantType.JVM_INT to byteOffset)
        Bridge.engine_call_decode_u64(_handle)
        return TransferContext.readReturnValue(VariantType.LONG) as Long
    }

    /**
     * Decodes an 8-bit unsigned integer number from the bytes starting at byte_offset. Fails if the byte count is
     * insufficient. Returns 0 if a valid number can't be decoded.
     */
    fun decodeU8(byteOffset: Int): Int {
        TransferContext.writeArguments(VariantType.JVM_INT to byteOffset)
        Bridge.engine_call_decode_u8(_handle)
        return TransferContext.readReturnValue(VariantType.JVM_INT) as Int
    }

    /**
     * Decodes a Variant from the bytes starting at byte_offset. Returns null if a valid variant can't be decoded or the
     * value is Object-derived and allow_objects is false.
     */
    fun decodeVar(byteOffset: Int, allowObjects: Boolean = false): Any {
        TransferContext.writeArguments(VariantType.JVM_INT to byteOffset, VariantType.BOOL to allowObjects)
        Bridge.engine_call_decode_var(_handle)
        return TransferContext.readReturnValue(VariantType.ANY) as Any
    }

    /**
     * Decodes a size of a Variant from the bytes starting at byte_offset. Requires at least 4 bytes of data starting at
     * the offset, otherwise fails.
     */
    fun decodeVarSize(byteOffset: Int, allowObjects: Boolean = false): Int {
        TransferContext.writeArguments(VariantType.JVM_INT to byteOffset, VariantType.BOOL to allowObjects)
        Bridge.engine_call_decode_var(_handle)
        return TransferContext.readReturnValue(VariantType.JVM_INT) as Int
    }

    /**
     * Returns a new PoolByteArray with the data decompressed.
     * Set buffer_size to the size of the uncompressed data.
     * Set the compression mode using one of CompressionMode's constants.
     */
    @JvmOverloads
    fun decompress(
        bufferSize: Int,
        compressionMode: CompressionMode = CompressionMode.COMPRESSION_FASTLZ
    ): PackedByteArray {
        TransferContext.writeArguments(
            VariantType.JVM_INT to bufferSize,
            VariantType.JVM_INT to compressionMode.ordinal
        )
        Bridge.engine_call_decompress(_handle)
        return TransferContext.readReturnValue(VariantType.PACKED_BYTE_ARRAY) as PackedByteArray
    }

    /**
     * Returns a new PackedByteArray with the data decompressed. Set the compression mode using one of CompressionMode's constants. This method only accepts gzip and deflate compression modes.
     *
     * This method is potentially slower than decompress, as it may have to re-allocate its output buffer multiple times while decompressing, whereas decompress knows it's output buffer size from the beginning.
     *
     * GZIP has a maximal compression ratio of 1032:1, meaning it's very possible for a small compressed payload to decompress to a potentially very large output. To guard against this, you may provide a maximum size this function is allowed to allocate in bytes via max_output_size. Passing -1 will allow for unbounded output. If any positive value is passed, and the decompression exceeds that amount in bytes, then an error will be returned.
     */
    fun decompressDynamic(
        maxOutputSize: Int,
        compressionMode: CompressionMode = CompressionMode.COMPRESSION_FASTLZ
    ): PackedByteArray {
        TransferContext.writeArguments(
            VariantType.JVM_INT to maxOutputSize,
            VariantType.JVM_INT to compressionMode.ordinal
        )
        Bridge.engine_call_decompress_dynamic(_handle)
        return TransferContext.readReturnValue(VariantType.PACKED_BYTE_ARRAY) as PackedByteArray
    }

    /**
     * Creates a copy of the array, and returns it.
     */
    fun duplicate(): PackedByteArray {
        Bridge.engine_call_duplicate(_handle)
        return TransferContext.readReturnValue(VariantType.PACKED_BYTE_ARRAY) as PackedByteArray
    }

    /**
     * Encodes a 64-bit floating point number as bytes at the index of byte_offset bytes. The array must have at least 8
     * bytes of allocated space, starting at the offset.
     */
    fun encodeDouble(byteOffset: Int, value: Double) {
        TransferContext.writeArguments(VariantType.JVM_INT to byteOffset, VariantType.DOUBLE to value)
        Bridge.engine_call_encode_double(_handle)
    }

    /**
     * Encodes a 32-bit floating point number as bytes at the index of byte_offset bytes. The array must have at least 4
     * bytes of space, starting at the offset.
     */
    fun encodeFloat(byteOffset: Int, value: Float) {
        TransferContext.writeArguments(VariantType.JVM_INT to byteOffset, VariantType.JVM_FLOAT to value)
        Bridge.engine_call_encode_double(_handle)
    }

    /**
     * Encodes a 16-bit floating point number as bytes at the index of byte_offset bytes. The array must have at least 2
     * bytes of space, starting at the offset.
     */
    fun encodeHalf(byteOffset: Int, value: Float) {
        TransferContext.writeArguments(VariantType.JVM_INT to byteOffset, VariantType.JVM_FLOAT to value)
        Bridge.engine_call_encode_double(_handle)
    }

    /**
     * Encodes a 16-bit signed integer number as bytes at the index of byte_offset bytes. The array must have at least 2
     * bytes of space, starting at the offset.
     */
    fun encodeS16(byteOffset: Int, value: Int) {
        TransferContext.writeArguments(VariantType.JVM_INT to byteOffset, VariantType.JVM_INT to value)
        Bridge.engine_call_decode_s16(_handle)
    }

    /**
     * Encodes a 32-bit signed integer number as bytes at the index of byte_offset bytes. The array must have at least 4
     * bytes of space, starting at the offset.
     */
    fun encodeS32(byteOffset: Int, value: Int) {
        TransferContext.writeArguments(VariantType.JVM_INT to byteOffset, VariantType.JVM_INT to value)
        Bridge.engine_call_decode_s32(_handle)
    }

    /**
     * Encodes a 64-bit signed integer number as bytes at the index of byte_offset bytes. The array must have at least 8
     * bytes of space, starting at the offset.
     */
    fun encodeS64(byteOffset: Int, value: Long) {
        TransferContext.writeArguments(VariantType.JVM_INT to byteOffset, VariantType.LONG to value)
        Bridge.engine_call_decode_s64(_handle)
    }

    /**
     * Encodes an 8-bit signed integer number (signed byte) at the index of byte_offset bytes. The array must have at
     * least 1 byte of space, starting at the offset.
     */
    fun encodeS8(byteOffset: Int, value: Int) {
        TransferContext.writeArguments(VariantType.JVM_INT to byteOffset, VariantType.JVM_INT to value)
        Bridge.engine_call_decode_s8(_handle)
    }

    /**
     * Encodes a 16-bit unsigned integer number as bytes at the index of byte_offset bytes. The array must have at least
     * 2 bytes of space, starting at the offset.
     */
    fun encodeU16(byteOffset: Int, value: Int) {
        TransferContext.writeArguments(VariantType.JVM_INT to byteOffset, VariantType.JVM_INT to value)
        Bridge.engine_call_decode_u16(_handle)
    }

    /**
     * Encodes a 32-bit unsigned integer number as bytes at the index of byte_offset bytes. The array must have at least
     * 4 bytes of space, starting at the offset.
     */
    fun encodeU32(byteOffset: Int, value: Int) {
        TransferContext.writeArguments(VariantType.JVM_INT to byteOffset, VariantType.JVM_INT to value)
        Bridge.engine_call_decode_u32(_handle)
    }

    /**
     * Encodes a 64-bit unsigned integer number as bytes at the index of byte_offset bytes. The array must have at least
     * 8 bytes of space, starting at the offset.
     */
    fun encodeU64(byteOffset: Int, value: Long) {
        TransferContext.writeArguments(VariantType.JVM_INT to byteOffset, VariantType.LONG to value)
        Bridge.engine_call_decode_u64(_handle)
    }

    /**
     * Encodes an 8-bit unsigned integer number (byte) at the index of byte_offset bytes. The array must have at least 1
     * byte of space, starting at the offset.
     */
    fun encodeU8(byteOffset: Int, value: Int) {
        TransferContext.writeArguments(VariantType.JVM_INT to byteOffset, VariantType.JVM_INT to value)
        Bridge.engine_call_decode_u8(_handle)
    }

    /**
     * Encodes a Variant at the index of byte_offset bytes. A sufficient space must be allocated, depending on the
     * encoded variant's size. If allow_objects is false, Object-derived values are not permitted and will instead be
     * serialized as ID-only.
     */
    fun encodeVar(byteOffset: Int, value: Any, allowObjects: Boolean = false) {
        TransferContext.writeArguments(
            VariantType.JVM_INT to byteOffset,
            VariantType.ANY to value,
            VariantType.BOOL to allowObjects
        )
        Bridge.engine_call_encode_var(_handle)
    }

    /**
     * Assigns the given value to all elements in the array. This can typically be used together with [resize] to create
     * an array with a given size and initialized elements.
     */
    fun fill(value: Byte) {
        TransferContext.writeArguments(VariantType.JVM_BYTE to value)
        Bridge.engine_call_fill(_handle)
    }

    /**
     * Searches the array for a value and returns its index or `-1` if not found. Optionally, the initial search index can
     * be passed.
     */
    fun find(value: Byte): Int {
        TransferContext.writeArguments(VariantType.JVM_BYTE to value)
        Bridge.engine_call_find(_handle)
        return TransferContext.readReturnValue(VariantType.JVM_INT) as Int
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
     * Converts UTF-16 encoded array to [String]. If the BOM is missing, system endianness is assumed. Returns empty
     * string if source array is not valid UTF-16 string.
     */
    fun getStringFromUtf16(): String {
        Bridge.engine_call_get_string_from_utf16(_handle)
        return TransferContext.readReturnValue(VariantType.STRING) as String
    }

    /**
     * Converts UTF-32 encoded array to [String]. System endianness is assumed. Returns empty string if source array is
     * not valid UTF-32 string.
     */
    fun getStringFromUtf32(): String {
        Bridge.engine_call_get_string_from_utf32(_handle)
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
     * Returns `true` if the array contains [value].
     */
    fun has(value: Byte): Boolean {
        TransferContext.writeArguments(VariantType.JVM_BYTE to value)
        Bridge.engine_call_has(_handle)
        return TransferContext.readReturnValue(VariantType.BOOL) as Boolean
    }

    fun hasEncodedVar(byteOffset: Int, allowObjects: Boolean = false): Boolean {
        TransferContext.writeArguments(VariantType.JVM_INT to byteOffset, VariantType.BOOL to allowObjects)
        Bridge.engine_call_has_encoded_var(_handle)
        return TransferContext.readReturnValue(VariantType.BOOL) as Boolean
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
     * Returns true if the array is empty.
     */
    fun isEmpty(): Boolean {
        Bridge.engine_call_is_empty(_handle)
        return TransferContext.readReturnValue(VariantType.BOOL) as Boolean
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
    fun removeAt(idx: Int) {
        TransferContext.writeArguments(VariantType.JVM_INT to idx)
        Bridge.engine_call_remove_at(_handle)
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
     * Reverses the order of the elements in the array.
     */
    fun reverse() {
        Bridge.engine_call_reverse(_handle)
    }

    /**
     * Searches the array in reverse order. Optionally, a start search index can be passed. If negative, the start index
     * is considered relative to the end of the array.
     */
    fun rfind(value: Byte, from: Int = -1): Int {
        TransferContext.writeArguments(VariantType.JVM_BYTE to value, VariantType.JVM_INT to from)
        Bridge.engine_call_rfind(_handle)
        return TransferContext.readReturnValue(VariantType.JVM_INT) as Int
    }

    /**
     * Changes the integer at the given index.
     */
    operator fun set(idx: Int, data: Byte) {
        TransferContext.writeArguments(VariantType.JVM_INT to idx, VariantType.JVM_BYTE to data)
        Bridge.engine_call_set(_handle)
    }

    /**
     * Returns the slice of the [PackedByteArray], from begin (inclusive) to end (exclusive), as a new [PackedByteArray].
     *
     * The absolute value of begin and end will be clamped to the array size, so the default value for end makes it
     * slice to the size of the array by default (i.e. arr.slice(1) is a shorthand for arr.slice(1, arr.size())).
     *
     * If either begin or end are negative, they will be relative to the end of the array (i.e. arr.slice(0, -2) is a
     * shorthand for arr.slice(0, arr.size() - 2)).
     */
    fun slice(begin: Int, end: Int = Int.MAX_VALUE): PackedByteArray {
        TransferContext.writeArguments(VariantType.JVM_INT to begin, VariantType.JVM_INT to end)
        Bridge.engine_call_slice(_handle)
        return TransferContext.readReturnValue(VariantType.PACKED_BYTE_ARRAY) as PackedByteArray
    }

    fun sort() {
        Bridge.engine_call_sort(_handle)
    }

    fun toFloat32Array(): PackedFloat32Array {
        Bridge.engine_call_to_float32_array(_handle)
        return TransferContext.readReturnValue(VariantType.PACKED_FLOAT_32_ARRAY) as PackedFloat32Array
    }
    fun toFloat64Array(): PackedFloat64Array {
        Bridge.engine_call_to_float64_array(_handle)
        return TransferContext.readReturnValue(VariantType.PACKED_FLOAT_64_ARRAY) as PackedFloat64Array
    }
    fun toInt32Array(): PackedInt32Array {
        Bridge.engine_call_to_int32_array(_handle)
        return TransferContext.readReturnValue(VariantType.PACKED_INT_32_ARRAY) as PackedInt32Array
    }
    fun toInt64Array(): PackedInt64Array {
        Bridge.engine_call_to_int64_array(_handle)
        return TransferContext.readReturnValue(VariantType.PACKED_INT_64_ARRAY) as PackedInt64Array
    }

    //UTILITIES
    operator fun plus(other: Byte) {
        this.append(other)
    }

    operator fun plus(other: PackedByteArray) {
        this.appendArray(other)
    }

    override fun toString(): String {
        return "PackedByteArray(${size})"
    }

    override fun iterator(): Iterator<Byte> {
        return IndexedIterator(this::size, this::get, this::removeAt)
    }

    /**
     * WARNING: no equals function is available in the Gdnative API for this Coretype.
     * This methods implementation works but is not the fastest one.
     */
    override fun equals(other: Any?): Boolean {
        return if (other is PackedByteArray) {
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
        external fun engine_call_constructor_packed_array(): VoidPtr
        external fun engine_call_constructor_array(): VoidPtr
        external fun engine_convert_byte_array(array: ByteArray): VoidPtr

        external fun engine_call_append(_handle: VoidPtr)
        external fun engine_call_appendArray(_handle: VoidPtr)
        external fun engine_call_bsearch(_handle: VoidPtr)
        external fun engine_call_clear(_handle: VoidPtr)
        external fun engine_call_compress(_handle: VoidPtr)
        external fun engine_call_count(_handle: VoidPtr)
        external fun engine_call_decode_double(_handle: VoidPtr)
        external fun engine_call_decode_float(_handle: VoidPtr)
        external fun engine_call_decode_half(_handle: VoidPtr)
        external fun engine_call_decode_s16(_handle: VoidPtr)
        external fun engine_call_decode_s32(_handle: VoidPtr)
        external fun engine_call_decode_s64(_handle: VoidPtr)
        external fun engine_call_decode_s8(_handle: VoidPtr)
        external fun engine_call_decode_u16(_handle: VoidPtr)
        external fun engine_call_decode_u32(_handle: VoidPtr)
        external fun engine_call_decode_u64(_handle: VoidPtr)
        external fun engine_call_decode_u8(_handle: VoidPtr)
        external fun engine_call_decode_var(_handle: VoidPtr)
        external fun engine_call_decode_var_size(_handle: VoidPtr)
        external fun engine_call_decompress(_handle: VoidPtr)
        external fun engine_call_decompress_dynamic(_handle: VoidPtr)
        external fun engine_call_duplicate(_handle: VoidPtr)
        external fun engine_call_encode_double(_handle: VoidPtr)
        external fun engine_call_encode_float(_handle: VoidPtr)
        external fun engine_call_encode_half(_handle: VoidPtr)
        external fun engine_call_encode_s16(_handle: VoidPtr)
        external fun engine_call_encode_s32(_handle: VoidPtr)
        external fun engine_call_encode_s64(_handle: VoidPtr)
        external fun engine_call_encode_s8(_handle: VoidPtr)
        external fun engine_call_encode_u16(_handle: VoidPtr)
        external fun engine_call_encode_u32(_handle: VoidPtr)
        external fun engine_call_encode_u64(_handle: VoidPtr)
        external fun engine_call_encode_u8(_handle: VoidPtr)
        external fun engine_call_encode_var(_handle: VoidPtr)
        external fun engine_call_fill(_handle: VoidPtr)
        external fun engine_call_find(_handle: VoidPtr)
        external fun engine_call_get_string_from_ascii(_handle: VoidPtr)
        external fun engine_call_get_string_from_utf16(_handle: VoidPtr)
        external fun engine_call_get_string_from_utf32(_handle: VoidPtr)
        external fun engine_call_get_string_from_utf8(_handle: VoidPtr)
        external fun engine_call_has(_handle: VoidPtr)
        external fun engine_call_has_encoded_var(_handle: VoidPtr)
        external fun engine_call_hex_encode(_handle: VoidPtr)
        external fun engine_call_get(_handle: VoidPtr)
        external fun engine_call_insert(_handle: VoidPtr)
        external fun engine_call_is_empty(_handle: VoidPtr)
        external fun engine_call_reverse(_handle: VoidPtr)
        external fun engine_call_rfind(_handle: VoidPtr)
        external fun engine_call_pushback(_handle: VoidPtr)
        external fun engine_call_remove_at(_handle: VoidPtr)
        external fun engine_call_resize(_handle: VoidPtr)
        external fun engine_call_set(_handle: VoidPtr)
        external fun engine_call_size(_handle: VoidPtr)
        external fun engine_call_slice(_handle: VoidPtr)
        external fun engine_call_sort(_handle: VoidPtr)
        external fun engine_call_to_float32_array(_handle: VoidPtr)
        external fun engine_call_to_float64_array(_handle: VoidPtr)
        external fun engine_call_to_int32_array(_handle: VoidPtr)
        external fun engine_call_to_int64_array(_handle: VoidPtr)
    }
}

/**
 * Convert a [ByteArray] into a Godot [PackedByteArray], this call is optimised for a large amount of data.
 */
fun ByteArray.toPackedArray() = PackedByteArray(this)
