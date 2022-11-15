package godot.tests.inheritance

import godot.annotation.RegisterClass

@RegisterClass
class InterfaceAndAbstractClassChild: InterfaceAndAbstractClassParentAbstractClass(), InterfaceAndAbstractClassParentInterface {
    override var registeredPropertyInParentInterface: Boolean = true
    override var notRegisteredPropertyInParentInterface: Boolean = true

    override var abstractRegisteredExportedPropertyInParentAbstractClass: Boolean = true
    override var abstractNotRegisteredExportedPropertyInParentAbstractClass: Boolean = true

    override fun abstractRegisteredFunctionInParentAbstractClass() {

    }

    override fun abstractNotRegisteredFunctionInParentAbstractClass() {

    }
}
