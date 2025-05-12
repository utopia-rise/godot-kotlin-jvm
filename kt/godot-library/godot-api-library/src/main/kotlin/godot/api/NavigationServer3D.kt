// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.AABB
import godot.core.Callable
import godot.core.PackedVector3Array
import godot.core.RID
import godot.core.Signal0
import godot.core.Signal1
import godot.core.Transform3D
import godot.core.VariantArray
import godot.core.VariantCallable
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.CALLABLE
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_VECTOR3_ARRAY
import godot.core.VariantParser.TRANSFORM3D
import godot.core.VariantParser.VECTOR3
import godot.core.VariantParser._RID
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * NavigationServer3D is the server that handles navigation maps, regions and agents. It does not
 * handle A* navigation from [AStar3D].
 *
 * Maps are divided into regions, which are composed of navigation meshes. Together, they define the
 * navigable areas in the 3D world.
 *
 * **Note:** Most [NavigationServer3D] changes take effect after the next physics frame and not
 * immediately. This includes all changes made to maps, regions or agents by navigation-related nodes
 * in the scene tree or made through scripts.
 *
 * For two regions to be connected to each other, they must share a similar edge. An edge is
 * considered connected to another if both of its two vertices are at a distance less than
 * `edge_connection_margin` to the respective other edge's vertex.
 *
 * You may assign navigation layers to regions with [NavigationServer3D.regionSetNavigationLayers],
 * which then can be checked upon when requesting a path with [NavigationServer3D.mapGetPath]. This can
 * be used to allow or deny certain areas for some objects.
 *
 * To use the collision avoidance system, you may use agents. You can set an agent's target
 * velocity, then the servers will emit a callback with a modified velocity.
 *
 * **Note:** The collision avoidance system ignores regions. Using the modified velocity directly
 * may move an agent outside of the traversable area. This is a limitation of the collision avoidance
 * system, any more complex situation may require the use of the physics engine.
 *
 * This server keeps tracks of any call and executes them during the sync phase. This means that you
 * can request any change to the map, using any thread, without worrying.
 */
@GodotBaseType
public object NavigationServer3D : Object() {
  /**
   * Emitted when a navigation map is updated, when a region moves or is modified.
   */
  @JvmStatic
  public val mapChanged: Signal1<RID> by Signal1

  /**
   * Emitted when navigation debug settings are changed. Only available in debug builds.
   */
  @JvmStatic
  public val navigationDebugChanged: Signal0 by Signal0

  /**
   * Emitted when avoidance debug settings are changed. Only available in debug builds.
   */
  @JvmStatic
  public val avoidanceDebugChanged: Signal0 by Signal0

  public override fun new(scriptIndex: Int): Unit {
    getSingleton(18)
  }

