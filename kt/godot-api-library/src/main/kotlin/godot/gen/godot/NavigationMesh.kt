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
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_INT_32_ARRAY
import godot.core.VariantParser.PACKED_VECTOR3_ARRAY
import godot.core.VariantParser.STRING_NAME
import godot.core.VariantParser.VECTOR3
import godot.core.Vector3
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_NAVIGATIONMESH_INDEX: Int = 355

/**
 * A navigation mesh is a collection of polygons that define which areas of an environment are
 * traversable to aid agents in pathfinding through complicated spaces.
 */
@GodotBaseType
public open class NavigationMesh : Resource() {
  public final inline var vertices: PackedVector3Array
    @JvmName("verticesProperty")
    get() = getVertices()
    @JvmName("verticesProperty")
    set(`value`) {
      setVertices(value)
    }

  /**
   * Partitioning algorithm for creating the navigation mesh polys. See [SamplePartitionType] for
   * possible values.
   */
  public final inline var samplePartitionType: SamplePartitionType
    @JvmName("samplePartitionTypeProperty")
    get() = getSamplePartitionType()
    @JvmName("samplePartitionTypeProperty")
    set(`value`) {
      setSamplePartitionType(value)
    }

  /**
   * Determines which type of nodes will be parsed as geometry. See [ParsedGeometryType] for
   * possible values.
   */
  public final inline var geometryParsedGeometryType: ParsedGeometryType
    @JvmName("geometryParsedGeometryTypeProperty")
    get() = getParsedGeometryType()
    @JvmName("geometryParsedGeometryTypeProperty")
    set(`value`) {
      setParsedGeometryType(value)
    }

  /**
   * The physics layers to scan for static colliders.
   * Only used when [geometryParsedGeometryType] is [PARSED_GEOMETRY_STATIC_COLLIDERS] or
   * [PARSED_GEOMETRY_BOTH].
   */
  public final inline var geometryCollisionMask: Long
    @JvmName("geometryCollisionMaskProperty")
    get() = getCollisionMask()
    @JvmName("geometryCollisionMaskProperty")
    set(`value`) {
      setCollisionMask(value)
    }

  /**
   * The source of the geometry used when baking. See [SourceGeometryMode] for possible values.
   */
  public final inline var geometrySourceGeometryMode: SourceGeometryMode
    @JvmName("geometrySourceGeometryModeProperty")
    get() = getSourceGeometryMode()
    @JvmName("geometrySourceGeometryModeProperty")
    set(`value`) {
      setSourceGeometryMode(value)
    }

  /**
   * The name of the group to scan for geometry.
   * Only used when [geometrySourceGeometryMode] is [SOURCE_GEOMETRY_GROUPS_WITH_CHILDREN] or
   * [SOURCE_GEOMETRY_GROUPS_EXPLICIT].
   */
  public final inline var geometrySourceGroupName: StringName
    @JvmName("geometrySourceGroupNameProperty")
    get() = getSourceGroupName()
    @JvmName("geometrySourceGroupNameProperty")
    set(`value`) {
      setSourceGroupName(value)
    }

  /**
   * The cell size used to rasterize the navigation mesh vertices on the XZ plane. Must match with
   * the cell size on the navigation map.
   */
  public final inline var cellSize: Float
    @JvmName("cellSizeProperty")
    get() = getCellSize()
    @JvmName("cellSizeProperty")
    set(`value`) {
      setCellSize(value)
    }

  /**
   * The cell height used to rasterize the navigation mesh vertices on the Y axis. Must match with
   * the cell height on the navigation map.
   */
  public final inline var cellHeight: Float
    @JvmName("cellHeightProperty")
    get() = getCellHeight()
    @JvmName("cellHeightProperty")
    set(`value`) {
      setCellHeight(value)
    }

