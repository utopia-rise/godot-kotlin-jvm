// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.TransferContext
import godot.core.VariantType.NIL
import kotlin.Any
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class WebRTCPeerConnectionExtension : WebRTCPeerConnection() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_WEBRTCPEERCONNECTIONEXTENSION)
  }

  public open fun _getConnectionState(): Long {
    throw NotImplementedError("_get_connection_state is not implemented for WebRTCPeerConnectionExtension")
  }

  public open fun _initialize(pConfig: Dictionary<Any?, Any?>): Long {
    throw NotImplementedError("_initialize is not implemented for WebRTCPeerConnectionExtension")
  }

  public open fun _createDataChannel(pLabel: String, pConfig: Dictionary<Any?, Any?>): Object? {
    throw NotImplementedError("_create_data_channel is not implemented for WebRTCPeerConnectionExtension")
  }

  public open fun _createOffer(): Long {
    throw NotImplementedError("_create_offer is not implemented for WebRTCPeerConnectionExtension")
  }

  public open fun _setRemoteDescription(pType: String, pSdp: String): Long {
    throw NotImplementedError("_set_remote_description is not implemented for WebRTCPeerConnectionExtension")
  }

  public open fun _setLocalDescription(pType: String, pSdp: String): Long {
    throw NotImplementedError("_set_local_description is not implemented for WebRTCPeerConnectionExtension")
  }

  public open fun _addIceCandidate(
    pSdpMidName: String,
    pSdpMlineIndex: Long,
    pSdpName: String
  ): Long {
    throw NotImplementedError("_add_ice_candidate is not implemented for WebRTCPeerConnectionExtension")
  }

  public open fun _poll(): Long {
    throw NotImplementedError("_poll is not implemented for WebRTCPeerConnectionExtension")
  }

  public open fun _close(): Unit {
  }

  public fun makeDefault(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WEBRTCPEERCONNECTIONEXTENSION_MAKE_DEFAULT, NIL)
  }

  public companion object
}
