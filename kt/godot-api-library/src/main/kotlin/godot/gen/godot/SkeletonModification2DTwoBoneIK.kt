// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_SKELETONMODIFICATION2DTWOBONEIK_INDEX: Int = 593

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
   * If `true`, the bones in the modification will blend outward as opposed to inwards when
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
    Internals.callConstructor(this, ENGINE_CLASS_SKELETONMODIFICATION2DTWOBONEIK_INDEX, scriptIndex)
  }

  public final fun setTargetNode(targetNodepath: NodePath): Unit {
    Internals.writeArguments(NODE_PATH to targetNodepath)
    Internals.callMethod(rawPtr, MethodBindings.setTargetNodePtr, NIL)
  }

  public final fun getTargetNode(): NodePath {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTargetNodePtr, NODE_PATH)
    return (Internals.readReturnValue(NODE_PATH) as NodePath)
  }

  public final fun setTargetMinimumDistance(minimumDistance: Float): Unit {
    Internals.writeArguments(DOUBLE to minimumDistance.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setTargetMinimumDistancePtr, NIL)
  }

  public final fun getTargetMinimumDistance(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTargetMinimumDistancePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setTargetMaximumDistance(maximumDistance: Float): Unit {
    Internals.writeArguments(DOUBLE to maximumDistance.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setTargetMaximumDistancePtr, NIL)
  }

  public final fun getTargetMaximumDistance(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTargetMaximumDistancePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setFlipBendDirection(flipDirection: Boolean): Unit {
    Internals.writeArguments(BOOL to flipDirection)
    Internals.callMethod(rawPtr, MethodBindings.setFlipBendDirectionPtr, NIL)
  }

  public final fun getFlipBendDirection(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFlipBendDirectionPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the [Bone2D] node that is being used as the first bone in the TwoBoneIK modification.
   */
  public final fun setJointOneBone2dNode(bone2dNode: NodePath): Unit {
    Internals.writeArguments(NODE_PATH to bone2dNode)
    Internals.callMethod(rawPtr, MethodBindings.setJointOneBone2dNodePtr, NIL)
  }

  /**
   * Returns the [Bone2D] node that is being used as the first bone in the TwoBoneIK modification.
   */
  public final fun getJointOneBone2dNode(): NodePath {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getJointOneBone2dNodePtr, NODE_PATH)
    return (Internals.readReturnValue(NODE_PATH) as NodePath)
  }

  /**
   * Sets the index of the [Bone2D] node that is being used as the first bone in the TwoBoneIK
   * modification.
   */
  public final fun setJointOneBoneIdx(boneIdx: Int): Unit {
    Internals.writeArguments(LONG to boneIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setJointOneBoneIdxPtr, NIL)
  }

  /**
   * Returns the index of the [Bone2D] node that is being used as the first bone in the TwoBoneIK
   * modification.
   */
  public final fun getJointOneBoneIdx(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getJointOneBoneIdxPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the [Bone2D] node that is being used as the second bone in the TwoBoneIK modification.
   */
  public final fun setJointTwoBone2dNode(bone2dNode: NodePath): Unit {
    Internals.writeArguments(NODE_PATH to bone2dNode)
    Internals.callMethod(rawPtr, MethodBindings.setJointTwoBone2dNodePtr, NIL)
  }

  /**
   * Returns the [Bone2D] node that is being used as the second bone in the TwoBoneIK modification.
   */
  public final fun getJointTwoBone2dNode(): NodePath {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getJointTwoBone2dNodePtr, NODE_PATH)
    return (Internals.readReturnValue(NODE_PATH) as NodePath)
  }

  /**
   * Sets the index of the [Bone2D] node that is being used as the second bone in the TwoBoneIK
   * modification.
   */
  public final fun setJointTwoBoneIdx(boneIdx: Int): Unit {
    Internals.writeArguments(LONG to boneIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setJointTwoBoneIdxPtr, NIL)
  }

  /**
   * Returns the index of the [Bone2D] node that is being used as the second bone in the TwoBoneIK
   * modification.
   */
  public final fun getJointTwoBoneIdx(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getJointTwoBoneIdxPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val setTargetNodePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "set_target_node", 1348162250)

    public val getTargetNodePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "get_target_node", 4075236667)

    public val setTargetMinimumDistancePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "set_target_minimum_distance", 373806689)

    public val getTargetMinimumDistancePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "get_target_minimum_distance", 1740695150)

    public val setTargetMaximumDistancePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "set_target_maximum_distance", 373806689)

    public val getTargetMaximumDistancePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "get_target_maximum_distance", 1740695150)

    public val setFlipBendDirectionPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "set_flip_bend_direction", 2586408642)

    public val getFlipBendDirectionPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "get_flip_bend_direction", 36873697)

    public val setJointOneBone2dNodePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "set_joint_one_bone2d_node", 1348162250)

    public val getJointOneBone2dNodePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "get_joint_one_bone2d_node", 4075236667)

    public val setJointOneBoneIdxPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "set_joint_one_bone_idx", 1286410249)

    public val getJointOneBoneIdxPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "get_joint_one_bone_idx", 3905245786)

    public val setJointTwoBone2dNodePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "set_joint_two_bone2d_node", 1348162250)

    public val getJointTwoBone2dNodePtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "get_joint_two_bone2d_node", 4075236667)

    public val setJointTwoBoneIdxPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "set_joint_two_bone_idx", 1286410249)

    public val getJointTwoBoneIdxPtr: VoidPtr =
        Internals.getMethodBindPtr("SkeletonModification2DTwoBoneIK", "get_joint_two_bone_idx", 3905245786)
  }
}
