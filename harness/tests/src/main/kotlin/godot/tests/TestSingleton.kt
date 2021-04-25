package godot.tests

import godot.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction

@RegisterClass
class TestSingleton: Node() {

	@RegisterFunction
	override fun _ready(){
		val ref = Singleton.ref
	}
}

