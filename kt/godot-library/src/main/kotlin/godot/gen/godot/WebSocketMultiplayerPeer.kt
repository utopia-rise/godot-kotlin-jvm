// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class WebSocketMultiplayerPeer internal constructor() : MultiplayerPeer() {
  public val peerPacket: Signal1<Long> by signal("peerSource")

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_WEBSOCKETMULTIPLAYERPEER)
  }

  public fun setBuffers(
    inputBufferSizeKb: Long,
    inputMaxPackets: Long,
    outputBufferSizeKb: Long,
    outputMaxPackets: Long
  ): GodotError {
    TransferContext.writeArguments(LONG to inputBufferSizeKb, LONG to inputMaxPackets, LONG to outputBufferSizeKb, LONG to outputMaxPackets)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETMULTIPLAYERPEER_SET_BUFFERS,
        LONG.ordinal)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public fun getPeer(peerId: Long): WebSocketPeer? {
    TransferContext.writeArguments(LONG to peerId)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBSOCKETMULTIPLAYERPEER_GET_PEER,
        OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as WebSocketPeer?
  }

  public companion object
}
