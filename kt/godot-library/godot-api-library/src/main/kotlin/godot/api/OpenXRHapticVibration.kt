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
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * This haptic feedback resource makes it possible to define a vibration based haptic feedback pulse
 * that can be triggered through actions in the OpenXR action map.
 */
@GodotBaseType
public open class OpenXRHapticVibration : OpenXRHapticBase() {
  /**
   * The duration of the pulse in nanoseconds. Use `-1` for a minimum duration pulse for the current
   * XR runtime.
   */
  public final inline var duration: Long
    @JvmName("durationProperty")
    get() = getDuration()
    @JvmName("durationProperty")
    set(`value`) {
      setDuration(value)
    }

  /**
   * The frequency of the pulse in Hz. `0.0` will let the XR runtime chose an optimal frequency for
   * the device used.
   */
  public final inline var frequency: Float
    @JvmName("frequencyProperty")
    get() = getFrequency()
    @JvmName("frequencyProperty")
    set(`value`) {
      setFrequency(value)
    }

  /**
   * The amplitude of the pulse between `0.0` and `1.0`.
   */
  public final inline var amplitude: Float
    @JvmName("amplitudeProperty")
    get() = getAmplitude()
    @JvmName("amplitudeProperty")
    set(`value`) {
      setAmplitude(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(426, scriptIndex)
  }

  public final fun setDuration(duration: Long): Unit {
    TransferContext.writeArguments(LONG to duration)
    TransferContext.callMethod(ptr, MethodBindings.setDurationPtr, NIL)
  }

  public final fun getDuration(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDurationPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setFrequency(frequency: Float): Unit {
    TransferContext.writeArguments(DOUBLE to frequency.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setFrequencyPtr, NIL)
  }

  public final fun getFrequency(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFrequencyPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setAmplitude(amplitude: Float): Unit {
    TransferContext.writeArguments(DOUBLE to amplitude.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setAmplitudePtr, NIL)
  }

  public final fun getAmplitude(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAmplitudePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  public object MethodBindings {
    internal val setDurationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRHapticVibration", "set_duration", 1286410249)

    internal val getDurationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRHapticVibration", "get_duration", 3905245786)

    internal val setFrequencyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRHapticVibration", "set_frequency", 373806689)

    internal val getFrequencyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRHapticVibration", "get_frequency", 1740695150)

    internal val setAmplitudePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRHapticVibration", "set_amplitude", 373806689)

    internal val getAmplitudePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRHapticVibration", "get_amplitude", 1740695150)
  }
}
