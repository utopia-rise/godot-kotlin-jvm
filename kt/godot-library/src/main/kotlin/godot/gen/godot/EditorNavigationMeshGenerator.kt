// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Suppress

/**
 *
 */
@GodotBaseType
open class EditorNavigationMeshGenerator : Object() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_EDITORNAVIGATIONMESHGENERATOR)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  /**
   *
   */
  open fun bake(navMesh: NavigationMesh, rootNode: Node) {
    TransferContext.writeArguments(OBJECT to navMesh, OBJECT to rootNode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORNAVIGATIONMESHGENERATOR_BAKE,
        NIL)
  }

  /**
   *
   */
  open fun clear(navMesh: NavigationMesh) {
    TransferContext.writeArguments(OBJECT to navMesh)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORNAVIGATIONMESHGENERATOR_CLEAR,
        NIL)
  }
}
