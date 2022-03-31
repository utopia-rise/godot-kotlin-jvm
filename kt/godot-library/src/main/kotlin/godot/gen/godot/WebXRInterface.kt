// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector3Array
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_VECTOR3_ARRAY
import godot.core.VariantType.STRING
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class WebXRInterface internal constructor() : XRInterface() {
  public val sessionEnded: Signal0 by signal()

  public val referenceSpaceReset: Signal0 by signal()

  public val selectstart: Signal1<Long> by signal("controllerId")

  public val selectend: Signal1<Long> by signal("controllerId")

  public val squeezestart: Signal1<Long> by signal("controllerId")

  public val select: Signal1<Long> by signal("controllerId")

  public val sessionFailed: Signal1<String> by signal("message")

  public val visibilityStateChanged: Signal0 by signal()

  public val squeezeend: Signal1<Long> by signal("controllerId")

  public val sessionSupported: Signal2<String, Boolean> by signal("sessionMode", "supported")

  public val squeeze: Signal1<Long> by signal("controllerId")

  public val sessionStarted: Signal0 by signal()

  public open var sessionMode: String
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

  public open var requiredFeatures: String
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

  public open var optionalFeatures: String
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

  public open var requestedReferenceSpaceTypes: String
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

  public open val referenceSpaceType: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBXRINTERFACE_GET_REFERENCE_SPACE_TYPE, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public open val visibilityState: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBXRINTERFACE_GET_VISIBILITY_STATE, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public open val boundsGeometry: PackedVector3Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBXRINTERFACE_GET_BOUNDS_GEOMETRY, PACKED_VECTOR3_ARRAY)
      return TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_WEBXRINTERFACE)
  }

  public open fun isSessionSupported(sessionMode: String): Unit {
    TransferContext.writeArguments(STRING to sessionMode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBXRINTERFACE_IS_SESSION_SUPPORTED,
        NIL)
  }

  public open fun getController(controllerId: Long): XRPositionalTracker? {
    TransferContext.writeArguments(LONG to controllerId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBXRINTERFACE_GET_CONTROLLER,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as XRPositionalTracker?
  }

  public companion object
}
