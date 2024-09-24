package godot.tests.inheritance

import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.annotation.RegisterSignal
import godot.core.Signal2

@RegisterClass
class AbstractClassInheritanceChild : AbstractClassInheritanceParent() {

    @RegisterSignal
    override val testOverridden by Signal2<String, Int>("blubb", "habbalubbb")

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
