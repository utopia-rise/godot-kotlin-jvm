// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.PackedFloat32Array
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.DICTIONARY
import godot.core.VariantParser.LONG
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_FLOAT_32_ARRAY
import godot.core.Vector2
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_PHYSICSDIRECTSPACESTATE2D_INDEX: Int = 466

/**
 * Provides direct access to a physics space in the [PhysicsServer2D]. It's used mainly to do
 * queries against objects and areas residing in a given space.
 */
@GodotBaseType
public open class PhysicsDirectSpaceState2D internal constructor() : Object() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_PHYSICSDIRECTSPACESTATE2D_INDEX, scriptIndex)
  }

  /**
   * Checks whether a point is inside any solid shape. Position and other parameters are defined
   * through [PhysicsPointQueryParameters2D]. The shapes the point is inside of are returned in an
   * array containing dictionaries with the following fields:
   * `collider`: The colliding object.
   * `collider_id`: The colliding object's ID.
   * `rid`: The intersecting object's [RID].
   * `shape`: The shape index of the colliding shape.
   * The number of intersections can be limited with the [maxResults] parameter, to reduce the
   * processing time.
   * **Note:** [ConcavePolygonShape2D]s and [CollisionPolygon2D]s in `Segments` build mode are not
   * solid shapes. Therefore, they will not be detected.
   */
  @JvmOverloads
  public final fun intersectPoint(parameters: PhysicsPointQueryParameters2D?, maxResults: Int = 32):
      VariantArray<Dictionary<Any?, Any?>> {
    Internals.writeArguments(OBJECT to parameters, LONG to maxResults.toLong())
    Internals.callMethod(rawPtr, MethodBindings.intersectPointPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Intersects a ray in a given space. Ray position and other parameters are defined through
   * [PhysicsRayQueryParameters2D]. The returned object is a dictionary with the following fields:
   * `collider`: The colliding object.
   * `collider_id`: The colliding object's ID.
   * `normal`: The object's surface normal at the intersection point, or `Vector2(0, 0)` if the ray
   * starts inside the shape and [PhysicsRayQueryParameters2D.hitFromInside] is `true`.
   * `position`: The intersection point.
   * `rid`: The intersecting object's [RID].
   * `shape`: The shape index of the colliding shape.
   * If the ray did not intersect anything, then an empty dictionary is returned instead.
   */
  public final fun intersectRay(parameters: PhysicsRayQueryParameters2D?): Dictionary<Any?, Any?> {
    Internals.writeArguments(OBJECT to parameters)
    Internals.callMethod(rawPtr, MethodBindings.intersectRayPtr, DICTIONARY)
    return (Internals.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  /**
   * Checks the intersections of a shape, given through a [PhysicsShapeQueryParameters2D] object,
   * against the space. The intersected shapes are returned in an array containing dictionaries with
   * the following fields:
   * `collider`: The colliding object.
   * `collider_id`: The colliding object's ID.
   * `rid`: The intersecting object's [RID].
   * `shape`: The shape index of the colliding shape.
   * The number of intersections can be limited with the [maxResults] parameter, to reduce the
   * processing time.
   */
  @JvmOverloads
  public final fun intersectShape(parameters: PhysicsShapeQueryParameters2D?, maxResults: Int = 32):
      VariantArray<Dictionary<Any?, Any?>> {
    Internals.writeArguments(OBJECT to parameters, LONG to maxResults.toLong())
    Internals.callMethod(rawPtr, MethodBindings.intersectShapePtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Checks how far a [Shape2D] can move without colliding. All the parameters for the query,
   * including the shape and the motion, are supplied through a [PhysicsShapeQueryParameters2D] object.
   * Returns an array with the safe and unsafe proportions (between 0 and 1) of the motion. The safe
   * proportion is the maximum fraction of the motion that can be made without a collision. The unsafe
   * proportion is the minimum fraction of the distance that must be moved for a collision. If no
   * collision is detected a result of `[1.0, 1.0]` will be returned.
   * **Note:** Any [Shape2D]s that the shape is already colliding with e.g. inside of, will be
   * ignored. Use [collideShape] to determine the [Shape2D]s that the shape is already colliding with.
   */
  public final fun castMotion(parameters: PhysicsShapeQueryParameters2D?): PackedFloat32Array {
    Internals.writeArguments(OBJECT to parameters)
    Internals.callMethod(rawPtr, MethodBindings.castMotionPtr, PACKED_FLOAT_32_ARRAY)
    return (Internals.readReturnValue(PACKED_FLOAT_32_ARRAY) as PackedFloat32Array)
  }

  /**
   * Checks the intersections of a shape, given through a [PhysicsShapeQueryParameters2D] object,
   * against the space. The resulting array contains a list of points where the shape intersects
   * another. Like with [intersectShape], the number of returned results can be limited to save
   * processing time.
   * Returned points are a list of pairs of contact points. For each pair the first one is in the
   * shape passed in [PhysicsShapeQueryParameters2D] object, second one is in the collided shape from
   * the physics space.
   */
  @JvmOverloads
  public final fun collideShape(parameters: PhysicsShapeQueryParameters2D?, maxResults: Int = 32):
      VariantArray<Vector2> {
    Internals.writeArguments(OBJECT to parameters, LONG to maxResults.toLong())
    Internals.callMethod(rawPtr, MethodBindings.collideShapePtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Vector2>)
  }

  /**
   * Checks the intersections of a shape, given through a [PhysicsShapeQueryParameters2D] object,
   * against the space. If it collides with more than one shape, the nearest one is selected. If the
   * shape did not intersect anything, then an empty dictionary is returned instead.
   * **Note:** This method does not take into account the `motion` property of the object. The
   * returned object is a dictionary containing the following fields:
   * `collider_id`: The colliding object's ID.
   * `linear_velocity`: The colliding object's velocity [Vector2]. If the object is an [Area2D], the
   * result is `(0, 0)`.
   * `normal`: The object's surface normal at the intersection point.
   * `point`: The intersection point.
   * `rid`: The intersecting object's [RID].
   * `shape`: The shape index of the colliding shape.
   */
  public final fun getRestInfo(parameters: PhysicsShapeQueryParameters2D?): Dictionary<Any?, Any?> {
    Internals.writeArguments(OBJECT to parameters)
    Internals.callMethod(rawPtr, MethodBindings.getRestInfoPtr, DICTIONARY)
    return (Internals.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  public companion object

  public object MethodBindings {
    internal val intersectPointPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsDirectSpaceState2D", "intersect_point", 2118456068)

    internal val intersectRayPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsDirectSpaceState2D", "intersect_ray", 1590275562)

    internal val intersectShapePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsDirectSpaceState2D", "intersect_shape", 2488867228)

    internal val castMotionPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsDirectSpaceState2D", "cast_motion", 711275086)

    internal val collideShapePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsDirectSpaceState2D", "collide_shape", 2488867228)

    internal val getRestInfoPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsDirectSpaceState2D", "get_rest_info", 2803666496)
  }
}
