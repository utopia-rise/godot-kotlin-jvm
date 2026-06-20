package godot.tests.inheritance

import godot.annotation.Script
import godot.annotation.Notification
import godot.annotation.Register
import godot.annotation.Visible
import godot.annotation.Emit
import godot.core.signal2
import godot.global.GD

@Script
class ClassInheritanceChild : ClassInheritanceParent() {

    @Emit("blubb", "habbalubbb")
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

    @Notification(0)
    fun onChildNotification() {
        GD.print("Called ClassInheritanceChild::onChildNotification on $this")
        notificationCallBitFlag = notificationCallBitFlag or 2
    }
}


