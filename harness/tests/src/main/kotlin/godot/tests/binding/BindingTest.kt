package godot.tests.binding

import godot.Object
import godot.annotation.Member
import godot.annotation.GodotScript

@GodotScript
class BindingTest : Object() {
    @Member
    fun getClassName(obj: Object) = obj::class.simpleName
}

