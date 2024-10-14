package godot.tests.signal

import godot.Node
import godot.annotation.GodotMember
import godot.annotation.GodotScript
import godot.core.Signal0
import godot.core.Signal1
import godot.core.Signal2
import godot.core.VariantArray
import godot.core.Vector2
import godot.core.asStringName
import godot.core.connect
import godot.core.signal0
import godot.core.signal1
import godot.core.signal2
import godot.tests.subpackage.OtherScript

@GodotScript
class SignalTest : Node() {
    val noParamSignalDelegate by signal0()

    val oneParamSignalDelegate by signal1<Boolean>("refresh")

    val twoParamSignalDelegate by signal2<String, SignalTest>("str", "inv")

    val noParamSignalField = Signal0("noParamSignalField")

    val oneParamSignalField = Signal1<Boolean>("oneParamSignalField","refresh")

    val twoParamSignalField = Signal2<String, SignalTest>("twoParamSignalField","str", "inv")

    @GodotMember
    var otherScript = OtherScript()

    override fun _ready() {
        noParamSignalDelegate.connect(otherScript, OtherScript::hookNoParam)
        oneParamSignalDelegate.connect(otherScript, OtherScript::hookOneParam)
        twoParamSignalDelegate.connect(otherScript, OtherScript::hookTwoParam)

        noParamSignalDelegate.connect { println("noParam signal emitted") }
        oneParamSignalDelegate.connect { b -> println("oneParam signal emitted with $b") }
        twoParamSignalDelegate.connect { p0, p1 -> println("twoParam signal emitted with $p0 and $p1") }

        noParamSignalDelegate.emit()
        oneParamSignalDelegate.emit(false)
        twoParamSignalDelegate.emit("My Awesome param !", this)


        noParamSignalField.connect(otherScript, OtherScript::hookNoParam)
        oneParamSignalField.connect(otherScript, OtherScript::hookOneParam)
        twoParamSignalField.connect(otherScript, OtherScript::hookTwoParam)

        noParamSignalField.connect { println("noParam signal emitted") }
        oneParamSignalField.connect { b -> println("oneParam signal emitted with $b") }
        twoParamSignalField.connect { p0, p1 -> println("twoParam signal emitted with $p0 and $p1") }

        noParamSignalField.emit()
        oneParamSignalField.emit(false)
        twoParamSignalField.emit("My Awesome param !", this)


        signalWithMultipleTargets.connect(this, SignalTest::targetFunctionOne)
        signalWithMultipleTargets.connect(this, SignalTest::targetFunctionTwo)
        signalWithMultipleTargets.emit(Vector2(0, 0))
    }


    val signalWithMultipleTargets by signal1<Vector2>("vector2")

    //To store values emitted by signals
    @GodotMember
    var array: VariantArray<Vector2> = VariantArray()

    @GodotMember
    fun targetFunctionOne(vector2: Vector2) {
        array.append(vector2)
        //call GodotAPI to insert different parameters in the stack.
        this.setMeta("Random".asStringName(), "Value")
        val size = array.size
        if (size < 8)
        //Call signal inside another signal
            signalWithMultipleTargets.emit(Vector2(1, size))
    }


    @GodotMember
    fun targetFunctionTwo(vector2: Vector2) {
        array.append(vector2)
    }
}

