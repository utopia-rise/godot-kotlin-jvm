// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Int
import kotlin.Suppress

/**
 * This [SkeletonModification2D] holds a reference to a [SkeletonModificationStack2D], allowing you to use multiple modification stacks on a single [Skeleton2D].
 *
 * **Note:** The modifications in the held [SkeletonModificationStack2D] will only be executed if their execution mode matches the execution mode of the SkeletonModification2DStackHolder.
 */
@GodotBaseType
public open class SkeletonModification2DStackHolder : SkeletonModification2D() {
  override fun new(scriptIndex: Int) {
    createNativeObject(602, scriptIndex)
  }

  /**
   * Sets the [SkeletonModificationStack2D] that this modification is holding. This modification stack will then be executed when this modification is executed.
   */
  public final fun setHeldModificationStack(heldModificationStack: SkeletonModificationStack2D?) {
    TransferContext.writeArguments(OBJECT to heldModificationStack)
    TransferContext.callMethod(ptr, MethodBindings.setHeldModificationStackPtr, NIL)
  }

  /**
   * Returns the [SkeletonModificationStack2D] that this modification is holding.
   */
  public final fun getHeldModificationStack(): SkeletonModificationStack2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHeldModificationStackPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as SkeletonModificationStack2D?)
  }

  public companion object

  public object MethodBindings {
    internal val setHeldModificationStackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DStackHolder", "set_held_modification_stack", 3_907_307_132)

    internal val getHeldModificationStackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DStackHolder", "get_held_modification_stack", 2_107_508_396)
  }
}
