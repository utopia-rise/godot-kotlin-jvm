// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedInt32Array
import godot.core.PackedVector3Array
import godot.core.Plane
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.PACKED_VECTOR3_ARRAY
import godot.core.VariantType.PLANE
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Provides a set of helper functions to create geometric shapes, compute intersections between
 * shapes, and process various other geometric operations in 3D.
 */
@GodotBaseType
public object Geometry3D : Object() {
  public override fun new(scriptIndex: Int): Unit {
    getSingleton(ENGINECLASS_GEOMETRY3D)
  }

  /**
   * Calculates and returns all the vertex points of a convex shape defined by an array of [planes].
   */
  public final fun computeConvexMeshPoints(planes: VariantArray<Plane>): PackedVector3Array {
    TransferContext.writeArguments(ARRAY to planes)
    TransferContext.callMethod(rawPtr, MethodBindings.computeConvexMeshPointsPtr,
        PACKED_VECTOR3_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array)
  }

  /**
   * Returns an array with 6 [Plane]s that describe the sides of a box centered at the origin. The
   * box size is defined by [extents], which represents one (positive) corner of the box (i.e. half its
   * actual size).
   */
  public final fun buildBoxPlanes(extents: Vector3): VariantArray<Plane> {
    TransferContext.writeArguments(VECTOR3 to extents)
    TransferContext.callMethod(rawPtr, MethodBindings.buildBoxPlanesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Plane>)
  }

