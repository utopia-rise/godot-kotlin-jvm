// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.PackedVector3Array
import godot.core.Projection
import godot.core.Signal1
import godot.core.StringName
import godot.core.Transform3D
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DICTIONARY
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_VECTOR3_ARRAY
import godot.core.VariantParser.PROJECTION
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import godot.core.VariantParser.TRANSFORM3D
import godot.core.VariantParser.VECTOR2
import godot.core.Vector2
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * This class needs to be implemented to make an AR or VR platform available to Godot and these
 * should be implemented as C++ modules or GDExtension modules. Part of the interface is exposed to
 * GDScript so you can detect, enable and configure an AR or VR platform.
 * Interfaces should be written in such a way that simply enabling them will give us a working
 * setup. You can query the available interfaces through [XRServer].
 */
@GodotBaseType
public open class XRInterface internal constructor() : RefCounted() {
  /**
   * Emitted when the play area is changed. This can be a result of the player resetting the
   * boundary or entering a new play area, the player changing the play area mode, the world scale
   * changing or the player resetting their headset orientation.
   */
  public val playAreaChanged: Signal1<Long> by Signal1

  /**
   * `true` if this is the primary interface.
   */
  public final inline var interfaceIsPrimary: Boolean
    @JvmName("interfaceIsPrimaryProperty")
    get() = isPrimary()
    @JvmName("interfaceIsPrimaryProperty")
    set(`value`) {
      setPrimary(value)
    }

  /**
   * The play area mode for this interface.
   */
  public final inline val xrPlayAreaMode: PlayAreaMode
    @JvmName("xrPlayAreaModeProperty")
    get() = getPlayAreaMode()

  /**
   * Specify how XR should blend in the environment. This is specific to certain AR and passthrough
   * devices where camera images are blended in by the XR compositor.
   */
  public final inline val environmentBlendMode: EnvironmentBlendMode
    @JvmName("environmentBlendModeProperty")
    get() = getEnvironmentBlendMode()

  /**
   * On an AR interface, `true` if anchor detection is enabled.
   */
  public final inline var arIsAnchorDetectionEnabled: Boolean
    @JvmName("arIsAnchorDetectionEnabledProperty")
    get() = getAnchorDetectionIsEnabled()
    @JvmName("arIsAnchorDetectionEnabledProperty")
    set(`value`) {
      setAnchorDetectionIsEnabled(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_XRINTERFACE_INDEX, scriptIndex)
  }

