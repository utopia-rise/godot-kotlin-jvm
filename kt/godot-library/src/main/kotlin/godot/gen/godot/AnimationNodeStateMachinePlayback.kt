// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.POOL_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class AnimationNodeStateMachinePlayback : Resource() {
  override fun __new(): VoidPtr =
      TransferContext.invokeConstructor(ENGINECLASS_ANIMATIONNODESTATEMACHINEPLAYBACK)

  open fun getCurrentNode(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINEPLAYBACK_GET_CURRENT_NODE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getTravelPath(): PoolStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINEPLAYBACK_GET_TRAVEL_PATH,
        POOL_STRING_ARRAY)
    return TransferContext.readReturnValue(POOL_STRING_ARRAY, false) as PoolStringArray
  }

  open fun isPlaying(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINEPLAYBACK_IS_PLAYING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun start(node: String) {
    TransferContext.writeArguments(STRING to node)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINEPLAYBACK_START, NIL)
  }

  open fun stop() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINEPLAYBACK_STOP, NIL)
  }

  open fun travel(toNode: String) {
    TransferContext.writeArguments(STRING to toNode)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODESTATEMACHINEPLAYBACK_TRAVEL, NIL)
  }
}
