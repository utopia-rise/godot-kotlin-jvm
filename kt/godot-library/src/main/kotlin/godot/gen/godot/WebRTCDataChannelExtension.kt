// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.TypeManager
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class WebRTCDataChannelExtension : WebRTCDataChannel() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_WEBRTCDATACHANNELEXTENSION, scriptIndex)
    return true
  }

  public open fun _getAvailablePacketCount(): Int {
    throw NotImplementedError("_get_available_packet_count is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _getMaxPacketSize(): Int {
    throw NotImplementedError("_get_max_packet_size is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _poll(): GodotError {
    throw NotImplementedError("_poll is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _close(): Unit {
  }

  public open fun _setWriteMode(pWriteMode: WebRTCDataChannel.WriteMode): Unit {
  }

  public open fun _getWriteMode(): WebRTCDataChannel.WriteMode {
    throw NotImplementedError("_get_write_mode is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _wasStringPacket(): Boolean {
    throw NotImplementedError("_was_string_packet is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _getReadyState(): WebRTCDataChannel.ChannelState {
    throw NotImplementedError("_get_ready_state is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _getLabel(): String {
    throw NotImplementedError("_get_label is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _isOrdered(): Boolean {
    throw NotImplementedError("_is_ordered is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _getId(): Int {
    throw NotImplementedError("_get_id is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _getMaxPacketLifeTime(): Int {
    throw NotImplementedError("_get_max_packet_life_time is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _getMaxRetransmits(): Int {
    throw NotImplementedError("_get_max_retransmits is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _getProtocol(): String {
    throw NotImplementedError("_get_protocol is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _isNegotiated(): Boolean {
    throw NotImplementedError("_is_negotiated is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _getBufferedAmount(): Int {
    throw NotImplementedError("_get_buffered_amount is not implemented for WebRTCDataChannelExtension")
  }

  public companion object

  internal object MethodBindings {
    public val _getPacketPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCDataChannelExtension", "_get_packet")

    public val _putPacketPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCDataChannelExtension", "_put_packet")

    public val _getAvailablePacketCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCDataChannelExtension", "_get_available_packet_count")

    public val _getMaxPacketSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCDataChannelExtension", "_get_max_packet_size")

    public val _pollPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCDataChannelExtension", "_poll")

    public val _closePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCDataChannelExtension", "_close")

    public val _setWriteModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCDataChannelExtension", "_set_write_mode")

    public val _getWriteModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCDataChannelExtension", "_get_write_mode")

    public val _wasStringPacketPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCDataChannelExtension", "_was_string_packet")

    public val _getReadyStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCDataChannelExtension", "_get_ready_state")

    public val _getLabelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCDataChannelExtension", "_get_label")

    public val _isOrderedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCDataChannelExtension", "_is_ordered")

    public val _getIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCDataChannelExtension", "_get_id")

    public val _getMaxPacketLifeTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCDataChannelExtension", "_get_max_packet_life_time")

    public val _getMaxRetransmitsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCDataChannelExtension", "_get_max_retransmits")

    public val _getProtocolPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCDataChannelExtension", "_get_protocol")

    public val _isNegotiatedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCDataChannelExtension", "_is_negotiated")

    public val _getBufferedAmountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCDataChannelExtension", "_get_buffered_amount")
  }
}
