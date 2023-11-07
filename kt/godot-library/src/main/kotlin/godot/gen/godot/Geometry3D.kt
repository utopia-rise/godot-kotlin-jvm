// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector3Array
import godot.core.Plane
import godot.core.TypeManager
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
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

/**
 * Provides a set of helper functions to create geometric shapes, compute intersections between
 * shapes, and process various other geometric operations in 3D.
 */
@GodotBaseType
public object Geometry3D : Object() {
  public override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_GEOMETRY3D)
    return false
  }

  /**
   * Calculates and returns all the vertex points of a convex shape defined by an array of [param
   * planes].
   */
  public fun computeConvexMeshPoints(planes: VariantArray<Plane>): PackedVector3Array {
    TransferContext.writeArguments(ARRAY to planes)
    TransferContext.callMethod(rawPtr, MethodBindings.computeConvexMeshPointsPtr,
        PACKED_VECTOR3_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array)
  }

  /**
   * Returns an array with 6 [Plane]s that describe the sides of a box centered at the origin. The
   * box size is defined by [param extents], which represents one (positive) corner of the box (i.e.
   * half its actual size).
   */
  public fun buildBoxPlanes(extents: Vector3): VariantArray<Plane> {
    TransferContext.writeArguments(VECTOR3 to extents)
    TransferContext.callMethod(rawPtr, MethodBindings.buildBoxPlanesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Plane>)
  }

  /**
   * Returns an array of [Plane]s closely bounding a faceted cylinder centered at the origin with
   * radius [param radius] and height [param height]. The parameter [param sides] defines how many
   * planes will be generated for the round part of the cylinder. The parameter [param axis] describes
   * the axis along which the cylinder is oriented (0 for X, 1 for Y, 2 for Z).
   */
  @JvmOverloads
  public fun buildCylinderPlanes(
    radius: Float,
    height: Float,
    sides: Int,
    axis: Vector3.Axis = Vector3.Axis.Z,
  ): VariantArray<Plane> {
    TransferContext.writeArguments(DOUBLE to radius.toDouble(), DOUBLE to height.toDouble(), LONG to sides.toLong(), LONG to axis.id)
    TransferContext.callMethod(rawPtr, MethodBindings.buildCylinderPlanesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Plane>)
  }

  /**
   * Returns an array of [Plane]s closely bounding a faceted capsule centered at the origin with
   * radius [param radius] and height [param height]. The parameter [param sides] defines how many
   * planes will be generated for the side part of the capsule, whereas [param lats] gives the number
   * of latitudinal steps at the bottom and top of the capsule. The parameter [param axis] describes
   * the axis along which the capsule is oriented (0 for X, 1 for Y, 2 for Z).
   */
  @JvmOverloads
  public fun buildCapsulePlanes(
    radius: Float,
    height: Float,
    sides: Int,
    lats: Int,
    axis: Vector3.Axis = Vector3.Axis.Z,
  ): VariantArray<Plane> {
    TransferContext.writeArguments(DOUBLE to radius.toDouble(), DOUBLE to height.toDouble(), LONG to sides.toLong(), LONG to lats.toLong(), LONG to axis.id)
    TransferContext.callMethod(rawPtr, MethodBindings.buildCapsulePlanesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Plane>)
  }

  /**
   * Given the two 3D segments ([param p1], [param p2]) and ([param q1], [param q2]), finds those
   * two points on the two segments that are closest to each other. Returns a [PackedVector3Array] that
   * contains this point on ([param p1], [param p2]) as well the accompanying point on ([param q1],
   * [param q2]).
   */
  public fun getClosestPointsBetweenSegments(
    p1: Vector3,
    p2: Vector3,
    q1: Vector3,
    q2: Vector3,
  ): PackedVector3Array {
    TransferContext.writeArguments(VECTOR3 to p1, VECTOR3 to p2, VECTOR3 to q1, VECTOR3 to q2)
    TransferContext.callMethod(rawPtr, MethodBindings.getClosestPointsBetweenSegmentsPtr,
        PACKED_VECTOR3_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array)
  }

  /**
   * Returns the 3D point on the 3D segment ([param s1], [param s2]) that is closest to [param
   * point]. The returned point will always be inside the specified segment.
   */
  public fun getClosestPointToSegment(
    point: Vector3,
    s1: Vector3,
    s2: Vector3,
  ): Vector3 {
    TransferContext.writeArguments(VECTOR3 to point, VECTOR3 to s1, VECTOR3 to s2)
    TransferContext.callMethod(rawPtr, MethodBindings.getClosestPointToSegmentPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Returns the 3D point on the 3D line defined by ([param s1], [param s2]) that is closest to
   * [param point]. The returned point can be inside the segment ([param s1], [param s2]) or outside of
   * it, i.e. somewhere on the line extending from the segment.
   */
  public fun getClosestPointToSegmentUncapped(
    point: Vector3,
    s1: Vector3,
    s2: Vector3,
  ): Vector3 {
    TransferContext.writeArguments(VECTOR3 to point, VECTOR3 to s1, VECTOR3 to s2)
    TransferContext.callMethod(rawPtr, MethodBindings.getClosestPointToSegmentUncappedPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Returns a [Vector3] containing weights based on how close a 3D position ([param point]) is to a
   * triangle's different vertices ([param a], [param b] and [param c]). This is useful for
   * interpolating between the data of different vertices in a triangle. One example use case is using
   * this to smoothly rotate over a mesh instead of relying solely on face normals.
   * [url=https://en.wikipedia.org/wiki/Barycentric_coordinate_system]Here is a more detailed
   * explanation of barycentric coordinates.[/url]
   */
  public fun getTriangleBarycentricCoords(
    point: Vector3,
    a: Vector3,
    b: Vector3,
    c: Vector3,
  ): Vector3 {
    TransferContext.writeArguments(VECTOR3 to point, VECTOR3 to a, VECTOR3 to b, VECTOR3 to c)
    TransferContext.callMethod(rawPtr, MethodBindings.getTriangleBarycentricCoordsPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Tests if the 3D ray starting at [param from] with the direction of [param dir] intersects the
   * triangle specified by [param a], [param b] and [param c]. If yes, returns the point of
   * intersection as [Vector3]. If no intersection takes place, returns `null`.
   */
  public fun rayIntersectsTriangle(
    from: Vector3,
    dir: Vector3,
    a: Vector3,
    b: Vector3,
    c: Vector3,
  ): Any? {
    TransferContext.writeArguments(VECTOR3 to from, VECTOR3 to dir, VECTOR3 to a, VECTOR3 to b, VECTOR3 to c)
    TransferContext.callMethod(rawPtr, MethodBindings.rayIntersectsTrianglePtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Tests if the segment ([param from], [param to]) intersects the triangle [param a], [param b],
   * [param c]. If yes, returns the point of intersection as [Vector3]. If no intersection takes place,
   * returns `null`.
   */
  public fun segmentIntersectsTriangle(
    from: Vector3,
    to: Vector3,
    a: Vector3,
    b: Vector3,
    c: Vector3,
  ): Any? {
    TransferContext.writeArguments(VECTOR3 to from, VECTOR3 to to, VECTOR3 to a, VECTOR3 to b, VECTOR3 to c)
    TransferContext.callMethod(rawPtr, MethodBindings.segmentIntersectsTrianglePtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Checks if the segment ([param from], [param to]) intersects the sphere that is located at
   * [param sphere_position] and has radius [param sphere_radius]. If no, returns an empty
   * [PackedVector3Array]. If yes, returns a [PackedVector3Array] containing the point of intersection
   * and the sphere's normal at the point of intersection.
   */
  public fun segmentIntersectsSphere(
    from: Vector3,
    to: Vector3,
    spherePosition: Vector3,
    sphereRadius: Float,
  ): PackedVector3Array {
    TransferContext.writeArguments(VECTOR3 to from, VECTOR3 to to, VECTOR3 to spherePosition, DOUBLE to sphereRadius.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.segmentIntersectsSpherePtr,
        PACKED_VECTOR3_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array)
  }

  /**
   * Checks if the segment ([param from], [param to]) intersects the cylinder with height [param
   * height] that is centered at the origin and has radius [param radius]. If no, returns an empty
   * [PackedVector3Array]. If an intersection takes place, the returned array contains the point of
   * intersection and the cylinder's normal at the point of intersection.
   */
  public fun segmentIntersectsCylinder(
    from: Vector3,
    to: Vector3,
    height: Float,
    radius: Float,
  ): PackedVector3Array {
    TransferContext.writeArguments(VECTOR3 to from, VECTOR3 to to, DOUBLE to height.toDouble(), DOUBLE to radius.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.segmentIntersectsCylinderPtr,
        PACKED_VECTOR3_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array)
  }

  /**
   * Given a convex hull defined though the [Plane]s in the array [param planes], tests if the
   * segment ([param from], [param to]) intersects with that hull. If an intersection is found, returns
   * a [PackedVector3Array] containing the point the intersection and the hull's normal. Otherwise,
   * returns an empty array.
   */
  public fun segmentIntersectsConvex(
    from: Vector3,
    to: Vector3,
    planes: VariantArray<Plane>,
  ): PackedVector3Array {
    TransferContext.writeArguments(VECTOR3 to from, VECTOR3 to to, ARRAY to planes)
    TransferContext.callMethod(rawPtr, MethodBindings.segmentIntersectsConvexPtr,
        PACKED_VECTOR3_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array)
  }

  /**
   * Clips the polygon defined by the points in [param points] against the [param plane] and returns
   * the points of the clipped polygon.
   */
  public fun clipPolygon(points: PackedVector3Array, plane: Plane): PackedVector3Array {
    TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to points, PLANE to plane)
    TransferContext.callMethod(rawPtr, MethodBindings.clipPolygonPtr, PACKED_VECTOR3_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array)
  }

  internal object MethodBindings {
    public val computeConvexMeshPointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry3D", "compute_convex_mesh_points")

    public val buildBoxPlanesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry3D", "build_box_planes")

    public val buildCylinderPlanesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry3D", "build_cylinder_planes")

    public val buildCapsulePlanesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry3D", "build_capsule_planes")

    public val getClosestPointsBetweenSegmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry3D", "get_closest_points_between_segments")

    public val getClosestPointToSegmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry3D", "get_closest_point_to_segment")

    public val getClosestPointToSegmentUncappedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry3D", "get_closest_point_to_segment_uncapped")

    public val getTriangleBarycentricCoordsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry3D", "get_triangle_barycentric_coords")

    public val rayIntersectsTrianglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry3D", "ray_intersects_triangle")

    public val segmentIntersectsTrianglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry3D", "segment_intersects_triangle")

    public val segmentIntersectsSpherePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry3D", "segment_intersects_sphere")

    public val segmentIntersectsCylinderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry3D", "segment_intersects_cylinder")

    public val segmentIntersectsConvexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry3D", "segment_intersects_convex")

    public val clipPolygonPtr: VoidPtr = TypeManager.getMethodBindPtr("Geometry3D", "clip_polygon")
  }
}
