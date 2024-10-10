// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.RID
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.VECTOR3
import godot.core.VariantParser._RID
import godot.core.Vector3
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_RAYCAST3D_INDEX: Int = 528

/**
 * A raycast represents a ray from its origin to its [targetPosition] that finds the closest
 * [CollisionObject3D] along its path, if it intersects any.
 * [RayCast3D] can ignore some objects by adding them to an exception list, by making its detection
 * reporting ignore [Area3D]s ([collideWithAreas]) or [PhysicsBody3D]s ([collideWithBodies]), or by
 * configuring physics layers.
 * [RayCast3D] calculates intersection every physics frame, and it holds the result until the next
 * physics frame. For an immediate raycast, or if you want to configure a [RayCast3D] multiple times
 * within the same physics frame, use [forceRaycastUpdate].
 * To sweep over a region of 3D space, you can approximate the region with multiple [RayCast3D]s or
 * use [ShapeCast3D].
 */
@GodotBaseType
public open class RayCast3D : Node3D() {
  /**
   * If `true`, collisions will be reported.
   */
  public final inline var enabled: Boolean
    @JvmName("enabledProperty")
    get() = isEnabled()
    @JvmName("enabledProperty")
    set(`value`) {
      setEnabled(value)
    }

  /**
   * If `true`, collisions will be ignored for this RayCast3D's immediate parent.
   */
  public final inline var excludeParent: Boolean
    @JvmName("excludeParentProperty")
    get() = getExcludeParentBody()
    @JvmName("excludeParentProperty")
    set(`value`) {
      setExcludeParentBody(value)
    }

  /**
   * The ray's destination point, relative to the RayCast's `position`.
   */
  @CoreTypeLocalCopy
  public final inline var targetPosition: Vector3
    @JvmName("targetPositionProperty")
    get() = getTargetPosition()
    @JvmName("targetPositionProperty")
    set(`value`) {
      setTargetPosition(value)
    }

  /**
   * The ray's collision mask. Only objects in at least one collision layer enabled in the mask will
   * be detected. See
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
   * If `true`, the ray will detect a hit when starting inside shapes. In this case the collision
   * normal will be `Vector3(0, 0, 0)`. Does not affect shapes with no volume like concave polygon or
   * heightmap.
   */
  public final inline var hitFromInside: Boolean
    @JvmName("hitFromInsideProperty")
    get() = isHitFromInsideEnabled()
    @JvmName("hitFromInsideProperty")
    set(`value`) {
      setHitFromInside(value)
    }

  /**
   * If `true`, the ray will hit back faces with concave polygon shapes with back face enabled or
   * heightmap shapes.
   */
  public final inline var hitBackFaces: Boolean
    @JvmName("hitBackFacesProperty")
    get() = isHitBackFacesEnabled()
    @JvmName("hitBackFacesProperty")
    set(`value`) {
      setHitBackFaces(value)
    }

  /**
   * If `true`, collisions with [Area3D]s will be reported.
   */
  public final inline var collideWithAreas: Boolean
    @JvmName("collideWithAreasProperty")
    get() = isCollideWithAreasEnabled()
    @JvmName("collideWithAreasProperty")
    set(`value`) {
      setCollideWithAreas(value)
    }

  /**
   * If `true`, collisions with [PhysicsBody3D]s will be reported.
   */
  public final inline var collideWithBodies: Boolean
    @JvmName("collideWithBodiesProperty")
    get() = isCollideWithBodiesEnabled()
    @JvmName("collideWithBodiesProperty")
    set(`value`) {
      setCollideWithBodies(value)
    }

  /**
   * The custom color to use to draw the shape in the editor and at run-time if **Visible Collision
   * Shapes** is enabled in the **Debug** menu. This color will be highlighted at run-time if the
   * [RayCast3D] is colliding with something.
   * If set to `Color(0.0, 0.0, 0.0)` (by default), the color set in
   * [ProjectSettings.debug/shapes/collision/shapeColor] is used.
   */
  @CoreTypeLocalCopy
  public final inline var debugShapeCustomColor: Color
    @JvmName("debugShapeCustomColorProperty")
    get() = getDebugShapeCustomColor()
    @JvmName("debugShapeCustomColorProperty")
    set(`value`) {
      setDebugShapeCustomColor(value)
    }

