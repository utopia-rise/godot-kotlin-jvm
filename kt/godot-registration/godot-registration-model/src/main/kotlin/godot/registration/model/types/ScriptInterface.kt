package godot.registration.model.types

import godot.registration.model.RegisteredFunction
import godot.registration.model.RegisteredProperty
import godot.registration.model.RegisteredSignal

class ScriptInterface(
    override val fqName: String,
    override var interfaces: List<ScriptInterface> = emptyList(),
    override var functions: List<RegisteredFunction> = emptyList(),
) : Type(fqName, TypeKind.INTERFACE, isNullable = false), ScriptFamily {
    override val signals: List<RegisteredSignal> = emptyList()
    override val properties: List<RegisteredProperty> = emptyList()
}
