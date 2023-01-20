// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Creates a link between two locations that [godot.NavigationServer2D] can route agents through.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/navigation/navigation_using_navigationlinks.html]($DOCS_URL/tutorials/navigation/navigation_using_navigationlinks.html)
 *
 * Creates a link between two locations that [godot.NavigationServer2D] can route agents through.  Links can be used to express navigation methods that aren't just traveling along the surface of the navigation mesh, like zip-lines, teleporters, or jumping across gaps.
 */
@GodotBaseType
public open class NavigationLink2D : Node2D() {
  /**
   * Whether this link is currently active. If `false`, [godot.NavigationServer2D.mapGetPath] will ignore this link.
   */
  public var enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONLINK2D_IS_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONLINK2D_SET_ENABLED, NIL)
    }

  /**
   * Whether this link can be traveled in both directions or only from [startLocation] to [endLocation].
   */
  public var bidirectional: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONLINK2D_IS_BIDIRECTIONAL,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONLINK2D_SET_BIDIRECTIONAL, NIL)
    }

  /**
   * A bitfield determining all navigation layers the link belongs to. These navigation layers will be checked when requesting a path with [godot.NavigationServer2D.mapGetPath].
   */
  public var navigationLayers: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONLINK2D_GET_NAVIGATION_LAYERS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONLINK2D_SET_NAVIGATION_LAYERS, NIL)
    }

  /**
   * Starting position of the link.
   *
   * This position will search out the nearest polygon in the navigation mesh to attach to.
   *
   * The distance the link will search is controlled by [godot.NavigationServer2D.mapSetLinkConnectionRadius].
   */
  public var startLocation: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONLINK2D_GET_START_LOCATION, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONLINK2D_SET_START_LOCATION, NIL)
    }

  /**
   * Ending position of the link.
   *
   * This position will search out the nearest polygon in the navigation mesh to attach to.
   *
   * The distance the link will search is controlled by [godot.NavigationServer2D.mapSetLinkConnectionRadius].
   */
  public var endLocation: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONLINK2D_GET_END_LOCATION,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONLINK2D_SET_END_LOCATION,
          NIL)
    }

  /**
   * When pathfinding enters this link from another regions navigation mesh the `enter_cost` value is added to the path distance for determining the shortest path.
   */
  public var enterCost: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONLINK2D_GET_ENTER_COST,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONLINK2D_SET_ENTER_COST,
          NIL)
    }

  /**
   * When pathfinding moves along the link the traveled distance is multiplied with `travel_cost` for determining the shortest path.
   */
  public var travelCost: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONLINK2D_GET_TRAVEL_COST,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONLINK2D_SET_TRAVEL_COST,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_NAVIGATIONLINK2D, scriptIndex)
    return true
  }

  /**
   * Based on `value`, enables or disables the specified layer in the [navigationLayers] bitmask, given a `layer_number` between 1 and 32.
   */
  public fun setNavigationLayerValue(layerNumber: Long, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber, BOOL to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONLINK2D_SET_NAVIGATION_LAYER_VALUE, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [navigationLayers] bitmask is enabled, given a `layer_number` between 1 and 32.
   */
  public fun getNavigationLayerValue(layerNumber: Long): Boolean {
    TransferContext.writeArguments(LONG to layerNumber)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONLINK2D_GET_NAVIGATION_LAYER_VALUE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public companion object
}
