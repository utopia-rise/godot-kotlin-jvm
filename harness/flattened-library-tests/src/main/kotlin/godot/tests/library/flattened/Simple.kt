package godot.tests.library.flattened

import godot.Node3D
import godot.annotation.Export
import godot.annotation.GodotMember
import godot.annotation.GodotScript

@GodotScript
class Simple: Node3D() {

    @Export
    var testProperty = "Hello from flattened-library-test!"

    @GodotMember
    fun provideGreeting(): String = testProperty
}
