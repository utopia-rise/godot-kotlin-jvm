// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Signal0
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.jvm.JvmName

/**
 * [SkeletonModifier3D] retrieves a target [Skeleton3D] by having a [Skeleton3D] parent.
 *
 * If there is [AnimationMixer], modification always performs after playback process of the [AnimationMixer].
 *
 * This node should be used to implement custom IK solvers, constraints, or skeleton physics.
 */
@GodotBaseType
public open class SkeletonModifier3D : Node3D() {
  /**
   * Notifies when the modification have been finished.
   *
   * **Note:** If you want to get the modified bone pose by the modifier, you must use [Skeleton3D.getBonePose] or [Skeleton3D.getBoneGlobalPose] at the moment this signal is fired.
   */
  public val modificationProcessed: Signal0 by Signal0

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
   *
   * **Note:** This value is used by [Skeleton3D] to blend, so the [SkeletonModifier3D] should always apply only 100&#37; of the result without interpolation.
   */
  public final inline var influence: Float
    @JvmName("influenceProperty")
    get() = getInfluence()
    @JvmName("influenceProperty")
    set(`value`) {
      setInfluence(value)
    }

  override fun new(scriptIndex: Int) {
    createNativeObject(605, scriptIndex)
  }

  /**
   * Override this virtual method to implement a custom skeleton modifier. You should do things like get the [Skeleton3D]'s current pose and apply the pose here.
   *
   * [_processModification] must not apply [influence] to bone poses because the [Skeleton3D] automatically applies influence to all bone poses set by the modifier.
   */
  public open fun _processModification() {
    throw NotImplementedError("SkeletonModifier3D::_processModification is not implemented.")
  }

  /**
   * Get parent [Skeleton3D] node if found.
   */
  public final fun getSkeleton(): Skeleton3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSkeletonPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Skeleton3D?)
  }

  public final fun setActive(active: Boolean) {
    TransferContext.writeArguments(BOOL to active)
    TransferContext.callMethod(ptr, MethodBindings.setActivePtr, NIL)
  }

  public final fun isActive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isActivePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setInfluence(influence: Float) {
    TransferContext.writeArguments(DOUBLE to influence.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setInfluencePtr, NIL)
  }

  public final fun getInfluence(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInfluencePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public enum class BoneAxis(
    id: Long,
  ) {
    /**
     * Enumerated value for the +X axis.
     */
    PLUS_X(0),
    /**
     * Enumerated value for the -X axis.
     */
    MINUS_X(1),
    /**
     * Enumerated value for the +Y axis.
     */
    PLUS_Y(2),
    /**
     * Enumerated value for the -Y axis.
     */
    MINUS_Y(3),
    /**
     * Enumerated value for the +Z axis.
     */
    PLUS_Z(4),
    /**
     * Enumerated value for the -Z axis.
     */
    MINUS_Z(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): BoneAxis = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val getSkeletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModifier3D", "get_skeleton", 1_488_626_673)

    internal val setActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModifier3D", "set_active", 2_586_408_642)

    internal val isActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModifier3D", "is_active", 36_873_697)

    internal val setInfluencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModifier3D", "set_influence", 373_806_689)

    internal val getInfluencePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModifier3D", "get_influence", 1_740_695_150)
  }
}
