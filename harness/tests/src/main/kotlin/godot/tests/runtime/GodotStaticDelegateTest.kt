package godot.tests.runtime

import godot.annotation.RegisterClass
import godot.annotation.RegisterProperty
import godot.api.Node
import godot.api.PackedScene
import godot.api.ResourceLoader
import godot.extension.api.asStatic

@RegisterClass
class GodotStaticDelegateTest : Node() {

    @RegisterProperty
    var loadedScene: PackedScene? = ResourceLoader.load("res://Spatial.tscn") as PackedScene?

    @RegisterProperty
    var staticNode: Node = Node().asStatic()
}
