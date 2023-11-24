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
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class WebRTCMultiplayerPeer : MultiplayerPeer() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_WEBRTCMULTIPLAYERPEER, scriptIndex)
    return true
  }

  @JvmOverloads
  public fun createServer(channelsConfig: VariantArray<Any?> = godot.core.variantArrayOf()):
      GodotError {
    TransferContext.writeArguments(ARRAY to channelsConfig)
    TransferContext.callMethod(rawPtr, MethodBindings.createServerPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun createClient(peerId: Int, channelsConfig: VariantArray<Any?> =
      godot.core.variantArrayOf()): GodotError {
    TransferContext.writeArguments(LONG to peerId.toLong(), ARRAY to channelsConfig)
    TransferContext.callMethod(rawPtr, MethodBindings.createClientPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun createMesh(peerId: Int, channelsConfig: VariantArray<Any?> =
      godot.core.variantArrayOf()): GodotError {
    TransferContext.writeArguments(LONG to peerId.toLong(), ARRAY to channelsConfig)
    TransferContext.callMethod(rawPtr, MethodBindings.createMeshPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  @JvmOverloads
  public fun addPeer(
    peer: WebRTCPeerConnection,
    peerId: Int,
    unreliableLifetime: Int = 1,
  ): GodotError {
    TransferContext.writeArguments(OBJECT to peer, LONG to peerId.toLong(), LONG to unreliableLifetime.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addPeerPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun removePeer(peerId: Int): Unit {
    TransferContext.writeArguments(LONG to peerId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removePeerPtr, NIL)
  }

  public fun hasPeer(peerId: Int): Boolean {
    TransferContext.writeArguments(LONG to peerId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.hasPeerPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getPeer(peerId: Int): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to peerId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPeerPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public fun getPeers(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPeersPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  public companion object

  internal object MethodBindings {
    public val createServerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCMultiplayerPeer", "create_server")

    public val createClientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCMultiplayerPeer", "create_client")

    public val createMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCMultiplayerPeer", "create_mesh")

    public val addPeerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCMultiplayerPeer", "add_peer")

    public val removePeerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCMultiplayerPeer", "remove_peer")

    public val hasPeerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCMultiplayerPeer", "has_peer")

    public val getPeerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCMultiplayerPeer", "get_peer")

    public val getPeersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebRTCMultiplayerPeer", "get_peers")
  }
}
