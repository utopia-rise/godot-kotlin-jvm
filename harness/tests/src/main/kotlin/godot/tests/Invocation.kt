package godot.tests

import godot.Spatial

class Invocation : Spatial() {
	init {
		println("Hello Invocation!")
	}

	var x = 0
	var y = 0.0
	var z = 0.0f
	var name = "Idonthaveanyidea"

	fun intValue(value: Int) = value
	fun longValue(value: Long) = value
	fun floatValue(value: Float) = value
	fun doubleValue(value: Double) = value
	fun booleanValue(value: Boolean) = value
	fun stringValue(value: String) = value

	fun intAddition(a: Int, b: Int) = a + b

	fun _enterTree() {
		println("Enter tree !")
	}
}
