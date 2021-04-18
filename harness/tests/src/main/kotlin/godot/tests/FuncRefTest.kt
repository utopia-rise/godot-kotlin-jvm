package godot.tests

import godot.MultiplayerAPI
import godot.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.annotation.RegisterSignal
import godot.call
import godot.callDeferred
import godot.signals.signal

@RegisterClass
class FuncRefTest : Node() {

    @RegisterSignal
    val signalTest by signal()

    @RegisterProperty(rpcMode = MultiplayerAPI.RPCMode.REMOTE)
    var blubb: Boolean = false

    @RegisterFunction
    override fun _ready() {
        signalTest.connect(this, ::testFuncRef)
        rpc(::testFuncRef)
        rset(::blubb, false)
        call(::callTest)
        callDeferred(::callTest)
    }

    @RegisterFunction(MultiplayerAPI.RPCMode.REMOTE)
    fun testFuncRef() {

    }

    @RegisterFunction
    fun callTest() {

    }
}
