// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
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
    createNativeObject(70, scriptIndex)
  }

  /**
   * If `true`, the sound will be recorded. Note that restarting the recording will remove the
   * previously recorded sample.
   */
  public final fun setRecordingActive(record: Boolean): Unit {
    TransferContext.writeArguments(BOOL to record)
    TransferContext.callMethod(ptr, MethodBindings.setRecordingActivePtr, NIL)
  }

  /**
   * Returns whether the recording is active or not.
   */
  public final fun isRecordingActive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isRecordingActivePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setFormat(format: AudioStreamWAV.Format): Unit {
    TransferContext.writeArguments(LONG to format.id)
    TransferContext.callMethod(ptr, MethodBindings.setFormatPtr, NIL)
  }

  public final fun getFormat(): AudioStreamWAV.Format {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFormatPtr, LONG)
    return AudioStreamWAV.Format.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the recorded sample.
   */
  public final fun getRecording(): AudioStreamWAV? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRecordingPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as AudioStreamWAV?)
  }

  public companion object

  public object MethodBindings {
    internal val setRecordingActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectRecord", "set_recording_active", 2586408642)

    internal val isRecordingActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectRecord", "is_recording_active", 36873697)

    internal val setFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectRecord", "set_format", 60648488)

    internal val getFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectRecord", "get_format", 3151724922)

    internal val getRecordingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectRecord", "get_recording", 2964110865)
  }
}
