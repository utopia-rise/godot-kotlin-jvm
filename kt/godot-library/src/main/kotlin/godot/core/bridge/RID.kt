@file:Suppress("PackageDirectoryMismatch")

package godot.core
import godot.core.memory.MemoryManager
import godot.core.memory.TransferContext
import godot.util.VoidPtr

@Suppress("MemberVisibilityCanBePrivate")
class RID : NativeCoreType, Comparable<RID> {

    val id: Int
        get() = getID()

    //INTERNAL
    internal constructor(_handle: VoidPtr) {
        this._handle = _handle
    }

    //CONSTRUCTOR
    constructor() {
        _handle = Bridge.engine_call_constructor()
        MemoryManager.registerNativeCoreType(this, VariantType._RID)
    }

    constructor(from: RID) {
        _handle = Bridge.engine_call_constructor(from._handle)
        MemoryManager.registerNativeCoreType(this, VariantType._RID)
    }

    //API
    /**
     * Returns the ID of the referenced resource.
     */
    fun getID(): Int {
        Bridge.engine_call_getID(_handle)
        return TransferContext.readReturnValue(VariantType.JVM_INT) as Int
    }

    /**
     * Returns `true` if the RID is not `0`.
     */
    fun isValid(): Boolean {
        Bridge.engine_call_isValid(_handle)
        return TransferContext.readReturnValue(VariantType.BOOL) as Boolean
    }

    //UTILITIES
    override fun compareTo(other: RID): Int {
        TransferContext.writeArguments(VariantType._RID to other)
        Bridge.engine_call_compareTo(_handle)
        return when {
            this == other -> 0
            TransferContext.readReturnValue(VariantType.BOOL) as Boolean -> -1

            else -> 1
        }
    }

    override fun equals(other: Any?): Boolean {
        return when (other) {
            is RID -> {
                TransferContext.writeArguments(VariantType._RID to other)
                Bridge.engine_call_equals(_handle)
                TransferContext.readReturnValue(VariantType.BOOL) as Boolean
            }

            else -> false
        }
    }

    override fun hashCode(): Int {
        return _handle.hashCode()
    }

    override fun toString(): String {
        return "RID($id)"
    }

    @Suppress("FunctionName")
    private object Bridge {
        external fun engine_call_constructor(): VoidPtr
        external fun engine_call_constructor(from: VoidPtr): VoidPtr
        external fun engine_call_getID(_handle: VoidPtr)
        external fun engine_call_isValid(_handle: VoidPtr)
        external fun engine_call_compareTo(_handle: VoidPtr)
        external fun engine_call_equals(_handle: VoidPtr)
    }
}
