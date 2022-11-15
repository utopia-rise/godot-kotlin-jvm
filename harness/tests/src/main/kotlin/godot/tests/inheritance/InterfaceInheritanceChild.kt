package godot.tests.inheritance

import godot.Node
import godot.annotation.RegisterClass

@RegisterClass
class InterfaceInheritanceChild: Node(), InterfaceInheritanceParent {
    override var registeredPropertyInParentInterface: Int = 0
}
