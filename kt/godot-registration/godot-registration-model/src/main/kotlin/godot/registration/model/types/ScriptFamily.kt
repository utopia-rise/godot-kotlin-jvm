package godot.registration.model.types

import godot.registration.model.RegisteredFunction
import godot.registration.model.RegisteredProperty
import godot.registration.model.RegisteredSignal

sealed interface ScriptFamily {
    val fqName: String
    val name: String
    val interfaces: List<ScriptInterface>
    val signals: List<RegisteredSignal>
    val properties: List<RegisteredProperty>
    val functions: List<RegisteredFunction>
}

interface GodotClass {
    val fqName: String
    val name: String
    val parent: GodotClass?

    val godotBaseClass: GodotBaseClass?
        get() {
            var current = this as GodotClass?
            while (current != null) {
                if (current is GodotBaseClass) {
                    return current
                }
                current = current.parent
            }
            return null
        }
}
