package godot.tests.inheritance

import godot.annotation.Script
import godot.annotation.Register
import godot.api.Node

@Script
class InterfaceChild : Node(), TestInterface {
    @Register
    override fun doThing() {

    }
}

