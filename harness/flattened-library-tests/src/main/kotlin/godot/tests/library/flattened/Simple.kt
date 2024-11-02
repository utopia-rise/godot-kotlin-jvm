package godot.tests.library.flattened

import godot.Node3D
import godot.annotation.Export
import godot.annotation.Member
import godot.annotation.GodotScript

@GodotScript
class Simple: Node3D() {

    @Export
    var testProperty = "Hello from flattened-library-test!"

    @Member
    fun provideGreeting(): String = testProperty
}
