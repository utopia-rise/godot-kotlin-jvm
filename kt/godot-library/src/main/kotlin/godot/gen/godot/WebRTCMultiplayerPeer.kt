// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * This class constructs a full mesh of [WebRTCPeerConnection] (one connection for each peer) that
 * can be used as a [MultiplayerAPI.multiplayerPeer].
 * You can add each [WebRTCPeerConnection] via [addPeer] or remove them via [removePeer]. Peers must
 * be added in [WebRTCPeerConnection.STATENEW] state to allow it to create the appropriate channels.
 * This class will not create offers nor set descriptions, it will only poll them, and notify
 * connections and disconnections.
 * When creating the peer via [createClient] or [createServer] the
 * [MultiplayerPeer.isServerRelaySupported] method will return `true` enabling peer exchange and packet
 * relaying when supported by the [MultiplayerAPI] implementation.
 * **Note:** When exporting to Android, make sure to enable the `INTERNET` permission in the Android
 * export preset before exporting the project or using one-click deploy. Otherwise, network
 * communication of any kind will be blocked by Android.
 */
@GodotBaseType
public open class WebRTCMultiplayerPeer : MultiplayerPeer() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_WEBRTCMULTIPLAYERPEER, scriptIndex)
    return true
  }

  /**
   * Initialize the multiplayer peer as a server (with unique ID of `1`). This mode enables
   * [MultiplayerPeer.isServerRelaySupported], allowing the upper [MultiplayerAPI] layer to perform
   * peer exchange and packet relaying.
   * You can optionally specify a [channelsConfig] array of [MultiplayerPeer.TransferMode] which
   * will be used to create extra channels (WebRTC only supports one transfer mode per channel).
   */
  @JvmOverloads
  public fun createServer(channelsConfig: VariantArray<Any?> = godot.core.variantArrayOf()):
      GodotError {
    TransferContext.writeArguments(ARRAY to channelsConfig)
    TransferContext.callMethod(rawPtr, MethodBindings.createServerPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Initialize the multiplayer peer as a client with the given [peerId] (must be between 2 and
   * 2147483647). In this mode, you should only call [addPeer] once and with [peerId] of `1`. This mode
   * enables [MultiplayerPeer.isServerRelaySupported], allowing the upper [MultiplayerAPI] layer to
   * perform peer exchange and packet relaying.
   * You can optionally specify a [channelsConfig] array of [MultiplayerPeer.TransferMode] which
   * will be used to create extra channels (WebRTC only supports one transfer mode per channel).
   */
  @JvmOverloads
  public fun createClient(peerId: Int, channelsConfig: VariantArray<Any?> =
      godot.core.variantArrayOf()): GodotError {
    TransferContext.writeArguments(LONG to peerId.toLong(), ARRAY to channelsConfig)
    TransferContext.callMethod(rawPtr, MethodBindings.createClientPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Initialize the multiplayer peer as a mesh (i.e. all peers connect to each other) with the given
   * [peerId] (must be between 1 and 2147483647).
   */
  @JvmOverloads
  public fun createMesh(peerId: Int, channelsConfig: VariantArray<Any?> =
      godot.core.variantArrayOf()): GodotError {
    TransferContext.writeArguments(LONG to peerId.toLong(), ARRAY to channelsConfig)
    TransferContext.callMethod(rawPtr, MethodBindings.createMeshPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Add a new peer to the mesh with the given [peerId]. The [WebRTCPeerConnection] must be in state
   * [WebRTCPeerConnection.STATENEW].
   * Three channels will be created for reliable, unreliable, and ordered transport. The value of
   * [unreliableLifetime] will be passed to the `"maxPacketLifetime"` option when creating unreliable
   * and ordered channels (see [WebRTCPeerConnection.createDataChannel]).
   */
  @JvmOverloads
  public fun addPeer(
    peer: WebRTCPeerConnection,
    peerId: Int,
    unreliableLifetime: Int = 1,
  ): GodotError {
    TransferContext.writeArguments(OBJECT to peer, LONG to peerId.toLong(), LONG to unreliableLifetime.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addPeerPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Remove the peer with given [peerId] from the mesh. If the peer was connected, and [signal
   * MultiplayerPeer.peer_connected] was emitted for it, then [signal
   * MultiplayerPeer.peer_disconnected] will be emitted.
   */
  public fun removePeer(peerId: Int): Unit {
    TransferContext.writeArguments(LONG to peerId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removePeerPtr, NIL)
  }

  /**
   * Returns `true` if the given [peerId] is in the peers map (it might not be connected though).
   */
  public fun hasPeer(peerId: Int): Boolean {
    TransferContext.writeArguments(LONG to peerId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.hasPeerPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns a dictionary representation of the peer with given [peerId] with three keys.
   * `"connection"` containing the [WebRTCPeerConnection] to this peer, `"channels"` an array of three
   * [WebRTCDataChannel], and `"connected"` a boolean representing if the peer connection is currently
   * connected (all three channels are open).
   */
  public fun getPeer(peerId: Int): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to peerId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPeerPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns a dictionary which keys are the peer ids and values the peer representation as in
   * [getPeer].
   */
  public fun getPeers(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPeersPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public companion object

  internal object MethodBindings {
    public val createServerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCMultiplayerPeer", "create_server")

    public val createClientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCMultiplayerPeer", "create_client")

    public val createMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCMultiplayerPeer", "create_mesh")

    public val addPeerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCMultiplayerPeer", "add_peer")

    public val removePeerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCMultiplayerPeer", "remove_peer")

    public val hasPeerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCMultiplayerPeer", "has_peer")

    public val getPeerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCMultiplayerPeer", "get_peer")

    public val getPeersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCMultiplayerPeer", "get_peers")
  }
}
