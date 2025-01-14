package godot.tests.rpctests

import godot.api.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.annotation.Rpc
import godot.annotation.Sync

@RegisterClass("RPCTests")
class RpcTests : Node() {

    @RegisterProperty
    var remoteSyncCalled: Boolean = false

    @Rpc(sync = Sync.SYNC)
    @RegisterFunction
    fun remoteSyncTest(called: Boolean) {
        remoteSyncCalled = called
    }

    @RegisterFunction
    fun triggerFunctionRemoteSyncCall() {
        rpc(::remoteSyncTest, true)
    }
}
