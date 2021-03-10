// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Double
import kotlin.Suppress

/**
 * Adds a delay audio effect to an audio bus. Plays input signal back after a period of time.
 *
 * Two tap delay and feedback options.
 *
 * Plays input signal back after a period of time. The delayed signal may be played back multiple times to create the sound of a repeating, decaying echo. Delay effects range from a subtle echo effect to a pronounced blending of previous sounds with new sounds.
 */
@GodotBaseType
open class AudioEffectDelay : AudioEffect() {
  /**
   * Output percent of original sound. At 0, only delayed sounds are output. Value can range from 0 to 1.
   */
  open var dry: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_GET_DRY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_SET_DRY, NIL)
    }

  open var feedback_active: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_GET_FEEDBACK_ACTIVE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_SET_FEEDBACK_ACTIVE, NIL)
    }

  open var feedback_delayMs: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_GET_FEEDBACK_DELAY_MS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_SET_FEEDBACK_DELAY_MS, NIL)
    }

  open var feedback_levelDb: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_GET_FEEDBACK_LEVEL_DB, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_SET_FEEDBACK_LEVEL_DB, NIL)
    }

  open var feedback_lowpass: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_GET_FEEDBACK_LOWPASS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_SET_FEEDBACK_LOWPASS, NIL)
    }

  open var tap1_active: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_GET_TAP1_ACTIVE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_SET_TAP1_ACTIVE,
          NIL)
    }

  open var tap1_delayMs: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_GET_TAP1_DELAY_MS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_SET_TAP1_DELAY_MS, NIL)
    }

  open var tap1_levelDb: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_GET_TAP1_LEVEL_DB, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_SET_TAP1_LEVEL_DB, NIL)
    }

  open var tap1_pan: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_GET_TAP1_PAN,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_SET_TAP1_PAN,
          NIL)
    }

  open var tap2_active: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_GET_TAP2_ACTIVE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_SET_TAP2_ACTIVE,
          NIL)
    }

  open var tap2_delayMs: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_GET_TAP2_DELAY_MS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_SET_TAP2_DELAY_MS, NIL)
    }

  open var tap2_levelDb: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_GET_TAP2_LEVEL_DB, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_SET_TAP2_LEVEL_DB, NIL)
    }

  open var tap2_pan: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_GET_TAP2_PAN,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTDELAY_SET_TAP2_PAN,
          NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_AUDIOEFFECTDELAY)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }
}
