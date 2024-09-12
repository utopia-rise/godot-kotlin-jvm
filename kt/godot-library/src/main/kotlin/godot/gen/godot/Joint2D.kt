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
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType._RID
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
    callConstructor(ENGINECLASS_JOINT2D, scriptIndex)
  }

  public final fun setNodeA(node: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to node)
    TransferContext.callMethod(rawPtr, MethodBindings.setNodeAPtr, NIL)
  }

  public final fun getNodeA(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNodeAPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
  }

  public final fun setNodeB(node: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to node)
    TransferContext.callMethod(rawPtr, MethodBindings.setNodeBPtr, NIL)
  }

  public final fun getNodeB(): NodePath {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNodeBPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
  }

  public final fun setBias(bias: Float): Unit {
    TransferContext.writeArguments(DOUBLE to bias.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setBiasPtr, NIL)
  }

  public final fun getBias(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBiasPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public final fun setExcludeNodesFromCollision(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setExcludeNodesFromCollisionPtr, NIL)
  }

  public final fun getExcludeNodesFromCollision(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getExcludeNodesFromCollisionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the joint's internal [RID] from the [PhysicsServer2D].
   */
  public final fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public companion object

  internal object MethodBindings {
    public val setNodeAPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Joint2D", "set_node_a", 1348162250)

    public val getNodeAPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Joint2D", "get_node_a", 4075236667)

    public val setNodeBPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Joint2D", "set_node_b", 1348162250)

    public val getNodeBPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Joint2D", "get_node_b", 4075236667)

    public val setBiasPtr: VoidPtr = TypeManager.getMethodBindPtr("Joint2D", "set_bias", 373806689)

    public val getBiasPtr: VoidPtr = TypeManager.getMethodBindPtr("Joint2D", "get_bias", 1740695150)

    public val setExcludeNodesFromCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Joint2D", "set_exclude_nodes_from_collision", 2586408642)

    public val getExcludeNodesFromCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Joint2D", "get_exclude_nodes_from_collision", 36873697)

    public val getRidPtr: VoidPtr = TypeManager.getMethodBindPtr("Joint2D", "get_rid", 2944877500)
  }
}
