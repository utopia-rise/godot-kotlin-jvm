package godot.tests

import godot.api.Node
import godot.api.PackedScene
import godot.api.ResourceLoader
import godot.extension.api.asStatic

object GodotStaticDelegateTest {
    var ref = (ResourceLoader.load("res://Spatial.tscn") as PackedScene?).asStatic()
    var myScene = Node().asStatic()
}
