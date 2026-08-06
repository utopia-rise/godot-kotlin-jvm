package godot

import godot.annotation.Export
import godot.annotation.Script
import godot.global.GD
import godot.api.Node

@Script
class HelloWorld : Node() {

    @Export
    var helloString =  "Godot"

    override fun _ready() {
        GD.print("Hello $helloString !")
    }
}

