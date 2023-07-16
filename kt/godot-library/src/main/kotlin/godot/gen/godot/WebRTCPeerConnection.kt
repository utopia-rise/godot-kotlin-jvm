// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.Signal3
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class WebRTCPeerConnection : RefCounted() {
  public val sessionDescriptionCreated: Signal2<String, String> by signal("type", "sdp")

  public val iceCandidateCreated: Signal3<String, Long, String> by signal("media", "index", "name")

  public val dataChannelReceived: Signal1<WebRTCDataChannel> by signal("channel")

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_WEBRTCPEERCONNECTION, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun initialize(configuration: Dictionary<Any?, Any?> = Dictionary()): GodotError {
    TransferContext.writeArguments(DICTIONARY to configuration)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCPEERCONNECTION_INITIALIZE,
        LONG)
    return GodotError.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  @JvmOverloads
  public fun createDataChannel(label: String, options: Dictionary<Any?, Any?> = Dictionary()):
      WebRTCDataChannel? {
    TransferContext.writeArguments(STRING to label, DICTIONARY to options)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WEBRTCPEERCONNECTION_CREATE_DATA_CHANNEL, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as WebRTCDataChannel?)
  }

  public fun createOffer(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCPEERCONNECTION_CREATE_OFFER,
        LONG)
    return GodotError.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  public fun setLocalDescription(type: String, sdp: String): GodotError {
    TransferContext.writeArguments(STRING to type, STRING to sdp)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WEBRTCPEERCONNECTION_SET_LOCAL_DESCRIPTION, LONG)
    return GodotError.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  public fun setRemoteDescription(type: String, sdp: String): GodotError {
    TransferContext.writeArguments(STRING to type, STRING to sdp)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WEBRTCPEERCONNECTION_SET_REMOTE_DESCRIPTION, LONG)
    return GodotError.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  public fun addIceCandidate(
    media: String,
    index: Int,
    name: String,
  ): GodotError {
    TransferContext.writeArguments(STRING to media, LONG to index.toLong(), STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WEBRTCPEERCONNECTION_ADD_ICE_CANDIDATE, LONG)
    return GodotError.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  public fun poll(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCPEERCONNECTION_POLL, LONG)
    return GodotError.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  public fun close(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCPEERCONNECTION_CLOSE, NIL)
  }

  public fun getConnectionState(): ConnectionState {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WEBRTCPEERCONNECTION_GET_CONNECTION_STATE, LONG)
    return WebRTCPeerConnection.ConnectionState.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  public fun getGatheringState(): GatheringState {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WEBRTCPEERCONNECTION_GET_GATHERING_STATE, LONG)
    return WebRTCPeerConnection.GatheringState.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  public fun getSignalingState(): SignalingState {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WEBRTCPEERCONNECTION_GET_SIGNALING_STATE, LONG)
    return WebRTCPeerConnection.SignalingState.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  public enum class ConnectionState(
    id: Long,
  ) {
    STATE_NEW(0),
    STATE_CONNECTING(1),
    STATE_CONNECTED(2),
    STATE_DISCONNECTED(3),
    STATE_FAILED(4),
    STATE_CLOSED(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class GatheringState(
    id: Long,
  ) {
    GATHERING_STATE_NEW(0),
    GATHERING_STATE_GATHERING(1),
    GATHERING_STATE_COMPLETE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class SignalingState(
    id: Long,
  ) {
    SIGNALING_STATE_STABLE(0),
    SIGNALING_STATE_HAVE_LOCAL_OFFER(1),
    SIGNALING_STATE_HAVE_REMOTE_OFFER(2),
    SIGNALING_STATE_HAVE_LOCAL_PRANSWER(3),
    SIGNALING_STATE_HAVE_REMOTE_PRANSWER(4),
    SIGNALING_STATE_CLOSED(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
