// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Direct access object to a space in the [godot.PhysicsServer].
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/3.4/tutorials/physics/ray-casting.html](https://docs.godotengine.org/en/3.4/tutorials/physics/ray-casting.html)
 *
 * Direct access object to a space in the [godot.PhysicsServer]. It's used mainly to do queries against objects and areas residing in a given space.
 */
@GodotBaseType
public open class PhysicsDirectSpaceState : Object() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PHYSICSDIRECTSPACESTATE)
  }

  /**
   * Checks how far a [godot.Shape] can move without colliding. All the parameters for the query, including the shape, are supplied through a [godot.PhysicsShapeQueryParameters] object.
   *
   * Returns an array with the safe and unsafe proportions (between 0 and 1) of the motion. The safe proportion is the maximum fraction of the motion that can be made without a collision. The unsafe proportion is the minimum fraction of the distance that must be moved for a collision. If no collision is detected a result of `[1.0, 1.0]` will be returned.
   *
   * **Note:** Any [godot.Shape]s that the shape is already colliding with e.g. inside of, will be ignored. Use [collideShape] to determine the [godot.Shape]s that the shape is already colliding with.
   */
  public open fun castMotion(shape: PhysicsShapeQueryParameters, motion: Vector3):
      VariantArray<Any?> {
    TransferContext.writeArguments(OBJECT to shape, VECTOR3 to motion)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTSPACESTATE_CAST_MOTION,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Checks the intersections of a shape, given through a [godot.PhysicsShapeQueryParameters] object, against the space. The resulting array contains a list of points where the shape intersects another. Like with [intersectShape], the number of returned results can be limited to save processing time.
   */
  public open fun collideShape(shape: PhysicsShapeQueryParameters, maxResults: Long = 32):
      VariantArray<Any?> {
    TransferContext.writeArguments(OBJECT to shape, LONG to maxResults)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTSPACESTATE_COLLIDE_SHAPE, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Checks the intersections of a shape, given through a [godot.PhysicsShapeQueryParameters] object, against the space. If it collides with more than one shape, the nearest one is selected. The returned object is a dictionary containing the following fields:
   *
   * `collider_id`: The colliding object's ID.
   *
   * `linear_velocity`: The colliding object's velocity [godot.core.Vector3]. If the object is an [godot.Area], the result is `(0, 0, 0)`.
   *
   * `normal`: The object's surface normal at the intersection point.
   *
   * `point`: The intersection point.
   *
   * `rid`: The intersecting object's [RID].
   *
   * `shape`: The shape index of the colliding shape.
   *
   * If the shape did not intersect anything, then an empty dictionary is returned instead.
   */
  public open fun getRestInfo(shape: PhysicsShapeQueryParameters): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(OBJECT to shape)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTSPACESTATE_GET_REST_INFO, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Intersects a ray in a given space. The returned object is a dictionary with the following fields:
   *
   * `collider`: The colliding object.
   *
   * `collider_id`: The colliding object's ID.
   *
   * `normal`: The object's surface normal at the intersection point.
   *
   * `position`: The intersection point.
   *
   * `rid`: The intersecting object's [RID].
   *
   * `shape`: The shape index of the colliding shape.
   *
   * If the ray did not intersect anything, then an empty dictionary is returned instead.
   *
   * Additionally, the method can take an `exclude` array of objects or [RID]s that are to be excluded from collisions, a `collision_mask` bitmask representing the physics layers to check in, or booleans to determine if the ray should collide with [godot.PhysicsBody]s or [godot.Area]s, respectively.
   */
  public open fun intersectRay(
    from: Vector3,
    to: Vector3,
    exclude: VariantArray<Any?> = VariantArray(),
    collisionMask: Long = 2147483647,
    collideWithBodies: Boolean = true,
    collideWithAreas: Boolean = false
  ): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(VECTOR3 to from, VECTOR3 to to, ARRAY to exclude, LONG to
        collisionMask, BOOL to collideWithBodies, BOOL to collideWithAreas)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTSPACESTATE_INTERSECT_RAY, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Checks the intersections of a shape, given through a [godot.PhysicsShapeQueryParameters] object, against the space. The intersected shapes are returned in an array containing dictionaries with the following fields:
   *
   * `collider`: The colliding object.
   *
   * `collider_id`: The colliding object's ID.
   *
   * `rid`: The intersecting object's [RID].
   *
   * `shape`: The shape index of the colliding shape.
   *
   * The number of intersections can be limited with the `max_results` parameter, to reduce the processing time.
   */
  public open fun intersectShape(shape: PhysicsShapeQueryParameters, maxResults: Long = 32):
      VariantArray<Any?> {
    TransferContext.writeArguments(OBJECT to shape, LONG to maxResults)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_PHYSICSDIRECTSPACESTATE_INTERSECT_SHAPE, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }
}
