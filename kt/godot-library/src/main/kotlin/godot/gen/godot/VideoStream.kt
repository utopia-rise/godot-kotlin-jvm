// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import kotlin.Suppress

/**
 * Base resource for video streams.
 *
 * Base resource type for all video streams. Classes that derive from [godot.VideoStream] can all be used as resource types to play back videos in [godot.VideoPlayer].
 */
@GodotBaseType
open class VideoStream : Resource() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_VIDEOSTREAM)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }
}
