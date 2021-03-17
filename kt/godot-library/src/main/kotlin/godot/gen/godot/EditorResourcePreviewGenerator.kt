// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.Vector2
import kotlin.Boolean
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class EditorResourcePreviewGenerator : Reference() {
  override fun __new() {
    callConstructor(ENGINECLASS_EDITORRESOURCEPREVIEWGENERATOR)
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
