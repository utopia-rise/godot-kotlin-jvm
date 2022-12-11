// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.Transform2D
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType._RID
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Skeleton for 2D characters and animated objects.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/animation/2d_skeletons.html]($DOCS_URL/tutorials/animation/2d_skeletons.html)
 *
 * Skeleton2D parents a hierarchy of [godot.Bone2D] objects. It is a requirement of [godot.Bone2D]. Skeleton2D holds a reference to the rest pose of its children and acts as a single point of access to its bones.
 *
 * To setup different types of inverse kinematics for the given Skeleton2D, a [godot.SkeletonModificationStack2D] should be created. They can be applied by creating the desired number of modifications, which can be done by increasing [godot.SkeletonModificationStack2D.modificationCount].
 */
@GodotBaseType
public open class Skeleton2D : Node2D() {
  /**
   * Emitted when the [godot.Bone2D] setup attached to this skeletons changes. This is primarily used internally within the skeleton.
   */
  public val boneSetupChanged: Signal0 by signal()

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SKELETON2D, scriptIndex)
    return true
  }

  /**
   * Returns the number of [godot.Bone2D] nodes in the node hierarchy parented by Skeleton2D.
   */
  public fun getBoneCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON2D_GET_BONE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns a [godot.Bone2D] from the node hierarchy parented by Skeleton2D. The object to return is identified by the parameter [idx]. Bones are indexed by descending the node hierarchy from top to bottom, adding the children of each branch before moving to the next sibling.
   */
  public fun getBone(idx: Long): Bone2D? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON2D_GET_BONE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Bone2D?
  }

  /**
   * Returns the [RID] of a Skeleton2D instance.
   */
  public fun getSkeleton(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON2D_GET_SKELETON, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Sets the [godot.SkeletonModificationStack2D] attached to this skeleton.
   */
  public fun setModificationStack(modificationStack: SkeletonModificationStack2D): Unit {
    TransferContext.writeArguments(OBJECT to modificationStack)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON2D_SET_MODIFICATION_STACK,
        NIL)
  }

  /**
   * Returns the [godot.SkeletonModificationStack2D] attached to this skeleton, if one exists.
   */
  public fun getModificationStack(): SkeletonModificationStack2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON2D_GET_MODIFICATION_STACK,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as SkeletonModificationStack2D?
  }

  /**
   * Executes all the modifications on the [godot.SkeletonModificationStack2D], if the Skeleton3D has one assigned.
   */
  public fun executeModifications(delta: Double, executionMode: Long): Unit {
    TransferContext.writeArguments(DOUBLE to delta, LONG to executionMode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SKELETON2D_EXECUTE_MODIFICATIONS,
        NIL)
  }

  /**
   * Sets the local pose transform, [overridePose], for the bone at [boneIdx].
   *
   * [strength] is the interpolation strength that will be used when applying the pose, and [persistent] determines if the applied pose will remain.
   *
   * **Note:** The pose transform needs to be a local transform relative to the [godot.Bone2D] node at [boneIdx]!
   */
  public fun setBoneLocalPoseOverride(
    boneIdx: Long,
    overridePose: Transform2D,
    strength: Double,
    persistent: Boolean
  ): Unit {
    TransferContext.writeArguments(LONG to boneIdx, TRANSFORM2D to overridePose, DOUBLE to strength, BOOL to persistent)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON2D_SET_BONE_LOCAL_POSE_OVERRIDE, NIL)
  }

  /**
   * Returns the local pose override transform for [boneIdx].
   */
  public fun getBoneLocalPoseOverride(boneIdx: Long): Transform2D {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETON2D_GET_BONE_LOCAL_POSE_OVERRIDE, TRANSFORM2D)
    return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
  }

  public companion object
}
