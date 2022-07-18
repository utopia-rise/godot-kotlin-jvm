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
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A region of the navigation map.
 *
 * A region of the navigation map. It tells the [godot.NavigationServer3D] what can be navigated and what cannot, based on its [godot.NavigationMesh] resource.
 *
 * Two regions can be connected to each other if they share a similar edge. You can set the minimum distance between two vertices required to connect two edges by using [godot.NavigationServer3D.mapSetEdgeConnectionMargin].
 *
 * **Note:** Overlapping two regions' navmeshes is not enough for connecting two regions. They must share a similar edge.
 *
 * The cost of entering this region from another region can be controlled with the [enterCost] value.
 *
 * **Note**: This value is not added to the path cost when the start position is already inside this region.
 *
 * The cost of traveling distances inside this region can be controlled with the [travelCost] multiplier.
 */
@GodotBaseType
public open class NavigationRegion3D : Node3D() {
  /**
   * Notifies when the navigation mesh bake operation is completed.
   */
  public val bakeFinished: Signal0 by signal()

  /**
   * Notifies when the [godot.NavigationMesh] has changed.
   */
  public val navigationMeshChanged: Signal0 by signal()

  /**
   * The [godot.NavigationMesh] resource to use.
   */
  public var navmesh: NavigationMesh?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONREGION3D_GET_NAVIGATION_MESH,
          OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as NavigationMesh?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONREGION3D_SET_NAVIGATION_MESH,
          NIL.ordinal)
    }

  /**
   * Determines if the [godot.NavigationRegion3D] is enabled or disabled.
   */
  public var enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONREGION3D_IS_ENABLED,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONREGION3D_SET_ENABLED,
          NIL.ordinal)
    }

  public var layers: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONREGION3D_GET_LAYERS,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONREGION3D_SET_LAYERS,
          NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_NAVIGATIONREGION3D)
  }

  /**
   * Bakes the [godot.NavigationMesh]. If `on_thread` is set to `true` (default), the baking is done on a separate thread. Baking on separate thread is useful because navigation baking is not a cheap operation. When it is completed, it automatically sets the new [godot.NavigationMesh]. Please note that baking on separate thread may be very slow if geometry is parsed from meshes as async access to each mesh involves heavy synchronization. Also, please note that baking on a separate thread is automatically disabled on operating systems that cannot use threads (such as HTML5 with threads disabled).
   */
  public fun bakeNavigationMesh(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONREGION3D_BAKE_NAVIGATION_MESH,
        NIL.ordinal)
  }

  public companion object
}
