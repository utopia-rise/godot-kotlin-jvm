package godot.tests

import godot.PackedScene
import godot.ResourceLoader
import godot.core.memory.GodotStatic

object Singleton: GodotStatic(){
    var ref = ResourceLoader.load("res://test.tscn") as PackedScene?

    override fun collect() {
        ref = null
    }

}
