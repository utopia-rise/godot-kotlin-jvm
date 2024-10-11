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

private const val ENGINE_CLASS_AUDIOEFFECTREVERB_INDEX: Int = 106

/**
 * Simulates the sound of acoustic environments such as rooms, concert halls, caverns, or an open
 * spaces.
 */
@GodotBaseType
public open class AudioEffectReverb : AudioEffect() {
  /**
   * Time between the original signal and the early reflections of the reverb signal, in
   * milliseconds.
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
   * Widens or narrows the stereo image of the reverb tail. 1 means fully widens. Value can range
   * from 0 to 1.
   */
  public final inline var spread: Float
    @JvmName("spreadProperty")
    get() = getSpread()
    @JvmName("spreadProperty")
    set(`value`) {
      setSpread(value)
    }

  /**
   * High-pass filter passes signals with a frequency higher than a certain cutoff frequency and
   * attenuates signals with frequencies lower than the cutoff frequency. Value can range from 0 to 1.
   */
  public final inline var hipass: Float
    @JvmName("hipassProperty")
    get() = getHpf()
    @JvmName("hipassProperty")
    set(`value`) {
      setHpf(value)
    }

  /**
   * Output percent of original sound. At 0, only modified sound is outputted. Value can range from
   * 0 to 1.
   */
  public final inline var dry: Float
    @JvmName("dryProperty")
    get() = getDry()
    @JvmName("dryProperty")
    set(`value`) {
      setDry(value)
    }

  /**
   * Output percent of modified sound. At 0, only original sound is outputted. Value can range from
   * 0 to 1.
   */
  public final inline var wet: Float
    @JvmName("wetProperty")
    get() = getWet()
    @JvmName("wetProperty")
    set(`value`) {
      setWet(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_AUDIOEFFECTREVERB_INDEX, scriptIndex)
  }

  public final fun setPredelayMsec(msec: Float): Unit {
    Internals.writeArguments(DOUBLE to msec.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setPredelayMsecPtr, NIL)
  }

  public final fun getPredelayMsec(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPredelayMsecPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setPredelayFeedback(feedback: Float): Unit {
    Internals.writeArguments(DOUBLE to feedback.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setPredelayFeedbackPtr, NIL)
  }

  public final fun getPredelayFeedback(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPredelayFeedbackPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRoomSize(size: Float): Unit {
    Internals.writeArguments(DOUBLE to size.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setRoomSizePtr, NIL)
  }

  public final fun getRoomSize(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRoomSizePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDamping(amount: Float): Unit {
    Internals.writeArguments(DOUBLE to amount.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setDampingPtr, NIL)
  }

  public final fun getDamping(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDampingPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSpread(amount: Float): Unit {
    Internals.writeArguments(DOUBLE to amount.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setSpreadPtr, NIL)
  }

  public final fun getSpread(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSpreadPtr, DOUBLE)
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

  public final fun setWet(amount: Float): Unit {
    Internals.writeArguments(DOUBLE to amount.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setWetPtr, NIL)
  }

  public final fun getWet(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getWetPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setHpf(amount: Float): Unit {
    Internals.writeArguments(DOUBLE to amount.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setHpfPtr, NIL)
  }

  public final fun getHpf(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getHpfPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  public object MethodBindings {
    internal val setPredelayMsecPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectReverb", "set_predelay_msec", 373806689)

    internal val getPredelayMsecPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectReverb", "get_predelay_msec", 1740695150)

    internal val setPredelayFeedbackPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectReverb", "set_predelay_feedback", 373806689)

    internal val getPredelayFeedbackPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectReverb", "get_predelay_feedback", 1740695150)

    internal val setRoomSizePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectReverb", "set_room_size", 373806689)

    internal val getRoomSizePtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectReverb", "get_room_size", 1740695150)

    internal val setDampingPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectReverb", "set_damping", 373806689)

    internal val getDampingPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectReverb", "get_damping", 1740695150)

    internal val setSpreadPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectReverb", "set_spread", 373806689)

    internal val getSpreadPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectReverb", "get_spread", 1740695150)

    internal val setDryPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectReverb", "set_dry", 373806689)

    internal val getDryPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectReverb", "get_dry", 1740695150)

    internal val setWetPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectReverb", "set_wet", 373806689)

    internal val getWetPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectReverb", "get_wet", 1740695150)

    internal val setHpfPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectReverb", "set_hpf", 373806689)

    internal val getHpfPtr: VoidPtr =
        Internals.getMethodBindPtr("AudioEffectReverb", "get_hpf", 1740695150)
  }
}
