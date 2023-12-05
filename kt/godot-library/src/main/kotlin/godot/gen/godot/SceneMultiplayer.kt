// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.GodotError
import godot.core.NodePath
import godot.core.PackedByteArray
import godot.core.PackedInt32Array
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class SceneMultiplayer : MultiplayerAPI() {
  public val peerAuthenticating: Signal1<Long> by signal("id")

  public val peerAuthenticationFailed: Signal1<Long> by signal("id")

  public val peerPacket: Signal2<Long, PackedByteArray> by signal("id", "packet")

  public var rootPath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRootPathPtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRootPathPtr, NIL)
    }

  public var authCallback: Callable
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAuthCallbackPtr, CALLABLE)
      return (TransferContext.readReturnValue(CALLABLE, false) as Callable)
    }
    set(`value`) {
      TransferContext.writeArguments(CALLABLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAuthCallbackPtr, NIL)
    }

  public var authTimeout: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAuthTimeoutPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAuthTimeoutPtr, NIL)
    }

  public var allowObjectDecoding: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isObjectDecodingAllowedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAllowObjectDecodingPtr, NIL)
    }

  public var refuseNewConnections: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isRefusingNewConnectionsPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRefuseNewConnectionsPtr, NIL)
    }

  public var serverRelay: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isServerRelayEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setServerRelayEnabledPtr, NIL)
    }

  public var maxSyncPacketSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxSyncPacketSizePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxSyncPacketSizePtr, NIL)
    }

  public var maxDeltaPacketSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxDeltaPacketSizePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxDeltaPacketSizePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SCENEMULTIPLAYER, scriptIndex)
    return true
  }

  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  public fun disconnectPeer(id: Int): Unit {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.disconnectPeerPtr, NIL)
  }

  public fun getAuthenticatingPeers(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAuthenticatingPeersPtr,
        PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  public fun sendAuth(id: Int, `data`: PackedByteArray): GodotError {
    TransferContext.writeArguments(LONG to id.toLong(), PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.sendAuthPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun completeAuth(id: Int): GodotError {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.completeAuthPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun sendBytes(
    bytes: PackedByteArray,
    id: Int = 0,
    mode: MultiplayerPeer.TransferMode = MultiplayerPeer.TransferMode.TRANSFER_MODE_RELIABLE,
    channel: Int = 0,
  ): GodotError {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to bytes, LONG to id.toLong(), LONG to mode.id, LONG to channel.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.sendBytesPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public companion object

  internal object MethodBindings {
    public val setRootPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneMultiplayer", "set_root_path")

    public val getRootPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneMultiplayer", "get_root_path")

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("SceneMultiplayer", "clear")

    public val disconnectPeerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneMultiplayer", "disconnect_peer")

    public val getAuthenticatingPeersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneMultiplayer", "get_authenticating_peers")

    public val sendAuthPtr: VoidPtr = TypeManager.getMethodBindPtr("SceneMultiplayer", "send_auth")

    public val completeAuthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneMultiplayer", "complete_auth")

    public val setAuthCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneMultiplayer", "set_auth_callback")

    public val getAuthCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneMultiplayer", "get_auth_callback")

    public val setAuthTimeoutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneMultiplayer", "set_auth_timeout")

    public val getAuthTimeoutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneMultiplayer", "get_auth_timeout")

    public val setRefuseNewConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneMultiplayer", "set_refuse_new_connections")

    public val isRefusingNewConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneMultiplayer", "is_refusing_new_connections")

    public val setAllowObjectDecodingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneMultiplayer", "set_allow_object_decoding")

    public val isObjectDecodingAllowedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneMultiplayer", "is_object_decoding_allowed")

    public val setServerRelayEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneMultiplayer", "set_server_relay_enabled")

    public val isServerRelayEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneMultiplayer", "is_server_relay_enabled")

    public val sendBytesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneMultiplayer", "send_bytes")

    public val getMaxSyncPacketSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneMultiplayer", "get_max_sync_packet_size")

    public val setMaxSyncPacketSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneMultiplayer", "set_max_sync_packet_size")

    public val getMaxDeltaPacketSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneMultiplayer", "get_max_delta_packet_size")

    public val setMaxDeltaPacketSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SceneMultiplayer", "set_max_delta_packet_size")
  }
}
