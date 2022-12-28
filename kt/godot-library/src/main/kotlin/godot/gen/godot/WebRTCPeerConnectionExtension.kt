// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.WebRTCPeerConnection
import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class WebRTCPeerConnectionExtension : WebRTCPeerConnection() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_WEBRTCPEERCONNECTIONEXTENSION, scriptIndex)
    return true
  }

  public open fun _getConnectionState(): WebRTCPeerConnection.ConnectionState {
    throw NotImplementedError("_get_connection_state is not implemented for WebRTCPeerConnectionExtension")
  }

  public open fun _getGatheringState(): WebRTCPeerConnection.GatheringState {
    throw NotImplementedError("_get_gathering_state is not implemented for WebRTCPeerConnectionExtension")
  }

  public open fun _getSignalingState(): WebRTCPeerConnection.SignalingState {
    throw NotImplementedError("_get_signaling_state is not implemented for WebRTCPeerConnectionExtension")
  }

  public open fun _initialize(pConfig: Dictionary<Any?, Any?>): GodotError {
    throw NotImplementedError("_initialize is not implemented for WebRTCPeerConnectionExtension")
  }

  public open fun _createDataChannel(pLabel: String, pConfig: Dictionary<Any?, Any?>): Object? {
    throw NotImplementedError("_create_data_channel is not implemented for WebRTCPeerConnectionExtension")
  }

  public open fun _createOffer(): GodotError {
    throw NotImplementedError("_create_offer is not implemented for WebRTCPeerConnectionExtension")
  }

  public open fun _setRemoteDescription(pType: String, pSdp: String): GodotError {
    throw NotImplementedError("_set_remote_description is not implemented for WebRTCPeerConnectionExtension")
  }

  public open fun _setLocalDescription(pType: String, pSdp: String): GodotError {
    throw NotImplementedError("_set_local_description is not implemented for WebRTCPeerConnectionExtension")
  }

  public open fun _addIceCandidate(
    pSdpMidName: String,
    pSdpMlineIndex: Long,
    pSdpName: String
  ): GodotError {
    throw NotImplementedError("_add_ice_candidate is not implemented for WebRTCPeerConnectionExtension")
  }

  public open fun _poll(): GodotError {
    throw NotImplementedError("_poll is not implemented for WebRTCPeerConnectionExtension")
  }

  public open fun _close(): Unit {
  }

  public companion object
}
