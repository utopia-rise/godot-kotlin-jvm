// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Different types are available: clip, tan, lo-fi (bit crushing), overdrive, or waveshape.
 * By distorting the waveform the frequency content changes, which will often make the sound
 * "crunchy" or "abrasive". For games, it can simulate sound coming from some saturated device or
 * speaker very efficiently.
 */
@GodotBaseType
public open class AudioEffectDistortion : AudioEffect() {
  /**
   * Distortion type.
   */
  public var mode: Mode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getModePtr, LONG)
      return AudioEffectDistortion.Mode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setModePtr, NIL)
    }

  /**
   * Increases or decreases the volume before the effect, in decibels. Value can range from -60 to
   * 60.
   */
  public var preGain: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPreGainPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setPreGainPtr, NIL)
    }

  /**
   * High-pass filter, in Hz. Frequencies higher than this value will not be affected by the
   * distortion. Value can range from 1 to 20000.
   */
  public var keepHfHz: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getKeepHfHzPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setKeepHfHzPtr, NIL)
    }

  /**
   * Distortion power. Value can range from 0 to 1.
   */
  public var drive: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDrivePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDrivePtr, NIL)
    }

  /**
   * Increases or decreases the volume after the effect, in decibels. Value can range from -80 to
   * 24.
   */
  public var postGain: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPostGainPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setPostGainPtr, NIL)
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
    MODE_ATAN(1),
    /**
     * Low-resolution digital distortion effect (bit depth reduction). You can use it to emulate the
     * sound of early digital audio devices.
     */
    MODE_LOFI(2),
    /**
     * Emulates the warm distortion produced by a field effect transistor, which is commonly used in
     * solid-state musical instrument amplifiers. The [drive] property has no effect in this mode.
     */
    MODE_OVERDRIVE(3),
    /**
     * Waveshaper distortions are used mainly by electronic musicians to achieve an extra-abrasive
     * sound.
     */
    MODE_WAVESHAPE(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Mode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDistortion", "set_mode")

    public val getModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDistortion", "get_mode")

    public val setPreGainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDistortion", "set_pre_gain")

    public val getPreGainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDistortion", "get_pre_gain")

    public val setKeepHfHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDistortion", "set_keep_hf_hz")

    public val getKeepHfHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDistortion", "get_keep_hf_hz")

    public val setDrivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDistortion", "set_drive")

    public val getDrivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDistortion", "get_drive")

    public val setPostGainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDistortion", "set_post_gain")

    public val getPostGainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDistortion", "get_post_gain")
  }
}
