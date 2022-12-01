// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.OBJECT
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

/**
 * Base class for audio streams.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/528](https://godotengine.org/asset-library/asset/528)
 *
 * Base class for audio streams. Audio streams are used for sound effects and music playback, and support WAV (via [godot.AudioStreamWAV]) and Ogg (via [godot.AudioStreamOggVorbis]) file formats.
 */
@GodotBaseType
public open class AudioStream : Resource() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AUDIOSTREAM, scriptIndex)
    return true
  }

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
  public fun getLength(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAM_GET_LENGTH, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns true if this audio stream only supports monophonic playback, or false if the audio stream supports polyphony.
   */
  public fun isMonophonic(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAM_IS_MONOPHONIC, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public fun instancePlayback(): AudioStreamPlayback? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAM_INSTANCE_PLAYBACK,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as AudioStreamPlayback?
  }

  public companion object
}
