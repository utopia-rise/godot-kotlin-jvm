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
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmField
import kotlin.jvm.JvmName

public infix fun Long.or(other: CopyTransformModifier3D.TransformFlag): Long = this.or(other.flag)

public infix fun Long.xor(other: CopyTransformModifier3D.TransformFlag): Long = this.xor(other.flag)

public infix fun Long.and(other: CopyTransformModifier3D.TransformFlag): Long = this.and(other.flag)

public infix fun Long.or(other: CopyTransformModifier3D.AxisFlag): Long = this.or(other.flag)

public infix fun Long.xor(other: CopyTransformModifier3D.AxisFlag): Long = this.xor(other.flag)

public infix fun Long.and(other: CopyTransformModifier3D.AxisFlag): Long = this.and(other.flag)

/**
 * Apply the copied transform of the bone set by [BoneConstraint3D.setReferenceBone] to the bone set
 * by [BoneConstraint3D.setApplyBone] with processing it with some masks and options.
 *
 * There are 4 ways to apply the transform, depending on the combination of [setRelative] and
 * [setAdditive].
 *
 * **Relative + Additive:**
 *
 * - Extract reference pose relative to the rest and add it to the apply bone's pose.
 *
 * **Relative + Not Additive:**
 *
 * - Extract reference pose relative to the rest and add it to the apply bone's rest.
 *
 * **Not Relative + Additive:**
 *
 * - Extract reference pose absolutely and add it to the apply bone's pose.
 *
 * **Not Relative + Not Additive:**
 *
 * - Extract reference pose absolutely and the apply bone's pose is replaced with it.
 */
