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

/**
 * Abstract base class for all joints in 2D physics. 2D joints bind together two physics bodies
 * ([nodeA] and [nodeB]) and apply a constraint.
 */
@GodotBaseType
public open class Joint2D internal constructor() : Node2D() {
  /**
   * Path to the first body (A) attached to the joint. The node must inherit [PhysicsBody2D].
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
   * Path to the second body (B) attached to the joint. The node must inherit [PhysicsBody2D].
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
   * When [nodeA] and [nodeB] move in different directions the [bias] controls how fast the joint
   * pulls them back to their original position. The lower the [bias] the more the two bodies can pull
   * on the joint.
   * When set to `0`, the default value from
   * [ProjectSettings.physics/2d/solver/defaultConstraintBias] is used.
   */
  public var bias: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBiasPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setBiasPtr, NIL)
    }

  /**
   * If `true`, the two bodies bound together do not collide with each other.
   */
  public var disableCollision: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getExcludeNodesFromCollisionPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setExcludeNodesFromCollisionPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_JOINT2D, scriptIndex)
  }

  /**
   * Returns the joint's internal [RID] from the [PhysicsServer2D].
   */
  public fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public companion object

  internal object MethodBindings {
    public val setNodeAPtr: VoidPtr = TypeManager.getMethodBindPtr("Joint2D", "set_node_a")

    public val getNodeAPtr: VoidPtr = TypeManager.getMethodBindPtr("Joint2D", "get_node_a")

    public val setNodeBPtr: VoidPtr = TypeManager.getMethodBindPtr("Joint2D", "set_node_b")

    public val getNodeBPtr: VoidPtr = TypeManager.getMethodBindPtr("Joint2D", "get_node_b")

    public val setBiasPtr: VoidPtr = TypeManager.getMethodBindPtr("Joint2D", "set_bias")

    public val getBiasPtr: VoidPtr = TypeManager.getMethodBindPtr("Joint2D", "get_bias")

    public val setExcludeNodesFromCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Joint2D", "set_exclude_nodes_from_collision")

    public val getExcludeNodesFromCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Joint2D", "get_exclude_nodes_from_collision")

    public val getRidPtr: VoidPtr = TypeManager.getMethodBindPtr("Joint2D", "get_rid")
  }
}
