// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.NodePath
import godot.core.RID
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import godot.core.VariantParser._RID
import godot.core.asCachedNodePath
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Abstract base class for all joints in 3D physics. 3D joints bind together two physics bodies ([nodeA] and [nodeB]) and apply a constraint. If only one body is defined, it is attached to a fixed [StaticBody3D] without collision shapes.
 */
@GodotBaseType
public open class Joint3D internal constructor() : Node3D() {
  /**
   * Path to the first node (A) attached to the joint. The node must inherit [PhysicsBody3D].
   *
   * If left empty and [nodeB] is set, the body is attached to a fixed [StaticBody3D] without collision shapes.
   */
  public final inline var nodeA: NodePath
    @JvmName("nodeAProperty")
    get() = getNodeA()
    @JvmName("nodeAProperty")
    set(`value`) {
      setNodeA(value)
    }

  /**
   * Path to the second node (B) attached to the joint. The node must inherit [PhysicsBody3D].
   *
   * If left empty and [nodeA] is set, the body is attached to a fixed [StaticBody3D] without collision shapes.
   */
  public final inline var nodeB: NodePath
    @JvmName("nodeBProperty")
    get() = getNodeB()
    @JvmName("nodeBProperty")
    set(`value`) {
      setNodeB(value)
    }

  /**
   * The priority used to define which solver is executed first for multiple joints. The lower the value, the higher the priority.
   */
  public final inline var solverPriority: Int
    @JvmName("solverPriorityProperty")
    get() = getSolverPriority()
    @JvmName("solverPriorityProperty")
    set(`value`) {
      setSolverPriority(value)
    }

  /**
   * If `true`, the two bodies bound together do not collide with each other.
   */
  public final inline var excludeNodesFromCollision: Boolean
    @JvmName("excludeNodesFromCollisionProperty")
    get() = getExcludeNodesFromCollision()
    @JvmName("excludeNodesFromCollisionProperty")
    set(`value`) {
      setExcludeNodesFromCollision(value)
    }

  override fun new(scriptIndex: Int) {
    createNativeObject(323, scriptIndex)
  }

  public final fun setNodeA(node: NodePath) {
    TransferContext.writeArguments(NODE_PATH to node)
    TransferContext.callMethod(ptr, MethodBindings.setNodeAPtr, NIL)
  }

  public final fun getNodeA(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNodeAPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  public final fun setNodeB(node: NodePath) {
    TransferContext.writeArguments(NODE_PATH to node)
    TransferContext.callMethod(ptr, MethodBindings.setNodeBPtr, NIL)
  }

  public final fun getNodeB(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNodeBPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  public final fun setSolverPriority(priority: Int) {
    TransferContext.writeArguments(LONG to priority.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSolverPriorityPtr, NIL)
  }

  public final fun getSolverPriority(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSolverPriorityPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setExcludeNodesFromCollision(enable: Boolean) {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setExcludeNodesFromCollisionPtr, NIL)
  }

  public final fun getExcludeNodesFromCollision(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getExcludeNodesFromCollisionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the joint's internal [RID] from the [PhysicsServer3D].
   */
  public final fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public final fun setNodeA(node: String): Unit = setNodeA(node.asCachedNodePath())

  public final fun setNodeB(node: String): Unit = setNodeB(node.asCachedNodePath())

  public companion object

  public object MethodBindings {
    internal val setNodeAPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Joint3D", "set_node_a", 1_348_162_250)

    internal val getNodeAPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Joint3D", "get_node_a", 4_075_236_667)

    internal val setNodeBPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Joint3D", "set_node_b", 1_348_162_250)

    internal val getNodeBPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Joint3D", "get_node_b", 4_075_236_667)

    internal val setSolverPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Joint3D", "set_solver_priority", 1_286_410_249)

    internal val getSolverPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Joint3D", "get_solver_priority", 3_905_245_786)

    internal val setExcludeNodesFromCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Joint3D", "set_exclude_nodes_from_collision", 2_586_408_642)

    internal val getExcludeNodesFromCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Joint3D", "get_exclude_nodes_from_collision", 36_873_697)

    internal val getRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Joint3D", "get_rid", 2_944_877_500)
  }
}
