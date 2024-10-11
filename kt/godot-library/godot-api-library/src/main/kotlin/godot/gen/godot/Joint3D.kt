// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.RID
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import godot.core.VariantParser._RID
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_JOINT3D_INDEX: Int = 340

/**
 * Abstract base class for all joints in 3D physics. 3D joints bind together two physics bodies
 * ([nodeA] and [nodeB]) and apply a constraint. If only one body is defined, it is attached to a fixed
 * [StaticBody3D] without collision shapes.
 */
@GodotBaseType
public open class Joint3D internal constructor() : Node3D() {
  /**
   * Path to the first node (A) attached to the joint. The node must inherit [PhysicsBody3D].
   * If left empty and [nodeB] is set, the body is attached to a fixed [StaticBody3D] without
   * collision shapes.
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
   * If left empty and [nodeA] is set, the body is attached to a fixed [StaticBody3D] without
   * collision shapes.
   */
  public final inline var nodeB: NodePath
    @JvmName("nodeBProperty")
    get() = getNodeB()
    @JvmName("nodeBProperty")
    set(`value`) {
      setNodeB(value)
    }

  /**
   * The priority used to define which solver is executed first for multiple joints. The lower the
   * value, the higher the priority.
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

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_JOINT3D_INDEX, scriptIndex)
  }

  public final fun setNodeA(node: NodePath): Unit {
    Internals.writeArguments(NODE_PATH to node)
    Internals.callMethod(rawPtr, MethodBindings.setNodeAPtr, NIL)
  }

  public final fun getNodeA(): NodePath {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getNodeAPtr, NODE_PATH)
    return (Internals.readReturnValue(NODE_PATH) as NodePath)
  }

  public final fun setNodeB(node: NodePath): Unit {
    Internals.writeArguments(NODE_PATH to node)
    Internals.callMethod(rawPtr, MethodBindings.setNodeBPtr, NIL)
  }

  public final fun getNodeB(): NodePath {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getNodeBPtr, NODE_PATH)
    return (Internals.readReturnValue(NODE_PATH) as NodePath)
  }

  public final fun setSolverPriority(priority: Int): Unit {
    Internals.writeArguments(LONG to priority.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setSolverPriorityPtr, NIL)
  }

  public final fun getSolverPriority(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSolverPriorityPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setExcludeNodesFromCollision(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setExcludeNodesFromCollisionPtr, NIL)
  }

  public final fun getExcludeNodesFromCollision(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getExcludeNodesFromCollisionPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the joint's internal [RID] from the [PhysicsServer3D].
   */
  public final fun getRid(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRidPtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  public companion object

  public object MethodBindings {
    internal val setNodeAPtr: VoidPtr =
        Internals.getMethodBindPtr("Joint3D", "set_node_a", 1348162250)

    internal val getNodeAPtr: VoidPtr =
        Internals.getMethodBindPtr("Joint3D", "get_node_a", 4075236667)

    internal val setNodeBPtr: VoidPtr =
        Internals.getMethodBindPtr("Joint3D", "set_node_b", 1348162250)

    internal val getNodeBPtr: VoidPtr =
        Internals.getMethodBindPtr("Joint3D", "get_node_b", 4075236667)

    internal val setSolverPriorityPtr: VoidPtr =
        Internals.getMethodBindPtr("Joint3D", "set_solver_priority", 1286410249)

    internal val getSolverPriorityPtr: VoidPtr =
        Internals.getMethodBindPtr("Joint3D", "get_solver_priority", 3905245786)

    internal val setExcludeNodesFromCollisionPtr: VoidPtr =
        Internals.getMethodBindPtr("Joint3D", "set_exclude_nodes_from_collision", 2586408642)

    internal val getExcludeNodesFromCollisionPtr: VoidPtr =
        Internals.getMethodBindPtr("Joint3D", "get_exclude_nodes_from_collision", 36873697)

    internal val getRidPtr: VoidPtr = Internals.getMethodBindPtr("Joint3D", "get_rid", 2944877500)
  }
}
