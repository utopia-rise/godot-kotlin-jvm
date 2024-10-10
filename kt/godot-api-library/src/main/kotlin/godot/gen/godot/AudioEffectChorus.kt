// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_AUDIOEFFECTCHORUS_INDEX: Int = 84

/**
 * Adds a chorus audio effect. The effect applies a filter with voices to duplicate the audio source
 * and manipulate it through the filter.
 */
@GodotBaseType
public open class AudioEffectChorus : AudioEffect() {
  /**
   * The number of voices in the effect.
   */
  public final inline var voiceCount: Int
    @JvmName("voiceCountProperty")
    get() = getVoiceCount()
    @JvmName("voiceCountProperty")
    set(`value`) {
      setVoiceCount(value)
    }

  /**
   * The effect's raw signal.
   */
  public final inline var dry: Float
    @JvmName("dryProperty")
    get() = getDry()
    @JvmName("dryProperty")
    set(`value`) {
      setDry(value)
    }

  /**
   * The effect's processed signal.
   */
  public final inline var wet: Float
    @JvmName("wetProperty")
    get() = getWet()
    @JvmName("wetProperty")
    set(`value`) {
      setWet(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINE_CLASS_AUDIOEFFECTCHORUS_INDEX, scriptIndex)
  }

  public final fun setVoiceCount(voices: Int): Unit {
    TransferContext.writeArguments(LONG to voices.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setVoiceCountPtr, NIL)
  }

  public final fun getVoiceCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVoiceCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setVoiceDelayMs(voiceIdx: Int, delayMs: Float): Unit {
    TransferContext.writeArguments(LONG to voiceIdx.toLong(), DOUBLE to delayMs.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setVoiceDelayMsPtr, NIL)
  }

  public final fun getVoiceDelayMs(voiceIdx: Int): Float {
    TransferContext.writeArguments(LONG to voiceIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getVoiceDelayMsPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVoiceRateHz(voiceIdx: Int, rateHz: Float): Unit {
    TransferContext.writeArguments(LONG to voiceIdx.toLong(), DOUBLE to rateHz.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setVoiceRateHzPtr, NIL)
  }

  public final fun getVoiceRateHz(voiceIdx: Int): Float {
    TransferContext.writeArguments(LONG to voiceIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getVoiceRateHzPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVoiceDepthMs(voiceIdx: Int, depthMs: Float): Unit {
    TransferContext.writeArguments(LONG to voiceIdx.toLong(), DOUBLE to depthMs.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setVoiceDepthMsPtr, NIL)
  }

  public final fun getVoiceDepthMs(voiceIdx: Int): Float {
    TransferContext.writeArguments(LONG to voiceIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getVoiceDepthMsPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVoiceLevelDb(voiceIdx: Int, levelDb: Float): Unit {
    TransferContext.writeArguments(LONG to voiceIdx.toLong(), DOUBLE to levelDb.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setVoiceLevelDbPtr, NIL)
  }

  public final fun getVoiceLevelDb(voiceIdx: Int): Float {
    TransferContext.writeArguments(LONG to voiceIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getVoiceLevelDbPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVoiceCutoffHz(voiceIdx: Int, cutoffHz: Float): Unit {
    TransferContext.writeArguments(LONG to voiceIdx.toLong(), DOUBLE to cutoffHz.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setVoiceCutoffHzPtr, NIL)
  }

  public final fun getVoiceCutoffHz(voiceIdx: Int): Float {
    TransferContext.writeArguments(LONG to voiceIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getVoiceCutoffHzPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVoicePan(voiceIdx: Int, pan: Float): Unit {
    TransferContext.writeArguments(LONG to voiceIdx.toLong(), DOUBLE to pan.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setVoicePanPtr, NIL)
  }

  public final fun getVoicePan(voiceIdx: Int): Float {
    TransferContext.writeArguments(LONG to voiceIdx.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getVoicePanPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setWet(amount: Float): Unit {
    TransferContext.writeArguments(DOUBLE to amount.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setWetPtr, NIL)
  }

  public final fun getWet(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getWetPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDry(amount: Float): Unit {
    TransferContext.writeArguments(DOUBLE to amount.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setDryPtr, NIL)
  }

  public final fun getDry(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDryPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  internal object MethodBindings {
    public val setVoiceCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "set_voice_count", 1286410249)

    public val getVoiceCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "get_voice_count", 3905245786)

    public val setVoiceDelayMsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "set_voice_delay_ms", 1602489585)

    public val getVoiceDelayMsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "get_voice_delay_ms", 2339986948)

    public val setVoiceRateHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "set_voice_rate_hz", 1602489585)

    public val getVoiceRateHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "get_voice_rate_hz", 2339986948)

    public val setVoiceDepthMsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "set_voice_depth_ms", 1602489585)

    public val getVoiceDepthMsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "get_voice_depth_ms", 2339986948)

    public val setVoiceLevelDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "set_voice_level_db", 1602489585)

    public val getVoiceLevelDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "get_voice_level_db", 2339986948)

    public val setVoiceCutoffHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "set_voice_cutoff_hz", 1602489585)

    public val getVoiceCutoffHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "get_voice_cutoff_hz", 2339986948)

    public val setVoicePanPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "set_voice_pan", 1602489585)

    public val getVoicePanPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "get_voice_pan", 2339986948)

    public val setWetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "set_wet", 373806689)

    public val getWetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "get_wet", 1740695150)

    public val setDryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "set_dry", 373806689)

    public val getDryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "get_dry", 1740695150)
  }
}
