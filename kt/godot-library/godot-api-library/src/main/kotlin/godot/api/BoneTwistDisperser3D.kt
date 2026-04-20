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
import godot.core.Quaternion
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.QUATERNION
import godot.core.VariantParser.STRING
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * This [BoneTwistDisperser3D] allows for smooth twist interpolation between multiple bones by
 * dispersing the end bone's twist to the parents. This only changes the twist without changing the
 * global position of each joint.
 *
 * This is useful for smoothly twisting bones in combination with [CopyTransformModifier3D] and IK.
 *
 * **Note:** If an extracted twist is greater than 180 degrees, flipping occurs. This is similar to
 * [ConvertTransformModifier3D].
 */
@GodotBaseType
public open class BoneTwistDisperser3D : SkeletonModifier3D() {
  /**
   * If `true`, the solver retrieves the bone axis from the bone pose every frame.
   *
   * If `false`, the solver retrieves the bone axis from the bone rest and caches it.
   */
  public final inline var mutableBoneAxes: Boolean
    @JvmName("mutableBoneAxesProperty")
    get() = areBoneAxesMutable()
    @JvmName("mutableBoneAxesProperty")
    set(`value`) {
      setMutableBoneAxes(value)
    }

  /**
   * The number of settings.
   */
  public final inline var settingCount: Int
    @JvmName("settingCountProperty")
    get() = getSettingCount()
    @JvmName("settingCountProperty")
    set(`value`) {
      setSettingCount(value)
    }

  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(111, scriptPtr)
  }

  public final fun setSettingCount(count: Int): Unit {
    TransferContext.writeArguments(LONG to count.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSettingCountPtr, NIL)
  }

  public final fun getSettingCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSettingCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Clears all settings.
   */
  public final fun clearSettings(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearSettingsPtr, NIL)
  }

  public final fun setMutableBoneAxes(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setMutableBoneAxesPtr, NIL)
  }

  public final fun areBoneAxesMutable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.areBoneAxesMutablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the root bone name of the bone chain.
   */
  public final fun setRootBoneName(index: Int, boneName: String): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), STRING to boneName)
    TransferContext.callMethod(ptr, MethodBindings.setRootBoneNamePtr, NIL)
  }

  /**
   * Returns the root bone name of the bone chain.
   */
  public final fun getRootBoneName(index: Int): String {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getRootBoneNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Sets the root bone index of the bone chain.
   */
  public final fun setRootBone(index: Int, bone: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to bone.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setRootBonePtr, NIL)
  }

  /**
   * Returns the root bone index of the bone chain.
   */
  public final fun getRootBone(index: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getRootBonePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the end bone name of the bone chain.
   *
   * **Note:** The end bone must be a child of the root bone.
   */
  public final fun setEndBoneName(index: Int, boneName: String): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), STRING to boneName)
    TransferContext.callMethod(ptr, MethodBindings.setEndBoneNamePtr, NIL)
  }

  /**
   * Returns the end bone name of the bone chain.
   */
  public final fun getEndBoneName(index: Int): String {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getEndBoneNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Sets the end bone index of the bone chain.
   */
  public final fun setEndBone(index: Int, bone: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to bone.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setEndBonePtr, NIL)
  }

  /**
   * Returns the end bone index of the bone chain.
   */
  public final fun getEndBone(index: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getEndBonePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the reference bone name to extract twist of the setting at [index].
   *
   * This bone is either the end of the chain or its parent, depending on [isEndBoneExtended].
   */
  public final fun getReferenceBoneName(index: Int): String {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getReferenceBoneNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the reference bone to extract twist of the setting at [index].
   *
   * This bone is either the end of the chain or its parent, depending on [isEndBoneExtended].
   */
  public final fun getReferenceBone(index: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getReferenceBonePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * If [enabled] is `true`, the end bone is extended to have a tail.
   *
   * If [enabled] is `false`, [getReferenceBone] becomes a parent of the end bone and it uses the
   * vector to the end bone as a twist axis.
   */
  public final fun setExtendEndBone(index: Int, enabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setExtendEndBonePtr, NIL)
  }

  /**
   * Returns `true` if the end bone is extended to have a tail.
   */
  public final fun isEndBoneExtended(index: Int): Boolean {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isEndBoneExtendedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the end bone tail direction of the bone chain when [isEndBoneExtended] is `true`.
   */
  public final fun setEndBoneDirection(index: Int, boneDirection: SkeletonModifier3D.BoneDirection):
      Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to boneDirection.value)
    TransferContext.callMethod(ptr, MethodBindings.setEndBoneDirectionPtr, NIL)
  }

  /**
   * Returns the tail direction of the end bone of the bone chain when [isEndBoneExtended] is
   * `true`.
   */
  public final fun getEndBoneDirection(index: Int): SkeletonModifier3D.BoneDirection {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getEndBoneDirectionPtr, LONG)
    return SkeletonModifier3D.BoneDirection.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * If [enabled] is `true`, it extracts the twist amount from the difference between the bone rest
   * and the current bone pose.
   *
   * If [enabled] is `false`, it extracts the twist amount from the difference between
   * [getTwistFrom] and the current bone pose. See also [setTwistFrom].
   */
  public final fun setTwistFromRest(index: Int, enabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setTwistFromRestPtr, NIL)
  }

  /**
   * Returns `true` if extracting the twist amount from the difference between the bone rest and the
   * current bone pose.
   */
  public final fun isTwistFromRest(index: Int): Boolean {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isTwistFromRestPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the rotation to an arbitrary state before twisting for the current bone pose to extract
   * the twist when [isTwistFromRest] is `false`.
   *
   * In other words, by calling [setTwistFrom] by [signal SkeletonModifier3D.modification_processed]
   * of a specific [SkeletonModifier3D], you can extract only the twists generated by modifiers
   * processed after that but before this [BoneTwistDisperser3D].
   */
  public final fun setTwistFrom(index: Int, from: Quaternion): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), QUATERNION to from)
    TransferContext.callMethod(ptr, MethodBindings.setTwistFromPtr, NIL)
  }

  /**
   * Returns the rotation to an arbitrary state before twisting for the current bone pose to extract
   * the twist when [isTwistFromRest] is `false`.
   */
  public final fun getTwistFrom(index: Int): Quaternion {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getTwistFromPtr, QUATERNION)
    return (TransferContext.readReturnValue(QUATERNION) as Quaternion)
  }

  /**
   * Sets whether to use automatic amount assignment or to allow manual assignment.
   */
  public final fun setDisperseMode(index: Int, disperseMode: DisperseMode): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to disperseMode.value)
    TransferContext.callMethod(ptr, MethodBindings.setDisperseModePtr, NIL)
  }

  /**
   * Returns whether to use automatic amount assignment or to allow manual assignment.
   */
  public final fun getDisperseMode(index: Int): DisperseMode {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getDisperseModePtr, LONG)
    return DisperseMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the position at which to divide the segment between joints for weight assignment when
   * [getDisperseMode] is [DISPERSE_MODE_WEIGHTED].
   *
   * For example, when [weightPosition] is `0.5`, if two bone segments with a length of `1.0` exist
   * between three joints, weights are assigned to each joint from root to end at ratios of `0.5`,
   * `1.0`, and `0.5`. Then amounts become `0.25`, `0.75`, and `1.0` respectively.
   */
  public final fun setWeightPosition(index: Int, weightPosition: Float): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), DOUBLE to weightPosition.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setWeightPositionPtr, NIL)
  }

  /**
   * Returns the position at which to divide the segment between joints for weight assignment when
   * [getDisperseMode] is [DISPERSE_MODE_WEIGHTED].
   */
  public final fun getWeightPosition(index: Int): Float {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getWeightPositionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the damping curve when [getDisperseMode] is [DISPERSE_MODE_CUSTOM].
   */
  public final fun setDampingCurve(index: Int, curve: Curve?): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), OBJECT to curve)
    TransferContext.callMethod(ptr, MethodBindings.setDampingCurvePtr, NIL)
  }

  /**
   * Returns the damping curve when [getDisperseMode] is [DISPERSE_MODE_CUSTOM].
   */
  public final fun getDampingCurve(index: Int): Curve? {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getDampingCurvePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Curve?)
  }

  /**
   * Returns the bone name at [joint] in the bone chain's joint list.
   */
  public final fun getJointBoneName(index: Int, joint: Int): String {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to joint.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getJointBoneNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the bone index at [joint] in the bone chain's joint list.
   */
  public final fun getJointBone(index: Int, joint: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to joint.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getJointBonePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the twist amount at [joint] in the bone chain's joint list when [getDisperseMode] is
   * [DISPERSE_MODE_CUSTOM].
   */
  public final fun getJointTwistAmount(index: Int, joint: Int): Float {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to joint.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getJointTwistAmountPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the twist amount at [joint] in the bone chain's joint list when [getDisperseMode] is
   * [DISPERSE_MODE_CUSTOM].
   */
  public final fun setJointTwistAmount(
    index: Int,
    joint: Int,
    twistAmount: Float,
  ): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to joint.toLong(), DOUBLE to twistAmount.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setJointTwistAmountPtr, NIL)
  }

  /**
   * Returns the joint count of the bone chain's joint list.
   */
  public final fun getJointCount(index: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getJointCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public enum class DisperseMode(
    `value`: Long,
  ) : GodotEnum {
    /**
     * Assign amounts so that they monotonically increase from `0.0` to `1.0`, ensuring all weights
     * are equal. For example, with five joints, the amounts would be `0.2`, `0.4`, `0.6`, `0.8`, and
     * `1.0` starting from the root bone.
     */
    EVEN(0),
    /**
     * Assign amounts so that they monotonically increase from `0.0` to `1.0`, based on the length
     * of the bones between joint segments. See also [setWeightPosition].
     */
    WEIGHTED(1),
    /**
     * You can assign arbitrary amounts to the joint list. See also [setJointTwistAmount].
     *
     * When [isEndBoneExtended] is `false`, a child of the reference bone exists solely to determine
     * the twist axis, so its custom amount has absolutely no effect at all.
     */
    CUSTOM(2),
    ;

    public override val `value`: Long
    init {
      this.`value` = `value`
    }

    public companion object {
      public fun from(`value`: Long): DisperseMode = entries.single { it.`value` == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setSettingCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneTwistDisperser3D", "set_setting_count", 1286410249)

    internal val getSettingCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneTwistDisperser3D", "get_setting_count", 3905245786)

    internal val clearSettingsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneTwistDisperser3D", "clear_settings", 3218959716)

    internal val setMutableBoneAxesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneTwistDisperser3D", "set_mutable_bone_axes", 2586408642)

    internal val areBoneAxesMutablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneTwistDisperser3D", "are_bone_axes_mutable", 36873697)

    internal val setRootBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneTwistDisperser3D", "set_root_bone_name", 501894301)

    internal val getRootBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneTwistDisperser3D", "get_root_bone_name", 844755477)

    internal val setRootBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneTwistDisperser3D", "set_root_bone", 3937882851)

    internal val getRootBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneTwistDisperser3D", "get_root_bone", 923996154)

    internal val setEndBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneTwistDisperser3D", "set_end_bone_name", 501894301)

    internal val getEndBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneTwistDisperser3D", "get_end_bone_name", 844755477)

    internal val setEndBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneTwistDisperser3D", "set_end_bone", 3937882851)

    internal val getEndBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneTwistDisperser3D", "get_end_bone", 923996154)

    internal val getReferenceBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneTwistDisperser3D", "get_reference_bone_name", 844755477)

    internal val getReferenceBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneTwistDisperser3D", "get_reference_bone", 923996154)

    internal val setExtendEndBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneTwistDisperser3D", "set_extend_end_bone", 300928843)

    internal val isEndBoneExtendedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneTwistDisperser3D", "is_end_bone_extended", 1116898809)

    internal val setEndBoneDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneTwistDisperser3D", "set_end_bone_direction", 2838484201)

    internal val getEndBoneDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneTwistDisperser3D", "get_end_bone_direction", 1843036459)

    internal val setTwistFromRestPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneTwistDisperser3D", "set_twist_from_rest", 300928843)

    internal val isTwistFromRestPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneTwistDisperser3D", "is_twist_from_rest", 1116898809)

    internal val setTwistFromPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneTwistDisperser3D", "set_twist_from", 2823819782)

    internal val getTwistFromPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneTwistDisperser3D", "get_twist_from", 476865136)

    internal val setDisperseModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneTwistDisperser3D", "set_disperse_mode", 2954194337)

    internal val getDisperseModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneTwistDisperser3D", "get_disperse_mode", 1326397005)

    internal val setWeightPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneTwistDisperser3D", "set_weight_position", 1602489585)

    internal val getWeightPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneTwistDisperser3D", "get_weight_position", 2339986948)

    internal val setDampingCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneTwistDisperser3D", "set_damping_curve", 1447180063)

    internal val getDampingCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneTwistDisperser3D", "get_damping_curve", 747537754)

    internal val getJointBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneTwistDisperser3D", "get_joint_bone_name", 1391810591)

    internal val getJointBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneTwistDisperser3D", "get_joint_bone", 3175239445)

    internal val getJointTwistAmountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneTwistDisperser3D", "get_joint_twist_amount", 3085491603)

    internal val setJointTwistAmountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneTwistDisperser3D", "set_joint_twist_amount", 3506521499)

    internal val getJointCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("BoneTwistDisperser3D", "get_joint_count", 923996154)
  }
}
