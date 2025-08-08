// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Dictionary
import godot.core.Error
import godot.core.GodotEnum
import godot.core.Signal1
import godot.core.Signal2
import godot.core.Signal3
import godot.core.StringName
import godot.core.VariantParser.DICTIONARY
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import godot.core.asCachedStringName
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * A WebRTC connection between the local computer and a remote peer. Provides an interface to
 * connect, maintain and monitor the connection.
 *
 * Setting up a WebRTC connection between two peers may not seem a trivial task, but it can be
 * broken down into 3 main steps:
 *
 * - The peer that wants to initiate the connection (`A` from now on) creates an offer and send it
 * to the other peer (`B` from now on).
 *
 * - `B` receives the offer, generate and answer, and sends it to `A`).
 *
 * - `A` and `B` then generates and exchange ICE candidates with each other.
 *
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
  public val sessionDescriptionCreated: Signal2<String, String> by Signal2

  /**
   * Emitted when a new ICE candidate has been created. The three parameters are meant to be passed
   * to the remote peer over the signaling server.
   */
  public val iceCandidateCreated: Signal3<String, Long, String> by Signal3

  /**
   * Emitted when a new in-band channel is received, i.e. when the channel was created with
   * `negotiated: false` (default).
   *
   * The object will be an instance of [WebRTCDataChannel]. You must keep a reference of it or it
   * will be closed automatically. See [createDataChannel].
   */
  public val dataChannelReceived: Signal1<WebRTCDataChannel> by Signal1

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(844, scriptIndex)
  }

  /**
   * Re-initialize this peer connection, closing any previously active connection, and going back to
   * state [STATE_NEW]. A dictionary of [configuration] options can be passed to configure the peer
   * connection.
   *
   * Valid [configuration] options are:
   *
   * ```
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
   * ```
   */
  @JvmOverloads
  public final fun initialize(configuration: Dictionary<Any?, Any?> = Dictionary()): Error {
    TransferContext.writeArguments(DICTIONARY to configuration)
    TransferContext.callMethod(ptr, MethodBindings.initializePtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns a new [WebRTCDataChannel] (or `null` on failure) with given [label] and optionally
   * configured via the [options] dictionary. This method can only be called when the connection is in
   * state [STATE_NEW].
   *
   * There are two ways to create a working data channel: either call [createDataChannel] on only
   * one of the peer and listen to [signal data_channel_received] on the other, or call
   * [createDataChannel] on both peers, with the same values, and the `"negotiated"` option set to
   * `true`.
   *
   * Valid [options] are:
   *
   * ```
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
   * ```
   *
   * **Note:** You must keep a reference to channels created this way, or it will be closed.
   */
  @JvmOverloads
  public final fun createDataChannel(label: String, options: Dictionary<Any?, Any?> = Dictionary()):
      WebRTCDataChannel? {
    TransferContext.writeArguments(STRING to label, DICTIONARY to options)
    TransferContext.callMethod(ptr, MethodBindings.createDataChannelPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as WebRTCDataChannel?)
  }

  /**
   * Creates a new SDP offer to start a WebRTC connection with a remote peer. At least one
   * [WebRTCDataChannel] must have been created before calling this method.
   *
   * If this functions returns [OK], [signal session_description_created] will be called when the
   * session is ready to be sent.
   */
  public final fun createOffer(): Error {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.createOfferPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the SDP description of the local peer. This should be called in response to [signal
   * session_description_created].
   *
   * After calling this function the peer will start emitting [signal ice_candidate_created] (unless
   * an [Error] different from [OK] is returned).
   */
  public final fun setLocalDescription(type: String, sdp: String): Error {
    TransferContext.writeArguments(STRING to type, STRING to sdp)
    TransferContext.callMethod(ptr, MethodBindings.setLocalDescriptionPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the SDP description of the remote peer. This should be called with the values generated by
   * a remote peer and received over the signaling server.
   *
   * If [type] is `"offer"` the peer will emit [signal session_description_created] with the
   * appropriate answer.
   *
   * If [type] is `"answer"` the peer will start emitting [signal ice_candidate_created].
   */
  public final fun setRemoteDescription(type: String, sdp: String): Error {
    TransferContext.writeArguments(STRING to type, STRING to sdp)
    TransferContext.callMethod(ptr, MethodBindings.setRemoteDescriptionPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Add an ice candidate generated by a remote peer (and received over the signaling server). See
   * [signal ice_candidate_created].
   */
  public final fun addIceCandidate(
    media: String,
    index: Int,
    name: String,
  ): Error {
    TransferContext.writeArguments(STRING to media, LONG to index.toLong(), STRING to name)
    TransferContext.callMethod(ptr, MethodBindings.addIceCandidatePtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Call this method frequently (e.g. in [Node.Process] or [Node.PhysicsProcess]) to properly
   * receive signals.
   */
  public final fun poll(): Error {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.pollPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Close the peer connection and all data channels associated with it.
   *
   * **Note:** You cannot reuse this object for a new connection unless you call [initialize].
   */
  public final fun close(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.closePtr, NIL)
  }

  /**
   * Returns the connection state. See [ConnectionState].
   */
  public final fun getConnectionState(): ConnectionState {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getConnectionStatePtr, LONG)
    return ConnectionState.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the ICE [GatheringState] of the connection. This lets you detect, for example, when
   * collection of ICE candidates has finished.
   */
  public final fun getGatheringState(): GatheringState {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGatheringStatePtr, LONG)
    return GatheringState.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the signaling state on the local end of the connection while connecting or reconnecting
   * to another peer.
   */
  public final fun getSignalingState(): SignalingState {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSignalingStatePtr, LONG)
    return SignalingState.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class ConnectionState(
    id: Long,
  ) : GodotEnum {
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

    public override val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ConnectionState = entries.single { it.id == `value` }
    }
  }

  public enum class GatheringState(
    id: Long,
  ) : GodotEnum {
    /**
     * The peer connection was just created and hasn't done any networking yet.
     */
    NEW(0),
    /**
     * The ICE agent is in the process of gathering candidates for the connection.
     */
    GATHERING(1),
    /**
     * The ICE agent has finished gathering candidates. If something happens that requires
     * collecting new candidates, such as a new interface being added or the addition of a new ICE
     * server, the state will revert to gathering to gather those candidates.
     */
    COMPLETE(2),
    ;

    public override val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): GatheringState = entries.single { it.id == `value` }
    }
  }

  public enum class SignalingState(
    id: Long,
  ) : GodotEnum {
    /**
     * There is no ongoing exchange of offer and answer underway. This may mean that the
     * [WebRTCPeerConnection] is new ([STATE_NEW]) or that negotiation is complete and a connection has
     * been established ([STATE_CONNECTED]).
     */
    STABLE(0),
    /**
     * The local peer has called [setLocalDescription], passing in SDP representing an offer
     * (usually created by calling [createOffer]), and the offer has been applied successfully.
     */
    HAVE_LOCAL_OFFER(1),
    /**
     * The remote peer has created an offer and used the signaling server to deliver it to the local
     * peer, which has set the offer as the remote description by calling [setRemoteDescription].
     */
    HAVE_REMOTE_OFFER(2),
    /**
     * The offer sent by the remote peer has been applied and an answer has been created and applied
     * by calling [setLocalDescription]. This provisional answer describes the supported media formats
     * and so forth, but may not have a complete set of ICE candidates included. Further candidates
     * will be delivered separately later.
     */
    HAVE_LOCAL_PRANSWER(3),
    /**
     * A provisional answer has been received and successfully applied in response to an offer
     * previously sent and established by calling [setLocalDescription].
     */
    HAVE_REMOTE_PRANSWER(4),
    /**
     * The [WebRTCPeerConnection] has been closed.
     */
    CLOSED(5),
    ;

    public override val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SignalingState = entries.single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Sets the [extensionClass] as the default [WebRTCPeerConnectionExtension] returned when
     * creating a new [WebRTCPeerConnection].
     */
    @JvmStatic
    public final fun setDefaultExtension(extensionClass: StringName): Unit {
      TransferContext.writeArguments(STRING_NAME to extensionClass)
      TransferContext.callMethod(0, MethodBindings.setDefaultExtensionPtr, NIL)
    }

    /**
     * Sets the [extensionClass] as the default [WebRTCPeerConnectionExtension] returned when
     * creating a new [WebRTCPeerConnection].
     */
    @JvmStatic
    public final fun setDefaultExtension(extensionClass: String) =
        setDefaultExtension(extensionClass.asCachedStringName())
  }

  public object MethodBindings {
    internal val setDefaultExtensionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnection", "set_default_extension", 3304788590)

    internal val initializePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnection", "initialize", 2625064318)

    internal val createDataChannelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnection", "create_data_channel", 1288557393)

    internal val createOfferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnection", "create_offer", 166280745)

    internal val setLocalDescriptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnection", "set_local_description", 852856452)

    internal val setRemoteDescriptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnection", "set_remote_description", 852856452)

    internal val addIceCandidatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnection", "add_ice_candidate", 3958950400)

    internal val pollPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnection", "poll", 166280745)

    internal val closePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnection", "close", 3218959716)

    internal val getConnectionStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnection", "get_connection_state", 2275710506)

    internal val getGatheringStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnection", "get_gathering_state", 4262591401)

    internal val getSignalingStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnection", "get_signaling_state", 3342956226)
  }
}
