package godot.tests.freeform

import godot.Node
import godot.annotation.GodotMember
import godot.annotation.GodotScript

@GodotScript
class FreeformRegistrationFileTestClass: Node() {
    @GodotMember
    fun greeting(): String = "Hello from class with freely moved registration file"
}
