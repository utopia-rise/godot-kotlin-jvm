package godot.tests

import godot.Object

class Invocation : Object() {
	fun int(value: Int) = value
	fun long(value: Long) = value
	fun float(value: Float) = value
	fun double(value: Double) = value
	fun boolean(value: Boolean) = value
	fun string(value: String) = value
}
