// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.core.Error
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

private const val ENGINECLASS_WEBRTCDATACHANNELEXTENSION: Int = 821

@GodotBaseType
public open class WebRTCDataChannelExtension : WebRTCDataChannel() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_WEBRTCDATACHANNELEXTENSION, scriptIndex)
  }

  public open fun _getAvailablePacketCount(): Int {
    throw NotImplementedError("_get_available_packet_count is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _getMaxPacketSize(): Int {
    throw NotImplementedError("_get_max_packet_size is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _poll(): Error {
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

  public object MethodBindings
}
