// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_AUDIOEFFECTHARDLIMITER_INDEX: Int = 93

/**
 * A limiter is an effect designed to disallow sound from going over a given dB threshold. Hard
 * limiters predict volume peaks, and will smoothly apply gain reduction when a peak crosses the
 * ceiling threshold to prevent clipping and distortion. It preserves the waveform and prevents it from
 * crossing the ceiling threshold. Adding one in the Master bus is recommended as a safety measure to
 * prevent sudden volume peaks from occurring, and to prevent distortion caused by clipping.
 */
@GodotBaseType
public open class AudioEffectHardLimiter : AudioEffect() {
  /**
   * Gain to apply before limiting, in decibels.
   */
  public final inline var preGainDb: Float
    @JvmName("preGainDbProperty")
    get() = getPreGainDb()
    @JvmName("preGainDbProperty")
    set(`value`) {
      setPreGainDb(value)
    }

  /**
   * The waveform's maximum allowed value, in decibels. This value can range from `-24.0` to `0.0`.
   * The default value of `-0.3` prevents potential inter-sample peaks (ISP) from crossing over 0
   * dB, which can cause slight distortion on some older hardware.
   */
  public final inline var ceilingDb: Float
    @JvmName("ceilingDbProperty")
    get() = getCeilingDb()
    @JvmName("ceilingDbProperty")
    set(`value`) {
      setCeilingDb(value)
    }

  /**
   * Time it takes in seconds for the gain reduction to fully release.
   */
  public final inline var release: Float
    @JvmName("releaseProperty")
    get() = getRelease()
    @JvmName("releaseProperty")
    set(`value`) {
      setRelease(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINE_CLASS_AUDIOEFFECTHARDLIMITER_INDEX, scriptIndex)
  }

  public final fun setCeilingDb(ceiling: Float): Unit {
    TransferContext.writeArguments(DOUBLE to ceiling.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setCeilingDbPtr, NIL)
  }

  public final fun getCeilingDb(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCeilingDbPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setPreGainDb(pPreGain: Float): Unit {
    TransferContext.writeArguments(DOUBLE to pPreGain.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setPreGainDbPtr, NIL)
  }

  public final fun getPreGainDb(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPreGainDbPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRelease(pRelease: Float): Unit {
    TransferContext.writeArguments(DOUBLE to pRelease.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setReleasePtr, NIL)
  }

  public final fun getRelease(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getReleasePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  internal object MethodBindings {
    public val setCeilingDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectHardLimiter", "set_ceiling_db", 373806689)

    public val getCeilingDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectHardLimiter", "get_ceiling_db", 1740695150)

    public val setPreGainDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectHardLimiter", "set_pre_gain_db", 373806689)

    public val getPreGainDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectHardLimiter", "get_pre_gain_db", 1740695150)

    public val setReleasePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectHardLimiter", "set_release", 373806689)

    public val getReleasePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectHardLimiter", "get_release", 1740695150)
  }
}
