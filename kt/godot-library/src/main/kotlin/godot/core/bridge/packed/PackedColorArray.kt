@file:Suppress("PackageDirectoryMismatch")

package godot.core

import godot.core.bridge.packed.PackedArray
import godot.core.bridge.packed.PackedArrayBridge
import godot.core.memory.MemoryManager
import godot.core.memory.TransferContext
import godot.util.VoidPtr

@Suppress("MemberVisibilityCanBePrivate", "unused")
class PackedColorArray : PackedArray<PackedColorArray, Color> {

    override val bridge = Bridge

    // INTERNALS
    internal constructor(_handle: VoidPtr) {
        this._handle = _handle
        MemoryManager.registerNativeCoreType(this, VariantType.PACKED_COLOR_ARRAY)
    }

    //CONSTRUCTOR
    constructor() {
        _handle = Bridge.engine_call_constructor()
        MemoryManager.registerNativeCoreType(this, VariantType.PACKED_COLOR_ARRAY)
    }

    /**
     * Constructs a [PackedColorArray] as a copy of the given [PackedColorArray].
     */
    constructor(from: PackedColorArray) {
        TransferContext.writeArguments(VariantType.PACKED_COLOR_ARRAY to from)
        _handle = Bridge.engine_call_constructor_packed_array()
        MemoryManager.registerNativeCoreType(this, VariantType.PACKED_COLOR_ARRAY)
    }

    /**
     * Constructs a new [PackedColorArray] by converting a [VariantArray]<[Color]>.
     */
    constructor(from: VariantArray<Color>) {
        TransferContext.writeArguments(VariantType.ARRAY to from)
        _handle = Bridge.engine_call_constructor_array()
        MemoryManager.registerNativeCoreType(this, VariantType.PACKED_COLOR_ARRAY)
    }

    override fun toString(): String {
        return "PackedColorArray(${size})"
    }

    /**
     * WARNING: no equals function is available in the Gdnative API for this Coretype.
     * This methods implementation works but is not the fastest one.
     */
    override fun equals(other: Any?): Boolean {
        return if (other is PackedColorArray) {
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


    @Suppress("LocalVariableName")
    internal object Bridge : PackedArrayBridge {
        override val packedArrayVariantType = VariantType.PACKED_COLOR_ARRAY
        override val elementVariantType = VariantType.COLOR

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
