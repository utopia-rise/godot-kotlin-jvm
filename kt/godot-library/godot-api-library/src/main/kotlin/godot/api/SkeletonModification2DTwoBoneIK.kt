// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.NodePath
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
  public final inline var targetNodepath: NodePath
    @JvmName("targetNodepathProperty")
    get() = getTargetNode()
    @JvmName("targetNodepathProperty")
    set(`value`) {
      setTargetNode(value)
    }

  /**
   * The minimum distance the target can be at. If the target is closer than this distance, the
   * modification will solve as if it's at this minimum distance. When set to `0`, the modification
   * will solve without distance constraints.
   */
  public final inline var targetMinimumDistance: Float
    @JvmName("targetMinimumDistanceProperty")
    get() = getTargetMinimumDistance()
    @JvmName("targetMinimumDistanceProperty")
    set(`value`) {
      setTargetMinimumDistance(value)
    }

  /**
   * The maximum distance the target can be at. If the target is farther than this distance, the
   * modification will solve as if it's at this maximum distance. When set to `0`, the modification
   * will solve without distance constraints.
   */
  public final inline var targetMaximumDistance: Float
    @JvmName("targetMaximumDistanceProperty")
    get() = getTargetMaximumDistance()
    @JvmName("targetMaximumDistanceProperty")
    set(`value`) {
      setTargetMaximumDistance(value)
    }

  /**
   * If `true`, the bones in the modification will bend outward as opposed to inwards when
   * contracting. If `false`, the bones will bend inwards when contracting.
   */
  public final inline var flipBendDirection: Boolean
    @JvmName("flipBendDirectionProperty")
    get() = getFlipBendDirection()
    @JvmName("flipBendDirectionProperty")
    set(`value`) {
      setFlipBendDirection(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(609, scriptIndex)
  }

  public final fun setTargetNode(targetNodepath: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to targetNodepath)
    TransferContext.callMethod(ptr, MethodBindings.setTargetNodePtr, NIL)
  }

  public final fun getTargetNode(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTargetNodePtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  public final fun setTargetMinimumDistance(minimumDistance: Float): Unit {
    TransferContext.writeArguments(DOUBLE to minimumDistance.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setTargetMinimumDistancePtr, NIL)
  }

  public final fun getTargetMinimumDistance(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTargetMinimumDistancePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setTargetMaximumDistance(maximumDistance: Float): Unit {
    TransferContext.writeArguments(DOUBLE to maximumDistance.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setTargetMaximumDistancePtr, NIL)
  }

  public final fun getTargetMaximumDistance(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTargetMaximumDistancePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setFlipBendDirection(flipDirection: Boolean): Unit {
    TransferContext.writeArguments(BOOL to flipDirection)
    TransferContext.callMethod(ptr, MethodBindings.setFlipBendDirectionPtr, NIL)
  }

  public final fun getFlipBendDirection(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFlipBendDirectionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the [Bone2D] node that is being used as the first bone in the TwoBoneIK modification.
   */
  public final fun setJointOneBone2dNode(bone2dNode: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to bone2dNode)
    TransferContext.callMethod(ptr, MethodBindings.setJointOneBone2dNodePtr, NIL)
  }

  /**
   * Returns the [Bone2D] node that is being used as the first bone in the TwoBoneIK modification.
   */
  public final fun getJointOneBone2dNode(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getJointOneBone2dNodePtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  /**
   * Sets the index of the [Bone2D] node that is being used as the first bone in the TwoBoneIK
   * modification.
   */
  public final fun setJointOneBoneIdx(boneIdx: Int): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setJointOneBoneIdxPtr, NIL)
  }

  /**
   * Returns the index of the [Bone2D] node that is being used as the first bone in the TwoBoneIK
   * modification.
   */
  public final fun getJointOneBoneIdx(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getJointOneBoneIdxPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the [Bone2D] node that is being used as the second bone in the TwoBoneIK modification.
   */
  public final fun setJointTwoBone2dNode(bone2dNode: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to bone2dNode)
    TransferContext.callMethod(ptr, MethodBindings.setJointTwoBone2dNodePtr, NIL)
  }

  /**
   * Returns the [Bone2D] node that is being used as the second bone in the TwoBoneIK modification.
   */
  public final fun getJointTwoBone2dNode(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getJointTwoBone2dNodePtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  /**
   * Sets the index of the [Bone2D] node that is being used as the second bone in the TwoBoneIK
   * modification.
   */
  public final fun setJointTwoBoneIdx(boneIdx: Int): Unit {
    TransferContext.writeArguments(LONG to boneIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setJointTwoBoneIdxPtr, NIL)
  }

  /**
   * Returns the index of the [Bone2D] node that is being used as the second bone in the TwoBoneIK
   * modification.
   */
  public final fun getJointTwoBoneIdx(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getJointTwoBoneIdxPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public companion object

  public object MethodBindings {
    internal val setTargetNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "set_target_node", 1348162250)

    internal val getTargetNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "get_target_node", 4075236667)

    internal val setTargetMinimumDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "set_target_minimum_distance", 373806689)

    internal val getTargetMinimumDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "get_target_minimum_distance", 1740695150)

    internal val setTargetMaximumDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "set_target_maximum_distance", 373806689)

    internal val getTargetMaximumDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "get_target_maximum_distance", 1740695150)

    internal val setFlipBendDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "set_flip_bend_direction", 2586408642)

    internal val getFlipBendDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "get_flip_bend_direction", 36873697)

    internal val setJointOneBone2dNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "set_joint_one_bone2d_node", 1348162250)

    internal val getJointOneBone2dNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "get_joint_one_bone2d_node", 4075236667)

    internal val setJointOneBoneIdxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "set_joint_one_bone_idx", 1286410249)

    internal val getJointOneBoneIdxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "get_joint_one_bone_idx", 3905245786)

    internal val setJointTwoBone2dNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "set_joint_two_bone2d_node", 1348162250)

    internal val getJointTwoBone2dNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "get_joint_two_bone2d_node", 4075236667)

    internal val setJointTwoBoneIdxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "set_joint_two_bone_idx", 1286410249)

    internal val getJointTwoBoneIdxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "get_joint_two_bone_idx", 3905245786)
  }
}
