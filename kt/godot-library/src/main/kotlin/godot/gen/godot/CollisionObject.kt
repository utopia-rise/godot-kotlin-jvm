// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
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
import kotlin.Unit

/**
 * Base node for collision objects.
 *
 * CollisionObject is the base class for physics objects. It can hold any number of collision [godot.Shape]s. Each shape must be assigned to a *shape owner*. The CollisionObject can have any number of shape owners. Shape owners are not nodes and do not appear in the editor, but are accessible through code using the `shape_owner_*` methods.
 */
@GodotBaseType
public open class CollisionObject : Spatial() {
  /**
   * Emitted when the object receives an unhandled [godot.InputEvent]. `position` is the location in world space of the mouse pointer on the surface of the shape with index `shape_idx` and `normal` is the normal vector of the surface at that point.
   */
  public val inputEvent: Signal5<Node, InputEvent, Vector3, Vector3, Long> by signal("camera",
      "event", "position", "normal", "shape_idx")

  /**
   * Emitted when the mouse pointer enters any of this object's shapes.
   */
  public val mouseEntered: Signal0 by signal()

  /**
   * Emitted when the mouse pointer exits all this object's shapes.
   */
  public val mouseExited: Signal0 by signal()

  /**
   * The physics layers this CollisionObject3D is in. Collision objects can exist in one or more of 32 different layers. See also [collisionMask].
   *
   * **Note:** A contact is detected if object A is in any of the layers that object B scans, or object B is in any layers that object A scans. See [godot.Collision layers and masks]($DOCS_URL/tutorials/physics/physics_introduction.html#collision-layers-and-masks) in the documentation for more information.
   */
  public open var collisionLayer: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_GET_COLLISION_LAYER, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SET_COLLISION_LAYER, NIL)
    }

  /**
   * The physics layers this CollisionObject3D scans. Collision objects can scan one or more of 32 different layers. See also [collisionLayer].
   *
   * **Note:** A contact is detected if object A is in any of the layers that object B scans, or object B is in any layers that object A scans. See [godot.Collision layers and masks]($DOCS_URL/tutorials/physics/physics_introduction.html#collision-layers-and-masks) in the documentation for more information.
   */
  public open var collisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_GET_COLLISION_MASK, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SET_COLLISION_MASK, NIL)
    }

  /**
   * If `true`, the [godot.CollisionObject] will continue to receive input events as the mouse is dragged across its shapes.
   */
  public open var inputCaptureOnDrag: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_GET_INPUT_CAPTURE_ON_DRAG, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SET_INPUT_CAPTURE_ON_DRAG, NIL)
    }

  /**
   * If `true`, this object is pickable. A pickable object can detect the mouse pointer entering/leaving, and if the mouse is inside it, report input events. Requires at least one [collisionLayer] bit to be set.
   */
  public open var inputRayPickable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_GET_INPUT_RAY_PICKABLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SET_INPUT_RAY_PICKABLE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_COLLISIONOBJECT)
  }

  /**
   * Receives unhandled [godot.InputEvent]s. `position` is the location in world space of the mouse pointer on the surface of the shape with index `shape_idx` and `normal` is the normal vector of the surface at that point. Connect to the [inputEvent] signal to easily pick up these events.
   */
  public open fun _inputEvent(
    camera: Object,
    event: InputEvent,
    position: Vector3,
    normal: Vector3,
    shapeIdx: Long
  ): Unit {
  }

  public open fun _shapeChanged(shape: Shape): Unit {
  }

  public open fun _updateDebugShapes(): Unit {
  }

  /**
   * Creates a new shape owner for the given object. Returns `owner_id` of the new owner for future reference.
   */
  public open fun createShapeOwner(owner: Object): Long {
    TransferContext.writeArguments(OBJECT to owner)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_CREATE_SHAPE_OWNER,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns whether or not the specified `bit` of the [collisionLayer] is set.
   */
  public open fun getCollisionLayerBit(bit: Long): Boolean {
    TransferContext.writeArguments(LONG to bit)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_GET_COLLISION_LAYER_BIT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns whether or not the specified `bit` of the [collisionMask] is set.
   */
  public open fun getCollisionMaskBit(bit: Long): Boolean {
    TransferContext.writeArguments(LONG to bit)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_GET_COLLISION_MASK_BIT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the object's [RID].
   */
  public open fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_GET_RID, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns an [godot.Array] of `owner_id` identifiers. You can use these ids in other methods that take `owner_id` as an argument.
   */
  public open fun getShapeOwners(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_GET_SHAPE_OWNERS,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * If `true`, the shape owner and its shapes are disabled.
   */
  public open fun isShapeOwnerDisabled(ownerId: Long): Boolean {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_IS_SHAPE_OWNER_DISABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Removes the given shape owner.
   */
  public open fun removeShapeOwner(ownerId: Long): Unit {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_REMOVE_SHAPE_OWNER,
        NIL)
  }

  /**
   * If `value` is `true`, sets the specified `bit` in the the [collisionLayer].
   *
   * If `value` is `false`, clears the specified `bit` in the the [collisionLayer].
   */
  public open fun setCollisionLayerBit(bit: Long, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to bit, BOOL to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SET_COLLISION_LAYER_BIT, NIL)
  }

  /**
   * If `value` is `true`, sets the specified `bit` in the the [collisionMask].
   *
   * If `value` is `false`, clears the specified `bit` in the the [collisionMask].
   */
  public open fun setCollisionMaskBit(bit: Long, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to bit, BOOL to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SET_COLLISION_MASK_BIT, NIL)
  }

  /**
   * Returns the `owner_id` of the given shape.
   */
  public open fun shapeFindOwner(shapeIndex: Long): Long {
    TransferContext.writeArguments(LONG to shapeIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SHAPE_FIND_OWNER,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Adds a [godot.Shape] to the shape owner.
   */
  public open fun shapeOwnerAddShape(ownerId: Long, shape: Shape): Unit {
    TransferContext.writeArguments(LONG to ownerId, OBJECT to shape)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SHAPE_OWNER_ADD_SHAPE, NIL)
  }

  /**
   * Removes all shapes from the shape owner.
   */
  public open fun shapeOwnerClearShapes(ownerId: Long): Unit {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SHAPE_OWNER_CLEAR_SHAPES, NIL)
  }

  /**
   * Returns the parent object of the given shape owner.
   */
  public open fun shapeOwnerGetOwner(ownerId: Long): Object? {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SHAPE_OWNER_GET_OWNER, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Object?
  }

  /**
   * Returns the [godot.Shape] with the given id from the given shape owner.
   */
  public open fun shapeOwnerGetShape(ownerId: Long, shapeId: Long): Shape? {
    TransferContext.writeArguments(LONG to ownerId, LONG to shapeId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SHAPE_OWNER_GET_SHAPE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Shape?
  }

  /**
   * Returns the number of shapes the given shape owner contains.
   */
  public open fun shapeOwnerGetShapeCount(ownerId: Long): Long {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SHAPE_OWNER_GET_SHAPE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the child index of the [godot.Shape] with the given id from the given shape owner.
   */
  public open fun shapeOwnerGetShapeIndex(ownerId: Long, shapeId: Long): Long {
    TransferContext.writeArguments(LONG to ownerId, LONG to shapeId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SHAPE_OWNER_GET_SHAPE_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the shape owner's [godot.core.Transform].
   */
  public open fun shapeOwnerGetTransform(ownerId: Long): Transform {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SHAPE_OWNER_GET_TRANSFORM, TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  /**
   * Removes a shape from the given shape owner.
   */
  public open fun shapeOwnerRemoveShape(ownerId: Long, shapeId: Long): Unit {
    TransferContext.writeArguments(LONG to ownerId, LONG to shapeId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SHAPE_OWNER_REMOVE_SHAPE, NIL)
  }

  /**
   * If `true`, disables the given shape owner.
   */
  public open fun shapeOwnerSetDisabled(ownerId: Long, disabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to ownerId, BOOL to disabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SHAPE_OWNER_SET_DISABLED, NIL)
  }

  /**
   * Sets the [godot.core.Transform] of the given shape owner.
   */
  public open fun shapeOwnerSetTransform(ownerId: Long, transform: Transform): Unit {
    TransferContext.writeArguments(LONG to ownerId, TRANSFORM to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SHAPE_OWNER_SET_TRANSFORM, NIL)
  }
}
