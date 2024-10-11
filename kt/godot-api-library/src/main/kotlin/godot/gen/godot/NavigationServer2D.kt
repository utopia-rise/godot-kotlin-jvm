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
import godot.core.Signal0
import godot.core.Signal1
import godot.core.Transform2D
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.CALLABLE
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_VECTOR2_ARRAY
import godot.core.VariantParser.TRANSFORM2D
import godot.core.VariantParser.VECTOR2
import godot.core.VariantParser._RID
import godot.core.Vector2
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

private const val ENGINE_CLASS_NAVIGATIONSERVER2D_INDEX: Int = 32

/**
 * NavigationServer2D is the server that handles navigation maps, regions and agents. It does not
 * handle A* navigation from [AStar2D] or [AStarGrid2D].
 * Maps are divided into regions, which are composed of navigation polygons. Together, they define
 * the traversable areas in the 2D world.
 * **Note:** Most [NavigationServer2D] changes take effect after the next physics frame and not
 * immediately. This includes all changes made to maps, regions or agents by navigation-related nodes
 * in the scene tree or made through scripts.
 * For two regions to be connected to each other, they must share a similar edge. An edge is
 * considered connected to another if both of its two vertices are at a distance less than
 * `edge_connection_margin` to the respective other edge's vertex.
 * You may assign navigation layers to regions with [NavigationServer2D.regionSetNavigationLayers],
 * which then can be checked upon when requesting a path with [NavigationServer2D.mapGetPath]. This can
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
public object NavigationServer2D : Object() {
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

  public override fun new(scriptIndex: Int): Unit {
    Internals.getSingleton(this, ENGINE_CLASS_NAVIGATIONSERVER2D_INDEX)
  }

  /**
   * Returns all created navigation map [RID]s on the NavigationServer. This returns both 2D and 3D
   * created navigation maps as there is technically no distinction between them.
   */
  @JvmStatic
  public final fun getMaps(): VariantArray<RID> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMapsPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<RID>)
  }

  /**
   * Create a new map.
   */
  @JvmStatic
  public final fun mapCreate(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.mapCreatePtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  /**
   * Sets the map active.
   */
  @JvmStatic
  public final fun mapSetActive(map: RID, active: Boolean): Unit {
    Internals.writeArguments(_RID to map, BOOL to active)
    Internals.callMethod(rawPtr, MethodBindings.mapSetActivePtr, NIL)
  }

  /**
   * Returns true if the map is active.
   */
  @JvmStatic
  public final fun mapIsActive(map: RID): Boolean {
    Internals.writeArguments(_RID to map)
    Internals.callMethod(rawPtr, MethodBindings.mapIsActivePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the map cell size used to rasterize the navigation mesh vertices. Must match with the cell
   * size of the used navigation meshes.
   */
  @JvmStatic
  public final fun mapSetCellSize(map: RID, cellSize: Float): Unit {
    Internals.writeArguments(_RID to map, DOUBLE to cellSize.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.mapSetCellSizePtr, NIL)
  }

  /**
   * Returns the map cell size used to rasterize the navigation mesh vertices.
   */
  @JvmStatic
  public final fun mapGetCellSize(map: RID): Float {
    Internals.writeArguments(_RID to map)
    Internals.callMethod(rawPtr, MethodBindings.mapGetCellSizePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Set the navigation [map] edge connection use. If [enabled] is `true`, the navigation map allows
   * navigation regions to use edge connections to connect with other navigation regions within
   * proximity of the navigation map edge connection margin.
   */
  @JvmStatic
  public final fun mapSetUseEdgeConnections(map: RID, enabled: Boolean): Unit {
    Internals.writeArguments(_RID to map, BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.mapSetUseEdgeConnectionsPtr, NIL)
  }

  /**
   * Returns whether the navigation [map] allows navigation regions to use edge connections to
   * connect with other navigation regions within proximity of the navigation map edge connection
   * margin.
   */
  @JvmStatic
  public final fun mapGetUseEdgeConnections(map: RID): Boolean {
    Internals.writeArguments(_RID to map)
    Internals.callMethod(rawPtr, MethodBindings.mapGetUseEdgeConnectionsPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Set the map edge connection margin used to weld the compatible region edges.
   */
  @JvmStatic
  public final fun mapSetEdgeConnectionMargin(map: RID, margin: Float): Unit {
    Internals.writeArguments(_RID to map, DOUBLE to margin.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.mapSetEdgeConnectionMarginPtr, NIL)
  }

  /**
   * Returns the edge connection margin of the map. The edge connection margin is a distance used to
   * connect two regions.
   */
  @JvmStatic
  public final fun mapGetEdgeConnectionMargin(map: RID): Float {
    Internals.writeArguments(_RID to map)
    Internals.callMethod(rawPtr, MethodBindings.mapGetEdgeConnectionMarginPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Set the map's link connection radius used to connect links to navigation polygons.
   */
  @JvmStatic
  public final fun mapSetLinkConnectionRadius(map: RID, radius: Float): Unit {
    Internals.writeArguments(_RID to map, DOUBLE to radius.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.mapSetLinkConnectionRadiusPtr, NIL)
  }

  /**
   * Returns the link connection radius of the map. This distance is the maximum range any link will
   * search for navigation mesh polygons to connect to.
   */
  @JvmStatic
  public final fun mapGetLinkConnectionRadius(map: RID): Float {
    Internals.writeArguments(_RID to map)
    Internals.callMethod(rawPtr, MethodBindings.mapGetLinkConnectionRadiusPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the navigation path to reach the destination from the origin. [navigationLayers] is a
   * bitmask of all region navigation layers that are allowed to be in the path.
   */
  @JvmOverloads
  @JvmStatic
  public final fun mapGetPath(
    map: RID,
    origin: Vector2,
    destination: Vector2,
    optimize: Boolean,
    navigationLayers: Long = 1,
  ): PackedVector2Array {
    Internals.writeArguments(_RID to map, VECTOR2 to origin, VECTOR2 to destination, BOOL to optimize, LONG to navigationLayers)
    Internals.callMethod(rawPtr, MethodBindings.mapGetPathPtr, PACKED_VECTOR2_ARRAY)
    return (Internals.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
  }

  /**
   * Returns the point closest to the provided [toPoint] on the navigation mesh surface.
   */
  @JvmStatic
  public final fun mapGetClosestPoint(map: RID, toPoint: Vector2): Vector2 {
    Internals.writeArguments(_RID to map, VECTOR2 to toPoint)
    Internals.callMethod(rawPtr, MethodBindings.mapGetClosestPointPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns the owner region RID for the point returned by [mapGetClosestPoint].
   */
  @JvmStatic
  public final fun mapGetClosestPointOwner(map: RID, toPoint: Vector2): RID {
    Internals.writeArguments(_RID to map, VECTOR2 to toPoint)
    Internals.callMethod(rawPtr, MethodBindings.mapGetClosestPointOwnerPtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  /**
   * Returns all navigation link [RID]s that are currently assigned to the requested navigation
   * [map].
   */
  @JvmStatic
  public final fun mapGetLinks(map: RID): VariantArray<RID> {
    Internals.writeArguments(_RID to map)
    Internals.callMethod(rawPtr, MethodBindings.mapGetLinksPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<RID>)
  }

  /**
   * Returns all navigation regions [RID]s that are currently assigned to the requested navigation
   * [map].
   */
  @JvmStatic
  public final fun mapGetRegions(map: RID): VariantArray<RID> {
    Internals.writeArguments(_RID to map)
    Internals.callMethod(rawPtr, MethodBindings.mapGetRegionsPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<RID>)
  }

  /**
   * Returns all navigation agents [RID]s that are currently assigned to the requested navigation
   * [map].
   */
  @JvmStatic
  public final fun mapGetAgents(map: RID): VariantArray<RID> {
    Internals.writeArguments(_RID to map)
    Internals.callMethod(rawPtr, MethodBindings.mapGetAgentsPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<RID>)
  }

  /**
   * Returns all navigation obstacle [RID]s that are currently assigned to the requested navigation
   * [map].
   */
  @JvmStatic
  public final fun mapGetObstacles(map: RID): VariantArray<RID> {
    Internals.writeArguments(_RID to map)
    Internals.callMethod(rawPtr, MethodBindings.mapGetObstaclesPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<RID>)
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
  @JvmStatic
  public final fun mapForceUpdate(map: RID): Unit {
    Internals.writeArguments(_RID to map)
    Internals.callMethod(rawPtr, MethodBindings.mapForceUpdatePtr, NIL)
  }

  /**
   * Returns the current iteration id of the navigation map. Every time the navigation map changes
   * and synchronizes the iteration id increases. An iteration id of 0 means the navigation map has
   * never synchronized.
   * **Note:** The iteration id will wrap back to 1 after reaching its range limit.
   */
  @JvmStatic
  public final fun mapGetIterationId(map: RID): Long {
    Internals.writeArguments(_RID to map)
    Internals.callMethod(rawPtr, MethodBindings.mapGetIterationIdPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns a random position picked from all map region polygons with matching [navigationLayers].
   * If [uniformly] is `true`, all map regions, polygons, and faces are weighted by their surface
   * area (slower).
   * If [uniformly] is `false`, just a random region and a random polygon are picked (faster).
   */
  @JvmStatic
  public final fun mapGetRandomPoint(
    map: RID,
    navigationLayers: Long,
    uniformly: Boolean,
  ): Vector2 {
    Internals.writeArguments(_RID to map, LONG to navigationLayers, BOOL to uniformly)
    Internals.callMethod(rawPtr, MethodBindings.mapGetRandomPointPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Queries a path in a given navigation map. Start and target position and other parameters are
   * defined through [NavigationPathQueryParameters2D]. Updates the provided
   * [NavigationPathQueryResult2D] result object with the path among other results requested by the
   * query.
   */
  @JvmStatic
  public final fun queryPath(parameters: NavigationPathQueryParameters2D?,
      result: NavigationPathQueryResult2D?): Unit {
    Internals.writeArguments(OBJECT to parameters, OBJECT to result)
    Internals.callMethod(rawPtr, MethodBindings.queryPathPtr, NIL)
  }

  /**
   * Creates a new region.
   */
  @JvmStatic
  public final fun regionCreate(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.regionCreatePtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  /**
   * If [enabled] is `true` the specified [region] will contribute to its current navigation map.
   */
  @JvmStatic
  public final fun regionSetEnabled(region: RID, enabled: Boolean): Unit {
    Internals.writeArguments(_RID to region, BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.regionSetEnabledPtr, NIL)
  }

  /**
   * Returns `true` if the specified [region] is enabled.
   */
  @JvmStatic
  public final fun regionGetEnabled(region: RID): Boolean {
    Internals.writeArguments(_RID to region)
    Internals.callMethod(rawPtr, MethodBindings.regionGetEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If [enabled] is `true`, the navigation [region] will use edge connections to connect with other
   * navigation regions within proximity of the navigation map edge connection margin.
   */
  @JvmStatic
  public final fun regionSetUseEdgeConnections(region: RID, enabled: Boolean): Unit {
    Internals.writeArguments(_RID to region, BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.regionSetUseEdgeConnectionsPtr, NIL)
  }

  /**
   * Returns whether the navigation [region] is set to use edge connections to connect with other
   * navigation regions within proximity of the navigation map edge connection margin.
   */
  @JvmStatic
  public final fun regionGetUseEdgeConnections(region: RID): Boolean {
    Internals.writeArguments(_RID to region)
    Internals.callMethod(rawPtr, MethodBindings.regionGetUseEdgeConnectionsPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the [enterCost] for this [region].
   */
  @JvmStatic
  public final fun regionSetEnterCost(region: RID, enterCost: Float): Unit {
    Internals.writeArguments(_RID to region, DOUBLE to enterCost.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.regionSetEnterCostPtr, NIL)
  }

  /**
   * Returns the enter cost of this [region].
   */
  @JvmStatic
  public final fun regionGetEnterCost(region: RID): Float {
    Internals.writeArguments(_RID to region)
    Internals.callMethod(rawPtr, MethodBindings.regionGetEnterCostPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the [travelCost] for this [region].
   */
  @JvmStatic
  public final fun regionSetTravelCost(region: RID, travelCost: Float): Unit {
    Internals.writeArguments(_RID to region, DOUBLE to travelCost.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.regionSetTravelCostPtr, NIL)
  }

  /**
   * Returns the travel cost of this [region].
   */
  @JvmStatic
  public final fun regionGetTravelCost(region: RID): Float {
    Internals.writeArguments(_RID to region)
    Internals.callMethod(rawPtr, MethodBindings.regionGetTravelCostPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Set the `ObjectID` of the object which manages this region.
   */
  @JvmStatic
  public final fun regionSetOwnerId(region: RID, ownerId: Long): Unit {
    Internals.writeArguments(_RID to region, LONG to ownerId)
    Internals.callMethod(rawPtr, MethodBindings.regionSetOwnerIdPtr, NIL)
  }

  /**
   * Returns the `ObjectID` of the object which manages this region.
   */
  @JvmStatic
  public final fun regionGetOwnerId(region: RID): Long {
    Internals.writeArguments(_RID to region)
    Internals.callMethod(rawPtr, MethodBindings.regionGetOwnerIdPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
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
  @JvmStatic
  public final fun regionOwnsPoint(region: RID, point: Vector2): Boolean {
    Internals.writeArguments(_RID to region, VECTOR2 to point)
    Internals.callMethod(rawPtr, MethodBindings.regionOwnsPointPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the map for the region.
   */
  @JvmStatic
  public final fun regionSetMap(region: RID, map: RID): Unit {
    Internals.writeArguments(_RID to region, _RID to map)
    Internals.callMethod(rawPtr, MethodBindings.regionSetMapPtr, NIL)
  }

  /**
   * Returns the navigation map [RID] the requested [region] is currently assigned to.
   */
  @JvmStatic
  public final fun regionGetMap(region: RID): RID {
    Internals.writeArguments(_RID to region)
    Internals.callMethod(rawPtr, MethodBindings.regionGetMapPtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  /**
   * Set the region's navigation layers. This allows selecting regions from a path request (when
   * using [NavigationServer2D.mapGetPath]).
   */
  @JvmStatic
  public final fun regionSetNavigationLayers(region: RID, navigationLayers: Long): Unit {
    Internals.writeArguments(_RID to region, LONG to navigationLayers)
    Internals.callMethod(rawPtr, MethodBindings.regionSetNavigationLayersPtr, NIL)
  }

  /**
   * Returns the region's navigation layers.
   */
  @JvmStatic
  public final fun regionGetNavigationLayers(region: RID): Long {
    Internals.writeArguments(_RID to region)
    Internals.callMethod(rawPtr, MethodBindings.regionGetNavigationLayersPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the global transformation for the region.
   */
  @JvmStatic
  public final fun regionSetTransform(region: RID, transform: Transform2D): Unit {
    Internals.writeArguments(_RID to region, TRANSFORM2D to transform)
    Internals.callMethod(rawPtr, MethodBindings.regionSetTransformPtr, NIL)
  }

  /**
   * Returns the global transformation of this [region].
   */
  @JvmStatic
  public final fun regionGetTransform(region: RID): Transform2D {
    Internals.writeArguments(_RID to region)
    Internals.callMethod(rawPtr, MethodBindings.regionGetTransformPtr, TRANSFORM2D)
    return (Internals.readReturnValue(TRANSFORM2D) as Transform2D)
  }

  /**
   * Sets the [navigationPolygon] for the region.
   */
  @JvmStatic
  public final fun regionSetNavigationPolygon(region: RID, navigationPolygon: NavigationPolygon?):
      Unit {
    Internals.writeArguments(_RID to region, OBJECT to navigationPolygon)
    Internals.callMethod(rawPtr, MethodBindings.regionSetNavigationPolygonPtr, NIL)
  }

  /**
   * Returns how many connections this [region] has with other regions in the map.
   */
  @JvmStatic
  public final fun regionGetConnectionsCount(region: RID): Int {
    Internals.writeArguments(_RID to region)
    Internals.callMethod(rawPtr, MethodBindings.regionGetConnectionsCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the starting point of a connection door. [connection] is an index between 0 and the
   * return value of [regionGetConnectionsCount].
   */
  @JvmStatic
  public final fun regionGetConnectionPathwayStart(region: RID, connection: Int): Vector2 {
    Internals.writeArguments(_RID to region, LONG to connection.toLong())
    Internals.callMethod(rawPtr, MethodBindings.regionGetConnectionPathwayStartPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns the ending point of a connection door. [connection] is an index between 0 and the
   * return value of [regionGetConnectionsCount].
   */
  @JvmStatic
  public final fun regionGetConnectionPathwayEnd(region: RID, connection: Int): Vector2 {
    Internals.writeArguments(_RID to region, LONG to connection.toLong())
    Internals.callMethod(rawPtr, MethodBindings.regionGetConnectionPathwayEndPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns a random position picked from all region polygons with matching [navigationLayers].
   * If [uniformly] is `true`, all region polygons and faces are weighted by their surface area
   * (slower).
   * If [uniformly] is `false`, just a random polygon and face is picked (faster).
   */
  @JvmStatic
  public final fun regionGetRandomPoint(
    region: RID,
    navigationLayers: Long,
    uniformly: Boolean,
  ): Vector2 {
    Internals.writeArguments(_RID to region, LONG to navigationLayers, BOOL to uniformly)
    Internals.callMethod(rawPtr, MethodBindings.regionGetRandomPointPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Create a new link between two positions on a map.
   */
  @JvmStatic
  public final fun linkCreate(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.linkCreatePtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  /**
   * Sets the navigation map [RID] for the link.
   */
  @JvmStatic
  public final fun linkSetMap(link: RID, map: RID): Unit {
    Internals.writeArguments(_RID to link, _RID to map)
    Internals.callMethod(rawPtr, MethodBindings.linkSetMapPtr, NIL)
  }

  /**
   * Returns the navigation map [RID] the requested [link] is currently assigned to.
   */
  @JvmStatic
  public final fun linkGetMap(link: RID): RID {
    Internals.writeArguments(_RID to link)
    Internals.callMethod(rawPtr, MethodBindings.linkGetMapPtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  /**
   * If [enabled] is `true`, the specified [link] will contribute to its current navigation map.
   */
  @JvmStatic
  public final fun linkSetEnabled(link: RID, enabled: Boolean): Unit {
    Internals.writeArguments(_RID to link, BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.linkSetEnabledPtr, NIL)
  }

  /**
   * Returns `true` if the specified [link] is enabled.
   */
  @JvmStatic
  public final fun linkGetEnabled(link: RID): Boolean {
    Internals.writeArguments(_RID to link)
    Internals.callMethod(rawPtr, MethodBindings.linkGetEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets whether this [link] can be travelled in both directions.
   */
  @JvmStatic
  public final fun linkSetBidirectional(link: RID, bidirectional: Boolean): Unit {
    Internals.writeArguments(_RID to link, BOOL to bidirectional)
    Internals.callMethod(rawPtr, MethodBindings.linkSetBidirectionalPtr, NIL)
  }

  /**
   * Returns whether this [link] can be travelled in both directions.
   */
  @JvmStatic
  public final fun linkIsBidirectional(link: RID): Boolean {
    Internals.writeArguments(_RID to link)
    Internals.callMethod(rawPtr, MethodBindings.linkIsBidirectionalPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Set the links's navigation layers. This allows selecting links from a path request (when using
   * [NavigationServer2D.mapGetPath]).
   */
  @JvmStatic
  public final fun linkSetNavigationLayers(link: RID, navigationLayers: Long): Unit {
    Internals.writeArguments(_RID to link, LONG to navigationLayers)
    Internals.callMethod(rawPtr, MethodBindings.linkSetNavigationLayersPtr, NIL)
  }

  /**
   * Returns the navigation layers for this [link].
   */
  @JvmStatic
  public final fun linkGetNavigationLayers(link: RID): Long {
    Internals.writeArguments(_RID to link)
    Internals.callMethod(rawPtr, MethodBindings.linkGetNavigationLayersPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the entry position for this [link].
   */
  @JvmStatic
  public final fun linkSetStartPosition(link: RID, position: Vector2): Unit {
    Internals.writeArguments(_RID to link, VECTOR2 to position)
    Internals.callMethod(rawPtr, MethodBindings.linkSetStartPositionPtr, NIL)
  }

  /**
   * Returns the starting position of this [link].
   */
  @JvmStatic
  public final fun linkGetStartPosition(link: RID): Vector2 {
    Internals.writeArguments(_RID to link)
    Internals.callMethod(rawPtr, MethodBindings.linkGetStartPositionPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Sets the exit position for the [link].
   */
  @JvmStatic
  public final fun linkSetEndPosition(link: RID, position: Vector2): Unit {
    Internals.writeArguments(_RID to link, VECTOR2 to position)
    Internals.callMethod(rawPtr, MethodBindings.linkSetEndPositionPtr, NIL)
  }

  /**
   * Returns the ending position of this [link].
   */
  @JvmStatic
  public final fun linkGetEndPosition(link: RID): Vector2 {
    Internals.writeArguments(_RID to link)
    Internals.callMethod(rawPtr, MethodBindings.linkGetEndPositionPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Sets the [enterCost] for this [link].
   */
  @JvmStatic
  public final fun linkSetEnterCost(link: RID, enterCost: Float): Unit {
    Internals.writeArguments(_RID to link, DOUBLE to enterCost.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.linkSetEnterCostPtr, NIL)
  }

  /**
   * Returns the enter cost of this [link].
   */
  @JvmStatic
  public final fun linkGetEnterCost(link: RID): Float {
    Internals.writeArguments(_RID to link)
    Internals.callMethod(rawPtr, MethodBindings.linkGetEnterCostPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the [travelCost] for this [link].
   */
  @JvmStatic
  public final fun linkSetTravelCost(link: RID, travelCost: Float): Unit {
    Internals.writeArguments(_RID to link, DOUBLE to travelCost.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.linkSetTravelCostPtr, NIL)
  }

  /**
   * Returns the travel cost of this [link].
   */
  @JvmStatic
  public final fun linkGetTravelCost(link: RID): Float {
    Internals.writeArguments(_RID to link)
    Internals.callMethod(rawPtr, MethodBindings.linkGetTravelCostPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Set the `ObjectID` of the object which manages this link.
   */
  @JvmStatic
  public final fun linkSetOwnerId(link: RID, ownerId: Long): Unit {
    Internals.writeArguments(_RID to link, LONG to ownerId)
    Internals.callMethod(rawPtr, MethodBindings.linkSetOwnerIdPtr, NIL)
  }

  /**
   * Returns the `ObjectID` of the object which manages this link.
   */
  @JvmStatic
  public final fun linkGetOwnerId(link: RID): Long {
    Internals.writeArguments(_RID to link)
    Internals.callMethod(rawPtr, MethodBindings.linkGetOwnerIdPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Creates the agent.
   */
  @JvmStatic
  public final fun agentCreate(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.agentCreatePtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  /**
   * If [enabled] is `true`, the specified [agent] uses avoidance.
   */
  @JvmStatic
  public final fun agentSetAvoidanceEnabled(agent: RID, enabled: Boolean): Unit {
    Internals.writeArguments(_RID to agent, BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.agentSetAvoidanceEnabledPtr, NIL)
  }

  /**
   * Return `true` if the specified [agent] uses avoidance.
   */
  @JvmStatic
  public final fun agentGetAvoidanceEnabled(agent: RID): Boolean {
    Internals.writeArguments(_RID to agent)
    Internals.callMethod(rawPtr, MethodBindings.agentGetAvoidanceEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Puts the agent in the map.
   */
  @JvmStatic
  public final fun agentSetMap(agent: RID, map: RID): Unit {
    Internals.writeArguments(_RID to agent, _RID to map)
    Internals.callMethod(rawPtr, MethodBindings.agentSetMapPtr, NIL)
  }

  /**
   * Returns the navigation map [RID] the requested [agent] is currently assigned to.
   */
  @JvmStatic
  public final fun agentGetMap(agent: RID): RID {
    Internals.writeArguments(_RID to agent)
    Internals.callMethod(rawPtr, MethodBindings.agentGetMapPtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  /**
   * If [paused] is true the specified [agent] will not be processed, e.g. calculate avoidance
   * velocities or receive avoidance callbacks.
   */
  @JvmStatic
  public final fun agentSetPaused(agent: RID, paused: Boolean): Unit {
    Internals.writeArguments(_RID to agent, BOOL to paused)
    Internals.callMethod(rawPtr, MethodBindings.agentSetPausedPtr, NIL)
  }

  /**
   * Returns `true` if the specified [agent] is paused.
   */
  @JvmStatic
  public final fun agentGetPaused(agent: RID): Boolean {
    Internals.writeArguments(_RID to agent)
    Internals.callMethod(rawPtr, MethodBindings.agentGetPausedPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the maximum distance to other agents this agent takes into account in the navigation. The
   * larger this number, the longer the running time of the simulation. If the number is too low, the
   * simulation will not be safe.
   */
  @JvmStatic
  public final fun agentSetNeighborDistance(agent: RID, distance: Float): Unit {
    Internals.writeArguments(_RID to agent, DOUBLE to distance.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.agentSetNeighborDistancePtr, NIL)
  }

  /**
   * Returns the maximum distance to other agents the specified [agent] takes into account in the
   * navigation.
   */
  @JvmStatic
  public final fun agentGetNeighborDistance(agent: RID): Float {
    Internals.writeArguments(_RID to agent)
    Internals.callMethod(rawPtr, MethodBindings.agentGetNeighborDistancePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the maximum number of other agents the agent takes into account in the navigation. The
   * larger this number, the longer the running time of the simulation. If the number is too low, the
   * simulation will not be safe.
   */
  @JvmStatic
  public final fun agentSetMaxNeighbors(agent: RID, count: Int): Unit {
    Internals.writeArguments(_RID to agent, LONG to count.toLong())
    Internals.callMethod(rawPtr, MethodBindings.agentSetMaxNeighborsPtr, NIL)
  }

  /**
   * Returns the maximum number of other agents the specified [agent] takes into account in the
   * navigation.
   */
  @JvmStatic
  public final fun agentGetMaxNeighbors(agent: RID): Int {
    Internals.writeArguments(_RID to agent)
    Internals.callMethod(rawPtr, MethodBindings.agentGetMaxNeighborsPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * The minimal amount of time for which the agent's velocities that are computed by the simulation
   * are safe with respect to other agents. The larger this number, the sooner this agent will respond
   * to the presence of other agents, but the less freedom this agent has in choosing its velocities. A
   * too high value will slow down agents movement considerably. Must be positive.
   */
  @JvmStatic
  public final fun agentSetTimeHorizonAgents(agent: RID, timeHorizon: Float): Unit {
    Internals.writeArguments(_RID to agent, DOUBLE to timeHorizon.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.agentSetTimeHorizonAgentsPtr, NIL)
  }

  /**
   * Returns the minimal amount of time for which the specified [agent]'s velocities that are
   * computed by the simulation are safe with respect to other agents.
   */
  @JvmStatic
  public final fun agentGetTimeHorizonAgents(agent: RID): Float {
    Internals.writeArguments(_RID to agent)
    Internals.callMethod(rawPtr, MethodBindings.agentGetTimeHorizonAgentsPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
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
    Internals.writeArguments(_RID to agent, DOUBLE to timeHorizon.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.agentSetTimeHorizonObstaclesPtr, NIL)
  }

  /**
   * Returns the minimal amount of time for which the specified [agent]'s velocities that are
   * computed by the simulation are safe with respect to static avoidance obstacles.
   */
  @JvmStatic
  public final fun agentGetTimeHorizonObstacles(agent: RID): Float {
    Internals.writeArguments(_RID to agent)
    Internals.callMethod(rawPtr, MethodBindings.agentGetTimeHorizonObstaclesPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the radius of the agent.
   */
  @JvmStatic
  public final fun agentSetRadius(agent: RID, radius: Float): Unit {
    Internals.writeArguments(_RID to agent, DOUBLE to radius.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.agentSetRadiusPtr, NIL)
  }

  /**
   * Returns the radius of the specified [agent].
   */
  @JvmStatic
  public final fun agentGetRadius(agent: RID): Float {
    Internals.writeArguments(_RID to agent)
    Internals.callMethod(rawPtr, MethodBindings.agentGetRadiusPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets the maximum speed of the agent. Must be positive.
   */
  @JvmStatic
  public final fun agentSetMaxSpeed(agent: RID, maxSpeed: Float): Unit {
    Internals.writeArguments(_RID to agent, DOUBLE to maxSpeed.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.agentSetMaxSpeedPtr, NIL)
  }

  /**
   * Returns the maximum speed of the specified [agent].
   */
  @JvmStatic
  public final fun agentGetMaxSpeed(agent: RID): Float {
    Internals.writeArguments(_RID to agent)
    Internals.callMethod(rawPtr, MethodBindings.agentGetMaxSpeedPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Replaces the internal velocity in the collision avoidance simulation with [velocity] for the
   * specified [agent]. When an agent is teleported to a new position far away this function should be
   * used in the same frame. If called frequently this function can get agents stuck.
   */
  @JvmStatic
  public final fun agentSetVelocityForced(agent: RID, velocity: Vector2): Unit {
    Internals.writeArguments(_RID to agent, VECTOR2 to velocity)
    Internals.callMethod(rawPtr, MethodBindings.agentSetVelocityForcedPtr, NIL)
  }

  /**
   * Sets [velocity] as the new wanted velocity for the specified [agent]. The avoidance simulation
   * will try to fulfill this velocity if possible but will modify it to avoid collision with other
   * agent's and obstacles. When an agent is teleported to a new position far away use
   * [agentSetVelocityForced] instead to reset the internal velocity state.
   */
  @JvmStatic
  public final fun agentSetVelocity(agent: RID, velocity: Vector2): Unit {
    Internals.writeArguments(_RID to agent, VECTOR2 to velocity)
    Internals.callMethod(rawPtr, MethodBindings.agentSetVelocityPtr, NIL)
  }

  /**
   * Returns the velocity of the specified [agent].
   */
  @JvmStatic
  public final fun agentGetVelocity(agent: RID): Vector2 {
    Internals.writeArguments(_RID to agent)
    Internals.callMethod(rawPtr, MethodBindings.agentGetVelocityPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Sets the position of the agent in world space.
   */
  @JvmStatic
  public final fun agentSetPosition(agent: RID, position: Vector2): Unit {
    Internals.writeArguments(_RID to agent, VECTOR2 to position)
    Internals.callMethod(rawPtr, MethodBindings.agentSetPositionPtr, NIL)
  }

  /**
   * Returns the position of the specified [agent] in world space.
   */
  @JvmStatic
  public final fun agentGetPosition(agent: RID): Vector2 {
    Internals.writeArguments(_RID to agent)
    Internals.callMethod(rawPtr, MethodBindings.agentGetPositionPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns true if the map got changed the previous frame.
   */
  @JvmStatic
  public final fun agentIsMapChanged(agent: RID): Boolean {
    Internals.writeArguments(_RID to agent)
    Internals.callMethod(rawPtr, MethodBindings.agentIsMapChangedPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the callback [Callable] that gets called after each avoidance processing step for the
   * [agent]. The calculated `safe_velocity` will be dispatched with a signal to the object just before
   * the physics calculations.
   * **Note:** Created callbacks are always processed independently of the SceneTree state as long
   * as the agent is on a navigation map and not freed. To disable the dispatch of a callback from an
   * agent use [agentSetAvoidanceCallback] again with an empty [Callable].
   */
  @JvmStatic
  public final fun agentSetAvoidanceCallback(agent: RID, callback: Callable): Unit {
    Internals.writeArguments(_RID to agent, CALLABLE to callback)
    Internals.callMethod(rawPtr, MethodBindings.agentSetAvoidanceCallbackPtr, NIL)
  }

  /**
   * Return `true` if the specified [agent] has an avoidance callback.
   */
  @JvmStatic
  public final fun agentHasAvoidanceCallback(agent: RID): Boolean {
    Internals.writeArguments(_RID to agent)
    Internals.callMethod(rawPtr, MethodBindings.agentHasAvoidanceCallbackPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Set the agent's `avoidance_layers` bitmask.
   */
  @JvmStatic
  public final fun agentSetAvoidanceLayers(agent: RID, layers: Long): Unit {
    Internals.writeArguments(_RID to agent, LONG to layers)
    Internals.callMethod(rawPtr, MethodBindings.agentSetAvoidanceLayersPtr, NIL)
  }

  /**
   * Returns the `avoidance_layers` bitmask of the specified [agent].
   */
  @JvmStatic
  public final fun agentGetAvoidanceLayers(agent: RID): Long {
    Internals.writeArguments(_RID to agent)
    Internals.callMethod(rawPtr, MethodBindings.agentGetAvoidanceLayersPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Set the agent's `avoidance_mask` bitmask.
   */
  @JvmStatic
  public final fun agentSetAvoidanceMask(agent: RID, mask: Long): Unit {
    Internals.writeArguments(_RID to agent, LONG to mask)
    Internals.callMethod(rawPtr, MethodBindings.agentSetAvoidanceMaskPtr, NIL)
  }

  /**
   * Returns the `avoidance_mask` bitmask of the specified [agent].
   */
  @JvmStatic
  public final fun agentGetAvoidanceMask(agent: RID): Long {
    Internals.writeArguments(_RID to agent)
    Internals.callMethod(rawPtr, MethodBindings.agentGetAvoidanceMaskPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Set the agent's `avoidance_priority` with a [priority] between 0.0 (lowest priority) to 1.0
   * (highest priority).
   * The specified [agent] does not adjust the velocity for other agents that would match the
   * `avoidance_mask` but have a lower `avoidance_priority`. This in turn makes the other agents with
   * lower priority adjust their velocities even more to avoid collision with this agent.
   */
  @JvmStatic
  public final fun agentSetAvoidancePriority(agent: RID, priority: Float): Unit {
    Internals.writeArguments(_RID to agent, DOUBLE to priority.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.agentSetAvoidancePriorityPtr, NIL)
  }

  /**
   * Returns the `avoidance_priority` of the specified [agent].
   */
  @JvmStatic
  public final fun agentGetAvoidancePriority(agent: RID): Float {
    Internals.writeArguments(_RID to agent)
    Internals.callMethod(rawPtr, MethodBindings.agentGetAvoidancePriorityPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Creates a new navigation obstacle.
   */
  @JvmStatic
  public final fun obstacleCreate(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.obstacleCreatePtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  /**
   * If [enabled] is `true`, the provided [obstacle] affects avoidance using agents.
   */
  @JvmStatic
  public final fun obstacleSetAvoidanceEnabled(obstacle: RID, enabled: Boolean): Unit {
    Internals.writeArguments(_RID to obstacle, BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.obstacleSetAvoidanceEnabledPtr, NIL)
  }

  /**
   * Returns `true` if the provided [obstacle] has avoidance enabled.
   */
  @JvmStatic
  public final fun obstacleGetAvoidanceEnabled(obstacle: RID): Boolean {
    Internals.writeArguments(_RID to obstacle)
    Internals.callMethod(rawPtr, MethodBindings.obstacleGetAvoidanceEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the navigation map [RID] for the obstacle.
   */
  @JvmStatic
  public final fun obstacleSetMap(obstacle: RID, map: RID): Unit {
    Internals.writeArguments(_RID to obstacle, _RID to map)
    Internals.callMethod(rawPtr, MethodBindings.obstacleSetMapPtr, NIL)
  }

  /**
   * Returns the navigation map [RID] the requested [obstacle] is currently assigned to.
   */
  @JvmStatic
  public final fun obstacleGetMap(obstacle: RID): RID {
    Internals.writeArguments(_RID to obstacle)
    Internals.callMethod(rawPtr, MethodBindings.obstacleGetMapPtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  /**
   * If [paused] is true the specified [obstacle] will not be processed, e.g. affect avoidance
   * velocities.
   */
  @JvmStatic
  public final fun obstacleSetPaused(obstacle: RID, paused: Boolean): Unit {
    Internals.writeArguments(_RID to obstacle, BOOL to paused)
    Internals.callMethod(rawPtr, MethodBindings.obstacleSetPausedPtr, NIL)
  }

  /**
   * Returns `true` if the specified [obstacle] is paused.
   */
  @JvmStatic
  public final fun obstacleGetPaused(obstacle: RID): Boolean {
    Internals.writeArguments(_RID to obstacle)
    Internals.callMethod(rawPtr, MethodBindings.obstacleGetPausedPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the radius of the dynamic obstacle.
   */
  @JvmStatic
  public final fun obstacleSetRadius(obstacle: RID, radius: Float): Unit {
    Internals.writeArguments(_RID to obstacle, DOUBLE to radius.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.obstacleSetRadiusPtr, NIL)
  }

  /**
   * Returns the radius of the specified dynamic [obstacle].
   */
  @JvmStatic
  public final fun obstacleGetRadius(obstacle: RID): Float {
    Internals.writeArguments(_RID to obstacle)
    Internals.callMethod(rawPtr, MethodBindings.obstacleGetRadiusPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Sets [velocity] of the dynamic [obstacle]. Allows other agents to better predict the movement
   * of the dynamic obstacle. Only works in combination with the radius of the obstacle.
   */
  @JvmStatic
  public final fun obstacleSetVelocity(obstacle: RID, velocity: Vector2): Unit {
    Internals.writeArguments(_RID to obstacle, VECTOR2 to velocity)
    Internals.callMethod(rawPtr, MethodBindings.obstacleSetVelocityPtr, NIL)
  }

  /**
   * Returns the velocity of the specified dynamic [obstacle].
   */
  @JvmStatic
  public final fun obstacleGetVelocity(obstacle: RID): Vector2 {
    Internals.writeArguments(_RID to obstacle)
    Internals.callMethod(rawPtr, MethodBindings.obstacleGetVelocityPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Sets the position of the obstacle in world space.
   */
  @JvmStatic
  public final fun obstacleSetPosition(obstacle: RID, position: Vector2): Unit {
    Internals.writeArguments(_RID to obstacle, VECTOR2 to position)
    Internals.callMethod(rawPtr, MethodBindings.obstacleSetPositionPtr, NIL)
  }

  /**
   * Returns the position of the specified [obstacle] in world space.
   */
  @JvmStatic
  public final fun obstacleGetPosition(obstacle: RID): Vector2 {
    Internals.writeArguments(_RID to obstacle)
    Internals.callMethod(rawPtr, MethodBindings.obstacleGetPositionPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Sets the outline vertices for the obstacle. If the vertices are winded in clockwise order
   * agents will be pushed in by the obstacle, else they will be pushed out.
   */
  @JvmStatic
  public final fun obstacleSetVertices(obstacle: RID, vertices: PackedVector2Array): Unit {
    Internals.writeArguments(_RID to obstacle, PACKED_VECTOR2_ARRAY to vertices)
    Internals.callMethod(rawPtr, MethodBindings.obstacleSetVerticesPtr, NIL)
  }

  /**
   * Returns the outline vertices for the specified [obstacle].
   */
  @JvmStatic
  public final fun obstacleGetVertices(obstacle: RID): PackedVector2Array {
    Internals.writeArguments(_RID to obstacle)
    Internals.callMethod(rawPtr, MethodBindings.obstacleGetVerticesPtr, PACKED_VECTOR2_ARRAY)
    return (Internals.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
  }

  /**
   * Set the obstacles's `avoidance_layers` bitmask.
   */
  @JvmStatic
  public final fun obstacleSetAvoidanceLayers(obstacle: RID, layers: Long): Unit {
    Internals.writeArguments(_RID to obstacle, LONG to layers)
    Internals.callMethod(rawPtr, MethodBindings.obstacleSetAvoidanceLayersPtr, NIL)
  }

  /**
   * Returns the `avoidance_layers` bitmask of the specified [obstacle].
   */
  @JvmStatic
  public final fun obstacleGetAvoidanceLayers(obstacle: RID): Long {
    Internals.writeArguments(_RID to obstacle)
    Internals.callMethod(rawPtr, MethodBindings.obstacleGetAvoidanceLayersPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Parses the [SceneTree] for source geometry according to the properties of [navigationPolygon].
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
  @JvmStatic
  public final fun parseSourceGeometryData(
    navigationPolygon: NavigationPolygon?,
    sourceGeometryData: NavigationMeshSourceGeometryData2D?,
    rootNode: Node?,
    callback: Callable = Callable(),
  ): Unit {
    Internals.writeArguments(OBJECT to navigationPolygon, OBJECT to sourceGeometryData, OBJECT to rootNode, CALLABLE to callback)
    Internals.callMethod(rawPtr, MethodBindings.parseSourceGeometryDataPtr, NIL)
  }

  /**
   * Bakes the provided [navigationPolygon] with the data from the provided [sourceGeometryData].
   * After the process is finished the optional [callback] will be called.
   */
  @JvmOverloads
  @JvmStatic
  public final fun bakeFromSourceGeometryData(
    navigationPolygon: NavigationPolygon?,
    sourceGeometryData: NavigationMeshSourceGeometryData2D?,
    callback: Callable = Callable(),
  ): Unit {
    Internals.writeArguments(OBJECT to navigationPolygon, OBJECT to sourceGeometryData, CALLABLE to callback)
    Internals.callMethod(rawPtr, MethodBindings.bakeFromSourceGeometryDataPtr, NIL)
  }

  /**
   * Bakes the provided [navigationPolygon] with the data from the provided [sourceGeometryData] as
   * an async task running on a background thread. After the process is finished the optional
   * [callback] will be called.
   */
  @JvmOverloads
  @JvmStatic
  public final fun bakeFromSourceGeometryDataAsync(
    navigationPolygon: NavigationPolygon?,
    sourceGeometryData: NavigationMeshSourceGeometryData2D?,
    callback: Callable = Callable(),
  ): Unit {
    Internals.writeArguments(OBJECT to navigationPolygon, OBJECT to sourceGeometryData, CALLABLE to callback)
    Internals.callMethod(rawPtr, MethodBindings.bakeFromSourceGeometryDataAsyncPtr, NIL)
  }

  /**
   * Returns `true` when the provided navigation polygon is being baked on a background thread.
   */
  @JvmStatic
  public final fun isBakingNavigationPolygon(navigationPolygon: NavigationPolygon?): Boolean {
    Internals.writeArguments(OBJECT to navigationPolygon)
    Internals.callMethod(rawPtr, MethodBindings.isBakingNavigationPolygonPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Creates a new source geometry parser. If a [Callable] is set for the parser with
   * [sourceGeometryParserSetCallback] the callback will be called for every single node that gets
   * parsed whenever [parseSourceGeometryData] is used.
   */
  @JvmStatic
  public final fun sourceGeometryParserCreate(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.sourceGeometryParserCreatePtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  /**
   * Sets the [callback] [Callable] for the specific source geometry [parser]. The [Callable] will
   * receive a call with the following parameters:
   * - `navigation_mesh` - The [NavigationPolygon] reference used to define the parse settings. Do
   * NOT edit or add directly to the navigation mesh.
   * - `source_geometry_data` - The [NavigationMeshSourceGeometryData2D] reference. Add custom
   * source geometry for navigation mesh baking to this object.
   * - `node` - The [Node] that is parsed.
   */
  @JvmStatic
  public final fun sourceGeometryParserSetCallback(parser: RID, callback: Callable): Unit {
    Internals.writeArguments(_RID to parser, CALLABLE to callback)
    Internals.callMethod(rawPtr, MethodBindings.sourceGeometryParserSetCallbackPtr, NIL)
  }

  /**
   * Returns a simplified version of [path] with less critical path points removed. The
   * simplification amount is in worlds units and controlled by [epsilon]. The simplification uses a
   * variant of Ramer-Douglas-Peucker algorithm for curve point decimation.
   * Path simplification can be helpful to mitigate various path following issues that can arise
   * with certain agent types and script behaviors. E.g. "steering" agents or avoidance in "open
   * fields".
   */
  @JvmStatic
  public final fun simplifyPath(path: PackedVector2Array, epsilon: Float): PackedVector2Array {
    Internals.writeArguments(PACKED_VECTOR2_ARRAY to path, DOUBLE to epsilon.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.simplifyPathPtr, PACKED_VECTOR2_ARRAY)
    return (Internals.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
  }

  /**
   * Destroys the given RID.
   */
  @JvmStatic
  public final fun freeRid(rid: RID): Unit {
    Internals.writeArguments(_RID to rid)
    Internals.callMethod(rawPtr, MethodBindings.freeRidPtr, NIL)
  }

  /**
   * If `true` enables debug mode on the NavigationServer.
   */
  @JvmStatic
  public final fun setDebugEnabled(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setDebugEnabledPtr, NIL)
  }

  /**
   * Returns `true` when the NavigationServer has debug enabled.
   */
  @JvmStatic
  public final fun getDebugEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDebugEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public object MethodBindings {
    internal val getMapsPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "get_maps", 3995934104)

    internal val mapCreatePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "map_create", 529393457)

    internal val mapSetActivePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "map_set_active", 1265174801)

    internal val mapIsActivePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "map_is_active", 4155700596)

    internal val mapSetCellSizePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "map_set_cell_size", 1794382983)

    internal val mapGetCellSizePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "map_get_cell_size", 866169185)

    internal val mapSetUseEdgeConnectionsPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "map_set_use_edge_connections", 1265174801)

    internal val mapGetUseEdgeConnectionsPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "map_get_use_edge_connections", 4155700596)

    internal val mapSetEdgeConnectionMarginPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "map_set_edge_connection_margin", 1794382983)

    internal val mapGetEdgeConnectionMarginPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "map_get_edge_connection_margin", 866169185)

    internal val mapSetLinkConnectionRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "map_set_link_connection_radius", 1794382983)

    internal val mapGetLinkConnectionRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "map_get_link_connection_radius", 866169185)

    internal val mapGetPathPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "map_get_path", 3146466012)

    internal val mapGetClosestPointPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "map_get_closest_point", 1358334418)

    internal val mapGetClosestPointOwnerPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "map_get_closest_point_owner", 1353467510)

    internal val mapGetLinksPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "map_get_links", 2684255073)

    internal val mapGetRegionsPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "map_get_regions", 2684255073)

    internal val mapGetAgentsPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "map_get_agents", 2684255073)

    internal val mapGetObstaclesPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "map_get_obstacles", 2684255073)

    internal val mapForceUpdatePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "map_force_update", 2722037293)

    internal val mapGetIterationIdPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "map_get_iteration_id", 2198884583)

    internal val mapGetRandomPointPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "map_get_random_point", 3271000763)

    internal val queryPathPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "query_path", 3394638789)

    internal val regionCreatePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "region_create", 529393457)

    internal val regionSetEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "region_set_enabled", 1265174801)

    internal val regionGetEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "region_get_enabled", 4155700596)

    internal val regionSetUseEdgeConnectionsPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "region_set_use_edge_connections", 1265174801)

    internal val regionGetUseEdgeConnectionsPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "region_get_use_edge_connections", 4155700596)

    internal val regionSetEnterCostPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "region_set_enter_cost", 1794382983)

    internal val regionGetEnterCostPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "region_get_enter_cost", 866169185)

    internal val regionSetTravelCostPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "region_set_travel_cost", 1794382983)

    internal val regionGetTravelCostPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "region_get_travel_cost", 866169185)

    internal val regionSetOwnerIdPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "region_set_owner_id", 3411492887)

    internal val regionGetOwnerIdPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "region_get_owner_id", 2198884583)

    internal val regionOwnsPointPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "region_owns_point", 219849798)

    internal val regionSetMapPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "region_set_map", 395945892)

    internal val regionGetMapPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "region_get_map", 3814569979)

    internal val regionSetNavigationLayersPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "region_set_navigation_layers", 3411492887)

    internal val regionGetNavigationLayersPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "region_get_navigation_layers", 2198884583)

    internal val regionSetTransformPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "region_set_transform", 1246044741)

    internal val regionGetTransformPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "region_get_transform", 213527486)

    internal val regionSetNavigationPolygonPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "region_set_navigation_polygon", 3633623451)

    internal val regionGetConnectionsCountPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "region_get_connections_count", 2198884583)

    internal val regionGetConnectionPathwayStartPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "region_get_connection_pathway_start", 2546185844)

    internal val regionGetConnectionPathwayEndPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "region_get_connection_pathway_end", 2546185844)

    internal val regionGetRandomPointPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "region_get_random_point", 3271000763)

    internal val linkCreatePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "link_create", 529393457)

    internal val linkSetMapPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "link_set_map", 395945892)

    internal val linkGetMapPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "link_get_map", 3814569979)

    internal val linkSetEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "link_set_enabled", 1265174801)

    internal val linkGetEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "link_get_enabled", 4155700596)

    internal val linkSetBidirectionalPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "link_set_bidirectional", 1265174801)

    internal val linkIsBidirectionalPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "link_is_bidirectional", 4155700596)

    internal val linkSetNavigationLayersPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "link_set_navigation_layers", 3411492887)

    internal val linkGetNavigationLayersPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "link_get_navigation_layers", 2198884583)

    internal val linkSetStartPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "link_set_start_position", 3201125042)

    internal val linkGetStartPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "link_get_start_position", 2440833711)

    internal val linkSetEndPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "link_set_end_position", 3201125042)

    internal val linkGetEndPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "link_get_end_position", 2440833711)

    internal val linkSetEnterCostPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "link_set_enter_cost", 1794382983)

    internal val linkGetEnterCostPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "link_get_enter_cost", 866169185)

    internal val linkSetTravelCostPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "link_set_travel_cost", 1794382983)

    internal val linkGetTravelCostPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "link_get_travel_cost", 866169185)

    internal val linkSetOwnerIdPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "link_set_owner_id", 3411492887)

    internal val linkGetOwnerIdPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "link_get_owner_id", 2198884583)

    internal val agentCreatePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "agent_create", 529393457)

    internal val agentSetAvoidanceEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "agent_set_avoidance_enabled", 1265174801)

    internal val agentGetAvoidanceEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "agent_get_avoidance_enabled", 4155700596)

    internal val agentSetMapPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "agent_set_map", 395945892)

    internal val agentGetMapPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "agent_get_map", 3814569979)

    internal val agentSetPausedPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "agent_set_paused", 1265174801)

    internal val agentGetPausedPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "agent_get_paused", 4155700596)

    internal val agentSetNeighborDistancePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "agent_set_neighbor_distance", 1794382983)

    internal val agentGetNeighborDistancePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "agent_get_neighbor_distance", 866169185)

    internal val agentSetMaxNeighborsPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "agent_set_max_neighbors", 3411492887)

    internal val agentGetMaxNeighborsPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "agent_get_max_neighbors", 2198884583)

    internal val agentSetTimeHorizonAgentsPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "agent_set_time_horizon_agents", 1794382983)

    internal val agentGetTimeHorizonAgentsPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "agent_get_time_horizon_agents", 866169185)

    internal val agentSetTimeHorizonObstaclesPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "agent_set_time_horizon_obstacles", 1794382983)

    internal val agentGetTimeHorizonObstaclesPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "agent_get_time_horizon_obstacles", 866169185)

    internal val agentSetRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "agent_set_radius", 1794382983)

    internal val agentGetRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "agent_get_radius", 866169185)

    internal val agentSetMaxSpeedPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "agent_set_max_speed", 1794382983)

    internal val agentGetMaxSpeedPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "agent_get_max_speed", 866169185)

    internal val agentSetVelocityForcedPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "agent_set_velocity_forced", 3201125042)

    internal val agentSetVelocityPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "agent_set_velocity", 3201125042)

    internal val agentGetVelocityPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "agent_get_velocity", 2440833711)

    internal val agentSetPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "agent_set_position", 3201125042)

    internal val agentGetPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "agent_get_position", 2440833711)

    internal val agentIsMapChangedPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "agent_is_map_changed", 4155700596)

    internal val agentSetAvoidanceCallbackPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "agent_set_avoidance_callback", 3379118538)

    internal val agentHasAvoidanceCallbackPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "agent_has_avoidance_callback", 4155700596)

    internal val agentSetAvoidanceLayersPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "agent_set_avoidance_layers", 3411492887)

    internal val agentGetAvoidanceLayersPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "agent_get_avoidance_layers", 2198884583)

    internal val agentSetAvoidanceMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "agent_set_avoidance_mask", 3411492887)

    internal val agentGetAvoidanceMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "agent_get_avoidance_mask", 2198884583)

    internal val agentSetAvoidancePriorityPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "agent_set_avoidance_priority", 1794382983)

    internal val agentGetAvoidancePriorityPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "agent_get_avoidance_priority", 866169185)

    internal val obstacleCreatePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "obstacle_create", 529393457)

    internal val obstacleSetAvoidanceEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "obstacle_set_avoidance_enabled", 1265174801)

    internal val obstacleGetAvoidanceEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "obstacle_get_avoidance_enabled", 4155700596)

    internal val obstacleSetMapPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "obstacle_set_map", 395945892)

    internal val obstacleGetMapPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "obstacle_get_map", 3814569979)

    internal val obstacleSetPausedPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "obstacle_set_paused", 1265174801)

    internal val obstacleGetPausedPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "obstacle_get_paused", 4155700596)

    internal val obstacleSetRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "obstacle_set_radius", 1794382983)

    internal val obstacleGetRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "obstacle_get_radius", 866169185)

    internal val obstacleSetVelocityPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "obstacle_set_velocity", 3201125042)

    internal val obstacleGetVelocityPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "obstacle_get_velocity", 2440833711)

    internal val obstacleSetPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "obstacle_set_position", 3201125042)

    internal val obstacleGetPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "obstacle_get_position", 2440833711)

    internal val obstacleSetVerticesPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "obstacle_set_vertices", 29476483)

    internal val obstacleGetVerticesPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "obstacle_get_vertices", 2222557395)

    internal val obstacleSetAvoidanceLayersPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "obstacle_set_avoidance_layers", 3411492887)

    internal val obstacleGetAvoidanceLayersPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "obstacle_get_avoidance_layers", 2198884583)

    internal val parseSourceGeometryDataPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "parse_source_geometry_data", 1176164995)

    internal val bakeFromSourceGeometryDataPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "bake_from_source_geometry_data", 2909414286)

    internal val bakeFromSourceGeometryDataAsyncPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "bake_from_source_geometry_data_async", 2909414286)

    internal val isBakingNavigationPolygonPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "is_baking_navigation_polygon", 3729405808)

    internal val sourceGeometryParserCreatePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "source_geometry_parser_create", 529393457)

    internal val sourceGeometryParserSetCallbackPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "source_geometry_parser_set_callback", 3379118538)

    internal val simplifyPathPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "simplify_path", 2457191505)

    internal val freeRidPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "free_rid", 2722037293)

    internal val setDebugEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "set_debug_enabled", 2586408642)

    internal val getDebugEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationServer2D", "get_debug_enabled", 36873697)
  }
}
