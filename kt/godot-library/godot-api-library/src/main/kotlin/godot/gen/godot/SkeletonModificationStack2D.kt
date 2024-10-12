// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_SKELETONMODIFICATIONSTACK2D_INDEX: Int = 594

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
    Internals.callConstructor(this, ENGINE_CLASS_SKELETONMODIFICATIONSTACK2D_INDEX, scriptIndex)
  }

  /**
   * Sets up the modification stack so it can execute. This function should be called by
   * [Skeleton2D] and shouldn't be manually called unless you know what you are doing.
   */
  public final fun setup(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.setupPtr, NIL)
  }

  /**
   * Executes all of the [SkeletonModification2D]s in the stack that use the same execution mode as
   * the passed-in [executionMode], starting from index `0` to [modificationCount].
   * **Note:** The order of the modifications can matter depending on the modifications. For
   * example, modifications on a spine should operate before modifications on the arms in order to get
   * proper results.
   */
  public final fun execute(delta: Float, executionMode: Int): Unit {
    Internals.writeArguments(DOUBLE to delta.toDouble(), LONG to executionMode.toLong())
    Internals.callMethod(rawPtr, MethodBindings.executePtr, NIL)
  }

  /**
   * Enables all [SkeletonModification2D]s in the stack.
   */
  public final fun enableAllModifications(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.enableAllModificationsPtr, NIL)
  }

  /**
   * Returns the [SkeletonModification2D] at the passed-in index, [modIdx].
   */
  public final fun getModification(modIdx: Int): SkeletonModification2D? {
    Internals.writeArguments(LONG to modIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getModificationPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as SkeletonModification2D?)
  }

  /**
   * Adds the passed-in [SkeletonModification2D] to the stack.
   */
  public final fun addModification(modification: SkeletonModification2D?): Unit {
    Internals.writeArguments(OBJECT to modification)
    Internals.callMethod(rawPtr, MethodBindings.addModificationPtr, NIL)
  }

  /**
   * Deletes the [SkeletonModification2D] at the index position [modIdx], if it exists.
   */
  public final fun deleteModification(modIdx: Int): Unit {
    Internals.writeArguments(LONG to modIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.deleteModificationPtr, NIL)
  }

  /**
   * Sets the modification at [modIdx] to the passed-in modification, [modification].
   */
  public final fun setModification(modIdx: Int, modification: SkeletonModification2D?): Unit {
    Internals.writeArguments(LONG to modIdx.toLong(), OBJECT to modification)
    Internals.callMethod(rawPtr, MethodBindings.setModificationPtr, NIL)
  }

  public final fun setModificationCount(count: Int): Unit {
    Internals.writeArguments(LONG to count.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setModificationCountPtr, NIL)
  }

  public final fun getModificationCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getModificationCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns a boolean that indicates whether the modification stack is setup and can execute.
   */
  public final fun getIsSetup(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getIsSetupPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setEnabled(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setEnabledPtr, NIL)
  }

  public final fun getEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setStrength(strength: Float): Unit {
    Internals.writeArguments(DOUBLE to strength.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setStrengthPtr, NIL)
  }

  public final fun getStrength(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getStrengthPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the [Skeleton2D] node that the SkeletonModificationStack2D is bound to.
   */
  public final fun getSkeleton(): Skeleton2D? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSkeletonPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Skeleton2D?)
  }

  public companion object

  public object MethodBindings {
    internal val setupPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModificationStack2D", "setup", 3218959716)

    internal val executePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModificationStack2D", "execute", 1005356550)

    internal val enableAllModificationsPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModificationStack2D", "enable_all_modifications", 2586408642)

    internal val getModificationPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModificationStack2D", "get_modification", 2570274329)

    internal val addModificationPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModificationStack2D", "add_modification", 354162120)

    internal val deleteModificationPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModificationStack2D", "delete_modification", 1286410249)

    internal val setModificationPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModificationStack2D", "set_modification", 1098262544)

    internal val setModificationCountPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModificationStack2D", "set_modification_count", 1286410249)

    internal val getModificationCountPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModificationStack2D", "get_modification_count", 3905245786)

    internal val getIsSetupPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModificationStack2D", "get_is_setup", 36873697)

    internal val setEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModificationStack2D", "set_enabled", 2586408642)

    internal val getEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModificationStack2D", "get_enabled", 36873697)

    internal val setStrengthPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModificationStack2D", "set_strength", 373806689)

    internal val getStrengthPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModificationStack2D", "get_strength", 1740695150)

    internal val getSkeletonPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModificationStack2D", "get_skeleton", 1697361217)
  }
}
