// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.PackedVector2Array
import godot.core.RID
import godot.core.Transform2D
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * A server interface for low-level 2D navigation access.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/navigation/navigation_using_navigationservers.html]($DOCS_URL/tutorials/navigation/navigation_using_navigationservers.html)
 *
 * NavigationServer2D is the server that handles navigation maps, regions and agents. It does not handle A* navigation from [godot.AStar2D] or [godot.AStarGrid2D].
 *
 * Maps are made up of regions, which are made of navigation polygons. Together, they define the traversable areas in the 2D world.
 *
 * **Note:** Most [godot.NavigationServer2D] changes take effect after the next physics frame and not immediately. This includes all changes made to maps, regions or agents by navigation-related nodes in the scene tree or made through scripts.
 *
 * For two regions to be connected to each other, they must share a similar edge. An edge is considered connected to another if both of its two vertices are at a distance less than `edge_connection_margin` to the respective other edge's vertex.
 *
 * You may assign navigation layers to regions with [godot.NavigationServer2D.regionSetNavigationLayers], which then can be checked upon when requesting a path with [godot.NavigationServer2D.mapGetPath]. This can be used to allow or deny certain areas for some objects.
 *
 * To use the collision avoidance system, you may use agents. You can set an agent's target velocity, then the servers will emit a callback with a modified velocity.
 *
 * **Note:** The collision avoidance system ignores regions. Using the modified velocity directly may move an agent outside of the traversable area. This is a limitation of the collision avoidance system, any more complex situation may require the use of the physics engine.
 *
 * This server keeps tracks of any call and executes them during the sync phase. This means that you can request any change to the map, using any thread, without worrying.
 */
@GodotBaseType
public object NavigationServer2D : Object() {
  /**
   * Emitted when a navigation map is updated, when a region moves or is modified.
   */
  public val mapChanged: Signal1<RID> by signal("map")

  /**
   * Emitted when navigation debug settings are changed. Only available in debug builds.
   */
  public val navigationDebugChanged: Signal0 by signal()

