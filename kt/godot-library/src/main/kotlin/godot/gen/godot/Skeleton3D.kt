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
import godot.core.TypeManager
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
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * A node containing a bone hierarchy, used to create a 3D skeletal animation.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/678](https://godotengine.org/asset-library/asset/678)
 *
 * [godot.Skeleton3D] provides an interface for managing a hierarchy of bones, including pose, rest and animation (see [godot.Animation]). It can also use ragdoll physics.
 *
 * The overall transform of a bone with respect to the skeleton is determined by bone pose. Bone rest defines the initial transform of the bone pose.
 *
 * Note that "global pose" below refers to the overall transform of the bone with respect to skeleton, so it is not the actual global/world transform of the bone.
 */
@GodotBaseType
public open class Skeleton3D : Node3D() {
  /**
   * Emitted when the pose is updated, after [NOTIFICATION_UPDATE_SKELETON] is received.
   */
  public val poseUpdated: Signal0 by signal()

  /**
   * This signal is emitted when one of the bones in the Skeleton3D node have changed their pose. This is used to inform nodes that rely on bone positions that one of the bones in the Skeleton3D have changed their transform/pose.
   */
  public val bonePoseChanged: Signal1<Long> by signal("boneIdx")

  /**
   * Emitted when the bone at [boneIdx] is toggled with [setBoneEnabled]. Use [isBoneEnabled] to check the new value.
   */
  public val boneEnabledChanged: Signal1<Long> by signal("boneIdx")

  /**
   * Emitted when the value of [showRestOnly] changes.
   */
  public val showRestOnlyChanged: Signal0 by signal()

  /**
   * Multiplies the 3D position track animation.
   *
   * **Note:** Unless this value is `1.0`, the key value in animation will not match the actual position value.
   */
  public var motionScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMotionScalePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMotionScalePtr, NIL)
    }

  /**
   * If `true`, forces the bones in their default rest pose, regardless of their values. In the editor, this also prevents the bones from being edited.
   */
  public var showRestOnly: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isShowRestOnlyPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShowRestOnlyPtr, NIL)
    }

  /**
   *
   */
  public var animatePhysicalBones: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAnimatePhysicalBonesPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAnimatePhysicalBonesPtr, NIL)
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
    TransferContext.callMethod(rawPtr, MethodBindings.addBonePtr, NIL)
  }

  /**
   * Returns the bone index that matches [name] as its name.
   */
  public fun findBone(name: String): Int {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.findBonePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the name of the bone at index [boneIdx].
   */
  public fun getBoneName(boneIdx: Int): String {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBoneNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   *
   */
  public fun setBoneName(boneIdx: Int, name: String): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.setBoneNamePtr, NIL)
  }

  /**
   * Returns the bone index which is the parent of the bone at [boneIdx]. If -1, then bone has no parent.
   *
   * **Note:** The parent bone returned will always be less than [boneIdx].
   */
  public fun getBoneParent(boneIdx: Int): Int {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBoneParentPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the bone index [parentIdx] as the parent of the bone at [boneIdx]. If -1, then bone has no parent.
   *
   * **Note:** [parentIdx] must be less than [boneIdx].
   */
  public fun setBoneParent(boneIdx: Int, parentIdx: Int): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), LONG to parentIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setBoneParentPtr, NIL)
  }

  /**
   * Returns the number of bones in the skeleton.
   */
  public fun getBoneCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBoneCountPtr, LONG)
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
    TransferContext.callMethod(rawPtr, MethodBindings.getVersionPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Unparents the bone at [boneIdx] and sets its rest position to that of its parent prior to being reset.
   */
  public fun unparentBoneAndRest(boneIdx: Int): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.unparentBoneAndRestPtr, NIL)
  }

  /**
   * Returns an array containing the bone indexes of all the child node of the passed in bone, [boneIdx].
   */
  public fun getBoneChildren(boneIdx: Int): PackedInt32Array {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBoneChildrenPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Returns an array with all of the bones that are parentless. Another way to look at this is that it returns the indexes of all the bones that are not dependent or modified by other bones in the Skeleton.
   */
  public fun getParentlessBones(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getParentlessBonesPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Returns the rest transform for a bone [boneIdx].
   */
  public fun getBoneRest(boneIdx: Int): Transform3D {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBoneRestPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  /**
   * Sets the rest transform for bone [boneIdx].
   */
  public fun setBoneRest(boneIdx: Int, rest: Transform3D): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), TRANSFORM3D to rest)
    TransferContext.callMethod(rawPtr, MethodBindings.setBoneRestPtr, NIL)
  }

  /**
   * Returns the global rest transform for [boneIdx].
   */
  public fun getBoneGlobalRest(boneIdx: Int): Transform3D {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBoneGlobalRestPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  /**
   *
   */
  public fun createSkinFromRestTransforms(): Skin? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.createSkinFromRestTransformsPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Skin?)
  }

  /**
   * Binds the given Skin to the Skeleton.
   */
  public fun registerSkin(skin: Skin): SkinReference? {
    TransferContext.writeArguments(OBJECT to skin)
    TransferContext.callMethod(rawPtr, MethodBindings.registerSkinPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as SkinReference?)
  }

  /**
   * Returns all bones in the skeleton to their rest poses.
   */
  public fun localizeRests(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.localizeRestsPtr, NIL)
  }

  /**
   * Clear all the bones in this skeleton.
   */
  public fun clearBones(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearBonesPtr, NIL)
  }

  /**
   * Returns the pose transform of the specified bone.
   */
  public fun getBonePose(boneIdx: Int): Transform3D {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBonePosePtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  /**
   * Sets the pose position of the bone at [boneIdx] to [position]. [position] is a [godot.core.Vector3] describing a position local to the [godot.Skeleton3D] node.
   */
  public fun setBonePosePosition(boneIdx: Int, position: Vector3): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), VECTOR3 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.setBonePosePositionPtr, NIL)
  }

  /**
   * Sets the pose rotation of the bone at [boneIdx] to [rotation]. [rotation] is a [godot.Quaternion] describing a rotation in the bone's local coordinate space with respect to the rotation of any parent bones.
   */
  public fun setBonePoseRotation(boneIdx: Int, rotation: Quaternion): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), QUATERNION to rotation)
    TransferContext.callMethod(rawPtr, MethodBindings.setBonePoseRotationPtr, NIL)
  }

  /**
   * Sets the pose scale of the bone at [boneIdx] to [scale].
   */
  public fun setBonePoseScale(boneIdx: Int, scale: Vector3): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), VECTOR3 to scale)
    TransferContext.callMethod(rawPtr, MethodBindings.setBonePoseScalePtr, NIL)
  }

  /**
   * Returns the pose position of the bone at [boneIdx]. The returned [godot.core.Vector3] is in the local coordinate space of the [godot.Skeleton3D] node.
   */
  public fun getBonePosePosition(boneIdx: Int): Vector3 {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBonePosePositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Returns the pose rotation of the bone at [boneIdx]. The returned [godot.Quaternion] is local to the bone with respect to the rotation of any parent bones.
   */
  public fun getBonePoseRotation(boneIdx: Int): Quaternion {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBonePoseRotationPtr, QUATERNION)
    return (TransferContext.readReturnValue(QUATERNION, false) as Quaternion)
  }

  /**
   * Returns the pose scale of the bone at [boneIdx].
   */
  public fun getBonePoseScale(boneIdx: Int): Vector3 {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBonePoseScalePtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Sets the bone pose to rest for [boneIdx].
   */
  public fun resetBonePose(boneIdx: Int): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.resetBonePosePtr, NIL)
  }

  /**
   * Sets all bone poses to rests.
   */
  public fun resetBonePoses(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.resetBonePosesPtr, NIL)
  }

  /**
   * Returns whether the bone pose for the bone at [boneIdx] is enabled.
   */
  public fun isBoneEnabled(boneIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isBoneEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Disables the pose for the bone at [boneIdx] if `false`, enables the bone pose if `true`.
   */
  @JvmOverloads
  public fun setBoneEnabled(boneIdx: Int, enabled: Boolean = true): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setBoneEnabledPtr, NIL)
  }

  /**
   * Removes the global pose override on all bones in the skeleton.
   */
  public fun clearBonesGlobalPoseOverride(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearBonesGlobalPoseOverridePtr, NIL)
  }

  /**
   * Sets the global pose transform, [pose], for the bone at [boneIdx].
   *
   * [amount] is the interpolation strength that will be used when applying the pose, and [persistent] determines if the applied pose will remain.
   *
   * **Note:** The pose transform needs to be a global pose! To convert a world transform from a [godot.Node3D] to a global bone pose, multiply the [godot.Transform3D.affineInverse] of the node's [godot.Node3D.globalTransform] by the desired world transform.
   */
  @JvmOverloads
  public fun setBoneGlobalPoseOverride(
    boneIdx: Int,
    pose: Transform3D,
    amount: Float,
    persistent: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), TRANSFORM3D to pose, DOUBLE to amount.toDouble(), BOOL to persistent)
    TransferContext.callMethod(rawPtr, MethodBindings.setBoneGlobalPoseOverridePtr, NIL)
  }

  /**
   * Returns the global pose override transform for [boneIdx].
   */
  public fun getBoneGlobalPoseOverride(boneIdx: Int): Transform3D {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBoneGlobalPoseOverridePtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  /**
   * Returns the overall transform of the specified bone, with respect to the skeleton. Being relative to the skeleton frame, this is not the actual "global" transform of the bone.
   */
  public fun getBoneGlobalPose(boneIdx: Int): Transform3D {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBoneGlobalPosePtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  /**
   * Returns the overall transform of the specified bone, with respect to the skeleton, but without any global pose overrides. Being relative to the skeleton frame, this is not the actual "global" transform of the bone.
   */
  public fun getBoneGlobalPoseNoOverride(boneIdx: Int): Transform3D {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBoneGlobalPoseNoOverridePtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  /**
   * Force updates the bone transforms/poses for all bones in the skeleton.
   *
   * *Deprecated.* Do not use.
   */
  public fun forceUpdateAllBoneTransforms(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.forceUpdateAllBoneTransformsPtr, NIL)
  }

  /**
   * Force updates the bone transform for the bone at [boneIdx] and all of its children.
   */
  public fun forceUpdateBoneChildTransform(boneIdx: Int): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.forceUpdateBoneChildTransformPtr, NIL)
  }

  /**
   * Tells the [godot.PhysicalBone3D] nodes in the Skeleton to stop simulating.
   */
  public fun physicalBonesStopSimulation(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.physicalBonesStopSimulationPtr, NIL)
  }

  /**
   * Tells the [godot.PhysicalBone3D] nodes in the Skeleton to start simulating and reacting to the physics world.
   *
   * Optionally, a list of bone names can be passed-in, allowing only the passed-in bones to be simulated.
   */
  @JvmOverloads
  public fun physicalBonesStartSimulation(bones: VariantArray<StringName> =
      godot.core.variantArrayOf()): Unit {
    TransferContext.writeArguments(ARRAY to bones)
    TransferContext.callMethod(rawPtr, MethodBindings.physicalBonesStartSimulationPtr, NIL)
  }

  /**
   * Adds a collision exception to the physical bone.
   *
   * Works just like the [godot.RigidBody3D] node.
   */
  public fun physicalBonesAddCollisionException(exception: RID): Unit {
    TransferContext.writeArguments(_RID to exception)
    TransferContext.callMethod(rawPtr, MethodBindings.physicalBonesAddCollisionExceptionPtr, NIL)
  }

  /**
   * Removes a collision exception to the physical bone.
   *
   * Works just like the [godot.RigidBody3D] node.
   */
  public fun physicalBonesRemoveCollisionException(exception: RID): Unit {
    TransferContext.writeArguments(_RID to exception)
    TransferContext.callMethod(rawPtr, MethodBindings.physicalBonesRemoveCollisionExceptionPtr, NIL)
  }

  public companion object {
    /**
     * Notification received when this skeleton's pose needs to be updated.
     *
     * This notification is received *before* the related [poseUpdated] signal.
     */
    public final const val NOTIFICATION_UPDATE_SKELETON: Long = 50
  }

  internal object MethodBindings {
    public val addBonePtr: VoidPtr = TypeManager.getMethodBindPtr("Skeleton3D", "add_bone")

    public val findBonePtr: VoidPtr = TypeManager.getMethodBindPtr("Skeleton3D", "find_bone")

    public val getBoneNamePtr: VoidPtr = TypeManager.getMethodBindPtr("Skeleton3D", "get_bone_name")

    public val setBoneNamePtr: VoidPtr = TypeManager.getMethodBindPtr("Skeleton3D", "set_bone_name")

    public val getBoneParentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_bone_parent")

    public val setBoneParentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "set_bone_parent")

    public val getBoneCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_bone_count")

    public val getVersionPtr: VoidPtr = TypeManager.getMethodBindPtr("Skeleton3D", "get_version")

    public val unparentBoneAndRestPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "unparent_bone_and_rest")

    public val getBoneChildrenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_bone_children")

    public val getParentlessBonesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_parentless_bones")

    public val getBoneRestPtr: VoidPtr = TypeManager.getMethodBindPtr("Skeleton3D", "get_bone_rest")

    public val setBoneRestPtr: VoidPtr = TypeManager.getMethodBindPtr("Skeleton3D", "set_bone_rest")

    public val getBoneGlobalRestPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_bone_global_rest")

    public val createSkinFromRestTransformsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "create_skin_from_rest_transforms")

    public val registerSkinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "register_skin")

    public val localizeRestsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "localize_rests")

    public val clearBonesPtr: VoidPtr = TypeManager.getMethodBindPtr("Skeleton3D", "clear_bones")

    public val getBonePosePtr: VoidPtr = TypeManager.getMethodBindPtr("Skeleton3D", "get_bone_pose")

    public val setBonePosePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "set_bone_pose_position")

    public val setBonePoseRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "set_bone_pose_rotation")

    public val setBonePoseScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "set_bone_pose_scale")

    public val getBonePosePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_bone_pose_position")

    public val getBonePoseRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_bone_pose_rotation")

    public val getBonePoseScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_bone_pose_scale")

    public val resetBonePosePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "reset_bone_pose")

    public val resetBonePosesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "reset_bone_poses")

    public val isBoneEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "is_bone_enabled")

    public val setBoneEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "set_bone_enabled")

    public val clearBonesGlobalPoseOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "clear_bones_global_pose_override")

    public val setBoneGlobalPoseOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "set_bone_global_pose_override")

    public val getBoneGlobalPoseOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_bone_global_pose_override")

    public val getBoneGlobalPosePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_bone_global_pose")

    public val getBoneGlobalPoseNoOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_bone_global_pose_no_override")

    public val forceUpdateAllBoneTransformsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "force_update_all_bone_transforms")

    public val forceUpdateBoneChildTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "force_update_bone_child_transform")

    public val setMotionScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "set_motion_scale")

    public val getMotionScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_motion_scale")

    public val setShowRestOnlyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "set_show_rest_only")

    public val isShowRestOnlyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "is_show_rest_only")

    public val setAnimatePhysicalBonesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "set_animate_physical_bones")

    public val getAnimatePhysicalBonesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_animate_physical_bones")

    public val physicalBonesStopSimulationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "physical_bones_stop_simulation")

    public val physicalBonesStartSimulationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "physical_bones_start_simulation")

    public val physicalBonesAddCollisionExceptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "physical_bones_add_collision_exception")

    public val physicalBonesRemoveCollisionExceptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "physical_bones_remove_collision_exception")
  }
}
