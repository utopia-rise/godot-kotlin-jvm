package godot.tests.exception

import godot.api.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction

@RegisterClass
class ExceptionTest: Node() {

    @RegisterFunction
    fun throwException() {
        throw RuntimeException("Test exception")
    }
}
