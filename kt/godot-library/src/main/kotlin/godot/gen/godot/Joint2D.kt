// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import kotlin.Boolean
import kotlin.Double
import kotlin.Suppress
import kotlin.Unit

/**
 * Base node for all joint constraints in 2D physics.
 *
 * Base node for all joint constraints in 2D physics. Joints take 2 bodies and apply a custom constraint.
 */
@GodotBaseType
public open class Joint2D internal constructor() : Node2D() {
  /**
   * The first body attached to the joint. Must derive from [godot.PhysicsBody2D].
   */
  public var nodeA: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_JOINT2D_GET_NODE_A, NODE_PATH.ordinal)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_JOINT2D_SET_NODE_A, NIL.ordinal)
    }

  /**
   * The second body attached to the joint. Must derive from [godot.PhysicsBody2D].
   */
  public var nodeB: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_JOINT2D_GET_NODE_B, NODE_PATH.ordinal)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_JOINT2D_SET_NODE_B, NIL.ordinal)
    }

  /**
   * When [nodeA] and [nodeB] move in different directions the `bias` controls how fast the joint pulls them back to their original position. The lower the `bias` the more the two bodies can pull on the joint.
   *
   * When set to `0`, the default value from [godot.ProjectSettings.physics/2d/solver/defaultConstraintBias] is used.
   */
  public var bias: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_JOINT2D_GET_BIAS, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_JOINT2D_SET_BIAS, NIL.ordinal)
    }

  /**
   * If `true`, [nodeA] and [nodeB] can not collide.
   */
  public var disableCollision: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_JOINT2D_GET_EXCLUDE_NODES_FROM_COLLISION, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_JOINT2D_SET_EXCLUDE_NODES_FROM_COLLISION, NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_JOINT2D)
  }

  public companion object
}
