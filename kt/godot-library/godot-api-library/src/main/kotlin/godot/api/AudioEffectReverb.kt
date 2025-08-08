// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.jvm.JvmName

/**
 * Simulates the sound of acoustic environments such as rooms, concert halls, caverns, or an open spaces.
 */
@GodotBaseType
public open class AudioEffectReverb : AudioEffect() {
  /**
   * Time between the original signal and the early reflections of the reverb signal, in milliseconds.
   */
  public final inline var predelayMsec: Float
    @JvmName("predelayMsecProperty")
    get() = getPredelayMsec()
    @JvmName("predelayMsecProperty")
    set(`value`) {
      setPredelayMsec(value)
    }

  /**
   * Output percent of predelay. Value can range from 0 to 1.
   */
  public final inline var predelayFeedback: Float
    @JvmName("predelayFeedbackProperty")
    get() = getPredelayFeedback()
    @JvmName("predelayFeedbackProperty")
    set(`value`) {
      setPredelayFeedback(value)
    }

  /**
   * Dimensions of simulated room. Bigger means more echoes. Value can range from 0 to 1.
   */
  public final inline var roomSize: Float
    @JvmName("roomSizeProperty")
    get() = getRoomSize()
    @JvmName("roomSizeProperty")
    set(`value`) {
      setRoomSize(value)
    }

  /**
   * Defines how reflective the imaginary room's walls are. Value can range from 0 to 1.
   */
  public final inline var damping: Float
    @JvmName("dampingProperty")
    get() = getDamping()
    @JvmName("dampingProperty")
    set(`value`) {
      setDamping(value)
    }

  /**
   * Widens or narrows the stereo image of the reverb tail. 1 means fully widens. Value can range from 0 to 1.
   */
  public final inline var spread: Float
    @JvmName("spreadProperty")
    get() = getSpread()
    @JvmName("spreadProperty")
    set(`value`) {
      setSpread(value)
    }

  /**
   * High-pass filter passes signals with a frequency higher than a certain cutoff frequency and attenuates signals with frequencies lower than the cutoff frequency. Value can range from 0 to 1.
   */
  public final inline var hipass: Float
    @JvmName("hipassProperty")
    get() = getHpf()
    @JvmName("hipassProperty")
    set(`value`) {
      setHpf(value)
    }

  /**
   * Output percent of original sound. At 0, only modified sound is outputted. Value can range from 0 to 1.
   */
  public final inline var dry: Float
    @JvmName("dryProperty")
    get() = getDry()
    @JvmName("dryProperty")
    set(`value`) {
      setDry(value)
    }

  /**
   * Output percent of modified sound. At 0, only original sound is outputted. Value can range from 0 to 1.
   */
  public final inline var wet: Float
    @JvmName("wetProperty")
    get() = getWet()
    @JvmName("wetProperty")
    set(`value`) {
      setWet(value)
    }

  override fun new(scriptIndex: Int) {
    createNativeObject(71, scriptIndex)
  }

  public final fun setPredelayMsec(msec: Float) {
    TransferContext.writeArguments(DOUBLE to msec.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setPredelayMsecPtr, NIL)
  }

  public final fun getPredelayMsec(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPredelayMsecPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setPredelayFeedback(feedback: Float) {
    TransferContext.writeArguments(DOUBLE to feedback.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setPredelayFeedbackPtr, NIL)
  }

  public final fun getPredelayFeedback(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPredelayFeedbackPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRoomSize(size: Float) {
    TransferContext.writeArguments(DOUBLE to size.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setRoomSizePtr, NIL)
  }

  public final fun getRoomSize(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRoomSizePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDamping(amount: Float) {
    TransferContext.writeArguments(DOUBLE to amount.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setDampingPtr, NIL)
  }

  public final fun getDamping(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDampingPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSpread(amount: Float) {
    TransferContext.writeArguments(DOUBLE to amount.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSpreadPtr, NIL)
  }

  public final fun getSpread(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSpreadPtr, DOUBLE)
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

  public final fun setWet(amount: Float) {
    TransferContext.writeArguments(DOUBLE to amount.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setWetPtr, NIL)
  }

  public final fun getWet(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getWetPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setHpf(amount: Float) {
    TransferContext.writeArguments(DOUBLE to amount.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setHpfPtr, NIL)
  }

  public final fun getHpf(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHpfPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _instantiate(): AudioEffectInstance? {
    throw NotImplementedError("AudioEffectReverb::_instantiate can't be called from the JVM.")
  }

  public companion object

  public object MethodBindings {
    internal val setPredelayMsecPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "set_predelay_msec", 373_806_689)

    internal val getPredelayMsecPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "get_predelay_msec", 1_740_695_150)

    internal val setPredelayFeedbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "set_predelay_feedback", 373_806_689)

    internal val getPredelayFeedbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "get_predelay_feedback", 1_740_695_150)

    internal val setRoomSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "set_room_size", 373_806_689)

    internal val getRoomSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "get_room_size", 1_740_695_150)

    internal val setDampingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "set_damping", 373_806_689)

    internal val getDampingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "get_damping", 1_740_695_150)

    internal val setSpreadPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "set_spread", 373_806_689)

    internal val getSpreadPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "get_spread", 1_740_695_150)

    internal val setDryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "set_dry", 373_806_689)

    internal val getDryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "get_dry", 1_740_695_150)

    internal val setWetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "set_wet", 373_806_689)

    internal val getWetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "get_wet", 1_740_695_150)

    internal val setHpfPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "set_hpf", 373_806_689)

    internal val getHpfPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "get_hpf", 1_740_695_150)
  }
}
