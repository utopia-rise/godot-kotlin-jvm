package godot.tests.registration

import godot.api.Object
import godot.api.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction

@RegisterClass
class BindingTest : Object() {
    @RegisterFunction
    fun getClassName(obj: Object) = obj::class.simpleName
}

@RegisterClass
class BindingA : Node()

@RegisterClass
class BindingB : Node()
