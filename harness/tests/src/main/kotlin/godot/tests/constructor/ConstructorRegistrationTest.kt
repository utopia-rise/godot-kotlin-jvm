package godot.tests.constructor

import godot.api.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterProperty

@RegisterClass
class ConstructorRegistrationTest(): Node() {
    @RegisterProperty
    var defaultConstructorHasBeenCalled = false

    init {
        defaultConstructorHasBeenCalled = true
    }
}
