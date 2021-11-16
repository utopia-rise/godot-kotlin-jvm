// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.Signal3
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class WebSocketServer : WebSocketMultiplayerPeer() {
  public val clientCloseRequest: Signal3<Long, Long, String> by signal("id", "code", "reason")

  public val clientConnected: Signal2<Long, String> by signal("id", "protocol")

  public val clientDisconnected: Signal2<Long, Boolean> by signal("id", "was_clean_close")

  public val dataReceived: Signal1<Long> by signal("id")

  public open var bindIp: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETSERVER_GET_BIND_IP,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETSERVER_SET_BIND_IP, NIL)
    }

  public open var caChain: X509Certificate?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETSERVER_GET_CA_CHAIN,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as X509Certificate?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETSERVER_SET_CA_CHAIN, NIL)
    }

  public open var handshakeTimeout: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBSOCKETSERVER_GET_HANDSHAKE_TIMEOUT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBSOCKETSERVER_SET_HANDSHAKE_TIMEOUT, NIL)
    }

  public open var privateKey: CryptoKey?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETSERVER_GET_PRIVATE_KEY,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as CryptoKey?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETSERVER_SET_PRIVATE_KEY,
          NIL)
    }

  public open var sslCertificate: X509Certificate?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBSOCKETSERVER_GET_SSL_CERTIFICATE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as X509Certificate?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBSOCKETSERVER_SET_SSL_CERTIFICATE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_WEBSOCKETSERVER)
  }

  public open fun disconnectPeer(
    id: Long,
    code: Long = 1000,
    reason: String = ""
  ): Unit {
    TransferContext.writeArguments(LONG to id, LONG to code, STRING to reason)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETSERVER_DISCONNECT_PEER,
        NIL)
  }

  public open fun getPeerAddress(id: Long): String {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETSERVER_GET_PEER_ADDRESS,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  public open fun getPeerPort(id: Long): Long {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETSERVER_GET_PEER_PORT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public open fun hasPeer(id: Long): Boolean {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETSERVER_HAS_PEER, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public open fun isListening(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETSERVER_IS_LISTENING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public open fun listen(
    port: Long,
    protocols: PoolStringArray = PoolStringArray(),
    gdMpApi: Boolean = false
  ): GodotError {
    TransferContext.writeArguments(LONG to port, POOL_STRING_ARRAY to protocols, BOOL to gdMpApi)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETSERVER_LISTEN, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public open fun stop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETSERVER_STOP, NIL)
  }
}
