// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class EditorResourcePreview : Node() {
  val previewInvalidated: Signal1<String> by signal("path")

  override fun __new(): VoidPtr =
      TransferContext.invokeConstructor(ENGINECLASS_EDITORRESOURCEPREVIEW)

  open fun _previewReady(
    arg0: String,
    arg1: Texture,
    arg2: Texture,
    arg3: Long,
    arg4: String,
    arg5: Any
  ) {
  }

  open fun addPreviewGenerator(generator: EditorResourcePreviewGenerator) {
    TransferContext.writeArguments(OBJECT to generator)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORRESOURCEPREVIEW_ADD_PREVIEW_GENERATOR, NIL)
  }

  open fun checkForInvalidation(path: String) {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORRESOURCEPREVIEW_CHECK_FOR_INVALIDATION, NIL)
  }

  open fun queueEditedResourcePreview(
    resource: Resource,
    receiver: Object,
    receiverFunc: String,
    userdata: Any
  ) {
    TransferContext.writeArguments(OBJECT to resource, OBJECT to receiver, STRING to receiverFunc,
        ANY to userdata)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORRESOURCEPREVIEW_QUEUE_EDITED_RESOURCE_PREVIEW, NIL)
  }

  open fun queueResourcePreview(
    path: String,
    receiver: Object,
    receiverFunc: String,
    userdata: Any
  ) {
    TransferContext.writeArguments(STRING to path, OBJECT to receiver, STRING to receiverFunc, ANY
        to userdata)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORRESOURCEPREVIEW_QUEUE_RESOURCE_PREVIEW, NIL)
  }

  open fun removePreviewGenerator(generator: EditorResourcePreviewGenerator) {
    TransferContext.writeArguments(OBJECT to generator)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORRESOURCEPREVIEW_REMOVE_PREVIEW_GENERATOR, NIL)
  }
}
