package godot.tests.exception

import godot.Node
import godot.annotation.Member
import godot.annotation.GodotScript

@GodotScript
class ExceptionTest: Node() {

    @Member
    fun throwException() {
        throw RuntimeException("Test exception")
    }
}