  /**
   * If set to `1`, a line is used as the debug shape. Otherwise, a truncated pyramid is drawn to
   * represent the [RayCast3D]. Requires **Visible Collision Shapes** to be enabled in the **Debug**
   * menu for the debug shape to be visible at run-time.
   */
  public final inline var debugShapeThickness: Int
    @JvmName("debugShapeThicknessProperty")
    get() = getDebugShapeThickness()
    @JvmName("debugShapeThicknessProperty")
    set(`value`) {
      setDebugShapeThickness(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_RAYCAST3D_INDEX, scriptIndex)
  }

  /**
   * The ray's destination point, relative to the RayCast's `position`.
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = raycast3d.targetPosition
   * //Your changes
   * raycast3d.targetPosition = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun targetPositionMutate(block: Vector3.() -> Unit): Vector3 = targetPosition.apply{
      block(this)
      targetPosition = this
  }


  /**
   * The custom color to use to draw the shape in the editor and at run-time if **Visible Collision
   * Shapes** is enabled in the **Debug** menu. This color will be highlighted at run-time if the
   * [RayCast3D] is colliding with something.
   * If set to `Color(0.0, 0.0, 0.0)` (by default), the color set in
   * [ProjectSettings.debug/shapes/collision/shapeColor] is used.
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = raycast3d.debugShapeCustomColor
   * //Your changes
   * raycast3d.debugShapeCustomColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun debugShapeCustomColorMutate(block: Color.() -> Unit): Color =
      debugShapeCustomColor.apply{
      block(this)
      debugShapeCustomColor = this
  }


  public final fun setEnabled(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setEnabledPtr, NIL)
  }

  public final fun isEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setTargetPosition(localPoint: Vector3): Unit {
    Internals.writeArguments(VECTOR3 to localPoint)
    Internals.callMethod(rawPtr, MethodBindings.setTargetPositionPtr, NIL)
  }

  public final fun getTargetPosition(): Vector3 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTargetPositionPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns whether any object is intersecting with the ray's vector (considering the vector
   * length).
   */
  public final fun isColliding(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isCollidingPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Updates the collision information for the ray immediately, without waiting for the next
   * `_physics_process` call. Use this method, for example, when the ray or its parent has changed
   * state.
   * **Note:** [enabled] does not need to be `true` for this to work.
   */
  public final fun forceRaycastUpdate(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.forceRaycastUpdatePtr, NIL)
  }

