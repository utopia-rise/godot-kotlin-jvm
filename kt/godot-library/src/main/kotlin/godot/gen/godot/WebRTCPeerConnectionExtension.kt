// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.TypeManager
import godot.util.VoidPtr
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

  public open fun _createDataChannel(pLabel: String, pConfig: Dictionary<Any?, Any?>):
      WebRTCDataChannel? {
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
    pSdpMlineIndex: Int,
    pSdpName: String,
  ): GodotError {
    throw NotImplementedError("_add_ice_candidate is not implemented for WebRTCPeerConnectionExtension")
  }

  public open fun _poll(): GodotError {
    throw NotImplementedError("_poll is not implemented for WebRTCPeerConnectionExtension")
  }

  public open fun _close(): Unit {
  }

  public companion object

  internal object MethodBindings {
    public val _getConnectionStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnectionExtension", "_get_connection_state")

    public val _getGatheringStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnectionExtension", "_get_gathering_state")

    public val _getSignalingStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnectionExtension", "_get_signaling_state")

    public val _initializePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnectionExtension", "_initialize")

    public val _createDataChannelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnectionExtension", "_create_data_channel")

    public val _createOfferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnectionExtension", "_create_offer")

    public val _setRemoteDescriptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnectionExtension", "_set_remote_description")

    public val _setLocalDescriptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnectionExtension", "_set_local_description")

    public val _addIceCandidatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnectionExtension", "_add_ice_candidate")

    public val _pollPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnectionExtension", "_poll")

    public val _closePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnectionExtension", "_close")
  }
}
