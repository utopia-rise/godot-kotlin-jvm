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
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import godot.core.VariantParser._RID
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_JOINT2D_INDEX: Int = 339

/**
 * Abstract base class for all joints in 2D physics. 2D joints bind together two physics bodies
 * ([nodeA] and [nodeB]) and apply a constraint.
 */
@GodotBaseType
public open class Joint2D internal constructor() : Node2D() {
  /**
   * Path to the first body (A) attached to the joint. The node must inherit [PhysicsBody2D].
   */
  public final inline var nodeA: NodePath
    @JvmName("nodeAProperty")
    get() = getNodeA()
    @JvmName("nodeAProperty")
    set(`value`) {
      setNodeA(value)
    }

  /**
   * Path to the second body (B) attached to the joint. The node must inherit [PhysicsBody2D].
   */
  public final inline var nodeB: NodePath
    @JvmName("nodeBProperty")
    get() = getNodeB()
    @JvmName("nodeBProperty")
    set(`value`) {
      setNodeB(value)
    }

  /**
   * When [nodeA] and [nodeB] move in different directions the [bias] controls how fast the joint
   * pulls them back to their original position. The lower the [bias] the more the two bodies can pull
   * on the joint.
   * When set to `0`, the default value from
   * [ProjectSettings.physics/2d/solver/defaultConstraintBias] is used.
   */
  public final inline var bias: Float
    @JvmName("biasProperty")
    get() = getBias()
    @JvmName("biasProperty")
    set(`value`) {
      setBias(value)
    }

  /**
   * If `true`, the two bodies bound together do not collide with each other.
   */
  public final inline var disableCollision: Boolean
    @JvmName("disableCollisionProperty")
    get() = getExcludeNodesFromCollision()
    @JvmName("disableCollisionProperty")
    set(`value`) {
      setExcludeNodesFromCollision(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_JOINT2D_INDEX, scriptIndex)
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

  public final fun setBias(bias: Float): Unit {
    Internals.writeArguments(DOUBLE to bias.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setBiasPtr, NIL)
  }

  public final fun getBias(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBiasPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
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
   * Returns the joint's internal [RID] from the [PhysicsServer2D].
   */
  public final fun getRid(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRidPtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  public companion object

  public object MethodBindings {
    internal val setNodeAPtr: VoidPtr =
        Internals.getMethodBindPtr("Joint2D", "set_node_a", 1348162250)

    internal val getNodeAPtr: VoidPtr =
        Internals.getMethodBindPtr("Joint2D", "get_node_a", 4075236667)

    internal val setNodeBPtr: VoidPtr =
        Internals.getMethodBindPtr("Joint2D", "set_node_b", 1348162250)

    internal val getNodeBPtr: VoidPtr =
        Internals.getMethodBindPtr("Joint2D", "get_node_b", 4075236667)

    internal val setBiasPtr: VoidPtr = Internals.getMethodBindPtr("Joint2D", "set_bias", 373806689)

    internal val getBiasPtr: VoidPtr = Internals.getMethodBindPtr("Joint2D", "get_bias", 1740695150)

    internal val setExcludeNodesFromCollisionPtr: VoidPtr =
        Internals.getMethodBindPtr("Joint2D", "set_exclude_nodes_from_collision", 2586408642)

    internal val getExcludeNodesFromCollisionPtr: VoidPtr =
        Internals.getMethodBindPtr("Joint2D", "get_exclude_nodes_from_collision", 36873697)

    internal val getRidPtr: VoidPtr = Internals.getMethodBindPtr("Joint2D", "get_rid", 2944877500)
  }
}
