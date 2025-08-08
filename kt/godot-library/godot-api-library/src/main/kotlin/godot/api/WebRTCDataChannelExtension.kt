// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.core.Error
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class WebRTCDataChannelExtension : WebRTCDataChannel() {
  override fun new(scriptIndex: Int) {
    createNativeObject(842, scriptIndex)
  }

  public open fun _getAvailablePacketCount(): Int {
    throw NotImplementedError("_getAvailablePacketCount is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _getMaxPacketSize(): Int {
    throw NotImplementedError("_getMaxPacketSize is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _poll(): Error {
    throw NotImplementedError("_poll is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _close() {
    throw NotImplementedError("_close is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _setWriteMode(pWriteMode: WebRTCDataChannel.WriteMode) {
    throw NotImplementedError("_setWriteMode is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _getWriteMode(): WebRTCDataChannel.WriteMode {
    throw NotImplementedError("_getWriteMode is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _wasStringPacket(): Boolean {
    throw NotImplementedError("_wasStringPacket is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _getReadyState(): WebRTCDataChannel.ChannelState {
    throw NotImplementedError("_getReadyState is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _getLabel(): String {
    throw NotImplementedError("_getLabel is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _isOrdered(): Boolean {
    throw NotImplementedError("_isOrdered is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _getId(): Int {
    throw NotImplementedError("_getId is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _getMaxPacketLifeTime(): Int {
    throw NotImplementedError("_getMaxPacketLifeTime is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _getMaxRetransmits(): Int {
    throw NotImplementedError("_getMaxRetransmits is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _getProtocol(): String {
    throw NotImplementedError("_getProtocol is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _isNegotiated(): Boolean {
    throw NotImplementedError("_isNegotiated is not implemented for WebRTCDataChannelExtension")
  }

  public open fun _getBufferedAmount(): Int {
    throw NotImplementedError("_getBufferedAmount is not implemented for WebRTCDataChannelExtension")
  }

  public companion object

  public object MethodBindings
}
