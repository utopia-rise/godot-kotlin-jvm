// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import kotlin.Any
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A modification that applies the transforms of [godot.PhysicalBone2D] nodes to [godot.Bone2D] nodes.
 *
 * This modification takes the transforms of [godot.PhysicalBone2D] nodes and applies them to [godot.Bone2D] nodes. This allows the [godot.Bone2D] nodes to react to physics thanks to the linked [godot.PhysicalBone2D] nodes.
 */
@GodotBaseType
public open class SkeletonModification2DPhysicalBones : SkeletonModification2D() {
  /**
   * The amount of [godot.PhysicalBone2D] nodes linked in this modification.
   */
  public var physicalBoneChainLength: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DPHYSICALBONES_GET_PHYSICAL_BONE_CHAIN_LENGTH,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DPHYSICALBONES_SET_PHYSICAL_BONE_CHAIN_LENGTH,
          NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SKELETONMODIFICATION2DPHYSICALBONES)
  }

  /**
   * Sets the [godot.PhysicalBone2D] node at `joint_idx`.
   *
   * **Note:** This is just the index used for this modification, not the bone index used in the [godot.Skeleton2D].
   */
  public fun setPhysicalBoneNode(jointIdx: Long, physicalbone2dNode: NodePath): Unit {
    TransferContext.writeArguments(LONG to jointIdx, NODE_PATH to physicalbone2dNode)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DPHYSICALBONES_SET_PHYSICAL_BONE_NODE,
        NIL.ordinal)
  }

  /**
   * Returns the [godot.PhysicalBone2D] node at `joint_idx`.
   */
  public fun getPhysicalBoneNode(jointIdx: Long): NodePath {
    TransferContext.writeArguments(LONG to jointIdx)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DPHYSICALBONES_GET_PHYSICAL_BONE_NODE,
        NODE_PATH.ordinal)
    return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
  }

  /**
   * Empties the list of [godot.PhysicalBone2D] nodes and populates it will all [godot.PhysicalBone2D] nodes that are children of the [godot.Skeleton2D].
   */
  public fun fetchPhysicalBones(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DPHYSICALBONES_FETCH_PHYSICAL_BONES,
        NIL.ordinal)
  }

  /**
   * Tell the [godot.PhysicalBone2D] nodes to start simulating and interacting with the physics world.
   *
   * Optionally, an array of bone names can be passed to this function, and that will cause only [godot.PhysicalBone2D] nodes with those names to start simulating.
   */
  public fun startSimulation(bones: VariantArray<Any?> = godot.core.variantArrayOf()): Unit {
    TransferContext.writeArguments(ARRAY to bones)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DPHYSICALBONES_START_SIMULATION, NIL.ordinal)
  }

  /**
   * Tell the [godot.PhysicalBone2D] nodes to stop simulating and interacting with the physics world.
   *
   * Optionally, an array of bone names can be passed to this function, and that will cause only [godot.PhysicalBone2D] nodes with those names to stop simulating.
   */
  public fun stopSimulation(bones: VariantArray<Any?> = godot.core.variantArrayOf()): Unit {
    TransferContext.writeArguments(ARRAY to bones)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SKELETONMODIFICATION2DPHYSICALBONES_STOP_SIMULATION, NIL.ordinal)
  }

  public companion object
}
