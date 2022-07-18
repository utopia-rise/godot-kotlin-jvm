// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Basis
import godot.core.PackedInt32Array
import godot.core.Quaternion
import godot.core.RID
import godot.core.TransferContext
import godot.core.Transform3D
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BASIS
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.QUATERNION
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR3
import godot.core.VariantType._RID
import godot.core.Vector3
import godot.signals.Signal0
import godot.signals.Signal1
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
 * Skeleton3D provides a hierarchical interface for managing bones, including pose, rest and animation (see [godot.Animation]). It can also use ragdoll physics.
 *
 * The overall transform of a bone with respect to the skeleton is determined by the following hierarchical order: rest pose, custom pose and pose.
 *
 * Note that "global pose" below refers to the overall transform of the bone with respect to skeleton, so it not the actual global/world transform of the bone.
 */
@GodotBaseType
public open class Skeleton3D : Node3D() {
  /**
   * This signal is emitted when one of the bones in the Skeleton3D node have changed their pose. This is used to inform nodes that rely on bone positions that one of the bones in the Skeleton3D have changed their transform/pose.
   */
  public val bonePoseChanged: Signal1<Long> by signal("boneIdx")

  /**
   *
   */
  public val poseUpdated: Signal0 by signal()

  /**
   *
   */
  public val boneEnabledChanged: Signal1<Long> by signal("boneIdx")

  /**
   *
   */
  public val showRestOnlyChanged: Signal0 by signal()

