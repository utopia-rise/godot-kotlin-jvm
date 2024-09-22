// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.PackedVector3Array
import godot.core.RID
import godot.core.Signal0
import godot.core.Signal1
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantArray
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
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * NavigationServer3D is the server that handles navigation maps, regions and agents. It does not
 * handle A* navigation from [AStar3D].
 * Maps are divided into regions, which are composed of navigation meshes. Together, they define the
 * navigable areas in the 3D world.
 * **Note:** Most [NavigationServer3D] changes take effect after the next physics frame and not
 * immediately. This includes all changes made to maps, regions or agents by navigation-related nodes
 * in the scene tree or made through scripts.
 * For two regions to be connected to each other, they must share a similar edge. An edge is
 * considered connected to another if both of its two vertices are at a distance less than
 * `edge_connection_margin` to the respective other edge's vertex.
 * You may assign navigation layers to regions with [NavigationServer3D.regionSetNavigationLayers],
 * which then can be checked upon when requesting a path with [NavigationServer3D.mapGetPath]. This can
 * be used to allow or deny certain areas for some objects.
 * To use the collision avoidance system, you may use agents. You can set an agent's target
 * velocity, then the servers will emit a callback with a modified velocity.
 * **Note:** The collision avoidance system ignores regions. Using the modified velocity directly
 * may move an agent outside of the traversable area. This is a limitation of the collision avoidance
 * system, any more complex situation may require the use of the physics engine.
 * This server keeps tracks of any call and executes them during the sync phase. This means that you
 * can request any change to the map, using any thread, without worrying.
 */
@GodotBaseType
public object NavigationServer3D : Object() {
  /**
   * Emitted when a navigation map is updated, when a region moves or is modified.
   */
  public val mapChanged: Signal1<RID> by Signal1

  /**
   * Emitted when navigation debug settings are changed. Only available in debug builds.
   */
  public val navigationDebugChanged: Signal0 by Signal0

  /**
   * Emitted when avoidance debug settings are changed. Only available in debug builds.
   */
  public val avoidanceDebugChanged: Signal0 by Signal0

  public override fun new(scriptIndex: Int): Unit {
    getSingleton(ENGINECLASS_NAVIGATIONSERVER3D)
  }

