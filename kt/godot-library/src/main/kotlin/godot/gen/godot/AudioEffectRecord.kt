// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Audio effect used for recording the sound from an audio bus.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/527](https://godotengine.org/asset-library/asset/527)
 *
 * Allows the user to record the sound from an audio bus. This can include all audio output by Godot when used on the "Master" audio bus.
 *
 * Can be used (with an [godot.AudioStreamMicrophone]) to record from a microphone.
 *
 * It sets and gets the format in which the audio file will be recorded (8-bit, 16-bit, or compressed). It checks whether or not the recording is active, and if it is, records the sound. It then returns the recorded sample.
 */
@GodotBaseType
public open class AudioEffectRecord : AudioEffect() {
  /**
   * Specifies the format in which the sample will be recorded. See [enum AudioStreamWAV.Format] for available formats.
   */
  public var format: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTRECORD_GET_FORMAT,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTRECORD_SET_FORMAT, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_AUDIOEFFECTRECORD)
  }

  /**
   * If `true`, the sound will be recorded. Note that restarting the recording will remove the previously recorded sample.
   */
  public fun setRecordingActive(record: Boolean): Unit {
    TransferContext.writeArguments(BOOL to record)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTRECORD_SET_RECORDING_ACTIVE, NIL)
  }

  /**
   * Returns whether the recording is active or not.
   */
  public fun isRecordingActive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTRECORD_IS_RECORDING_ACTIVE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the recorded sample.
   */
  public fun getRecording(): AudioStreamSample? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTRECORD_GET_RECORDING,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as AudioStreamSample?
  }

  public companion object
}
