@file:JvmName("StringNames")
@file:Suppress("PackageDirectoryMismatch")

package godot.core

import godot.core.memory.MemoryManager
import godot.core.memory.TransferContext
import godot.common.interop.VoidPtr
import kotlin.reflect.KFunction
import kotlin.reflect.KProperty

class StringName : NativeCoreType {

    //INTERNAL
    internal constructor(_handle: VoidPtr) {
        this.ptr = _handle
        MemoryManager.registerNativeCoreType(this, VariantParser.STRING_NAME)
    }

    //CONSTRUCTORS
    constructor() {
        ptr = Bridge.engine_call_constructor()
        MemoryManager.registerNativeCoreType(this, VariantParser.STRING_NAME)
    }

    constructor(string: String) {
        TransferContext.writeArguments(VariantParser.STRING to string)
        ptr = Bridge.engine_call_constructor_string()
        MemoryManager.registerNativeCoreType(this, VariantParser.STRING_NAME)
    }

    constructor(stringName: StringName) {
        TransferContext.writeArguments(VariantParser.STRING_NAME to stringName)
        ptr = Bridge.engine_call_copy_constructor()
        MemoryManager.registerNativeCoreType(this, VariantParser.STRING_NAME)
    }

    override fun toString(): String {
        TransferContext.writeArguments()
        Bridge.engine_call_operator_string(ptr)
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

/**
 * Directly convert String to StringName
 */
fun String.asStringName(): StringName {
    return StringName(this)
}

/**
 * Convert String to StringName and cache it for future calls.
 */
fun String.asCachedStringName(): StringName {
    return MemoryManager.getOrCreateStringName(this)
}

/**
 * Convert a snake_case version of the String to StringName and cache it for future calls.
 */
fun String.toGodotName(): StringName {
    return MemoryManager.getOrCreateGodotName(this)
}

/**
 * Convert a snake_case version of the property's name to StringName and cache it for future calls.
 */
fun KProperty<*>.toGodotName(): StringName {
    return MemoryManager.getOrCreateGodotName(this.name)
}

/**
 * Convert a snake_case version of the function's name to StringName and cache it for future calls.
 */
fun KFunction<*>.toGodotName(): StringName {
    return MemoryManager.getOrCreateGodotName(this.name)
}

