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

private const val ENGINE_CLASS_AUDIOEFFECTCHORUS_INDEX: Int = 85

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
    Internals.callConstructor(this, ENGINE_CLASS_AUDIOEFFECTCHORUS_INDEX, scriptIndex)
  }

  public final fun setVoiceCount(voices: Int): Unit {
    Internals.writeArguments(LONG to voices.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setVoiceCountPtr, NIL)
  }

  public final fun getVoiceCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getVoiceCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setVoiceDelayMs(voiceIdx: Int, delayMs: Float): Unit {
    Internals.writeArguments(LONG to voiceIdx.toLong(), DOUBLE to delayMs.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setVoiceDelayMsPtr, NIL)
  }

  public final fun getVoiceDelayMs(voiceIdx: Int): Float {
    Internals.writeArguments(LONG to voiceIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getVoiceDelayMsPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVoiceRateHz(voiceIdx: Int, rateHz: Float): Unit {
    Internals.writeArguments(LONG to voiceIdx.toLong(), DOUBLE to rateHz.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setVoiceRateHzPtr, NIL)
  }

  public final fun getVoiceRateHz(voiceIdx: Int): Float {
    Internals.writeArguments(LONG to voiceIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getVoiceRateHzPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVoiceDepthMs(voiceIdx: Int, depthMs: Float): Unit {
    Internals.writeArguments(LONG to voiceIdx.toLong(), DOUBLE to depthMs.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setVoiceDepthMsPtr, NIL)
  }

  public final fun getVoiceDepthMs(voiceIdx: Int): Float {
    Internals.writeArguments(LONG to voiceIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getVoiceDepthMsPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVoiceLevelDb(voiceIdx: Int, levelDb: Float): Unit {
    Internals.writeArguments(LONG to voiceIdx.toLong(), DOUBLE to levelDb.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setVoiceLevelDbPtr, NIL)
  }

  public final fun getVoiceLevelDb(voiceIdx: Int): Float {
    Internals.writeArguments(LONG to voiceIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getVoiceLevelDbPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVoiceCutoffHz(voiceIdx: Int, cutoffHz: Float): Unit {
    Internals.writeArguments(LONG to voiceIdx.toLong(), DOUBLE to cutoffHz.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setVoiceCutoffHzPtr, NIL)
  }

  public final fun getVoiceCutoffHz(voiceIdx: Int): Float {
    Internals.writeArguments(LONG to voiceIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getVoiceCutoffHzPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVoicePan(voiceIdx: Int, pan: Float): Unit {
    Internals.writeArguments(LONG to voiceIdx.toLong(), DOUBLE to pan.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setVoicePanPtr, NIL)
  }

  public final fun getVoicePan(voiceIdx: Int): Float {
    Internals.writeArguments(LONG to voiceIdx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getVoicePanPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setWet(amount: Float): Unit {
    Internals.writeArguments(DOUBLE to amount.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setWetPtr, NIL)
  }

  public final fun getWet(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getWetPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDry(amount: Float): Unit {
    Internals.writeArguments(DOUBLE to amount.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setDryPtr, NIL)
  }

  public final fun getDry(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDryPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  public object MethodBindings {
    internal val setVoiceCountPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectChorus", "set_voice_count", 1286410249)

    internal val getVoiceCountPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectChorus", "get_voice_count", 3905245786)

    internal val setVoiceDelayMsPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectChorus", "set_voice_delay_ms", 1602489585)

    internal val getVoiceDelayMsPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectChorus", "get_voice_delay_ms", 2339986948)

    internal val setVoiceRateHzPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectChorus", "set_voice_rate_hz", 1602489585)

    internal val getVoiceRateHzPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectChorus", "get_voice_rate_hz", 2339986948)

    internal val setVoiceDepthMsPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectChorus", "set_voice_depth_ms", 1602489585)

    internal val getVoiceDepthMsPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectChorus", "get_voice_depth_ms", 2339986948)

    internal val setVoiceLevelDbPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectChorus", "set_voice_level_db", 1602489585)

    internal val getVoiceLevelDbPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectChorus", "get_voice_level_db", 2339986948)

    internal val setVoiceCutoffHzPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectChorus", "set_voice_cutoff_hz", 1602489585)

    internal val getVoiceCutoffHzPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectChorus", "get_voice_cutoff_hz", 2339986948)

    internal val setVoicePanPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectChorus", "set_voice_pan", 1602489585)

    internal val getVoicePanPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectChorus", "get_voice_pan", 2339986948)

    internal val setWetPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectChorus", "set_wet", 373806689)

    internal val getWetPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectChorus", "get_wet", 1740695150)

    internal val setDryPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectChorus", "set_dry", 373806689)

    internal val getDryPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectChorus", "get_dry", 1740695150)
  }
}
