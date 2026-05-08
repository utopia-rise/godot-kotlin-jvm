package godot.tests.constructor

import godot.api.Node
import godot.annotation.GodotScript
import godot.annotation.Register
import godot.annotation.Visible

@GodotScript
class ConstructorRegistrationTest(): Node() {
    @Visible
    var defaultConstructorHasBeenCalled = false

    init {
        defaultConstructorHasBeenCalled = true
    }
}