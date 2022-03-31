// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class AudioStreamPlaybackResampled : AudioStreamPlayback() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_AUDIOSTREAMPLAYBACKRESAMPLED)
  }

  /**
   *
   */
  public open fun _mixResampled(dstBuffer: `AudioFrame*`, frameCount: Long): Long {
    throw NotImplementedError("_mix_resampled is not implemented for AudioStreamPlaybackResampled")
  }

  /**
   *
   */
  public open fun _getStreamSamplingRate(): Double {
    throw
        NotImplementedError("_get_stream_sampling_rate is not implemented for AudioStreamPlaybackResampled")
  }

  /**
   *
   */
  public open fun beginResample(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOSTREAMPLAYBACKRESAMPLED_BEGIN_RESAMPLE, NIL)
  }

  public companion object
}
