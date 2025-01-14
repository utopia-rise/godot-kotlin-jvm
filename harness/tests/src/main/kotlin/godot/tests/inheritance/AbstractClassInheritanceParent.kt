package godot.tests.inheritance

import godot.api.Node
import godot.annotation.Export
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.annotation.RegisterSignal
import godot.core.signal1
import godot.core.signal2

// register class annotation is optional for abstract classes
abstract class AbstractClassInheritanceParent : Node() {

    @Export
    @RegisterProperty
    var registeredExportedPropertyInParent = false

    @RegisterSignal("blubb")
    val testNotOverridden by signal1<String>()

    @RegisterSignal("blubb", "habbalubb")
    open val testOverridden  by signal2<String, Int>()

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
