// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A modification that uses CCDIK to manipulate a series of bones to reach a target in 2D.
 *
 * This [godot.SkeletonModification2D] uses an algorithm called Cyclic Coordinate Descent Inverse Kinematics, or CCDIK, to manipulate a chain of bones in a [godot.Skeleton2D] so it reaches a defined target.
 *
 * CCDIK works by rotating a set of bones, typically called a "bone chain", on a single axis. Each bone is rotated to face the target from the tip (by default), which over a chain of bones allow it to rotate properly to reach the target. Because the bones only rotate on a single axis, CCDIK *can* look more robotic than other IK solvers.
 *
 * **Note:** The CCDIK modifier has `ccdik_joints`, which are the data objects that hold the data for each joint in the CCDIK chain. This is different from a bone! CCDIK joints hold the data needed for each bone in the bone chain used by CCDIK.
 *
 * CCDIK also fully supports angle constraints, allowing for more control over how a solution is met.
 */
@GodotBaseType
public open class SkeletonModification2DCCDIK : SkeletonModification2D() {
  /**
   * The NodePath to the node that is the target for the CCDIK modification. This node is what the CCDIK chain will attempt to rotate the bone chain to.
   */
  public var targetNodepath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DCCDIK_GET_TARGET_NODE, NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DCCDIK_SET_TARGET_NODE, NIL)
    }

  /**
   * The end position of the CCDIK chain. Typically, this should be a child of a [godot.Bone2D] node attached to the final [godot.Bone2D] in the CCDIK chain.
   */
  public var tipNodepath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DCCDIK_GET_TIP_NODE, NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DCCDIK_SET_TIP_NODE, NIL)
    }

  /**
   * The number of CCDIK joints in the CCDIK modification.
   */
  public var ccdikDataChainLength: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DCCDIK_GET_CCDIK_DATA_CHAIN_LENGTH, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DCCDIK_SET_CCDIK_DATA_CHAIN_LENGTH, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SKELETONMODIFICATION2DCCDIK)
  }

  /**
   * Sets the [godot.Bone2D] node assigned to the CCDIK joint at [jointIdx].
   */
  public fun setCcdikJointBone2dNode(jointIdx: Long, bone2dNodepath: NodePath): Unit {
    TransferContext.writeArguments(LONG to jointIdx, NODE_PATH to bone2dNodepath)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DCCDIK_SET_CCDIK_JOINT_BONE2D_NODE, NIL)
  }

  /**
   * Returns the [godot.Bone2D] node assigned to the CCDIK joint at [jointIdx].
   */
  public fun getCcdikJointBone2dNode(jointIdx: Long): NodePath {
    TransferContext.writeArguments(LONG to jointIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DCCDIK_GET_CCDIK_JOINT_BONE2D_NODE, NODE_PATH)
    return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
  }

  /**
   * Sets the bone index, [boneIdx], of the CCDIK joint at [jointIdx]. When possible, this will also update the `bone2d_node` of the CCDIK joint based on data provided by the linked skeleton.
   */
  public fun setCcdikJointBoneIndex(jointIdx: Long, boneIdx: Long): Unit {
    TransferContext.writeArguments(LONG to jointIdx, LONG to boneIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DCCDIK_SET_CCDIK_JOINT_BONE_INDEX, NIL)
  }

  /**
   * Returns the index of the [godot.Bone2D] node assigned to the CCDIK joint at [jointIdx].
   */
  public fun getCcdikJointBoneIndex(jointIdx: Long): Long {
    TransferContext.writeArguments(LONG to jointIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DCCDIK_GET_CCDIK_JOINT_BONE_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets whether the joint at [jointIdx] is set to rotate from the joint, `true`, or to rotate from the tip, `false`.
   */
  public fun setCcdikJointRotateFromJoint(jointIdx: Long, rotateFromJoint: Boolean): Unit {
    TransferContext.writeArguments(LONG to jointIdx, BOOL to rotateFromJoint)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DCCDIK_SET_CCDIK_JOINT_ROTATE_FROM_JOINT, NIL)
  }

  /**
   * Returns whether the joint at [jointIdx] is set to rotate from the joint, `true`, or to rotate from the tip, `false`. The default is to rotate from the tip.
   */
  public fun getCcdikJointRotateFromJoint(jointIdx: Long): Boolean {
    TransferContext.writeArguments(LONG to jointIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DCCDIK_GET_CCDIK_JOINT_ROTATE_FROM_JOINT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Determines whether angle constraints on the CCDIK joint at [jointIdx] are enabled. When `true`, constraints will be enabled and taken into account when solving.
   */
  public fun setCcdikJointEnableConstraint(jointIdx: Long, enableConstraint: Boolean): Unit {
    TransferContext.writeArguments(LONG to jointIdx, BOOL to enableConstraint)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DCCDIK_SET_CCDIK_JOINT_ENABLE_CONSTRAINT, NIL)
  }

  /**
   * Returns whether angle constraints on the CCDIK joint at [jointIdx] are enabled.
   */
  public fun getCcdikJointEnableConstraint(jointIdx: Long): Boolean {
    TransferContext.writeArguments(LONG to jointIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DCCDIK_GET_CCDIK_JOINT_ENABLE_CONSTRAINT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the minimum angle constraint for the joint at [jointIdx].
   */
  public fun setCcdikJointConstraintAngleMin(jointIdx: Long, angleMin: Double): Unit {
    TransferContext.writeArguments(LONG to jointIdx, DOUBLE to angleMin)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DCCDIK_SET_CCDIK_JOINT_CONSTRAINT_ANGLE_MIN,
        NIL)
  }

  /**
   * Returns the minimum angle constraint for the joint at [jointIdx].
   */
  public fun getCcdikJointConstraintAngleMin(jointIdx: Long): Double {
    TransferContext.writeArguments(LONG to jointIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DCCDIK_GET_CCDIK_JOINT_CONSTRAINT_ANGLE_MIN,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets the maximum angle constraint for the joint at [jointIdx].
   */
  public fun setCcdikJointConstraintAngleMax(jointIdx: Long, angleMax: Double): Unit {
    TransferContext.writeArguments(LONG to jointIdx, DOUBLE to angleMax)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DCCDIK_SET_CCDIK_JOINT_CONSTRAINT_ANGLE_MAX,
        NIL)
  }

  /**
   * Returns the maximum angle constraint for the joint at [jointIdx].
   */
  public fun getCcdikJointConstraintAngleMax(jointIdx: Long): Double {
    TransferContext.writeArguments(LONG to jointIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DCCDIK_GET_CCDIK_JOINT_CONSTRAINT_ANGLE_MAX,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets whether the CCDIK joint at [jointIdx] uses an inverted joint constraint.
   *
   * An inverted joint constraint only constraints the CCDIK joint to the angles *outside of* the inputted minimum and maximum angles. For this reason, it is referred to as an inverted joint constraint, as it constraints the joint to the outside of the inputted values.
   */
  public fun setCcdikJointConstraintAngleInvert(jointIdx: Long, invert: Boolean): Unit {
    TransferContext.writeArguments(LONG to jointIdx, BOOL to invert)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DCCDIK_SET_CCDIK_JOINT_CONSTRAINT_ANGLE_INVERT,
        NIL)
  }

  /**
   * Returns whether the CCDIK joint at [jointIdx] uses an inverted joint constraint. See [setCcdikJointConstraintAngleInvert] for details.
   */
  public fun getCcdikJointConstraintAngleInvert(jointIdx: Long): Boolean {
    TransferContext.writeArguments(LONG to jointIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DCCDIK_GET_CCDIK_JOINT_CONSTRAINT_ANGLE_INVERT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public companion object
}
