package godot.tests.inheritance

import godot.api.Node
import godot.annotation.DoubleRange
import godot.annotation.Export
import godot.annotation.Register
import godot.annotation.Visible
import godot.annotation.ArgumentName
import godot.core.signal1
import godot.core.signal2

// register class annotation is optional for abstract classes
abstract class AbstractClassInheritanceParent : Node() {
    // GH-731
    @DoubleRange(1.0, 100.0)
    var speed: Double = 100.0

    @Export
    var registeredExportedPropertyInParent = false

    @ArgumentName("blubb")
    val testNotOverridden by signal1<String>()

    @ArgumentName("blubb", "habbalubb")
    val testOverridden by signal2<String, Int>()

    //---------------- Here to check ------------------

    @Visible
    var closedFunctionHasBeenCalled = false

    //-------------------------------------------------

    @Visible
    var closedVar = 0

    @Visible
    open var openVar = 0

    @Register
    fun closedFunction() {
        closedFunctionHasBeenCalled = true
    }

    @Register
    abstract fun openFunction()
}
