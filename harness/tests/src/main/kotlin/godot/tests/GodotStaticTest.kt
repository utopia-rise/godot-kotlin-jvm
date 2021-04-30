package godot.tests

import godot.Node
import godot.PackedScene
import godot.ResourceLoader
import godot.extensions.godotStatic


object GodotStaticDelegateTest {
    var ref by godotStatic {
        ResourceLoader.load("res://Spatial.tscn") as PackedScene?
    }
    var myScene by godotStatic {
        Node()
    }
}
