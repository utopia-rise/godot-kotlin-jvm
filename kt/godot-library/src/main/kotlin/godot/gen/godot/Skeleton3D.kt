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
import godot.core.VariantType.STRING_NAME
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
 * [Skeleton3D] provides an interface for managing a hierarchy of bones, including pose, rest and
 * animation (see [Animation]). It can also use ragdoll physics.
 * The overall transform of a bone with respect to the skeleton is determined by bone pose. Bone
 * rest defines the initial transform of the bone pose.
 * Note that "global pose" below refers to the overall transform of the bone with respect to
 * skeleton, so it is not the actual global/world transform of the bone.
 */
@GodotBaseType
public open class Skeleton3D : Node3D() {
  /**
   * Emitted when the pose is updated.
   * **Note:** During the update process, this signal is not fired, so modification by
   * [SkeletonModifier3D] is not detected.
   */
  public val poseUpdated: Signal0 by signal()

  /**
   * Emitted when the final pose has been calculated will be applied to the skin in the update
   * process.
   * This means that all [SkeletonModifier3D] processing is complete. In order to detect the
   * completion of the processing of each [SkeletonModifier3D], use [signal
   * SkeletonModifier3D.modification_processed].
   */
  public val skeletonUpdated: Signal0 by signal()

  /**
   * Emitted when the bone at [boneIdx] is toggled with [setBoneEnabled]. Use [isBoneEnabled] to
   * check the new value.
   */
  public val boneEnabledChanged: Signal1<Long> by signal("boneIdx")

  public val boneListChanged: Signal0 by signal()

  /**
   * Emitted when the value of [showRestOnly] changes.
   */
  public val showRestOnlyChanged: Signal0 by signal()

