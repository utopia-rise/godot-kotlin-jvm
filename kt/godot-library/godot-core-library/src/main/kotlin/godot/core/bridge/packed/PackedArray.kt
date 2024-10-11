@file:Suppress("PackageDirectoryMismatch")

package godot.core

import godot.core.memory.TransferContext
import godot.util.IndexedIterator
import godot.util.VoidPtr

abstract class PackedArray<Derived : PackedArray<Derived, T>, T> internal constructor() : NativeCoreType(), Iterable<T> {
    internal abstract val bridge: PackedArrayBridge

    //PROPERTIES
    val size: Int
        get() {
            bridge.engine_call_size(_handle)
            return TransferContext.readReturnValue(VariantCaster.INT) as Int
        }

    //POOL ARRAY API SHARED
    /**
     * Appends an element at the end of the array (alias of push_back).
     */
    fun append(value: T) {
        TransferContext.writeArguments(bridge.elementVariantType to value)
        bridge.engine_call_append(_handle)
    }


    /**
     * Appends a PoolArray at the end of this array.
     */
    fun appendArray(array: Derived) {
        TransferContext.writeArguments(bridge.packedArrayVariantType to array)
        bridge.engine_call_appendArray(_handle)
    }

    /**
     * Finds the index of an existing value (or the insertion index that maintains sorting order, if the value is not
     * yet present in the array) using binary search. Optionally, a `before` specifier can be passed. If `false`, the
     * returned index comes after all existing entries of the value in the array.
     *
     * Note: Calling [bsearch] on an unsorted array results in unexpected behavior.
     */
    fun bsearch(value: T, before: Boolean = true): Int {
        TransferContext.writeArguments(bridge.elementVariantType to value, VariantParser.BOOL to before)
        bridge.engine_call_bsearch(_handle)
        return TransferContext.readReturnValue(VariantCaster.INT) as Int
    }

    /**
     * Clears the array. This is equivalent to using [resize] with a size of `0`.
     */
    fun clear() {
        bridge.engine_call_clear(_handle)
    }

    /**
     * Returns the number of times an element is in the array.
     */
    fun count(value: T): Int {
        TransferContext.writeArguments(bridge.elementVariantType to value)
        bridge.engine_call_count(_handle)
        return TransferContext.readReturnValue(VariantCaster.INT) as Int
    }

    /**
     * Creates a copy of the array, and returns it.
     */
    @Suppress("UNCHECKED_CAST")
    fun duplicate(): Derived {
        bridge.engine_call_duplicate(_handle)
        return TransferContext.readReturnValue(bridge.packedArrayVariantType) as Derived
    }

    /**
     * Assigns the given value to all elements in the array. This can typically be used together with [resize] to create
     * an array with a given size and initialized elements.
     */
    fun fill(value: T) {
        TransferContext.writeArguments(bridge.elementVariantType to value)
        bridge.engine_call_fill(_handle)
    }

    /**
     * Searches the array for a value and returns its index or `-1` if not found. Optionally, the initial search index can
     * be passed.
     */
    fun find(value: T): Int {
        TransferContext.writeArguments(bridge.elementVariantType to value)
        bridge.engine_call_find(_handle)
        return TransferContext.readReturnValue(VariantCaster.INT) as Int
    }

    /**
     *  Retrieve the element at the given index.
     */
    @Suppress("UNCHECKED_CAST")
    operator fun get(idx: Int): T {
        TransferContext.writeArguments(VariantCaster.INT to idx)
        bridge.engine_call_get(_handle)
        return TransferContext.readReturnValue(bridge.elementVariantType) as T
    }

    /**
     * Returns `true` if the array contains [value].
     */
    fun has(value: T): Boolean {
        TransferContext.writeArguments(bridge.elementVariantType to value)
        bridge.engine_call_has(_handle)
        return TransferContext.readReturnValue(VariantParser.BOOL) as Boolean
    }

    /**
     * Inserts a new element at a given position in the array.
     * The position must be valid, or at the end of the array (idx == size()).
     */
    fun insert(idx: Int, data: T) {
        TransferContext.writeArguments(VariantCaster.INT to idx, bridge.elementVariantType to data)
        bridge.engine_call_insert(_handle)
    }

    /**
     * Returns true if the array is empty.
     */
    fun isEmpty(): Boolean {
        bridge.engine_call_is_empty(_handle)
        return TransferContext.readReturnValue(VariantParser.BOOL) as Boolean
    }

    /**
     * Appends a value to the array.
     */
    fun pushBack(data: T) {
        TransferContext.writeArguments(bridge.elementVariantType to data)
        bridge.engine_call_pushback(_handle)
    }

