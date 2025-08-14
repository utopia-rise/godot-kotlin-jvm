// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmName

/**
 * The DPad binding modifier converts an axis input to a dpad output, emulating a DPad. New input paths for each dpad direction will be added to the interaction profile. When bound to actions the DPad emulation will be activated. You should **not** combine dpad inputs with normal inputs in the same action set for the same control, this will result in an error being returned when suggested bindings are submitted to OpenXR.
 *
 * See [url=https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html#XR_EXT_dpad_binding]XR_EXT_dpad_binding[/url] for in-depth details.
 *
 * **Note:** If the DPad binding modifier extension is enabled, all dpad binding paths will be available in the action map. Adding the modifier to an interaction profile allows you to further customize the behavior.
 */
@GodotBaseType
public open class OpenXRDpadBindingModifier : OpenXRIPBindingModifier() {
  /**
   * Action set for which this dpad binding modifier is active.
   */
  public final inline var actionSet: OpenXRActionSet?
    @JvmName("actionSetProperty")
    get() = getActionSet()
    @JvmName("actionSetProperty")
    set(`value`) {
      setActionSet(value)
    }

  /**
   * Input path for this dpad binding modifier.
   */
  public final inline var inputPath: String
    @JvmName("inputPathProperty")
    get() = getInputPath()
    @JvmName("inputPathProperty")
    set(`value`) {
      setInputPath(value)
    }

  /**
   * When our input value is equal or larger than this value, our dpad in that direction becomes true. It stays true until it falls under the [thresholdReleased] value.
   */
  public final inline var threshold: Float
    @JvmName("thresholdProperty")
    get() = getThreshold()
    @JvmName("thresholdProperty")
    set(`value`) {
      setThreshold(value)
    }

  /**
   * When our input value falls below this, our output becomes false.
   */
  public final inline var thresholdReleased: Float
    @JvmName("thresholdReleasedProperty")
    get() = getThresholdReleased()
    @JvmName("thresholdReleasedProperty")
    set(`value`) {
      setThresholdReleased(value)
    }

  /**
   * Center region in which our center position of our dpad return `true`.
   */
  public final inline var centerRegion: Float
    @JvmName("centerRegionProperty")
    get() = getCenterRegion()
    @JvmName("centerRegionProperty")
    set(`value`) {
      setCenterRegion(value)
    }

  /**
   * The angle of each wedge that identifies the 4 directions of the emulated dpad.
   */
  public final inline var wedgeAngle: Float
    @JvmName("wedgeAngleProperty")
    get() = getWedgeAngle()
    @JvmName("wedgeAngleProperty")
    set(`value`) {
      setWedgeAngle(value)
    }

  /**
   * If `false`, when the joystick enters a new dpad zone this becomes true.
   *
   * If `true`, when the joystick remains in active dpad zone, this remains true even if we overlap with another zone.
   */
  public final inline var isSticky: Boolean
    @JvmName("isStickyProperty")
    get() = getIsSticky()
    @JvmName("isStickyProperty")
    set(`value`) {
      setIsSticky(value)
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

  override fun new(scriptIndex: Int) {
    createNativeObject(421, scriptIndex)
  }

  public final fun setActionSet(actionSet: OpenXRActionSet?) {
    TransferContext.writeArguments(OBJECT to actionSet)
    TransferContext.callMethod(ptr, MethodBindings.setActionSetPtr, NIL)
  }

  public final fun getActionSet(): OpenXRActionSet? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getActionSetPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as OpenXRActionSet?)
  }

  public final fun setInputPath(inputPath: String) {
    TransferContext.writeArguments(STRING to inputPath)
    TransferContext.callMethod(ptr, MethodBindings.setInputPathPtr, NIL)
  }

  public final fun getInputPath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInputPathPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setThreshold(threshold: Float) {
    TransferContext.writeArguments(DOUBLE to threshold.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setThresholdPtr, NIL)
  }

  public final fun getThreshold(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getThresholdPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setThresholdReleased(thresholdReleased: Float) {
    TransferContext.writeArguments(DOUBLE to thresholdReleased.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setThresholdReleasedPtr, NIL)
  }

  public final fun getThresholdReleased(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getThresholdReleasedPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setCenterRegion(centerRegion: Float) {
    TransferContext.writeArguments(DOUBLE to centerRegion.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setCenterRegionPtr, NIL)
  }

  public final fun getCenterRegion(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCenterRegionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setWedgeAngle(wedgeAngle: Float) {
    TransferContext.writeArguments(DOUBLE to wedgeAngle.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setWedgeAnglePtr, NIL)
  }

  public final fun getWedgeAngle(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getWedgeAnglePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setIsSticky(isSticky: Boolean) {
    TransferContext.writeArguments(BOOL to isSticky)
    TransferContext.callMethod(ptr, MethodBindings.setIsStickyPtr, NIL)
  }

  public final fun getIsSticky(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getIsStickyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setOnHaptic(haptic: OpenXRHapticBase?) {
    TransferContext.writeArguments(OBJECT to haptic)
    TransferContext.callMethod(ptr, MethodBindings.setOnHapticPtr, NIL)
  }

  public final fun getOnHaptic(): OpenXRHapticBase? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOnHapticPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as OpenXRHapticBase?)
  }

  public final fun setOffHaptic(haptic: OpenXRHapticBase?) {
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
    internal val setActionSetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRDpadBindingModifier", "set_action_set", 2_093_310_581)

    internal val getActionSetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRDpadBindingModifier", "get_action_set", 619_941_079)

    internal val setInputPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRDpadBindingModifier", "set_input_path", 83_702_148)

    internal val getInputPathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRDpadBindingModifier", "get_input_path", 201_670_096)

    internal val setThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRDpadBindingModifier", "set_threshold", 373_806_689)

    internal val getThresholdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRDpadBindingModifier", "get_threshold", 1_740_695_150)

    internal val setThresholdReleasedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRDpadBindingModifier", "set_threshold_released", 373_806_689)

    internal val getThresholdReleasedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRDpadBindingModifier", "get_threshold_released", 1_740_695_150)

    internal val setCenterRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRDpadBindingModifier", "set_center_region", 373_806_689)

    internal val getCenterRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRDpadBindingModifier", "get_center_region", 1_740_695_150)

    internal val setWedgeAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRDpadBindingModifier", "set_wedge_angle", 373_806_689)

    internal val getWedgeAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRDpadBindingModifier", "get_wedge_angle", 1_740_695_150)

    internal val setIsStickyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRDpadBindingModifier", "set_is_sticky", 2_586_408_642)

    internal val getIsStickyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRDpadBindingModifier", "get_is_sticky", 36_873_697)

    internal val setOnHapticPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRDpadBindingModifier", "set_on_haptic", 2_998_020_150)

    internal val getOnHapticPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRDpadBindingModifier", "get_on_haptic", 922_310_751)

    internal val setOffHapticPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRDpadBindingModifier", "set_off_haptic", 2_998_020_150)

    internal val getOffHapticPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRDpadBindingModifier", "get_off_haptic", 922_310_751)
  }
}
