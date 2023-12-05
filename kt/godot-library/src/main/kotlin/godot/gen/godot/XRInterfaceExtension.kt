// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.PackedFloat64Array
import godot.core.PackedStringArray
import godot.core.PackedVector3Array
import godot.core.RID
import godot.core.Rect2
import godot.core.Rect2i
import godot.core.StringName
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.RECT2
import godot.core.VariantType.RECT2I
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class for XR interface extensions (plugins).
 *
 * External XR interface plugins should inherit from this class.
 */
@GodotBaseType
public open class XRInterfaceExtension : XRInterface() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_XRINTERFACEEXTENSION, scriptIndex)
    return true
  }

  /**
   * Returns the name of this interface.
   */
  public open fun _getName(): StringName {
    throw NotImplementedError("_get_name is not implemented for XRInterfaceExtension")
  }

  /**
   * Returns the capabilities of this interface.
   */
  public open fun _getCapabilities(): Long {
    throw NotImplementedError("_get_capabilities is not implemented for XRInterfaceExtension")
  }

  /**
   * Returns `true` if this interface has been initialized.
   */
  public open fun _isInitialized(): Boolean {
    throw NotImplementedError("_is_initialized is not implemented for XRInterfaceExtension")
  }

  /**
   * Initializes the interface, returns `true` on success.
   */
  public open fun _initialize(): Boolean {
    throw NotImplementedError("_initialize is not implemented for XRInterfaceExtension")
  }

  /**
   * Uninitialize the interface.
   */
  public open fun _uninitialize(): Unit {
  }

  /**
   * Returns a [godot.core.Dictionary] with system informationr elated to this interface.
   */
  public open fun _getSystemInfo(): Dictionary<Any?, Any?> {
    throw NotImplementedError("_get_system_info is not implemented for XRInterfaceExtension")
  }

  /**
   * Returns `true` if this interface supports this play area mode.
   */
  public open fun _supportsPlayAreaMode(mode: XRInterface.PlayAreaMode): Boolean {
    throw NotImplementedError("_supports_play_area_mode is not implemented for XRInterfaceExtension")
  }

  /**
   * Returns the [enum XRInterface.PlayAreaMode] that sets up our play area.
   */
  public open fun _getPlayAreaMode(): XRInterface.PlayAreaMode {
    throw NotImplementedError("_get_play_area_mode is not implemented for XRInterfaceExtension")
  }

  /**
   * Set the play area mode for this interface.
   */
  public open fun _setPlayAreaMode(mode: XRInterface.PlayAreaMode): Boolean {
    throw NotImplementedError("_set_play_area_mode is not implemented for XRInterfaceExtension")
  }

  /**
   * Returns an [godot.PackedVector3Array] that denotes the play areas boundaries (if applicable).
   */
  public open fun _getPlayArea(): PackedVector3Array {
    throw NotImplementedError("_get_play_area is not implemented for XRInterfaceExtension")
  }

  /**
   * Returns the size of our render target for this interface, this overrides the size of the [godot.Viewport] marked as the xr viewport.
   */
  public open fun _getRenderTargetSize(): Vector2 {
    throw NotImplementedError("_get_render_target_size is not implemented for XRInterfaceExtension")
  }

  /**
   * Returns the number of views this interface requires, 1 for mono, 2 for stereoscopic.
   */
  public open fun _getViewCount(): Long {
    throw NotImplementedError("_get_view_count is not implemented for XRInterfaceExtension")
  }

  /**
   * Returns the [godot.Transform3D] that positions the [godot.XRCamera3D] in the world.
   */
  public open fun _getCameraTransform(): Transform3D {
    throw NotImplementedError("_get_camera_transform is not implemented for XRInterfaceExtension")
  }

  /**
   * Returns a [godot.Transform3D] for a given view.
   */
  public open fun _getTransformForView(view: Long, camTransform: Transform3D): Transform3D {
    throw NotImplementedError("_get_transform_for_view is not implemented for XRInterfaceExtension")
  }

  /**
   * Returns the projection matrix for the given view as a [godot.PackedFloat64Array].
   */
  public open fun _getProjectionForView(
    view: Long,
    aspect: Double,
    zNear: Double,
    zFar: Double,
  ): PackedFloat64Array {
    throw NotImplementedError("_get_projection_for_view is not implemented for XRInterfaceExtension")
  }

  /**
   *
   */
  public open fun _getVrsTexture(): RID {
    throw NotImplementedError("_get_vrs_texture is not implemented for XRInterfaceExtension")
  }

  /**
   * Called if this [godot.XRInterfaceExtension] is active before our physics and game process is called. Most XR interfaces will update its [godot.XRPositionalTracker]s at this point in time.
   */
  public open fun _process(): Unit {
  }

  /**
   * Called if this [godot.XRInterfaceExtension] is active before rendering starts. Most XR interfaces will sync tracking at this point in time.
   */
  public open fun _preRender(): Unit {
  }

  /**
   * Called if this is our primary [godot.XRInterfaceExtension] before we start processing a [godot.Viewport] for every active XR [godot.Viewport], returns `true` if that viewport should be rendered. An XR interface may return `false` if the user has taken off their headset and we can pause rendering.
   */
  public open fun _preDrawViewport(renderTarget: RID): Boolean {
    throw NotImplementedError("_pre_draw_viewport is not implemented for XRInterfaceExtension")
  }

  /**
   * Called after the XR [godot.Viewport] draw logic has completed.
   */
  public open fun _postDrawViewport(renderTarget: RID, screenRect: Rect2): Unit {
  }

  /**
   * Called if interface is active and queues have been submitted.
   */
  public open fun _endFrame(): Unit {
  }

  /**
   * Returns a [godot.PackedStringArray] with tracker names configured by this interface. Note that user configuration can override this list.
   */
  public open fun _getSuggestedTrackerNames(): PackedStringArray {
    throw NotImplementedError("_get_suggested_tracker_names is not implemented for XRInterfaceExtension")
  }

  /**
   * Returns a [godot.PackedStringArray] with pose names configured by this interface. Note that user configuration can override this list.
   */
  public open fun _getSuggestedPoseNames(trackerName: StringName): PackedStringArray {
    throw NotImplementedError("_get_suggested_pose_names is not implemented for XRInterfaceExtension")
  }

  /**
   * Returns a [enum XRInterface.TrackingStatus] specifying the current status of our tracking.
   */
  public open fun _getTrackingStatus(): XRInterface.TrackingStatus {
    throw NotImplementedError("_get_tracking_status is not implemented for XRInterfaceExtension")
  }

  /**
   * Triggers a haptic pulse to be emitted on the specified tracker.
   */
  public open fun _triggerHapticPulse(
    actionName: String,
    trackerName: StringName,
    frequency: Double,
    amplitude: Double,
    durationSec: Double,
    delaySec: Double,
  ): Unit {
  }

  /**
   * Return `true` if anchor detection is enabled for this interface.
   */
  public open fun _getAnchorDetectionIsEnabled(): Boolean {
    throw NotImplementedError("_get_anchor_detection_is_enabled is not implemented for XRInterfaceExtension")
  }

  /**
   * Enables anchor detection on this interface if supported.
   */
  public open fun _setAnchorDetectionIsEnabled(enabled: Boolean): Unit {
  }

  /**
   * Returns the camera feed ID for the [godot.CameraFeed] registered with the [godot.CameraServer] that should be presented as the background on an AR capable device (if applicable).
   */
  public open fun _getCameraFeedId(): Int {
    throw NotImplementedError("_get_camera_feed_id is not implemented for XRInterfaceExtension")
  }

  /**
   * Return color texture into which to render (if applicable).
   */
  public open fun _getColorTexture(): RID {
    throw NotImplementedError("_get_color_texture is not implemented for XRInterfaceExtension")
  }

  /**
   * Return depth texture into which to render (if applicable).
   */
  public open fun _getDepthTexture(): RID {
    throw NotImplementedError("_get_depth_texture is not implemented for XRInterfaceExtension")
  }

  /**
   * Return velocity texture into which to render (if applicable).
   */
  public open fun _getVelocityTexture(): RID {
    throw NotImplementedError("_get_velocity_texture is not implemented for XRInterfaceExtension")
  }

  /**
   *
   */
  public fun getColorTexture(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getColorTexturePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   *
   */
  public fun getDepthTexture(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDepthTexturePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   *
   */
  public fun getVelocityTexture(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVelocityTexturePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Blits our render results to screen optionally applying lens distortion. This can only be called while processing `_commit_views`.
   */
  public fun addBlit(
    renderTarget: RID,
    srcRect: Rect2,
    dstRect: Rect2i,
    useLayer: Boolean,
    layer: Long,
    applyLensDistortion: Boolean,
    eyeCenter: Vector2,
    k1: Double,
    k2: Double,
    upscale: Double,
    aspectRatio: Double,
  ): Unit {
    TransferContext.writeArguments(_RID to renderTarget, RECT2 to srcRect, RECT2I to dstRect, BOOL to useLayer, LONG to layer, BOOL to applyLensDistortion, VECTOR2 to eyeCenter, DOUBLE to k1, DOUBLE to k2, DOUBLE to upscale, DOUBLE to aspectRatio)
    TransferContext.callMethod(rawPtr, MethodBindings.addBlitPtr, NIL)
  }

  /**
   * Returns a valid [RID] for a texture to which we should render the current frame if supported by the interface.
   */
  public fun getRenderTargetTexture(renderTarget: RID): RID {
    TransferContext.writeArguments(_RID to renderTarget)
    TransferContext.callMethod(rawPtr, MethodBindings.getRenderTargetTexturePtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  public companion object

  internal object MethodBindings {
    public val _getNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterfaceExtension", "_get_name")

    public val _getCapabilitiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterfaceExtension", "_get_capabilities")

    public val _isInitializedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterfaceExtension", "_is_initialized")

    public val _initializePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterfaceExtension", "_initialize")

    public val _uninitializePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterfaceExtension", "_uninitialize")

    public val _getSystemInfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterfaceExtension", "_get_system_info")

    public val _supportsPlayAreaModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterfaceExtension", "_supports_play_area_mode")

    public val _getPlayAreaModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterfaceExtension", "_get_play_area_mode")

    public val _setPlayAreaModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterfaceExtension", "_set_play_area_mode")

    public val _getPlayAreaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterfaceExtension", "_get_play_area")

    public val _getRenderTargetSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterfaceExtension", "_get_render_target_size")

    public val _getViewCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterfaceExtension", "_get_view_count")

    public val _getCameraTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterfaceExtension", "_get_camera_transform")

    public val _getTransformForViewPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterfaceExtension", "_get_transform_for_view")

    public val _getProjectionForViewPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterfaceExtension", "_get_projection_for_view")

    public val _getVrsTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterfaceExtension", "_get_vrs_texture")

    public val _processPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterfaceExtension", "_process")

    public val _preRenderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterfaceExtension", "_pre_render")

    public val _preDrawViewportPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterfaceExtension", "_pre_draw_viewport")

    public val _postDrawViewportPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterfaceExtension", "_post_draw_viewport")

    public val _endFramePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterfaceExtension", "_end_frame")

    public val _getSuggestedTrackerNamesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterfaceExtension", "_get_suggested_tracker_names")

    public val _getSuggestedPoseNamesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterfaceExtension", "_get_suggested_pose_names")

    public val _getTrackingStatusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterfaceExtension", "_get_tracking_status")

    public val _triggerHapticPulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterfaceExtension", "_trigger_haptic_pulse")

    public val _getAnchorDetectionIsEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterfaceExtension", "_get_anchor_detection_is_enabled")

    public val _setAnchorDetectionIsEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterfaceExtension", "_set_anchor_detection_is_enabled")

    public val _getCameraFeedIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterfaceExtension", "_get_camera_feed_id")

    public val _getColorTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterfaceExtension", "_get_color_texture")

    public val _getDepthTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterfaceExtension", "_get_depth_texture")

    public val _getVelocityTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterfaceExtension", "_get_velocity_texture")

    public val getColorTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterfaceExtension", "get_color_texture")

    public val getDepthTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterfaceExtension", "get_depth_texture")

    public val getVelocityTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterfaceExtension", "get_velocity_texture")

    public val addBlitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterfaceExtension", "add_blit")

    public val getRenderTargetTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterfaceExtension", "get_render_target_texture")
  }
}
