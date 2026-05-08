package godot.tests.library

import godot.annotation.Export
import godot.annotation.script
import godot.annotation.Register
import godot.api.Node

@script
class Simple: Node() {

    @Export
    var testProperty = "Hello from third-party-library!"
    @Register
    fun provideGreeting(): String = testProperty
}
