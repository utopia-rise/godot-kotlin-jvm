package godot.tests.inheritance

import godot.annotation.Member
import godot.annotation.GodotScript
import godot.core.signal2

@GodotScript
class AbstractClassInheritanceChild : AbstractClassInheritanceParent() {

    override val testOverridden by signal2<String, Int>("blubb", "habbalubbb")

    //---------------- Here to check ------------------

    @Member
    var childOpenFunctionHasBeenCalled = false

    //-------------------------------------------------

    override var openVar: Int = 100

    @Member
    override fun openFunction() {
        childOpenFunctionHasBeenCalled = true
    }
}