    /**
     * Removes an element from the array by index.
     */
    fun removeAt(idx: Int) {
        TransferContext.writeArguments(VariantCaster.INT to idx)
        bridge.engine_call_remove_at(_handle)
    }

    /**
     * Sets the size of the array. If the array is grown, reserves elements at the end of the array.
     * If the array is shrunk, truncates the array to the new size.
     */
    fun resize(size: Int) {
        TransferContext.writeArguments(VariantCaster.INT to size)
        bridge.engine_call_resize(_handle)
    }

    /**
     * Reverses the order of the elements in the array.
     */
    fun reverse() {
        bridge.engine_call_reverse(_handle)
    }

    /**
     * Searches the array in reverse order. Optionally, a start search index can be passed. If negative, the start index
     * is considered relative to the end of the array.
     */
    fun rfind(value: T, from: Int = -1): Int {
        TransferContext.writeArguments(bridge.elementVariantType to value, VariantCaster.INT to from)
        bridge.engine_call_rfind(_handle)
        return TransferContext.readReturnValue(VariantCaster.INT) as Int
    }

    /**
     * Changes the integer at the given index.
     */
    operator fun set(idx: Int, data: T) {
        TransferContext.writeArguments(VariantCaster.INT to idx, bridge.elementVariantType to data)
        bridge.engine_call_set(_handle)
    }

    /**
     * Returns the slice of the [PackedArray], from begin (inclusive) to end (exclusive), as a new [PackedArray].
     *
     * The absolute value of begin and end will be clamped to the array size, so the default value for end makes it
     * slice to the size of the array by default (i.e. arr.slice(1) is a shorthand for arr.slice(1, arr.size())).
     *
     * If either begin or end are negative, they will be relative to the end of the array (i.e. arr.slice(0, -2) is a
     * shorthand for arr.slice(0, arr.size() - 2)).
     */
    @Suppress("UNCHECKED_CAST")
    fun slice(begin: Int, end: Int = Int.MAX_VALUE): Derived {
        TransferContext.writeArguments(VariantCaster.INT to begin, VariantCaster.INT to end)
        bridge.engine_call_slice(_handle)
        return TransferContext.readReturnValue(bridge.packedArrayVariantType) as Derived
    }

    fun sort() {
        bridge.engine_call_sort(_handle)
    }

    fun toPackedByteArray(): PackedByteArray {
        bridge.engine_call_to_byte_array(_handle)
        return TransferContext.readReturnValue(VariantParser.PACKED_BYTE_ARRAY) as PackedByteArray
    }

    //UTILITIES
    operator fun plus(other: T) {
        this.append(other)
    }

    operator fun plus(other: Derived) {
        this.appendArray(other)
    }

    override fun iterator(): Iterator<T> {
        return IndexedIterator(this::size, this::get, this::removeAt)
    }
}

@Suppress("FunctionName", "LocalVariableName")
internal interface PackedArrayBridge {
    val packedArrayVariantType: VariantConverter
    val elementVariantType: VariantConverter

    fun engine_call_constructor(): VoidPtr
    fun engine_call_constructor_packed_array(): VoidPtr
    fun engine_call_constructor_array(): VoidPtr

    fun engine_call_append(_handle: VoidPtr)
    fun engine_call_appendArray(_handle: VoidPtr)
    fun engine_call_bsearch(_handle: VoidPtr)
    fun engine_call_clear(_handle: VoidPtr)
    fun engine_call_count(_handle: VoidPtr)
    fun engine_call_duplicate(_handle: VoidPtr)
    fun engine_call_fill(_handle: VoidPtr)
    fun engine_call_find(_handle: VoidPtr)
    fun engine_call_get(_handle: VoidPtr)
    fun engine_call_has(_handle: VoidPtr)
    fun engine_call_is_empty(_handle: VoidPtr)
    fun engine_call_insert(_handle: VoidPtr)
    fun engine_call_reverse(_handle: VoidPtr)
    fun engine_call_pushback(_handle: VoidPtr)
    fun engine_call_remove_at(_handle: VoidPtr)
    fun engine_call_resize(_handle: VoidPtr)
    fun engine_call_rfind(_handle: VoidPtr)
    fun engine_call_set(_handle: VoidPtr)
    fun engine_call_size(_handle: VoidPtr)
    fun engine_call_slice(_handle: VoidPtr)
    fun engine_call_sort(_handle: VoidPtr)
    fun engine_call_to_byte_array(_handle: VoidPtr)
}
