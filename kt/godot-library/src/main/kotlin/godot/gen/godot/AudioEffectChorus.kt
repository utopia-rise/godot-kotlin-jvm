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
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Adds a chorus audio effect.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/audio/audio_buses.html]($DOCS_URL/tutorials/audio/audio_buses.html)
 *
 * Adds a chorus audio effect. The effect applies a filter with voices to duplicate the audio source and manipulate it through the filter.
 */
@GodotBaseType
public open class AudioEffectChorus : AudioEffect() {
  /**
   * The number of voices in the effect.
   */
  public var voiceCount: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTCHORUS_GET_VOICE_COUNT,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTCHORUS_SET_VOICE_COUNT,
          NIL)
    }

  /**
   * The effect's raw signal.
   */
  public var dry: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTCHORUS_GET_DRY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTCHORUS_SET_DRY, NIL)
    }

  /**
   * The effect's processed signal.
   */
  public var wet: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTCHORUS_GET_WET, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTCHORUS_SET_WET, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AUDIOEFFECTCHORUS, scriptIndex)
    return true
  }

  /**
   *
   */
  public fun setVoiceDelayMs(voiceIdx: Long, delayMs: Double): Unit {
    TransferContext.writeArguments(LONG to voiceIdx, DOUBLE to delayMs)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTCHORUS_SET_VOICE_DELAY_MS, NIL)
  }

  /**
   *
   */
  public fun getVoiceDelayMs(voiceIdx: Long): Double {
    TransferContext.writeArguments(LONG to voiceIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTCHORUS_GET_VOICE_DELAY_MS, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   *
   */
  public fun setVoiceRateHz(voiceIdx: Long, rateHz: Double): Unit {
    TransferContext.writeArguments(LONG to voiceIdx, DOUBLE to rateHz)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTCHORUS_SET_VOICE_RATE_HZ,
        NIL)
  }

  /**
   *
   */
  public fun getVoiceRateHz(voiceIdx: Long): Double {
    TransferContext.writeArguments(LONG to voiceIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTCHORUS_GET_VOICE_RATE_HZ,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   *
   */
  public fun setVoiceDepthMs(voiceIdx: Long, depthMs: Double): Unit {
    TransferContext.writeArguments(LONG to voiceIdx, DOUBLE to depthMs)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTCHORUS_SET_VOICE_DEPTH_MS, NIL)
  }

  /**
   *
   */
  public fun getVoiceDepthMs(voiceIdx: Long): Double {
    TransferContext.writeArguments(LONG to voiceIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTCHORUS_GET_VOICE_DEPTH_MS, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   *
   */
  public fun setVoiceLevelDb(voiceIdx: Long, levelDb: Double): Unit {
    TransferContext.writeArguments(LONG to voiceIdx, DOUBLE to levelDb)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTCHORUS_SET_VOICE_LEVEL_DB, NIL)
  }

  /**
   *
   */
  public fun getVoiceLevelDb(voiceIdx: Long): Double {
    TransferContext.writeArguments(LONG to voiceIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTCHORUS_GET_VOICE_LEVEL_DB, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   *
   */
  public fun setVoiceCutoffHz(voiceIdx: Long, cutoffHz: Double): Unit {
    TransferContext.writeArguments(LONG to voiceIdx, DOUBLE to cutoffHz)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTCHORUS_SET_VOICE_CUTOFF_HZ, NIL)
  }

  /**
   *
   */
  public fun getVoiceCutoffHz(voiceIdx: Long): Double {
    TransferContext.writeArguments(LONG to voiceIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTCHORUS_GET_VOICE_CUTOFF_HZ, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   *
   */
  public fun setVoicePan(voiceIdx: Long, pan: Double): Unit {
    TransferContext.writeArguments(LONG to voiceIdx, DOUBLE to pan)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTCHORUS_SET_VOICE_PAN,
        NIL)
  }

  /**
   *
   */
  public fun getVoicePan(voiceIdx: Long): Double {
    TransferContext.writeArguments(LONG to voiceIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_AUDIOEFFECTCHORUS_GET_VOICE_PAN,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  public companion object
}
