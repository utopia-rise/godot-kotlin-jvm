package godot.tests.inheritance

import godot.annotation.Export
import godot.annotation.RegisterProperty

interface InterfaceAndAbstractClassParentInterface {
    @Export
    @RegisterProperty
    var registeredPropertyInParentInterface: Boolean

    var notRegisteredPropertyInParentInterface: Boolean
}
