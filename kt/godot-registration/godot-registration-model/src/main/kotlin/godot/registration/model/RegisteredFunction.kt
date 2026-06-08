package godot.registration.model

import godot.annotation.RpcMode
import godot.annotation.Sync
import godot.annotation.TransferMode
import godot.registration.model.types.Type
import godot.registration.model.types.TYPE_VOID

data class ValueParameter(
    val name: String,
    val type: Type,
)

/**
 * RPC (networking) configuration of a registered function.
 *
 * Mirrors the user-facing `@Rpc` annotation. A `null` [RegisteredFunction.rpcConfig] means the function
 * has no RPC capabilities; a non-null value means it is an RPC function configured as described here.
 */
data class RpcConfig(
    val rpcMode: RpcMode = RpcMode.AUTHORITY,
    val sync: Sync = Sync.NO_SYNC,
    val transferMode: TransferMode = TransferMode.RELIABLE,
    val transferChannel: Int = 0,
)

data class RegisteredFunction(
    val fqName: String,
    val parameters: List<ValueParameter> = emptyList(),
    val returnType: Type = Type.nilType,
    val rpcConfig: RpcConfig? = null,
) {
    val name: String
        get() = fqName.substringAfterLast(".")
}
