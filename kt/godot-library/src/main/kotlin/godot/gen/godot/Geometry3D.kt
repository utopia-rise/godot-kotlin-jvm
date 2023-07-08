// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector3Array
import godot.core.Plane
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.PACKED_VECTOR3_ARRAY
import godot.core.VariantType.PLANE
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Provides methods for some common 3D geometric operations.
 *
 * Provides a set of helper functions to create geometric shapes, compute intersections between shapes, and process various other geometric operations in 3D.
 */
@GodotBaseType
public object Geometry3D : Object() {
  public override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_GEOMETRY3D)
    return false
  }

  /**
   * Returns an array with 6 [godot.core.Plane]s that describe the sides of a box centered at the origin. The box size is defined by [extents], which represents one (positive) corner of the box (i.e. half its actual size).
   */
  public fun buildBoxPlanes(extents: Vector3): VariantArray<Plane> {
    TransferContext.writeArguments(VECTOR3 to extents)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GEOMETRY3D_BUILD_BOX_PLANES, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Plane>
  }

  /**
   * Returns an array of [godot.core.Plane]s closely bounding a faceted cylinder centered at the origin with radius [radius] and height [height]. The parameter [sides] defines how many planes will be generated for the round part of the cylinder. The parameter [axis] describes the axis along which the cylinder is oriented (0 for X, 1 for Y, 2 for Z).
   */
  public fun buildCylinderPlanes(
    radius: Double,
    height: Double,
    sides: Long,
    axis: Vector3.Axis = Vector3.Axis.Z,
  ): VariantArray<Plane> {
    TransferContext.writeArguments(DOUBLE to radius, DOUBLE to height, LONG to sides, LONG to axis.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GEOMETRY3D_BUILD_CYLINDER_PLANES,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Plane>
  }

  /**
   * Returns an array of [godot.core.Plane]s closely bounding a faceted capsule centered at the origin with radius [radius] and height [height]. The parameter [sides] defines how many planes will be generated for the side part of the capsule, whereas [lats] gives the number of latitudinal steps at the bottom and top of the capsule. The parameter [axis] describes the axis along which the capsule is oriented (0 for X, 1 for Y, 2 for Z).
   */
  public fun buildCapsulePlanes(
    radius: Double,
    height: Double,
    sides: Long,
    lats: Long,
    axis: Vector3.Axis = Vector3.Axis.Z,
  ): VariantArray<Plane> {
    TransferContext.writeArguments(DOUBLE to radius, DOUBLE to height, LONG to sides, LONG to lats, LONG to axis.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GEOMETRY3D_BUILD_CAPSULE_PLANES,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Plane>
  }

  /**
   * Given the two 3D segments ([p1], [p2]) and ([q1], [q2]), finds those two points on the two segments that are closest to each other. Returns a [godot.PackedVector3Array] that contains this point on ([p1], [p2]) as well the accompanying point on ([q1], [q2]).
   */
  public fun getClosestPointsBetweenSegments(
    p1: Vector3,
    p2: Vector3,
    q1: Vector3,
    q2: Vector3,
  ): PackedVector3Array {
    TransferContext.writeArguments(VECTOR3 to p1, VECTOR3 to p2, VECTOR3 to q1, VECTOR3 to q2)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GEOMETRY3D_GET_CLOSEST_POINTS_BETWEEN_SEGMENTS,
        PACKED_VECTOR3_ARRAY)
    return TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array
  }

  /**
   * Returns the 3D point on the 3D segment ([s1], [s2]) that is closest to [point]. The returned point will always be inside the specified segment.
   */
  public fun getClosestPointToSegment(
    point: Vector3,
    s1: Vector3,
    s2: Vector3,
  ): Vector3 {
    TransferContext.writeArguments(VECTOR3 to point, VECTOR3 to s1, VECTOR3 to s2)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GEOMETRY3D_GET_CLOSEST_POINT_TO_SEGMENT, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the 3D point on the 3D line defined by ([s1], [s2]) that is closest to [point]. The returned point can be inside the segment ([s1], [s2]) or outside of it, i.e. somewhere on the line extending from the segment.
   */
  public fun getClosestPointToSegmentUncapped(
    point: Vector3,
    s1: Vector3,
    s2: Vector3,
  ): Vector3 {
    TransferContext.writeArguments(VECTOR3 to point, VECTOR3 to s1, VECTOR3 to s2)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GEOMETRY3D_GET_CLOSEST_POINT_TO_SEGMENT_UNCAPPED, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Tests if the 3D ray starting at [from] with the direction of [dir] intersects the triangle specified by [a], [b] and [c]. If yes, returns the point of intersection as [godot.core.Vector3]. If no intersection takes place, returns `null`.
   */
  public fun rayIntersectsTriangle(
    from: Vector3,
    dir: Vector3,
    a: Vector3,
    b: Vector3,
    c: Vector3,
  ): Any? {
    TransferContext.writeArguments(VECTOR3 to from, VECTOR3 to dir, VECTOR3 to a, VECTOR3 to b, VECTOR3 to c)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GEOMETRY3D_RAY_INTERSECTS_TRIANGLE,
        ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Tests if the segment ([from], [to]) intersects the triangle [a], [b], [c]. If yes, returns the point of intersection as [godot.core.Vector3]. If no intersection takes place, returns `null`.
   */
  public fun segmentIntersectsTriangle(
    from: Vector3,
    to: Vector3,
    a: Vector3,
    b: Vector3,
    c: Vector3,
  ): Any? {
    TransferContext.writeArguments(VECTOR3 to from, VECTOR3 to to, VECTOR3 to a, VECTOR3 to b, VECTOR3 to c)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GEOMETRY3D_SEGMENT_INTERSECTS_TRIANGLE, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Checks if the segment ([from], [to]) intersects the sphere that is located at [spherePosition] and has radius [sphereRadius]. If no, returns an empty [godot.PackedVector3Array]. If yes, returns a [godot.PackedVector3Array] containing the point of intersection and the sphere's normal at the point of intersection.
   */
  public fun segmentIntersectsSphere(
    from: Vector3,
    to: Vector3,
    spherePosition: Vector3,
    sphereRadius: Double,
  ): PackedVector3Array {
    TransferContext.writeArguments(VECTOR3 to from, VECTOR3 to to, VECTOR3 to spherePosition, DOUBLE to sphereRadius)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GEOMETRY3D_SEGMENT_INTERSECTS_SPHERE, PACKED_VECTOR3_ARRAY)
    return TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array
  }

  /**
   * Checks if the segment ([from], [to]) intersects the cylinder with height [height] that is centered at the origin and has radius [radius]. If no, returns an empty [godot.PackedVector3Array]. If an intersection takes place, the returned array contains the point of intersection and the cylinder's normal at the point of intersection.
   */
  public fun segmentIntersectsCylinder(
    from: Vector3,
    to: Vector3,
    height: Double,
    radius: Double,
  ): PackedVector3Array {
    TransferContext.writeArguments(VECTOR3 to from, VECTOR3 to to, DOUBLE to height, DOUBLE to radius)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GEOMETRY3D_SEGMENT_INTERSECTS_CYLINDER, PACKED_VECTOR3_ARRAY)
    return TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array
  }

  /**
   * Given a convex hull defined though the [godot.core.Plane]s in the array [planes], tests if the segment ([from], [to]) intersects with that hull. If an intersection is found, returns a [godot.PackedVector3Array] containing the point the intersection and the hull's normal. Otherwise, returns an empty array.
   */
  public fun segmentIntersectsConvex(
    from: Vector3,
    to: Vector3,
    planes: VariantArray<Plane>,
  ): PackedVector3Array {
    TransferContext.writeArguments(VECTOR3 to from, VECTOR3 to to, ARRAY to planes)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_GEOMETRY3D_SEGMENT_INTERSECTS_CONVEX, PACKED_VECTOR3_ARRAY)
    return TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array
  }

  /**
   * Clips the polygon defined by the points in [points] against the [plane] and returns the points of the clipped polygon.
   */
  public fun clipPolygon(points: PackedVector3Array, plane: Plane): PackedVector3Array {
    TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to points, PLANE to plane)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GEOMETRY3D_CLIP_POLYGON,
        PACKED_VECTOR3_ARRAY)
    return TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array
  }
}
