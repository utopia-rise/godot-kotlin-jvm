// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * A modification that applies the transforms of [godot.PhysicalBone2D] nodes to [godot.Bone2D] nodes.
 *
 * This modification takes the transforms of [godot.PhysicalBone2D] nodes and applies them to [godot.Bone2D] nodes. This allows the [godot.Bone2D] nodes to react to physics thanks to the linked [godot.PhysicalBone2D] nodes.
 *
 * Experimental. Physical bones may be changed in the future to perform the position update of [godot.Bone2D] on their own.
 */
@GodotBaseType
public open class SkeletonModification2DPhysicalBones : SkeletonModification2D() {
  /**
   * The number of [godot.PhysicalBone2D] nodes linked in this modification.
   */
  public var physicalBoneChainLength: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPhysicalBoneChainLengthPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setPhysicalBoneChainLengthPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SKELETONMODIFICATION2DPHYSICALBONES, scriptIndex)
    return true
  }

  /**
   * Sets the [godot.PhysicalBone2D] node at [jointIdx].
   *
   * **Note:** This is just the index used for this modification, not the bone index used in the [godot.Skeleton2D].
   */
  public fun setPhysicalBoneNode(jointIdx: Int, physicalbone2dNode: NodePath): Unit {
    TransferContext.writeArguments(LONG to jointIdx.toLong(), NODE_PATH to physicalbone2dNode)
    TransferContext.callMethod(rawPtr, MethodBindings.setPhysicalBoneNodePtr, NIL)
  }

  /**
   * Returns the [godot.PhysicalBone2D] node at [jointIdx].
   */
  public fun getPhysicalBoneNode(jointIdx: Int): NodePath {
    TransferContext.writeArguments(LONG to jointIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPhysicalBoneNodePtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
  }

  /**
   * Empties the list of [godot.PhysicalBone2D] nodes and populates it with all [godot.PhysicalBone2D] nodes that are children of the [godot.Skeleton2D].
   */
  public fun fetchPhysicalBones(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.fetchPhysicalBonesPtr, NIL)
  }

  /**
   * Tell the [godot.PhysicalBone2D] nodes to start simulating and interacting with the physics world.
   *
   * Optionally, an array of bone names can be passed to this function, and that will cause only [godot.PhysicalBone2D] nodes with those names to start simulating.
   */
  @JvmOverloads
  public fun startSimulation(bones: VariantArray<StringName> = godot.core.variantArrayOf()): Unit {
    TransferContext.writeArguments(ARRAY to bones)
    TransferContext.callMethod(rawPtr, MethodBindings.startSimulationPtr, NIL)
  }

  /**
   * Tell the [godot.PhysicalBone2D] nodes to stop simulating and interacting with the physics world.
   *
   * Optionally, an array of bone names can be passed to this function, and that will cause only [godot.PhysicalBone2D] nodes with those names to stop simulating.
   */
  @JvmOverloads
  public fun stopSimulation(bones: VariantArray<StringName> = godot.core.variantArrayOf()): Unit {
    TransferContext.writeArguments(ARRAY to bones)
    TransferContext.callMethod(rawPtr, MethodBindings.stopSimulationPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val setPhysicalBoneChainLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DPhysicalBones", "set_physical_bone_chain_length")

    public val getPhysicalBoneChainLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DPhysicalBones", "get_physical_bone_chain_length")

    public val setPhysicalBoneNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DPhysicalBones", "set_physical_bone_node")

    public val getPhysicalBoneNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DPhysicalBones", "get_physical_bone_node")

    public val fetchPhysicalBonesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DPhysicalBones", "fetch_physical_bones")

    public val startSimulationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DPhysicalBones", "start_simulation")

    public val stopSimulationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DPhysicalBones", "stop_simulation")
  }
}
