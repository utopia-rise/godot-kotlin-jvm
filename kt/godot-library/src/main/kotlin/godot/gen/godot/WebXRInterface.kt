// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import kotlin.Boolean
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

  public var sessionMode: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBXRINTERFACE_GET_SESSION_MODE,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBXRINTERFACE_SET_SESSION_MODE,
          NIL)
    }

  public var requiredFeatures: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBXRINTERFACE_GET_REQUIRED_FEATURES, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBXRINTERFACE_SET_REQUIRED_FEATURES, NIL)
    }

  public var optionalFeatures: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBXRINTERFACE_GET_OPTIONAL_FEATURES, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBXRINTERFACE_SET_OPTIONAL_FEATURES, NIL)
    }

  public var requestedReferenceSpaceTypes: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBXRINTERFACE_GET_REQUESTED_REFERENCE_SPACE_TYPES, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBXRINTERFACE_SET_REQUESTED_REFERENCE_SPACE_TYPES, NIL)
    }

  public val referenceSpaceType: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBXRINTERFACE_GET_REFERENCE_SPACE_TYPE, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public val visibilityState: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBXRINTERFACE_GET_VISIBILITY_STATE, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_WEBXRINTERFACE, scriptIndex)
    return true
  }

  public fun isSessionSupported(sessionMode: String): Unit {
    TransferContext.writeArguments(STRING to sessionMode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBXRINTERFACE_IS_SESSION_SUPPORTED,
        NIL)
  }

  public fun isInputSourceActive(inputSourceId: Long): Boolean {
    TransferContext.writeArguments(LONG to inputSourceId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WEBXRINTERFACE_IS_INPUT_SOURCE_ACTIVE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public fun getInputSourceTracker(inputSourceId: Long): XRPositionalTracker? {
    TransferContext.writeArguments(LONG to inputSourceId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WEBXRINTERFACE_GET_INPUT_SOURCE_TRACKER, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as XRPositionalTracker?
  }

  public fun getInputSourceTargetRayMode(inputSourceId: Long): TargetRayMode {
    TransferContext.writeArguments(LONG to inputSourceId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WEBXRINTERFACE_GET_INPUT_SOURCE_TARGET_RAY_MODE, LONG)
    return WebXRInterface.TargetRayMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
