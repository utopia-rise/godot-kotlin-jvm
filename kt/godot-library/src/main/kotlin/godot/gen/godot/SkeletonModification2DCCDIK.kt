// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * This [SkeletonModification2D] uses an algorithm called Cyclic Coordinate Descent Inverse
 * Kinematics, or CCDIK, to manipulate a chain of bones in a [Skeleton2D] so it reaches a defined
 * target.
 * CCDIK works by rotating a set of bones, typically called a "bone chain", on a single axis. Each
 * bone is rotated to face the target from the tip (by default), which over a chain of bones allow it
 * to rotate properly to reach the target. Because the bones only rotate on a single axis, CCDIK *can*
 * look more robotic than other IK solvers.
 * **Note:** The CCDIK modifier has `ccdik_joints`, which are the data objects that hold the data
 * for each joint in the CCDIK chain. This is different from a bone! CCDIK joints hold the data needed
 * for each bone in the bone chain used by CCDIK.
 * CCDIK also fully supports angle constraints, allowing for more control over how a solution is
 * met.
 */
@GodotBaseType
public open class SkeletonModification2DCCDIK : SkeletonModification2D() {
  /**
   * The NodePath to the node that is the target for the CCDIK modification. This node is what the
   * CCDIK chain will attempt to rotate the bone chain to.
   */
  public var targetNodepath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTargetNodePtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTargetNodePtr, NIL)
    }

  /**
   * The end position of the CCDIK chain. Typically, this should be a child of a [Bone2D] node
   * attached to the final [Bone2D] in the CCDIK chain.
   */
  public var tipNodepath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTipNodePtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTipNodePtr, NIL)
    }

  /**
   * The number of CCDIK joints in the CCDIK modification.
   */
  public var ccdikDataChainLength: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCcdikDataChainLengthPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setCcdikDataChainLengthPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SKELETONMODIFICATION2DCCDIK, scriptIndex)
    return true
  }

  /**
   * Sets the [Bone2D] node assigned to the CCDIK joint at [param joint_idx].
   */
  public fun setCcdikJointBone2dNode(jointIdx: Int, bone2dNodepath: NodePath): Unit {
    TransferContext.writeArguments(LONG to jointIdx.toLong(), NODE_PATH to bone2dNodepath)
    TransferContext.callMethod(rawPtr, MethodBindings.setCcdikJointBone2dNodePtr, NIL)
  }

  /**
   * Returns the [Bone2D] node assigned to the CCDIK joint at [param joint_idx].
   */
  public fun getCcdikJointBone2dNode(jointIdx: Int): NodePath {
    TransferContext.writeArguments(LONG to jointIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCcdikJointBone2dNodePtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
  }

  /**
   * Sets the bone index, [param bone_idx], of the CCDIK joint at [param joint_idx]. When possible,
   * this will also update the `bone2d_node` of the CCDIK joint based on data provided by the linked
   * skeleton.
   */
  public fun setCcdikJointBoneIndex(jointIdx: Int, boneIdx: Int): Unit {
    TransferContext.writeArguments(LONG to jointIdx.toLong(), LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setCcdikJointBoneIndexPtr, NIL)
  }

  /**
   * Returns the index of the [Bone2D] node assigned to the CCDIK joint at [param joint_idx].
   */
  public fun getCcdikJointBoneIndex(jointIdx: Int): Int {
    TransferContext.writeArguments(LONG to jointIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCcdikJointBoneIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets whether the joint at [param joint_idx] is set to rotate from the joint, `true`, or to
   * rotate from the tip, `false`.
   */
  public fun setCcdikJointRotateFromJoint(jointIdx: Int, rotateFromJoint: Boolean): Unit {
    TransferContext.writeArguments(LONG to jointIdx.toLong(), BOOL to rotateFromJoint)
    TransferContext.callMethod(rawPtr, MethodBindings.setCcdikJointRotateFromJointPtr, NIL)
  }

  /**
   * Returns whether the joint at [param joint_idx] is set to rotate from the joint, `true`, or to
   * rotate from the tip, `false`. The default is to rotate from the tip.
   */
  public fun getCcdikJointRotateFromJoint(jointIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to jointIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCcdikJointRotateFromJointPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Determines whether angle constraints on the CCDIK joint at [param joint_idx] are enabled. When
   * `true`, constraints will be enabled and taken into account when solving.
   */
  public fun setCcdikJointEnableConstraint(jointIdx: Int, enableConstraint: Boolean): Unit {
    TransferContext.writeArguments(LONG to jointIdx.toLong(), BOOL to enableConstraint)
    TransferContext.callMethod(rawPtr, MethodBindings.setCcdikJointEnableConstraintPtr, NIL)
  }

  /**
   * Returns whether angle constraints on the CCDIK joint at [param joint_idx] are enabled.
   */
  public fun getCcdikJointEnableConstraint(jointIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to jointIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCcdikJointEnableConstraintPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the minimum angle constraint for the joint at [param joint_idx].
   */
  public fun setCcdikJointConstraintAngleMin(jointIdx: Int, angleMin: Float): Unit {
    TransferContext.writeArguments(LONG to jointIdx.toLong(), DOUBLE to angleMin.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setCcdikJointConstraintAngleMinPtr, NIL)
  }

  /**
   * Returns the minimum angle constraint for the joint at [param joint_idx].
   */
  public fun getCcdikJointConstraintAngleMin(jointIdx: Int): Float {
    TransferContext.writeArguments(LONG to jointIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCcdikJointConstraintAngleMinPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Sets the maximum angle constraint for the joint at [param joint_idx].
   */
  public fun setCcdikJointConstraintAngleMax(jointIdx: Int, angleMax: Float): Unit {
    TransferContext.writeArguments(LONG to jointIdx.toLong(), DOUBLE to angleMax.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setCcdikJointConstraintAngleMaxPtr, NIL)
  }

  /**
   * Returns the maximum angle constraint for the joint at [param joint_idx].
   */
  public fun getCcdikJointConstraintAngleMax(jointIdx: Int): Float {
    TransferContext.writeArguments(LONG to jointIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCcdikJointConstraintAngleMaxPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Sets whether the CCDIK joint at [param joint_idx] uses an inverted joint constraint.
   * An inverted joint constraint only constraints the CCDIK joint to the angles *outside of* the
   * inputted minimum and maximum angles. For this reason, it is referred to as an inverted joint
   * constraint, as it constraints the joint to the outside of the inputted values.
   */
  public fun setCcdikJointConstraintAngleInvert(jointIdx: Int, invert: Boolean): Unit {
    TransferContext.writeArguments(LONG to jointIdx.toLong(), BOOL to invert)
    TransferContext.callMethod(rawPtr, MethodBindings.setCcdikJointConstraintAngleInvertPtr, NIL)
  }

  /**
   * Returns whether the CCDIK joint at [param joint_idx] uses an inverted joint constraint. See
   * [setCcdikJointConstraintAngleInvert] for details.
   */
  public fun getCcdikJointConstraintAngleInvert(jointIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to jointIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCcdikJointConstraintAngleInvertPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setTargetNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "set_target_node")

    public val getTargetNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "get_target_node")

    public val setTipNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "set_tip_node")

    public val getTipNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "get_tip_node")

    public val setCcdikDataChainLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "set_ccdik_data_chain_length")

    public val getCcdikDataChainLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "get_ccdik_data_chain_length")

    public val setCcdikJointBone2dNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "set_ccdik_joint_bone2d_node")

    public val getCcdikJointBone2dNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "get_ccdik_joint_bone2d_node")

    public val setCcdikJointBoneIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "set_ccdik_joint_bone_index")

    public val getCcdikJointBoneIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "get_ccdik_joint_bone_index")

    public val setCcdikJointRotateFromJointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "set_ccdik_joint_rotate_from_joint")

    public val getCcdikJointRotateFromJointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "get_ccdik_joint_rotate_from_joint")

    public val setCcdikJointEnableConstraintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "set_ccdik_joint_enable_constraint")

    public val getCcdikJointEnableConstraintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "get_ccdik_joint_enable_constraint")

    public val setCcdikJointConstraintAngleMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "set_ccdik_joint_constraint_angle_min")

    public val getCcdikJointConstraintAngleMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "get_ccdik_joint_constraint_angle_min")

    public val setCcdikJointConstraintAngleMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "set_ccdik_joint_constraint_angle_max")

    public val getCcdikJointConstraintAngleMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "get_ccdik_joint_constraint_angle_max")

    public val setCcdikJointConstraintAngleInvertPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "set_ccdik_joint_constraint_angle_invert")

    public val getCcdikJointConstraintAngleInvertPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "get_ccdik_joint_constraint_angle_invert")
  }
}
