package godot.tests.inheritance

import godot.Node
import godot.annotation.GodotMember
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

    @GodotMember
    var closedFunctionHasBeenCalled = false

    @GodotMember
    var parentOpenFunctionHasBeenCalled = false

    //-------------------------------------------------

    @GodotMember
    var closedVar = 0

    @GodotMember
    open var openVar = 0

    @GodotMember
    fun closedFunction() {
        closedFunctionHasBeenCalled = true
    }

    @GodotMember
    open fun openFunction() {
        parentOpenFunctionHasBeenCalled = true
    }

    @GodotMember
    var notificationCallBitFlag = 0

    @GodotMember
    override fun _notification(): GodotNotification = godotNotification {
        GD.print("Called ClassInheritanceParent::_notification on $this with $it")
        notificationCallBitFlag = notificationCallBitFlag or 1
        GD.print(notificationCallBitFlag)
    }
}
