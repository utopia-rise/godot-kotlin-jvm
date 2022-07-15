// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.signals.Signal2
import godot.signals.signal
import kotlin.Any
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * General-purpose 3D proximity detection node.
 *
 * General-purpose proximity detection node. [godot.ProximityGroup] can be used for *approximate* distance checks, which are faster than exact distance checks using [godot.Vector3.distanceTo] or [godot.Vector3.distanceSquaredTo].
 *
 * [godot.ProximityGroup] nodes are automatically grouped together, as long as they share the same [groupName] and intersect with each other. By calling the [broadcast], you can invoke a specified method with various parameters to all intersecting members.
 *
 * [godot.ProximityGroup] is cuboid-shaped and consists of a cluster of [godot.core.Vector3] coordinates. The coordinates are automatically calculated by calling [gridRadius]. To allow [godot.ProximityGroup] to find its peers (and perform automatic grouping), you need to define its [groupName] to a non-empty [godot.String]. As soon as this object's shape intersects with another [godot.ProximityGroup] object' shape, and both share the same [groupName], they will belong together for as long as they intersect.
 *
 * Since [godot.ProximityGroup] doesn't rely the physics engine, you don't need to add any other node as a child (unlike [godot.PhysicsBody]).
 *
 * The [godot.ProximityGroup] uses the [godot.SceneTree] groups in the background by calling the method [godot.Node.addToGroup] internally. The [godot.SceneTree] group names are constructed by combining the [groupName] with its coordinates, which are calculated using the [gridRadius] you defined beforehand.
 *
 * **Example:** A [godot.ProximityGroup] node named `"PlanetEarth"` at position `Vector3(6, 6, 6)` with a [groupName] set to `"planets"` and a [gridRadius] of `Vector3(1, 2, 3)` will create the following [godot.SceneTree] group names:
 *
 * ```
 * 		- "planets|5|4|3"
 * 		- "planets|5|4|4"
 * 		- "planets|5|4|5"
 * 		- "planets|5|4|6"
 * 		- "planets|5|4|7"
 * 		- "planets|5|4|8"
 * 		- "planets|5|4|9"
 * 		- ...
 * 		```
 *
 * If there is another [godot.ProximityGroup] named `"PlanetMars"` with group name `"planets"`, and one of its coordinates is `Vector3(5, 4, 7)`, it would normally create the [godot.SceneTree] group called `"planets|5|4|7"`. However, since this group name already exists, this [godot.ProximityGroup] object will be *added* to the existing one. `"PlanetEarth"` is already in this group. As long as both nodes don't change their transform and stop intersecting (or exit the scene tree), they are grouped together. As long as this intersection exists, any call to [broadcast] will affect *both* [godot.ProximityGroup] nodes.
 *
 * There are 3 caveats to keep in mind when using [godot.ProximityGroup]:
 *
 * - The larger the grid radius, the more coordinates and the more [godot.SceneTree] groups are created. This can have a performance impact if too many groups are created.
 *
 * - If the [godot.ProximityGroup] node is transformed in any way (or is removed from the scene tree), the groupings will have to be recalculated. This can also have a performance impact.
 *
 * - If your [gridRadius] is smaller than `Vector3(1, 1, 1)`, it will be rounded up to `Vector3(1, 1, 1)`. Therefore, small grid radius values may lead to unwanted groupings.
 *
 * **Note:** [godot.ProximityGroup] will be removed in Godot 4.0 in favor of more effective and faster [godot.VisibilityNotifier] functionality. For most use cases, [godot.Vector3.distanceTo] or [godot.Vector3.distanceSquaredTo] are fast enough too, especially if you call them less often using a [godot.Timer] node.
 */
@GodotBaseType
public open class ProximityGroup : Spatial() {
  /**
   * Emitted when the user calls the [broadcast] method and has set [dispatchMode] to [MODE_SIGNAL].
   *
   * The given method and its parameters are passed on to the listeners who connected to this signal of this object, as well as any [godot.ProximityGroup] node this node is grouped together with.
   *
   * **Note:** This signal is *not* emitted by default, as the default [dispatchMode] is [MODE_PROXY].
   */
  public val broadcast: Signal2<String, VariantArray<Any?>> by signal("method", "parameters")

  /**
   * Specifies which node gets contacted on a call of method [broadcast].
   */
  public open var dispatchMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROXIMITYGROUP_GET_DISPATCH_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROXIMITYGROUP_SET_DISPATCH_MODE,
          NIL)
    }

  /**
   * The size of the space in 3D units. This also sets the amount of coordinates required to calculate whether two [godot.ProximityGroup] nodes are intersecting or not. Smaller [gridRadius] values can be used for more precise proximity checks at the cost of performance, since more groups will be created.
   */
  public open var gridRadius: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROXIMITYGROUP_GET_GRID_RADIUS,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROXIMITYGROUP_SET_GRID_RADIUS,
          NIL)
    }

  /**
   * Specify the common group name, to let other [godot.ProximityGroup] nodes know, if they should be auto-grouped with this node in case they intersect with each other.
   *
   * For example, if you have a [godot.ProximityGroup] node named `"Earth"` and another called `"Mars"`, with both nodes having `"planet"` as their [groupName]. Give both planets a significantly larger [gridRadius] than their actual radius, position them close enough and they'll be automatically grouped.
   */
  public open var groupName: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROXIMITYGROUP_GET_GROUP_NAME,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROXIMITYGROUP_SET_GROUP_NAME,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PROXIMITYGROUP)
  }

  @CoreTypeHelper
  public open fun gridRadius(schedule: Vector3.() -> Unit): Vector3 = gridRadius.apply{
      schedule(this)
      gridRadius = this
  }


  public open fun _proximityGroupBroadcast(method: String, parameters: Any?): Unit {
  }

  /**
   * Calls on all intersecting [godot.ProximityGroup] the given method and parameters.
   *
   * If the [dispatchMode] is set to [MODE_PROXY] (the default), all calls are delegated to their respective parent [godot.Node].
   */
  public open fun broadcast(method: String, parameters: Any?): Unit {
    TransferContext.writeArguments(STRING to method, ANY to parameters)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROXIMITYGROUP_BROADCAST, NIL)
  }

  public enum class DispatchMode(
    id: Long
  ) {
    /**
     * This [godot.ProximityGroup]'s parent will be target of [broadcast].
     */
    MODE_PROXY(0),
    /**
     * This [godot.ProximityGroup] will emit the [broadcast] *signal* when calling the [broadcast] *method*.
     */
    MODE_SIGNAL(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * This [godot.ProximityGroup]'s parent will be target of [broadcast].
     */
    public final const val MODE_PROXY: Long = 0

    /**
     * This [godot.ProximityGroup] will emit the [broadcast] *signal* when calling the [broadcast] *method*.
     */
    public final const val MODE_SIGNAL: Long = 1
  }
}
