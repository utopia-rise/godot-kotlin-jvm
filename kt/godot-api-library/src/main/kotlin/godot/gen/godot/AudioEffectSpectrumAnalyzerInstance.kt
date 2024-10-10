// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * The runtime part of an [AudioEffectSpectrumAnalyzer], which can be used to query the magnitude of
 * a frequency range on its host bus.
 * An instance of this class can be acquired with [AudioServer.getBusEffectInstance].
 */
@GodotBaseType
public open class AudioEffectSpectrumAnalyzerInstance internal constructor() : AudioEffectInstance()
    {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_AUDIOEFFECTSPECTRUMANALYZERINSTANCE_INDEX,
        scriptIndex)
  }

  /**
   * Returns the magnitude of the frequencies from [fromHz] to [toHz] in linear energy as a Vector2.
   * The `x` component of the return value represents the left stereo channel, and `y` represents the
   * right channel.
   * [mode] determines how the frequency range will be processed. See [MagnitudeMode].
   */
  @JvmOverloads
  public final fun getMagnitudeForFrequencyRange(
    fromHz: Float,
    toHz: Float,
    mode: MagnitudeMode = AudioEffectSpectrumAnalyzerInstance.MagnitudeMode.MAGNITUDE_MAX,
  ): Vector2 {
    Internals.writeArguments(DOUBLE to fromHz.toDouble(), DOUBLE to toHz.toDouble(), LONG to mode.id)
    Internals.callMethod(rawPtr, MethodBindings.getMagnitudeForFrequencyRangePtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  public enum class MagnitudeMode(
    id: Long,
  ) {
    /**
     * Use the average value across the frequency range as magnitude.
     */
    MAGNITUDE_AVERAGE(0),
    /**
     * Use the maximum value of the frequency range as magnitude.
     */
    MAGNITUDE_MAX(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): MagnitudeMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val getMagnitudeForFrequencyRangePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectSpectrumAnalyzerInstance", "get_magnitude_for_frequency_range", 797993915)
  }
}
