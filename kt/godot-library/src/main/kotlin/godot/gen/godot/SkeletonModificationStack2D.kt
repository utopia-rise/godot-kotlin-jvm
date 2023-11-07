// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * This resource is used by the Skeleton and holds a stack of [SkeletonModification2D]s.
 * This controls the order of the modifications and how they are applied. Modification order is
 * especially important for full-body IK setups, as you need to execute the modifications in the
 * correct order to get the desired results. For example, you want to execute a modification on the
 * spine *before* the arms on a humanoid skeleton.
 * This resource also controls how strongly all of the modifications are applied to the
 * [Skeleton2D].
 */
@GodotBaseType
public open class SkeletonModificationStack2D : Resource() {
  /**
   * If `true`, the modification's in the stack will be called. This is handled automatically
   * through the [Skeleton2D] node.
   */
  public var enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnabledPtr, NIL)
    }

  /**
   * The interpolation strength of the modifications in stack. A value of `0` will make it where the
   * modifications are not applied, a strength of `0.5` will be half applied, and a strength of `1`
   * will allow the modifications to be fully applied and override the [Skeleton2D] [Bone2D] poses.
   */
  public var strength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStrengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setStrengthPtr, NIL)
    }

  /**
   * The number of modifications in the stack.
   */
  public var modificationCount: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getModificationCountPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setModificationCountPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SKELETONMODIFICATIONSTACK2D, scriptIndex)
    return true
  }

  /**
   * Sets up the modification stack so it can execute. This function should be called by
   * [Skeleton2D] and shouldn't be manually called unless you know what you are doing.
   */
  public fun setup(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.setupPtr, NIL)
  }

  /**
   * Executes all of the [SkeletonModification2D]s in the stack that use the same execution mode as
   * the passed-in [param execution_mode], starting from index `0` to [modificationCount].
   * **Note:** The order of the modifications can matter depending on the modifications. For
   * example, modifications on a spine should operate before modifications on the arms in order to get
   * proper results.
   */
  public fun execute(delta: Float, executionMode: Int): Unit {
    TransferContext.writeArguments(DOUBLE to delta.toDouble(), LONG to executionMode.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.executePtr, NIL)
  }

  /**
   * Enables all [SkeletonModification2D]s in the stack.
   */
  public fun enableAllModifications(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.enableAllModificationsPtr, NIL)
  }

  /**
   * Returns the [SkeletonModification2D] at the passed-in index, [param mod_idx].
   */
  public fun getModification(modIdx: Int): SkeletonModification2D? {
    TransferContext.writeArguments(LONG to modIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getModificationPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as SkeletonModification2D?)
  }

  /**
   * Adds the passed-in [SkeletonModification2D] to the stack.
   */
  public fun addModification(modification: SkeletonModification2D): Unit {
    TransferContext.writeArguments(OBJECT to modification)
    TransferContext.callMethod(rawPtr, MethodBindings.addModificationPtr, NIL)
  }

  /**
   * Deletes the [SkeletonModification2D] at the index position [param mod_idx], if it exists.
   */
  public fun deleteModification(modIdx: Int): Unit {
    TransferContext.writeArguments(LONG to modIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.deleteModificationPtr, NIL)
  }

  /**
   * Sets the modification at [param mod_idx] to the passed-in modification, [param modification].
   */
  public fun setModification(modIdx: Int, modification: SkeletonModification2D): Unit {
    TransferContext.writeArguments(LONG to modIdx.toLong(), OBJECT to modification)
    TransferContext.callMethod(rawPtr, MethodBindings.setModificationPtr, NIL)
  }

  /**
   * Returns a boolean that indicates whether the modification stack is setup and can execute.
   */
  public fun getIsSetup(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getIsSetupPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the [Skeleton2D] node that the SkeletonModificationStack2D is bound to.
   */
  public fun getSkeleton(): Skeleton2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSkeletonPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Skeleton2D?)
  }

  public companion object

  internal object MethodBindings {
    public val setupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "setup")

    public val executePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "execute")

    public val enableAllModificationsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "enable_all_modifications")

    public val getModificationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "get_modification")

    public val addModificationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "add_modification")

    public val deleteModificationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "delete_modification")

    public val setModificationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "set_modification")

    public val setModificationCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "set_modification_count")

    public val getModificationCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "get_modification_count")

    public val getIsSetupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "get_is_setup")

    public val setEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "set_enabled")

    public val getEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "get_enabled")

    public val setStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "set_strength")

    public val getStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "get_strength")

    public val getSkeletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "get_skeleton")
  }
}
