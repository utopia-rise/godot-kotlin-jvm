package godot.tests.freeform

import godot.api.Node
import godot.annotation.script
import godot.annotation.Register

@script
class FreeformRegistrationFileTestClass: Node() {
    @Register
    fun greeting(): String = "Hello from class with freely moved registration file"
}
