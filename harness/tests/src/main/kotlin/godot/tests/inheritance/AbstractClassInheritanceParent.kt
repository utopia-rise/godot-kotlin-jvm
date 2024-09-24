package godot.tests.inheritance

import godot.Node
import godot.annotation.Export
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.annotation.RegisterSignal
import godot.core.Signal1
import godot.core.Signal2

// register class annotation is optional for abstract classes
abstract class AbstractClassInheritanceParent : Node() {

    @Export
    @RegisterProperty
    var registeredExportedPropertyInParent = false

    @RegisterSignal
    val testNotOverridden by  Signal1<String>("blubb")

    @RegisterSignal
    open val testOverridden  by Signal2<String, Int>("blubb", "habbalubb")

    //---------------- Here to check ------------------

    @RegisterProperty
    var closedFunctionHasBeenCalled = false

    //-------------------------------------------------

    @RegisterProperty
    var closedVar = 0

    @RegisterProperty
    open var openVar = 0

    @RegisterFunction
    fun closedFunction() {
        closedFunctionHasBeenCalled = true
    }

    @RegisterFunction
    abstract fun openFunction()
}
