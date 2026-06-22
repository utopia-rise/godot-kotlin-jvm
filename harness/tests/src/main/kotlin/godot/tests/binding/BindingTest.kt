package godot.tests.binding

import godot.api.Object
import godot.annotation.Script
import godot.annotation.Register

@Script
class BindingTest : Object() {
	@Register
	fun getClassName(obj: Object) = obj::class.simpleName
}
