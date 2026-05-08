package godot.tests.inheritance

import godot.api.Node
import godot.annotation.script
import godot.annotation.Register
import godot.annotation.Visible
import godot.annotation.RegisterSignal
import godot.core.GodotNotification
import godot.core.signal1
import godot.core.signal2
import godot.global.GD

@script
open class ClassInheritanceParent : Node() {

    @RegisterSignal("blubb")
    val testNotOverridden by signal1<String>()

    @RegisterSignal("blubb", "habbalubb")
    open val testOverridden by signal2<String, Int>()

    //---------------- Here to check ------------------

    @Visible
    var closedFunctionHasBeenCalled = false

    @Visible
    var parentOpenFunctionHasBeenCalled = false

    //-------------------------------------------------

    @Visible
    var closedVar = 0

    @Visible
    open var openVar = 0

    @Register
    fun closedFunction() {
        closedFunctionHasBeenCalled = true
    }

    @Register
    open fun openFunction() {
        parentOpenFunctionHasBeenCalled = true
    }

    @Visible
    var notificationCallBitFlag = 0

    override fun _notification(): GodotNotification = godotNotification {
        GD.print("Called ClassInheritanceParent::_notification on $this with $it")
        notificationCallBitFlag = notificationCallBitFlag or 1
        GD.print(notificationCallBitFlag)
    }
}
