package godot.tests.inheritance

import godot.Node
import godot.annotation.Export
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty

abstract class InterfaceAndAbstractClassParentAbstractClass: Node() {
    @Export
    @RegisterProperty
    var registeredExportedPropertyInParentAbstractClass = false

    var notRegisteredExportedPropertyInParentAbstractClass = false

    @Export
    @RegisterProperty
    abstract var abstractRegisteredExportedPropertyInParentAbstractClass: Boolean

    abstract var abstractNotRegisteredExportedPropertyInParentAbstractClass: Boolean

    @RegisterFunction
    abstract fun abstractRegisteredFunctionInParentAbstractClass()

    abstract fun abstractNotRegisteredFunctionInParentAbstractClass()
}
