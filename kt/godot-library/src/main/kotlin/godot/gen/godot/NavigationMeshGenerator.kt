// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public object NavigationMeshGenerator : Object() {
  public override fun __new(): Unit {
    rawPtr = TransferContext.getSingleton(ENGINECLASS_NAVIGATIONMESHGENERATOR)
  }

  public override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  /**
   *
   */
  public open fun bake(navMesh: NavigationMesh, rootNode: Node): Unit {
    TransferContext.writeArguments(OBJECT to navMesh, OBJECT to rootNode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESHGENERATOR_BAKE, NIL)
  }

  /**
   *
   */
  public open fun clear(navMesh: NavigationMesh): Unit {
    TransferContext.writeArguments(OBJECT to navMesh)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONMESHGENERATOR_CLEAR, NIL)
  }
}
