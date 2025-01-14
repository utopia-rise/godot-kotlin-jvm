// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.NavigationPathQueryParameters3D.PathMetadataFlagsValue
import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Color
import godot.core.Dictionary
import godot.core.PackedVector3Array
import godot.core.RID
import godot.core.Signal0
import godot.core.Signal1
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_VECTOR3_ARRAY
import godot.core.VariantParser.VECTOR3
import godot.core.VariantParser._RID
import godot.core.Vector3
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A 3D agent used to pathfind to a position while avoiding static and dynamic obstacles. The
 * calculation can be used by the parent node to dynamically move it along the path. Requires
 * navigation data to work correctly.
 * Dynamic obstacles are avoided using RVO collision avoidance. Avoidance is computed before
 * physics, so the pathfinding information can be used safely in the physics step.
 * **Note:** After setting the [targetPosition] property, the [getNextPathPosition] method must be
 * used once every physics frame to update the internal path logic of the navigation agent. The vector
 * position it returns should be used as the next movement position for the agent's parent node.
 */
@GodotBaseType
public open class NavigationAgent3D : Node() {
  /**
   * Emitted when the agent had to update the loaded path:
   * - because path was previously empty.
   * - because navigation map has changed.
   * - because agent pushed further away from the current path segment than the [pathMaxDistance].
   */
  public val pathChanged: Signal0 by Signal0

  /**
   * Signals that the agent reached the target, i.e. the agent moved within [targetDesiredDistance]
   * of the [targetPosition]. This signal is emitted only once per loaded path.
   * This signal will be emitted just before [signal navigation_finished] when the target is
   * reachable.
   * It may not always be possible to reach the target but it should always be possible to reach the
   * final position. See [getFinalPosition].
   */
  public val targetReached: Signal0 by Signal0

  /**
   * Signals that the agent reached a waypoint. Emitted when the agent moves within
   * [pathDesiredDistance] of the next position of the path.
   * The details dictionary may contain the following keys depending on the value of
   * [pathMetadataFlags]:
   * - `position`: The position of the waypoint that was reached.
   * - `type`: The type of navigation primitive (region or link) that contains this waypoint.
   * - `rid`: The [RID] of the containing navigation primitive (region or link).
   * - `owner`: The object which manages the containing navigation primitive (region or link).
   */
  public val waypointReached: Signal1<Dictionary<Any?, Any?>> by Signal1

  /**
   * Signals that the agent reached a navigation link. Emitted when the agent moves within
   * [pathDesiredDistance] of the next position of the path when that position is a navigation link.
   * The details dictionary may contain the following keys depending on the value of
   * [pathMetadataFlags]:
   * - `position`: The start position of the link that was reached.
   * - `type`: Always [NavigationPathQueryResult3D.PATH_SEGMENT_TYPE_LINK].
   * - `rid`: The [RID] of the link.
   * - `owner`: The object which manages the link (usually [NavigationLink3D]).
   * - `link_entry_position`: If `owner` is available and the owner is a [NavigationLink3D], it will
   * contain the global position of the link's point the agent is entering.
   * - `link_exit_position`: If `owner` is available and the owner is a [NavigationLink3D], it will
   * contain the global position of the link's point which the agent is exiting.
   */
  public val linkReached: Signal1<Dictionary<Any?, Any?>> by Signal1

  /**
   * Signals that the agent's navigation has finished. If the target is reachable, navigation ends
   * when the target is reached. If the target is unreachable, navigation ends when the last waypoint
   * of the path is reached. This signal is emitted only once per loaded path.
   * This signal will be emitted just after [signal target_reached] when the target is reachable.
   */
  public val navigationFinished: Signal0 by Signal0

  /**
   * Notifies when the collision avoidance velocity is calculated. Emitted every update as long as
   * [avoidanceEnabled] is `true` and the agent has a navigation map.
   */
  public val velocityComputed: Signal1<Vector3> by Signal1

  /**
   * If set, a new navigation path from the current agent position to the [targetPosition] is
   * requested from the NavigationServer.
   */
  @CoreTypeLocalCopy
  public final inline var targetPosition: Vector3
    @JvmName("targetPositionProperty")
    get() = getTargetPosition()
    @JvmName("targetPositionProperty")
    set(`value`) {
      setTargetPosition(value)
    }

  /**
   * The distance threshold before a path point is considered to be reached. This allows agents to
   * not have to hit a path point on the path exactly, but only to reach its general area. If this
   * value is set too high, the NavigationAgent will skip points on the path, which can lead to it
   * leaving the navigation mesh. If this value is set too low, the NavigationAgent will be stuck in a
   * repath loop because it will constantly overshoot the distance to the next point on each physics
   * frame update.
   */
  public final inline var pathDesiredDistance: Float
    @JvmName("pathDesiredDistanceProperty")
    get() = getPathDesiredDistance()
    @JvmName("pathDesiredDistanceProperty")
    set(`value`) {
      setPathDesiredDistance(value)
    }

