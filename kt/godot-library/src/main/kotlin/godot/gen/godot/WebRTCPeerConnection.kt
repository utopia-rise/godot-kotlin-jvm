// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.Signal3
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * A WebRTC connection between the local computer and a remote peer. Provides an interface to
 * connect, maintain and monitor the connection.
 * Setting up a WebRTC connection between two peers may not seem a trivial task, but it can be
 * broken down into 3 main steps:
 * - The peer that wants to initiate the connection (`A` from now on) creates an offer and send it
 * to the other peer (`B` from now on).
 * - `B` receives the offer, generate and answer, and sends it to `A`).
 * - `A` and `B` then generates and exchange ICE candidates with each other.
 * After these steps, the connection should become connected. Keep on reading or look into the
 * tutorial for more information.
 */
@GodotBaseType
public open class WebRTCPeerConnection : RefCounted() {
  /**
   * Emitted after a successful call to [createOffer] or [setRemoteDescription] (when it generates
   * an answer). The parameters are meant to be passed to [setLocalDescription] on this object, and
   * sent to the remote peer over the signaling server.
   */
  public val sessionDescriptionCreated: Signal2<String, String> by signal("type", "sdp")

  /**
   * Emitted when a new ICE candidate has been created. The three parameters are meant to be passed
   * to the remote peer over the signaling server.
   */
  public val iceCandidateCreated: Signal3<String, Long, String> by signal("media", "index", "name")

