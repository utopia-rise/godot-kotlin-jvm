// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A resource that holds a stack of [godot.SkeletonModification2D]s.
 *
 * This resource is used by the Skeleton and holds a stack of [godot.SkeletonModification2D]s.
 *
 * This controls the order of the modifications and how they are applied. Modification order is especially important for full-body IK setups, as you need to execute the modifications in the correct order to get the desired results. For example, you want to execute a modification on the spine *before* the arms on a humanoid skeleton.
 *
 * This resource also controls how strongly all of the modifications are applied to the [godot.Skeleton2D].
 */
@GodotBaseType
public open class SkeletonModificationStack2D : Resource() {
  /**
   * If `true`, the modification's in the stack will be called. This is handled automatically through the [godot.Skeleton2D] node.
   */
  public var enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATIONSTACK2D_GET_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATIONSTACK2D_SET_ENABLED, NIL)
    }

  /**
   * The interpolation strength of the modifications in stack. A value of `0` will make it where the modifications are not applied, a strength of `0.5` will be half applied, and a strength of `1` will allow the modifications to be fully applied and override the [godot.Skeleton2D] [godot.Bone2D] poses.
   */
  public var strength: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATIONSTACK2D_GET_STRENGTH, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATIONSTACK2D_SET_STRENGTH, NIL)
    }

  /**
   * The number of modifications in the stack.
   */
  public var modificationCount: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATIONSTACK2D_GET_MODIFICATION_COUNT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATIONSTACK2D_SET_MODIFICATION_COUNT, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SKELETONMODIFICATIONSTACK2D, scriptIndex)
    return true
  }

  /**
   * Sets up the modification stack so it can execute. This function should be called by [godot.Skeleton2D] and shouldn't be manually called unless you know what you are doing.
   */
  public fun setup(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATIONSTACK2D_SETUP,
        NIL)
  }

  /**
   * Executes all of the [godot.SkeletonModification2D]s in the stack that use the same execution mode as the passed-in [executionMode], starting from index `0` to [modificationCount].
   *
   * **Note:** The order of the modifications can matter depending on the modifications. For example, modifications on a spine should operate before modifications on the arms in order to get proper results.
   */
  public fun execute(delta: Double, executionMode: Long): Unit {
    TransferContext.writeArguments(DOUBLE to delta, LONG to executionMode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATIONSTACK2D_EXECUTE,
        NIL)
  }

  /**
   * Enables all [godot.SkeletonModification2D]s in the stack.
   */
  public fun enableAllModifications(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATIONSTACK2D_ENABLE_ALL_MODIFICATIONS, NIL)
  }

  /**
   * Returns the [godot.SkeletonModification2D] at the passed-in index, [modIdx].
   */
  public fun getModification(modIdx: Long): SkeletonModification2D? {
    TransferContext.writeArguments(LONG to modIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATIONSTACK2D_GET_MODIFICATION, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as SkeletonModification2D?
  }

  /**
   * Adds the passed-in [godot.SkeletonModification2D] to the stack.
   */
  public fun addModification(modification: SkeletonModification2D): Unit {
    TransferContext.writeArguments(OBJECT to modification)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATIONSTACK2D_ADD_MODIFICATION, NIL)
  }

  /**
   * Deletes the [godot.SkeletonModification2D] at the index position [modIdx], if it exists.
   */
  public fun deleteModification(modIdx: Long): Unit {
    TransferContext.writeArguments(LONG to modIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATIONSTACK2D_DELETE_MODIFICATION, NIL)
  }

  /**
   * Sets the modification at [modIdx] to the passed-in modification, [modification].
   */
  public fun setModification(modIdx: Long, modification: SkeletonModification2D): Unit {
    TransferContext.writeArguments(LONG to modIdx, OBJECT to modification)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATIONSTACK2D_SET_MODIFICATION, NIL)
  }

  /**
   * Returns a boolean that indicates whether the modification stack is setup and can execute.
   */
  public fun getIsSetup(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATIONSTACK2D_GET_IS_SETUP, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the [godot.Skeleton2D] node that the SkeletonModificationStack2D is bound to.
   */
  public fun getSkeleton(): Skeleton2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATIONSTACK2D_GET_SKELETON, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Skeleton2D?
  }

  public companion object
}
