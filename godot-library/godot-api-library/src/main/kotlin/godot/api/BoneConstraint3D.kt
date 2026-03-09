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
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class of [SkeletonModifier3D] that modifies the bone set in [setApplyBone] based on the
 * transform of the bone retrieved by [getReferenceBone].
 */
@GodotBaseType
public open class BoneConstraint3D : SkeletonModifier3D() {
  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(109, scriptPtr)
  }

  /**
   * Sets the apply amount of the setting at [index] to [amount].
   */
  public final fun setAmount(index: Int, amount: Float): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), DOUBLE to amount.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setAmountPtr, NIL)
  }

  /**
   * Returns the apply amount of the setting at [index].
   */
  public final fun getAmount(index: Int): Float {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getAmountPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the apply bone of the setting at [index] to [boneName]. This bone will be modified.
   */
  public final fun setApplyBoneName(index: Int, boneName: String): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), STRING to boneName)
    TransferContext.callMethod(ptr, MethodBindings.setApplyBoneNamePtr, NIL)
  }

  /**
   * Returns the apply bone name of the setting at [index]. This bone will be modified.
   */
  public final fun getApplyBoneName(index: Int): String {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getApplyBoneNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Sets the apply bone of the setting at [index] to [bone]. This bone will be modified.
   */
  public final fun setApplyBone(index: Int, bone: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to bone.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setApplyBonePtr, NIL)
  }

  /**
   * Returns the apply bone of the setting at [index]. This bone will be modified.
   */
  public final fun getApplyBone(index: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getApplyBonePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the reference bone of the setting at [index] to [boneName].
   *
   * This bone will be only referenced and not modified by this modifier.
   */
  public final fun setReferenceBoneName(index: Int, boneName: String): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), STRING to boneName)
    TransferContext.callMethod(ptr, MethodBindings.setReferenceBoneNamePtr, NIL)
  }

  /**
   * Returns the reference bone name of the setting at [index].
   *
   * This bone will be only referenced and not modified by this modifier.
   */
  public final fun getReferenceBoneName(index: Int): String {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getReferenceBoneNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Sets the reference bone of the setting at [index] to [bone].
   *
   * This bone will be only referenced and not modified by this modifier.
   */
  public final fun setReferenceBone(index: Int, bone: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to bone.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setReferenceBonePtr, NIL)
  }

  /**
   * Returns the reference bone of the setting at [index].
   *
   * This bone will be only referenced and not modified by this modifier.
   */
  public final fun getReferenceBone(index: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getReferenceBonePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the number of settings in the modifier.
   */
  public final fun setSettingCount(count: Int): Unit {
    TransferContext.writeArguments(LONG to count.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSettingCountPtr, NIL)
  }

  /**
   * Returns the number of settings in the modifier.
   */
  public final fun getSettingCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSettingCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Clear all settings.
   */
  public final fun clearSetting(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearSettingPtr, NIL)
  }

  public companion object

  public object MethodBindings {
    internal val setAmountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneConstraint3D", "set_amount", 1602489585)

    internal val getAmountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneConstraint3D", "get_amount", 2339986948)

    internal val setApplyBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneConstraint3D", "set_apply_bone_name", 501894301)

    internal val getApplyBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneConstraint3D", "get_apply_bone_name", 844755477)

    internal val setApplyBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneConstraint3D", "set_apply_bone", 3937882851)

    internal val getApplyBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneConstraint3D", "get_apply_bone", 923996154)

    internal val setReferenceBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneConstraint3D", "set_reference_bone_name", 501894301)

    internal val getReferenceBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneConstraint3D", "get_reference_bone_name", 844755477)

    internal val setReferenceBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneConstraint3D", "set_reference_bone", 3937882851)

    internal val getReferenceBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneConstraint3D", "get_reference_bone", 923996154)

    internal val setSettingCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneConstraint3D", "set_setting_count", 1286410249)

    internal val getSettingCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneConstraint3D", "get_setting_count", 3905245786)

    internal val clearSettingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneConstraint3D", "clear_setting", 3218959716)
  }
}
