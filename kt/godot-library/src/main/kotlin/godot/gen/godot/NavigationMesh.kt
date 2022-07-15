// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.AABB
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
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
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
  /**
   * The minimum floor to ceiling height that will still allow the floor area to be considered walkable.
   *
   * **Note:** While baking, this value will be rounded up to the nearest multiple of [cellHeight].
   */
  public open var agentHeight: Double
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

  /**
   * The minimum ledge height that is considered to still be traversable.
   *
   * **Note:** While baking, this value will be rounded down to the nearest multiple of [cellHeight].
   */
  public open var agentMaxClimb: Double
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

  /**
   * The maximum slope that is considered walkable, in degrees.
   */
  public open var agentMaxSlope: Double
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

  /**
   * The distance to erode/shrink the walkable area of the heightfield away from obstructions.
   *
   * **Note:** While baking, this value will be rounded up to the nearest multiple of [cellSize].
   */
  public open var agentRadius: Double
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

  /**
   * The Y axis cell size to use for fields.
   */
  public open var cellHeight: Double
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

  /**
   * The XZ plane cell size to use for fields.
   */
  public open var cellSize: Double
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

  /**
   * The sampling distance to use when generating the detail mesh, in cell unit.
   */
  public open var detailSampleDistance: Double
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

  /**
   * The maximum distance the detail mesh surface should deviate from heightfield, in cell unit.
   */
  public open var detailSampleMaxError: Double
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

  /**
   * The maximum distance a simplfied contour's border edges should deviate the original raw contour.
   */
  public open var edgeMaxError: Double
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

  /**
   * The maximum allowed length for contour edges along the border of the mesh.
   *
   * **Note:** While baking, this value will be rounded up to the nearest multiple of [cellSize].
   */
  public open var edgeMaxLength: Double
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

  /**
   * If the baking [AABB] has a volume the navigation mesh baking will be restricted to its enclosing area.
   */
  public open var filterBakingAabb: AABB
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_FILTER_BAKING_AABB,
          godot.core.VariantType.AABB)
      return TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB
    }
    set(`value`) {
      TransferContext.writeArguments(godot.core.VariantType.AABB to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_FILTER_BAKING_AABB, NIL)
    }

  /**
   * The position offset applied to the [filterBakingAabb] [AABB].
   */
  public open var filterBakingAabbOffset: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_FILTER_BAKING_AABB_OFFSET, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_FILTER_BAKING_AABB_OFFSET, NIL)
    }

  /**
   * If `true`, marks spans that are ledges as non-walkable.
   */
  public open var filterLedgeSpans: Boolean
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

  /**
   * If `true`, marks non-walkable spans as walkable if their maximum is within [agentMaxClimb] of a walkable neighbor.
   */
  public open var filterLowHangingObstacles: Boolean
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

  /**
   * If `true`, marks walkable spans as not walkable if the clearance above the span is less than [agentHeight].
   */
  public open var filterWalkableLowHeightSpans: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_FILTER_WALKABLE_LOW_HEIGHT_SPANS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_FILTER_WALKABLE_LOW_HEIGHT_SPANS, NIL)
    }

  /**
   * The physics layers to scan for static colliders.
   *
   * Only used when [geometryParsedGeometryType] is [PARSED_GEOMETRY_STATIC_COLLIDERS] or [PARSED_GEOMETRY_BOTH].
   */
  public open var geometryCollisionMask: Long
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

  /**
   * Determines which type of nodes will be parsed as geometry. See [enum ParsedGeometryType] for possible values.
   */
  public open var geometryParsedGeometryType: Long
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

  /**
   * The source of the geometry used when baking. See [enum SourceGeometryMode] for possible values.
   */
  public open var geometrySourceGeometryMode: Long
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

  /**
   * The name of the group to scan for geometry.
   *
   * Only used when [geometrySourceGeometryMode] is [SOURCE_GEOMETRY_GROUPS_WITH_CHILDREN] or [SOURCE_GEOMETRY_GROUPS_EXPLICIT].
   */
  public open var geometrySourceGroupName: String
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

  /**
   * The maximum number of vertices allowed for polygons generated during the contour to polygon conversion process.
   */
  public open var polygonVertsPerPoly: Double
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

  /**
   * Any regions with a size smaller than this will be merged with larger regions if possible.
   *
   * **Note:** This value will be squared to calculate the number of cells. For example, a value of 20 will set the number of cells to 400.
   */
  public open var regionMergeSize: Double
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

  /**
   * The minimum size of a region for it to be created.
   *
   * **Note:** This value will be squared to calculate the minimum number of cells allowed to form isolated island areas. For example, a value of 8 will set the number of cells to 64.
   */
  public open var regionMinSize: Double
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

  /**
   * Partitioning algorithm for creating the navigation mesh polys. See [enum SamplePartitionType] for possible values.
   */
  public open var samplePartitionType: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_SAMPLE_PARTITION_TYPE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_SAMPLE_PARTITION_TYPE, NIL)
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

  @CoreTypeHelper
  public open fun filterBakingAabb(schedule: AABB.() -> Unit): AABB = filterBakingAabb.apply{
      schedule(this)
      filterBakingAabb = this
  }


  @CoreTypeHelper
  public open fun filterBakingAabbOffset(schedule: Vector3.() -> Unit): Vector3 =
      filterBakingAabbOffset.apply{
      schedule(this)
      filterBakingAabbOffset = this
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
   * Returns whether the specified `bit` of the [geometryCollisionMask] is set.
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
   * If `value` is `true`, sets the specified `bit` in the [geometryCollisionMask].
   *
   * If `value` is `false`, clears the specified `bit` in the [geometryCollisionMask].
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
     * Parses [godot.StaticBody] colliders as geometry. The collider should be in any of the layers specified by [geometryCollisionMask].
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
     * Scans nodes in a group and their child nodes recursively for geometry. The group is specified by [geometrySourceGroupName].
     */
    SOURCE_GEOMETRY_GROUPS_WITH_CHILDREN(1),
    /**
     * Uses nodes in a group for geometry. The group is specified by [geometrySourceGroupName].
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
     * Parses [godot.StaticBody] colliders as geometry. The collider should be in any of the layers specified by [geometryCollisionMask].
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
     * Uses nodes in a group for geometry. The group is specified by [geometrySourceGroupName].
     */
    public final const val SOURCE_GEOMETRY_GROUPS_EXPLICIT: Long = 2

    /**
     * Scans nodes in a group and their child nodes recursively for geometry. The group is specified by [geometrySourceGroupName].
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
