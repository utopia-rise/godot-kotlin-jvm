// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.Error
import kotlin.Any
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public abstract class WebRTCPeerConnectionExtension : WebRTCPeerConnection() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(862, scriptIndex)
  }

  public abstract fun _getConnectionState(): WebRTCPeerConnection.ConnectionState

  public abstract fun _getGatheringState(): WebRTCPeerConnection.GatheringState

  public abstract fun _getSignalingState(): WebRTCPeerConnection.SignalingState

  public abstract fun _initialize(pConfig: Dictionary<Any?, Any?>): Error

  public abstract fun _createDataChannel(pLabel: String, pConfig: Dictionary<Any?, Any?>):
      WebRTCDataChannel?

  public abstract fun _createOffer(): Error

  public abstract fun _setRemoteDescription(pType: String, pSdp: String): Error

  public abstract fun _setLocalDescription(pType: String, pSdp: String): Error

  public abstract fun _addIceCandidate(
    pSdpMidName: String,
    pSdpMlineIndex: Int,
    pSdpName: String,
  ): Error

  public abstract fun _poll(): Error

  public abstract fun _close(): Unit

  public companion object

  public object MethodBindings
}
