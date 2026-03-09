package godot

import godot.annotation.Export
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.global.GD
import godot.api.Node

@RegisterClass
class HelloWorld : Node() {

    @Export
    @RegisterProperty
    var helloString =  "Godot"

    @RegisterFunction
    override fun _ready() {
        GD.print("Hello $helloString !")
    }
}