  /**
   * The size of the non-navigable border around the bake bounding area.
   * In conjunction with the [filterBakingAabb] and a [edgeMaxError] value at `1.0` or below the
   * border size can be used to bake tile aligned navigation meshes without the tile edges being shrunk
   * by [agentRadius].
   * **Note:** While baking and not zero, this value will be rounded up to the nearest multiple of
   * [cellSize].
   */
  public final inline var borderSize: Float
    @JvmName("borderSizeProperty")
    get() = getBorderSize()
    @JvmName("borderSizeProperty")
    set(`value`) {
      setBorderSize(value)
    }

  /**
   * The minimum floor to ceiling height that will still allow the floor area to be considered
   * walkable.
   * **Note:** While baking, this value will be rounded up to the nearest multiple of [cellHeight].
   */
  public final inline var agentHeight: Float
    @JvmName("agentHeightProperty")
    get() = getAgentHeight()
    @JvmName("agentHeightProperty")
    set(`value`) {
      setAgentHeight(value)
    }

  /**
   * The distance to erode/shrink the walkable area of the heightfield away from obstructions.
   * **Note:** While baking, this value will be rounded up to the nearest multiple of [cellSize].
   */
  public final inline var agentRadius: Float
    @JvmName("agentRadiusProperty")
    get() = getAgentRadius()
    @JvmName("agentRadiusProperty")
    set(`value`) {
      setAgentRadius(value)
    }

  /**
   * The minimum ledge height that is considered to still be traversable.
   * **Note:** While baking, this value will be rounded down to the nearest multiple of
   * [cellHeight].
   */
  public final inline var agentMaxClimb: Float
    @JvmName("agentMaxClimbProperty")
    get() = getAgentMaxClimb()
    @JvmName("agentMaxClimbProperty")
    set(`value`) {
      setAgentMaxClimb(value)
    }

  /**
   * The maximum slope that is considered walkable, in degrees.
   */
  public final inline var agentMaxSlope: Float
    @JvmName("agentMaxSlopeProperty")
    get() = getAgentMaxSlope()
    @JvmName("agentMaxSlopeProperty")
    set(`value`) {
      setAgentMaxSlope(value)
    }

  /**
   * The minimum size of a region for it to be created.
   * **Note:** This value will be squared to calculate the minimum number of cells allowed to form
   * isolated island areas. For example, a value of 8 will set the number of cells to 64.
   */
  public final inline var regionMinSize: Float
    @JvmName("regionMinSizeProperty")
    get() = getRegionMinSize()
    @JvmName("regionMinSizeProperty")
    set(`value`) {
      setRegionMinSize(value)
    }

  /**
   * Any regions with a size smaller than this will be merged with larger regions if possible.
   * **Note:** This value will be squared to calculate the number of cells. For example, a value of
   * 20 will set the number of cells to 400.
   */
  public final inline var regionMergeSize: Float
    @JvmName("regionMergeSizeProperty")
    get() = getRegionMergeSize()
    @JvmName("regionMergeSizeProperty")
    set(`value`) {
      setRegionMergeSize(value)
    }

  /**
   * The maximum allowed length for contour edges along the border of the mesh. A value of `0.0`
   * disables this feature.
   * **Note:** While baking, this value will be rounded up to the nearest multiple of [cellSize].
   */
  public final inline var edgeMaxLength: Float
    @JvmName("edgeMaxLengthProperty")
    get() = getEdgeMaxLength()
    @JvmName("edgeMaxLengthProperty")
    set(`value`) {
      setEdgeMaxLength(value)
    }

  /**
   * The maximum distance a simplified contour's border edges should deviate the original raw
   * contour.
   */
  public final inline var edgeMaxError: Float
    @JvmName("edgeMaxErrorProperty")
    get() = getEdgeMaxError()
    @JvmName("edgeMaxErrorProperty")
    set(`value`) {
      setEdgeMaxError(value)
    }

  /**
   * The maximum number of vertices allowed for polygons generated during the contour to polygon
   * conversion process.
   */
  public final inline var verticesPerPolygon: Float
    @JvmName("verticesPerPolygonProperty")
    get() = getVerticesPerPolygon()
    @JvmName("verticesPerPolygonProperty")
    set(`value`) {
      setVerticesPerPolygon(value)
    }

