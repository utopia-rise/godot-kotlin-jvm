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
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A modification that uses FABRIK to manipulate a series of bones to reach a target.
 *
 * This [godot.SkeletonModification3D] uses an algorithm called Forward And Backward Reaching Inverse Kinematics, or FABRIK, to rotate a bone chain so that it reaches a target.
 *
 * FABRIK works by knowing the positions and lengths of a series of bones, typically called a "bone chain". It first starts by running a forward pass, which places the final bone at the target's position. Then all other bones are moved towards the tip bone, so they stay at the defined bone length away. Then a backwards pass is performed, where the root/first bone in the FABRIK chain is placed back at the origin. then all other bones are moved so they stay at the defined bone length away. This positions the bone chain so that it reaches the target when possible, but all of the bones stay the correct length away from each other.
 *
 * Because of how FABRIK works, it often gives more natural results than those seen in [godot.SkeletonModification3DCCDIK], though FABRIK currently does not support joint constraints.
 *
 * **Note:** The FABRIK modifier has `fabrik_joints`, which are the data objects that hold the data for each joint in the FABRIK chain. This is different from a bone! FABRIK joints hold the data needed for each bone in the bone chain used by FABRIK.
 *
 * To help control how the FABRIK joints move, a magnet vector can be passed, which can nudge the bones in a certain direction prior to solving, giving a level of control over the final result.
 */
