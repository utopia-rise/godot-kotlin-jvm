@file:Suppress("PackageDirectoryMismatch")

package godot.core

import godot.internal.memory.MemoryManager
import godot.internal.memory.TransferContext
import godot.common.interop.VoidPtr

class PackedVector4Array : PackedArray<PackedVector4Array, Vector4> {
    override val bridge = Bridge

    //INTERNALS
    internal constructor(_handle: VoidPtr) {
        this.ptr = _handle
        MemoryManager.registerNativeCoreType(this, VariantParser.PACKED_VECTOR4_ARRAY)
    }

    //CONSTRUCTOR
    constructor() {
        ptr = bridge.engine_call_constructor()
        MemoryManager.registerNativeCoreType(this, VariantParser.PACKED_VECTOR4_ARRAY)
    }

    /**
     * Constructs a [PackedVector4Array] as a copy of the given [PackedVector4Array].
     */
    constructor(from: PackedVector4Array) {
        TransferContext.writeArguments(VariantParser.PACKED_VECTOR4_ARRAY to from)
        ptr = Bridge.engine_call_constructor_packed_array()
        MemoryManager.registerNativeCoreType(this, VariantParser.PACKED_VECTOR4_ARRAY)
    }

    /**
     * Constructs a new [PackedVector4Array] by converting a [VariantArray]<[Vector4]>.
     */
    constructor(from: VariantArray<Vector4>) {
        TransferContext.writeArguments(VariantParser.ARRAY to from)
        ptr = Bridge.engine_call_constructor_array()
        MemoryManager.registerNativeCoreType(this, VariantParser.PACKED_VECTOR4_ARRAY)
    }

    override fun toString(): String {
        return "PoolVector4Array(${size})"
    }

    /**
     * WARNING: no equals function is available in the Gdnative API for this Coretype.
     * This methods implementation works but is not the fastest one.
     */
    override fun equals(other: Any?): Boolean {
        return if (other is PackedVector4Array) {
            val list1 = this.toList()
            val list2 = other.toList()
            list1 == list2
        } else {
            false
        }
    }

    override fun hashCode(): Int {
        return ptr.hashCode()
    }

    @Suppress("LocalVariableName")
    internal object Bridge : PackedArrayBridge {
        override val packedArrayVariantType = VariantParser.PACKED_VECTOR4_ARRAY
        override val elementVariantType = VariantParser.VECTOR4

        external override fun engine_call_constructor(): VoidPtr
        external override fun engine_call_constructor_packed_array(): VoidPtr
        external override fun engine_call_constructor_array(): VoidPtr

        external override fun engine_call_append(_handle: VoidPtr)
        external override fun engine_call_appendArray(_handle: VoidPtr)
        external override fun engine_call_bsearch(_handle: VoidPtr)
        external override fun engine_call_clear(_handle: VoidPtr)
        external override fun engine_call_count(_handle: VoidPtr)
        external override fun engine_call_duplicate(_handle: VoidPtr)
        external override fun engine_call_fill(_handle: VoidPtr)
        external override fun engine_call_find(_handle: VoidPtr)
        external override fun engine_call_get(_handle: VoidPtr)
        external override fun engine_call_has(_handle: VoidPtr)
        external override fun engine_call_is_empty(_handle: VoidPtr)
        external override fun engine_call_insert(_handle: VoidPtr)
        external override fun engine_call_reverse(_handle: VoidPtr)
        external override fun engine_call_pushback(_handle: VoidPtr)
        external override fun engine_call_remove_at(_handle: VoidPtr)
        external override fun engine_call_resize(_handle: VoidPtr)
        external override fun engine_call_rfind(_handle: VoidPtr)
        external override fun engine_call_set(_handle: VoidPtr)
        external override fun engine_call_size(_handle: VoidPtr)
        external override fun engine_call_slice(_handle: VoidPtr)
        external override fun engine_call_sort(_handle: VoidPtr)
        external override fun engine_call_to_byte_array(_handle: VoidPtr)
    }
}
