// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A modification that moves two bones to reach the target.
 *
 * This [godot.SkeletonModification3D] uses an algorithm typically called TwoBoneIK. This algorithm works by leveraging the law of cosigns and the lengths of the bones to figure out what rotation the bones currently have, and what rotation they need to make a complete triangle, where the first bone, the second bone, and the target form the three vertices of the triangle. Because the algorithm works by making a triangle, it can only operate on two bones.
 *
 * TwoBoneIK is great for arms, legs, and really any joints that can be represented by just two bones that bend to reach a target. This solver is more lightweight than [godot.SkeletonModification3DFABRIK], but gives similar, natural looking results.
 *
 * A [godot.Node3D]-based node can be used to define the pole, or bend direction, allowing control over which direction the joint takes when bending to reach the target when the target is within reach.
 */
@GodotBaseType
public open class SkeletonModification3DTwoBoneIK : SkeletonModification3D() {
  /**
   * The NodePath to the node that is the target for the TwoBoneIK modification. This node is what the modification will attempt to rotate the bones to reach.
   */
  public open var targetNodepath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DTWOBONEIK_GET_TARGET_NODEPATH, NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DTWOBONEIK_SET_TARGET_NODEPATH, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SKELETONMODIFICATION3DTWOBONEIK)
  }

  /**
   * When `true`, the TwoBoneIK modification will bend the bones towards the pole node, if one has been set. This gives control over the direction the TwoBoneIK solver will bend, which is helpful for joints like elbows that only bend in certain directions.
   */
  public open fun setUsePoleNode(usePoleNode: Boolean): Unit {
    TransferContext.writeArguments(BOOL to usePoleNode)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DTWOBONEIK_SET_USE_POLE_NODE, NIL)
  }

  /**
   * Returns whether the TwoBoneIK modification will attempt to use the pole node to figure out which direction to bend, if a pole node has been set.
   */
  public open fun getUsePoleNode(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DTWOBONEIK_GET_USE_POLE_NODE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the node to be used as the for the pole of the TwoBoneIK. When a node is set and the modification is set to use the pole node, the TwoBoneIK modification will bend the nodes in the direction towards this node when the bones need to bend.
   */
  public open fun setPoleNode(poleNodepath: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to poleNodepath)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DTWOBONEIK_SET_POLE_NODE, NIL)
  }

  /**
   * Returns the node that is being used as the pole node for the TwoBoneIK modification, if a pole node has been set.
   */
  public open fun getPoleNode(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DTWOBONEIK_GET_POLE_NODE, NODE_PATH)
    return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
  }

  /**
   * When `true`, the TwoBoneIK modification will use the tip node to calculate the distance and position of the end/tip of the second bone. This is the most stable solution for knowing the tip position and length of the second bone.
   */
  public open fun setUseTipNode(useTipNode: Boolean): Unit {
    TransferContext.writeArguments(BOOL to useTipNode)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DTWOBONEIK_SET_USE_TIP_NODE, NIL)
  }

  /**
   * Returns whether the TwoBoneIK modification will attempt to use the tip node to figure out the length and position of the tip of the second bone.
   */
  public open fun getUseTipNode(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DTWOBONEIK_GET_USE_TIP_NODE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the node to be used as the tip for the second bone. This is used to calculate the length and position of the end of the second bone in the TwoBoneIK modification.
   *
   * **Note:** The tip node should generally be a child node of a [godot.BoneAttachment3D] node attached to the second bone, with the child node being offset so it is at the end of the bone.
   */
  public open fun setTipNode(tipNodepath: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to tipNodepath)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DTWOBONEIK_SET_TIP_NODE, NIL)
  }

  /**
   * Returns the node that is being used to calculate the tip position of the second bone in the TwoBoneIK modification, if a tip node has been set.
   */
  public open fun getTipNode(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DTWOBONEIK_GET_TIP_NODE, NODE_PATH)
    return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
  }

  /**
   * If true, the TwoBoneIK modification will attempt to autocalculate the lengths of the bones being used. The first bone will be calculated by using the distance from the origin of the first bone to the origin of the second bone.
   *
   * The second bone will be calculated either using the tip node if that setting is enabled, or by using the distances of the second bone's children. If the tip node is not enabled and the bone has no children, then the length cannot be autocalculated. In this case, the length will either have to be manually inputted or a tip node used to calculate the length.
   */
  public open fun setAutoCalculateJointLength(autoCalculateJointLength: Boolean): Unit {
    TransferContext.writeArguments(BOOL to autoCalculateJointLength)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DTWOBONEIK_SET_AUTO_CALCULATE_JOINT_LENGTH,
        NIL)
  }

  /**
   * Returns whether the TwoBoneIK modification will attempt to autocalculate the lengths of the two bones.
   */
  public open fun getAutoCalculateJointLength(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DTWOBONEIK_GET_AUTO_CALCULATE_JOINT_LENGTH,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the bone name, `bone_name`, of the first bone. When possible, this will also update the `bone_index` of the first bone based on data provided by the [godot.Skeleton3D].
   */
  public open fun setJointOneBoneName(boneName: String): Unit {
    TransferContext.writeArguments(STRING to boneName)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DTWOBONEIK_SET_JOINT_ONE_BONE_NAME, NIL)
  }

  /**
   * Returns the name of the first bone in the TwoBoneIK modification.
   */
  public open fun getJointOneBoneName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DTWOBONEIK_GET_JOINT_ONE_BONE_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Sets the bone index, `bone_index`, of the first bone. When possible, this will also update the `bone_name` of the first bone based on data provided by the [godot.Skeleton3D].
   */
  public open fun setJointOneBoneIdx(boneIdx: Long): Unit {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DTWOBONEIK_SET_JOINT_ONE_BONE_IDX, NIL)
  }

  /**
   * Returns the bone index of the first bone in the TwoBoneIK modification.
   */
  public open fun getJointOneBoneIdx(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DTWOBONEIK_GET_JOINT_ONE_BONE_IDX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the length of the first bone in the TwoBoneIK modification.
   */
  public open fun setJointOneLength(boneLength: Double): Unit {
    TransferContext.writeArguments(DOUBLE to boneLength)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DTWOBONEIK_SET_JOINT_ONE_LENGTH, NIL)
  }

  /**
   * Returns the length of the first bone in the TwoBoneIK modification.
   */
  public open fun getJointOneLength(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DTWOBONEIK_GET_JOINT_ONE_LENGTH, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets the bone name, `bone_name`, of the second bone. When possible, this will also update the `bone_index` of the second bone based on data provided by the [godot.Skeleton3D].
   */
  public open fun setJointTwoBoneName(boneName: String): Unit {
    TransferContext.writeArguments(STRING to boneName)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DTWOBONEIK_SET_JOINT_TWO_BONE_NAME, NIL)
  }

  /**
   * Returns the name of the second bone in the TwoBoneIK modification.
   */
  public open fun getJointTwoBoneName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DTWOBONEIK_GET_JOINT_TWO_BONE_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Sets the bone index, `bone_index`, of the second bone. When possible, this will also update the `bone_name` of the second bone based on data provided by the [godot.Skeleton3D].
   */
  public open fun setJointTwoBoneIdx(boneIdx: Long): Unit {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DTWOBONEIK_SET_JOINT_TWO_BONE_IDX, NIL)
  }

  /**
   * Returns the bone index of the second bone in the TwoBoneIK modification.
   */
  public open fun getJointTwoBoneIdx(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DTWOBONEIK_GET_JOINT_TWO_BONE_IDX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the length of the second bone in the TwoBoneIK modification.
   */
  public open fun setJointTwoLength(boneLength: Double): Unit {
    TransferContext.writeArguments(DOUBLE to boneLength)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DTWOBONEIK_SET_JOINT_TWO_LENGTH, NIL)
  }

  /**
   * Returns the length of the second bone in the TwoBoneIK modification.
   */
  public open fun getJointTwoLength(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DTWOBONEIK_GET_JOINT_TWO_LENGTH, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets the amount of roll/twist applied to the first bone in the TwoBoneIK modification.
   */
  public open fun setJointOneRoll(roll: Double): Unit {
    TransferContext.writeArguments(DOUBLE to roll)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DTWOBONEIK_SET_JOINT_ONE_ROLL, NIL)
  }

  /**
   * Returns the amount of roll/twist applied to the first bone in the TwoBoneIK modification.
   */
  public open fun getJointOneRoll(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DTWOBONEIK_GET_JOINT_ONE_ROLL, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets the amount of roll/twist applied to the second bone in the TwoBoneIK modification.
   */
  public open fun setJointTwoRoll(roll: Double): Unit {
    TransferContext.writeArguments(DOUBLE to roll)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DTWOBONEIK_SET_JOINT_TWO_ROLL, NIL)
  }

  /**
   * Returns the amount of roll/twist applied to the second bone in the TwoBoneIK modification.
   */
  public open fun getJointTwoRoll(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DTWOBONEIK_GET_JOINT_TWO_ROLL, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  public companion object
}
