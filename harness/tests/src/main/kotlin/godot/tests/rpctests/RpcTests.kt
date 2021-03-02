package godot.tests.rpctests

import godot.MultiplayerAPI
import godot.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty

@RegisterClass("RPCTests")
class RpcTests: Node() {

    @RegisterProperty
    var remoteSyncCalled: Boolean = false

    @RegisterProperty(rpcMode = MultiplayerAPI.RPCMode.REMOTESYNC)
    var remoteSyncProperty: Boolean = false

    @RegisterFunction(rpcMode = MultiplayerAPI.RPCMode.REMOTESYNC)
    fun remoteSyncTest(called: Boolean) {
        remoteSyncCalled = called
    }

    @RegisterFunction
    fun triggerFunctionRemoteSyncCall() {
        println("blubb")
        rpc(::remoteSyncTest, true)
    }

    @RegisterFunction
    fun triggerPropertyRemoteSyncCall() {
        rset(::remoteSyncProperty, true)
    }
}
