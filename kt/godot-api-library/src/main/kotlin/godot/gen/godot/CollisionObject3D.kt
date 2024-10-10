// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedInt32Array
import godot.core.RID
import godot.core.Signal0
import godot.core.Signal5
import godot.core.Transform3D
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_INT_32_ARRAY
import godot.core.VariantParser.TRANSFORM3D
import godot.core.VariantParser._RID
import godot.core.Vector3
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_COLLISIONOBJECT3D_INDEX: Int = 187

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
  public val inputEvent: Signal5<Node, InputEvent, Vector3, Vector3, Long> by Signal5

  /**
   * Emitted when the mouse pointer enters any of this object's shapes. Requires [inputRayPickable]
   * to be `true` and at least one [collisionLayer] bit to be set.
   * **Note:** Due to the lack of continuous collision detection, this signal may not be emitted in
   * the expected order if the mouse moves fast enough and the [CollisionObject3D]'s area is small.
   * This signal may also not be emitted if another [CollisionObject3D] is overlapping the
   * [CollisionObject3D] in question.
   */
  public val mouseEntered: Signal0 by Signal0

  /**
   * Emitted when the mouse pointer exits all this object's shapes. Requires [inputRayPickable] to
   * be `true` and at least one [collisionLayer] bit to be set.
   * **Note:** Due to the lack of continuous collision detection, this signal may not be emitted in
   * the expected order if the mouse moves fast enough and the [CollisionObject3D]'s area is small.
   * This signal may also not be emitted if another [CollisionObject3D] is overlapping the
   * [CollisionObject3D] in question.
   */
  public val mouseExited: Signal0 by Signal0

  /**
   * Defines the behavior in physics when [Node.processMode] is set to [Node.PROCESS_MODE_DISABLED].
   * See [DisableMode] for more details about the different modes.
   */
  public final inline var disableMode: DisableMode
    @JvmName("disableModeProperty")
    get() = getDisableMode()
    @JvmName("disableModeProperty")
    set(`value`) {
      setDisableMode(value)
    }

  /**
   * The physics layers this CollisionObject3D **is in**. Collision objects can exist in one or more
   * of 32 different layers. See also [collisionMask].
   * **Note:** Object A can detect a contact with object B only if object B is in any of the layers
   * that object A scans. See
   * [url=$DOCS_URL/tutorials/physics/physics_introduction.html#collision-layers-and-masks]Collision
   * layers and masks[/url] in the documentation for more information.
   */
  public final inline var collisionLayer: Long
    @JvmName("collisionLayerProperty")
    get() = getCollisionLayer()
    @JvmName("collisionLayerProperty")
    set(`value`) {
      setCollisionLayer(value)
    }

  /**
   * The physics layers this CollisionObject3D **scans**. Collision objects can scan one or more of
   * 32 different layers. See also [collisionLayer].
   * **Note:** Object A can detect a contact with object B only if object B is in any of the layers
   * that object A scans. See
   * [url=$DOCS_URL/tutorials/physics/physics_introduction.html#collision-layers-and-masks]Collision
   * layers and masks[/url] in the documentation for more information.
   */
  public final inline var collisionMask: Long
    @JvmName("collisionMaskProperty")
    get() = getCollisionMask()
    @JvmName("collisionMaskProperty")
    set(`value`) {
      setCollisionMask(value)
    }

  /**
   * The priority used to solve colliding when occurring penetration. The higher the priority is,
   * the lower the penetration into the object will be. This can for example be used to prevent the
   * player from breaking through the boundaries of a level.
   */
  public final inline var collisionPriority: Float
    @JvmName("collisionPriorityProperty")
    get() = getCollisionPriority()
    @JvmName("collisionPriorityProperty")
    set(`value`) {
      setCollisionPriority(value)
    }

  /**
   * If `true`, this object is pickable. A pickable object can detect the mouse pointer
   * entering/leaving, and if the mouse is inside it, report input events. Requires at least one
   * [collisionLayer] bit to be set.
   */
  public final inline var inputRayPickable: Boolean
    @JvmName("inputRayPickableProperty")
    get() = isRayPickable()
    @JvmName("inputRayPickableProperty")
    set(`value`) {
      setRayPickable(value)
    }

  /**
   * If `true`, the [CollisionObject3D] will continue to receive input events as the mouse is
   * dragged across its shapes.
   */
  public final inline var inputCaptureOnDrag: Boolean
    @JvmName("inputCaptureOnDragProperty")
    get() = getCaptureInputOnDrag()
    @JvmName("inputCaptureOnDragProperty")
    set(`value`) {
      setCaptureInputOnDrag(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_COLLISIONOBJECT3D_INDEX, scriptIndex)
  }

  /**
   * Receives unhandled [InputEvent]s. [eventPosition] is the location in world space of the mouse
   * pointer on the surface of the shape with index [shapeIdx] and [normal] is the normal vector of the
   * surface at that point. Connect to the [signal input_event] signal to easily pick up these events.
   * **Note:** [_inputEvent] requires [inputRayPickable] to be `true` and at least one
   * [collisionLayer] bit to be set.
   */
  public open fun _inputEvent(
    camera: Camera3D?,
    event: InputEvent?,
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

  public final fun setCollisionLayer(layer: Long): Unit {
    Internals.writeArguments(LONG to layer)
    Internals.callMethod(rawPtr, MethodBindings.setCollisionLayerPtr, NIL)
  }

  public final fun getCollisionLayer(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCollisionLayerPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  public final fun setCollisionMask(mask: Long): Unit {
    Internals.writeArguments(LONG to mask)
    Internals.callMethod(rawPtr, MethodBindings.setCollisionMaskPtr, NIL)
  }

  public final fun getCollisionMask(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCollisionMaskPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [collisionLayer], given a
   * [layerNumber] between 1 and 32.
   */
  public final fun setCollisionLayerValue(layerNumber: Int, `value`: Boolean): Unit {
    Internals.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    Internals.callMethod(rawPtr, MethodBindings.setCollisionLayerValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [collisionLayer] is enabled, given a
   * [layerNumber] between 1 and 32.
   */
  public final fun getCollisionLayerValue(layerNumber: Int): Boolean {
    Internals.writeArguments(LONG to layerNumber.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getCollisionLayerValuePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [collisionMask], given a
   * [layerNumber] between 1 and 32.
   */
  public final fun setCollisionMaskValue(layerNumber: Int, `value`: Boolean): Unit {
    Internals.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    Internals.callMethod(rawPtr, MethodBindings.setCollisionMaskValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [collisionMask] is enabled, given a
   * [layerNumber] between 1 and 32.
   */
  public final fun getCollisionMaskValue(layerNumber: Int): Boolean {
    Internals.writeArguments(LONG to layerNumber.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getCollisionMaskValuePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCollisionPriority(priority: Float): Unit {
    Internals.writeArguments(DOUBLE to priority.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setCollisionPriorityPtr, NIL)
  }

  public final fun getCollisionPriority(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCollisionPriorityPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDisableMode(mode: DisableMode): Unit {
    Internals.writeArguments(LONG to mode.id)
    Internals.callMethod(rawPtr, MethodBindings.setDisableModePtr, NIL)
  }

  public final fun getDisableMode(): DisableMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDisableModePtr, LONG)
    return CollisionObject3D.DisableMode.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setRayPickable(rayPickable: Boolean): Unit {
    Internals.writeArguments(BOOL to rayPickable)
    Internals.callMethod(rawPtr, MethodBindings.setRayPickablePtr, NIL)
  }

  public final fun isRayPickable(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isRayPickablePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCaptureInputOnDrag(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setCaptureInputOnDragPtr, NIL)
  }

  public final fun getCaptureInputOnDrag(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCaptureInputOnDragPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the object's [RID].
   */
  public final fun getRid(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRidPtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  /**
   * Creates a new shape owner for the given object. Returns `owner_id` of the new owner for future
   * reference.
   */
  public final fun createShapeOwner(owner: Object?): Long {
    Internals.writeArguments(OBJECT to owner)
    Internals.callMethod(rawPtr, MethodBindings.createShapeOwnerPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Removes the given shape owner.
   */
  public final fun removeShapeOwner(ownerId: Long): Unit {
    Internals.writeArguments(LONG to ownerId)
    Internals.callMethod(rawPtr, MethodBindings.removeShapeOwnerPtr, NIL)
  }

  /**
   * Returns an [Array] of `owner_id` identifiers. You can use these ids in other methods that take
   * `owner_id` as an argument.
   */
  public final fun getShapeOwners(): PackedInt32Array {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getShapeOwnersPtr, PACKED_INT_32_ARRAY)
    return (Internals.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  /**
   * Sets the [Transform3D] of the given shape owner.
   */
  public final fun shapeOwnerSetTransform(ownerId: Long, transform: Transform3D): Unit {
    Internals.writeArguments(LONG to ownerId, TRANSFORM3D to transform)
    Internals.callMethod(rawPtr, MethodBindings.shapeOwnerSetTransformPtr, NIL)
  }

  /**
   * Returns the shape owner's [Transform3D].
   */
  public final fun shapeOwnerGetTransform(ownerId: Long): Transform3D {
    Internals.writeArguments(LONG to ownerId)
    Internals.callMethod(rawPtr, MethodBindings.shapeOwnerGetTransformPtr, TRANSFORM3D)
    return (Internals.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  /**
   * Returns the parent object of the given shape owner.
   */
  public final fun shapeOwnerGetOwner(ownerId: Long): Object? {
    Internals.writeArguments(LONG to ownerId)
    Internals.callMethod(rawPtr, MethodBindings.shapeOwnerGetOwnerPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Object?)
  }

  /**
   * If `true`, disables the given shape owner.
   */
  public final fun shapeOwnerSetDisabled(ownerId: Long, disabled: Boolean): Unit {
    Internals.writeArguments(LONG to ownerId, BOOL to disabled)
    Internals.callMethod(rawPtr, MethodBindings.shapeOwnerSetDisabledPtr, NIL)
  }

  /**
   * If `true`, the shape owner and its shapes are disabled.
   */
  public final fun isShapeOwnerDisabled(ownerId: Long): Boolean {
    Internals.writeArguments(LONG to ownerId)
    Internals.callMethod(rawPtr, MethodBindings.isShapeOwnerDisabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Adds a [Shape3D] to the shape owner.
   */
  public final fun shapeOwnerAddShape(ownerId: Long, shape: Shape3D?): Unit {
    Internals.writeArguments(LONG to ownerId, OBJECT to shape)
    Internals.callMethod(rawPtr, MethodBindings.shapeOwnerAddShapePtr, NIL)
  }

  /**
   * Returns the number of shapes the given shape owner contains.
   */
  public final fun shapeOwnerGetShapeCount(ownerId: Long): Int {
    Internals.writeArguments(LONG to ownerId)
    Internals.callMethod(rawPtr, MethodBindings.shapeOwnerGetShapeCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the [Shape3D] with the given ID from the given shape owner.
   */
  public final fun shapeOwnerGetShape(ownerId: Long, shapeId: Int): Shape3D? {
    Internals.writeArguments(LONG to ownerId, LONG to shapeId.toLong())
    Internals.callMethod(rawPtr, MethodBindings.shapeOwnerGetShapePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Shape3D?)
  }

  /**
   * Returns the child index of the [Shape3D] with the given ID from the given shape owner.
   */
  public final fun shapeOwnerGetShapeIndex(ownerId: Long, shapeId: Int): Int {
    Internals.writeArguments(LONG to ownerId, LONG to shapeId.toLong())
    Internals.callMethod(rawPtr, MethodBindings.shapeOwnerGetShapeIndexPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Removes a shape from the given shape owner.
   */
  public final fun shapeOwnerRemoveShape(ownerId: Long, shapeId: Int): Unit {
    Internals.writeArguments(LONG to ownerId, LONG to shapeId.toLong())
    Internals.callMethod(rawPtr, MethodBindings.shapeOwnerRemoveShapePtr, NIL)
  }

  /**
   * Removes all shapes from the shape owner.
   */
  public final fun shapeOwnerClearShapes(ownerId: Long): Unit {
    Internals.writeArguments(LONG to ownerId)
    Internals.callMethod(rawPtr, MethodBindings.shapeOwnerClearShapesPtr, NIL)
  }

  /**
   * Returns the `owner_id` of the given shape.
   */
  public final fun shapeFindOwner(shapeIndex: Int): Long {
    Internals.writeArguments(LONG to shapeIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.shapeFindOwnerPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
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
        Internals.getMethodBindPtr("CollisionObject3D", "set_collision_layer", 1286410249)

    public val getCollisionLayerPtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionObject3D", "get_collision_layer", 3905245786)

    public val setCollisionMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionObject3D", "set_collision_mask", 1286410249)

    public val getCollisionMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionObject3D", "get_collision_mask", 3905245786)

    public val setCollisionLayerValuePtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionObject3D", "set_collision_layer_value", 300928843)

    public val getCollisionLayerValuePtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionObject3D", "get_collision_layer_value", 1116898809)

    public val setCollisionMaskValuePtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionObject3D", "set_collision_mask_value", 300928843)

    public val getCollisionMaskValuePtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionObject3D", "get_collision_mask_value", 1116898809)

    public val setCollisionPriorityPtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionObject3D", "set_collision_priority", 373806689)

    public val getCollisionPriorityPtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionObject3D", "get_collision_priority", 1740695150)

    public val setDisableModePtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionObject3D", "set_disable_mode", 1623620376)

    public val getDisableModePtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionObject3D", "get_disable_mode", 410164780)

    public val setRayPickablePtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionObject3D", "set_ray_pickable", 2586408642)

    public val isRayPickablePtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionObject3D", "is_ray_pickable", 36873697)

    public val setCaptureInputOnDragPtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionObject3D", "set_capture_input_on_drag", 2586408642)

    public val getCaptureInputOnDragPtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionObject3D", "get_capture_input_on_drag", 36873697)

    public val getRidPtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionObject3D", "get_rid", 2944877500)

    public val createShapeOwnerPtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionObject3D", "create_shape_owner", 3429307534)

    public val removeShapeOwnerPtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionObject3D", "remove_shape_owner", 1286410249)

    public val getShapeOwnersPtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionObject3D", "get_shape_owners", 969006518)

    public val shapeOwnerSetTransformPtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionObject3D", "shape_owner_set_transform", 3616898986)

    public val shapeOwnerGetTransformPtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionObject3D", "shape_owner_get_transform", 1965739696)

    public val shapeOwnerGetOwnerPtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionObject3D", "shape_owner_get_owner", 3332903315)

    public val shapeOwnerSetDisabledPtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionObject3D", "shape_owner_set_disabled", 300928843)

    public val isShapeOwnerDisabledPtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionObject3D", "is_shape_owner_disabled", 1116898809)

    public val shapeOwnerAddShapePtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionObject3D", "shape_owner_add_shape", 2566676345)

    public val shapeOwnerGetShapeCountPtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionObject3D", "shape_owner_get_shape_count", 923996154)

    public val shapeOwnerGetShapePtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionObject3D", "shape_owner_get_shape", 4015519174)

    public val shapeOwnerGetShapeIndexPtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionObject3D", "shape_owner_get_shape_index", 3175239445)

    public val shapeOwnerRemoveShapePtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionObject3D", "shape_owner_remove_shape", 3937882851)

    public val shapeOwnerClearShapesPtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionObject3D", "shape_owner_clear_shapes", 1286410249)

    public val shapeFindOwnerPtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionObject3D", "shape_find_owner", 923996154)
  }
}
