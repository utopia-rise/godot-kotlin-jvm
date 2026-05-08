package godot.tests.exception

import godot.api.Node
import godot.annotation.script
import godot.annotation.Register

@script
class ExceptionTest: Node() {

    @Register
    fun throwException() {
        throw RuntimeException("Test exception")
    }
}
