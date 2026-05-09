package godot.tests.binding

import godot.api.Object
import godot.annotation.GodotScript
import godot.annotation.Register

@GodotScript
class BindingTest : Object() {
    @Register
    fun getClassName(obj: Object) = obj::class.simpleName
}

