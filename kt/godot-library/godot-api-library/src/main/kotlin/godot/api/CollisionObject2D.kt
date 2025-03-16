// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.PackedInt32Array
import godot.core.RID
import godot.core.Signal0
import godot.core.Signal1
import godot.core.Signal3
import godot.core.Transform2D
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_INT_32_ARRAY
import godot.core.VariantParser.TRANSFORM2D
import godot.core.VariantParser._RID
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Abstract base class for 2D physics objects. [CollisionObject2D] can hold any number of [Shape2D]s
 * for collision. Each shape must be assigned to a *shape owner*. Shape owners are not nodes and do not
 * appear in the editor, but are accessible through code using the `shape_owner_*` methods.
 *
 * **Note:** Only collisions between objects within the same canvas ([Viewport] canvas or
 * [CanvasLayer]) are supported. The behavior of collisions between objects in different canvases is
 * undefined.
 */
@GodotBaseType
public open class CollisionObject2D internal constructor() : Node2D() {
  /**
   * Emitted when an input event occurs. Requires [inputPickable] to be `true` and at least one
   * [collisionLayer] bit to be set. See [_inputEvent] for details.
   */
  public val inputEvent: Signal3<Node, InputEvent, Long> by Signal3

  /**
   * Emitted when the mouse pointer enters any of this object's shapes. Requires [inputPickable] to
   * be `true` and at least one [collisionLayer] bit to be set. Note that moving between different
   * shapes within a single [CollisionObject2D] won't cause this signal to be emitted.
   *
   * **Note:** Due to the lack of continuous collision detection, this signal may not be emitted in
   * the expected order if the mouse moves fast enough and the [CollisionObject2D]'s area is small.
   * This signal may also not be emitted if another [CollisionObject2D] is overlapping the
   * [CollisionObject2D] in question.
   */
  public val mouseEntered: Signal0 by Signal0

  /**
   * Emitted when the mouse pointer exits all this object's shapes. Requires [inputPickable] to be
   * `true` and at least one [collisionLayer] bit to be set. Note that moving between different shapes
   * within a single [CollisionObject2D] won't cause this signal to be emitted.
   *
   * **Note:** Due to the lack of continuous collision detection, this signal may not be emitted in
   * the expected order if the mouse moves fast enough and the [CollisionObject2D]'s area is small.
   * This signal may also not be emitted if another [CollisionObject2D] is overlapping the
   * [CollisionObject2D] in question.
   */
  public val mouseExited: Signal0 by Signal0

  /**
   * Emitted when the mouse pointer enters any of this object's shapes or moves from one shape to
   * another. [shapeIdx] is the child index of the newly entered [Shape2D]. Requires [inputPickable] to
   * be `true` and at least one [collisionLayer] bit to be set.
   */
  public val mouseShapeEntered: Signal1<Long> by Signal1

