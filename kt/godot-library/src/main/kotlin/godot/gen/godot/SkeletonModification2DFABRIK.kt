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
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A modification that uses FABRIK to manipulate a series of [godot.Bone2D] nodes to reach a target.
 *
 * This [godot.SkeletonModification2D] uses an algorithm called Forward And Backward Reaching Inverse Kinematics, or FABRIK, to rotate a bone chain so that it reaches a target.
 *
 * FABRIK works by knowing the positions and lengths of a series of bones, typically called a "bone chain". It first starts by running a forward pass, which places the final bone at the target's position. Then all other bones are moved towards the tip bone, so they stay at the defined bone length away. Then a backwards pass is performed, where the root/first bone in the FABRIK chain is placed back at the origin. then all other bones are moved so they stay at the defined bone length away. This positions the bone chain so that it reaches the target when possible, but all of the bones stay the correct length away from each other.
 *
 * Because of how FABRIK works, it often gives more natural results than those seen in [godot.SkeletonModification2DCCDIK]. FABRIK also supports angle constraints, which are fully taken into account when solving.
 *
 * **Note:** The FABRIK modifier has `fabrik_joints`, which are the data objects that hold the data for each joint in the FABRIK chain. This is different from [godot.Bone2D] nodes! FABRIK joints hold the data needed for each [godot.Bone2D] in the bone chain used by FABRIK.
 *
 * To help control how the FABRIK joints move, a magnet vector can be passed, which can nudge the bones in a certain direction prior to solving, giving a level of control over the final result.
 */
@GodotBaseType
public open class SkeletonModification2DFABRIK : SkeletonModification2D() {
  /**
   * The NodePath to the node that is the target for the FABRIK modification. This node is what the FABRIK chain will attempt to rotate the bone chain to.
   */
  public var targetNodepath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DFABRIK_GET_TARGET_NODE, NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DFABRIK_SET_TARGET_NODE, NIL)
    }

  /**
   * The amount of FABRIK joints in the FABRIK modification.
   */
  public var fabrikDataChainLength: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DFABRIK_GET_FABRIK_DATA_CHAIN_LENGTH, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DFABRIK_SET_FABRIK_DATA_CHAIN_LENGTH, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SKELETONMODIFICATION2DFABRIK)
  }

  /**
   * Sets the [godot.Bone2D] node assigned to the FABRIK joint at `joint_idx`.
   */
  public fun setFabrikJointBone2dNode(jointIdx: Long, bone2dNodepath: NodePath): Unit {
    TransferContext.writeArguments(LONG to jointIdx, NODE_PATH to bone2dNodepath)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DFABRIK_SET_FABRIK_JOINT_BONE2D_NODE, NIL)
  }

  /**
   * Returns the [godot.Bone2D] node assigned to the FABRIK joint at `joint_idx`.
   */
  public fun getFabrikJointBone2dNode(jointIdx: Long): NodePath {
    TransferContext.writeArguments(LONG to jointIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DFABRIK_GET_FABRIK_JOINT_BONE2D_NODE,
        NODE_PATH)
    return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
  }

  /**
   * Sets the bone index, `bone_index`, of the FABRIK joint at `joint_idx`. When possible, this will also update the `bone2d_node` of the FABRIK joint based on data provided by the linked skeleton.
   */
  public fun setFabrikJointBoneIndex(jointIdx: Long, boneIdx: Long): Unit {
    TransferContext.writeArguments(LONG to jointIdx, LONG to boneIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DFABRIK_SET_FABRIK_JOINT_BONE_INDEX, NIL)
  }

  /**
   * Returns the index of the [godot.Bone2D] node assigned to the FABRIK joint at `joint_idx`.
   */
  public fun getFabrikJointBoneIndex(jointIdx: Long): Long {
    TransferContext.writeArguments(LONG to jointIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DFABRIK_GET_FABRIK_JOINT_BONE_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the magnet position vector for the joint at `joint_idx`.
   */
  public fun setFabrikJointMagnetPosition(jointIdx: Long, magnetPosition: Vector2): Unit {
    TransferContext.writeArguments(LONG to jointIdx, VECTOR2 to magnetPosition)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DFABRIK_SET_FABRIK_JOINT_MAGNET_POSITION, NIL)
  }

  /**
   * Returns the magnet position vector for the joint at `joint_idx`.
   */
  public fun getFabrikJointMagnetPosition(jointIdx: Long): Vector2 {
    TransferContext.writeArguments(LONG to jointIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DFABRIK_GET_FABRIK_JOINT_MAGNET_POSITION,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Sets whether the joint at `joint_idx` will use the target node's rotation rather than letting FABRIK rotate the node.
   *
   * **Note:** This option only works for the tip/final joint in the chain. For all other nodes, this option will be ignored.
   */
  public fun setFabrikJointUseTargetRotation(jointIdx: Long, useTargetRotation: Boolean): Unit {
    TransferContext.writeArguments(LONG to jointIdx, BOOL to useTargetRotation)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DFABRIK_SET_FABRIK_JOINT_USE_TARGET_ROTATION,
        NIL)
  }

  /**
   * Returns whether the joint is using the target's rotation rather than allowing FABRIK to rotate the joint. This option only applies to the tip/final joint in the chain.
   */
  public fun getFabrikJointUseTargetRotation(jointIdx: Long): Boolean {
    TransferContext.writeArguments(LONG to jointIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DFABRIK_GET_FABRIK_JOINT_USE_TARGET_ROTATION,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public companion object
}
