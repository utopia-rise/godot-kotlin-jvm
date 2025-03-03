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
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

public infix fun Long.or(other: godot.api.RetargetModifier3D.TransformFlag): Long =
    this.or(other.flag)

public infix fun Long.xor(other: godot.api.RetargetModifier3D.TransformFlag): Long =
    this.xor(other.flag)

public infix fun Long.and(other: godot.api.RetargetModifier3D.TransformFlag): Long =
    this.and(other.flag)

public operator fun Long.plus(other: godot.api.RetargetModifier3D.TransformFlag): Long =
    this.plus(other.flag)

public operator fun Long.minus(other: godot.api.RetargetModifier3D.TransformFlag): Long =
    this.minus(other.flag)

public operator fun Long.times(other: godot.api.RetargetModifier3D.TransformFlag): Long =
    this.times(other.flag)

public operator fun Long.div(other: godot.api.RetargetModifier3D.TransformFlag): Long =
    this.div(other.flag)

public operator fun Long.rem(other: godot.api.RetargetModifier3D.TransformFlag): Long =
    this.rem(other.flag)

/**
 * Retrieves the pose (or global pose) relative to the parent Skeleton's rest in model space and
 * transfers it to the child Skeleton.
 * This modifier rewrites the pose of the child skeleton directly in the parent skeleton's update
 * process. This means that it overwrites the mapped bone pose set in the normal process on the target
 * skeleton. If you want to set the target skeleton bone pose after retargeting, you will need to add a
 * [SkeletonModifier3D] child to the target skeleton and thereby modify the pose.
 * **Note:** When the [useGlobalPose] is enabled, even if it is an unmapped bone, it can cause
 * visual problems because the global pose is applied ignoring the parent bone's pose **if it has
 * mapped bone children**. See also [useGlobalPose].
 */
@GodotBaseType
public open class RetargetModifier3D : SkeletonModifier3D() {
  /**
   * [SkeletonProfile] for retargeting bones with names matching the bone list.
   */
  public final inline var profile: SkeletonProfile?
    @JvmName("profileProperty")
    get() = getProfile()
    @JvmName("profileProperty")
    set(`value`) {
      setProfile(value)
    }

  /**
   * If `false`, in case the target skeleton has fewer bones than the source skeleton, the source
   * bone parent's transform will be ignored.
   * Instead, it is possible to retarget between models with different body shapes, and position,
   * rotation, and scale can be retargeted separately.
   * If `true`, retargeting is performed taking into account global pose.
   * In case the target skeleton has fewer bones than the source skeleton, the source bone parent's
   * transform is taken into account. However, bone length between skeletons must match exactly, if
   * not, the bones will be forced to expand or shrink.
   * This is useful for using dummy bone with length `0` to match postures when retargeting between
   * models with different number of bones.
   */
  public final inline var useGlobalPose: Boolean
    @JvmName("useGlobalPoseProperty")
    get() = isUsingGlobalPose()
    @JvmName("useGlobalPoseProperty")
    set(`value`) {
      setUseGlobalPose(value)
    }

