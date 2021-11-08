// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PoolIntArray
import godot.core.PoolVector3Array
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_INT_ARRAY
import godot.core.VariantType.POOL_VECTOR3_ARRAY
import godot.core.VariantType.STRING
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A mesh to approximate the walkable areas and obstacles.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/124](https://godotengine.org/asset-library/asset/124)
 *
 * A navigation mesh is a collection of polygons that define which areas of an environment are traversable to aid agents in pathfinding through complicated spaces.
 */
@GodotBaseType
public open class NavigationMesh : Resource() {
  public open var agent_height: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_AGENT_HEIGHT,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_AGENT_HEIGHT,
          NIL)
    }

  public open var agent_maxClimb: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_AGENT_MAX_CLIMB, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_AGENT_MAX_CLIMB, NIL)
    }

  public open var agent_maxSlope: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_AGENT_MAX_SLOPE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_AGENT_MAX_SLOPE, NIL)
    }

  public open var agent_radius: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_AGENT_RADIUS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_AGENT_RADIUS,
          NIL)
    }

  public open var cell_height: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_CELL_HEIGHT,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_CELL_HEIGHT,
          NIL)
    }

  public open var cell_size: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_CELL_SIZE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_CELL_SIZE, NIL)
    }

  public open var detail_sampleDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_DETAIL_SAMPLE_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_DETAIL_SAMPLE_DISTANCE, NIL)
    }

  public open var detail_sampleMaxError: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_DETAIL_SAMPLE_MAX_ERROR, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_DETAIL_SAMPLE_MAX_ERROR, NIL)
    }

  public open var edge_maxError: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_EDGE_MAX_ERROR,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_EDGE_MAX_ERROR,
          NIL)
    }

  public open var edge_maxLength: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_EDGE_MAX_LENGTH, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_EDGE_MAX_LENGTH, NIL)
    }

  public open var filter_filterWalkableLowHeightSpans: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_FILTER_FILTER_WALKABLE_LOW_HEIGHT_SPANS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_FILTER_FILTER_WALKABLE_LOW_HEIGHT_SPANS, NIL)
    }

  public open var filter_ledgeSpans: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_FILTER_LEDGE_SPANS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_FILTER_LEDGE_SPANS, NIL)
    }

  public open var filter_lowHangingObstacles: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_FILTER_LOW_HANGING_OBSTACLES, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_FILTER_LOW_HANGING_OBSTACLES, NIL)
    }

  public open var geometry_collisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_GEOMETRY_COLLISION_MASK, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_GEOMETRY_COLLISION_MASK, NIL)
    }

  public open var geometry_parsedGeometryType: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_GEOMETRY_PARSED_GEOMETRY_TYPE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_GEOMETRY_PARSED_GEOMETRY_TYPE, NIL)
    }

  public open var geometry_sourceGeometryMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_GEOMETRY_SOURCE_GEOMETRY_MODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_GEOMETRY_SOURCE_GEOMETRY_MODE, NIL)
    }

  public open var geometry_sourceGroupName: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_GEOMETRY_SOURCE_GROUP_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_GEOMETRY_SOURCE_GROUP_NAME, NIL)
    }

  public open var polygon_vertsPerPoly: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_POLYGON_VERTS_PER_POLY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_POLYGON_VERTS_PER_POLY, NIL)
    }

  public open var region_mergeSize: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_REGION_MERGE_SIZE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_REGION_MERGE_SIZE, NIL)
    }

  public open var region_minSize: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_REGION_MIN_SIZE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_REGION_MIN_SIZE, NIL)
    }

  public open var samplePartitionType_samplePartitionType: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_SAMPLE_PARTITION_TYPE_SAMPLE_PARTITION_TYPE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_SAMPLE_PARTITION_TYPE_SAMPLE_PARTITION_TYPE,
          NIL)
    }

  public open var vertices: PoolVector3Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_VERTICES,
          POOL_VECTOR3_ARRAY)
      return TransferContext.readReturnValue(POOL_VECTOR3_ARRAY, false) as PoolVector3Array
    }
    set(`value`) {
      TransferContext.writeArguments(POOL_VECTOR3_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_VERTICES, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_NAVIGATIONMESH)
  }

  public open fun _getPolygons(): VariantArray<Any?> {
    throw NotImplementedError("_get_polygons is not implemented for NavigationMesh")
  }

  public open fun _setPolygons(polygons: VariantArray<Any?>): Unit {
  }

  /**
   * Adds a polygon using the indices of the vertices you get when calling [getVertices].
   */
  public open fun addPolygon(polygon: PoolIntArray): Unit {
    TransferContext.writeArguments(POOL_INT_ARRAY to polygon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_ADD_POLYGON, NIL)
  }

  /**
   * Clears the array of polygons, but it doesn't clear the array of vertices.
   */
  public open fun clearPolygons(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_CLEAR_POLYGONS, NIL)
  }

  /**
   * Initializes the navigation mesh by setting the vertices and indices according to a [godot.Mesh].
   */
  public open fun createFromMesh(mesh: Mesh): Unit {
    TransferContext.writeArguments(OBJECT to mesh)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_CREATE_FROM_MESH,
        NIL)
  }

  /**
   * Returns whether the specified `bit` of the [geometry/collisionMask] is set.
   */
  public open fun getCollisionMaskBit(bit: Long): Boolean {
    TransferContext.writeArguments(LONG to bit)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_COLLISION_MASK_BIT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns a [godot.core.PoolIntArray] containing the indices of the vertices of a created polygon.
   */
  public open fun getPolygon(idx: Long): PoolIntArray {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_POLYGON,
        POOL_INT_ARRAY)
    return TransferContext.readReturnValue(POOL_INT_ARRAY, false) as PoolIntArray
  }

  /**
   * Returns the number of polygons in the navigation mesh.
   */
  public open fun getPolygonCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_POLYGON_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * If `value` is `true`, sets the specified `bit` in the [geometry/collisionMask].
   *
   * If `value` is `false`, clears the specified `bit` in the [geometry/collisionMask].
   */
  public open fun setCollisionMaskBit(bit: Long, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to bit, BOOL to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_COLLISION_MASK_BIT, NIL)
  }

  public enum class ParsedGeometryType(
    id: Long
  ) {
    /**
     * Parses mesh instances as geometry. This includes [godot.MeshInstance], [godot.CSGShape], and [godot.GridMap] nodes.
     */
    PARSED_GEOMETRY_MESH_INSTANCES(0),
    /**
     * Parses [godot.StaticBody] colliders as geometry. The collider should be in any of the layers specified by [geometry/collisionMask].
     */
    PARSED_GEOMETRY_STATIC_COLLIDERS(1),
    /**
     * Both [PARSED_GEOMETRY_MESH_INSTANCES] and [PARSED_GEOMETRY_STATIC_COLLIDERS].
     */
    PARSED_GEOMETRY_BOTH(2),
    /**
     * Represents the size of the [enum ParsedGeometryType] enum.
     */
    PARSED_GEOMETRY_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class SamplePartitionType(
    id: Long
  ) {
    /**
     * Watershed partitioning. Generally the best choice if you precompute the navigation mesh, use this if you have large open areas.
     */
    SAMPLE_PARTITION_WATERSHED(0),
    /**
     * Monotone partitioning. Use this if you want fast navigation mesh generation.
     */
    SAMPLE_PARTITION_MONOTONE(1),
    /**
     * Layer partitioning. Good choice to use for tiled navigation mesh with medium and small sized tiles.
     */
    SAMPLE_PARTITION_LAYERS(2),
    /**
     * Represents the size of the [enum SamplePartitionType] enum.
     */
    SAMPLE_PARTITION_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class SourceGeometryMode(
    id: Long
  ) {
    /**
     * Scans the child nodes of [godot.NavigationMeshInstance] recursively for geometry.
     */
    SOURCE_GEOMETRY_NAVMESH_CHILDREN(0),
    /**
     * Scans nodes in a group and their child nodes recursively for geometry. The group is specified by [geometry/sourceGroupName].
     */
    SOURCE_GEOMETRY_GROUPS_WITH_CHILDREN(1),
    /**
     * Uses nodes in a group for geometry. The group is specified by [geometry/sourceGroupName].
     */
    SOURCE_GEOMETRY_GROUPS_EXPLICIT(2),
    /**
     * Represents the size of the [enum SourceGeometryMode] enum.
     */
    SOURCE_GEOMETRY_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Both [PARSED_GEOMETRY_MESH_INSTANCES] and [PARSED_GEOMETRY_STATIC_COLLIDERS].
     */
    public final const val PARSED_GEOMETRY_BOTH: Long = 2

    /**
     * Represents the size of the [enum ParsedGeometryType] enum.
     */
    public final const val PARSED_GEOMETRY_MAX: Long = 3

    /**
     * Parses mesh instances as geometry. This includes [godot.MeshInstance], [godot.CSGShape], and [godot.GridMap] nodes.
     */
    public final const val PARSED_GEOMETRY_MESH_INSTANCES: Long = 0

    /**
     * Parses [godot.StaticBody] colliders as geometry. The collider should be in any of the layers specified by [geometry/collisionMask].
     */
    public final const val PARSED_GEOMETRY_STATIC_COLLIDERS: Long = 1

    /**
     * Layer partitioning. Good choice to use for tiled navigation mesh with medium and small sized tiles.
     */
    public final const val SAMPLE_PARTITION_LAYERS: Long = 2

    /**
     * Represents the size of the [enum SamplePartitionType] enum.
     */
    public final const val SAMPLE_PARTITION_MAX: Long = 3

    /**
     * Monotone partitioning. Use this if you want fast navigation mesh generation.
     */
    public final const val SAMPLE_PARTITION_MONOTONE: Long = 1

    /**
     * Watershed partitioning. Generally the best choice if you precompute the navigation mesh, use this if you have large open areas.
     */
    public final const val SAMPLE_PARTITION_WATERSHED: Long = 0

    /**
     * Uses nodes in a group for geometry. The group is specified by [geometry/sourceGroupName].
     */
    public final const val SOURCE_GEOMETRY_GROUPS_EXPLICIT: Long = 2

    /**
     * Scans nodes in a group and their child nodes recursively for geometry. The group is specified by [geometry/sourceGroupName].
     */
    public final const val SOURCE_GEOMETRY_GROUPS_WITH_CHILDREN: Long = 1

    /**
     * Represents the size of the [enum SourceGeometryMode] enum.
     */
    public final const val SOURCE_GEOMETRY_MAX: Long = 3

    /**
     * Scans the child nodes of [godot.NavigationMeshInstance] recursively for geometry.
     */
    public final const val SOURCE_GEOMETRY_NAVMESH_CHILDREN: Long = 0
  }
}
