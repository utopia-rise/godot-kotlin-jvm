import godot.api.Node
import godot.annotation.script
import godot.annotation.Register

@script
class ScriptInOtherSourceDir: Node() {

	@Register
	fun greeting() = "HelloWorld"
}
