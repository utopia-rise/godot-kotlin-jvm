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

/**
 * This class represents WebSocket connection, and can be used as a WebSocket client (RFC
 * 6455-compliant) or as a remote peer of a WebSocket server.
 * You can send WebSocket binary frames using [PacketPeer.putPacket], and WebSocket text frames
 * using [send] (prefer text frames when interacting with text-based API). You can check the frame type
 * of the last packet via [wasStringPacket].
 * To start a WebSocket client, first call [connectToUrl], then regularly call [poll] (e.g. during
 * [Node] process). You can query the socket state via [getReadyState], get the number of pending
 * packets using [PacketPeer.getAvailablePacketCount], and retrieve them via [PacketPeer.getPacket].
 *
 * gdscript:
 * ```gdscript
 * extends Node
 *
 * var socket = WebSocketPeer.new()
 *
 * func _ready():
 *     socket.connect_to_url("wss://example.com")
 *
 * func _process(delta):
 *     socket.poll()
 *     var state = socket.get_ready_state()
 *     if state == WebSocketPeer.STATE_OPEN:
 *         while socket.get_available_packet_count():
 *             print("Packet: ", socket.get_packet())
 *     elif state == WebSocketPeer.STATE_CLOSING:
 *         # Keep polling to achieve proper close.
 *         pass
 *     elif state == WebSocketPeer.STATE_CLOSED:
 *         var code = socket.get_close_code()
 *         var reason = socket.get_close_reason()
 *         print("WebSocket closed with code: &#37;d, reason &#37;s. Clean: &#37;s" &#37; [code,
 * reason, code != -1])
 *         set_process(false) # Stop processing.
 * ```
 *
 * To use the peer as part of a WebSocket server refer to [acceptStream] and the online tutorial.
 */
@GodotBaseType
public open class WebSocketPeer : PacketPeer() {
  /**
   * The WebSocket sub-protocols allowed during the WebSocket handshake.
   */
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

  /**
   * The extra HTTP headers to be sent during the WebSocket handshake.
   * **Note:** Not supported in Web exports due to browsers' restrictions.
   */
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

  /**
   * The size of the input buffer in bytes (roughly the maximum amount of memory that will be
   * allocated for the inbound packets).
   */
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

  /**
   * The size of the input buffer in bytes (roughly the maximum amount of memory that will be
   * allocated for the outbound packets).
   */
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

  /**
   * The maximum amount of packets that will be allowed in the queues (both inbound and outbound).
   */
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

