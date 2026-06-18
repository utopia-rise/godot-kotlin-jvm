package godot.tests.constructor

import godot.api.Node
import godot.annotation.Script
import godot.annotation.Visible

@Script
class ConstructorRegistrationTest(private val value: Int): Node() {
    @Visible
    var defaultConstructorHasBeenCalled = false

    init {
        defaultConstructorHasBeenCalled = true
    }
}


