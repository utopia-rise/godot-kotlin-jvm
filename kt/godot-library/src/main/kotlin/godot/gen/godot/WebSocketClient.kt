// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedStringArray
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class WebSocketClient : WebSocketMultiplayerPeer() {
  public val serverCloseRequest: Signal2<Long, String> by signal("code", "reason")

  public val connectionEstablished: Signal1<String> by signal("protocol")

  public val dataReceived: Signal0 by signal()

  public val connectionError: Signal0 by signal()

  public val connectionClosed: Signal1<Boolean> by signal("wasCleanClose")

  public var verifySsl: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBSOCKETCLIENT_IS_VERIFY_SSL_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBSOCKETCLIENT_SET_VERIFY_SSL_ENABLED, NIL)
    }

  public var trustedSslCertificate: X509Certificate?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBSOCKETCLIENT_GET_TRUSTED_SSL_CERTIFICATE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as X509Certificate?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBSOCKETCLIENT_SET_TRUSTED_SSL_CERTIFICATE, NIL)
    }

  public override fun __new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_WEBSOCKETCLIENT, scriptIndex)
  }

  public fun connectToUrl(
    url: String,
    protocols: PackedStringArray = PackedStringArray(),
    gdMpApi: Boolean = false,
    customHeaders: PackedStringArray = PackedStringArray()
  ): GodotError {
    TransferContext.writeArguments(STRING to url, PACKED_STRING_ARRAY to protocols, BOOL to gdMpApi, PACKED_STRING_ARRAY to customHeaders)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETCLIENT_CONNECT_TO_URL,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public fun disconnectFromHost(code: Long = 1000, reason: String = ""): Unit {
    TransferContext.writeArguments(LONG to code, STRING to reason)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WEBSOCKETCLIENT_DISCONNECT_FROM_HOST, NIL)
  }

  public fun getConnectedHost(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETCLIENT_GET_CONNECTED_HOST,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  public fun getConnectedPort(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETCLIENT_GET_CONNECTED_PORT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public companion object
}
