package godot.entrygenerator.model

import godot.annotation.RpcMode
import godot.annotation.Sync
import godot.annotation.TransferMode

data class RpcAnnotation(
    val rpcMode: RpcMode,
    val sync: Sync,
    val transferMode: TransferMode,
    val transferChannel: Int,
) : FunctionAnnotation

