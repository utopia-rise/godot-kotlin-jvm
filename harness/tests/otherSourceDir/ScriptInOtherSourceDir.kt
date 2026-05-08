import godot.api.Node
import godot.annotation.GodotScript
import godot.annotation.Register

@GodotScript
class ScriptInOtherSourceDir: Node() {

	@Register
	fun greeting() = "HelloWorld"
}
