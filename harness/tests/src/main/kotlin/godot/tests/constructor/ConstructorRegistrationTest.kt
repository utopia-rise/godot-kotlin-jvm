package godot.tests.constructor

import godot.api.Node
import godot.annotation.script
import godot.annotation.Visible

@script
class ConstructorRegistrationTest(): Node() {
    @Visible
    var defaultConstructorHasBeenCalled = false

    init {
        defaultConstructorHasBeenCalled = true
    }
}
