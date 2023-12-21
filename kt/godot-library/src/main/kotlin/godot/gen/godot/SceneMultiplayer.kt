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

/**
 * This class is the default implementation of [MultiplayerAPI], used to provide multiplayer
 * functionalities in Godot Engine.
 * This implementation supports RPCs via [Node.rpc] and [Node.rpcId] and requires
 * [MultiplayerAPI.rpc] to be passed a [Node] (it will fail for other object types).
 * This implementation additionally provide [SceneTree] replication via the [MultiplayerSpawner] and
 * [MultiplayerSynchronizer] nodes, and the [SceneReplicationConfig] resource.
 * **Note:** The high-level multiplayer API protocol is an implementation detail and isn't meant to
 * be used by non-Godot servers. It may change without notice.
 * **Note:** When exporting to Android, make sure to enable the `INTERNET` permission in the Android
 * export preset before exporting the project or using one-click deploy. Otherwise, network
 * communication of any kind will be blocked by Android.
 */
@GodotBaseType
public open class SceneMultiplayer : MultiplayerAPI() {
  /**
   * Emitted when this MultiplayerAPI's [MultiplayerAPI.multiplayerPeer] connects to a new peer and
   * a valid [authCallback] is set. In this case, the [signal MultiplayerAPI.peer_connected] will not
   * be emitted until [completeAuth] is called with given peer [id]. While in this state, the peer will
   * not be included in the list returned by [MultiplayerAPI.getPeers] (but in the one returned by
   * [getAuthenticatingPeers]), and only authentication data will be sent or received. See [sendAuth]
   * for sending authentication data.
   */
  public val peerAuthenticating: Signal1<Long> by signal("id")

  /**
   * Emitted when this MultiplayerAPI's [MultiplayerAPI.multiplayerPeer] disconnects from a peer for
   * which authentication had not yet completed. See [signal peer_authenticating].
   */
  public val peerAuthenticationFailed: Signal1<Long> by signal("id")

  /**
   * Emitted when this MultiplayerAPI's [MultiplayerAPI.multiplayerPeer] receives a [packet] with
   * custom data (see [sendBytes]). ID is the peer ID of the peer that sent the packet.
   */
  public val peerPacket: Signal2<Long, PackedByteArray> by signal("id", "packet")

  /**
   * The root path to use for RPCs and replication. Instead of an absolute path, a relative path
   * will be used to find the node upon which the RPC should be executed.
   * This effectively allows to have different branches of the scene tree to be managed by different
   * MultiplayerAPI, allowing for example to run both client and server in the same scene.
   */
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

  /**
   * The callback to execute when when receiving authentication data sent via [sendAuth]. If the
   * [Callable] is empty (default), peers will be automatically accepted as soon as they connect.
   */
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

  /**
   * If set to a value greater than `0.0`, the maximum amount of time peers can stay in the
   * authenticating state, after which the authentication will automatically fail. See the [signal
   * peer_authenticating] and [signal peer_authentication_failed] signals.
   */
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

  /**
   * If `true`, the MultiplayerAPI will allow encoding and decoding of object during RPCs.
   * **Warning:** Deserialized objects can contain code which gets executed. Do not use this option
   * if the serialized object comes from untrusted sources to avoid potential security threat such as
   * remote code execution.
   */
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

  /**
   * If `true`, the MultiplayerAPI's [MultiplayerAPI.multiplayerPeer] refuses new incoming
   * connections.
   */
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

  /**
   * Enable or disable the server feature that notifies clients of other peers'
   * connection/disconnection, and relays messages between them. When this option is `false`, clients
   * won't be automatically notified of other peers and won't be able to send them packets through the
   * server.
   * **Note:** Changing this option while other peers are connected may lead to unexpected
   * behaviors.
   * **Note:** Support for this feature may depend on the current [MultiplayerPeer] configuration.
   * See [MultiplayerPeer.isServerRelaySupported].
   */
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

  /**
   * Maximum size of each synchronization packet. Higher values increase the chance of receiving
   * full updates in a single frame, but also the chance of packet loss. See [MultiplayerSynchronizer].
   */
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

  /**
   * Maximum size of each delta packet. Higher values increase the chance of receiving full updates
   * in a single frame, but also the chance of causing networking congestion (higher latency,
   * disconnections). See [MultiplayerSynchronizer].
   */
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

  /**
   * Clears the current SceneMultiplayer network state (you shouldn't call this unless you know what
   * you are doing).
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Disconnects the peer identified by [id], removing it from the list of connected peers, and
   * closing the underlying connection with it.
   */
  public fun disconnectPeer(id: Int): Unit {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.disconnectPeerPtr, NIL)
  }

  /**
   * Returns the IDs of the peers currently trying to authenticate with this [MultiplayerAPI].
   */
  public fun getAuthenticatingPeers(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAuthenticatingPeersPtr,
        PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Sends the specified [data] to the remote peer identified by [id] as part of an authentication
   * message. This can be used to authenticate peers, and control when [signal
   * MultiplayerAPI.peer_connected] is emitted (and the remote peer accepted as one of the connected
   * peers).
   */
  public fun sendAuth(id: Int, `data`: PackedByteArray): GodotError {
    TransferContext.writeArguments(LONG to id.toLong(), PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.sendAuthPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Mark the authentication step as completed for the remote peer identified by [id]. The [signal
   * MultiplayerAPI.peer_connected] signal will be emitted for this peer once the remote side also
   * completes the authentication. No further authentication messages are expected to be received from
   * this peer.
   * If a peer disconnects before completing authentication, either due to a network issue, the
   * [authTimeout] expiring, or manually calling [disconnectPeer], the [signal
   * peer_authentication_failed] signal will be emitted instead of [signal
   * MultiplayerAPI.peer_disconnected].
   */
  public fun completeAuth(id: Int): GodotError {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.completeAuthPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sends the given raw [bytes] to a specific peer identified by [id] (see
   * [MultiplayerPeer.setTargetPeer]). Default ID is `0`, i.e. broadcast to all peers.
   */
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
