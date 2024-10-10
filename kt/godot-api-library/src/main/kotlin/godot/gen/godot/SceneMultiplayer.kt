// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.NodePath
import godot.core.PackedByteArray
import godot.core.PackedInt32Array
import godot.core.Signal1
import godot.core.Signal2
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.CALLABLE
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import godot.core.VariantParser.PACKED_BYTE_ARRAY
import godot.core.VariantParser.PACKED_INT_32_ARRAY
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_SCENEMULTIPLAYER_INDEX: Int = 503

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
  public val peerAuthenticating: Signal1<Long> by Signal1

  /**
   * Emitted when this MultiplayerAPI's [MultiplayerAPI.multiplayerPeer] disconnects from a peer for
   * which authentication had not yet completed. See [signal peer_authenticating].
   */
  public val peerAuthenticationFailed: Signal1<Long> by Signal1

  /**
   * Emitted when this MultiplayerAPI's [MultiplayerAPI.multiplayerPeer] receives a [packet] with
   * custom data (see [sendBytes]). ID is the peer ID of the peer that sent the packet.
   */
  public val peerPacket: Signal2<Long, PackedByteArray> by Signal2

  /**
   * The root path to use for RPCs and replication. Instead of an absolute path, a relative path
   * will be used to find the node upon which the RPC should be executed.
   * This effectively allows to have different branches of the scene tree to be managed by different
   * MultiplayerAPI, allowing for example to run both client and server in the same scene.
   */
  public final inline var rootPath: NodePath
    @JvmName("rootPathProperty")
    get() = getRootPath()
    @JvmName("rootPathProperty")
    set(`value`) {
      setRootPath(value)
    }

  /**
   * The callback to execute when when receiving authentication data sent via [sendAuth]. If the
   * [Callable] is empty (default), peers will be automatically accepted as soon as they connect.
   */
  public final inline var authCallback: Callable
    @JvmName("authCallbackProperty")
    get() = getAuthCallback()
    @JvmName("authCallbackProperty")
    set(`value`) {
      setAuthCallback(value)
    }

  /**
   * If set to a value greater than `0.0`, the maximum amount of time peers can stay in the
   * authenticating state, after which the authentication will automatically fail. See the [signal
   * peer_authenticating] and [signal peer_authentication_failed] signals.
   */
  public final inline var authTimeout: Double
    @JvmName("authTimeoutProperty")
    get() = getAuthTimeout()
    @JvmName("authTimeoutProperty")
    set(`value`) {
      setAuthTimeout(value)
    }

  /**
   * If `true`, the MultiplayerAPI will allow encoding and decoding of object during RPCs.
   * **Warning:** Deserialized objects can contain code which gets executed. Do not use this option
   * if the serialized object comes from untrusted sources to avoid potential security threat such as
   * remote code execution.
   */
  public final inline var allowObjectDecoding: Boolean
    @JvmName("allowObjectDecodingProperty")
    get() = isObjectDecodingAllowed()
    @JvmName("allowObjectDecodingProperty")
    set(`value`) {
      setAllowObjectDecoding(value)
    }

  /**
   * If `true`, the MultiplayerAPI's [MultiplayerAPI.multiplayerPeer] refuses new incoming
   * connections.
   */
  public final inline var refuseNewConnections: Boolean
    @JvmName("refuseNewConnectionsProperty")
    get() = isRefusingNewConnections()
    @JvmName("refuseNewConnectionsProperty")
    set(`value`) {
      setRefuseNewConnections(value)
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
  public final inline var serverRelay: Boolean
    @JvmName("serverRelayProperty")
    get() = isServerRelayEnabled()
    @JvmName("serverRelayProperty")
    set(`value`) {
      setServerRelayEnabled(value)
    }

  /**
   * Maximum size of each synchronization packet. Higher values increase the chance of receiving
   * full updates in a single frame, but also the chance of packet loss. See [MultiplayerSynchronizer].
   */
  public final inline var maxSyncPacketSize: Int
    @JvmName("maxSyncPacketSizeProperty")
    get() = getMaxSyncPacketSize()
    @JvmName("maxSyncPacketSizeProperty")
    set(`value`) {
      setMaxSyncPacketSize(value)
    }

  /**
   * Maximum size of each delta packet. Higher values increase the chance of receiving full updates
   * in a single frame, but also the chance of causing networking congestion (higher latency,
   * disconnections). See [MultiplayerSynchronizer].
   */
  public final inline var maxDeltaPacketSize: Int
    @JvmName("maxDeltaPacketSizeProperty")
    get() = getMaxDeltaPacketSize()
    @JvmName("maxDeltaPacketSizeProperty")
    set(`value`) {
      setMaxDeltaPacketSize(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_SCENEMULTIPLAYER_INDEX, scriptIndex)
  }

  public final fun setRootPath(path: NodePath): Unit {
    Internals.writeArguments(NODE_PATH to path)
    Internals.callMethod(rawPtr, MethodBindings.setRootPathPtr, NIL)
  }

  public final fun getRootPath(): NodePath {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRootPathPtr, NODE_PATH)
    return (Internals.readReturnValue(NODE_PATH) as NodePath)
  }

  /**
   * Clears the current SceneMultiplayer network state (you shouldn't call this unless you know what
   * you are doing).
   */
  public final fun clear(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Disconnects the peer identified by [id], removing it from the list of connected peers, and
   * closing the underlying connection with it.
   */
  public final fun disconnectPeer(id: Int): Unit {
    Internals.writeArguments(LONG to id.toLong())
    Internals.callMethod(rawPtr, MethodBindings.disconnectPeerPtr, NIL)
  }

  /**
   * Returns the IDs of the peers currently trying to authenticate with this [MultiplayerAPI].
   */
  public final fun getAuthenticatingPeers(): PackedInt32Array {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAuthenticatingPeersPtr, PACKED_INT_32_ARRAY)
    return (Internals.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  /**
   * Sends the specified [data] to the remote peer identified by [id] as part of an authentication
   * message. This can be used to authenticate peers, and control when [signal
   * MultiplayerAPI.peer_connected] is emitted (and the remote peer accepted as one of the connected
   * peers).
   */
  public final fun sendAuth(id: Int, `data`: PackedByteArray): Error {
    Internals.writeArguments(LONG to id.toLong(), PACKED_BYTE_ARRAY to data)
    Internals.callMethod(rawPtr, MethodBindings.sendAuthPtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
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
  public final fun completeAuth(id: Int): Error {
    Internals.writeArguments(LONG to id.toLong())
    Internals.callMethod(rawPtr, MethodBindings.completeAuthPtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setAuthCallback(callback: Callable): Unit {
    Internals.writeArguments(CALLABLE to callback)
    Internals.callMethod(rawPtr, MethodBindings.setAuthCallbackPtr, NIL)
  }

  public final fun getAuthCallback(): Callable {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAuthCallbackPtr, CALLABLE)
    return (Internals.readReturnValue(CALLABLE) as Callable)
  }

  public final fun setAuthTimeout(timeout: Double): Unit {
    Internals.writeArguments(DOUBLE to timeout)
    Internals.callMethod(rawPtr, MethodBindings.setAuthTimeoutPtr, NIL)
  }

  public final fun getAuthTimeout(): Double {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAuthTimeoutPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double)
  }

  public final fun setRefuseNewConnections(refuse: Boolean): Unit {
    Internals.writeArguments(BOOL to refuse)
    Internals.callMethod(rawPtr, MethodBindings.setRefuseNewConnectionsPtr, NIL)
  }

  public final fun isRefusingNewConnections(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isRefusingNewConnectionsPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAllowObjectDecoding(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setAllowObjectDecodingPtr, NIL)
  }

  public final fun isObjectDecodingAllowed(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isObjectDecodingAllowedPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setServerRelayEnabled(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setServerRelayEnabledPtr, NIL)
  }

  public final fun isServerRelayEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isServerRelayEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sends the given raw [bytes] to a specific peer identified by [id] (see
   * [MultiplayerPeer.setTargetPeer]). Default ID is `0`, i.e. broadcast to all peers.
   */
  @JvmOverloads
  public final fun sendBytes(
    bytes: PackedByteArray,
    id: Int = 0,
    mode: MultiplayerPeer.TransferMode = MultiplayerPeer.TransferMode.TRANSFER_MODE_RELIABLE,
    channel: Int = 0,
  ): Error {
    Internals.writeArguments(PACKED_BYTE_ARRAY to bytes, LONG to id.toLong(), LONG to mode.id, LONG to channel.toLong())
    Internals.callMethod(rawPtr, MethodBindings.sendBytesPtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun getMaxSyncPacketSize(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMaxSyncPacketSizePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setMaxSyncPacketSize(size: Int): Unit {
    Internals.writeArguments(LONG to size.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setMaxSyncPacketSizePtr, NIL)
  }

  public final fun getMaxDeltaPacketSize(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMaxDeltaPacketSizePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setMaxDeltaPacketSize(size: Int): Unit {
    Internals.writeArguments(LONG to size.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setMaxDeltaPacketSizePtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val setRootPathPtr: VoidPtr =
        Internals.getMethodBindPtr("SceneMultiplayer", "set_root_path", 1348162250)

    public val getRootPathPtr: VoidPtr =
        Internals.getMethodBindPtr("SceneMultiplayer", "get_root_path", 4075236667)

    public val clearPtr: VoidPtr =
        Internals.getMethodBindPtr("SceneMultiplayer", "clear", 3218959716)

    public val disconnectPeerPtr: VoidPtr =
        Internals.getMethodBindPtr("SceneMultiplayer", "disconnect_peer", 1286410249)

    public val getAuthenticatingPeersPtr: VoidPtr =
        Internals.getMethodBindPtr("SceneMultiplayer", "get_authenticating_peers", 969006518)

    public val sendAuthPtr: VoidPtr =
        Internals.getMethodBindPtr("SceneMultiplayer", "send_auth", 506032537)

    public val completeAuthPtr: VoidPtr =
        Internals.getMethodBindPtr("SceneMultiplayer", "complete_auth", 844576869)

    public val setAuthCallbackPtr: VoidPtr =
        Internals.getMethodBindPtr("SceneMultiplayer", "set_auth_callback", 1611583062)

    public val getAuthCallbackPtr: VoidPtr =
        Internals.getMethodBindPtr("SceneMultiplayer", "get_auth_callback", 1307783378)

    public val setAuthTimeoutPtr: VoidPtr =
        Internals.getMethodBindPtr("SceneMultiplayer", "set_auth_timeout", 373806689)

    public val getAuthTimeoutPtr: VoidPtr =
        Internals.getMethodBindPtr("SceneMultiplayer", "get_auth_timeout", 1740695150)

    public val setRefuseNewConnectionsPtr: VoidPtr =
        Internals.getMethodBindPtr("SceneMultiplayer", "set_refuse_new_connections", 2586408642)

    public val isRefusingNewConnectionsPtr: VoidPtr =
        Internals.getMethodBindPtr("SceneMultiplayer", "is_refusing_new_connections", 36873697)

    public val setAllowObjectDecodingPtr: VoidPtr =
        Internals.getMethodBindPtr("SceneMultiplayer", "set_allow_object_decoding", 2586408642)

    public val isObjectDecodingAllowedPtr: VoidPtr =
        Internals.getMethodBindPtr("SceneMultiplayer", "is_object_decoding_allowed", 36873697)

    public val setServerRelayEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("SceneMultiplayer", "set_server_relay_enabled", 2586408642)

    public val isServerRelayEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("SceneMultiplayer", "is_server_relay_enabled", 36873697)

    public val sendBytesPtr: VoidPtr =
        Internals.getMethodBindPtr("SceneMultiplayer", "send_bytes", 1307428718)

    public val getMaxSyncPacketSizePtr: VoidPtr =
        Internals.getMethodBindPtr("SceneMultiplayer", "get_max_sync_packet_size", 3905245786)

    public val setMaxSyncPacketSizePtr: VoidPtr =
        Internals.getMethodBindPtr("SceneMultiplayer", "set_max_sync_packet_size", 1286410249)

    public val getMaxDeltaPacketSizePtr: VoidPtr =
        Internals.getMethodBindPtr("SceneMultiplayer", "get_max_delta_packet_size", 3905245786)

    public val setMaxDeltaPacketSizePtr: VoidPtr =
        Internals.getMethodBindPtr("SceneMultiplayer", "set_max_delta_packet_size", 1286410249)
  }
}
