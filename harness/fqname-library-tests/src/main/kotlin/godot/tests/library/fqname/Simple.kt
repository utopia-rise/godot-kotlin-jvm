package godot.tests.library.fqname

import godot.Node3D
import godot.annotation.Export
import godot.annotation.Member
import godot.annotation.GodotScript

@GodotScript
open class Simple: Node3D() {

    @Export
    var testProperty = "Hello from fqname-library-test!"

    @Member
    fun provideGreeting(): String = testProperty
}
