// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedStringArray
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class WebSocketMultiplayerPeer : MultiplayerPeer() {
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

  public var handshakeTimeout: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHandshakeTimeoutPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setHandshakeTimeoutPtr, NIL)
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
    callConstructor(ENGINECLASS_WEBSOCKETMULTIPLAYERPEER, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun createClient(url: String, tlsClientOptions: TLSOptions? = null): GodotError {
    TransferContext.writeArguments(STRING to url, OBJECT to tlsClientOptions)
    TransferContext.callMethod(rawPtr, MethodBindings.createClientPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun createServer(
    port: Int,
    bindAddress: String = "*",
    tlsServerOptions: TLSOptions? = null,
  ): GodotError {
    TransferContext.writeArguments(LONG to port.toLong(), STRING to bindAddress, OBJECT to tlsServerOptions)
    TransferContext.callMethod(rawPtr, MethodBindings.createServerPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getPeer(peerId: Int): WebSocketPeer? {
    TransferContext.writeArguments(LONG to peerId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPeerPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as WebSocketPeer?)
  }

  public fun getPeerAddress(id: Int): String {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPeerAddressPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun getPeerPort(id: Int): Int {
    TransferContext.writeArguments(LONG to id.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPeerPortPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val createClientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketMultiplayerPeer", "create_client")

    public val createServerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketMultiplayerPeer", "create_server")

    public val getPeerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketMultiplayerPeer", "get_peer")

    public val getPeerAddressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketMultiplayerPeer", "get_peer_address")

    public val getPeerPortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketMultiplayerPeer", "get_peer_port")

    public val getSupportedProtocolsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketMultiplayerPeer", "get_supported_protocols")

    public val setSupportedProtocolsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketMultiplayerPeer", "set_supported_protocols")

    public val getHandshakeHeadersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketMultiplayerPeer", "get_handshake_headers")

    public val setHandshakeHeadersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketMultiplayerPeer", "set_handshake_headers")

    public val getInboundBufferSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketMultiplayerPeer", "get_inbound_buffer_size")

    public val setInboundBufferSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketMultiplayerPeer", "set_inbound_buffer_size")

    public val getOutboundBufferSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketMultiplayerPeer", "get_outbound_buffer_size")

    public val setOutboundBufferSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketMultiplayerPeer", "set_outbound_buffer_size")

    public val getHandshakeTimeoutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketMultiplayerPeer", "get_handshake_timeout")

    public val setHandshakeTimeoutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketMultiplayerPeer", "set_handshake_timeout")

    public val setMaxQueuedPacketsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketMultiplayerPeer", "set_max_queued_packets")

    public val getMaxQueuedPacketsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebSocketMultiplayerPeer", "get_max_queued_packets")
  }
}
