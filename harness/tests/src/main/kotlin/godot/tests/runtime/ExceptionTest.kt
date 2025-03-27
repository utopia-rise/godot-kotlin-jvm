package godot.tests.runtime

import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.api.Node

@RegisterClass
class ExceptionTest : Node() {

    @RegisterFunction
    fun throwException() {
        throw RuntimeException("Test exception")
    }
}
