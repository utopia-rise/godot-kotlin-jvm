package godot.tests

import godot.Node
import godot.annotation.GodotMember
import godot.annotation.GodotScript
import godot.core.Signal3
import godot.core.asCallable
import godot.core.connect
import godot.core.signal0
import godot.core.signal3

@GodotScript
class LambdaCallableTest : Node() {

    val signalNoParam by signal0()

    @GodotMember
    var hasSignalNoParamBeenTriggered = false

    val signalWithParams: Signal3<String, Long, Node> by signal3("str", "long", "node")

    @GodotMember
    var signalString: String = ""

    @GodotMember
    var signalLong: Long = Long.MIN_VALUE

    @GodotMember
    lateinit var signalNode: Node

    @GodotMember
    var ktCallable = { str: String -> ktCallableString = str }.asCallable()

    @GodotMember
    var ktCallableString: String = ""

    @GodotMember
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

    @GodotMember
    fun emitSignalNoParam() {
        signalNoParam.emit()
    }

    @GodotMember
    fun emitSignalWithParam(str: String, long: Long, node: Node) {
        signalWithParams.emit(str, long, node)
    }
}
