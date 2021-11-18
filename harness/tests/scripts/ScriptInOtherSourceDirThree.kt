import godot.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterProperty
import godot.annotation.Export

@RegisterClass
class ScriptInOtherSourceDirThree: Node() {

	@Export
	@RegisterProperty
	var greeting = "HellodWorld"
}
