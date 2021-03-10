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
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * Base class for an AR/VR interface implementation.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/vr/index.html](https://docs.godotengine.org/en/latest/tutorials/vr/index.html)
 *
 * This class needs to be implemented to make an AR or VR platform available to Godot and these should be implemented as C++ modules or GDNative modules (note that for GDNative the subclass ARVRScriptInterface should be used). Part of the interface is exposed to GDScript so you can detect, enable and configure an AR or VR platform.
 *
 * Interfaces should be written in such a way that simply enabling them will give us a working setup. You can query the available interfaces through [godot.ARVRServer].
 */
@GodotBaseType
open class ARVRInterface : Reference() {
  /**
   * On an AR interface, `true` if anchor detection is enabled.
   */
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

  /**
   * `true` if this interface been initialized.
   */
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

  /**
   * `true` if this is the primary interface.
   */
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

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_ARVRINTERFACE)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  /**
   * If this is an AR interface that requires displaying a camera feed as the background, this method returns the feed ID in the [godot.CameraServer] for this interface.
   */
  open fun getCameraFeedId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRINTERFACE_GET_CAMERA_FEED_ID,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns a combination of [enum Capabilities] flags providing information about the capabilities of this interface.
   */
  open fun getCapabilities(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRINTERFACE_GET_CAPABILITIES,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the name of this interface (OpenVR, OpenHMD, ARKit, etc).
   */
  open fun getName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRINTERFACE_GET_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the resolution at which we should render our intermediate results before things like lens distortion are applied by the VR platform.
   */
  open fun getRenderTargetsize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRINTERFACE_GET_RENDER_TARGETSIZE,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * If supported, returns the status of our tracking. This will allow you to provide feedback to the user whether there are issues with positional tracking.
   */
  open fun getTrackingStatus(): ARVRInterface.Tracking_status {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRINTERFACE_GET_TRACKING_STATUS,
        LONG)
    return ARVRInterface.Tracking_status.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Call this to initialize this interface. The first interface that is initialized is identified as the primary interface and it will be used for rendering output.
   *
   * After initializing the interface you want to use you then need to enable the AR/VR mode of a viewport and rendering should commence.
   *
   * **Note:** You must enable the AR/VR mode on the main viewport for any device that uses the main output of Godot, such as for mobile VR.
   *
   * If you do this for a platform that handles its own output (such as OpenVR) Godot will show just one eye without distortion on screen. Alternatively, you can add a separate viewport node to your scene and enable AR/VR on that viewport. It will be used to output to the HMD, leaving you free to do anything you like in the main window, such as using a separate camera as a spectator camera or rendering something completely different.
   *
   * While currently not used, you can activate additional interfaces. You may wish to do this if you want to track controllers from other platforms. However, at this point in time only one interface can render to an HMD.
   */
  open fun initialize(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRINTERFACE_INITIALIZE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the current output of this interface is in stereo.
   */
  open fun isStereo(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRINTERFACE_IS_STEREO, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Turns the interface off.
   */
  open fun uninitialize() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRINTERFACE_UNINITIALIZE, NIL)
  }

  enum class Tracking_status(
    id: Long
  ) {
    /**
     * Tracking is behaving as expected.
     */
    ARVR_NORMAL_TRACKING(0),

    /**
     * Tracking is hindered by excessive motion (the player is moving faster than tracking can keep up).
     */
    ARVR_EXCESSIVE_MOTION(1),

    /**
     * Tracking is hindered by insufficient features, it's too dark (for camera-based tracking), player is blocked, etc.
     */
    ARVR_INSUFFICIENT_FEATURES(2),

    /**
     * We don't know the status of the tracking or this interface does not provide feedback.
     */
    ARVR_UNKNOWN_TRACKING(3),

    /**
     * Tracking is not functional (camera not plugged in or obscured, lighthouses turned off, etc.).
     */
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
    /**
     * Mono output, this is mostly used internally when retrieving positioning information for our camera node or when stereo scopic rendering is not supported.
     */
    EYE_MONO(0),

    /**
     * Left eye output, this is mostly used internally when rendering the image for the left eye and obtaining positioning and projection information.
     */
    EYE_LEFT(1),

    /**
     * Right eye output, this is mostly used internally when rendering the image for the right eye and obtaining positioning and projection information.
     */
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
    /**
     * No ARVR capabilities.
     */
    ARVR_NONE(0),

    /**
     * This interface can work with normal rendering output (non-HMD based AR).
     */
    ARVR_MONO(1),

    /**
     * This interface supports stereoscopic rendering.
     */
    ARVR_STEREO(2),

    /**
     * This interface supports AR (video background and real world tracking).
     */
    ARVR_AR(4),

    /**
     * This interface outputs to an external device. If the main viewport is used, the on screen output is an unmodified buffer of either the left or right eye (stretched if the viewport size is not changed to the same aspect ratio of [getRenderTargetsize]). Using a separate viewport node frees up the main viewport for other purposes.
     */
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
    /**
     * This interface supports AR (video background and real world tracking).
     */
    final const val ARVR_AR: Long = 4

    /**
     * Tracking is hindered by excessive motion (the player is moving faster than tracking can keep up).
     */
    final const val ARVR_EXCESSIVE_MOTION: Long = 1

    /**
     * This interface outputs to an external device. If the main viewport is used, the on screen output is an unmodified buffer of either the left or right eye (stretched if the viewport size is not changed to the same aspect ratio of [getRenderTargetsize]). Using a separate viewport node frees up the main viewport for other purposes.
     */
    final const val ARVR_EXTERNAL: Long = 8

    /**
     * Tracking is hindered by insufficient features, it's too dark (for camera-based tracking), player is blocked, etc.
     */
    final const val ARVR_INSUFFICIENT_FEATURES: Long = 2

    /**
     * This interface can work with normal rendering output (non-HMD based AR).
     */
    final const val ARVR_MONO: Long = 1

    /**
     * No ARVR capabilities.
     */
    final const val ARVR_NONE: Long = 0

    /**
     * Tracking is behaving as expected.
     */
    final const val ARVR_NORMAL_TRACKING: Long = 0

    /**
     * Tracking is not functional (camera not plugged in or obscured, lighthouses turned off, etc.).
     */
    final const val ARVR_NOT_TRACKING: Long = 4

    /**
     * This interface supports stereoscopic rendering.
     */
    final const val ARVR_STEREO: Long = 2

    /**
     * We don't know the status of the tracking or this interface does not provide feedback.
     */
    final const val ARVR_UNKNOWN_TRACKING: Long = 3

    /**
     * Left eye output, this is mostly used internally when rendering the image for the left eye and obtaining positioning and projection information.
     */
    final const val EYE_LEFT: Long = 1

    /**
     * Mono output, this is mostly used internally when retrieving positioning information for our camera node or when stereo scopic rendering is not supported.
     */
    final const val EYE_MONO: Long = 0

    /**
     * Right eye output, this is mostly used internally when rendering the image for the right eye and obtaining positioning and projection information.
     */
    final const val EYE_RIGHT: Long = 2
  }
}
