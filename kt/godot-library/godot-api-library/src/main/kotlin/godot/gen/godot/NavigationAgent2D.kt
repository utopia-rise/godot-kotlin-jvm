// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.NavigationPathQueryParameters2D.PathMetadataFlagsValue
import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Dictionary
import godot.core.PackedVector2Array
import godot.core.RID
import godot.core.Signal0
import godot.core.Signal1
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_VECTOR2_ARRAY
import godot.core.VariantParser.VECTOR2
import godot.core.VariantParser._RID
import godot.core.Vector2
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_NAVIGATIONAGENT2D_INDEX: Int = 388

/**
 * A 2D agent used to pathfind to a position while avoiding static and dynamic obstacles. The
 * calculation can be used by the parent node to dynamically move it along the path. Requires
 * navigation data to work correctly.
 * Dynamic obstacles are avoided using RVO collision avoidance. Avoidance is computed before
 * physics, so the pathfinding information can be used safely in the physics step.
 * **Note:** After setting the [targetPosition] property, the [getNextPathPosition] method must be
 * used once every physics frame to update the internal path logic of the navigation agent. The vector
 * position it returns should be used as the next movement position for the agent's parent node.
 */
@GodotBaseType
public open class NavigationAgent2D : Node() {
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
   * - `type`: Always [NavigationPathQueryResult2D.PATH_SEGMENT_TYPE_LINK].
   * - `rid`: The [RID] of the link.
   * - `owner`: The object which manages the link (usually [NavigationLink2D]).
   * - `link_entry_position`: If `owner` is available and the owner is a [NavigationLink2D], it will
   * contain the global position of the link's point the agent is entering.
   * - `link_exit_position`: If `owner` is available and the owner is a [NavigationLink2D], it will
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
  public val velocityComputed: Signal1<Vector2> by Signal1

  /**
   * If set, a new navigation path from the current agent position to the [targetPosition] is
   * requested from the NavigationServer.
   */
  @CoreTypeLocalCopy
  public final inline var targetPosition: Vector2
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
  public final inline var pathfindingAlgorithm: NavigationPathQueryParameters2D.PathfindingAlgorithm
    @JvmName("pathfindingAlgorithmProperty")
    get() = getPathfindingAlgorithm()
    @JvmName("pathfindingAlgorithmProperty")
    set(`value`) {
      setPathfindingAlgorithm(value)
    }

  /**
   * The path postprocessing applied to the raw path corridor found by the [pathfindingAlgorithm].
   */
  public final inline var pathPostprocessing: NavigationPathQueryParameters2D.PathPostProcessing
    @JvmName("pathPostprocessingProperty")
    get() = getPathPostprocessing()
    @JvmName("pathPostprocessingProperty")
    set(`value`) {
      setPathPostprocessing(value)
    }

