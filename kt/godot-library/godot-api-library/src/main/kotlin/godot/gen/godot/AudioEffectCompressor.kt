// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING_NAME
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_AUDIOEFFECTCOMPRESSOR_INDEX: Int = 86

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
  public final inline var threshold: Float
    @JvmName("thresholdProperty")
    get() = getThreshold()
    @JvmName("thresholdProperty")
    set(`value`) {
      setThreshold(value)
    }

  /**
   * Amount of compression applied to the audio once it passes the threshold level. The higher the
   * ratio, the more the loud parts of the audio will be compressed. Value can range from 1 to 48.
   */
  public final inline var ratio: Float
    @JvmName("ratioProperty")
    get() = getRatio()
    @JvmName("ratioProperty")
    set(`value`) {
      setRatio(value)
    }

  /**
   * Gain applied to the output signal.
   */
  public final inline var gain: Float
    @JvmName("gainProperty")
    get() = getGain()
    @JvmName("gainProperty")
    set(`value`) {
      setGain(value)
    }

  /**
   * Compressor's reaction time when the signal exceeds the threshold, in microseconds. Value can
   * range from 20 to 2000.
   */
  public final inline var attackUs: Float
    @JvmName("attackUsProperty")
    get() = getAttackUs()
    @JvmName("attackUsProperty")
    set(`value`) {
      setAttackUs(value)
    }

  /**
   * Compressor's delay time to stop reducing the signal after the signal level falls below the
   * threshold, in milliseconds. Value can range from 20 to 2000.
   */
  public final inline var releaseMs: Float
    @JvmName("releaseMsProperty")
    get() = getReleaseMs()
    @JvmName("releaseMsProperty")
    set(`value`) {
      setReleaseMs(value)
    }

  /**
   * Balance between original signal and effect signal. Value can range from 0 (totally dry) to 1
   * (totally wet).
   */
  public final inline var mix: Float
    @JvmName("mixProperty")
    get() = getMix()
    @JvmName("mixProperty")
    set(`value`) {
      setMix(value)
    }

  /**
   * Reduce the sound level using another audio bus for threshold detection.
   */
  public final inline var sidechain: StringName
    @JvmName("sidechainProperty")
    get() = getSidechain()
    @JvmName("sidechainProperty")
    set(`value`) {
      setSidechain(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_AUDIOEFFECTCOMPRESSOR_INDEX, scriptIndex)
  }

  public final fun setThreshold(threshold: Float): Unit {
    Internals.writeArguments(DOUBLE to threshold.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setThresholdPtr, NIL)
  }

  public final fun getThreshold(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getThresholdPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRatio(ratio: Float): Unit {
    Internals.writeArguments(DOUBLE to ratio.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setRatioPtr, NIL)
  }

  public final fun getRatio(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRatioPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setGain(gain: Float): Unit {
    Internals.writeArguments(DOUBLE to gain.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setGainPtr, NIL)
  }

  public final fun getGain(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getGainPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAttackUs(attackUs: Float): Unit {
    Internals.writeArguments(DOUBLE to attackUs.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setAttackUsPtr, NIL)
  }

  public final fun getAttackUs(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAttackUsPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setReleaseMs(releaseMs: Float): Unit {
    Internals.writeArguments(DOUBLE to releaseMs.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setReleaseMsPtr, NIL)
  }

  public final fun getReleaseMs(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getReleaseMsPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setMix(mix: Float): Unit {
    Internals.writeArguments(DOUBLE to mix.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setMixPtr, NIL)
  }

  public final fun getMix(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMixPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSidechain(sidechain: StringName): Unit {
    Internals.writeArguments(STRING_NAME to sidechain)
    Internals.callMethod(rawPtr, MethodBindings.setSidechainPtr, NIL)
  }

  public final fun getSidechain(): StringName {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSidechainPtr, STRING_NAME)
    return (Internals.readReturnValue(STRING_NAME) as StringName)
  }

  public companion object

  public object MethodBindings {
    internal val setThresholdPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectCompressor", "set_threshold", 373806689)

    internal val getThresholdPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectCompressor", "get_threshold", 1740695150)

    internal val setRatioPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectCompressor", "set_ratio", 373806689)

    internal val getRatioPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectCompressor", "get_ratio", 1740695150)

    internal val setGainPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectCompressor", "set_gain", 373806689)

    internal val getGainPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectCompressor", "get_gain", 1740695150)

    internal val setAttackUsPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectCompressor", "set_attack_us", 373806689)

    internal val getAttackUsPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectCompressor", "get_attack_us", 1740695150)

    internal val setReleaseMsPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectCompressor", "set_release_ms", 373806689)

    internal val getReleaseMsPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectCompressor", "get_release_ms", 1740695150)

    internal val setMixPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectCompressor", "set_mix", 373806689)

    internal val getMixPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectCompressor", "get_mix", 1740695150)

    internal val setSidechainPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectCompressor", "set_sidechain", 3304788590)

    internal val getSidechainPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectCompressor", "get_sidechain", 2002593661)
  }
}
