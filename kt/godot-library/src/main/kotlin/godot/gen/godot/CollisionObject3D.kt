// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedInt32Array
import godot.core.RID
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType._RID
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal5
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Abstract base class for 3D physics objects. [CollisionObject3D] can hold any number of [Shape3D]s
 * for collision. Each shape must be assigned to a *shape owner*. Shape owners are not nodes and do not
 * appear in the editor, but are accessible through code using the `shape_owner_*` methods.
 * **Warning:** With a non-uniform scale, this node will likely not behave as expected. It is
 * advised to keep its scale the same on all axes and adjust its collision shape(s) instead.
 */
@GodotBaseType
public open class CollisionObject3D internal constructor() : Node3D() {
  /**
   * Emitted when the object receives an unhandled [InputEvent]. [eventPosition] is the location in
   * world space of the mouse pointer on the surface of the shape with index [shapeIdx] and [normal] is
   * the normal vector of the surface at that point.
   */
  public val inputEvent: Signal5<Node, InputEvent, Vector3, Vector3, Long> by signal("camera",
      "event", "eventPosition", "normal", "shapeIdx")

  /**
   * Emitted when the mouse pointer enters any of this object's shapes. Requires [inputRayPickable]
   * to be `true` and at least one [collisionLayer] bit to be set.
   * **Note:** Due to the lack of continuous collision detection, this signal may not be emitted in
   * the expected order if the mouse moves fast enough and the [CollisionObject3D]'s area is small.
   * This signal may also not be emitted if another [CollisionObject3D] is overlapping the
   * [CollisionObject3D] in question.
   */
  public val mouseEntered: Signal0 by signal()

  /**
   * Emitted when the mouse pointer exits all this object's shapes. Requires [inputRayPickable] to
   * be `true` and at least one [collisionLayer] bit to be set.
   * **Note:** Due to the lack of continuous collision detection, this signal may not be emitted in
   * the expected order if the mouse moves fast enough and the [CollisionObject3D]'s area is small.
   * This signal may also not be emitted if another [CollisionObject3D] is overlapping the
   * [CollisionObject3D] in question.
   */
  public val mouseExited: Signal0 by signal()

