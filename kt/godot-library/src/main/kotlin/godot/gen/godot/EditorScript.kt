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

@GodotBaseType
open class EditorScript : Reference() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_EDITORSCRIPT, ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun _run() {
  }

  open fun addRootNode(node: Node) {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSCRIPT_ADD_ROOT_NODE, NIL)
  }

  open fun getEditorInterface(): EditorInterface? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSCRIPT_GET_EDITOR_INTERFACE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as EditorInterface?
  }

  open fun getScene(): Node? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORSCRIPT_GET_SCENE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }
}
