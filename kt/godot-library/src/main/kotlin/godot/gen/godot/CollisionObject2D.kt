// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
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
import godot.signals.Signal1
import godot.signals.Signal3
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Base node for 2D collision objects.
 *
 * CollisionObject2D is the base class for 2D physics objects. It can hold any number of 2D collision [godot.Shape2D]s. Each shape must be assigned to a *shape owner*. The CollisionObject2D can have any number of shape owners. Shape owners are not nodes and do not appear in the editor, but are accessible through code using the `shape_owner_*` methods.
 */
@GodotBaseType
public open abstract class CollisionObject2D : Node2D() {
  /**
   * Emitted when the mouse pointer exits any of this object's shapes. `shape_idx` is the child index of the exited [godot.Shape2D]. Requires [inputPickable] to be `true` and at least one [collisionLayer] bit to be set.
   */
  public val mouseShapeExited: Signal1<Long> by signal("shapeIdx")

  /**
   * Emitted when the mouse pointer exits all this object's shapes. Requires [inputPickable] to be `true` and at least one [collisionLayer] bit to be set. Note that moving between different shapes within a single [godot.CollisionObject2D] won't cause this signal to be emitted.
   */
  public val mouseExited: Signal0 by signal()

  /**
   * Emitted when the mouse pointer enters any of this object's shapes or moves from one shape to another. `shape_idx` is the child index of the newly entered [godot.Shape2D]. Requires [inputPickable] to be `true` and at least one [collisionLayer] bit to be set.
   */
  public val mouseShapeEntered: Signal1<Long> by signal("shapeIdx")

  /**
   * Emitted when the mouse pointer enters any of this object's shapes. Requires [inputPickable] to be `true` and at least one [collisionLayer] bit to be set. Note that moving between different shapes within a single [godot.CollisionObject2D] won't cause this signal to be emitted.
   */
  public val mouseEntered: Signal0 by signal()

  /**
   * Emitted when an input event occurs. Requires [inputPickable] to be `true` and at least one `collision_layer` bit to be set. See [_inputEvent] for details.
   */
  public val inputEvent: Signal3<Node, InputEvent, Long> by signal("viewport", "event", "shapeIdx")

