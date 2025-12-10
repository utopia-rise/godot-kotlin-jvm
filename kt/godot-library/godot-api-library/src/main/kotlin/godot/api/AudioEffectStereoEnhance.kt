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
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import kotlin.Double
import kotlin.Float
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * An audio effect that can be used to adjust the intensity of stereo panning.
 */
@GodotBaseType
public open class AudioEffectStereoEnhance : AudioEffect() {
  /**
   * Amplifies the difference between stereo channels, increasing or decreasing existing panning. A
   * value of 0.0 will downmix stereo to mono. Does not affect a mono signal.
   */
  public final inline var panPullout: Float
    @JvmName("panPulloutProperty")
    get() = getPanPullout()
    @JvmName("panPulloutProperty")
    set(`value`) {
      setPanPullout(value)
    }

  /**
   * Widens sound stage through phase shifting in conjunction with [surround]. Just delays the right
   * channel if [surround] is 0.
   */
  public final inline var timePulloutMs: Float
    @JvmName("timePulloutMsProperty")
    get() = getTimePullout()
    @JvmName("timePulloutMsProperty")
    set(`value`) {
      setTimePullout(value)
    }

  /**
   * Widens sound stage through phase shifting in conjunction with [timePulloutMs]. Just pans sound
   * to the left channel if [timePulloutMs] is 0.
   */
  public final inline var surround: Float
    @JvmName("surroundProperty")
    get() = getSurround()
    @JvmName("surroundProperty")
    set(`value`) {
      setSurround(value)
    }

  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(75, scriptPtr)
  }

  public final fun setPanPullout(amount: Float): Unit {
    TransferContext.writeArguments(DOUBLE to amount.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setPanPulloutPtr, NIL)
  }

  public final fun getPanPullout(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPanPulloutPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setTimePullout(amount: Float): Unit {
    TransferContext.writeArguments(DOUBLE to amount.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setTimePulloutPtr, NIL)
  }

  public final fun getTimePullout(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTimePulloutPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSurround(amount: Float): Unit {
    TransferContext.writeArguments(DOUBLE to amount.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSurroundPtr, NIL)
  }

  public final fun getSurround(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSurroundPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _instantiate(): AudioEffectInstance? {
    throw NotImplementedError("AudioEffectStereoEnhance::_instantiate can't be called from the JVM.")
  }

  public companion object

  public object MethodBindings {
    internal val setPanPulloutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectStereoEnhance", "set_pan_pullout", 373806689)

    internal val getPanPulloutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectStereoEnhance", "get_pan_pullout", 1740695150)

    internal val setTimePulloutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectStereoEnhance", "set_time_pullout", 373806689)

    internal val getTimePulloutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectStereoEnhance", "get_time_pullout", 1740695150)

    internal val setSurroundPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectStereoEnhance", "set_surround", 373806689)

    internal val getSurroundPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectStereoEnhance", "get_surround", 1740695150)
  }
}
