// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

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
 * Adds a distortion audio effect to an Audio bus.
 *
 * Modify the sound to make it distorted.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/audio/audio_buses.html](https://docs.godotengine.org/en/latest/tutorials/audio/audio_buses.html)
 *
 * Different types are available: clip, tan, lo-fi (bit crushing), overdrive, or waveshape.
 *
 * By distorting the waveform the frequency content change, which will often make the sound "crunchy" or "abrasive". For games, it can simulate sound coming from some saturated device or speaker very efficiently.
 */
@GodotBaseType
open class AudioEffectDistortion : AudioEffect() {
  /**
   * Distortion power. Value can range from 0 to 1.
   */
  open var drive: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDISTORTION_GET_DRIVE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDISTORTION_SET_DRIVE,
          NIL)
    }

  /**
   * High-pass filter, in Hz. Frequencies higher than this value will not be affected by the distortion. Value can range from 1 to 20000.
   */
  open var keepHfHz: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDISTORTION_GET_KEEP_HF_HZ, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDISTORTION_SET_KEEP_HF_HZ, NIL)
    }

  /**
   * Distortion type.
   */
  open var mode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDISTORTION_GET_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDISTORTION_SET_MODE,
          NIL)
    }

  /**
   * Increases or decreases the volume after the effect. Value can range from -80 to 24.
   */
  open var postGain: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDISTORTION_GET_POST_GAIN, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDISTORTION_SET_POST_GAIN, NIL)
    }

  /**
   * Increases or decreases the volume before the effect. Value can range from -60 to 60.
   */
  open var preGain: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDISTORTION_GET_PRE_GAIN, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDISTORTION_SET_PRE_GAIN, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_AUDIOEFFECTDISTORTION)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  enum class Mode(
    id: Long
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
     * Low-resolution digital distortion effect. You can use it to emulate the sound of early digital audio devices.
     */
    MODE_LOFI(2),

    /**
     * Emulates the warm distortion produced by a field effect transistor, which is commonly used in solid-state musical instrument amplifiers.
     */
    MODE_OVERDRIVE(3),

    /**
     * Waveshaper distortions are used mainly by electronic musicians to achieve an extra-abrasive sound.
     */
    MODE_WAVESHAPE(4);

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
    final const val MODE_ATAN: Long = 1

    /**
     * Digital distortion effect which cuts off peaks at the top and bottom of the waveform.
     */
    final const val MODE_CLIP: Long = 0

    /**
     * Low-resolution digital distortion effect. You can use it to emulate the sound of early digital audio devices.
     */
    final const val MODE_LOFI: Long = 2

    /**
     * Emulates the warm distortion produced by a field effect transistor, which is commonly used in solid-state musical instrument amplifiers.
     */
    final const val MODE_OVERDRIVE: Long = 3

    /**
     * Waveshaper distortions are used mainly by electronic musicians to achieve an extra-abrasive sound.
     */
    final const val MODE_WAVESHAPE: Long = 4
  }
}
