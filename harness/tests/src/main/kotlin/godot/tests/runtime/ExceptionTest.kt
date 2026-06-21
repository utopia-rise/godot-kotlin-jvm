package godot.tests.runtime

import godot.annotation.Script
import godot.annotation.Register
import godot.api.Node

@Script
class ExceptionTest : Node() {

    @Register
    fun throwException() {
        throw RuntimeException("Test exception")
    }
}

