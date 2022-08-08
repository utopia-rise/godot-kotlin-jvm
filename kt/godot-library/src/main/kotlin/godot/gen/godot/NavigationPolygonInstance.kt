// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType._RID
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A region of the 2D navigation map.
 *
 * A region of the navigation map. It tells the [godot.Navigation2DServer] what can be navigated and what cannot, based on its [godot.NavigationPolygon] resource.
 *
 * By default this node will register to the default [godot.World2D] navigation map. If this node is a child of a [godot.Navigation2D] node it will register to the navigation map of the navigation node.
 *
 * Two regions can be connected to each other if they share a similar edge. You can set the minimum distance between two vertices required to connect two edges by using [godot.Navigation2DServer.mapSetEdgeConnectionMargin].
 *
 * **Note:** Overlapping two regions' polygons is not enough for connecting two regions. They must share a similar edge.
 *
 * The pathfinding cost of entering this region from another region can be controlled with the [enterCost] value.
 *
 * **Note:** This value is not added to the path cost when the start position is already inside this region.
 *
 * The pathfinding cost of traveling distances inside this region can be controlled with the [travelCost] multiplier.
 */
@GodotBaseType
public open class NavigationPolygonInstance : Node2D() {
  /**
   * Determines if the [godot.NavigationPolygonInstance] is enabled or disabled.
   */
  public open var enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGONINSTANCE_GET_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGONINSTANCE_SET_ENABLED, NIL)
    }

  /**
   * When pathfinding enters this region's navmesh from another regions navmesh the `enter_cost` value is added to the path distance for determining the shortest path.
   */
  public open var enterCost: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGONINSTANCE_GET_ENTER_COST, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGONINSTANCE_SET_ENTER_COST, NIL)
    }

  /**
   * A bitfield determining all navigation map layers the [godot.NavigationPolygon] belongs to. On path requests with [godot.Navigation2DServer.mapGetPath] navmeshes without matching layers will be ignored and the navigation map will only proximity merge different navmeshes with matching layers.
   */
  public open var navigationLayers: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGONINSTANCE_GET_NAVIGATION_LAYERS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGONINSTANCE_SET_NAVIGATION_LAYERS, NIL)
    }

  /**
   * The [godot.NavigationPolygon] resource to use.
   */
  public open var navpoly: NavigationPolygon?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGONINSTANCE_GET_NAVPOLY, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as NavigationPolygon?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGONINSTANCE_SET_NAVPOLY, NIL)
    }

  /**
   * When pathfinding moves inside this region's navmesh the traveled distances are multiplied with `travel_cost` for determining the shortest path.
   */
  public open var travelCost: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGONINSTANCE_GET_TRAVEL_COST, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGONINSTANCE_SET_TRAVEL_COST, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_NAVIGATIONPOLYGONINSTANCE)
  }

  public open fun _mapChanged(arg0: RID): Unit {
  }

  public open fun _navpolyChanged(): Unit {
  }

  /**
   * Returns the [RID] of this region on the [godot.Navigation2DServer]. Combined with [godot.Navigation2DServer.mapGetClosestPointOwner] can be used to identify the [godot.NavigationPolygonInstance] closest to a point on the merged navigation map.
   */
  public open fun getRegionRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONPOLYGONINSTANCE_GET_REGION_RID, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }
}