  /**
   * Flags to control the process of the transform elements individually when [useGlobalPose] is
   * disabled.
   */
  public final inline var enable: TransformFlag
    @JvmName("enableProperty")
    get() = getEnableFlags()
    @JvmName("enableProperty")
    set(`value`) {
      setEnableFlags(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(569, scriptIndex)
  }

  public final fun setProfile(profile: SkeletonProfile?): Unit {
    TransferContext.writeArguments(OBJECT to profile)
    TransferContext.callMethod(ptr, MethodBindings.setProfilePtr, NIL)
  }

  public final fun getProfile(): SkeletonProfile? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getProfilePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as SkeletonProfile?)
  }

  public final fun setUseGlobalPose(useGlobalPose: Boolean): Unit {
    TransferContext.writeArguments(BOOL to useGlobalPose)
    TransferContext.callMethod(ptr, MethodBindings.setUseGlobalPosePtr, NIL)
  }

  public final fun isUsingGlobalPose(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isUsingGlobalPosePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setEnableFlags(enableFlags: TransformFlag): Unit {
    TransferContext.writeArguments(LONG to enableFlags.flag)
    TransferContext.callMethod(ptr, MethodBindings.setEnableFlagsPtr, NIL)
  }

  public final fun getEnableFlags(): TransformFlag {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEnableFlagsPtr, LONG)
    return TransformFlagValue(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets [TRANSFORM_FLAG_POSITION] into [enable].
   */
  public final fun setPositionEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setPositionEnabledPtr, NIL)
  }

  /**
   * Returns `true` if [enable] has [TRANSFORM_FLAG_POSITION].
   */
  public final fun isPositionEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isPositionEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets [TRANSFORM_FLAG_ROTATION] into [enable].
   */
  public final fun setRotationEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setRotationEnabledPtr, NIL)
  }

  /**
   * Returns `true` if [enable] has [TRANSFORM_FLAG_ROTATION].
   */
  public final fun isRotationEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isRotationEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets [TRANSFORM_FLAG_SCALE] into [enable].
   */
  public final fun setScaleEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setScaleEnabledPtr, NIL)
  }

  /**
   * Returns `true` if [enable] has [TRANSFORM_FLAG_SCALE].
   */
  public final fun isScaleEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isScaleEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public sealed interface TransformFlag {
    public val flag: Long

    public infix fun or(other: TransformFlag): TransformFlag =
        TransformFlagValue(flag.or(other.flag))

    public infix fun or(other: Long): TransformFlag = TransformFlagValue(flag.or(other))

    public infix fun xor(other: TransformFlag): TransformFlag =
        TransformFlagValue(flag.xor(other.flag))

    public infix fun xor(other: Long): TransformFlag = TransformFlagValue(flag.xor(other))

    public infix fun and(other: TransformFlag): TransformFlag =
        TransformFlagValue(flag.and(other.flag))

    public infix fun and(other: Long): TransformFlag = TransformFlagValue(flag.and(other))

    public operator fun plus(other: TransformFlag): TransformFlag =
        TransformFlagValue(flag.plus(other.flag))

    public operator fun plus(other: Long): TransformFlag = TransformFlagValue(flag.plus(other))

    public operator fun minus(other: TransformFlag): TransformFlag =
        TransformFlagValue(flag.minus(other.flag))

    public operator fun minus(other: Long): TransformFlag = TransformFlagValue(flag.minus(other))

    public operator fun times(other: TransformFlag): TransformFlag =
        TransformFlagValue(flag.times(other.flag))

    public operator fun times(other: Long): TransformFlag = TransformFlagValue(flag.times(other))

    public operator fun div(other: TransformFlag): TransformFlag =
        TransformFlagValue(flag.div(other.flag))

    public operator fun div(other: Long): TransformFlag = TransformFlagValue(flag.div(other))

    public operator fun rem(other: TransformFlag): TransformFlag =
        TransformFlagValue(flag.rem(other.flag))

    public operator fun rem(other: Long): TransformFlag = TransformFlagValue(flag.rem(other))

    public fun unaryPlus(): TransformFlag = TransformFlagValue(flag.unaryPlus())

    public fun unaryMinus(): TransformFlag = TransformFlagValue(flag.unaryMinus())

    public fun inv(): TransformFlag = TransformFlagValue(flag.inv())

    public infix fun shl(bits: Int): TransformFlag = TransformFlagValue(flag shl bits)

    public infix fun shr(bits: Int): TransformFlag = TransformFlagValue(flag shr bits)

    public infix fun ushr(bits: Int): TransformFlag = TransformFlagValue(flag ushr bits)

    public companion object {
      public val TRANSFORM_FLAG_POSITION: TransformFlag = TransformFlagValue(1)

      public val TRANSFORM_FLAG_ROTATION: TransformFlag = TransformFlagValue(2)

      public val TRANSFORM_FLAG_SCALE: TransformFlag = TransformFlagValue(4)

      public val TRANSFORM_FLAG_ALL: TransformFlag = TransformFlagValue(7)
    }
  }

  @JvmInline
  public value class TransformFlagValue(
    public override val flag: Long,
  ) : TransformFlag

  public companion object

  public object MethodBindings {
    internal val setProfilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RetargetModifier3D", "set_profile", 3870374136)

    internal val getProfilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RetargetModifier3D", "get_profile", 4291782652)

    internal val setUseGlobalPosePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RetargetModifier3D", "set_use_global_pose", 2586408642)

    internal val isUsingGlobalPosePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RetargetModifier3D", "is_using_global_pose", 36873697)

    internal val setEnableFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RetargetModifier3D", "set_enable_flags", 2687954213)

    internal val getEnableFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RetargetModifier3D", "get_enable_flags", 358995420)

    internal val setPositionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RetargetModifier3D", "set_position_enabled", 2586408642)

    internal val isPositionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RetargetModifier3D", "is_position_enabled", 36873697)

    internal val setRotationEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RetargetModifier3D", "set_rotation_enabled", 2586408642)

    internal val isRotationEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RetargetModifier3D", "is_rotation_enabled", 36873697)

    internal val setScaleEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RetargetModifier3D", "set_scale_enabled", 2586408642)

    internal val isScaleEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RetargetModifier3D", "is_scale_enabled", 36873697)
  }
}
