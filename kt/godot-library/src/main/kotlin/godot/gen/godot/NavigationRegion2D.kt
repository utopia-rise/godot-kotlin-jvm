// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * A region of the 2D navigation map.
 *
 * A region of the navigation map. It tells the [godot.NavigationServer2D] what can be navigated and what cannot, based on its [godot.NavigationPolygon] resource.
 *
 * Two regions can be connected to each other if they share a similar edge. You can set the minimum distance between two vertices required to connect two edges by using [godot.NavigationServer2D.mapSetEdgeConnectionMargin].
 *
 * **Note:** Overlapping two regions' polygons is not enough for connecting two regions. They must share a similar edge.
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
  public var navpoly: NavigationPolygon?
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

  public var layers: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONREGION2D_GET_LAYERS,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONREGION2D_SET_LAYERS,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_NAVIGATIONREGION2D, scriptIndex)
    return true
  }

  public companion object
}
