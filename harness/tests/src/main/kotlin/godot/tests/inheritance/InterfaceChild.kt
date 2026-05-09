package godot.tests.inheritance

import godot.annotation.GodotScript
import godot.annotation.Register
import godot.api.Node

@GodotScript
class InterfaceChild : Node(), TestInterface {
    @Register
    override fun doThing() {

    }
}
