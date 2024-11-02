package godot.tests

import godot.Node
import godot.annotation.Member
import godot.annotation.GodotScript
import godot.core.Signal3
import godot.core.asCallable
import godot.core.connect
import godot.core.signal0
import godot.core.signal3

@GodotScript
class LambdaCallableTest : Node() {

    val signalNoParam by signal0()

    @Member
    var hasSignalNoParamBeenTriggered = false

    val signalWithParams: Signal3<String, Long, Node> by signal3("str", "long", "node")

    @Member
    var signalString: String = ""

    @Member
    var signalLong: Long = Long.MIN_VALUE

    @Member
    lateinit var signalNode: Node

    @Member
    var ktCallable = { str: String -> ktCallableString = str }.asCallable()

    @Member
    var ktCallableString: String = ""

    @Member
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

    @Member
    fun emitSignalNoParam() {
        signalNoParam.emit()
    }

    @Member
    fun emitSignalWithParam(str: String, long: Long, node: Node) {
        signalWithParams.emit(str, long, node)
    }
}
