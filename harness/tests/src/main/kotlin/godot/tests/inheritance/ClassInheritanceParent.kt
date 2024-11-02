package godot.tests.inheritance

import godot.Node
import godot.annotation.Member
import godot.annotation.GodotScript
import godot.core.GodotNotification
import godot.core.signal1
import godot.core.signal2
import godot.global.GD

@GodotScript
open class ClassInheritanceParent : Node() {

    val testNotOverridden by signal1<String>("blubb")

    open val testOverridden by signal2<String, Int>("blubb", "habbalubb")

    //---------------- Here to check ------------------

    @Member
    var closedFunctionHasBeenCalled = false

    @Member
    var parentOpenFunctionHasBeenCalled = false

    //-------------------------------------------------

    @Member
    var closedVar = 0

    @Member
    open var openVar = 0

    @Member
    fun closedFunction() {
        closedFunctionHasBeenCalled = true
    }

    @Member
    open fun openFunction() {
        parentOpenFunctionHasBeenCalled = true
    }

    @Member
    var notificationCallBitFlag = 0

    override fun _notification(): GodotNotification = godotNotification {
        GD.print("Called ClassInheritanceParent::_notification on $this with $it")
        notificationCallBitFlag = notificationCallBitFlag or 1
        GD.print(notificationCallBitFlag)
    }
}
