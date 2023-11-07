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
 * This [SkeletonModification2D] uses an algorithm typically called TwoBoneIK. This algorithm works
 * by leveraging the law of cosines and the lengths of the bones to figure out what rotation the bones
 * currently have, and what rotation they need to make a complete triangle, where the first bone, the
 * second bone, and the target form the three vertices of the triangle. Because the algorithm works by
 * making a triangle, it can only operate on two bones.
 * TwoBoneIK is great for arms, legs, and really any joints that can be represented by just two
 * bones that bend to reach a target. This solver is more lightweight than
 * [SkeletonModification2DFABRIK], but gives similar, natural looking results.
 */
@GodotBaseType
public open class SkeletonModification2DTwoBoneIK : SkeletonModification2D() {
  /**
   * The NodePath to the node that is the target for the TwoBoneIK modification. This node is what
   * the modification will use when bending the [Bone2D] nodes.
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
   * The minimum distance the target can be at. If the target is closer than this distance, the
   * modification will solve as if it's at this minimum distance. When set to `0`, the modification
   * will solve without distance constraints.
   */
  public var targetMinimumDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTargetMinimumDistancePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTargetMinimumDistancePtr, NIL)
    }

  /**
   * The maximum distance the target can be at. If the target is farther than this distance, the
   * modification will solve as if it's at this maximum distance. When set to `0`, the modification
   * will solve without distance constraints.
   */
  public var targetMaximumDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTargetMaximumDistancePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTargetMaximumDistancePtr, NIL)
    }

  /**
   * If `true`, the bones in the modification will blend outward as opposed to inwards when
   * contracting. If `false`, the bones will bend inwards when contracting.
   */
  public var flipBendDirection: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFlipBendDirectionPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlipBendDirectionPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SKELETONMODIFICATION2DTWOBONEIK, scriptIndex)
    return true
  }

  /**
   * Sets the [Bone2D] node that is being used as the first bone in the TwoBoneIK modification.
   */
  public fun setJointOneBone2dNode(bone2dNode: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to bone2dNode)
    TransferContext.callMethod(rawPtr, MethodBindings.setJointOneBone2dNodePtr, NIL)
  }

  /**
   * Returns the [Bone2D] node that is being used as the first bone in the TwoBoneIK modification.
   */
  public fun getJointOneBone2dNode(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getJointOneBone2dNodePtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
  }

  /**
   * Sets the index of the [Bone2D] node that is being used as the first bone in the TwoBoneIK
   * modification.
   */
  public fun setJointOneBoneIdx(boneIdx: Int): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setJointOneBoneIdxPtr, NIL)
  }

  /**
   * Returns the index of the [Bone2D] node that is being used as the first bone in the TwoBoneIK
   * modification.
   */
  public fun getJointOneBoneIdx(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getJointOneBoneIdxPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the [Bone2D] node that is being used as the second bone in the TwoBoneIK modification.
   */
  public fun setJointTwoBone2dNode(bone2dNode: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to bone2dNode)
    TransferContext.callMethod(rawPtr, MethodBindings.setJointTwoBone2dNodePtr, NIL)
  }

  /**
   * Returns the [Bone2D] node that is being used as the second bone in the TwoBoneIK modification.
   */
  public fun getJointTwoBone2dNode(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getJointTwoBone2dNodePtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
  }

  /**
   * Sets the index of the [Bone2D] node that is being used as the second bone in the TwoBoneIK
   * modification.
   */
  public fun setJointTwoBoneIdx(boneIdx: Int): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setJointTwoBoneIdxPtr, NIL)
  }

  /**
   * Returns the index of the [Bone2D] node that is being used as the second bone in the TwoBoneIK
   * modification.
   */
  public fun getJointTwoBoneIdx(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getJointTwoBoneIdxPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val setTargetNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "set_target_node")

    public val getTargetNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "get_target_node")

    public val setTargetMinimumDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "set_target_minimum_distance")

    public val getTargetMinimumDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "get_target_minimum_distance")

    public val setTargetMaximumDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "set_target_maximum_distance")

    public val getTargetMaximumDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "get_target_maximum_distance")

    public val setFlipBendDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "set_flip_bend_direction")

    public val getFlipBendDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "get_flip_bend_direction")

    public val setJointOneBone2dNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "set_joint_one_bone2d_node")

    public val getJointOneBone2dNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "get_joint_one_bone2d_node")

    public val setJointOneBoneIdxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "set_joint_one_bone_idx")

    public val getJointOneBoneIdxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "get_joint_one_bone_idx")

    public val setJointTwoBone2dNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "set_joint_two_bone2d_node")

    public val getJointTwoBone2dNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "get_joint_two_bone2d_node")

    public val setJointTwoBoneIdxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "set_joint_two_bone_idx")

    public val getJointTwoBoneIdxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "get_joint_two_bone_idx")
  }
}
