package godot.tests.binding

import godot.api.Object
import godot.annotation.script
import godot.annotation.Register

@script
class BindingTest : Object() {
    @Register
    fun getClassName(obj: Object) = obj::class.simpleName
}

