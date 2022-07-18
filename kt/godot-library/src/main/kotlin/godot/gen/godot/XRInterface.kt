// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.XRInterface
import godot.`annotation`.GodotBaseType
import godot.core.PackedVector3Array
import godot.core.StringName
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_VECTOR3_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class for an XR interface implementation.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/vr/index.html]($DOCS_URL/tutorials/vr/index.html)
 *
 * This class needs to be implemented to make an AR or VR platform available to Godot and these should be implemented as C++ modules or GDExtension modules. Part of the interface is exposed to GDScript so you can detect, enable and configure an AR or VR platform.
 *
 * Interfaces should be written in such a way that simply enabling them will give us a working setup. You can query the available interfaces through [godot.XRServer].
 */
@GodotBaseType
public open class XRInterface internal constructor() : RefCounted() {
  /**
   * Emitted when the play area is changed. This can be a result of the player resetting the boundary or entering a new play area, the player changing the play area mode, the world scale changing or the player resetting their headset orientation.
   */
  public val playAreaChanged: Signal1<Long> by signal("mode")

  /**
   * `true` if this is the primary interface.
   */
  public var interfaceIsPrimary: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_XRINTERFACE_IS_PRIMARY, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_XRINTERFACE_SET_PRIMARY, NIL.ordinal)
    }

  /**
   * The play area mode for this interface.
   */
  public val xrPlayAreaMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_XRINTERFACE_GET_PLAY_AREA_MODE,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }

  /**
   * On an AR interface, `true` if anchor detection is enabled.
   */
  public var arIsAnchorDetectionEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_XRINTERFACE_GET_ANCHOR_DETECTION_IS_ENABLED, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_XRINTERFACE_SET_ANCHOR_DETECTION_IS_ENABLED, NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_XRINTERFACE)
  }

  /**
   * Returns the name of this interface (OpenXR, OpenVR, OpenHMD, ARKit, etc).
   */
  public fun getName(): StringName {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_XRINTERFACE_GET_NAME,
        STRING_NAME.ordinal)
    return TransferContext.readReturnValue(STRING_NAME, false) as StringName
  }

  /**
   * Returns a combination of [enum Capabilities] flags providing information about the capabilities of this interface.
   */
  public fun getCapabilities(): Long {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_XRINTERFACE_GET_CAPABILITIES,
        LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Is `true` if this interface has been initialised.
   */
  public fun isInitialized(): Boolean {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_XRINTERFACE_IS_INITIALIZED, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Call this to initialize this interface. The first interface that is initialized is identified as the primary interface and it will be used for rendering output.
   *
   * After initializing the interface you want to use you then need to enable the AR/VR mode of a viewport and rendering should commence.
   *
   * **Note:** You must enable the XR mode on the main viewport for any device that uses the main output of Godot, such as for mobile VR.
   *
   * If you do this for a platform that handles its own output (such as OpenVR) Godot will show just one eye without distortion on screen. Alternatively, you can add a separate viewport node to your scene and enable AR/VR on that viewport. It will be used to output to the HMD, leaving you free to do anything you like in the main window, such as using a separate camera as a spectator camera or rendering something completely different.
   *
   * While currently not used, you can activate additional interfaces. You may wish to do this if you want to track controllers from other platforms. However, at this point in time only one interface can render to an HMD.
   */
  public fun initialize(): Boolean {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_XRINTERFACE_INITIALIZE, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Turns the interface off.
   */
  public fun uninitialize(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_XRINTERFACE_UNINITIALIZE, NIL.ordinal)
  }

  /**
   * If supported, returns the status of our tracking. This will allow you to provide feedback to the user whether there are issues with positional tracking.
   */
  public fun getTrackingStatus(): XRInterface.TrackingStatus {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_XRINTERFACE_GET_TRACKING_STATUS,
        LONG.ordinal)
    return XRInterface.TrackingStatus.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the resolution at which we should render our intermediate results before things like lens distortion are applied by the VR platform.
   */
  public fun getRenderTargetSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_XRINTERFACE_GET_RENDER_TARGET_SIZE,
        VECTOR2.ordinal)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the number of views that need to be rendered for this device. 1 for Monoscopic, 2 for Stereoscopic.
   */
  public fun getViewCount(): Long {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_XRINTERFACE_GET_VIEW_COUNT, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Triggers a haptic pulse on a device associated with this interface.
   *
   * `action_name` is the name of the action for this pulse.
   *
   * `tracker_name` is optional and can be used to direct the pulse to a specific device provided that device is bound to this haptic.
   */
  public fun triggerHapticPulse(
    actionName: String,
    trackerName: StringName,
    frequency: Double,
    amplitude: Double,
    durationSec: Double,
    delaySec: Double
  ): Unit {
    TransferContext.writeArguments(STRING to actionName, STRING_NAME to trackerName, DOUBLE to frequency, DOUBLE to amplitude, DOUBLE to durationSec, DOUBLE to delaySec)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_XRINTERFACE_TRIGGER_HAPTIC_PULSE,
        NIL.ordinal)
  }

  /**
   * Call this to find out if a given play area mode is supported by this interface.
   */
  public fun supportsPlayAreaMode(mode: XRInterface.PlayAreaMode): Boolean {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_XRINTERFACE_SUPPORTS_PLAY_AREA_MODE,
        BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the active play area mode, will return `false` if the mode can't be used with this interface.
   */
  public fun setPlayAreaMode(mode: XRInterface.PlayAreaMode): Boolean {
    TransferContext.writeArguments(LONG to mode.id)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_XRINTERFACE_SET_PLAY_AREA_MODE,
        BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns an array of vectors that denotes the physical play area mapped to the virtual space around the [godot.XROrigin3D] point. The points form a convex polygon that can be used to react to or visualise the play area. This returns an empty array if this feature is not supported or if the information is not yet available.
   */
  public fun getPlayArea(): PackedVector3Array {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_XRINTERFACE_GET_PLAY_AREA,
        PACKED_VECTOR3_ARRAY.ordinal)
    return TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array
  }

  /**
   * If this is an AR interface that requires displaying a camera feed as the background, this method returns the feed ID in the [godot.CameraServer] for this interface.
   */
  public fun getCameraFeedId(): Long {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_XRINTERFACE_GET_CAMERA_FEED_ID,
        LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public enum class PlayAreaMode(
    id: Long
  ) {
    /**
     * Play area mode not set or not available.
     */
    XR_PLAY_AREA_UNKNOWN(0),
    /**
     * Play area only supports orientation tracking, no positional tracking, area will center around player.
     */
    XR_PLAY_AREA_3DOF(1),
    /**
     * Player is in seated position, limited positional tracking, fixed guardian around player.
     */
    XR_PLAY_AREA_SITTING(2),
    /**
     * Player is free to move around, full positional tracking.
     */
    XR_PLAY_AREA_ROOMSCALE(3),
    /**
     * Same as roomscale but origin point is fixed to the center of the physical space, XRServer.center_on_hmd disabled.
     */
    XR_PLAY_AREA_STAGE(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class TrackingStatus(
    id: Long
  ) {
    /**
     * Tracking is behaving as expected.
     */
    XR_NORMAL_TRACKING(0),
    /**
     * Tracking is hindered by excessive motion (the player is moving faster than tracking can keep up).
     */
    XR_EXCESSIVE_MOTION(1),
    /**
     * Tracking is hindered by insufficient features, it's too dark (for camera-based tracking), player is blocked, etc.
     */
    XR_INSUFFICIENT_FEATURES(2),
    /**
     * We don't know the status of the tracking or this interface does not provide feedback.
     */
    XR_UNKNOWN_TRACKING(3),
    /**
     * Tracking is not functional (camera not plugged in or obscured, lighthouses turned off, etc.).
     */
    XR_NOT_TRACKING(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class Capabilities(
    id: Long
  ) {
    /**
     * No XR capabilities.
     */
    XR_NONE(0),
    /**
     * This interface can work with normal rendering output (non-HMD based AR).
     */
    XR_MONO(1),
    /**
     * This interface supports stereoscopic rendering.
     */
    XR_STEREO(2),
    /**
     * This interface supports quad rendering (not yet supported by Godot).
     */
    XR_QUAD(4),
    /**
     * this interface supports VR.
     */
    XR_VR(8),
    /**
     * This interface supports AR (video background and real world tracking).
     */
    XR_AR(16),
    /**
     * This interface outputs to an external device. If the main viewport is used, the on screen output is an unmodified buffer of either the left or right eye (stretched if the viewport size is not changed to the same aspect ratio of [getRenderTargetSize]). Using a separate viewport node frees up the main viewport for other purposes.
     */
    XR_EXTERNAL(32),
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
