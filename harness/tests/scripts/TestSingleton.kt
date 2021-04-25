import godot.Node
import godot.PackedScene
import godot.ResourceLoader
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.core.memory.GodotStatic

object Singleton: GodotStatic(){
    var ref = ResourceLoader.load("res://test.tscn") as PackedScene?

    override fun collect() {
        ref = null
    }

}

@RegisterClass
class TestSingleton: Node() {

    @RegisterFunction
    override fun _ready(){
        val ref = Singleton.ref
    }
}

