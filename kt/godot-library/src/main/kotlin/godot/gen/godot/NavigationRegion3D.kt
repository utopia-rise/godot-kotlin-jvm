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
  public open var navmesh: NavigationMesh?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONREGION3D_GET_NAVMESH,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as NavigationMesh?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONREGION3D_SET_NAVMESH,
          NIL)
    }

  /**
   * Determines if the [godot.NavigationRegion3D] is enabled or disabled.
   */
  public open var enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONREGION3D_GET_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONREGION3D_SET_ENABLED,
          NIL)
    }

  /**
   * A bitfield determining all layers the region belongs to. These layers can be checked upon when requesting a path with [godot.NavigationServer3D.mapGetPath].
   */
  public open var layers: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONREGION3D_GET_LAYERS,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONREGION3D_SET_LAYERS,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_NAVIGATIONREGION3D)
  }

  /**
   * Bakes the [godot.NavigationMesh]. The baking is done in a separate thread because navigation baking is not a cheap operation. This can be done at runtime. When it is completed, it automatically sets the new [godot.NavigationMesh].
   */
  public open fun bakeNavigationMesh(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONREGION3D_BAKE_NAVIGATION_MESH, NIL)
  }

  public companion object
}
