// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Adds a distortion audio effect to an Audio bus.
 *
 * Modifies the sound to make it distorted.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/audio/audio_buses.html]($DOCS_URL/tutorials/audio/audio_buses.html)
 *
 * Different types are available: clip, tan, lo-fi (bit crushing), overdrive, or waveshape.
 *
 * By distorting the waveform the frequency content changes, which will often make the sound "crunchy" or "abrasive". For games, it can simulate sound coming from some saturated device or speaker very efficiently.
 */
@GodotBaseType
public open class AudioEffectDistortion : AudioEffect() {
  /**
   * Distortion type.
   */
  public var mode: Mode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDISTORTION_GET_MODE,
          LONG)
      return AudioEffectDistortion.Mode.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDISTORTION_SET_MODE,
          NIL)
    }

  /**
   * Increases or decreases the volume before the effect, in decibels. Value can range from -60 to 60.
   */
  public var preGain: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDISTORTION_GET_PRE_GAIN, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDISTORTION_SET_PRE_GAIN, NIL)
    }

  /**
   * High-pass filter, in Hz. Frequencies higher than this value will not be affected by the distortion. Value can range from 1 to 20000.
   */
  public var keepHfHz: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDISTORTION_GET_KEEP_HF_HZ, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDISTORTION_SET_KEEP_HF_HZ, NIL)
    }

  /**
   * Distortion power. Value can range from 0 to 1.
   */
  public var drive: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDISTORTION_GET_DRIVE,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDISTORTION_SET_DRIVE,
          NIL)
    }

  /**
   * Increases or decreases the volume after the effect, in decibels. Value can range from -80 to 24.
   */
  public var postGain: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDISTORTION_GET_POST_GAIN, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDISTORTION_SET_POST_GAIN, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AUDIOEFFECTDISTORTION, scriptIndex)
    return true
  }

  public enum class Mode(
    id: Long,
  ) {
    /**
     * Digital distortion effect which cuts off peaks at the top and bottom of the waveform.
     */
    MODE_CLIP(0),
    /**
     *
     */
    MODE_ATAN(1),
    /**
     * Low-resolution digital distortion effect (bit depth reduction). You can use it to emulate the sound of early digital audio devices.
     */
    MODE_LOFI(2),
    /**
     * Emulates the warm distortion produced by a field effect transistor, which is commonly used in solid-state musical instrument amplifiers. The [drive] property has no effect in this mode.
     */
    MODE_OVERDRIVE(3),
    /**
     * Waveshaper distortions are used mainly by electronic musicians to achieve an extra-abrasive sound.
     */
    MODE_WAVESHAPE(4),
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
