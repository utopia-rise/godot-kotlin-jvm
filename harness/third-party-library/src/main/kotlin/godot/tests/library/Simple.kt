package godot.tests.library

import godot.annotation.Export
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.api.Node

@RegisterClass
class Simple: Node() {

    @Export
    @RegisterProperty
    var testProperty = "Hello from third-party-library!"
    @RegisterFunction
    fun provideGreeting(): String = testProperty
}