  /**
   * Defines the behavior in physics when [godot.Node.processMode] is set to [godot.Node.PROCESS_MODE_DISABLED]. See [enum DisableMode] for more details about the different modes.
   */
  public open var disableMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_GET_DISABLE_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SET_DISABLE_MODE, NIL)
    }

  /**
   * The physics layers this CollisionObject2D is in. Collision objects can exist in one or more of 32 different layers. See also [collisionMask].
   *
   * **Note:** Object A can detect a contact with object B only if object B is in any of the layers that object A scans. See [godot.Collision layers and masks]($DOCS_URL/tutorials/physics/physics_introduction.html#collision-layers-and-masks) in the documentation for more information.
   */
  public open var collisionLayer: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_GET_COLLISION_LAYER, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SET_COLLISION_LAYER, NIL)
    }

  /**
   * The physics layers this CollisionObject2D scans. Collision objects can scan one or more of 32 different layers. See also [collisionLayer].
   *
   * **Note:** Object A can detect a contact with object B only if object B is in any of the layers that object A scans. See [godot.Collision layers and masks]($DOCS_URL/tutorials/physics/physics_introduction.html#collision-layers-and-masks) in the documentation for more information.
   */
  public open var collisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_GET_COLLISION_MASK, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SET_COLLISION_MASK, NIL)
    }

  /**
   * If `true`, this object is pickable. A pickable object can detect the mouse pointer entering/leaving, and if the mouse is inside it, report input events. Requires at least one [collisionLayer] bit to be set.
   */
  public open var inputPickable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_IS_PICKABLE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SET_PICKABLE,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_COLLISIONOBJECT2D)
  }

  /**
   * Accepts unhandled [godot.InputEvent]s. Requires [inputPickable] to be `true`. `shape_idx` is the child index of the clicked [godot.Shape2D]. Connect to the `input_event` signal to easily pick up these events.
   */
  public open fun _inputEvent(
    viewport: Viewport,
    event: InputEvent,
    shapeIdx: Long
  ): Unit {
  }

  /**
   * Returns the object's [RID].
   */
  public open fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_GET_RID, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Based on `value`, enables or disables the specified layer in the [collisionLayer], given a `layer_number` between 1 and 32.
   */
  public open fun setCollisionLayerValue(layerNumber: Long, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber, BOOL to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SET_COLLISION_LAYER_VALUE, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [collisionLayer] is enabled, given a `layer_number` between 1 and 32.
   */
  public open fun getCollisionLayerValue(layerNumber: Long): Boolean {
    TransferContext.writeArguments(LONG to layerNumber)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_GET_COLLISION_LAYER_VALUE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Based on `value`, enables or disables the specified layer in the [collisionMask], given a `layer_number` between 1 and 32.
   */
  public open fun setCollisionMaskValue(layerNumber: Long, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber, BOOL to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SET_COLLISION_MASK_VALUE, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [collisionMask] is enabled, given a `layer_number` between 1 and 32.
   */
  public open fun getCollisionMaskValue(layerNumber: Long): Boolean {
    TransferContext.writeArguments(LONG to layerNumber)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_GET_COLLISION_MASK_VALUE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Creates a new shape owner for the given object. Returns `owner_id` of the new owner for future reference.
   */
  public open fun createShapeOwner(owner: Object): Long {
    TransferContext.writeArguments(OBJECT to owner)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_CREATE_SHAPE_OWNER, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Removes the given shape owner.
   */
  public open fun removeShapeOwner(ownerId: Long): Unit {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_REMOVE_SHAPE_OWNER, NIL)
  }

  /**
   * Returns an [godot.Array] of `owner_id` identifiers. You can use these ids in other methods that take `owner_id` as an argument.
   */
  public open fun getShapeOwners(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_GET_SHAPE_OWNERS,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Sets the [godot.core.Transform2D] of the given shape owner.
   */
  public open fun shapeOwnerSetTransform(ownerId: Long, transform: Transform2D): Unit {
    TransferContext.writeArguments(LONG to ownerId, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SHAPE_OWNER_SET_TRANSFORM, NIL)
  }

  /**
   * Returns the shape owner's [godot.core.Transform2D].
   */
  public open fun shapeOwnerGetTransform(ownerId: Long): Transform2D {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SHAPE_OWNER_GET_TRANSFORM, TRANSFORM2D)
    return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
  }

  /**
   * Returns the parent object of the given shape owner.
   */
  public open fun shapeOwnerGetOwner(ownerId: Long): Object? {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SHAPE_OWNER_GET_OWNER, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Object?
  }

  /**
   * If `true`, disables the given shape owner.
   */
  public open fun shapeOwnerSetDisabled(ownerId: Long, disabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to ownerId, BOOL to disabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SHAPE_OWNER_SET_DISABLED, NIL)
  }

  /**
   * If `true`, the shape owner and its shapes are disabled.
   */
  public open fun isShapeOwnerDisabled(ownerId: Long): Boolean {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_IS_SHAPE_OWNER_DISABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * If `enable` is `true`, collisions for the shape owner originating from this [godot.CollisionObject2D] will not be reported to collided with [godot.CollisionObject2D]s.
   */
  public open fun shapeOwnerSetOneWayCollision(ownerId: Long, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to ownerId, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SHAPE_OWNER_SET_ONE_WAY_COLLISION, NIL)
  }

  /**
   * Returns `true` if collisions for the shape owner originating from this [godot.CollisionObject2D] will not be reported to collided with [godot.CollisionObject2D]s.
   */
  public open fun isShapeOwnerOneWayCollisionEnabled(ownerId: Long): Boolean {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_IS_SHAPE_OWNER_ONE_WAY_COLLISION_ENABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the `one_way_collision_margin` of the shape owner identified by given `owner_id` to `margin` pixels.
   */
  public open fun shapeOwnerSetOneWayCollisionMargin(ownerId: Long, margin: Double): Unit {
    TransferContext.writeArguments(LONG to ownerId, DOUBLE to margin)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SHAPE_OWNER_SET_ONE_WAY_COLLISION_MARGIN, NIL)
  }

  /**
   * Returns the `one_way_collision_margin` of the shape owner identified by given `owner_id`.
   */
  public open fun getShapeOwnerOneWayCollisionMargin(ownerId: Long): Double {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_GET_SHAPE_OWNER_ONE_WAY_COLLISION_MARGIN, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Adds a [godot.Shape2D] to the shape owner.
   */
  public open fun shapeOwnerAddShape(ownerId: Long, shape: Shape2D): Unit {
    TransferContext.writeArguments(LONG to ownerId, OBJECT to shape)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SHAPE_OWNER_ADD_SHAPE, NIL)
  }

  /**
   * Returns the number of shapes the given shape owner contains.
   */
  public open fun shapeOwnerGetShapeCount(ownerId: Long): Long {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SHAPE_OWNER_GET_SHAPE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the [godot.Shape2D] with the given id from the given shape owner.
   */
  public open fun shapeOwnerGetShape(ownerId: Long, shapeId: Long): Shape2D? {
    TransferContext.writeArguments(LONG to ownerId, LONG to shapeId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SHAPE_OWNER_GET_SHAPE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Shape2D?
  }

  /**
   * Returns the child index of the [godot.Shape2D] with the given id from the given shape owner.
   */
  public open fun shapeOwnerGetShapeIndex(ownerId: Long, shapeId: Long): Long {
    TransferContext.writeArguments(LONG to ownerId, LONG to shapeId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SHAPE_OWNER_GET_SHAPE_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Removes a shape from the given shape owner.
   */
  public open fun shapeOwnerRemoveShape(ownerId: Long, shapeId: Long): Unit {
    TransferContext.writeArguments(LONG to ownerId, LONG to shapeId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SHAPE_OWNER_REMOVE_SHAPE, NIL)
  }

  /**
   * Removes all shapes from the shape owner.
   */
  public open fun shapeOwnerClearShapes(ownerId: Long): Unit {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SHAPE_OWNER_CLEAR_SHAPES, NIL)
  }

  /**
   * Returns the `owner_id` of the given shape.
   */
  public open fun shapeFindOwner(shapeIndex: Long): Long {
    TransferContext.writeArguments(LONG to shapeIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SHAPE_FIND_OWNER,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public enum class DisableMode(
    id: Long
  ) {
    /**
     * When [godot.Node.processMode] is set to [godot.Node.PROCESS_MODE_DISABLED], remove from the physics simulation to stop all physics interactions with this [godot.CollisionObject2D].
     *
     * Automatically re-added to the physics simulation when the [godot.Node] is processed again.
     */
    DISABLE_MODE_REMOVE(0),
    /**
     * When [godot.Node.processMode] is set to [godot.Node.PROCESS_MODE_DISABLED], make the body static. Doesn't affect [godot.Area2D]. [godot.PhysicsBody2D] can't be affected by forces or other bodies while static.
     *
     * Automatically set [godot.PhysicsBody2D] back to its original mode when the [godot.Node] is processed again.
     */
    DISABLE_MODE_MAKE_STATIC(1),
    /**
     * When [godot.Node.processMode] is set to [godot.Node.PROCESS_MODE_DISABLED], do not affect the physics simulation.
     */
    DISABLE_MODE_KEEP_ACTIVE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
