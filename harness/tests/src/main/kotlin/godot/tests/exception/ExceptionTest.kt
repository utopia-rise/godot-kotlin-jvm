package godot.tests.exception

import godot.api.Node
import godot.annotation.GodotScript
import godot.annotation.Register

@GodotScript
class ExceptionTest: Node() {

    @Register
    fun throwException() {
        throw RuntimeException("Test exception")
    }
}
