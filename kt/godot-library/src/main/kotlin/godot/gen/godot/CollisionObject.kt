// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.RID
import godot.core.TransferContext
import godot.core.Transform
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.TRANSFORM
import godot.core.VariantType._RID
import godot.core.Vector3
import godot.signals.Signal0
import godot.signals.Signal5
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress

/**
 * Base node for collision objects.
 *
 * CollisionObject is the base class for physics objects. It can hold any number of collision [godot.Shape]s. Each shape must be assigned to a *shape owner*. The CollisionObject can have any number of shape owners. Shape owners are not nodes and do not appear in the editor, but are accessible through code using the `shape_owner_*` methods.
 */
@GodotBaseType
open class CollisionObject : Spatial() {
  /**
   * Emitted when [_inputEvent] receives an event. See its description for details.
   */
  val inputEvent: Signal5<Node, InputEvent, Vector3, Vector3, Long> by signal("camera", "event",
      "click_position", "click_normal", "shape_idx")

  /**
   * Emitted when the mouse pointer enters any of this object's shapes.
   */
  val mouseEntered: Signal0 by signal()

  /**
   * Emitted when the mouse pointer exits all this object's shapes.
   */
  val mouseExited: Signal0 by signal()

  /**
   * If `true`, the [godot.CollisionObject] will continue to receive input events as the mouse is dragged across its shapes.
   */
  open var inputCaptureOnDrag: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_GET_INPUT_CAPTURE_ON_DRAG, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SET_INPUT_CAPTURE_ON_DRAG, NIL)
    }

  /**
   * If `true`, the [godot.CollisionObject]'s shapes will respond to [godot.RayCast]s.
   */
  open var inputRayPickable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_GET_INPUT_RAY_PICKABLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SET_INPUT_RAY_PICKABLE, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_COLLISIONOBJECT)
  }

  /**
   * Accepts unhandled [godot.InputEvent]s. `click_position` is the clicked location in world space and `click_normal` is the normal vector extending from the clicked surface of the [godot.Shape] at `shape_idx`. Connect to the `input_event` signal to easily pick up these events.
   */
  open fun _inputEvent(
    camera: Object,
    event: InputEvent,
    clickPosition: Vector3,
    clickNormal: Vector3,
    shapeIdx: Long
  ) {
  }

  open fun _shapeChanged(shape: Shape) {
  }

  open fun _updateDebugShapes() {
  }

  /**
   * Creates a new shape owner for the given object. Returns `owner_id` of the new owner for future reference.
   */
  open fun createShapeOwner(owner: Object): Long {
    TransferContext.writeArguments(OBJECT to owner)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_CREATE_SHAPE_OWNER,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the object's [RID].
   */
  open fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_GET_RID, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns an [godot.Array] of `owner_id` identifiers. You can use these ids in other methods that take `owner_id` as an argument.
   */
  open fun getShapeOwners(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_GET_SHAPE_OWNERS,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * If `true`, the shape owner and its shapes are disabled.
   */
  open fun isShapeOwnerDisabled(ownerId: Long): Boolean {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_IS_SHAPE_OWNER_DISABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Removes the given shape owner.
   */
  open fun removeShapeOwner(ownerId: Long) {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_REMOVE_SHAPE_OWNER,
        NIL)
  }

  /**
   * Returns the `owner_id` of the given shape.
   */
  open fun shapeFindOwner(shapeIndex: Long): Long {
    TransferContext.writeArguments(LONG to shapeIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SHAPE_FIND_OWNER,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Adds a [godot.Shape] to the shape owner.
   */
  open fun shapeOwnerAddShape(ownerId: Long, shape: Shape) {
    TransferContext.writeArguments(LONG to ownerId, OBJECT to shape)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SHAPE_OWNER_ADD_SHAPE, NIL)
  }

  /**
   * Removes all shapes from the shape owner.
   */
  open fun shapeOwnerClearShapes(ownerId: Long) {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SHAPE_OWNER_CLEAR_SHAPES, NIL)
  }

  /**
   * Returns the parent object of the given shape owner.
   */
  open fun shapeOwnerGetOwner(ownerId: Long): Object? {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SHAPE_OWNER_GET_OWNER, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Object?
  }

  /**
   * Returns the [godot.Shape] with the given id from the given shape owner.
   */
  open fun shapeOwnerGetShape(ownerId: Long, shapeId: Long): Shape? {
    TransferContext.writeArguments(LONG to ownerId, LONG to shapeId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SHAPE_OWNER_GET_SHAPE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Shape?
  }

  /**
   * Returns the number of shapes the given shape owner contains.
   */
  open fun shapeOwnerGetShapeCount(ownerId: Long): Long {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SHAPE_OWNER_GET_SHAPE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the child index of the [godot.Shape] with the given id from the given shape owner.
   */
  open fun shapeOwnerGetShapeIndex(ownerId: Long, shapeId: Long): Long {
    TransferContext.writeArguments(LONG to ownerId, LONG to shapeId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SHAPE_OWNER_GET_SHAPE_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the shape owner's [godot.core.Transform].
   */
  open fun shapeOwnerGetTransform(ownerId: Long): Transform {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SHAPE_OWNER_GET_TRANSFORM, TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  /**
   * Removes a shape from the given shape owner.
   */
  open fun shapeOwnerRemoveShape(ownerId: Long, shapeId: Long) {
    TransferContext.writeArguments(LONG to ownerId, LONG to shapeId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SHAPE_OWNER_REMOVE_SHAPE, NIL)
  }

  /**
   * If `true`, disables the given shape owner.
   */
  open fun shapeOwnerSetDisabled(ownerId: Long, disabled: Boolean) {
    TransferContext.writeArguments(LONG to ownerId, BOOL to disabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SHAPE_OWNER_SET_DISABLED, NIL)
  }

  /**
   * Sets the [godot.core.Transform] of the given shape owner.
   */
  open fun shapeOwnerSetTransform(ownerId: Long, transform: Transform) {
    TransferContext.writeArguments(LONG to ownerId, TRANSFORM to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SHAPE_OWNER_SET_TRANSFORM, NIL)
  }
}
