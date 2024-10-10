// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.TypeManager
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_SKELETONMODIFICATION2DFABRIK_INDEX: Int = 525

/**
 * This [SkeletonModification2D] uses an algorithm called Forward And Backward Reaching Inverse
 * Kinematics, or FABRIK, to rotate a bone chain so that it reaches a target.
 * FABRIK works by knowing the positions and lengths of a series of bones, typically called a "bone
 * chain". It first starts by running a forward pass, which places the final bone at the target's
 * position. Then all other bones are moved towards the tip bone, so they stay at the defined bone
 * length away. Then a backwards pass is performed, where the root/first bone in the FABRIK chain is
 * placed back at the origin. Then all other bones are moved so they stay at the defined bone length
 * away. This positions the bone chain so that it reaches the target when possible, but all of the
 * bones stay the correct length away from each other.
 * Because of how FABRIK works, it often gives more natural results than those seen in
 * [SkeletonModification2DCCDIK]. FABRIK also supports angle constraints, which are fully taken into
 * account when solving.
 * **Note:** The FABRIK modifier has `fabrik_joints`, which are the data objects that hold the data
 * for each joint in the FABRIK chain. This is different from [Bone2D] nodes! FABRIK joints hold the
 * data needed for each [Bone2D] in the bone chain used by FABRIK.
 * To help control how the FABRIK joints move, a magnet vector can be passed, which can nudge the
 * bones in a certain direction prior to solving, giving a level of control over the final result.
 */
@GodotBaseType
public open class SkeletonModification2DFABRIK : SkeletonModification2D() {
  /**
   * The NodePath to the node that is the target for the FABRIK modification. This node is what the
   * FABRIK chain will attempt to rotate the bone chain to.
   */
  public final inline var targetNodepath: NodePath
    @JvmName("targetNodepathProperty")
    get() = getTargetNode()
    @JvmName("targetNodepathProperty")
    set(`value`) {
      setTargetNode(value)
    }

  /**
   * The number of FABRIK joints in the FABRIK modification.
   */
  public final inline var fabrikDataChainLength: Int
    @JvmName("fabrikDataChainLengthProperty")
    get() = getFabrikDataChainLength()
    @JvmName("fabrikDataChainLengthProperty")
    set(`value`) {
      setFabrikDataChainLength(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINE_CLASS_SKELETONMODIFICATION2DFABRIK_INDEX, scriptIndex)
  }

  public final fun setTargetNode(targetNodepath: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to targetNodepath)
    TransferContext.callMethod(rawPtr, MethodBindings.setTargetNodePtr, NIL)
  }

  public final fun getTargetNode(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTargetNodePtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  public final fun setFabrikDataChainLength(length: Int): Unit {
    TransferContext.writeArguments(LONG to length.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setFabrikDataChainLengthPtr, NIL)
  }

  public final fun getFabrikDataChainLength(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFabrikDataChainLengthPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the [Bone2D] node assigned to the FABRIK joint at [jointIdx].
   */
  public final fun setFabrikJointBone2dNode(jointIdx: Int, bone2dNodepath: NodePath): Unit {
    TransferContext.writeArguments(LONG to jointIdx.toLong(), NODE_PATH to bone2dNodepath)
    TransferContext.callMethod(rawPtr, MethodBindings.setFabrikJointBone2dNodePtr, NIL)
  }

  /**
   * Returns the [Bone2D] node assigned to the FABRIK joint at [jointIdx].
   */
  public final fun getFabrikJointBone2dNode(jointIdx: Int): NodePath {
    TransferContext.writeArguments(LONG to jointIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getFabrikJointBone2dNodePtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  /**
   * Sets the bone index, [boneIdx], of the FABRIK joint at [jointIdx]. When possible, this will
   * also update the `bone2d_node` of the FABRIK joint based on data provided by the linked skeleton.
   */
  public final fun setFabrikJointBoneIndex(jointIdx: Int, boneIdx: Int): Unit {
    TransferContext.writeArguments(LONG to jointIdx.toLong(), LONG to boneIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setFabrikJointBoneIndexPtr, NIL)
  }

  /**
   * Returns the index of the [Bone2D] node assigned to the FABRIK joint at [jointIdx].
   */
  public final fun getFabrikJointBoneIndex(jointIdx: Int): Int {
    TransferContext.writeArguments(LONG to jointIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getFabrikJointBoneIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the magnet position vector for the joint at [jointIdx].
   */
  public final fun setFabrikJointMagnetPosition(jointIdx: Int, magnetPosition: Vector2): Unit {
    TransferContext.writeArguments(LONG to jointIdx.toLong(), VECTOR2 to magnetPosition)
    TransferContext.callMethod(rawPtr, MethodBindings.setFabrikJointMagnetPositionPtr, NIL)
  }

  /**
   * Returns the magnet position vector for the joint at [jointIdx].
   */
  public final fun getFabrikJointMagnetPosition(jointIdx: Int): Vector2 {
    TransferContext.writeArguments(LONG to jointIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getFabrikJointMagnetPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Sets whether the joint at [jointIdx] will use the target node's rotation rather than letting
   * FABRIK rotate the node.
   * **Note:** This option only works for the tip/final joint in the chain. For all other nodes,
   * this option will be ignored.
   */
  public final fun setFabrikJointUseTargetRotation(jointIdx: Int, useTargetRotation: Boolean):
      Unit {
    TransferContext.writeArguments(LONG to jointIdx.toLong(), BOOL to useTargetRotation)
    TransferContext.callMethod(rawPtr, MethodBindings.setFabrikJointUseTargetRotationPtr, NIL)
  }

  /**
   * Returns whether the joint is using the target's rotation rather than allowing FABRIK to rotate
   * the joint. This option only applies to the tip/final joint in the chain.
   */
  public final fun getFabrikJointUseTargetRotation(jointIdx: Int): Boolean {
    TransferContext.writeArguments(LONG to jointIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getFabrikJointUseTargetRotationPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setTargetNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DFABRIK", "set_target_node", 1348162250)

    public val getTargetNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DFABRIK", "get_target_node", 4075236667)

    public val setFabrikDataChainLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DFABRIK", "set_fabrik_data_chain_length", 1286410249)

    public val getFabrikDataChainLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DFABRIK", "get_fabrik_data_chain_length", 2455072627)

    public val setFabrikJointBone2dNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DFABRIK", "set_fabrik_joint_bone2d_node", 2761262315)

    public val getFabrikJointBone2dNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DFABRIK", "get_fabrik_joint_bone2d_node", 408788394)

    public val setFabrikJointBoneIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DFABRIK", "set_fabrik_joint_bone_index", 3937882851)

    public val getFabrikJointBoneIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DFABRIK", "get_fabrik_joint_bone_index", 923996154)

    public val setFabrikJointMagnetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DFABRIK", "set_fabrik_joint_magnet_position", 163021252)

    public val getFabrikJointMagnetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DFABRIK", "get_fabrik_joint_magnet_position", 2299179447)

    public val setFabrikJointUseTargetRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DFABRIK", "set_fabrik_joint_use_target_rotation", 300928843)

    public val getFabrikJointUseTargetRotationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DFABRIK", "get_fabrik_joint_use_target_rotation", 1116898809)
  }
}