  /**
   * The distance threshold before the target is considered to be reached. On reaching the target,
   * [signal target_reached] is emitted and navigation ends (see [isNavigationFinished] and [signal
   * navigation_finished]).
   * You can make navigation end early by setting this property to a value greater than
   * [pathDesiredDistance] (navigation will end before reaching the last waypoint).
   * You can also make navigation end closer to the target than each individual path position by
   * setting this property to a value lower than [pathDesiredDistance] (navigation won't immediately
   * end when reaching the last waypoint). However, if the value set is too low, the agent will be
   * stuck in a repath loop because it will constantly overshoot the distance to the target on each
   * physics frame update.
   */
  public final inline var targetDesiredDistance: Float
    @JvmName("targetDesiredDistanceProperty")
    get() = getTargetDesiredDistance()
    @JvmName("targetDesiredDistanceProperty")
    set(`value`) {
      setTargetDesiredDistance(value)
    }

  /**
   * The height offset is subtracted from the y-axis value of any vector path position for this
   * NavigationAgent. The NavigationAgent height offset does not change or influence the navigation
   * mesh or pathfinding query result. Additional navigation maps that use regions with navigation
   * meshes that the developer baked with appropriate agent radius or height values are required to
   * support different-sized agents.
   */
  public final inline var pathHeightOffset: Float
    @JvmName("pathHeightOffsetProperty")
    get() = getPathHeightOffset()
    @JvmName("pathHeightOffsetProperty")
    set(`value`) {
      setPathHeightOffset(value)
    }

  /**
   * The maximum distance the agent is allowed away from the ideal path to the final position. This
   * can happen due to trying to avoid collisions. When the maximum distance is exceeded, it
   * recalculates the ideal path.
   */
  public final inline var pathMaxDistance: Float
    @JvmName("pathMaxDistanceProperty")
    get() = getPathMaxDistance()
    @JvmName("pathMaxDistanceProperty")
    set(`value`) {
      setPathMaxDistance(value)
    }

  /**
   * A bitfield determining which navigation layers of navigation regions this agent will use to
   * calculate a path. Changing it during runtime will clear the current navigation path and generate a
   * new one, according to the new navigation layers.
   */
  public final inline var navigationLayers: Long
    @JvmName("navigationLayersProperty")
    get() = getNavigationLayers()
    @JvmName("navigationLayersProperty")
    set(`value`) {
      setNavigationLayers(value)
    }

  /**
   * The pathfinding algorithm used in the path query.
   */
  public final inline var pathfindingAlgorithm: NavigationPathQueryParameters3D.PathfindingAlgorithm
    @JvmName("pathfindingAlgorithmProperty")
    get() = getPathfindingAlgorithm()
    @JvmName("pathfindingAlgorithmProperty")
    set(`value`) {
      setPathfindingAlgorithm(value)
    }

  /**
   * The path postprocessing applied to the raw path corridor found by the [pathfindingAlgorithm].
   */
  public final inline var pathPostprocessing: NavigationPathQueryParameters3D.PathPostProcessing
    @JvmName("pathPostprocessingProperty")
    get() = getPathPostprocessing()
    @JvmName("pathPostprocessingProperty")
    set(`value`) {
      setPathPostprocessing(value)
    }

  /**
   * Additional information to return with the navigation path.
   */
  public final inline var pathMetadataFlags: NavigationPathQueryParameters3D.PathMetadataFlags
    @JvmName("pathMetadataFlagsProperty")
    get() = getPathMetadataFlags()
    @JvmName("pathMetadataFlagsProperty")
    set(`value`) {
      setPathMetadataFlags(value)
    }

  /**
   * If `true` a simplified version of the path will be returned with less critical path points
   * removed. The simplification amount is controlled by [simplifyEpsilon]. The simplification uses a
   * variant of Ramer-Douglas-Peucker algorithm for curve point decimation.
   * Path simplification can be helpful to mitigate various path following issues that can arise
   * with certain agent types and script behaviors. E.g. "steering" agents or avoidance in "open
   * fields".
   */
  public final inline var simplifyPath: Boolean
    @JvmName("simplifyPathProperty")
    get() = getSimplifyPath()
    @JvmName("simplifyPathProperty")
    set(`value`) {
      setSimplifyPath(value)
    }

