package godot.codegen.rpc

enum class RpcPropertyMode(val functionName: String, val hasId: Boolean) {
    RSET("rset", false),
    RSET_ID("rsetId", true),
    RSET_UNRELIABLE("rsetUnreliable", false),
    RSET_UNRELIABLE_ID("rsetUnreliableId", true)
}