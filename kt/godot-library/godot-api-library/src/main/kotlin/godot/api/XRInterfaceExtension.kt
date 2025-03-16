// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Dictionary
import godot.core.PackedFloat64Array
import godot.core.PackedStringArray
import godot.core.PackedVector3Array
import godot.core.RID
import godot.core.Rect2
import godot.core.Rect2i
import godot.core.StringName
import godot.core.Transform3D
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.RECT2
import godot.core.VariantParser.RECT2I
import godot.core.VariantParser.VECTOR2
import godot.core.VariantParser._RID
import godot.core.Vector2
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
 * External XR interface plugins should inherit from this class.
 */
@GodotBaseType
public open class XRInterfaceExtension : XRInterface() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(872, scriptIndex)
  }

  /**
   * Returns the name of this interface.
   */
  public open fun _getName(): StringName {
    throw NotImplementedError("_getName is not implemented for XRInterfaceExtension")
  }

  /**
   * Returns the capabilities of this interface.
   */
  public open fun _getCapabilities(): Long {
    throw NotImplementedError("_getCapabilities is not implemented for XRInterfaceExtension")
  }

  /**
   * Returns `true` if this interface has been initialized.
   */
  public open fun _isInitialized(): Boolean {
    throw NotImplementedError("_isInitialized is not implemented for XRInterfaceExtension")
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
   * Returns a [Dictionary] with system information related to this interface.
   */
  public open fun _getSystemInfo(): Dictionary<Any?, Any?> {
    throw NotImplementedError("_getSystemInfo is not implemented for XRInterfaceExtension")
  }

  /**
   * Returns `true` if this interface supports this play area mode.
   */
  public open fun _supportsPlayAreaMode(mode: XRInterface.PlayAreaMode): Boolean {
    throw NotImplementedError("_supportsPlayAreaMode is not implemented for XRInterfaceExtension")
  }

  /**
   * Returns the play area mode that sets up our play area.
   */
  public open fun _getPlayAreaMode(): XRInterface.PlayAreaMode {
    throw NotImplementedError("_getPlayAreaMode is not implemented for XRInterfaceExtension")
  }

  /**
   * Set the play area mode for this interface.
   */
  public open fun _setPlayAreaMode(mode: XRInterface.PlayAreaMode): Boolean {
    throw NotImplementedError("_setPlayAreaMode is not implemented for XRInterfaceExtension")
  }

  /**
   * Returns a [PackedVector3Array] that represents the play areas boundaries (if applicable).
   */
  public open fun _getPlayArea(): PackedVector3Array {
    throw NotImplementedError("_getPlayArea is not implemented for XRInterfaceExtension")
  }

  /**
   * Returns the size of our render target for this interface, this overrides the size of the
   * [Viewport] marked as the xr viewport.
   */
  public open fun _getRenderTargetSize(): Vector2 {
    throw NotImplementedError("_getRenderTargetSize is not implemented for XRInterfaceExtension")
  }

  /**
   * Returns the number of views this interface requires, 1 for mono, 2 for stereoscopic.
   */
  public open fun _getViewCount(): Long {
    throw NotImplementedError("_getViewCount is not implemented for XRInterfaceExtension")
  }

  /**
   * Returns the [Transform3D] that positions the [XRCamera3D] in the world.
   */
  public open fun _getCameraTransform(): Transform3D {
    throw NotImplementedError("_getCameraTransform is not implemented for XRInterfaceExtension")
  }

  /**
   * Returns a [Transform3D] for a given view.
   */
  public open fun _getTransformForView(view: Long, camTransform: Transform3D): Transform3D {
    throw NotImplementedError("_getTransformForView is not implemented for XRInterfaceExtension")
  }

  /**
   * Returns the projection matrix for the given view as a [PackedFloat64Array].
   */
  public open fun _getProjectionForView(
    view: Long,
    aspect: Double,
    zNear: Double,
    zFar: Double,
  ): PackedFloat64Array {
    throw NotImplementedError("_getProjectionForView is not implemented for XRInterfaceExtension")
  }

  public open fun _getVrsTexture(): RID {
    throw NotImplementedError("_getVrsTexture is not implemented for XRInterfaceExtension")
  }

  /**
   * Called if this [XRInterfaceExtension] is active before our physics and game process is called.
   * Most XR interfaces will update its [XRPositionalTracker]s at this point in time.
   */
  public open fun _process(): Unit {
  }

  /**
   * Called if this [XRInterfaceExtension] is active before rendering starts. Most XR interfaces
   * will sync tracking at this point in time.
   */
  public open fun _preRender(): Unit {
  }

  /**
   * Called if this is our primary [XRInterfaceExtension] before we start processing a [Viewport]
   * for every active XR [Viewport], returns `true` if that viewport should be rendered. An XR
   * interface may return `false` if the user has taken off their headset and we can pause rendering.
   */
  public open fun _preDrawViewport(renderTarget: RID): Boolean {
    throw NotImplementedError("_preDrawViewport is not implemented for XRInterfaceExtension")
  }

  /**
   * Called after the XR [Viewport] draw logic has completed.
   */
  public open fun _postDrawViewport(renderTarget: RID, screenRect: Rect2): Unit {
  }

  /**
   * Called if interface is active and queues have been submitted.
   */
  public open fun _endFrame(): Unit {
  }

  /**
   * Returns a [PackedStringArray] with tracker names configured by this interface. Note that user
   * configuration can override this list.
   */
  public open fun _getSuggestedTrackerNames(): PackedStringArray {
    throw NotImplementedError("_getSuggestedTrackerNames is not implemented for XRInterfaceExtension")
  }

  /**
   * Returns a [PackedStringArray] with pose names configured by this interface. Note that user
   * configuration can override this list.
   */
  public open fun _getSuggestedPoseNames(trackerName: StringName): PackedStringArray {
    throw NotImplementedError("_getSuggestedPoseNames is not implemented for XRInterfaceExtension")
  }

  /**
   * Returns a [XRInterface.TrackingStatus] specifying the current status of our tracking.
   */
  public open fun _getTrackingStatus(): XRInterface.TrackingStatus {
    throw NotImplementedError("_getTrackingStatus is not implemented for XRInterfaceExtension")
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
    throw NotImplementedError("_getAnchorDetectionIsEnabled is not implemented for XRInterfaceExtension")
  }

  /**
   * Enables anchor detection on this interface if supported.
   */
  public open fun _setAnchorDetectionIsEnabled(enabled: Boolean): Unit {
  }

  /**
   * Returns the camera feed ID for the [CameraFeed] registered with the [CameraServer] that should
   * be presented as the background on an AR capable device (if applicable).
   */
  public open fun _getCameraFeedId(): Int {
    throw NotImplementedError("_getCameraFeedId is not implemented for XRInterfaceExtension")
  }

  /**
   * Return color texture into which to render (if applicable).
   */
  public open fun _getColorTexture(): RID {
    throw NotImplementedError("_getColorTexture is not implemented for XRInterfaceExtension")
  }

  /**
   * Return depth texture into which to render (if applicable).
   */
  public open fun _getDepthTexture(): RID {
    throw NotImplementedError("_getDepthTexture is not implemented for XRInterfaceExtension")
  }

  /**
   * Return velocity texture into which to render (if applicable).
   */
  public open fun _getVelocityTexture(): RID {
    throw NotImplementedError("_getVelocityTexture is not implemented for XRInterfaceExtension")
  }

  public final fun getColorTexture(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getColorTexturePtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public final fun getDepthTexture(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDepthTexturePtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public final fun getVelocityTexture(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVelocityTexturePtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Blits our render results to screen optionally applying lens distortion. This can only be called
   * while processing `_commit_views`.
   */
  public final fun addBlit(
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
    TransferContext.callMethod(ptr, MethodBindings.addBlitPtr, NIL)
  }

  /**
   * Returns a valid [RID] for a texture to which we should render the current frame if supported by
   * the interface.
   */
  public final fun getRenderTargetTexture(renderTarget: RID): RID {
    TransferContext.writeArguments(_RID to renderTarget)
    TransferContext.callMethod(ptr, MethodBindings.getRenderTargetTexturePtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public companion object

  public object MethodBindings {
    internal val getColorTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterfaceExtension", "get_color_texture", 529393457)

    internal val getDepthTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterfaceExtension", "get_depth_texture", 529393457)

    internal val getVelocityTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterfaceExtension", "get_velocity_texture", 529393457)

    internal val addBlitPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterfaceExtension", "add_blit", 258596971)

    internal val getRenderTargetTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRInterfaceExtension", "get_render_target_texture", 41030802)
  }
}
