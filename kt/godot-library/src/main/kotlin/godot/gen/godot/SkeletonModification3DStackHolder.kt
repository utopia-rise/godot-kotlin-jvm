// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Suppress
import kotlin.Unit

/**
 * A modification that holds and executes a [godot.SkeletonModificationStack3D].
 *
 * This [godot.SkeletonModification3D] holds a reference to a [godot.SkeletonModificationStack3D], allowing you to use multiple modification stacks on a single [godot.Skeleton3D].
 *
 * **Note:** The modifications in the held [godot.SkeletonModificationStack3D] will only be executed if their execution mode matches the execution mode of the SkeletonModification3DStackHolder.
 */
@GodotBaseType
public open class SkeletonModification3DStackHolder : SkeletonModification3D() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SKELETONMODIFICATION3DSTACKHOLDER)
  }

  /**
   * Sets the [godot.SkeletonModificationStack3D] that this modification is holding. This modification stack will then be executed when this modification is executed.
   */
  public open fun setHeldModificationStack(heldModificationStack: SkeletonModificationStack3D):
      Unit {
    TransferContext.writeArguments(OBJECT to heldModificationStack)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DSTACKHOLDER_SET_HELD_MODIFICATION_STACK, NIL)
  }

  /**
   * Returns the [godot.SkeletonModificationStack3D] that this modification is holding.
   */
  public open fun getHeldModificationStack(): SkeletonModificationStack3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DSTACKHOLDER_GET_HELD_MODIFICATION_STACK,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as SkeletonModificationStack3D?
  }

  public companion object
}
