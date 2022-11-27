package godot.tests.inheritance

import godot.Node
import godot.annotation.Export
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.annotation.RegisterSignal
import godot.signals.signal

// register class annotation is optional for abstract classes
abstract class AbstractClassInheritanceParent: Node() {

    @Export
    @RegisterProperty
    var registeredExportedPropertyInParent = false

    @RegisterSignal
    val testNotOverridden by signal<String>("blubb")

    @RegisterSignal
    open val testOverridden by signal<String, Int>("blubb", "habbalubb")

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
