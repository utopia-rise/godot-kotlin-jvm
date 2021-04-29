// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Double
import kotlin.Long
import kotlin.Suppress

/**
 * Adds a filter to the audio bus.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/3.3/tutorials/audio/audio_buses.html](https://docs.godotengine.org/en/3.3/tutorials/audio/audio_buses.html)
 *
 * Allows frequencies other than the [cutoffHz] to pass.
 */
@GodotBaseType
open class AudioEffectFilter : AudioEffect() {
  /**
   * Threshold frequency for the filter, in Hz.
   */
  open var cutoffHz: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTFILTER_GET_CUTOFF_HZ,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTFILTER_SET_CUTOFF_HZ,
          NIL)
    }

  /**
   *
   */
  open var db: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTFILTER_GET_DB, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTFILTER_SET_DB, NIL)
    }

  /**
   * Gain amount of the frequencies after the filter.
   */
  open var gain: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTFILTER_GET_GAIN,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTFILTER_SET_GAIN, NIL)
    }

  /**
   * Amount of boost in the frequency range near the cutoff frequency.
   */
  open var resonance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTFILTER_GET_RESONANCE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTFILTER_SET_RESONANCE,
          NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_AUDIOEFFECTFILTER)
  }

  enum class FilterDB(
    id: Long
  ) {
    /**
     *
     */
    FILTER_6DB(0),

    /**
     *
     */
    FILTER_12DB(1),

    /**
     *
     */
    FILTER_18DB(2),

    /**
     *
     */
    FILTER_24DB(3);

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
     *
     */
    final const val FILTER_12DB: Long = 1

    /**
     *
     */
    final const val FILTER_18DB: Long = 2

    /**
     *
     */
    final const val FILTER_24DB: Long = 3

    /**
     *
     */
    final const val FILTER_6DB: Long = 0
  }
}
