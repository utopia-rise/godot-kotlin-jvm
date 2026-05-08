package godot.tests.freeform

import godot.api.Node
import godot.annotation.GodotScript
import godot.annotation.Register

@GodotScript
class FreeformRegistrationFileTestClass: Node() {
    @Register
    fun greeting(): String = "Hello from class with freely moved registration file"
}
