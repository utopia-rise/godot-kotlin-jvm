package godot.tests.freeform

import godot.Node
import godot.annotation.Member
import godot.annotation.GodotScript

@GodotScript
class FreeformRegistrationFileTestClass: Node() {
    @Member
    fun greeting(): String = "Hello from class with freely moved registration file"
}
