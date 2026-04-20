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
import godot.core.VariantParser.STRING
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class of [SkeletonModifier3D] that automatically generates a joint list from the bones
 * between the root bone and the end bone.
 */
@GodotBaseType
public open class ChainIK3D internal constructor() : IKModifier3D() {
  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(149, scriptPtr)
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
   * **Note:** The end bone must be the root bone or a child of the root bone. If they are the same,
   * the tail must be extended by [setExtendEndBone] to modify the bone.
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
   * If [enabled] is `true`, the end bone is extended to have a tail.
   *
   * The extended tail config is allocated to the last element in the joint list. In other words, if
   * you set [enabled] to `false`, the config of the last element in the joint list has no effect in
   * the simulated result.
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
   * Sets the end bone tail length of the bone chain when [isEndBoneExtended] is `true`.
   */
  public final fun setEndBoneLength(index: Int, length: Float): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), DOUBLE to length.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setEndBoneLengthPtr, NIL)
  }

  /**
   * Returns the end bone tail length of the bone chain when [isEndBoneExtended] is `true`.
   */
  public final fun getEndBoneLength(index: Int): Float {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getEndBoneLengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
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
   * Returns the joint count of the bone chain's joint list.
   */
  public final fun getJointCount(index: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getJointCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public companion object

  public object MethodBindings {
    internal val setRootBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ChainIK3D", "set_root_bone_name", 501894301)

    internal val getRootBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ChainIK3D", "get_root_bone_name", 844755477)

    internal val setRootBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ChainIK3D", "set_root_bone", 3937882851)

    internal val getRootBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ChainIK3D", "get_root_bone", 923996154)

    internal val setEndBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ChainIK3D", "set_end_bone_name", 501894301)

    internal val getEndBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ChainIK3D", "get_end_bone_name", 844755477)

    internal val setEndBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ChainIK3D", "set_end_bone", 3937882851)

    internal val getEndBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ChainIK3D", "get_end_bone", 923996154)

    internal val setExtendEndBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ChainIK3D", "set_extend_end_bone", 300928843)

    internal val isEndBoneExtendedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ChainIK3D", "is_end_bone_extended", 1116898809)

    internal val setEndBoneDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ChainIK3D", "set_end_bone_direction", 2838484201)

    internal val getEndBoneDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ChainIK3D", "get_end_bone_direction", 1843036459)

    internal val setEndBoneLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ChainIK3D", "set_end_bone_length", 1602489585)

    internal val getEndBoneLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ChainIK3D", "get_end_bone_length", 2339986948)

    internal val getJointBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ChainIK3D", "get_joint_bone_name", 1391810591)

    internal val getJointBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ChainIK3D", "get_joint_bone", 3175239445)

    internal val getJointCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ChainIK3D", "get_joint_count", 923996154)
  }
}
