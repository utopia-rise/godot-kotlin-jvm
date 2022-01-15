// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit

/**
 * An instance of a [godot.NavigationMesh].
 *
 * An instance of a [godot.NavigationMesh]. It tells the [godot.Navigation] node what can be navigated and what cannot, based on the [godot.NavigationMesh] resource. This should be a child of a [godot.Navigation] node.
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

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_NAVIGATIONMESHINSTANCE)
  }

  public open fun _bakeFinished(navMesh: NavigationMesh): Unit {
  }

  /**
   * Bakes the [godot.NavigationMesh]. The baking is done in a separate thread because navigation baking is not a cheap operation. This can be done at runtime. When it is completed, it automatically sets the new [godot.NavigationMesh].
   */
  public open fun bakeNavigationMesh(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESHINSTANCE_BAKE_NAVIGATION_MESH, NIL)
  }
}
