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
import godot.core.StringName
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import godot.core.asCachedNodePath
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * This modification takes the transforms of [PhysicalBone2D] nodes and applies them to [Bone2D]
 * nodes. This allows the [Bone2D] nodes to react to physics thanks to the linked [PhysicalBone2D]
 * nodes.
 */
@GodotBaseType
public open class SkeletonModification2DPhysicalBones : SkeletonModification2D() {
  /**
   * The number of [PhysicalBone2D] nodes linked in this modification.
   */
  public final inline var physicalBoneChainLength: Int
    @JvmName("physicalBoneChainLengthProperty")
    get() = getPhysicalBoneChainLength()
    @JvmName("physicalBoneChainLengthProperty")
    set(`value`) {
      setPhysicalBoneChainLength(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(601, scriptIndex)
  }

  public final fun setPhysicalBoneChainLength(length: Int): Unit {
    TransferContext.writeArguments(LONG to length.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setPhysicalBoneChainLengthPtr, NIL)
  }

  public final fun getPhysicalBoneChainLength(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPhysicalBoneChainLengthPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the [PhysicalBone2D] node at [jointIdx].
   *
   * **Note:** This is just the index used for this modification, not the bone index used in the
   * [Skeleton2D].
   */
  public final fun setPhysicalBoneNode(jointIdx: Int, physicalbone2dNode: NodePath): Unit {
    TransferContext.writeArguments(LONG to jointIdx.toLong(), NODE_PATH to physicalbone2dNode)
    TransferContext.callMethod(ptr, MethodBindings.setPhysicalBoneNodePtr, NIL)
  }

  /**
   * Returns the [PhysicalBone2D] node at [jointIdx].
   */
  public final fun getPhysicalBoneNode(jointIdx: Int): NodePath {
    TransferContext.writeArguments(LONG to jointIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getPhysicalBoneNodePtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  /**
   * Empties the list of [PhysicalBone2D] nodes and populates it with all [PhysicalBone2D] nodes
   * that are children of the [Skeleton2D].
   */
  public final fun fetchPhysicalBones(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.fetchPhysicalBonesPtr, NIL)
  }

  /**
   * Tell the [PhysicalBone2D] nodes to start simulating and interacting with the physics world.
   *
   * Optionally, an array of bone names can be passed to this function, and that will cause only
   * [PhysicalBone2D] nodes with those names to start simulating.
   */
  @JvmOverloads
  public final fun startSimulation(bones: VariantArray<StringName> = godot.core.variantArrayOf()):
      Unit {
    TransferContext.writeArguments(ARRAY to bones)
    TransferContext.callMethod(ptr, MethodBindings.startSimulationPtr, NIL)
  }

  /**
   * Tell the [PhysicalBone2D] nodes to stop simulating and interacting with the physics world.
   *
   * Optionally, an array of bone names can be passed to this function, and that will cause only
   * [PhysicalBone2D] nodes with those names to stop simulating.
   */
  @JvmOverloads
  public final fun stopSimulation(bones: VariantArray<StringName> = godot.core.variantArrayOf()):
      Unit {
    TransferContext.writeArguments(ARRAY to bones)
    TransferContext.callMethod(ptr, MethodBindings.stopSimulationPtr, NIL)
  }

  /**
   * Sets the [PhysicalBone2D] node at [jointIdx].
   *
   * **Note:** This is just the index used for this modification, not the bone index used in the
   * [Skeleton2D].
   */
  public final fun setPhysicalBoneNode(jointIdx: Int, physicalbone2dNode: String) =
      setPhysicalBoneNode(jointIdx, physicalbone2dNode.asCachedNodePath())

  public companion object

  public object MethodBindings {
    internal val setPhysicalBoneChainLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DPhysicalBones", "set_physical_bone_chain_length", 1286410249)

    internal val getPhysicalBoneChainLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DPhysicalBones", "get_physical_bone_chain_length", 2455072627)

    internal val setPhysicalBoneNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DPhysicalBones", "set_physical_bone_node", 2761262315)

    internal val getPhysicalBoneNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DPhysicalBones", "get_physical_bone_node", 408788394)

    internal val fetchPhysicalBonesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DPhysicalBones", "fetch_physical_bones", 3218959716)

    internal val startSimulationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DPhysicalBones", "start_simulation", 2787316981)

    internal val stopSimulationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonModification2DPhysicalBones", "stop_simulation", 2787316981)
  }
}