  /**
   * Multiplies the 3D position track animation.
   * **Note:** Unless this value is `1.0`, the key value in animation will not match the actual
   * position value.
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
   * If `true`, forces the bones in their default rest pose, regardless of their values. In the
   * editor, this also prevents the bones from being edited.
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
   * Sets the processing timing for the Modifier.
   */
  public var modifierCallbackModeProcess: ModifierCallbackModeProcess
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getModifierCallbackModeProcessPtr, LONG)
      return Skeleton3D.ModifierCallbackModeProcess.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setModifierCallbackModeProcessPtr, NIL)
    }

  /**
   * If you follow the recommended workflow and explicitly have [PhysicalBoneSimulator3D] as a child
   * of [Skeleton3D], you can control whether it is affected by raycasting without running
   * [physicalBonesStartSimulation], by its [SkeletonModifier3D.active].
   * However, for old (deprecated) configurations, [Skeleton3D] has an internal virtual
   * [PhysicalBoneSimulator3D] for compatibility. This property controls the internal virtual
   * [PhysicalBoneSimulator3D]'s [SkeletonModifier3D.active].
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

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_SKELETON3D, scriptIndex)
  }

  /**
   * Adds a new bone with the given name. Returns the new bone's index, or `-1` if this method
   * fails.
   * **Note:** Bone names should be unique, non empty, and cannot include the `:` and `/`
   * characters.
   */
  public fun addBone(name: String): Int {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.addBonePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the bone index that matches [name] as its name. Returns `-1` if no bone with this name
   * exists.
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
   * Sets the bone name, [name], for the bone at [boneIdx].
   */
  public fun setBoneName(boneIdx: Int, name: String): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), STRING to name)
    TransferContext.callMethod(rawPtr, MethodBindings.setBoneNamePtr, NIL)
  }

  /**
   * Returns all bone names concatenated with commas (`,`) as a single [StringName].
   * It is useful to set it as a hint for the enum property.
   */
  public fun getConcatenatedBoneNames(): StringName {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConcatenatedBoneNamesPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  /**
   * Returns the bone index which is the parent of the bone at [boneIdx]. If -1, then bone has no
   * parent.
   * **Note:** The parent bone returned will always be less than [boneIdx].
   */
  public fun getBoneParent(boneIdx: Int): Int {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBoneParentPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the bone index [parentIdx] as the parent of the bone at [boneIdx]. If -1, then bone has no
   * parent.
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
   * Returns the number of times the bone hierarchy has changed within this skeleton, including
   * renames.
   * The Skeleton version is not serialized: only use within a single instance of Skeleton3D.
   * Use for invalidating caches in IK solvers and other nodes which process bones.
   */
  public fun getVersion(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVersionPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Unparents the bone at [boneIdx] and sets its rest position to that of its parent prior to being
   * reset.
   */
  public fun unparentBoneAndRest(boneIdx: Int): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.unparentBoneAndRestPtr, NIL)
  }

  /**
   * Returns an array containing the bone indexes of all the child node of the passed in bone,
   * [boneIdx].
   */
  public fun getBoneChildren(boneIdx: Int): PackedInt32Array {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBoneChildrenPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Returns an array with all of the bones that are parentless. Another way to look at this is that
   * it returns the indexes of all the bones that are not dependent or modified by other bones in the
   * Skeleton.
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
   * **Note:** This is the pose you set to the skeleton in the process, the final pose can get
   * overridden by modifiers in the deferred process, if you want to access the final pose, use [signal
   * SkeletonModifier3D.modification_processed].
   */
  public fun getBonePose(boneIdx: Int): Transform3D {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBonePosePtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  /**
   * Sets the pose transform, [pose], for the bone at [boneIdx].
   */
  public fun setBonePose(boneIdx: Int, pose: Transform3D): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), TRANSFORM3D to pose)
    TransferContext.callMethod(rawPtr, MethodBindings.setBonePosePtr, NIL)
  }

  /**
   * Sets the pose position of the bone at [boneIdx] to [position]. [position] is a [Vector3]
   * describing a position local to the [Skeleton3D] node.
   */
  public fun setBonePosePosition(boneIdx: Int, position: Vector3): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), VECTOR3 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.setBonePosePositionPtr, NIL)
  }

  /**
   * Sets the pose rotation of the bone at [boneIdx] to [rotation]. [rotation] is a [Quaternion]
   * describing a rotation in the bone's local coordinate space with respect to the rotation of any
   * parent bones.
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
   * Returns the pose position of the bone at [boneIdx]. The returned [Vector3] is in the local
   * coordinate space of the [Skeleton3D] node.
   */
  public fun getBonePosePosition(boneIdx: Int): Vector3 {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBonePosePositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Returns the pose rotation of the bone at [boneIdx]. The returned [Quaternion] is local to the
   * bone with respect to the rotation of any parent bones.
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
   * Returns the overall transform of the specified bone, with respect to the skeleton. Being
   * relative to the skeleton frame, this is not the actual "global" transform of the bone.
   * **Note:** This is the global pose you set to the skeleton in the process, the final global pose
   * can get overridden by modifiers in the deferred process, if you want to access the final global
   * pose, use [signal SkeletonModifier3D.modification_processed].
   */
  public fun getBoneGlobalPose(boneIdx: Int): Transform3D {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBoneGlobalPosePtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  /**
   * Sets the global pose transform, [pose], for the bone at [boneIdx].
   * **Note:** If other bone poses have been changed, this method executes a dirty poses
   * recalculation and will cause performance to deteriorate. If you know that multiple global poses
   * will be applied, consider using [setBonePose] with precalculation.
   */
  public fun setBoneGlobalPose(boneIdx: Int, pose: Transform3D): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong(), TRANSFORM3D to pose)
    TransferContext.callMethod(rawPtr, MethodBindings.setBoneGlobalPosePtr, NIL)
  }

  /**
   * Force updates the bone transforms/poses for all bones in the skeleton.
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
   * Removes the global pose override on all bones in the skeleton.
   */
  public fun clearBonesGlobalPoseOverride(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearBonesGlobalPoseOverridePtr, NIL)
  }

  /**
   * Sets the global pose transform, [pose], for the bone at [boneIdx].
   * [amount] is the interpolation strength that will be used when applying the pose, and
   * [persistent] determines if the applied pose will remain.
   * **Note:** The pose transform needs to be a global pose! To convert a world transform from a
   * [Node3D] to a global bone pose, multiply the [Transform3D.affineInverse] of the node's
   * [Node3D.globalTransform] by the desired world transform.
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
   * Returns the overall transform of the specified bone, with respect to the skeleton, but without
   * any global pose overrides. Being relative to the skeleton frame, this is not the actual "global"
   * transform of the bone.
   */
  public fun getBoneGlobalPoseNoOverride(boneIdx: Int): Transform3D {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getBoneGlobalPoseNoOverridePtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  /**
   * Tells the [PhysicalBone3D] nodes in the Skeleton to stop simulating.
   */
  public fun physicalBonesStopSimulation(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.physicalBonesStopSimulationPtr, NIL)
  }

  /**
   * Tells the [PhysicalBone3D] nodes in the Skeleton to start simulating and reacting to the
   * physics world.
   * Optionally, a list of bone names can be passed-in, allowing only the passed-in bones to be
   * simulated.
   */
  @JvmOverloads
  public fun physicalBonesStartSimulation(bones: VariantArray<StringName> =
      godot.core.variantArrayOf()): Unit {
    TransferContext.writeArguments(ARRAY to bones)
    TransferContext.callMethod(rawPtr, MethodBindings.physicalBonesStartSimulationPtr, NIL)
  }

  /**
   * Adds a collision exception to the physical bone.
   * Works just like the [RigidBody3D] node.
   */
  public fun physicalBonesAddCollisionException(exception: RID): Unit {
    TransferContext.writeArguments(_RID to exception)
    TransferContext.callMethod(rawPtr, MethodBindings.physicalBonesAddCollisionExceptionPtr, NIL)
  }

  /**
   * Removes a collision exception to the physical bone.
   * Works just like the [RigidBody3D] node.
   */
  public fun physicalBonesRemoveCollisionException(exception: RID): Unit {
    TransferContext.writeArguments(_RID to exception)
    TransferContext.callMethod(rawPtr, MethodBindings.physicalBonesRemoveCollisionExceptionPtr, NIL)
  }

  public enum class ModifierCallbackModeProcess(
    id: Long,
  ) {
    /**
     * Set a flag to process modification during physics frames (see
     * [Node.NOTIFICATION_INTERNAL_PHYSICS_PROCESS]).
     */
    MODIFIER_CALLBACK_MODE_PROCESS_PHYSICS(0),
    /**
     * Set a flag to process modification during process frames (see
     * [Node.NOTIFICATION_INTERNAL_PROCESS]).
     */
    MODIFIER_CALLBACK_MODE_PROCESS_IDLE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ModifierCallbackModeProcess =
          entries.single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Notification received when this skeleton's pose needs to be updated. In that case, this is
     * called only once per frame in a deferred process.
     */
    public final const val NOTIFICATION_UPDATE_SKELETON: Long = 50
  }

  internal object MethodBindings {
    public val addBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "add_bone", 1597066294)

    public val findBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "find_bone", 1321353865)

    public val getBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_bone_name", 844755477)

    public val setBoneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "set_bone_name", 501894301)

    public val getConcatenatedBoneNamesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_concatenated_bone_names", 2002593661)

    public val getBoneParentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_bone_parent", 923996154)

    public val setBoneParentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "set_bone_parent", 3937882851)

    public val getBoneCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_bone_count", 3905245786)

    public val getVersionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_version", 3905245786)

    public val unparentBoneAndRestPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "unparent_bone_and_rest", 1286410249)

    public val getBoneChildrenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_bone_children", 1706082319)

    public val getParentlessBonesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_parentless_bones", 1930428628)

    public val getBoneRestPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_bone_rest", 1965739696)

    public val setBoneRestPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "set_bone_rest", 3616898986)

    public val getBoneGlobalRestPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_bone_global_rest", 1965739696)

    public val createSkinFromRestTransformsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "create_skin_from_rest_transforms", 1032037385)

    public val registerSkinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "register_skin", 3405789568)

    public val localizeRestsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "localize_rests", 3218959716)

    public val clearBonesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "clear_bones", 3218959716)

    public val getBonePosePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_bone_pose", 1965739696)

    public val setBonePosePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "set_bone_pose", 3616898986)

    public val setBonePosePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "set_bone_pose_position", 1530502735)

    public val setBonePoseRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "set_bone_pose_rotation", 2823819782)

    public val setBonePoseScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "set_bone_pose_scale", 1530502735)

    public val getBonePosePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_bone_pose_position", 711720468)

    public val getBonePoseRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_bone_pose_rotation", 476865136)

    public val getBonePoseScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_bone_pose_scale", 711720468)

    public val resetBonePosePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "reset_bone_pose", 1286410249)

    public val resetBonePosesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "reset_bone_poses", 3218959716)

    public val isBoneEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "is_bone_enabled", 1116898809)

    public val setBoneEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "set_bone_enabled", 972357352)

    public val getBoneGlobalPosePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_bone_global_pose", 1965739696)

    public val setBoneGlobalPosePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "set_bone_global_pose", 3616898986)

    public val forceUpdateAllBoneTransformsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "force_update_all_bone_transforms", 3218959716)

    public val forceUpdateBoneChildTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "force_update_bone_child_transform", 1286410249)

    public val setMotionScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "set_motion_scale", 373806689)

    public val getMotionScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_motion_scale", 1740695150)

    public val setShowRestOnlyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "set_show_rest_only", 2586408642)

    public val isShowRestOnlyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "is_show_rest_only", 36873697)

    public val setModifierCallbackModeProcessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "set_modifier_callback_mode_process", 3916362634)

    public val getModifierCallbackModeProcessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_modifier_callback_mode_process", 997182536)

    public val clearBonesGlobalPoseOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "clear_bones_global_pose_override", 3218959716)

    public val setBoneGlobalPoseOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "set_bone_global_pose_override", 3483398371)

    public val getBoneGlobalPoseOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_bone_global_pose_override", 1965739696)

    public val getBoneGlobalPoseNoOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_bone_global_pose_no_override", 1965739696)

    public val setAnimatePhysicalBonesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "set_animate_physical_bones", 2586408642)

    public val getAnimatePhysicalBonesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "get_animate_physical_bones", 36873697)

    public val physicalBonesStopSimulationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "physical_bones_stop_simulation", 3218959716)

    public val physicalBonesStartSimulationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "physical_bones_start_simulation", 2787316981)

    public val physicalBonesAddCollisionExceptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "physical_bones_add_collision_exception", 2722037293)

    public val physicalBonesRemoveCollisionExceptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Skeleton3D", "physical_bones_remove_collision_exception", 2722037293)
  }
}
