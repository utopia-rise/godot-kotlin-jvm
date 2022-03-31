// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.OBJECT
import kotlin.Boolean
import kotlin.Double
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class for audio streams.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/528](https://godotengine.org/asset-library/asset/528)
 *
 * Base class for audio streams. Audio streams are used for sound effects and music playback, and support WAV (via [godot.AudioStreamSample]) and OGG (via [godot.AudioStreamOGGVorbis]) file formats.
 */
@GodotBaseType
public open class AudioStream : Resource() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_AUDIOSTREAM)
  }

  /**
   *
   */
  public open fun _instancePlayback(): AudioStreamPlayback? {
    throw NotImplementedError("_instance_playback is not implemented for AudioStream")
  }

  /**
   *
   */
  public open fun _getStreamName(): String {
    throw NotImplementedError("_get_stream_name is not implemented for AudioStream")
  }

  /**
   *
   */
  public open fun _getLength(): Double {
    throw NotImplementedError("_get_length is not implemented for AudioStream")
  }

  /**
   *
   */
  public open fun _isMonophonic(): Boolean {
    throw NotImplementedError("_is_monophonic is not implemented for AudioStream")
  }

  /**
   * Returns the length of the audio stream in seconds.
   */
  public open fun getLength(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAM_GET_LENGTH, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns true if this audio stream only supports monophonic playback, or false if the audio stream supports polyphony.
   */
  public open fun isMonophonic(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAM_IS_MONOPHONIC, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns an AudioStreamPlayback. Useful for when you want to extend `_instance_playback` but call `instance_playback` from an internally held AudioStream subresource. An example of this can be found in the source files for `AudioStreamRandomPitch::instance_playback`.
   */
  public open fun instancePlayback(): AudioStreamPlayback? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAM_INSTANCE_PLAYBACK,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as AudioStreamPlayback?
  }

  public companion object
}
