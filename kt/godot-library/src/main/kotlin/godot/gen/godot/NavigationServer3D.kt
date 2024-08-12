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
import godot.core.TypeManager
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
 * Maps are made up of regions, which are made of navigation meshes. Together, they define the
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
  public val mapChanged: Signal1<RID> by signal("map")

  /**
   * Emitted when navigation debug settings are changed. Only available in debug builds.
   */
  public val navigationDebugChanged: Signal0 by signal()

  /**
   * Emitted when avoidance debug settings are changed. Only available in debug builds.
   */
  public val avoidanceDebugChanged: Signal0 by signal()

  public override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_NAVIGATIONSERVER3D)
    return false
  }

  /**
   * Returns all created navigation map [RID]s on the NavigationServer. This returns both 2D and 3D
   * created navigation maps as there is technically no distinction between them.
   */
  public fun getMaps(): VariantArray<RID> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMapsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<RID>)
  }

  /**
   * Create a new map.
   */
  public fun mapCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.mapCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets the map active.
   */
  public fun mapSetActive(map: RID, active: Boolean): Unit {
    TransferContext.writeArguments(_RID to map, BOOL to active)
    TransferContext.callMethod(rawPtr, MethodBindings.mapSetActivePtr, NIL)
  }

  /**
   * Returns true if the map is active.
   */
  public fun mapIsActive(map: RID): Boolean {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.mapIsActivePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the map up direction.
   */
  public fun mapSetUp(map: RID, up: Vector3): Unit {
    TransferContext.writeArguments(_RID to map, VECTOR3 to up)
    TransferContext.callMethod(rawPtr, MethodBindings.mapSetUpPtr, NIL)
  }

  /**
   * Returns the map's up direction.
   */
  public fun mapGetUp(map: RID): Vector3 {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetUpPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Sets the map cell size used to rasterize the navigation mesh vertices on the XZ plane. Must
   * match with the cell size of the used navigation meshes.
   */
  public fun mapSetCellSize(map: RID, cellSize: Float): Unit {
    TransferContext.writeArguments(_RID to map, DOUBLE to cellSize.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.mapSetCellSizePtr, NIL)
  }

  /**
   * Returns the map cell size used to rasterize the navigation mesh vertices on the XZ plane.
   */
  public fun mapGetCellSize(map: RID): Float {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetCellSizePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Sets the map cell height used to rasterize the navigation mesh vertices on the Y axis. Must
   * match with the cell height of the used navigation meshes.
   */
  public fun mapSetCellHeight(map: RID, cellHeight: Float): Unit {
    TransferContext.writeArguments(_RID to map, DOUBLE to cellHeight.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.mapSetCellHeightPtr, NIL)
  }

  /**
   * Returns the map cell height used to rasterize the navigation mesh vertices on the Y axis.
   */
  public fun mapGetCellHeight(map: RID): Float {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetCellHeightPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Set the navigation [map] edge connection use. If [enabled] is `true`, the navigation map allows
   * navigation regions to use edge connections to connect with other navigation regions within
   * proximity of the navigation map edge connection margin.
   */
  public fun mapSetUseEdgeConnections(map: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to map, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.mapSetUseEdgeConnectionsPtr, NIL)
  }

  /**
   * Returns true if the navigation [map] allows navigation regions to use edge connections to
   * connect with other navigation regions within proximity of the navigation map edge connection
   * margin.
   */
  public fun mapGetUseEdgeConnections(map: RID): Boolean {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetUseEdgeConnectionsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Set the map edge connection margin used to weld the compatible region edges.
   */
  public fun mapSetEdgeConnectionMargin(map: RID, margin: Float): Unit {
    TransferContext.writeArguments(_RID to map, DOUBLE to margin.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.mapSetEdgeConnectionMarginPtr, NIL)
  }

  /**
   * Returns the edge connection margin of the map. This distance is the minimum vertex distance
   * needed to connect two edges from different regions.
   */
  public fun mapGetEdgeConnectionMargin(map: RID): Float {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetEdgeConnectionMarginPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Set the map's link connection radius used to connect links to navigation polygons.
   */
  public fun mapSetLinkConnectionRadius(map: RID, radius: Float): Unit {
    TransferContext.writeArguments(_RID to map, DOUBLE to radius.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.mapSetLinkConnectionRadiusPtr, NIL)
  }

  /**
   * Returns the link connection radius of the map. This distance is the maximum range any link will
   * search for navigation mesh polygons to connect to.
   */
  public fun mapGetLinkConnectionRadius(map: RID): Float {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetLinkConnectionRadiusPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the navigation path to reach the destination from the origin. [navigationLayers] is a
   * bitmask of all region navigation layers that are allowed to be in the path.
   */
  @JvmOverloads
  public fun mapGetPath(
    map: RID,
    origin: Vector3,
    destination: Vector3,
    optimize: Boolean,
    navigationLayers: Long = 1,
  ): PackedVector3Array {
    TransferContext.writeArguments(_RID to map, VECTOR3 to origin, VECTOR3 to destination, BOOL to optimize, LONG to navigationLayers)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetPathPtr, PACKED_VECTOR3_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array)
  }

  /**
   * Returns the closest point between the navigation surface and the segment.
   */
  @JvmOverloads
  public fun mapGetClosestPointToSegment(
    map: RID,
    start: Vector3,
    end: Vector3,
    useCollision: Boolean = false,
  ): Vector3 {
    TransferContext.writeArguments(_RID to map, VECTOR3 to start, VECTOR3 to end, BOOL to useCollision)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetClosestPointToSegmentPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Returns the point closest to the provided [toPoint] on the navigation mesh surface.
   */
  public fun mapGetClosestPoint(map: RID, toPoint: Vector3): Vector3 {
    TransferContext.writeArguments(_RID to map, VECTOR3 to toPoint)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetClosestPointPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Returns the normal for the point returned by [mapGetClosestPoint].
   */
  public fun mapGetClosestPointNormal(map: RID, toPoint: Vector3): Vector3 {
    TransferContext.writeArguments(_RID to map, VECTOR3 to toPoint)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetClosestPointNormalPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Returns the owner region RID for the point returned by [mapGetClosestPoint].
   */
  public fun mapGetClosestPointOwner(map: RID, toPoint: Vector3): RID {
    TransferContext.writeArguments(_RID to map, VECTOR3 to toPoint)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetClosestPointOwnerPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns all navigation link [RID]s that are currently assigned to the requested navigation
   * [map].
   */
  public fun mapGetLinks(map: RID): VariantArray<RID> {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetLinksPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<RID>)
  }

  /**
   * Returns all navigation regions [RID]s that are currently assigned to the requested navigation
   * [map].
   */
  public fun mapGetRegions(map: RID): VariantArray<RID> {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetRegionsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<RID>)
  }

  /**
   * Returns all navigation agents [RID]s that are currently assigned to the requested navigation
   * [map].
   */
  public fun mapGetAgents(map: RID): VariantArray<RID> {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetAgentsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<RID>)
  }

  /**
   * Returns all navigation obstacle [RID]s that are currently assigned to the requested navigation
   * [map].
   */
  public fun mapGetObstacles(map: RID): VariantArray<RID> {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.mapGetObstaclesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<RID>)
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
  public fun mapForceUpdate(map: RID): Unit {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.mapForceUpdatePtr, NIL)
  }

  /**
   * Queries a path in a given navigation map. Start and target position and other parameters are
   * defined through [NavigationPathQueryParameters3D]. Updates the provided
   * [NavigationPathQueryResult3D] result object with the path among other results requested by the
   * query.
   */
  public fun queryPath(parameters: NavigationPathQueryParameters3D,
      result: NavigationPathQueryResult3D): Unit {
    TransferContext.writeArguments(OBJECT to parameters, OBJECT to result)
    TransferContext.callMethod(rawPtr, MethodBindings.queryPathPtr, NIL)
  }

  /**
   * Creates a new region.
   */
  public fun regionCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.regionCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * If [enabled] is `true`, the specified [region] will contribute to its current navigation map.
   */
  public fun regionSetEnabled(region: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to region, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.regionSetEnabledPtr, NIL)
  }

  /**
   * Returns `true` if the specified [region] is enabled.
   */
  public fun regionGetEnabled(region: RID): Boolean {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(rawPtr, MethodBindings.regionGetEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * If [enabled] is `true`, the navigation [region] will use edge connections to connect with other
   * navigation regions within proximity of the navigation map edge connection margin.
   */
  public fun regionSetUseEdgeConnections(region: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to region, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.regionSetUseEdgeConnectionsPtr, NIL)
  }

  /**
   * Returns true if the navigation [region] is set to use edge connections to connect with other
   * navigation regions within proximity of the navigation map edge connection margin.
   */
  public fun regionGetUseEdgeConnections(region: RID): Boolean {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(rawPtr, MethodBindings.regionGetUseEdgeConnectionsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the [enterCost] for this [region].
   */
  public fun regionSetEnterCost(region: RID, enterCost: Float): Unit {
    TransferContext.writeArguments(_RID to region, DOUBLE to enterCost.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.regionSetEnterCostPtr, NIL)
  }

  /**
   * Returns the enter cost of this [region].
   */
  public fun regionGetEnterCost(region: RID): Float {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(rawPtr, MethodBindings.regionGetEnterCostPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Sets the [travelCost] for this [region].
   */
  public fun regionSetTravelCost(region: RID, travelCost: Float): Unit {
    TransferContext.writeArguments(_RID to region, DOUBLE to travelCost.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.regionSetTravelCostPtr, NIL)
  }

  /**
   * Returns the travel cost of this [region].
   */
  public fun regionGetTravelCost(region: RID): Float {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(rawPtr, MethodBindings.regionGetTravelCostPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Set the `ObjectID` of the object which manages this region.
   */
  public fun regionSetOwnerId(region: RID, ownerId: Long): Unit {
    TransferContext.writeArguments(_RID to region, LONG to ownerId)
    TransferContext.callMethod(rawPtr, MethodBindings.regionSetOwnerIdPtr, NIL)
  }

  /**
   * Returns the `ObjectID` of the object which manages this region.
   */
  public fun regionGetOwnerId(region: RID): Long {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(rawPtr, MethodBindings.regionGetOwnerIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
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
  public fun regionOwnsPoint(region: RID, point: Vector3): Boolean {
    TransferContext.writeArguments(_RID to region, VECTOR3 to point)
    TransferContext.callMethod(rawPtr, MethodBindings.regionOwnsPointPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the map for the region.
   */
  public fun regionSetMap(region: RID, map: RID): Unit {
    TransferContext.writeArguments(_RID to region, _RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.regionSetMapPtr, NIL)
  }

  /**
   * Returns the navigation map [RID] the requested [region] is currently assigned to.
   */
  public fun regionGetMap(region: RID): RID {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(rawPtr, MethodBindings.regionGetMapPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Set the region's navigation layers. This allows selecting regions from a path request (when
   * using [NavigationServer3D.mapGetPath]).
   */
  public fun regionSetNavigationLayers(region: RID, navigationLayers: Long): Unit {
    TransferContext.writeArguments(_RID to region, LONG to navigationLayers)
    TransferContext.callMethod(rawPtr, MethodBindings.regionSetNavigationLayersPtr, NIL)
  }

  /**
   * Returns the region's navigation layers.
   */
  public fun regionGetNavigationLayers(region: RID): Long {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(rawPtr, MethodBindings.regionGetNavigationLayersPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Sets the global transformation for the region.
   */
  public fun regionSetTransform(region: RID, transform: Transform3D): Unit {
    TransferContext.writeArguments(_RID to region, TRANSFORM3D to transform)
    TransferContext.callMethod(rawPtr, MethodBindings.regionSetTransformPtr, NIL)
  }

  /**
   * Sets the navigation mesh for the region.
   */
  public fun regionSetNavigationMesh(region: RID, navigationMesh: NavigationMesh): Unit {
    TransferContext.writeArguments(_RID to region, OBJECT to navigationMesh)
    TransferContext.callMethod(rawPtr, MethodBindings.regionSetNavigationMeshPtr, NIL)
  }

  /**
   * Bakes the [navigationMesh] with bake source geometry collected starting from the [rootNode].
   * *Deprecated.* This function is deprecated due to core threading changes. To upgrade existing
   * code, first create a [NavigationMeshSourceGeometryData3D] resource. Use this resource with
   * [parseSourceGeometryData] to parse the SceneTree for nodes that should contribute to the
   * navigation mesh baking. The SceneTree parsing needs to happen on the main thread. After the
   * parsing is finished use the resource with [bakeFromSourceGeometryData] to bake a navigation mesh.
   */
  public fun regionBakeNavigationMesh(navigationMesh: NavigationMesh, rootNode: Node): Unit {
    TransferContext.writeArguments(OBJECT to navigationMesh, OBJECT to rootNode)
    TransferContext.callMethod(rawPtr, MethodBindings.regionBakeNavigationMeshPtr, NIL)
  }

  /**
   * Returns how many connections this [region] has with other regions in the map.
   */
  public fun regionGetConnectionsCount(region: RID): Int {
    TransferContext.writeArguments(_RID to region)
    TransferContext.callMethod(rawPtr, MethodBindings.regionGetConnectionsCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the starting point of a connection door. [connection] is an index between 0 and the
   * return value of [regionGetConnectionsCount].
   */
  public fun regionGetConnectionPathwayStart(region: RID, connection: Int): Vector3 {
    TransferContext.writeArguments(_RID to region, LONG to connection.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.regionGetConnectionPathwayStartPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Returns the ending point of a connection door. [connection] is an index between 0 and the
   * return value of [regionGetConnectionsCount].
   */
  public fun regionGetConnectionPathwayEnd(region: RID, connection: Int): Vector3 {
    TransferContext.writeArguments(_RID to region, LONG to connection.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.regionGetConnectionPathwayEndPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Create a new link between two positions on a map.
   */
  public fun linkCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.linkCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets the navigation map [RID] for the link.
   */
  public fun linkSetMap(link: RID, map: RID): Unit {
    TransferContext.writeArguments(_RID to link, _RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.linkSetMapPtr, NIL)
  }

  /**
   * Returns the navigation map [RID] the requested [link] is currently assigned to.
   */
  public fun linkGetMap(link: RID): RID {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(rawPtr, MethodBindings.linkGetMapPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * If [enabled] is `true`, the specified [link] will contribute to its current navigation map.
   */
  public fun linkSetEnabled(link: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to link, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.linkSetEnabledPtr, NIL)
  }

  /**
   * Returns `true` if the specified [link] is enabled.
   */
  public fun linkGetEnabled(link: RID): Boolean {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(rawPtr, MethodBindings.linkGetEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets whether this [link] can be travelled in both directions.
   */
  public fun linkSetBidirectional(link: RID, bidirectional: Boolean): Unit {
    TransferContext.writeArguments(_RID to link, BOOL to bidirectional)
    TransferContext.callMethod(rawPtr, MethodBindings.linkSetBidirectionalPtr, NIL)
  }

  /**
   * Returns whether this [link] can be travelled in both directions.
   */
  public fun linkIsBidirectional(link: RID): Boolean {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(rawPtr, MethodBindings.linkIsBidirectionalPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Set the links's navigation layers. This allows selecting links from a path request (when using
   * [NavigationServer3D.mapGetPath]).
   */
  public fun linkSetNavigationLayers(link: RID, navigationLayers: Long): Unit {
    TransferContext.writeArguments(_RID to link, LONG to navigationLayers)
    TransferContext.callMethod(rawPtr, MethodBindings.linkSetNavigationLayersPtr, NIL)
  }

  /**
   * Returns the navigation layers for this [link].
   */
  public fun linkGetNavigationLayers(link: RID): Long {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(rawPtr, MethodBindings.linkGetNavigationLayersPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Sets the entry position for this [link].
   */
  public fun linkSetStartPosition(link: RID, position: Vector3): Unit {
    TransferContext.writeArguments(_RID to link, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.linkSetStartPositionPtr, NIL)
  }

  /**
   * Returns the starting position of this [link].
   */
  public fun linkGetStartPosition(link: RID): Vector3 {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(rawPtr, MethodBindings.linkGetStartPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Sets the exit position for the [link].
   */
  public fun linkSetEndPosition(link: RID, position: Vector3): Unit {
    TransferContext.writeArguments(_RID to link, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.linkSetEndPositionPtr, NIL)
  }

  /**
   * Returns the ending position of this [link].
   */
  public fun linkGetEndPosition(link: RID): Vector3 {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(rawPtr, MethodBindings.linkGetEndPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Sets the [enterCost] for this [link].
   */
  public fun linkSetEnterCost(link: RID, enterCost: Float): Unit {
    TransferContext.writeArguments(_RID to link, DOUBLE to enterCost.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.linkSetEnterCostPtr, NIL)
  }

  /**
   * Returns the enter cost of this [link].
   */
  public fun linkGetEnterCost(link: RID): Float {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(rawPtr, MethodBindings.linkGetEnterCostPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Sets the [travelCost] for this [link].
   */
  public fun linkSetTravelCost(link: RID, travelCost: Float): Unit {
    TransferContext.writeArguments(_RID to link, DOUBLE to travelCost.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.linkSetTravelCostPtr, NIL)
  }

  /**
   * Returns the travel cost of this [link].
   */
  public fun linkGetTravelCost(link: RID): Float {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(rawPtr, MethodBindings.linkGetTravelCostPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Set the `ObjectID` of the object which manages this link.
   */
  public fun linkSetOwnerId(link: RID, ownerId: Long): Unit {
    TransferContext.writeArguments(_RID to link, LONG to ownerId)
    TransferContext.callMethod(rawPtr, MethodBindings.linkSetOwnerIdPtr, NIL)
  }

  /**
   * Returns the `ObjectID` of the object which manages this link.
   */
  public fun linkGetOwnerId(link: RID): Long {
    TransferContext.writeArguments(_RID to link)
    TransferContext.callMethod(rawPtr, MethodBindings.linkGetOwnerIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Creates the agent.
   */
  public fun agentCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.agentCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * If [enabled] is `true`, the provided [agent] calculates avoidance.
   */
  public fun agentSetAvoidanceEnabled(agent: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to agent, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetAvoidanceEnabledPtr, NIL)
  }

  /**
   * Returns `true` if the provided [agent] has avoidance enabled.
   */
  public fun agentGetAvoidanceEnabled(agent: RID): Boolean {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(rawPtr, MethodBindings.agentGetAvoidanceEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
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
  public fun agentSetUse3dAvoidance(agent: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to agent, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetUse3dAvoidancePtr, NIL)
  }

  /**
   * Returns `true` if the provided [agent] uses avoidance in 3D space Vector3(x,y,z) instead of
   * horizontal 2D Vector2(x,y) / Vector3(x,0.0,z).
   */
  public fun agentGetUse3dAvoidance(agent: RID): Boolean {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(rawPtr, MethodBindings.agentGetUse3dAvoidancePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Puts the agent in the map.
   */
  public fun agentSetMap(agent: RID, map: RID): Unit {
    TransferContext.writeArguments(_RID to agent, _RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetMapPtr, NIL)
  }

  /**
   * Returns the navigation map [RID] the requested [agent] is currently assigned to.
   */
  public fun agentGetMap(agent: RID): RID {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(rawPtr, MethodBindings.agentGetMapPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * If [paused] is true the specified [agent] will not be processed, e.g. calculate avoidance
   * velocities or receive avoidance callbacks.
   */
  public fun agentSetPaused(agent: RID, paused: Boolean): Unit {
    TransferContext.writeArguments(_RID to agent, BOOL to paused)
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetPausedPtr, NIL)
  }

  /**
   * Returns `true` if the specified [agent] is paused.
   */
  public fun agentGetPaused(agent: RID): Boolean {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(rawPtr, MethodBindings.agentGetPausedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the maximum distance to other agents this agent takes into account in the navigation. The
   * larger this number, the longer the running time of the simulation. If the number is too low, the
   * simulation will not be safe.
   */
  public fun agentSetNeighborDistance(agent: RID, distance: Float): Unit {
    TransferContext.writeArguments(_RID to agent, DOUBLE to distance.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetNeighborDistancePtr, NIL)
  }

  /**
   * Sets the maximum number of other agents the agent takes into account in the navigation. The
   * larger this number, the longer the running time of the simulation. If the number is too low, the
   * simulation will not be safe.
   */
  public fun agentSetMaxNeighbors(agent: RID, count: Int): Unit {
    TransferContext.writeArguments(_RID to agent, LONG to count.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetMaxNeighborsPtr, NIL)
  }

  /**
   * The minimal amount of time for which the agent's velocities that are computed by the simulation
   * are safe with respect to other agents. The larger this number, the sooner this agent will respond
   * to the presence of other agents, but the less freedom this agent has in choosing its velocities. A
   * too high value will slow down agents movement considerably. Must be positive.
   */
  public fun agentSetTimeHorizonAgents(agent: RID, timeHorizon: Float): Unit {
    TransferContext.writeArguments(_RID to agent, DOUBLE to timeHorizon.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetTimeHorizonAgentsPtr, NIL)
  }

  /**
   * The minimal amount of time for which the agent's velocities that are computed by the simulation
   * are safe with respect to static avoidance obstacles. The larger this number, the sooner this agent
   * will respond to the presence of static avoidance obstacles, but the less freedom this agent has in
   * choosing its velocities. A too high value will slow down agents movement considerably. Must be
   * positive.
   */
  public fun agentSetTimeHorizonObstacles(agent: RID, timeHorizon: Float): Unit {
    TransferContext.writeArguments(_RID to agent, DOUBLE to timeHorizon.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetTimeHorizonObstaclesPtr, NIL)
  }

  /**
   * Sets the radius of the agent.
   */
  public fun agentSetRadius(agent: RID, radius: Float): Unit {
    TransferContext.writeArguments(_RID to agent, DOUBLE to radius.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetRadiusPtr, NIL)
  }

  /**
   * Updates the provided [agent] [height].
   */
  public fun agentSetHeight(agent: RID, height: Float): Unit {
    TransferContext.writeArguments(_RID to agent, DOUBLE to height.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetHeightPtr, NIL)
  }

  /**
   * Sets the maximum speed of the agent. Must be positive.
   */
  public fun agentSetMaxSpeed(agent: RID, maxSpeed: Float): Unit {
    TransferContext.writeArguments(_RID to agent, DOUBLE to maxSpeed.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetMaxSpeedPtr, NIL)
  }

  /**
   * Replaces the internal velocity in the collision avoidance simulation with [velocity] for the
   * specified [agent]. When an agent is teleported to a new position this function should be used in
   * the same frame. If called frequently this function can get agents stuck.
   */
  public fun agentSetVelocityForced(agent: RID, velocity: Vector3): Unit {
    TransferContext.writeArguments(_RID to agent, VECTOR3 to velocity)
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetVelocityForcedPtr, NIL)
  }

  /**
   * Sets [velocity] as the new wanted velocity for the specified [agent]. The avoidance simulation
   * will try to fulfill this velocity if possible but will modify it to avoid collision with other
   * agent's and obstacles. When an agent is teleported to a new position use [agentSetVelocityForced]
   * as well to reset the internal simulation velocity.
   */
  public fun agentSetVelocity(agent: RID, velocity: Vector3): Unit {
    TransferContext.writeArguments(_RID to agent, VECTOR3 to velocity)
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetVelocityPtr, NIL)
  }

  /**
   * Sets the position of the agent in world space.
   */
  public fun agentSetPosition(agent: RID, position: Vector3): Unit {
    TransferContext.writeArguments(_RID to agent, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetPositionPtr, NIL)
  }

  /**
   * Returns true if the map got changed the previous frame.
   */
  public fun agentIsMapChanged(agent: RID): Boolean {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(rawPtr, MethodBindings.agentIsMapChangedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the callback [Callable] that gets called after each avoidance processing step for the
   * [agent]. The calculated `safe_velocity` will be dispatched with a signal to the object just before
   * the physics calculations.
   * **Note:** Created callbacks are always processed independently of the SceneTree state as long
   * as the agent is on a navigation map and not freed. To disable the dispatch of a callback from an
   * agent use [agentSetAvoidanceCallback] again with an empty [Callable].
   */
  public fun agentSetAvoidanceCallback(agent: RID, callback: Callable): Unit {
    TransferContext.writeArguments(_RID to agent, CALLABLE to callback)
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetAvoidanceCallbackPtr, NIL)
  }

  /**
   * Set the agent's `avoidance_layers` bitmask.
   */
  public fun agentSetAvoidanceLayers(agent: RID, layers: Long): Unit {
    TransferContext.writeArguments(_RID to agent, LONG to layers)
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetAvoidanceLayersPtr, NIL)
  }

  /**
   * Set the agent's `avoidance_mask` bitmask.
   */
  public fun agentSetAvoidanceMask(agent: RID, mask: Long): Unit {
    TransferContext.writeArguments(_RID to agent, LONG to mask)
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetAvoidanceMaskPtr, NIL)
  }

  /**
   * Set the agent's `avoidance_priority` with a [priority] between 0.0 (lowest priority) to 1.0
   * (highest priority).
   * The specified [agent] does not adjust the velocity for other agents that would match the
   * `avoidance_mask` but have a lower ` avoidance_priority`. This in turn makes the other agents with
   * lower priority adjust their velocities even more to avoid collision with this agent.
   */
  public fun agentSetAvoidancePriority(agent: RID, priority: Float): Unit {
    TransferContext.writeArguments(_RID to agent, DOUBLE to priority.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.agentSetAvoidancePriorityPtr, NIL)
  }

  /**
   * Creates a new obstacle.
   */
  public fun obstacleCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleCreatePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * If [enabled] is `true`, the provided [obstacle] affects avoidance using agents.
   */
  public fun obstacleSetAvoidanceEnabled(obstacle: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to obstacle, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleSetAvoidanceEnabledPtr, NIL)
  }

  /**
   * Returns `true` if the provided [obstacle] has avoidance enabled.
   */
  public fun obstacleGetAvoidanceEnabled(obstacle: RID): Boolean {
    TransferContext.writeArguments(_RID to obstacle)
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleGetAvoidanceEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets if the [obstacle] uses the 2D avoidance or the 3D avoidance while avoidance is enabled.
   */
  public fun obstacleSetUse3dAvoidance(obstacle: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to obstacle, BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleSetUse3dAvoidancePtr, NIL)
  }

  /**
   * Returns `true` if the provided [obstacle] uses avoidance in 3D space Vector3(x,y,z) instead of
   * horizontal 2D Vector2(x,y) / Vector3(x,0.0,z).
   */
  public fun obstacleGetUse3dAvoidance(obstacle: RID): Boolean {
    TransferContext.writeArguments(_RID to obstacle)
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleGetUse3dAvoidancePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Assigns the [obstacle] to a navigation map.
   */
  public fun obstacleSetMap(obstacle: RID, map: RID): Unit {
    TransferContext.writeArguments(_RID to obstacle, _RID to map)
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleSetMapPtr, NIL)
  }

  /**
   * Returns the navigation map [RID] the requested [obstacle] is currently assigned to.
   */
  public fun obstacleGetMap(obstacle: RID): RID {
    TransferContext.writeArguments(_RID to obstacle)
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleGetMapPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * If [paused] is true the specified [obstacle] will not be processed, e.g. affect avoidance
   * velocities.
   */
  public fun obstacleSetPaused(obstacle: RID, paused: Boolean): Unit {
    TransferContext.writeArguments(_RID to obstacle, BOOL to paused)
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleSetPausedPtr, NIL)
  }

  /**
   * Returns `true` if the specified [obstacle] is paused.
   */
  public fun obstacleGetPaused(obstacle: RID): Boolean {
    TransferContext.writeArguments(_RID to obstacle)
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleGetPausedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the radius of the dynamic obstacle.
   */
  public fun obstacleSetRadius(obstacle: RID, radius: Float): Unit {
    TransferContext.writeArguments(_RID to obstacle, DOUBLE to radius.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleSetRadiusPtr, NIL)
  }

  /**
   * Sets the [height] for the [obstacle]. In 3D agents will ignore obstacles that are above or
   * below them while using 2D avoidance.
   */
  public fun obstacleSetHeight(obstacle: RID, height: Float): Unit {
    TransferContext.writeArguments(_RID to obstacle, DOUBLE to height.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleSetHeightPtr, NIL)
  }

  /**
   * Sets [velocity] of the dynamic [obstacle]. Allows other agents to better predict the movement
   * of the dynamic obstacle. Only works in combination with the radius of the obstacle.
   */
  public fun obstacleSetVelocity(obstacle: RID, velocity: Vector3): Unit {
    TransferContext.writeArguments(_RID to obstacle, VECTOR3 to velocity)
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleSetVelocityPtr, NIL)
  }

  /**
   * Updates the [position] in world space for the [obstacle].
   */
  public fun obstacleSetPosition(obstacle: RID, position: Vector3): Unit {
    TransferContext.writeArguments(_RID to obstacle, VECTOR3 to position)
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleSetPositionPtr, NIL)
  }

  /**
   * Sets the outline vertices for the obstacle. If the vertices are winded in clockwise order
   * agents will be pushed in by the obstacle, else they will be pushed out.
   */
  public fun obstacleSetVertices(obstacle: RID, vertices: PackedVector3Array): Unit {
    TransferContext.writeArguments(_RID to obstacle, PACKED_VECTOR3_ARRAY to vertices)
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleSetVerticesPtr, NIL)
  }

  /**
   * Set the obstacles's `avoidance_layers` bitmask.
   */
  public fun obstacleSetAvoidanceLayers(obstacle: RID, layers: Long): Unit {
    TransferContext.writeArguments(_RID to obstacle, LONG to layers)
    TransferContext.callMethod(rawPtr, MethodBindings.obstacleSetAvoidanceLayersPtr, NIL)
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
  public fun parseSourceGeometryData(
    navigationMesh: NavigationMesh,
    sourceGeometryData: NavigationMeshSourceGeometryData3D,
    rootNode: Node,
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
  public fun bakeFromSourceGeometryData(
    navigationMesh: NavigationMesh,
    sourceGeometryData: NavigationMeshSourceGeometryData3D,
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
  public fun bakeFromSourceGeometryDataAsync(
    navigationMesh: NavigationMesh,
    sourceGeometryData: NavigationMeshSourceGeometryData3D,
    callback: Callable = Callable(),
  ): Unit {
    TransferContext.writeArguments(OBJECT to navigationMesh, OBJECT to sourceGeometryData, CALLABLE to callback)
    TransferContext.callMethod(rawPtr, MethodBindings.bakeFromSourceGeometryDataAsyncPtr, NIL)
  }

  /**
   * Destroys the given RID.
   */
  public fun freeRid(rid: RID): Unit {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, MethodBindings.freeRidPtr, NIL)
  }

  /**
   * Control activation of this server.
   */
  public fun setActive(active: Boolean): Unit {
    TransferContext.writeArguments(BOOL to active)
    TransferContext.callMethod(rawPtr, MethodBindings.setActivePtr, NIL)
  }

  /**
   * If `true` enables debug mode on the NavigationServer.
   */
  public fun setDebugEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setDebugEnabledPtr, NIL)
  }

  /**
   * Returns `true` when the NavigationServer has debug enabled.
   */
  public fun getDebugEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDebugEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns information about the current state of the NavigationServer. See [ProcessInfo] for a
   * list of available states.
   */
  public fun getProcessInfo(processInfo: ProcessInfo): Int {
    TransferContext.writeArguments(LONG to processInfo.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getProcessInfoPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  internal object MethodBindings {
    public val getMapsPtr: VoidPtr = TypeManager.getMethodBindPtr("NavigationServer3D", "get_maps")

    public val mapCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_create")

    public val mapSetActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_set_active")

    public val mapIsActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_is_active")

    public val mapSetUpPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_set_up")

    public val mapGetUpPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_up")

    public val mapSetCellSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_set_cell_size")

    public val mapGetCellSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_cell_size")

    public val mapSetCellHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_set_cell_height")

    public val mapGetCellHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_cell_height")

    public val mapSetUseEdgeConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_set_use_edge_connections")

    public val mapGetUseEdgeConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_use_edge_connections")

    public val mapSetEdgeConnectionMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_set_edge_connection_margin")

    public val mapGetEdgeConnectionMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_edge_connection_margin")

    public val mapSetLinkConnectionRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_set_link_connection_radius")

    public val mapGetLinkConnectionRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_link_connection_radius")

    public val mapGetPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_path")

    public val mapGetClosestPointToSegmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_closest_point_to_segment")

    public val mapGetClosestPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_closest_point")

    public val mapGetClosestPointNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_closest_point_normal")

    public val mapGetClosestPointOwnerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_closest_point_owner")

    public val mapGetLinksPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_links")

    public val mapGetRegionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_regions")

    public val mapGetAgentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_agents")

    public val mapGetObstaclesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_get_obstacles")

    public val mapForceUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "map_force_update")

    public val queryPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "query_path")

    public val regionCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_create")

    public val regionSetEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_set_enabled")

    public val regionGetEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_enabled")

    public val regionSetUseEdgeConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_set_use_edge_connections")

    public val regionGetUseEdgeConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_use_edge_connections")

    public val regionSetEnterCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_set_enter_cost")

    public val regionGetEnterCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_enter_cost")

    public val regionSetTravelCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_set_travel_cost")

    public val regionGetTravelCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_travel_cost")

    public val regionSetOwnerIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_set_owner_id")

    public val regionGetOwnerIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_owner_id")

    public val regionOwnsPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_owns_point")

    public val regionSetMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_set_map")

    public val regionGetMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_map")

    public val regionSetNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_set_navigation_layers")

    public val regionGetNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_navigation_layers")

    public val regionSetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_set_transform")

    public val regionSetNavigationMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_set_navigation_mesh")

    public val regionBakeNavigationMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_bake_navigation_mesh")

    public val regionGetConnectionsCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_connections_count")

    public val regionGetConnectionPathwayStartPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_connection_pathway_start")

    public val regionGetConnectionPathwayEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "region_get_connection_pathway_end")

    public val linkCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_create")

    public val linkSetMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_set_map")

    public val linkGetMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_get_map")

    public val linkSetEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_set_enabled")

    public val linkGetEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_get_enabled")

    public val linkSetBidirectionalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_set_bidirectional")

    public val linkIsBidirectionalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_is_bidirectional")

    public val linkSetNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_set_navigation_layers")

    public val linkGetNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_get_navigation_layers")

    public val linkSetStartPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_set_start_position")

    public val linkGetStartPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_get_start_position")

    public val linkSetEndPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_set_end_position")

    public val linkGetEndPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_get_end_position")

    public val linkSetEnterCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_set_enter_cost")

    public val linkGetEnterCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_get_enter_cost")

    public val linkSetTravelCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_set_travel_cost")

    public val linkGetTravelCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_get_travel_cost")

    public val linkSetOwnerIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_set_owner_id")

    public val linkGetOwnerIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "link_get_owner_id")

    public val agentCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_create")

    public val agentSetAvoidanceEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_avoidance_enabled")

    public val agentGetAvoidanceEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_get_avoidance_enabled")

    public val agentSetUse3dAvoidancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_use_3d_avoidance")

    public val agentGetUse3dAvoidancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_get_use_3d_avoidance")

    public val agentSetMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_map")

    public val agentGetMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_get_map")

    public val agentSetPausedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_paused")

    public val agentGetPausedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_get_paused")

    public val agentSetNeighborDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_neighbor_distance")

    public val agentSetMaxNeighborsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_max_neighbors")

    public val agentSetTimeHorizonAgentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_time_horizon_agents")

    public val agentSetTimeHorizonObstaclesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_time_horizon_obstacles")

    public val agentSetRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_radius")

    public val agentSetHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_height")

    public val agentSetMaxSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_max_speed")

    public val agentSetVelocityForcedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_velocity_forced")

    public val agentSetVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_velocity")

    public val agentSetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_position")

    public val agentIsMapChangedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_is_map_changed")

    public val agentSetAvoidanceCallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_avoidance_callback")

    public val agentSetAvoidanceLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_avoidance_layers")

    public val agentSetAvoidanceMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_avoidance_mask")

    public val agentSetAvoidancePriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "agent_set_avoidance_priority")

    public val obstacleCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_create")

    public val obstacleSetAvoidanceEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_set_avoidance_enabled")

    public val obstacleGetAvoidanceEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_get_avoidance_enabled")

    public val obstacleSetUse3dAvoidancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_set_use_3d_avoidance")

    public val obstacleGetUse3dAvoidancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_get_use_3d_avoidance")

    public val obstacleSetMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_set_map")

    public val obstacleGetMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_get_map")

    public val obstacleSetPausedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_set_paused")

    public val obstacleGetPausedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_get_paused")

    public val obstacleSetRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_set_radius")

    public val obstacleSetHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_set_height")

    public val obstacleSetVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_set_velocity")

    public val obstacleSetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_set_position")

    public val obstacleSetVerticesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_set_vertices")

    public val obstacleSetAvoidanceLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "obstacle_set_avoidance_layers")

    public val parseSourceGeometryDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "parse_source_geometry_data")

    public val bakeFromSourceGeometryDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "bake_from_source_geometry_data")

    public val bakeFromSourceGeometryDataAsyncPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "bake_from_source_geometry_data_async")

    public val freeRidPtr: VoidPtr = TypeManager.getMethodBindPtr("NavigationServer3D", "free_rid")

    public val setActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "set_active")

    public val setDebugEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "set_debug_enabled")

    public val getDebugEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "get_debug_enabled")

    public val getProcessInfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationServer3D", "get_process_info")
  }
}
