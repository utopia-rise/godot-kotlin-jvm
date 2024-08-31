package godot.tests

import godot.Node
import godot.PackedScene
import godot.ResourceLoader
import godot.extensions.asStatic


object GodotStaticDelegateTest {
    var ref = (ResourceLoader.load("res://Spatial.tscn") as PackedScene?).asStatic()
    var myScene = Node().asStatic()
}
