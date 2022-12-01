// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.StreamPeerSSL
import godot.`annotation`.GodotBaseType
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
import kotlin.Unit

@GodotBaseType
public open class StreamPeerSSL : StreamPeer() {
  public var blockingHandshake: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STREAMPEERSSL_IS_BLOCKING_HANDSHAKE_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STREAMPEERSSL_SET_BLOCKING_HANDSHAKE_ENABLED, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_STREAMPEERSSL, scriptIndex)
    return true
  }

  public fun poll(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERSSL_POLL, NIL)
  }

  public fun acceptStream(
    stream: StreamPeer,
    privateKey: CryptoKey,
    certificate: X509Certificate,
    chain: X509Certificate? = null
  ): GodotError {
    TransferContext.writeArguments(OBJECT to stream, OBJECT to privateKey, OBJECT to certificate, OBJECT to chain)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERSSL_ACCEPT_STREAM, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public fun connectToStream(
    stream: StreamPeer,
    validateCerts: Boolean = false,
    forHostname: String = "",
    validCertificate: X509Certificate? = null
  ): GodotError {
    TransferContext.writeArguments(OBJECT to stream, BOOL to validateCerts, STRING to forHostname, OBJECT to validCertificate)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERSSL_CONNECT_TO_STREAM,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public fun getStatus(): StreamPeerSSL.Status {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERSSL_GET_STATUS, LONG)
    return StreamPeerSSL.Status.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public fun disconnectFromStream(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_STREAMPEERSSL_DISCONNECT_FROM_STREAM, NIL)
  }

  public enum class Status(
    id: Long
  ) {
    STATUS_DISCONNECTED(0),
    STATUS_HANDSHAKING(1),
    STATUS_CONNECTED(2),
    STATUS_ERROR(3),
    STATUS_ERROR_HOSTNAME_MISMATCH(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
