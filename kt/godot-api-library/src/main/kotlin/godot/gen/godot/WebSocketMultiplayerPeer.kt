// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_STRING_ARRAY
import godot.core.VariantParser.STRING
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_WEBSOCKETMULTIPLAYERPEER_INDEX: Int = 825

/**
 * Base class for WebSocket server and client, allowing them to be used as multiplayer peer for the
 * [MultiplayerAPI].
 * **Note:** When exporting to Android, make sure to enable the `INTERNET` permission in the Android
 * export preset before exporting the project or using one-click deploy. Otherwise, network
 * communication of any kind will be blocked by Android.
 */
@GodotBaseType
public open class WebSocketMultiplayerPeer : MultiplayerPeer() {
  /**
   * The supported WebSocket sub-protocols. See [WebSocketPeer.supportedProtocols] for more details.
   */
  public final inline var supportedProtocols: PackedStringArray
    @JvmName("supportedProtocolsProperty")
    get() = getSupportedProtocols()
    @JvmName("supportedProtocolsProperty")
    set(`value`) {
      setSupportedProtocols(value)
    }

  /**
   * The extra headers to use during handshake. See [WebSocketPeer.handshakeHeaders] for more
   * details.
   */
  public final inline var handshakeHeaders: PackedStringArray
    @JvmName("handshakeHeadersProperty")
    get() = getHandshakeHeaders()
    @JvmName("handshakeHeadersProperty")
    set(`value`) {
      setHandshakeHeaders(value)
    }

  /**
   * The inbound buffer size for connected peers. See [WebSocketPeer.inboundBufferSize] for more
   * details.
   */
  public final inline var inboundBufferSize: Int
    @JvmName("inboundBufferSizeProperty")
    get() = getInboundBufferSize()
    @JvmName("inboundBufferSizeProperty")
    set(`value`) {
      setInboundBufferSize(value)
    }

  /**
   * The outbound buffer size for connected peers. See [WebSocketPeer.outboundBufferSize] for more
   * details.
   */
  public final inline var outboundBufferSize: Int
    @JvmName("outboundBufferSizeProperty")
    get() = getOutboundBufferSize()
    @JvmName("outboundBufferSizeProperty")
    set(`value`) {
      setOutboundBufferSize(value)
    }

  /**
   * The maximum time each peer can stay in a connecting state before being dropped.
   */
  public final inline var handshakeTimeout: Float
    @JvmName("handshakeTimeoutProperty")
    get() = getHandshakeTimeout()
    @JvmName("handshakeTimeoutProperty")
    set(`value`) {
      setHandshakeTimeout(value)
    }

  /**
   * The maximum number of queued packets for connected peers. See [WebSocketPeer.maxQueuedPackets]
   * for more details.
   */
  public final inline var maxQueuedPackets: Int
    @JvmName("maxQueuedPacketsProperty")
    get() = getMaxQueuedPackets()
    @JvmName("maxQueuedPacketsProperty")
    set(`value`) {
      setMaxQueuedPackets(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_WEBSOCKETMULTIPLAYERPEER_INDEX, scriptIndex)
  }

