// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Signal0
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.core.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * [SkeletonModifier3D] retrieves a target [Skeleton3D] by having a [Skeleton3D] parent.
 * If there is [AnimationMixer], modification always performs after playback process of the
 * [AnimationMixer].
 * This node should be used to implement custom IK solvers, constraints, or skeleton physics.
 */
@GodotBaseType
public open class SkeletonModifier3D : Node3D() {
  /**
   * Notifies when the modification have been finished.
   * **Note:** If you want to get the modified bone pose by the modifier, you must use
   * [Skeleton3D.getBonePose] or [Skeleton3D.getBoneGlobalPose] at the moment this signal is fired.
   */
  public val modificationProcessed: Signal0 by signal()

  /**
   * If `true`, the [SkeletonModifier3D] will be processing.
   */
  public final inline var active: Boolean
    @JvmName("activeProperty")
    get() = isActive()
    @JvmName("activeProperty")
    set(`value`) {
      setActive(value)
    }

  /**
   * Sets the influence of the modification.
   * **Note:** This value is used by [Skeleton3D] to blend, so the [SkeletonModifier3D] should
   * always apply only 100&#37; of the result without interpolation.
   */
  public final inline var influence: Float
    @JvmName("influenceProperty")
    get() = getInfluence()
    @JvmName("influenceProperty")
    set(`value`) {
      setInfluence(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_SKELETONMODIFIER3D, scriptIndex)
  }

  /**
   * Override this virtual method to implement a custom skeleton modifier. You should do things like
   * get the [Skeleton3D]'s current pose and apply the pose here.
   * [_processModification] must not apply [influence] to bone poses because the [Skeleton3D]
   * automatically applies influence to all bone poses set by the modifier.
   */
  public open fun _processModification(): Unit {
  }

  /**
   * Get parent [Skeleton3D] node if found.
   */
  public final fun getSkeleton(): Skeleton3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSkeletonPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Skeleton3D?)
  }

  public final fun setActive(active: Boolean): Unit {
    TransferContext.writeArguments(BOOL to active)
    TransferContext.callMethod(rawPtr, MethodBindings.setActivePtr, NIL)
  }

  public final fun isActive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isActivePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setInfluence(influence: Float): Unit {
    TransferContext.writeArguments(DOUBLE to influence.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setInfluencePtr, NIL)
  }

  public final fun getInfluence(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getInfluencePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  internal object MethodBindings {
    public val getSkeletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModifier3D", "get_skeleton", 1488626673)

    public val setActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModifier3D", "set_active", 2586408642)

    public val isActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModifier3D", "is_active", 36873697)

    public val setInfluencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModifier3D", "set_influence", 373806689)

    public val getInfluencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModifier3D", "get_influence", 1740695150)
  }
}