  /**
   * Defines the behavior in physics when [Node.processMode] is set to [Node.PROCESS_MODE_DISABLED].
   * See [DisableMode] for more details about the different modes.
   */
  public var disableMode: DisableMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDisableModePtr, LONG)
      return CollisionObject3D.DisableMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDisableModePtr, NIL)
    }

  /**
   * The physics layers this CollisionObject3D **is in**. Collision objects can exist in one or more
   * of 32 different layers. See also [collisionMask].
   * **Note:** Object A can detect a contact with object B only if object B is in any of the layers
   * that object A scans. See
   * [url=$DOCS_URL/tutorials/physics/physics_introduction.html#collision-layers-and-masks]Collision
   * layers and masks[/url] in the documentation for more information.
   */
  public var collisionLayer: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCollisionLayerPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCollisionLayerPtr, NIL)
    }

  /**
   * The physics layers this CollisionObject3D **scans**. Collision objects can scan one or more of
   * 32 different layers. See also [collisionLayer].
   * **Note:** Object A can detect a contact with object B only if object B is in any of the layers
   * that object A scans. See
   * [url=$DOCS_URL/tutorials/physics/physics_introduction.html#collision-layers-and-masks]Collision
   * layers and masks[/url] in the documentation for more information.
   */
  public var collisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCollisionMaskPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCollisionMaskPtr, NIL)
    }

  /**
   * The priority used to solve colliding when occurring penetration. The higher the priority is,
   * the lower the penetration into the object will be. This can for example be used to prevent the
   * player from breaking through the boundaries of a level.
   */
  public var collisionPriority: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCollisionPriorityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setCollisionPriorityPtr, NIL)
    }

  /**
   * If `true`, this object is pickable. A pickable object can detect the mouse pointer
   * entering/leaving, and if the mouse is inside it, report input events. Requires at least one
   * [collisionLayer] bit to be set.
   */
  public var inputRayPickable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isRayPickablePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRayPickablePtr, NIL)
    }

  /**
   * If `true`, the [CollisionObject3D] will continue to receive input events as the mouse is
   * dragged across its shapes.
   */
  public var inputCaptureOnDrag: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCaptureInputOnDragPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCaptureInputOnDragPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_COLLISIONOBJECT3D, scriptIndex)
  }

  /**
   * Receives unhandled [InputEvent]s. [eventPosition] is the location in world space of the mouse
   * pointer on the surface of the shape with index [shapeIdx] and [normal] is the normal vector of the
   * surface at that point. Connect to the [signal input_event] signal to easily pick up these events.
   * **Note:** [_inputEvent] requires [inputRayPickable] to be `true` and at least one
   * [collisionLayer] bit to be set.
   */
  public open fun _inputEvent(
    camera: Camera3D,
    event: InputEvent,
    eventPosition: Vector3,
    normal: Vector3,
    shapeIdx: Int,
  ): Unit {
  }

  /**
   * Called when the mouse pointer enters any of this object's shapes. Requires [inputRayPickable]
   * to be `true` and at least one [collisionLayer] bit to be set. Note that moving between different
   * shapes within a single [CollisionObject3D] won't cause this function to be called.
   */
  public open fun _mouseEnter(): Unit {
  }

  /**
   * Called when the mouse pointer exits all this object's shapes. Requires [inputRayPickable] to be
   * `true` and at least one [collisionLayer] bit to be set. Note that moving between different shapes
   * within a single [CollisionObject3D] won't cause this function to be called.
   */
  public open fun _mouseExit(): Unit {
  }

  /**
   * Based on [value], enables or disables the specified layer in the [collisionLayer], given a
   * [layerNumber] between 1 and 32.
   */
  public fun setCollisionLayerValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setCollisionLayerValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [collisionLayer] is enabled, given a
   * [layerNumber] between 1 and 32.
   */
  public fun getCollisionLayerValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionLayerValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [collisionMask], given a
   * [layerNumber] between 1 and 32.
   */
  public fun setCollisionMaskValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setCollisionMaskValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [collisionMask] is enabled, given a
   * [layerNumber] between 1 and 32.
   */
  public fun getCollisionMaskValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionMaskValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the object's [RID].
   */
  public fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Creates a new shape owner for the given object. Returns `owner_id` of the new owner for future
   * reference.
   */
  public fun createShapeOwner(owner: Object): Long {
    TransferContext.writeArguments(OBJECT to owner)
    TransferContext.callMethod(rawPtr, MethodBindings.createShapeOwnerPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Removes the given shape owner.
   */
  public fun removeShapeOwner(ownerId: Long): Unit {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr, MethodBindings.removeShapeOwnerPtr, NIL)
  }

  /**
   * Returns an [Array] of `owner_id` identifiers. You can use these ids in other methods that take
   * `owner_id` as an argument.
   */
  public fun getShapeOwners(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getShapeOwnersPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Sets the [Transform3D] of the given shape owner.
   */
  public fun shapeOwnerSetTransform(ownerId: Long, transform: Transform3D): Unit {
    TransferContext.writeArguments(LONG to ownerId, TRANSFORM3D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.shapeOwnerSetTransformPtr, NIL)
  }

  /**
   * Returns the shape owner's [Transform3D].
   */
  public fun shapeOwnerGetTransform(ownerId: Long): Transform3D {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr, MethodBindings.shapeOwnerGetTransformPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
  }

  /**
   * Returns the parent object of the given shape owner.
   */
  public fun shapeOwnerGetOwner(ownerId: Long): Object? {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr, MethodBindings.shapeOwnerGetOwnerPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Object?)
  }

  /**
   * If `true`, disables the given shape owner.
   */
  public fun shapeOwnerSetDisabled(ownerId: Long, disabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to ownerId, BOOL to disabled)
    TransferContext.callMethod(rawPtr, MethodBindings.shapeOwnerSetDisabledPtr, NIL)
  }

  /**
   * If `true`, the shape owner and its shapes are disabled.
   */
  public fun isShapeOwnerDisabled(ownerId: Long): Boolean {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr, MethodBindings.isShapeOwnerDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Adds a [Shape3D] to the shape owner.
   */
  public fun shapeOwnerAddShape(ownerId: Long, shape: Shape3D): Unit {
    TransferContext.writeArguments(LONG to ownerId, OBJECT to shape)
    TransferContext.callMethod(rawPtr, MethodBindings.shapeOwnerAddShapePtr, NIL)
  }

  /**
   * Returns the number of shapes the given shape owner contains.
   */
  public fun shapeOwnerGetShapeCount(ownerId: Long): Int {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr, MethodBindings.shapeOwnerGetShapeCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the [Shape3D] with the given ID from the given shape owner.
   */
  public fun shapeOwnerGetShape(ownerId: Long, shapeId: Int): Shape3D? {
    TransferContext.writeArguments(LONG to ownerId, LONG to shapeId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.shapeOwnerGetShapePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Shape3D?)
  }

  /**
   * Returns the child index of the [Shape3D] with the given ID from the given shape owner.
   */
  public fun shapeOwnerGetShapeIndex(ownerId: Long, shapeId: Int): Int {
    TransferContext.writeArguments(LONG to ownerId, LONG to shapeId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.shapeOwnerGetShapeIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Removes a shape from the given shape owner.
   */
  public fun shapeOwnerRemoveShape(ownerId: Long, shapeId: Int): Unit {
    TransferContext.writeArguments(LONG to ownerId, LONG to shapeId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.shapeOwnerRemoveShapePtr, NIL)
  }

  /**
   * Removes all shapes from the shape owner.
   */
  public fun shapeOwnerClearShapes(ownerId: Long): Unit {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr, MethodBindings.shapeOwnerClearShapesPtr, NIL)
  }

  /**
   * Returns the `owner_id` of the given shape.
   */
  public fun shapeFindOwner(shapeIndex: Int): Long {
    TransferContext.writeArguments(LONG to shapeIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.shapeFindOwnerPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  public enum class DisableMode(
    id: Long,
  ) {
    /**
     * When [Node.processMode] is set to [Node.PROCESS_MODE_DISABLED], remove from the physics
     * simulation to stop all physics interactions with this [CollisionObject3D].
     * Automatically re-added to the physics simulation when the [Node] is processed again.
     */
    DISABLE_MODE_REMOVE(0),
    /**
     * When [Node.processMode] is set to [Node.PROCESS_MODE_DISABLED], make the body static. Doesn't
     * affect [Area3D]. [PhysicsBody3D] can't be affected by forces or other bodies while static.
     * Automatically set [PhysicsBody3D] back to its original mode when the [Node] is processed
     * again.
     */
    DISABLE_MODE_MAKE_STATIC(1),
    /**
     * When [Node.processMode] is set to [Node.PROCESS_MODE_DISABLED], do not affect the physics
     * simulation.
     */
    DISABLE_MODE_KEEP_ACTIVE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DisableMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setCollisionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject3D", "set_collision_layer")

    public val getCollisionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject3D", "get_collision_layer")

    public val setCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject3D", "set_collision_mask")

    public val getCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject3D", "get_collision_mask")

    public val setCollisionLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject3D", "set_collision_layer_value")

    public val getCollisionLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject3D", "get_collision_layer_value")

    public val setCollisionMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject3D", "set_collision_mask_value")

    public val getCollisionMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject3D", "get_collision_mask_value")

    public val setCollisionPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject3D", "set_collision_priority")

    public val getCollisionPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject3D", "get_collision_priority")

    public val setDisableModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject3D", "set_disable_mode")

    public val getDisableModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject3D", "get_disable_mode")

    public val setRayPickablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject3D", "set_ray_pickable")

    public val isRayPickablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject3D", "is_ray_pickable")

    public val setCaptureInputOnDragPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject3D", "set_capture_input_on_drag")

    public val getCaptureInputOnDragPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject3D", "get_capture_input_on_drag")

    public val getRidPtr: VoidPtr = TypeManager.getMethodBindPtr("CollisionObject3D", "get_rid")

    public val createShapeOwnerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject3D", "create_shape_owner")

    public val removeShapeOwnerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject3D", "remove_shape_owner")

    public val getShapeOwnersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject3D", "get_shape_owners")

    public val shapeOwnerSetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject3D", "shape_owner_set_transform")

    public val shapeOwnerGetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject3D", "shape_owner_get_transform")

    public val shapeOwnerGetOwnerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject3D", "shape_owner_get_owner")

    public val shapeOwnerSetDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject3D", "shape_owner_set_disabled")

    public val isShapeOwnerDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject3D", "is_shape_owner_disabled")

    public val shapeOwnerAddShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject3D", "shape_owner_add_shape")

    public val shapeOwnerGetShapeCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject3D", "shape_owner_get_shape_count")

    public val shapeOwnerGetShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject3D", "shape_owner_get_shape")

    public val shapeOwnerGetShapeIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject3D", "shape_owner_get_shape_index")

    public val shapeOwnerRemoveShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject3D", "shape_owner_remove_shape")

    public val shapeOwnerClearShapesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject3D", "shape_owner_clear_shapes")

    public val shapeFindOwnerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject3D", "shape_find_owner")
  }
}
