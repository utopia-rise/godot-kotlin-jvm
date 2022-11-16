package godot.tests

import godot.MultiplayerAPI
import godot.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.annotation.RegisterSignal
import godot.extensions.call
import godot.extensions.callDeferred
import godot.signals.signal

@RegisterClass
class FuncRefTest : Node() {

    @RegisterSignal
    val signalTest by signal()

    @RegisterProperty(/*rpcMode = MultiplayerAPI.RPCMode.REMOTE*/)
    var blubb: Boolean = false

    @RegisterProperty
    var callFlag = false

    @RegisterProperty
    var callWithParamFlag = false

    @RegisterProperty
    var signalCallFlag = false

    @RegisterFunction
    override fun _ready() {
        signalTest.connect(this, ::testSignalCallback)

//        Cannot test rpc for now as it needs two godot instances.
//        rpc(::testFuncRef)
//        rset(::blubb, false)
    }

    @RegisterFunction(/*MultiplayerAPI.RPCMode.REMOTE*/)
    fun testSignalCallback() {
        signalCallFlag = true
    }

    @RegisterFunction
    fun testSignalCall() {
        signalTest.emit()
    }

    @RegisterFunction
    fun withoutParamCallback() {
        callFlag = true
    }

    @RegisterFunction
    fun testCallWithoutParam() {
        call(this::withoutParamCallback)
    }

    @RegisterFunction
    fun testCallDeferredWithoutParam() {
        callDeferred(this::withoutParamCallback)
    }

    @RegisterFunction
    fun withParamCallback(flag: Boolean) {
        callWithParamFlag = flag
    }

    @RegisterFunction
    fun testCallWithParam() {
        call(this::withParamCallback, true)
    }

    @RegisterFunction
    fun testCallDeferredWithParam() {
        callDeferred(this::withParamCallback, true)
    }
}
