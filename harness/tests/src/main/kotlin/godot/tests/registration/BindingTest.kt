package godot.tests.registration

import godot.api.Object
import godot.api.Node
import godot.annotation.Script
import godot.annotation.Register

@Script
class BindingTest : Object() {
    @Register
    fun getClassName(obj: Object) = obj::class.simpleName
}

@Script
class BindingA : Node()

@Script
class BindingB : Node()