  /**
   * Connects to the given URL. TLS certificates will be verified against the hostname when
   * connecting using the `wss://` protocol. You can pass the optional [tlsClientOptions] parameter to
   * customize the trusted certification authorities, or disable the common name verification. See
   * [TLSOptions.client] and [TLSOptions.clientUnsafe].
   * **Note:** To avoid mixed content warnings or errors in Web, you may have to use a [url] that
   * starts with `wss://` (secure) instead of `ws://`. When doing so, make sure to use the fully
   * qualified domain name that matches the one defined in the server's TLS certificate. Do not connect
   * directly via the IP address for `wss://` connections, as it won't match with the TLS certificate.
   */
  @JvmOverloads
  public fun connectToUrl(url: String, tlsClientOptions: TLSOptions? = null): GodotError {
    TransferContext.writeArguments(STRING to url, OBJECT to tlsClientOptions)
    TransferContext.callMethod(rawPtr, MethodBindings.connectToUrlPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Accepts a peer connection performing the HTTP handshake as a WebSocket server. The [stream]
   * must be a valid TCP stream retrieved via [TCPServer.takeConnection], or a TLS stream accepted via
   * [StreamPeerTLS.acceptStream].
   * **Note:** Not supported in Web exports due to browsers' restrictions.
   */
  public fun acceptStream(stream: StreamPeer): GodotError {
    TransferContext.writeArguments(OBJECT to stream)
    TransferContext.callMethod(rawPtr, MethodBindings.acceptStreamPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sends the given [message] using the desired [writeMode]. When sending a [String], prefer using
   * [sendText].
   */
  @JvmOverloads
  public fun send(message: PackedByteArray, writeMode: WriteMode =
      WebSocketPeer.WriteMode.WRITE_MODE_BINARY): GodotError {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to message, LONG to writeMode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.sendPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sends the given [message] using WebSocket text mode. Prefer this method over
   * [PacketPeer.putPacket] when interacting with third-party text-based API (e.g. when using [JSON]
   * formatted messages).
   */
  public fun sendText(message: String): GodotError {
    TransferContext.writeArguments(STRING to message)
    TransferContext.callMethod(rawPtr, MethodBindings.sendTextPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if the last received packet was sent as a text payload. See [WriteMode].
   */
  public fun wasStringPacket(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.wasStringPacketPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Updates the connection state and receive incoming packets. Call this function regularly to keep
   * it in a clean state.
   */
  public fun poll(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pollPtr, NIL)
  }

  /**
   * Closes this WebSocket connection. [code] is the status code for the closure (see RFC 6455
   * section 7.4 for a list of valid status codes). [reason] is the human readable reason for closing
   * the connection (can be any UTF-8 string that's smaller than 123 bytes). If [code] is negative, the
   * connection will be closed immediately without notifying the remote peer.
   * **Note:** To achieve a clean close, you will need to keep polling until [STATE_CLOSED] is
   * reached.
   * **Note:** The Web export might not support all status codes. Please refer to browser-specific
   * documentation for more details.
   */
  @JvmOverloads
  public fun close(code: Int = 1000, reason: String = ""): Unit {
    TransferContext.writeArguments(LONG to code.toLong(), STRING to reason)
    TransferContext.callMethod(rawPtr, MethodBindings.closePtr, NIL)
  }

  /**
   * Returns the IP address of the connected peer.
   * **Note:** Not available in the Web export.
   */
  public fun getConnectedHost(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectedHostPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the remote port of the connected peer.
   * **Note:** Not available in the Web export.
   */
  public fun getConnectedPort(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectedPortPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the selected WebSocket sub-protocol for this connection or an empty string if the
   * sub-protocol has not been selected yet.
   */
  public fun getSelectedProtocol(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectedProtocolPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the URL requested by this peer. The URL is derived from the `url` passed to
   * [connectToUrl] or from the HTTP headers when acting as server (i.e. when using [acceptStream]).
   */
  public fun getRequestedUrl(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRequestedUrlPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Disable Nagle's algorithm on the underlying TCP socket (default). See
   * [StreamPeerTCP.setNoDelay] for more information.
   * **Note:** Not available in the Web export.
   */
  public fun setNoDelay(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setNoDelayPtr, NIL)
  }

  /**
   * Returns the current amount of data in the outbound websocket buffer. **Note:** Web exports use
   * WebSocket.bufferedAmount, while other platforms use an internal buffer.
   */
  public fun getCurrentOutboundBufferedAmount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCurrentOutboundBufferedAmountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the ready state of the connection. See [State].
   */
  public fun getReadyState(): State {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getReadyStatePtr, LONG)
    return WebSocketPeer.State.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the received WebSocket close frame status code, or `-1` when the connection was not
   * cleanly closed. Only call this method when [getReadyState] returns [STATE_CLOSED].
   */
  public fun getCloseCode(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCloseCodePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the received WebSocket close frame status reason string. Only call this method when
   * [getReadyState] returns [STATE_CLOSED].
   */
  public fun getCloseReason(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCloseReasonPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public enum class WriteMode(
    id: Long,
  ) {
    /**
     * Specifies that WebSockets messages should be transferred as text payload (only valid UTF-8 is
     * allowed).
     */
    WRITE_MODE_TEXT(0),
    /**
     * Specifies that WebSockets messages should be transferred as binary payload (any byte
     * combination is allowed).
     */
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
    /**
     * Socket has been created. The connection is not yet open.
     */
    STATE_CONNECTING(0),
    /**
     * The connection is open and ready to communicate.
     */
    STATE_OPEN(1),
    /**
     * The connection is in the process of closing. This means a close request has been sent to the
     * remote peer but confirmation has not been received.
     */
    STATE_CLOSING(2),
    /**
     * The connection is closed or couldn't be opened.
     */
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
