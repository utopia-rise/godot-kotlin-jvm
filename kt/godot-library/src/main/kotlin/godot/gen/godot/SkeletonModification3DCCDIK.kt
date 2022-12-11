// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A modification that uses CCDIK to manipulate a series of bones to reach a target.
 *
 * This [godot.SkeletonModification3D] uses an algorithm called Cyclic Coordinate Descent Inverse Kinematics, or CCDIK, to manipulate a chain of bones in a Skeleton so it reaches a defined target.
 *
 * CCDIK works by rotating a set of bones, typically called a "bone chain", on a single axis. Each bone is rotated to face the target from the tip (by default), which over a chain of bones allow it to rotate properly to reach the target. Because the bones only rotate on a single axis, CCDIK *can* look more robotic than other IK solvers.
 *
 * **Note:** The CCDIK modifier has `ccdik_joints`, which are the data objects that hold the data for each joint in the CCDIK chain. This is different from a bone! CCDIK joints hold the data needed for each bone in the bone chain used by CCDIK.
 *
 * CCDIK also fully supports angle constraints, allowing for more control over how a solution is met.
 */
@GodotBaseType
public open class SkeletonModification3DCCDIK : SkeletonModification3D() {
  /**
   * The NodePath to the node that is the target for the CCDIK modification. This node is what the CCDIK chain will attempt to rotate the bone chain to.
   */
  public var targetNodepath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DCCDIK_GET_TARGET_NODE, NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DCCDIK_SET_TARGET_NODE, NIL)
    }

  /**
   * The end position of the CCDIK chain. Typically, this should be a child of a [godot.BoneAttachment3D] node attached to the final bone in the CCDIK chain, where the child node is offset so it is at the end of the final bone.
   */
  public var tipNodepath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DCCDIK_GET_TIP_NODE, NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DCCDIK_SET_TIP_NODE, NIL)
    }

  /**
   * When true, the CCDIK algorithm will perform a higher quality solve that returns more natural results. A high quality solve requires more computation power to solve though, and therefore can be disabled to save performance.
   */
  public var highQualitySolve: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DCCDIK_GET_USE_HIGH_QUALITY_SOLVE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DCCDIK_SET_USE_HIGH_QUALITY_SOLVE, NIL)
    }

  /**
   * The number of CCDIK joints in the CCDIK modification.
   */
  public var ccdikDataChainLength: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DCCDIK_GET_CCDIK_DATA_CHAIN_LENGTH, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DCCDIK_SET_CCDIK_DATA_CHAIN_LENGTH, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SKELETONMODIFICATION3DCCDIK, scriptIndex)
    return true
  }

  /**
   * Returns the name of the bone that is assigned to the CCDIK joint at [jointIdx].
   */
  public fun getCcdikJointBoneName(jointIdx: Long): String {
    TransferContext.writeArguments(LONG to jointIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DCCDIK_GET_CCDIK_JOINT_BONE_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Sets the bone name, [boneName], of the CCDIK joint at [jointIdx]. When possible, this will also update the `bone_index` of the CCDIK joint based on data provided by the linked skeleton.
   */
  public fun setCcdikJointBoneName(jointIdx: Long, boneName: String): Unit {
    TransferContext.writeArguments(LONG to jointIdx, STRING to boneName)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DCCDIK_SET_CCDIK_JOINT_BONE_NAME, NIL)
  }

  /**
   * Returns the bone index of the bone assigned to the CCDIK joint at [jointIdx].
   */
  public fun getCcdikJointBoneIndex(jointIdx: Long): Long {
    TransferContext.writeArguments(LONG to jointIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DCCDIK_GET_CCDIK_JOINT_BONE_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the bone index, [boneIndex], of the CCDIK joint at [jointIdx]. When possible, this will also update the `bone_name` of the CCDIK joint based on data provided by the linked skeleton.
   */
  public fun setCcdikJointBoneIndex(jointIdx: Long, boneIndex: Long): Unit {
    TransferContext.writeArguments(LONG to jointIdx, LONG to boneIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DCCDIK_SET_CCDIK_JOINT_BONE_INDEX, NIL)
  }

  /**
   * Returns the integer representing the joint axis of the CCDIK joint at [jointIdx].
   */
  public fun getCcdikJointCcdikAxis(jointIdx: Long): Long {
    TransferContext.writeArguments(LONG to jointIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DCCDIK_GET_CCDIK_JOINT_CCDIK_AXIS, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the joint axis of the CCDIK joint at [jointIdx] to the passed-in joint axis, [axis].
   */
  public fun setCcdikJointCcdikAxis(jointIdx: Long, axis: Long): Unit {
    TransferContext.writeArguments(LONG to jointIdx, LONG to axis)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DCCDIK_SET_CCDIK_JOINT_CCDIK_AXIS, NIL)
  }

  /**
   * Enables angle constraints to the CCDIK joint at [jointIdx].
   */
  public fun getCcdikJointEnableJointConstraint(jointIdx: Long): Boolean {
    TransferContext.writeArguments(LONG to jointIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DCCDIK_GET_CCDIK_JOINT_ENABLE_JOINT_CONSTRAINT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets whether joint constraints are enabled for the CCDIK joint at [jointIdx].
   */
  public fun setCcdikJointEnableJointConstraint(jointIdx: Long, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to jointIdx, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DCCDIK_SET_CCDIK_JOINT_ENABLE_JOINT_CONSTRAINT,
        NIL)
  }

  /**
   * Returns the minimum angle constraint for the joint at [jointIdx]. **Note:** This angle is in degrees!
   */
  public fun getCcdikJointConstraintAngleMin(jointIdx: Long): Double {
    TransferContext.writeArguments(LONG to jointIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DCCDIK_GET_CCDIK_JOINT_CONSTRAINT_ANGLE_MIN,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets the minimum angle constraint for the joint at [jointIdx]. **Note:** This angle must be in radians!
   */
  public fun setCcdikJointConstraintAngleMin(jointIdx: Long, minAngle: Double): Unit {
    TransferContext.writeArguments(LONG to jointIdx, DOUBLE to minAngle)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DCCDIK_SET_CCDIK_JOINT_CONSTRAINT_ANGLE_MIN,
        NIL)
  }

  /**
   * Returns the maximum angle constraint for the joint at [jointIdx]. **Note:** This angle is in degrees!
   */
  public fun getCcdikJointConstraintAngleMax(jointIdx: Long): Double {
    TransferContext.writeArguments(LONG to jointIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DCCDIK_GET_CCDIK_JOINT_CONSTRAINT_ANGLE_MAX,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets the maximum angle constraint for the joint at [jointIdx]. **Note:** This angle must be in radians!
   */
  public fun setCcdikJointConstraintAngleMax(jointIdx: Long, maxAngle: Double): Unit {
    TransferContext.writeArguments(LONG to jointIdx, DOUBLE to maxAngle)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DCCDIK_SET_CCDIK_JOINT_CONSTRAINT_ANGLE_MAX,
        NIL)
  }

  /**
   * Returns whether the CCDIK joint at [jointIdx] uses an inverted joint constraint. See [setCcdikJointConstraintInvert] for details.
   */
  public fun getCcdikJointConstraintInvert(jointIdx: Long): Boolean {
    TransferContext.writeArguments(LONG to jointIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DCCDIK_GET_CCDIK_JOINT_CONSTRAINT_INVERT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets whether the CCDIK joint at [jointIdx] uses an inverted joint constraint.
   *
   * An inverted joint constraint only constraints the CCDIK joint to the angles *outside of* the inputted minimum and maximum angles. For this reason, it is referred to as an inverted joint constraint, as it constraints the joint to the outside of the inputted values.
   */
  public fun setCcdikJointConstraintInvert(jointIdx: Long, invert: Boolean): Unit {
    TransferContext.writeArguments(LONG to jointIdx, BOOL to invert)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DCCDIK_SET_CCDIK_JOINT_CONSTRAINT_INVERT, NIL)
  }

  public companion object
}
