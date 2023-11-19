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
import godot.core.TypeManager
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
import godot.util.VoidPtr
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
      TransferContext.callMethod(rawPtr, MethodBindings.getVerticesPtr, PACKED_VECTOR3_ARRAY)
      return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVerticesPtr, NIL)
    }

  /**
   * Partitioning algorithm for creating the navigation mesh polys. See [enum SamplePartitionType] for possible values.
   */
  public var samplePartitionType: SamplePartitionType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSamplePartitionTypePtr, LONG)
      return NavigationMesh.SamplePartitionType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setSamplePartitionTypePtr, NIL)
    }

  /**
   * Determines which type of nodes will be parsed as geometry. See [enum ParsedGeometryType] for possible values.
   */
  public var geometryParsedGeometryType: ParsedGeometryType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getParsedGeometryTypePtr, LONG)
      return NavigationMesh.ParsedGeometryType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setParsedGeometryTypePtr, NIL)
    }

  /**
   * The physics layers to scan for static colliders.
   *
   * Only used when [geometryParsedGeometryType] is [PARSED_GEOMETRY_STATIC_COLLIDERS] or [PARSED_GEOMETRY_BOTH].
   */
  public var geometryCollisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCollisionMaskPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCollisionMaskPtr, NIL)
    }

  /**
   * The source of the geometry used when baking. See [enum SourceGeometryMode] for possible values.
   */
  public var geometrySourceGeometryMode: SourceGeometryMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSourceGeometryModePtr, LONG)
      return NavigationMesh.SourceGeometryMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setSourceGeometryModePtr, NIL)
    }

  /**
   * The name of the group to scan for geometry.
   *
   * Only used when [geometrySourceGeometryMode] is [SOURCE_GEOMETRY_GROUPS_WITH_CHILDREN] or [SOURCE_GEOMETRY_GROUPS_EXPLICIT].
   */
  public var geometrySourceGroupName: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSourceGroupNamePtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSourceGroupNamePtr, NIL)
    }

  /**
   * The cell size used to rasterize the navigation mesh vertices on the XZ plane. Must match with the cell size on the navigation map.
   */
  public var cellSize: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCellSizePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setCellSizePtr, NIL)
    }

  /**
   * The cell height used to rasterize the navigation mesh vertices on the Y axis. Must match with the cell height on the navigation map.
   */
  public var cellHeight: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCellHeightPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setCellHeightPtr, NIL)
    }

  /**
   * The minimum floor to ceiling height that will still allow the floor area to be considered walkable.
   *
   * **Note:** While baking, this value will be rounded up to the nearest multiple of [cellHeight].
   */
  public var agentHeight: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAgentHeightPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAgentHeightPtr, NIL)
    }

  /**
   * The distance to erode/shrink the walkable area of the heightfield away from obstructions.
   *
   * **Note:** While baking, this value will be rounded up to the nearest multiple of [cellSize].
   */
  public var agentRadius: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAgentRadiusPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAgentRadiusPtr, NIL)
    }

  /**
   * The minimum ledge height that is considered to still be traversable.
   *
   * **Note:** While baking, this value will be rounded down to the nearest multiple of [cellHeight].
   */
  public var agentMaxClimb: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAgentMaxClimbPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAgentMaxClimbPtr, NIL)
    }

  /**
   * The maximum slope that is considered walkable, in degrees.
   */
  public var agentMaxSlope: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAgentMaxSlopePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAgentMaxSlopePtr, NIL)
    }

  /**
   * The minimum size of a region for it to be created.
   *
   * **Note:** This value will be squared to calculate the minimum number of cells allowed to form isolated island areas. For example, a value of 8 will set the number of cells to 64.
   */
  public var regionMinSize: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRegionMinSizePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRegionMinSizePtr, NIL)
    }

  /**
   * Any regions with a size smaller than this will be merged with larger regions if possible.
   *
   * **Note:** This value will be squared to calculate the number of cells. For example, a value of 20 will set the number of cells to 400.
   */
  public var regionMergeSize: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRegionMergeSizePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRegionMergeSizePtr, NIL)
    }

  /**
   * The maximum allowed length for contour edges along the border of the mesh.
   *
   * **Note:** While baking, this value will be rounded up to the nearest multiple of [cellSize].
   */
  public var edgeMaxLength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEdgeMaxLengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setEdgeMaxLengthPtr, NIL)
    }

  /**
   * The maximum distance a simplified contour's border edges should deviate the original raw contour.
   */
  public var edgeMaxError: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEdgeMaxErrorPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setEdgeMaxErrorPtr, NIL)
    }

  /**
   * The maximum number of vertices allowed for polygons generated during the contour to polygon conversion process.
   */
  public var verticesPerPolygon: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVerticesPerPolygonPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVerticesPerPolygonPtr, NIL)
    }

  /**
   * The sampling distance to use when generating the detail mesh, in cell unit.
   */
  public var detailSampleDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDetailSampleDistancePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDetailSampleDistancePtr, NIL)
    }

  /**
   * The maximum distance the detail mesh surface should deviate from heightfield, in cell unit.
   */
  public var detailSampleMaxError: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDetailSampleMaxErrorPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDetailSampleMaxErrorPtr, NIL)
    }

  /**
   * If `true`, marks non-walkable spans as walkable if their maximum is within [agentMaxClimb] of a walkable neighbor.
   */
  public var filterLowHangingObstacles: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFilterLowHangingObstaclesPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFilterLowHangingObstaclesPtr, NIL)
    }

  /**
   * If `true`, marks spans that are ledges as non-walkable.
   */
  public var filterLedgeSpans: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFilterLedgeSpansPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFilterLedgeSpansPtr, NIL)
    }

  /**
   * If `true`, marks walkable spans as not walkable if the clearance above the span is less than [agentHeight].
   */
  public var filterWalkableLowHeightSpans: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFilterWalkableLowHeightSpansPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFilterWalkableLowHeightSpansPtr, NIL)
    }

  /**
   * If the baking [AABB] has a volume the navigation mesh baking will be restricted to its enclosing area.
   */
  @CoreTypeLocalCopy
  public var filterBakingAabb: AABB
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFilterBakingAabbPtr,
          godot.core.VariantType.AABB)
      return (TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB)
    }
    set(`value`) {
      TransferContext.writeArguments(godot.core.VariantType.AABB to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFilterBakingAabbPtr, NIL)
    }

  /**
   * The position offset applied to the [filterBakingAabb] [AABB].
   */
  @CoreTypeLocalCopy
  public var filterBakingAabbOffset: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFilterBakingAabbOffsetPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFilterBakingAabbOffsetPtr, NIL)
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
    TransferContext.callMethod(rawPtr, MethodBindings.setCollisionMaskValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [geometryCollisionMask] is enabled, given a [layerNumber] between 1 and 32.
   */
  public fun getCollisionMaskValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionMaskValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Adds a polygon using the indices of the vertices you get when calling [getVertices].
   */
  public fun addPolygon(polygon: PackedInt32Array): Unit {
    TransferContext.writeArguments(PACKED_INT_32_ARRAY to polygon)
    TransferContext.callMethod(rawPtr, MethodBindings.addPolygonPtr, NIL)
  }

  /**
   * Returns the number of polygons in the navigation mesh.
   */
  public fun getPolygonCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPolygonCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns a [godot.PackedInt32Array] containing the indices of the vertices of a created polygon.
   */
  public fun getPolygon(idx: Int): PackedInt32Array {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPolygonPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Clears the array of polygons, but it doesn't clear the array of vertices.
   */
  public fun clearPolygons(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPolygonsPtr, NIL)
  }

  /**
   * Initializes the navigation mesh by setting the vertices and indices according to a [godot.Mesh].
   *
   * **Note:** The given [mesh] must be of type [godot.Mesh.PRIMITIVE_TRIANGLES] and have an index array.
   */
  public fun createFromMesh(mesh: Mesh): Unit {
    TransferContext.writeArguments(OBJECT to mesh)
    TransferContext.callMethod(rawPtr, MethodBindings.createFromMeshPtr, NIL)
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

  internal object MethodBindings {
    public val setSamplePartitionTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_sample_partition_type")

    public val getSamplePartitionTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_sample_partition_type")

    public val setParsedGeometryTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_parsed_geometry_type")

    public val getParsedGeometryTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_parsed_geometry_type")

    public val setCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_collision_mask")

    public val getCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_collision_mask")

    public val setCollisionMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_collision_mask_value")

    public val getCollisionMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_collision_mask_value")

    public val setSourceGeometryModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_source_geometry_mode")

    public val getSourceGeometryModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_source_geometry_mode")

    public val setSourceGroupNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_source_group_name")

    public val getSourceGroupNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_source_group_name")

    public val setCellSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_cell_size")

    public val getCellSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_cell_size")

    public val setCellHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_cell_height")

    public val getCellHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_cell_height")

    public val setAgentHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_agent_height")

    public val getAgentHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_agent_height")

    public val setAgentRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_agent_radius")

    public val getAgentRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_agent_radius")

    public val setAgentMaxClimbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_agent_max_climb")

    public val getAgentMaxClimbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_agent_max_climb")

    public val setAgentMaxSlopePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_agent_max_slope")

    public val getAgentMaxSlopePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_agent_max_slope")

    public val setRegionMinSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_region_min_size")

    public val getRegionMinSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_region_min_size")

    public val setRegionMergeSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_region_merge_size")

    public val getRegionMergeSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_region_merge_size")

    public val setEdgeMaxLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_edge_max_length")

    public val getEdgeMaxLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_edge_max_length")

    public val setEdgeMaxErrorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_edge_max_error")

    public val getEdgeMaxErrorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_edge_max_error")

    public val setVerticesPerPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_vertices_per_polygon")

    public val getVerticesPerPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_vertices_per_polygon")

    public val setDetailSampleDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_detail_sample_distance")

    public val getDetailSampleDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_detail_sample_distance")

    public val setDetailSampleMaxErrorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_detail_sample_max_error")

    public val getDetailSampleMaxErrorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_detail_sample_max_error")

    public val setFilterLowHangingObstaclesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_filter_low_hanging_obstacles")

    public val getFilterLowHangingObstaclesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_filter_low_hanging_obstacles")

    public val setFilterLedgeSpansPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_filter_ledge_spans")

    public val getFilterLedgeSpansPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_filter_ledge_spans")

    public val setFilterWalkableLowHeightSpansPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_filter_walkable_low_height_spans")

    public val getFilterWalkableLowHeightSpansPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_filter_walkable_low_height_spans")

    public val setFilterBakingAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_filter_baking_aabb")

    public val getFilterBakingAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_filter_baking_aabb")

    public val setFilterBakingAabbOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_filter_baking_aabb_offset")

    public val getFilterBakingAabbOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_filter_baking_aabb_offset")

    public val setVerticesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_vertices")

    public val getVerticesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_vertices")

    public val addPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "add_polygon")

    public val getPolygonCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_polygon_count")

    public val getPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_polygon")

    public val clearPolygonsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "clear_polygons")

    public val createFromMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "create_from_mesh")
  }
}
