package godot.tests.rpctests

import godot.Node
import godot.annotation.*

@RegisterClass("RPCTests")
class RpcTests : Node() {

    @RegisterProperty
    var remoteSyncCalled: Boolean = false

    @RegisterProperty
    var remoteSyncProperty: Boolean = false

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
