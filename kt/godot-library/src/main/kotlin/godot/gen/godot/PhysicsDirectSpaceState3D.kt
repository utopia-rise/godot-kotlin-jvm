// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.Dictionary
import godot.core.PackedFloat32Array
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.DICTIONARY
import godot.core.VariantParser.LONG
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_FLOAT_32_ARRAY
import godot.core.Vector3
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Provides direct access to a physics space in the [PhysicsServer3D]. It's used mainly to do
 * queries against objects and areas residing in a given space.
 */
@GodotBaseType
public open class PhysicsDirectSpaceState3D internal constructor() : Object() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_PHYSICSDIRECTSPACESTATE3D, scriptIndex)
  }

  /**
   * Checks whether a point is inside any solid shape. Position and other parameters are defined
   * through [PhysicsPointQueryParameters3D]. The shapes the point is inside of are returned in an
   * array containing dictionaries with the following fields:
   * `collider`: The colliding object.
   * `collider_id`: The colliding object's ID.
   * `rid`: The intersecting object's [RID].
   * `shape`: The shape index of the colliding shape.
   * The number of intersections can be limited with the [maxResults] parameter, to reduce the
   * processing time.
   */
  @JvmOverloads
  public final fun intersectPoint(parameters: PhysicsPointQueryParameters3D?, maxResults: Int = 32):
      VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments(OBJECT to parameters, LONG to maxResults.toLong())
    TransferContext.callMethod(ptr, MethodBindings.intersectPointPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Intersects a ray in a given space. Ray position and other parameters are defined through
   * [PhysicsRayQueryParameters3D]. The returned object is a dictionary with the following fields:
   * `collider`: The colliding object.
   * `collider_id`: The colliding object's ID.
   * `normal`: The object's surface normal at the intersection point, or `Vector3(0, 0, 0)` if the
   * ray starts inside the shape and [PhysicsRayQueryParameters3D.hitFromInside] is `true`.
   * `position`: The intersection point.
   * `face_index`: The face index at the intersection point.
   * **Note:** Returns a valid number only if the intersected shape is a [ConcavePolygonShape3D].
   * Otherwise, `-1` is returned.
   * `rid`: The intersecting object's [RID].
   * `shape`: The shape index of the colliding shape.
   * If the ray did not intersect anything, then an empty dictionary is returned instead.
   */
  public final fun intersectRay(parameters: PhysicsRayQueryParameters3D?): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(OBJECT to parameters)
    TransferContext.callMethod(ptr, MethodBindings.intersectRayPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  /**
   * Checks the intersections of a shape, given through a [PhysicsShapeQueryParameters3D] object,
   * against the space. The intersected shapes are returned in an array containing dictionaries with
   * the following fields:
   * `collider`: The colliding object.
   * `collider_id`: The colliding object's ID.
   * `rid`: The intersecting object's [RID].
   * `shape`: The shape index of the colliding shape.
   * The number of intersections can be limited with the [maxResults] parameter, to reduce the
   * processing time.
   * **Note:** This method does not take into account the `motion` property of the object.
   */
  @JvmOverloads
  public final fun intersectShape(parameters: PhysicsShapeQueryParameters3D?, maxResults: Int = 32):
      VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments(OBJECT to parameters, LONG to maxResults.toLong())
    TransferContext.callMethod(ptr, MethodBindings.intersectShapePtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Checks how far a [Shape3D] can move without colliding. All the parameters for the query,
   * including the shape, are supplied through a [PhysicsShapeQueryParameters3D] object.
   * Returns an array with the safe and unsafe proportions (between 0 and 1) of the motion. The safe
   * proportion is the maximum fraction of the motion that can be made without a collision. The unsafe
   * proportion is the minimum fraction of the distance that must be moved for a collision. If no
   * collision is detected a result of `[1.0, 1.0]` will be returned.
   * **Note:** Any [Shape3D]s that the shape is already colliding with e.g. inside of, will be
   * ignored. Use [collideShape] to determine the [Shape3D]s that the shape is already colliding with.
   */
  public final fun castMotion(parameters: PhysicsShapeQueryParameters3D?): PackedFloat32Array {
    TransferContext.writeArguments(OBJECT to parameters)
    TransferContext.callMethod(ptr, MethodBindings.castMotionPtr, PACKED_FLOAT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_FLOAT_32_ARRAY) as PackedFloat32Array)
  }

  /**
   * Checks the intersections of a shape, given through a [PhysicsShapeQueryParameters3D] object,
   * against the space. The resulting array contains a list of points where the shape intersects
   * another. Like with [intersectShape], the number of returned results can be limited to save
   * processing time.
   * Returned points are a list of pairs of contact points. For each pair the first one is in the
   * shape passed in [PhysicsShapeQueryParameters3D] object, second one is in the collided shape from
   * the physics space.
   * **Note:** This method does not take into account the `motion` property of the object.
   */
  @JvmOverloads
  public final fun collideShape(parameters: PhysicsShapeQueryParameters3D?, maxResults: Int = 32):
      VariantArray<Vector3> {
    TransferContext.writeArguments(OBJECT to parameters, LONG to maxResults.toLong())
    TransferContext.callMethod(ptr, MethodBindings.collideShapePtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Vector3>)
  }

  /**
   * Checks the intersections of a shape, given through a [PhysicsShapeQueryParameters3D] object,
   * against the space. If it collides with more than one shape, the nearest one is selected. The
   * returned object is a dictionary containing the following fields:
   * `collider_id`: The colliding object's ID.
   * `linear_velocity`: The colliding object's velocity [Vector3]. If the object is an [Area3D], the
   * result is `(0, 0, 0)`.
   * `normal`: The object's surface normal at the intersection point.
   * `point`: The intersection point.
   * `rid`: The intersecting object's [RID].
   * `shape`: The shape index of the colliding shape.
   * If the shape did not intersect anything, then an empty dictionary is returned instead.
   * **Note:** This method does not take into account the `motion` property of the object.
   */
  public final fun getRestInfo(parameters: PhysicsShapeQueryParameters3D?): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(OBJECT to parameters)
    TransferContext.callMethod(ptr, MethodBindings.getRestInfoPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  public companion object

  internal object MethodBindings {
    public val intersectPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectSpaceState3D", "intersect_point", 975173756)

    public val intersectRayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectSpaceState3D", "intersect_ray", 3957970750)

    public val intersectShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectSpaceState3D", "intersect_shape", 3762137681)

    public val castMotionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectSpaceState3D", "cast_motion", 1778757334)

    public val collideShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectSpaceState3D", "collide_shape", 3762137681)

    public val getRestInfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsDirectSpaceState3D", "get_rest_info", 1376751592)
  }
}
