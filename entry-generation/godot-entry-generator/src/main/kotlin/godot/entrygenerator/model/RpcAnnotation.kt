package godot.entrygenerator.model

data class RpcAnnotation(
    val rpcMode: RpcMode,
    val sync: Sync,
    val transferMode: TransferMode,
    val transferChannel: Int,
    override val symbolProcessorSource: Any
) : FunctionAnnotation

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
