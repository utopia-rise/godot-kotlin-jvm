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
import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit

/**
 * Node that instances navigation meshes into a scenario.
 *
 * NavigationMeshInstance is a node that takes a [godot.NavigationMesh] resource and adds it to the current scenario by creating an instance of it.
 */
@GodotBaseType
public open class NavigationMeshInstance : Spatial() {
  /**
   * If `true`, the navigation mesh will be used by [godot.Navigation].
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
   * The [godot.NavigationMesh] resource for the instance.
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
}
