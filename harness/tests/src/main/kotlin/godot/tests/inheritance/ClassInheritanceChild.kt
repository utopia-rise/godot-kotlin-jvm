package godot.tests.inheritance

import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.annotation.RegisterSignal
import godot.core.GodotNotification
import godot.global.GD
import godot.core.signal

@RegisterClass
class ClassInheritanceChild : ClassInheritanceParent() {

    @RegisterSignal
    override val testOverridden by signal<String, Int>("blubb", "habbalubbb")

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
