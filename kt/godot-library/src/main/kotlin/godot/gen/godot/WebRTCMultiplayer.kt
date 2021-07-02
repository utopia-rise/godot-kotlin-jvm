// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class WebRTCMultiplayer : NetworkedMultiplayerPeer() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_WEBRTCMULTIPLAYER)
  }

  public open fun addPeer(
    peer: WebRTCPeerConnection,
    peerId: Long,
    unreliableLifetime: Long = 1
  ): GodotError {
    TransferContext.writeArguments(OBJECT to peer, LONG to peerId, LONG to unreliableLifetime)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCMULTIPLAYER_ADD_PEER, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public open fun close(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCMULTIPLAYER_CLOSE, NIL)
  }

  public open fun getPeer(peerId: Long): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to peerId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCMULTIPLAYER_GET_PEER,
        DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  public open fun getPeers(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCMULTIPLAYER_GET_PEERS,
        DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  public open fun hasPeer(peerId: Long): Boolean {
    TransferContext.writeArguments(LONG to peerId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCMULTIPLAYER_HAS_PEER, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public open fun initialize(peerId: Long, serverCompatibility: Boolean = false): GodotError {
    TransferContext.writeArguments(LONG to peerId, BOOL to serverCompatibility)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCMULTIPLAYER_INITIALIZE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public open fun removePeer(peerId: Long): Unit {
    TransferContext.writeArguments(LONG to peerId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCMULTIPLAYER_REMOVE_PEER, NIL)
  }
}
