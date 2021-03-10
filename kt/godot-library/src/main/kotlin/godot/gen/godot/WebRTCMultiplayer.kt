// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
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

@GodotBaseType
open class WebRTCMultiplayer : NetworkedMultiplayerPeer() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_WEBRTCMULTIPLAYER)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  open fun addPeer(
    peer: WebRTCPeerConnection,
    peerId: Long,
    unreliableLifetime: Long = 1
  ): GodotError {
    TransferContext.writeArguments(OBJECT to peer, LONG to peerId, LONG to unreliableLifetime)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCMULTIPLAYER_ADD_PEER, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun close() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCMULTIPLAYER_CLOSE, NIL)
  }

  open fun getPeer(peerId: Long): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to peerId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCMULTIPLAYER_GET_PEER,
        DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  open fun getPeers(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCMULTIPLAYER_GET_PEERS,
        DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  open fun hasPeer(peerId: Long): Boolean {
    TransferContext.writeArguments(LONG to peerId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCMULTIPLAYER_HAS_PEER, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun initialize(peerId: Long, serverCompatibility: Boolean = false): GodotError {
    TransferContext.writeArguments(LONG to peerId, BOOL to serverCompatibility)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCMULTIPLAYER_INITIALIZE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun removePeer(peerId: Long) {
    TransferContext.writeArguments(LONG to peerId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCMULTIPLAYER_REMOVE_PEER, NIL)
  }
}
