// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_SKELETONMODIFICATION2DSTACKHOLDER_INDEX: Int = 592

/**
 * This [SkeletonModification2D] holds a reference to a [SkeletonModificationStack2D], allowing you
 * to use multiple modification stacks on a single [Skeleton2D].
 * **Note:** The modifications in the held [SkeletonModificationStack2D] will only be executed if
 * their execution mode matches the execution mode of the SkeletonModification2DStackHolder.
 */
@GodotBaseType
public open class SkeletonModification2DStackHolder : SkeletonModification2D() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_SKELETONMODIFICATION2DSTACKHOLDER_INDEX,
        scriptIndex)
  }

  /**
   * Sets the [SkeletonModificationStack2D] that this modification is holding. This modification
   * stack will then be executed when this modification is executed.
   */
  public final fun setHeldModificationStack(heldModificationStack: SkeletonModificationStack2D?):
      Unit {
    Internals.writeArguments(OBJECT to heldModificationStack)
    Internals.callMethod(rawPtr, MethodBindings.setHeldModificationStackPtr, NIL)
  }

  /**
   * Returns the [SkeletonModificationStack2D] that this modification is holding.
   */
  public final fun getHeldModificationStack(): SkeletonModificationStack2D? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getHeldModificationStackPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as SkeletonModificationStack2D?)
  }

  public companion object

  public object MethodBindings {
    internal val setHeldModificationStackPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DStackHolder", "set_held_modification_stack", 3907307132)

    internal val getHeldModificationStackPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DStackHolder", "get_held_modification_stack", 2107508396)
  }
}
