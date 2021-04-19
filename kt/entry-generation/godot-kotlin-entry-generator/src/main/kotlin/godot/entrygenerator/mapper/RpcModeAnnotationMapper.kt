package godot.entrygenerator.mapper

import com.squareup.kotlinpoet.ClassName

object RpcModeAnnotationMapper {
    /**
     * maps RpcModeAnnotations and RPCMode registration enums to ClassNames to provide import informations for kotlinPoet
     */
    fun mapRpcModeAnnotationToClassName(rpcModeAnnotationAsString: String): ClassName {
        return when (rpcModeAnnotationAsString) {
            "godot.MultiplayerAPI.RPCMode.DISABLED" -> ClassName("godot.MultiplayerAPI.RPCMode", "DISABLED")
            "godot.MultiplayerAPI.RPCMode.REMOTE" -> ClassName("godot.MultiplayerAPI.RPCMode", "REMOTE")
            "godot.MultiplayerAPI.RPCMode.MASTER" -> ClassName("godot.MultiplayerAPI.RPCMode", "MASTER")
            "godot.MultiplayerAPI.RPCMode.PUPPET" -> ClassName("godot.MultiplayerAPI.RPCMode", "PUPPET")
            "godot.MultiplayerAPI.RPCMode.REMOTESYNC" -> ClassName("godot.MultiplayerAPI.RPCMode", "REMOTESYNC")
            "godot.MultiplayerAPI.RPCMode.MASTERSYNC" -> ClassName("godot.MultiplayerAPI.RPCMode", "MASTERSYNC")
            "godot.MultiplayerAPI.RPCMode.PUPPETSYNC" -> ClassName("godot.MultiplayerAPI.RPCMode", "PUPPETSYNC")
            "godot.MultiplayerAPI.RPCMode.SLAVE" -> ClassName("godot.MultiplayerAPI.RPCMode", "SLAVE")
            "godot.MultiplayerAPI.RPCMode.SYNC" -> ClassName("godot.MultiplayerAPI.RPCMode", "SYNC")
            else -> throw IllegalArgumentException("Unknown annotation or registration $rpcModeAnnotationAsString")
        }
    }
}
