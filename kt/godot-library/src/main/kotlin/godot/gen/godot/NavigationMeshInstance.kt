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
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * An instance of a [godot.NavigationMesh].
 *
 * An instance of a [godot.NavigationMesh]. It tells the [godot.Navigation] node what can be navigated and what cannot, based on the [godot.NavigationMesh] resource.
 *
 * By default this node will register to the default [godot.World] navigation map. If this node is a child of a [godot.Navigation] node it will register to the navigation map of the navigation node.
 *
 * Two regions can be connected to each other if they share a similar edge. You can set the minimum distance between two vertices required to connect two edges by using [godot.NavigationServer.mapSetEdgeConnectionMargin].
 *
 * **Note:** Overlapping two regions' navmeshes is not enough for connecting two regions. They must share a similar edge.
 *
 * The cost of entering this region from another region can be controlled with the [enterCost] value.
 *
 * **Note:** This value is not added to the path cost when the start position is already inside this region.
 *
 * The cost of traveling distances inside this region can be controlled with the [travelCost] multiplier.
 */
@GodotBaseType
public open class NavigationMeshInstance : Spatial() {
  /**
   * Notifies when the navigation mesh bake operation is completed.
   */
  public val bakeFinished: Signal0 by signal()

  /**
   * Notifies when the [godot.NavigationMesh] has changed.
   */
  public val navigationMeshChanged: Signal0 by signal()

  /**
   * Determines if the [godot.NavigationMeshInstance] is enabled or disabled.
   */
  public open var enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESHINSTANCE_GET_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESHINSTANCE_SET_ENABLED, NIL)
    }

  /**
   * When pathfinding enters this region's navmesh from another regions navmesh the `enter_cost` value is added to the path distance for determining the shortest path.
   */
  public open var enterCost: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESHINSTANCE_GET_ENTER_COST, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESHINSTANCE_SET_ENTER_COST, NIL)
    }

  /**
   * A bitfield determining all navigation map layers the [godot.NavigationMesh] belongs to. On path requests with [godot.NavigationServer.mapGetPath] navmeshes without matching layers will be ignored and the navigation map will only proximity merge different navmeshes with matching layers.
   */
  public open var navigationLayers: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESHINSTANCE_GET_NAVIGATION_LAYERS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESHINSTANCE_SET_NAVIGATION_LAYERS, NIL)
    }

  /**
   * The [godot.NavigationMesh] resource to use.
   */
  public open var navmesh: NavigationMesh?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESHINSTANCE_GET_NAVMESH, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as NavigationMesh?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESHINSTANCE_SET_NAVMESH, NIL)
    }

  /**
   * When pathfinding moves inside this region's navmesh the traveled distances are multiplied with `travel_cost` for determining the shortest path.
   */
  public open var travelCost: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESHINSTANCE_GET_TRAVEL_COST, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESHINSTANCE_SET_TRAVEL_COST, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_NAVIGATIONMESHINSTANCE)
  }

  public open fun _bakeFinished(navMesh: NavigationMesh): Unit {
  }

  /**
   * Bakes the [godot.NavigationMesh]. If `on_thread` is set to `true` (default), the baking is done on a separate thread. Baking on separate thread is useful because navigation baking is not a cheap operation. When it is completed, it automatically sets the new [godot.NavigationMesh]. Please note that baking on separate thread may be very slow if geometry is parsed from meshes as async access to each mesh involves heavy synchronization. Also, please note that baking on a separate thread is automatically disabled on operating systems that cannot use threads (such as HTML5 with threads disabled).
   */
  public open fun bakeNavigationMesh(onThread: Boolean = true): Unit {
    TransferContext.writeArguments(BOOL to onThread)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESHINSTANCE_BAKE_NAVIGATION_MESH, NIL)
  }

  /**
   * Returns the [RID] of this region on the [godot.NavigationServer]. Combined with [godot.NavigationServer.mapGetClosestPointOwner] can be used to identify the [godot.NavigationMeshInstance] closest to a point on the merged navigation map.
   */
  public open fun getRegionRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESHINSTANCE_GET_REGION_RID, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }
}
