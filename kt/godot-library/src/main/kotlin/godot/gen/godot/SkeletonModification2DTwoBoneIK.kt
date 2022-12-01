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
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A modification that rotates two bones using the law of cosigns to reach the target.
 *
 * This [godot.SkeletonModification2D] uses an algorithm typically called TwoBoneIK. This algorithm works by leveraging the law of cosigns and the lengths of the bones to figure out what rotation the bones currently have, and what rotation they need to make a complete triangle, where the first bone, the second bone, and the target form the three vertices of the triangle. Because the algorithm works by making a triangle, it can only operate on two bones.
 *
 * TwoBoneIK is great for arms, legs, and really any joints that can be represented by just two bones that bend to reach a target. This solver is more lightweight than [godot.SkeletonModification2DFABRIK], but gives similar, natural looking results.
 */
@GodotBaseType
public open class SkeletonModification2DTwoBoneIK : SkeletonModification2D() {
  /**
   * The NodePath to the node that is the target for the TwoBoneIK modification. This node is what the modification will use when bending the [godot.Bone2D] nodes.
   */
  public var targetNodepath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DTWOBONEIK_GET_TARGET_NODE, NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DTWOBONEIK_SET_TARGET_NODE, NIL)
    }

  /**
   * The minimum distance the target can be at. If the target is closer than this distance, the modification will solve as if it's at this minimum distance. When set to `0`, the modification will solve without distance constraints.
   */
  public var targetMinimumDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DTWOBONEIK_GET_TARGET_MINIMUM_DISTANCE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DTWOBONEIK_SET_TARGET_MINIMUM_DISTANCE, NIL)
    }

  /**
   * The maximum distance the target can be at. If the target is farther than this distance, the modification will solve as if it's at this maximum distance. When set to `0`, the modification will solve without distance constraints.
   */
  public var targetMaximumDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DTWOBONEIK_GET_TARGET_MAXIMUM_DISTANCE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DTWOBONEIK_SET_TARGET_MAXIMUM_DISTANCE, NIL)
    }

  /**
   * If `true`, the bones in the modification will blend outward as opposed to inwards when contracting. If `false`, the bones will bend inwards when contracting.
   */
  public var flipBendDirection: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DTWOBONEIK_GET_FLIP_BEND_DIRECTION, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DTWOBONEIK_SET_FLIP_BEND_DIRECTION, NIL)
    }

  public override fun __new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_SKELETONMODIFICATION2DTWOBONEIK, scriptIndex)
  }

  /**
   * Sets the [godot.Bone2D] node that is being used as the first bone in the TwoBoneIK modification.
   */
  public fun setJointOneBone2dNode(bone2dNode: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to bone2dNode)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DTWOBONEIK_SET_JOINT_ONE_BONE2D_NODE, NIL)
  }

  /**
   * Returns the [godot.Bone2D] node that is being used as the first bone in the TwoBoneIK modification.
   */
  public fun getJointOneBone2dNode(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DTWOBONEIK_GET_JOINT_ONE_BONE2D_NODE,
        NODE_PATH)
    return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
  }

  /**
   * Sets the index of the [godot.Bone2D] node that is being used as the first bone in the TwoBoneIK modification.
   */
  public fun setJointOneBoneIdx(boneIdx: Long): Unit {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DTWOBONEIK_SET_JOINT_ONE_BONE_IDX, NIL)
  }

  /**
   * Returns the index of the [godot.Bone2D] node that is being used as the first bone in the TwoBoneIK modification.
   */
  public fun getJointOneBoneIdx(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DTWOBONEIK_GET_JOINT_ONE_BONE_IDX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the [godot.Bone2D] node that is being used as the second bone in the TwoBoneIK modification.
   */
  public fun setJointTwoBone2dNode(bone2dNode: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to bone2dNode)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DTWOBONEIK_SET_JOINT_TWO_BONE2D_NODE, NIL)
  }

  /**
   * Returns the [godot.Bone2D] node that is being used as the second bone in the TwoBoneIK modification.
   */
  public fun getJointTwoBone2dNode(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DTWOBONEIK_GET_JOINT_TWO_BONE2D_NODE,
        NODE_PATH)
    return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
  }

  /**
   * Sets the index of the [godot.Bone2D] node that is being used as the second bone in the TwoBoneIK modification.
   */
  public fun setJointTwoBoneIdx(boneIdx: Long): Unit {
    TransferContext.writeArguments(LONG to boneIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DTWOBONEIK_SET_JOINT_TWO_BONE_IDX, NIL)
  }

  /**
   * Returns the index of the [godot.Bone2D] node that is being used as the second bone in the TwoBoneIK modification.
   */
  public fun getJointTwoBoneIdx(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DTWOBONEIK_GET_JOINT_TWO_BONE_IDX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public companion object
}