  /**
   * The sampling distance to use when generating the detail mesh, in cell unit.
   */
  public final inline var detailSampleDistance: Float
    @JvmName("detailSampleDistanceProperty")
    get() = getDetailSampleDistance()
    @JvmName("detailSampleDistanceProperty")
    set(`value`) {
      setDetailSampleDistance(value)
    }

  /**
   * The maximum distance the detail mesh surface should deviate from heightfield, in cell unit.
   */
  public final inline var detailSampleMaxError: Float
    @JvmName("detailSampleMaxErrorProperty")
    get() = getDetailSampleMaxError()
    @JvmName("detailSampleMaxErrorProperty")
    set(`value`) {
      setDetailSampleMaxError(value)
    }

  /**
   * If `true`, marks non-walkable spans as walkable if their maximum is within [agentMaxClimb] of a
   * walkable neighbor.
   */
  public final inline var filterLowHangingObstacles: Boolean
    @JvmName("filterLowHangingObstaclesProperty")
    get() = getFilterLowHangingObstacles()
    @JvmName("filterLowHangingObstaclesProperty")
    set(`value`) {
      setFilterLowHangingObstacles(value)
    }

  /**
   * If `true`, marks spans that are ledges as non-walkable.
   */
  public final inline var filterLedgeSpans: Boolean
    @JvmName("filterLedgeSpansProperty")
    get() = getFilterLedgeSpans()
    @JvmName("filterLedgeSpansProperty")
    set(`value`) {
      setFilterLedgeSpans(value)
    }

  /**
   * If `true`, marks walkable spans as not walkable if the clearance above the span is less than
   * [agentHeight].
   */
  public final inline var filterWalkableLowHeightSpans: Boolean
    @JvmName("filterWalkableLowHeightSpansProperty")
    get() = getFilterWalkableLowHeightSpans()
    @JvmName("filterWalkableLowHeightSpansProperty")
    set(`value`) {
      setFilterWalkableLowHeightSpans(value)
    }

  /**
   * If the baking [AABB] has a volume the navigation mesh baking will be restricted to its
   * enclosing area.
   */
  @CoreTypeLocalCopy
  public final inline var filterBakingAabb: AABB
    @JvmName("filterBakingAabbProperty")
    get() = getFilterBakingAabb()
    @JvmName("filterBakingAabbProperty")
    set(`value`) {
      setFilterBakingAabb(value)
    }

  /**
   * The position offset applied to the [filterBakingAabb] [AABB].
   */
  @CoreTypeLocalCopy
  public final inline var filterBakingAabbOffset: Vector3
    @JvmName("filterBakingAabbOffsetProperty")
    get() = getFilterBakingAabbOffset()
    @JvmName("filterBakingAabbOffsetProperty")
    set(`value`) {
      setFilterBakingAabbOffset(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_NAVIGATIONMESH_INDEX, scriptIndex)
  }