  /**
   * Returns an array of [Plane]s closely bounding a faceted cylinder centered at the origin with
   * radius [radius] and height [height]. The parameter [sides] defines how many planes will be
   * generated for the round part of the cylinder. The parameter [axis] describes the axis along which
   * the cylinder is oriented (0 for X, 1 for Y, 2 for Z).
   */
  @JvmOverloads
  public final fun buildCylinderPlanes(
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
   * radius [radius] and height [height]. The parameter [sides] defines how many planes will be
   * generated for the side part of the capsule, whereas [lats] gives the number of latitudinal steps
   * at the bottom and top of the capsule. The parameter [axis] describes the axis along which the
   * capsule is oriented (0 for X, 1 for Y, 2 for Z).
   */
  @JvmOverloads
  public final fun buildCapsulePlanes(
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
   * Given the two 3D segments ([p1], [p2]) and ([q1], [q2]), finds those two points on the two
   * segments that are closest to each other. Returns a [PackedVector3Array] that contains this point
   * on ([p1], [p2]) as well the accompanying point on ([q1], [q2]).
   */
  public final fun getClosestPointsBetweenSegments(
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
   * Returns the 3D point on the 3D segment ([s1], [s2]) that is closest to [point]. The returned
   * point will always be inside the specified segment.
   */
  public final fun getClosestPointToSegment(
    point: Vector3,
    s1: Vector3,
    s2: Vector3,
  ): Vector3 {
    TransferContext.writeArguments(VECTOR3 to point, VECTOR3 to s1, VECTOR3 to s2)
    TransferContext.callMethod(rawPtr, MethodBindings.getClosestPointToSegmentPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Returns the 3D point on the 3D line defined by ([s1], [s2]) that is closest to [point]. The
   * returned point can be inside the segment ([s1], [s2]) or outside of it, i.e. somewhere on the line
   * extending from the segment.
   */
  public final fun getClosestPointToSegmentUncapped(
    point: Vector3,
    s1: Vector3,
    s2: Vector3,
  ): Vector3 {
    TransferContext.writeArguments(VECTOR3 to point, VECTOR3 to s1, VECTOR3 to s2)
    TransferContext.callMethod(rawPtr, MethodBindings.getClosestPointToSegmentUncappedPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Returns a [Vector3] containing weights based on how close a 3D position ([point]) is to a
   * triangle's different vertices ([a], [b] and [c]). This is useful for interpolating between the
   * data of different vertices in a triangle. One example use case is using this to smoothly rotate
   * over a mesh instead of relying solely on face normals.
   * [url=https://en.wikipedia.org/wiki/Barycentric_coordinate_system]Here is a more detailed
   * explanation of barycentric coordinates.[/url]
   */
  public final fun getTriangleBarycentricCoords(
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
   * Tests if the 3D ray starting at [from] with the direction of [dir] intersects the triangle
   * specified by [a], [b] and [c]. If yes, returns the point of intersection as [Vector3]. If no
   * intersection takes place, returns `null`.
   */
  public final fun rayIntersectsTriangle(
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
   * Tests if the segment ([from], [to]) intersects the triangle [a], [b], [c]. If yes, returns the
   * point of intersection as [Vector3]. If no intersection takes place, returns `null`.
   */
  public final fun segmentIntersectsTriangle(
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
   * Checks if the segment ([from], [to]) intersects the sphere that is located at [spherePosition]
   * and has radius [sphereRadius]. If no, returns an empty [PackedVector3Array]. If yes, returns a
   * [PackedVector3Array] containing the point of intersection and the sphere's normal at the point of
   * intersection.
   */
  public final fun segmentIntersectsSphere(
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
   * Checks if the segment ([from], [to]) intersects the cylinder with height [height] that is
   * centered at the origin and has radius [radius]. If no, returns an empty [PackedVector3Array]. If
   * an intersection takes place, the returned array contains the point of intersection and the
   * cylinder's normal at the point of intersection.
   */
  public final fun segmentIntersectsCylinder(
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
   * Given a convex hull defined though the [Plane]s in the array [planes], tests if the segment
   * ([from], [to]) intersects with that hull. If an intersection is found, returns a
   * [PackedVector3Array] containing the point the intersection and the hull's normal. Otherwise,
   * returns an empty array.
   */
  public final fun segmentIntersectsConvex(
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
   * Clips the polygon defined by the points in [points] against the [plane] and returns the points
   * of the clipped polygon.
   */
  public final fun clipPolygon(points: PackedVector3Array, plane: Plane): PackedVector3Array {
    TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to points, PLANE to plane)
    TransferContext.callMethod(rawPtr, MethodBindings.clipPolygonPtr, PACKED_VECTOR3_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array)
  }

  /**
   * Tetrahedralizes the volume specified by a discrete set of [points] in 3D space, ensuring that
   * no point lies within the circumsphere of any resulting tetrahedron. The method returns a
   * [PackedInt32Array] where each tetrahedron consists of four consecutive point indices into the
   * [points] array (resulting in an array with `n * 4` elements, where `n` is the number of tetrahedra
   * found). If the tetrahedralization is unsuccessful, an empty [PackedInt32Array] is returned.
   */
  public final fun tetrahedralizeDelaunay(points: PackedVector3Array): PackedInt32Array {
    TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to points)
    TransferContext.callMethod(rawPtr, MethodBindings.tetrahedralizeDelaunayPtr,
        PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  internal object MethodBindings {
    public val computeConvexMeshPointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry3D", "compute_convex_mesh_points", 1936902142)

    public val buildBoxPlanesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry3D", "build_box_planes", 3622277145)

    public val buildCylinderPlanesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry3D", "build_cylinder_planes", 449920067)

    public val buildCapsulePlanesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry3D", "build_capsule_planes", 2113592876)

    public val getClosestPointsBetweenSegmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry3D", "get_closest_points_between_segments", 1056373962)

    public val getClosestPointToSegmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry3D", "get_closest_point_to_segment", 2168193209)

    public val getClosestPointToSegmentUncappedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry3D", "get_closest_point_to_segment_uncapped", 2168193209)

    public val getTriangleBarycentricCoordsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry3D", "get_triangle_barycentric_coords", 1362048029)

    public val rayIntersectsTrianglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry3D", "ray_intersects_triangle", 1718655448)

    public val segmentIntersectsTrianglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry3D", "segment_intersects_triangle", 1718655448)

    public val segmentIntersectsSpherePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry3D", "segment_intersects_sphere", 4080141172)

    public val segmentIntersectsCylinderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry3D", "segment_intersects_cylinder", 2361316491)

    public val segmentIntersectsConvexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry3D", "segment_intersects_convex", 537425332)

    public val clipPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry3D", "clip_polygon", 2603188319)

    public val tetrahedralizeDelaunayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Geometry3D", "tetrahedralize_delaunay", 1230191221)
  }
}
