import godot.Node
import godot.annotation.Member
import godot.annotation.GodotScript

@GodotScript
class ScriptInOtherSourceDir: Node() {

	@Member
	fun greeting() = "HelloWorld"
}
