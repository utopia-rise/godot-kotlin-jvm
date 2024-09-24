package godot.tests.inheritance

import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.annotation.RegisterSignal
import godot.core.Signal2
import godot.core.signal

@RegisterClass
class AbstractClassInheritanceChild : AbstractClassInheritanceParent() {

    @RegisterSignal
    override val testOverridden: Signal2<String, Int> by signal("blubb", "habbalubbb")

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
