// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class WebSocketMultiplayerPeer : NetworkedMultiplayerPeer() {
  val peerPacket: Signal1<Long> by signal("peer_source")

  override fun __new(): VoidPtr =
      TransferContext.invokeConstructor(ENGINECLASS_WEBSOCKETMULTIPLAYERPEER)

  open fun getPeer(peerId: Long): WebSocketPeer? {
    TransferContext.writeArguments(LONG to peerId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETMULTIPLAYERPEER_GET_PEER,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as WebSocketPeer?
  }

  open fun setBuffers(
    inputBufferSizeKb: Long,
    inputMaxPackets: Long,
    outputBufferSizeKb: Long,
    outputMaxPackets: Long
  ): GodotError {
    TransferContext.writeArguments(LONG to inputBufferSizeKb, LONG to inputMaxPackets, LONG to
        outputBufferSizeKb, LONG to outputMaxPackets)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WEBSOCKETMULTIPLAYERPEER_SET_BUFFERS, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }
}
