// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Boolean
import kotlin.Double
import kotlin.Suppress
import kotlin.Unit

/**
 * Node that represents collision shape data in 2D space.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/113](https://godotengine.org/asset-library/asset/113)
 *
 * Editor facility for creating and editing collision shapes in 2D space. You can use this node to represent all sorts of collision shapes, for example, add this to an [godot.Area2D] to give it a detection shape, or add it to a [godot.PhysicsBody2D] to create a solid object. **IMPORTANT**: this is an Editor-only helper to create shapes, use [godot.CollisionObject2D.shapeOwnerGetShape] to get the actual shape.
 */
@GodotBaseType
public open class CollisionShape2D : Node2D() {
  /**
   * The actual shape owned by this collision shape.
   */
  public var shape: Shape2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONSHAPE2D_GET_SHAPE,
          OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as Shape2D?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONSHAPE2D_SET_SHAPE,
          NIL.ordinal)
    }

  /**
   * A disabled collision shape has no effect in the world. This property should be changed with [godot.Object.setDeferred].
   */
  public var disabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONSHAPE2D_IS_DISABLED,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONSHAPE2D_SET_DISABLED,
          NIL.ordinal)
    }

  /**
   * Sets whether this collision shape should only detect collision on one side (top or bottom).
   *
   * **Note:** This property has no effect if this [godot.CollisionShape2D] is a child of an [godot.Area2D] node.
   */
  public var oneWayCollision: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COLLISIONSHAPE2D_IS_ONE_WAY_COLLISION_ENABLED, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONSHAPE2D_SET_ONE_WAY_COLLISION,
          NIL.ordinal)
    }

  /**
   * The margin used for one-way collision (in pixels). Higher values will make the shape thicker, and work better for colliders that enter the shape at a high velocity.
   */
  public var oneWayCollisionMargin: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COLLISIONSHAPE2D_GET_ONE_WAY_COLLISION_MARGIN, DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COLLISIONSHAPE2D_SET_ONE_WAY_COLLISION_MARGIN, NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_COLLISIONSHAPE2D)
  }

  public companion object
}