  /**
   * Additional information to return with the navigation path.
   */
  public final inline var pathMetadataFlags: NavigationPathQueryParameters2D.PathMetadataFlags
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
   * If `true` the agent is registered for an RVO avoidance callback on the [NavigationServer2D].
   * When [velocity] is used and the processing is completed a `safe_velocity` Vector2 is received with
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
  public final inline var velocity: Vector2
    @JvmName("velocityProperty")
    get() = getVelocity()
    @JvmName("velocityProperty")
    set(`value`) {
      setVelocity(value)
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

  /**
   * If [debugUseCustom] is `true` uses this line width for rendering paths for this agent instead
   * of global line width.
   */
  public final inline var debugPathCustomLineWidth: Float
    @JvmName("debugPathCustomLineWidthProperty")
    get() = getDebugPathCustomLineWidth()
    @JvmName("debugPathCustomLineWidthProperty")
    set(`value`) {
      setDebugPathCustomLineWidth(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_NAVIGATIONAGENT2D_INDEX, scriptIndex)
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
   * val myCoreType = navigationagent2d.targetPosition
   * //Your changes
   * navigationagent2d.targetPosition = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun targetPositionMutate(block: Vector2.() -> Unit): Vector2 = targetPosition.apply{
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
   * val myCoreType = navigationagent2d.velocity
   * //Your changes
   * navigationagent2d.velocity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun velocityMutate(block: Vector2.() -> Unit): Vector2 = velocity.apply{
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
   * val myCoreType = navigationagent2d.debugPathCustomColor
   * //Your changes
   * navigationagent2d.debugPathCustomColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun debugPathCustomColorMutate(block: Color.() -> Unit): Color =
      debugPathCustomColor.apply{
      block(this)
      debugPathCustomColor = this
  }


  /**
   * Returns the [RID] of this agent on the [NavigationServer2D].
   */
  public final fun getRid(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRidPtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  public final fun setAvoidanceEnabled(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setAvoidanceEnabledPtr, NIL)
  }

  public final fun getAvoidanceEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAvoidanceEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setPathDesiredDistance(desiredDistance: Float): Unit {
    Internals.writeArguments(DOUBLE to desiredDistance.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setPathDesiredDistancePtr, NIL)
  }

  public final fun getPathDesiredDistance(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPathDesiredDistancePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setTargetDesiredDistance(desiredDistance: Float): Unit {
    Internals.writeArguments(DOUBLE to desiredDistance.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setTargetDesiredDistancePtr, NIL)
  }

  public final fun getTargetDesiredDistance(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTargetDesiredDistancePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRadius(radius: Float): Unit {
    Internals.writeArguments(DOUBLE to radius.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setRadiusPtr, NIL)
  }

  public final fun getRadius(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRadiusPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setNeighborDistance(neighborDistance: Float): Unit {
    Internals.writeArguments(DOUBLE to neighborDistance.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setNeighborDistancePtr, NIL)
  }

  public final fun getNeighborDistance(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getNeighborDistancePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setMaxNeighbors(maxNeighbors: Int): Unit {
    Internals.writeArguments(LONG to maxNeighbors.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setMaxNeighborsPtr, NIL)
  }

  public final fun getMaxNeighbors(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMaxNeighborsPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setTimeHorizonAgents(timeHorizon: Float): Unit {
    Internals.writeArguments(DOUBLE to timeHorizon.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setTimeHorizonAgentsPtr, NIL)
  }

  public final fun getTimeHorizonAgents(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTimeHorizonAgentsPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setTimeHorizonObstacles(timeHorizon: Float): Unit {
    Internals.writeArguments(DOUBLE to timeHorizon.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setTimeHorizonObstaclesPtr, NIL)
  }

  public final fun getTimeHorizonObstacles(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTimeHorizonObstaclesPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setMaxSpeed(maxSpeed: Float): Unit {
    Internals.writeArguments(DOUBLE to maxSpeed.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setMaxSpeedPtr, NIL)
  }

  public final fun getMaxSpeed(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMaxSpeedPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setPathMaxDistance(maxSpeed: Float): Unit {
    Internals.writeArguments(DOUBLE to maxSpeed.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setPathMaxDistancePtr, NIL)
  }

  public final fun getPathMaxDistance(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPathMaxDistancePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setNavigationLayers(navigationLayers: Long): Unit {
    Internals.writeArguments(LONG to navigationLayers)
    Internals.callMethod(rawPtr, MethodBindings.setNavigationLayersPtr, NIL)
  }

  public final fun getNavigationLayers(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getNavigationLayersPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [navigationLayers] bitmask,
   * given a [layerNumber] between 1 and 32.
   */
  public final fun setNavigationLayerValue(layerNumber: Int, `value`: Boolean): Unit {
    Internals.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    Internals.callMethod(rawPtr, MethodBindings.setNavigationLayerValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [navigationLayers] bitmask is enabled, given
   * a [layerNumber] between 1 and 32.
   */
  public final fun getNavigationLayerValue(layerNumber: Int): Boolean {
    Internals.writeArguments(LONG to layerNumber.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getNavigationLayerValuePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final
      fun setPathfindingAlgorithm(pathfindingAlgorithm: NavigationPathQueryParameters2D.PathfindingAlgorithm):
      Unit {
    Internals.writeArguments(LONG to pathfindingAlgorithm.id)
    Internals.callMethod(rawPtr, MethodBindings.setPathfindingAlgorithmPtr, NIL)
  }

  public final fun getPathfindingAlgorithm(): NavigationPathQueryParameters2D.PathfindingAlgorithm {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPathfindingAlgorithmPtr, LONG)
    return NavigationPathQueryParameters2D.PathfindingAlgorithm.from(Internals.readReturnValue(LONG) as Long)
  }

  public final
      fun setPathPostprocessing(pathPostprocessing: NavigationPathQueryParameters2D.PathPostProcessing):
      Unit {
    Internals.writeArguments(LONG to pathPostprocessing.id)
    Internals.callMethod(rawPtr, MethodBindings.setPathPostprocessingPtr, NIL)
  }

  public final fun getPathPostprocessing(): NavigationPathQueryParameters2D.PathPostProcessing {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPathPostprocessingPtr, LONG)
    return NavigationPathQueryParameters2D.PathPostProcessing.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setPathMetadataFlags(flags: NavigationPathQueryParameters2D.PathMetadataFlags):
      Unit {
    Internals.writeArguments(LONG to flags.flag)
    Internals.callMethod(rawPtr, MethodBindings.setPathMetadataFlagsPtr, NIL)
  }

  public final fun getPathMetadataFlags(): NavigationPathQueryParameters2D.PathMetadataFlags {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPathMetadataFlagsPtr, LONG)
    return PathMetadataFlagsValue(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the [RID] of the navigation map this NavigationAgent node should use and also updates the
   * `agent` on the NavigationServer.
   */
  public final fun setNavigationMap(navigationMap: RID): Unit {
    Internals.writeArguments(_RID to navigationMap)
    Internals.callMethod(rawPtr, MethodBindings.setNavigationMapPtr, NIL)
  }

  /**
   * Returns the [RID] of the navigation map for this NavigationAgent node. This function returns
   * always the map set on the NavigationAgent node and not the map of the abstract agent on the
   * NavigationServer. If the agent map is changed directly with the NavigationServer API the
   * NavigationAgent node will not be aware of the map change. Use [setNavigationMap] to change the
   * navigation map for the NavigationAgent and also update the agent on the NavigationServer.
   */
  public final fun getNavigationMap(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getNavigationMapPtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  public final fun setTargetPosition(position: Vector2): Unit {
    Internals.writeArguments(VECTOR2 to position)
    Internals.callMethod(rawPtr, MethodBindings.setTargetPositionPtr, NIL)
  }

  public final fun getTargetPosition(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTargetPositionPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setSimplifyPath(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setSimplifyPathPtr, NIL)
  }

  public final fun getSimplifyPath(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSimplifyPathPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSimplifyEpsilon(epsilon: Float): Unit {
    Internals.writeArguments(DOUBLE to epsilon.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setSimplifyEpsilonPtr, NIL)
  }

  public final fun getSimplifyEpsilon(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSimplifyEpsilonPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the next position in global coordinates that can be moved to, making sure that there
   * are no static objects in the way. If the agent does not have a navigation path, it will return the
   * position of the agent's parent. The use of this function once every physics frame is required to
   * update the internal path logic of the NavigationAgent.
   */
  public final fun getNextPathPosition(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getNextPathPositionPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Replaces the internal velocity in the collision avoidance simulation with [velocity]. When an
   * agent is teleported to a new position this function should be used in the same frame. If called
   * frequently this function can get agents stuck.
   */
  public final fun setVelocityForced(velocity: Vector2): Unit {
    Internals.writeArguments(VECTOR2 to velocity)
    Internals.callMethod(rawPtr, MethodBindings.setVelocityForcedPtr, NIL)
  }

  public final fun setVelocity(velocity: Vector2): Unit {
    Internals.writeArguments(VECTOR2 to velocity)
    Internals.callMethod(rawPtr, MethodBindings.setVelocityPtr, NIL)
  }

  public final fun getVelocity(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getVelocityPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns the distance to the target position, using the agent's global position. The user must
   * set [targetPosition] in order for this to be accurate.
   */
  public final fun distanceToTarget(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.distanceToTargetPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the path query result for the path the agent is currently following.
   */
  public final fun getCurrentNavigationResult(): NavigationPathQueryResult2D? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCurrentNavigationResultPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as NavigationPathQueryResult2D?)
  }

  /**
   * Returns this agent's current path from start to finish in global coordinates. The path only
   * updates when the target position is changed or the agent requires a repath. The path array is not
   * intended to be used in direct path movement as the agent has its own internal path logic that
   * would get corrupted by changing the path array manually. Use the intended [getNextPathPosition]
   * once every physics frame to receive the next path point for the agents movement as this function
   * also updates the internal path logic.
   */
  public final fun getCurrentNavigationPath(): PackedVector2Array {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCurrentNavigationPathPtr, PACKED_VECTOR2_ARRAY)
    return (Internals.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
  }

  /**
   * Returns which index the agent is currently on in the navigation path's [PackedVector2Array].
   */
  public final fun getCurrentNavigationPathIndex(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCurrentNavigationPathIndexPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns `true` if the agent reached the target, i.e. the agent moved within
   * [targetDesiredDistance] of the [targetPosition]. It may not always be possible to reach the target
   * but it should always be possible to reach the final position. See [getFinalPosition].
   */
  public final fun isTargetReached(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isTargetReachedPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if [getFinalPosition] is within [targetDesiredDistance] of the [targetPosition].
   */
  public final fun isTargetReachable(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isTargetReachablePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the agent's navigation has finished. If the target is reachable, navigation
   * ends when the target is reached. If the target is unreachable, navigation ends when the last
   * waypoint of the path is reached.
   * **Note:** While `true` prefer to stop calling update functions like [getNextPathPosition]. This
   * avoids jittering the standing agent due to calling repeated path updates.
   */
  public final fun isNavigationFinished(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isNavigationFinishedPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the reachable final position of the current navigation path in global coordinates. This
   * position can change if the agent needs to update the navigation path which makes the agent emit
   * the [signal path_changed] signal.
   */
  public final fun getFinalPosition(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFinalPositionPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setAvoidanceLayers(layers: Long): Unit {
    Internals.writeArguments(LONG to layers)
    Internals.callMethod(rawPtr, MethodBindings.setAvoidanceLayersPtr, NIL)
  }

  public final fun getAvoidanceLayers(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAvoidanceLayersPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  public final fun setAvoidanceMask(mask: Long): Unit {
    Internals.writeArguments(LONG to mask)
    Internals.callMethod(rawPtr, MethodBindings.setAvoidanceMaskPtr, NIL)
  }

  public final fun getAvoidanceMask(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAvoidanceMaskPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [avoidanceLayers] bitmask,
   * given a [layerNumber] between 1 and 32.
   */
  public final fun setAvoidanceLayerValue(layerNumber: Int, `value`: Boolean): Unit {
    Internals.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    Internals.callMethod(rawPtr, MethodBindings.setAvoidanceLayerValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [avoidanceLayers] bitmask is enabled, given a
   * [layerNumber] between 1 and 32.
   */
  public final fun getAvoidanceLayerValue(layerNumber: Int): Boolean {
    Internals.writeArguments(LONG to layerNumber.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getAvoidanceLayerValuePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Based on [value], enables or disables the specified mask in the [avoidanceMask] bitmask, given
   * a [maskNumber] between 1 and 32.
   */
  public final fun setAvoidanceMaskValue(maskNumber: Int, `value`: Boolean): Unit {
    Internals.writeArguments(LONG to maskNumber.toLong(), BOOL to value)
    Internals.callMethod(rawPtr, MethodBindings.setAvoidanceMaskValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified mask of the [avoidanceMask] bitmask is enabled, given a
   * [maskNumber] between 1 and 32.
   */
  public final fun getAvoidanceMaskValue(maskNumber: Int): Boolean {
    Internals.writeArguments(LONG to maskNumber.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getAvoidanceMaskValuePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAvoidancePriority(priority: Float): Unit {
    Internals.writeArguments(DOUBLE to priority.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setAvoidancePriorityPtr, NIL)
  }

  public final fun getAvoidancePriority(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAvoidancePriorityPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDebugEnabled(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setDebugEnabledPtr, NIL)
  }

  public final fun getDebugEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDebugEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDebugUseCustom(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setDebugUseCustomPtr, NIL)
  }

  public final fun getDebugUseCustom(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDebugUseCustomPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDebugPathCustomColor(color: Color): Unit {
    Internals.writeArguments(COLOR to color)
    Internals.callMethod(rawPtr, MethodBindings.setDebugPathCustomColorPtr, NIL)
  }

  public final fun getDebugPathCustomColor(): Color {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDebugPathCustomColorPtr, COLOR)
    return (Internals.readReturnValue(COLOR) as Color)
  }

  public final fun setDebugPathCustomPointSize(pointSize: Float): Unit {
    Internals.writeArguments(DOUBLE to pointSize.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setDebugPathCustomPointSizePtr, NIL)
  }

  public final fun getDebugPathCustomPointSize(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDebugPathCustomPointSizePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDebugPathCustomLineWidth(lineWidth: Float): Unit {
    Internals.writeArguments(DOUBLE to lineWidth.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setDebugPathCustomLineWidthPtr, NIL)
  }

  public final fun getDebugPathCustomLineWidth(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDebugPathCustomLineWidthPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  public object MethodBindings {
    internal val getRidPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "get_rid", 2944877500)

    internal val setAvoidanceEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "set_avoidance_enabled", 2586408642)

    internal val getAvoidanceEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "get_avoidance_enabled", 36873697)

    internal val setPathDesiredDistancePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "set_path_desired_distance", 373806689)

    internal val getPathDesiredDistancePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "get_path_desired_distance", 1740695150)

    internal val setTargetDesiredDistancePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "set_target_desired_distance", 373806689)

    internal val getTargetDesiredDistancePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "get_target_desired_distance", 1740695150)

    internal val setRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "set_radius", 373806689)

    internal val getRadiusPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "get_radius", 1740695150)

    internal val setNeighborDistancePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "set_neighbor_distance", 373806689)

    internal val getNeighborDistancePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "get_neighbor_distance", 1740695150)

    internal val setMaxNeighborsPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "set_max_neighbors", 1286410249)

    internal val getMaxNeighborsPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "get_max_neighbors", 3905245786)

    internal val setTimeHorizonAgentsPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "set_time_horizon_agents", 373806689)

    internal val getTimeHorizonAgentsPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "get_time_horizon_agents", 1740695150)

    internal val setTimeHorizonObstaclesPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "set_time_horizon_obstacles", 373806689)

    internal val getTimeHorizonObstaclesPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "get_time_horizon_obstacles", 1740695150)

    internal val setMaxSpeedPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "set_max_speed", 373806689)

    internal val getMaxSpeedPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "get_max_speed", 1740695150)

    internal val setPathMaxDistancePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "set_path_max_distance", 373806689)

    internal val getPathMaxDistancePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "get_path_max_distance", 191475506)

    internal val setNavigationLayersPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "set_navigation_layers", 1286410249)

    internal val getNavigationLayersPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "get_navigation_layers", 3905245786)

    internal val setNavigationLayerValuePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "set_navigation_layer_value", 300928843)

    internal val getNavigationLayerValuePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "get_navigation_layer_value", 1116898809)

    internal val setPathfindingAlgorithmPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "set_pathfinding_algorithm", 2783519915)

    internal val getPathfindingAlgorithmPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "get_pathfinding_algorithm", 3000421146)

    internal val setPathPostprocessingPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "set_path_postprocessing", 2864409082)

    internal val getPathPostprocessingPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "get_path_postprocessing", 3798118993)

    internal val setPathMetadataFlagsPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "set_path_metadata_flags", 24274129)

    internal val getPathMetadataFlagsPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "get_path_metadata_flags", 488152976)

    internal val setNavigationMapPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "set_navigation_map", 2722037293)

    internal val getNavigationMapPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "get_navigation_map", 2944877500)

    internal val setTargetPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "set_target_position", 743155724)

    internal val getTargetPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "get_target_position", 3341600327)

    internal val setSimplifyPathPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "set_simplify_path", 2586408642)

    internal val getSimplifyPathPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "get_simplify_path", 36873697)

    internal val setSimplifyEpsilonPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "set_simplify_epsilon", 373806689)

    internal val getSimplifyEpsilonPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "get_simplify_epsilon", 1740695150)

