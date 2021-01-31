// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.ARVRInterface
import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class ARVRInterface : Reference() {
  open var arIsAnchorDetectionEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ARVRINTERFACE_GET_AR_IS_ANCHOR_DETECTION_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ARVRINTERFACE_SET_AR_IS_ANCHOR_DETECTION_ENABLED, NIL)
    }

  open var interfaceIsInitialized: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ARVRINTERFACE_GET_INTERFACE_IS_INITIALIZED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ARVRINTERFACE_SET_INTERFACE_IS_INITIALIZED, NIL)
    }

  open var interfaceIsPrimary: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ARVRINTERFACE_GET_INTERFACE_IS_PRIMARY, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ARVRINTERFACE_SET_INTERFACE_IS_PRIMARY, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_ARVRINTERFACE)

  open fun getCameraFeedId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRINTERFACE_GET_CAMERA_FEED_ID,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getCapabilities(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRINTERFACE_GET_CAPABILITIES,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRINTERFACE_GET_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getRenderTargetsize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRINTERFACE_GET_RENDER_TARGETSIZE,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  open fun getTrackingStatus(): ARVRInterface.Tracking_status {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRINTERFACE_GET_TRACKING_STATUS,
        LONG)
    return ARVRInterface.Tracking_status.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun initialize(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRINTERFACE_INITIALIZE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isStereo(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRINTERFACE_IS_STEREO, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun uninitialize() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRINTERFACE_UNINITIALIZE, NIL)
  }

  enum class Tracking_status(
    id: Long
  ) {
    ARVR_NORMAL_TRACKING(0),

    ARVR_EXCESSIVE_MOTION(1),

    ARVR_INSUFFICIENT_FEATURES(2),

    ARVR_UNKNOWN_TRACKING(3),

    ARVR_NOT_TRACKING(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Eyes(
    id: Long
  ) {
    EYE_MONO(0),

    EYE_LEFT(1),

    EYE_RIGHT(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Capabilities(
    id: Long
  ) {
    ARVR_NONE(0),

    ARVR_MONO(1),

    ARVR_STEREO(2),

    ARVR_AR(4),

    ARVR_EXTERNAL(8);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val ARVR_AR: Long = 4

    final const val ARVR_EXCESSIVE_MOTION: Long = 1

    final const val ARVR_EXTERNAL: Long = 8

    final const val ARVR_INSUFFICIENT_FEATURES: Long = 2

    final const val ARVR_MONO: Long = 1

    final const val ARVR_NONE: Long = 0

    final const val ARVR_NORMAL_TRACKING: Long = 0

    final const val ARVR_NOT_TRACKING: Long = 4

    final const val ARVR_STEREO: Long = 2

    final const val ARVR_UNKNOWN_TRACKING: Long = 3

    final const val EYE_LEFT: Long = 1

    final const val EYE_MONO: Long = 0

    final const val EYE_RIGHT: Long = 2
  }
}