  /**
   * If the baking [AABB] has a volume the navigation mesh baking will be restricted to its
   * enclosing area.
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
  public final fun filterBakingAabbMutate(block: AABB.() -> Unit): AABB = filterBakingAabb.apply{
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
  public final fun filterBakingAabbOffsetMutate(block: Vector3.() -> Unit): Vector3 =
      filterBakingAabbOffset.apply{
      block(this)
      filterBakingAabbOffset = this
  }


  public final fun setSamplePartitionType(samplePartitionType: SamplePartitionType): Unit {
    Internals.writeArguments(LONG to samplePartitionType.id)
    Internals.callMethod(rawPtr, MethodBindings.setSamplePartitionTypePtr, NIL)
  }

  public final fun getSamplePartitionType(): SamplePartitionType {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSamplePartitionTypePtr, LONG)
    return NavigationMesh.SamplePartitionType.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setParsedGeometryType(geometryType: ParsedGeometryType): Unit {
    Internals.writeArguments(LONG to geometryType.id)
    Internals.callMethod(rawPtr, MethodBindings.setParsedGeometryTypePtr, NIL)
  }

  public final fun getParsedGeometryType(): ParsedGeometryType {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getParsedGeometryTypePtr, LONG)
    return NavigationMesh.ParsedGeometryType.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setCollisionMask(mask: Long): Unit {
    Internals.writeArguments(LONG to mask)
    Internals.callMethod(rawPtr, MethodBindings.setCollisionMaskPtr, NIL)
  }

  public final fun getCollisionMask(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCollisionMaskPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [geometryCollisionMask], given
   * a [layerNumber] between 1 and 32.
   */
  public final fun setCollisionMaskValue(layerNumber: Int, `value`: Boolean): Unit {
    Internals.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    Internals.callMethod(rawPtr, MethodBindings.setCollisionMaskValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [geometryCollisionMask] is enabled, given a
   * [layerNumber] between 1 and 32.
   */
  public final fun getCollisionMaskValue(layerNumber: Int): Boolean {
    Internals.writeArguments(LONG to layerNumber.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getCollisionMaskValuePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSourceGeometryMode(mask: SourceGeometryMode): Unit {
    Internals.writeArguments(LONG to mask.id)
    Internals.callMethod(rawPtr, MethodBindings.setSourceGeometryModePtr, NIL)
  }

  public final fun getSourceGeometryMode(): SourceGeometryMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSourceGeometryModePtr, LONG)
    return NavigationMesh.SourceGeometryMode.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setSourceGroupName(mask: StringName): Unit {
    Internals.writeArguments(STRING_NAME to mask)
    Internals.callMethod(rawPtr, MethodBindings.setSourceGroupNamePtr, NIL)
  }

  public final fun getSourceGroupName(): StringName {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSourceGroupNamePtr, STRING_NAME)
    return (Internals.readReturnValue(STRING_NAME) as StringName)
  }

  public final fun setCellSize(cellSize: Float): Unit {
    Internals.writeArguments(DOUBLE to cellSize.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setCellSizePtr, NIL)
  }

  public final fun getCellSize(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCellSizePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setCellHeight(cellHeight: Float): Unit {
    Internals.writeArguments(DOUBLE to cellHeight.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setCellHeightPtr, NIL)
  }

  public final fun getCellHeight(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCellHeightPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setBorderSize(borderSize: Float): Unit {
    Internals.writeArguments(DOUBLE to borderSize.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setBorderSizePtr, NIL)
  }

  public final fun getBorderSize(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBorderSizePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAgentHeight(agentHeight: Float): Unit {
    Internals.writeArguments(DOUBLE to agentHeight.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setAgentHeightPtr, NIL)
  }

  public final fun getAgentHeight(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAgentHeightPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAgentRadius(agentRadius: Float): Unit {
    Internals.writeArguments(DOUBLE to agentRadius.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setAgentRadiusPtr, NIL)
  }

  public final fun getAgentRadius(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAgentRadiusPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAgentMaxClimb(agentMaxClimb: Float): Unit {
    Internals.writeArguments(DOUBLE to agentMaxClimb.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setAgentMaxClimbPtr, NIL)
  }

  public final fun getAgentMaxClimb(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAgentMaxClimbPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAgentMaxSlope(agentMaxSlope: Float): Unit {
    Internals.writeArguments(DOUBLE to agentMaxSlope.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setAgentMaxSlopePtr, NIL)
  }

  public final fun getAgentMaxSlope(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAgentMaxSlopePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRegionMinSize(regionMinSize: Float): Unit {
    Internals.writeArguments(DOUBLE to regionMinSize.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setRegionMinSizePtr, NIL)
  }

  public final fun getRegionMinSize(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRegionMinSizePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRegionMergeSize(regionMergeSize: Float): Unit {
    Internals.writeArguments(DOUBLE to regionMergeSize.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setRegionMergeSizePtr, NIL)
  }

  public final fun getRegionMergeSize(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRegionMergeSizePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setEdgeMaxLength(edgeMaxLength: Float): Unit {
    Internals.writeArguments(DOUBLE to edgeMaxLength.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setEdgeMaxLengthPtr, NIL)
  }

  public final fun getEdgeMaxLength(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEdgeMaxLengthPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setEdgeMaxError(edgeMaxError: Float): Unit {
    Internals.writeArguments(DOUBLE to edgeMaxError.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setEdgeMaxErrorPtr, NIL)
  }

  public final fun getEdgeMaxError(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEdgeMaxErrorPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVerticesPerPolygon(verticesPerPolygon: Float): Unit {
    Internals.writeArguments(DOUBLE to verticesPerPolygon.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setVerticesPerPolygonPtr, NIL)
  }

  public final fun getVerticesPerPolygon(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getVerticesPerPolygonPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDetailSampleDistance(detailSampleDist: Float): Unit {
    Internals.writeArguments(DOUBLE to detailSampleDist.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setDetailSampleDistancePtr, NIL)
  }

  public final fun getDetailSampleDistance(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDetailSampleDistancePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDetailSampleMaxError(detailSampleMaxError: Float): Unit {
    Internals.writeArguments(DOUBLE to detailSampleMaxError.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setDetailSampleMaxErrorPtr, NIL)
  }

  public final fun getDetailSampleMaxError(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDetailSampleMaxErrorPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setFilterLowHangingObstacles(filterLowHangingObstacles: Boolean): Unit {
    Internals.writeArguments(BOOL to filterLowHangingObstacles)
    Internals.callMethod(rawPtr, MethodBindings.setFilterLowHangingObstaclesPtr, NIL)
  }

  public final fun getFilterLowHangingObstacles(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFilterLowHangingObstaclesPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setFilterLedgeSpans(filterLedgeSpans: Boolean): Unit {
    Internals.writeArguments(BOOL to filterLedgeSpans)
    Internals.callMethod(rawPtr, MethodBindings.setFilterLedgeSpansPtr, NIL)
  }

  public final fun getFilterLedgeSpans(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFilterLedgeSpansPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setFilterWalkableLowHeightSpans(filterWalkableLowHeightSpans: Boolean): Unit {
    Internals.writeArguments(BOOL to filterWalkableLowHeightSpans)
    Internals.callMethod(rawPtr, MethodBindings.setFilterWalkableLowHeightSpansPtr, NIL)
  }

  public final fun getFilterWalkableLowHeightSpans(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFilterWalkableLowHeightSpansPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setFilterBakingAabb(bakingAabb: AABB): Unit {
    Internals.writeArguments(godot.core.VariantParser.AABB to bakingAabb)
    Internals.callMethod(rawPtr, MethodBindings.setFilterBakingAabbPtr, NIL)
  }

  public final fun getFilterBakingAabb(): AABB {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFilterBakingAabbPtr,
        godot.core.VariantParser.AABB)
    return (Internals.readReturnValue(godot.core.VariantParser.AABB) as AABB)
  }

  public final fun setFilterBakingAabbOffset(bakingAabbOffset: Vector3): Unit {
    Internals.writeArguments(VECTOR3 to bakingAabbOffset)
    Internals.callMethod(rawPtr, MethodBindings.setFilterBakingAabbOffsetPtr, NIL)
  }

  public final fun getFilterBakingAabbOffset(): Vector3 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFilterBakingAabbOffsetPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Sets the vertices that can be then indexed to create polygons with the [addPolygon] method.
   */
  public final fun setVertices(vertices: PackedVector3Array): Unit {
    Internals.writeArguments(PACKED_VECTOR3_ARRAY to vertices)
    Internals.callMethod(rawPtr, MethodBindings.setVerticesPtr, NIL)
  }

  /**
   * Returns a [PackedVector3Array] containing all the vertices being used to create the polygons.
   */
  public final fun getVertices(): PackedVector3Array {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getVerticesPtr, PACKED_VECTOR3_ARRAY)
    return (Internals.readReturnValue(PACKED_VECTOR3_ARRAY) as PackedVector3Array)
  }

  /**
   * Adds a polygon using the indices of the vertices you get when calling [getVertices].
   */
  public final fun addPolygon(polygon: PackedInt32Array): Unit {
    Internals.writeArguments(PACKED_INT_32_ARRAY to polygon)
    Internals.callMethod(rawPtr, MethodBindings.addPolygonPtr, NIL)
  }

  /**
   * Returns the number of polygons in the navigation mesh.
   */
  public final fun getPolygonCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPolygonCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns a [PackedInt32Array] containing the indices of the vertices of a created polygon.
   */
  public final fun getPolygon(idx: Int): PackedInt32Array {
    Internals.writeArguments(LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getPolygonPtr, PACKED_INT_32_ARRAY)
    return (Internals.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  /**
   * Clears the array of polygons, but it doesn't clear the array of vertices.
   */
  public final fun clearPolygons(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clearPolygonsPtr, NIL)
  }

  /**
   * Initializes the navigation mesh by setting the vertices and indices according to a [Mesh].
   * **Note:** The given [mesh] must be of type [Mesh.PRIMITIVE_TRIANGLES] and have an index array.
   */
  public final fun createFromMesh(mesh: Mesh?): Unit {
    Internals.writeArguments(OBJECT to mesh)
    Internals.callMethod(rawPtr, MethodBindings.createFromMeshPtr, NIL)
  }

  /**
   * Clears the internal arrays for vertices and polygon indices.
   */
  public final fun clear(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  public enum class SamplePartitionType(
    id: Long,
  ) {
    /**
     * Watershed partitioning. Generally the best choice if you precompute the navigation mesh, use
     * this if you have large open areas.
     */
    SAMPLE_PARTITION_WATERSHED(0),
    /**
     * Monotone partitioning. Use this if you want fast navigation mesh generation.
     */
    SAMPLE_PARTITION_MONOTONE(1),
    /**
     * Layer partitioning. Good choice to use for tiled navigation mesh with medium and small sized
     * tiles.
     */
    SAMPLE_PARTITION_LAYERS(2),
    /**
     * Represents the size of the [SamplePartitionType] enum.
     */
    SAMPLE_PARTITION_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SamplePartitionType = entries.single { it.id == `value` }
    }
  }

  public enum class ParsedGeometryType(
    id: Long,
  ) {
    /**
     * Parses mesh instances as geometry. This includes [MeshInstance3D], [CSGShape3D], and
     * [GridMap] nodes.
     */
    PARSED_GEOMETRY_MESH_INSTANCES(0),
    /**
     * Parses [StaticBody3D] colliders as geometry. The collider should be in any of the layers
     * specified by [geometryCollisionMask].
     */
    PARSED_GEOMETRY_STATIC_COLLIDERS(1),
    /**
     * Both [PARSED_GEOMETRY_MESH_INSTANCES] and [PARSED_GEOMETRY_STATIC_COLLIDERS].
     */
    PARSED_GEOMETRY_BOTH(2),
    /**
     * Represents the size of the [ParsedGeometryType] enum.
     */
    PARSED_GEOMETRY_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ParsedGeometryType = entries.single { it.id == `value` }
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
     * Scans nodes in a group and their child nodes recursively for geometry. The group is specified
     * by [geometrySourceGroupName].
     */
    SOURCE_GEOMETRY_GROUPS_WITH_CHILDREN(1),
    /**
     * Uses nodes in a group for geometry. The group is specified by [geometrySourceGroupName].
     */
    SOURCE_GEOMETRY_GROUPS_EXPLICIT(2),
    /**
     * Represents the size of the [SourceGeometryMode] enum.
     */
    SOURCE_GEOMETRY_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SourceGeometryMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setSamplePartitionTypePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "set_sample_partition_type", 2472437533)

    public val getSamplePartitionTypePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "get_sample_partition_type", 833513918)

    public val setParsedGeometryTypePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "set_parsed_geometry_type", 3064713163)

    public val getParsedGeometryTypePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "get_parsed_geometry_type", 3928011953)

    public val setCollisionMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "set_collision_mask", 1286410249)

    public val getCollisionMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "get_collision_mask", 3905245786)

    public val setCollisionMaskValuePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "set_collision_mask_value", 300928843)

    public val getCollisionMaskValuePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "get_collision_mask_value", 1116898809)

    public val setSourceGeometryModePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "set_source_geometry_mode", 2700825194)

    public val getSourceGeometryModePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "get_source_geometry_mode", 2770484141)

    public val setSourceGroupNamePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "set_source_group_name", 3304788590)

    public val getSourceGroupNamePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "get_source_group_name", 2002593661)

    public val setCellSizePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "set_cell_size", 373806689)

    public val getCellSizePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "get_cell_size", 1740695150)

    public val setCellHeightPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "set_cell_height", 373806689)

    public val getCellHeightPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "get_cell_height", 1740695150)

    public val setBorderSizePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "set_border_size", 373806689)

    public val getBorderSizePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "get_border_size", 1740695150)

    public val setAgentHeightPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "set_agent_height", 373806689)

