// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Suppress
import kotlin.Unit

/**
 * Base resource for video streams.
 *
 * Base resource type for all video streams. Classes that derive from [godot.VideoStream] can all be used as resource types to play back videos in [godot.VideoStreamPlayer].
 */
@GodotBaseType
public open class VideoStream : Resource() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VIDEOSTREAM)
  }

  public companion object
}
