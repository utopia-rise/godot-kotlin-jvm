// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DICTIONARY
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_WEBRTCMULTIPLAYERPEER_INDEX: Int = 822

/**
 * This class constructs a full mesh of [WebRTCPeerConnection] (one connection for each peer) that
 * can be used as a [MultiplayerAPI.multiplayerPeer].
 * You can add each [WebRTCPeerConnection] via [addPeer] or remove them via [removePeer]. Peers must
 * be added in [WebRTCPeerConnection.STATE_NEW] state to allow it to create the appropriate channels.
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
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_WEBRTCMULTIPLAYERPEER_INDEX, scriptIndex)
  }

  /**
   * Initialize the multiplayer peer as a server (with unique ID of `1`). This mode enables
   * [MultiplayerPeer.isServerRelaySupported], allowing the upper [MultiplayerAPI] layer to perform
   * peer exchange and packet relaying.
   * You can optionally specify a [channelsConfig] array of [MultiplayerPeer.TransferMode] which
   * will be used to create extra channels (WebRTC only supports one transfer mode per channel).
   */
  @JvmOverloads
  public final fun createServer(channelsConfig: VariantArray<Any?> = godot.core.variantArrayOf()):
      Error {
    Internals.writeArguments(ARRAY to channelsConfig)
    Internals.callMethod(rawPtr, MethodBindings.createServerPtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
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
  public final fun createClient(peerId: Int, channelsConfig: VariantArray<Any?> =
      godot.core.variantArrayOf()): Error {
    Internals.writeArguments(LONG to peerId.toLong(), ARRAY to channelsConfig)
    Internals.callMethod(rawPtr, MethodBindings.createClientPtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Initialize the multiplayer peer as a mesh (i.e. all peers connect to each other) with the given
   * [peerId] (must be between 1 and 2147483647).
   */
  @JvmOverloads
  public final fun createMesh(peerId: Int, channelsConfig: VariantArray<Any?> =
      godot.core.variantArrayOf()): Error {
    Internals.writeArguments(LONG to peerId.toLong(), ARRAY to channelsConfig)
    Internals.callMethod(rawPtr, MethodBindings.createMeshPtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Add a new peer to the mesh with the given [peerId]. The [WebRTCPeerConnection] must be in state
   * [WebRTCPeerConnection.STATE_NEW].
   * Three channels will be created for reliable, unreliable, and ordered transport. The value of
   * [unreliableLifetime] will be passed to the `"maxPacketLifetime"` option when creating unreliable
   * and ordered channels (see [WebRTCPeerConnection.createDataChannel]).
   */
  @JvmOverloads
  public final fun addPeer(
    peer: WebRTCPeerConnection?,
    peerId: Int,
    unreliableLifetime: Int = 1,
  ): Error {
    Internals.writeArguments(OBJECT to peer, LONG to peerId.toLong(), LONG to unreliableLifetime.toLong())
    Internals.callMethod(rawPtr, MethodBindings.addPeerPtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Remove the peer with given [peerId] from the mesh. If the peer was connected, and [signal
   * MultiplayerPeer.peer_connected] was emitted for it, then [signal
   * MultiplayerPeer.peer_disconnected] will be emitted.
   */
  public final fun removePeer(peerId: Int): Unit {
    Internals.writeArguments(LONG to peerId.toLong())
    Internals.callMethod(rawPtr, MethodBindings.removePeerPtr, NIL)
  }

  /**
   * Returns `true` if the given [peerId] is in the peers map (it might not be connected though).
   */
  public final fun hasPeer(peerId: Int): Boolean {
    Internals.writeArguments(LONG to peerId.toLong())
    Internals.callMethod(rawPtr, MethodBindings.hasPeerPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns a dictionary representation of the peer with given [peerId] with three keys.
   * `"connection"` containing the [WebRTCPeerConnection] to this peer, `"channels"` an array of three
   * [WebRTCDataChannel], and `"connected"` a boolean representing if the peer connection is currently
   * connected (all three channels are open).
   */
  public final fun getPeer(peerId: Int): Dictionary<Any?, Any?> {
    Internals.writeArguments(LONG to peerId.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getPeerPtr, DICTIONARY)
    return (Internals.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns a dictionary which keys are the peer ids and values the peer representation as in
   * [getPeer].
   */
  public final fun getPeers(): Dictionary<Any?, Any?> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPeersPtr, DICTIONARY)
    return (Internals.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  public companion object

  internal object MethodBindings {
    public val createServerPtr: VoidPtr =
        Internals.getMethodBindPtr("WebRTCMultiplayerPeer", "create_server", 2865356025)

    public val createClientPtr: VoidPtr =
        Internals.getMethodBindPtr("WebRTCMultiplayerPeer", "create_client", 2641732907)

    public val createMeshPtr: VoidPtr =
        Internals.getMethodBindPtr("WebRTCMultiplayerPeer", "create_mesh", 2641732907)

    public val addPeerPtr: VoidPtr =
        Internals.getMethodBindPtr("WebRTCMultiplayerPeer", "add_peer", 4078953270)

    public val removePeerPtr: VoidPtr =
        Internals.getMethodBindPtr("WebRTCMultiplayerPeer", "remove_peer", 1286410249)

    public val hasPeerPtr: VoidPtr =
        Internals.getMethodBindPtr("WebRTCMultiplayerPeer", "has_peer", 3067735520)

    public val getPeerPtr: VoidPtr =
        Internals.getMethodBindPtr("WebRTCMultiplayerPeer", "get_peer", 3554694381)

    public val getPeersPtr: VoidPtr =
        Internals.getMethodBindPtr("WebRTCMultiplayerPeer", "get_peers", 2382534195)
  }
}
