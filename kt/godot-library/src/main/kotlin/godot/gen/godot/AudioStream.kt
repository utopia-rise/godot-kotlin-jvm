// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Suppress

/**
 * Base class for audio streams.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/audio/audio_streams.html](https://docs.godotengine.org/en/latest/tutorials/audio/audio_streams.html)
 *
 * Base class for audio streams. Audio streams are used for sound effects and music playback, and support WAV (via [godot.AudioStreamSample]) and OGG (via [godot.AudioStreamOGGVorbis]) file formats.
 */
@GodotBaseType
open class AudioStream : Resource() {
  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_AUDIOSTREAM)

  /**
   * Returns the length of the audio stream in seconds.
   */
  open fun getLength(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAM_GET_LENGTH, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }
}
