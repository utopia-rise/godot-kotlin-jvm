package godot.tests.inheritance

import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.annotation.RegisterSignal
import godot.signals.signal

@RegisterClass
class ClassInheritanceChild : ClassInheritanceParent() {

    @RegisterSignal
    override val signalTestOverridden by signal<String, Int>("blubb", "habbalubbb")

    //---------------- Here to check ------------------

    @RegisterProperty
    var childOpenFunctionHasBeenCalled = false

    //-------------------------------------------------

    @RegisterProperty
    override var openVar: Int = 100

    @RegisterFunction
    override fun openFunction() {
        childOpenFunctionHasBeenCalled = true
    }
}
