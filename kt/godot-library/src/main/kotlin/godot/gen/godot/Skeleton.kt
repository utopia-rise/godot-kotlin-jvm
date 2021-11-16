// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TransferContext
import godot.core.Transform
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM
import godot.core.VariantType._RID
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Skeleton for characters and animated objects.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/678](https://godotengine.org/asset-library/asset/678)
 *
 * Skeleton provides a hierarchical interface for managing bones, including pose, rest and animation (see [godot.Animation]). It can also use ragdoll physics.
 *
 * The overall transform of a bone with respect to the skeleton is determined by the following hierarchical order: rest pose, custom pose and pose.
 *
 * Note that "global pose" below refers to the overall transform of the bone with respect to skeleton, so it not the actual global/world transform of the bone.
 */
@GodotBaseType
public open class Skeleton : Spatial() {
  /**
   *
   */
  public val skeletonUpdated: Signal0 by signal()

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SKELETON)
  }

  /**
   * Adds a bone, with name `name`. [getBoneCount] will become the bone index.
   */
  public open fun addBone(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON_ADD_BONE, NIL)
  }

  /**
   * *Deprecated soon.*
   */
  public open fun bindChildNodeToBone(boneIdx: Long, node: Node): Unit {
    TransferContext.writeArguments(LONG to boneIdx, OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON_BIND_CHILD_NODE_TO_BONE,
        NIL)
  }

  /**
   * Clear all the bones in this skeleton.
   */
  public open fun clearBones(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON_CLEAR_BONES, NIL)
  }

  /**
   *
   */
  public open fun clearBonesGlobalPoseOverride(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON_CLEAR_BONES_GLOBAL_POSE_OVERRIDE, NIL)
  }

  /**
   * Returns the bone index that matches `name` as its name.
   */
  public open fun findBone(name: String): Long {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON_FIND_BONE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the amount of bones in the skeleton.
   */
  public open fun getBoneCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON_GET_BONE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the custom pose of the specified bone. Custom pose is applied on top of the rest pose.
   */
  public open fun getBoneCustomPose(boneIdx: Long): Transform {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON_GET_BONE_CUSTOM_POSE,
        TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  /**
   * Returns the overall transform of the specified bone, with respect to the skeleton. Being relative to the skeleton frame, this is not the actual "global" transform of the bone.
   */
  public open fun getBoneGlobalPose(boneIdx: Long): Transform {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON_GET_BONE_GLOBAL_POSE,
        TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  /**
   * Returns the overall transform of the specified bone, with respect to the skeleton, but without any global pose overrides. Being relative to the skeleton frame, this is not the actual "global" transform of the bone.
   */
  public open fun getBoneGlobalPoseNoOverride(boneIdx: Long): Transform {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON_GET_BONE_GLOBAL_POSE_NO_OVERRIDE, TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  /**
   * Returns the name of the bone at index `index`.
   */
  public open fun getBoneName(boneIdx: Long): String {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON_GET_BONE_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the bone index which is the parent of the bone at `bone_idx`. If -1, then bone has no parent.
   *
   * **Note:** The parent bone returned will always be less than `bone_idx`.
   */
  public open fun getBoneParent(boneIdx: Long): Long {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON_GET_BONE_PARENT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the pose transform of the specified bone. Pose is applied on top of the custom pose, which is applied on top the rest pose.
   */
  public open fun getBonePose(boneIdx: Long): Transform {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON_GET_BONE_POSE, TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  /**
   * Returns the rest transform for a bone `bone_idx`.
   */
  public open fun getBoneRest(boneIdx: Long): Transform {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON_GET_BONE_REST, TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  /**
   * *Deprecated soon.*
   */
  public open fun getBoundChildNodesToBone(boneIdx: Long): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON_GET_BOUND_CHILD_NODES_TO_BONE, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   *
   */
  public open fun isBoneRestDisabled(boneIdx: Long): Boolean {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON_IS_BONE_REST_DISABLED,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public open fun localizeRests(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON_LOCALIZE_RESTS, NIL)
  }

  /**
   *
   */
  public open fun physicalBonesAddCollisionException(exception: RID): Unit {
    TransferContext.writeArguments(_RID to exception)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON_PHYSICAL_BONES_ADD_COLLISION_EXCEPTION, NIL)
  }

  /**
   *
   */
  public open fun physicalBonesRemoveCollisionException(exception: RID): Unit {
    TransferContext.writeArguments(_RID to exception)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON_PHYSICAL_BONES_REMOVE_COLLISION_EXCEPTION, NIL)
  }

  /**
   *
   */
  public open fun physicalBonesStartSimulation(bones: VariantArray<Any?> = VariantArray()): Unit {
    TransferContext.writeArguments(ARRAY to bones)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON_PHYSICAL_BONES_START_SIMULATION, NIL)
  }

  /**
   *
   */
  public open fun physicalBonesStopSimulation(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON_PHYSICAL_BONES_STOP_SIMULATION, NIL)
  }

  /**
   *
   */
  public open fun registerSkin(skin: Skin): SkinReference? {
    TransferContext.writeArguments(OBJECT to skin)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON_REGISTER_SKIN, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as SkinReference?
  }

  /**
   *
   */
  public open fun setBoneCustomPose(boneIdx: Long, customPose: Transform): Unit {
    TransferContext.writeArguments(LONG to boneIdx, TRANSFORM to customPose)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON_SET_BONE_CUSTOM_POSE, NIL)
  }

  /**
   *
   */
  public open fun setBoneDisableRest(boneIdx: Long, disable: Boolean): Unit {
    TransferContext.writeArguments(LONG to boneIdx, BOOL to disable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON_SET_BONE_DISABLE_REST, NIL)
  }

  /**
   *
   */
  public open fun setBoneGlobalPoseOverride(
    boneIdx: Long,
    pose: Transform,
    amount: Double,
    persistent: Boolean = false
  ): Unit {
    TransferContext.writeArguments(LONG to boneIdx, TRANSFORM to pose, DOUBLE to amount, BOOL to
        persistent)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON_SET_BONE_GLOBAL_POSE_OVERRIDE, NIL)
  }

  /**
   *
   */
  public open fun setBoneName(boneIdx: Long, name: String): Unit {
    TransferContext.writeArguments(LONG to boneIdx, STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON_SET_BONE_NAME, NIL)
  }

  /**
   * Sets the bone index `parent_idx` as the parent of the bone at `bone_idx`. If -1, then bone has no parent.
   *
   * **Note:** `parent_idx` must be less than `bone_idx`.
   */
  public open fun setBoneParent(boneIdx: Long, parentIdx: Long): Unit {
    TransferContext.writeArguments(LONG to boneIdx, LONG to parentIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON_SET_BONE_PARENT, NIL)
  }

  /**
   * Sets the pose transform for bone `bone_idx`.
   */
  public open fun setBonePose(boneIdx: Long, pose: Transform): Unit {
    TransferContext.writeArguments(LONG to boneIdx, TRANSFORM to pose)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON_SET_BONE_POSE, NIL)
  }

  /**
   * Sets the rest transform for bone `bone_idx`.
   */
  public open fun setBoneRest(boneIdx: Long, rest: Transform): Unit {
    TransferContext.writeArguments(LONG to boneIdx, TRANSFORM to rest)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON_SET_BONE_REST, NIL)
  }

  /**
   * *Deprecated soon.*
   */
  public open fun unbindChildNodeFromBone(boneIdx: Long, node: Node): Unit {
    TransferContext.writeArguments(LONG to boneIdx, OBJECT to node)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON_UNBIND_CHILD_NODE_FROM_BONE, NIL)
  }

  /**
   *
   */
  public open fun unparentBoneAndRest(boneIdx: Long): Unit {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON_UNPARENT_BONE_AND_REST,
        NIL)
  }

  public companion object {
    /**
     *
     */
    public final const val NOTIFICATION_UPDATE_SKELETON: Long = 50
  }
}