  /**
   * Emitted when the mouse pointer exits any of this object's shapes. [shapeIdx] is the child index
   * of the exited [Shape2D]. Requires [inputPickable] to be `true` and at least one [collisionLayer]
   * bit to be set.
   */
  public val mouseShapeExited: Signal1<Long> by Signal1

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
   * The physics layers this CollisionObject2D is in. Collision objects can exist in one or more of
   * 32 different layers. See also [collisionMask].
   *
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
   * The physics layers this CollisionObject2D scans. Collision objects can scan one or more of 32
   * different layers. See also [collisionLayer].
   *
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
  public final inline var inputPickable: Boolean
    @JvmName("inputPickableProperty")
    get() = isPickable()
    @JvmName("inputPickableProperty")
    set(`value`) {
      setPickable(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(154, scriptIndex)
  }

  /**
   * Accepts unhandled [InputEvent]s. [shapeIdx] is the child index of the clicked [Shape2D].
   * Connect to [signal input_event] to easily pick up these events.
   *
   * **Note:** [_inputEvent] requires [inputPickable] to be `true` and at least one [collisionLayer]
   * bit to be set.
   */
  public open fun _inputEvent(
    viewport: Viewport?,
    event: InputEvent?,
    shapeIdx: Int,
  ): Unit {
    throw NotImplementedError("_inputEvent is not implemented for CollisionObject2D")
  }

  /**
   * Called when the mouse pointer enters any of this object's shapes. Requires [inputPickable] to
   * be `true` and at least one [collisionLayer] bit to be set. Note that moving between different
   * shapes within a single [CollisionObject2D] won't cause this function to be called.
   */
  public open fun _mouseEnter(): Unit {
    throw NotImplementedError("_mouseEnter is not implemented for CollisionObject2D")
  }

  /**
   * Called when the mouse pointer exits all this object's shapes. Requires [inputPickable] to be
   * `true` and at least one [collisionLayer] bit to be set. Note that moving between different shapes
   * within a single [CollisionObject2D] won't cause this function to be called.
   */
  public open fun _mouseExit(): Unit {
    throw NotImplementedError("_mouseExit is not implemented for CollisionObject2D")
  }

  /**
   * Called when the mouse pointer enters any of this object's shapes or moves from one shape to
   * another. [shapeIdx] is the child index of the newly entered [Shape2D]. Requires [inputPickable] to
   * be `true` and at least one [collisionLayer] bit to be called.
   */
  public open fun _mouseShapeEnter(shapeIdx: Int): Unit {
    throw NotImplementedError("_mouseShapeEnter is not implemented for CollisionObject2D")
  }

  /**
   * Called when the mouse pointer exits any of this object's shapes. [shapeIdx] is the child index
   * of the exited [Shape2D]. Requires [inputPickable] to be `true` and at least one [collisionLayer]
   * bit to be called.
   */
  public open fun _mouseShapeExit(shapeIdx: Int): Unit {
    throw NotImplementedError("_mouseShapeExit is not implemented for CollisionObject2D")
  }

  /**
   * Returns the object's [RID].
   */
  public final fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public final fun setCollisionLayer(layer: Long): Unit {
    TransferContext.writeArguments(LONG to layer)
    TransferContext.callMethod(ptr, MethodBindings.setCollisionLayerPtr, NIL)
  }

  public final fun getCollisionLayer(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCollisionLayerPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setCollisionMask(mask: Long): Unit {
    TransferContext.writeArguments(LONG to mask)
    TransferContext.callMethod(ptr, MethodBindings.setCollisionMaskPtr, NIL)
  }

  public final fun getCollisionMask(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCollisionMaskPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [collisionLayer], given a
   * [layerNumber] between 1 and 32.
   */
  public final fun setCollisionLayerValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(ptr, MethodBindings.setCollisionLayerValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [collisionLayer] is enabled, given a
   * [layerNumber] between 1 and 32.
   */
  public final fun getCollisionLayerValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getCollisionLayerValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [collisionMask], given a
   * [layerNumber] between 1 and 32.
   */
  public final fun setCollisionMaskValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(ptr, MethodBindings.setCollisionMaskValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [collisionMask] is enabled, given a
   * [layerNumber] between 1 and 32.
   */
  public final fun getCollisionMaskValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getCollisionMaskValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCollisionPriority(priority: Float): Unit {
    TransferContext.writeArguments(DOUBLE to priority.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setCollisionPriorityPtr, NIL)
  }

  public final fun getCollisionPriority(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCollisionPriorityPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDisableMode(mode: DisableMode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(ptr, MethodBindings.setDisableModePtr, NIL)
  }

  public final fun getDisableMode(): DisableMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDisableModePtr, LONG)
    return CollisionObject2D.DisableMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setPickable(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setPickablePtr, NIL)
  }

  public final fun isPickable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isPickablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Creates a new shape owner for the given object. Returns `owner_id` of the new owner for future
   * reference.
   */
  public final fun createShapeOwner(owner: Object?): Long {
    TransferContext.writeArguments(OBJECT to owner)
    TransferContext.callMethod(ptr, MethodBindings.createShapeOwnerPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Removes the given shape owner.
   */
  public final fun removeShapeOwner(ownerId: Long): Unit {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(ptr, MethodBindings.removeShapeOwnerPtr, NIL)
  }

  /**
   * Returns an [Array] of `owner_id` identifiers. You can use these ids in other methods that take
   * `owner_id` as an argument.
   */
  public final fun getShapeOwners(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getShapeOwnersPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  /**
   * Sets the [Transform2D] of the given shape owner.
   */
  public final fun shapeOwnerSetTransform(ownerId: Long, transform: Transform2D): Unit {
    TransferContext.writeArguments(LONG to ownerId, TRANSFORM2D to transform)
    TransferContext.callMethod(ptr, MethodBindings.shapeOwnerSetTransformPtr, NIL)
  }

  /**
   * Returns the shape owner's [Transform2D].
   */
  public final fun shapeOwnerGetTransform(ownerId: Long): Transform2D {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(ptr, MethodBindings.shapeOwnerGetTransformPtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D) as Transform2D)
  }

  /**
   * Returns the parent object of the given shape owner.
   */
  public final fun shapeOwnerGetOwner(ownerId: Long): Object? {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(ptr, MethodBindings.shapeOwnerGetOwnerPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Object?)
  }

  /**
   * If `true`, disables the given shape owner.
   */
  public final fun shapeOwnerSetDisabled(ownerId: Long, disabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to ownerId, BOOL to disabled)
    TransferContext.callMethod(ptr, MethodBindings.shapeOwnerSetDisabledPtr, NIL)
  }

  /**
   * If `true`, the shape owner and its shapes are disabled.
   */
  public final fun isShapeOwnerDisabled(ownerId: Long): Boolean {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(ptr, MethodBindings.isShapeOwnerDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If [enable] is `true`, collisions for the shape owner originating from this [CollisionObject2D]
   * will not be reported to collided with [CollisionObject2D]s.
   */
  public final fun shapeOwnerSetOneWayCollision(ownerId: Long, enable: Boolean): Unit {
    TransferContext.writeArguments(LONG to ownerId, BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.shapeOwnerSetOneWayCollisionPtr, NIL)
  }

  /**
   * Returns `true` if collisions for the shape owner originating from this [CollisionObject2D] will
   * not be reported to collided with [CollisionObject2D]s.
   */
  public final fun isShapeOwnerOneWayCollisionEnabled(ownerId: Long): Boolean {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(ptr, MethodBindings.isShapeOwnerOneWayCollisionEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the `one_way_collision_margin` of the shape owner identified by given [ownerId] to
   * [margin] pixels.
   */
  public final fun shapeOwnerSetOneWayCollisionMargin(ownerId: Long, margin: Float): Unit {
    TransferContext.writeArguments(LONG to ownerId, DOUBLE to margin.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.shapeOwnerSetOneWayCollisionMarginPtr, NIL)
  }

  /**
   * Returns the `one_way_collision_margin` of the shape owner identified by given [ownerId].
   */
  public final fun getShapeOwnerOneWayCollisionMargin(ownerId: Long): Float {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(ptr, MethodBindings.getShapeOwnerOneWayCollisionMarginPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Adds a [Shape2D] to the shape owner.
   */
  public final fun shapeOwnerAddShape(ownerId: Long, shape: Shape2D?): Unit {
    TransferContext.writeArguments(LONG to ownerId, OBJECT to shape)
    TransferContext.callMethod(ptr, MethodBindings.shapeOwnerAddShapePtr, NIL)
  }

  /**
   * Returns the number of shapes the given shape owner contains.
   */
  public final fun shapeOwnerGetShapeCount(ownerId: Long): Int {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(ptr, MethodBindings.shapeOwnerGetShapeCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the [Shape2D] with the given ID from the given shape owner.
   */
  public final fun shapeOwnerGetShape(ownerId: Long, shapeId: Int): Shape2D? {
    TransferContext.writeArguments(LONG to ownerId, LONG to shapeId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.shapeOwnerGetShapePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Shape2D?)
  }

  /**
   * Returns the child index of the [Shape2D] with the given ID from the given shape owner.
   */
  public final fun shapeOwnerGetShapeIndex(ownerId: Long, shapeId: Int): Int {
    TransferContext.writeArguments(LONG to ownerId, LONG to shapeId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.shapeOwnerGetShapeIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Removes a shape from the given shape owner.
   */
  public final fun shapeOwnerRemoveShape(ownerId: Long, shapeId: Int): Unit {
    TransferContext.writeArguments(LONG to ownerId, LONG to shapeId.toLong())
    TransferContext.callMethod(ptr, MethodBindings.shapeOwnerRemoveShapePtr, NIL)
  }

  /**
   * Removes all shapes from the shape owner.
   */
  public final fun shapeOwnerClearShapes(ownerId: Long): Unit {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(ptr, MethodBindings.shapeOwnerClearShapesPtr, NIL)
  }

  /**
   * Returns the `owner_id` of the given shape.
   */
  public final fun shapeFindOwner(shapeIndex: Int): Long {
    TransferContext.writeArguments(LONG to shapeIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.shapeFindOwnerPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class DisableMode(
    id: Long,
  ) {
    /**
     * When [Node.processMode] is set to [Node.PROCESS_MODE_DISABLED], remove from the physics
     * simulation to stop all physics interactions with this [CollisionObject2D].
     *
     * Automatically re-added to the physics simulation when the [Node] is processed again.
     */
    REMOVE(0),
    /**
     * When [Node.processMode] is set to [Node.PROCESS_MODE_DISABLED], make the body static. Doesn't
     * affect [Area2D]. [PhysicsBody2D] can't be affected by forces or other bodies while static.
     *
     * Automatically set [PhysicsBody2D] back to its original mode when the [Node] is processed
     * again.
     */
    MAKE_STATIC(1),
    /**
     * When [Node.processMode] is set to [Node.PROCESS_MODE_DISABLED], do not affect the physics
     * simulation.
     */
    KEEP_ACTIVE(2),
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

  public object MethodBindings {
    internal val getRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "get_rid", 2944877500)

    internal val setCollisionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "set_collision_layer", 1286410249)

    internal val getCollisionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "get_collision_layer", 3905245786)

    internal val setCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "set_collision_mask", 1286410249)

    internal val getCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "get_collision_mask", 3905245786)

    internal val setCollisionLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "set_collision_layer_value", 300928843)

    internal val getCollisionLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "get_collision_layer_value", 1116898809)

    internal val setCollisionMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "set_collision_mask_value", 300928843)

    internal val getCollisionMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "get_collision_mask_value", 1116898809)

    internal val setCollisionPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "set_collision_priority", 373806689)

    internal val getCollisionPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "get_collision_priority", 1740695150)

    internal val setDisableModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "set_disable_mode", 1919204045)

    internal val getDisableModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "get_disable_mode", 3172846349)

    internal val setPickablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "set_pickable", 2586408642)

    internal val isPickablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "is_pickable", 36873697)

    internal val createShapeOwnerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "create_shape_owner", 3429307534)

    internal val removeShapeOwnerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "remove_shape_owner", 1286410249)

    internal val getShapeOwnersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "get_shape_owners", 969006518)

    internal val shapeOwnerSetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "shape_owner_set_transform", 30160968)

