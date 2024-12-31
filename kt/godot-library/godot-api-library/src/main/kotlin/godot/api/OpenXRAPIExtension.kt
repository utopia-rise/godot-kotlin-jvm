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
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

private const val ENGINECLASS_OPENXRAPIEXTENSION: Int = 420

/**
 * [OpenXRAPIExtension] makes OpenXR available for GDExtension. It provides the OpenXR API to
 * GDExtension through the [getInstanceProcAddr] method, and the OpenXR instance through [getInstance].
 * It also provides methods for querying the status of OpenXR initialization, and helper methods for
 * ease of use of the API with GDExtension.
 */
@GodotBaseType
public open class OpenXRAPIExtension : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_OPENXRAPIEXTENSION, scriptIndex)
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
    return OpenXRAPIExtension.OpenXRAlphaBlendModeSupport.from(TransferContext.readReturnValue(LONG) as Long)
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
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "transform_from_pose", 3255299855)

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

    internal val getHandTrackerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "get_hand_tracker", 3744713108)

    internal val registerCompositionLayerProviderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "register_composition_layer_provider", 1997997368)

    internal val unregisterCompositionLayerProviderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "unregister_composition_layer_provider", 1997997368)

    internal val setEmulateEnvironmentBlendModeAlphaBlendPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "set_emulate_environment_blend_mode_alpha_blend", 2586408642)

    internal val isEnvironmentBlendModeAlphaSupportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRAPIExtension", "is_environment_blend_mode_alpha_supported", 1579290861)
  }
}
