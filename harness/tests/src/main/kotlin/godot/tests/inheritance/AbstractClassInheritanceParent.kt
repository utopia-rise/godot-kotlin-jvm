package godot.tests.inheritance

import godot.api.Node
import godot.annotation.DoubleRange
import godot.annotation.Export
import godot.annotation.Register
import godot.annotation.Script
import godot.annotation.Visible
import godot.annotation.Emit
import godot.core.signal1
import godot.core.signal2

@Script
abstract class AbstractClassInheritanceParent : Node() {
    // GH-731
    @DoubleRange(1.0, 100.0)
    @Visible
    @Export
    var speed: Double = 100.0

    @Export
    @Visible
    var registeredExportedPropertyInParent = false

    @Emit("blubb")
    val testNotOverridden by signal1<String>()

    @Emit("blubb", "habbalubb")
    open val testOverridden  by signal2<String, Int>()

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

