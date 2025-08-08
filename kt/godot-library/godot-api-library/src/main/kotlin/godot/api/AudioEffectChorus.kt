// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.jvm.JvmName

/**
 * Adds a chorus audio effect. The effect applies a filter with voices to duplicate the audio source and manipulate it through the filter.
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

  override fun new(scriptIndex: Int) {
    createNativeObject(50, scriptIndex)
  }

  public final fun setVoiceCount(voices: Int) {
    TransferContext.writeArguments(LONG to voices.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setVoiceCountPtr, NIL)
  }

  public final fun getVoiceCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVoiceCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setVoiceDelayMs(voiceIdx: Int, delayMs: Float) {
    TransferContext.writeArguments(LONG to voiceIdx.toLong(), DOUBLE to delayMs.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setVoiceDelayMsPtr, NIL)
  }

  public final fun getVoiceDelayMs(voiceIdx: Int): Float {
    TransferContext.writeArguments(LONG to voiceIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getVoiceDelayMsPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVoiceRateHz(voiceIdx: Int, rateHz: Float) {
    TransferContext.writeArguments(LONG to voiceIdx.toLong(), DOUBLE to rateHz.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setVoiceRateHzPtr, NIL)
  }

  public final fun getVoiceRateHz(voiceIdx: Int): Float {
    TransferContext.writeArguments(LONG to voiceIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getVoiceRateHzPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVoiceDepthMs(voiceIdx: Int, depthMs: Float) {
    TransferContext.writeArguments(LONG to voiceIdx.toLong(), DOUBLE to depthMs.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setVoiceDepthMsPtr, NIL)
  }

  public final fun getVoiceDepthMs(voiceIdx: Int): Float {
    TransferContext.writeArguments(LONG to voiceIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getVoiceDepthMsPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVoiceLevelDb(voiceIdx: Int, levelDb: Float) {
    TransferContext.writeArguments(LONG to voiceIdx.toLong(), DOUBLE to levelDb.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setVoiceLevelDbPtr, NIL)
  }

  public final fun getVoiceLevelDb(voiceIdx: Int): Float {
    TransferContext.writeArguments(LONG to voiceIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getVoiceLevelDbPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVoiceCutoffHz(voiceIdx: Int, cutoffHz: Float) {
    TransferContext.writeArguments(LONG to voiceIdx.toLong(), DOUBLE to cutoffHz.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setVoiceCutoffHzPtr, NIL)
  }

  public final fun getVoiceCutoffHz(voiceIdx: Int): Float {
    TransferContext.writeArguments(LONG to voiceIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getVoiceCutoffHzPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVoicePan(voiceIdx: Int, pan: Float) {
    TransferContext.writeArguments(LONG to voiceIdx.toLong(), DOUBLE to pan.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setVoicePanPtr, NIL)
  }

  public final fun getVoicePan(voiceIdx: Int): Float {
    TransferContext.writeArguments(LONG to voiceIdx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getVoicePanPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setWet(amount: Float) {
    TransferContext.writeArguments(DOUBLE to amount.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setWetPtr, NIL)
  }

  public final fun getWet(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getWetPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDry(amount: Float) {
    TransferContext.writeArguments(DOUBLE to amount.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setDryPtr, NIL)
  }

  public final fun getDry(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDryPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _instantiate(): AudioEffectInstance? {
    throw NotImplementedError("AudioEffectChorus::_instantiate can't be called from the JVM.")
  }

  public companion object

  public object MethodBindings {
    internal val setVoiceCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "set_voice_count", 1_286_410_249)

    internal val getVoiceCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "get_voice_count", 3_905_245_786)

    internal val setVoiceDelayMsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "set_voice_delay_ms", 1_602_489_585)

    internal val getVoiceDelayMsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "get_voice_delay_ms", 2_339_986_948)

    internal val setVoiceRateHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "set_voice_rate_hz", 1_602_489_585)

    internal val getVoiceRateHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "get_voice_rate_hz", 2_339_986_948)

    internal val setVoiceDepthMsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "set_voice_depth_ms", 1_602_489_585)

    internal val getVoiceDepthMsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "get_voice_depth_ms", 2_339_986_948)

    internal val setVoiceLevelDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "set_voice_level_db", 1_602_489_585)

    internal val getVoiceLevelDbPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "get_voice_level_db", 2_339_986_948)

    internal val setVoiceCutoffHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "set_voice_cutoff_hz", 1_602_489_585)

    internal val getVoiceCutoffHzPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "get_voice_cutoff_hz", 2_339_986_948)

    internal val setVoicePanPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "set_voice_pan", 1_602_489_585)

    internal val getVoicePanPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "get_voice_pan", 2_339_986_948)

    internal val setWetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "set_wet", 373_806_689)

    internal val getWetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "get_wet", 1_740_695_150)

    internal val setDryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "set_dry", 373_806_689)

    internal val getDryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectChorus", "get_dry", 1_740_695_150)
  }
}
