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
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
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
      TransferContext.callMethod(rawPtr, MethodBindings.getSupportedProtocolsPtr,
          PACKED_STRING_ARRAY)
      return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_STRING_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSupportedProtocolsPtr, NIL)
    }

  public var handshakeHeaders: PackedStringArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHandshakeHeadersPtr, PACKED_STRING_ARRAY)
      return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_STRING_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setHandshakeHeadersPtr, NIL)
    }

  public var inboundBufferSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getInboundBufferSizePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setInboundBufferSizePtr, NIL)
    }

  public var outboundBufferSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOutboundBufferSizePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setOutboundBufferSizePtr, NIL)
    }

  public var maxQueuedPackets: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxQueuedPacketsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxQueuedPacketsPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_WEBSOCKETPEER, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun connectToUrl(url: String, tlsClientOptions: TLSOptions? = null): GodotError {
    TransferContext.writeArguments(STRING to url, OBJECT to tlsClientOptions)
    TransferContext.callMethod(rawPtr, MethodBindings.connectToUrlPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun acceptStream(stream: StreamPeer): GodotError {
    TransferContext.writeArguments(OBJECT to stream)
    TransferContext.callMethod(rawPtr, MethodBindings.acceptStreamPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun send(message: PackedByteArray, writeMode: WriteMode =
      WebSocketPeer.WriteMode.WRITE_MODE_BINARY): GodotError {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to message, LONG to writeMode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.sendPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun sendText(message: String): GodotError {
    TransferContext.writeArguments(STRING to message)
    TransferContext.callMethod(rawPtr, MethodBindings.sendTextPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun wasStringPacket(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.wasStringPacketPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun poll(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pollPtr, NIL)
  }

  @JvmOverloads
  public fun close(code: Int = 1000, reason: String = ""): Unit {
    TransferContext.writeArguments(LONG to code.toLong(), STRING to reason)
    TransferContext.callMethod(rawPtr, MethodBindings.closePtr, NIL)
  }

  public fun getConnectedHost(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectedHostPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getConnectedPort(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectedPortPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getSelectedProtocol(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectedProtocolPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getRequestedUrl(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRequestedUrlPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun setNoDelay(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setNoDelayPtr, NIL)
  }

  public fun getCurrentOutboundBufferedAmount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCurrentOutboundBufferedAmountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getReadyState(): State {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getReadyStatePtr, LONG)
    return WebSocketPeer.State.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getCloseCode(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCloseCodePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getCloseReason(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCloseReasonPtr, STRING)
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

  internal object MethodBindings {
    public val connectToUrlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketPeer", "connect_to_url")

    public val acceptStreamPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketPeer", "accept_stream")

    public val sendPtr: VoidPtr = TypeManager.getMethodBindPtr("WebSocketPeer", "send")

    public val sendTextPtr: VoidPtr = TypeManager.getMethodBindPtr("WebSocketPeer", "send_text")

    public val wasStringPacketPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketPeer", "was_string_packet")

    public val pollPtr: VoidPtr = TypeManager.getMethodBindPtr("WebSocketPeer", "poll")

    public val closePtr: VoidPtr = TypeManager.getMethodBindPtr("WebSocketPeer", "close")

    public val getConnectedHostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketPeer", "get_connected_host")

    public val getConnectedPortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketPeer", "get_connected_port")

    public val getSelectedProtocolPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketPeer", "get_selected_protocol")

    public val getRequestedUrlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketPeer", "get_requested_url")

    public val setNoDelayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketPeer", "set_no_delay")

    public val getCurrentOutboundBufferedAmountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketPeer", "get_current_outbound_buffered_amount")

    public val getReadyStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketPeer", "get_ready_state")

    public val getCloseCodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketPeer", "get_close_code")

    public val getCloseReasonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketPeer", "get_close_reason")

    public val getSupportedProtocolsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketPeer", "get_supported_protocols")

    public val setSupportedProtocolsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketPeer", "set_supported_protocols")

    public val getHandshakeHeadersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketPeer", "get_handshake_headers")

    public val setHandshakeHeadersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketPeer", "set_handshake_headers")

    public val getInboundBufferSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketPeer", "get_inbound_buffer_size")

    public val setInboundBufferSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketPeer", "set_inbound_buffer_size")

    public val getOutboundBufferSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketPeer", "get_outbound_buffer_size")

    public val setOutboundBufferSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketPeer", "set_outbound_buffer_size")

    public val setMaxQueuedPacketsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketPeer", "set_max_queued_packets")

    public val getMaxQueuedPacketsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketPeer", "get_max_queued_packets")
  }
}
