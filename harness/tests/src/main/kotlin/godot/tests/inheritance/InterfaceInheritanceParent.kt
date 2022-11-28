package godot.tests.inheritance

import godot.annotation.Export
import godot.annotation.RegisterProperty

interface InterfaceInheritanceParent {
    @Export
    @RegisterProperty
    var registeredPropertyInParentInterface: Int
}
