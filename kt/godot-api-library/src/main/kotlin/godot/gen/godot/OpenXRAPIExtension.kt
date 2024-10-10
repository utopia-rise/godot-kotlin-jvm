// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_OPENXRAPIEXTENSION_INDEX: Int = 380

/**
 * [OpenXRAPIExtension] makes OpenXR available for GDExtension. It provides the OpenXR API to
 * GDExtension through the [getInstanceProcAddr] method, and the OpenXR instance through [getInstance].
 * It also provides methods for querying the status of OpenXR initialization, and helper methods for
 * ease of use of the API with GDExtension.
 */
@GodotBaseType
public open class OpenXRAPIExtension : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_OPENXRAPIEXTENSION_INDEX, scriptIndex)
  }

  /**
   * Returns the
   * [url=https://registry.khronos.org/OpenXR/specs/1.0/man/html/XrInstance.html]XrInstance[/url]
   * created during the initialization of the OpenXR API.
   */
  public final fun getInstance(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getInstancePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the id of the system, which is a
   * [url=https://registry.khronos.org/OpenXR/specs/1.0/man/html/XrSystemId.html]XrSystemId[/url] cast
   * to an integer.
   */
  public final fun getSystemId(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSystemIdPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the OpenXR session, which is an
   * [url=https://registry.khronos.org/OpenXR/specs/1.0/man/html/XrSession.html]XrSession[/url] cast to
   * an integer.
   */
  public final fun getSession(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSessionPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
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
    Internals.writeArguments(LONG to result, STRING to format, ARRAY to args)
    Internals.callMethod(rawPtr, MethodBindings.xrResultPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the function pointer of the OpenXR function with the specified name, cast to an
   * integer. If the function with the given name does not exist, the method returns `0`.
   * **Note:** `openxr/util.h` contains utility macros for acquiring OpenXR functions, e.g.
   * `GDEXTENSION_INIT_XR_FUNC_V(xrCreateAction)`.
   */
  public final fun getInstanceProcAddr(name: String): Long {
    Internals.writeArguments(STRING to name)
    Internals.callMethod(rawPtr, MethodBindings.getInstanceProcAddrPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns an error string for the given
   * [url=https://registry.khronos.org/OpenXR/specs/1.0/man/html/XrResult.html]XrResult[/url].
   */
  public final fun getErrorString(result: Long): String {
    Internals.writeArguments(LONG to result)
    Internals.callMethod(rawPtr, MethodBindings.getErrorStringPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns the name of the specified swapchain format.
   */
  public final fun getSwapchainFormatName(swapchainFormat: Long): String {
    Internals.writeArguments(LONG to swapchainFormat)
    Internals.callMethod(rawPtr, MethodBindings.getSwapchainFormatNamePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns `true` if OpenXR is initialized.
   */
  public final fun isInitialized(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isInitializedPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if OpenXR is running
   * ([url=https://registry.khronos.org/OpenXR/specs/1.0/man/html/xrBeginSession.html]xrBeginSession[/url]
   * was successfully called and the swapchains were created).
   */
  public final fun isRunning(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isRunningPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the play space, which is an
   * [url=https://registry.khronos.org/OpenXR/specs/1.0/man/html/XrSpace.html]XrSpace[/url] cast to an
   * integer.
   */
  public final fun getPlaySpace(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPlaySpacePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the predicted display timing for the current frame.
   */
  public final fun getPredictedDisplayTime(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPredictedDisplayTimePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the predicted display timing for the next frame.
   */
  public final fun getNextFrameTime(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getNextFrameTimePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if OpenXR is initialized for rendering with an XR viewport.
   */
  public final fun canRender(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.canRenderPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the corresponding `XRHandTrackerEXT` handle for the given hand index value.
   */
  public final fun getHandTracker(handIndex: Int): Long {
    Internals.writeArguments(LONG to handIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getHandTrackerPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Registers the given extension as a composition layer provider.
   */
  public final fun registerCompositionLayerProvider(extension: OpenXRExtensionWrapperExtension?):
      Unit {
    Internals.writeArguments(OBJECT to extension)
    Internals.callMethod(rawPtr, MethodBindings.registerCompositionLayerProviderPtr, NIL)
  }

  /**
   * Unregisters the given extension as a composition layer provider.
   */
  public final fun unregisterCompositionLayerProvider(extension: OpenXRExtensionWrapperExtension?):
      Unit {
    Internals.writeArguments(OBJECT to extension)
    Internals.callMethod(rawPtr, MethodBindings.unregisterCompositionLayerProviderPtr, NIL)
  }

  /**
   * If set to `true`, an OpenXR extension is loaded which is capable of emulating the
   * [XRInterface.XR_ENV_BLEND_MODE_ALPHA_BLEND] blend mode.
   */
  public final fun setEmulateEnvironmentBlendModeAlphaBlend(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setEmulateEnvironmentBlendModeAlphaBlendPtr, NIL)
  }

  /**
   * Returns [OpenXRAPIExtension.OpenXRAlphaBlendModeSupport] denoting if
   * [XRInterface.XR_ENV_BLEND_MODE_ALPHA_BLEND] is really supported, emulated or not supported at all.
   */
  public final fun isEnvironmentBlendModeAlphaSupported(): OpenXRAlphaBlendModeSupport {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isEnvironmentBlendModeAlphaSupportedPtr, LONG)
    return OpenXRAPIExtension.OpenXRAlphaBlendModeSupport.from(Internals.readReturnValue(LONG) as Long)
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
      Internals.writeArguments(BOOL to checkRunInEditor)
      Internals.callMethod(0, MethodBindings.openxrIsEnabledPtr, BOOL)
      return (Internals.readReturnValue(BOOL) as Boolean)
    }
  }

  internal object MethodBindings {
    public val getInstancePtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRAPIExtension", "get_instance", 2455072627)

    public val getSystemIdPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRAPIExtension", "get_system_id", 2455072627)

    public val getSessionPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRAPIExtension", "get_session", 2455072627)

    public val transformFromPosePtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRAPIExtension", "transform_from_pose", 3255299855)

    public val xrResultPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRAPIExtension", "xr_result", 3886436197)

    public val openxrIsEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRAPIExtension", "openxr_is_enabled", 2703660260)

    public val getInstanceProcAddrPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRAPIExtension", "get_instance_proc_addr", 1597066294)

    public val getErrorStringPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRAPIExtension", "get_error_string", 990163283)

    public val getSwapchainFormatNamePtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRAPIExtension", "get_swapchain_format_name", 990163283)

    public val isInitializedPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRAPIExtension", "is_initialized", 2240911060)

    public val isRunningPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRAPIExtension", "is_running", 2240911060)

    public val getPlaySpacePtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRAPIExtension", "get_play_space", 2455072627)

    public val getPredictedDisplayTimePtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRAPIExtension", "get_predicted_display_time", 2455072627)

    public val getNextFrameTimePtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRAPIExtension", "get_next_frame_time", 2455072627)

    public val canRenderPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRAPIExtension", "can_render", 2240911060)

    public val getHandTrackerPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRAPIExtension", "get_hand_tracker", 3744713108)

    public val registerCompositionLayerProviderPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRAPIExtension", "register_composition_layer_provider", 1997997368)

    public val unregisterCompositionLayerProviderPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRAPIExtension", "unregister_composition_layer_provider", 1997997368)

    public val setEmulateEnvironmentBlendModeAlphaBlendPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRAPIExtension", "set_emulate_environment_blend_mode_alpha_blend", 2586408642)

    public val isEnvironmentBlendModeAlphaSupportedPtr: VoidPtr =
        Internals.getMethodBindPtr("OpenXRAPIExtension", "is_environment_blend_mode_alpha_supported", 1579290861)
  }
}
