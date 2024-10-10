// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedByteArray
import godot.core.PackedStringArray
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_BYTE_ARRAY
import godot.core.VariantParser.PACKED_STRING_ARRAY
import godot.core.VariantParser.STRING
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_WEBSOCKETPEER_INDEX: Int = 740

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
  public final inline var supportedProtocols: PackedStringArray
    @JvmName("supportedProtocolsProperty")
    get() = getSupportedProtocols()
    @JvmName("supportedProtocolsProperty")
    set(`value`) {
      setSupportedProtocols(value)
    }

  /**
   * The extra HTTP headers to be sent during the WebSocket handshake.
   * **Note:** Not supported in Web exports due to browsers' restrictions.
   */
  public final inline var handshakeHeaders: PackedStringArray
    @JvmName("handshakeHeadersProperty")
    get() = getHandshakeHeaders()
    @JvmName("handshakeHeadersProperty")
    set(`value`) {
      setHandshakeHeaders(value)
    }

  /**
   * The size of the input buffer in bytes (roughly the maximum amount of memory that will be
   * allocated for the inbound packets).
   */
  public final inline var inboundBufferSize: Int
    @JvmName("inboundBufferSizeProperty")
    get() = getInboundBufferSize()
    @JvmName("inboundBufferSizeProperty")
    set(`value`) {
      setInboundBufferSize(value)
    }

  /**
   * The size of the input buffer in bytes (roughly the maximum amount of memory that will be
   * allocated for the outbound packets).
   */
  public final inline var outboundBufferSize: Int
    @JvmName("outboundBufferSizeProperty")
    get() = getOutboundBufferSize()
    @JvmName("outboundBufferSizeProperty")
    set(`value`) {
      setOutboundBufferSize(value)
    }

  /**
   * The maximum amount of packets that will be allowed in the queues (both inbound and outbound).
   */
  public final inline var maxQueuedPackets: Int
    @JvmName("maxQueuedPacketsProperty")
    get() = getMaxQueuedPackets()
    @JvmName("maxQueuedPacketsProperty")
    set(`value`) {
      setMaxQueuedPackets(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_WEBSOCKETPEER_INDEX, scriptIndex)
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
  public final fun connectToUrl(url: String, tlsClientOptions: TLSOptions? = null): Error {
    Internals.writeArguments(STRING to url, OBJECT to tlsClientOptions)
    Internals.callMethod(rawPtr, MethodBindings.connectToUrlPtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Accepts a peer connection performing the HTTP handshake as a WebSocket server. The [stream]
   * must be a valid TCP stream retrieved via [TCPServer.takeConnection], or a TLS stream accepted via
   * [StreamPeerTLS.acceptStream].
   * **Note:** Not supported in Web exports due to browsers' restrictions.
   */
  public final fun acceptStream(stream: StreamPeer?): Error {
    Internals.writeArguments(OBJECT to stream)
    Internals.callMethod(rawPtr, MethodBindings.acceptStreamPtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Sends the given [message] using the desired [writeMode]. When sending a [String], prefer using
   * [sendText].
   */
  @JvmOverloads
  public final fun send(message: PackedByteArray, writeMode: WriteMode =
      WebSocketPeer.WriteMode.WRITE_MODE_BINARY): Error {
    Internals.writeArguments(PACKED_BYTE_ARRAY to message, LONG to writeMode.id)
    Internals.callMethod(rawPtr, MethodBindings.sendPtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Sends the given [message] using WebSocket text mode. Prefer this method over
   * [PacketPeer.putPacket] when interacting with third-party text-based API (e.g. when using [JSON]
   * formatted messages).
   */
  public final fun sendText(message: String): Error {
    Internals.writeArguments(STRING to message)
    Internals.callMethod(rawPtr, MethodBindings.sendTextPtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if the last received packet was sent as a text payload. See [WriteMode].
   */
  public final fun wasStringPacket(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.wasStringPacketPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Updates the connection state and receive incoming packets. Call this function regularly to keep
   * it in a clean state.
   */
  public final fun poll(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.pollPtr, NIL)
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
  public final fun close(code: Int = 1000, reason: String = ""): Unit {
    Internals.writeArguments(LONG to code.toLong(), STRING to reason)
    Internals.callMethod(rawPtr, MethodBindings.closePtr, NIL)
  }

  /**
   * Returns the IP address of the connected peer.
   * **Note:** Not available in the Web export.
   */
  public final fun getConnectedHost(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getConnectedHostPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns the remote port of the connected peer.
   * **Note:** Not available in the Web export.
   */
  public final fun getConnectedPort(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getConnectedPortPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the selected WebSocket sub-protocol for this connection or an empty string if the
   * sub-protocol has not been selected yet.
   */
  public final fun getSelectedProtocol(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSelectedProtocolPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns the URL requested by this peer. The URL is derived from the `url` passed to
   * [connectToUrl] or from the HTTP headers when acting as server (i.e. when using [acceptStream]).
   */
  public final fun getRequestedUrl(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRequestedUrlPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Disable Nagle's algorithm on the underlying TCP socket (default). See
   * [StreamPeerTCP.setNoDelay] for more information.
   * **Note:** Not available in the Web export.
   */
  public final fun setNoDelay(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setNoDelayPtr, NIL)
  }

  /**
   * Returns the current amount of data in the outbound websocket buffer. **Note:** Web exports use
   * WebSocket.bufferedAmount, while other platforms use an internal buffer.
   */
  public final fun getCurrentOutboundBufferedAmount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCurrentOutboundBufferedAmountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the ready state of the connection. See [State].
   */
  public final fun getReadyState(): State {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getReadyStatePtr, LONG)
    return WebSocketPeer.State.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the received WebSocket close frame status code, or `-1` when the connection was not
   * cleanly closed. Only call this method when [getReadyState] returns [STATE_CLOSED].
   */
  public final fun getCloseCode(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCloseCodePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the received WebSocket close frame status reason string. Only call this method when
   * [getReadyState] returns [STATE_CLOSED].
   */
  public final fun getCloseReason(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCloseReasonPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public final fun getSupportedProtocols(): PackedStringArray {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSupportedProtocolsPtr, PACKED_STRING_ARRAY)
    return (Internals.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  public final fun setSupportedProtocols(protocols: PackedStringArray): Unit {
    Internals.writeArguments(PACKED_STRING_ARRAY to protocols)
    Internals.callMethod(rawPtr, MethodBindings.setSupportedProtocolsPtr, NIL)
  }

  public final fun getHandshakeHeaders(): PackedStringArray {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getHandshakeHeadersPtr, PACKED_STRING_ARRAY)
    return (Internals.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  public final fun setHandshakeHeaders(protocols: PackedStringArray): Unit {
    Internals.writeArguments(PACKED_STRING_ARRAY to protocols)
    Internals.callMethod(rawPtr, MethodBindings.setHandshakeHeadersPtr, NIL)
  }

  public final fun getInboundBufferSize(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getInboundBufferSizePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setInboundBufferSize(bufferSize: Int): Unit {
    Internals.writeArguments(LONG to bufferSize.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setInboundBufferSizePtr, NIL)
  }

  public final fun getOutboundBufferSize(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getOutboundBufferSizePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setOutboundBufferSize(bufferSize: Int): Unit {
    Internals.writeArguments(LONG to bufferSize.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setOutboundBufferSizePtr, NIL)
  }

  public final fun setMaxQueuedPackets(bufferSize: Int): Unit {
    Internals.writeArguments(LONG to bufferSize.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setMaxQueuedPacketsPtr, NIL)
  }

  public final fun getMaxQueuedPackets(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMaxQueuedPacketsPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
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
      public fun from(`value`: Long): WriteMode = entries.single { it.id == `value` }
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
      public fun from(`value`: Long): State = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val connectToUrlPtr: VoidPtr =
        Internals.getMethodBindPtr("WebSocketPeer", "connect_to_url", 1966198364)

    public val acceptStreamPtr: VoidPtr =
        Internals.getMethodBindPtr("WebSocketPeer", "accept_stream", 255125695)

    public val sendPtr: VoidPtr = Internals.getMethodBindPtr("WebSocketPeer", "send", 2780360567)

    public val sendTextPtr: VoidPtr =
        Internals.getMethodBindPtr("WebSocketPeer", "send_text", 166001499)

    public val wasStringPacketPtr: VoidPtr =
        Internals.getMethodBindPtr("WebSocketPeer", "was_string_packet", 36873697)

    public val pollPtr: VoidPtr = Internals.getMethodBindPtr("WebSocketPeer", "poll", 3218959716)

    public val closePtr: VoidPtr = Internals.getMethodBindPtr("WebSocketPeer", "close", 1047156615)

    public val getConnectedHostPtr: VoidPtr =
        Internals.getMethodBindPtr("WebSocketPeer", "get_connected_host", 201670096)

    public val getConnectedPortPtr: VoidPtr =
        Internals.getMethodBindPtr("WebSocketPeer", "get_connected_port", 3905245786)

    public val getSelectedProtocolPtr: VoidPtr =
        Internals.getMethodBindPtr("WebSocketPeer", "get_selected_protocol", 201670096)

    public val getRequestedUrlPtr: VoidPtr =
        Internals.getMethodBindPtr("WebSocketPeer", "get_requested_url", 201670096)

    public val setNoDelayPtr: VoidPtr =
        Internals.getMethodBindPtr("WebSocketPeer", "set_no_delay", 2586408642)

    public val getCurrentOutboundBufferedAmountPtr: VoidPtr =
        Internals.getMethodBindPtr("WebSocketPeer", "get_current_outbound_buffered_amount", 3905245786)

    public val getReadyStatePtr: VoidPtr =
        Internals.getMethodBindPtr("WebSocketPeer", "get_ready_state", 346482985)

    public val getCloseCodePtr: VoidPtr =
        Internals.getMethodBindPtr("WebSocketPeer", "get_close_code", 3905245786)

    public val getCloseReasonPtr: VoidPtr =
        Internals.getMethodBindPtr("WebSocketPeer", "get_close_reason", 201670096)

    public val getSupportedProtocolsPtr: VoidPtr =
        Internals.getMethodBindPtr("WebSocketPeer", "get_supported_protocols", 1139954409)

    public val setSupportedProtocolsPtr: VoidPtr =
        Internals.getMethodBindPtr("WebSocketPeer", "set_supported_protocols", 4015028928)

    public val getHandshakeHeadersPtr: VoidPtr =
        Internals.getMethodBindPtr("WebSocketPeer", "get_handshake_headers", 1139954409)

    public val setHandshakeHeadersPtr: VoidPtr =
        Internals.getMethodBindPtr("WebSocketPeer", "set_handshake_headers", 4015028928)

    public val getInboundBufferSizePtr: VoidPtr =
        Internals.getMethodBindPtr("WebSocketPeer", "get_inbound_buffer_size", 3905245786)

    public val setInboundBufferSizePtr: VoidPtr =
        Internals.getMethodBindPtr("WebSocketPeer", "set_inbound_buffer_size", 1286410249)

    public val getOutboundBufferSizePtr: VoidPtr =
        Internals.getMethodBindPtr("WebSocketPeer", "get_outbound_buffer_size", 3905245786)

    public val setOutboundBufferSizePtr: VoidPtr =
        Internals.getMethodBindPtr("WebSocketPeer", "set_outbound_buffer_size", 1286410249)

    public val setMaxQueuedPacketsPtr: VoidPtr =
        Internals.getMethodBindPtr("WebSocketPeer", "set_max_queued_packets", 1286410249)

    public val getMaxQueuedPacketsPtr: VoidPtr =
        Internals.getMethodBindPtr("WebSocketPeer", "get_max_queued_packets", 3905245786)
  }
}
