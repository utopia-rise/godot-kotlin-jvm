// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_AUDIOEFFECTDISTORTION_INDEX: Int = 88

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
  public final inline var mode: Mode
    @JvmName("modeProperty")
    get() = getMode()
    @JvmName("modeProperty")
    set(`value`) {
      setMode(value)
    }

  /**
   * Increases or decreases the volume before the effect, in decibels. Value can range from -60 to
   * 60.
   */
  public final inline var preGain: Float
    @JvmName("preGainProperty")
    get() = getPreGain()
    @JvmName("preGainProperty")
    set(`value`) {
      setPreGain(value)
    }

  /**
   * High-pass filter, in Hz. Frequencies higher than this value will not be affected by the
   * distortion. Value can range from 1 to 20000.
   */
  public final inline var keepHfHz: Float
    @JvmName("keepHfHzProperty")
    get() = getKeepHfHz()
    @JvmName("keepHfHzProperty")
    set(`value`) {
      setKeepHfHz(value)
    }

  /**
   * Distortion power. Value can range from 0 to 1.
   */
  public final inline var drive: Float
    @JvmName("driveProperty")
    get() = getDrive()
    @JvmName("driveProperty")
    set(`value`) {
      setDrive(value)
    }

  /**
   * Increases or decreases the volume after the effect, in decibels. Value can range from -80 to
   * 24.
   */
  public final inline var postGain: Float
    @JvmName("postGainProperty")
    get() = getPostGain()
    @JvmName("postGainProperty")
    set(`value`) {
      setPostGain(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_AUDIOEFFECTDISTORTION_INDEX, scriptIndex)
  }

  public final fun setMode(mode: Mode): Unit {
    Internals.writeArguments(LONG to mode.id)
    Internals.callMethod(rawPtr, MethodBindings.setModePtr, NIL)
  }

  public final fun getMode(): Mode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getModePtr, LONG)
    return AudioEffectDistortion.Mode.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setPreGain(preGain: Float): Unit {
    Internals.writeArguments(DOUBLE to preGain.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setPreGainPtr, NIL)
  }

  public final fun getPreGain(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPreGainPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setKeepHfHz(keepHfHz: Float): Unit {
    Internals.writeArguments(DOUBLE to keepHfHz.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setKeepHfHzPtr, NIL)
  }

  public final fun getKeepHfHz(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getKeepHfHzPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDrive(drive: Float): Unit {
    Internals.writeArguments(DOUBLE to drive.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setDrivePtr, NIL)
  }

  public final fun getDrive(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDrivePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setPostGain(postGain: Float): Unit {
    Internals.writeArguments(DOUBLE to postGain.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setPostGainPtr, NIL)
  }

  public final fun getPostGain(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPostGainPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
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

  public object MethodBindings {
    internal val setModePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectDistortion", "set_mode", 1314744793)

    internal val getModePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectDistortion", "get_mode", 809118343)

    internal val setPreGainPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectDistortion", "set_pre_gain", 373806689)

    internal val getPreGainPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectDistortion", "get_pre_gain", 1740695150)

    internal val setKeepHfHzPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectDistortion", "set_keep_hf_hz", 373806689)

    internal val getKeepHfHzPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectDistortion", "get_keep_hf_hz", 1740695150)

    internal val setDrivePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectDistortion", "set_drive", 373806689)

    internal val getDrivePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectDistortion", "get_drive", 1740695150)

    internal val setPostGainPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectDistortion", "set_post_gain", 373806689)

    internal val getPostGainPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectDistortion", "get_post_gain", 1740695150)
  }
}
