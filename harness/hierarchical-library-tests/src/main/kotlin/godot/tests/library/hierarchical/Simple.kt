package godot.tests.library.hierarchical

import godot.api.Node3D
import godot.annotation.Export
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty

@RegisterClass
class Simple: Node3D() {

    @Export
    @RegisterProperty
    var testProperty = "Hello from hierarchical-library-test!"
    @RegisterFunction
    fun provideGreeting(): String = testProperty
}
