// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress

/**
 * Dynamic range compressor reduces the level of the sound when the amplitude goes over a certain
 * threshold in Decibels. One of the main uses of a compressor is to increase the dynamic range by
 * clipping as little as possible (when sound goes over 0dB).
 * Compressor has many uses in the mix:
 * - In the Master bus to compress the whole output (although an [AudioEffectLimiter] is probably
 * better).
 * - In voice channels to ensure they sound as balanced as possible.
 * - Sidechained. This can reduce the sound level sidechained with another audio bus for threshold
 * detection. This technique is common in video game mixing to the level of music and SFX while voices
 * are being heard.
 * - Accentuates transients by using a wider attack, making effects sound more punchy.
 */
@GodotBaseType
public open class AudioEffectCompressor : AudioEffect() {
  /**
   * The level above which compression is applied to the audio. Value can range from -60 to 0.
   */
  public var threshold: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getThresholdPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setThresholdPtr, NIL)
    }

  /**
   * Amount of compression applied to the audio once it passes the threshold level. The higher the
   * ratio, the more the loud parts of the audio will be compressed. Value can range from 1 to 48.
   */
  public var ratio: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRatioPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRatioPtr, NIL)
    }

  /**
   * Gain applied to the output signal.
   */
  public var gain: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGainPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setGainPtr, NIL)
    }

  /**
   * Compressor's reaction time when the signal exceeds the threshold, in microseconds. Value can
   * range from 20 to 2000.
   */
  public var attackUs: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAttackUsPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAttackUsPtr, NIL)
    }

  /**
   * Compressor's delay time to stop reducing the signal after the signal level falls below the
   * threshold, in milliseconds. Value can range from 20 to 2000.
   */
  public var releaseMs: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getReleaseMsPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setReleaseMsPtr, NIL)
    }

  /**
   * Balance between original signal and effect signal. Value can range from 0 (totally dry) to 1
   * (totally wet).
   */
  public var mix: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMixPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMixPtr, NIL)
    }

  /**
   * Reduce the sound level using another audio bus for threshold detection.
   */
  public var sidechain: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSidechainPtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSidechainPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AUDIOEFFECTCOMPRESSOR, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCompressor", "set_threshold")

    public val getThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCompressor", "get_threshold")

    public val setRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCompressor", "set_ratio")

    public val getRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCompressor", "get_ratio")

    public val setGainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCompressor", "set_gain")

    public val getGainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCompressor", "get_gain")

    public val setAttackUsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCompressor", "set_attack_us")

    public val getAttackUsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCompressor", "get_attack_us")

    public val setReleaseMsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCompressor", "set_release_ms")

    public val getReleaseMsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCompressor", "get_release_ms")

    public val setMixPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioEffectCompressor", "set_mix")

    public val getMixPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioEffectCompressor", "get_mix")

    public val setSidechainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCompressor", "set_sidechain")

    public val getSidechainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCompressor", "get_sidechain")
  }
}