  /**
   * Starts a new multiplayer client connecting to the given [url]. TLS certificates will be
   * verified against the hostname when connecting using the `wss://` protocol. You can pass the
   * optional [tlsClientOptions] parameter to customize the trusted certification authorities, or
   * disable the common name verification. See [TLSOptions.client] and [TLSOptions.clientUnsafe].
   * **Note:** It is recommended to specify the scheme part of the URL, i.e. the [url] should start
   * with either `ws://` or `wss://`.
   */
  @JvmOverloads
  public final fun createClient(url: String, tlsClientOptions: TLSOptions? = null): Error {
    Internals.writeArguments(STRING to url, OBJECT to tlsClientOptions)
    Internals.callMethod(rawPtr, MethodBindings.createClientPtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Starts a new multiplayer server listening on the given [port]. You can optionally specify a
   * [bindAddress], and provide valid [tlsServerOptions] to use TLS. See [TLSOptions.server].
   */
  @JvmOverloads
  public final fun createServer(
    port: Int,
    bindAddress: String = "*",
    tlsServerOptions: TLSOptions? = null,
  ): Error {
    Internals.writeArguments(LONG to port.toLong(), STRING to bindAddress, OBJECT to tlsServerOptions)
    Internals.callMethod(rawPtr, MethodBindings.createServerPtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the [WebSocketPeer] associated to the given [peerId].
   */
  public final fun getPeer(peerId: Int): WebSocketPeer? {
    Internals.writeArguments(LONG to peerId.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getPeerPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as WebSocketPeer?)
  }

  /**
   * Returns the IP address of the given peer.
   */
  public final fun getPeerAddress(id: Int): String {
    Internals.writeArguments(LONG to id.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getPeerAddressPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns the remote port of the given peer.
   */
  public final fun getPeerPort(id: Int): Int {
    Internals.writeArguments(LONG to id.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getPeerPortPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
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

  public final fun getHandshakeTimeout(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getHandshakeTimeoutPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setHandshakeTimeout(timeout: Float): Unit {
    Internals.writeArguments(DOUBLE to timeout.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setHandshakeTimeoutPtr, NIL)
  }

  public final fun setMaxQueuedPackets(maxQueuedPackets: Int): Unit {
    Internals.writeArguments(LONG to maxQueuedPackets.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setMaxQueuedPacketsPtr, NIL)
  }

  public final fun getMaxQueuedPackets(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMaxQueuedPacketsPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public companion object

  public object MethodBindings {
    internal val createClientPtr: VoidPtr =
        Internals.getMethodBindPtr("WebSocketMultiplayerPeer", "create_client", 1966198364)

    internal val createServerPtr: VoidPtr =
        Internals.getMethodBindPtr("WebSocketMultiplayerPeer", "create_server", 2400822951)

    internal val getPeerPtr: VoidPtr =
        Internals.getMethodBindPtr("WebSocketMultiplayerPeer", "get_peer", 1381378851)

    internal val getPeerAddressPtr: VoidPtr =
        Internals.getMethodBindPtr("WebSocketMultiplayerPeer", "get_peer_address", 844755477)

    internal val getPeerPortPtr: VoidPtr =
        Internals.getMethodBindPtr("WebSocketMultiplayerPeer", "get_peer_port", 923996154)

    internal val getSupportedProtocolsPtr: VoidPtr =
        Internals.getMethodBindPtr("WebSocketMultiplayerPeer", "get_supported_protocols", 1139954409)

    internal val setSupportedProtocolsPtr: VoidPtr =
        Internals.getMethodBindPtr("WebSocketMultiplayerPeer", "set_supported_protocols", 4015028928)

    internal val getHandshakeHeadersPtr: VoidPtr =
        Internals.getMethodBindPtr("WebSocketMultiplayerPeer", "get_handshake_headers", 1139954409)

    internal val setHandshakeHeadersPtr: VoidPtr =
        Internals.getMethodBindPtr("WebSocketMultiplayerPeer", "set_handshake_headers", 4015028928)

    internal val getInboundBufferSizePtr: VoidPtr =
        Internals.getMethodBindPtr("WebSocketMultiplayerPeer", "get_inbound_buffer_size", 3905245786)

    internal val setInboundBufferSizePtr: VoidPtr =
        Internals.getMethodBindPtr("WebSocketMultiplayerPeer", "set_inbound_buffer_size", 1286410249)

    internal val getOutboundBufferSizePtr: VoidPtr =
        Internals.getMethodBindPtr("WebSocketMultiplayerPeer", "get_outbound_buffer_size", 3905245786)

    internal val setOutboundBufferSizePtr: VoidPtr =
        Internals.getMethodBindPtr("WebSocketMultiplayerPeer", "set_outbound_buffer_size", 1286410249)

    internal val getHandshakeTimeoutPtr: VoidPtr =
        Internals.getMethodBindPtr("WebSocketMultiplayerPeer", "get_handshake_timeout", 1740695150)

    internal val setHandshakeTimeoutPtr: VoidPtr =
        Internals.getMethodBindPtr("WebSocketMultiplayerPeer", "set_handshake_timeout", 373806689)

    internal val setMaxQueuedPacketsPtr: VoidPtr =
        Internals.getMethodBindPtr("WebSocketMultiplayerPeer", "set_max_queued_packets", 1286410249)

    internal val getMaxQueuedPacketsPtr: VoidPtr =
        Internals.getMethodBindPtr("WebSocketMultiplayerPeer", "get_max_queued_packets", 3905245786)
  }
}
