// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PoolVector3Array
import godot.core.RID
import godot.core.TransferContext
import godot.core.Transform
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_VECTOR3_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM
import godot.core.VariantType.VECTOR3
import godot.core.VariantType._RID
import godot.core.Vector3
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Server interface for low-level 3D navigation access.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/124](https://godotengine.org/asset-library/asset/124)
 *
 * NavigationServer is the server responsible for all 3D navigation. It handles several objects, namely maps, regions and agents.
 *
 * Maps are made up of regions, which are made of navigation meshes. Together, they define the navigable areas in the 3D world.
 *
 * **Note:** Most NavigationServer changes take effect after the next physics frame and not immediately. This includes all changes made to maps, regions or agents by navigation related Nodes in the SceneTree or made through scripts.
 *
 * For two regions to be connected to each other, they must share a similar edge. An edge is considered connected to another if both of its two vertices are at a distance less than [godot.Navigation.edgeConnectionMargin] to the respective other edge's vertex.
 *
 * To use the collision avoidance system, you may use agents. You can set an agent's target velocity, then the servers will emit a callback with a modified velocity.
 *
 * **Note:** The collision avoidance system ignores regions. Using the modified velocity as-is might lead to pushing and agent outside of a navigable area. This is a limitation of the collision avoidance system, any more complex situation may require the use of the physics engine.
 *
 * **Note:** By default, the expensive calculations for avoidance are done in a thread. In HTML5 exports without thread support, they will be done on the main thread, which can lead to performance issues.
 *
 * This server keeps tracks of any call and executes them during the sync phase. This means that you can request any change to the map, using any thread, without worrying.
 */
@GodotBaseType
public object NavigationServer : Object() {
  /**
   * Emitted when a navigation map is updated, when a region moves or is modified.
   */
  public val mapChanged: Signal1<RID> by signal("map")

  public override fun __new(): Unit {
    rawPtr = TransferContext.getSingleton(ENGINESINGLETON_NAVIGATIONSERVER)
  }

  public override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  /**
   * Creates the agent.
   */
  public fun agentCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_AGENT_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the navigation map [RID] the requested `agent` is currently assigned to.
   */
  public fun agentGetMap(agent: RID): RID {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_AGENT_GET_MAP,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns `true` if the map got changed the previous frame.
   */
  public fun agentIsMapChanged(agent: RID): Boolean {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_AGENT_IS_MAP_CHANGED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Callback called at the end of the RVO process. If a callback is created manually and the agent is placed on a navigation map it will calculate avoidance for the agent and dispatch the calculated `safe_velocity` to the `receiver` object with a signal to the chosen `method` name.
   *
   * **Note:** Created callbacks are always processed independently of the SceneTree state as long as the agent is on a navigation map and not freed. To disable the dispatch of a callback from an agent use [agentSetCallback] again with a `null` object as the `receiver`.
   */
  public fun agentSetCallback(
    agent: RID,
    `receiver`: Object,
    method: String,
    userdata: Any? = null
  ): Unit {
    TransferContext.writeArguments(_RID to agent, OBJECT to receiver, STRING to method, ANY to
        userdata)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_AGENT_SET_CALLBACK,
        NIL)
  }

  /**
   * Puts the agent in the map.
   */
  public fun agentSetMap(agent: RID, map: RID): Unit {
    TransferContext.writeArguments(_RID to agent, _RID to map)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_AGENT_SET_MAP, NIL)
  }

  /**
   * Sets the maximum number of other agents the agent takes into account in the navigation. The larger this number, the longer the running time of the simulation. If the number is too low, the simulation will not be safe.
   */
  public fun agentSetMaxNeighbors(agent: RID, count: Long): Unit {
    TransferContext.writeArguments(_RID to agent, LONG to count)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_AGENT_SET_MAX_NEIGHBORS, NIL)
  }

  /**
   * Sets the maximum speed of the agent. Must be positive.
   */
  public fun agentSetMaxSpeed(agent: RID, maxSpeed: Double): Unit {
    TransferContext.writeArguments(_RID to agent, DOUBLE to maxSpeed)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_AGENT_SET_MAX_SPEED, NIL)
  }

  /**
   * Sets the maximum distance to other agents this agent takes into account in the navigation. The larger this number, the longer the running time of the simulation. If the number is too low, the simulation will not be safe.
   */
  public fun agentSetNeighborDist(agent: RID, dist: Double): Unit {
    TransferContext.writeArguments(_RID to agent, DOUBLE to dist)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_AGENT_SET_NEIGHBOR_DIST, NIL)
  }

  /**
   * Sets the position of the agent in world space.
   */
  public fun agentSetPosition(agent: RID, position: Vector3): Unit {
    TransferContext.writeArguments(_RID to agent, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_AGENT_SET_POSITION,
        NIL)
  }

  /**
   * Sets the radius of the agent.
   */
  public fun agentSetRadius(agent: RID, radius: Double): Unit {
    TransferContext.writeArguments(_RID to agent, DOUBLE to radius)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_AGENT_SET_RADIUS,
        NIL)
  }

  /**
   * Sets the new target velocity.
   */
  public fun agentSetTargetVelocity(agent: RID, targetVelocity: Vector3): Unit {
    TransferContext.writeArguments(_RID to agent, VECTOR3 to targetVelocity)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_AGENT_SET_TARGET_VELOCITY, NIL)
  }

  /**
   * The minimal amount of time for which the agent's velocities that are computed by the simulation are safe with respect to other agents. The larger this number, the sooner this agent will respond to the presence of other agents, but the less freedom this agent has in choosing its velocities. Must be positive.
   */
  public fun agentSetTimeHorizon(agent: RID, time: Double): Unit {
    TransferContext.writeArguments(_RID to agent, DOUBLE to time)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_AGENT_SET_TIME_HORIZON, NIL)
  }

  /**
   * Sets the current velocity of the agent.
   */
  public fun agentSetVelocity(agent: RID, velocity: Vector3): Unit {
    TransferContext.writeArguments(_RID to agent, VECTOR3 to velocity)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_AGENT_SET_VELOCITY,
        NIL)
  }

  /**
   * Destroys the given RID.
   */
  public fun freeRid(rid: RID): Unit {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_FREE_RID, NIL)
  }

  /**
   * Returns all created navigation map [RID]s on the NavigationServer. This returns both 2D and 3D created navigation maps as there is technically no distinction between them.
   */
  public fun getMaps(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_GET_MAPS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Create a new map.
   */
  public fun mapCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_MAP_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * This function immediately forces synchronization of the specified navigation `map` [RID]. By default navigation maps are only synchronized at the end of each physics frame. This function can be used to immediately (re)calculate all the navigation meshes and region connections of the navigation map. This makes it possible to query a navigation path for a changed map immediately and in the same frame (multiple times if needed).
   *
   * Due to technical restrictions the current NavigationServer command queue will be flushed. This means all already queued update commands for this physics frame will be executed, even those intended for other maps, regions and agents not part of the specified map. The expensive computation of the navigation meshes and region connections of a map will only be done for the specified map. Other maps will receive the normal synchronization at the end of the physics frame. Should the specified map receive changes after the forced update it will update again as well when the other maps receive their update.
   *
   * Avoidance processing and dispatch of the `safe_velocity` signals is untouched by this function and continues to happen for all maps and agents at the end of the physics frame.
   *
   * **Note:** With great power comes great responsibility. This function should only be used by users that really know what they are doing and have a good reason for it. Forcing an immediate update of a navigation map requires locking the NavigationServer and flushing the entire NavigationServer command queue. Not only can this severely impact the performance of a game but it can also introduce bugs if used inappropriately without much foresight.
   */
  public fun mapForceUpdate(map: RID): Unit {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_MAP_FORCE_UPDATE,
        NIL)
  }

  /**
   * Returns all navigation agents [RID]s that are currently assigned to the requested navigation `map`.
   */
  public fun mapGetAgents(map: RID): VariantArray<Any?> {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_MAP_GET_AGENTS,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns the map cell height.
   */
  public fun mapGetCellHeight(map: RID): Double {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_MAP_GET_CELL_HEIGHT, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the map cell size.
   */
  public fun mapGetCellSize(map: RID): Double {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_MAP_GET_CELL_SIZE,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the point closest to the provided `to_point` on the navigation mesh surface.
   */
  public fun mapGetClosestPoint(map: RID, toPoint: Vector3): Vector3 {
    TransferContext.writeArguments(_RID to map, VECTOR3 to toPoint)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_MAP_GET_CLOSEST_POINT, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the normal for the point returned by [mapGetClosestPoint].
   */
  public fun mapGetClosestPointNormal(map: RID, toPoint: Vector3): Vector3 {
    TransferContext.writeArguments(_RID to map, VECTOR3 to toPoint)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_MAP_GET_CLOSEST_POINT_NORMAL, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the owner region RID for the point returned by [mapGetClosestPoint].
   */
  public fun mapGetClosestPointOwner(map: RID, toPoint: Vector3): RID {
    TransferContext.writeArguments(_RID to map, VECTOR3 to toPoint)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_MAP_GET_CLOSEST_POINT_OWNER, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
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
    TransferContext.writeArguments(_RID to map, VECTOR3 to start, VECTOR3 to end, BOOL to
        useCollision)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_MAP_GET_CLOSEST_POINT_TO_SEGMENT, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the edge connection margin of the map. This distance is the minimum vertex distance needed to connect two edges from different regions.
   */
  public fun mapGetEdgeConnectionMargin(map: RID): Double {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_MAP_GET_EDGE_CONNECTION_MARGIN, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the navigation path to reach the destination from the origin. `navigation_layers` is a bitmask of all region layers that are allowed to be in the path.
   */
  public fun mapGetPath(
    map: RID,
    origin: Vector3,
    destination: Vector3,
    optimize: Boolean,
    navigationLayers: Long = 1
  ): PoolVector3Array {
    TransferContext.writeArguments(_RID to map, VECTOR3 to origin, VECTOR3 to destination, BOOL to
        optimize, LONG to navigationLayers)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_MAP_GET_PATH,
        POOL_VECTOR3_ARRAY)
    return TransferContext.readReturnValue(POOL_VECTOR3_ARRAY, false) as PoolVector3Array
  }

  /**
   * Returns all navigation regions [RID]s that are currently assigned to the requested navigation `map`.
   */
  public fun mapGetRegions(map: RID): VariantArray<Any?> {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_MAP_GET_REGIONS,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns the map's up direction.
   */
  public fun mapGetUp(map: RID): Vector3 {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_MAP_GET_UP,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns `true` if the map is active.
   */
  public fun mapIsActive(map: RID): Boolean {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_MAP_IS_ACTIVE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the map active.
   */
  public fun mapSetActive(map: RID, active: Boolean): Unit {
    TransferContext.writeArguments(_RID to map, BOOL to active)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_MAP_SET_ACTIVE,
        NIL)
  }

  /**
   * Set the map cell height used to weld the navigation mesh polygons.
   */
  public fun mapSetCellHeight(map: RID, cellHeight: Double): Unit {
    TransferContext.writeArguments(_RID to map, DOUBLE to cellHeight)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_MAP_SET_CELL_HEIGHT, NIL)
  }

  /**
   * Set the map cell size used to weld the navigation mesh polygons.
   */
  public fun mapSetCellSize(map: RID, cellSize: Double): Unit {
    TransferContext.writeArguments(_RID to map, DOUBLE to cellSize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_MAP_SET_CELL_SIZE,
        NIL)
  }

  /**
   * Set the map edge connection margin used to weld the compatible region edges.
   */
  public fun mapSetEdgeConnectionMargin(map: RID, margin: Double): Unit {
    TransferContext.writeArguments(_RID to map, DOUBLE to margin)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_MAP_SET_EDGE_CONNECTION_MARGIN, NIL)
  }

  /**
   * Sets the map up direction.
   */
  public fun mapSetUp(map: RID, up: Vector3): Unit {
    TransferContext.writeArguments(_RID to map, VECTOR3 to up)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_MAP_SET_UP, NIL)
  }

  /**
   * Process the collision avoidance agents.
   *
   * The result of this process is needed by the physics server, so this must be called in the main thread.
   *
   * **Note:** This function is not thread safe.
   */
  public fun process(deltaTime: Double): Unit {
    TransferContext.writeArguments(DOUBLE to deltaTime)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_PROCESS, NIL)
  }

  /**
   * Bakes the navigation mesh.
   */
  public fun regionBakeNavmesh(mesh: NavigationMesh, node: Node): Unit {
    TransferContext.writeArguments(OBJECT to mesh, OBJECT to node)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_REGION_BAKE_NAVMESH, NIL)
  }

  /**
   * Creates a new region.
   */
  public fun regionCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_REGION_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the ending point of a connection door. `connection` is an index between 0 and the return value of [regionGetConnectionsCount].
   */
  public fun regionGetConnectionPathwayEnd(region: RID, connection: Long): Vector3 {
    TransferContext.writeArguments(_RID to region, LONG to connection)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_REGION_GET_CONNECTION_PATHWAY_END, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the starting point of a connection door. `connection` is an index between 0 and the return value of [regionGetConnectionsCount].
   */
  public fun regionGetConnectionPathwayStart(region: RID, connection: Long): Vector3 {
    TransferContext.writeArguments(_RID to region, LONG to connection)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_REGION_GET_CONNECTION_PATHWAY_START, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns how many connections this `region` has with other regions in the map.
   */
  public fun regionGetConnectionsCount(region: RID): Long {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_REGION_GET_CONNECTIONS_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the `enter_cost` of this `region`.
   */
  public fun regionGetEnterCost(region: RID): Double {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_REGION_GET_ENTER_COST, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the navigation map [RID] the requested `region` is currently assigned to.
   */
  public fun regionGetMap(region: RID): RID {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_REGION_GET_MAP,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the region's navigation layers.
   */
  public fun regionGetNavigationLayers(region: RID): Long {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_REGION_GET_NAVIGATION_LAYERS, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the `travel_cost` of this `region`.
   */
  public fun regionGetTravelCost(region: RID): Double {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_REGION_GET_TRAVEL_COST, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns `true` if the provided `point` in world space is currently owned by the provided navigation `region`. Owned in this context means that one of the region's navigation mesh polygon faces has a possible position at the closest distance to this point compared to all other navigation meshes from other navigation regions that are also registered on the navigation map of the provided region.
   *
   * If multiple navigation meshes have positions at equal distance the navigation region whose polygons are processed first wins the ownership. Polygons are processed in the same order that navigation regions were registered on the NavigationServer.
   *
   * **Note:** If navigation meshes from different navigation regions overlap (which should be avoided in general) the result might not be what is expected.
   */
  public fun regionOwnsPoint(region: RID, point: Vector3): Boolean {
    TransferContext.writeArguments(_RID to region, VECTOR3 to point)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_REGION_OWNS_POINT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the `enter_cost` for this `region`.
   */
  public fun regionSetEnterCost(region: RID, enterCost: Double): Unit {
    TransferContext.writeArguments(_RID to region, DOUBLE to enterCost)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_REGION_SET_ENTER_COST, NIL)
  }

  /**
   * Sets the map for the region.
   */
  public fun regionSetMap(region: RID, map: RID): Unit {
    TransferContext.writeArguments(_RID to region, _RID to map)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_REGION_SET_MAP,
        NIL)
  }

  /**
   * Set the region's navigation layers. This allows selecting regions from a path request (when using [godot.NavigationServer.mapGetPath]).
   */
  public fun regionSetNavigationLayers(region: RID, navigationLayers: Long): Unit {
    TransferContext.writeArguments(_RID to region, LONG to navigationLayers)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_REGION_SET_NAVIGATION_LAYERS, NIL)
  }

  /**
   * Sets the navigation mesh for the region.
   */
  public fun regionSetNavmesh(region: RID, navMesh: NavigationMesh): Unit {
    TransferContext.writeArguments(_RID to region, OBJECT to navMesh)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_REGION_SET_NAVMESH,
        NIL)
  }

  /**
   * Sets the global transformation for the region.
   */
  public fun regionSetTransform(region: RID, transform: Transform): Unit {
    TransferContext.writeArguments(_RID to region, TRANSFORM to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_REGION_SET_TRANSFORM, NIL)
  }

  /**
   * Sets the `travel_cost` for this `region`.
   */
  public fun regionSetTravelCost(region: RID, travelCost: Double): Unit {
    TransferContext.writeArguments(_RID to region, DOUBLE to travelCost)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_REGION_SET_TRAVEL_COST, NIL)
  }

  /**
   * Control activation of this server.
   */
  public fun setActive(active: Boolean): Unit {
    TransferContext.writeArguments(BOOL to active)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONSERVER_SET_ACTIVE, NIL)
  }
}
