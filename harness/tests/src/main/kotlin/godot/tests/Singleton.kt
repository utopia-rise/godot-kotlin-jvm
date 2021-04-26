package godot.tests

import godot.Node
import godot.PackedScene
import godot.ResourceLoader
import godot.core.memory.GodotStatic
import godot.global.GD

object Singleton: GodotStatic(){
    var ref = ResourceLoader.load("res://Spatial.tscn") as PackedScene?
    val myScene = Node()

    override fun collect() {
        if (GD.isInstanceValid(myScene)){
            myScene.free()
        }
        ref = null
    }

}
