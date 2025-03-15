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
import godot.core.RID
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import godot.core.VariantParser._RID
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
    createNativeObject(322, scriptIndex)
  }

  public final fun setNodeA(node: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to node)
    TransferContext.callMethod(ptr, MethodBindings.setNodeAPtr, NIL)
  }

  public final fun getNodeA(): NodePath {
    TransferContext.callMethod(ptr, MethodBindings.getNodeAPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  public final fun setNodeB(node: NodePath): Unit {
    TransferContext.writeArguments(NODE_PATH to node)
    TransferContext.callMethod(ptr, MethodBindings.setNodeBPtr, NIL)
  }

  public final fun getNodeB(): NodePath {
    TransferContext.callMethod(ptr, MethodBindings.getNodeBPtr, NODE_PATH)
    return (TransferContext.readReturnValue(NODE_PATH) as NodePath)
  }

  public final fun setBias(bias: Float): Unit {
    TransferContext.writeArguments(DOUBLE to bias.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setBiasPtr, NIL)
  }

  public final fun getBias(): Float {
    TransferContext.callMethod(ptr, MethodBindings.getBiasPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setExcludeNodesFromCollision(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setExcludeNodesFromCollisionPtr, NIL)
  }

  public final fun getExcludeNodesFromCollision(): Boolean {
    TransferContext.callMethod(ptr, MethodBindings.getExcludeNodesFromCollisionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the joint's internal [RID] from the [PhysicsServer2D].
   */
  public final fun getRid(): RID {
    TransferContext.callMethod(ptr, MethodBindings.getRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public companion object

  public object MethodBindings {
    internal val setNodeAPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Joint2D", "set_node_a", 1348162250)

    internal val getNodeAPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Joint2D", "get_node_a", 4075236667)

    internal val setNodeBPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Joint2D", "set_node_b", 1348162250)

    internal val getNodeBPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Joint2D", "get_node_b", 4075236667)

    internal val setBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Joint2D", "set_bias", 373806689)

    internal val getBiasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Joint2D", "get_bias", 1740695150)

    internal val setExcludeNodesFromCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Joint2D", "set_exclude_nodes_from_collision", 2586408642)

    internal val getExcludeNodesFromCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Joint2D", "get_exclude_nodes_from_collision", 36873697)

    internal val getRidPtr: VoidPtr = TypeManager.getMethodBindPtr("Joint2D", "get_rid", 2944877500)
  }
}
