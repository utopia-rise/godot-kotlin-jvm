package godot.tests.inheritance

import godot.annotation.GodotScript
import godot.annotation.Register
import godot.annotation.Visible
import godot.annotation.RegisterSignal
import godot.core.signal2
import godot.global.GD

@GodotScript
class ClassInheritanceChild : ClassInheritanceParent() {

    @RegisterSignal("blubb", "habbalubbb")
    override val testOverridden  by signal2<String, Int>()

    //---------------- Here to check ------------------

    @Visible
    var childOpenFunctionHasBeenCalled = false

    //-------------------------------------------------

    override var openVar: Int = 100

    @Register
    override fun openFunction() {
        childOpenFunctionHasBeenCalled = true
    }

    @Register
    override fun _notification() = godotNotification {
        GD.print("Called ClassInheritanceChild::_notification on $this with $it")
        notificationCallBitFlag += notificationCallBitFlag or 2
    }
}