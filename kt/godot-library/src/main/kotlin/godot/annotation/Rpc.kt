package godot.annotation



@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class Rpc(
    val rpcMode: RpcMode = RpcMode.AUTHORITY,
    val sync: Sync = Sync.NO_SYNC,
    val transferMode: TransferMode = TransferMode.RELIABLE,
    val transferChannel: Int = 0
)

// the reason for not using the generated enums like RPCMode directly is the naming is inconsistent with the one, users are used to from GDScript and thus the documentation
enum class RpcMode {
    DISABLED,
    ANY,
    AUTHORITY
}

enum class Sync {
    SYNC,
    NO_SYNC
}

enum class TransferMode {
    RELIABLE,
    UNRELIABLE,
    UNRELIABLE_ORDERED
}
