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
import godot.core.Transform3D
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_VECTOR3_ARRAY
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR3
import godot.core.VariantType._RID
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Server interface for low-level 3D navigation access.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/navigation/navigation_using_navigationservers.html]($DOCS_URL/tutorials/navigation/navigation_using_navigationservers.html)
 *
 * NavigationServer3D is the server responsible for all 3D navigation. It handles several objects, namely maps, regions and agents.
 *
 * Maps are made up of regions, which are made of navigation meshes. Together, they define the navigable areas in the 3D world.
 *
 * **Note:** Most NavigationServer changes take effect after the next physics frame and not immediately. This includes all changes made to maps, regions or agents by navigation related Nodes in the SceneTree or made through scripts.
 *
 * For two regions to be connected to each other, they must share a similar edge. An edge is considered connected to another if both of its two vertices are at a distance less than `edge_connection_margin` to the respective other edge's vertex.
 *
 * You may assign navigation layers to regions with [godot.NavigationServer3D.regionSetNavigationLayers], which then can be checked upon when requesting a path with [godot.NavigationServer3D.mapGetPath]. This allows allowing or forbidding some areas to 3D objects.
 *
 * To use the collision avoidance system, you may use agents. You can set an agent's target velocity, then the servers will emit a callback with a modified velocity.
 *
 * **Note:** The collision avoidance system ignores regions. Using the modified velocity as-is might lead to pushing and agent outside of a navigable area. This is a limitation of the collision avoidance system, any more complex situation may require the use of the physics engine.
 *
 * This server keeps tracks of any call and executes them during the sync phase. This means that you can request any change to the map, using any thread, without worrying.
 */
@GodotBaseType
public object NavigationServer3D : Object() {
  /**
   * Emitted when a navigation map is updated, when a region moves or is modified.
   */
  public val mapChanged: Signal1<RID> by signal("map")

  /**
   * Emitted when navigation debug settings are changed. Only available in debug builds.
   */
  public val navigationDebugChanged: Signal0 by signal()

  public override fun new(scriptIndex: Int): Boolean {
    rawPtr = TransferContext.getSingleton(ENGINECLASS_NAVIGATIONSERVER3D)
    return false
  }

