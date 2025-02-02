import godot.api.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction

@RegisterClass
class ScriptInOtherSourceDir: Node() {

	@RegisterFunction
	fun greeting() = "HelloWorld"
}
