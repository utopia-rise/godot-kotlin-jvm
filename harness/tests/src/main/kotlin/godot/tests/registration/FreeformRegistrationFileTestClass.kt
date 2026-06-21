package godot.tests.registration

import godot.api.Node
import godot.annotation.Script
import godot.annotation.Register

@Script
class FreeformRegistrationFileTestClass: Node() {
    @Register
    fun greeting(): String = "Hello from class with freely moved registration file"
}



