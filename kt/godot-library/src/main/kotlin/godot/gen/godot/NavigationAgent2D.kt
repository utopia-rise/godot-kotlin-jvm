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
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A 2D agent used to pathfind to a position while avoiding obstacles.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/navigation/navigation_using_navigationagents.html]($DOCS_URL/tutorials/navigation/navigation_using_navigationagents.html)
 *
 * A 2D agent used to pathfind to a position while avoiding static and dynamic obstacles. The calculation can be used by the parent node to dynamically move it along the path. Requires navigation data to work correctly.
 *
 * Dynamic obstacles are avoided using RVO collision avoidance. Avoidance is computed before physics, so the pathfinding information can be used safely in the physics step.
 *
 * **Note:** After setting the [targetPosition] property, the [getNextPathPosition] method must be used once every physics frame to update the internal path logic of the navigation agent. The vector position it returns should be used as the next movement position for the agent's parent node.
 */
@GodotBaseType
public open class NavigationAgent2D : Node() {
  /**
   * Notifies when the navigation path changes.
   */
  public val pathChanged: Signal0 by signal()

  /**
   * Notifies when the player-defined [targetPosition] is reached.
   */
  public val targetReached: Signal0 by signal()

  /**
   * Notifies when a waypoint along the path has been reached.
   *
   * The details dictionary may contain the following keys depending on the value of [pathMetadataFlags]:
   *
   * - `position`: The position of the waypoint that was reached.
   *
   * - `type`: The type of navigation primitive (region or link) that contains this waypoint.
   *
   * - `rid`: The [RID] of the containing navigation primitive (region or link).
   *
   * - `owner`: The object which manages the containing navigation primitive (region or link).
   */
  public val waypointReached: Signal1<Dictionary<Any?, Any?>> by signal("details")

  /**
   * Notifies when a navigation link has been reached.
   *
   * The details dictionary may contain the following keys depending on the value of [pathMetadataFlags]:
   *
   * - `position`: The start position of the link that was reached.
   *
   * - `type`: Always [godot.NavigationPathQueryResult2D.PATH_SEGMENT_TYPE_LINK].
   *
   * - `rid`: The [RID] of the link.
   *
   * - `owner`: The object which manages the link (usually [godot.NavigationLink2D]).
   *
   * - `link_entry_position`: If `owner` is available and the owner is a [godot.NavigationLink2D], it will contain the global position of the link's point the agent is entering.
   *
   * - `link_exit_position`: If `owner` is available and the owner is a [godot.NavigationLink2D], it will contain the global position of the link's point which the agent is exiting.
   */
  public val linkReached: Signal1<Dictionary<Any?, Any?>> by signal("details")

  /**
   * Notifies when the final position is reached.
   */
  public val navigationFinished: Signal0 by signal()

  /**
   * Notifies when the collision avoidance velocity is calculated. Emitted when [velocity] is set. Only emitted when [avoidanceEnabled] is true.
   */
  public val velocityComputed: Signal1<Vector2> by signal("safeVelocity")

