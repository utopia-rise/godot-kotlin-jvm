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
import godot.core.GodotEnum
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Apply the copied transform of the bone set by [BoneConstraint3D.setReferenceBone] to the bone set
 * by [BoneConstraint3D.setApplyBone] about the specific axis with remapping it with some options.
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
public open class ConvertTransformModifier3D : BoneConstraint3D() {
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

  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(181, scriptPtr)
  }

  /**
   * Sets the operation of the remapping destination transform.
   */
  public final fun setApplyTransformMode(index: Int, transformMode: TransformMode): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to transformMode.value)
    TransferContext.callMethod(ptr, MethodBindings.setApplyTransformModePtr, NIL)
  }

  /**
   * Returns the operation of the remapping destination transform.
   */
  public final fun getApplyTransformMode(index: Int): TransformMode {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getApplyTransformModePtr, LONG)
    return TransformMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the axis of the remapping destination transform.
   */
  public final fun setApplyAxis(index: Int, axis: Vector3.Axis): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to axis.value)
    TransferContext.callMethod(ptr, MethodBindings.setApplyAxisPtr, NIL)
  }

  /**
   * Returns the axis of the remapping destination transform.
   */
  public final fun getApplyAxis(index: Int): Vector3.Axis {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getApplyAxisPtr, LONG)
    return Vector3.Axis.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the minimum value of the remapping destination range.
   */
  public final fun setApplyRangeMin(index: Int, rangeMin: Float): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), DOUBLE to rangeMin.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setApplyRangeMinPtr, NIL)
  }

  /**
   * Returns the minimum value of the remapping destination range.
   */
  public final fun getApplyRangeMin(index: Int): Float {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getApplyRangeMinPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the maximum value of the remapping destination range.
   */
  public final fun setApplyRangeMax(index: Int, rangeMax: Float): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), DOUBLE to rangeMax.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setApplyRangeMaxPtr, NIL)
  }

  /**
   * Returns the maximum value of the remapping destination range.
   */
  public final fun getApplyRangeMax(index: Int): Float {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getApplyRangeMaxPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the operation of the remapping source transform.
   */
  public final fun setReferenceTransformMode(index: Int, transformMode: TransformMode): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to transformMode.value)
    TransferContext.callMethod(ptr, MethodBindings.setReferenceTransformModePtr, NIL)
  }

  /**
   * Returns the operation of the remapping source transform.
   */
  public final fun getReferenceTransformMode(index: Int): TransformMode {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getReferenceTransformModePtr, LONG)
    return TransformMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the axis of the remapping source transform.
   */
  public final fun setReferenceAxis(index: Int, axis: Vector3.Axis): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to axis.value)
    TransferContext.callMethod(ptr, MethodBindings.setReferenceAxisPtr, NIL)
  }

  /**
   * Returns the axis of the remapping source transform.
   */
  public final fun getReferenceAxis(index: Int): Vector3.Axis {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getReferenceAxisPtr, LONG)
    return Vector3.Axis.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the minimum value of the remapping source range.
   */
  public final fun setReferenceRangeMin(index: Int, rangeMin: Float): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), DOUBLE to rangeMin.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setReferenceRangeMinPtr, NIL)
  }

  /**
   * Returns the minimum value of the remapping source range.
   */
  public final fun getReferenceRangeMin(index: Int): Float {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getReferenceRangeMinPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the maximum value of the remapping source range.
   */
  public final fun setReferenceRangeMax(index: Int, rangeMax: Float): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), DOUBLE to rangeMax.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setReferenceRangeMaxPtr, NIL)
  }

  /**
   * Returns the maximum value of the remapping source range.
   */
  public final fun getReferenceRangeMax(index: Int): Float {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getReferenceRangeMaxPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
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

  public enum class TransformMode(
    `value`: Long,
  ) : GodotEnum {
    /**
     * Convert with position. Transfer the difference.
     */
    POSITION(0),
    /**
     * Convert with rotation. The angle is the roll for the specified axis.
     */
    ROTATION(1),
    /**
     * Convert with scale. Transfers the ratio, not the difference.
     */
    SCALE(2),
    ;

    public override val `value`: Long
    init {
      this.`value` = `value`
    }

    public companion object {
      public fun from(`value`: Long): TransformMode = entries.single { it.`value` == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setApplyTransformModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConvertTransformModifier3D", "set_apply_transform_mode", 1386463405)

    internal val getApplyTransformModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConvertTransformModifier3D", "get_apply_transform_mode", 3234663511)

    internal val setApplyAxisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConvertTransformModifier3D", "set_apply_axis", 776736805)

    internal val getApplyAxisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConvertTransformModifier3D", "get_apply_axis", 4131134770)

    internal val setApplyRangeMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConvertTransformModifier3D", "set_apply_range_min", 1602489585)

    internal val getApplyRangeMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConvertTransformModifier3D", "get_apply_range_min", 2339986948)

    internal val setApplyRangeMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConvertTransformModifier3D", "set_apply_range_max", 1602489585)

    internal val getApplyRangeMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConvertTransformModifier3D", "get_apply_range_max", 2339986948)

    internal val setReferenceTransformModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConvertTransformModifier3D", "set_reference_transform_mode", 1386463405)

    internal val getReferenceTransformModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConvertTransformModifier3D", "get_reference_transform_mode", 3234663511)

    internal val setReferenceAxisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConvertTransformModifier3D", "set_reference_axis", 776736805)

    internal val getReferenceAxisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConvertTransformModifier3D", "get_reference_axis", 4131134770)

    internal val setReferenceRangeMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConvertTransformModifier3D", "set_reference_range_min", 1602489585)

    internal val getReferenceRangeMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConvertTransformModifier3D", "get_reference_range_min", 2339986948)

    internal val setReferenceRangeMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConvertTransformModifier3D", "set_reference_range_max", 1602489585)

    internal val getReferenceRangeMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConvertTransformModifier3D", "get_reference_range_max", 2339986948)

    internal val setRelativePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConvertTransformModifier3D", "set_relative", 300928843)

    internal val isRelativePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConvertTransformModifier3D", "is_relative", 1116898809)

    internal val setAdditivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConvertTransformModifier3D", "set_additive", 300928843)

    internal val isAdditivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ConvertTransformModifier3D", "is_additive", 1116898809)
  }
}
