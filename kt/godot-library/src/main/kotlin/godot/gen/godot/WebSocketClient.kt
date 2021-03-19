// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_STRING_ARRAY
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

@GodotBaseType
open class WebSocketClient : WebSocketMultiplayerPeer() {
  val connectionClosed: Signal1<Boolean> by signal("was_clean_close")

  val connectionError: Signal0 by signal()

  val connectionEstablished: Signal1<String> by signal("protocol")

  val dataReceived: Signal0 by signal()

  val serverCloseRequest: Signal2<Long, String> by signal("code", "reason")

  open var trustedSslCertificate: X509Certificate?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBSOCKETCLIENT_GET_TRUSTED_SSL_CERTIFICATE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as X509Certificate?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBSOCKETCLIENT_SET_TRUSTED_SSL_CERTIFICATE, NIL)
    }

  open var verifySsl: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETCLIENT_GET_VERIFY_SSL,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETCLIENT_SET_VERIFY_SSL,
          NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_WEBSOCKETCLIENT)
  }

  open fun connectToUrl(
    url: String,
    protocols: PoolStringArray = PoolStringArray(),
    gdMpApi: Boolean = false,
    customHeaders: PoolStringArray = PoolStringArray()
  ): GodotError {
    TransferContext.writeArguments(STRING to url, POOL_STRING_ARRAY to protocols, BOOL to gdMpApi,
        POOL_STRING_ARRAY to customHeaders)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETCLIENT_CONNECT_TO_URL,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun disconnectFromHost(code: Long = 1000, reason: String = "") {
    TransferContext.writeArguments(LONG to code, STRING to reason)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WEBSOCKETCLIENT_DISCONNECT_FROM_HOST, NIL)
  }

  open fun getConnectedHost(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETCLIENT_GET_CONNECTED_HOST,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getConnectedPort(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETCLIENT_GET_CONNECTED_PORT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }
}
