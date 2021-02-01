import godot.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction

@RegisterClass
class TestScript : Node() {

    @RegisterFunction
    fun _ready() {
        println("Juhuu this just works!")
    }
}
