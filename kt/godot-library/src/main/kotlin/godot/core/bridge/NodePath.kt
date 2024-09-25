@file:Suppress("PackageDirectoryMismatch")

package godot.core

import godot.core.memory.MemoryManager
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.reflect.KFunction
import kotlin.reflect.KProperty

@Suppress("MemberVisibilityCanBePrivate")
class NodePath : NativeCoreType {

    //INTERNAL
    internal constructor(_handle: VoidPtr) {
        this._handle = _handle
        MemoryManager.registerNativeCoreType(this, VariantParser.NODE_PATH)
    }

    //CONSTRUCTORS

    constructor() {
        _handle = Bridge.engine_call_constructor()
        MemoryManager.registerNativeCoreType(this, VariantParser.NODE_PATH)
    }

    constructor(from: String) {
        TransferContext.writeArguments(VariantParser.STRING to from)
        _handle = Bridge.engine_call_constructor_string()
        MemoryManager.registerNativeCoreType(this, VariantParser.NODE_PATH)
    }

    constructor(from: NodePath) {
        TransferContext.writeArguments(VariantParser.NODE_PATH to from)
        _handle = Bridge.engine_call_constructor_node_path()
        MemoryManager.registerNativeCoreType(this, VariantParser.NODE_PATH)
    }

    //API

    //PROPERTIES
    val path: String
        get() {
            Bridge.engine_call_path(_handle)
            return TransferContext.readReturnValue(VariantParser.STRING) as String
        }

    /**
     * Returns a node path with a colon character (`:`) prepended, transforming it to a pure property path with no node
     * name (defaults to resolving from the current node).
     */
    fun getAsPropertyPath(): NodePath {
        Bridge.engine_call_getAsPropertyPath(_handle)
        return TransferContext.readReturnValue(VariantParser.NODE_PATH) as NodePath
    }

    /**
     * Get the node name indicated by idx (0 to get_name_count)
     */
    fun getName(idx: Int): String {
        TransferContext.writeArguments(VariantCaster.INT to idx)
        Bridge.engine_call_getName(_handle)
        return TransferContext.readReturnValue(VariantParser.STRING) as String
    }

    /**
     * Get the number of node names which make up the path.
     */
    fun getNameCount(): Int {
        Bridge.engine_call_getNameCount(_handle)
        return TransferContext.readReturnValue(VariantCaster.INT) as Int
    }

    /**
     * Get the resource name indicated by idx (0 to get_subname_count)
     */
    fun getSubname(idx: Int): String {
        TransferContext.writeArguments(VariantCaster.INT to idx)
        Bridge.engine_call_getSubname(_handle)
        return TransferContext.readReturnValue(VariantParser.STRING) as String
    }

    /**
     * Get the number of resource names in the path.
     */
    fun getSubnameCount(): Int {
        Bridge.engine_call_getSubnameCount(_handle)
        return TransferContext.readReturnValue(VariantCaster.INT) as Int
    }

    /**
     * Return true if the node path is absolute (not relative).
     */
    fun isAbsolute(): Boolean {
        Bridge.engine_call_isAbsolute(_handle)
        return TransferContext.readReturnValue(VariantParser.BOOL) as Boolean
    }

    /**
     * Returns the 32-bit hash value representing the NodePath's contents.
     */
    fun hash(): Int {
        Bridge.engine_call_hash(_handle)
        return TransferContext.readReturnValue(VariantCaster.INT) as Int
    }

    /**
     * Return true if the node path is empty.
     */
    fun isEmpty(): Boolean {
        Bridge.engine_call_isEmpty(_handle)
        return TransferContext.readReturnValue(VariantParser.BOOL) as Boolean
    }

    /**
     * Returns all paths concatenated with a slash character (/) as separator without subnames.
     */
    fun getConcatenatedNames(): StringName {
        Bridge.engine_call_getConcatenatedNames(_handle)
        return TransferContext.readReturnValue(VariantParser.STRING_NAME) as StringName
    }

    /**
     * Returns all subnames concatenated with a colon character (`:`) as separator, i.e. the right side of the first colon
     * in a node path.
     */
    fun getConcatenatedSubnames(): StringName {
        Bridge.engine_call_getConcatenatedSubnames(_handle)
        return TransferContext.readReturnValue(VariantParser.STRING_NAME) as StringName
    }


    //UTILITIES
    override fun equals(other: Any?): Boolean {
        return if (other is NodePath) {
            TransferContext.writeArguments(VariantParser.NODE_PATH to other)
            Bridge.engine_call_equals(_handle)
            return TransferContext.readReturnValue(VariantParser.BOOL) as Boolean
        } else {
            false
        }
    }

    override fun hashCode(): Int {
        return _handle.hashCode()
    }

    override fun toString(): String {
        return "NodePath(${getConcatenatedSubnames()})"
    }

    @Suppress("FunctionName")
    private object Bridge {
        external fun engine_call_constructor(): VoidPtr
        external fun engine_call_constructor_string(): VoidPtr
        external fun engine_call_constructor_node_path(): VoidPtr

        external fun engine_call_path(_handle: VoidPtr)
        external fun engine_call_getAsPropertyPath(_handle: VoidPtr)
        external fun engine_call_getName(_handle: VoidPtr)
        external fun engine_call_getNameCount(_handle: VoidPtr)
        external fun engine_call_getSubname(_handle: VoidPtr)
        external fun engine_call_getSubnameCount(_handle: VoidPtr)
        external fun engine_call_isAbsolute(_handle: VoidPtr)
        external fun engine_call_hash(_handle: VoidPtr)
        external fun engine_call_isEmpty(_handle: VoidPtr)
        external fun engine_call_getConcatenatedNames(_handle: VoidPtr)
        external fun engine_call_getConcatenatedSubnames(_handle: VoidPtr)
        external fun engine_call_equals(_handle: VoidPtr)
    }
}

/**
 * Directly convert String to NodePath
 */
fun String.asNodePath(): NodePath {
    return NodePath(this)
}

/**
 * Directly convert StringName to NodePath
 */
fun StringName.asNodePath(): NodePath {
    return NodePath(this.toString())
}

/**
 * Convert String to NodePath and cache it for future calls.
 */
fun String.asCachedNodePath(): NodePath {
    return MemoryManager.getOrCreateNodePath(this)
}

/**
 * Convert a snake_case version of the String to NodePath and cache it for future calls.
 */
fun String.toGodotPath(): NodePath {
    return MemoryManager.getOrCreateGodotPath(this)
}

/**
 * Convert a snake_case version of the property's name to NodePath and cache it for future calls.
 */
fun KProperty<*>.toGodotPath(): NodePath {
    return MemoryManager.getOrCreateGodotPath(this.name)
}
