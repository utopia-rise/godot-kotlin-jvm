package godot.tests.inheritance

import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.annotation.RegisterSignal
import godot.core.signal2

@RegisterClass
class AbstractClassInheritanceChild : AbstractClassInheritanceParent() {

    @RegisterSignal("blubb", "habbalubbb")
    override val testOverridden by signal2<String, Int>()

    //---------------- Here to check ------------------

    @RegisterProperty
    var childOpenFunctionHasBeenCalled = false

    //-------------------------------------------------

    override var openVar: Int = 100

    @RegisterFunction
    override fun openFunction() {
        childOpenFunctionHasBeenCalled = true
    }
}
