package godot.core

import godot.util.VoidPtr

@Suppress("MemberVisibilityCanBePrivate")
class PoolVector2Array : NativeCoreType {


    override val coreVariantType: VariantType = VariantType.PoolVector2Array

    //PROPERTIES
    val size: Int
        get() {
		    Bridge.engine_call_size(_handle)
			return TransferContext.readReturnValue(VariantType.JVM_INT) as Int
		}

    //CONSTRUCTOR
    constructor() {
        _handle = Bridge.engine_call_constructor()
        GarbageCollector.registerNativeCoreType(this)
    }

    internal constructor(_handle: VoidPtr) {
        this._handle = _handle
        GarbageCollector.registerNativeCoreType(this)
    }


    //POOL ARRAY API SHARED
    /**
     * Appends an element at the end of the array (alias of push_back).
     */
    fun append(i: Vector2) {
        TransferContext.writeArguments(VariantType.VECTOR2 to i)
        Bridge.engine_call_append(_handle)
    }


    /**
     * Appends a PoolIntArray at the end of this array.
     */
    fun appendArray(array: PoolIntArray) {
        TransferContext.writeArguments(VariantType.PoolVector2Array to Array)
        Bridge.engine_call_appendArray(_handle)
    }

    /**
     * Returns true if the array is empty.
     */
    fun empty() {
        Bridge.engine_call_empty(_handle)
        return TransferContext.readReturnValue(VariantType.Bool) as Boolean
    }

    /**
     *  Retrieve the element at the given index.
     */
    operator fun get(idx: Int): Vector2 {
        TransferContext.writeArguments(VariantType.JVM_INT to idx)
        Bridge.engine_call_get(_handle)
        return TransferContext.readReturnValue(VariantType.VECTOR2) as Vector2
    }

    /**
     * Inserts a new element at a given position in the array.
     * The position must be valid, or at the end of the array (idx == size()).
     */
    fun insert(idx: Int, data: Vector2) {
        TransferContext.writeArguments(VariantType.JVM_INT to idx, VariantType.VECTOR2 to data)
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
    fun pushBack(data: Vector2) {
        TransferContext.writeArguments(VariantType.VECTOR2 to data)
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
        TransferContext.writeArguments(VariantType.JVM_INT to idx)
        Bridge.engine_call_resize(_handle)
    }

    /**
     * Changes the integer at the given index.
     */
    operator fun set(idx: Int, data: Vector2) {
        TransferContext.writeArguments(VariantType.JVM_INT to idx, VariantType.VECTOR2 to data)
        Bridge.engine_call_set(_handle)
    }


    //UTILITIES
    override fun toVariant() = Variant(this)

    operator fun plus(other: Vector2) {
        this.append(other)
    }

    operator fun plus(other: PoolIntArray) {
        this.appendArray(other)
    }

    override fun toString(): String {
        return "PoolIntArray(${size})"
    }

    override fun iterator(): Iterator<Vector2> {
        return IndexedIterator(this::size, this::get, this::remove)
    }

    /**
     * WARNING: no equals function is available in the Gdnative API for this Coretype.
     * This methods implementation works but is not the fastest one.
     */
    override fun equals(other: Any?): Boolean {
        return if (other is PoolIntArray) {
            val list1 = this.toList()
            val list2 = other.toList()
            list1 == list2
        } else {
            false
        }
    }

    override fun hashCode(): Int {
        return hashCode()
    }



    @Suppress("FunctionName")
    private object Bridge {
        external fun engine_call_constructor(withParam: Boolean = false): VoidPtr

        external fun engine_call_append(_handle: VoidPtr)
        external fun engine_call_appendArray(_handle: VoidPtr)
        external fun engine_call_empty(_handle: VoidPtr)
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
