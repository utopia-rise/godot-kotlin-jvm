package godot.tests.rpctests

import godot.api.Node
import godot.annotation.Script
import godot.annotation.Register
import godot.annotation.Visible
import godot.annotation.Rpc
import godot.annotation.Sync

@Script("RPCTests")
class RpcTests : Node() {

    @Visible
    var remoteSyncCalled: Boolean = false

    @Rpc(sync = Sync.SYNC)
    @Register
    fun remoteSyncTest(called: Boolean) {
        remoteSyncCalled = called
    }

    @Register
    fun triggerFunctionRemoteSyncCall() {
        rpc(::remoteSyncTest, true)
    }
}


