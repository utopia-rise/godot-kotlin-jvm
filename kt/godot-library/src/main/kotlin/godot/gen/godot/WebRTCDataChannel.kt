// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class WebRTCDataChannel internal constructor() : PacketPeer() {
  public var writeMode: WriteMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getWriteModePtr, LONG)
      return WebRTCDataChannel.WriteMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setWriteModePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_WEBRTCDATACHANNEL, scriptIndex)
    return true
  }

  public fun poll(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pollPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun close(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.closePtr, NIL)
  }

  public fun wasStringPacket(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.wasStringPacketPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getReadyState(): ChannelState {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getReadyStatePtr, LONG)
    return WebRTCDataChannel.ChannelState.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getLabel(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLabelPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun isOrdered(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isOrderedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getId(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getMaxPacketLifeTime(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMaxPacketLifeTimePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getMaxRetransmits(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMaxRetransmitsPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getProtocol(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getProtocolPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public fun isNegotiated(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isNegotiatedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getBufferedAmount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBufferedAmountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public enum class WriteMode(
    id: Long,
  ) {
    WRITE_MODE_TEXT(0),
    WRITE_MODE_BINARY(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class ChannelState(
    id: Long,
  ) {
    STATE_CONNECTING(0),
    STATE_OPEN(1),
    STATE_CLOSING(2),
    STATE_CLOSED(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val pollPtr: VoidPtr = TypeManager.getMethodBindPtr("WebRTCDataChannel", "poll")

    public val closePtr: VoidPtr = TypeManager.getMethodBindPtr("WebRTCDataChannel", "close")

    public val wasStringPacketPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCDataChannel", "was_string_packet")

    public val setWriteModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCDataChannel", "set_write_mode")

    public val getWriteModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCDataChannel", "get_write_mode")

    public val getReadyStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCDataChannel", "get_ready_state")

    public val getLabelPtr: VoidPtr = TypeManager.getMethodBindPtr("WebRTCDataChannel", "get_label")

    public val isOrderedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCDataChannel", "is_ordered")

    public val getIdPtr: VoidPtr = TypeManager.getMethodBindPtr("WebRTCDataChannel", "get_id")

    public val getMaxPacketLifeTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCDataChannel", "get_max_packet_life_time")

    public val getMaxRetransmitsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCDataChannel", "get_max_retransmits")

    public val getProtocolPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCDataChannel", "get_protocol")

    public val isNegotiatedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCDataChannel", "is_negotiated")

    public val getBufferedAmountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCDataChannel", "get_buffered_amount")
  }
}
