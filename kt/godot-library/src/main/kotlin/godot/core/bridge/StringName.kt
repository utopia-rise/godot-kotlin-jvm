@file:JvmName("StringNameUtils")
@file:Suppress("PackageDirectoryMismatch")

package godot.core

import godot.core.memory.MemoryManager
import godot.core.memory.TransferContext
import godot.util.VoidPtr

class StringName : NativeCoreType {

    //INTERNAL
    internal constructor(_handle: VoidPtr) {
        this._handle = _handle
        MemoryManager.registerNativeCoreType(this, VariantParser.STRING_NAME)
    }

    //CONSTRUCTORS
    constructor() {
        _handle = Bridge.engine_call_constructor()
        MemoryManager.registerNativeCoreType(this, VariantParser.STRING_NAME)
    }

    constructor(string: String) {
        TransferContext.writeArguments(VariantParser.STRING to string)
        _handle = Bridge.engine_call_constructor_string()
        MemoryManager.registerNativeCoreType(this, VariantParser.STRING_NAME)
    }

    constructor(stringName: StringName) {
        TransferContext.writeArguments(VariantParser.STRING_NAME to stringName)
        _handle = Bridge.engine_call_copy_constructor()
        MemoryManager.registerNativeCoreType(this, VariantParser.STRING_NAME)
    }

    override fun toString(): String {
        TransferContext.writeArguments()
        Bridge.engine_call_operator_string(_handle)
        return TransferContext.readReturnValue(VariantParser.STRING) as String
    }

    /**
     * Method to use JVM string methods on [StringName]. This [StringName] is first converted to [String] and then code
     * block is called on the converted [String].
     *
     * Example:  
     * ```kotlin
     * val stringName = "path/to/my/file".asStringName()
     * val splitResult = stringName.invoke { split('/') }
     * ```
     *
     * This should be used to reproduce behaviour of methods described in
     * [StringName Godot's documentation](https://docs.godotengine.org/en/stable/classes/class_stringname.html).
     */
    operator fun <T> invoke(stringOperation: String.() -> T): T = toString().stringOperation()

    @Suppress("FunctionName")
    private object Bridge {
        external fun engine_call_constructor(): VoidPtr
        external fun engine_call_copy_constructor(): VoidPtr
        external fun engine_call_constructor_string(): VoidPtr

        external fun engine_call_operator_string(_handle: VoidPtr)
    }
}

fun String.asStringName(): StringName {
    return StringName(this)
}

fun String.asCachedStringName(): StringName {
    return MemoryManager.getOrCreateStringName(this)
}

fun String.toGodotName(): StringName {
    return MemoryManager.getOrCreateGodotName(this)
}

