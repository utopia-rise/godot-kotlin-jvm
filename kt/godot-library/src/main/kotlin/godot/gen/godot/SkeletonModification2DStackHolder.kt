// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Suppress
import kotlin.Unit

/**
 * A modification that holds and executes a [godot.SkeletonModificationStack2D].
 *
 * This [godot.SkeletonModification2D] holds a reference to a [godot.SkeletonModificationStack2D], allowing you to use multiple modification stacks on a single [godot.Skeleton2D].
 *
 * **Note:** The modifications in the held [godot.SkeletonModificationStack2D] will only be executed if their execution mode matches the execution mode of the SkeletonModification2DStackHolder.
 */
@GodotBaseType
public open class SkeletonModification2DStackHolder : SkeletonModification2D() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SKELETONMODIFICATION2DSTACKHOLDER)
  }

  /**
   * Sets the [godot.SkeletonModificationStack2D] that this modification is holding. This modification stack will then be executed when this modification is executed.
   */
  public open fun setHeldModificationStack(heldModificationStack: SkeletonModificationStack2D):
      Unit {
    TransferContext.writeArguments(OBJECT to heldModificationStack)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DSTACKHOLDER_SET_HELD_MODIFICATION_STACK, NIL)
  }

  /**
   * Returns the [godot.SkeletonModificationStack2D] that this modification is holding.
   */
  public open fun getHeldModificationStack(): SkeletonModificationStack2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DSTACKHOLDER_GET_HELD_MODIFICATION_STACK,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as SkeletonModificationStack2D?
  }

  public companion object
}