  /**
   * If set a new navigation path from the current agent position to the [targetPosition] is requested from the NavigationServer.
   */
  @CoreTypeLocalCopy
  public var targetPosition: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_TARGET_POSITION, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_SET_TARGET_POSITION, NIL)
    }

  /**
   * The distance threshold before a path point is considered to be reached. This allows agents to not have to hit a path point on the path exactly, but only to reach its general area. If this value is set too high, the NavigationAgent will skip points on the path, which can lead too leaving the navigation mesh. If this value is set too low, the NavigationAgent will be stuck in a repath loop because it will constantly overshoot or undershoot the distance to the next point on each physics frame update.
   */
  public var pathDesiredDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_PATH_DESIRED_DISTANCE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_SET_PATH_DESIRED_DISTANCE, NIL)
    }

  /**
   * The distance threshold before the final target point is considered to be reached. This allows agents to not have to hit the point of the final target exactly, but only to reach its general area. If this value is set too low, the NavigationAgent will be stuck in a repath loop because it will constantly overshoot or undershoot the distance to the final target point on each physics frame update.
   */
  public var targetDesiredDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_TARGET_DESIRED_DISTANCE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_SET_TARGET_DESIRED_DISTANCE, NIL)
    }

  /**
   * The maximum distance the agent is allowed away from the ideal path to the final position. This can happen due to trying to avoid collisions. When the maximum distance is exceeded, it recalculates the ideal path.
   */
  public var pathMaxDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_PATH_MAX_DISTANCE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_SET_PATH_MAX_DISTANCE, NIL)
    }

  /**
   * A bitfield determining which navigation layers of navigation regions this agent will use to calculate a path. Changing it during runtime will clear the current navigation path and generate a new one, according to the new navigation layers.
   */
  public var navigationLayers: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_NAVIGATION_LAYERS, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_SET_NAVIGATION_LAYERS, NIL)
    }

  /**
   * The pathfinding algorithm used in the path query.
   */
  public var pathfindingAlgorithm: NavigationPathQueryParameters2D.PathfindingAlgorithm
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_PATHFINDING_ALGORITHM, LONG)
      return NavigationPathQueryParameters2D.PathfindingAlgorithm.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_SET_PATHFINDING_ALGORITHM, NIL)
    }

  /**
   * The path postprocessing applied to the raw path corridor found by the [pathfindingAlgorithm].
   */
  public var pathPostprocessing: NavigationPathQueryParameters2D.PathPostProcessing
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_PATH_POSTPROCESSING, LONG)
      return NavigationPathQueryParameters2D.PathPostProcessing.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_SET_PATH_POSTPROCESSING, NIL)
    }

  /**
   * Additional information to return with the navigation path.
   */
  public var pathMetadataFlags: NavigationPathQueryParameters2D.PathMetadataFlags
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_PATH_METADATA_FLAGS, LONG)
      return PathMetadataFlagsValue(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.flag)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_SET_PATH_METADATA_FLAGS, NIL)
    }

  /**
   * If `true` the agent is registered for an RVO avoidance callback on the [godot.NavigationServer2D]. When [velocity] is used and the processing is completed a `safe_velocity` Vector2 is received with a signal connection to [velocityComputed]. Avoidance processing with many registered agents has a significant performance cost and should only be enabled on agents that currently require it.
   */
  public var avoidanceEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_AVOIDANCE_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_SET_AVOIDANCE_ENABLED, NIL)
    }

  /**
   * Sets the new wanted velocity for the agent. The avoidance simulation will try to fulfill this velocity if possible but will modify it to avoid collision with other agents and obstacles. When an agent is teleported to a new position, use [setVelocityForced] as well to reset the internal simulation velocity.
   */
  @CoreTypeLocalCopy
  public var velocity: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_VELOCITY,
          VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_SET_VELOCITY,
          NIL)
    }

  /**
   * The radius of the avoidance agent. This is the "body" of the avoidance agent and not the avoidance maneuver starting radius (which is controlled by [neighborDistance]).
   *
   * Does not affect normal pathfinding. To change an actor's pathfinding radius bake [godot.NavigationMesh] resources with a different [godot.NavigationMesh.agentRadius] property and use different navigation maps for each actor size.
   */
  public var radius: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_RADIUS,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_SET_RADIUS, NIL)
    }

  /**
   * The distance to search for other agents.
   */
  public var neighborDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_NEIGHBOR_DISTANCE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_SET_NEIGHBOR_DISTANCE, NIL)
    }

  /**
   * The maximum number of neighbors for the agent to consider.
   */
  public var maxNeighbors: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_MAX_NEIGHBORS, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_SET_MAX_NEIGHBORS, NIL)
    }

  /**
   * The minimal amount of time for which this agent's velocities, that are computed with the collision avoidance algorithm, are safe with respect to other agents. The larger the number, the sooner the agent will respond to other agents, but less freedom in choosing its velocities. A too high value will slow down agents movement considerably. Must be positive.
   */
  public var timeHorizonAgents: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_TIME_HORIZON_AGENTS, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_SET_TIME_HORIZON_AGENTS, NIL)
    }

  /**
   * The minimal amount of time for which this agent's velocities, that are computed with the collision avoidance algorithm, are safe with respect to static avoidance obstacles. The larger the number, the sooner the agent will respond to static avoidance obstacles, but less freedom in choosing its velocities. A too high value will slow down agents movement considerably. Must be positive.
   */
  public var timeHorizonObstacles: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_TIME_HORIZON_OBSTACLES, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_SET_TIME_HORIZON_OBSTACLES, NIL)
    }

  /**
   * The maximum speed that an agent can move.
   */
  public var maxSpeed: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_MAX_SPEED,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_SET_MAX_SPEED,
          NIL)
    }

  /**
   * A bitfield determining the avoidance layers for this NavigationAgent. Other agents with a matching bit on the [avoidanceMask] will avoid this agent.
   */
  public var avoidanceLayers: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_AVOIDANCE_LAYERS, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_SET_AVOIDANCE_LAYERS, NIL)
    }

  /**
   * A bitfield determining what other avoidance agents and obstacles this NavigationAgent will avoid when a bit matches at least one of their [avoidanceLayers].
   */
  public var avoidanceMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_AVOIDANCE_MASK, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_SET_AVOIDANCE_MASK, NIL)
    }

  /**
   * The agent does not adjust the velocity for other agents that would match the [avoidanceMask] but have a lower [avoidancePriority]. This in turn makes the other agents with lower priority adjust their velocities even more to avoid collision with this agent.
   */
  public var avoidancePriority: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_AVOIDANCE_PRIORITY, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_SET_AVOIDANCE_PRIORITY, NIL)
    }

  /**
   * If `true` shows debug visuals for this agent.
   */
  public var debugEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_DEBUG_ENABLED, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_SET_DEBUG_ENABLED, NIL)
    }

  /**
   * If `true` uses the defined [debugPathCustomColor] for this agent instead of global color.
   */
  public var debugUseCustom: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_DEBUG_USE_CUSTOM, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_SET_DEBUG_USE_CUSTOM, NIL)
    }

  /**
   * If [debugUseCustom] is `true` uses this color for this agent instead of global color.
   */
  @CoreTypeLocalCopy
  public var debugPathCustomColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_DEBUG_PATH_CUSTOM_COLOR, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_SET_DEBUG_PATH_CUSTOM_COLOR, NIL)
    }

  /**
   * If [debugUseCustom] is `true` uses this rasterized point size for rendering path points for this agent instead of global point size.
   */
  public var debugPathCustomPointSize: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_DEBUG_PATH_CUSTOM_POINT_SIZE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_SET_DEBUG_PATH_CUSTOM_POINT_SIZE, NIL)
    }

  /**
   * If [debugUseCustom] is `true` uses this line width for rendering paths for this agent instead of global line width.
   */
  public var debugPathCustomLineWidth: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_DEBUG_PATH_CUSTOM_LINE_WIDTH, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_SET_DEBUG_PATH_CUSTOM_LINE_WIDTH, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_NAVIGATIONAGENT2D, scriptIndex)
    return true
  }

  /**
   * If set a new navigation path from the current agent position to the [targetPosition] is requested from the NavigationServer.
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
  public open fun targetPositionMutate(block: Vector2.() -> Unit): Vector2 = targetPosition.apply{
      block(this)
      targetPosition = this
  }


  /**
   * Sets the new wanted velocity for the agent. The avoidance simulation will try to fulfill this velocity if possible but will modify it to avoid collision with other agents and obstacles. When an agent is teleported to a new position, use [setVelocityForced] as well to reset the internal simulation velocity.
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
  public open fun velocityMutate(block: Vector2.() -> Unit): Vector2 = velocity.apply{
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
  public open fun debugPathCustomColorMutate(block: Color.() -> Unit): Color =
      debugPathCustomColor.apply{
      block(this)
      debugPathCustomColor = this
  }


  /**
   * Returns the [RID] of this agent on the [godot.NavigationServer2D].
   */
  public fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_RID, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [navigationLayers] bitmask, given a [layerNumber] between 1 and 32.
   */
  public fun setNavigationLayerValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_SET_NAVIGATION_LAYER_VALUE, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [navigationLayers] bitmask is enabled, given a [layerNumber] between 1 and 32.
   */
  public fun getNavigationLayerValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_NAVIGATION_LAYER_VALUE, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the [RID] of the navigation map this NavigationAgent node should use and also updates the `agent` on the NavigationServer.
   */
  public fun setNavigationMap(navigationMap: RID): Unit {
    TransferContext.writeArguments(_RID to navigationMap)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_SET_NAVIGATION_MAP, NIL)
  }

  /**
   * Returns the [RID] of the navigation map for this NavigationAgent node. This function returns always the map set on the NavigationAgent node and not the map of the abstract agent on the NavigationServer. If the agent map is changed directly with the NavigationServer API the NavigationAgent node will not be aware of the map change. Use [setNavigationMap] to change the navigation map for the NavigationAgent and also update the agent on the NavigationServer.
   */
  public fun getNavigationMap(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_NAVIGATION_MAP, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the next position in global coordinates that can be moved to, making sure that there are no static objects in the way. If the agent does not have a navigation path, it will return the position of the agent's parent. The use of this function once every physics frame is required to update the internal path logic of the NavigationAgent.
   */
  public fun getNextPathPosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_NEXT_PATH_POSITION, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Replaces the internal velocity in the collision avoidance simulation with [velocity]. When an agent is teleported to a new position this function should be used in the same frame. If called frequently this function can get agents stuck.
   */
  public fun setVelocityForced(velocity: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to velocity)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_SET_VELOCITY_FORCED, NIL)
  }

  /**
   * Returns the distance to the target position, using the agent's global position. The user must set [targetPosition] in order for this to be accurate.
   */
  public fun distanceToTarget(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_DISTANCE_TO_TARGET, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the path query result for the path the agent is currently following.
   */
  public fun getCurrentNavigationResult(): NavigationPathQueryResult2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_CURRENT_NAVIGATION_RESULT, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as NavigationPathQueryResult2D?)
  }

  /**
   * Returns this agent's current path from start to finish in global coordinates. The path only updates when the target position is changed or the agent requires a repath. The path array is not intended to be used in direct path movement as the agent has its own internal path logic that would get corrupted by changing the path array manually. Use the intended [getNextPathPosition] once every physics frame to receive the next path point for the agents movement as this function also updates the internal path logic.
   */
  public fun getCurrentNavigationPath(): PackedVector2Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_CURRENT_NAVIGATION_PATH,
        PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
  }

  /**
   * Returns which index the agent is currently on in the navigation path's [godot.PackedVector2Array].
   */
  public fun getCurrentNavigationPathIndex(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_CURRENT_NAVIGATION_PATH_INDEX, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns true if [targetPosition] is reached. It may not always be possible to reach the target position. It should always be possible to reach the final position though. See [getFinalPosition].
   */
  public fun isTargetReached(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_IS_TARGET_REACHED,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns true if [targetPosition] is reachable. The target position is set using [targetPosition].
   */
  public fun isTargetReachable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_IS_TARGET_REACHABLE, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns true if the navigation path's final position has been reached.
   */
  public fun isNavigationFinished(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_IS_NAVIGATION_FINISHED, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the reachable final position of the current navigation path in global coordinates. This can change if the navigation path is altered in any way. Because of this, it would be best to check this each frame.
   */
  public fun getFinalPosition(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_FINAL_POSITION, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [avoidanceLayers] bitmask, given a [layerNumber] between 1 and 32.
   */
  public fun setAvoidanceLayerValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_SET_AVOIDANCE_LAYER_VALUE, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [avoidanceLayers] bitmask is enabled, given a [layerNumber] between 1 and 32.
   */
  public fun getAvoidanceLayerValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_AVOIDANCE_LAYER_VALUE, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Based on [value], enables or disables the specified mask in the [avoidanceMask] bitmask, given a [maskNumber] between 1 and 32.
   */
  public fun setAvoidanceMaskValue(maskNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to maskNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_SET_AVOIDANCE_MASK_VALUE, NIL)
  }

  /**
   * Returns whether or not the specified mask of the [avoidanceMask] bitmask is enabled, given a [maskNumber] between 1 and 32.
   */
  public fun getAvoidanceMaskValue(maskNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to maskNumber.toLong())
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_AVOIDANCE_MASK_VALUE, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object
}
