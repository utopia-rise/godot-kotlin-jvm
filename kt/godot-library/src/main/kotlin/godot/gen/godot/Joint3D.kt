// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.RID
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType._RID
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Abstract base class for all joints in 3D physics. 3D joints bind together two physics bodies and
 * apply a constraint.
 */
@GodotBaseType
public open class Joint3D internal constructor() : Node3D() {
  /**
   * The node attached to the first side (A) of the joint.
   */
  public var nodeA: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNodeAPtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setNodeAPtr, NIL)
    }

  /**
   * The node attached to the second side (B) of the joint.
   */
  public var nodeB: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNodeBPtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setNodeBPtr, NIL)
    }

  /**
   * The priority used to define which solver is executed first for multiple joints. The lower the
   * value, the higher the priority.
   */
  public var solverPriority: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSolverPriorityPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setSolverPriorityPtr, NIL)
    }

  /**
   * If `true`, the two bodies of the nodes are not able to collide with each other.
   */
  public var excludeNodesFromCollision: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getExcludeNodesFromCollisionPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setExcludeNodesFromCollisionPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_JOINT3D, scriptIndex)
    return true
  }

  /**
   * Returns the joint's [RID].
   */
  public fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public companion object

  internal object MethodBindings {
    public val setNodeAPtr: VoidPtr = TypeManager.getMethodBindPtr("Joint3D", "set_node_a")

    public val getNodeAPtr: VoidPtr = TypeManager.getMethodBindPtr("Joint3D", "get_node_a")

    public val setNodeBPtr: VoidPtr = TypeManager.getMethodBindPtr("Joint3D", "set_node_b")

    public val getNodeBPtr: VoidPtr = TypeManager.getMethodBindPtr("Joint3D", "get_node_b")

    public val setSolverPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Joint3D", "set_solver_priority")

    public val getSolverPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Joint3D", "get_solver_priority")

    public val setExcludeNodesFromCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Joint3D", "set_exclude_nodes_from_collision")

    public val getExcludeNodesFromCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Joint3D", "get_exclude_nodes_from_collision")

    public val getRidPtr: VoidPtr = TypeManager.getMethodBindPtr("Joint3D", "get_rid")
  }
}
