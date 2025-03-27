package godot.tests.events

import godot.api.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.annotation.RegisterSignal
import godot.annotation.Rpc
import godot.core.Signal0
import godot.core.Signal1
import godot.core.Signal2
import godot.core.VariantArray
import godot.core.Vector2
import godot.core.asStringName
import godot.core.signal0
import godot.core.signal1
import godot.core.signal2
import godot.extension.connectLambda
import godot.extension.connectMethod
import godot.tests.registration.OtherScript

@RegisterClass
class SignalKotlinTest : Node() {
    @RegisterSignal
    val noParamSignalDelegate by signal0()

    @RegisterSignal
    val selfConnectedSignal by signal0()

    @RegisterSignal("refresh")
    val oneParamSignalDelegate by signal1<Boolean>()

    @RegisterSignal("str", "inv")
    val twoParamSignalDelegate by signal2<String, SignalKotlinTest>()


    @RegisterSignal()
    val noParamSignalField = Signal0("noParamSignalField")

    @RegisterSignal("refresh")
    val oneParamSignalField = Signal1<Boolean>("oneParamSignalField")

    @RegisterSignal("str", "inv")
    val twoParamSignalField = Signal2<String, SignalKotlinTest>("twoParamSignalField")

    @RegisterProperty
    var otherScript = OtherScript()

    @RegisterProperty
    var selfConnectedSignalTriggered = false

    @RegisterFunction
    override fun _ready() {

        noParamSignalDelegate.connectMethod(otherScript, OtherScript::hookNoParam)
        oneParamSignalDelegate.connectMethod(otherScript, OtherScript::hookOneParam)
        twoParamSignalDelegate.connectMethod(otherScript, OtherScript::hookTwoParam)

        noParamSignalDelegate.connectLambda { println("noParam signal emitted") }
        oneParamSignalDelegate.connectLambda { b -> println("oneParam signal emitted with $b") }
        twoParamSignalDelegate.connectLambda { p0, p1 -> println("twoParam signal emitted with $p0 and $p1") }

        noParamSignalDelegate.emit()
        oneParamSignalDelegate.emit(false)
        twoParamSignalDelegate.emit("My Awesome param !", this)


        noParamSignalField.connectMethod(otherScript, OtherScript::hookNoParam)
        oneParamSignalField.connectMethod(otherScript, OtherScript::hookOneParam)
        twoParamSignalField.connectMethod(otherScript, OtherScript::hookTwoParam)

        noParamSignalField.connectLambda { println("noParam signal emitted") }
        oneParamSignalField.connectLambda { b -> println("oneParam signal emitted with $b") }
        twoParamSignalField.connectLambda { p0, p1 -> println("twoParam signal emitted with $p0 and $p1") }

        noParamSignalField.emit()
        oneParamSignalField.emit(false)
        twoParamSignalField.emit("My Awesome param !", this)


        signalWithMultipleTargets.connectMethod(this, SignalKotlinTest::targetFunctionOne)
        signalWithMultipleTargets.connectMethod(this, SignalKotlinTest::targetFunctionTwo)
        signalWithMultipleTargets.emit(Vector2(0, 0))

        selfConnectedSignal.connectMethod(this, SignalKotlinTest::onSelfConnectedSignal)
    }


    @RegisterSignal("vector2")
    val signalWithMultipleTargets by signal1<Vector2>()

    //To store values emitted by signals
    @RegisterProperty
    var array: VariantArray<Vector2> = VariantArray()

    @RegisterFunction
    fun targetFunctionOne(vector2: Vector2) {
        array.append(vector2)
        //call GodotAPI to insert different parameters in the stack.
        this.setMeta("Random".asStringName(), "Value")
        val size = array.size
        if (size < 8)
        signalWithMultipleTargets.emit(Vector2(1, size))
    }


    @RegisterFunction
    fun targetFunctionTwo(vector2: Vector2) {
        array.append(vector2)
    }

    @Rpc
    @RegisterFunction
    fun onSelfConnectedSignal() {
        selfConnectedSignalTriggered = true
    }

    @RegisterFunction
    fun emitSelfConnectedSignal() {
        selfConnectedSignal.emit()
    }
}
