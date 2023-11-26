package godot.tests.inheritance

import godot.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.annotation.RegisterSignal
import godot.core.GodotNotification
import godot.signals.signal

@RegisterClass
open class ClassInheritanceParent : Node() {

    @RegisterSignal
    val testNotOverridden by signal<String>("blubb")

    @RegisterSignal
    open val testOverridden by signal<String, Int>("blubb", "habbalubb")

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

    private var notificationCalled = false
    @RegisterFunction
    override fun _notification(): GodotNotification = godotNotification {
        notificationCalled = true
    }
}
