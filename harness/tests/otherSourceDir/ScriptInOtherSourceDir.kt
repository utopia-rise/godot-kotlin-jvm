import godot.Node
import godot.annotation.GodotMember
import godot.annotation.GodotScript

@GodotScript
class ScriptInOtherSourceDir: Node() {

	@GodotMember
	fun greeting() = "HelloWorld"
}
