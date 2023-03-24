package godot.tests.library.fqname

import godot.Node3D
import godot.annotation.Export
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty

@RegisterClass
class Simple: Node3D() {

    @Export
    @RegisterProperty
    var testProperty = "Hello from fqname-library-test!"
    @RegisterFunction
    fun provideGreeting(): String = testProperty
}