    public val getAgentHeightPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "get_agent_height", 1740695150)

    public val setAgentRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "set_agent_radius", 373806689)

    public val getAgentRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "get_agent_radius", 191475506)

    public val setAgentMaxClimbPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "set_agent_max_climb", 373806689)

    public val getAgentMaxClimbPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "get_agent_max_climb", 1740695150)

    public val setAgentMaxSlopePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "set_agent_max_slope", 373806689)

    public val getAgentMaxSlopePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "get_agent_max_slope", 1740695150)

    public val setRegionMinSizePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "set_region_min_size", 373806689)

    public val getRegionMinSizePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "get_region_min_size", 1740695150)

    public val setRegionMergeSizePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "set_region_merge_size", 373806689)

    public val getRegionMergeSizePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "get_region_merge_size", 1740695150)

    public val setEdgeMaxLengthPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "set_edge_max_length", 373806689)

    public val getEdgeMaxLengthPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "get_edge_max_length", 1740695150)

    public val setEdgeMaxErrorPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "set_edge_max_error", 373806689)

    public val getEdgeMaxErrorPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "get_edge_max_error", 1740695150)

    public val setVerticesPerPolygonPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "set_vertices_per_polygon", 373806689)

    public val getVerticesPerPolygonPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "get_vertices_per_polygon", 1740695150)

    public val setDetailSampleDistancePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "set_detail_sample_distance", 373806689)

    public val getDetailSampleDistancePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "get_detail_sample_distance", 1740695150)

    public val setDetailSampleMaxErrorPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "set_detail_sample_max_error", 373806689)

    public val getDetailSampleMaxErrorPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "get_detail_sample_max_error", 1740695150)

    public val setFilterLowHangingObstaclesPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "set_filter_low_hanging_obstacles", 2586408642)

    public val getFilterLowHangingObstaclesPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "get_filter_low_hanging_obstacles", 36873697)

    public val setFilterLedgeSpansPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "set_filter_ledge_spans", 2586408642)

    public val getFilterLedgeSpansPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "get_filter_ledge_spans", 36873697)

    public val setFilterWalkableLowHeightSpansPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "set_filter_walkable_low_height_spans", 2586408642)

    public val getFilterWalkableLowHeightSpansPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "get_filter_walkable_low_height_spans", 36873697)

    public val setFilterBakingAabbPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "set_filter_baking_aabb", 259215842)

    public val getFilterBakingAabbPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "get_filter_baking_aabb", 1068685055)

    public val setFilterBakingAabbOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "set_filter_baking_aabb_offset", 3460891852)

    public val getFilterBakingAabbOffsetPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "get_filter_baking_aabb_offset", 3360562783)

    public val setVerticesPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "set_vertices", 334873810)

    public val getVerticesPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "get_vertices", 497664490)

    public val addPolygonPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "add_polygon", 3614634198)

    public val getPolygonCountPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "get_polygon_count", 3905245786)

    public val getPolygonPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "get_polygon", 3668444399)

    public val clearPolygonsPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "clear_polygons", 3218959716)

    public val createFromMeshPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationMesh", "create_from_mesh", 194775623)

    public val clearPtr: VoidPtr = Internals.getMethodBindPtr("NavigationMesh", "clear", 3218959716)
  }
}
