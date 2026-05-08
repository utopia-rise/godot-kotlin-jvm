package godot.tests.library

import godot.annotation.Export
import godot.annotation.GodotScript
import godot.annotation.Register
import godot.annotation.Visible
import godot.api.Node

@GodotScript
class Simple: Node() {

    @Export
    @Visible
    var testProperty = "Hello from third-party-library!"
    @Register
    fun provideGreeting(): String = testProperty
}