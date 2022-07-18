// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.WebRTCPeerConnection
import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.Signal3
import godot.signals.signal
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class WebRTCPeerConnection : RefCounted() {
  public val iceCandidateCreated: Signal3<String, Long, String> by signal("media", "index", "name")

  public val sessionDescriptionCreated: Signal2<String, String> by signal("type", "sdp")

  public val dataChannelReceived: Signal1<WebRTCDataChannel> by signal("channel")

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_WEBRTCPEERCONNECTION)
  }

  public fun initialize(configuration: Dictionary<Any?, Any?> = Dictionary()): GodotError {
    TransferContext.writeArguments(DICTIONARY to configuration)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCPEERCONNECTION_INITIALIZE,
        LONG.ordinal)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public fun createDataChannel(label: String, options: Dictionary<Any?, Any?> = Dictionary()):
      WebRTCDataChannel? {
    TransferContext.writeArguments(STRING to label, DICTIONARY to options)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCPEERCONNECTION_CREATE_DATA_CHANNEL,
        OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as WebRTCDataChannel?
  }

  public fun createOffer(): GodotError {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCPEERCONNECTION_CREATE_OFFER,
        LONG.ordinal)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public fun setLocalDescription(type: String, sdp: String): GodotError {
    TransferContext.writeArguments(STRING to type, STRING to sdp)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WEBRTCPEERCONNECTION_SET_LOCAL_DESCRIPTION, LONG.ordinal)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public fun setRemoteDescription(type: String, sdp: String): GodotError {
    TransferContext.writeArguments(STRING to type, STRING to sdp)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WEBRTCPEERCONNECTION_SET_REMOTE_DESCRIPTION, LONG.ordinal)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public fun addIceCandidate(
    media: String,
    index: Long,
    name: String
  ): GodotError {
    TransferContext.writeArguments(STRING to media, LONG to index, STRING to name)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCPEERCONNECTION_ADD_ICE_CANDIDATE,
        LONG.ordinal)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public fun poll(): GodotError {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCPEERCONNECTION_POLL, LONG.ordinal)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public fun close(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCPEERCONNECTION_CLOSE, NIL.ordinal)
  }

  public fun getConnectionState(): WebRTCPeerConnection.ConnectionState {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WEBRTCPEERCONNECTION_GET_CONNECTION_STATE, LONG.ordinal)
    return WebRTCPeerConnection.ConnectionState.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public enum class ConnectionState(
    id: Long
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

  public companion object
}
