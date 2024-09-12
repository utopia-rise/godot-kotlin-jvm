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
import kotlin.jvm.JvmName

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
  public final inline var targetNodepath: NodePath
    @JvmName("targetNodepathProperty")
    get() = getTargetNode()
    @JvmName("targetNodepathProperty")
    set(`value`) {
      setTargetNode(value)
    }

  /**
   * The end position of the CCDIK chain. Typically, this should be a child of a [Bone2D] node
   * attached to the final [Bone2D] in the CCDIK chain.
   */
  public final inline var tipNodepath: NodePath
    @JvmName("tipNodepathProperty")
    get() = getTipNode()
    @JvmName("tipNodepathProperty")
    set(`value`) {
      setTipNode(value)
    }

  /**
   * The number of CCDIK joints in the CCDIK modification.
   */
  public final inline var ccdikDataChainLength: Int
    @JvmName("ccdikDataChainLengthProperty")
    get() = getCcdikDataChainLength()
    @JvmName("ccdikDataChainLengthProperty")
    set(`value`) {
      setCcdikDataChainLength(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_SKELETONMODIFICATION2DCCDIK, scriptIndex)
  }

  public final fun setTargetNode(targetNodepath: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to targetNodepath)
    TransferContext.callMethod(rawPtr, MethodBindings.setTargetNodePtr, NIL)
  }

  public final fun getTargetNode(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTargetNodePtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
  }

  public final fun setTipNode(tipNodepath: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to tipNodepath)
    TransferContext.callMethod(rawPtr, MethodBindings.setTipNodePtr, NIL)
  }

  public final fun getTipNode(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTipNodePtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
  }

  public final fun setCcdikDataChainLength(length: Int): Unit {
    TransferContext.writeArguments(LONG to length.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setCcdikDataChainLengthPtr, NIL)
  }

  public final fun getCcdikDataChainLength(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCcdikDataChainLengthPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the [Bone2D] node assigned to the CCDIK joint at [jointIdx].
   */
  public final fun setCcdikJointBone2dNode(jointIdx: Int, bone2dNodepath: NodePath): Unit {
    TransferContext.writeArguments(LONG to jointIdx.toLong(), NODE_PATH to bone2dNodepath)
    TransferContext.callMethod(rawPtr, MethodBindings.setCcdikJointBone2dNodePtr, NIL)
  }

  /**
   * Returns the [Bone2D] node assigned to the CCDIK joint at [jointIdx].
   */
  public final fun getCcdikJointBone2dNode(jointIdx: Int): NodePath {
    TransferContext.writeArguments(LONG to jointIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCcdikJointBone2dNodePtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
  }

  /**
   * Sets the bone index, [boneIdx], of the CCDIK joint at [jointIdx]. When possible, this will also
   * update the `bone2d_node` of the CCDIK joint based on data provided by the linked skeleton.
   */
  public final fun setCcdikJointBoneIndex(jointIdx: Int, boneIdx: Int): Unit {
    TransferContext.writeArguments(LONG to jointIdx.toLong(), LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setCcdikJointBoneIndexPtr, NIL)
  }

  /**
   * Returns the index of the [Bone2D] node assigned to the CCDIK joint at [jointIdx].
   */
  public final fun getCcdikJointBoneIndex(jointIdx: Int): Int {
    TransferContext.writeArguments(LONG to jointIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCcdikJointBoneIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets whether the joint at [jointIdx] is set to rotate from the joint, `true`, or to rotate from
   * the tip, `false`.
   */
  public final fun setCcdikJointRotateFromJoint(jointIdx: Int, rotateFromJoint: Boolean): Unit {
    TransferContext.writeArguments(LONG to jointIdx.toLong(), BOOL to rotateFromJoint)
    TransferContext.callMethod(rawPtr, MethodBindings.setCcdikJointRotateFromJointPtr, NIL)
  }

  /**
   * Returns whether the joint at [jointIdx] is set to rotate from the joint, `true`, or to rotate
   * from the tip, `false`. The default is to rotate from the tip.
   */
  public final fun getCcdikJointRotateFromJoint(jointIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to jointIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCcdikJointRotateFromJointPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Determines whether angle constraints on the CCDIK joint at [jointIdx] are enabled. When `true`,
   * constraints will be enabled and taken into account when solving.
   */
  public final fun setCcdikJointEnableConstraint(jointIdx: Int, enableConstraint: Boolean): Unit {
    TransferContext.writeArguments(LONG to jointIdx.toLong(), BOOL to enableConstraint)
    TransferContext.callMethod(rawPtr, MethodBindings.setCcdikJointEnableConstraintPtr, NIL)
  }

  /**
   * Returns whether angle constraints on the CCDIK joint at [jointIdx] are enabled.
   */
  public final fun getCcdikJointEnableConstraint(jointIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to jointIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCcdikJointEnableConstraintPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the minimum angle constraint for the joint at [jointIdx].
   */
  public final fun setCcdikJointConstraintAngleMin(jointIdx: Int, angleMin: Float): Unit {
    TransferContext.writeArguments(LONG to jointIdx.toLong(), DOUBLE to angleMin.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setCcdikJointConstraintAngleMinPtr, NIL)
  }

  /**
   * Returns the minimum angle constraint for the joint at [jointIdx].
   */
  public final fun getCcdikJointConstraintAngleMin(jointIdx: Int): Float {
    TransferContext.writeArguments(LONG to jointIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCcdikJointConstraintAngleMinPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Sets the maximum angle constraint for the joint at [jointIdx].
   */
  public final fun setCcdikJointConstraintAngleMax(jointIdx: Int, angleMax: Float): Unit {
    TransferContext.writeArguments(LONG to jointIdx.toLong(), DOUBLE to angleMax.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setCcdikJointConstraintAngleMaxPtr, NIL)
  }

  /**
   * Returns the maximum angle constraint for the joint at [jointIdx].
   */
  public final fun getCcdikJointConstraintAngleMax(jointIdx: Int): Float {
    TransferContext.writeArguments(LONG to jointIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCcdikJointConstraintAngleMaxPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Sets whether the CCDIK joint at [jointIdx] uses an inverted joint constraint.
   * An inverted joint constraint only constraints the CCDIK joint to the angles *outside of* the
   * inputted minimum and maximum angles. For this reason, it is referred to as an inverted joint
   * constraint, as it constraints the joint to the outside of the inputted values.
   */
  public final fun setCcdikJointConstraintAngleInvert(jointIdx: Int, invert: Boolean): Unit {
    TransferContext.writeArguments(LONG to jointIdx.toLong(), BOOL to invert)
    TransferContext.callMethod(rawPtr, MethodBindings.setCcdikJointConstraintAngleInvertPtr, NIL)
  }

  /**
   * Returns whether the CCDIK joint at [jointIdx] uses an inverted joint constraint. See
   * [setCcdikJointConstraintAngleInvert] for details.
   */
  public final fun getCcdikJointConstraintAngleInvert(jointIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to jointIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCcdikJointConstraintAngleInvertPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setTargetNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "set_target_node", 1348162250)

    public val getTargetNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "get_target_node", 4075236667)

    public val setTipNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "set_tip_node", 1348162250)

    public val getTipNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "get_tip_node", 4075236667)

    public val setCcdikDataChainLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "set_ccdik_data_chain_length", 1286410249)

    public val getCcdikDataChainLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "get_ccdik_data_chain_length", 2455072627)

    public val setCcdikJointBone2dNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "set_ccdik_joint_bone2d_node", 2761262315)

    public val getCcdikJointBone2dNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "get_ccdik_joint_bone2d_node", 408788394)

    public val setCcdikJointBoneIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "set_ccdik_joint_bone_index", 3937882851)

    public val getCcdikJointBoneIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "get_ccdik_joint_bone_index", 923996154)

    public val setCcdikJointRotateFromJointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "set_ccdik_joint_rotate_from_joint", 300928843)

    public val getCcdikJointRotateFromJointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "get_ccdik_joint_rotate_from_joint", 1116898809)

    public val setCcdikJointEnableConstraintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "set_ccdik_joint_enable_constraint", 300928843)

    public val getCcdikJointEnableConstraintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "get_ccdik_joint_enable_constraint", 1116898809)

    public val setCcdikJointConstraintAngleMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "set_ccdik_joint_constraint_angle_min", 1602489585)

    public val getCcdikJointConstraintAngleMinPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "get_ccdik_joint_constraint_angle_min", 2339986948)

    public val setCcdikJointConstraintAngleMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "set_ccdik_joint_constraint_angle_max", 1602489585)

    public val getCcdikJointConstraintAngleMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "get_ccdik_joint_constraint_angle_max", 2339986948)

    public val setCcdikJointConstraintAngleInvertPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "set_ccdik_joint_constraint_angle_invert", 300928843)

    public val getCcdikJointConstraintAngleInvertPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DCCDIK", "get_ccdik_joint_constraint_angle_invert", 1116898809)
  }
}
