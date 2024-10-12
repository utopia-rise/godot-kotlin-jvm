package godot.tests.library.hierarchical

import godot.Node3D
import godot.annotation.Export
import godot.annotation.GodotMember
import godot.annotation.GodotScript

@GodotScript
class Simple: Node3D() {

    @Export
    var testProperty = "Hello from hierarchical-library-test!"

    @GodotMember
    fun provideGreeting(): String = testProperty
}
