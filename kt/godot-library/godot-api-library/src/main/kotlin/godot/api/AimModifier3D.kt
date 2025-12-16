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
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * This is a simple version of [LookAtModifier3D] that only allows bone to the reference without
 * advanced options such as angle limitation or time-based interpolation.
 *
 * The feature is simplified, but instead it is implemented with smooth tracking without euler, see
 * [setUseEuler].
 */
@GodotBaseType
public open class AimModifier3D : BoneConstraint3D() {
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
    createNativeObject(7, scriptPtr)
  }

  /**
   * Sets the forward axis of the bone.
   */
  public final fun setForwardAxis(index: Int, axis: SkeletonModifier3D.BoneAxis): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to axis.value)
    TransferContext.callMethod(ptr, MethodBindings.setForwardAxisPtr, NIL)
  }

  /**
   * Returns the forward axis of the bone.
   */
  public final fun getForwardAxis(index: Int): SkeletonModifier3D.BoneAxis {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getForwardAxisPtr, LONG)
    return SkeletonModifier3D.BoneAxis.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * If sets [enabled] to `true`, it provides rotation with using euler.
   *
   * If sets [enabled] to `false`, it provides rotation with using rotation by arc generated from
   * the forward axis vector and the vector toward the reference.
   */
  public final fun setUseEuler(index: Int, enabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setUseEulerPtr, NIL)
  }

  /**
   * Returns `true` if it provides rotation with using euler.
   */
  public final fun isUsingEuler(index: Int): Boolean {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isUsingEulerPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the axis of the first rotation. It is enabled only if [isUsingEuler] is `true`.
   */
  public final fun setPrimaryRotationAxis(index: Int, axis: Vector3.Axis): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to axis.value)
    TransferContext.callMethod(ptr, MethodBindings.setPrimaryRotationAxisPtr, NIL)
  }

  /**
   * Returns the axis of the first rotation. It is enabled only if [isUsingEuler] is `true`.
   */
  public final fun getPrimaryRotationAxis(index: Int): Vector3.Axis {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getPrimaryRotationAxisPtr, LONG)
    return Vector3.Axis.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * If sets [enabled] to `true`, it provides rotation by two axes. It is enabled only if
   * [isUsingEuler] is `true`.
   */
  public final fun setUseSecondaryRotation(index: Int, enabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setUseSecondaryRotationPtr, NIL)
  }

  /**
   * Returns `true` if it provides rotation by two axes. It is enabled only if [isUsingEuler] is
   * `true`.
   */
  public final fun isUsingSecondaryRotation(index: Int): Boolean {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isUsingSecondaryRotationPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  public object MethodBindings {
    internal val setForwardAxisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AimModifier3D", "set_forward_axis", 2496831085)

    internal val getForwardAxisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AimModifier3D", "get_forward_axis", 3949866735)

    internal val setUseEulerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AimModifier3D", "set_use_euler", 300928843)

    internal val isUsingEulerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AimModifier3D", "is_using_euler", 1116898809)

    internal val setPrimaryRotationAxisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AimModifier3D", "set_primary_rotation_axis", 776736805)

    internal val getPrimaryRotationAxisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AimModifier3D", "get_primary_rotation_axis", 4131134770)

    internal val setUseSecondaryRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AimModifier3D", "set_use_secondary_rotation", 300928843)

    internal val isUsingSecondaryRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AimModifier3D", "is_using_secondary_rotation", 1116898809)
  }
}
