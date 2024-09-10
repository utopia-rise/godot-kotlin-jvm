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
import kotlin.jvm.JvmName

/**
 * A navigation mesh is a collection of polygons that define which areas of an environment are
 * traversable to aid agents in pathfinding through complicated spaces.
 */
@GodotBaseType
public open class NavigationMesh : Resource() {
  public var vertices: PackedVector3Array
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
  public var samplePartitionType: SamplePartitionType
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
  public var geometryParsedGeometryType: ParsedGeometryType
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
  public var geometryCollisionMask: Long
    @JvmName("geometryCollisionMaskProperty")
    get() = getCollisionMask()
    @JvmName("geometryCollisionMaskProperty")
    set(`value`) {
      setCollisionMask(value)
    }

  /**
   * The source of the geometry used when baking. See [SourceGeometryMode] for possible values.
   */
  public var geometrySourceGeometryMode: SourceGeometryMode
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
  public var geometrySourceGroupName: StringName
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
  public var cellSize: Float
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
  public var cellHeight: Float
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
  public var borderSize: Float
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
  public var agentHeight: Float
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
  public var agentRadius: Float
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
  public var agentMaxClimb: Float
    @JvmName("agentMaxClimbProperty")
    get() = getAgentMaxClimb()
    @JvmName("agentMaxClimbProperty")
    set(`value`) {
      setAgentMaxClimb(value)
    }

  /**
   * The maximum slope that is considered walkable, in degrees.
   */
  public var agentMaxSlope: Float
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
  public var regionMinSize: Float
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
  public var regionMergeSize: Float
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
  public var edgeMaxLength: Float
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
  public var edgeMaxError: Float
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
  public var verticesPerPolygon: Float
    @JvmName("verticesPerPolygonProperty")
    get() = getVerticesPerPolygon()
    @JvmName("verticesPerPolygonProperty")
    set(`value`) {
      setVerticesPerPolygon(value)
    }

  /**
   * The sampling distance to use when generating the detail mesh, in cell unit.
   */
  public var detailSampleDistance: Float
    @JvmName("detailSampleDistanceProperty")
    get() = getDetailSampleDistance()
    @JvmName("detailSampleDistanceProperty")
    set(`value`) {
      setDetailSampleDistance(value)
    }

  /**
   * The maximum distance the detail mesh surface should deviate from heightfield, in cell unit.
   */
  public var detailSampleMaxError: Float
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
  public var filterLowHangingObstacles: Boolean
    @JvmName("filterLowHangingObstaclesProperty")
    get() = getFilterLowHangingObstacles()
    @JvmName("filterLowHangingObstaclesProperty")
    set(`value`) {
      setFilterLowHangingObstacles(value)
    }

  /**
   * If `true`, marks spans that are ledges as non-walkable.
   */
  public var filterLedgeSpans: Boolean
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
  public var filterWalkableLowHeightSpans: Boolean
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
  public var filterBakingAabb: AABB
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
  public var filterBakingAabbOffset: Vector3
    @JvmName("filterBakingAabbOffsetProperty")
    get() = getFilterBakingAabbOffset()
    @JvmName("filterBakingAabbOffsetProperty")
    set(`value`) {
      setFilterBakingAabbOffset(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_NAVIGATIONMESH, scriptIndex)
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


  public fun setSamplePartitionType(samplePartitionType: SamplePartitionType): Unit {
    TransferContext.writeArguments(LONG to samplePartitionType.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setSamplePartitionTypePtr, NIL)
  }

  public fun getSamplePartitionType(): SamplePartitionType {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSamplePartitionTypePtr, LONG)
    return NavigationMesh.SamplePartitionType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setParsedGeometryType(geometryType: ParsedGeometryType): Unit {
    TransferContext.writeArguments(LONG to geometryType.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setParsedGeometryTypePtr, NIL)
  }

  public fun getParsedGeometryType(): ParsedGeometryType {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getParsedGeometryTypePtr, LONG)
    return NavigationMesh.ParsedGeometryType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setCollisionMask(mask: Long): Unit {
    TransferContext.writeArguments(LONG to mask)
    TransferContext.callMethod(rawPtr, MethodBindings.setCollisionMaskPtr, NIL)
  }

  public fun getCollisionMask(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionMaskPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [geometryCollisionMask], given
   * a [layerNumber] between 1 and 32.
   */
  public fun setCollisionMaskValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setCollisionMaskValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [geometryCollisionMask] is enabled, given a
   * [layerNumber] between 1 and 32.
   */
  public fun getCollisionMaskValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionMaskValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setSourceGeometryMode(mask: SourceGeometryMode): Unit {
    TransferContext.writeArguments(LONG to mask.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setSourceGeometryModePtr, NIL)
  }

  public fun getSourceGeometryMode(): SourceGeometryMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSourceGeometryModePtr, LONG)
    return NavigationMesh.SourceGeometryMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setSourceGroupName(mask: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to mask)
    TransferContext.callMethod(rawPtr, MethodBindings.setSourceGroupNamePtr, NIL)
  }