  /**
   *
   */
  public var showRestOnly: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_IS_SHOW_REST_ONLY,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_SET_SHOW_REST_ONLY,
          NIL.ordinal)
    }

  /**
   *
   */
  public var animatePhysicalBones: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_GET_ANIMATE_PHYSICAL_BONES,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_SET_ANIMATE_PHYSICAL_BONES,
          NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SKELETON3D)
  }

  /**
   * Adds a bone, with name `name`. [getBoneCount] will become the bone index.
   */
  public fun addBone(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_ADD_BONE, NIL.ordinal)
  }

  /**
   * Returns the bone index that matches `name` as its name.
   */
  public fun findBone(name: String): Long {
    TransferContext.writeArguments(STRING to name)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_FIND_BONE, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the name of the bone at index `index`.
   */
  public fun getBoneName(boneIdx: Long): String {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_GET_BONE_NAME, STRING.ordinal)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   *
   */
  public fun setBoneName(boneIdx: Long, name: String): Unit {
    TransferContext.writeArguments(LONG to boneIdx, STRING to name)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_SET_BONE_NAME, NIL.ordinal)
  }

  /**
   * Returns the bone index which is the parent of the bone at `bone_idx`. If -1, then bone has no parent.
   *
   * **Note:** The parent bone returned will always be less than `bone_idx`.
   */
  public fun getBoneParent(boneIdx: Long): Long {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_GET_BONE_PARENT, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the bone index `parent_idx` as the parent of the bone at `bone_idx`. If -1, then bone has no parent.
   *
   * **Note:** `parent_idx` must be less than `bone_idx`.
   */
  public fun setBoneParent(boneIdx: Long, parentIdx: Long): Unit {
    TransferContext.writeArguments(LONG to boneIdx, LONG to parentIdx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_SET_BONE_PARENT, NIL.ordinal)
  }

  /**
   * Returns the amount of bones in the skeleton.
   */
  public fun getBoneCount(): Long {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_GET_BONE_COUNT, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Unparents the bone at `bone_idx` and sets its rest position to that of its parent prior to being reset.
   */
  public fun unparentBoneAndRest(boneIdx: Long): Unit {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_UNPARENT_BONE_AND_REST,
        NIL.ordinal)
  }

  /**
   * Returns an array containing the bone indexes of all the children node of the passed in bone, `bone_idx`.
   */
  public fun getBoneChildren(boneIdx: Long): PackedInt32Array {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_GET_BONE_CHILDREN,
        PACKED_INT_32_ARRAY.ordinal)
    return TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array
  }

  /**
   * Sets the children for the passed in bone, `bone_idx`, to the passed-in array of bone indexes, `bone_children`.
   */
  public fun setBoneChildren(boneIdx: Long, boneChildren: PackedInt32Array): Unit {
    TransferContext.writeArguments(LONG to boneIdx, PACKED_INT_32_ARRAY to boneChildren)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_SET_BONE_CHILDREN,
        NIL.ordinal)
  }

  /**
   * Takes the given bone pose/transform and converts it to a world transform, relative to the [godot.Skeleton3D] node.
   *
   * This is useful for using the bone transform in calculations with transforms from [godot.Node3D]-based nodes.
   */
  public fun addBoneChild(boneIdx: Long, childBoneIdx: Long): Unit {
    TransferContext.writeArguments(LONG to boneIdx, LONG to childBoneIdx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_ADD_BONE_CHILD, NIL.ordinal)
  }

  /**
   * Removes the passed in child bone index, `child_bone_idx`, from the passed-in bone, `bone_idx`, if it exists.
   *
   * **Note:** This does not remove the child bone, but instead it removes the connection it has to the parent bone.
   */
  public fun removeBoneChild(boneIdx: Long, childBoneIdx: Long): Unit {
    TransferContext.writeArguments(LONG to boneIdx, LONG to childBoneIdx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_REMOVE_BONE_CHILD,
        NIL.ordinal)
  }

  /**
   * Returns an array with all of the bones that are parentless. Another way to look at this is that it returns the indexes of all the bones that are not dependent or modified by other bones in the Skeleton.
   */
  public fun getParentlessBones(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_GET_PARENTLESS_BONES,
        PACKED_INT_32_ARRAY.ordinal)
    return TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array
  }

  /**
   * Returns the rest transform for a bone `bone_idx`.
   */
  public fun getBoneRest(boneIdx: Long): Transform3D {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_GET_BONE_REST,
        TRANSFORM3D.ordinal)
    return TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D
  }

  /**
   * Sets the rest transform for bone `bone_idx`.
   */
  public fun setBoneRest(boneIdx: Long, rest: Transform3D): Unit {
    TransferContext.writeArguments(LONG to boneIdx, TRANSFORM3D to rest)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_SET_BONE_REST, NIL.ordinal)
  }

  /**
   *
   */
  public fun createSkinFromRestTransforms(): Skin? {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON3D_CREATE_SKIN_FROM_REST_TRANSFORMS, OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as Skin?
  }

  /**
   * Binds the given Skin to the Skeleton.
   */
  public fun registerSkin(skin: Skin): SkinReference? {
    TransferContext.writeArguments(OBJECT to skin)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_REGISTER_SKIN, OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as SkinReference?
  }

  /**
   * Returns all bones in the skeleton to their rest poses.
   */
  public fun localizeRests(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_LOCALIZE_RESTS, NIL.ordinal)
  }

  /**
   * Clear all the bones in this skeleton.
   */
  public fun clearBones(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_CLEAR_BONES, NIL.ordinal)
  }

  /**
   * Returns the pose transform of the specified bone. Pose is applied on top of the custom pose, which is applied on top the rest pose.
   */
  public fun getBonePose(boneIdx: Long): Transform3D {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_GET_BONE_POSE,
        TRANSFORM3D.ordinal)
    return TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D
  }

  /**
   *
   */
  public fun setBonePosePosition(boneIdx: Long, position: Vector3): Unit {
    TransferContext.writeArguments(LONG to boneIdx, VECTOR3 to position)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_SET_BONE_POSE_POSITION,
        NIL.ordinal)
  }

  /**
   *
   */
  public fun setBonePoseRotation(boneIdx: Long, rotation: Quaternion): Unit {
    TransferContext.writeArguments(LONG to boneIdx, QUATERNION to rotation)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_SET_BONE_POSE_ROTATION,
        NIL.ordinal)
  }

  /**
   *
   */
  public fun setBonePoseScale(boneIdx: Long, scale: Vector3): Unit {
    TransferContext.writeArguments(LONG to boneIdx, VECTOR3 to scale)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_SET_BONE_POSE_SCALE,
        NIL.ordinal)
  }

  /**
   *
   */
  public fun getBonePosePosition(boneIdx: Long): Vector3 {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_GET_BONE_POSE_POSITION,
        VECTOR3.ordinal)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   *
   */
  public fun getBonePoseRotation(boneIdx: Long): Quaternion {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_GET_BONE_POSE_ROTATION,
        QUATERNION.ordinal)
    return TransferContext.readReturnValue(QUATERNION, false) as Quaternion
  }

  /**
   *
   */
  public fun getBonePoseScale(boneIdx: Long): Vector3 {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_GET_BONE_POSE_SCALE,
        VECTOR3.ordinal)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns whether the bone pose for the bone at `bone_idx` is enabled.
   */
  public fun isBoneEnabled(boneIdx: Long): Boolean {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_IS_BONE_ENABLED, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Disables the pose for the bone at `bone_idx` if `false`, enables the bone pose if `true`.
   */
  public fun setBoneEnabled(boneIdx: Long, enabled: Boolean = true): Unit {
    TransferContext.writeArguments(LONG to boneIdx, BOOL to enabled)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_SET_BONE_ENABLED, NIL.ordinal)
  }

  /**
   * Removes the global pose override on all bones in the skeleton.
   */
  public fun clearBonesGlobalPoseOverride(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON3D_CLEAR_BONES_GLOBAL_POSE_OVERRIDE, NIL.ordinal)
  }

  /**
   * Sets the global pose transform, `pose`, for the bone at `bone_idx`.
   *
   * `amount` is the interpolation strength that will be used when applying the pose, and `persistent` determines if the applied pose will remain.
   *
   * **Note:** The pose transform needs to be a global pose! Use [worldTransformToGlobalPose] to convert a world transform, like one you can get from a [godot.Node3D], to a global pose.
   */
  public fun setBoneGlobalPoseOverride(
    boneIdx: Long,
    pose: Transform3D,
    amount: Double,
    persistent: Boolean = false
  ): Unit {
    TransferContext.writeArguments(LONG to boneIdx, TRANSFORM3D to pose, DOUBLE to amount, BOOL to persistent)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_SET_BONE_GLOBAL_POSE_OVERRIDE,
        NIL.ordinal)
  }

  /**
   * Returns the global pose override transform for `bone_idx`.
   */
  public fun getBoneGlobalPoseOverride(boneIdx: Long): Transform3D {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_GET_BONE_GLOBAL_POSE_OVERRIDE,
        TRANSFORM3D.ordinal)
    return TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D
  }

  /**
   * Returns the overall transform of the specified bone, with respect to the skeleton. Being relative to the skeleton frame, this is not the actual "global" transform of the bone.
   */
  public fun getBoneGlobalPose(boneIdx: Long): Transform3D {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_GET_BONE_GLOBAL_POSE,
        TRANSFORM3D.ordinal)
    return TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D
  }

  /**
   * Returns the overall transform of the specified bone, with respect to the skeleton, but without any global pose overrides. Being relative to the skeleton frame, this is not the actual "global" transform of the bone.
   */
  public fun getBoneGlobalPoseNoOverride(boneIdx: Long): Transform3D {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON3D_GET_BONE_GLOBAL_POSE_NO_OVERRIDE, TRANSFORM3D.ordinal)
    return TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D
  }

  /**
   * Removes the local pose override on all bones in the skeleton.
   */
  public fun clearBonesLocalPoseOverride(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON3D_CLEAR_BONES_LOCAL_POSE_OVERRIDE, NIL.ordinal)
  }

  /**
   * Sets the local pose transform, `pose`, for the bone at `bone_idx`.
   *
   * `amount` is the interpolation strength that will be used when applying the pose, and `persistent` determines if the applied pose will remain.
   *
   * **Note:** The pose transform needs to be a local pose! Use [globalPoseToLocalPose] to convert a global pose to a local pose.
   */
  public fun setBoneLocalPoseOverride(
    boneIdx: Long,
    pose: Transform3D,
    amount: Double,
    persistent: Boolean = false
  ): Unit {
    TransferContext.writeArguments(LONG to boneIdx, TRANSFORM3D to pose, DOUBLE to amount, BOOL to persistent)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_SET_BONE_LOCAL_POSE_OVERRIDE,
        NIL.ordinal)
  }

  /**
   * Returns the local pose override transform for `bone_idx`.
   */
  public fun getBoneLocalPoseOverride(boneIdx: Long): Transform3D {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_GET_BONE_LOCAL_POSE_OVERRIDE,
        TRANSFORM3D.ordinal)
    return TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D
  }

  /**
   * Force updates the bone transforms/poses for all bones in the skeleton.
   */
  public fun forceUpdateAllBoneTransforms(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON3D_FORCE_UPDATE_ALL_BONE_TRANSFORMS, NIL.ordinal)
  }

  /**
   * Force updates the bone transform for the bone at `bone_idx` and all of its children.
   */
  public fun forceUpdateBoneChildTransform(boneIdx: Long): Unit {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON3D_FORCE_UPDATE_BONE_CHILD_TRANSFORM, NIL.ordinal)
  }

  /**
   * Takes the passed-in global pose and converts it to a world transform.
   *
   * This can be used to easily convert a global pose from [getBoneGlobalPose] to a global transform usable with a node's transform, like [godot.Node3D.globalTransform] for example.
   */
  public fun globalPoseToWorldTransform(globalPose: Transform3D): Transform3D {
    TransferContext.writeArguments(TRANSFORM3D to globalPose)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON3D_GLOBAL_POSE_TO_WORLD_TRANSFORM, TRANSFORM3D.ordinal)
    return TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D
  }

  /**
   * Takes the passed-in global transform and converts it to a global pose.
   *
   * This can be used to easily convert a global transform from [godot.Node3D.globalTransform] to a global pose usable with [setBoneGlobalPoseOverride], for example.
   */
  public fun worldTransformToGlobalPose(worldTransform: Transform3D): Transform3D {
    TransferContext.writeArguments(TRANSFORM3D to worldTransform)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON3D_WORLD_TRANSFORM_TO_GLOBAL_POSE, TRANSFORM3D.ordinal)
    return TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D
  }

  /**
   * Takes the passed-in global pose and converts it to local pose transform.
   *
   * This can be used to easily convert a global pose from [getBoneGlobalPose] to a global transform in [setBoneLocalPoseOverride].
   */
  public fun globalPoseToLocalPose(boneIdx: Long, globalPose: Transform3D): Transform3D {
    TransferContext.writeArguments(LONG to boneIdx, TRANSFORM3D to globalPose)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_GLOBAL_POSE_TO_LOCAL_POSE,
        TRANSFORM3D.ordinal)
    return TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D
  }

  /**
   * Converts the passed-in local pose to a global pose relative to the inputted bone, `bone_idx`.
   *
   * This could be used to convert [getBonePose] for use with the [setBoneGlobalPoseOverride] function.
   */
  public fun localPoseToGlobalPose(boneIdx: Long, localPose: Transform3D): Transform3D {
    TransferContext.writeArguments(LONG to boneIdx, TRANSFORM3D to localPose)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_LOCAL_POSE_TO_GLOBAL_POSE,
        TRANSFORM3D.ordinal)
    return TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D
  }

  /**
   * Rotates the given [godot.core.Basis] so that the forward axis of the Basis is facing in the forward direction of the bone at `bone_idx`.
   *
   * This is helper function to make using [godot.Transform3D.lookingAt] easier with bone poses.
   */
  public fun globalPoseZForwardToBoneForward(boneIdx: Long, basis: Basis): Basis {
    TransferContext.writeArguments(LONG to boneIdx, BASIS to basis)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON3D_GLOBAL_POSE_Z_FORWARD_TO_BONE_FORWARD, BASIS.ordinal)
    return TransferContext.readReturnValue(BASIS, false) as Basis
  }

  /**
   * Tells the [godot.PhysicalBone3D] nodes in the Skeleton to stop simulating.
   */
  public fun physicalBonesStopSimulation(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON3D_PHYSICAL_BONES_STOP_SIMULATION, NIL.ordinal)
  }

  /**
   * Tells the [godot.PhysicalBone3D] nodes in the Skeleton to start simulating and reacting to the physics world.
   *
   * Optionally, a list of bone names can be passed-in, allowing only the passed-in bones to be simulated.
   */
  public fun physicalBonesStartSimulation(bones: VariantArray<Any?> = godot.core.variantArrayOf()):
      Unit {
    TransferContext.writeArguments(ARRAY to bones)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON3D_PHYSICAL_BONES_START_SIMULATION, NIL.ordinal)
  }

  /**
   * Adds a collision exception to the physical bone.
   *
   * Works just like the [godot.RigidDynamicBody3D] node.
   */
  public fun physicalBonesAddCollisionException(exception: RID): Unit {
    TransferContext.writeArguments(_RID to exception)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON3D_PHYSICAL_BONES_ADD_COLLISION_EXCEPTION, NIL.ordinal)
  }

  /**
   * Removes a collision exception to the physical bone.
   *
   * Works just like the [godot.RigidDynamicBody3D] node.
   */
  public fun physicalBonesRemoveCollisionException(exception: RID): Unit {
    TransferContext.writeArguments(_RID to exception)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON3D_PHYSICAL_BONES_REMOVE_COLLISION_EXCEPTION, NIL.ordinal)
  }

  /**
   * Sets the modification stack for this skeleton to the passed-in modification stack, `modification_stack`.
   */
  public fun setModificationStack(modificationStack: SkeletonModificationStack3D): Unit {
    TransferContext.writeArguments(OBJECT to modificationStack)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_SET_MODIFICATION_STACK,
        NIL.ordinal)
  }

  /**
   * Returns the modification stack attached to this skeleton, if one exists.
   */
  public fun getModificationStack(): SkeletonModificationStack3D? {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_GET_MODIFICATION_STACK,
        OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as SkeletonModificationStack3D?
  }

  /**
   * Executes all the modifications on the [godot.SkeletonModificationStack3D], if the Skeleton3D has one assigned.
   */
  public fun executeModifications(delta: Double, executionMode: Long): Unit {
    TransferContext.writeArguments(DOUBLE to delta, LONG to executionMode)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_EXECUTE_MODIFICATIONS,
        NIL.ordinal)
  }

  public companion object {
    /**
     *
     */
    public final const val NOTIFICATION_UPDATE_SKELETON: Long = 50
  }
}
