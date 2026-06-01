package godot.registration.model.types

import godot.registration.model.RegisteredFunction
import godot.registration.model.RegisteredProperty
import godot.registration.model.RegisteredSignal

/**
 * Lightweight interface reference used in class-type ancestry graphs for referenced types.
 */
class ReferencedScriptInterface(
    override val fqName: String,
    override val interfaces: List<ScriptFamily> = emptyList(),
) : Type(fqName, TypeKind.INTERFACE, isNullable = false), ScriptFamily {
    override val signals: List<RegisteredSignal> = emptyList()
    override val properties: List<RegisteredProperty> = emptyList()
    override val functions: List<RegisteredFunction> = emptyList()
    override val allAncestry: List<ScriptFamily> by lazy(LazyThreadSafetyMode.NONE) {
        flattenedAncestry(interfaces = interfaces)
    }
}
