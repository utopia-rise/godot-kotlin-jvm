package godot.tests.inheritance

import godot.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterProperty

@RegisterClass
class InterfaceInheritanceChild: Node(), InterfaceInheritanceParent {
    @RegisterProperty
    override var registeredPropertyInParentInterface: Int = 0
}