    internal val getNextPathPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "get_next_path_position", 1497962370)

    internal val setVelocityForcedPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "set_velocity_forced", 743155724)

    internal val setVelocityPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "set_velocity", 743155724)

    internal val getVelocityPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "get_velocity", 1497962370)

    internal val distanceToTargetPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "distance_to_target", 1740695150)

    internal val getCurrentNavigationResultPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "get_current_navigation_result", 166799483)

    internal val getCurrentNavigationPathPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "get_current_navigation_path", 2961356807)

    internal val getCurrentNavigationPathIndexPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "get_current_navigation_path_index", 3905245786)

    internal val isTargetReachedPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "is_target_reached", 36873697)

    internal val isTargetReachablePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "is_target_reachable", 2240911060)

    internal val isNavigationFinishedPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "is_navigation_finished", 2240911060)

    internal val getFinalPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "get_final_position", 1497962370)

    internal val setAvoidanceLayersPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "set_avoidance_layers", 1286410249)

    internal val getAvoidanceLayersPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "get_avoidance_layers", 3905245786)

    internal val setAvoidanceMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "set_avoidance_mask", 1286410249)

    internal val getAvoidanceMaskPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "get_avoidance_mask", 3905245786)

    internal val setAvoidanceLayerValuePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "set_avoidance_layer_value", 300928843)

    internal val getAvoidanceLayerValuePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "get_avoidance_layer_value", 1116898809)

    internal val setAvoidanceMaskValuePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "set_avoidance_mask_value", 300928843)

    internal val getAvoidanceMaskValuePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "get_avoidance_mask_value", 1116898809)

    internal val setAvoidancePriorityPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "set_avoidance_priority", 373806689)

    internal val getAvoidancePriorityPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "get_avoidance_priority", 1740695150)

    internal val setDebugEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "set_debug_enabled", 2586408642)

    internal val getDebugEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "get_debug_enabled", 36873697)

    internal val setDebugUseCustomPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "set_debug_use_custom", 2586408642)

    internal val getDebugUseCustomPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "get_debug_use_custom", 36873697)

    internal val setDebugPathCustomColorPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "set_debug_path_custom_color", 2920490490)

    internal val getDebugPathCustomColorPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "get_debug_path_custom_color", 3444240500)

    internal val setDebugPathCustomPointSizePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "set_debug_path_custom_point_size", 373806689)

    internal val getDebugPathCustomPointSizePtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "get_debug_path_custom_point_size", 1740695150)

    internal val setDebugPathCustomLineWidthPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "set_debug_path_custom_line_width", 373806689)

    internal val getDebugPathCustomLineWidthPtr: VoidPtr =
        Internals.getMethodBindPtr("NavigationAgent2D", "get_debug_path_custom_line_width", 1740695150)
  }
}
