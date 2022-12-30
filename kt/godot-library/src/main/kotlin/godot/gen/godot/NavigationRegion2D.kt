// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType._RID
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A region of the 2D navigation map.
 *
 * A region of the navigation map. It tells the [godot.NavigationServer2D] what can be navigated and what cannot, based on its [godot.NavigationPolygon] resource.
 *
 * Two regions can be connected to each other if they share a similar edge. You can set the minimum distance between two vertices required to connect two edges by using [godot.NavigationServer2D.mapSetEdgeConnectionMargin].
 *
 * **Note:** Overlapping two regions' navigation polygons is not enough for connecting two regions. They must share a similar edge.
 *
 * The pathfinding cost of entering this region from another region can be controlled with the [enterCost] value.
 *
 * **Note:** This value is not added to the path cost when the start position is already inside this region.
 *
 * The pathfinding cost of traveling distances inside this region can be controlled with the [travelCost] multiplier.
 *
 * **Note:** This node caches changes to its properties, so if you make changes to the underlying region [RID] in [godot.NavigationServer2D], they will not be reflected in this node's properties.
 */
@GodotBaseType
public open class NavigationRegion2D : Node2D() {
  /**
   * The [godot.NavigationPolygon] resource to use.
   */
  public var navigationPolygon: NavigationPolygon?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONREGION2D_GET_NAVIGATION_POLYGON, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as NavigationPolygon?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONREGION2D_SET_NAVIGATION_POLYGON, NIL)
    }

  /**
   * Determines if the [godot.NavigationRegion2D] is enabled or disabled.
   */
  public var enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONREGION2D_IS_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONREGION2D_SET_ENABLED,
          NIL)
    }

  /**
   * A bitfield determining all navigation layers the region belongs to. These navigation layers can be checked upon when requesting a path with [godot.NavigationServer2D.mapGetPath].
   */
  public var navigationLayers: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONREGION2D_GET_NAVIGATION_LAYERS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONREGION2D_SET_NAVIGATION_LAYERS, NIL)
    }

  /**
   * When pathfinding enters this region's navigation mesh from another regions navigation mesh the `enter_cost` value is added to the path distance for determining the shortest path.
   */
  public var enterCost: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONREGION2D_GET_ENTER_COST,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONREGION2D_SET_ENTER_COST,
          NIL)
    }

  /**
   * When pathfinding moves inside this region's navigation mesh the traveled distances are multiplied with `travel_cost` for determining the shortest path.
   */
  public var travelCost: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONREGION2D_GET_TRAVEL_COST, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONREGION2D_SET_TRAVEL_COST, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_NAVIGATIONREGION2D, scriptIndex)
    return true
  }

  /**
   * Based on [value], enables or disables the specified layer in the [navigationLayers] bitmask, given a [layerNumber] between 1 and 32.
   */
  public fun setNavigationLayerValue(layerNumber: Long, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber, BOOL to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONREGION2D_SET_NAVIGATION_LAYER_VALUE, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [navigationLayers] bitmask is enabled, given a [layerNumber] between 1 and 32.
   */
  public fun getNavigationLayerValue(layerNumber: Long): Boolean {
    TransferContext.writeArguments(LONG to layerNumber)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONREGION2D_GET_NAVIGATION_LAYER_VALUE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the [RID] of this region on the [godot.NavigationServer2D]. Combined with [godot.NavigationServer2D.mapGetClosestPointOwner] can be used to identify the [godot.NavigationRegion2D] closest to a point on the merged navigation map.
   */
  public fun getRegionRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONREGION2D_GET_REGION_RID,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  public companion object
}
