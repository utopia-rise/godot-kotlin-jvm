package godot.tests.library

import godot.Node3D
import godot.annotation.RegisterClass
import godot.annotation.RegisterProperty
import godot.annotation.Export
import godot.annotation.RegisterFunction

@RegisterClass
class Simple: Node3D() {

    @Export
    @RegisterProperty
    var testProperty = "Hello There!"
    @RegisterFunction
    fun provideGreeting(): String = "Hello from library"
}
