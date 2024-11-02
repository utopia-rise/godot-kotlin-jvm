package godot.tests.library.hierarchical

import godot.Node3D
import godot.annotation.Export
import godot.annotation.Member
import godot.annotation.GodotScript

@GodotScript
class Simple: Node3D() {

    @Export
    var testProperty = "Hello from hierarchical-library-test!"

    @Member
    fun provideGreeting(): String = testProperty
}
