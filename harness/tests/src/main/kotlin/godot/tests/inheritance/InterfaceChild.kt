package godot.tests.inheritance

import godot.annotation.script
import godot.annotation.Register
import godot.api.Node

@script
class InterfaceChild : Node(), TestInterface {
    @Register
    override fun doThing() {

    }
}
