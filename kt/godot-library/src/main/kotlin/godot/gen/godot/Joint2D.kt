// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.NodePath
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import kotlin.Boolean
import kotlin.Double
import kotlin.Suppress

/**
 * Base node for all joint constraints in 2D physics.
 *
 * Base node for all joint constraints in 2D physics. Joints take 2 bodies and apply a custom constraint.
 */
@GodotBaseType
open class Joint2D : Node2D() {
  /**
   * When [nodeA] and [nodeB] move in different directions the `bias` controls how fast the joint pulls them back to their original position. The lower the `bias` the more the two bodies can pull on the joint.
   */
  open var bias: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JOINT2D_GET_BIAS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JOINT2D_SET_BIAS, NIL)
    }

  /**
   * If `true`, [nodeA] and [nodeB] can not collide.
   */
  open var disableCollision: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JOINT2D_GET_DISABLE_COLLISION,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JOINT2D_SET_DISABLE_COLLISION,
          NIL)
    }

  /**
   * The first body attached to the joint. Must derive from [godot.PhysicsBody2D].
   */
  open var nodeA: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JOINT2D_GET_NODE_A, NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(value) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JOINT2D_SET_NODE_A, NIL)
    }

  /**
   * The second body attached to the joint. Must derive from [godot.PhysicsBody2D].
   */
  open var nodeB: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JOINT2D_GET_NODE_B, NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(value) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JOINT2D_SET_NODE_B, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_JOINT2D)
  }

  open fun _bodyExitTree() {
  }
}
