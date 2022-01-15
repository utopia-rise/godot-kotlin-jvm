// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Suppress
import kotlin.Unit

/**
 * This class is responsible for creating and clearing navigation meshes.
 *
 * This class is responsible for creating and clearing navigation meshes.
 */
@GodotBaseType
public object NavigationMeshGenerator : Object() {
  public override fun __new(): Unit {
    rawPtr = TransferContext.getSingleton(ENGINESINGLETON_NAVIGATIONMESHGENERATOR)
  }

  public override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  /**
   * Bakes the navigation mesh. This will allow you to use pathfinding with the navigation system.
   */
  public fun bake(navMesh: NavigationMesh, rootNode: Node): Unit {
    TransferContext.writeArguments(OBJECT to navMesh, OBJECT to rootNode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESHGENERATOR_BAKE, NIL)
  }

  /**
   * Clears the navigation mesh.
   */
  public fun clear(navMesh: NavigationMesh): Unit {
    TransferContext.writeArguments(OBJECT to navMesh)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESHGENERATOR_CLEAR, NIL)
  }
}
