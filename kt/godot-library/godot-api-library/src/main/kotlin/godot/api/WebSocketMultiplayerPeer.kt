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
import godot.core.Error
import godot.core.PackedStringArray
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_STRING_ARRAY
import godot.core.VariantParser.STRING
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

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
    createNativeObject(848, scriptIndex)
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
    TransferContext.writeArguments(STRING to url, OBJECT to tlsClientOptions)
    TransferContext.callMethod(ptr, MethodBindings.createClientPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
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
    TransferContext.writeArguments(LONG to port.toLong(), STRING to bindAddress, OBJECT to tlsServerOptions)
    TransferContext.callMethod(ptr, MethodBindings.createServerPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the [WebSocketPeer] associated to the given [peerId].
   */
  public final fun getPeer(peerId: Int): WebSocketPeer? {
    TransferContext.writeArguments(LONG to peerId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getPeerPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as WebSocketPeer?)
  }

  /**
   * Returns the IP address of the given peer.
   */
  public final fun getPeerAddress(id: Int): String {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getPeerAddressPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the remote port of the given peer.
   */
  public final fun getPeerPort(id: Int): Int {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getPeerPortPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun getSupportedProtocols(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSupportedProtocolsPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  public final fun setSupportedProtocols(protocols: PackedStringArray): Unit {
    TransferContext.writeArguments(PACKED_STRING_ARRAY to protocols)
    TransferContext.callMethod(ptr, MethodBindings.setSupportedProtocolsPtr, NIL)
  }

  public final fun getHandshakeHeaders(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHandshakeHeadersPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  public final fun setHandshakeHeaders(protocols: PackedStringArray): Unit {
    TransferContext.writeArguments(PACKED_STRING_ARRAY to protocols)
    TransferContext.callMethod(ptr, MethodBindings.setHandshakeHeadersPtr, NIL)
  }

  public final fun getInboundBufferSize(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInboundBufferSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setInboundBufferSize(bufferSize: Int): Unit {
    TransferContext.writeArguments(LONG to bufferSize.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setInboundBufferSizePtr, NIL)
  }

  public final fun getOutboundBufferSize(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOutboundBufferSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setOutboundBufferSize(bufferSize: Int): Unit {
    TransferContext.writeArguments(LONG to bufferSize.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setOutboundBufferSizePtr, NIL)
  }

  public final fun getHandshakeTimeout(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHandshakeTimeoutPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setHandshakeTimeout(timeout: Float): Unit {
    TransferContext.writeArguments(DOUBLE to timeout.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setHandshakeTimeoutPtr, NIL)
  }

  public final fun setMaxQueuedPackets(maxQueuedPackets: Int): Unit {
    TransferContext.writeArguments(LONG to maxQueuedPackets.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setMaxQueuedPacketsPtr, NIL)
  }

  public final fun getMaxQueuedPackets(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMaxQueuedPacketsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public companion object

  public object MethodBindings {
    internal val createClientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketMultiplayerPeer", "create_client", 1966198364)

    internal val createServerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketMultiplayerPeer", "create_server", 2400822951)

    internal val getPeerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketMultiplayerPeer", "get_peer", 1381378851)

    internal val getPeerAddressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketMultiplayerPeer", "get_peer_address", 844755477)

    internal val getPeerPortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketMultiplayerPeer", "get_peer_port", 923996154)

    internal val getSupportedProtocolsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketMultiplayerPeer", "get_supported_protocols", 1139954409)

    internal val setSupportedProtocolsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketMultiplayerPeer", "set_supported_protocols", 4015028928)

    internal val getHandshakeHeadersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketMultiplayerPeer", "get_handshake_headers", 1139954409)

    internal val setHandshakeHeadersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketMultiplayerPeer", "set_handshake_headers", 4015028928)

    internal val getInboundBufferSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketMultiplayerPeer", "get_inbound_buffer_size", 3905245786)

    internal val setInboundBufferSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketMultiplayerPeer", "set_inbound_buffer_size", 1286410249)

    internal val getOutboundBufferSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketMultiplayerPeer", "get_outbound_buffer_size", 3905245786)

    internal val setOutboundBufferSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketMultiplayerPeer", "set_outbound_buffer_size", 1286410249)

    internal val getHandshakeTimeoutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketMultiplayerPeer", "get_handshake_timeout", 1740695150)

    internal val setHandshakeTimeoutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketMultiplayerPeer", "set_handshake_timeout", 373806689)

    internal val setMaxQueuedPacketsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketMultiplayerPeer", "set_max_queued_packets", 1286410249)

    internal val getMaxQueuedPacketsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketMultiplayerPeer", "get_max_queued_packets", 3905245786)
  }
}
