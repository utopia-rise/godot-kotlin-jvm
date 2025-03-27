package godot.tests.events

import godot.api.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.annotation.RegisterSignal
import godot.core.Signal3
import godot.core.asCallable
import godot.core.lambdaCallable0
import godot.core.lambdaCallable1
import godot.core.signal0
import godot.core.signal3
import godot.extension.connectLambda

@RegisterClass
class LambdaCallableKotlinTest : Node() {

    @RegisterSignal
    val signalNoParam by signal0()

    @RegisterProperty
    var hasSignalNoParamBeenTriggered = false

    @RegisterSignal("str", "long", "node")
    val signalWithParams: Signal3<String, Long, LambdaCallableKotlinTest> by signal3()

    @RegisterProperty
    var signalString: String = ""

    @RegisterProperty
    var signalLong: Long = Long.MIN_VALUE

    @RegisterProperty
    lateinit var signalNode: LambdaCallableKotlinTest

    @RegisterProperty
    var ktCallable = { str: String -> ktCallableString = str }.asCallable()

    @RegisterProperty
    var ktCallableString: String = ""

    @RegisterProperty
    var callableNoParamTriggered = false

    @RegisterProperty
    var callableWithParamTriggered = false

    @RegisterFunction
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

    @RegisterFunction
    fun emitSignalNoParam() {
        signalNoParam.emit()
    }

    @RegisterFunction
    fun emitSignalWithParam(str: String, long: Long) {
        signalWithParams.emit(str, long, this)
    }

    @RegisterFunction
    fun markCallableNoParamTriggered() {
        callableNoParamTriggered = true
    }

    @RegisterFunction
    fun callCallableNoParam() {
        lambdaCallable0(this::markCallableNoParamTriggered).call()
    }

    @RegisterFunction
    fun callCallableNoParamDeferred() {
        lambdaCallable0(this::markCallableNoParamTriggered).callDeferred()
    }

    @RegisterFunction
    fun markCallableWithParamTriggered(flag: Boolean) {
        callableWithParamTriggered = flag
    }

    @RegisterFunction
    fun callCallableWithParam() {
        lambdaCallable1(this::markCallableWithParamTriggered).call(true)
    }

    @RegisterFunction
    fun callCallableWithParamDeferred() {
        lambdaCallable1(this::markCallableWithParamTriggered).callDeferred(true)
    }
}
