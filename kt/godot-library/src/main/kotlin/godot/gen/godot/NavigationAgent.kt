// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PoolVector3Array
import godot.core.RID
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_VECTOR3_ARRAY
import godot.core.VariantType.VECTOR3
import godot.core.VariantType._RID
import godot.core.Vector3
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * 3D agent used in navigation for collision avoidance.
 *
 * 3D agent that is used in navigation to reach a location while avoiding static and dynamic obstacles. The dynamic obstacles are avoided using RVO (Reciprocal Velocity Obstacles) collision avoidance. The agent needs navigation data to work correctly. By default this node will register to the default [godot.World] navigation map. If this node is a child of a [godot.Navigation] node it will register to the navigation map of the navigation node or the function [setNavigation] can be used to set the navigation node directly. [godot.NavigationAgent] is physics safe.
 *
 * **Note:** After [setTargetLocation] is used it is required to use the [getNextLocation] function once every physics frame to update the internal path logic of the NavigationAgent. The returned vector position from this function should be used as the next movement position for the agent's parent Node.
 *
 * **Note:** By default, the expensive calculations for avoidance are done in a thread. In HTML5 exports without thread support, they will be done on the main thread, which can lead to performance issues.
 */
@GodotBaseType
public open class NavigationAgent : Node() {
  /**
   * Notifies when the final location is reached.
   */
  public val navigationFinished: Signal0 by signal()

  /**
   * Notifies when the navigation path changes. This can be triggered by the navigation system or by the user changing the path.
   */
  public val pathChanged: Signal0 by signal()

  /**
   * Notifies when the player-defined target, set with [setTargetLocation], is reached.
   */
  public val targetReached: Signal0 by signal()

  /**
   * Notifies when the collision avoidance velocity is calculated after a call to [setVelocity]. Only emitted when [avoidanceEnabled] is true.
   */
  public val velocityComputed: Signal1<Vector3> by signal("safe_velocity")

