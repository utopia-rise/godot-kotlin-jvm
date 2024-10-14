package godot.tests.exception

import godot.Node
import godot.annotation.GodotMember
import godot.annotation.GodotScript

@GodotScript
class ExceptionTest: Node() {

    @GodotMember
    fun throwException() {
        throw RuntimeException("Test exception")
    }
}
