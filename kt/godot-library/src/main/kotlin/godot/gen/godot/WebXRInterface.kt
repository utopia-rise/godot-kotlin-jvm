// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
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
import kotlin.Unit

@GodotBaseType
public open class WebXRInterface : ARVRInterface() {
  public val referenceSpaceReset: Signal0 by signal()

  public val select: Signal1<Long> by signal("controller_id")

  public val selectend: Signal1<Long> by signal("controller_id")

  public val selectstart: Signal1<Long> by signal("controller_id")

  public val sessionEnded: Signal0 by signal()

  public val sessionFailed: Signal1<String> by signal("message")

  public val sessionStarted: Signal0 by signal()

  public val sessionSupported: Signal2<String, Boolean> by signal("session_mode", "supported")

  public val squeeze: Signal1<Long> by signal("controller_id")

  public val squeezeend: Signal1<Long> by signal("controller_id")

  public val squeezestart: Signal1<Long> by signal("controller_id")

  public val visibilityStateChanged: Signal0 by signal()

  public open val boundsGeometry: PoolVector3Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBXRINTERFACE_GET_BOUNDS_GEOMETRY, POOL_VECTOR3_ARRAY)
      return TransferContext.readReturnValue(POOL_VECTOR3_ARRAY, false) as PoolVector3Array
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

  public open val referenceSpaceType: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBXRINTERFACE_GET_REFERENCE_SPACE_TYPE, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
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

  public open val visibilityState: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_WEBXRINTERFACE_GET_VISIBILITY_STATE, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_WEBXRINTERFACE)
  }

  public open fun getController(controllerId: Long): ARVRPositionalTracker? {
    TransferContext.writeArguments(LONG to controllerId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBXRINTERFACE_GET_CONTROLLER,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as ARVRPositionalTracker?
  }

  public open fun isSessionSupported(sessionMode: String): Unit {
    TransferContext.writeArguments(STRING to sessionMode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBXRINTERFACE_IS_SESSION_SUPPORTED,
        NIL)
  }
}
