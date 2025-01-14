// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

@GodotBaseType
public open class WebRTCDataChannel internal constructor() : PacketPeer() {
  /**
   * The transfer mode to use when sending outgoing packet. Either text or binary.
   */
  public final inline var writeMode: WriteMode
    @JvmName("writeModeProperty")
    get() = getWriteMode()
    @JvmName("writeModeProperty")
    set(`value`) {
      setWriteMode(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_WEBRTCDATACHANNEL, scriptIndex)
  }

  /**
   * Reserved, but not used for now.
   */
  public final fun poll(): Error {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.pollPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Closes this data channel, notifying the other peer.
   */
  public final fun close(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.closePtr, NIL)
  }

  /**
   * Returns `true` if the last received packet was transferred as text. See [writeMode].
   */
  public final fun wasStringPacket(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.wasStringPacketPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setWriteMode(writeMode: WriteMode): Unit {
    TransferContext.writeArguments(LONG to writeMode.id)
    TransferContext.callMethod(ptr, MethodBindings.setWriteModePtr, NIL)
  }

  public final fun getWriteMode(): WriteMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getWriteModePtr, LONG)
    return WebRTCDataChannel.WriteMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the current state of this channel, see [ChannelState].
   */
  public final fun getReadyState(): ChannelState {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getReadyStatePtr, LONG)
    return WebRTCDataChannel.ChannelState.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the label assigned to this channel during creation.
   */
  public final fun getLabel(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLabelPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns `true` if this channel was created with ordering enabled (default).
   */
  public final fun isOrdered(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isOrderedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the ID assigned to this channel during creation (or auto-assigned during negotiation).
   * If the channel is not negotiated out-of-band the ID will only be available after the connection
   * is established (will return `65535` until then).
   */
  public final fun getId(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the `maxPacketLifeTime` value assigned to this channel during creation.
   * Will be `65535` if not specified.
   */
  public final fun getMaxPacketLifeTime(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMaxPacketLifeTimePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the `maxRetransmits` value assigned to this channel during creation.
   * Will be `65535` if not specified.
   */
  public final fun getMaxRetransmits(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMaxRetransmitsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the sub-protocol assigned to this channel during creation. An empty string if not
   * specified.
   */
  public final fun getProtocol(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getProtocolPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns `true` if this channel was created with out-of-band configuration.
   */
  public final fun isNegotiated(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isNegotiatedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the number of bytes currently queued to be sent over this channel.
   */
  public final fun getBufferedAmount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBufferedAmountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
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
    public val pollPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCDataChannel", "poll", 166280745)

    public val closePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCDataChannel", "close", 3218959716)

    public val wasStringPacketPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCDataChannel", "was_string_packet", 36873697)

    public val setWriteModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCDataChannel", "set_write_mode", 1999768052)

    public val getWriteModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCDataChannel", "get_write_mode", 2848495172)

    public val getReadyStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCDataChannel", "get_ready_state", 3501143017)

    public val getLabelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCDataChannel", "get_label", 201670096)

    public val isOrderedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCDataChannel", "is_ordered", 36873697)

    public val getIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCDataChannel", "get_id", 3905245786)

    public val getMaxPacketLifeTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCDataChannel", "get_max_packet_life_time", 3905245786)

    public val getMaxRetransmitsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCDataChannel", "get_max_retransmits", 3905245786)

    public val getProtocolPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCDataChannel", "get_protocol", 201670096)

    public val isNegotiatedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCDataChannel", "is_negotiated", 36873697)

    public val getBufferedAmountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCDataChannel", "get_buffered_amount", 3905245786)
  }
}
