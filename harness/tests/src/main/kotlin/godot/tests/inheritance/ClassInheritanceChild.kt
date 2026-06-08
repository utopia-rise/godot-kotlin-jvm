package godot.tests.inheritance

import godot.annotation.Script
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

    @Register
    override fun _notification() = godotNotification { it ->
        GD.print("Called ClassInheritanceChild::_notification on $this with $it")
        notificationCallBitFlag += notificationCallBitFlag or 2
    }
}


