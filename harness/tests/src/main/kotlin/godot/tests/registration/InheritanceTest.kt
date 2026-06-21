package godot.tests.registration

import godot.annotation.DoubleRange
import godot.annotation.Export
import godot.annotation.Notification
import godot.annotation.Script
import godot.annotation.Register
import godot.annotation.Visible
import godot.annotation.Emit
import godot.api.CharacterBody3D
import godot.api.Node
import godot.core.signal1
import godot.core.signal2
import godot.global.GD

@Script
open class ClassInheritanceParent : Node() {

    @Emit("blubb")
    val testNotOverridden by signal1<String>()

    @Emit("blubb", "habbalubb")
    open val testOverridden by signal2<String, Int>()

    @Visible
    var closedFunctionHasBeenCalled = false

    @Visible
    var parentOpenFunctionHasBeenCalled = false

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

    @Notification(0)
    fun onParentNotification() {
        GD.print("Called ClassInheritanceParent::onParentNotification on $this")
        notificationCallBitFlag = notificationCallBitFlag or 1
        GD.print(notificationCallBitFlag)
    }
}

@Script
class ClassInheritanceChild : ClassInheritanceParent() {

    @Emit("blubb", "habbalubbb")
    override val testOverridden by signal2<String, Int>()

    @Visible
    var childOpenFunctionHasBeenCalled = false

    override var openVar: Int = 100

    @Register
    override fun openFunction() {
        childOpenFunctionHasBeenCalled = true
    }

    @Notification(0)
    fun onChildNotification() {
        GD.print("Called ClassInheritanceChild::onChildNotification on $this")
        notificationCallBitFlag += notificationCallBitFlag or 2
    }
}

abstract class AbstractClassInheritanceParent : Node() {
    @DoubleRange(1.0, 100.0)
    @Visible
    @Export
    var speed: Double = 100.0

    @Export
    @Visible
    var registeredExportedPropertyInParent = false

    @Emit("blubb")
    val testNotOverridden by signal1<String>()

    @Emit("blubb", "habbalubb")
    open val testOverridden by signal2<String, Int>()

    @Visible
    var closedFunctionHasBeenCalled = false

    @Visible
    var closedVar = 0

    @Visible
    open var openVar = 0

    @Register
    fun closedFunction() {
        closedFunctionHasBeenCalled = true
    }

    @Register
    abstract fun openFunction()
}

@Script
class AbstractClassInheritanceChild : AbstractClassInheritanceParent() {

    @Emit("blubb", "habbalubbb")
    override val testOverridden by signal2<String, Int>()

    @Visible
    var childOpenFunctionHasBeenCalled = false

    override var openVar: Int = 100

    @Register
    override fun openFunction() {
        childOpenFunctionHasBeenCalled = true
    }
}

// issue: https://github.com/utopia-rise/godot-kotlin-jvm/issues/365
abstract class AbstractClassInheritanceEmptyParent : CharacterBody3D()

// issue: https://github.com/utopia-rise/godot-kotlin-jvm/issues/365
@Script
class AbstractClassInheritanceEmptyChild : AbstractClassInheritanceEmptyParent()

interface TestInterface {
    @Register
    fun doThing()
}

@Script
class InterfaceChild : Node(), TestInterface {
    @Register
    override fun doThing() {
    }
}

