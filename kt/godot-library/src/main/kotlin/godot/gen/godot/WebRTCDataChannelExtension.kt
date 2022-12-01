// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class WebRTCDataChannelExtension : WebRTCDataChannel() {
  public override fun __new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_WEBRTCDATACHANNELEXTENSION, scriptIndex)
  }

  public open fun _getAvailablePacketCount(): Long {
    throw NotImplementedError("_get_available_packet_count is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _getMaxPacketSize(): Long {
    throw NotImplementedError("_get_max_packet_size is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _poll(): Long {
    throw NotImplementedError("_poll is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _close(): Unit {
  }

  public open fun _setWriteMode(pWriteMode: Long): Unit {
  }

  public open fun _getWriteMode(): Long {
    throw NotImplementedError("_get_write_mode is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _wasStringPacket(): Boolean {
    throw NotImplementedError("_was_string_packet is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _getReadyState(): Long {
    throw NotImplementedError("_get_ready_state is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _getLabel(): String {
    throw NotImplementedError("_get_label is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _isOrdered(): Boolean {
    throw NotImplementedError("_is_ordered is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _getId(): Long {
    throw NotImplementedError("_get_id is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _getMaxPacketLifeTime(): Long {
    throw NotImplementedError("_get_max_packet_life_time is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _getMaxRetransmits(): Long {
    throw NotImplementedError("_get_max_retransmits is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _getProtocol(): String {
    throw NotImplementedError("_get_protocol is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _isNegotiated(): Boolean {
    throw NotImplementedError("_is_negotiated is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _getBufferedAmount(): Long {
    throw NotImplementedError("_get_buffered_amount is not implemented for WebRTCDataChannelExtension")
  }

  public companion object
}
