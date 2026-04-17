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
import godot.core.NodePath
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import godot.core.VariantParser.STRING
import godot.core.VariantParser.VECTOR3
import godot.core.Vector3
import godot.core.asCachedNodePath
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
 * This [IKModifier3D] requires a pole target. It provides deterministic results by constructing a
 * plane from each joint and pole target and finding the intersection of two circles (disks in 3D).
 *
 * This IK can handle twist by setting the pole direction. If there are more than one bone between
 * each set bone, their rotations are ignored, and the straight line connecting the root-middle and
 * middle-end joints are treated as virtual bones.
 */
@GodotBaseType
public open class TwoBoneIK3D : IKModifier3D() {
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
    createNativeObject(641, scriptPtr)
  }

  /**
   * Sets the target node that the end bone is trying to reach.
   */
  public final fun setTargetNode(index: Int, targetNode: NodePath): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), NODE_PATH to targetNode)
    TransferContext.callMethod(ptr, MethodBindings.setTargetNodePtr, NIL)
  }

  /**
   * Returns the target node that the end bone is trying to reach.
   */
  public final fun getTargetNode(index: Int): NodePath {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getTargetNodePtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  /**
   * Sets the pole target node that constructs a plane which the joints are all on and the pole is
   * trying to direct.
   */
  public final fun setPoleNode(index: Int, poleNode: NodePath): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), NODE_PATH to poleNode)
    TransferContext.callMethod(ptr, MethodBindings.setPoleNodePtr, NIL)
  }

  /**
   * Returns the pole target node that constructs a plane which the joints are all on and the pole
   * is trying to direct.
   */
  public final fun getPoleNode(index: Int): NodePath {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getPoleNodePtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  /**
   * Sets the root bone name.
   */
  public final fun setRootBoneName(index: Int, boneName: String): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), STRING to boneName)
    TransferContext.callMethod(ptr, MethodBindings.setRootBoneNamePtr, NIL)
  }

  /**
   * Returns the root bone name.
   */
  public final fun getRootBoneName(index: Int): String {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getRootBoneNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Sets the root bone index.
   */
  public final fun setRootBone(index: Int, bone: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to bone.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setRootBonePtr, NIL)
  }

  /**
   * Returns the root bone index.
   */
  public final fun getRootBone(index: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getRootBonePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the middle bone name.
   *
   * **Note:** The middle bone must be a child of the root bone.
   */
  public final fun setMiddleBoneName(index: Int, boneName: String): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), STRING to boneName)
    TransferContext.callMethod(ptr, MethodBindings.setMiddleBoneNamePtr, NIL)
  }

  /**
   * Returns the middle bone name.
   */
  public final fun getMiddleBoneName(index: Int): String {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getMiddleBoneNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Sets the middle bone index.
   */
  public final fun setMiddleBone(index: Int, bone: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to bone.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setMiddleBonePtr, NIL)
  }

  /**
   * Returns the middle bone index.
   */
  public final fun getMiddleBone(index: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getMiddleBonePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the pole direction.
   *
   * The pole is on the middle bone and will direct to the pole target.
   *
   * The rotation axis is a vector that is orthogonal to this and the forward vector.
   *
   * **Note:** The pole direction and the forward vector shouldn't be colinear to avoid unintended
   * rotation.
   */
  public final fun setPoleDirection(index: Int, direction: SkeletonModifier3D.SecondaryDirection):
      Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to direction.value)
    TransferContext.callMethod(ptr, MethodBindings.setPoleDirectionPtr, NIL)
  }

  /**
   * Returns the pole direction.
   */
  public final fun getPoleDirection(index: Int): SkeletonModifier3D.SecondaryDirection {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getPoleDirectionPtr, LONG)
    return SkeletonModifier3D.SecondaryDirection.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the pole direction vector.
   *
   * This vector is normalized by an internal process.
   *
   * If the vector length is `0`, it is considered synonymous with
   * [SkeletonModifier3D.SECONDARY_DIRECTION_NONE].
   */
  public final fun setPoleDirectionVector(index: Int, vector: Vector3): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), VECTOR3 to vector)
    TransferContext.callMethod(ptr, MethodBindings.setPoleDirectionVectorPtr, NIL)
  }

  /**
   * Returns the pole direction vector.
   *
   * If [getPoleDirection] is [SkeletonModifier3D.SECONDARY_DIRECTION_NONE], this method returns
   * `Vector3(0, 0, 0)`.
   */
  public final fun getPoleDirectionVector(index: Int): Vector3 {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getPoleDirectionVectorPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Sets the end bone name.
   *
   * **Note:** The end bone must be a child of the middle bone.
   */
  public final fun setEndBoneName(index: Int, boneName: String): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), STRING to boneName)
    TransferContext.callMethod(ptr, MethodBindings.setEndBoneNamePtr, NIL)
  }

  /**
   * Returns the end bone name.
   */
  public final fun getEndBoneName(index: Int): String {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getEndBoneNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Sets the end bone index.
   */
  public final fun setEndBone(index: Int, bone: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to bone.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setEndBonePtr, NIL)
  }

  /**
   * Returns the end bone index.
   */
  public final fun getEndBone(index: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getEndBonePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * If [enabled] is `true`, the end bone is extended from the middle bone as a virtual bone.
   */
  public final fun setUseVirtualEnd(index: Int, enabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setUseVirtualEndPtr, NIL)
  }

  /**
   * Returns `true` if the end bone is extended from the middle bone as a virtual bone.
   */
  public final fun isUsingVirtualEnd(index: Int): Boolean {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.isUsingVirtualEndPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If [enabled] is `true`, the end bone is extended to have a tail.
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
   * Sets the end bone tail direction when [isEndBoneExtended] is `true`.
   */
  public final fun setEndBoneDirection(index: Int, boneDirection: SkeletonModifier3D.BoneDirection):
      Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to boneDirection.value)
    TransferContext.callMethod(ptr, MethodBindings.setEndBoneDirectionPtr, NIL)
  }

  /**
   * Returns the end bone's tail direction when [isEndBoneExtended] is `true`.
   */
  public final fun getEndBoneDirection(index: Int): SkeletonModifier3D.BoneDirection {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getEndBoneDirectionPtr, LONG)
    return SkeletonModifier3D.BoneDirection.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the end bone tail length when [isEndBoneExtended] is `true`.
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
   * Sets the target node that the end bone is trying to reach.
   */
  public final fun setTargetNode(index: Int, targetNode: String) =
      setTargetNode(index, targetNode.asCachedNodePath())

  /**
   * Sets the pole target node that constructs a plane which the joints are all on and the pole is
   * trying to direct.
   */
  public final fun setPoleNode(index: Int, poleNode: String) =
      setPoleNode(index, poleNode.asCachedNodePath())

  public companion object

  public object MethodBindings {
    internal val setTargetNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TwoBoneIK3D", "set_target_node", 2761262315)

    internal val getTargetNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TwoBoneIK3D", "get_target_node", 408788394)

    internal val setPoleNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TwoBoneIK3D", "set_pole_node", 2761262315)

    internal val getPoleNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TwoBoneIK3D", "get_pole_node", 408788394)

    internal val setRootBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TwoBoneIK3D", "set_root_bone_name", 501894301)

    internal val getRootBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TwoBoneIK3D", "get_root_bone_name", 844755477)

    internal val setRootBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TwoBoneIK3D", "set_root_bone", 3937882851)

    internal val getRootBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TwoBoneIK3D", "get_root_bone", 923996154)

    internal val setMiddleBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TwoBoneIK3D", "set_middle_bone_name", 501894301)

    internal val getMiddleBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TwoBoneIK3D", "get_middle_bone_name", 844755477)

    internal val setMiddleBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TwoBoneIK3D", "set_middle_bone", 3937882851)

    internal val getMiddleBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TwoBoneIK3D", "get_middle_bone", 923996154)

    internal val setPoleDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TwoBoneIK3D", "set_pole_direction", 258741388)

    internal val getPoleDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TwoBoneIK3D", "get_pole_direction", 377522128)

    internal val setPoleDirectionVectorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TwoBoneIK3D", "set_pole_direction_vector", 1530502735)

    internal val getPoleDirectionVectorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TwoBoneIK3D", "get_pole_direction_vector", 711720468)

    internal val setEndBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TwoBoneIK3D", "set_end_bone_name", 501894301)

    internal val getEndBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TwoBoneIK3D", "get_end_bone_name", 844755477)

    internal val setEndBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TwoBoneIK3D", "set_end_bone", 3937882851)

    internal val getEndBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TwoBoneIK3D", "get_end_bone", 923996154)

    internal val setUseVirtualEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TwoBoneIK3D", "set_use_virtual_end", 300928843)

    internal val isUsingVirtualEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TwoBoneIK3D", "is_using_virtual_end", 1116898809)

    internal val setExtendEndBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TwoBoneIK3D", "set_extend_end_bone", 300928843)

    internal val isEndBoneExtendedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TwoBoneIK3D", "is_end_bone_extended", 1116898809)

    internal val setEndBoneDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TwoBoneIK3D", "set_end_bone_direction", 2838484201)

    internal val getEndBoneDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TwoBoneIK3D", "get_end_bone_direction", 1843036459)

    internal val setEndBoneLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TwoBoneIK3D", "set_end_bone_length", 1602489585)

    internal val getEndBoneLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TwoBoneIK3D", "get_end_bone_length", 2339986948)
  }
}