  /**
   * Returns all created navigation map [RID]s on the NavigationServer. This returns both 2D and 3D
   * created navigation maps as there is technically no distinction between them.
   */
  @JvmStatic
  public final fun getMaps(): VariantArray<RID> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMapsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<RID>)
  }

  /**
   * Create a new map.
   */
  @JvmStatic
  public final fun mapCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.mapCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Sets the map active.
   */
  @JvmStatic
  public final fun mapSetActive(map: RID, active: Boolean): Unit {
    TransferContext.writeArguments(_RID to map, BOOL to active)
    TransferContext.callMethod(ptr, MethodBindings.mapSetActivePtr, NIL)
  }

  /**
   * Returns `true` if the map is active.
   */
  @JvmStatic
  public final fun mapIsActive(map: RID): Boolean {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(ptr, MethodBindings.mapIsActivePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the map up direction.
   */
  @JvmStatic
  public final fun mapSetUp(map: RID, up: Vector3): Unit {
    TransferContext.writeArguments(_RID to map, VECTOR3 to up)
    TransferContext.callMethod(ptr, MethodBindings.mapSetUpPtr, NIL)
  }

  /**
   * Returns the map's up direction.
   */
  @JvmStatic
  public final fun mapGetUp(map: RID): Vector3 {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(ptr, MethodBindings.mapGetUpPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Sets the map cell size used to rasterize the navigation mesh vertices on the XZ plane. Must
   * match with the cell size of the used navigation meshes.
   */
  @JvmStatic
  public final fun mapSetCellSize(map: RID, cellSize: Float): Unit {
    TransferContext.writeArguments(_RID to map, DOUBLE to cellSize.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.mapSetCellSizePtr, NIL)
  }

  /**
   * Returns the map cell size used to rasterize the navigation mesh vertices on the XZ plane.
   */
  @JvmStatic
  public final fun mapGetCellSize(map: RID): Float {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(ptr, MethodBindings.mapGetCellSizePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the map cell height used to rasterize the navigation mesh vertices on the Y axis. Must
   * match with the cell height of the used navigation meshes.
   */
  @JvmStatic
  public final fun mapSetCellHeight(map: RID, cellHeight: Float): Unit {
    TransferContext.writeArguments(_RID to map, DOUBLE to cellHeight.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.mapSetCellHeightPtr, NIL)
  }

  /**
   * Returns the map cell height used to rasterize the navigation mesh vertices on the Y axis.
   */
  @JvmStatic
  public final fun mapGetCellHeight(map: RID): Float {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(ptr, MethodBindings.mapGetCellHeightPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Set the map's internal merge rasterizer cell scale used to control merging sensitivity.
   */
  @JvmStatic
  public final fun mapSetMergeRasterizerCellScale(map: RID, scale: Float): Unit {
    TransferContext.writeArguments(_RID to map, DOUBLE to scale.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.mapSetMergeRasterizerCellScalePtr, NIL)
  }

  /**
   * Returns map's internal merge rasterizer cell scale.
   */
  @JvmStatic
  public final fun mapGetMergeRasterizerCellScale(map: RID): Float {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(ptr, MethodBindings.mapGetMergeRasterizerCellScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Set the navigation [map] edge connection use. If [enabled] is `true`, the navigation map allows
   * navigation regions to use edge connections to connect with other navigation regions within
   * proximity of the navigation map edge connection margin.
   */
  @JvmStatic
  public final fun mapSetUseEdgeConnections(map: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to map, BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.mapSetUseEdgeConnectionsPtr, NIL)
  }

  /**
   * Returns `true` if the navigation [map] allows navigation regions to use edge connections to
   * connect with other navigation regions within proximity of the navigation map edge connection
   * margin.
   */
  @JvmStatic
  public final fun mapGetUseEdgeConnections(map: RID): Boolean {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(ptr, MethodBindings.mapGetUseEdgeConnectionsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Set the map edge connection margin used to weld the compatible region edges.
   */
  @JvmStatic
  public final fun mapSetEdgeConnectionMargin(map: RID, margin: Float): Unit {
    TransferContext.writeArguments(_RID to map, DOUBLE to margin.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.mapSetEdgeConnectionMarginPtr, NIL)
  }

  /**
   * Returns the edge connection margin of the map. This distance is the minimum vertex distance
   * needed to connect two edges from different regions.
   */
  @JvmStatic
  public final fun mapGetEdgeConnectionMargin(map: RID): Float {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(ptr, MethodBindings.mapGetEdgeConnectionMarginPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Set the map's link connection radius used to connect links to navigation polygons.
   */
  @JvmStatic
  public final fun mapSetLinkConnectionRadius(map: RID, radius: Float): Unit {
    TransferContext.writeArguments(_RID to map, DOUBLE to radius.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.mapSetLinkConnectionRadiusPtr, NIL)
  }

  /**
   * Returns the link connection radius of the map. This distance is the maximum range any link will
   * search for navigation mesh polygons to connect to.
   */
  @JvmStatic
  public final fun mapGetLinkConnectionRadius(map: RID): Float {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(ptr, MethodBindings.mapGetLinkConnectionRadiusPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the navigation path to reach the destination from the origin. [navigationLayers] is a
   * bitmask of all region navigation layers that are allowed to be in the path.
   */
  @JvmOverloads
  @JvmStatic
  public final fun mapGetPath(
    map: RID,
    origin: Vector3,
    destination: Vector3,
    optimize: Boolean,
    navigationLayers: Long = 1,
  ): PackedVector3Array {
    TransferContext.writeArguments(_RID to map, VECTOR3 to origin, VECTOR3 to destination, BOOL to optimize, LONG to navigationLayers)
    TransferContext.callMethod(ptr, MethodBindings.mapGetPathPtr, PACKED_VECTOR3_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY) as PackedVector3Array)
  }

  /**
   * Returns the navigation mesh surface point closest to the provided [start] and [end] segment on
   * the navigation [map].
   *
   * If [useCollision] is `true`, a closest point test is only done when the segment intersects with
   * the navigation mesh surface.
   */
  @JvmOverloads
  @JvmStatic
  public final fun mapGetClosestPointToSegment(
    map: RID,
    start: Vector3,
    end: Vector3,
    useCollision: Boolean = false,
  ): Vector3 {
    TransferContext.writeArguments(_RID to map, VECTOR3 to start, VECTOR3 to end, BOOL to useCollision)
    TransferContext.callMethod(ptr, MethodBindings.mapGetClosestPointToSegmentPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the navigation mesh surface point closest to the provided [toPoint] on the navigation
   * [map].
   */
  @JvmStatic
  public final fun mapGetClosestPoint(map: RID, toPoint: Vector3): Vector3 {
    TransferContext.writeArguments(_RID to map, VECTOR3 to toPoint)
    TransferContext.callMethod(ptr, MethodBindings.mapGetClosestPointPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the navigation mesh surface normal closest to the provided [toPoint] on the navigation
   * [map].
   */
  @JvmStatic
  public final fun mapGetClosestPointNormal(map: RID, toPoint: Vector3): Vector3 {
    TransferContext.writeArguments(_RID to map, VECTOR3 to toPoint)
    TransferContext.callMethod(ptr, MethodBindings.mapGetClosestPointNormalPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the owner region RID for the navigation mesh surface point closest to the provided
   * [toPoint] on the navigation [map].
   */
  @JvmStatic
  public final fun mapGetClosestPointOwner(map: RID, toPoint: Vector3): RID {
    TransferContext.writeArguments(_RID to map, VECTOR3 to toPoint)
    TransferContext.callMethod(ptr, MethodBindings.mapGetClosestPointOwnerPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Returns all navigation link [RID]s that are currently assigned to the requested navigation
   * [map].
   */
  @JvmStatic
  public final fun mapGetLinks(map: RID): VariantArray<RID> {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(ptr, MethodBindings.mapGetLinksPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<RID>)
  }

  /**
   * Returns all navigation regions [RID]s that are currently assigned to the requested navigation
   * [map].
   */
  @JvmStatic
  public final fun mapGetRegions(map: RID): VariantArray<RID> {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(ptr, MethodBindings.mapGetRegionsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<RID>)
  }

  /**
   * Returns all navigation agents [RID]s that are currently assigned to the requested navigation
   * [map].
   */
  @JvmStatic
  public final fun mapGetAgents(map: RID): VariantArray<RID> {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(ptr, MethodBindings.mapGetAgentsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<RID>)
  }

  /**
   * Returns all navigation obstacle [RID]s that are currently assigned to the requested navigation
   * [map].
   */
  @JvmStatic
  public final fun mapGetObstacles(map: RID): VariantArray<RID> {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(ptr, MethodBindings.mapGetObstaclesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<RID>)
  }

  /**
   * This function immediately forces synchronization of the specified navigation [map] [RID]. By
   * default navigation maps are only synchronized at the end of each physics frame. This function can
   * be used to immediately (re)calculate all the navigation meshes and region connections of the
   * navigation map. This makes it possible to query a navigation path for a changed map immediately
   * and in the same frame (multiple times if needed).
   *
   * Due to technical restrictions the current NavigationServer command queue will be flushed. This
   * means all already queued update commands for this physics frame will be executed, even those
   * intended for other maps, regions and agents not part of the specified map. The expensive
   * computation of the navigation meshes and region connections of a map will only be done for the
   * specified map. Other maps will receive the normal synchronization at the end of the physics frame.
   * Should the specified map receive changes after the forced update it will update again as well when
   * the other maps receive their update.
   *
   * Avoidance processing and dispatch of the `safe_velocity` signals is unaffected by this function
   * and continues to happen for all maps and agents at the end of the physics frame.
   *
   * **Note:** With great power comes great responsibility. This function should only be used by
   * users that really know what they are doing and have a good reason for it. Forcing an immediate
   * update of a navigation map requires locking the NavigationServer and flushing the entire
   * NavigationServer command queue. Not only can this severely impact the performance of a game but it
   * can also introduce bugs if used inappropriately without much foresight.
   */
  @JvmStatic
  public final fun mapForceUpdate(map: RID): Unit {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(ptr, MethodBindings.mapForceUpdatePtr, NIL)
  }

  /**
   * Returns the current iteration id of the navigation map. Every time the navigation map changes
   * and synchronizes the iteration id increases. An iteration id of 0 means the navigation map has
   * never synchronized.
   *
   * **Note:** The iteration id will wrap back to 1 after reaching its range limit.
   */
  @JvmStatic
  public final fun mapGetIterationId(map: RID): Long {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(ptr, MethodBindings.mapGetIterationIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * If [enabled] is `true` the [map] synchronization uses an async process that runs on a
   * background thread.
   */
  @JvmStatic
  public final fun mapSetUseAsyncIterations(map: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to map, BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.mapSetUseAsyncIterationsPtr, NIL)
  }

  /**
   * Returns `true` if the [map] synchronization uses an async process that runs on a background
   * thread.
   */
  @JvmStatic
  public final fun mapGetUseAsyncIterations(map: RID): Boolean {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(ptr, MethodBindings.mapGetUseAsyncIterationsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns a random position picked from all map region polygons with matching [navigationLayers].
   *
   * If [uniformly] is `true`, all map regions, polygons, and faces are weighted by their surface
   * area (slower).
   *
   * If [uniformly] is `false`, just a random region and a random polygon are picked (faster).
   */
  @JvmStatic
  public final fun mapGetRandomPoint(
    map: RID,
    navigationLayers: Long,
    uniformly: Boolean,
  ): Vector3 {
    TransferContext.writeArguments(_RID to map, LONG to navigationLayers, BOOL to uniformly)
    TransferContext.callMethod(ptr, MethodBindings.mapGetRandomPointPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Queries a path in a given navigation map. Start and target position and other parameters are
   * defined through [NavigationPathQueryParameters3D]. Updates the provided
   * [NavigationPathQueryResult3D] result object with the path among other results requested by the
   * query. After the process is finished the optional [callback] will be called.
   */
  @JvmOverloads
  @JvmStatic
  public final fun queryPath(
    parameters: NavigationPathQueryParameters3D?,
    result: NavigationPathQueryResult3D?,
    callback: Callable = VariantCallable(),
  ): Unit {
    TransferContext.writeArguments(OBJECT to parameters, OBJECT to result, CALLABLE to callback)
    TransferContext.callMethod(ptr, MethodBindings.queryPathPtr, NIL)
  }

  /**
   * Creates a new region.
   */
  @JvmStatic
  public final fun regionCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.regionCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * If [enabled] is `true`, the specified [region] will contribute to its current navigation map.
   */
  @JvmStatic
  public final fun regionSetEnabled(region: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to region, BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.regionSetEnabledPtr, NIL)
  }

  /**
   * Returns `true` if the specified [region] is enabled.
   */
  @JvmStatic
  public final fun regionGetEnabled(region: RID): Boolean {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(ptr, MethodBindings.regionGetEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If [enabled] is `true`, the navigation [region] will use edge connections to connect with other
   * navigation regions within proximity of the navigation map edge connection margin.
   */
  @JvmStatic
  public final fun regionSetUseEdgeConnections(region: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to region, BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.regionSetUseEdgeConnectionsPtr, NIL)
  }

  /**
   * Returns `true` if the navigation [region] is set to use edge connections to connect with other
   * navigation regions within proximity of the navigation map edge connection margin.
   */
  @JvmStatic
  public final fun regionGetUseEdgeConnections(region: RID): Boolean {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(ptr, MethodBindings.regionGetUseEdgeConnectionsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the [enterCost] for this [region].
   */
  @JvmStatic
  public final fun regionSetEnterCost(region: RID, enterCost: Float): Unit {
    TransferContext.writeArguments(_RID to region, DOUBLE to enterCost.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.regionSetEnterCostPtr, NIL)
  }

  /**
   * Returns the enter cost of this [region].
   */
  @JvmStatic
  public final fun regionGetEnterCost(region: RID): Float {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(ptr, MethodBindings.regionGetEnterCostPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the [travelCost] for this [region].
   */
  @JvmStatic
  public final fun regionSetTravelCost(region: RID, travelCost: Float): Unit {
    TransferContext.writeArguments(_RID to region, DOUBLE to travelCost.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.regionSetTravelCostPtr, NIL)
  }

  /**
   * Returns the travel cost of this [region].
   */
  @JvmStatic
  public final fun regionGetTravelCost(region: RID): Float {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(ptr, MethodBindings.regionGetTravelCostPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Set the `ObjectID` of the object which manages this region.
   */
  @JvmStatic
  public final fun regionSetOwnerId(region: RID, ownerId: Long): Unit {
    TransferContext.writeArguments(_RID to region, LONG to ownerId)
    TransferContext.callMethod(ptr, MethodBindings.regionSetOwnerIdPtr, NIL)
  }

  /**
   * Returns the `ObjectID` of the object which manages this region.
   */
  @JvmStatic
  public final fun regionGetOwnerId(region: RID): Long {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(ptr, MethodBindings.regionGetOwnerIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if the provided [point] in world space is currently owned by the provided
   * navigation [region]. Owned in this context means that one of the region's navigation mesh polygon
   * faces has a possible position at the closest distance to this point compared to all other
   * navigation meshes from other navigation regions that are also registered on the navigation map of
   * the provided region.
   *
   * If multiple navigation meshes have positions at equal distance the navigation region whose
   * polygons are processed first wins the ownership. Polygons are processed in the same order that
   * navigation regions were registered on the NavigationServer.
   *
   * **Note:** If navigation meshes from different navigation regions overlap (which should be
   * avoided in general) the result might not be what is expected.
   */
  @JvmStatic
  public final fun regionOwnsPoint(region: RID, point: Vector3): Boolean {
    TransferContext.writeArguments(_RID to region, VECTOR3 to point)
    TransferContext.callMethod(ptr, MethodBindings.regionOwnsPointPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the map for the region.
   */
  @JvmStatic
  public final fun regionSetMap(region: RID, map: RID): Unit {
    TransferContext.writeArguments(_RID to region, _RID to map)
    TransferContext.callMethod(ptr, MethodBindings.regionSetMapPtr, NIL)
  }

  /**
   * Returns the navigation map [RID] the requested [region] is currently assigned to.
   */
  @JvmStatic
  public final fun regionGetMap(region: RID): RID {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(ptr, MethodBindings.regionGetMapPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Set the region's navigation layers. This allows selecting regions from a path request (when
   * using [NavigationServer3D.mapGetPath]).
   */
  @JvmStatic
  public final fun regionSetNavigationLayers(region: RID, navigationLayers: Long): Unit {
    TransferContext.writeArguments(_RID to region, LONG to navigationLayers)
    TransferContext.callMethod(ptr, MethodBindings.regionSetNavigationLayersPtr, NIL)
  }

  /**
   * Returns the region's navigation layers.
   */
  @JvmStatic
  public final fun regionGetNavigationLayers(region: RID): Long {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(ptr, MethodBindings.regionGetNavigationLayersPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the global transformation for the region.
   */
  @JvmStatic
  public final fun regionSetTransform(region: RID, transform: Transform3D): Unit {
    TransferContext.writeArguments(_RID to region, TRANSFORM3D to transform)
    TransferContext.callMethod(ptr, MethodBindings.regionSetTransformPtr, NIL)
  }

  /**
   * Returns the global transformation of this [region].
   */
  @JvmStatic
  public final fun regionGetTransform(region: RID): Transform3D {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(ptr, MethodBindings.regionGetTransformPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  /**
   * Sets the navigation mesh for the region.
   */
  @JvmStatic
  public final fun regionSetNavigationMesh(region: RID, navigationMesh: NavigationMesh?): Unit {
    TransferContext.writeArguments(_RID to region, OBJECT to navigationMesh)
    TransferContext.callMethod(ptr, MethodBindings.regionSetNavigationMeshPtr, NIL)
  }

  /**
   * Bakes the [navigationMesh] with bake source geometry collected starting from the [rootNode].
   */
  @JvmStatic
  public final fun regionBakeNavigationMesh(navigationMesh: NavigationMesh?, rootNode: Node?):
      Unit {
    TransferContext.writeArguments(OBJECT to navigationMesh, OBJECT to rootNode)
    TransferContext.callMethod(ptr, MethodBindings.regionBakeNavigationMeshPtr, NIL)
  }

  /**
   * Returns how many connections this [region] has with other regions in the map.
   */
  @JvmStatic
  public final fun regionGetConnectionsCount(region: RID): Int {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(ptr, MethodBindings.regionGetConnectionsCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the starting point of a connection door. [connection] is an index between 0 and the
   * return value of [regionGetConnectionsCount].
   */
  @JvmStatic
  public final fun regionGetConnectionPathwayStart(region: RID, connection: Int): Vector3 {
    TransferContext.writeArguments(_RID to region, LONG to connection.toLong())
    TransferContext.callMethod(ptr, MethodBindings.regionGetConnectionPathwayStartPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the ending point of a connection door. [connection] is an index between 0 and the
   * return value of [regionGetConnectionsCount].
   */
  @JvmStatic
  public final fun regionGetConnectionPathwayEnd(region: RID, connection: Int): Vector3 {
    TransferContext.writeArguments(_RID to region, LONG to connection.toLong())
    TransferContext.callMethod(ptr, MethodBindings.regionGetConnectionPathwayEndPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the navigation mesh surface point closest to the provided [start] and [end] segment on
   * the navigation [region].
   *
   * If [useCollision] is `true`, a closest point test is only done when the segment intersects with
   * the navigation mesh surface.
   */
  @JvmOverloads
  @JvmStatic
  public final fun regionGetClosestPointToSegment(
    region: RID,
    start: Vector3,
    end: Vector3,
    useCollision: Boolean = false,
  ): Vector3 {
    TransferContext.writeArguments(_RID to region, VECTOR3 to start, VECTOR3 to end, BOOL to useCollision)
    TransferContext.callMethod(ptr, MethodBindings.regionGetClosestPointToSegmentPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the navigation mesh surface point closest to the provided [toPoint] on the navigation
   * [region].
   */
  @JvmStatic
  public final fun regionGetClosestPoint(region: RID, toPoint: Vector3): Vector3 {
    TransferContext.writeArguments(_RID to region, VECTOR3 to toPoint)
    TransferContext.callMethod(ptr, MethodBindings.regionGetClosestPointPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the navigation mesh surface normal closest to the provided [toPoint] on the navigation
   * [region].
   */
  @JvmStatic
  public final fun regionGetClosestPointNormal(region: RID, toPoint: Vector3): Vector3 {
    TransferContext.writeArguments(_RID to region, VECTOR3 to toPoint)
    TransferContext.callMethod(ptr, MethodBindings.regionGetClosestPointNormalPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns a random position picked from all region polygons with matching [navigationLayers].
   *
   * If [uniformly] is `true`, all region polygons and faces are weighted by their surface area
   * (slower).
   *
   * If [uniformly] is `false`, just a random polygon and face is picked (faster).
   */
  @JvmStatic
  public final fun regionGetRandomPoint(
    region: RID,
    navigationLayers: Long,
    uniformly: Boolean,
  ): Vector3 {
    TransferContext.writeArguments(_RID to region, LONG to navigationLayers, BOOL to uniformly)
    TransferContext.callMethod(ptr, MethodBindings.regionGetRandomPointPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the axis-aligned bounding box for the [region]'s transformed navigation mesh.
   */
  @JvmStatic
  public final fun regionGetBounds(region: RID): AABB {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(ptr, MethodBindings.regionGetBoundsPtr,
        godot.core.VariantParser.AABB)
    return (TransferContext.readReturnValue(godot.core.VariantParser.AABB) as AABB)
  }

  /**
   * Create a new link between two positions on a map.
   */
  @JvmStatic
  public final fun linkCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.linkCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Sets the navigation map [RID] for the link.
   */
  @JvmStatic
  public final fun linkSetMap(link: RID, map: RID): Unit {
    TransferContext.writeArguments(_RID to link, _RID to map)
    TransferContext.callMethod(ptr, MethodBindings.linkSetMapPtr, NIL)
  }

  /**
   * Returns the navigation map [RID] the requested [link] is currently assigned to.
   */
  @JvmStatic
  public final fun linkGetMap(link: RID): RID {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(ptr, MethodBindings.linkGetMapPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * If [enabled] is `true`, the specified [link] will contribute to its current navigation map.
   */
  @JvmStatic
  public final fun linkSetEnabled(link: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to link, BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.linkSetEnabledPtr, NIL)
  }

  /**
   * Returns `true` if the specified [link] is enabled.
   */
  @JvmStatic
  public final fun linkGetEnabled(link: RID): Boolean {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(ptr, MethodBindings.linkGetEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets whether this [link] can be travelled in both directions.
   */
  @JvmStatic
  public final fun linkSetBidirectional(link: RID, bidirectional: Boolean): Unit {
    TransferContext.writeArguments(_RID to link, BOOL to bidirectional)
    TransferContext.callMethod(ptr, MethodBindings.linkSetBidirectionalPtr, NIL)
  }

  /**
   * Returns whether this [link] can be travelled in both directions.
   */
  @JvmStatic
  public final fun linkIsBidirectional(link: RID): Boolean {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(ptr, MethodBindings.linkIsBidirectionalPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Set the links's navigation layers. This allows selecting links from a path request (when using
   * [NavigationServer3D.mapGetPath]).
   */
  @JvmStatic
  public final fun linkSetNavigationLayers(link: RID, navigationLayers: Long): Unit {
    TransferContext.writeArguments(_RID to link, LONG to navigationLayers)
    TransferContext.callMethod(ptr, MethodBindings.linkSetNavigationLayersPtr, NIL)
  }

  /**
   * Returns the navigation layers for this [link].
   */
  @JvmStatic
  public final fun linkGetNavigationLayers(link: RID): Long {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(ptr, MethodBindings.linkGetNavigationLayersPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the entry position for this [link].
   */
  @JvmStatic
  public final fun linkSetStartPosition(link: RID, position: Vector3): Unit {
    TransferContext.writeArguments(_RID to link, VECTOR3 to position)
    TransferContext.callMethod(ptr, MethodBindings.linkSetStartPositionPtr, NIL)
  }

  /**
   * Returns the starting position of this [link].
   */
  @JvmStatic
  public final fun linkGetStartPosition(link: RID): Vector3 {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(ptr, MethodBindings.linkGetStartPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Sets the exit position for the [link].
   */
  @JvmStatic
  public final fun linkSetEndPosition(link: RID, position: Vector3): Unit {
    TransferContext.writeArguments(_RID to link, VECTOR3 to position)
    TransferContext.callMethod(ptr, MethodBindings.linkSetEndPositionPtr, NIL)
  }

  /**
   * Returns the ending position of this [link].
   */
  @JvmStatic
  public final fun linkGetEndPosition(link: RID): Vector3 {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(ptr, MethodBindings.linkGetEndPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Sets the [enterCost] for this [link].
   */
  @JvmStatic
  public final fun linkSetEnterCost(link: RID, enterCost: Float): Unit {
    TransferContext.writeArguments(_RID to link, DOUBLE to enterCost.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.linkSetEnterCostPtr, NIL)
  }

  /**
   * Returns the enter cost of this [link].
   */
  @JvmStatic
  public final fun linkGetEnterCost(link: RID): Float {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(ptr, MethodBindings.linkGetEnterCostPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the [travelCost] for this [link].
   */
  @JvmStatic
  public final fun linkSetTravelCost(link: RID, travelCost: Float): Unit {
    TransferContext.writeArguments(_RID to link, DOUBLE to travelCost.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.linkSetTravelCostPtr, NIL)
  }

  /**
   * Returns the travel cost of this [link].
   */
  @JvmStatic
  public final fun linkGetTravelCost(link: RID): Float {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(ptr, MethodBindings.linkGetTravelCostPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Set the `ObjectID` of the object which manages this link.
   */
  @JvmStatic
  public final fun linkSetOwnerId(link: RID, ownerId: Long): Unit {
    TransferContext.writeArguments(_RID to link, LONG to ownerId)
    TransferContext.callMethod(ptr, MethodBindings.linkSetOwnerIdPtr, NIL)
  }

  /**
   * Returns the `ObjectID` of the object which manages this link.
   */
  @JvmStatic
  public final fun linkGetOwnerId(link: RID): Long {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(ptr, MethodBindings.linkGetOwnerIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Creates the agent.
   */
  @JvmStatic
  public final fun agentCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.agentCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * If [enabled] is `true`, the provided [agent] calculates avoidance.
   */
  @JvmStatic
  public final fun agentSetAvoidanceEnabled(agent: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to agent, BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.agentSetAvoidanceEnabledPtr, NIL)
  }

  /**
   * Returns `true` if the provided [agent] has avoidance enabled.
   */
  @JvmStatic
  public final fun agentGetAvoidanceEnabled(agent: RID): Boolean {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(ptr, MethodBindings.agentGetAvoidanceEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets if the agent uses the 2D avoidance or the 3D avoidance while avoidance is enabled.
   *
   * If `true` the agent calculates avoidance velocities in 3D for the xyz-axis, e.g. for games that
   * take place in air, underwater or space. The 3D using agent only avoids other 3D avoidance using
   * agent's. The 3D using agent only reacts to radius based avoidance obstacles. The 3D using agent
   * ignores any vertices based obstacles. The 3D using agent only avoids other 3D using agent's.
   *
   * If `false` the agent calculates avoidance velocities in 2D along the xz-axis ignoring the
   * y-axis. The 2D using agent only avoids other 2D avoidance using agent's. The 2D using agent reacts
   * to radius avoidance obstacles. The 2D using agent reacts to vertices based avoidance obstacles.
   * The 2D using agent only avoids other 2D using agent's. 2D using agents will ignore other 2D using
   * agents or obstacles that are below their current position or above their current position
   * including the agents height in 2D avoidance.
   */
  @JvmStatic
  public final fun agentSetUse3dAvoidance(agent: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to agent, BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.agentSetUse3dAvoidancePtr, NIL)
  }

  /**
   * Returns `true` if the provided [agent] uses avoidance in 3D space Vector3(x,y,z) instead of
   * horizontal 2D Vector2(x,y) / Vector3(x,0.0,z).
   */
  @JvmStatic
  public final fun agentGetUse3dAvoidance(agent: RID): Boolean {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(ptr, MethodBindings.agentGetUse3dAvoidancePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Puts the agent in the map.
   */
  @JvmStatic
  public final fun agentSetMap(agent: RID, map: RID): Unit {
    TransferContext.writeArguments(_RID to agent, _RID to map)
    TransferContext.callMethod(ptr, MethodBindings.agentSetMapPtr, NIL)
  }

  /**
   * Returns the navigation map [RID] the requested [agent] is currently assigned to.
   */
  @JvmStatic
  public final fun agentGetMap(agent: RID): RID {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(ptr, MethodBindings.agentGetMapPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * If [paused] is `true` the specified [agent] will not be processed, e.g. calculate avoidance
   * velocities or receive avoidance callbacks.
   */
  @JvmStatic
  public final fun agentSetPaused(agent: RID, paused: Boolean): Unit {
    TransferContext.writeArguments(_RID to agent, BOOL to paused)
    TransferContext.callMethod(ptr, MethodBindings.agentSetPausedPtr, NIL)
  }

  /**
   * Returns `true` if the specified [agent] is paused.
   */
  @JvmStatic
  public final fun agentGetPaused(agent: RID): Boolean {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(ptr, MethodBindings.agentGetPausedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the maximum distance to other agents this agent takes into account in the navigation. The
   * larger this number, the longer the running time of the simulation. If the number is too low, the
   * simulation will not be safe.
   */
  @JvmStatic
  public final fun agentSetNeighborDistance(agent: RID, distance: Float): Unit {
    TransferContext.writeArguments(_RID to agent, DOUBLE to distance.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.agentSetNeighborDistancePtr, NIL)
  }

  /**
   * Returns the maximum distance to other agents the specified [agent] takes into account in the
   * navigation.
   */
  @JvmStatic
  public final fun agentGetNeighborDistance(agent: RID): Float {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(ptr, MethodBindings.agentGetNeighborDistancePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the maximum number of other agents the agent takes into account in the navigation. The
   * larger this number, the longer the running time of the simulation. If the number is too low, the
   * simulation will not be safe.
   */
  @JvmStatic
  public final fun agentSetMaxNeighbors(agent: RID, count: Int): Unit {
    TransferContext.writeArguments(_RID to agent, LONG to count.toLong())
    TransferContext.callMethod(ptr, MethodBindings.agentSetMaxNeighborsPtr, NIL)
  }

  /**
   * Returns the maximum number of other agents the specified [agent] takes into account in the
   * navigation.
   */
  @JvmStatic
  public final fun agentGetMaxNeighbors(agent: RID): Int {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(ptr, MethodBindings.agentGetMaxNeighborsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * The minimal amount of time for which the agent's velocities that are computed by the simulation
   * are safe with respect to other agents. The larger this number, the sooner this agent will respond
   * to the presence of other agents, but the less freedom this agent has in choosing its velocities. A
   * too high value will slow down agents movement considerably. Must be positive.
   */
  @JvmStatic
  public final fun agentSetTimeHorizonAgents(agent: RID, timeHorizon: Float): Unit {
    TransferContext.writeArguments(_RID to agent, DOUBLE to timeHorizon.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.agentSetTimeHorizonAgentsPtr, NIL)
  }

  /**
   * Returns the minimal amount of time for which the specified [agent]'s velocities that are
   * computed by the simulation are safe with respect to other agents.
   */
  @JvmStatic
  public final fun agentGetTimeHorizonAgents(agent: RID): Float {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(ptr, MethodBindings.agentGetTimeHorizonAgentsPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * The minimal amount of time for which the agent's velocities that are computed by the simulation
   * are safe with respect to static avoidance obstacles. The larger this number, the sooner this agent
   * will respond to the presence of static avoidance obstacles, but the less freedom this agent has in
   * choosing its velocities. A too high value will slow down agents movement considerably. Must be
   * positive.
   */
  @JvmStatic
  public final fun agentSetTimeHorizonObstacles(agent: RID, timeHorizon: Float): Unit {
    TransferContext.writeArguments(_RID to agent, DOUBLE to timeHorizon.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.agentSetTimeHorizonObstaclesPtr, NIL)
  }

  /**
   * Returns the minimal amount of time for which the specified [agent]'s velocities that are
   * computed by the simulation are safe with respect to static avoidance obstacles.
   */
  @JvmStatic
  public final fun agentGetTimeHorizonObstacles(agent: RID): Float {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(ptr, MethodBindings.agentGetTimeHorizonObstaclesPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the radius of the agent.
   */
  @JvmStatic
  public final fun agentSetRadius(agent: RID, radius: Float): Unit {
    TransferContext.writeArguments(_RID to agent, DOUBLE to radius.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.agentSetRadiusPtr, NIL)
  }

  /**
   * Returns the radius of the specified [agent].
   */
  @JvmStatic
  public final fun agentGetRadius(agent: RID): Float {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(ptr, MethodBindings.agentGetRadiusPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Updates the provided [agent] [height].
   */
  @JvmStatic
  public final fun agentSetHeight(agent: RID, height: Float): Unit {
    TransferContext.writeArguments(_RID to agent, DOUBLE to height.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.agentSetHeightPtr, NIL)
  }

  /**
   * Returns the `height` of the specified [agent].
   */
  @JvmStatic
  public final fun agentGetHeight(agent: RID): Float {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(ptr, MethodBindings.agentGetHeightPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the maximum speed of the agent. Must be positive.
   */
  @JvmStatic
  public final fun agentSetMaxSpeed(agent: RID, maxSpeed: Float): Unit {
    TransferContext.writeArguments(_RID to agent, DOUBLE to maxSpeed.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.agentSetMaxSpeedPtr, NIL)
  }

  /**
   * Returns the maximum speed of the specified [agent].
   */
  @JvmStatic
  public final fun agentGetMaxSpeed(agent: RID): Float {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(ptr, MethodBindings.agentGetMaxSpeedPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Replaces the internal velocity in the collision avoidance simulation with [velocity] for the
   * specified [agent]. When an agent is teleported to a new position this function should be used in
   * the same frame. If called frequently this function can get agents stuck.
   */
  @JvmStatic
  public final fun agentSetVelocityForced(agent: RID, velocity: Vector3): Unit {
    TransferContext.writeArguments(_RID to agent, VECTOR3 to velocity)
    TransferContext.callMethod(ptr, MethodBindings.agentSetVelocityForcedPtr, NIL)
  }

  /**
   * Sets [velocity] as the new wanted velocity for the specified [agent]. The avoidance simulation
   * will try to fulfill this velocity if possible but will modify it to avoid collision with other
   * agent's and obstacles. When an agent is teleported to a new position use [agentSetVelocityForced]
   * as well to reset the internal simulation velocity.
   */
  @JvmStatic
  public final fun agentSetVelocity(agent: RID, velocity: Vector3): Unit {
    TransferContext.writeArguments(_RID to agent, VECTOR3 to velocity)
    TransferContext.callMethod(ptr, MethodBindings.agentSetVelocityPtr, NIL)
  }

  /**
   * Returns the velocity of the specified [agent].
   */
  @JvmStatic
  public final fun agentGetVelocity(agent: RID): Vector3 {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(ptr, MethodBindings.agentGetVelocityPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Sets the position of the agent in world space.
   */
  @JvmStatic
  public final fun agentSetPosition(agent: RID, position: Vector3): Unit {
    TransferContext.writeArguments(_RID to agent, VECTOR3 to position)
    TransferContext.callMethod(ptr, MethodBindings.agentSetPositionPtr, NIL)
  }

  /**
   * Returns the position of the specified [agent] in world space.
   */
  @JvmStatic
  public final fun agentGetPosition(agent: RID): Vector3 {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(ptr, MethodBindings.agentGetPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns `true` if the map got changed the previous frame.
   */
  @JvmStatic
  public final fun agentIsMapChanged(agent: RID): Boolean {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(ptr, MethodBindings.agentIsMapChangedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the callback [Callable] that gets called after each avoidance processing step for the
   * [agent]. The calculated `safe_velocity` will be dispatched with a signal to the object just before
   * the physics calculations.
   *
   * **Note:** Created callbacks are always processed independently of the SceneTree state as long
   * as the agent is on a navigation map and not freed. To disable the dispatch of a callback from an
   * agent use [agentSetAvoidanceCallback] again with an empty [Callable].
   */
  @JvmStatic
  public final fun agentSetAvoidanceCallback(agent: RID, callback: Callable): Unit {
    TransferContext.writeArguments(_RID to agent, CALLABLE to callback)
    TransferContext.callMethod(ptr, MethodBindings.agentSetAvoidanceCallbackPtr, NIL)
  }

  /**
   * Return `true` if the specified [agent] has an avoidance callback.
   */
  @JvmStatic
  public final fun agentHasAvoidanceCallback(agent: RID): Boolean {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(ptr, MethodBindings.agentHasAvoidanceCallbackPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Set the agent's `avoidance_layers` bitmask.
   */
  @JvmStatic
  public final fun agentSetAvoidanceLayers(agent: RID, layers: Long): Unit {
    TransferContext.writeArguments(_RID to agent, LONG to layers)
    TransferContext.callMethod(ptr, MethodBindings.agentSetAvoidanceLayersPtr, NIL)
  }

  /**
   * Returns the `avoidance_layers` bitmask of the specified [agent].
   */
  @JvmStatic
  public final fun agentGetAvoidanceLayers(agent: RID): Long {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(ptr, MethodBindings.agentGetAvoidanceLayersPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Set the agent's `avoidance_mask` bitmask.
   */
  @JvmStatic
  public final fun agentSetAvoidanceMask(agent: RID, mask: Long): Unit {
    TransferContext.writeArguments(_RID to agent, LONG to mask)
    TransferContext.callMethod(ptr, MethodBindings.agentSetAvoidanceMaskPtr, NIL)
  }

  /**
   * Returns the `avoidance_mask` bitmask of the specified [agent].
   */
  @JvmStatic
  public final fun agentGetAvoidanceMask(agent: RID): Long {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(ptr, MethodBindings.agentGetAvoidanceMaskPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Set the agent's `avoidance_priority` with a [priority] between 0.0 (lowest priority) to 1.0
   * (highest priority).
   *
   * The specified [agent] does not adjust the velocity for other agents that would match the
   * `avoidance_mask` but have a lower `avoidance_priority`. This in turn makes the other agents with
   * lower priority adjust their velocities even more to avoid collision with this agent.
   */
  @JvmStatic
  public final fun agentSetAvoidancePriority(agent: RID, priority: Float): Unit {
    TransferContext.writeArguments(_RID to agent, DOUBLE to priority.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.agentSetAvoidancePriorityPtr, NIL)
  }

  /**
   * Returns the `avoidance_priority` of the specified [agent].
   */
  @JvmStatic
  public final fun agentGetAvoidancePriority(agent: RID): Float {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(ptr, MethodBindings.agentGetAvoidancePriorityPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Creates a new obstacle.
   */
  @JvmStatic
  public final fun obstacleCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.obstacleCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * If [enabled] is `true`, the provided [obstacle] affects avoidance using agents.
   */
  @JvmStatic
  public final fun obstacleSetAvoidanceEnabled(obstacle: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to obstacle, BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.obstacleSetAvoidanceEnabledPtr, NIL)
  }

  /**
   * Returns `true` if the provided [obstacle] has avoidance enabled.
   */
  @JvmStatic
  public final fun obstacleGetAvoidanceEnabled(obstacle: RID): Boolean {
    TransferContext.writeArguments(_RID to obstacle)
    TransferContext.callMethod(ptr, MethodBindings.obstacleGetAvoidanceEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets if the [obstacle] uses the 2D avoidance or the 3D avoidance while avoidance is enabled.
   */
  @JvmStatic
  public final fun obstacleSetUse3dAvoidance(obstacle: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to obstacle, BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.obstacleSetUse3dAvoidancePtr, NIL)
  }

  /**
   * Returns `true` if the provided [obstacle] uses avoidance in 3D space Vector3(x,y,z) instead of
   * horizontal 2D Vector2(x,y) / Vector3(x,0.0,z).
   */
  @JvmStatic
  public final fun obstacleGetUse3dAvoidance(obstacle: RID): Boolean {
    TransferContext.writeArguments(_RID to obstacle)
    TransferContext.callMethod(ptr, MethodBindings.obstacleGetUse3dAvoidancePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Assigns the [obstacle] to a navigation map.
   */
  @JvmStatic
  public final fun obstacleSetMap(obstacle: RID, map: RID): Unit {
    TransferContext.writeArguments(_RID to obstacle, _RID to map)
    TransferContext.callMethod(ptr, MethodBindings.obstacleSetMapPtr, NIL)
  }

  /**
   * Returns the navigation map [RID] the requested [obstacle] is currently assigned to.
   */
  @JvmStatic
  public final fun obstacleGetMap(obstacle: RID): RID {
    TransferContext.writeArguments(_RID to obstacle)
    TransferContext.callMethod(ptr, MethodBindings.obstacleGetMapPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * If [paused] is `true` the specified [obstacle] will not be processed, e.g. affect avoidance
   * velocities.
   */
  @JvmStatic
  public final fun obstacleSetPaused(obstacle: RID, paused: Boolean): Unit {
    TransferContext.writeArguments(_RID to obstacle, BOOL to paused)
    TransferContext.callMethod(ptr, MethodBindings.obstacleSetPausedPtr, NIL)
  }

  /**
   * Returns `true` if the specified [obstacle] is paused.
   */
  @JvmStatic
  public final fun obstacleGetPaused(obstacle: RID): Boolean {
    TransferContext.writeArguments(_RID to obstacle)
    TransferContext.callMethod(ptr, MethodBindings.obstacleGetPausedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the radius of the dynamic obstacle.
   */
  @JvmStatic
  public final fun obstacleSetRadius(obstacle: RID, radius: Float): Unit {
    TransferContext.writeArguments(_RID to obstacle, DOUBLE to radius.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.obstacleSetRadiusPtr, NIL)
  }

  /**
   * Returns the radius of the specified dynamic [obstacle].
   */
  @JvmStatic
  public final fun obstacleGetRadius(obstacle: RID): Float {
    TransferContext.writeArguments(_RID to obstacle)
    TransferContext.callMethod(ptr, MethodBindings.obstacleGetRadiusPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the [height] for the [obstacle]. In 3D agents will ignore obstacles that are above or
   * below them while using 2D avoidance.
   */
  @JvmStatic
  public final fun obstacleSetHeight(obstacle: RID, height: Float): Unit {
    TransferContext.writeArguments(_RID to obstacle, DOUBLE to height.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.obstacleSetHeightPtr, NIL)
  }

  /**
   * Returns the `height` of the specified [obstacle].
   */
  @JvmStatic
  public final fun obstacleGetHeight(obstacle: RID): Float {
    TransferContext.writeArguments(_RID to obstacle)
    TransferContext.callMethod(ptr, MethodBindings.obstacleGetHeightPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets [velocity] of the dynamic [obstacle]. Allows other agents to better predict the movement
   * of the dynamic obstacle. Only works in combination with the radius of the obstacle.
   */
  @JvmStatic
  public final fun obstacleSetVelocity(obstacle: RID, velocity: Vector3): Unit {
    TransferContext.writeArguments(_RID to obstacle, VECTOR3 to velocity)
    TransferContext.callMethod(ptr, MethodBindings.obstacleSetVelocityPtr, NIL)
  }

  /**
   * Returns the velocity of the specified dynamic [obstacle].
   */
  @JvmStatic
  public final fun obstacleGetVelocity(obstacle: RID): Vector3 {
    TransferContext.writeArguments(_RID to obstacle)
    TransferContext.callMethod(ptr, MethodBindings.obstacleGetVelocityPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Updates the [position] in world space for the [obstacle].
   */
  @JvmStatic
  public final fun obstacleSetPosition(obstacle: RID, position: Vector3): Unit {
    TransferContext.writeArguments(_RID to obstacle, VECTOR3 to position)
    TransferContext.callMethod(ptr, MethodBindings.obstacleSetPositionPtr, NIL)
  }

  /**
   * Returns the position of the specified [obstacle] in world space.
   */
  @JvmStatic
  public final fun obstacleGetPosition(obstacle: RID): Vector3 {
    TransferContext.writeArguments(_RID to obstacle)
    TransferContext.callMethod(ptr, MethodBindings.obstacleGetPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Sets the outline vertices for the obstacle. If the vertices are winded in clockwise order
   * agents will be pushed in by the obstacle, else they will be pushed out.
   */
  @JvmStatic
  public final fun obstacleSetVertices(obstacle: RID, vertices: PackedVector3Array): Unit {
    TransferContext.writeArguments(_RID to obstacle, PACKED_VECTOR3_ARRAY to vertices)
    TransferContext.callMethod(ptr, MethodBindings.obstacleSetVerticesPtr, NIL)
  }

  /**
   * Returns the outline vertices for the specified [obstacle].
   */
  @JvmStatic
  public final fun obstacleGetVertices(obstacle: RID): PackedVector3Array {
    TransferContext.writeArguments(_RID to obstacle)
    TransferContext.callMethod(ptr, MethodBindings.obstacleGetVerticesPtr, PACKED_VECTOR3_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY) as PackedVector3Array)
  }

  /**
   * Set the obstacles's `avoidance_layers` bitmask.
   */
  @JvmStatic
  public final fun obstacleSetAvoidanceLayers(obstacle: RID, layers: Long): Unit {
    TransferContext.writeArguments(_RID to obstacle, LONG to layers)
    TransferContext.callMethod(ptr, MethodBindings.obstacleSetAvoidanceLayersPtr, NIL)
  }

  /**
   * Returns the `avoidance_layers` bitmask of the specified [obstacle].
   */
  @JvmStatic
  public final fun obstacleGetAvoidanceLayers(obstacle: RID): Long {
    TransferContext.writeArguments(_RID to obstacle)
    TransferContext.callMethod(ptr, MethodBindings.obstacleGetAvoidanceLayersPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Parses the [SceneTree] for source geometry according to the properties of [navigationMesh].
   * Updates the provided [sourceGeometryData] resource with the resulting data. The resource can then
   * be used to bake a navigation mesh with [bakeFromSourceGeometryData]. After the process is finished
   * the optional [callback] will be called.
   *
   * **Note:** This function needs to run on the main thread or with a deferred call as the
   * SceneTree is not thread-safe.
   *
   * **Performance:** While convenient, reading data arrays from [Mesh] resources can affect the
   * frame rate negatively. The data needs to be received from the GPU, stalling the [RenderingServer]
   * in the process. For performance prefer the use of e.g. collision shapes or creating the data
   * arrays entirely in code.
   */
  @JvmOverloads
  @JvmStatic
  public final fun parseSourceGeometryData(
    navigationMesh: NavigationMesh?,
    sourceGeometryData: NavigationMeshSourceGeometryData3D?,
    rootNode: Node?,
    callback: Callable = VariantCallable(),
  ): Unit {
    TransferContext.writeArguments(OBJECT to navigationMesh, OBJECT to sourceGeometryData, OBJECT to rootNode, CALLABLE to callback)
    TransferContext.callMethod(ptr, MethodBindings.parseSourceGeometryDataPtr, NIL)
  }

  /**
   * Bakes the provided [navigationMesh] with the data from the provided [sourceGeometryData]. After
   * the process is finished the optional [callback] will be called.
   */
  @JvmOverloads
  @JvmStatic
  public final fun bakeFromSourceGeometryData(
    navigationMesh: NavigationMesh?,
    sourceGeometryData: NavigationMeshSourceGeometryData3D?,
    callback: Callable = VariantCallable(),
  ): Unit {
    TransferContext.writeArguments(OBJECT to navigationMesh, OBJECT to sourceGeometryData, CALLABLE to callback)
    TransferContext.callMethod(ptr, MethodBindings.bakeFromSourceGeometryDataPtr, NIL)
  }

  /**
   * Bakes the provided [navigationMesh] with the data from the provided [sourceGeometryData] as an
   * async task running on a background thread. After the process is finished the optional [callback]
   * will be called.
   */
  @JvmOverloads
  @JvmStatic
  public final fun bakeFromSourceGeometryDataAsync(
    navigationMesh: NavigationMesh?,
    sourceGeometryData: NavigationMeshSourceGeometryData3D?,
    callback: Callable = VariantCallable(),
  ): Unit {
    TransferContext.writeArguments(OBJECT to navigationMesh, OBJECT to sourceGeometryData, CALLABLE to callback)
    TransferContext.callMethod(ptr, MethodBindings.bakeFromSourceGeometryDataAsyncPtr, NIL)
  }

  /**
   * Returns `true` when the provided navigation mesh is being baked on a background thread.
   */
  @JvmStatic
  public final fun isBakingNavigationMesh(navigationMesh: NavigationMesh?): Boolean {
    TransferContext.writeArguments(OBJECT to navigationMesh)
    TransferContext.callMethod(ptr, MethodBindings.isBakingNavigationMeshPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Creates a new source geometry parser. If a [Callable] is set for the parser with
   * [sourceGeometryParserSetCallback] the callback will be called for every single node that gets
   * parsed whenever [parseSourceGeometryData] is used.
   */
  @JvmStatic
  public final fun sourceGeometryParserCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.sourceGeometryParserCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Sets the [callback] [Callable] for the specific source geometry [parser]. The [Callable] will
   * receive a call with the following parameters:
   *
   * - `navigation_mesh` - The [NavigationMesh] reference used to define the parse settings. Do NOT
   * edit or add directly to the navigation mesh.
   *
   * - `source_geometry_data` - The [NavigationMeshSourceGeometryData3D] reference. Add custom
   * source geometry for navigation mesh baking to this object.
   *
   * - `node` - The [Node] that is parsed.
   */
  @JvmStatic
  public final fun sourceGeometryParserSetCallback(parser: RID, callback: Callable): Unit {
    TransferContext.writeArguments(_RID to parser, CALLABLE to callback)
    TransferContext.callMethod(ptr, MethodBindings.sourceGeometryParserSetCallbackPtr, NIL)
  }

  /**
   * Returns a simplified version of [path] with less critical path points removed. The
   * simplification amount is in worlds units and controlled by [epsilon]. The simplification uses a
   * variant of Ramer-Douglas-Peucker algorithm for curve point decimation.
   *
   * Path simplification can be helpful to mitigate various path following issues that can arise
   * with certain agent types and script behaviors. E.g. "steering" agents or avoidance in "open
   * fields".
   */
  @JvmStatic
  public final fun simplifyPath(path: PackedVector3Array, epsilon: Float): PackedVector3Array {
    TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to path, DOUBLE to epsilon.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.simplifyPathPtr, PACKED_VECTOR3_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY) as PackedVector3Array)
  }

  /**
   * Destroys the given RID.
   */
  @JvmStatic
  public final fun freeRid(rid: RID): Unit {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(ptr, MethodBindings.freeRidPtr, NIL)
  }

  /**
   * Control activation of this server.
   */
  @JvmStatic
  public final fun setActive(active: Boolean): Unit {
    TransferContext.writeArguments(BOOL to active)
    TransferContext.callMethod(ptr, MethodBindings.setActivePtr, NIL)
  }

  /**
   * If `true` enables debug mode on the NavigationServer.
   */
  @JvmStatic
  public final fun setDebugEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setDebugEnabledPtr, NIL)
  }

  /**
   * Returns `true` when the NavigationServer has debug enabled.
   */
  @JvmStatic
  public final fun getDebugEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDebugEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns information about the current state of the NavigationServer. See [ProcessInfo] for a
   * list of available states.
   */
  @JvmStatic
  public final fun getProcessInfo(processInfo: ProcessInfo): Int {
    TransferContext.writeArguments(LONG to processInfo.id)
    TransferContext.callMethod(ptr, MethodBindings.getProcessInfoPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public enum class ProcessInfo(
    id: Long,
  ) {
    /**
     * Constant to get the number of active navigation maps.
     */
    INFO_ACTIVE_MAPS(0),
    /**
     * Constant to get the number of active navigation regions.
     */
    INFO_REGION_COUNT(1),
    /**
     * Constant to get the number of active navigation agents processing avoidance.
     */
    INFO_AGENT_COUNT(2),
    /**
     * Constant to get the number of active navigation links.
     */
    INFO_LINK_COUNT(3),
    /**
     * Constant to get the number of navigation mesh polygons.
     */
    INFO_POLYGON_COUNT(4),
    /**
     * Constant to get the number of navigation mesh polygon edges.
     */
    INFO_EDGE_COUNT(5),
    /**
     * Constant to get the number of navigation mesh polygon edges that were merged due to edge key
     * overlap.
     */
    INFO_EDGE_MERGE_COUNT(6),
    /**
     * Constant to get the number of navigation mesh polygon edges that are considered connected by
     * edge proximity.
     */
    INFO_EDGE_CONNECTION_COUNT(7),
    /**
     * Constant to get the number of navigation mesh polygon edges that could not be merged but may
     * be still connected by edge proximity or with links.
     */
    INFO_EDGE_FREE_COUNT(8),
    /**
     * Constant to get the number of active navigation obstacles.
     */
    INFO_OBSTACLE_COUNT(9),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ProcessInfo = entries.single { it.id == `value` }
    }
  }

  public object MethodBindings {
    internal val getMapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "get_maps", 3995934104)

    internal val mapCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_create", 529393457)

    internal val mapSetActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_set_active", 1265174801)

    internal val mapIsActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_is_active", 4155700596)

    internal val mapSetUpPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_set_up", 3227306858)

    internal val mapGetUpPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_up", 531438156)

    internal val mapSetCellSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_set_cell_size", 1794382983)

    internal val mapGetCellSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_cell_size", 866169185)

    internal val mapSetCellHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_set_cell_height", 1794382983)

    internal val mapGetCellHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_cell_height", 866169185)

    internal val mapSetMergeRasterizerCellScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_set_merge_rasterizer_cell_scale", 1794382983)

    internal val mapGetMergeRasterizerCellScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_merge_rasterizer_cell_scale", 866169185)

    internal val mapSetUseEdgeConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_set_use_edge_connections", 1265174801)

    internal val mapGetUseEdgeConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_use_edge_connections", 4155700596)

    internal val mapSetEdgeConnectionMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_set_edge_connection_margin", 1794382983)

    internal val mapGetEdgeConnectionMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_edge_connection_margin", 866169185)

    internal val mapSetLinkConnectionRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_set_link_connection_radius", 1794382983)

    internal val mapGetLinkConnectionRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_link_connection_radius", 866169185)

    internal val mapGetPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_path", 276783190)

    internal val mapGetClosestPointToSegmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_closest_point_to_segment", 3830095642)

    internal val mapGetClosestPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_closest_point", 2056183332)

    internal val mapGetClosestPointNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_closest_point_normal", 2056183332)

    internal val mapGetClosestPointOwnerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_closest_point_owner", 553364610)

    internal val mapGetLinksPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_links", 2684255073)

    internal val mapGetRegionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_regions", 2684255073)

    internal val mapGetAgentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_agents", 2684255073)

    internal val mapGetObstaclesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_obstacles", 2684255073)

    internal val mapForceUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_force_update", 2722037293)

    internal val mapGetIterationIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_iteration_id", 2198884583)

    internal val mapSetUseAsyncIterationsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_set_use_async_iterations", 1265174801)

    internal val mapGetUseAsyncIterationsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_use_async_iterations", 4155700596)

    internal val mapGetRandomPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_random_point", 722801526)

    internal val queryPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "query_path", 2146930868)

    internal val regionCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_create", 529393457)

    internal val regionSetEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_set_enabled", 1265174801)

    internal val regionGetEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_enabled", 4155700596)

    internal val regionSetUseEdgeConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_set_use_edge_connections", 1265174801)

    internal val regionGetUseEdgeConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_use_edge_connections", 4155700596)

    internal val regionSetEnterCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_set_enter_cost", 1794382983)

    internal val regionGetEnterCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_enter_cost", 866169185)

    internal val regionSetTravelCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_set_travel_cost", 1794382983)

    internal val regionGetTravelCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_travel_cost", 866169185)

    internal val regionSetOwnerIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_set_owner_id", 3411492887)

    internal val regionGetOwnerIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_owner_id", 2198884583)

    internal val regionOwnsPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_owns_point", 2360011153)

    internal val regionSetMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_set_map", 395945892)

    internal val regionGetMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_map", 3814569979)

    internal val regionSetNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_set_navigation_layers", 3411492887)

    internal val regionGetNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_navigation_layers", 2198884583)

    internal val regionSetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_set_transform", 3935195649)

    internal val regionGetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_transform", 1128465797)

    internal val regionSetNavigationMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_set_navigation_mesh", 2764952978)

    internal val regionBakeNavigationMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_bake_navigation_mesh", 1401173477)

    internal val regionGetConnectionsCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_connections_count", 2198884583)

    internal val regionGetConnectionPathwayStartPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_connection_pathway_start", 3440143363)

    internal val regionGetConnectionPathwayEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_connection_pathway_end", 3440143363)

    internal val regionGetClosestPointToSegmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_closest_point_to_segment", 3830095642)

    internal val regionGetClosestPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_closest_point", 2056183332)

    internal val regionGetClosestPointNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_closest_point_normal", 2056183332)

    internal val regionGetRandomPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_random_point", 722801526)

    internal val regionGetBoundsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_bounds", 974181306)

    internal val linkCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_create", 529393457)

    internal val linkSetMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_set_map", 395945892)

    internal val linkGetMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_get_map", 3814569979)

    internal val linkSetEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_set_enabled", 1265174801)

    internal val linkGetEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_get_enabled", 4155700596)

    internal val linkSetBidirectionalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_set_bidirectional", 1265174801)

    internal val linkIsBidirectionalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_is_bidirectional", 4155700596)

    internal val linkSetNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_set_navigation_layers", 3411492887)

    internal val linkGetNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_get_navigation_layers", 2198884583)

    internal val linkSetStartPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_set_start_position", 3227306858)

    internal val linkGetStartPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_get_start_position", 531438156)

    internal val linkSetEndPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_set_end_position", 3227306858)

    internal val linkGetEndPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_get_end_position", 531438156)

    internal val linkSetEnterCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_set_enter_cost", 1794382983)

    internal val linkGetEnterCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_get_enter_cost", 866169185)

    internal val linkSetTravelCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_set_travel_cost", 1794382983)

    internal val linkGetTravelCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_get_travel_cost", 866169185)

    internal val linkSetOwnerIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_set_owner_id", 3411492887)

    internal val linkGetOwnerIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_get_owner_id", 2198884583)

    internal val agentCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_create", 529393457)

    internal val agentSetAvoidanceEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_avoidance_enabled", 1265174801)

    internal val agentGetAvoidanceEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_get_avoidance_enabled", 4155700596)

    internal val agentSetUse3dAvoidancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_use_3d_avoidance", 1265174801)

    internal val agentGetUse3dAvoidancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_get_use_3d_avoidance", 4155700596)

    internal val agentSetMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_map", 395945892)

    internal val agentGetMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_get_map", 3814569979)

    internal val agentSetPausedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_paused", 1265174801)

    internal val agentGetPausedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_get_paused", 4155700596)

    internal val agentSetNeighborDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_neighbor_distance", 1794382983)

    internal val agentGetNeighborDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_get_neighbor_distance", 866169185)

    internal val agentSetMaxNeighborsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_max_neighbors", 3411492887)

    internal val agentGetMaxNeighborsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_get_max_neighbors", 2198884583)

    internal val agentSetTimeHorizonAgentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_time_horizon_agents", 1794382983)

    internal val agentGetTimeHorizonAgentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_get_time_horizon_agents", 866169185)

    internal val agentSetTimeHorizonObstaclesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_time_horizon_obstacles", 1794382983)

    internal val agentGetTimeHorizonObstaclesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_get_time_horizon_obstacles", 866169185)

    internal val agentSetRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_radius", 1794382983)

    internal val agentGetRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_get_radius", 866169185)

    internal val agentSetHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_height", 1794382983)

    internal val agentGetHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_get_height", 866169185)

    internal val agentSetMaxSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_max_speed", 1794382983)

    internal val agentGetMaxSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_get_max_speed", 866169185)

    internal val agentSetVelocityForcedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_velocity_forced", 3227306858)

    internal val agentSetVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_velocity", 3227306858)

    internal val agentGetVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_get_velocity", 531438156)

    internal val agentSetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_position", 3227306858)

    internal val agentGetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_get_position", 531438156)

    internal val agentIsMapChangedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_is_map_changed", 4155700596)

    internal val agentSetAvoidanceCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_avoidance_callback", 3379118538)

    internal val agentHasAvoidanceCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_has_avoidance_callback", 4155700596)

    internal val agentSetAvoidanceLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_avoidance_layers", 3411492887)

    internal val agentGetAvoidanceLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_get_avoidance_layers", 2198884583)

    internal val agentSetAvoidanceMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_avoidance_mask", 3411492887)

    internal val agentGetAvoidanceMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_get_avoidance_mask", 2198884583)

    internal val agentSetAvoidancePriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_avoidance_priority", 1794382983)

    internal val agentGetAvoidancePriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_get_avoidance_priority", 866169185)

    internal val obstacleCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_create", 529393457)

    internal val obstacleSetAvoidanceEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_set_avoidance_enabled", 1265174801)

    internal val obstacleGetAvoidanceEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_get_avoidance_enabled", 4155700596)

    internal val obstacleSetUse3dAvoidancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_set_use_3d_avoidance", 1265174801)

    internal val obstacleGetUse3dAvoidancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_get_use_3d_avoidance", 4155700596)

    internal val obstacleSetMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_set_map", 395945892)

    internal val obstacleGetMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_get_map", 3814569979)

    internal val obstacleSetPausedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_set_paused", 1265174801)

    internal val obstacleGetPausedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_get_paused", 4155700596)

    internal val obstacleSetRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_set_radius", 1794382983)

    internal val obstacleGetRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_get_radius", 866169185)

    internal val obstacleSetHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_set_height", 1794382983)

    internal val obstacleGetHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_get_height", 866169185)

    internal val obstacleSetVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_set_velocity", 3227306858)

    internal val obstacleGetVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_get_velocity", 531438156)

    internal val obstacleSetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_set_position", 3227306858)

    internal val obstacleGetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_get_position", 531438156)

    internal val obstacleSetVerticesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_set_vertices", 4030257846)

    internal val obstacleGetVerticesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_get_vertices", 808965560)

    internal val obstacleSetAvoidanceLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_set_avoidance_layers", 3411492887)

    internal val obstacleGetAvoidanceLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_get_avoidance_layers", 2198884583)

    internal val parseSourceGeometryDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "parse_source_geometry_data", 3172802542)

    internal val bakeFromSourceGeometryDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "bake_from_source_geometry_data", 1286748856)

    internal val bakeFromSourceGeometryDataAsyncPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "bake_from_source_geometry_data_async", 1286748856)

    internal val isBakingNavigationMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "is_baking_navigation_mesh", 3142026141)

    internal val sourceGeometryParserCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "source_geometry_parser_create", 529393457)

    internal val sourceGeometryParserSetCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "source_geometry_parser_set_callback", 3379118538)

    internal val simplifyPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "simplify_path", 2344122170)

    internal val freeRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "free_rid", 2722037293)

    internal val setActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "set_active", 2586408642)

    internal val setDebugEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "set_debug_enabled", 2586408642)

    internal val getDebugEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "get_debug_enabled", 36873697)

    internal val getProcessInfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "get_process_info", 1938440894)
  }
}
