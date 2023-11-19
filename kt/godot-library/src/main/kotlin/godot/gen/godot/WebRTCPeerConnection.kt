// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.Signal3
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class WebRTCPeerConnection : RefCounted() {
  public val sessionDescriptionCreated: Signal2<String, String> by signal("type", "sdp")

  public val iceCandidateCreated: Signal3<String, Long, String> by signal("media", "index", "name")

  public val dataChannelReceived: Signal1<WebRTCDataChannel> by signal("channel")

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_WEBRTCPEERCONNECTION, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun initialize(configuration: Dictionary<Any?, Any?> = Dictionary()): GodotError {
    TransferContext.writeArguments(DICTIONARY to configuration)
    TransferContext.callMethod(rawPtr, MethodBindings.initializePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun createDataChannel(label: String, options: Dictionary<Any?, Any?> = Dictionary()):
      WebRTCDataChannel? {
    TransferContext.writeArguments(STRING to label, DICTIONARY to options)
    TransferContext.callMethod(rawPtr, MethodBindings.createDataChannelPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as WebRTCDataChannel?)
  }

  public fun createOffer(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.createOfferPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setLocalDescription(type: String, sdp: String): GodotError {
    TransferContext.writeArguments(STRING to type, STRING to sdp)
    TransferContext.callMethod(rawPtr, MethodBindings.setLocalDescriptionPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setRemoteDescription(type: String, sdp: String): GodotError {
    TransferContext.writeArguments(STRING to type, STRING to sdp)
    TransferContext.callMethod(rawPtr, MethodBindings.setRemoteDescriptionPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun addIceCandidate(
    media: String,
    index: Int,
    name: String,
  ): GodotError {
    TransferContext.writeArguments(STRING to media, LONG to index.toLong(), STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.addIceCandidatePtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun poll(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pollPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun close(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.closePtr, NIL)
  }

  public fun getConnectionState(): ConnectionState {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConnectionStatePtr, LONG)
    return WebRTCPeerConnection.ConnectionState.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getGatheringState(): GatheringState {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getGatheringStatePtr, LONG)
    return WebRTCPeerConnection.GatheringState.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getSignalingState(): SignalingState {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSignalingStatePtr, LONG)
    return WebRTCPeerConnection.SignalingState.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class ConnectionState(
    id: Long,
  ) {
    STATE_NEW(0),
    STATE_CONNECTING(1),
    STATE_CONNECTED(2),
    STATE_DISCONNECTED(3),
    STATE_FAILED(4),
    STATE_CLOSED(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class GatheringState(
    id: Long,
  ) {
    GATHERING_STATE_NEW(0),
    GATHERING_STATE_GATHERING(1),
    GATHERING_STATE_COMPLETE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class SignalingState(
    id: Long,
  ) {
    SIGNALING_STATE_STABLE(0),
    SIGNALING_STATE_HAVE_LOCAL_OFFER(1),
    SIGNALING_STATE_HAVE_REMOTE_OFFER(2),
    SIGNALING_STATE_HAVE_LOCAL_PRANSWER(3),
    SIGNALING_STATE_HAVE_REMOTE_PRANSWER(4),
    SIGNALING_STATE_CLOSED(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object {
    public fun setDefaultExtension(extensionClass: StringName): Unit {
      TransferContext.writeArguments(STRING_NAME to extensionClass)
      TransferContext.callMethod(0, MethodBindings.setDefaultExtensionPtr, NIL)
    }
  }

  internal object MethodBindings {
    public val setDefaultExtensionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnection", "set_default_extension")

    public val initializePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnection", "initialize")

    public val createDataChannelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnection", "create_data_channel")

    public val createOfferPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnection", "create_offer")

    public val setLocalDescriptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnection", "set_local_description")

    public val setRemoteDescriptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnection", "set_remote_description")

    public val addIceCandidatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnection", "add_ice_candidate")

    public val pollPtr: VoidPtr = TypeManager.getMethodBindPtr("WebRTCPeerConnection", "poll")

    public val closePtr: VoidPtr = TypeManager.getMethodBindPtr("WebRTCPeerConnection", "close")

    public val getConnectionStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnection", "get_connection_state")

    public val getGatheringStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnection", "get_gathering_state")

    public val getSignalingStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCPeerConnection", "get_signaling_state")
  }
}
