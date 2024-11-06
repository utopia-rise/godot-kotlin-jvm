package godot.tests.inheritance

import godot.annotation.Member
import godot.annotation.GodotScript
import godot.core.signal2
import godot.global.GD

@GodotScript
class ClassInheritanceChild : ClassInheritanceParent() {

    override val testOverridden  by signal2<String, Int>("blubb", "habbalubbb")

    //---------------- Here to check ------------------

    @Member
    var childOpenFunctionHasBeenCalled = false

    //-------------------------------------------------

    override var openVar: Int = 100

    @Member
    override fun openFunction() {
        childOpenFunctionHasBeenCalled = true
    }

    override fun _notification() = godotNotification {
        GD.print("Called ClassInheritanceChild::_notification on $this with $it")
        notificationCallBitFlag += notificationCallBitFlag or 2
    }
}
