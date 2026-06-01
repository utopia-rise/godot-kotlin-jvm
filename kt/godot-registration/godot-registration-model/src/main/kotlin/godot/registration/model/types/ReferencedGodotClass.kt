package godot.registration.model.types

import godot.registration.model.RegisteredFunction
import godot.registration.model.RegisteredProperty
import godot.registration.model.RegisteredSignal

/**
 * Lightweight class reference used in property/parameter/return types.
 *
 * It preserves hierarchy information for ancestry-based checks without pulling in the full registered
 * members of the referenced class, which avoids recursive model construction.
 */
class ReferencedGodotClass(
    override val fqName: String,
    override val parent: GodotClass?,
    override val interfaces: List<ScriptFamily>,
) : Type(fqName, TypeKind.CLASS, isNullable = false), GodotClass {
    override val signals: List<RegisteredSignal> = emptyList()
    override val properties: List<RegisteredProperty> = emptyList()
    override val functions: List<RegisteredFunction> = emptyList()
    override val allAncestry: List<ScriptFamily> by lazy(LazyThreadSafetyMode.NONE) {
        flattenedAncestry(parent = parent, interfaces = interfaces)
    }
    override val baseGodotClass: String = parent?.baseGodotClass ?: ""
    override val inheritsRefCounted: Boolean = parent?.inheritsRefCounted ?: false
}
