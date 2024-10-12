// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotApiMember
import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import kotlin.Any
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class WebRTCPeerConnectionExtension : WebRTCPeerConnection() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_WEBRTCPEERCONNECTIONEXTENSION, scriptIndex)
  }

  @GodotApiMember
  public open fun _getConnectionState(): WebRTCPeerConnection.ConnectionState {
    throw NotImplementedError("_get_connection_state is not implemented for WebRTCPeerConnectionExtension")
  }

  @GodotApiMember
  public open fun _getGatheringState(): WebRTCPeerConnection.GatheringState {
    throw NotImplementedError("_get_gathering_state is not implemented for WebRTCPeerConnectionExtension")
  }

  @GodotApiMember
  public open fun _getSignalingState(): WebRTCPeerConnection.SignalingState {
    throw NotImplementedError("_get_signaling_state is not implemented for WebRTCPeerConnectionExtension")
  }

  @GodotApiMember
  public open fun _initialize(pConfig: Dictionary<Any?, Any?>): Error {
    throw NotImplementedError("_initialize is not implemented for WebRTCPeerConnectionExtension")
  }

  @GodotApiMember
  public open fun _createDataChannel(pLabel: String, pConfig: Dictionary<Any?, Any?>):
      WebRTCDataChannel? {
    throw NotImplementedError("_create_data_channel is not implemented for WebRTCPeerConnectionExtension")
  }

  @GodotApiMember
  public open fun _createOffer(): Error {
    throw NotImplementedError("_create_offer is not implemented for WebRTCPeerConnectionExtension")
  }

  @GodotApiMember
  public open fun _setRemoteDescription(pType: String, pSdp: String): Error {
    throw NotImplementedError("_set_remote_description is not implemented for WebRTCPeerConnectionExtension")
  }

  @GodotApiMember
  public open fun _setLocalDescription(pType: String, pSdp: String): Error {
    throw NotImplementedError("_set_local_description is not implemented for WebRTCPeerConnectionExtension")
  }

  @GodotApiMember
  public open fun _addIceCandidate(
    pSdpMidName: String,
    pSdpMlineIndex: Int,
    pSdpName: String,
  ): Error {
    throw NotImplementedError("_add_ice_candidate is not implemented for WebRTCPeerConnectionExtension")
  }

  @GodotApiMember
  public open fun _poll(): Error {
    throw NotImplementedError("_poll is not implemented for WebRTCPeerConnectionExtension")
  }

  @GodotApiMember
  public open fun _close(): Unit {
  }

  public companion object

  internal object MethodBindings
}
