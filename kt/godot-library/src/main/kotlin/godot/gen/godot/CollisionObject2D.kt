// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.RID
import godot.core.TransferContext
import godot.core.Transform2D
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType._RID
import godot.signals.Signal0
import godot.signals.Signal3
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress

/**
 * Base node for 2D collision objects.
 *
 * CollisionObject2D is the base class for 2D physics objects. It can hold any number of 2D collision [godot.Shape2D]s. Each shape must be assigned to a *shape owner*. The CollisionObject2D can have any number of shape owners. Shape owners are not nodes and do not appear in the editor, but are accessible through code using the `shape_owner_*` methods.
 */
@GodotBaseType
open class CollisionObject2D : Node2D() {
  /**
   * Emitted when an input event occurs. Requires [inputPickable] to be `true` and at least one `collision_layer` bit to be set. See [_inputEvent] for details.
   */
  val inputEvent: Signal3<Node, InputEvent, Long> by signal("viewport", "event", "shape_idx")

  /**
   * Emitted when the mouse pointer enters any of this object's shapes. Requires [inputPickable] to be `true` and at least one `collision_layer` bit to be set.
   */
  val mouseEntered: Signal0 by signal()

  /**
   * Emitted when the mouse pointer exits all this object's shapes. Requires [inputPickable] to be `true` and at least one `collision_layer` bit to be set.
   */
  val mouseExited: Signal0 by signal()

  /**
   * If `true`, this object is pickable. A pickable object can detect the mouse pointer entering/leaving, and if the mouse is inside it, report input events. Requires at least one `collision_layer` bit to be set.
   */
  open var inputPickable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_GET_INPUT_PICKABLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SET_INPUT_PICKABLE, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_COLLISIONOBJECT2D)
  }

  /**
   * Accepts unhandled [godot.InputEvent]s. Requires [inputPickable] to be `true`. `shape_idx` is the child index of the clicked [godot.Shape2D]. Connect to the `input_event` signal to easily pick up these events.
   */
  open fun _inputEvent(
    viewport: Object,
    event: InputEvent,
    shapeIdx: Long
  ) {
  }

  /**
   * Creates a new shape owner for the given object. Returns `owner_id` of the new owner for future reference.
   */
  open fun createShapeOwner(owner: Object): Long {
    TransferContext.writeArguments(OBJECT to owner)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_CREATE_SHAPE_OWNER, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the object's [RID].
   */
  open fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_GET_RID, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the `one_way_collision_margin` of the shape owner identified by given `owner_id`.
   */
  open fun getShapeOwnerOneWayCollisionMargin(ownerId: Long): Double {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_GET_SHAPE_OWNER_ONE_WAY_COLLISION_MARGIN, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns an [godot.Array] of `owner_id` identifiers. You can use these ids in other methods that take `owner_id` as an argument.
   */
  open fun getShapeOwners(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_GET_SHAPE_OWNERS,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * If `true`, the shape owner and its shapes are disabled.
   */
  open fun isShapeOwnerDisabled(ownerId: Long): Boolean {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_IS_SHAPE_OWNER_DISABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if collisions for the shape owner originating from this [godot.CollisionObject2D] will not be reported to collided with [godot.CollisionObject2D]s.
   */
  open fun isShapeOwnerOneWayCollisionEnabled(ownerId: Long): Boolean {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_IS_SHAPE_OWNER_ONE_WAY_COLLISION_ENABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Removes the given shape owner.
   */
  open fun removeShapeOwner(ownerId: Long) {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_REMOVE_SHAPE_OWNER, NIL)
  }

  /**
   * Returns the `owner_id` of the given shape.
   */
  open fun shapeFindOwner(shapeIndex: Long): Long {
    TransferContext.writeArguments(LONG to shapeIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SHAPE_FIND_OWNER,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Adds a [godot.Shape2D] to the shape owner.
   */
  open fun shapeOwnerAddShape(ownerId: Long, shape: Shape2D) {
    TransferContext.writeArguments(LONG to ownerId, OBJECT to shape)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SHAPE_OWNER_ADD_SHAPE, NIL)
  }

  /**
   * Removes all shapes from the shape owner.
   */
  open fun shapeOwnerClearShapes(ownerId: Long) {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SHAPE_OWNER_CLEAR_SHAPES, NIL)
  }

  /**
   * Returns the parent object of the given shape owner.
   */
  open fun shapeOwnerGetOwner(ownerId: Long): Object? {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SHAPE_OWNER_GET_OWNER, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Object?
  }

  /**
   * Returns the [godot.Shape2D] with the given id from the given shape owner.
   */
  open fun shapeOwnerGetShape(ownerId: Long, shapeId: Long): Shape2D? {
    TransferContext.writeArguments(LONG to ownerId, LONG to shapeId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SHAPE_OWNER_GET_SHAPE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Shape2D?
  }

  /**
   * Returns the number of shapes the given shape owner contains.
   */
  open fun shapeOwnerGetShapeCount(ownerId: Long): Long {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SHAPE_OWNER_GET_SHAPE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the child index of the [godot.Shape2D] with the given id from the given shape owner.
   */
  open fun shapeOwnerGetShapeIndex(ownerId: Long, shapeId: Long): Long {
    TransferContext.writeArguments(LONG to ownerId, LONG to shapeId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SHAPE_OWNER_GET_SHAPE_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the shape owner's [godot.core.Transform2D].
   */
  open fun shapeOwnerGetTransform(ownerId: Long): Transform2D {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SHAPE_OWNER_GET_TRANSFORM, TRANSFORM2D)
    return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
  }

  /**
   * Removes a shape from the given shape owner.
   */
  open fun shapeOwnerRemoveShape(ownerId: Long, shapeId: Long) {
    TransferContext.writeArguments(LONG to ownerId, LONG to shapeId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SHAPE_OWNER_REMOVE_SHAPE, NIL)
  }

  /**
   * If `true`, disables the given shape owner.
   */
  open fun shapeOwnerSetDisabled(ownerId: Long, disabled: Boolean) {
    TransferContext.writeArguments(LONG to ownerId, BOOL to disabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SHAPE_OWNER_SET_DISABLED, NIL)
  }

  /**
   * If `enable` is `true`, collisions for the shape owner originating from this [godot.CollisionObject2D] will not be reported to collided with [godot.CollisionObject2D]s.
   */
  open fun shapeOwnerSetOneWayCollision(ownerId: Long, enable: Boolean) {
    TransferContext.writeArguments(LONG to ownerId, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SHAPE_OWNER_SET_ONE_WAY_COLLISION, NIL)
  }

  /**
   * Sets the `one_way_collision_margin` of the shape owner identified by given `owner_id` to `margin` pixels.
   */
  open fun shapeOwnerSetOneWayCollisionMargin(ownerId: Long, margin: Double) {
    TransferContext.writeArguments(LONG to ownerId, DOUBLE to margin)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SHAPE_OWNER_SET_ONE_WAY_COLLISION_MARGIN, NIL)
  }

  /**
   * Sets the [godot.core.Transform2D] of the given shape owner.
   */
  open fun shapeOwnerSetTransform(ownerId: Long, transform: Transform2D) {
    TransferContext.writeArguments(LONG to ownerId, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SHAPE_OWNER_SET_TRANSFORM, NIL)
  }
}
