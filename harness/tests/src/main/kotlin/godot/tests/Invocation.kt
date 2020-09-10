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

    fun int(value: Int) = value
    fun long(value: Long) = value
    fun float(value: Float) = value
    fun double(value: Double) = value
    fun boolean(value: Boolean) = value
    fun string(value: String) = value

    fun intAddition(a: Int, b: Int) = a + b

	fun _enter_tree() {
		println("Enter tree !")
	}
}
