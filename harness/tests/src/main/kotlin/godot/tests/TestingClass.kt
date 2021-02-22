package godot.tests

import godot.Button
import godot.Spatial
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.core.NodePath

@RegisterClass
class TestingClass: Spatial() {

	@RegisterProperty
	lateinit var buttonNodePath: NodePath
	private val button by lazy { getNode(buttonNodePath) as Button }

	@RegisterFunction
	override fun _ready() {
		button.signalPressed.connect(this, this::onButtonPressed)
		println("TestingClass: instance: $button")
		println("TestingClass: signal: pressed")
		println("TestingClass: target: $this")
		println("TestingClass: method: on_button_pressed")
		button.connect("pressed", this, "on_button_pressed")
	}

	@RegisterFunction
	fun onButtonPressed() {
		println("huhu")
	}
}
