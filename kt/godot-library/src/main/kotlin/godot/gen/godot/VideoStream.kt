// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Base resource type for all video streams. Classes that derive from [VideoStream] can all be used
 * as resource types to play back videos in [VideoStreamPlayer].
 */
@GodotBaseType
public open class VideoStream : Resource() {
  /**
   * The video file path or URI that this [VideoStream] resource handles.
   * For [VideoStreamTheora], this filename should be an Ogg Theora video file with the `.ogv`
   * extension.
   */
  public var `file`: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFilePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFilePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_VIDEOSTREAM, scriptIndex)
  }

  /**
   * Called when the video starts playing, to initialize and return a subclass of
   * [VideoStreamPlayback].
   */
  public open fun _instantiatePlayback(): VideoStreamPlayback? {
    throw NotImplementedError("_instantiate_playback is not implemented for VideoStream")
  }

  public companion object

  internal object MethodBindings {
    public val setFilePtr: VoidPtr = TypeManager.getMethodBindPtr("VideoStream", "set_file")

    public val getFilePtr: VoidPtr = TypeManager.getMethodBindPtr("VideoStream", "get_file")
  }
}
