// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.WebSocketPeer
import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class WebSocketPeer : PacketPeer() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_WEBSOCKETPEER, scriptIndex)
    return true
  }

  public fun getWriteMode(): WebSocketPeer.WriteMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETPEER_GET_WRITE_MODE, LONG)
    return WebSocketPeer.WriteMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public fun setWriteMode(mode: WebSocketPeer.WriteMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETPEER_SET_WRITE_MODE, NIL)
  }

  public fun isConnectedToHost(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETPEER_IS_CONNECTED_TO_HOST,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public fun wasStringPacket(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETPEER_WAS_STRING_PACKET,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public fun close(code: Long = 1000, reason: String = ""): Unit {
    TransferContext.writeArguments(LONG to code, STRING to reason)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETPEER_CLOSE, NIL)
  }

  public fun getConnectedHost(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETPEER_GET_CONNECTED_HOST,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  public fun getConnectedPort(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETPEER_GET_CONNECTED_PORT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public fun setNoDelay(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETPEER_SET_NO_DELAY, NIL)
  }

  public fun getCurrentOutboundBufferedAmount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WEBSOCKETPEER_GET_CURRENT_OUTBOUND_BUFFERED_AMOUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public enum class WriteMode(
    id: Long
  ) {
    WRITE_MODE_TEXT(0),
    WRITE_MODE_BINARY(1),
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
