package godot.tests.inheritance

import godot.Node
import godot.annotation.Export
import godot.annotation.Member
import godot.core.signal1
import godot.core.signal2

// register class annotation is optional for abstract classes
abstract class AbstractClassInheritanceParent : Node() {

    @Export
    var registeredExportedPropertyInParent = false

    val testNotOverridden by signal1<String>("blubb")

    open val testOverridden  by signal2<String, Int>("blubb", "habbalubb")

    //---------------- Here to check ------------------

    @Member
    var closedFunctionHasBeenCalled = false

    //-------------------------------------------------

    @Member
    var closedVar = 0

    @Member
    open var openVar = 0

    @Member
    fun closedFunction() {
        closedFunctionHasBeenCalled = true
    }

    @Member
    abstract fun openFunction()
}
