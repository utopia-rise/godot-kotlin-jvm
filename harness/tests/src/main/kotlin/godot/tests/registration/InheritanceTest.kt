package godot.tests.registration

import godot.annotation.DoubleRange
import godot.annotation.Export
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.annotation.RegisterSignal
import godot.api.CharacterBody3D
import godot.api.Node
import godot.core.signal1
import godot.core.signal2
import godot.global.GD

@RegisterClass
open class ClassInheritanceParent : Node() {

    @RegisterSignal("blubb")
    val testNotOverridden by signal1<String>()

    @RegisterSignal("blubb", "habbalubb")
    open val testOverridden by signal2<String, Int>()

    @RegisterProperty
    var closedFunctionHasBeenCalled = false

    @RegisterProperty
    var parentOpenFunctionHasBeenCalled = false

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
    override fun _notification() = godotNotification { it ->
        GD.print("Called ClassInheritanceParent::_notification on $this with $it")
        notificationCallBitFlag = notificationCallBitFlag or 1
        GD.print(notificationCallBitFlag)
    }
}

@RegisterClass
class ClassInheritanceChild : ClassInheritanceParent() {

    @RegisterSignal("blubb", "habbalubbb")
    override val testOverridden by signal2<String, Int>()

    @RegisterProperty
    var childOpenFunctionHasBeenCalled = false

    override var openVar: Int = 100

    @RegisterFunction
    override fun openFunction() {
        childOpenFunctionHasBeenCalled = true
    }

    @RegisterFunction
    override fun _notification() = godotNotification { it ->
        GD.print("Called ClassInheritanceChild::_notification on $this with $it")
        notificationCallBitFlag += notificationCallBitFlag or 2
    }
}

abstract class AbstractClassInheritanceParent : Node() {
    @DoubleRange(1.0, 100.0)
    @RegisterProperty
    @Export
    var speed: Double = 100.0

    @Export
    @RegisterProperty
    var registeredExportedPropertyInParent = false

    @RegisterSignal("blubb")
    val testNotOverridden by signal1<String>()

    @RegisterSignal("blubb", "habbalubb")
    open val testOverridden by signal2<String, Int>()

    @RegisterProperty
    var closedFunctionHasBeenCalled = false

    @RegisterProperty
    var closedVar = 0

    @RegisterProperty
    open var openVar = 0

    @RegisterFunction
    fun closedFunction() {
        closedFunctionHasBeenCalled = true
    }

    @RegisterFunction
    abstract fun openFunction()
}

@RegisterClass
class AbstractClassInheritanceChild : AbstractClassInheritanceParent() {

    @RegisterSignal("blubb", "habbalubbb")
    override val testOverridden by signal2<String, Int>()

    @RegisterProperty
    var childOpenFunctionHasBeenCalled = false

    override var openVar: Int = 100

    @RegisterFunction
    override fun openFunction() {
        childOpenFunctionHasBeenCalled = true
    }
}

// issue: https://github.com/utopia-rise/godot-kotlin-jvm/issues/365
abstract class AbstractClassInheritanceEmptyParent : CharacterBody3D()

// issue: https://github.com/utopia-rise/godot-kotlin-jvm/issues/365
@RegisterClass
class AbstractClassInheritanceEmptyChild : AbstractClassInheritanceEmptyParent()

interface TestInterface {
    @RegisterFunction
    fun doThing()
}

@RegisterClass
class InterfaceChild : Node(), TestInterface {
    @RegisterFunction
    override fun doThing() {
    }
}
