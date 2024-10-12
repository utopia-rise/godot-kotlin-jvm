package godot.tests.binding

import godot.Object
import godot.annotation.GodotMember
import godot.annotation.GodotScript

@GodotScript
class BindingTest : Object() {
    @GodotMember
    fun getClassName(obj: Object) = obj::class.simpleName
}

