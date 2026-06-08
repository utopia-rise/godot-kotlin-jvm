package godot.tests.constructor

import godot.api.Node
import godot.annotation.Script
import godot.annotation.Visible

@Script
class ConstructorRegistrationTest(): Node() {
    @Visible
    var defaultConstructorHasBeenCalled = false

    init {
        defaultConstructorHasBeenCalled = true
    }
}


