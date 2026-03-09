package godot.codegen.rpc

enum class RpcFunctionMode(val functionName: String, val hasId: Boolean) {
    RPC("rpc", false),
    RPC_ID("rpcId", true),
}
