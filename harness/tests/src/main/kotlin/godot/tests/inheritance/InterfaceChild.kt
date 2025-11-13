package godot.tests.inheritance

import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.api.Node

@RegisterClass
class InterfaceChild : Node(), TestInterface {
    @RegisterFunction
    override fun doThing() {

    }
}