  /**
   * Emitted when a new in-band channel is received, i.e. when the channel was created with
   * `negotiated: false` (default).
   * The object will be an instance of [WebRTCDataChannel]. You must keep a reference of it or it
   * will be closed automatically. See [createDataChannel].
   */
  public val dataChannelReceived: Signal1<WebRTCDataChannel> by signal("channel")

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_WEBRTCPEERCONNECTION, scriptIndex)
    return true
  }

  /**
   * Re-initialize this peer connection, closing any previously active connection, and going back to
   * state [STATE_NEW]. A dictionary of [configuration] options can be passed to configure the peer
   * connection.
   * Valid [configuration] options are:
   * [codeblock]
   * {
   *     "iceServers": [
   *         {
   *             "urls": [ "stun:stun.example.com:3478" ], # One or more STUN servers.
   *         },
   *         {
   *             "urls": [ "turn:turn.example.com:3478" ], # One or more TURN servers.
   *             "username": "a_username", # Optional username for the TURN server.
   *             "credential": "a_password", # Optional password for the TURN server.
   *         }
   *     ]
   * }
   * [/codeblock]
   */
  @JvmOverloads
  public fun initialize(configuration: Dictionary<Any?, Any?> = Dictionary()): GodotError {
    TransferContext.writeArguments(DICTIONARY to configuration)
    TransferContext.callMethod(rawPtr, MethodBindings.initializePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns a new [WebRTCDataChannel] (or `null` on failure) with given [label] and optionally
   * configured via the [options] dictionary. This method can only be called when the connection is in
   * state [STATE_NEW].
   * There are two ways to create a working data channel: either call [createDataChannel] on only
   * one of the peer and listen to [signal data_channel_received] on the other, or call
   * [createDataChannel] on both peers, with the same values, and the `"negotiated"` option set to
   * `true`.
   * Valid [options] are:
   * [codeblock]
   * {
   *     "negotiated": true, # When set to true (default off), means the channel is negotiated out
   * of band. "id" must be set too. "data_channel_received" will not be called.
   *     "id": 1, # When "negotiated" is true this value must also be set to the same value on both
   * peer.
   *
   *     # Only one of maxRetransmits and maxPacketLifeTime can be specified, not both. They make
   * the channel unreliable (but also better at real time).
   *     "maxRetransmits": 1, # Specify the maximum number of attempt the peer will make to
   * retransmits packets if they are not acknowledged.
   *     "maxPacketLifeTime": 100, # Specify the maximum amount of time before giving up
   * retransmitions of unacknowledged packets (in milliseconds).
   *     "ordered": true, # When in unreliable mode (i.e. either "maxRetransmits" or
   * "maxPacketLifetime" is set), "ordered" (true by default) specify if packet ordering is to be
   * enforced.
   *
   *     "protocol": "my-custom-protocol", # A custom sub-protocol string for this channel.
   * }
   * [/codeblock]
   * **Note:** You must keep a reference to channels created this way, or it will be closed.
   */
  @JvmOverloads
  public fun createDataChannel(label: String, options: Dictionary<Any?, Any?> = Dictionary()):
      WebRTCDataChannel? {
    TransferContext.writeArguments(STRING to label, DICTIONARY to options)
    TransferContext.callMethod(rawPtr, MethodBindings.createDataChannelPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as WebRTCDataChannel?)
  }

  /**
   * Creates a new SDP offer to start a WebRTC connection with a remote peer. At least one
   * [WebRTCDataChannel] must have been created before calling this method.
   * If this functions returns [OK], [signal session_description_created] will be called when the
   * session is ready to be sent.
   */
  public fun createOffer(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.createOfferPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the SDP description of the local peer. This should be called in response to [signal
   * session_description_created].
   * After calling this function the peer will start emitting [signal ice_candidate_created] (unless
   * an [Error] different from [OK] is returned).
   */
  public fun setLocalDescription(type: String, sdp: String): GodotError {
    TransferContext.writeArguments(STRING to type, STRING to sdp)
    TransferContext.callMethod(rawPtr, MethodBindings.setLocalDescriptionPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the SDP description of the remote peer. This should be called with the values generated by
   * a remote peer and received over the signaling server.
   * If [type] is `"offer"` the peer will emit [signal session_description_created] with the
   * appropriate answer.
   * If [type] is `"answer"` the peer will start emitting [signal ice_candidate_created].
   */
  public fun setRemoteDescription(type: String, sdp: String): GodotError {
    TransferContext.writeArguments(STRING to type, STRING to sdp)
    TransferContext.callMethod(rawPtr, MethodBindings.setRemoteDescriptionPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Add an ice candidate generated by a remote peer (and received over the signaling server). See
   * [signal ice_candidate_created].
   */
  public fun addIceCandidate(
    media: String,
    index: Int,
    name: String,
  ): GodotError {
    TransferContext.writeArguments(STRING to media, LONG to index.toLong(), STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.addIceCandidatePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Call this method frequently (e.g. in [Node.Process] or [Node.PhysicsProcess]) to properly
   * receive signals.
   */
  public fun poll(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pollPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Close the peer connection and all data channels associated with it.
   * **Note:** You cannot reuse this object for a new connection unless you call [initialize].
   */
  public fun close(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.closePtr, NIL)
  }

  /**
   * Returns the connection state. See [ConnectionState].
   */
  public fun getConnectionState(): ConnectionState {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionStatePtr, LONG)
    return WebRTCPeerConnection.ConnectionState.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the ICE [GatheringState] of the connection. This lets you detect, for example, when
   * collection of ICE candidates has finished.
   */
  public fun getGatheringState(): GatheringState {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getGatheringStatePtr, LONG)
    return WebRTCPeerConnection.GatheringState.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the [SignalingState] on the local end of the connection while connecting or
   * reconnecting to another peer.
   */
  public fun getSignalingState(): SignalingState {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSignalingStatePtr, LONG)
    return WebRTCPeerConnection.SignalingState.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class ConnectionState(
    id: Long,
  ) {
    /**
     * The connection is new, data channels and an offer can be created in this state.
     */
    STATE_NEW(0),
    /**
     * The peer is connecting, ICE is in progress, none of the transports has failed.
     */
    STATE_CONNECTING(1),
    /**
     * The peer is connected, all ICE transports are connected.
     */
    STATE_CONNECTED(2),
    /**
     * At least one ICE transport is disconnected.
     */
    STATE_DISCONNECTED(3),
    /**
     * One or more of the ICE transports failed.
     */
    STATE_FAILED(4),
    /**
     * The peer connection is closed (after calling [close] for example).
     */
    STATE_CLOSED(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class GatheringState(
    id: Long,
  ) {
    /**
     * The peer connection was just created and hasn't done any networking yet.
     */
    GATHERING_STATE_NEW(0),
    /**
     * The ICE agent is in the process of gathering candidates for the connection.
     */
    GATHERING_STATE_GATHERING(1),
    /**
     * The ICE agent has finished gathering candidates. If something happens that requires
     * collecting new candidates, such as a new interface being added or the addition of a new ICE
     * server, the state will revert to gathering to gather those candidates.
     */
    GATHERING_STATE_COMPLETE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class SignalingState(
    id: Long,
  ) {
    /**
     * There is no ongoing exchange of offer and answer underway. This may mean that the
     * [WebRTCPeerConnection] is new ([STATE_NEW]) or that negotiation is complete and a connection has
     * been established ([STATE_CONNECTED]).
     */
    SIGNALING_STATE_STABLE(0),
    /**
     * The local peer has called [setLocalDescription], passing in SDP representing an offer
     * (usually created by calling [createOffer]), and the offer has been applied successfully.
     */
    SIGNALING_STATE_HAVE_LOCAL_OFFER(1),
    /**
     * The remote peer has created an offer and used the signaling server to deliver it to the local
     * peer, which has set the offer as the remote description by calling [setRemoteDescription].
     */
    SIGNALING_STATE_HAVE_REMOTE_OFFER(2),
    /**
     * The offer sent by the remote peer has been applied and an answer has been created and applied
     * by calling [setLocalDescription]. This provisional answer describes the supported media formats
     * and so forth, but may not have a complete set of ICE candidates included. Further candidates
     * will be delivered separately later.
     */
    SIGNALING_STATE_HAVE_LOCAL_PRANSWER(3),
    /**
     * A provisional answer has been received and successfully applied in response to an offer
     * previously sent and established by calling [setLocalDescription].
     */
    SIGNALING_STATE_HAVE_REMOTE_PRANSWER(4),
    /**
     * The [WebRTCPeerConnection] has been closed.
     */
    SIGNALING_STATE_CLOSED(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Sets the [extensionClass] as the default [WebRTCPeerConnectionExtension] returned when
     * creating a new [WebRTCPeerConnection].
     */
    public fun setDefaultExtension(extensionClass: StringName): Unit {
      TransferContext.writeArguments(STRING_NAME to extensionClass)
      TransferContext.callMethod(0, MethodBindings.setDefaultExtensionPtr, NIL)
    }
  }

  internal object MethodBindings {
    public val setDefaultExtensionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnection", "set_default_extension")

    public val initializePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnection", "initialize")

    public val createDataChannelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnection", "create_data_channel")

    public val createOfferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnection", "create_offer")

    public val setLocalDescriptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnection", "set_local_description")

    public val setRemoteDescriptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnection", "set_remote_description")

    public val addIceCandidatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnection", "add_ice_candidate")

    public val pollPtr: VoidPtr = TypeManager.getMethodBindPtr("WebRTCPeerConnection", "poll")

    public val closePtr: VoidPtr = TypeManager.getMethodBindPtr("WebRTCPeerConnection", "close")

    public val getConnectionStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnection", "get_connection_state")

    public val getGatheringStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnection", "get_gathering_state")

    public val getSignalingStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnection", "get_signaling_state")
  }
}