  /**
   * Returns the name of this interface (`"OpenXR"`, `"OpenVR"`, `"OpenHMD"`, `"ARKit"`, etc.).
   */
  public final fun getName(): StringName {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getNamePtr, STRING_NAME)
    return (Internals.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Returns a combination of [Capabilities] flags providing information about the capabilities of
   * this interface.
   */
  public final fun getCapabilities(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCapabilitiesPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  public final fun isPrimary(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isPrimaryPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setPrimary(primary: Boolean): Unit {
    Internals.writeArguments(BOOL to primary)
    Internals.callMethod(rawPtr, MethodBindings.setPrimaryPtr, NIL)
  }

  /**
   * Returns `true` if this interface has been initialized.
   */
  public final fun isInitialized(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isInitializedPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Call this to initialize this interface. The first interface that is initialized is identified
   * as the primary interface and it will be used for rendering output.
   * After initializing the interface you want to use you then need to enable the AR/VR mode of a
   * viewport and rendering should commence.
   * **Note:** You must enable the XR mode on the main viewport for any device that uses the main
   * output of Godot, such as for mobile VR.
   * If you do this for a platform that handles its own output (such as OpenVR) Godot will show just
   * one eye without distortion on screen. Alternatively, you can add a separate viewport node to your
   * scene and enable AR/VR on that viewport. It will be used to output to the HMD, leaving you free to
   * do anything you like in the main window, such as using a separate camera as a spectator camera or
   * rendering something completely different.
   * While currently not used, you can activate additional interfaces. You may wish to do this if
   * you want to track controllers from other platforms. However, at this point in time only one
   * interface can render to an HMD.
   */
  public final fun initialize(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.initializePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Turns the interface off.
   */
  public final fun uninitialize(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.uninitializePtr, NIL)
  }

  /**
   * Returns a [Dictionary] with extra system info. Interfaces are expected to return
   * `XRRuntimeName` and `XRRuntimeVersion` providing info about the used XR runtime. Additional
   * entries may be provided specific to an interface.
   * **Note:**This information may only be available after [initialize] was successfully called.
   */
  public final fun getSystemInfo(): Dictionary<Any?, Any?> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSystemInfoPtr, DICTIONARY)
    return (Internals.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  /**
   * If supported, returns the status of our tracking. This will allow you to provide feedback to
   * the user whether there are issues with positional tracking.
   */
  public final fun getTrackingStatus(): TrackingStatus {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTrackingStatusPtr, LONG)
    return XRInterface.TrackingStatus.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the resolution at which we should render our intermediate results before things like
   * lens distortion are applied by the VR platform.
   */
  public final fun getRenderTargetSize(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRenderTargetSizePtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns the number of views that need to be rendered for this device. 1 for Monoscopic, 2 for
   * Stereoscopic.
   */
  public final fun getViewCount(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getViewCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Triggers a haptic pulse on a device associated with this interface.
   * [actionName] is the name of the action for this pulse.
   * [trackerName] is optional and can be used to direct the pulse to a specific device provided
   * that device is bound to this haptic.
   * [frequency] is the frequency of the pulse, set to `0.0` to have the system use a default
   * frequency.
   * [amplitude] is the amplitude of the pulse between `0.0` and `1.0`.
   * [durationSec] is the duration of the pulse in seconds.
   * [delaySec] is a delay in seconds before the pulse is given.
   */
  public final fun triggerHapticPulse(
    actionName: String,
    trackerName: StringName,
    frequency: Double,
    amplitude: Double,
    durationSec: Double,
    delaySec: Double,
  ): Unit {
    Internals.writeArguments(STRING to actionName, STRING_NAME to trackerName, DOUBLE to frequency, DOUBLE to amplitude, DOUBLE to durationSec, DOUBLE to delaySec)
    Internals.callMethod(rawPtr, MethodBindings.triggerHapticPulsePtr, NIL)
  }

  /**
   * Call this to find out if a given play area mode is supported by this interface.
   */
  public final fun supportsPlayAreaMode(mode: PlayAreaMode): Boolean {
    Internals.writeArguments(LONG to mode.id)
    Internals.callMethod(rawPtr, MethodBindings.supportsPlayAreaModePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun getPlayAreaMode(): PlayAreaMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPlayAreaModePtr, LONG)
    return XRInterface.PlayAreaMode.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the active play area mode, will return `false` if the mode can't be used with this
   * interface.
   * **Note:** Changing this after the interface has already been initialized can be jarring for the
   * player, so it's recommended to recenter on the HMD with [XRServer.centerOnHmd] (if switching to
   * [XRInterface.XR_PLAY_AREA_STAGE]) or make the switch during a scene change.
   */
  public final fun setPlayAreaMode(mode: PlayAreaMode): Boolean {
    Internals.writeArguments(LONG to mode.id)
    Internals.callMethod(rawPtr, MethodBindings.setPlayAreaModePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns an array of vectors that represent the physical play area mapped to the virtual space
   * around the [XROrigin3D] point. The points form a convex polygon that can be used to react to or
   * visualize the play area. This returns an empty array if this feature is not supported or if the
   * information is not yet available.
   */
  public final fun getPlayArea(): PackedVector3Array {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPlayAreaPtr, PACKED_VECTOR3_ARRAY)
    return (Internals.readReturnValue(PACKED_VECTOR3_ARRAY) as PackedVector3Array)
  }

  public final fun getAnchorDetectionIsEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAnchorDetectionIsEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setAnchorDetectionIsEnabled(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setAnchorDetectionIsEnabledPtr, NIL)
  }

  /**
   * If this is an AR interface that requires displaying a camera feed as the background, this
   * method returns the feed ID in the [CameraServer] for this interface.
   */
  public final fun getCameraFeedId(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCameraFeedIdPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns `true` if this interface supports passthrough.
   */
  public final fun isPassthroughSupported(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isPassthroughSupportedPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if passthrough is enabled.
   */
  public final fun isPassthroughEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isPassthroughEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Starts passthrough, will return `false` if passthrough couldn't be started.
   * **Note:** The viewport used for XR must have a transparent background, otherwise passthrough
   * may not properly render.
   */
  public final fun startPassthrough(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.startPassthroughPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Stops passthrough.
   */
  public final fun stopPassthrough(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.stopPassthroughPtr, NIL)
  }

  /**
   * Returns the transform for a view/eye.
   * [view] is the view/eye index.
   * [camTransform] is the transform that maps device coordinates to scene coordinates, typically
   * the [Node3D.globalTransform] of the current XROrigin3D.
   */
  public final fun getTransformForView(view: Long, camTransform: Transform3D): Transform3D {
    Internals.writeArguments(LONG to view, TRANSFORM3D to camTransform)
    Internals.callMethod(rawPtr, MethodBindings.getTransformForViewPtr, TRANSFORM3D)
    return (Internals.readReturnValue(TRANSFORM3D) as Transform3D)
  }

  /**
   * Returns the projection matrix for a view/eye.
   */
  public final fun getProjectionForView(
    view: Long,
    aspect: Double,
    near: Double,
    far: Double,
  ): Projection {
    Internals.writeArguments(LONG to view, DOUBLE to aspect, DOUBLE to near, DOUBLE to far)
    Internals.callMethod(rawPtr, MethodBindings.getProjectionForViewPtr, PROJECTION)
    return (Internals.readReturnValue(PROJECTION) as Projection)
  }

  /**
   * Returns the an array of supported environment blend modes, see
   * [XRInterface.EnvironmentBlendMode].
   */
  public final fun getSupportedEnvironmentBlendModes(): VariantArray<Any?> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSupportedEnvironmentBlendModesPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  /**
   * Sets the active environment blend mode.
   * [mode] is the environment blend mode starting with the next frame.
   * **Note:** Not all runtimes support all environment blend modes, so it is important to check
   * this at startup. For example:
   * [codeblock]
   * func _ready():
   *     var xr_interface: XRInterface = XRServer.find_interface("OpenXR")
   *     if xr_interface and xr_interface.is_initialized():
   *         var vp: Viewport = get_viewport()
   *         vp.use_xr = true
   *         var acceptable_modes = [XRInterface.XR_ENV_BLEND_MODE_OPAQUE,
   * XRInterface.XR_ENV_BLEND_MODE_ADDITIVE]
   *         var modes = xr_interface.get_supported_environment_blend_modes()
   *         for mode in acceptable_modes:
   *             if mode in modes:
   *                 xr_interface.set_environment_blend_mode(mode)
   *                 break
   * [/codeblock]
   */
  public final fun setEnvironmentBlendMode(mode: EnvironmentBlendMode): Boolean {
    Internals.writeArguments(LONG to mode.id)
    Internals.callMethod(rawPtr, MethodBindings.setEnvironmentBlendModePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun getEnvironmentBlendMode(): EnvironmentBlendMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEnvironmentBlendModePtr, LONG)
    return XRInterface.EnvironmentBlendMode.from(Internals.readReturnValue(LONG) as Long)
  }

  public enum class Capabilities(
    id: Long,
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
     * This interface supports VR.
     */
    XR_VR(8),
    /**
     * This interface supports AR (video background and real world tracking).
     */
    XR_AR(16),
    /**
     * This interface outputs to an external device. If the main viewport is used, the on screen
     * output is an unmodified buffer of either the left or right eye (stretched if the viewport size
     * is not changed to the same aspect ratio of [getRenderTargetSize]). Using a separate viewport
     * node frees up the main viewport for other purposes.
     */
    XR_EXTERNAL(32),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Capabilities = entries.single { it.id == `value` }
    }
  }

  public enum class TrackingStatus(
    id: Long,
  ) {
    /**
     * Tracking is behaving as expected.
     */
    XR_NORMAL_TRACKING(0),
    /**
     * Tracking is hindered by excessive motion (the player is moving faster than tracking can keep
     * up).
     */
    XR_EXCESSIVE_MOTION(1),
    /**
     * Tracking is hindered by insufficient features, it's too dark (for camera-based tracking),
     * player is blocked, etc.
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
      public fun from(`value`: Long): TrackingStatus = entries.single { it.id == `value` }
    }
  }

  public enum class PlayAreaMode(
    id: Long,
  ) {
    /**
     * Play area mode not set or not available.
     */
    XR_PLAY_AREA_UNKNOWN(0),
    /**
     * Play area only supports orientation tracking, no positional tracking, area will center around
     * player.
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
     * Same as [XR_PLAY_AREA_ROOMSCALE] but origin point is fixed to the center of the physical
     * space. In this mode, system-level recentering may be disabled, requiring the use of
     * [XRServer.centerOnHmd].
     */
    XR_PLAY_AREA_STAGE(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): PlayAreaMode = entries.single { it.id == `value` }
    }
  }

  public enum class EnvironmentBlendMode(
    id: Long,
  ) {
    /**
     * Opaque blend mode. This is typically used for VR devices.
     */
    XR_ENV_BLEND_MODE_OPAQUE(0),
    /**
     * Additive blend mode. This is typically used for AR devices or VR devices with passthrough.
     */
    XR_ENV_BLEND_MODE_ADDITIVE(1),
    /**
     * Alpha blend mode. This is typically used for AR or VR devices with passthrough capabilities.
     * The alpha channel controls how much of the passthrough is visible. Alpha of 0.0 means the
     * passthrough is visible and this pixel works in ADDITIVE mode. Alpha of 1.0 means that the
     * passthrough is not visible and this pixel works in OPAQUE mode.
     */
    XR_ENV_BLEND_MODE_ALPHA_BLEND(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): EnvironmentBlendMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val getNamePtr: VoidPtr =
        Internals.getMethodBindPtr("XRInterface", "get_name", 2002593661)

    public val getCapabilitiesPtr: VoidPtr =
        Internals.getMethodBindPtr("XRInterface", "get_capabilities", 3905245786)

    public val isPrimaryPtr: VoidPtr =
        Internals.getMethodBindPtr("XRInterface", "is_primary", 2240911060)

    public val setPrimaryPtr: VoidPtr =
        Internals.getMethodBindPtr("XRInterface", "set_primary", 2586408642)

    public val isInitializedPtr: VoidPtr =
        Internals.getMethodBindPtr("XRInterface", "is_initialized", 36873697)

    public val initializePtr: VoidPtr =
        Internals.getMethodBindPtr("XRInterface", "initialize", 2240911060)

    public val uninitializePtr: VoidPtr =
        Internals.getMethodBindPtr("XRInterface", "uninitialize", 3218959716)

    public val getSystemInfoPtr: VoidPtr =
        Internals.getMethodBindPtr("XRInterface", "get_system_info", 2382534195)

    public val getTrackingStatusPtr: VoidPtr =
        Internals.getMethodBindPtr("XRInterface", "get_tracking_status", 167423259)

    public val getRenderTargetSizePtr: VoidPtr =
        Internals.getMethodBindPtr("XRInterface", "get_render_target_size", 1497962370)

    public val getViewCountPtr: VoidPtr =
        Internals.getMethodBindPtr("XRInterface", "get_view_count", 2455072627)

    public val triggerHapticPulsePtr: VoidPtr =
        Internals.getMethodBindPtr("XRInterface", "trigger_haptic_pulse", 3752640163)

    public val supportsPlayAreaModePtr: VoidPtr =
        Internals.getMethodBindPtr("XRInterface", "supports_play_area_mode", 3429955281)

    public val getPlayAreaModePtr: VoidPtr =
        Internals.getMethodBindPtr("XRInterface", "get_play_area_mode", 1615132885)

    public val setPlayAreaModePtr: VoidPtr =
        Internals.getMethodBindPtr("XRInterface", "set_play_area_mode", 3429955281)

    public val getPlayAreaPtr: VoidPtr =
        Internals.getMethodBindPtr("XRInterface", "get_play_area", 497664490)

    public val getAnchorDetectionIsEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("XRInterface", "get_anchor_detection_is_enabled", 36873697)

    public val setAnchorDetectionIsEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("XRInterface", "set_anchor_detection_is_enabled", 2586408642)

    public val getCameraFeedIdPtr: VoidPtr =
        Internals.getMethodBindPtr("XRInterface", "get_camera_feed_id", 2455072627)

    public val isPassthroughSupportedPtr: VoidPtr =
        Internals.getMethodBindPtr("XRInterface", "is_passthrough_supported", 2240911060)

    public val isPassthroughEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("XRInterface", "is_passthrough_enabled", 2240911060)

    public val startPassthroughPtr: VoidPtr =
        Internals.getMethodBindPtr("XRInterface", "start_passthrough", 2240911060)

    public val stopPassthroughPtr: VoidPtr =
        Internals.getMethodBindPtr("XRInterface", "stop_passthrough", 3218959716)

    public val getTransformForViewPtr: VoidPtr =
        Internals.getMethodBindPtr("XRInterface", "get_transform_for_view", 518934792)

    public val getProjectionForViewPtr: VoidPtr =
        Internals.getMethodBindPtr("XRInterface", "get_projection_for_view", 3766090294)

    public val getSupportedEnvironmentBlendModesPtr: VoidPtr =
        Internals.getMethodBindPtr("XRInterface", "get_supported_environment_blend_modes", 2915620761)

    public val setEnvironmentBlendModePtr: VoidPtr =
        Internals.getMethodBindPtr("XRInterface", "set_environment_blend_mode", 551152418)

    public val getEnvironmentBlendModePtr: VoidPtr =
        Internals.getMethodBindPtr("XRInterface", "get_environment_blend_mode", 1984334071)
  }
}
