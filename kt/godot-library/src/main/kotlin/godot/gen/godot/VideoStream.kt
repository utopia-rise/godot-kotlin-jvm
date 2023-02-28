// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

/**
 * Base resource for video streams.
 *
 * Base resource type for all video streams. Classes that derive from [godot.VideoStream] can all be used as resource types to play back videos in [godot.VideoStreamPlayer].
 */
@GodotBaseType
public open class VideoStream : Resource() {
  /**
   * The video file path or URI that this [godot.VideoStream] resource handles.
   *
   * For [godot.VideoStreamTheora], this filename should be an Ogg Theora video file with the `.ogv` extension.
   */
  public var `file`: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOSTREAM_GET_FILE, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VIDEOSTREAM_SET_FILE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VIDEOSTREAM, scriptIndex)
    return true
  }

  /**
   * Called when the video starts playing, to initialize and return a subclass of [godot.VideoStreamPlayback].
   */
  public open fun _instantiatePlayback(): VideoStreamPlayback? {
    throw NotImplementedError("_instantiate_playback is not implemented for VideoStream")
  }

  public companion object
}
