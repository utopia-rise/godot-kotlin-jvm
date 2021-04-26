package godot.tests

import godot.Node
import godot.PackedScene
import godot.ResourceLoader
import godot.core.memory.BaseGodotStatic
import godot.global.GD

object Singleton: BaseGodotStatic(){
    var ref = ResourceLoader.load("res://Spatial.tscn") as PackedScene?
    val myScene = Node()

    override fun collect() {
        if (GD.isInstanceValid(myScene)){
            myScene.queueFree()
        }
        ref = null
    }

}
