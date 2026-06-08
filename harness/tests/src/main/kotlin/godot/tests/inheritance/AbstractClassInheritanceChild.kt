package godot.tests.inheritance

import godot.annotation.Script
import godot.annotation.Register
import godot.annotation.Visible
import godot.annotation.Emit
import godot.core.signal2

@Script
class AbstractClassInheritanceChild : AbstractClassInheritanceParent() {

    @Emit("blubb", "habbalubbb")
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


