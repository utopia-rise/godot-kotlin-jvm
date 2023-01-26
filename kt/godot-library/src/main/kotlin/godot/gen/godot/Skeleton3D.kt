// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedInt32Array
import godot.core.Quaternion
import godot.core.RID
import godot.core.StringName
import godot.core.Transform3D
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
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
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
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
 *
 * To setup different types of inverse kinematics, consider using [godot.SkeletonIK3D], or add a custom IK implementation in [godot.Node.Process] as a child node.
 */
@GodotBaseType
public open class Skeleton3D : Node3D() {
  /**
   *
   */
  public val poseUpdated: Signal0 by signal()

  /**
   * This signal is emitted when one of the bones in the Skeleton3D node have changed their pose. This is used to inform nodes that rely on bone positions that one of the bones in the Skeleton3D have changed their transform/pose.
   */
  public val bonePoseChanged: Signal1<Long> by signal("boneIdx")

  /**
   *
   */
  public val boneEnabledChanged: Signal1<Long> by signal("boneIdx")

  /**
   *
   */
  public val showRestOnlyChanged: Signal0 by signal()

  /**
   * Multiplies the position 3D track animation.
   *
   * **Note:** Unless this value is `1.0`, the key value in animation will not match the actual position value.
   */
  public var motionScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_GET_MOTION_SCALE,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_SET_MOTION_SCALE, NIL)
    }

  /**
   *
   */
  public var showRestOnly: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_IS_SHOW_REST_ONLY,
          BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_SET_SHOW_REST_ONLY,
          NIL)
    }

  /**
   *
   */
  public var animatePhysicalBones: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETON3D_GET_ANIMATE_PHYSICAL_BONES, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETON3D_SET_ANIMATE_PHYSICAL_BONES, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SKELETON3D, scriptIndex)
    return true
  }

  /**
   * Adds a bone, with name [name]. [getBoneCount] will become the bone index.
   */
  public fun addBone(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_ADD_BONE, NIL)
  }

  /**
   * Returns the bone index that matches [name] as its name.
   */
  public fun findBone(name: String): Int {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_FIND_BONE, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the name of the bone at index [boneIdx].
   */
  public fun getBoneName(boneIdx: Int): String {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_GET_BONE_NAME, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   *
   */
  public fun setBoneName(boneIdx: Int, name: String): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_SET_BONE_NAME, NIL)
  }

  /**
   * Returns the bone index which is the parent of the bone at [boneIdx]. If -1, then bone has no parent.
   *
   * **Note:** The parent bone returned will always be less than [boneIdx].
   */
  public fun getBoneParent(boneIdx: Int): Int {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_GET_BONE_PARENT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the bone index [parentIdx] as the parent of the bone at [boneIdx]. If -1, then bone has no parent.
   *
   * **Note:** [parentIdx] must be less than [boneIdx].
   */
  public fun setBoneParent(boneIdx: Int, parentIdx: Int): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), LONG to parentIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_SET_BONE_PARENT, NIL)
  }

  /**
   * Returns the number of bones in the skeleton.
   */
  public fun getBoneCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_GET_BONE_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the number of times the bone hierarchy has changed within this skeleton, including renames.
   *
   * The Skeleton version is not serialized: only use within a single instance of Skeleton3D.
   *
   * Use for invalidating caches in IK solvers and other nodes which process bones.
   */
  public fun getVersion(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_GET_VERSION, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Unparents the bone at [boneIdx] and sets its rest position to that of its parent prior to being reset.
   */
  public fun unparentBoneAndRest(boneIdx: Int): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_UNPARENT_BONE_AND_REST,
        NIL)
  }

  /**
   * Returns an array containing the bone indexes of all the children node of the passed in bone, [boneIdx].
   */
  public fun getBoneChildren(boneIdx: Int): PackedInt32Array {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_GET_BONE_CHILDREN,
        PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Returns an array with all of the bones that are parentless. Another way to look at this is that it returns the indexes of all the bones that are not dependent or modified by other bones in the Skeleton.
   */
  public fun getParentlessBones(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_GET_PARENTLESS_BONES,
        PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Returns the rest transform for a bone [boneIdx].
   */
  public fun getBoneRest(boneIdx: Int): Transform3D {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_GET_BONE_REST,
        TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  /**
   * Sets the rest transform for bone [boneIdx].
   */
  public fun setBoneRest(boneIdx: Int, rest: Transform3D): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), TRANSFORM3D to rest)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_SET_BONE_REST, NIL)
  }

  /**
   * Returns the global rest transform for [boneIdx].
   */
  public fun getBoneGlobalRest(boneIdx: Int): Transform3D {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_GET_BONE_GLOBAL_REST,
        TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  /**
   *
   */
  public fun createSkinFromRestTransforms(): Skin? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON3D_CREATE_SKIN_FROM_REST_TRANSFORMS, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Skin?)
  }

  /**
   * Binds the given Skin to the Skeleton.
   */
  public fun registerSkin(skin: Skin): SkinReference? {
    TransferContext.writeArguments(OBJECT to skin)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_REGISTER_SKIN, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as SkinReference?)
  }

  /**
   * Returns all bones in the skeleton to their rest poses.
   */
  public fun localizeRests(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_LOCALIZE_RESTS, NIL)
  }

  /**
   * Clear all the bones in this skeleton.
   */
  public fun clearBones(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_CLEAR_BONES, NIL)
  }

  /**
   * Returns the pose transform of the specified bone. Pose is applied on top of the custom pose, which is applied on top the rest pose.
   */
  public fun getBonePose(boneIdx: Int): Transform3D {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_GET_BONE_POSE,
        TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  /**
   *
   */
  public fun setBonePosePosition(boneIdx: Int, position: Vector3): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), VECTOR3 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_SET_BONE_POSE_POSITION,
        NIL)
  }

  /**
   *
   */
  public fun setBonePoseRotation(boneIdx: Int, rotation: Quaternion): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), QUATERNION to rotation)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_SET_BONE_POSE_ROTATION,
        NIL)
  }

  /**
   *
   */
  public fun setBonePoseScale(boneIdx: Int, scale: Vector3): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), VECTOR3 to scale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_SET_BONE_POSE_SCALE, NIL)
  }

  /**
   *
   */
  public fun getBonePosePosition(boneIdx: Int): Vector3 {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_GET_BONE_POSE_POSITION,
        VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   *
   */
  public fun getBonePoseRotation(boneIdx: Int): Quaternion {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_GET_BONE_POSE_ROTATION,
        QUATERNION)
    return (TransferContext.readReturnValue(QUATERNION, false) as Quaternion)
  }

  /**
   *
   */
  public fun getBonePoseScale(boneIdx: Int): Vector3 {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_GET_BONE_POSE_SCALE,
        VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Sets the bone pose to rest for [boneIdx].
   */
  public fun resetBonePose(boneIdx: Int): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_RESET_BONE_POSE, NIL)
  }

  /**
   * Sets all bone poses to rests.
   */
  public fun resetBonePoses(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_RESET_BONE_POSES, NIL)
  }

  /**
   * Returns whether the bone pose for the bone at [boneIdx] is enabled.
   */
  public fun isBoneEnabled(boneIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_IS_BONE_ENABLED, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Disables the pose for the bone at [boneIdx] if `false`, enables the bone pose if `true`.
   */
  public fun setBoneEnabled(boneIdx: Int, enabled: Boolean = true): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_SET_BONE_ENABLED, NIL)
  }

  /**
   * Removes the global pose override on all bones in the skeleton.
   */
  public fun clearBonesGlobalPoseOverride(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON3D_CLEAR_BONES_GLOBAL_POSE_OVERRIDE, NIL)
  }

  /**
   * Sets the global pose transform, [pose], for the bone at [boneIdx].
   *
   * [amount] is the interpolation strength that will be used when applying the pose, and [persistent] determines if the applied pose will remain.
   *
   * **Note:** The pose transform needs to be a global pose! To convert a world transform from a [godot.Node3D] to a global bone pose, multiply the [godot.Transform3D.affineInverse] of the node's [godot.Node3D.globalTransform] by the desired world transform.
   */
  public fun setBoneGlobalPoseOverride(
    boneIdx: Int,
    pose: Transform3D,
    amount: Float,
    persistent: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), TRANSFORM3D to pose, DOUBLE to amount.toDouble(), BOOL to persistent)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON3D_SET_BONE_GLOBAL_POSE_OVERRIDE, NIL)
  }

  /**
   * Returns the global pose override transform for [boneIdx].
   */
  public fun getBoneGlobalPoseOverride(boneIdx: Int): Transform3D {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON3D_GET_BONE_GLOBAL_POSE_OVERRIDE, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  /**
   * Returns the overall transform of the specified bone, with respect to the skeleton. Being relative to the skeleton frame, this is not the actual "global" transform of the bone.
   */
  public fun getBoneGlobalPose(boneIdx: Int): Transform3D {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON3D_GET_BONE_GLOBAL_POSE,
        TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  /**
   * Returns the overall transform of the specified bone, with respect to the skeleton, but without any global pose overrides. Being relative to the skeleton frame, this is not the actual "global" transform of the bone.
   */
  public fun getBoneGlobalPoseNoOverride(boneIdx: Int): Transform3D {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON3D_GET_BONE_GLOBAL_POSE_NO_OVERRIDE, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  /**
   * Force updates the bone transforms/poses for all bones in the skeleton.
   */
  public fun forceUpdateAllBoneTransforms(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON3D_FORCE_UPDATE_ALL_BONE_TRANSFORMS, NIL)
  }

  /**
   * Force updates the bone transform for the bone at [boneIdx] and all of its children.
   */
  public fun forceUpdateBoneChildTransform(boneIdx: Int): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON3D_FORCE_UPDATE_BONE_CHILD_TRANSFORM, NIL)
  }

  /**
   * Tells the [godot.PhysicalBone3D] nodes in the Skeleton to stop simulating.
   */
  public fun physicalBonesStopSimulation(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON3D_PHYSICAL_BONES_STOP_SIMULATION, NIL)
  }

  /**
   * Tells the [godot.PhysicalBone3D] nodes in the Skeleton to start simulating and reacting to the physics world.
   *
   * Optionally, a list of bone names can be passed-in, allowing only the passed-in bones to be simulated.
   */
  public fun physicalBonesStartSimulation(bones: VariantArray<StringName> =
      godot.core.variantArrayOf()): Unit {
    TransferContext.writeArguments(ARRAY to bones)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON3D_PHYSICAL_BONES_START_SIMULATION, NIL)
  }

  /**
   * Adds a collision exception to the physical bone.
   *
   * Works just like the [godot.RigidBody3D] node.
   */
  public fun physicalBonesAddCollisionException(exception: RID): Unit {
    TransferContext.writeArguments(_RID to exception)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON3D_PHYSICAL_BONES_ADD_COLLISION_EXCEPTION, NIL)
  }

  /**
   * Removes a collision exception to the physical bone.
   *
   * Works just like the [godot.RigidBody3D] node.
   */
  public fun physicalBonesRemoveCollisionException(exception: RID): Unit {
    TransferContext.writeArguments(_RID to exception)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON3D_PHYSICAL_BONES_REMOVE_COLLISION_EXCEPTION, NIL)
  }

  public companion object {
    /**
     *
     */
    public final const val NOTIFICATION_UPDATE_SKELETON: Long = 50
  }
}