  /**
   * Returns all created navigation map [RID]s on the NavigationServer. This returns both 2D and 3D created navigation maps as there is technically no distinction between them.
   */
  public fun getMaps(): VariantArray<RID> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_GET_MAPS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<RID>
  }

  /**
   * Create a new map.
   */
  public fun mapCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_MAP_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Sets the map active.
   */
  public fun mapSetActive(map: RID, active: Boolean): Unit {
    TransferContext.writeArguments(_RID to map, BOOL to active)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_MAP_SET_ACTIVE,
        NIL)
  }

  /**
   * Returns true if the map is active.
   */
  public fun mapIsActive(map: RID): Boolean {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_MAP_IS_ACTIVE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the map up direction.
   */
  public fun mapSetUp(map: RID, up: Vector3): Unit {
    TransferContext.writeArguments(_RID to map, VECTOR3 to up)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_MAP_SET_UP, NIL)
  }

  /**
   * Returns the map's up direction.
   */
  public fun mapGetUp(map: RID): Vector3 {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_MAP_GET_UP,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Set the map cell size used to weld the navigation mesh polygons.
   */
  public fun mapSetCellSize(map: RID, cellSize: Double): Unit {
    TransferContext.writeArguments(_RID to map, DOUBLE to cellSize)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_MAP_SET_CELL_SIZE, NIL)
  }

  /**
   * Returns the map cell size.
   */
  public fun mapGetCellSize(map: RID): Double {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_MAP_GET_CELL_SIZE, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Set the map edge connection margin used to weld the compatible region edges.
   */
  public fun mapSetEdgeConnectionMargin(map: RID, margin: Double): Unit {
    TransferContext.writeArguments(_RID to map, DOUBLE to margin)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_MAP_SET_EDGE_CONNECTION_MARGIN, NIL)
  }

  /**
   * Returns the edge connection margin of the map. This distance is the minimum vertex distance needed to connect two edges from different regions.
   */
  public fun mapGetEdgeConnectionMargin(map: RID): Double {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_MAP_GET_EDGE_CONNECTION_MARGIN, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Set the map's link connection radius used to connect links to navigation polygons.
   */
  public fun mapSetLinkConnectionRadius(map: RID, radius: Double): Unit {
    TransferContext.writeArguments(_RID to map, DOUBLE to radius)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_MAP_SET_LINK_CONNECTION_RADIUS, NIL)
  }

  /**
   * Returns the link connection radius of the map. This distance is the maximum range any link will search for navigation mesh polygons to connect to.
   */
  public fun mapGetLinkConnectionRadius(map: RID): Double {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_MAP_GET_LINK_CONNECTION_RADIUS, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the navigation path to reach the destination from the origin. [navigationLayers] is a bitmask of all region navigation layers that are allowed to be in the path.
   */
  public fun mapGetPath(
    map: RID,
    origin: Vector3,
    destination: Vector3,
    optimize: Boolean,
    navigationLayers: Long = 1
  ): PackedVector3Array {
    TransferContext.writeArguments(_RID to map, VECTOR3 to origin, VECTOR3 to destination, BOOL to optimize, LONG to navigationLayers)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_MAP_GET_PATH,
        PACKED_VECTOR3_ARRAY)
    return TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array
  }

  /**
   * Returns the closest point between the navigation surface and the segment.
   */
  public fun mapGetClosestPointToSegment(
    map: RID,
    start: Vector3,
    end: Vector3,
    useCollision: Boolean = false
  ): Vector3 {
    TransferContext.writeArguments(_RID to map, VECTOR3 to start, VECTOR3 to end, BOOL to useCollision)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_MAP_GET_CLOSEST_POINT_TO_SEGMENT, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the point closest to the provided [toPoint] on the navigation mesh surface.
   */
  public fun mapGetClosestPoint(map: RID, toPoint: Vector3): Vector3 {
    TransferContext.writeArguments(_RID to map, VECTOR3 to toPoint)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_MAP_GET_CLOSEST_POINT, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the normal for the point returned by [mapGetClosestPoint].
   */
  public fun mapGetClosestPointNormal(map: RID, toPoint: Vector3): Vector3 {
    TransferContext.writeArguments(_RID to map, VECTOR3 to toPoint)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_MAP_GET_CLOSEST_POINT_NORMAL, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the owner region RID for the point returned by [mapGetClosestPoint].
   */
  public fun mapGetClosestPointOwner(map: RID, toPoint: Vector3): RID {
    TransferContext.writeArguments(_RID to map, VECTOR3 to toPoint)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_MAP_GET_CLOSEST_POINT_OWNER, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns all navigation link [RID]s that are currently assigned to the requested navigation `map`.
   */
  public fun mapGetLinks(map: RID): VariantArray<RID> {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_MAP_GET_LINKS,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<RID>
  }

  /**
   * Returns all navigation regions [RID]s that are currently assigned to the requested navigation [map].
   */
  public fun mapGetRegions(map: RID): VariantArray<RID> {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_MAP_GET_REGIONS,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<RID>
  }

  /**
   * Returns all navigation agents [RID]s that are currently assigned to the requested navigation [map].
   */
  public fun mapGetAgents(map: RID): VariantArray<RID> {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_MAP_GET_AGENTS,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<RID>
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_MAP_FORCE_UPDATE,
        NIL)
  }

  /**
   * Queries a path in a given navigation map. Start and target position and other parameters are defined through [godot.NavigationPathQueryParameters3D]. Updates the provided [godot.NavigationPathQueryResult3D] result object with the path among other results requested by the query.
   */
  public fun queryPath(parameters: NavigationPathQueryParameters3D,
      result: NavigationPathQueryResult3D): Unit {
    TransferContext.writeArguments(OBJECT to parameters, OBJECT to result)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_QUERY_PATH, NIL)
  }

  /**
   * Creates a new region.
   */
  public fun regionCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_REGION_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Sets the [enterCost] for this [region].
   */
  public fun regionSetEnterCost(region: RID, enterCost: Double): Unit {
    TransferContext.writeArguments(_RID to region, DOUBLE to enterCost)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_REGION_SET_ENTER_COST, NIL)
  }

  /**
   * Returns the enter cost of this [region].
   */
  public fun regionGetEnterCost(region: RID): Double {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_REGION_GET_ENTER_COST, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets the [travelCost] for this [region].
   */
  public fun regionSetTravelCost(region: RID, travelCost: Double): Unit {
    TransferContext.writeArguments(_RID to region, DOUBLE to travelCost)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_REGION_SET_TRAVEL_COST, NIL)
  }

  /**
   * Returns the travel cost of this [region].
   */
  public fun regionGetTravelCost(region: RID): Double {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_REGION_GET_TRAVEL_COST, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Set the `ObjectID` of the object which manages this region.
   */
  public fun regionSetOwnerId(region: RID, ownerId: Long): Unit {
    TransferContext.writeArguments(_RID to region, LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_REGION_SET_OWNER_ID, NIL)
  }

  /**
   * Returns the `ObjectID` of the object which manages this region.
   */
  public fun regionGetOwnerId(region: RID): Long {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_REGION_GET_OWNER_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns `true` if the provided [point] in world space is currently owned by the provided navigation [region]. Owned in this context means that one of the region's navigation mesh polygon faces has a possible position at the closest distance to this point compared to all other navigation meshes from other navigation regions that are also registered on the navigation map of the provided region.
   *
   * If multiple navigation meshes have positions at equal distance the navigation region whose polygons are processed first wins the ownership. Polygons are processed in the same order that navigation regions were registered on the NavigationServer.
   *
   * **Note:** If navigation meshes from different navigation regions overlap (which should be avoided in general) the result might not be what is expected.
   */
  public fun regionOwnsPoint(region: RID, point: Vector3): Boolean {
    TransferContext.writeArguments(_RID to region, VECTOR3 to point)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_REGION_OWNS_POINT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the map for the region.
   */
  public fun regionSetMap(region: RID, map: RID): Unit {
    TransferContext.writeArguments(_RID to region, _RID to map)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_REGION_SET_MAP,
        NIL)
  }

  /**
   * Returns the navigation map [RID] the requested [region] is currently assigned to.
   */
  public fun regionGetMap(region: RID): RID {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_REGION_GET_MAP,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Set the region's navigation layers. This allows selecting regions from a path request (when using [godot.NavigationServer3D.mapGetPath]).
   */
  public fun regionSetNavigationLayers(region: RID, navigationLayers: Long): Unit {
    TransferContext.writeArguments(_RID to region, LONG to navigationLayers)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_REGION_SET_NAVIGATION_LAYERS, NIL)
  }

  /**
   * Returns the region's navigation layers.
   */
  public fun regionGetNavigationLayers(region: RID): Long {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_REGION_GET_NAVIGATION_LAYERS, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the global transformation for the region.
   */
  public fun regionSetTransform(region: RID, transform: Transform3D): Unit {
    TransferContext.writeArguments(_RID to region, TRANSFORM3D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_REGION_SET_TRANSFORM, NIL)
  }

  /**
   * Sets the navigation mesh for the region.
   */
  public fun regionSetNavigationMesh(region: RID, navigationMesh: NavigationMesh): Unit {
    TransferContext.writeArguments(_RID to region, OBJECT to navigationMesh)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_REGION_SET_NAVIGATION_MESH, NIL)
  }

  /**
   * Bakes the [navigationMesh] with bake source geometry collected starting from the [rootNode].
   */
  public fun regionBakeNavigationMesh(navigationMesh: NavigationMesh, rootNode: Node): Unit {
    TransferContext.writeArguments(OBJECT to navigationMesh, OBJECT to rootNode)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_REGION_BAKE_NAVIGATION_MESH, NIL)
  }

  /**
   * Returns how many connections this [region] has with other regions in the map.
   */
  public fun regionGetConnectionsCount(region: RID): Long {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_REGION_GET_CONNECTIONS_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the starting point of a connection door. [connection] is an index between 0 and the return value of [regionGetConnectionsCount].
   */
  public fun regionGetConnectionPathwayStart(region: RID, connection: Long): Vector3 {
    TransferContext.writeArguments(_RID to region, LONG to connection)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_REGION_GET_CONNECTION_PATHWAY_START, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the ending point of a connection door. [connection] is an index between 0 and the return value of [regionGetConnectionsCount].
   */
  public fun regionGetConnectionPathwayEnd(region: RID, connection: Long): Vector3 {
    TransferContext.writeArguments(_RID to region, LONG to connection)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_REGION_GET_CONNECTION_PATHWAY_END, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Create a new link between two positions on a map.
   */
  public fun linkCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_LINK_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Sets the navigation map [RID] for the link.
   */
  public fun linkSetMap(link: RID, map: RID): Unit {
    TransferContext.writeArguments(_RID to link, _RID to map)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_LINK_SET_MAP,
        NIL)
  }

  /**
   * Returns the navigation map [RID] the requested `link` is currently assigned to.
   */
  public fun linkGetMap(link: RID): RID {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_LINK_GET_MAP,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Sets whether this `link` can be travelled in both directions.
   */
  public fun linkSetBidirectional(link: RID, bidirectional: Boolean): Unit {
    TransferContext.writeArguments(_RID to link, BOOL to bidirectional)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_LINK_SET_BIDIRECTIONAL, NIL)
  }

  /**
   * Returns whether this `link` can be travelled in both directions.
   */
  public fun linkIsBidirectional(link: RID): Boolean {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_LINK_IS_BIDIRECTIONAL, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Set the links's navigation layers. This allows selecting links from a path request (when using [godot.NavigationServer3D.mapGetPath]).
   */
  public fun linkSetNavigationLayers(link: RID, navigationLayers: Long): Unit {
    TransferContext.writeArguments(_RID to link, LONG to navigationLayers)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_LINK_SET_NAVIGATION_LAYERS, NIL)
  }

  /**
   * Returns the navigation layers for this `link`.
   */
  public fun linkGetNavigationLayers(link: RID): Long {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_LINK_GET_NAVIGATION_LAYERS, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the entry position for this `link`.
   */
  public fun linkSetStartPosition(link: RID, position: Vector3): Unit {
    TransferContext.writeArguments(_RID to link, VECTOR3 to position)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_LINK_SET_START_POSITION, NIL)
  }

  /**
   * Returns the starting position of this `link`.
   */
  public fun linkGetStartPosition(link: RID): Vector3 {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_LINK_GET_START_POSITION, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Sets the exit position for the `link`.
   */
  public fun linkSetEndPosition(link: RID, position: Vector3): Unit {
    TransferContext.writeArguments(_RID to link, VECTOR3 to position)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_LINK_SET_END_POSITION, NIL)
  }

  /**
   * Returns the ending position of this `link`.
   */
  public fun linkGetEndPosition(link: RID): Vector3 {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_LINK_GET_END_POSITION, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Sets the `enter_cost` for this `link`.
   */
  public fun linkSetEnterCost(link: RID, enterCost: Double): Unit {
    TransferContext.writeArguments(_RID to link, DOUBLE to enterCost)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_LINK_SET_ENTER_COST, NIL)
  }

  /**
   * Returns the enter cost of this [link].
   */
  public fun linkGetEnterCost(link: RID): Double {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_LINK_GET_ENTER_COST, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets the `travel_cost` for this `link`.
   */
  public fun linkSetTravelCost(link: RID, travelCost: Double): Unit {
    TransferContext.writeArguments(_RID to link, DOUBLE to travelCost)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_LINK_SET_TRAVEL_COST, NIL)
  }

  /**
   * Returns the travel cost of this [link].
   */
  public fun linkGetTravelCost(link: RID): Double {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_LINK_GET_TRAVEL_COST, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Set the `ObjectID` of the object which manages this link.
   */
  public fun linkSetOwnerId(link: RID, ownerId: Long): Unit {
    TransferContext.writeArguments(_RID to link, LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_LINK_SET_OWNER_ID, NIL)
  }

  /**
   * Returns the `ObjectID` of the object which manages this link.
   */
  public fun linkGetOwnerId(link: RID): Long {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_LINK_GET_OWNER_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Creates the agent.
   */
  public fun agentCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_AGENT_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Puts the agent in the map.
   */
  public fun agentSetMap(agent: RID, map: RID): Unit {
    TransferContext.writeArguments(_RID to agent, _RID to map)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_AGENT_SET_MAP,
        NIL)
  }

  /**
   * Returns the navigation map [RID] the requested [agent] is currently assigned to.
   */
  public fun agentGetMap(agent: RID): RID {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_AGENT_GET_MAP,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Sets the maximum distance to other agents this agent takes into account in the navigation. The larger this number, the longer the running time of the simulation. If the number is too low, the simulation will not be safe.
   */
  public fun agentSetNeighborDistance(agent: RID, distance: Double): Unit {
    TransferContext.writeArguments(_RID to agent, DOUBLE to distance)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_AGENT_SET_NEIGHBOR_DISTANCE, NIL)
  }

  /**
   * Sets the maximum number of other agents the agent takes into account in the navigation. The larger this number, the longer the running time of the simulation. If the number is too low, the simulation will not be safe.
   */
  public fun agentSetMaxNeighbors(agent: RID, count: Long): Unit {
    TransferContext.writeArguments(_RID to agent, LONG to count)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_AGENT_SET_MAX_NEIGHBORS, NIL)
  }

  /**
   * The minimal amount of time for which the agent's velocities that are computed by the simulation are safe with respect to other agents. The larger this number, the sooner this agent will respond to the presence of other agents, but the less freedom this agent has in choosing its velocities. Must be positive.
   */
  public fun agentSetTimeHorizon(agent: RID, time: Double): Unit {
    TransferContext.writeArguments(_RID to agent, DOUBLE to time)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_AGENT_SET_TIME_HORIZON, NIL)
  }

  /**
   * Sets the radius of the agent.
   */
  public fun agentSetRadius(agent: RID, radius: Double): Unit {
    TransferContext.writeArguments(_RID to agent, DOUBLE to radius)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_AGENT_SET_RADIUS,
        NIL)
  }

  /**
   * Sets the maximum speed of the agent. Must be positive.
   */
  public fun agentSetMaxSpeed(agent: RID, maxSpeed: Double): Unit {
    TransferContext.writeArguments(_RID to agent, DOUBLE to maxSpeed)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_AGENT_SET_MAX_SPEED, NIL)
  }

  /**
   * Sets the current velocity of the agent.
   */
  public fun agentSetVelocity(agent: RID, velocity: Vector3): Unit {
    TransferContext.writeArguments(_RID to agent, VECTOR3 to velocity)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_AGENT_SET_VELOCITY, NIL)
  }

  /**
   * Sets the new target velocity.
   */
  public fun agentSetTargetVelocity(agent: RID, targetVelocity: Vector3): Unit {
    TransferContext.writeArguments(_RID to agent, VECTOR3 to targetVelocity)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_AGENT_SET_TARGET_VELOCITY, NIL)
  }

  /**
   * Sets the position of the agent in world space.
   */
  public fun agentSetPosition(agent: RID, position: Vector3): Unit {
    TransferContext.writeArguments(_RID to agent, VECTOR3 to position)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_AGENT_SET_POSITION, NIL)
  }

  /**
   * Returns true if the map got changed the previous frame.
   */
  public fun agentIsMapChanged(agent: RID): Boolean {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_AGENT_IS_MAP_CHANGED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the callback that gets called after each avoidance processing step for the [agent]. The calculated `safe_velocity` will be passed as the first parameter just before the physics calculations.
   *
   * **Note:** Created callbacks are always processed independently of the SceneTree state as long as the agent is on a navigation map and not freed. To disable the dispatch of a callback from an agent use [agentSetCallback] again with an empty [godot.Callable].
   */
  public fun agentSetCallback(agent: RID, callback: Callable): Unit {
    TransferContext.writeArguments(_RID to agent, CALLABLE to callback)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_AGENT_SET_CALLBACK, NIL)
  }

  /**
   * Destroys the given RID.
   */
  public fun freeRid(rid: RID): Unit {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_FREE_RID, NIL)
  }

  /**
   * Control activation of this server.
   */
  public fun setActive(active: Boolean): Unit {
    TransferContext.writeArguments(BOOL to active)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_SET_ACTIVE, NIL)
  }

  /**
   * If `true` enables debug mode on the NavigationServer.
   */
  public fun setDebugEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_SET_DEBUG_ENABLED, NIL)
  }

  /**
   * Returns `true` when the NavigationServer has debug enabled.
   */
  public fun getDebugEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_GET_DEBUG_ENABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns information about the current state of the NavigationServer. See [enum ProcessInfo] for a list of available states.
   */
  public fun getProcessInfo(processInfo: ProcessInfo): Long {
    TransferContext.writeArguments(LONG to processInfo.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER3D_GET_PROCESS_INFO,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public enum class ProcessInfo(
    id: Long
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
     * Constant to get the number of navigation mesh polygon edges that were merged due to edge key overlap.
     */
    INFO_EDGE_MERGE_COUNT(6),
    /**
     * Constant to get the number of navigation mesh polygon edges that are considered connected by edge proximity.
     */
    INFO_EDGE_CONNECTION_COUNT(7),
    /**
     * Constant to get the number of navigation mesh polygon edges that could not be merged but may be still connected by edge proximity or with links.
     */
    INFO_EDGE_FREE_COUNT(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }
}
