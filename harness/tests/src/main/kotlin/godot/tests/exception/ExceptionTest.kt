package godot.tests.exception

import godot.api.Node
import godot.annotation.Script
import godot.annotation.Register

@Script
class ExceptionTest: Node() {

    @Register
    fun throwException() {
        throw RuntimeException("Test exception")
    }
}