  public override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_NAVIGATIONSERVER2D)
    return false
  }

  /**
   * Returns all created navigation map [RID]s on the NavigationServer. This returns both 2D and 3D created navigation maps as there is technically no distinction between them.
   */
  public fun getMaps(): VariantArray<RID> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_GET_MAPS, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<RID>)
  }

  /**
   * Create a new map.
   */
  public fun mapCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_MAP_CREATE, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets the map active.
   */
  public fun mapSetActive(map: RID, active: Boolean): Unit {
    TransferContext.writeArguments(_RID to map, BOOL to active)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_MAP_SET_ACTIVE,
        NIL)
  }

  /**
   * Returns true if the map is active.
   */
  public fun mapIsActive(map: RID): Boolean {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_MAP_IS_ACTIVE,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the map cell size used to rasterize the navigation mesh vertices. Must match with the cell size of the used navigation meshes.
   */
  public fun mapSetCellSize(map: RID, cellSize: Float): Unit {
    TransferContext.writeArguments(_RID to map, DOUBLE to cellSize.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_MAP_SET_CELL_SIZE, NIL)
  }

  /**
   * Returns the map cell size used to rasterize the navigation mesh vertices.
   */
  public fun mapGetCellSize(map: RID): Float {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_MAP_GET_CELL_SIZE, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Set the navigation [map] edge connection use. If [enabled] the navigation map allows navigation regions to use edge connections to connect with other navigation regions within proximity of the navigation map edge connection margin.
   */
  public fun mapSetUseEdgeConnections(map: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to map, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_MAP_SET_USE_EDGE_CONNECTIONS, NIL)
  }

  /**
   * Returns whether the navigation [map] allows navigation regions to use edge connections to connect with other navigation regions within proximity of the navigation map edge connection margin.
   */
  public fun mapGetUseEdgeConnections(map: RID): Boolean {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_MAP_GET_USE_EDGE_CONNECTIONS, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Set the map edge connection margin used to weld the compatible region edges.
   */
  public fun mapSetEdgeConnectionMargin(map: RID, margin: Float): Unit {
    TransferContext.writeArguments(_RID to map, DOUBLE to margin.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_MAP_SET_EDGE_CONNECTION_MARGIN, NIL)
  }

  /**
   * Returns the edge connection margin of the map. The edge connection margin is a distance used to connect two regions.
   */
  public fun mapGetEdgeConnectionMargin(map: RID): Float {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_MAP_GET_EDGE_CONNECTION_MARGIN, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Set the map's link connection radius used to connect links to navigation polygons.
   */
  public fun mapSetLinkConnectionRadius(map: RID, radius: Float): Unit {
    TransferContext.writeArguments(_RID to map, DOUBLE to radius.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_MAP_SET_LINK_CONNECTION_RADIUS, NIL)
  }

  /**
   * Returns the link connection radius of the map. This distance is the maximum range any link will search for navigation mesh polygons to connect to.
   */
  public fun mapGetLinkConnectionRadius(map: RID): Float {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_MAP_GET_LINK_CONNECTION_RADIUS, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the navigation path to reach the destination from the origin. [navigationLayers] is a bitmask of all region navigation layers that are allowed to be in the path.
   */
  @JvmOverloads
  public fun mapGetPath(
    map: RID,
    origin: Vector2,
    destination: Vector2,
    optimize: Boolean,
    navigationLayers: Long = 1,
  ): PackedVector2Array {
    TransferContext.writeArguments(_RID to map, VECTOR2 to origin, VECTOR2 to destination, BOOL to optimize, LONG to navigationLayers)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_MAP_GET_PATH,
        PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
  }

  /**
   * Returns the point closest to the provided [toPoint] on the navigation mesh surface.
   */
  public fun mapGetClosestPoint(map: RID, toPoint: Vector2): Vector2 {
    TransferContext.writeArguments(_RID to map, VECTOR2 to toPoint)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_MAP_GET_CLOSEST_POINT, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the owner region RID for the point returned by [mapGetClosestPoint].
   */
  public fun mapGetClosestPointOwner(map: RID, toPoint: Vector2): RID {
    TransferContext.writeArguments(_RID to map, VECTOR2 to toPoint)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_MAP_GET_CLOSEST_POINT_OWNER, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns all navigation link [RID]s that are currently assigned to the requested navigation [map].
   */
  public fun mapGetLinks(map: RID): VariantArray<RID> {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_MAP_GET_LINKS,
        ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<RID>)
  }

  /**
   * Returns all navigation regions [RID]s that are currently assigned to the requested navigation [map].
   */
  public fun mapGetRegions(map: RID): VariantArray<RID> {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_MAP_GET_REGIONS,
        ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<RID>)
  }

  /**
   * Returns all navigation agents [RID]s that are currently assigned to the requested navigation [map].
   */
  public fun mapGetAgents(map: RID): VariantArray<RID> {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_MAP_GET_AGENTS,
        ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<RID>)
  }

  /**
   * Returns all navigation obstacle [RID]s that are currently assigned to the requested navigation [map].
   */
  public fun mapGetObstacles(map: RID): VariantArray<RID> {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_MAP_GET_OBSTACLES, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<RID>)
  }

  /**
   * This function immediately forces synchronization of the specified navigation [map] [RID]. By default navigation maps are only synchronized at the end of each physics frame. This function can be used to immediately (re)calculate all the navigation meshes and region connections of the navigation map. This makes it possible to query a navigation path for a changed map immediately and in the same frame (multiple times if needed).
   *
   * Due to technical restrictions the current NavigationServer command queue will be flushed. This means all already queued update commands for this physics frame will be executed, even those intended for other maps, regions and agents not part of the specified map. The expensive computation of the navigation meshes and region connections of a map will only be done for the specified map. Other maps will receive the normal synchronization at the end of the physics frame. Should the specified map receive changes after the forced update it will update again as well when the other maps receive their update.
   *
   * Avoidance processing and dispatch of the `safe_velocity` signals is untouched by this function and continues to happen for all maps and agents at the end of the physics frame.
   *
   * **Note:** With great power comes great responsibility. This function should only be used by users that really know what they are doing and have a good reason for it. Forcing an immediate update of a navigation map requires locking the NavigationServer and flushing the entire NavigationServer command queue. Not only can this severely impact the performance of a game but it can also introduce bugs if used inappropriately without much foresight.
   */
  public fun mapForceUpdate(map: RID): Unit {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_MAP_FORCE_UPDATE,
        NIL)
  }

  /**
   * Queries a path in a given navigation map. Start and target position and other parameters are defined through [godot.NavigationPathQueryParameters2D]. Updates the provided [godot.NavigationPathQueryResult2D] result object with the path among other results requested by the query.
   */
  public fun queryPath(parameters: NavigationPathQueryParameters2D,
      result: NavigationPathQueryResult2D): Unit {
    TransferContext.writeArguments(OBJECT to parameters, OBJECT to result)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_QUERY_PATH, NIL)
  }

  /**
   * Creates a new region.
   */
  public fun regionCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_REGION_CREATE,
        _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * If [enabled] the navigation [region] will use edge connections to connect with other navigation regions within proximity of the navigation map edge connection margin.
   */
  public fun regionSetUseEdgeConnections(region: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to region, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_REGION_SET_USE_EDGE_CONNECTIONS, NIL)
  }

  /**
   * Returns whether the navigation [region] is set to use edge connections to connect with other navigation regions within proximity of the navigation map edge connection margin.
   */
  public fun regionGetUseEdgeConnections(region: RID): Boolean {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_REGION_GET_USE_EDGE_CONNECTIONS, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the [enterCost] for this [region].
   */
  public fun regionSetEnterCost(region: RID, enterCost: Float): Unit {
    TransferContext.writeArguments(_RID to region, DOUBLE to enterCost.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_REGION_SET_ENTER_COST, NIL)
  }

  /**
   * Returns the enter cost of this [region].
   */
  public fun regionGetEnterCost(region: RID): Float {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_REGION_GET_ENTER_COST, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Sets the [travelCost] for this [region].
   */
  public fun regionSetTravelCost(region: RID, travelCost: Float): Unit {
    TransferContext.writeArguments(_RID to region, DOUBLE to travelCost.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_REGION_SET_TRAVEL_COST, NIL)
  }

  /**
   * Returns the travel cost of this [region].
   */
  public fun regionGetTravelCost(region: RID): Float {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_REGION_GET_TRAVEL_COST, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Set the `ObjectID` of the object which manages this region.
   */
  public fun regionSetOwnerId(region: RID, ownerId: Long): Unit {
    TransferContext.writeArguments(_RID to region, LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_REGION_SET_OWNER_ID, NIL)
  }

  /**
   * Returns the `ObjectID` of the object which manages this region.
   */
  public fun regionGetOwnerId(region: RID): Long {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_REGION_GET_OWNER_ID, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns `true` if the provided [point] in world space is currently owned by the provided navigation [region]. Owned in this context means that one of the region's navigation mesh polygon faces has a possible position at the closest distance to this point compared to all other navigation meshes from other navigation regions that are also registered on the navigation map of the provided region.
   *
   * If multiple navigation meshes have positions at equal distance the navigation region whose polygons are processed first wins the ownership. Polygons are processed in the same order that navigation regions were registered on the NavigationServer.
   *
   * **Note:** If navigation meshes from different navigation regions overlap (which should be avoided in general) the result might not be what is expected.
   */
  public fun regionOwnsPoint(region: RID, point: Vector2): Boolean {
    TransferContext.writeArguments(_RID to region, VECTOR2 to point)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_REGION_OWNS_POINT, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the map for the region.
   */
  public fun regionSetMap(region: RID, map: RID): Unit {
    TransferContext.writeArguments(_RID to region, _RID to map)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_REGION_SET_MAP,
        NIL)
  }

  /**
   * Returns the navigation map [RID] the requested [region] is currently assigned to.
   */
  public fun regionGetMap(region: RID): RID {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_REGION_GET_MAP,
        _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Set the region's navigation layers. This allows selecting regions from a path request (when using [godot.NavigationServer2D.mapGetPath]).
   */
  public fun regionSetNavigationLayers(region: RID, navigationLayers: Long): Unit {
    TransferContext.writeArguments(_RID to region, LONG to navigationLayers)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_REGION_SET_NAVIGATION_LAYERS, NIL)
  }

  /**
   * Returns the region's navigation layers.
   */
  public fun regionGetNavigationLayers(region: RID): Long {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_REGION_GET_NAVIGATION_LAYERS, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Sets the global transformation for the region.
   */
  public fun regionSetTransform(region: RID, transform: Transform2D): Unit {
    TransferContext.writeArguments(_RID to region, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_REGION_SET_TRANSFORM, NIL)
  }

  /**
   * Sets the [navigationPolygon] for the region.
   */
  public fun regionSetNavigationPolygon(region: RID, navigationPolygon: NavigationPolygon): Unit {
    TransferContext.writeArguments(_RID to region, OBJECT to navigationPolygon)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_REGION_SET_NAVIGATION_POLYGON, NIL)
  }

  /**
   * Returns how many connections this [region] has with other regions in the map.
   */
  public fun regionGetConnectionsCount(region: RID): Int {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_REGION_GET_CONNECTIONS_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the starting point of a connection door. [connection] is an index between 0 and the return value of [regionGetConnectionsCount].
   */
  public fun regionGetConnectionPathwayStart(region: RID, connection: Int): Vector2 {
    TransferContext.writeArguments(_RID to region, LONG to connection.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_REGION_GET_CONNECTION_PATHWAY_START, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the ending point of a connection door. [connection] is an index between 0 and the return value of [regionGetConnectionsCount].
   */
  public fun regionGetConnectionPathwayEnd(region: RID, connection: Int): Vector2 {
    TransferContext.writeArguments(_RID to region, LONG to connection.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_REGION_GET_CONNECTION_PATHWAY_END, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Create a new link between two positions on a map.
   */
  public fun linkCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_LINK_CREATE,
        _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets the navigation map [RID] for the link.
   */
  public fun linkSetMap(link: RID, map: RID): Unit {
    TransferContext.writeArguments(_RID to link, _RID to map)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_LINK_SET_MAP,
        NIL)
  }

  /**
   * Returns the navigation map [RID] the requested [link] is currently assigned to.
   */
  public fun linkGetMap(link: RID): RID {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_LINK_GET_MAP,
        _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets whether this [link] can be travelled in both directions.
   */
  public fun linkSetBidirectional(link: RID, bidirectional: Boolean): Unit {
    TransferContext.writeArguments(_RID to link, BOOL to bidirectional)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_LINK_SET_BIDIRECTIONAL, NIL)
  }

  /**
   * Returns whether this [link] can be travelled in both directions.
   */
  public fun linkIsBidirectional(link: RID): Boolean {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_LINK_IS_BIDIRECTIONAL, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Set the links's navigation layers. This allows selecting links from a path request (when using [godot.NavigationServer2D.mapGetPath]).
   */
  public fun linkSetNavigationLayers(link: RID, navigationLayers: Long): Unit {
    TransferContext.writeArguments(_RID to link, LONG to navigationLayers)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_LINK_SET_NAVIGATION_LAYERS, NIL)
  }

  /**
   * Returns the navigation layers for this [link].
   */
  public fun linkGetNavigationLayers(link: RID): Long {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_LINK_GET_NAVIGATION_LAYERS, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Sets the entry position for this [link].
   */
  public fun linkSetStartPosition(link: RID, position: Vector2): Unit {
    TransferContext.writeArguments(_RID to link, VECTOR2 to position)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_LINK_SET_START_POSITION, NIL)
  }

  /**
   * Returns the starting position of this [link].
   */
  public fun linkGetStartPosition(link: RID): Vector2 {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_LINK_GET_START_POSITION, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Sets the exit position for the [link].
   */
  public fun linkSetEndPosition(link: RID, position: Vector2): Unit {
    TransferContext.writeArguments(_RID to link, VECTOR2 to position)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_LINK_SET_END_POSITION, NIL)
  }

  /**
   * Returns the ending position of this [link].
   */
  public fun linkGetEndPosition(link: RID): Vector2 {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_LINK_GET_END_POSITION, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Sets the [enterCost] for this [link].
   */
  public fun linkSetEnterCost(link: RID, enterCost: Float): Unit {
    TransferContext.writeArguments(_RID to link, DOUBLE to enterCost.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_LINK_SET_ENTER_COST, NIL)
  }

  /**
   * Returns the enter cost of this [link].
   */
  public fun linkGetEnterCost(link: RID): Float {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_LINK_GET_ENTER_COST, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Sets the [travelCost] for this [link].
   */
  public fun linkSetTravelCost(link: RID, travelCost: Float): Unit {
    TransferContext.writeArguments(_RID to link, DOUBLE to travelCost.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_LINK_SET_TRAVEL_COST, NIL)
  }

  /**
   * Returns the travel cost of this [link].
   */
  public fun linkGetTravelCost(link: RID): Float {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_LINK_GET_TRAVEL_COST, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Set the `ObjectID` of the object which manages this link.
   */
  public fun linkSetOwnerId(link: RID, ownerId: Long): Unit {
    TransferContext.writeArguments(_RID to link, LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_LINK_SET_OWNER_ID, NIL)
  }

  /**
   * Returns the `ObjectID` of the object which manages this link.
   */
  public fun linkGetOwnerId(link: RID): Long {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_LINK_GET_OWNER_ID, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Creates the agent.
   */
  public fun agentCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_AGENT_CREATE,
        _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * If [enabled] is `true` the specified [agent] uses avoidance.
   */
  public fun agentSetAvoidanceEnabled(agent: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to agent, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_AGENT_SET_AVOIDANCE_ENABLED, NIL)
  }

  /**
   * Return `true` if the specified [agent] uses avoidance.
   */
  public fun agentGetAvoidanceEnabled(agent: RID): Boolean {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_AGENT_GET_AVOIDANCE_ENABLED, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Puts the agent in the map.
   */
  public fun agentSetMap(agent: RID, map: RID): Unit {
    TransferContext.writeArguments(_RID to agent, _RID to map)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_AGENT_SET_MAP,
        NIL)
  }

  /**
   * Returns the navigation map [RID] the requested [agent] is currently assigned to.
   */
  public fun agentGetMap(agent: RID): RID {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_AGENT_GET_MAP,
        _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * If [paused] is true the specified [agent] will not be processed, e.g. calculate avoidance velocities or receive avoidance callbacks.
   */
  public fun agentSetPaused(agent: RID, paused: Boolean): Unit {
    TransferContext.writeArguments(_RID to agent, BOOL to paused)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_AGENT_SET_PAUSED,
        NIL)
  }

  /**
   * Returns `true` if the specified [agent] is paused.
   */
  public fun agentGetPaused(agent: RID): Boolean {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_AGENT_GET_PAUSED,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the maximum distance to other agents this agent takes into account in the navigation. The larger this number, the longer the running time of the simulation. If the number is too low, the simulation will not be safe.
   */
  public fun agentSetNeighborDistance(agent: RID, distance: Float): Unit {
    TransferContext.writeArguments(_RID to agent, DOUBLE to distance.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_AGENT_SET_NEIGHBOR_DISTANCE, NIL)
  }

  /**
   * Sets the maximum number of other agents the agent takes into account in the navigation. The larger this number, the longer the running time of the simulation. If the number is too low, the simulation will not be safe.
   */
  public fun agentSetMaxNeighbors(agent: RID, count: Int): Unit {
    TransferContext.writeArguments(_RID to agent, LONG to count.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_AGENT_SET_MAX_NEIGHBORS, NIL)
  }

  /**
   * The minimal amount of time for which the agent's velocities that are computed by the simulation are safe with respect to other agents. The larger this number, the sooner this agent will respond to the presence of other agents, but the less freedom this agent has in choosing its velocities. A too high value will slow down agents movement considerably. Must be positive.
   */
  public fun agentSetTimeHorizonAgents(agent: RID, timeHorizon: Float): Unit {
    TransferContext.writeArguments(_RID to agent, DOUBLE to timeHorizon.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_AGENT_SET_TIME_HORIZON_AGENTS, NIL)
  }

  /**
   * The minimal amount of time for which the agent's velocities that are computed by the simulation are safe with respect to static avoidance obstacles. The larger this number, the sooner this agent will respond to the presence of static avoidance obstacles, but the less freedom this agent has in choosing its velocities. A too high value will slow down agents movement considerably. Must be positive.
   */
  public fun agentSetTimeHorizonObstacles(agent: RID, timeHorizon: Float): Unit {
    TransferContext.writeArguments(_RID to agent, DOUBLE to timeHorizon.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_AGENT_SET_TIME_HORIZON_OBSTACLES, NIL)
  }

  /**
   * Sets the radius of the agent.
   */
  public fun agentSetRadius(agent: RID, radius: Float): Unit {
    TransferContext.writeArguments(_RID to agent, DOUBLE to radius.toDouble())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_AGENT_SET_RADIUS,
        NIL)
  }

  /**
   * Sets the maximum speed of the agent. Must be positive.
   */
  public fun agentSetMaxSpeed(agent: RID, maxSpeed: Float): Unit {
    TransferContext.writeArguments(_RID to agent, DOUBLE to maxSpeed.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_AGENT_SET_MAX_SPEED, NIL)
  }

  /**
   * Replaces the internal velocity in the collision avoidance simulation with [velocity] for the specified [agent]. When an agent is teleported to a new position far away this function should be used in the same frame. If called frequently this function can get agents stuck.
   */
  public fun agentSetVelocityForced(agent: RID, velocity: Vector2): Unit {
    TransferContext.writeArguments(_RID to agent, VECTOR2 to velocity)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_AGENT_SET_VELOCITY_FORCED, NIL)
  }

  /**
   * Sets [velocity] as the new wanted velocity for the specified [agent]. The avoidance simulation will try to fulfill this velocity if possible but will modify it to avoid collision with other agent's and obstacles. When an agent is teleported to a new position far away use [agentSetVelocityForced] instead to reset the internal velocity state.
   */
  public fun agentSetVelocity(agent: RID, velocity: Vector2): Unit {
    TransferContext.writeArguments(_RID to agent, VECTOR2 to velocity)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_AGENT_SET_VELOCITY, NIL)
  }

  /**
   * Sets the position of the agent in world space.
   */
  public fun agentSetPosition(agent: RID, position: Vector2): Unit {
    TransferContext.writeArguments(_RID to agent, VECTOR2 to position)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_AGENT_SET_POSITION, NIL)
  }

  /**
   * Returns true if the map got changed the previous frame.
   */
  public fun agentIsMapChanged(agent: RID): Boolean {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_AGENT_IS_MAP_CHANGED, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the callback [godot.Callable] that gets called after each avoidance processing step for the [agent]. The calculated `safe_velocity` will be dispatched with a signal to the object just before the physics calculations.
   *
   * **Note:** Created callbacks are always processed independently of the SceneTree state as long as the agent is on a navigation map and not freed. To disable the dispatch of a callback from an agent use [agentSetAvoidanceCallback] again with an empty [godot.Callable].
   */
  public fun agentSetAvoidanceCallback(agent: RID, callback: Callable): Unit {
    TransferContext.writeArguments(_RID to agent, CALLABLE to callback)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_AGENT_SET_AVOIDANCE_CALLBACK, NIL)
  }

  /**
   * Set the agent's `avoidance_layers` bitmask.
   */
  public fun agentSetAvoidanceLayers(agent: RID, layers: Long): Unit {
    TransferContext.writeArguments(_RID to agent, LONG to layers)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_AGENT_SET_AVOIDANCE_LAYERS, NIL)
  }

  /**
   * Set the agent's `avoidance_mask` bitmask.
   */
  public fun agentSetAvoidanceMask(agent: RID, mask: Long): Unit {
    TransferContext.writeArguments(_RID to agent, LONG to mask)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_AGENT_SET_AVOIDANCE_MASK, NIL)
  }

  /**
   * Set the agent's `avoidance_priority` with a [priority] between 0.0 (lowest priority) to 1.0 (highest priority).
   *
   * The specified [agent] does not adjust the velocity for other agents that would match the `avoidance_mask` but have a lower ` avoidance_priority`. This in turn makes the other agents with lower priority adjust their velocities even more to avoid collision with this agent.
   */
  public fun agentSetAvoidancePriority(agent: RID, priority: Float): Unit {
    TransferContext.writeArguments(_RID to agent, DOUBLE to priority.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_AGENT_SET_AVOIDANCE_PRIORITY, NIL)
  }

  /**
   * Creates a new navigation obstacle.
   */
  public fun obstacleCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_OBSTACLE_CREATE,
        _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * If [enabled] the provided [obstacle] affects avoidance using agents.
   */
  public fun obstacleSetAvoidanceEnabled(obstacle: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to obstacle, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_OBSTACLE_SET_AVOIDANCE_ENABLED, NIL)
  }

  /**
   * Returns `true` if the provided [obstacle] has avoidance enabled.
   */
  public fun obstacleGetAvoidanceEnabled(obstacle: RID): Boolean {
    TransferContext.writeArguments(_RID to obstacle)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_OBSTACLE_GET_AVOIDANCE_ENABLED, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the navigation map [RID] for the obstacle.
   */
  public fun obstacleSetMap(obstacle: RID, map: RID): Unit {
    TransferContext.writeArguments(_RID to obstacle, _RID to map)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_OBSTACLE_SET_MAP,
        NIL)
  }

  /**
   * Returns the navigation map [RID] the requested [obstacle] is currently assigned to.
   */
  public fun obstacleGetMap(obstacle: RID): RID {
    TransferContext.writeArguments(_RID to obstacle)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_OBSTACLE_GET_MAP,
        _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * If [paused] is true the specified [obstacle] will not be processed, e.g. affect avoidance velocities.
   */
  public fun obstacleSetPaused(obstacle: RID, paused: Boolean): Unit {
    TransferContext.writeArguments(_RID to obstacle, BOOL to paused)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_OBSTACLE_SET_PAUSED, NIL)
  }

  /**
   * Returns `true` if the specified [obstacle] is paused.
   */
  public fun obstacleGetPaused(obstacle: RID): Boolean {
    TransferContext.writeArguments(_RID to obstacle)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_OBSTACLE_GET_PAUSED, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the radius of the dynamic obstacle.
   */
  public fun obstacleSetRadius(obstacle: RID, radius: Float): Unit {
    TransferContext.writeArguments(_RID to obstacle, DOUBLE to radius.toDouble())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_OBSTACLE_SET_RADIUS, NIL)
  }

  /**
   * Sets [velocity] of the dynamic [obstacle]. Allows other agents to better predict the movement of the dynamic obstacle. Only works in combination with the radius of the obstacle.
   */
  public fun obstacleSetVelocity(obstacle: RID, velocity: Vector2): Unit {
    TransferContext.writeArguments(_RID to obstacle, VECTOR2 to velocity)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_OBSTACLE_SET_VELOCITY, NIL)
  }

  /**
   * Sets the position of the obstacle in world space.
   */
  public fun obstacleSetPosition(obstacle: RID, position: Vector2): Unit {
    TransferContext.writeArguments(_RID to obstacle, VECTOR2 to position)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_OBSTACLE_SET_POSITION, NIL)
  }

  /**
   * Sets the outline vertices for the obstacle. If the vertices are winded in clockwise order agents will be pushed in by the obstacle, else they will be pushed out.
   */
  public fun obstacleSetVertices(obstacle: RID, vertices: PackedVector2Array): Unit {
    TransferContext.writeArguments(_RID to obstacle, PACKED_VECTOR2_ARRAY to vertices)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_OBSTACLE_SET_VERTICES, NIL)
  }

  /**
   * Set the obstacles's `avoidance_layers` bitmask.
   */
  public fun obstacleSetAvoidanceLayers(obstacle: RID, layers: Long): Unit {
    TransferContext.writeArguments(_RID to obstacle, LONG to layers)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_OBSTACLE_SET_AVOIDANCE_LAYERS, NIL)
  }

  /**
   * Destroys the given RID.
   */
  public fun freeRid(rid: RID): Unit {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_FREE_RID, NIL)
  }

  /**
   * If `true` enables debug mode on the NavigationServer.
   */
  public fun setDebugEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_SET_DEBUG_ENABLED, NIL)
  }

  /**
   * Returns `true` when the NavigationServer has debug enabled.
   */
  public fun getDebugEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER2D_GET_DEBUG_ENABLED, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }
}
