// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.PoolVector3Array
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_VECTOR3_ARRAY
import godot.core.VariantType.STRING
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class WebXRInterface : ARVRInterface() {
  val referenceSpaceReset: Signal0 by signal()

  val select: Signal1<Long> by signal("controller_id")

  val selectend: Signal1<Long> by signal("controller_id")

  val selectstart: Signal1<Long> by signal("controller_id")

  val sessionEnded: Signal0 by signal()

  val sessionFailed: Signal1<String> by signal("message")

  val sessionStarted: Signal0 by signal()

  val sessionSupported: Signal2<String, Boolean> by signal("session_mode", "supported")

  val squeeze: Signal1<Long> by signal("controller_id")

  val squeezeend: Signal1<Long> by signal("controller_id")

  val squeezestart: Signal1<Long> by signal("controller_id")

  val visibilityStateChanged: Signal0 by signal()

  open val boundsGeometry: PoolVector3Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBXRINTERFACE_GET_BOUNDS_GEOMETRY, POOL_VECTOR3_ARRAY)
      return TransferContext.readReturnValue(POOL_VECTOR3_ARRAY, false) as PoolVector3Array
    }

  open var optionalFeatures: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBXRINTERFACE_GET_OPTIONAL_FEATURES, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBXRINTERFACE_SET_OPTIONAL_FEATURES, NIL)
    }

  open val referenceSpaceType: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBXRINTERFACE_GET_REFERENCE_SPACE_TYPE, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  open var requestedReferenceSpaceTypes: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBXRINTERFACE_GET_REQUESTED_REFERENCE_SPACE_TYPES, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBXRINTERFACE_SET_REQUESTED_REFERENCE_SPACE_TYPES, NIL)
    }

  open var requiredFeatures: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBXRINTERFACE_GET_REQUIRED_FEATURES, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBXRINTERFACE_SET_REQUIRED_FEATURES, NIL)
    }

  open var sessionMode: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBXRINTERFACE_GET_SESSION_MODE,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBXRINTERFACE_SET_SESSION_MODE,
          NIL)
    }

  open val visibilityState: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBXRINTERFACE_GET_VISIBILITY_STATE, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  override fun __new() {
    callConstructor(ENGINECLASS_WEBXRINTERFACE)
  }

  open fun getController(controllerId: Long): ARVRPositionalTracker? {
    TransferContext.writeArguments(LONG to controllerId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBXRINTERFACE_GET_CONTROLLER,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as ARVRPositionalTracker?
  }

  open fun isSessionSupported(sessionMode: String) {
    TransferContext.writeArguments(STRING to sessionMode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBXRINTERFACE_IS_SESSION_SUPPORTED,
        NIL)
  }
}
