package godot.codegen.rpc

enum class RpcFunctionMode(val functionName: String, val hasId: Boolean) {
    RPC("rpc", false),
    RPC_ID("rpcId", true),
    RPC_UNRELIABLE("rpcUnreliable", false),
    RPC_UNRELIABLE_ID("rpcUnreliableId", true)
}