  /**
   * Returns the first object that the ray intersects, or `null` if no object is intersecting the
   * ray (i.e. [isColliding] returns `false`).
   */
  public final fun getCollider(): Object? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getColliderPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Object?)
  }

  /**
   * Returns the [RID] of the first object that the ray intersects, or an empty [RID] if no object
   * is intersecting the ray (i.e. [isColliding] returns `false`).
   */
  public final fun getColliderRid(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getColliderRidPtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  /**
   * Returns the shape ID of the first object that the ray intersects, or `0` if no object is
   * intersecting the ray (i.e. [isColliding] returns `false`).
   * To get the intersected shape node, for a [CollisionObject3D] target, use:
   *
   * gdscript:
   * ```gdscript
   * var target = get_collider() # A CollisionObject3D.
   * var shape_id = get_collider_shape() # The shape index in the collider.
   * var owner_id = target.shape_find_owner(shape_id) # The owner ID in the collider.
   * var shape = target.shape_owner_get_owner(owner_id)
   * ```
   * csharp:
   * ```csharp
   * var target = (CollisionObject3D)GetCollider(); // A CollisionObject3D.
   * var shapeId = GetColliderShape(); // The shape index in the collider.
   * var ownerId = target.ShapeFindOwner(shapeId); // The owner ID in the collider.
   * var shape = target.ShapeOwnerGetOwner(ownerId);
   * ```
   */
  public final fun getColliderShape(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getColliderShapePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the collision point at which the ray intersects the closest object, in the global
   * coordinate system. If [hitFromInside] is `true` and the ray starts inside of a collision shape,
   * this function will return the origin point of the ray.
   * **Note:** Check that [isColliding] returns `true` before calling this method to ensure the
   * returned point is valid and up-to-date.
   */
  public final fun getCollisionPoint(): Vector3 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCollisionPointPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the normal of the intersecting object's shape at the collision point, or `Vector3(0, 0,
   * 0)` if the ray starts inside the shape and [hitFromInside] is `true`.
   * **Note:** Check that [isColliding] returns `true` before calling this method to ensure the
   * returned normal is valid and up-to-date.
   */
  public final fun getCollisionNormal(): Vector3 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCollisionNormalPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the collision object's face index at the collision point, or `-1` if the shape
   * intersecting the ray is not a [ConcavePolygonShape3D].
   */
  public final fun getCollisionFaceIndex(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCollisionFaceIndexPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Adds a collision exception so the ray does not report collisions with the specified [RID].
   */
  public final fun addExceptionRid(rid: RID): Unit {
    Internals.writeArguments(_RID to rid)
    Internals.callMethod(rawPtr, MethodBindings.addExceptionRidPtr, NIL)
  }

  /**
   * Adds a collision exception so the ray does not report collisions with the specified
   * [CollisionObject3D] node.
   */
  public final fun addException(node: CollisionObject3D?): Unit {
    Internals.writeArguments(OBJECT to node)
    Internals.callMethod(rawPtr, MethodBindings.addExceptionPtr, NIL)
  }

  /**
   * Removes a collision exception so the ray does report collisions with the specified [RID].
   */
  public final fun removeExceptionRid(rid: RID): Unit {
    Internals.writeArguments(_RID to rid)
    Internals.callMethod(rawPtr, MethodBindings.removeExceptionRidPtr, NIL)
  }

  /**
   * Removes a collision exception so the ray does report collisions with the specified
   * [CollisionObject3D] node.
   */
  public final fun removeException(node: CollisionObject3D?): Unit {
    Internals.writeArguments(OBJECT to node)
    Internals.callMethod(rawPtr, MethodBindings.removeExceptionPtr, NIL)
  }

  /**
   * Removes all collision exceptions for this ray.
   */
  public final fun clearExceptions(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clearExceptionsPtr, NIL)
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

  public final fun setExcludeParentBody(mask: Boolean): Unit {
    Internals.writeArguments(BOOL to mask)
    Internals.callMethod(rawPtr, MethodBindings.setExcludeParentBodyPtr, NIL)
  }

  public final fun getExcludeParentBody(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getExcludeParentBodyPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCollideWithAreas(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setCollideWithAreasPtr, NIL)
  }

  public final fun isCollideWithAreasEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isCollideWithAreasEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCollideWithBodies(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setCollideWithBodiesPtr, NIL)
  }

  public final fun isCollideWithBodiesEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isCollideWithBodiesEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setHitFromInside(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setHitFromInsidePtr, NIL)
  }

  public final fun isHitFromInsideEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isHitFromInsideEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setHitBackFaces(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setHitBackFacesPtr, NIL)
  }

  public final fun isHitBackFacesEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isHitBackFacesEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDebugShapeCustomColor(debugShapeCustomColor: Color): Unit {
    Internals.writeArguments(COLOR to debugShapeCustomColor)
    Internals.callMethod(rawPtr, MethodBindings.setDebugShapeCustomColorPtr, NIL)
  }

  public final fun getDebugShapeCustomColor(): Color {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDebugShapeCustomColorPtr, COLOR)
    return (Internals.readReturnValue(COLOR) as Color)
  }

  public final fun setDebugShapeThickness(debugShapeThickness: Int): Unit {
    Internals.writeArguments(LONG to debugShapeThickness.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setDebugShapeThicknessPtr, NIL)
  }

  public final fun getDebugShapeThickness(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDebugShapeThicknessPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public companion object

  internal object MethodBindings {
    public val setEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("RayCast3D", "set_enabled", 2586408642)

    public val isEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("RayCast3D", "is_enabled", 36873697)

    public val setTargetPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("RayCast3D", "set_target_position", 3460891852)

    public val getTargetPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("RayCast3D", "get_target_position", 3360562783)

    public val isCollidingPtr: VoidPtr =
        Internals.getMethodBindPtr("RayCast3D", "is_colliding", 36873697)

    public val forceRaycastUpdatePtr: VoidPtr =
        Internals.getMethodBindPtr("RayCast3D", "force_raycast_update", 3218959716)

    public val getColliderPtr: VoidPtr =
        Internals.getMethodBindPtr("RayCast3D", "get_collider", 1981248198)

    public val getColliderRidPtr: VoidPtr =
        Internals.getMethodBindPtr("RayCast3D", "get_collider_rid", 2944877500)

    public val getColliderShapePtr: VoidPtr =
        Internals.getMethodBindPtr("RayCast3D", "get_collider_shape", 3905245786)

    public val getCollisionPointPtr: VoidPtr =
        Internals.getMethodBindPtr("RayCast3D", "get_collision_point", 3360562783)

    public val getCollisionNormalPtr: VoidPtr =
        Internals.getMethodBindPtr("RayCast3D", "get_collision_normal", 3360562783)

    public val getCollisionFaceIndexPtr: VoidPtr =
        Internals.getMethodBindPtr("RayCast3D", "get_collision_face_index", 3905245786)

    public val addExceptionRidPtr: VoidPtr =
        Internals.getMethodBindPtr("RayCast3D", "add_exception_rid", 2722037293)

    public val addExceptionPtr: VoidPtr =
        Internals.getMethodBindPtr("RayCast3D", "add_exception", 1976431078)

    public val removeExceptionRidPtr: VoidPtr =
        Internals.getMethodBindPtr("RayCast3D", "remove_exception_rid", 2722037293)

    public val removeExceptionPtr: VoidPtr =
        Internals.getMethodBindPtr("RayCast3D", "remove_exception", 1976431078)

    public val clearExceptionsPtr: VoidPtr =
        Internals.getMethodBindPtr("RayCast3D", "clear_exceptions", 3218959716)

    public val setCollisionMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("RayCast3D", "set_collision_mask", 1286410249)

    public val getCollisionMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("RayCast3D", "get_collision_mask", 3905245786)

    public val setCollisionMaskValuePtr: VoidPtr =
        Internals.getMethodBindPtr("RayCast3D", "set_collision_mask_value", 300928843)

    public val getCollisionMaskValuePtr: VoidPtr =
        Internals.getMethodBindPtr("RayCast3D", "get_collision_mask_value", 1116898809)

    public val setExcludeParentBodyPtr: VoidPtr =
        Internals.getMethodBindPtr("RayCast3D", "set_exclude_parent_body", 2586408642)

    public val getExcludeParentBodyPtr: VoidPtr =
        Internals.getMethodBindPtr("RayCast3D", "get_exclude_parent_body", 36873697)

    public val setCollideWithAreasPtr: VoidPtr =
        Internals.getMethodBindPtr("RayCast3D", "set_collide_with_areas", 2586408642)

    public val isCollideWithAreasEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("RayCast3D", "is_collide_with_areas_enabled", 36873697)

    public val setCollideWithBodiesPtr: VoidPtr =
        Internals.getMethodBindPtr("RayCast3D", "set_collide_with_bodies", 2586408642)

    public val isCollideWithBodiesEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("RayCast3D", "is_collide_with_bodies_enabled", 36873697)

    public val setHitFromInsidePtr: VoidPtr =
        Internals.getMethodBindPtr("RayCast3D", "set_hit_from_inside", 2586408642)

    public val isHitFromInsideEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("RayCast3D", "is_hit_from_inside_enabled", 36873697)

    public val setHitBackFacesPtr: VoidPtr =
        Internals.getMethodBindPtr("RayCast3D", "set_hit_back_faces", 2586408642)

    public val isHitBackFacesEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("RayCast3D", "is_hit_back_faces_enabled", 36873697)

    public val setDebugShapeCustomColorPtr: VoidPtr =
        Internals.getMethodBindPtr("RayCast3D", "set_debug_shape_custom_color", 2920490490)

    public val getDebugShapeCustomColorPtr: VoidPtr =
        Internals.getMethodBindPtr("RayCast3D", "get_debug_shape_custom_color", 3444240500)

    public val setDebugShapeThicknessPtr: VoidPtr =
        Internals.getMethodBindPtr("RayCast3D", "set_debug_shape_thickness", 1286410249)

    public val getDebugShapeThicknessPtr: VoidPtr =
        Internals.getMethodBindPtr("RayCast3D", "get_debug_shape_thickness", 3905245786)
  }
}
