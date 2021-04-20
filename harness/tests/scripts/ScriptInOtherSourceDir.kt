import godot.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty

@RegisterClass
class ScriptInOtherSourceDir: Node() {

//    @RegisterProperty
//    var blubb = "huhu"

    @RegisterFunction
    fun greeting() = "HelloWorld"
}
