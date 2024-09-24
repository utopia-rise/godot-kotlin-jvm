package godot.tests.inheritance

import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.annotation.RegisterSignal
import godot.core.Signal2
import godot.global.GD

@RegisterClass
class ClassInheritanceChild : ClassInheritanceParent() {

    @RegisterSignal
    override val testOverridden  by Signal2<String, Int>("blubb", "habbalubbb")

    //---------------- Here to check ------------------

    @RegisterProperty
    var childOpenFunctionHasBeenCalled = false

    //-------------------------------------------------

    override var openVar: Int = 100

    @RegisterFunction
    override fun openFunction() {
        childOpenFunctionHasBeenCalled = true
    }

    @RegisterFunction
    override fun _notification() = godotNotification {
        GD.print("Called ClassInheritanceChild::_notification on $this with $it")
        notificationCallBitFlag += notificationCallBitFlag or 2
    }
}