  /**
   * The NavigationAgent height offset is subtracted from the y-axis value of any vector path position for this NavigationAgent. The NavigationAgent height offset does not change or influence the navigation mesh or pathfinding query result. Additional navigation maps that use regions with navigation meshes that the developer baked with appropriate agent radius or height values are required to support different-sized agents.
   */
  public open var agentHeightOffset: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT_GET_AGENT_HEIGHT_OFFSET, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT_SET_AGENT_HEIGHT_OFFSET, NIL)
    }

  /**
   * If `true` the agent is registered for an RVO avoidance callback on the [godot.NavigationServer]. When [setVelocity] is used and the processing is completed a `safe_velocity` Vector3 is received with a signal connection to [velocityComputed]. Avoidance processing with many registered agents has a significant performance cost and should only be enabled on agents that currently require it.
   */
  public open var avoidanceEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT_GET_AVOIDANCE_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT_SET_AVOIDANCE_ENABLED, NIL)
    }

  /**
   * Ignores collisions on the Y axis. Must be `true` to move on a horizontal plane.
   */
  public open var ignoreY: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT_GET_IGNORE_Y,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT_SET_IGNORE_Y, NIL)
    }

  /**
   * The maximum number of neighbors for the agent to consider.
   */
  public open var maxNeighbors: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT_GET_MAX_NEIGHBORS,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT_SET_MAX_NEIGHBORS,
          NIL)
    }

  /**
   * The maximum speed that an agent can move.
   */
  public open var maxSpeed: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT_GET_MAX_SPEED,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT_SET_MAX_SPEED,
          NIL)
    }

  /**
   * A bitfield determining all navigation map layers the [godot.NavigationAgent] belongs to. On path requests the agent will ignore navmeshes without at least one matching layer.
   */
  public open var navigationLayers: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT_GET_NAVIGATION_LAYERS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT_SET_NAVIGATION_LAYERS, NIL)
    }

  /**
   * The distance to search for other agents.
   */
  public open var neighborDist: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT_GET_NEIGHBOR_DIST,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT_SET_NEIGHBOR_DIST,
          NIL)
    }

  /**
   * The distance threshold before a path point is considered to be reached. This will allow an agent to not have to hit a path point on the path exactly, but in the area. If this value is set to high the NavigationAgent will skip points on the path which can lead to leaving the navigation mesh. If this value is set to low the NavigationAgent will be stuck in a repath loop cause it will constantly overshoot or undershoot the distance to the next point on each physics frame update.
   */
  public open var pathDesiredDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT_GET_PATH_DESIRED_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT_SET_PATH_DESIRED_DISTANCE, NIL)
    }

  /**
   * The maximum distance the agent is allowed away from the ideal path to the final location. This can happen due to trying to avoid collisions. When the maximum distance is exceeded, it recalculates the ideal path.
   */
  public open var pathMaxDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT_GET_PATH_MAX_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT_SET_PATH_MAX_DISTANCE, NIL)
    }

  /**
   * The radius of the avoidance agent. This is the "body" of the avoidance agent and not the avoidance maneuver starting radius (which is controlled by [neighborDist]).
   *
   * Does not affect normal pathfinding. To change an actor's pathfinding radius bake [godot.NavigationMesh] resources with a different [godot.NavigationMesh.agentRadius] property and use different navigation maps for each actor size.
   */
  public open var radius: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT_GET_RADIUS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT_SET_RADIUS, NIL)
    }

  /**
   * The distance threshold before the final target point is considered to be reached. This will allow an agent to not have to hit the point of the final target exactly, but only the area. If this value is set to low the NavigationAgent will be stuck in a repath loop cause it will constantly overshoot or undershoot the distance to the final target point on each physics frame update.
   */
  public open var targetDesiredDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT_GET_TARGET_DESIRED_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT_SET_TARGET_DESIRED_DISTANCE, NIL)
    }

  /**
   * The minimal amount of time for which this agent's velocities, that are computed with the collision avoidance algorithm, are safe with respect to other agents. The larger the number, the sooner the agent will respond to other agents, but the less freedom in choosing its velocities. Must be positive.
   */
  public open var timeHorizon: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT_GET_TIME_HORIZON,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT_SET_TIME_HORIZON,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_NAVIGATIONAGENT)
  }

  public open fun _avoidanceDone(newVelocity: Vector3): Unit {
  }

  /**
   * Returns the distance to the target location, using the agent's global position. The user must set the target location with [setTargetLocation] in order for this to be accurate.
   */
  public open fun distanceToTarget(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT_DISTANCE_TO_TARGET,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the reachable final location in global coordinates. This can change if the navigation path is altered in any way. Because of this, it would be best to check this each frame.
   */
  public open fun getFinalLocation(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT_GET_FINAL_LOCATION,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns this agent's current path from start to finish in global coordinates. The path only updates when the target location is changed or the agent requires a repath. The path array is not intended to be used in direct path movement as the agent has its own internal path logic that would get corrupted by changing the path array manually. Use the intended [getNextLocation] once every physics frame to receive the next path point for the agents movement as this function also updates the internal path logic.
   */
  public open fun getNavPath(): PoolVector3Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT_GET_NAV_PATH,
        POOL_VECTOR3_ARRAY)
    return TransferContext.readReturnValue(POOL_VECTOR3_ARRAY, false) as PoolVector3Array
  }

  /**
   * Returns which index the agent is currently on in the navigation path's [godot.core.PoolVector3Array].
   */
  public open fun getNavPathIndex(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT_GET_NAV_PATH_INDEX,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the [godot.Navigation] node that the agent is using for its navigation system.
   */
  public open fun getNavigation(): Node? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT_GET_NAVIGATION,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  /**
   * Returns the [RID] of the navigation map for this NavigationAgent node. This function returns always the map set on the NavigationAgent node and not the map of the abstract agent on the NavigationServer. If the agent map is changed directly with the NavigationServer API the NavigationAgent node will not be aware of the map change. Use [setNavigationMap] to change the navigation map for the NavigationAgent and also update the agent on the NavigationServer.
   */
  public open fun getNavigationMap(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT_GET_NAVIGATION_MAP,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the next location in global coordinates that can be moved to, making sure that there are no static objects in the way. If the agent does not have a navigation path, it will return the position of the agent's parent. The use of this function once every physics frame is required to update the internal path logic of the NavigationAgent.
   */
  public open fun getNextLocation(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT_GET_NEXT_LOCATION,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the [RID] of this agent on the [godot.NavigationServer].
   */
  public open fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT_GET_RID, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the user-defined target location (set with [setTargetLocation]).
   */
  public open fun getTargetLocation(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT_GET_TARGET_LOCATION,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns `true` if the navigation path's final location has been reached.
   */
  public open fun isNavigationFinished(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT_IS_NAVIGATION_FINISHED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the target location is reachable. The target location is set using [setTargetLocation].
   */
  public open fun isTargetReachable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT_IS_TARGET_REACHABLE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the target location is reached. The target location is set using [setTargetLocation]. It may not always be possible to reach the target location. It should always be possible to reach the final location though. See [getFinalLocation].
   */
  public open fun isTargetReached(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT_IS_TARGET_REACHED,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the [godot.Navigation] node used by the agent. Useful when you don't want to make the agent a child of a [godot.Navigation] node.
   */
  public open fun setNavigation(navigation: Node): Unit {
    TransferContext.writeArguments(OBJECT to navigation)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT_SET_NAVIGATION, NIL)
  }

  /**
   * Sets the [RID] of the navigation map this NavigationAgent node should use and also updates the `agent` on the NavigationServer.
   */
  public open fun setNavigationMap(navigationMap: RID): Unit {
    TransferContext.writeArguments(_RID to navigationMap)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT_SET_NAVIGATION_MAP,
        NIL)
  }

  /**
   * Sets the user desired final location. This will clear the current navigation path.
   */
  public open fun setTargetLocation(location: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to location)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT_SET_TARGET_LOCATION,
        NIL)
  }

  /**
   * Sends the passed in velocity to the collision avoidance algorithm. It will adjust the velocity to avoid collisions. Once the adjustment to the velocity is complete, it will emit the [velocityComputed] signal.
   */
  public open fun setVelocity(velocity: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to velocity)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT_SET_VELOCITY, NIL)
  }
}