    internal val shapeOwnerGetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "shape_owner_get_transform", 3836996910)

    internal val shapeOwnerGetOwnerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "shape_owner_get_owner", 3332903315)

    internal val shapeOwnerSetDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "shape_owner_set_disabled", 300928843)

    internal val isShapeOwnerDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "is_shape_owner_disabled", 1116898809)

    internal val shapeOwnerSetOneWayCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "shape_owner_set_one_way_collision", 300928843)

    internal val isShapeOwnerOneWayCollisionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "is_shape_owner_one_way_collision_enabled", 1116898809)

    internal val shapeOwnerSetOneWayCollisionMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "shape_owner_set_one_way_collision_margin", 1602489585)

    internal val getShapeOwnerOneWayCollisionMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "get_shape_owner_one_way_collision_margin", 2339986948)

    internal val shapeOwnerAddShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "shape_owner_add_shape", 2077425081)

    internal val shapeOwnerGetShapeCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "shape_owner_get_shape_count", 923996154)

    internal val shapeOwnerGetShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "shape_owner_get_shape", 3106725749)

    internal val shapeOwnerGetShapeIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "shape_owner_get_shape_index", 3175239445)

    internal val shapeOwnerRemoveShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "shape_owner_remove_shape", 3937882851)

    internal val shapeOwnerClearShapesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "shape_owner_clear_shapes", 1286410249)

    internal val shapeFindOwnerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionObject2D", "shape_find_owner", 923996154)
  }
}
