// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Any
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Helper to generate previews of resources or files.
 *
 * This object is used to generate previews for resources of files.
 *
 * **Note:** This class shouldn't be instantiated directly. Instead, access the singleton using [godot.EditorInterface.getResourcePreviewer].
 */
@GodotBaseType
public open class EditorResourcePreview : Node() {
  /**
   * Emitted if a preview was invalidated (changed). `path` corresponds to the path of the preview.
   */
  public val previewInvalidated: Signal1<String> by signal("path")

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_EDITORRESOURCEPREVIEW)
  }

  public open fun _previewReady(
    arg0: String,
    arg1: Texture,
    arg2: Texture,
    arg3: Long,
    arg4: String,
    arg5: Any?
  ): Unit {
  }

  /**
   * Create an own, custom preview generator.
   */
  public open fun addPreviewGenerator(generator: EditorResourcePreviewGenerator): Unit {
    TransferContext.writeArguments(OBJECT to generator)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORRESOURCEPREVIEW_ADD_PREVIEW_GENERATOR, NIL)
  }

  /**
   * Check if the resource changed, if so, it will be invalidated and the corresponding signal emitted.
   */
  public open fun checkForInvalidation(path: String): Unit {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORRESOURCEPREVIEW_CHECK_FOR_INVALIDATION, NIL)
  }

  /**
   * Queue the `resource` being edited for preview. Once the preview is ready, the `receiver`'s `receiver_func` will be called. The `receiver_func` must take the following four arguments: [godot.String] path, [godot.Texture] preview, [godot.Texture] thumbnail_preview, [Variant] userdata. `userdata` can be anything, and will be returned when `receiver_func` is called.
   *
   * **Note:** If it was not possible to create the preview the `receiver_func` will still be called, but the preview will be null.
   */
  public open fun queueEditedResourcePreview(
    resource: Resource,
    `receiver`: Object,
    receiverFunc: String,
    userdata: Any?
  ): Unit {
    TransferContext.writeArguments(OBJECT to resource, OBJECT to receiver, STRING to receiverFunc,
        ANY to userdata)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORRESOURCEPREVIEW_QUEUE_EDITED_RESOURCE_PREVIEW, NIL)
  }

  /**
   * Queue a resource file located at `path` for preview. Once the preview is ready, the `receiver`'s `receiver_func` will be called. The `receiver_func` must take the following four arguments: [godot.String] path, [godot.Texture] preview, [godot.Texture] thumbnail_preview, [Variant] userdata. `userdata` can be anything, and will be returned when `receiver_func` is called.
   *
   * **Note:** If it was not possible to create the preview the `receiver_func` will still be called, but the preview will be null.
   */
  public open fun queueResourcePreview(
    path: String,
    `receiver`: Object,
    receiverFunc: String,
    userdata: Any?
  ): Unit {
    TransferContext.writeArguments(STRING to path, OBJECT to receiver, STRING to receiverFunc, ANY
        to userdata)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORRESOURCEPREVIEW_QUEUE_RESOURCE_PREVIEW, NIL)
  }

  /**
   * Removes a custom preview generator.
   */
  public open fun removePreviewGenerator(generator: EditorResourcePreviewGenerator): Unit {
    TransferContext.writeArguments(OBJECT to generator)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORRESOURCEPREVIEW_REMOVE_PREVIEW_GENERATOR, NIL)
  }
}