@GodotBaseType
public open class CopyTransformModifier3D : BoneConstraint3D() {
  /**
   * The number of settings in the modifier.
   */
  public final inline var settingCount: Int
    @JvmName("settingCountProperty")
    get() = getSettingCount()
    @JvmName("settingCountProperty")
    set(`value`) {
      setSettingCount(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(184, scriptIndex)
  }

  /**
   * Sets the flags to process the transform operations. If the flag is valid, the transform
   * operation is processed.
   *
   * **Note:** If the rotation is valid for only one axis, it respects the roll of the valid axis.
   * If the rotation is valid for two axes, it discards the roll of the invalid axis.
   */
  public final fun setCopyFlags(index: Int, copyFlags: TransformFlag): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to copyFlags.flag)
    TransferContext.callMethod(ptr, MethodBindings.setCopyFlagsPtr, NIL)
  }

  /**
   * Returns the copy flags of the setting at [index].
   */
  public final fun getCopyFlags(index: Int): TransformFlag {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getCopyFlagsPtr, LONG)
    return TransformFlag(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the flags to copy axes. If the flag is valid, the axis is copied.
   */
  public final fun setAxisFlags(index: Int, axisFlags: AxisFlag): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to axisFlags.flag)
    TransferContext.callMethod(ptr, MethodBindings.setAxisFlagsPtr, NIL)
  }

  /**
   * Returns the axis flags of the setting at [index].
   */
  public final fun getAxisFlags(index: Int): AxisFlag {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getAxisFlagsPtr, LONG)
    return AxisFlag(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the flags to inverte axes. If the flag is valid, the axis is copied.
   *
   * **Note:** An inverted scale means an inverse number, not a negative scale. For example,
   * inverting `2.0` means `0.5`.
   *
   * **Note:** An inverted rotation flips the elements of the quaternion. For example, a two-axis
   * inversion will flip the roll of each axis, and a three-axis inversion will flip the final
   * orientation. However, be aware that flipping only one axis may cause unintended rotation by the
   * unflipped axes, due to the characteristics of the quaternion.
   */
  public final fun setInvertFlags(index: Int, axisFlags: AxisFlag): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to axisFlags.flag)
    TransferContext.callMethod(ptr, MethodBindings.setInvertFlagsPtr, NIL)
  }

  /**
   * Returns the invert flags of the setting at [index].
   */
  public final fun getInvertFlags(index: Int): AxisFlag {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getInvertFlagsPtr, LONG)
    return AxisFlag(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * If sets [enabled] to `true`, the position will be copied.
   */
  public final fun setCopyPosition(index: Int, enabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setCopyPositionPtr, NIL)
  }

  /**
   * Returns `true` if the copy flags has the flag for the position in the setting at [index]. See
   * also [setCopyFlags].
   */
  public final fun isPositionCopying(index: Int): Boolean {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isPositionCopyingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If sets [enabled] to `true`, the rotation will be copied.
   */
  public final fun setCopyRotation(index: Int, enabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setCopyRotationPtr, NIL)
  }

  /**
   * Returns `true` if the copy flags has the flag for the rotation in the setting at [index]. See
   * also [setCopyFlags].
   */
  public final fun isRotationCopying(index: Int): Boolean {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isRotationCopyingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If sets [enabled] to `true`, the scale will be copied.
   */
  public final fun setCopyScale(index: Int, enabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setCopyScalePtr, NIL)
  }

  /**
   * Returns `true` if the copy flags has the flag for the scale in the setting at [index]. See also
   * [setCopyFlags].
   */
  public final fun isScaleCopying(index: Int): Boolean {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isScaleCopyingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If sets [enabled] to `true`, the X-axis will be copied.
   */
  public final fun setAxisXEnabled(index: Int, enabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setAxisXEnabledPtr, NIL)
  }

  /**
   * Returns `true` if the enable flags has the flag for the X-axis in the setting at [index]. See
   * also [setAxisFlags].
   */
  public final fun isAxisXEnabled(index: Int): Boolean {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isAxisXEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If sets [enabled] to `true`, the Y-axis will be copied.
   */
  public final fun setAxisYEnabled(index: Int, enabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setAxisYEnabledPtr, NIL)
  }

  /**
   * Returns `true` if the enable flags has the flag for the Y-axis in the setting at [index]. See
   * also [setAxisFlags].
   */
  public final fun isAxisYEnabled(index: Int): Boolean {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isAxisYEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If sets [enabled] to `true`, the Z-axis will be copied.
   */
  public final fun setAxisZEnabled(index: Int, enabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setAxisZEnabledPtr, NIL)
  }

  /**
   * Returns `true` if the enable flags has the flag for the Z-axis in the setting at [index]. See
   * also [setAxisFlags].
   */
  public final fun isAxisZEnabled(index: Int): Boolean {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isAxisZEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If sets [enabled] to `true`, the X-axis will be inverted.
   */
  public final fun setAxisXInverted(index: Int, enabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setAxisXInvertedPtr, NIL)
  }

  /**
   * Returns `true` if the invert flags has the flag for the X-axis in the setting at [index]. See
   * also [setInvertFlags].
   */
  public final fun isAxisXInverted(index: Int): Boolean {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isAxisXInvertedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If sets [enabled] to `true`, the Y-axis will be inverted.
   */
  public final fun setAxisYInverted(index: Int, enabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setAxisYInvertedPtr, NIL)
  }

  /**
   * Returns `true` if the invert flags has the flag for the Y-axis in the setting at [index]. See
   * also [setInvertFlags].
   */
  public final fun isAxisYInverted(index: Int): Boolean {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isAxisYInvertedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If sets [enabled] to `true`, the Z-axis will be inverted.
   */
  public final fun setAxisZInverted(index: Int, enabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setAxisZInvertedPtr, NIL)
  }

  /**
   * Returns `true` if the invert flags has the flag for the Z-axis in the setting at [index]. See
   * also [setInvertFlags].
   */
  public final fun isAxisZInverted(index: Int): Boolean {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isAxisZInvertedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets relative option in the setting at [index] to [enabled].
   *
   * If sets [enabled] to `true`, the extracted and applying transform is relative to the rest.
   *
   * If sets [enabled] to `false`, the extracted transform is absolute.
   */
  public final fun setRelative(index: Int, enabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setRelativePtr, NIL)
  }

  /**
   * Returns `true` if the relative option is enabled in the setting at [index].
   */
  public final fun isRelative(index: Int): Boolean {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isRelativePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets additive option in the setting at [index] to [enabled]. This mainly affects the process of
   * applying transform to the [BoneConstraint3D.setApplyBone].
   *
   * If sets [enabled] to `true`, the processed transform is added to the pose of the current apply
   * bone.
   *
   * If sets [enabled] to `false`, the pose of the current apply bone is replaced with the processed
   * transform. However, if set [setRelative] to `true`, the transform is relative to rest.
   */
  public final fun setAdditive(index: Int, enabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setAdditivePtr, NIL)
  }

  /**
   * Returns `true` if the additive option is enabled in the setting at [index].
   */
  public final fun isAdditive(index: Int): Boolean {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isAdditivePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public class TransformFlag(
    public val flag: Long,
  ) {
    public infix fun or(other: TransformFlag): TransformFlag = TransformFlag(flag.or(other.flag))

    public infix fun or(other: Long): TransformFlag = TransformFlag(flag.or(other))

    public infix fun xor(other: TransformFlag): TransformFlag = TransformFlag(flag.xor(other.flag))

    public infix fun xor(other: Long): TransformFlag = TransformFlag(flag.xor(other))

    public infix fun and(other: TransformFlag): TransformFlag = TransformFlag(flag.and(other.flag))

    public infix fun and(other: Long): TransformFlag = TransformFlag(flag.and(other))

    public fun unaryPlus(): TransformFlag = TransformFlag(flag.unaryPlus())

    public fun unaryMinus(): TransformFlag = TransformFlag(flag.unaryMinus())

    public fun inv(): TransformFlag = TransformFlag(flag.inv())

    public infix fun shl(bits: Int): TransformFlag = TransformFlag(flag shl bits)

    public infix fun shr(bits: Int): TransformFlag = TransformFlag(flag shr bits)

    public infix fun ushr(bits: Int): TransformFlag = TransformFlag(flag ushr bits)

    public companion object {
      /**
       * If set, allows to copy the position.
       */
      @JvmField
      public val POSITION: TransformFlag = TransformFlag(1)

      /**
       * If set, allows to copy the rotation.
       */
      @JvmField
      public val ROTATION: TransformFlag = TransformFlag(2)

      /**
       * If set, allows to copy the scale.
       */
      @JvmField
      public val SCALE: TransformFlag = TransformFlag(4)

      /**
       * If set, allows to copy the position/rotation/scale.
       */
      @JvmField
      public val ALL: TransformFlag = TransformFlag(7)
    }
  }

  public class AxisFlag(
    public val flag: Long,
  ) {
    public infix fun or(other: AxisFlag): AxisFlag = AxisFlag(flag.or(other.flag))

    public infix fun or(other: Long): AxisFlag = AxisFlag(flag.or(other))

    public infix fun xor(other: AxisFlag): AxisFlag = AxisFlag(flag.xor(other.flag))

    public infix fun xor(other: Long): AxisFlag = AxisFlag(flag.xor(other))

    public infix fun and(other: AxisFlag): AxisFlag = AxisFlag(flag.and(other.flag))

    public infix fun and(other: Long): AxisFlag = AxisFlag(flag.and(other))

    public fun unaryPlus(): AxisFlag = AxisFlag(flag.unaryPlus())

    public fun unaryMinus(): AxisFlag = AxisFlag(flag.unaryMinus())

    public fun inv(): AxisFlag = AxisFlag(flag.inv())

    public infix fun shl(bits: Int): AxisFlag = AxisFlag(flag shl bits)

    public infix fun shr(bits: Int): AxisFlag = AxisFlag(flag shr bits)

    public infix fun ushr(bits: Int): AxisFlag = AxisFlag(flag ushr bits)

    public companion object {
      /**
       * If set, allows to process the X-axis.
       */
      @JvmField
      public val X: AxisFlag = AxisFlag(1)

      /**
       * If set, allows to process the Y-axis.
       */
      @JvmField
      public val Y: AxisFlag = AxisFlag(2)

      /**
       * If set, allows to process the Z-axis.
       */
      @JvmField
      public val Z: AxisFlag = AxisFlag(4)

      /**
       * If set, allows to process the all axes.
       */
      @JvmField
      public val ALL: AxisFlag = AxisFlag(7)
    }
  }

  public companion object

  public object MethodBindings {
    internal val setCopyFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CopyTransformModifier3D", "set_copy_flags", 2252507859)

    internal val getCopyFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CopyTransformModifier3D", "get_copy_flags", 1685185931)

    internal val setAxisFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CopyTransformModifier3D", "set_axis_flags", 2044211897)

    internal val getAxisFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CopyTransformModifier3D", "get_axis_flags", 992162046)

    internal val setInvertFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CopyTransformModifier3D", "set_invert_flags", 2044211897)

    internal val getInvertFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CopyTransformModifier3D", "get_invert_flags", 992162046)

    internal val setCopyPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CopyTransformModifier3D", "set_copy_position", 300928843)

    internal val isPositionCopyingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CopyTransformModifier3D", "is_position_copying", 1116898809)

    internal val setCopyRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CopyTransformModifier3D", "set_copy_rotation", 300928843)

    internal val isRotationCopyingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CopyTransformModifier3D", "is_rotation_copying", 1116898809)

    internal val setCopyScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CopyTransformModifier3D", "set_copy_scale", 300928843)

    internal val isScaleCopyingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CopyTransformModifier3D", "is_scale_copying", 1116898809)

    internal val setAxisXEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CopyTransformModifier3D", "set_axis_x_enabled", 300928843)

    internal val isAxisXEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CopyTransformModifier3D", "is_axis_x_enabled", 1116898809)

    internal val setAxisYEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CopyTransformModifier3D", "set_axis_y_enabled", 300928843)

    internal val isAxisYEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CopyTransformModifier3D", "is_axis_y_enabled", 1116898809)

    internal val setAxisZEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CopyTransformModifier3D", "set_axis_z_enabled", 300928843)

    internal val isAxisZEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CopyTransformModifier3D", "is_axis_z_enabled", 1116898809)

    internal val setAxisXInvertedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CopyTransformModifier3D", "set_axis_x_inverted", 300928843)

    internal val isAxisXInvertedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CopyTransformModifier3D", "is_axis_x_inverted", 1116898809)

    internal val setAxisYInvertedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CopyTransformModifier3D", "set_axis_y_inverted", 300928843)

    internal val isAxisYInvertedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CopyTransformModifier3D", "is_axis_y_inverted", 1116898809)

    internal val setAxisZInvertedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CopyTransformModifier3D", "set_axis_z_inverted", 300928843)

    internal val isAxisZInvertedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CopyTransformModifier3D", "is_axis_z_inverted", 1116898809)

    internal val setRelativePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CopyTransformModifier3D", "set_relative", 300928843)

    internal val isRelativePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CopyTransformModifier3D", "is_relative", 1116898809)

    internal val setAdditivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CopyTransformModifier3D", "set_additive", 300928843)

    internal val isAdditivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CopyTransformModifier3D", "is_additive", 1116898809)
  }
}
