package godot.core

import godot.core.memory.GarbageCollector
import godot.util.VoidPtr

@Suppress("MemberVisibilityCanBePrivate")
class NodePath : NativeCoreType {

    //PROPERTIES
    val path: String
        get() {
            Bridge.engine_call_path(_handle)
            return TransferContext.readReturnValue(VariantType.STRING) as String
        }

    //INTERNAL
    internal constructor(_handle: VoidPtr) {
        this._handle = _handle
        GarbageCollector.registerNativeCoreType(this, VariantType.NODE_PATH)
    }

    //CONSTRUCTORS

    constructor() {
        _handle = Bridge.engine_call_constructor()
        GarbageCollector.registerNativeCoreType(this, VariantType.NODE_PATH)
    }

    constructor(from: String) {
        TransferContext.writeArguments(VariantType.STRING to from)
        _handle = Bridge.engine_call_constructor(true)
        GarbageCollector.registerNativeCoreType(this, VariantType.NODE_PATH)
    }

    constructor(from: NodePath) {
        TransferContext.writeArguments(VariantType.STRING to from.path)
        _handle = Bridge.engine_call_constructor(true)
        GarbageCollector.registerNativeCoreType(this, VariantType.NODE_PATH)
    }

    //API
    /**
     * Get the node name indicated by idx (0 to get_name_count)
     */
    fun getName(idx: Int): String {
        TransferContext.writeArguments(VariantType.JVM_INT to idx)
        Bridge.engine_call_getName(_handle)
        return TransferContext.readReturnValue(VariantType.STRING) as String
    }

    /**
     * Get the number of node names which make up the path.
     */
    fun getNameCount(): Int {
        Bridge.engine_call_getNameCount(_handle)
        return TransferContext.readReturnValue(VariantType.JVM_INT) as Int
    }

    /**
     * Get the path’s property name, or an empty string if the path doesn’t have a property.
     */
    fun getProperty(): String {
        Bridge.engine_call_getProperty(_handle)
        return TransferContext.readReturnValue(VariantType.STRING) as String
    }

    /**
     * Get the resource name indicated by idx (0 to get_subname_count)
     */
    fun getSubname(idx: Int): String {
        TransferContext.writeArguments(VariantType.JVM_INT to idx)
        Bridge.engine_call_getSubname(_handle)
        return TransferContext.readReturnValue(VariantType.STRING) as String
    }

    /**
     * Get the number of resource names in the path.
     */
    fun getSubnameCount(): Int {
        Bridge.engine_call_getSubnameCount(_handle)
        return TransferContext.readReturnValue(VariantType.JVM_INT) as Int
    }

    /**
     * Return true if the node path is absolute (not relative).
     */
    fun isAbsolute(): Boolean {
        Bridge.engine_call_isAbsolute(_handle)
        return TransferContext.readReturnValue(VariantType.BOOL) as Boolean
    }

    /**
     * Return true if the node path is empty.
     */
    fun isEmpty(): Boolean {
        Bridge.engine_call_isEmpty(_handle)
        return TransferContext.readReturnValue(VariantType.BOOL) as Boolean
    }

    /**
     *
     */
    fun getConcatenatedSubnames(): String {
        Bridge.engine_call_getConcatenatedSubnames(_handle)
        return TransferContext.readReturnValue(VariantType.STRING) as String
    }


    //UTILITIES
    override fun equals(other: Any?): Boolean {
        return if (other is NodePath) {
            TransferContext.writeArguments(VariantType.NODE_PATH to other)
            Bridge.engine_call_equals(_handle)
            return TransferContext.readReturnValue(VariantType.BOOL) as Boolean
        } else {
            false
        }
    }

    override fun hashCode(): Int {
        return _handle.hashCode()
    }

    override fun toString(): String {
        return "NodePath($path)"
    }

    @Suppress("FunctionName")
    private object Bridge {
        external fun engine_call_constructor(withParam: Boolean = false): VoidPtr

        external fun engine_call_path(_handle: VoidPtr)
        external fun engine_call_getName(_handle: VoidPtr)
        external fun engine_call_getNameCount(_handle: VoidPtr)
        external fun engine_call_getProperty(_handle: VoidPtr)
        external fun engine_call_getSubname(_handle: VoidPtr)
        external fun engine_call_getSubnameCount(_handle: VoidPtr)
        external fun engine_call_isAbsolute(_handle: VoidPtr)
        external fun engine_call_isEmpty(_handle: VoidPtr)
        external fun engine_call_getConcatenatedSubnames(_handle: VoidPtr)
        external fun engine_call_equals(_handle: VoidPtr)
    }
}
