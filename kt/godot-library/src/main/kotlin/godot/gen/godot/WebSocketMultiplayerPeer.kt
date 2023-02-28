// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedStringArray
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class WebSocketMultiplayerPeer : MultiplayerPeer() {
  public var supportedProtocols: PackedStringArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBSOCKETMULTIPLAYERPEER_GET_SUPPORTED_PROTOCOLS,
          PACKED_STRING_ARRAY)
      return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_STRING_ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBSOCKETMULTIPLAYERPEER_SET_SUPPORTED_PROTOCOLS, NIL)
    }

  public var handshakeHeaders: PackedStringArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBSOCKETMULTIPLAYERPEER_GET_HANDSHAKE_HEADERS,
          PACKED_STRING_ARRAY)
      return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_STRING_ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBSOCKETMULTIPLAYERPEER_SET_HANDSHAKE_HEADERS, NIL)
    }

  public var inboundBufferSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBSOCKETMULTIPLAYERPEER_GET_INBOUND_BUFFER_SIZE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBSOCKETMULTIPLAYERPEER_SET_INBOUND_BUFFER_SIZE, NIL)
    }

  public var outboundBufferSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBSOCKETMULTIPLAYERPEER_GET_OUTBOUND_BUFFER_SIZE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBSOCKETMULTIPLAYERPEER_SET_OUTBOUND_BUFFER_SIZE, NIL)
    }

  public var handshakeTimeout: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBSOCKETMULTIPLAYERPEER_GET_HANDSHAKE_TIMEOUT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBSOCKETMULTIPLAYERPEER_SET_HANDSHAKE_TIMEOUT, NIL)
    }

  public var maxQueuedPackets: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBSOCKETMULTIPLAYERPEER_GET_MAX_QUEUED_PACKETS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBSOCKETMULTIPLAYERPEER_SET_MAX_QUEUED_PACKETS, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_WEBSOCKETMULTIPLAYERPEER, scriptIndex)
    return true
  }

  public fun createClient(url: String, tlsClientOptions: TLSOptions? = null): GodotError {
    TransferContext.writeArguments(STRING to url, OBJECT to tlsClientOptions)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WEBSOCKETMULTIPLAYERPEER_CREATE_CLIENT, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public fun createServer(
    port: Long,
    bindAddress: String = "*",
    tlsServerOptions: TLSOptions? = null
  ): GodotError {
    TransferContext.writeArguments(LONG to port, STRING to bindAddress, OBJECT to tlsServerOptions)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WEBSOCKETMULTIPLAYERPEER_CREATE_SERVER, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public fun getPeer(peerId: Long): WebSocketPeer? {
    TransferContext.writeArguments(LONG to peerId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETMULTIPLAYERPEER_GET_PEER,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as WebSocketPeer?
  }

  public fun getPeerAddress(id: Long): String {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WEBSOCKETMULTIPLAYERPEER_GET_PEER_ADDRESS, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  public fun getPeerPort(id: Long): Long {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WEBSOCKETMULTIPLAYERPEER_GET_PEER_PORT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public companion object
}
