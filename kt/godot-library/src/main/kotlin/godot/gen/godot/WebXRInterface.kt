// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class WebXRInterface internal constructor() : XRInterface() {
  public val sessionSupported: Signal2<String, Boolean> by signal("sessionMode", "supported")

  public val sessionStarted: Signal0 by signal()

  public val sessionEnded: Signal0 by signal()

  public val sessionFailed: Signal1<String> by signal("message")

  public val selectstart: Signal1<Long> by signal("inputSourceId")

  public val select: Signal1<Long> by signal("inputSourceId")

  public val selectend: Signal1<Long> by signal("inputSourceId")

  public val squeezestart: Signal1<Long> by signal("inputSourceId")

  public val squeeze: Signal1<Long> by signal("inputSourceId")

  public val squeezeend: Signal1<Long> by signal("inputSourceId")

  public val visibilityStateChanged: Signal0 by signal()

  public val referenceSpaceReset: Signal0 by signal()

  public val displayRefreshRateChanged: Signal0 by signal()

  public var sessionMode: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSessionModePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSessionModePtr, NIL)
    }

  public var requiredFeatures: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRequiredFeaturesPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRequiredFeaturesPtr, NIL)
    }

  public var optionalFeatures: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOptionalFeaturesPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOptionalFeaturesPtr, NIL)
    }

  public var requestedReferenceSpaceTypes: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRequestedReferenceSpaceTypesPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRequestedReferenceSpaceTypesPtr, NIL)
    }

  public val referenceSpaceType: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getReferenceSpaceTypePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }

  public val visibilityState: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVisibilityStatePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_WEBXRINTERFACE, scriptIndex)
    return true
  }

  public fun isSessionSupported(sessionMode: String): Unit {
    TransferContext.writeArguments(STRING to sessionMode)
    TransferContext.callMethod(rawPtr, MethodBindings.isSessionSupportedPtr, NIL)
  }

  public fun isInputSourceActive(inputSourceId: Int): Boolean {
    TransferContext.writeArguments(LONG to inputSourceId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isInputSourceActivePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun getInputSourceTracker(inputSourceId: Int): XRPositionalTracker? {
    TransferContext.writeArguments(LONG to inputSourceId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getInputSourceTrackerPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as XRPositionalTracker?)
  }

  public fun getInputSourceTargetRayMode(inputSourceId: Int): TargetRayMode {
    TransferContext.writeArguments(LONG to inputSourceId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getInputSourceTargetRayModePtr, LONG)
    return WebXRInterface.TargetRayMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun getDisplayRefreshRate(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDisplayRefreshRatePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setDisplayRefreshRate(refreshRate: Float): Unit {
    TransferContext.writeArguments(DOUBLE to refreshRate.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setDisplayRefreshRatePtr, NIL)
  }

  public fun getAvailableDisplayRefreshRates(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAvailableDisplayRefreshRatesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  public enum class TargetRayMode(
    id: Long,
  ) {
    TARGET_RAY_MODE_UNKNOWN(0),
    TARGET_RAY_MODE_GAZE(1),
    TARGET_RAY_MODE_TRACKED_POINTER(2),
    TARGET_RAY_MODE_SCREEN(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val isSessionSupportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebXRInterface", "is_session_supported")

    public val setSessionModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebXRInterface", "set_session_mode")

    public val getSessionModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebXRInterface", "get_session_mode")

    public val setRequiredFeaturesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebXRInterface", "set_required_features")

    public val getRequiredFeaturesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebXRInterface", "get_required_features")

    public val setOptionalFeaturesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebXRInterface", "set_optional_features")

    public val getOptionalFeaturesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebXRInterface", "get_optional_features")

    public val getReferenceSpaceTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebXRInterface", "get_reference_space_type")

    public val setRequestedReferenceSpaceTypesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebXRInterface", "set_requested_reference_space_types")

    public val getRequestedReferenceSpaceTypesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebXRInterface", "get_requested_reference_space_types")

    public val isInputSourceActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebXRInterface", "is_input_source_active")

    public val getInputSourceTrackerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebXRInterface", "get_input_source_tracker")

    public val getInputSourceTargetRayModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebXRInterface", "get_input_source_target_ray_mode")

    public val getVisibilityStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebXRInterface", "get_visibility_state")

    public val getDisplayRefreshRatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebXRInterface", "get_display_refresh_rate")

    public val setDisplayRefreshRatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebXRInterface", "set_display_refresh_rate")

    public val getAvailableDisplayRefreshRatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebXRInterface", "get_available_display_refresh_rates")
  }
}
