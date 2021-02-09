// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.StreamPeerSSL
import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class StreamPeerSSL : StreamPeer() {
  open var blockingHandshake: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STREAMPEERSSL_GET_BLOCKING_HANDSHAKE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STREAMPEERSSL_SET_BLOCKING_HANDSHAKE, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_STREAMPEERSSL)

  open fun acceptStream(
    stream: StreamPeer,
    privateKey: CryptoKey,
    certificate: X509Certificate,
    chain: X509Certificate? = null
  ): GodotError {
    TransferContext.writeArguments(OBJECT to stream, OBJECT to privateKey, OBJECT to certificate,
        OBJECT to chain)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERSSL_ACCEPT_STREAM, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun connectToStream(
    stream: StreamPeer,
    validateCerts: Boolean = false,
    forHostname: String = "",
    validCertificate: X509Certificate? = null
  ): GodotError {
    TransferContext.writeArguments(OBJECT to stream, BOOL to validateCerts, STRING to forHostname,
        OBJECT to validCertificate)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERSSL_CONNECT_TO_STREAM,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun disconnectFromStream() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_STREAMPEERSSL_DISCONNECT_FROM_STREAM, NIL)
  }

  open fun getStatus(): StreamPeerSSL.Status {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERSSL_GET_STATUS, LONG)
    return StreamPeerSSL.Status.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun poll() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERSSL_POLL, NIL)
  }

  enum class Status(
    id: Long
  ) {
    STATUS_DISCONNECTED(0),

    STATUS_HANDSHAKING(1),

    STATUS_CONNECTED(2),

    STATUS_ERROR(3),

    STATUS_ERROR_HOSTNAME_MISMATCH(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val STATUS_CONNECTED: Long = 2

    final const val STATUS_DISCONNECTED: Long = 0

    final const val STATUS_ERROR: Long = 3

    final const val STATUS_ERROR_HOSTNAME_MISMATCH: Long = 4

    final const val STATUS_HANDSHAKING: Long = 1
  }
}
