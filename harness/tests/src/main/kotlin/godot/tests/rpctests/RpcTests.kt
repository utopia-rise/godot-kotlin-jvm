package godot.tests.rpctests

import godot.Node
import godot.annotation.GodotMember
import godot.annotation.GodotScript
import godot.annotation.Rpc
import godot.annotation.Sync

@GodotScript("RPCTests")
class RpcTests : Node() {

    @GodotMember
    var remoteSyncCalled: Boolean = false

    @Rpc(sync = Sync.SYNC)
    fun remoteSyncTest(called: Boolean) {
        remoteSyncCalled = called
    }

    @GodotMember
    fun triggerFunctionRemoteSyncCall() {
        rpc(::remoteSyncTest, true)
    }
}
