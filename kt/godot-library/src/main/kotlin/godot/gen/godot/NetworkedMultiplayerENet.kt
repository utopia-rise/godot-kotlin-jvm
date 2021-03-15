// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class NetworkedMultiplayerENet : NetworkedMultiplayerPeer() {
  open var alwaysOrdered: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERENET_GET_ALWAYS_ORDERED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERENET_SET_ALWAYS_ORDERED, NIL)
    }

  open var channelCount: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERENET_GET_CHANNEL_COUNT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERENET_SET_CHANNEL_COUNT, NIL)
    }

  open var compressionMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERENET_GET_COMPRESSION_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERENET_SET_COMPRESSION_MODE, NIL)
    }

  open var dtlsVerify: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERENET_GET_DTLS_VERIFY, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERENET_SET_DTLS_VERIFY, NIL)
    }

  open var serverRelay: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERENET_GET_SERVER_RELAY, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERENET_SET_SERVER_RELAY, NIL)
    }

  open var transferChannel: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERENET_GET_TRANSFER_CHANNEL, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERENET_SET_TRANSFER_CHANNEL, NIL)
    }

  open var useDtls: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERENET_GET_USE_DTLS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERENET_SET_USE_DTLS, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_NETWORKEDMULTIPLAYERENET,
        ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun closeConnection(waitUsec: Long = 100) {
    TransferContext.writeArguments(LONG to waitUsec)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERENET_CLOSE_CONNECTION, NIL)
  }

  open fun createClient(
    address: String,
    port: Long,
    inBandwidth: Long = 0,
    outBandwidth: Long = 0,
    clientPort: Long = 0
  ): GodotError {
    TransferContext.writeArguments(STRING to address, LONG to port, LONG to inBandwidth, LONG to
        outBandwidth, LONG to clientPort)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERENET_CREATE_CLIENT, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun createServer(
    port: Long,
    maxClients: Long = 32,
    inBandwidth: Long = 0,
    outBandwidth: Long = 0
  ): GodotError {
    TransferContext.writeArguments(LONG to port, LONG to maxClients, LONG to inBandwidth, LONG to
        outBandwidth)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERENET_CREATE_SERVER, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun disconnectPeer(id: Long, now: Boolean = false) {
    TransferContext.writeArguments(LONG to id, BOOL to now)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERENET_DISCONNECT_PEER, NIL)
  }

  open fun getLastPacketChannel(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERENET_GET_LAST_PACKET_CHANNEL, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getPacketChannel(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERENET_GET_PACKET_CHANNEL, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getPeerAddress(id: Long): String {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERENET_GET_PEER_ADDRESS, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getPeerPort(id: Long): Long {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERENET_GET_PEER_PORT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun setBindIp(ip: String) {
    TransferContext.writeArguments(STRING to ip)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERENET_SET_BIND_IP, NIL)
  }

  open fun setDtlsCertificate(certificate: X509Certificate) {
    TransferContext.writeArguments(OBJECT to certificate)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERENET_SET_DTLS_CERTIFICATE, NIL)
  }

  open fun setDtlsKey(key: CryptoKey) {
    TransferContext.writeArguments(OBJECT to key)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NETWORKEDMULTIPLAYERENET_SET_DTLS_KEY, NIL)
  }

  enum class CompressionMode(
    id: Long
  ) {
    COMPRESS_NONE(0),

    COMPRESS_RANGE_CODER(1),

    COMPRESS_FASTLZ(2),

    COMPRESS_ZLIB(3),

    COMPRESS_ZSTD(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val COMPRESS_FASTLZ: Long = 2

    final const val COMPRESS_NONE: Long = 0

    final const val COMPRESS_RANGE_CODER: Long = 1

    final const val COMPRESS_ZLIB: Long = 3

    final const val COMPRESS_ZSTD: Long = 4
  }
}
