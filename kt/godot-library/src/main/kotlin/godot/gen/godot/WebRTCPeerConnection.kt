// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.WebRTCPeerConnection
import godot.annotation.GodotBaseType
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
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class WebRTCPeerConnection : Reference() {
  val dataChannelReceived: Signal1<Object> by signal("channel")

  val iceCandidateCreated: Signal3<String, Long, String> by signal("media", "index", "name")

  val sessionDescriptionCreated: Signal2<String, String> by signal("type", "sdp")

  override fun __new(): VoidPtr =
      TransferContext.invokeConstructor(ENGINECLASS_WEBRTCPEERCONNECTION)

  open fun addIceCandidate(
    media: String,
    index: Long,
    name: String
  ): GodotError {
    TransferContext.writeArguments(STRING to media, LONG to index, STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WEBRTCPEERCONNECTION_ADD_ICE_CANDIDATE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun close() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCPEERCONNECTION_CLOSE, NIL)
  }

  open fun createDataChannel(label: String, options: Dictionary<Any?, Any?> = Dictionary()):
      WebRTCDataChannel? {
    TransferContext.writeArguments(STRING to label, DICTIONARY to options)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WEBRTCPEERCONNECTION_CREATE_DATA_CHANNEL, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as WebRTCDataChannel?
  }

  open fun createOffer(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCPEERCONNECTION_CREATE_OFFER,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun getConnectionState(): WebRTCPeerConnection.ConnectionState {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WEBRTCPEERCONNECTION_GET_CONNECTION_STATE, LONG)
    return WebRTCPeerConnection.ConnectionState.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun initialize(configuration: Dictionary<Any?, Any?> = Dictionary()): GodotError {
    TransferContext.writeArguments(DICTIONARY to configuration)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCPEERCONNECTION_INITIALIZE,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun poll(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCPEERCONNECTION_POLL, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun setLocalDescription(type: String, sdp: String): GodotError {
    TransferContext.writeArguments(STRING to type, STRING to sdp)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WEBRTCPEERCONNECTION_SET_LOCAL_DESCRIPTION, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun setRemoteDescription(type: String, sdp: String): GodotError {
    TransferContext.writeArguments(STRING to type, STRING to sdp)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WEBRTCPEERCONNECTION_SET_REMOTE_DESCRIPTION, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  enum class ConnectionState(
    id: Long
  ) {
    STATE_NEW(0),

    STATE_CONNECTING(1),

    STATE_CONNECTED(2),

    STATE_DISCONNECTED(3),

    STATE_FAILED(4),

    STATE_CLOSED(5);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val STATE_CLOSED: Long = 5

    final const val STATE_CONNECTED: Long = 2

    final const val STATE_CONNECTING: Long = 1

    final const val STATE_DISCONNECTED: Long = 3

    final const val STATE_FAILED: Long = 4

    final const val STATE_NEW: Long = 0
  }
}
