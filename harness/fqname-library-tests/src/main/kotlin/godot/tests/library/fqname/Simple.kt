package godot.tests.library.fqname

import godot.Node3D
import godot.annotation.Export
import godot.annotation.GodotMember
import godot.annotation.GodotScript

@GodotScript
open class Simple: Node3D() {

    @Export
    var testProperty = "Hello from fqname-library-test!"

    @GodotMember
    fun provideGreeting(): String = testProperty
}
