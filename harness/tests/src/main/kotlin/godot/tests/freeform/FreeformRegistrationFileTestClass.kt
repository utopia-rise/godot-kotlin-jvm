package godot.tests.freeform

import godot.api.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction

@RegisterClass
class FreeformRegistrationFileTestClass: Node() {
    @RegisterFunction
    fun greeting(): String = "Hello from class with freely moved registration file"
}
