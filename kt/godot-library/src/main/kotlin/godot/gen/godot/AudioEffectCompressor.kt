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
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
  public var ratio: Float
    @JvmName("ratioProperty")
    get() = getRatio()
    @JvmName("ratioProperty")
    set(`value`) {
      setRatio(value)
    }

  /**
   * Gain applied to the output signal.
   */
  public var gain: Float
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
  public var attackUs: Float
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
  public var releaseMs: Float
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
  public var mix: Float
    @JvmName("mixProperty")
    get() = getMix()
    @JvmName("mixProperty")
    set(`value`) {
      setMix(value)
    }

  /**
   * Reduce the sound level using another audio bus for threshold detection.
   */
  public var sidechain: StringName
    @JvmName("sidechainProperty")
    get() = getSidechain()
    @JvmName("sidechainProperty")
    set(`value`) {
      setSidechain(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_AUDIOEFFECTCOMPRESSOR, scriptIndex)
  }

  public fun setThreshold(threshold: Float): Unit {
    TransferContext.writeArguments(DOUBLE to threshold.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setThresholdPtr, NIL)
  }

  public fun getThreshold(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getThresholdPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setRatio(ratio: Float): Unit {
    TransferContext.writeArguments(DOUBLE to ratio.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setRatioPtr, NIL)
  }

  public fun getRatio(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRatioPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setGain(gain: Float): Unit {
    TransferContext.writeArguments(DOUBLE to gain.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setGainPtr, NIL)
  }

  public fun getGain(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getGainPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setAttackUs(attackUs: Float): Unit {
    TransferContext.writeArguments(DOUBLE to attackUs.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setAttackUsPtr, NIL)
  }

  public fun getAttackUs(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAttackUsPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setReleaseMs(releaseMs: Float): Unit {
    TransferContext.writeArguments(DOUBLE to releaseMs.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setReleaseMsPtr, NIL)
  }

  public fun getReleaseMs(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getReleaseMsPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setMix(mix: Float): Unit {
    TransferContext.writeArguments(DOUBLE to mix.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setMixPtr, NIL)
  }

  public fun getMix(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMixPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setSidechain(sidechain: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to sidechain)
    TransferContext.callMethod(rawPtr, MethodBindings.setSidechainPtr, NIL)
  }

  public fun getSidechain(): StringName {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSidechainPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  public companion object

  internal object MethodBindings {
    public val setThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCompressor", "set_threshold", 373806689)

    public val getThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCompressor", "get_threshold", 1740695150)

    public val setRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCompressor", "set_ratio", 373806689)

    public val getRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCompressor", "get_ratio", 1740695150)

    public val setGainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCompressor", "set_gain", 373806689)

    public val getGainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCompressor", "get_gain", 1740695150)

    public val setAttackUsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCompressor", "set_attack_us", 373806689)

    public val getAttackUsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCompressor", "get_attack_us", 1740695150)

    public val setReleaseMsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCompressor", "set_release_ms", 373806689)

    public val getReleaseMsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCompressor", "get_release_ms", 1740695150)

    public val setMixPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCompressor", "set_mix", 373806689)

    public val getMixPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCompressor", "get_mix", 1740695150)

    public val setSidechainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCompressor", "set_sidechain", 3304788590)

    public val getSidechainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectCompressor", "get_sidechain", 2002593661)
  }
}
