// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Boolean
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
 * **Note:** Overlapping two regions' polygons is not enough for connecting two regions. They must share a similar edge.
 */
@GodotBaseType
public open class NavigationRegion2D : Node2D() {
  /**
   * The [godot.NavigationPolygon] resource to use.
   */
  public open var navpoly: NavigationPolygon?
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
  public open var enabled: Boolean
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
   * A bitfield determining all layers the region belongs to. These layers can be checked upon when requesting a path with [godot.NavigationServer2D.mapGetPath].
   */
  public open var layers: Long
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

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_NAVIGATIONREGION2D)
  }

  public companion object
}
