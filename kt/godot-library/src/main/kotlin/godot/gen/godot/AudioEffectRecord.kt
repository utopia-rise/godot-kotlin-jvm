// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Allows the user to record the sound from an audio bus into an [AudioStreamWAV]. When used on the
 * "Master" audio bus, this includes all audio output by Godot.
 * Unlike [AudioEffectCapture], this effect encodes the recording with the given format (8-bit,
 * 16-bit, or compressed) instead of giving access to the raw audio samples.
 * Can be used (with an [AudioStreamMicrophone]) to record from a microphone.
 * **Note:** [ProjectSettings.audio/driver/enableInput] must be `true` for audio input to work. See
 * also that setting's description for caveats related to permissions and operating system privacy
 * settings.
 */
@GodotBaseType
public open class AudioEffectRecord : AudioEffect() {
  /**
   * Specifies the format in which the sample will be recorded. See [AudioStreamWAV.Format] for
   * available formats.
   */
  public final inline var format: AudioStreamWAV.Format
    @JvmName("formatProperty")
    get() = getFormat()
    @JvmName("formatProperty")
    set(`value`) {
      setFormat(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_AUDIOEFFECTRECORD, scriptIndex)
  }

  /**
   * If `true`, the sound will be recorded. Note that restarting the recording will remove the
   * previously recorded sample.
   */
  public final fun setRecordingActive(record: Boolean): Unit {
    TransferContext.writeArguments(BOOL to record)
    TransferContext.callMethod(rawPtr, MethodBindings.setRecordingActivePtr, NIL)
  }

  /**
   * Returns whether the recording is active or not.
   */
  public final fun isRecordingActive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isRecordingActivePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setFormat(format: AudioStreamWAV.Format): Unit {
    TransferContext.writeArguments(LONG to format.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setFormatPtr, NIL)
  }

  public final fun getFormat(): AudioStreamWAV.Format {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFormatPtr, LONG)
    return AudioStreamWAV.Format.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the recorded sample.
   */
  public final fun getRecording(): AudioStreamWAV? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRecordingPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as AudioStreamWAV?)
  }

  public companion object

  internal object MethodBindings {
    public val setRecordingActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectRecord", "set_recording_active", 2586408642)

    public val isRecordingActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectRecord", "is_recording_active", 36873697)

    public val setFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectRecord", "set_format", 60648488)

    public val getFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectRecord", "get_format", 3151724922)

    public val getRecordingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectRecord", "get_recording", 2964110865)
  }
}
