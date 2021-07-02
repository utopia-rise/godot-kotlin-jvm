// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Adds a filter to the audio bus.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/3.3/tutorials/audio/audio_buses.html](https://docs.godotengine.org/en/3.3/tutorials/audio/audio_buses.html)
 *
 * Allows frequencies other than the [cutoffHz] to pass.
 */
@GodotBaseType
public open class AudioEffectFilter : AudioEffect() {
  /**
   * Threshold frequency for the filter, in Hz.
   */
  public open var cutoffHz: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTFILTER_GET_CUTOFF_HZ,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTFILTER_SET_CUTOFF_HZ,
          NIL)
    }

  /**
   *
   */
  public open var db: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTFILTER_GET_DB, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTFILTER_SET_DB, NIL)
    }

  /**
   * Gain amount of the frequencies after the filter.
   */
  public open var gain: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTFILTER_GET_GAIN,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTFILTER_SET_GAIN, NIL)
    }

  /**
   * Amount of boost in the frequency range near the cutoff frequency.
   */
  public open var resonance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTFILTER_GET_RESONANCE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTFILTER_SET_RESONANCE,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_AUDIOEFFECTFILTER)
  }

  public enum class FilterDB(
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
    FILTER_24DB(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    /**
     *
     */
    public final const val FILTER_12DB: Long = 1

    /**
     *
     */
    public final const val FILTER_18DB: Long = 2

    /**
     *
     */
    public final const val FILTER_24DB: Long = 3

    /**
     *
     */
    public final const val FILTER_6DB: Long = 0
  }
}
