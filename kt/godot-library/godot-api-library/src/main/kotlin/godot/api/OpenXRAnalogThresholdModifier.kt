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
import godot.core.VariantParser.OBJECT
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * The analog threshold binding modifier can modify a float input to a boolean input with specified
 * thresholds.
 * See
 * [url=https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html#XR_VALVE_analog_threshold]XR_VALVE_analog_threshold[/url]
 * for in-depth details.
 */
@GodotBaseType
public open class OpenXRAnalogThresholdModifier : OpenXRActionBindingModifier() {
  /**
   * When our input value is equal or larger than this value, our output becomes true. It stays true
   * until it falls under the [offThreshold] value.
   */
  public final inline var onThreshold: Float
    @JvmName("onThresholdProperty")
    get() = getOnThreshold()
    @JvmName("onThresholdProperty")
    set(`value`) {
      setOnThreshold(value)
    }

  /**
   * When our input value falls below this, our output becomes false.
   */
  public final inline var offThreshold: Float
    @JvmName("offThresholdProperty")
    get() = getOffThreshold()
    @JvmName("offThresholdProperty")
    set(`value`) {
      setOffThreshold(value)
    }

  /**
   * Haptic pulse to emit when the user presses the input.
   */
  public final inline var onHaptic: OpenXRHapticBase?
    @JvmName("onHapticProperty")
    get() = getOnHaptic()
    @JvmName("onHapticProperty")
    set(`value`) {
      setOnHaptic(value)
    }

  /**
   * Haptic pulse to emit when the user releases the input.
   */
  public final inline var offHaptic: OpenXRHapticBase?
    @JvmName("offHapticProperty")
    get() = getOffHaptic()
    @JvmName("offHapticProperty")
    set(`value`) {
      setOffHaptic(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(431, scriptIndex)
  }

  public final fun setOnThreshold(onThreshold: Float): Unit {
    TransferContext.writeArguments(DOUBLE to onThreshold.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setOnThresholdPtr, NIL)
  }

  public final fun getOnThreshold(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOnThresholdPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setOffThreshold(offThreshold: Float): Unit {
    TransferContext.writeArguments(DOUBLE to offThreshold.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setOffThresholdPtr, NIL)
  }

  public final fun getOffThreshold(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOffThresholdPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setOnHaptic(haptic: OpenXRHapticBase?): Unit {
    TransferContext.writeArguments(OBJECT to haptic)
    TransferContext.callMethod(ptr, MethodBindings.setOnHapticPtr, NIL)
  }

  public final fun getOnHaptic(): OpenXRHapticBase? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOnHapticPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as OpenXRHapticBase?)
  }

  public final fun setOffHaptic(haptic: OpenXRHapticBase?): Unit {
    TransferContext.writeArguments(OBJECT to haptic)
    TransferContext.callMethod(ptr, MethodBindings.setOffHapticPtr, NIL)
  }

  public final fun getOffHaptic(): OpenXRHapticBase? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOffHapticPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as OpenXRHapticBase?)
  }

  public companion object

  public object MethodBindings {
    internal val setOnThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAnalogThresholdModifier", "set_on_threshold", 373806689)

    internal val getOnThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAnalogThresholdModifier", "get_on_threshold", 1740695150)

    internal val setOffThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAnalogThresholdModifier", "set_off_threshold", 373806689)

    internal val getOffThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAnalogThresholdModifier", "get_off_threshold", 1740695150)

    internal val setOnHapticPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAnalogThresholdModifier", "set_on_haptic", 2998020150)

    internal val getOnHapticPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAnalogThresholdModifier", "get_on_haptic", 922310751)

    internal val setOffHapticPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAnalogThresholdModifier", "set_off_haptic", 2998020150)

    internal val getOffHapticPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAnalogThresholdModifier", "get_off_haptic", 922310751)
  }
}
