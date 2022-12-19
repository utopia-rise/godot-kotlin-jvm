// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class WebRTCMultiplayerPeer : MultiplayerPeer() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_WEBRTCMULTIPLAYERPEER, scriptIndex)
    return true
  }

  public fun initialize(
    peerId: Long,
    serverCompatibility: Boolean = false,
    channelsConfig: VariantArray<Any?> = godot.core.variantArrayOf()
  ): GodotError {
    TransferContext.writeArguments(LONG to peerId, BOOL to serverCompatibility, ARRAY to channelsConfig)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCMULTIPLAYERPEER_INITIALIZE,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public fun addPeer(
    peer: WebRTCPeerConnection,
    peerId: Long,
    unreliableLifetime: Long = 1
  ): GodotError {
    TransferContext.writeArguments(OBJECT to peer, LONG to peerId, LONG to unreliableLifetime)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCMULTIPLAYERPEER_ADD_PEER,
        LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public fun removePeer(peerId: Long): Unit {
    TransferContext.writeArguments(LONG to peerId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCMULTIPLAYERPEER_REMOVE_PEER,
        NIL)
  }

  public fun hasPeer(peerId: Long): Boolean {
    TransferContext.writeArguments(LONG to peerId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCMULTIPLAYERPEER_HAS_PEER,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public fun getPeer(peerId: Long): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to peerId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCMULTIPLAYERPEER_GET_PEER,
        DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  public fun getPeers(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCMULTIPLAYERPEER_GET_PEERS,
        DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  public fun close(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCMULTIPLAYERPEER_CLOSE, NIL)
  }

  public companion object
}
