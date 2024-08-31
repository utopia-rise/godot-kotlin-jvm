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
  /**
   * The transfer mode to use when sending outgoing packet. Either text or binary.
   */
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

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_WEBRTCDATACHANNEL, scriptIndex)
  }

  /**
   * Reserved, but not used for now.
   */
  public fun poll(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pollPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Closes this data channel, notifying the other peer.
   */
  public fun close(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.closePtr, NIL)
  }

  /**
   * Returns `true` if the last received packet was transferred as text. See [writeMode].
   */
  public fun wasStringPacket(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.wasStringPacketPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the current state of this channel, see [ChannelState].
   */
  public fun getReadyState(): ChannelState {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getReadyStatePtr, LONG)
    return WebRTCDataChannel.ChannelState.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the label assigned to this channel during creation.
   */
  public fun getLabel(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLabelPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns `true` if this channel was created with ordering enabled (default).
   */
  public fun isOrdered(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isOrderedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the ID assigned to this channel during creation (or auto-assigned during negotiation).
   * If the channel is not negotiated out-of-band the ID will only be available after the connection
   * is established (will return `65535` until then).
   */
  public fun getId(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the `maxPacketLifeTime` value assigned to this channel during creation.
   * Will be `65535` if not specified.
   */
  public fun getMaxPacketLifeTime(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMaxPacketLifeTimePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the `maxRetransmits` value assigned to this channel during creation.
   * Will be `65535` if not specified.
   */
  public fun getMaxRetransmits(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMaxRetransmitsPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the sub-protocol assigned to this channel during creation. An empty string if not
   * specified.
   */
  public fun getProtocol(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getProtocolPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns `true` if this channel was created with out-of-band configuration.
   */
  public fun isNegotiated(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isNegotiatedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the number of bytes currently queued to be sent over this channel.
   */
  public fun getBufferedAmount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBufferedAmountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public enum class WriteMode(
    id: Long,
  ) {
    /**
     * Tells the channel to send data over this channel as text. An external peer (non-Godot) would
     * receive this as a string.
     */
    WRITE_MODE_TEXT(0),
    /**
     * Tells the channel to send data over this channel as binary. An external peer (non-Godot)
     * would receive this as array buffer or blob.
     */
    WRITE_MODE_BINARY(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): WriteMode = entries.single { it.id == `value` }
    }
  }

  public enum class ChannelState(
    id: Long,
  ) {
    /**
     * The channel was created, but it's still trying to connect.
     */
    STATE_CONNECTING(0),
    /**
     * The channel is currently open, and data can flow over it.
     */
    STATE_OPEN(1),
    /**
     * The channel is being closed, no new messages will be accepted, but those already in queue
     * will be flushed.
     */
    STATE_CLOSING(2),
    /**
     * The channel was closed, or connection failed.
     */
    STATE_CLOSED(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ChannelState = entries.single { it.id == `value` }
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
