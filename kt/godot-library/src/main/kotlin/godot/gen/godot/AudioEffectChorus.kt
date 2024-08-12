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
import kotlin.Unit

/**
 * Adds a chorus audio effect. The effect applies a filter with voices to duplicate the audio source
 * and manipulate it through the filter.
 */
@GodotBaseType
public open class AudioEffectChorus : AudioEffect() {
  /**
   * The number of voices in the effect.
   */
  public var voiceCount: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVoiceCountPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setVoiceCountPtr, NIL)
    }

  /**
   * The effect's raw signal.
   */
  public var dry: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDryPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDryPtr, NIL)
    }

  /**
   * The effect's processed signal.
   */
  public var wet: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getWetPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setWetPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AUDIOEFFECTCHORUS, scriptIndex)
    return true
  }

  public fun setVoiceDelayMs(voiceIdx: Int, delayMs: Float): Unit {
    TransferContext.writeArguments(LONG to voiceIdx.toLong(), DOUBLE to delayMs.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setVoiceDelayMsPtr, NIL)
  }

  public fun getVoiceDelayMs(voiceIdx: Int): Float {
    TransferContext.writeArguments(LONG to voiceIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getVoiceDelayMsPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setVoiceRateHz(voiceIdx: Int, rateHz: Float): Unit {
    TransferContext.writeArguments(LONG to voiceIdx.toLong(), DOUBLE to rateHz.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setVoiceRateHzPtr, NIL)
  }

  public fun getVoiceRateHz(voiceIdx: Int): Float {
    TransferContext.writeArguments(LONG to voiceIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getVoiceRateHzPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setVoiceDepthMs(voiceIdx: Int, depthMs: Float): Unit {
    TransferContext.writeArguments(LONG to voiceIdx.toLong(), DOUBLE to depthMs.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setVoiceDepthMsPtr, NIL)
  }

  public fun getVoiceDepthMs(voiceIdx: Int): Float {
    TransferContext.writeArguments(LONG to voiceIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getVoiceDepthMsPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setVoiceLevelDb(voiceIdx: Int, levelDb: Float): Unit {
    TransferContext.writeArguments(LONG to voiceIdx.toLong(), DOUBLE to levelDb.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setVoiceLevelDbPtr, NIL)
  }

  public fun getVoiceLevelDb(voiceIdx: Int): Float {
    TransferContext.writeArguments(LONG to voiceIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getVoiceLevelDbPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setVoiceCutoffHz(voiceIdx: Int, cutoffHz: Float): Unit {
    TransferContext.writeArguments(LONG to voiceIdx.toLong(), DOUBLE to cutoffHz.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setVoiceCutoffHzPtr, NIL)
  }

  public fun getVoiceCutoffHz(voiceIdx: Int): Float {
    TransferContext.writeArguments(LONG to voiceIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getVoiceCutoffHzPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setVoicePan(voiceIdx: Int, pan: Float): Unit {
    TransferContext.writeArguments(LONG to voiceIdx.toLong(), DOUBLE to pan.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setVoicePanPtr, NIL)
  }

  public fun getVoicePan(voiceIdx: Int): Float {
    TransferContext.writeArguments(LONG to voiceIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getVoicePanPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public companion object

  internal object MethodBindings {
    public val setVoiceCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "set_voice_count")

    public val getVoiceCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "get_voice_count")

    public val setVoiceDelayMsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "set_voice_delay_ms")

    public val getVoiceDelayMsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "get_voice_delay_ms")

    public val setVoiceRateHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "set_voice_rate_hz")

    public val getVoiceRateHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "get_voice_rate_hz")

    public val setVoiceDepthMsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "set_voice_depth_ms")

    public val getVoiceDepthMsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "get_voice_depth_ms")

    public val setVoiceLevelDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "set_voice_level_db")

    public val getVoiceLevelDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "get_voice_level_db")

    public val setVoiceCutoffHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "set_voice_cutoff_hz")

    public val getVoiceCutoffHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "get_voice_cutoff_hz")

    public val setVoicePanPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "set_voice_pan")

    public val getVoicePanPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "get_voice_pan")

    public val setWetPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioEffectChorus", "set_wet")

    public val getWetPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioEffectChorus", "get_wet")

    public val setDryPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioEffectChorus", "set_dry")

    public val getDryPtr: VoidPtr = TypeManager.getMethodBindPtr("AudioEffectChorus", "get_dry")
  }
}
