// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING_NAME
import kotlin.Double
import kotlin.Suppress
import kotlin.Unit

/**
 * Adds a compressor audio effect to an audio bus.
 *
 * Reduces sounds that exceed a certain threshold level, smooths out the dynamics and increases the overall volume.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/audio/audio_buses.html]($DOCS_URL/tutorials/audio/audio_buses.html)
 *
 * Dynamic range compressor reduces the level of the sound when the amplitude goes over a certain threshold in Decibels. One of the main uses of a compressor is to increase the dynamic range by clipping as little as possible (when sound goes over 0dB).
 *
 * Compressor has many uses in the mix:
 *
 * - In the Master bus to compress the whole output (although an [godot.AudioEffectLimiter] is probably better).
 *
 * - In voice channels to ensure they sound as balanced as possible.
 *
 * - Sidechained. This can reduce the sound level sidechained with another audio bus for threshold detection. This technique is common in video game mixing to the level of music and SFX while voices are being heard.
 *
 * - Accentuates transients by using a wider attack, making effects sound more punchy.
 */
@GodotBaseType
public open class AudioEffectCompressor : AudioEffect() {
  /**
   * The level above which compression is applied to the audio. Value can range from -60 to 0.
   */
  public var threshold: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTCOMPRESSOR_GET_THRESHOLD,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTCOMPRESSOR_SET_THRESHOLD,
          NIL.ordinal)
    }

  /**
   * Amount of compression applied to the audio once it passes the threshold level. The higher the ratio, the more the loud parts of the audio will be compressed. Value can range from 1 to 48.
   */
  public var ratio: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTCOMPRESSOR_GET_RATIO,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTCOMPRESSOR_SET_RATIO,
          NIL.ordinal)
    }

  /**
   * Gain applied to the output signal.
   */
  public var gain: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTCOMPRESSOR_GET_GAIN,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTCOMPRESSOR_SET_GAIN,
          NIL.ordinal)
    }

  /**
   * Compressor's reaction time when the signal exceeds the threshold, in microseconds. Value can range from 20 to 2000.
   */
  public var attackUs: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTCOMPRESSOR_GET_ATTACK_US,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTCOMPRESSOR_SET_ATTACK_US,
          NIL.ordinal)
    }

  /**
   * Compressor's delay time to stop reducing the signal after the signal level falls below the threshold, in milliseconds. Value can range from 20 to 2000.
   */
  public var releaseMs: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTCOMPRESSOR_GET_RELEASE_MS,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTCOMPRESSOR_SET_RELEASE_MS,
          NIL.ordinal)
    }

  /**
   * Balance between original signal and effect signal. Value can range from 0 (totally dry) to 1 (totally wet).
   */
  public var mix: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTCOMPRESSOR_GET_MIX,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTCOMPRESSOR_SET_MIX,
          NIL.ordinal)
    }

  /**
   * Reduce the sound level using another audio bus for threshold detection.
   */
  public var sidechain: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTCOMPRESSOR_GET_SIDECHAIN,
          STRING_NAME.ordinal)
      return TransferContext.readReturnValue(STRING_NAME, false) as StringName
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTCOMPRESSOR_SET_SIDECHAIN,
          NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_AUDIOEFFECTCOMPRESSOR)
  }

  public companion object
}
