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
import godot.core.MethodStringName0
import godot.core.MethodStringName1
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmStatic

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
    createNativeObject(71, scriptIndex)
  }

  public final fun setPredelayMsec(msec: Float): Unit {
    TransferContext.writeArguments(DOUBLE to msec.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setPredelayMsecPtr, NIL)
  }

  public final fun getPredelayMsec(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPredelayMsecPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setPredelayFeedback(feedback: Float): Unit {
    TransferContext.writeArguments(DOUBLE to feedback.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setPredelayFeedbackPtr, NIL)
  }

  public final fun getPredelayFeedback(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPredelayFeedbackPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRoomSize(size: Float): Unit {
    TransferContext.writeArguments(DOUBLE to size.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setRoomSizePtr, NIL)
  }

  public final fun getRoomSize(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRoomSizePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDamping(amount: Float): Unit {
    TransferContext.writeArguments(DOUBLE to amount.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setDampingPtr, NIL)
  }

  public final fun getDamping(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDampingPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSpread(amount: Float): Unit {
    TransferContext.writeArguments(DOUBLE to amount.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSpreadPtr, NIL)
  }

  public final fun getSpread(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSpreadPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDry(amount: Float): Unit {
    TransferContext.writeArguments(DOUBLE to amount.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setDryPtr, NIL)
  }

  public final fun getDry(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDryPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setWet(amount: Float): Unit {
    TransferContext.writeArguments(DOUBLE to amount.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setWetPtr, NIL)
  }

  public final fun getWet(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getWetPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setHpf(amount: Float): Unit {
    TransferContext.writeArguments(DOUBLE to amount.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setHpfPtr, NIL)
  }

  public final fun getHpf(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHpfPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object {
    @JvmStatic
    public val setPredelayMsecName: MethodStringName1<AudioEffectReverb, Unit, Float> =
        MethodStringName1<AudioEffectReverb, Unit, Float>("set_predelay_msec")

    @JvmStatic
    public val getPredelayMsecName: MethodStringName0<AudioEffectReverb, Float> =
        MethodStringName0<AudioEffectReverb, Float>("get_predelay_msec")

    @JvmStatic
    public val setPredelayFeedbackName: MethodStringName1<AudioEffectReverb, Unit, Float> =
        MethodStringName1<AudioEffectReverb, Unit, Float>("set_predelay_feedback")

    @JvmStatic
    public val getPredelayFeedbackName: MethodStringName0<AudioEffectReverb, Float> =
        MethodStringName0<AudioEffectReverb, Float>("get_predelay_feedback")

    @JvmStatic
    public val setRoomSizeName: MethodStringName1<AudioEffectReverb, Unit, Float> =
        MethodStringName1<AudioEffectReverb, Unit, Float>("set_room_size")

    @JvmStatic
    public val getRoomSizeName: MethodStringName0<AudioEffectReverb, Float> =
        MethodStringName0<AudioEffectReverb, Float>("get_room_size")

    @JvmStatic
    public val setDampingName: MethodStringName1<AudioEffectReverb, Unit, Float> =
        MethodStringName1<AudioEffectReverb, Unit, Float>("set_damping")

    @JvmStatic
    public val getDampingName: MethodStringName0<AudioEffectReverb, Float> =
        MethodStringName0<AudioEffectReverb, Float>("get_damping")

    @JvmStatic
    public val setSpreadName: MethodStringName1<AudioEffectReverb, Unit, Float> =
        MethodStringName1<AudioEffectReverb, Unit, Float>("set_spread")

    @JvmStatic
    public val getSpreadName: MethodStringName0<AudioEffectReverb, Float> =
        MethodStringName0<AudioEffectReverb, Float>("get_spread")

    @JvmStatic
    public val setDryName: MethodStringName1<AudioEffectReverb, Unit, Float> =
        MethodStringName1<AudioEffectReverb, Unit, Float>("set_dry")

    @JvmStatic
    public val getDryName: MethodStringName0<AudioEffectReverb, Float> =
        MethodStringName0<AudioEffectReverb, Float>("get_dry")

    @JvmStatic
    public val setWetName: MethodStringName1<AudioEffectReverb, Unit, Float> =
        MethodStringName1<AudioEffectReverb, Unit, Float>("set_wet")

    @JvmStatic
    public val getWetName: MethodStringName0<AudioEffectReverb, Float> =
        MethodStringName0<AudioEffectReverb, Float>("get_wet")

    @JvmStatic
    public val setHpfName: MethodStringName1<AudioEffectReverb, Unit, Float> =
        MethodStringName1<AudioEffectReverb, Unit, Float>("set_hpf")

    @JvmStatic
    public val getHpfName: MethodStringName0<AudioEffectReverb, Float> =
        MethodStringName0<AudioEffectReverb, Float>("get_hpf")
  }

  public object MethodBindings {
    internal val setPredelayMsecPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "set_predelay_msec", 373806689)

    internal val getPredelayMsecPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "get_predelay_msec", 1740695150)

    internal val setPredelayFeedbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "set_predelay_feedback", 373806689)

    internal val getPredelayFeedbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "get_predelay_feedback", 1740695150)

    internal val setRoomSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "set_room_size", 373806689)

    internal val getRoomSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "get_room_size", 1740695150)

    internal val setDampingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "set_damping", 373806689)

    internal val getDampingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "get_damping", 1740695150)

    internal val setSpreadPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "set_spread", 373806689)

    internal val getSpreadPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "get_spread", 1740695150)

    internal val setDryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "set_dry", 373806689)

    internal val getDryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "get_dry", 1740695150)

    internal val setWetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "set_wet", 373806689)

    internal val getWetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "get_wet", 1740695150)

    internal val setHpfPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "set_hpf", 373806689)

    internal val getHpfPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "get_hpf", 1740695150)
  }
}