  /**
   * Returns all created navigation map [RID]s on the NavigationServer. This returns both 2D and 3D
   * created navigation maps as there is technically no distinction between them.
   */
  public final fun getMaps(): VariantArray<RID> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMapsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<RID>)
  }

  /**
   * Create a new map.
   */
  public final fun mapCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.mapCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Sets the map active.
   */
  public final fun mapSetActive(map: RID, active: Boolean): Unit {
    TransferContext.writeArguments(_RID to map, BOOL to active)
    TransferContext.callMethod(rawPtr, MethodBindings.mapSetActivePtr, NIL)
  }

  /**
   * Returns true if the map is active.
   */
  public final fun mapIsActive(map: RID): Boolean {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.mapIsActivePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the map up direction.
   */
  public final fun mapSetUp(map: RID, up: Vector3): Unit {
    TransferContext.writeArguments(_RID to map, VECTOR3 to up)
    TransferContext.callMethod(rawPtr, MethodBindings.mapSetUpPtr, NIL)
  }

  /**
   * Returns the map's up direction.
   */
  public final fun mapGetUp(map: RID): Vector3 {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetUpPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Sets the map cell size used to rasterize the navigation mesh vertices on the XZ plane. Must
   * match with the cell size of the used navigation meshes.
   */
  public final fun mapSetCellSize(map: RID, cellSize: Float): Unit {
    TransferContext.writeArguments(_RID to map, DOUBLE to cellSize.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.mapSetCellSizePtr, NIL)
  }

  /**
   * Returns the map cell size used to rasterize the navigation mesh vertices on the XZ plane.
   */
  public final fun mapGetCellSize(map: RID): Float {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetCellSizePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the map cell height used to rasterize the navigation mesh vertices on the Y axis. Must
   * match with the cell height of the used navigation meshes.
   */
  public final fun mapSetCellHeight(map: RID, cellHeight: Float): Unit {
    TransferContext.writeArguments(_RID to map, DOUBLE to cellHeight.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.mapSetCellHeightPtr, NIL)
  }

  /**
   * Returns the map cell height used to rasterize the navigation mesh vertices on the Y axis.
   */
  public final fun mapGetCellHeight(map: RID): Float {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetCellHeightPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Set the map's internal merge rasterizer cell scale used to control merging sensitivity.
   */
  public final fun mapSetMergeRasterizerCellScale(map: RID, scale: Float): Unit {
    TransferContext.writeArguments(_RID to map, DOUBLE to scale.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.mapSetMergeRasterizerCellScalePtr, NIL)
  }

  /**
   * Returns map's internal merge rasterizer cell scale.
   */
  public final fun mapGetMergeRasterizerCellScale(map: RID): Float {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetMergeRasterizerCellScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Set the navigation [map] edge connection use. If [enabled] is `true`, the navigation map allows
   * navigation regions to use edge connections to connect with other navigation regions within
   * proximity of the navigation map edge connection margin.
   */
  public final fun mapSetUseEdgeConnections(map: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to map, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.mapSetUseEdgeConnectionsPtr, NIL)
  }

  /**
   * Returns true if the navigation [map] allows navigation regions to use edge connections to
   * connect with other navigation regions within proximity of the navigation map edge connection
   * margin.
   */
  public final fun mapGetUseEdgeConnections(map: RID): Boolean {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetUseEdgeConnectionsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Set the map edge connection margin used to weld the compatible region edges.
   */
  public final fun mapSetEdgeConnectionMargin(map: RID, margin: Float): Unit {
    TransferContext.writeArguments(_RID to map, DOUBLE to margin.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.mapSetEdgeConnectionMarginPtr, NIL)
  }

  /**
   * Returns the edge connection margin of the map. This distance is the minimum vertex distance
   * needed to connect two edges from different regions.
   */
  public final fun mapGetEdgeConnectionMargin(map: RID): Float {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetEdgeConnectionMarginPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Set the map's link connection radius used to connect links to navigation polygons.
   */
  public final fun mapSetLinkConnectionRadius(map: RID, radius: Float): Unit {
    TransferContext.writeArguments(_RID to map, DOUBLE to radius.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.mapSetLinkConnectionRadiusPtr, NIL)
  }

  /**
   * Returns the link connection radius of the map. This distance is the maximum range any link will
   * search for navigation mesh polygons to connect to.
   */
  public final fun mapGetLinkConnectionRadius(map: RID): Float {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetLinkConnectionRadiusPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the navigation path to reach the destination from the origin. [navigationLayers] is a
   * bitmask of all region navigation layers that are allowed to be in the path.
   */
  @JvmOverloads
  public final fun mapGetPath(
    map: RID,
    origin: Vector3,
    destination: Vector3,
    optimize: Boolean,
    navigationLayers: Long = 1,
  ): PackedVector3Array {
    TransferContext.writeArguments(_RID to map, VECTOR3 to origin, VECTOR3 to destination, BOOL to optimize, LONG to navigationLayers)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetPathPtr, PACKED_VECTOR3_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY) as PackedVector3Array)
  }

  /**
   * Returns the closest point between the navigation surface and the segment.
   */
  @JvmOverloads
  public final fun mapGetClosestPointToSegment(
    map: RID,
    start: Vector3,
    end: Vector3,
    useCollision: Boolean = false,
  ): Vector3 {
    TransferContext.writeArguments(_RID to map, VECTOR3 to start, VECTOR3 to end, BOOL to useCollision)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetClosestPointToSegmentPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the point closest to the provided [toPoint] on the navigation mesh surface.
   */
  public final fun mapGetClosestPoint(map: RID, toPoint: Vector3): Vector3 {
    TransferContext.writeArguments(_RID to map, VECTOR3 to toPoint)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetClosestPointPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the normal for the point returned by [mapGetClosestPoint].
   */
  public final fun mapGetClosestPointNormal(map: RID, toPoint: Vector3): Vector3 {
    TransferContext.writeArguments(_RID to map, VECTOR3 to toPoint)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetClosestPointNormalPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the owner region RID for the point returned by [mapGetClosestPoint].
   */
  public final fun mapGetClosestPointOwner(map: RID, toPoint: Vector3): RID {
    TransferContext.writeArguments(_RID to map, VECTOR3 to toPoint)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetClosestPointOwnerPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Returns all navigation link [RID]s that are currently assigned to the requested navigation
   * [map].
   */
  public final fun mapGetLinks(map: RID): VariantArray<RID> {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetLinksPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<RID>)
  }

  /**
   * Returns all navigation regions [RID]s that are currently assigned to the requested navigation
   * [map].
   */
  public final fun mapGetRegions(map: RID): VariantArray<RID> {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetRegionsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<RID>)
  }

  /**
   * Returns all navigation agents [RID]s that are currently assigned to the requested navigation
   * [map].
   */
  public final fun mapGetAgents(map: RID): VariantArray<RID> {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetAgentsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<RID>)
  }

  /**
   * Returns all navigation obstacle [RID]s that are currently assigned to the requested navigation
   * [map].
   */
  public final fun mapGetObstacles(map: RID): VariantArray<RID> {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetObstaclesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<RID>)
  }

  /**
   * This function immediately forces synchronization of the specified navigation [map] [RID]. By
   * default navigation maps are only synchronized at the end of each physics frame. This function can
   * be used to immediately (re)calculate all the navigation meshes and region connections of the
   * navigation map. This makes it possible to query a navigation path for a changed map immediately
   * and in the same frame (multiple times if needed).
   * Due to technical restrictions the current NavigationServer command queue will be flushed. This
   * means all already queued update commands for this physics frame will be executed, even those
   * intended for other maps, regions and agents not part of the specified map. The expensive
   * computation of the navigation meshes and region connections of a map will only be done for the
   * specified map. Other maps will receive the normal synchronization at the end of the physics frame.
   * Should the specified map receive changes after the forced update it will update again as well when
   * the other maps receive their update.
   * Avoidance processing and dispatch of the `safe_velocity` signals is unaffected by this function
   * and continues to happen for all maps and agents at the end of the physics frame.
   * **Note:** With great power comes great responsibility. This function should only be used by
   * users that really know what they are doing and have a good reason for it. Forcing an immediate
   * update of a navigation map requires locking the NavigationServer and flushing the entire
   * NavigationServer command queue. Not only can this severely impact the performance of a game but it
   * can also introduce bugs if used inappropriately without much foresight.
   */
  public final fun mapForceUpdate(map: RID): Unit {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.mapForceUpdatePtr, NIL)
  }

  /**
   * Returns the current iteration id of the navigation map. Every time the navigation map changes
   * and synchronizes the iteration id increases. An iteration id of 0 means the navigation map has
   * never synchronized.
   * **Note:** The iteration id will wrap back to 1 after reaching its range limit.
   */
  public final fun mapGetIterationId(map: RID): Long {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetIterationIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns a random position picked from all map region polygons with matching [navigationLayers].
   * If [uniformly] is `true`, all map regions, polygons, and faces are weighted by their surface
   * area (slower).
   * If [uniformly] is `false`, just a random region and a random polygon are picked (faster).
   */
  public final fun mapGetRandomPoint(
    map: RID,
    navigationLayers: Long,
    uniformly: Boolean,
  ): Vector3 {
    TransferContext.writeArguments(_RID to map, LONG to navigationLayers, BOOL to uniformly)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetRandomPointPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Queries a path in a given navigation map. Start and target position and other parameters are
   * defined through [NavigationPathQueryParameters3D]. Updates the provided
   * [NavigationPathQueryResult3D] result object with the path among other results requested by the
   * query.
   */
  public final fun queryPath(parameters: NavigationPathQueryParameters3D?,
      result: NavigationPathQueryResult3D?): Unit {
    TransferContext.writeArguments(OBJECT to parameters, OBJECT to result)
    TransferContext.callMethod(rawPtr, MethodBindings.queryPathPtr, NIL)
  }

  /**
   * Creates a new region.
   */
  public final fun regionCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.regionCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * If [enabled] is `true`, the specified [region] will contribute to its current navigation map.
   */
  public final fun regionSetEnabled(region: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to region, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.regionSetEnabledPtr, NIL)
  }

  /**
   * Returns `true` if the specified [region] is enabled.
   */
  public final fun regionGetEnabled(region: RID): Boolean {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(rawPtr, MethodBindings.regionGetEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If [enabled] is `true`, the navigation [region] will use edge connections to connect with other
   * navigation regions within proximity of the navigation map edge connection margin.
   */
  public final fun regionSetUseEdgeConnections(region: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to region, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.regionSetUseEdgeConnectionsPtr, NIL)
  }

  /**
   * Returns true if the navigation [region] is set to use edge connections to connect with other
   * navigation regions within proximity of the navigation map edge connection margin.
   */
  public final fun regionGetUseEdgeConnections(region: RID): Boolean {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(rawPtr, MethodBindings.regionGetUseEdgeConnectionsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the [enterCost] for this [region].
   */
  public final fun regionSetEnterCost(region: RID, enterCost: Float): Unit {
    TransferContext.writeArguments(_RID to region, DOUBLE to enterCost.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.regionSetEnterCostPtr, NIL)
  }

  /**
   * Returns the enter cost of this [region].
   */
  public final fun regionGetEnterCost(region: RID): Float {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(rawPtr, MethodBindings.regionGetEnterCostPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the [travelCost] for this [region].
   */
  public final fun regionSetTravelCost(region: RID, travelCost: Float): Unit {
    TransferContext.writeArguments(_RID to region, DOUBLE to travelCost.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.regionSetTravelCostPtr, NIL)
  }

  /**
   * Returns the travel cost of this [region].
   */
  public final fun regionGetTravelCost(region: RID): Float {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(rawPtr, MethodBindings.regionGetTravelCostPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Set the `ObjectID` of the object which manages this region.
   */
  public final fun regionSetOwnerId(region: RID, ownerId: Long): Unit {
    TransferContext.writeArguments(_RID to region, LONG to ownerId)
    TransferContext.callMethod(rawPtr, MethodBindings.regionSetOwnerIdPtr, NIL)
  }

  /**
   * Returns the `ObjectID` of the object which manages this region.
   */
  public final fun regionGetOwnerId(region: RID): Long {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(rawPtr, MethodBindings.regionGetOwnerIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if the provided [point] in world space is currently owned by the provided
   * navigation [region]. Owned in this context means that one of the region's navigation mesh polygon
   * faces has a possible position at the closest distance to this point compared to all other
   * navigation meshes from other navigation regions that are also registered on the navigation map of
   * the provided region.
   * If multiple navigation meshes have positions at equal distance the navigation region whose
   * polygons are processed first wins the ownership. Polygons are processed in the same order that
   * navigation regions were registered on the NavigationServer.
   * **Note:** If navigation meshes from different navigation regions overlap (which should be
   * avoided in general) the result might not be what is expected.
   */
  public final fun regionOwnsPoint(region: RID, point: Vector3): Boolean {
    TransferContext.writeArguments(_RID to region, VECTOR3 to point)
    TransferContext.callMethod(rawPtr, MethodBindings.regionOwnsPointPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the map for the region.
   */
  public final fun regionSetMap(region: RID, map: RID): Unit {
    TransferContext.writeArguments(_RID to region, _RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.regionSetMapPtr, NIL)
  }

  /**
   * Returns the navigation map [RID] the requested [region] is currently assigned to.
   */
  public final fun regionGetMap(region: RID): RID {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(rawPtr, MethodBindings.regionGetMapPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Set the region's navigation layers. This allows selecting regions from a path request (when
   * using [NavigationServer3D.mapGetPath]).
   */
  public final fun regionSetNavigationLayers(region: RID, navigationLayers: Long): Unit {
    TransferContext.writeArguments(_RID to region, LONG to navigationLayers)
    TransferContext.callMethod(rawPtr, MethodBindings.regionSetNavigationLayersPtr, NIL)
  }

  /**
   * Returns the region's navigation layers.
   */
  public final fun regionGetNavigationLayers(region: RID): Long {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(rawPtr, MethodBindings.regionGetNavigationLayersPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the global transformation for the region.
   */
  public final fun regionSetTransform(region: RID, transform: Transform3D): Unit {
    TransferContext.writeArguments(_RID to region, TRANSFORM3D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.regionSetTransformPtr, NIL)
  }

  /**
   * Returns the global transformation of this [region].
   */
  public final fun regionGetTransform(region: RID): Transform3D {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(rawPtr, MethodBindings.regionGetTransformPtr, TRANSFORM3D)
    return (TransferContext.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  /**
   * Sets the navigation mesh for the region.
   */
  public final fun regionSetNavigationMesh(region: RID, navigationMesh: NavigationMesh?): Unit {
    TransferContext.writeArguments(_RID to region, OBJECT to navigationMesh)
    TransferContext.callMethod(rawPtr, MethodBindings.regionSetNavigationMeshPtr, NIL)
  }

  /**
   * Bakes the [navigationMesh] with bake source geometry collected starting from the [rootNode].
   */
  public final fun regionBakeNavigationMesh(navigationMesh: NavigationMesh?, rootNode: Node?):
      Unit {
    TransferContext.writeArguments(OBJECT to navigationMesh, OBJECT to rootNode)
    TransferContext.callMethod(rawPtr, MethodBindings.regionBakeNavigationMeshPtr, NIL)
  }

  /**
   * Returns how many connections this [region] has with other regions in the map.
   */
  public final fun regionGetConnectionsCount(region: RID): Int {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(rawPtr, MethodBindings.regionGetConnectionsCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the starting point of a connection door. [connection] is an index between 0 and the
   * return value of [regionGetConnectionsCount].
   */
  public final fun regionGetConnectionPathwayStart(region: RID, connection: Int): Vector3 {
    TransferContext.writeArguments(_RID to region, LONG to connection.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.regionGetConnectionPathwayStartPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the ending point of a connection door. [connection] is an index between 0 and the
   * return value of [regionGetConnectionsCount].
   */
  public final fun regionGetConnectionPathwayEnd(region: RID, connection: Int): Vector3 {
    TransferContext.writeArguments(_RID to region, LONG to connection.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.regionGetConnectionPathwayEndPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns a random position picked from all region polygons with matching [navigationLayers].
   * If [uniformly] is `true`, all region polygons and faces are weighted by their surface area
   * (slower).
   * If [uniformly] is `false`, just a random polygon and face is picked (faster).
   */
  public final fun regionGetRandomPoint(
    region: RID,
    navigationLayers: Long,
    uniformly: Boolean,
  ): Vector3 {
    TransferContext.writeArguments(_RID to region, LONG to navigationLayers, BOOL to uniformly)
    TransferContext.callMethod(rawPtr, MethodBindings.regionGetRandomPointPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Create a new link between two positions on a map.
   */
  public final fun linkCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.linkCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Sets the navigation map [RID] for the link.
   */
  public final fun linkSetMap(link: RID, map: RID): Unit {
    TransferContext.writeArguments(_RID to link, _RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.linkSetMapPtr, NIL)
  }

  /**
   * Returns the navigation map [RID] the requested [link] is currently assigned to.
   */
  public final fun linkGetMap(link: RID): RID {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(rawPtr, MethodBindings.linkGetMapPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * If [enabled] is `true`, the specified [link] will contribute to its current navigation map.
   */
  public final fun linkSetEnabled(link: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to link, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.linkSetEnabledPtr, NIL)
  }

  /**
   * Returns `true` if the specified [link] is enabled.
   */
  public final fun linkGetEnabled(link: RID): Boolean {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(rawPtr, MethodBindings.linkGetEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets whether this [link] can be travelled in both directions.
   */
  public final fun linkSetBidirectional(link: RID, bidirectional: Boolean): Unit {
    TransferContext.writeArguments(_RID to link, BOOL to bidirectional)
    TransferContext.callMethod(rawPtr, MethodBindings.linkSetBidirectionalPtr, NIL)
  }

  /**
   * Returns whether this [link] can be travelled in both directions.
   */
  public final fun linkIsBidirectional(link: RID): Boolean {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(rawPtr, MethodBindings.linkIsBidirectionalPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Set the links's navigation layers. This allows selecting links from a path request (when using
   * [NavigationServer3D.mapGetPath]).
   */
  public final fun linkSetNavigationLayers(link: RID, navigationLayers: Long): Unit {
    TransferContext.writeArguments(_RID to link, LONG to navigationLayers)
    TransferContext.callMethod(rawPtr, MethodBindings.linkSetNavigationLayersPtr, NIL)
  }

  /**
   * Returns the navigation layers for this [link].
   */
  public final fun linkGetNavigationLayers(link: RID): Long {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(rawPtr, MethodBindings.linkGetNavigationLayersPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the entry position for this [link].
   */
  public final fun linkSetStartPosition(link: RID, position: Vector3): Unit {
    TransferContext.writeArguments(_RID to link, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.linkSetStartPositionPtr, NIL)
  }

  /**
   * Returns the starting position of this [link].
   */
  public final fun linkGetStartPosition(link: RID): Vector3 {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(rawPtr, MethodBindings.linkGetStartPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Sets the exit position for the [link].
   */
  public final fun linkSetEndPosition(link: RID, position: Vector3): Unit {
    TransferContext.writeArguments(_RID to link, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.linkSetEndPositionPtr, NIL)
  }

  /**
   * Returns the ending position of this [link].
   */
  public final fun linkGetEndPosition(link: RID): Vector3 {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(rawPtr, MethodBindings.linkGetEndPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Sets the [enterCost] for this [link].
   */
  public final fun linkSetEnterCost(link: RID, enterCost: Float): Unit {
    TransferContext.writeArguments(_RID to link, DOUBLE to enterCost.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.linkSetEnterCostPtr, NIL)
  }

  /**
   * Returns the enter cost of this [link].
   */
  public final fun linkGetEnterCost(link: RID): Float {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(rawPtr, MethodBindings.linkGetEnterCostPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the [travelCost] for this [link].
   */
  public final fun linkSetTravelCost(link: RID, travelCost: Float): Unit {
    TransferContext.writeArguments(_RID to link, DOUBLE to travelCost.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.linkSetTravelCostPtr, NIL)
  }

  /**
   * Returns the travel cost of this [link].
   */
  public final fun linkGetTravelCost(link: RID): Float {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(rawPtr, MethodBindings.linkGetTravelCostPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Set the `ObjectID` of the object which manages this link.
   */
  public final fun linkSetOwnerId(link: RID, ownerId: Long): Unit {
    TransferContext.writeArguments(_RID to link, LONG to ownerId)
    TransferContext.callMethod(rawPtr, MethodBindings.linkSetOwnerIdPtr, NIL)
  }

  /**
   * Returns the `ObjectID` of the object which manages this link.
   */
  public final fun linkGetOwnerId(link: RID): Long {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(rawPtr, MethodBindings.linkGetOwnerIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Creates the agent.
   */
  public final fun agentCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.agentCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * If [enabled] is `true`, the provided [agent] calculates avoidance.
   */
  public final fun agentSetAvoidanceEnabled(agent: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to agent, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetAvoidanceEnabledPtr, NIL)
  }

  /**
   * Returns `true` if the provided [agent] has avoidance enabled.
   */
  public final fun agentGetAvoidanceEnabled(agent: RID): Boolean {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(rawPtr, MethodBindings.agentGetAvoidanceEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets if the agent uses the 2D avoidance or the 3D avoidance while avoidance is enabled.
   * If `true` the agent calculates avoidance velocities in 3D for the xyz-axis, e.g. for games that
   * take place in air, underwater or space. The 3D using agent only avoids other 3D avoidance using
   * agent's. The 3D using agent only reacts to radius based avoidance obstacles. The 3D using agent
   * ignores any vertices based obstacles. The 3D using agent only avoids other 3D using agent's.
   * If `false` the agent calculates avoidance velocities in 2D along the xz-axis ignoring the
   * y-axis. The 2D using agent only avoids other 2D avoidance using agent's. The 2D using agent reacts
   * to radius avoidance obstacles. The 2D using agent reacts to vertices based avoidance obstacles.
   * The 2D using agent only avoids other 2D using agent's. 2D using agents will ignore other 2D using
   * agents or obstacles that are below their current position or above their current position
   * including the agents height in 2D avoidance.
   */
  public final fun agentSetUse3dAvoidance(agent: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to agent, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetUse3dAvoidancePtr, NIL)
  }

  /**
   * Returns `true` if the provided [agent] uses avoidance in 3D space Vector3(x,y,z) instead of
   * horizontal 2D Vector2(x,y) / Vector3(x,0.0,z).
   */
  public final fun agentGetUse3dAvoidance(agent: RID): Boolean {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(rawPtr, MethodBindings.agentGetUse3dAvoidancePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Puts the agent in the map.
   */
  public final fun agentSetMap(agent: RID, map: RID): Unit {
    TransferContext.writeArguments(_RID to agent, _RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetMapPtr, NIL)
  }

  /**
   * Returns the navigation map [RID] the requested [agent] is currently assigned to.
   */
  public final fun agentGetMap(agent: RID): RID {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(rawPtr, MethodBindings.agentGetMapPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * If [paused] is true the specified [agent] will not be processed, e.g. calculate avoidance
   * velocities or receive avoidance callbacks.
   */
  public final fun agentSetPaused(agent: RID, paused: Boolean): Unit {
    TransferContext.writeArguments(_RID to agent, BOOL to paused)
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetPausedPtr, NIL)
  }

  /**
   * Returns `true` if the specified [agent] is paused.
   */
  public final fun agentGetPaused(agent: RID): Boolean {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(rawPtr, MethodBindings.agentGetPausedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the maximum distance to other agents this agent takes into account in the navigation. The
   * larger this number, the longer the running time of the simulation. If the number is too low, the
   * simulation will not be safe.
   */
  public final fun agentSetNeighborDistance(agent: RID, distance: Float): Unit {
    TransferContext.writeArguments(_RID to agent, DOUBLE to distance.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetNeighborDistancePtr, NIL)
  }

  /**
   * Returns the maximum distance to other agents the specified [agent] takes into account in the
   * navigation.
   */
  public final fun agentGetNeighborDistance(agent: RID): Float {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(rawPtr, MethodBindings.agentGetNeighborDistancePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the maximum number of other agents the agent takes into account in the navigation. The
   * larger this number, the longer the running time of the simulation. If the number is too low, the
   * simulation will not be safe.
   */
  public final fun agentSetMaxNeighbors(agent: RID, count: Int): Unit {
    TransferContext.writeArguments(_RID to agent, LONG to count.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetMaxNeighborsPtr, NIL)
  }

  /**
   * Returns the maximum number of other agents the specified [agent] takes into account in the
   * navigation.
   */
  public final fun agentGetMaxNeighbors(agent: RID): Int {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(rawPtr, MethodBindings.agentGetMaxNeighborsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * The minimal amount of time for which the agent's velocities that are computed by the simulation
   * are safe with respect to other agents. The larger this number, the sooner this agent will respond
   * to the presence of other agents, but the less freedom this agent has in choosing its velocities. A
   * too high value will slow down agents movement considerably. Must be positive.
   */
  public final fun agentSetTimeHorizonAgents(agent: RID, timeHorizon: Float): Unit {
    TransferContext.writeArguments(_RID to agent, DOUBLE to timeHorizon.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetTimeHorizonAgentsPtr, NIL)
  }

  /**
   * Returns the minimal amount of time for which the specified [agent]'s velocities that are
   * computed by the simulation are safe with respect to other agents.
   */
  public final fun agentGetTimeHorizonAgents(agent: RID): Float {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(rawPtr, MethodBindings.agentGetTimeHorizonAgentsPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * The minimal amount of time for which the agent's velocities that are computed by the simulation
   * are safe with respect to static avoidance obstacles. The larger this number, the sooner this agent
   * will respond to the presence of static avoidance obstacles, but the less freedom this agent has in
   * choosing its velocities. A too high value will slow down agents movement considerably. Must be
   * positive.
   */
  public final fun agentSetTimeHorizonObstacles(agent: RID, timeHorizon: Float): Unit {
    TransferContext.writeArguments(_RID to agent, DOUBLE to timeHorizon.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetTimeHorizonObstaclesPtr, NIL)
  }

  /**
   * Returns the minimal amount of time for which the specified [agent]'s velocities that are
   * computed by the simulation are safe with respect to static avoidance obstacles.
   */
  public final fun agentGetTimeHorizonObstacles(agent: RID): Float {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(rawPtr, MethodBindings.agentGetTimeHorizonObstaclesPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the radius of the agent.
   */
  public final fun agentSetRadius(agent: RID, radius: Float): Unit {
    TransferContext.writeArguments(_RID to agent, DOUBLE to radius.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetRadiusPtr, NIL)
  }

  /**
   * Returns the radius of the specified [agent].
   */
  public final fun agentGetRadius(agent: RID): Float {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(rawPtr, MethodBindings.agentGetRadiusPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Updates the provided [agent] [height].
   */
  public final fun agentSetHeight(agent: RID, height: Float): Unit {
    TransferContext.writeArguments(_RID to agent, DOUBLE to height.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetHeightPtr, NIL)
  }

  /**
   * Returns the `height` of the specified [agent].
   */
  public final fun agentGetHeight(agent: RID): Float {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(rawPtr, MethodBindings.agentGetHeightPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the maximum speed of the agent. Must be positive.
   */
  public final fun agentSetMaxSpeed(agent: RID, maxSpeed: Float): Unit {
    TransferContext.writeArguments(_RID to agent, DOUBLE to maxSpeed.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetMaxSpeedPtr, NIL)
  }

  /**
   * Returns the maximum speed of the specified [agent].
   */
  public final fun agentGetMaxSpeed(agent: RID): Float {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(rawPtr, MethodBindings.agentGetMaxSpeedPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Replaces the internal velocity in the collision avoidance simulation with [velocity] for the
   * specified [agent]. When an agent is teleported to a new position this function should be used in
   * the same frame. If called frequently this function can get agents stuck.
   */
  public final fun agentSetVelocityForced(agent: RID, velocity: Vector3): Unit {
    TransferContext.writeArguments(_RID to agent, VECTOR3 to velocity)
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetVelocityForcedPtr, NIL)
  }

  /**
   * Sets [velocity] as the new wanted velocity for the specified [agent]. The avoidance simulation
   * will try to fulfill this velocity if possible but will modify it to avoid collision with other
   * agent's and obstacles. When an agent is teleported to a new position use [agentSetVelocityForced]
   * as well to reset the internal simulation velocity.
   */
  public final fun agentSetVelocity(agent: RID, velocity: Vector3): Unit {
    TransferContext.writeArguments(_RID to agent, VECTOR3 to velocity)
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetVelocityPtr, NIL)
  }

  /**
   * Returns the velocity of the specified [agent].
   */
  public final fun agentGetVelocity(agent: RID): Vector3 {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(rawPtr, MethodBindings.agentGetVelocityPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Sets the position of the agent in world space.
   */
  public final fun agentSetPosition(agent: RID, position: Vector3): Unit {
    TransferContext.writeArguments(_RID to agent, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetPositionPtr, NIL)
  }

  /**
   * Returns the position of the specified [agent] in world space.
   */
  public final fun agentGetPosition(agent: RID): Vector3 {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(rawPtr, MethodBindings.agentGetPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns true if the map got changed the previous frame.
   */
  public final fun agentIsMapChanged(agent: RID): Boolean {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(rawPtr, MethodBindings.agentIsMapChangedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the callback [Callable] that gets called after each avoidance processing step for the
   * [agent]. The calculated `safe_velocity` will be dispatched with a signal to the object just before
   * the physics calculations.
   * **Note:** Created callbacks are always processed independently of the SceneTree state as long
   * as the agent is on a navigation map and not freed. To disable the dispatch of a callback from an
   * agent use [agentSetAvoidanceCallback] again with an empty [Callable].
   */
  public final fun agentSetAvoidanceCallback(agent: RID, callback: Callable): Unit {
    TransferContext.writeArguments(_RID to agent, CALLABLE to callback)
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetAvoidanceCallbackPtr, NIL)
  }

  /**
   * Return `true` if the specified [agent] has an avoidance callback.
   */
  public final fun agentHasAvoidanceCallback(agent: RID): Boolean {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(rawPtr, MethodBindings.agentHasAvoidanceCallbackPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Set the agent's `avoidance_layers` bitmask.
   */
  public final fun agentSetAvoidanceLayers(agent: RID, layers: Long): Unit {
    TransferContext.writeArguments(_RID to agent, LONG to layers)
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetAvoidanceLayersPtr, NIL)
  }

  /**
   * Returns the `avoidance_layers` bitmask of the specified [agent].
   */
  public final fun agentGetAvoidanceLayers(agent: RID): Long {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(rawPtr, MethodBindings.agentGetAvoidanceLayersPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Set the agent's `avoidance_mask` bitmask.
   */
  public final fun agentSetAvoidanceMask(agent: RID, mask: Long): Unit {
    TransferContext.writeArguments(_RID to agent, LONG to mask)
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetAvoidanceMaskPtr, NIL)
  }

  /**
   * Returns the `avoidance_mask` bitmask of the specified [agent].
   */
  public final fun agentGetAvoidanceMask(agent: RID): Long {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(rawPtr, MethodBindings.agentGetAvoidanceMaskPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Set the agent's `avoidance_priority` with a [priority] between 0.0 (lowest priority) to 1.0
   * (highest priority).
   * The specified [agent] does not adjust the velocity for other agents that would match the
   * `avoidance_mask` but have a lower `avoidance_priority`. This in turn makes the other agents with
   * lower priority adjust their velocities even more to avoid collision with this agent.
   */
  public final fun agentSetAvoidancePriority(agent: RID, priority: Float): Unit {
    TransferContext.writeArguments(_RID to agent, DOUBLE to priority.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetAvoidancePriorityPtr, NIL)
  }

  /**
   * Returns the `avoidance_priority` of the specified [agent].
   */
  public final fun agentGetAvoidancePriority(agent: RID): Float {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(rawPtr, MethodBindings.agentGetAvoidancePriorityPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Creates a new obstacle.
   */
  public final fun obstacleCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * If [enabled] is `true`, the provided [obstacle] affects avoidance using agents.
   */
  public final fun obstacleSetAvoidanceEnabled(obstacle: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to obstacle, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleSetAvoidanceEnabledPtr, NIL)
  }

  /**
   * Returns `true` if the provided [obstacle] has avoidance enabled.
   */
  public final fun obstacleGetAvoidanceEnabled(obstacle: RID): Boolean {
    TransferContext.writeArguments(_RID to obstacle)
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleGetAvoidanceEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets if the [obstacle] uses the 2D avoidance or the 3D avoidance while avoidance is enabled.
   */
  public final fun obstacleSetUse3dAvoidance(obstacle: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to obstacle, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleSetUse3dAvoidancePtr, NIL)
  }

  /**
   * Returns `true` if the provided [obstacle] uses avoidance in 3D space Vector3(x,y,z) instead of
   * horizontal 2D Vector2(x,y) / Vector3(x,0.0,z).
   */
  public final fun obstacleGetUse3dAvoidance(obstacle: RID): Boolean {
    TransferContext.writeArguments(_RID to obstacle)
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleGetUse3dAvoidancePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Assigns the [obstacle] to a navigation map.
   */
  public final fun obstacleSetMap(obstacle: RID, map: RID): Unit {
    TransferContext.writeArguments(_RID to obstacle, _RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleSetMapPtr, NIL)
  }

  /**
   * Returns the navigation map [RID] the requested [obstacle] is currently assigned to.
   */
  public final fun obstacleGetMap(obstacle: RID): RID {
    TransferContext.writeArguments(_RID to obstacle)
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleGetMapPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * If [paused] is true the specified [obstacle] will not be processed, e.g. affect avoidance
   * velocities.
   */
  public final fun obstacleSetPaused(obstacle: RID, paused: Boolean): Unit {
    TransferContext.writeArguments(_RID to obstacle, BOOL to paused)
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleSetPausedPtr, NIL)
  }

  /**
   * Returns `true` if the specified [obstacle] is paused.
   */
  public final fun obstacleGetPaused(obstacle: RID): Boolean {
    TransferContext.writeArguments(_RID to obstacle)
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleGetPausedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the radius of the dynamic obstacle.
   */
  public final fun obstacleSetRadius(obstacle: RID, radius: Float): Unit {
    TransferContext.writeArguments(_RID to obstacle, DOUBLE to radius.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleSetRadiusPtr, NIL)
  }

  /**
   * Returns the radius of the specified dynamic [obstacle].
   */
  public final fun obstacleGetRadius(obstacle: RID): Float {
    TransferContext.writeArguments(_RID to obstacle)
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleGetRadiusPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the [height] for the [obstacle]. In 3D agents will ignore obstacles that are above or
   * below them while using 2D avoidance.
   */
  public final fun obstacleSetHeight(obstacle: RID, height: Float): Unit {
    TransferContext.writeArguments(_RID to obstacle, DOUBLE to height.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleSetHeightPtr, NIL)
  }

  /**
   * Returns the `height` of the specified [obstacle].
   */
  public final fun obstacleGetHeight(obstacle: RID): Float {
    TransferContext.writeArguments(_RID to obstacle)
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleGetHeightPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets [velocity] of the dynamic [obstacle]. Allows other agents to better predict the movement
   * of the dynamic obstacle. Only works in combination with the radius of the obstacle.
   */
  public final fun obstacleSetVelocity(obstacle: RID, velocity: Vector3): Unit {
    TransferContext.writeArguments(_RID to obstacle, VECTOR3 to velocity)
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleSetVelocityPtr, NIL)
  }

  /**
   * Returns the velocity of the specified dynamic [obstacle].
   */
  public final fun obstacleGetVelocity(obstacle: RID): Vector3 {
    TransferContext.writeArguments(_RID to obstacle)
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleGetVelocityPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Updates the [position] in world space for the [obstacle].
   */
  public final fun obstacleSetPosition(obstacle: RID, position: Vector3): Unit {
    TransferContext.writeArguments(_RID to obstacle, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleSetPositionPtr, NIL)
  }

  /**
   * Returns the position of the specified [obstacle] in world space.
   */
  public final fun obstacleGetPosition(obstacle: RID): Vector3 {
    TransferContext.writeArguments(_RID to obstacle)
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleGetPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Sets the outline vertices for the obstacle. If the vertices are winded in clockwise order
   * agents will be pushed in by the obstacle, else they will be pushed out.
   */
  public final fun obstacleSetVertices(obstacle: RID, vertices: PackedVector3Array): Unit {
    TransferContext.writeArguments(_RID to obstacle, PACKED_VECTOR3_ARRAY to vertices)
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleSetVerticesPtr, NIL)
  }

  /**
   * Returns the outline vertices for the specified [obstacle].
   */
  public final fun obstacleGetVertices(obstacle: RID): PackedVector3Array {
    TransferContext.writeArguments(_RID to obstacle)
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleGetVerticesPtr, PACKED_VECTOR3_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY) as PackedVector3Array)
  }

  /**
   * Set the obstacles's `avoidance_layers` bitmask.
   */
  public final fun obstacleSetAvoidanceLayers(obstacle: RID, layers: Long): Unit {
    TransferContext.writeArguments(_RID to obstacle, LONG to layers)
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleSetAvoidanceLayersPtr, NIL)
  }

  /**
   * Returns the `avoidance_layers` bitmask of the specified [obstacle].
   */
  public final fun obstacleGetAvoidanceLayers(obstacle: RID): Long {
    TransferContext.writeArguments(_RID to obstacle)
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleGetAvoidanceLayersPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Parses the [SceneTree] for source geometry according to the properties of [navigationMesh].
   * Updates the provided [sourceGeometryData] resource with the resulting data. The resource can then
   * be used to bake a navigation mesh with [bakeFromSourceGeometryData]. After the process is finished
   * the optional [callback] will be called.
   * **Note:** This function needs to run on the main thread or with a deferred call as the
   * SceneTree is not thread-safe.
   * **Performance:** While convenient, reading data arrays from [Mesh] resources can affect the
   * frame rate negatively. The data needs to be received from the GPU, stalling the [RenderingServer]
   * in the process. For performance prefer the use of e.g. collision shapes or creating the data
   * arrays entirely in code.
   */
  @JvmOverloads
  public final fun parseSourceGeometryData(
    navigationMesh: NavigationMesh?,
    sourceGeometryData: NavigationMeshSourceGeometryData3D?,
    rootNode: Node?,
    callback: Callable = Callable(),
  ): Unit {
    TransferContext.writeArguments(OBJECT to navigationMesh, OBJECT to sourceGeometryData, OBJECT to rootNode, CALLABLE to callback)
    TransferContext.callMethod(rawPtr, MethodBindings.parseSourceGeometryDataPtr, NIL)
  }

  /**
   * Bakes the provided [navigationMesh] with the data from the provided [sourceGeometryData]. After
   * the process is finished the optional [callback] will be called.
   */
  @JvmOverloads
  public final fun bakeFromSourceGeometryData(
    navigationMesh: NavigationMesh?,
    sourceGeometryData: NavigationMeshSourceGeometryData3D?,
    callback: Callable = Callable(),
  ): Unit {
    TransferContext.writeArguments(OBJECT to navigationMesh, OBJECT to sourceGeometryData, CALLABLE to callback)
    TransferContext.callMethod(rawPtr, MethodBindings.bakeFromSourceGeometryDataPtr, NIL)
  }

  /**
   * Bakes the provided [navigationMesh] with the data from the provided [sourceGeometryData] as an
   * async task running on a background thread. After the process is finished the optional [callback]
   * will be called.
   */
  @JvmOverloads
  public final fun bakeFromSourceGeometryDataAsync(
    navigationMesh: NavigationMesh?,
    sourceGeometryData: NavigationMeshSourceGeometryData3D?,
    callback: Callable = Callable(),
  ): Unit {
    TransferContext.writeArguments(OBJECT to navigationMesh, OBJECT to sourceGeometryData, CALLABLE to callback)
    TransferContext.callMethod(rawPtr, MethodBindings.bakeFromSourceGeometryDataAsyncPtr, NIL)
  }

  /**
   * Returns `true` when the provided navigation mesh is being baked on a background thread.
   */
  public final fun isBakingNavigationMesh(navigationMesh: NavigationMesh?): Boolean {
    TransferContext.writeArguments(OBJECT to navigationMesh)
    TransferContext.callMethod(rawPtr, MethodBindings.isBakingNavigationMeshPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Creates a new source geometry parser. If a [Callable] is set for the parser with
   * [sourceGeometryParserSetCallback] the callback will be called for every single node that gets
   * parsed whenever [parseSourceGeometryData] is used.
   */
  public final fun sourceGeometryParserCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.sourceGeometryParserCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Sets the [callback] [Callable] for the specific source geometry [parser]. The [Callable] will
   * receive a call with the following parameters:
   * - `navigation_mesh` - The [NavigationMesh] reference used to define the parse settings. Do NOT
   * edit or add directly to the navigation mesh.
   * - `source_geometry_data` - The [NavigationMeshSourceGeometryData3D] reference. Add custom
   * source geometry for navigation mesh baking to this object.
   * - `node` - The [Node] that is parsed.
   */
  public final fun sourceGeometryParserSetCallback(parser: RID, callback: Callable): Unit {
    TransferContext.writeArguments(_RID to parser, CALLABLE to callback)
    TransferContext.callMethod(rawPtr, MethodBindings.sourceGeometryParserSetCallbackPtr, NIL)
  }

  /**
   * Returns a simplified version of [path] with less critical path points removed. The
   * simplification amount is in worlds units and controlled by [epsilon]. The simplification uses a
   * variant of Ramer-Douglas-Peucker algorithm for curve point decimation.
   * Path simplification can be helpful to mitigate various path following issues that can arise
   * with certain agent types and script behaviors. E.g. "steering" agents or avoidance in "open
   * fields".
   */
  public final fun simplifyPath(path: PackedVector3Array, epsilon: Float): PackedVector3Array {
    TransferContext.writeArguments(PACKED_VECTOR3_ARRAY to path, DOUBLE to epsilon.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.simplifyPathPtr, PACKED_VECTOR3_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY) as PackedVector3Array)
  }

  /**
   * Destroys the given RID.
   */
  public final fun freeRid(rid: RID): Unit {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, MethodBindings.freeRidPtr, NIL)
  }

  /**
   * Control activation of this server.
   */
  public final fun setActive(active: Boolean): Unit {
    TransferContext.writeArguments(BOOL to active)
    TransferContext.callMethod(rawPtr, MethodBindings.setActivePtr, NIL)
  }

  /**
   * If `true` enables debug mode on the NavigationServer.
   */
  public final fun setDebugEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setDebugEnabledPtr, NIL)
  }

  /**
   * Returns `true` when the NavigationServer has debug enabled.
   */
  public final fun getDebugEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDebugEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns information about the current state of the NavigationServer. See [ProcessInfo] for a
   * list of available states.
   */
  public final fun getProcessInfo(processInfo: ProcessInfo): Int {
    TransferContext.writeArguments(LONG to processInfo.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getProcessInfoPtr, LONG)
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
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ProcessInfo = entries.single { it.id == `value` }
    }
  }

  internal object MethodBindings {
    public val getMapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "get_maps", 3995934104)

    public val mapCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_create", 529393457)

    public val mapSetActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_set_active", 1265174801)

    public val mapIsActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_is_active", 4155700596)

    public val mapSetUpPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_set_up", 3227306858)

    public val mapGetUpPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_up", 531438156)

    public val mapSetCellSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_set_cell_size", 1794382983)

    public val mapGetCellSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_cell_size", 866169185)

    public val mapSetCellHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_set_cell_height", 1794382983)

    public val mapGetCellHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_cell_height", 866169185)

    public val mapSetMergeRasterizerCellScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_set_merge_rasterizer_cell_scale", 1794382983)

    public val mapGetMergeRasterizerCellScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_merge_rasterizer_cell_scale", 866169185)

    public val mapSetUseEdgeConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_set_use_edge_connections", 1265174801)

    public val mapGetUseEdgeConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_use_edge_connections", 4155700596)

    public val mapSetEdgeConnectionMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_set_edge_connection_margin", 1794382983)

    public val mapGetEdgeConnectionMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_edge_connection_margin", 866169185)

    public val mapSetLinkConnectionRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_set_link_connection_radius", 1794382983)

    public val mapGetLinkConnectionRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_link_connection_radius", 866169185)

    public val mapGetPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_path", 1187418690)

    public val mapGetClosestPointToSegmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_closest_point_to_segment", 3830095642)

    public val mapGetClosestPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_closest_point", 2056183332)

    public val mapGetClosestPointNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_closest_point_normal", 2056183332)

    public val mapGetClosestPointOwnerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_closest_point_owner", 553364610)

    public val mapGetLinksPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_links", 2684255073)

    public val mapGetRegionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_regions", 2684255073)

    public val mapGetAgentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_agents", 2684255073)

    public val mapGetObstaclesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_obstacles", 2684255073)

    public val mapForceUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_force_update", 2722037293)

    public val mapGetIterationIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_iteration_id", 2198884583)

    public val mapGetRandomPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_random_point", 722801526)

    public val queryPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "query_path", 3415008901)

    public val regionCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_create", 529393457)

    public val regionSetEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_set_enabled", 1265174801)

    public val regionGetEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_enabled", 4155700596)

    public val regionSetUseEdgeConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_set_use_edge_connections", 1265174801)

    public val regionGetUseEdgeConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_use_edge_connections", 4155700596)

    public val regionSetEnterCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_set_enter_cost", 1794382983)

    public val regionGetEnterCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_enter_cost", 866169185)

    public val regionSetTravelCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_set_travel_cost", 1794382983)

    public val regionGetTravelCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_travel_cost", 866169185)

    public val regionSetOwnerIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_set_owner_id", 3411492887)

    public val regionGetOwnerIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_owner_id", 2198884583)

    public val regionOwnsPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_owns_point", 2360011153)

    public val regionSetMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_set_map", 395945892)

    public val regionGetMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_map", 3814569979)

    public val regionSetNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_set_navigation_layers", 3411492887)

    public val regionGetNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_navigation_layers", 2198884583)

    public val regionSetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_set_transform", 3935195649)

    public val regionGetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_transform", 1128465797)

    public val regionSetNavigationMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_set_navigation_mesh", 2764952978)

    public val regionBakeNavigationMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_bake_navigation_mesh", 1401173477)

    public val regionGetConnectionsCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_connections_count", 2198884583)

    public val regionGetConnectionPathwayStartPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_connection_pathway_start", 3440143363)

    public val regionGetConnectionPathwayEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_connection_pathway_end", 3440143363)

    public val regionGetRandomPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_random_point", 722801526)

    public val linkCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_create", 529393457)

    public val linkSetMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_set_map", 395945892)

    public val linkGetMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_get_map", 3814569979)

    public val linkSetEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_set_enabled", 1265174801)

    public val linkGetEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_get_enabled", 4155700596)

    public val linkSetBidirectionalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_set_bidirectional", 1265174801)

    public val linkIsBidirectionalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_is_bidirectional", 4155700596)

    public val linkSetNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_set_navigation_layers", 3411492887)

    public val linkGetNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_get_navigation_layers", 2198884583)

    public val linkSetStartPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_set_start_position", 3227306858)

    public val linkGetStartPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_get_start_position", 531438156)

    public val linkSetEndPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_set_end_position", 3227306858)

    public val linkGetEndPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_get_end_position", 531438156)

    public val linkSetEnterCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_set_enter_cost", 1794382983)

    public val linkGetEnterCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_get_enter_cost", 866169185)

    public val linkSetTravelCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_set_travel_cost", 1794382983)

    public val linkGetTravelCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_get_travel_cost", 866169185)

    public val linkSetOwnerIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_set_owner_id", 3411492887)

    public val linkGetOwnerIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_get_owner_id", 2198884583)

    public val agentCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_create", 529393457)

    public val agentSetAvoidanceEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_avoidance_enabled", 1265174801)

    public val agentGetAvoidanceEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_get_avoidance_enabled", 4155700596)

    public val agentSetUse3dAvoidancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_use_3d_avoidance", 1265174801)

    public val agentGetUse3dAvoidancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_get_use_3d_avoidance", 4155700596)

    public val agentSetMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_map", 395945892)

    public val agentGetMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_get_map", 3814569979)

    public val agentSetPausedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_paused", 1265174801)

    public val agentGetPausedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_get_paused", 4155700596)

    public val agentSetNeighborDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_neighbor_distance", 1794382983)

    public val agentGetNeighborDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_get_neighbor_distance", 866169185)

    public val agentSetMaxNeighborsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_max_neighbors", 3411492887)

    public val agentGetMaxNeighborsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_get_max_neighbors", 2198884583)

    public val agentSetTimeHorizonAgentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_time_horizon_agents", 1794382983)

    public val agentGetTimeHorizonAgentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_get_time_horizon_agents", 866169185)

    public val agentSetTimeHorizonObstaclesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_time_horizon_obstacles", 1794382983)

    public val agentGetTimeHorizonObstaclesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_get_time_horizon_obstacles", 866169185)

    public val agentSetRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_radius", 1794382983)

    public val agentGetRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_get_radius", 866169185)

    public val agentSetHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_height", 1794382983)

    public val agentGetHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_get_height", 866169185)

    public val agentSetMaxSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_max_speed", 1794382983)

    public val agentGetMaxSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_get_max_speed", 866169185)

    public val agentSetVelocityForcedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_velocity_forced", 3227306858)

    public val agentSetVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_velocity", 3227306858)

    public val agentGetVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_get_velocity", 531438156)

    public val agentSetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_position", 3227306858)

    public val agentGetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_get_position", 531438156)

    public val agentIsMapChangedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_is_map_changed", 4155700596)

    public val agentSetAvoidanceCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_avoidance_callback", 3379118538)

    public val agentHasAvoidanceCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_has_avoidance_callback", 4155700596)

    public val agentSetAvoidanceLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_avoidance_layers", 3411492887)

    public val agentGetAvoidanceLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_get_avoidance_layers", 2198884583)

    public val agentSetAvoidanceMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_avoidance_mask", 3411492887)

    public val agentGetAvoidanceMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_get_avoidance_mask", 2198884583)

    public val agentSetAvoidancePriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_avoidance_priority", 1794382983)

    public val agentGetAvoidancePriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_get_avoidance_priority", 866169185)

    public val obstacleCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_create", 529393457)

    public val obstacleSetAvoidanceEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_set_avoidance_enabled", 1265174801)

    public val obstacleGetAvoidanceEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_get_avoidance_enabled", 4155700596)

    public val obstacleSetUse3dAvoidancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_set_use_3d_avoidance", 1265174801)

    public val obstacleGetUse3dAvoidancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_get_use_3d_avoidance", 4155700596)

    public val obstacleSetMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_set_map", 395945892)

    public val obstacleGetMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_get_map", 3814569979)

    public val obstacleSetPausedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_set_paused", 1265174801)

    public val obstacleGetPausedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_get_paused", 4155700596)

    public val obstacleSetRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_set_radius", 1794382983)

    public val obstacleGetRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_get_radius", 866169185)

    public val obstacleSetHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_set_height", 1794382983)

    public val obstacleGetHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_get_height", 866169185)

    public val obstacleSetVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_set_velocity", 3227306858)

    public val obstacleGetVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_get_velocity", 531438156)

    public val obstacleSetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_set_position", 3227306858)

    public val obstacleGetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_get_position", 531438156)

    public val obstacleSetVerticesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_set_vertices", 4030257846)

    public val obstacleGetVerticesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_get_vertices", 808965560)

    public val obstacleSetAvoidanceLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_set_avoidance_layers", 3411492887)

    public val obstacleGetAvoidanceLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_get_avoidance_layers", 2198884583)

    public val parseSourceGeometryDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "parse_source_geometry_data", 685862123)

    public val bakeFromSourceGeometryDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "bake_from_source_geometry_data", 2469318639)

    public val bakeFromSourceGeometryDataAsyncPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "bake_from_source_geometry_data_async", 2469318639)

    public val isBakingNavigationMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "is_baking_navigation_mesh", 3142026141)

    public val sourceGeometryParserCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "source_geometry_parser_create", 529393457)

    public val sourceGeometryParserSetCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "source_geometry_parser_set_callback", 3379118538)

    public val simplifyPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "simplify_path", 2344122170)

    public val freeRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "free_rid", 2722037293)

    public val setActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "set_active", 2586408642)

    public val setDebugEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "set_debug_enabled", 2586408642)

    public val getDebugEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "get_debug_enabled", 36873697)

    public val getProcessInfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "get_process_info", 1938440894)
  }
}
