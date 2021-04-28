package godot.tests

import godot.Node
import godot.PackedScene
import godot.ResourceLoader
import godot.core.memory.BaseGodotStatic
import godot.extensions.godotStatic
import godot.global.GD

object GodotStaticTest : BaseGodotStatic() {
    private var ref = ResourceLoader.load("res://Spatial.tscn") as PackedScene?
    private val myScene = Node()

    override fun collect() {
        if (GD.isInstanceValid(myScene)) {
            myScene.free()
        }
        ref = null
    }

}

object GodotStaticDelegateTest {
    var ref by godotStatic {
        ResourceLoader.load("res://Spatial.tscn") as PackedScene?
    }
    var myScene by godotStatic {
        Node()
    }
}
