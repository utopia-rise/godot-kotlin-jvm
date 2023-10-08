// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.AABB
import godot.core.PackedInt32Array
import godot.core.PackedVector3Array
import godot.core.StringName
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.PACKED_VECTOR3_ARRAY
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A navigation mesh that defines traversable areas and obstacles.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/navigation/navigation_using_navigationmeshes.html]($DOCS_URL/tutorials/navigation/navigation_using_navigationmeshes.html)
 *
 * A navigation mesh is a collection of polygons that define which areas of an environment are traversable to aid agents in pathfinding through complicated spaces.
 */
@GodotBaseType
public open class NavigationMesh : Resource() {
  public var vertices: PackedVector3Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_VERTICES,
          PACKED_VECTOR3_ARRAY)
      return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_VERTICES, NIL)
    }

  /**
   * Partitioning algorithm for creating the navigation mesh polys. See [enum SamplePartitionType] for possible values.
   */
  public var samplePartitionType: SamplePartitionType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_SAMPLE_PARTITION_TYPE, LONG)
      return NavigationMesh.SamplePartitionType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_SAMPLE_PARTITION_TYPE, NIL)
    }

  /**
   * Determines which type of nodes will be parsed as geometry. See [enum ParsedGeometryType] for possible values.
   */
  public var geometryParsedGeometryType: ParsedGeometryType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_PARSED_GEOMETRY_TYPE, LONG)
      return NavigationMesh.ParsedGeometryType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_PARSED_GEOMETRY_TYPE, NIL)
    }

  /**
   * The physics layers to scan for static colliders.
   *
   * Only used when [geometryParsedGeometryType] is [PARSED_GEOMETRY_STATIC_COLLIDERS] or [PARSED_GEOMETRY_BOTH].
   */
  public var geometryCollisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_COLLISION_MASK,
          LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_COLLISION_MASK,
          NIL)
    }

  /**
   * The source of the geometry used when baking. See [enum SourceGeometryMode] for possible values.
   */
  public var geometrySourceGeometryMode: SourceGeometryMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_SOURCE_GEOMETRY_MODE, LONG)
      return NavigationMesh.SourceGeometryMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_SOURCE_GEOMETRY_MODE, NIL)
    }

  /**
   * The name of the group to scan for geometry.
   *
   * Only used when [geometrySourceGeometryMode] is [SOURCE_GEOMETRY_GROUPS_WITH_CHILDREN] or [SOURCE_GEOMETRY_GROUPS_EXPLICIT].
   */
  public var geometrySourceGroupName: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_SOURCE_GROUP_NAME, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_SOURCE_GROUP_NAME, NIL)
    }

  /**
   * The cell size used to rasterize the navigation mesh vertices on the XZ plane. Must match with the cell size on the navigation map.
   */
  public var cellSize: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_CELL_SIZE,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_CELL_SIZE, NIL)
    }

  /**
   * The cell height used to rasterize the navigation mesh vertices on the Y axis. Must match with the cell height on the navigation map.
   */
  public var cellHeight: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_CELL_HEIGHT,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_CELL_HEIGHT,
          NIL)
    }

  /**
   * The minimum floor to ceiling height that will still allow the floor area to be considered walkable.
   *
   * **Note:** While baking, this value will be rounded up to the nearest multiple of [cellHeight].
   */
  public var agentHeight: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_AGENT_HEIGHT,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_AGENT_HEIGHT,
          NIL)
    }

  /**
   * The distance to erode/shrink the walkable area of the heightfield away from obstructions.
   *
   * **Note:** While baking, this value will be rounded up to the nearest multiple of [cellSize].
   */
  public var agentRadius: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_AGENT_RADIUS,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_AGENT_RADIUS,
          NIL)
    }

  /**
   * The minimum ledge height that is considered to still be traversable.
   *
   * **Note:** While baking, this value will be rounded down to the nearest multiple of [cellHeight].
   */
  public var agentMaxClimb: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_AGENT_MAX_CLIMB, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_AGENT_MAX_CLIMB, NIL)
    }

  /**
   * The maximum slope that is considered walkable, in degrees.
   */
  public var agentMaxSlope: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_AGENT_MAX_SLOPE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_AGENT_MAX_SLOPE, NIL)
    }

  /**
   * The minimum size of a region for it to be created.
   *
   * **Note:** This value will be squared to calculate the minimum number of cells allowed to form isolated island areas. For example, a value of 8 will set the number of cells to 64.
   */
  public var regionMinSize: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_REGION_MIN_SIZE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_REGION_MIN_SIZE, NIL)
    }

  /**
   * Any regions with a size smaller than this will be merged with larger regions if possible.
   *
   * **Note:** This value will be squared to calculate the number of cells. For example, a value of 20 will set the number of cells to 400.
   */
  public var regionMergeSize: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_REGION_MERGE_SIZE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_REGION_MERGE_SIZE, NIL)
    }

  /**
   * The maximum allowed length for contour edges along the border of the mesh.
   *
   * **Note:** While baking, this value will be rounded up to the nearest multiple of [cellSize].
   */
  public var edgeMaxLength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_EDGE_MAX_LENGTH, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_EDGE_MAX_LENGTH, NIL)
    }

  /**
   * The maximum distance a simplified contour's border edges should deviate the original raw contour.
   */
  public var edgeMaxError: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_EDGE_MAX_ERROR,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_EDGE_MAX_ERROR,
          NIL)
    }

  /**
   * The maximum number of vertices allowed for polygons generated during the contour to polygon conversion process.
   */
  public var verticesPerPolygon: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_VERTICES_PER_POLYGON, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_VERTICES_PER_POLYGON, NIL)
    }

  /**
   * The sampling distance to use when generating the detail mesh, in cell unit.
   */
  public var detailSampleDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_DETAIL_SAMPLE_DISTANCE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_DETAIL_SAMPLE_DISTANCE, NIL)
    }

  /**
   * The maximum distance the detail mesh surface should deviate from heightfield, in cell unit.
   */
  public var detailSampleMaxError: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_DETAIL_SAMPLE_MAX_ERROR, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_DETAIL_SAMPLE_MAX_ERROR, NIL)
    }

  /**
   * If `true`, marks non-walkable spans as walkable if their maximum is within [agentMaxClimb] of a walkable neighbor.
   */
  public var filterLowHangingObstacles: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_FILTER_LOW_HANGING_OBSTACLES, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_FILTER_LOW_HANGING_OBSTACLES, NIL)
    }

  /**
   * If `true`, marks spans that are ledges as non-walkable.
   */
  public var filterLedgeSpans: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_FILTER_LEDGE_SPANS, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_FILTER_LEDGE_SPANS, NIL)
    }

  /**
   * If `true`, marks walkable spans as not walkable if the clearance above the span is less than [agentHeight].
   */
  public var filterWalkableLowHeightSpans: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_FILTER_WALKABLE_LOW_HEIGHT_SPANS, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_FILTER_WALKABLE_LOW_HEIGHT_SPANS, NIL)
    }

  /**
   * If the baking [AABB] has a volume the navigation mesh baking will be restricted to its enclosing area.
   */
  @CoreTypeLocalCopy
  public var filterBakingAabb: AABB
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_FILTER_BAKING_AABB,
          godot.core.VariantType.AABB)
      return (TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB)
    }
    set(`value`) {
      TransferContext.writeArguments(godot.core.VariantType.AABB to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_FILTER_BAKING_AABB, NIL)
    }

  /**
   * The position offset applied to the [filterBakingAabb] [AABB].
   */
  @CoreTypeLocalCopy
  public var filterBakingAabbOffset: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_FILTER_BAKING_AABB_OFFSET, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_FILTER_BAKING_AABB_OFFSET, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_NAVIGATIONMESH, scriptIndex)
    return true
  }

  /**
   * If the baking [AABB] has a volume the navigation mesh baking will be restricted to its enclosing area.
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
   * val myCoreType = navigationmesh.filterBakingAabb
   * //Your changes
   * navigationmesh.filterBakingAabb = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun filterBakingAabbMutate(block: AABB.() -> Unit): AABB = filterBakingAabb.apply{
      block(this)
      filterBakingAabb = this
  }


  /**
   * The position offset applied to the [filterBakingAabb] [AABB].
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
   * val myCoreType = navigationmesh.filterBakingAabbOffset
   * //Your changes
   * navigationmesh.filterBakingAabbOffset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun filterBakingAabbOffsetMutate(block: Vector3.() -> Unit): Vector3 =
      filterBakingAabbOffset.apply{
      block(this)
      filterBakingAabbOffset = this
  }


  /**
   * Based on [value], enables or disables the specified layer in the [geometryCollisionMask], given a [layerNumber] between 1 and 32.
   */
  public fun setCollisionMaskValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_SET_COLLISION_MASK_VALUE, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [geometryCollisionMask] is enabled, given a [layerNumber] between 1 and 32.
   */
  public fun getCollisionMaskValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_COLLISION_MASK_VALUE, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Adds a polygon using the indices of the vertices you get when calling [getVertices].
   */
  public fun addPolygon(polygon: PackedInt32Array): Unit {
    TransferContext.writeArguments(PACKED_INT_32_ARRAY to polygon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_ADD_POLYGON, NIL)
  }

  /**
   * Returns the number of polygons in the navigation mesh.
   */
  public fun getPolygonCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_POLYGON_COUNT,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns a [godot.PackedInt32Array] containing the indices of the vertices of a created polygon.
   */
  public fun getPolygon(idx: Int): PackedInt32Array {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_GET_POLYGON,
        PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Clears the array of polygons, but it doesn't clear the array of vertices.
   */
  public fun clearPolygons(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_CLEAR_POLYGONS, NIL)
  }

  /**
   * Initializes the navigation mesh by setting the vertices and indices according to a [godot.Mesh].
   *
   * **Note:** The given [mesh] must be of type [godot.Mesh.PRIMITIVE_TRIANGLES] and have an index array.
   */
  public fun createFromMesh(mesh: Mesh): Unit {
    TransferContext.writeArguments(OBJECT to mesh)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESH_CREATE_FROM_MESH,
        NIL)
  }

  public enum class SamplePartitionType(
    id: Long,
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class ParsedGeometryType(
    id: Long,
  ) {
    /**
     * Parses mesh instances as geometry. This includes [godot.MeshInstance3D], [godot.CSGShape3D], and [godot.GridMap] nodes.
     */
    PARSED_GEOMETRY_MESH_INSTANCES(0),
    /**
     * Parses [godot.StaticBody3D] colliders as geometry. The collider should be in any of the layers specified by [geometryCollisionMask].
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class SourceGeometryMode(
    id: Long,
  ) {
    /**
     * Scans the child nodes of the root node recursively for geometry.
     */
    SOURCE_GEOMETRY_ROOT_NODE_CHILDREN(0),
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object
}
