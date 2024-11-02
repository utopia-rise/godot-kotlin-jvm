package godot.tests.rpctests

import godot.Node
import godot.annotation.Member
import godot.annotation.GodotScript
import godot.annotation.Rpc
import godot.annotation.Sync

@GodotScript("RPCTests")
class RpcTests : Node() {

    @Member
    var remoteSyncCalled: Boolean = false

    @Rpc(sync = Sync.SYNC)
    fun remoteSyncTest(called: Boolean) {
        remoteSyncCalled = called
    }

    @Member
    fun triggerFunctionRemoteSyncCall() {
        rpc(::remoteSyncTest, true)
    }
}
