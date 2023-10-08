// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.VariantType.ANY
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A node used to generate previews of resources or files.
 *
 * This node is used to generate previews for resources of files.
 *
 * **Note:** This class shouldn't be instantiated directly. Instead, access the singleton using [godot.EditorInterface.getResourcePreviewer].
 */
@GodotBaseType
public open class EditorResourcePreview internal constructor() : Node() {
  /**
   * Emitted if a preview was invalidated (changed). [path] corresponds to the path of the preview.
   */
  public val previewInvalidated: Signal1<String> by signal("path")

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORRESOURCEPREVIEW, scriptIndex)
    return true
  }

  /**
   * Queue a resource file located at [path] for preview. Once the preview is ready, the [receiver]'s [receiverFunc] will be called. The [receiverFunc] must take the following four arguments: [godot.String] path, [godot.Texture2D] preview, [godot.Texture2D] thumbnail_preview, [Variant] userdata. [userdata] can be anything, and will be returned when [receiverFunc] is called.
   *
   * **Note:** If it was not possible to create the preview the [receiverFunc] will still be called, but the preview will be null.
   */
  public fun queueResourcePreview(
    path: String,
    `receiver`: Object,
    receiverFunc: StringName,
    userdata: Any?,
  ): Unit {
    TransferContext.writeArguments(STRING to path, OBJECT to receiver, STRING_NAME to receiverFunc, ANY to userdata)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORRESOURCEPREVIEW_QUEUE_RESOURCE_PREVIEW, NIL)
  }

  /**
   * Queue the [resource] being edited for preview. Once the preview is ready, the [receiver]'s [receiverFunc] will be called. The [receiverFunc] must take the following four arguments: [godot.String] path, [godot.Texture2D] preview, [godot.Texture2D] thumbnail_preview, [Variant] userdata. [userdata] can be anything, and will be returned when [receiverFunc] is called.
   *
   * **Note:** If it was not possible to create the preview the [receiverFunc] will still be called, but the preview will be null.
   */
  public fun queueEditedResourcePreview(
    resource: Resource,
    `receiver`: Object,
    receiverFunc: StringName,
    userdata: Any?,
  ): Unit {
    TransferContext.writeArguments(OBJECT to resource, OBJECT to receiver, STRING_NAME to receiverFunc, ANY to userdata)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORRESOURCEPREVIEW_QUEUE_EDITED_RESOURCE_PREVIEW, NIL)
  }

  /**
   * Create an own, custom preview generator.
   */
  public fun addPreviewGenerator(generator: EditorResourcePreviewGenerator): Unit {
    TransferContext.writeArguments(OBJECT to generator)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORRESOURCEPREVIEW_ADD_PREVIEW_GENERATOR, NIL)
  }

  /**
   * Removes a custom preview generator.
   */
  public fun removePreviewGenerator(generator: EditorResourcePreviewGenerator): Unit {
    TransferContext.writeArguments(OBJECT to generator)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORRESOURCEPREVIEW_REMOVE_PREVIEW_GENERATOR, NIL)
  }

  /**
   * Check if the resource changed, if so, it will be invalidated and the corresponding signal emitted.
   */
  public fun checkForInvalidation(path: String): Unit {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORRESOURCEPREVIEW_CHECK_FOR_INVALIDATION, NIL)
  }

  public companion object
}
