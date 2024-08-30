package godot.tests

import godot.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.annotation.RegisterSignal
import godot.core.callable.asCallable
import godot.signals.connect
import godot.signals.signal

@RegisterClass
class LambdaCallableTest : Node() {

    @RegisterSignal
    val signalNoParam by signal()

    @RegisterProperty
    var hasSignalNoParamBeenTriggered = false

    @RegisterSignal
    val signalWithParams by signal<String, Long, Node>("str", "long", "node")

    @RegisterProperty
    var signalString: String = ""

    @RegisterProperty
    var signalLong: Long = Long.MIN_VALUE

    @RegisterProperty
    lateinit var signalNode: Node

    @RegisterProperty
    var ktCallable = { str: String -> ktCallableString = str }.asCallable()

    @RegisterProperty
    var ktCallableString: String = ""

    @RegisterFunction
    override fun _ready() {
        signalNoParam.connect {
            hasSignalNoParamBeenTriggered = true
        }

        signalWithParams.connect { p0, p1, p2 ->
            signalString = p0
            signalLong = p1
            signalNode = p2
        }
    }

    @RegisterFunction
    fun emitSignalNoParam() {
        signalNoParam.emit()
    }

    @RegisterFunction
    fun emitSignalWithParam(str: String, long: Long, node: Node) {
        signalWithParams.emit(str, long, node)
    }
}
