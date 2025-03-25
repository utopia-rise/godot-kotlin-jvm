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
import godot.core.PackedInt64Array
import godot.core.RID
import godot.core.Rect2i
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_INT_64_ARRAY
import godot.core.VariantParser.RECT2I
import godot.core.VariantParser.STRING
import godot.core.VariantParser.VECTOR2I
import godot.core.VariantParser._RID
import godot.core.Vector2i
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmStatic

/**
 * [OpenXRAPIExtension] makes OpenXR available for GDExtension. It provides the OpenXR API to
 * GDExtension through the [getInstanceProcAddr] method, and the OpenXR instance through [getInstance].
 *
 * It also provides methods for querying the status of OpenXR initialization, and helper methods for
 * ease of use of the API with GDExtension.
 */
@GodotBaseType
public open class OpenXRAPIExtension : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(410, scriptIndex)
  }

  /**
   * Returns the
   * [url=https://registry.khronos.org/OpenXR/specs/1.0/man/html/XrInstance.html]XrInstance[/url]
   * created during the initialization of the OpenXR API.
   */
  public final fun getInstance(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInstancePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the id of the system, which is a
   * [url=https://registry.khronos.org/OpenXR/specs/1.0/man/html/XrSystemId.html]XrSystemId[/url] cast
   * to an integer.
   */
  public final fun getSystemId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSystemIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the OpenXR session, which is an
   * [url=https://registry.khronos.org/OpenXR/specs/1.0/man/html/XrSession.html]XrSession[/url] cast to
   * an integer.
   */
  public final fun getSession(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSessionPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if the provided
   * [url=https://registry.khronos.org/OpenXR/specs/1.0/man/html/XrResult.html]XrResult[/url] (cast to
   * an integer) is successful. Otherwise returns `false` and prints the
   * [url=https://registry.khronos.org/OpenXR/specs/1.0/man/html/XrResult.html]XrResult[/url] converted
   * to a string, with the specified additional information.
   */
  public final fun xrResult(
    result: Long,
    format: String,
    args: VariantArray<Any?>,
  ): Boolean {
    TransferContext.writeArguments(LONG to result, STRING to format, ARRAY to args)
    TransferContext.callMethod(ptr, MethodBindings.xrResultPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the function pointer of the OpenXR function with the specified name, cast to an
   * integer. If the function with the given name does not exist, the method returns `0`.
   *
   * **Note:** `openxr/util.h` contains utility macros for acquiring OpenXR functions, e.g.
   * `GDEXTENSION_INIT_XR_FUNC_V(xrCreateAction)`.
   */
  public final fun getInstanceProcAddr(name: String): Long {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(ptr, MethodBindings.getInstanceProcAddrPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns an error string for the given
   * [url=https://registry.khronos.org/OpenXR/specs/1.0/man/html/XrResult.html]XrResult[/url].
   */
  public final fun getErrorString(result: Long): String {
    TransferContext.writeArguments(LONG to result)
    TransferContext.callMethod(ptr, MethodBindings.getErrorStringPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the name of the specified swapchain format.
   */
  public final fun getSwapchainFormatName(swapchainFormat: Long): String {
    TransferContext.writeArguments(LONG to swapchainFormat)
    TransferContext.callMethod(ptr, MethodBindings.getSwapchainFormatNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Set the object name of an OpenXR object, used for debug output. [objectType] must be a valid
   * OpenXR `XrObjectType` enum and [objectHandle] must be a valid OpenXR object handle.
   */
  public final fun setObjectName(
    objectType: Long,
    objectHandle: Long,
    objectName: String,
  ): Unit {
    TransferContext.writeArguments(LONG to objectType, LONG to objectHandle, STRING to objectName)
    TransferContext.callMethod(ptr, MethodBindings.setObjectNamePtr, NIL)
  }

  /**
   * Begins a new debug label region, this label will be reported in debug messages for any calls
   * following this until [endDebugLabelRegion] is called. Debug labels can be stacked.
   */
  public final fun beginDebugLabelRegion(labelName: String): Unit {
    TransferContext.writeArguments(STRING to labelName)
    TransferContext.callMethod(ptr, MethodBindings.beginDebugLabelRegionPtr, NIL)
  }

  /**
   * Marks the end of a debug label region. Removes the latest debug label region added by calling
   * [beginDebugLabelRegion].
   */
  public final fun endDebugLabelRegion(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.endDebugLabelRegionPtr, NIL)
  }

  /**
   * Inserts a debug label, this label is reported in any debug message resulting from the OpenXR
   * calls that follows, until any of [beginDebugLabelRegion], [endDebugLabelRegion], or
   * [insertDebugLabel] is called.
   */
  public final fun insertDebugLabel(labelName: String): Unit {
    TransferContext.writeArguments(STRING to labelName)
    TransferContext.callMethod(ptr, MethodBindings.insertDebugLabelPtr, NIL)
  }

  /**
   * Returns `true` if OpenXR is initialized.
   */
  public final fun isInitialized(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isInitializedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if OpenXR is running
   * ([url=https://registry.khronos.org/OpenXR/specs/1.0/man/html/xrBeginSession.html]xrBeginSession[/url]
   * was successfully called and the swapchains were created).
   */
  public final fun isRunning(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isRunningPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the play space, which is an
   * [url=https://registry.khronos.org/OpenXR/specs/1.0/man/html/XrSpace.html]XrSpace[/url] cast to an
   * integer.
   */
  public final fun getPlaySpace(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPlaySpacePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the predicted display timing for the current frame.
   */
  public final fun getPredictedDisplayTime(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPredictedDisplayTimePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the predicted display timing for the next frame.
   */
  public final fun getNextFrameTime(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNextFrameTimePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if OpenXR is initialized for rendering with an XR viewport.
   */
  public final fun canRender(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.canRenderPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the [RID] corresponding to an `Action` of a matching name, optionally limited to a
   * specified action set.
   */
  public final fun findAction(name: String, actionSet: RID): RID {
    TransferContext.writeArguments(STRING to name, _RID to actionSet)
    TransferContext.callMethod(ptr, MethodBindings.findActionPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Returns the corresponding `XrAction` OpenXR handle for the given action RID.
   */
  public final fun actionGetHandle(action: RID): Long {
    TransferContext.writeArguments(_RID to action)
    TransferContext.callMethod(ptr, MethodBindings.actionGetHandlePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the corresponding `XRHandTrackerEXT` handle for the given hand index value.
   */
  public final fun getHandTracker(handIndex: Int): Long {
    TransferContext.writeArguments(LONG to handIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getHandTrackerPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Registers the given extension as a composition layer provider.
   */
  public final fun registerCompositionLayerProvider(extension: OpenXRExtensionWrapperExtension?):
      Unit {
    TransferContext.writeArguments(OBJECT to extension)
    TransferContext.callMethod(ptr, MethodBindings.registerCompositionLayerProviderPtr, NIL)
  }

  /**
   * Unregisters the given extension as a composition layer provider.
   */
  public final fun unregisterCompositionLayerProvider(extension: OpenXRExtensionWrapperExtension?):
      Unit {
    TransferContext.writeArguments(OBJECT to extension)
    TransferContext.callMethod(ptr, MethodBindings.unregisterCompositionLayerProviderPtr, NIL)
  }

  /**
   * Registers the given extension as a provider of additional data structures to projections views.
   */
  public final fun registerProjectionViewsExtension(extension: OpenXRExtensionWrapperExtension?):
      Unit {
    TransferContext.writeArguments(OBJECT to extension)
    TransferContext.callMethod(ptr, MethodBindings.registerProjectionViewsExtensionPtr, NIL)
  }

  /**
   * Unregisters the given extension as a provider of additional data structures to projections
   * views.
   */
  public final fun unregisterProjectionViewsExtension(extension: OpenXRExtensionWrapperExtension?):
      Unit {
    TransferContext.writeArguments(OBJECT to extension)
    TransferContext.callMethod(ptr, MethodBindings.unregisterProjectionViewsExtensionPtr, NIL)
  }

  /**
   * Returns the near boundary value of the camera frustum.
   *
   * **Note:** This is only accessible in the render thread.
   */
  public final fun getRenderStateZNear(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRenderStateZNearPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  /**
   * Returns the far boundary value of the camera frustum.
   *
   * **Note:** This is only accessible in the render thread.
   */
  public final fun getRenderStateZFar(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRenderStateZFarPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  /**
   * Sets the render target of the velocity texture.
   */
  public final fun setVelocityTexture(renderTarget: RID): Unit {
    TransferContext.writeArguments(_RID to renderTarget)
    TransferContext.callMethod(ptr, MethodBindings.setVelocityTexturePtr, NIL)
  }

  /**
   * Sets the render target of the velocity depth texture.
   */
  public final fun setVelocityDepthTexture(renderTarget: RID): Unit {
    TransferContext.writeArguments(_RID to renderTarget)
    TransferContext.callMethod(ptr, MethodBindings.setVelocityDepthTexturePtr, NIL)
  }

  /**
   * Sets the target size of the velocity and velocity depth textures.
   */
  public final fun setVelocityTargetSize(targetSize: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to targetSize)
    TransferContext.callMethod(ptr, MethodBindings.setVelocityTargetSizePtr, NIL)
  }

  /**
   * Returns an array of supported swapchain formats.
   */
  public final fun getSupportedSwapchainFormats(): PackedInt64Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSupportedSwapchainFormatsPtr,
        PACKED_INT_64_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_64_ARRAY) as PackedInt64Array)
  }

  /**
   * Returns a pointer to a new swapchain created using the provided parameters.
   */
  public final fun openxrSwapchainCreate(
    createFlags: Long,
    usageFlags: Long,
    swapchainFormat: Long,
    width: Long,
    height: Long,
    sampleCount: Long,
    arraySize: Long,
  ): Long {
    TransferContext.writeArguments(LONG to createFlags, LONG to usageFlags, LONG to swapchainFormat, LONG to width, LONG to height, LONG to sampleCount, LONG to arraySize)
    TransferContext.callMethod(ptr, MethodBindings.openxrSwapchainCreatePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Destroys the provided swapchain and frees it from memory.
   */
  public final fun openxrSwapchainFree(swapchain: Long): Unit {
    TransferContext.writeArguments(LONG to swapchain)
    TransferContext.callMethod(ptr, MethodBindings.openxrSwapchainFreePtr, NIL)
  }

  /**
   * Returns the `XrSwapchain` handle of the provided swapchain.
   */
  public final fun openxrSwapchainGetSwapchain(swapchain: Long): Long {
    TransferContext.writeArguments(LONG to swapchain)
    TransferContext.callMethod(ptr, MethodBindings.openxrSwapchainGetSwapchainPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Acquires the image of the provided swapchain.
   */
  public final fun openxrSwapchainAcquire(swapchain: Long): Unit {
    TransferContext.writeArguments(LONG to swapchain)
    TransferContext.callMethod(ptr, MethodBindings.openxrSwapchainAcquirePtr, NIL)
  }

  /**
   * Returns the RID of the provided swapchain's image.
   */
  public final fun openxrSwapchainGetImage(swapchain: Long): RID {
    TransferContext.writeArguments(LONG to swapchain)
    TransferContext.callMethod(ptr, MethodBindings.openxrSwapchainGetImagePtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Releases the image of the provided swapchain.
   */
  public final fun openxrSwapchainRelease(swapchain: Long): Unit {
    TransferContext.writeArguments(LONG to swapchain)
    TransferContext.callMethod(ptr, MethodBindings.openxrSwapchainReleasePtr, NIL)
  }

  /**
   * Returns a pointer to the render state's `XrCompositionLayerProjection` struct.
   *
   * **Note:** This method should only be called from the rendering thread.
   */
  public final fun getProjectionLayer(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getProjectionLayerPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the render region to [renderRegion], overriding the normal render target's rect.
   */
  public final fun setRenderRegion(renderRegion: Rect2i): Unit {
    TransferContext.writeArguments(RECT2I to renderRegion)
    TransferContext.callMethod(ptr, MethodBindings.setRenderRegionPtr, NIL)
  }

  /**
   * If set to `true`, an OpenXR extension is loaded which is capable of emulating the
   * [XRInterface.XR_ENV_BLEND_MODE_ALPHA_BLEND] blend mode.
   */
  public final fun setEmulateEnvironmentBlendModeAlphaBlend(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setEmulateEnvironmentBlendModeAlphaBlendPtr, NIL)
  }

  /**
   * Returns [OpenXRAPIExtension.OpenXRAlphaBlendModeSupport] denoting if
   * [XRInterface.XR_ENV_BLEND_MODE_ALPHA_BLEND] is really supported, emulated or not supported at all.
   */
  public final fun isEnvironmentBlendModeAlphaSupported(): OpenXRAlphaBlendModeSupport {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isEnvironmentBlendModeAlphaSupportedPtr, LONG)
    return OpenXRAlphaBlendModeSupport.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class OpenXRAlphaBlendModeSupport(
    id: Long,
  ) {
    /**
     * Means that [XRInterface.XR_ENV_BLEND_MODE_ALPHA_BLEND] isn't supported at all.
     */
    OPENXR_ALPHA_BLEND_MODE_SUPPORT_NONE(0),
    /**
     * Means that [XRInterface.XR_ENV_BLEND_MODE_ALPHA_BLEND] is really supported.
     */
    OPENXR_ALPHA_BLEND_MODE_SUPPORT_REAL(1),
    /**
     * Means that [XRInterface.XR_ENV_BLEND_MODE_ALPHA_BLEND] is emulated.
     */
    OPENXR_ALPHA_BLEND_MODE_SUPPORT_EMULATING(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): OpenXRAlphaBlendModeSupport =
          entries.single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Returns `true` if OpenXR is enabled.
     */
    @JvmStatic
    public final fun openxrIsEnabled(checkRunInEditor: Boolean): Boolean {
      TransferContext.writeArguments(BOOL to checkRunInEditor)
      TransferContext.callMethod(0, MethodBindings.openxrIsEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL) as Boolean)
    }
  }

  public object MethodBindings {
    internal val getInstancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "get_instance", 2455072627)

    internal val getSystemIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "get_system_id", 2455072627)

    internal val getSessionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "get_session", 2455072627)

    internal val transformFromPosePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "transform_from_pose", 2963875352)

    internal val xrResultPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "xr_result", 3886436197)

    internal val openxrIsEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "openxr_is_enabled", 2703660260)

    internal val getInstanceProcAddrPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "get_instance_proc_addr", 1597066294)

    internal val getErrorStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "get_error_string", 990163283)

    internal val getSwapchainFormatNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "get_swapchain_format_name", 990163283)

    internal val setObjectNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "set_object_name", 2285447957)

    internal val beginDebugLabelRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "begin_debug_label_region", 83702148)

    internal val endDebugLabelRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "end_debug_label_region", 3218959716)

    internal val insertDebugLabelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "insert_debug_label", 83702148)

    internal val isInitializedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "is_initialized", 2240911060)

    internal val isRunningPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "is_running", 2240911060)

    internal val getPlaySpacePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "get_play_space", 2455072627)

    internal val getPredictedDisplayTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "get_predicted_display_time", 2455072627)

    internal val getNextFrameTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "get_next_frame_time", 2455072627)

    internal val canRenderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "can_render", 2240911060)

    internal val findActionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "find_action", 4106179378)

    internal val actionGetHandlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "action_get_handle", 3917799429)

    internal val getHandTrackerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "get_hand_tracker", 3744713108)

    internal val registerCompositionLayerProviderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "register_composition_layer_provider", 1997997368)

    internal val unregisterCompositionLayerProviderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "unregister_composition_layer_provider", 1997997368)

    internal val registerProjectionViewsExtensionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "register_projection_views_extension", 1997997368)

    internal val unregisterProjectionViewsExtensionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "unregister_projection_views_extension", 1997997368)

    internal val getRenderStateZNearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "get_render_state_z_near", 191475506)

    internal val getRenderStateZFarPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "get_render_state_z_far", 191475506)

    internal val setVelocityTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "set_velocity_texture", 2722037293)

    internal val setVelocityDepthTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "set_velocity_depth_texture", 2722037293)

    internal val setVelocityTargetSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "set_velocity_target_size", 1130785943)

    internal val getSupportedSwapchainFormatsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "get_supported_swapchain_formats", 3851388692)

    internal val openxrSwapchainCreatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "openxr_swapchain_create", 2162228999)

    internal val openxrSwapchainFreePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "openxr_swapchain_free", 1286410249)

    internal val openxrSwapchainGetSwapchainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "openxr_swapchain_get_swapchain", 3744713108)

    internal val openxrSwapchainAcquirePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "openxr_swapchain_acquire", 1286410249)

    internal val openxrSwapchainGetImagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "openxr_swapchain_get_image", 937000113)

    internal val openxrSwapchainReleasePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "openxr_swapchain_release", 1286410249)

    internal val getProjectionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "get_projection_layer", 2455072627)

    internal val setRenderRegionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "set_render_region", 1763793166)

    internal val setEmulateEnvironmentBlendModeAlphaBlendPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "set_emulate_environment_blend_mode_alpha_blend", 2586408642)

    internal val isEnvironmentBlendModeAlphaSupportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "is_environment_blend_mode_alpha_supported", 1579290861)
  }
}
