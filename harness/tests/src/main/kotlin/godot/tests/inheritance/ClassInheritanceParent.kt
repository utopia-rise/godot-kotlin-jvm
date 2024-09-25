package godot.tests.inheritance

import godot.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.annotation.RegisterSignal
import godot.core.GodotNotification
import godot.core.signal1
import godot.core.signal2
import godot.global.GD

@RegisterClass
open class ClassInheritanceParent : Node() {

    @RegisterSignal
    val testNotOverridden by signal1<String>("blubb")

    @RegisterSignal
    open val testOverridden by signal2<String, Int>("blubb", "habbalubb")

    //---------------- Here to check ------------------

    @RegisterProperty
    var closedFunctionHasBeenCalled = false

    @RegisterProperty
    var parentOpenFunctionHasBeenCalled = false

    //-------------------------------------------------

    @RegisterProperty
    var closedVar = 0

    @RegisterProperty
    open var openVar = 0

    @RegisterFunction
    fun closedFunction() {
        closedFunctionHasBeenCalled = true
    }

    @RegisterFunction
    open fun openFunction() {
        parentOpenFunctionHasBeenCalled = true
    }

    @RegisterProperty
    var notificationCallBitFlag = 0

    @RegisterFunction
    override fun _notification(): GodotNotification = godotNotification {
        GD.print("Called ClassInheritanceParent::_notification on $this with $it")
        notificationCallBitFlag = notificationCallBitFlag or 1
        GD.print(notificationCallBitFlag)
    }
}
