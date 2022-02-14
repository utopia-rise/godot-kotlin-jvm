// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class AudioEffectSpectrumAnalyzerInstance : AudioEffectInstance() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_AUDIOEFFECTSPECTRUMANALYZERINSTANCE)
  }

  /**
   *
   */
  public open fun getMagnitudeForFrequencyRange(
    fromHz: Double,
    toHz: Double,
    mode: AudioEffectSpectrumAnalyzerInstance.MagnitudeMode = MagnitudeMode.MAGNITUDE_MAX
  ): Vector2 {
    TransferContext.writeArguments(DOUBLE to fromHz, DOUBLE to toHz, LONG to mode.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTSPECTRUMANALYZERINSTANCE_GET_MAGNITUDE_FOR_FREQUENCY_RANGE,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  public enum class MagnitudeMode(
    id: Long
  ) {
    /**
     * Use the average value as magnitude.
     */
    MAGNITUDE_AVERAGE(0),
    /**
     * Use the maximum value as magnitude.
     */
    MAGNITUDE_MAX(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
