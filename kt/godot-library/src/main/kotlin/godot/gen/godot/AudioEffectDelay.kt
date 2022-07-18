// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Double
import kotlin.Suppress
import kotlin.Unit

/**
 * Adds a delay audio effect to an audio bus. Plays input signal back after a period of time.
 *
 * Two tap delay and feedback options.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/audio/audio_buses.html]($DOCS_URL/tutorials/audio/audio_buses.html)
 *
 * Plays input signal back after a period of time. The delayed signal may be played back multiple times to create the sound of a repeating, decaying echo. Delay effects range from a subtle echo effect to a pronounced blending of previous sounds with new sounds.
 */
@GodotBaseType
public open class AudioEffectDelay : AudioEffect() {
  /**
   * Output percent of original sound. At 0, only delayed sounds are output. Value can range from 0 to 1.
   */
  public var dry: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_GET_DRY,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_SET_DRY, NIL.ordinal)
    }

  /**
   * If `true`, `tap1` will be enabled.
   */
  public var tap1_active: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_IS_TAP1_ACTIVE,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_SET_TAP1_ACTIVE,
          NIL.ordinal)
    }

  /**
   * `tap1` delay time in milliseconds.
   */
  public var tap1_delayMs: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_GET_TAP1_DELAY_MS,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_SET_TAP1_DELAY_MS,
          NIL.ordinal)
    }

  /**
   * Sound level for `tap1`.
   */
  public var tap1_levelDb: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_GET_TAP1_LEVEL_DB,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_SET_TAP1_LEVEL_DB,
          NIL.ordinal)
    }

  /**
   * Pan position for `tap1`. Value can range from -1 (fully left) to 1 (fully right).
   */
  public var tap1_pan: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_GET_TAP1_PAN,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_SET_TAP1_PAN,
          NIL.ordinal)
    }

  /**
   * If `true`, `tap2` will be enabled.
   */
  public var tap2_active: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_IS_TAP2_ACTIVE,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_SET_TAP2_ACTIVE,
          NIL.ordinal)
    }

  /**
   * **Tap2** delay time in milliseconds.
   */
  public var tap2_delayMs: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_GET_TAP2_DELAY_MS,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_SET_TAP2_DELAY_MS,
          NIL.ordinal)
    }

  /**
   * Sound level for `tap2`.
   */
  public var tap2_levelDb: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_GET_TAP2_LEVEL_DB,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_SET_TAP2_LEVEL_DB,
          NIL.ordinal)
    }

  /**
   * Pan position for `tap2`. Value can range from -1 (fully left) to 1 (fully right).
   */
  public var tap2_pan: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_GET_TAP2_PAN,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_SET_TAP2_PAN,
          NIL.ordinal)
    }

  /**
   * If `true`, feedback is enabled.
   */
  public var feedback_active: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_IS_FEEDBACK_ACTIVE,
          BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_SET_FEEDBACK_ACTIVE,
          NIL.ordinal)
    }

  /**
   * Feedback delay time in milliseconds.
   */
  public var feedback_delayMs: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_GET_FEEDBACK_DELAY_MS,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_SET_FEEDBACK_DELAY_MS,
          NIL.ordinal)
    }

  /**
   * Sound level for `tap1`.
   */
  public var feedback_levelDb: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_GET_FEEDBACK_LEVEL_DB,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_SET_FEEDBACK_LEVEL_DB,
          NIL.ordinal)
    }

  /**
   * Low-pass filter for feedback, in Hz. Frequencies below this value are filtered out of the source signal.
   */
  public var feedback_lowpass: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_GET_FEEDBACK_LOWPASS,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_SET_FEEDBACK_LOWPASS,
          NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_AUDIOEFFECTDELAY)
  }

  public companion object
}