  /**
   * The path simplification amount in worlds units.
   */
  public final inline var simplifyEpsilon: Float
    @JvmName("simplifyEpsilonProperty")
    get() = getSimplifyEpsilon()
    @JvmName("simplifyEpsilonProperty")
    set(`value`) {
      setSimplifyEpsilon(value)
    }

  /**
   * If `true` the agent is registered for an RVO avoidance callback on the [NavigationServer3D].
   * When [velocity] is set and the processing is completed a `safe_velocity` Vector3 is received with
   * a signal connection to [signal velocity_computed]. Avoidance processing with many registered
   * agents has a significant performance cost and should only be enabled on agents that currently
   * require it.
   */
  public final inline var avoidanceEnabled: Boolean
    @JvmName("avoidanceEnabledProperty")
    get() = getAvoidanceEnabled()
    @JvmName("avoidanceEnabledProperty")
    set(`value`) {
      setAvoidanceEnabled(value)
    }

  /**
   * Sets the new wanted velocity for the agent. The avoidance simulation will try to fulfill this
   * velocity if possible but will modify it to avoid collision with other agents and obstacles. When
   * an agent is teleported to a new position, use [setVelocityForced] as well to reset the internal
   * simulation velocity.
   */
  @CoreTypeLocalCopy
  public final inline var velocity: Vector3
    @JvmName("velocityProperty")
    get() = getVelocity()
    @JvmName("velocityProperty")
    set(`value`) {
      setVelocity(value)
    }

  /**
   * The height of the avoidance agent. Agents will ignore other agents or obstacles that are above
   * or below their current position + height in 2D avoidance. Does nothing in 3D avoidance which uses
   * radius spheres alone.
   */
  public final inline var height: Float
    @JvmName("heightProperty")
    get() = getHeight()
    @JvmName("heightProperty")
    set(`value`) {
      setHeight(value)
    }

  /**
   * The radius of the avoidance agent. This is the "body" of the avoidance agent and not the
   * avoidance maneuver starting radius (which is controlled by [neighborDistance]).
   * Does not affect normal pathfinding. To change an actor's pathfinding radius bake
   * [NavigationMesh] resources with a different [NavigationMesh.agentRadius] property and use
   * different navigation maps for each actor size.
   */
  public final inline var radius: Float
    @JvmName("radiusProperty")
    get() = getRadius()
    @JvmName("radiusProperty")
    set(`value`) {
      setRadius(value)
    }

  /**
   * The distance to search for other agents.
   */
  public final inline var neighborDistance: Float
    @JvmName("neighborDistanceProperty")
    get() = getNeighborDistance()
    @JvmName("neighborDistanceProperty")
    set(`value`) {
      setNeighborDistance(value)
    }

  /**
   * The maximum number of neighbors for the agent to consider.
   */
  public final inline var maxNeighbors: Int
    @JvmName("maxNeighborsProperty")
    get() = getMaxNeighbors()
    @JvmName("maxNeighborsProperty")
    set(`value`) {
      setMaxNeighbors(value)
    }

  /**
   * The minimal amount of time for which this agent's velocities, that are computed with the
   * collision avoidance algorithm, are safe with respect to other agents. The larger the number, the
   * sooner the agent will respond to other agents, but less freedom in choosing its velocities. A too
   * high value will slow down agents movement considerably. Must be positive.
   */
  public final inline var timeHorizonAgents: Float
    @JvmName("timeHorizonAgentsProperty")
    get() = getTimeHorizonAgents()
    @JvmName("timeHorizonAgentsProperty")
    set(`value`) {
      setTimeHorizonAgents(value)
    }

  /**
   * The minimal amount of time for which this agent's velocities, that are computed with the
   * collision avoidance algorithm, are safe with respect to static avoidance obstacles. The larger the
   * number, the sooner the agent will respond to static avoidance obstacles, but less freedom in
   * choosing its velocities. A too high value will slow down agents movement considerably. Must be
   * positive.
   */
  public final inline var timeHorizonObstacles: Float
    @JvmName("timeHorizonObstaclesProperty")
    get() = getTimeHorizonObstacles()
    @JvmName("timeHorizonObstaclesProperty")
    set(`value`) {
      setTimeHorizonObstacles(value)
    }

  /**
   * The maximum speed that an agent can move.
   */
  public final inline var maxSpeed: Float
    @JvmName("maxSpeedProperty")
    get() = getMaxSpeed()
    @JvmName("maxSpeedProperty")
    set(`value`) {
      setMaxSpeed(value)
    }

