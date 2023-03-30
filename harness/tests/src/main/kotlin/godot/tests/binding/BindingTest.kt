package godot.tests.binding

import godot.Object
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction

@RegisterClass
class BindingTest(): Object() {
    @RegisterFunction
    fun getClassName(obj: Object) = obj::class.simpleName
}