  public fun getSourceGroupName(): StringName {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSourceGroupNamePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  public fun setCellSize(cellSize: Float): Unit {
    TransferContext.writeArguments(DOUBLE to cellSize.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setCellSizePtr, NIL)
  }

  public fun getCellSize(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCellSizePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setCellHeight(cellHeight: Float): Unit {
    TransferContext.writeArguments(DOUBLE to cellHeight.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setCellHeightPtr, NIL)
  }

  public fun getCellHeight(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCellHeightPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setBorderSize(borderSize: Float): Unit {
    TransferContext.writeArguments(DOUBLE to borderSize.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setBorderSizePtr, NIL)
  }

  public fun getBorderSize(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getBorderSizePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setAgentHeight(agentHeight: Float): Unit {
    TransferContext.writeArguments(DOUBLE to agentHeight.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setAgentHeightPtr, NIL)
  }

  public fun getAgentHeight(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAgentHeightPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setAgentRadius(agentRadius: Float): Unit {
    TransferContext.writeArguments(DOUBLE to agentRadius.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setAgentRadiusPtr, NIL)
  }

  public fun getAgentRadius(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAgentRadiusPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setAgentMaxClimb(agentMaxClimb: Float): Unit {
    TransferContext.writeArguments(DOUBLE to agentMaxClimb.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setAgentMaxClimbPtr, NIL)
  }

  public fun getAgentMaxClimb(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAgentMaxClimbPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setAgentMaxSlope(agentMaxSlope: Float): Unit {
    TransferContext.writeArguments(DOUBLE to agentMaxSlope.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setAgentMaxSlopePtr, NIL)
  }

  public fun getAgentMaxSlope(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAgentMaxSlopePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setRegionMinSize(regionMinSize: Float): Unit {
    TransferContext.writeArguments(DOUBLE to regionMinSize.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setRegionMinSizePtr, NIL)
  }

  public fun getRegionMinSize(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRegionMinSizePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setRegionMergeSize(regionMergeSize: Float): Unit {
    TransferContext.writeArguments(DOUBLE to regionMergeSize.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setRegionMergeSizePtr, NIL)
  }

  public fun getRegionMergeSize(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRegionMergeSizePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setEdgeMaxLength(edgeMaxLength: Float): Unit {
    TransferContext.writeArguments(DOUBLE to edgeMaxLength.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setEdgeMaxLengthPtr, NIL)
  }

  public fun getEdgeMaxLength(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEdgeMaxLengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setEdgeMaxError(edgeMaxError: Float): Unit {
    TransferContext.writeArguments(DOUBLE to edgeMaxError.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setEdgeMaxErrorPtr, NIL)
  }

  public fun getEdgeMaxError(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getEdgeMaxErrorPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setVerticesPerPolygon(verticesPerPolygon: Float): Unit {
    TransferContext.writeArguments(DOUBLE to verticesPerPolygon.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setVerticesPerPolygonPtr, NIL)
  }

  public fun getVerticesPerPolygon(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVerticesPerPolygonPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setDetailSampleDistance(detailSampleDist: Float): Unit {
    TransferContext.writeArguments(DOUBLE to detailSampleDist.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setDetailSampleDistancePtr, NIL)
  }

  public fun getDetailSampleDistance(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDetailSampleDistancePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setDetailSampleMaxError(detailSampleMaxError: Float): Unit {
    TransferContext.writeArguments(DOUBLE to detailSampleMaxError.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setDetailSampleMaxErrorPtr, NIL)
  }

  public fun getDetailSampleMaxError(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDetailSampleMaxErrorPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setFilterLowHangingObstacles(filterLowHangingObstacles: Boolean): Unit {
    TransferContext.writeArguments(BOOL to filterLowHangingObstacles)
    TransferContext.callMethod(rawPtr, MethodBindings.setFilterLowHangingObstaclesPtr, NIL)
  }

  public fun getFilterLowHangingObstacles(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFilterLowHangingObstaclesPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setFilterLedgeSpans(filterLedgeSpans: Boolean): Unit {
    TransferContext.writeArguments(BOOL to filterLedgeSpans)
    TransferContext.callMethod(rawPtr, MethodBindings.setFilterLedgeSpansPtr, NIL)
  }

  public fun getFilterLedgeSpans(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFilterLedgeSpansPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setFilterWalkableLowHeightSpans(filterWalkableLowHeightSpans: Boolean): Unit {
    TransferContext.writeArguments(BOOL to filterWalkableLowHeightSpans)
    TransferContext.callMethod(rawPtr, MethodBindings.setFilterWalkableLowHeightSpansPtr, NIL)
  }

  public fun getFilterWalkableLowHeightSpans(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFilterWalkableLowHeightSpansPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setFilterBakingAabb(bakingAabb: AABB): Unit {
    TransferContext.writeArguments(godot.core.VariantType.AABB to bakingAabb)
    TransferContext.callMethod(rawPtr, MethodBindings.setFilterBakingAabbPtr, NIL)
  }

  public fun getFilterBakingAabb(): AABB {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFilterBakingAabbPtr,
        godot.core.VariantType.AABB)
    return (TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB)
  }

  public fun setFilterBakingAabbOffset(bakingAabbOffset: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to bakingAabbOffset)
    TransferContext.callMethod(rawPtr, MethodBindings.setFilterBakingAabbOffsetPtr, NIL)
  }

  public fun getFilterBakingAabbOffset(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFilterBakingAabbOffsetPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Sets the vertices that can be then indexed to create polygons with the [addPolygon] method.
   */
  public fun setVertices(vertices: PackedVector3Array): Unit {
    TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to vertices)
    TransferContext.callMethod(rawPtr, MethodBindings.setVerticesPtr, NIL)
  }

  /**
   * Returns a [PackedVector3Array] containing all the vertices being used to create the polygons.
   */
  public fun getVertices(): PackedVector3Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVerticesPtr, PACKED_VECTOR3_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array)
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
   * Returns a [PackedInt32Array] containing the indices of the vertices of a created polygon.
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
   * Initializes the navigation mesh by setting the vertices and indices according to a [Mesh].
   * **Note:** The given [mesh] must be of type [Mesh.PRIMITIVE_TRIANGLES] and have an index array.
   */
  public fun createFromMesh(mesh: Mesh?): Unit {
    TransferContext.writeArguments(OBJECT to mesh)
    TransferContext.callMethod(rawPtr, MethodBindings.createFromMeshPtr, NIL)
  }

  /**
   * Clears the internal arrays for vertices and polygon indices.
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
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
        TypeManager.getMethodBindPtr("NavigationMesh", "set_sample_partition_type", 2472437533)

    public val getSamplePartitionTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_sample_partition_type", 833513918)

    public val setParsedGeometryTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_parsed_geometry_type", 3064713163)

    public val getParsedGeometryTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_parsed_geometry_type", 3928011953)

    public val setCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_collision_mask", 1286410249)

    public val getCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_collision_mask", 3905245786)

    public val setCollisionMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_collision_mask_value", 300928843)

    public val getCollisionMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_collision_mask_value", 1116898809)

    public val setSourceGeometryModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_source_geometry_mode", 2700825194)

    public val getSourceGeometryModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_source_geometry_mode", 2770484141)

    public val setSourceGroupNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_source_group_name", 3304788590)

    public val getSourceGroupNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_source_group_name", 2002593661)

    public val setCellSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_cell_size", 373806689)

    public val getCellSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_cell_size", 1740695150)

    public val setCellHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_cell_height", 373806689)

    public val getCellHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_cell_height", 1740695150)

    public val setBorderSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_border_size", 373806689)

    public val getBorderSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_border_size", 1740695150)

    public val setAgentHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_agent_height", 373806689)

    public val getAgentHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_agent_height", 1740695150)

    public val setAgentRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_agent_radius", 373806689)

    public val getAgentRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_agent_radius", 191475506)

    public val setAgentMaxClimbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_agent_max_climb", 373806689)

    public val getAgentMaxClimbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_agent_max_climb", 1740695150)

    public val setAgentMaxSlopePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_agent_max_slope", 373806689)

    public val getAgentMaxSlopePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_agent_max_slope", 1740695150)

    public val setRegionMinSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_region_min_size", 373806689)

    public val getRegionMinSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_region_min_size", 1740695150)

    public val setRegionMergeSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_region_merge_size", 373806689)

    public val getRegionMergeSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_region_merge_size", 1740695150)

    public val setEdgeMaxLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_edge_max_length", 373806689)

    public val getEdgeMaxLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_edge_max_length", 1740695150)

    public val setEdgeMaxErrorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_edge_max_error", 373806689)

    public val getEdgeMaxErrorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_edge_max_error", 1740695150)

    public val setVerticesPerPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_vertices_per_polygon", 373806689)

    public val getVerticesPerPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_vertices_per_polygon", 1740695150)

    public val setDetailSampleDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_detail_sample_distance", 373806689)

    public val getDetailSampleDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_detail_sample_distance", 1740695150)

    public val setDetailSampleMaxErrorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_detail_sample_max_error", 373806689)

    public val getDetailSampleMaxErrorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_detail_sample_max_error", 1740695150)

    public val setFilterLowHangingObstaclesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_filter_low_hanging_obstacles", 2586408642)

    public val getFilterLowHangingObstaclesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_filter_low_hanging_obstacles", 36873697)

    public val setFilterLedgeSpansPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_filter_ledge_spans", 2586408642)

    public val getFilterLedgeSpansPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_filter_ledge_spans", 36873697)

    public val setFilterWalkableLowHeightSpansPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_filter_walkable_low_height_spans", 2586408642)

    public val getFilterWalkableLowHeightSpansPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_filter_walkable_low_height_spans", 36873697)

    public val setFilterBakingAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_filter_baking_aabb", 259215842)

    public val getFilterBakingAabbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_filter_baking_aabb", 1068685055)

    public val setFilterBakingAabbOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_filter_baking_aabb_offset", 3460891852)

    public val getFilterBakingAabbOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_filter_baking_aabb_offset", 3360562783)

    public val setVerticesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "set_vertices", 334873810)

    public val getVerticesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_vertices", 497664490)

    public val addPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "add_polygon", 3614634198)

    public val getPolygonCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_polygon_count", 3905245786)

    public val getPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "get_polygon", 3668444399)

    public val clearPolygonsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "clear_polygons", 3218959716)

    public val createFromMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "create_from_mesh", 194775623)

    public val clearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMesh", "clear", 3218959716)
  }
}