@GodotBaseType
public open class SkeletonModification3DFABRIK : SkeletonModification3D() {
  /**
   * The NodePath to the node that is the target for the FABRIK modification. This node is what the FABRIK chain will attempt to rotate the bone chain to.
   */
  public open var targetNodepath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DFABRIK_GET_TARGET_NODEPATH, NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DFABRIK_SET_TARGET_NODEPATH, NIL)
    }

  /**
   * The amount of FABRIK joints in the FABRIK modification.
   */
  public open var fabrikDataChainLength: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DFABRIK_GET_FABRIK_DATA_CHAIN_LENGTH, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DFABRIK_SET_FABRIK_DATA_CHAIN_LENGTH, NIL)
    }

  /**
   * The minimum distance the target has to be from the tip of the final bone in the bone chain. Setting this value to a higher number allows for greater performance, but less accurate solves.
   */
  public open var chainTolerance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DFABRIK_GET_CHAIN_TOLERANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DFABRIK_SET_CHAIN_TOLERANCE, NIL)
    }

  /**
   * The number of times FABRIK will try to solve each time the `execute` function is called. Setting this value to a lower number will be result in better performance, but this can also result in harsher movements and slower solves.
   */
  public open var chainMaxIterations: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DFABRIK_GET_CHAIN_MAX_ITERATIONS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DFABRIK_SET_CHAIN_MAX_ITERATIONS, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SKELETONMODIFICATION3DFABRIK)
  }

  /**
   * Returns the name of the bone that is assigned to the FABRIK joint at `joint_idx`.
   */
  public open fun getFabrikJointBoneName(jointIdx: Long): String {
    TransferContext.writeArguments(LONG to jointIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DFABRIK_GET_FABRIK_JOINT_BONE_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Sets the bone name, `bone_name`, of the FABRIK joint at `joint_idx`. When possible, this will also update the `bone_index` of the FABRIK joint based on data provided by the [godot.Skeleton3D].
   */
  public open fun setFabrikJointBoneName(jointIdx: Long, boneName: String): Unit {
    TransferContext.writeArguments(LONG to jointIdx, STRING to boneName)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DFABRIK_SET_FABRIK_JOINT_BONE_NAME, NIL)
  }

  /**
   * Returns the bone index of the bone assigned to the FABRIK joint at `joint_idx`.
   */
  public open fun getFabrikJointBoneIndex(jointIdx: Long): Long {
    TransferContext.writeArguments(LONG to jointIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DFABRIK_GET_FABRIK_JOINT_BONE_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the bone index, `bone_index`, of the FABRIK joint at `joint_idx`. When possible, this will also update the `bone_name` of the FABRIK joint based on data provided by the [godot.Skeleton3D].
   */
  public open fun setFabrikJointBoneIndex(jointIdx: Long, boneIndex: Long): Unit {
    TransferContext.writeArguments(LONG to jointIdx, LONG to boneIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DFABRIK_SET_FABRIK_JOINT_BONE_INDEX, NIL)
  }

  /**
   * Returns the length of the FABRIK joint at `joint_idx`.
   */
  public open fun getFabrikJointLength(jointIdx: Long): Double {
    TransferContext.writeArguments(LONG to jointIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DFABRIK_GET_FABRIK_JOINT_LENGTH, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets the joint length, `length`, of the FABRIK joint at `joint_idx`.
   */
  public open fun setFabrikJointLength(jointIdx: Long, length: Double): Unit {
    TransferContext.writeArguments(LONG to jointIdx, DOUBLE to length)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DFABRIK_SET_FABRIK_JOINT_LENGTH, NIL)
  }

  /**
   * Returns the magnet vector of the FABRIK joint at `joint_idx`.
   */
  public open fun getFabrikJointMagnet(jointIdx: Long): Vector3 {
    TransferContext.writeArguments(LONG to jointIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DFABRIK_GET_FABRIK_JOINT_MAGNET, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Sets the magenet position to `magnet_position` for the joint at `joint_idx`. The magnet position is used to nudge the joint in that direction when solving, which gives some control over how that joint will bend when being solved.
   */
  public open fun setFabrikJointMagnet(jointIdx: Long, magnetPosition: Vector3): Unit {
    TransferContext.writeArguments(LONG to jointIdx, VECTOR3 to magnetPosition)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DFABRIK_SET_FABRIK_JOINT_MAGNET, NIL)
  }

  /**
   * Returns a boolean that indicates whether this modification will attempt to autocalculate the length of the bone assigned to the FABRIK joint at `joint_idx`.
   */
  public open fun getFabrikJointAutoCalculateLength(jointIdx: Long): Boolean {
    TransferContext.writeArguments(LONG to jointIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DFABRIK_GET_FABRIK_JOINT_AUTO_CALCULATE_LENGTH,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * When `true`, this modification will attempt to automatically calculate the length of the bone for the FABRIK joint at `joint_idx`. It does this by either using the tip node assigned, if there is one assigned, or the distance the of the bone's children, if the bone has any. If the bone has no children and no tip node is assigned, then the modification **cannot** autocalculate the joint's length. In this case, the joint length should be entered manually or a tip node assigned.
   */
  public open fun setFabrikJointAutoCalculateLength(jointIdx: Long, autoCalculateLength: Boolean):
      Unit {
    TransferContext.writeArguments(LONG to jointIdx, BOOL to autoCalculateLength)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DFABRIK_SET_FABRIK_JOINT_AUTO_CALCULATE_LENGTH,
        NIL)
  }

  /**
   * Will attempt to automatically calculate the length of the bone assigned to the FABRIK joint at `joint_idx`.
   */
  public open fun fabrikJointAutoCalculateLength(jointIdx: Long): Unit {
    TransferContext.writeArguments(LONG to jointIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DFABRIK_FABRIK_JOINT_AUTO_CALCULATE_LENGTH,
        NIL)
  }

  /**
   * Sets the [godot.Node3D]-based node that will be used as the tip of the FABRIK joint at `joint_idx`.
   */
  public open fun getFabrikJointUseTipNode(jointIdx: Long): Boolean {
    TransferContext.writeArguments(LONG to jointIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DFABRIK_GET_FABRIK_JOINT_USE_TIP_NODE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets whether the tip node should be used when autocalculating the joint length for the FABRIK joint at `joint_idx`. This will only work if there is a node assigned to the tip nodepath for this joint.
   */
  public open fun setFabrikJointUseTipNode(jointIdx: Long, useTipNode: Boolean): Unit {
    TransferContext.writeArguments(LONG to jointIdx, BOOL to useTipNode)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DFABRIK_SET_FABRIK_JOINT_USE_TIP_NODE, NIL)
  }

  /**
   * Returns the [godot.Node3D]-based node placed at the tip of the FABRIK joint at `joint_idx`, if one has been set.
   */
  public open fun getFabrikJointTipNode(jointIdx: Long): NodePath {
    TransferContext.writeArguments(LONG to jointIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DFABRIK_GET_FABRIK_JOINT_TIP_NODE, NODE_PATH)
    return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
  }

  /**
   * Sets the nodepath of the FARIK joint at `joint_idx` to `tip_node`. The tip node is used to calculate the length of the FABRIK joint when set to automatically calculate joint length.
   *
   * **Note:** The tip node should generally be a child node of a [godot.BoneAttachment3D] node attached to the bone that this FABRIK joint operates on, with the child node being offset so it is at the end of the bone.
   */
  public open fun setFabrikJointTipNode(jointIdx: Long, tipNode: NodePath): Unit {
    TransferContext.writeArguments(LONG to jointIdx, NODE_PATH to tipNode)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DFABRIK_SET_FABRIK_JOINT_TIP_NODE, NIL)
  }

  /**
   * Returns a boolean indicating whether the FABRIK joint uses the target's [godot.core.Basis] for its rotation.
   *
   * **Note:** This option is only available for the final bone in the FABRIK chain, with this setting being ignored for all other bones.
   */
  public open fun getFabrikJointUseTargetBasis(jointIdx: Long): Boolean {
    TransferContext.writeArguments(LONG to jointIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DFABRIK_GET_FABRIK_JOINT_USE_TARGET_BASIS,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets whether the FABRIK joint at `joint_idx` uses the target's [godot.core.Basis] for its rotation.
   *
   * **Note:** This option is only available for the final bone in the FABRIK chain, with this setting being ignored for all other bones.
   */
  public open fun setFabrikJointUseTargetBasis(jointIdx: Long, useTargetBasis: Boolean): Unit {
    TransferContext.writeArguments(LONG to jointIdx, BOOL to useTargetBasis)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION3DFABRIK_SET_FABRIK_JOINT_USE_TARGET_BASIS,
        NIL)
  }

  public companion object
}
