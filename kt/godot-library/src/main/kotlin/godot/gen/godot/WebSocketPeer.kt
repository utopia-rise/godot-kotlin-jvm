// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.PackedStringArray
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class WebSocketPeer : PacketPeer() {
  public var supportedProtocols: PackedStringArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBSOCKETPEER_GET_SUPPORTED_PROTOCOLS, PACKED_STRING_ARRAY)
      return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_STRING_ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBSOCKETPEER_SET_SUPPORTED_PROTOCOLS, NIL)
    }

  public var handshakeHeaders: PackedStringArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBSOCKETPEER_GET_HANDSHAKE_HEADERS, PACKED_STRING_ARRAY)
      return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_STRING_ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBSOCKETPEER_SET_HANDSHAKE_HEADERS, NIL)
    }

  public var inboundBufferSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBSOCKETPEER_GET_INBOUND_BUFFER_SIZE, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBSOCKETPEER_SET_INBOUND_BUFFER_SIZE, NIL)
    }

  public var outboundBufferSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBSOCKETPEER_GET_OUTBOUND_BUFFER_SIZE, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBSOCKETPEER_SET_OUTBOUND_BUFFER_SIZE, NIL)
    }

  public var maxQueuedPackets: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBSOCKETPEER_GET_MAX_QUEUED_PACKETS, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBSOCKETPEER_SET_MAX_QUEUED_PACKETS, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_WEBSOCKETPEER, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun connectToUrl(url: String, tlsClientOptions: TLSOptions? = null): GodotError {
    TransferContext.writeArguments(STRING to url, OBJECT to tlsClientOptions)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETPEER_CONNECT_TO_URL, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun acceptStream(stream: StreamPeer): GodotError {
    TransferContext.writeArguments(OBJECT to stream)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETPEER_ACCEPT_STREAM, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun send(message: PackedByteArray, writeMode: WriteMode =
      WebSocketPeer.WriteMode.WRITE_MODE_BINARY): GodotError {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to message, LONG to writeMode.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETPEER_SEND, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun sendText(message: String): GodotError {
    TransferContext.writeArguments(STRING to message)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETPEER_SEND_TEXT, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun wasStringPacket(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETPEER_WAS_STRING_PACKET,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun poll(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETPEER_POLL, NIL)
  }

  @JvmOverloads
  public fun close(code: Int = 1000, reason: String = ""): Unit {
    TransferContext.writeArguments(LONG to code.toLong(), STRING to reason)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETPEER_CLOSE, NIL)
  }

  public fun getConnectedHost(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETPEER_GET_CONNECTED_HOST,
        STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getConnectedPort(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETPEER_GET_CONNECTED_PORT,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getSelectedProtocol(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETPEER_GET_SELECTED_PROTOCOL,
        STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getRequestedUrl(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETPEER_GET_REQUESTED_URL,
        STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun setNoDelay(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETPEER_SET_NO_DELAY, NIL)
  }

  public fun getCurrentOutboundBufferedAmount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WEBSOCKETPEER_GET_CURRENT_OUTBOUND_BUFFERED_AMOUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getReadyState(): State {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETPEER_GET_READY_STATE, LONG)
    return WebSocketPeer.State.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getCloseCode(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETPEER_GET_CLOSE_CODE, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getCloseReason(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETPEER_GET_CLOSE_REASON,
        STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public enum class WriteMode(
    id: Long,
  ) {
    WRITE_MODE_TEXT(0),
    WRITE_MODE_BINARY(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class State(
    id: Long,
  ) {
    STATE_CONNECTING(0),
    STATE_OPEN(1),
    STATE_CLOSING(2),
    STATE_CLOSED(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object
}
