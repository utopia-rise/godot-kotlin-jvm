package godot.tests.inheritance

import godot.Node
import godot.annotation.Export
import godot.annotation.GodotMember
import godot.core.signal1
import godot.core.signal2

// register class annotation is optional for abstract classes
abstract class AbstractClassInheritanceParent : Node() {

    @Export
    var registeredExportedPropertyInParent = false

    val testNotOverridden by signal1<String>("blubb")

    open val testOverridden  by signal2<String, Int>("blubb", "habbalubb")

    //---------------- Here to check ------------------

    @GodotMember
    var closedFunctionHasBeenCalled = false

    //-------------------------------------------------

    @GodotMember
    var closedVar = 0

    @GodotMember
    open var openVar = 0

    @GodotMember
    fun closedFunction() {
        closedFunctionHasBeenCalled = true
    }

    @GodotMember
    abstract fun openFunction()
}
