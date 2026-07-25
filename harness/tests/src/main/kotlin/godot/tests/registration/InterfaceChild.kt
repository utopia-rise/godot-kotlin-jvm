package godot.tests.registration

import godot.annotation.Register
import godot.annotation.Script
import godot.api.Node

interface TestInterface {
    @Register
    fun doThing()
}

@Script
class InterfaceChild : Node(), TestInterface {
    @Register
    override fun doThing() = Unit
}