  /**
   * If `true`, the agent calculates avoidance velocities in 3D omnidirectionally, e.g. for games
   * that take place in air, underwater or space. Agents using 3D avoidance only avoid other agents
   * using 3D avoidance, and react to radius-based avoidance obstacles. They ignore any vertex-based
   * obstacles.
   * If `false`, the agent calculates avoidance velocities in 2D along the x and z-axes, ignoring
   * the y-axis. Agents using 2D avoidance only avoid other agents using 2D avoidance, and react to
   * radius-based avoidance obstacles or vertex-based avoidance obstacles. Other agents using 2D
   * avoidance that are below or above their current position including [height] are ignored.
   */
  public final inline var use3dAvoidance: Boolean
    @JvmName("use3dAvoidanceProperty")
    get() = getUse3dAvoidance()
    @JvmName("use3dAvoidanceProperty")
    set(`value`) {
      setUse3dAvoidance(value)
    }

  /**
   * If `true`, and the agent uses 2D avoidance, it will remember the set y-axis velocity and
   * reapply it after the avoidance step. While 2D avoidance has no y-axis and simulates on a flat
   * plane this setting can help to soften the most obvious clipping on uneven 3D geometry.
   */
  public final inline var keepYVelocity: Boolean
    @JvmName("keepYVelocityProperty")
    get() = getKeepYVelocity()
    @JvmName("keepYVelocityProperty")
    set(`value`) {
      setKeepYVelocity(value)
    }

  /**
   * A bitfield determining the avoidance layers for this NavigationAgent. Other agents with a
   * matching bit on the [avoidanceMask] will avoid this agent.
   */
  public final inline var avoidanceLayers: Long
    @JvmName("avoidanceLayersProperty")
    get() = getAvoidanceLayers()
    @JvmName("avoidanceLayersProperty")
    set(`value`) {
      setAvoidanceLayers(value)
    }

  /**
   * A bitfield determining what other avoidance agents and obstacles this NavigationAgent will
   * avoid when a bit matches at least one of their [avoidanceLayers].
   */
  public final inline var avoidanceMask: Long
    @JvmName("avoidanceMaskProperty")
    get() = getAvoidanceMask()
    @JvmName("avoidanceMaskProperty")
    set(`value`) {
      setAvoidanceMask(value)
    }

  /**
   * The agent does not adjust the velocity for other agents that would match the [avoidanceMask]
   * but have a lower [avoidancePriority]. This in turn makes the other agents with lower priority
   * adjust their velocities even more to avoid collision with this agent.
   */
  public final inline var avoidancePriority: Float
    @JvmName("avoidancePriorityProperty")
    get() = getAvoidancePriority()
    @JvmName("avoidancePriorityProperty")
    set(`value`) {
      setAvoidancePriority(value)
    }

  /**
   * If `true` shows debug visuals for this agent.
   */
  public final inline var debugEnabled: Boolean
    @JvmName("debugEnabledProperty")
    get() = getDebugEnabled()
    @JvmName("debugEnabledProperty")
    set(`value`) {
      setDebugEnabled(value)
    }

  /**
   * If `true` uses the defined [debugPathCustomColor] for this agent instead of global color.
   */
  public final inline var debugUseCustom: Boolean
    @JvmName("debugUseCustomProperty")
    get() = getDebugUseCustom()
    @JvmName("debugUseCustomProperty")
    set(`value`) {
      setDebugUseCustom(value)
    }

  /**
   * If [debugUseCustom] is `true` uses this color for this agent instead of global color.
   */
  @CoreTypeLocalCopy
  public final inline var debugPathCustomColor: Color
    @JvmName("debugPathCustomColorProperty")
    get() = getDebugPathCustomColor()
    @JvmName("debugPathCustomColorProperty")
    set(`value`) {
      setDebugPathCustomColor(value)
    }

  /**
   * If [debugUseCustom] is `true` uses this rasterized point size for rendering path points for
   * this agent instead of global point size.
   */
  public final inline var debugPathCustomPointSize: Float
    @JvmName("debugPathCustomPointSizeProperty")
    get() = getDebugPathCustomPointSize()
    @JvmName("debugPathCustomPointSizeProperty")
    set(`value`) {
      setDebugPathCustomPointSize(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_NAVIGATIONAGENT3D, scriptIndex)
  }

