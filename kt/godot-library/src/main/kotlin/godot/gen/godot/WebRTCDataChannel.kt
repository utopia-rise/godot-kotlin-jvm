// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.WebRTCDataChannel
import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class WebRTCDataChannel : PacketPeer() {
  open var writeMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCDATACHANNEL_GET_WRITE_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCDATACHANNEL_SET_WRITE_MODE,
          NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_WEBRTCDATACHANNEL)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun close() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCDATACHANNEL_CLOSE, NIL)
  }

  open fun getId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCDATACHANNEL_GET_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getLabel(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCDATACHANNEL_GET_LABEL, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getMaxPacketLifeTime(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WEBRTCDATACHANNEL_GET_MAX_PACKET_LIFE_TIME, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getMaxRetransmits(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WEBRTCDATACHANNEL_GET_MAX_RETRANSMITS, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getProtocol(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCDATACHANNEL_GET_PROTOCOL,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getReadyState(): WebRTCDataChannel.ChannelState {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCDATACHANNEL_GET_READY_STATE,
        LONG)
    return WebRTCDataChannel.ChannelState.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun isNegotiated(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCDATACHANNEL_IS_NEGOTIATED,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isOrdered(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCDATACHANNEL_IS_ORDERED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun poll(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCDATACHANNEL_POLL, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun wasStringPacket(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCDATACHANNEL_WAS_STRING_PACKET,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  enum class WriteMode(
    id: Long
  ) {
    WRITE_MODE_TEXT(0),

    WRITE_MODE_BINARY(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ChannelState(
    id: Long
  ) {
    STATE_CONNECTING(0),

    STATE_OPEN(1),

    STATE_CLOSING(2),

    STATE_CLOSED(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val STATE_CLOSED: Long = 3

    final const val STATE_CLOSING: Long = 2

    final const val STATE_CONNECTING: Long = 0

    final const val STATE_OPEN: Long = 1

    final const val WRITE_MODE_BINARY: Long = 1

    final const val WRITE_MODE_TEXT: Long = 0
  }
}
