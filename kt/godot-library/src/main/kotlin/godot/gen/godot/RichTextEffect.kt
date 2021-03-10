// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import kotlin.Boolean
import kotlin.NotImplementedError
import kotlin.Suppress

@GodotBaseType
open class RichTextEffect : Resource() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_RICHTEXTEFFECT)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  open fun _processCustomFx(charFx: CharFXTransform): Boolean {
    throw NotImplementedError("_process_custom_fx is not implemented for RichTextEffect")
  }
}
