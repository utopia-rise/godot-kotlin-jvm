// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.Error
import kotlin.Any
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
public open class WebRTCPeerConnectionExtension : WebRTCPeerConnection() {
  override fun new(scriptIndex: Int) {
    createNativeObject(845, scriptIndex)
  }

  public open fun _getConnectionState(): WebRTCPeerConnection.ConnectionState {
    throw NotImplementedError("_getConnectionState is not implemented for WebRTCPeerConnectionExtension")
  }

  public open fun _getGatheringState(): WebRTCPeerConnection.GatheringState {
    throw NotImplementedError("_getGatheringState is not implemented for WebRTCPeerConnectionExtension")
  }

  public open fun _getSignalingState(): WebRTCPeerConnection.SignalingState {
    throw NotImplementedError("_getSignalingState is not implemented for WebRTCPeerConnectionExtension")
  }

  public open fun _initialize(pConfig: Dictionary<Any?, Any?>): Error {
    throw NotImplementedError("_initialize is not implemented for WebRTCPeerConnectionExtension")
  }

  public open fun _createDataChannel(pLabel: String, pConfig: Dictionary<Any?, Any?>): WebRTCDataChannel? {
    throw NotImplementedError("_createDataChannel is not implemented for WebRTCPeerConnectionExtension")
  }

  public open fun _createOffer(): Error {
    throw NotImplementedError("_createOffer is not implemented for WebRTCPeerConnectionExtension")
  }

  public open fun _setRemoteDescription(pType: String, pSdp: String): Error {
    throw NotImplementedError("_setRemoteDescription is not implemented for WebRTCPeerConnectionExtension")
  }

  public open fun _setLocalDescription(pType: String, pSdp: String): Error {
    throw NotImplementedError("_setLocalDescription is not implemented for WebRTCPeerConnectionExtension")
  }

  public open fun _addIceCandidate(
    pSdpMidName: String,
    pSdpMlineIndex: Int,
    pSdpName: String,
  ): Error {
    throw NotImplementedError("_addIceCandidate is not implemented for WebRTCPeerConnectionExtension")
  }

  public open fun _poll(): Error {
    throw NotImplementedError("_poll is not implemented for WebRTCPeerConnectionExtension")
  }

  public open fun _close() {
    throw NotImplementedError("_close is not implemented for WebRTCPeerConnectionExtension")
  }

  public companion object

  public object MethodBindings
}
