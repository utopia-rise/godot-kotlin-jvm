// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress

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
  public var panPullout: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPanPulloutPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setPanPulloutPtr, NIL)
    }

  public var timePulloutMs: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTimePulloutPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTimePulloutPtr, NIL)
    }

  public var surround: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSurroundPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSurroundPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AUDIOEFFECTSTEREOENHANCE, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setPanPulloutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectStereoEnhance", "set_pan_pullout")

    public val getPanPulloutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectStereoEnhance", "get_pan_pullout")

    public val setTimePulloutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectStereoEnhance", "set_time_pullout")

    public val getTimePulloutPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectStereoEnhance", "get_time_pullout")

    public val setSurroundPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectStereoEnhance", "set_surround")

    public val getSurroundPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectStereoEnhance", "get_surround")
  }
}