  /**
   * If set, a new navigation path from the current agent position to the [targetPosition] is
   * requested from the NavigationServer.
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
   * val myCoreType = navigationagent3d.targetPosition
   * //Your changes
   * navigationagent3d.targetPosition = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun targetPositionMutate(block: Vector3.() -> Unit): Vector3 = targetPosition.apply{
      block(this)
      targetPosition = this
  }


  /**
   * Sets the new wanted velocity for the agent. The avoidance simulation will try to fulfill this
   * velocity if possible but will modify it to avoid collision with other agents and obstacles. When
   * an agent is teleported to a new position, use [setVelocityForced] as well to reset the internal
   * simulation velocity.
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
   * val myCoreType = navigationagent3d.velocity
   * //Your changes
   * navigationagent3d.velocity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun velocityMutate(block: Vector3.() -> Unit): Vector3 = velocity.apply{
      block(this)
      velocity = this
  }


  /**
   * If [debugUseCustom] is `true` uses this color for this agent instead of global color.
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
   * val myCoreType = navigationagent3d.debugPathCustomColor
   * //Your changes
   * navigationagent3d.debugPathCustomColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun debugPathCustomColorMutate(block: Color.() -> Unit): Color =
      debugPathCustomColor.apply{
      block(this)
      debugPathCustomColor = this
  }


  /**
   * Returns the [RID] of this agent on the [NavigationServer3D].
   */
  public final fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public final fun setAvoidanceEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setAvoidanceEnabledPtr, NIL)
  }

  public final fun getAvoidanceEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAvoidanceEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setPathDesiredDistance(desiredDistance: Float): Unit {
    TransferContext.writeArguments(DOUBLE to desiredDistance.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setPathDesiredDistancePtr, NIL)
  }

  public final fun getPathDesiredDistance(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPathDesiredDistancePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setTargetDesiredDistance(desiredDistance: Float): Unit {
    TransferContext.writeArguments(DOUBLE to desiredDistance.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setTargetDesiredDistancePtr, NIL)
  }

  public final fun getTargetDesiredDistance(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTargetDesiredDistancePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRadius(radius: Float): Unit {
    TransferContext.writeArguments(DOUBLE to radius.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setRadiusPtr, NIL)
  }

  public final fun getRadius(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRadiusPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setHeight(height: Float): Unit {
    TransferContext.writeArguments(DOUBLE to height.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setHeightPtr, NIL)
  }

  public final fun getHeight(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHeightPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setPathHeightOffset(pathHeightOffset: Float): Unit {
    TransferContext.writeArguments(DOUBLE to pathHeightOffset.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setPathHeightOffsetPtr, NIL)
  }

  public final fun getPathHeightOffset(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPathHeightOffsetPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setUse3dAvoidance(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setUse3dAvoidancePtr, NIL)
  }

  public final fun getUse3dAvoidance(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getUse3dAvoidancePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setKeepYVelocity(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setKeepYVelocityPtr, NIL)
  }

  public final fun getKeepYVelocity(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getKeepYVelocityPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setNeighborDistance(neighborDistance: Float): Unit {
    TransferContext.writeArguments(DOUBLE to neighborDistance.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setNeighborDistancePtr, NIL)
  }

  public final fun getNeighborDistance(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNeighborDistancePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setMaxNeighbors(maxNeighbors: Int): Unit {
    TransferContext.writeArguments(LONG to maxNeighbors.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setMaxNeighborsPtr, NIL)
  }

  public final fun getMaxNeighbors(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMaxNeighborsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setTimeHorizonAgents(timeHorizon: Float): Unit {
    TransferContext.writeArguments(DOUBLE to timeHorizon.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setTimeHorizonAgentsPtr, NIL)
  }

  public final fun getTimeHorizonAgents(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTimeHorizonAgentsPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setTimeHorizonObstacles(timeHorizon: Float): Unit {
    TransferContext.writeArguments(DOUBLE to timeHorizon.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setTimeHorizonObstaclesPtr, NIL)
  }

  public final fun getTimeHorizonObstacles(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTimeHorizonObstaclesPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setMaxSpeed(maxSpeed: Float): Unit {
    TransferContext.writeArguments(DOUBLE to maxSpeed.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setMaxSpeedPtr, NIL)
  }

  public final fun getMaxSpeed(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMaxSpeedPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setPathMaxDistance(maxSpeed: Float): Unit {
    TransferContext.writeArguments(DOUBLE to maxSpeed.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setPathMaxDistancePtr, NIL)
  }

  public final fun getPathMaxDistance(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPathMaxDistancePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setNavigationLayers(navigationLayers: Long): Unit {
    TransferContext.writeArguments(LONG to navigationLayers)
    TransferContext.callMethod(ptr, MethodBindings.setNavigationLayersPtr, NIL)
  }

  public final fun getNavigationLayers(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNavigationLayersPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [navigationLayers] bitmask,
   * given a [layerNumber] between 1 and 32.
   */
  public final fun setNavigationLayerValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(ptr, MethodBindings.setNavigationLayerValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [navigationLayers] bitmask is enabled, given
   * a [layerNumber] between 1 and 32.
   */
  public final fun getNavigationLayerValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getNavigationLayerValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final
      fun setPathfindingAlgorithm(pathfindingAlgorithm: NavigationPathQueryParameters3D.PathfindingAlgorithm):
      Unit {
    TransferContext.writeArguments(LONG to pathfindingAlgorithm.id)
    TransferContext.callMethod(ptr, MethodBindings.setPathfindingAlgorithmPtr, NIL)
  }

  public final fun getPathfindingAlgorithm(): NavigationPathQueryParameters3D.PathfindingAlgorithm {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPathfindingAlgorithmPtr, LONG)
    return NavigationPathQueryParameters3D.PathfindingAlgorithm.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final
      fun setPathPostprocessing(pathPostprocessing: NavigationPathQueryParameters3D.PathPostProcessing):
      Unit {
    TransferContext.writeArguments(LONG to pathPostprocessing.id)
    TransferContext.callMethod(ptr, MethodBindings.setPathPostprocessingPtr, NIL)
  }

  public final fun getPathPostprocessing(): NavigationPathQueryParameters3D.PathPostProcessing {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPathPostprocessingPtr, LONG)
    return NavigationPathQueryParameters3D.PathPostProcessing.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setPathMetadataFlags(flags: NavigationPathQueryParameters3D.PathMetadataFlags):
      Unit {
    TransferContext.writeArguments(LONG to flags.flag)
    TransferContext.callMethod(ptr, MethodBindings.setPathMetadataFlagsPtr, NIL)
  }

  public final fun getPathMetadataFlags(): NavigationPathQueryParameters3D.PathMetadataFlags {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPathMetadataFlagsPtr, LONG)
    return PathMetadataFlagsValue(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the [RID] of the navigation map this NavigationAgent node should use and also updates the
   * `agent` on the NavigationServer.
   */
  public final fun setNavigationMap(navigationMap: RID): Unit {
    TransferContext.writeArguments(_RID to navigationMap)
    TransferContext.callMethod(ptr, MethodBindings.setNavigationMapPtr, NIL)
  }

  /**
   * Returns the [RID] of the navigation map for this NavigationAgent node. This function returns
   * always the map set on the NavigationAgent node and not the map of the abstract agent on the
   * NavigationServer. If the agent map is changed directly with the NavigationServer API the
   * NavigationAgent node will not be aware of the map change. Use [setNavigationMap] to change the
   * navigation map for the NavigationAgent and also update the agent on the NavigationServer.
   */
  public final fun getNavigationMap(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNavigationMapPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public final fun setTargetPosition(position: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to position)
    TransferContext.callMethod(ptr, MethodBindings.setTargetPositionPtr, NIL)
  }

  public final fun getTargetPosition(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTargetPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setSimplifyPath(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setSimplifyPathPtr, NIL)
  }

  public final fun getSimplifyPath(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSimplifyPathPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSimplifyEpsilon(epsilon: Float): Unit {
    TransferContext.writeArguments(DOUBLE to epsilon.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSimplifyEpsilonPtr, NIL)
  }

  public final fun getSimplifyEpsilon(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSimplifyEpsilonPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the next position in global coordinates that can be moved to, making sure that there
   * are no static objects in the way. If the agent does not have a navigation path, it will return the
   * position of the agent's parent. The use of this function once every physics frame is required to
   * update the internal path logic of the NavigationAgent.
   */
  public final fun getNextPathPosition(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNextPathPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Replaces the internal velocity in the collision avoidance simulation with [velocity]. When an
   * agent is teleported to a new position this function should be used in the same frame. If called
   * frequently this function can get agents stuck.
   */
  public final fun setVelocityForced(velocity: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to velocity)
    TransferContext.callMethod(ptr, MethodBindings.setVelocityForcedPtr, NIL)
  }

  public final fun setVelocity(velocity: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to velocity)
    TransferContext.callMethod(ptr, MethodBindings.setVelocityPtr, NIL)
  }

  public final fun getVelocity(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVelocityPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the distance to the target position, using the agent's global position. The user must
   * set [targetPosition] in order for this to be accurate.
   */
  public final fun distanceToTarget(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.distanceToTargetPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the path query result for the path the agent is currently following.
   */
  public final fun getCurrentNavigationResult(): NavigationPathQueryResult3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCurrentNavigationResultPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as NavigationPathQueryResult3D?)
  }

  /**
   * Returns this agent's current path from start to finish in global coordinates. The path only
   * updates when the target position is changed or the agent requires a repath. The path array is not
   * intended to be used in direct path movement as the agent has its own internal path logic that
   * would get corrupted by changing the path array manually. Use the intended [getNextPathPosition]
   * once every physics frame to receive the next path point for the agents movement as this function
   * also updates the internal path logic.
   */
  public final fun getCurrentNavigationPath(): PackedVector3Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCurrentNavigationPathPtr,
        PACKED_VECTOR3_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY) as PackedVector3Array)
  }

  /**
   * Returns which index the agent is currently on in the navigation path's [PackedVector3Array].
   */
  public final fun getCurrentNavigationPathIndex(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCurrentNavigationPathIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns `true` if the agent reached the target, i.e. the agent moved within
   * [targetDesiredDistance] of the [targetPosition]. It may not always be possible to reach the target
   * but it should always be possible to reach the final position. See [getFinalPosition].
   */
  public final fun isTargetReached(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isTargetReachedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if [getFinalPosition] is within [targetDesiredDistance] of the [targetPosition].
   */
  public final fun isTargetReachable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isTargetReachablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the agent's navigation has finished. If the target is reachable, navigation
   * ends when the target is reached. If the target is unreachable, navigation ends when the last
   * waypoint of the path is reached.
   * **Note:** While `true` prefer to stop calling update functions like [getNextPathPosition]. This
   * avoids jittering the standing agent due to calling repeated path updates.
   */
  public final fun isNavigationFinished(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isNavigationFinishedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the reachable final position of the current navigation path in global coordinates. This
   * position can change if the agent needs to update the navigation path which makes the agent emit
   * the [signal path_changed] signal.
   */
  public final fun getFinalPosition(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFinalPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setAvoidanceLayers(layers: Long): Unit {
    TransferContext.writeArguments(LONG to layers)
    TransferContext.callMethod(ptr, MethodBindings.setAvoidanceLayersPtr, NIL)
  }

  public final fun getAvoidanceLayers(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAvoidanceLayersPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setAvoidanceMask(mask: Long): Unit {
    TransferContext.writeArguments(LONG to mask)
    TransferContext.callMethod(ptr, MethodBindings.setAvoidanceMaskPtr, NIL)
  }

  public final fun getAvoidanceMask(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAvoidanceMaskPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [avoidanceLayers] bitmask,
   * given a [layerNumber] between 1 and 32.
   */
  public final fun setAvoidanceLayerValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(ptr, MethodBindings.setAvoidanceLayerValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [avoidanceLayers] bitmask is enabled, given a
   * [layerNumber] between 1 and 32.
   */
  public final fun getAvoidanceLayerValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getAvoidanceLayerValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Based on [value], enables or disables the specified mask in the [avoidanceMask] bitmask, given
   * a [maskNumber] between 1 and 32.
   */
  public final fun setAvoidanceMaskValue(maskNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to maskNumber.toLong(), BOOL to value)
    TransferContext.callMethod(ptr, MethodBindings.setAvoidanceMaskValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified mask of the [avoidanceMask] bitmask is enabled, given a
   * [maskNumber] between 1 and 32.
   */
  public final fun getAvoidanceMaskValue(maskNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to maskNumber.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getAvoidanceMaskValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAvoidancePriority(priority: Float): Unit {
    TransferContext.writeArguments(DOUBLE to priority.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setAvoidancePriorityPtr, NIL)
  }

  public final fun getAvoidancePriority(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAvoidancePriorityPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDebugEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setDebugEnabledPtr, NIL)
  }

  public final fun getDebugEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDebugEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDebugUseCustom(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setDebugUseCustomPtr, NIL)
  }

  public final fun getDebugUseCustom(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDebugUseCustomPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDebugPathCustomColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setDebugPathCustomColorPtr, NIL)
  }

  public final fun getDebugPathCustomColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDebugPathCustomColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setDebugPathCustomPointSize(pointSize: Float): Unit {
    TransferContext.writeArguments(DOUBLE to pointSize.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setDebugPathCustomPointSizePtr, NIL)
  }

  public final fun getDebugPathCustomPointSize(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDebugPathCustomPointSizePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  internal object MethodBindings {
    public val getRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "get_rid", 2944877500)

    public val setAvoidanceEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "set_avoidance_enabled", 2586408642)

    public val getAvoidanceEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "get_avoidance_enabled", 36873697)

    public val setPathDesiredDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "set_path_desired_distance", 373806689)

    public val getPathDesiredDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "get_path_desired_distance", 1740695150)

    public val setTargetDesiredDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "set_target_desired_distance", 373806689)

    public val getTargetDesiredDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "get_target_desired_distance", 1740695150)

    public val setRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "set_radius", 373806689)

    public val getRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "get_radius", 1740695150)

    public val setHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "set_height", 373806689)

    public val getHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "get_height", 1740695150)

    public val setPathHeightOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "set_path_height_offset", 373806689)

    public val getPathHeightOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "get_path_height_offset", 1740695150)

    public val setUse3dAvoidancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "set_use_3d_avoidance", 2586408642)

    public val getUse3dAvoidancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "get_use_3d_avoidance", 36873697)

    public val setKeepYVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "set_keep_y_velocity", 2586408642)

    public val getKeepYVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "get_keep_y_velocity", 36873697)

    public val setNeighborDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "set_neighbor_distance", 373806689)

    public val getNeighborDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "get_neighbor_distance", 1740695150)

    public val setMaxNeighborsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "set_max_neighbors", 1286410249)

    public val getMaxNeighborsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "get_max_neighbors", 3905245786)

    public val setTimeHorizonAgentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "set_time_horizon_agents", 373806689)

    public val getTimeHorizonAgentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "get_time_horizon_agents", 1740695150)

    public val setTimeHorizonObstaclesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "set_time_horizon_obstacles", 373806689)

    public val getTimeHorizonObstaclesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "get_time_horizon_obstacles", 1740695150)

    public val setMaxSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "set_max_speed", 373806689)

    public val getMaxSpeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "get_max_speed", 1740695150)

    public val setPathMaxDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "set_path_max_distance", 373806689)

    public val getPathMaxDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "get_path_max_distance", 191475506)

    public val setNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "set_navigation_layers", 1286410249)

    public val getNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "get_navigation_layers", 3905245786)

    public val setNavigationLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "set_navigation_layer_value", 300928843)

    public val getNavigationLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "get_navigation_layer_value", 1116898809)

    public val setPathfindingAlgorithmPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "set_pathfinding_algorithm", 394560454)

    public val getPathfindingAlgorithmPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "get_pathfinding_algorithm", 3398491350)

    public val setPathPostprocessingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "set_path_postprocessing", 2267362344)

    public val getPathPostprocessingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "get_path_postprocessing", 3883858360)

    public val setPathMetadataFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "set_path_metadata_flags", 2713846708)

    public val getPathMetadataFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "get_path_metadata_flags", 1582332802)

    public val setNavigationMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "set_navigation_map", 2722037293)

    public val getNavigationMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "get_navigation_map", 2944877500)

    public val setTargetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "set_target_position", 3460891852)

    public val getTargetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "get_target_position", 3360562783)

    public val setSimplifyPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "set_simplify_path", 2586408642)

    public val getSimplifyPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "get_simplify_path", 36873697)

    public val setSimplifyEpsilonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "set_simplify_epsilon", 373806689)

    public val getSimplifyEpsilonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "get_simplify_epsilon", 1740695150)

    public val getNextPathPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "get_next_path_position", 3783033775)

    public val setVelocityForcedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "set_velocity_forced", 3460891852)

    public val setVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "set_velocity", 3460891852)

    public val getVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "get_velocity", 3783033775)

    public val distanceToTargetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "distance_to_target", 1740695150)

    public val getCurrentNavigationResultPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "get_current_navigation_result", 728825684)

    public val getCurrentNavigationPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "get_current_navigation_path", 497664490)

    public val getCurrentNavigationPathIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "get_current_navigation_path_index", 3905245786)

    public val isTargetReachedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "is_target_reached", 36873697)

    public val isTargetReachablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "is_target_reachable", 2240911060)

    public val isNavigationFinishedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "is_navigation_finished", 2240911060)

    public val getFinalPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "get_final_position", 3783033775)

    public val setAvoidanceLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "set_avoidance_layers", 1286410249)

    public val getAvoidanceLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "get_avoidance_layers", 3905245786)

    public val setAvoidanceMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "set_avoidance_mask", 1286410249)

    public val getAvoidanceMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "get_avoidance_mask", 3905245786)

    public val setAvoidanceLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "set_avoidance_layer_value", 300928843)

    public val getAvoidanceLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "get_avoidance_layer_value", 1116898809)

    public val setAvoidanceMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "set_avoidance_mask_value", 300928843)

    public val getAvoidanceMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "get_avoidance_mask_value", 1116898809)

    public val setAvoidancePriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "set_avoidance_priority", 373806689)

    public val getAvoidancePriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "get_avoidance_priority", 1740695150)

    public val setDebugEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "set_debug_enabled", 2586408642)

    public val getDebugEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "get_debug_enabled", 36873697)

    public val setDebugUseCustomPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "set_debug_use_custom", 2586408642)

    public val getDebugUseCustomPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "get_debug_use_custom", 36873697)

    public val setDebugPathCustomColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "set_debug_path_custom_color", 2920490490)

    public val getDebugPathCustomColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "get_debug_path_custom_color", 3444240500)

    public val setDebugPathCustomPointSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "set_debug_path_custom_point_size", 373806689)

    public val getDebugPathCustomPointSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationAgent3D", "get_debug_path_custom_point_size", 1740695150)
  }
}
