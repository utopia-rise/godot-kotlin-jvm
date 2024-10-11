// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_AUDIOEFFECTSTEREOENHANCE_INDEX: Int = 109

/**
 * An audio effect that can be used to adjust the intensity of stereo panning.
 */
@GodotBaseType
public open class AudioEffectStereoEnhance : AudioEffect() {
  /**
   * Values greater than 1.0 increase intensity of any panning on audio passing through this effect,
   * whereas values less than 1.0 will decrease the panning intensity. A value of 0.0 will downmix
   * audio to mono.
   */
  public final inline var panPullout: Float
    @JvmName("panPulloutProperty")
    get() = getPanPullout()
    @JvmName("panPulloutProperty")
    set(`value`) {
      setPanPullout(value)
    }

  public final inline var timePulloutMs: Float
    @JvmName("timePulloutMsProperty")
    get() = getTimePullout()
    @JvmName("timePulloutMsProperty")
    set(`value`) {
      setTimePullout(value)
    }

  public final inline var surround: Float
    @JvmName("surroundProperty")
    get() = getSurround()
    @JvmName("surroundProperty")
    set(`value`) {
      setSurround(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_AUDIOEFFECTSTEREOENHANCE_INDEX, scriptIndex)
  }

  public final fun setPanPullout(amount: Float): Unit {
    Internals.writeArguments(DOUBLE to amount.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setPanPulloutPtr, NIL)
  }

  public final fun getPanPullout(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPanPulloutPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setTimePullout(amount: Float): Unit {
    Internals.writeArguments(DOUBLE to amount.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setTimePulloutPtr, NIL)
  }

  public final fun getTimePullout(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTimePulloutPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSurround(amount: Float): Unit {
    Internals.writeArguments(DOUBLE to amount.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setSurroundPtr, NIL)
  }

  public final fun getSurround(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSurroundPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  public object MethodBindings {
    internal val setPanPulloutPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectStereoEnhance", "set_pan_pullout", 373806689)

    internal val getPanPulloutPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectStereoEnhance", "get_pan_pullout", 1740695150)

    internal val setTimePulloutPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectStereoEnhance", "set_time_pullout", 373806689)

    internal val getTimePulloutPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectStereoEnhance", "get_time_pullout", 1740695150)

    internal val setSurroundPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectStereoEnhance", "set_surround", 373806689)

    internal val getSurroundPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectStereoEnhance", "get_surround", 1740695150)
  }
}
