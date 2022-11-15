package godot.tests.inheritance

import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty

@RegisterClass
class InterfaceAndAbstractClassChild: InterfaceAndAbstractClassParentAbstractClass(), InterfaceAndAbstractClassParentInterface {
    @RegisterProperty
    override var registeredPropertyInParentInterface: Boolean = true
    override var notRegisteredPropertyInParentInterface: Boolean = true

    @RegisterProperty
    override var abstractRegisteredExportedPropertyInParentAbstractClass: Boolean = true
    override var abstractNotRegisteredExportedPropertyInParentAbstractClass: Boolean = true

    @RegisterFunction
    override fun abstractRegisteredFunctionInParentAbstractClass() {

    }

    override fun abstractNotRegisteredFunctionInParentAbstractClass() {

    }
}
