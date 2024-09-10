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
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
  public var preGain: Float
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
  public var keepHfHz: Float
    @JvmName("keepHfHzProperty")
    get() = getKeepHfHz()
    @JvmName("keepHfHzProperty")
    set(`value`) {
      setKeepHfHz(value)
    }

  /**
   * Distortion power. Value can range from 0 to 1.
   */
  public var drive: Float
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
  public var postGain: Float
    @JvmName("postGainProperty")
    get() = getPostGain()
    @JvmName("postGainProperty")
    set(`value`) {
      setPostGain(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_AUDIOEFFECTDISTORTION, scriptIndex)
  }

  public fun setMode(mode: Mode): Unit {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setModePtr, NIL)
  }

  public fun getMode(): Mode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getModePtr, LONG)
    return AudioEffectDistortion.Mode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setPreGain(preGain: Float): Unit {
    TransferContext.writeArguments(DOUBLE to preGain.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setPreGainPtr, NIL)
  }

  public fun getPreGain(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPreGainPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setKeepHfHz(keepHfHz: Float): Unit {
    TransferContext.writeArguments(DOUBLE to keepHfHz.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setKeepHfHzPtr, NIL)
  }

  public fun getKeepHfHz(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getKeepHfHzPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setDrive(drive: Float): Unit {
    TransferContext.writeArguments(DOUBLE to drive.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setDrivePtr, NIL)
  }

  public fun getDrive(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDrivePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setPostGain(postGain: Float): Unit {
    TransferContext.writeArguments(DOUBLE to postGain.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setPostGainPtr, NIL)
  }

  public fun getPostGain(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPostGainPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
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
        TypeManager.getMethodBindPtr("AudioEffectDistortion", "set_mode", 1314744793)

    public val getModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDistortion", "get_mode", 809118343)

    public val setPreGainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDistortion", "set_pre_gain", 373806689)

    public val getPreGainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDistortion", "get_pre_gain", 1740695150)

    public val setKeepHfHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDistortion", "set_keep_hf_hz", 373806689)

    public val getKeepHfHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDistortion", "get_keep_hf_hz", 1740695150)

    public val setDrivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDistortion", "set_drive", 373806689)

    public val getDrivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDistortion", "get_drive", 1740695150)

    public val setPostGainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDistortion", "set_post_gain", 373806689)

    public val getPostGainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectDistortion", "get_post_gain", 1740695150)
  }
}
