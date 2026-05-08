package godot.tests

import godot.api.Node
import godot.annotation.GodotScript
import godot.annotation.Register
import godot.annotation.Visible
import godot.annotation.RegisterSignal
import godot.core.Signal3
import godot.core.asCallable
import godot.core.signal0
import godot.core.signal3
import godot.extension.connectLambda

@GodotScript
class LambdaCallableTest : Node() {

    @RegisterSignal
    val signalNoParam by signal0()

    @Visible
    var hasSignalNoParamBeenTriggered = false

    @RegisterSignal("str", "long", "node")
    val signalWithParams: Signal3<String, Long, Node> by signal3()

    @Visible
    var signalString: String = ""

    @Visible
    var signalLong: Long = Long.MIN_VALUE

    @Visible
    lateinit var signalNode: Node

    @Visible
    var ktCallable = { str: String -> ktCallableString = str }.asCallable()

    @Visible
    var ktCallableString: String = ""

    @Register
    override fun _ready() {
        signalNoParam.connectLambda {
            hasSignalNoParamBeenTriggered = true
        }

        signalWithParams.connectLambda { p0, p1, p2 ->
            signalString = p0
            signalLong = p1
            signalNode = p2
        }
    }

    @Register
    fun emitSignalNoParam() {
        signalNoParam.emit()
    }

    @Register
    fun emitSignalWithParam(str: String, long: Long, node: Node) {
        signalWithParams.emit(str, long, node)
    }
}