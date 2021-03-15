// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.Vector2
import kotlin.Boolean
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class EditorResourcePreviewGenerator : Reference() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_EDITORRESOURCEPREVIEWGENERATOR,
        ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun _canGenerateSmallPreview(): Boolean {
    throw
        NotImplementedError("can_generate_small_preview is not implemented for EditorResourcePreviewGenerator")
  }

  open fun _generate(from: Resource, size: Vector2): Texture? {
    throw NotImplementedError("generate is not implemented for EditorResourcePreviewGenerator")
  }

  open fun _generateFromPath(path: String, size: Vector2): Texture? {
    throw
        NotImplementedError("generate_from_path is not implemented for EditorResourcePreviewGenerator")
  }

  open fun _generateSmallPreviewAutomatically(): Boolean {
    throw
        NotImplementedError("generate_small_preview_automatically is not implemented for EditorResourcePreviewGenerator")
  }

  open fun _handles(type: String): Boolean {
    throw NotImplementedError("handles is not implemented for EditorResourcePreviewGenerator")
  }
}
