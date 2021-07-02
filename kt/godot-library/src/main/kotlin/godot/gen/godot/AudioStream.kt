// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import kotlin.Double
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
   * Returns the length of the audio stream in seconds.
   */
  public open fun getLength(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOSTREAM_GET_LENGTH, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }
}
