package godot.tests.inheritance

import godot.annotation.GodotScript
import godot.annotation.Register
import godot.annotation.Visible
import godot.annotation.RegisterSignal
import godot.core.signal2

@GodotScript
class AbstractClassInheritanceChild : AbstractClassInheritanceParent() {

    @RegisterSignal("blubb", "habbalubbb")
    override val testOverridden by signal2<String, Int>()

    //---------------- Here to check ------------------

    @Visible
    var childOpenFunctionHasBeenCalled = false

    //-------------------------------------------------

    override var openVar: Int = 100

    @Register
    override fun openFunction() {
        childOpenFunctionHasBeenCalled = true
    }
}