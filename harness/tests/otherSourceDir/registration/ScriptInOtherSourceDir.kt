import godot.api.Node
import godot.annotation.Script
import godot.annotation.Register

@Script
class ScriptInOtherSourceDir: Node() {

	@Register
	fun greeting() = "HelloWorld"
}


