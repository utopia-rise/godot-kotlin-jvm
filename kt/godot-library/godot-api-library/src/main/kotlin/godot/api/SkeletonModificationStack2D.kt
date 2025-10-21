// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * This resource is used by the Skeleton and holds a stack of [SkeletonModification2D]s.
 *
 * This controls the order of the modifications and how they are applied. Modification order is
 * especially important for full-body IK setups, as you need to execute the modifications in the
 * correct order to get the desired results. For example, you want to execute a modification on the
 * spine *before* the arms on a humanoid skeleton.
 *
 * This resource also controls how strongly all of the modifications are applied to the
 * [Skeleton2D].
 */
@GodotBaseType
public open class SkeletonModificationStack2D : Resource() {
  /**
   * If `true`, the modification's in the stack will be called. This is handled automatically
   * through the [Skeleton2D] node.
   */
  public final inline var enabled: Boolean
    @JvmName("enabledProperty")
    get() = getEnabled()
    @JvmName("enabledProperty")
    set(`value`) {
      setEnabled(value)
    }

  /**
   * The interpolation strength of the modifications in stack. A value of `0` will make it where the
   * modifications are not applied, a strength of `0.5` will be half applied, and a strength of `1`
   * will allow the modifications to be fully applied and override the [Skeleton2D] [Bone2D] poses.
   */
  public final inline var strength: Float
    @JvmName("strengthProperty")
    get() = getStrength()
    @JvmName("strengthProperty")
    set(`value`) {
      setStrength(value)
    }

  /**
   * The number of modifications in the stack.
   */
  public final inline var modificationCount: Int
    @JvmName("modificationCountProperty")
    get() = getModificationCount()
    @JvmName("modificationCountProperty")
    set(`value`) {
      setModificationCount(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(621, scriptIndex)
  }

  /**
   * Sets up the modification stack so it can execute. This function should be called by
   * [Skeleton2D] and shouldn't be manually called unless you know what you are doing.
   */
  public final fun setup(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.setupPtr, NIL)
  }

  /**
   * Executes all of the [SkeletonModification2D]s in the stack that use the same execution mode as
   * the passed-in [executionMode], starting from index `0` to [modificationCount].
   *
   * **Note:** The order of the modifications can matter depending on the modifications. For
   * example, modifications on a spine should operate before modifications on the arms in order to get
   * proper results.
   */
  public final fun execute(delta: Float, executionMode: Int): Unit {
    TransferContext.writeArguments(DOUBLE to delta.toDouble(), LONG to executionMode.toLong())
    TransferContext.callMethod(ptr, MethodBindings.executePtr, NIL)
  }

  /**
   * Enables all [SkeletonModification2D]s in the stack.
   */
  public final fun enableAllModifications(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.enableAllModificationsPtr, NIL)
  }

  /**
   * Returns the [SkeletonModification2D] at the passed-in index, [modIdx].
   */
  public final fun getModification(modIdx: Int): SkeletonModification2D? {
    TransferContext.writeArguments(LONG to modIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getModificationPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as SkeletonModification2D?)
  }

  /**
   * Adds the passed-in [SkeletonModification2D] to the stack.
   */
  public final fun addModification(modification: SkeletonModification2D?): Unit {
    TransferContext.writeArguments(OBJECT to modification)
    TransferContext.callMethod(ptr, MethodBindings.addModificationPtr, NIL)
  }

  /**
   * Deletes the [SkeletonModification2D] at the index position [modIdx], if it exists.
   */
  public final fun deleteModification(modIdx: Int): Unit {
    TransferContext.writeArguments(LONG to modIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.deleteModificationPtr, NIL)
  }

  /**
   * Sets the modification at [modIdx] to the passed-in modification, [modification].
   */
  public final fun setModification(modIdx: Int, modification: SkeletonModification2D?): Unit {
    TransferContext.writeArguments(LONG to modIdx.toLong(), OBJECT to modification)
    TransferContext.callMethod(ptr, MethodBindings.setModificationPtr, NIL)
  }

  public final fun setModificationCount(count: Int): Unit {
    TransferContext.writeArguments(LONG to count.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setModificationCountPtr, NIL)
  }

  public final fun getModificationCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getModificationCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns a boolean that indicates whether the modification stack is setup and can execute.
   */
  public final fun getIsSetup(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getIsSetupPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setEnabledPtr, NIL)
  }

  public final fun getEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setStrength(strength: Float): Unit {
    TransferContext.writeArguments(DOUBLE to strength.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setStrengthPtr, NIL)
  }

  public final fun getStrength(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getStrengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the [Skeleton2D] node that the SkeletonModificationStack2D is bound to.
   */
  public final fun getSkeleton(): Skeleton2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSkeletonPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Skeleton2D?)
  }

  public companion object

  public object MethodBindings {
    internal val setupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "setup", 3218959716)

    internal val executePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "execute", 1005356550)

    internal val enableAllModificationsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "enable_all_modifications", 2586408642)

    internal val getModificationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "get_modification", 2570274329)

    internal val addModificationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "add_modification", 354162120)

    internal val deleteModificationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "delete_modification", 1286410249)

    internal val setModificationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "set_modification", 1098262544)

    internal val setModificationCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "set_modification_count", 1286410249)

    internal val getModificationCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "get_modification_count", 3905245786)

    internal val getIsSetupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "get_is_setup", 36873697)

    internal val setEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "set_enabled", 2586408642)

    internal val getEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "get_enabled", 36873697)

    internal val setStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "set_strength", 373806689)

    internal val getStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "get_strength", 1740695150)

    internal val getSkeletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModificationStack2D", "get_skeleton", 1697361217)
  }
}
