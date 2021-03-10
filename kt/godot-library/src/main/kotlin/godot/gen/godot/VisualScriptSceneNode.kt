// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.NodePath
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import kotlin.Suppress

@GodotBaseType
open class VisualScriptSceneNode : VisualScriptNode() {
  open var nodePath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTSCENENODE_GET_NODE_PATH, NODE_PATH)
      return TransferContext.readReturnValue(NODE_PATH, false) as NodePath
    }
    set(value) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTSCENENODE_SET_NODE_PATH, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_VISUALSCRIPTSCENENODE)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }
}
