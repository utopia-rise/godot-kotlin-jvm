// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Double
import kotlin.Long
import kotlin.Suppress

/**
 *
 */
@GodotBaseType
open class AudioEffectSpectrumAnalyzerInstance : AudioEffectInstance() {
  override fun __new() {
    callConstructor(ENGINECLASS_AUDIOEFFECTSPECTRUMANALYZERINSTANCE)
  }

  /**
   *
   */
  open fun getMagnitudeForFrequencyRange(
    fromHz: Double,
    toHz: Double,
    mode: Long = 1
  ): Vector2 {
    TransferContext.writeArguments(DOUBLE to fromHz, DOUBLE to toHz, LONG to mode)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTSPECTRUMANALYZERINSTANCE_GET_MAGNITUDE_FOR_FREQUENCY_RANGE,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  enum class MagnitudeMode(
    id: Long
  ) {
    /**
     * Use the average value as magnitude.
     */
    MAGNITUDE_AVERAGE(0),

    /**
     * Use the maximum value as magnitude.
     */
    MAGNITUDE_MAX(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * Use the average value as magnitude.
     */
    final const val MAGNITUDE_AVERAGE: Long = 0

    /**
     * Use the maximum value as magnitude.
     */
    final const val MAGNITUDE_MAX: Long = 1
  }
}
