// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.PackedStringArray
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 * [OpenXRExtensionWrapperExtension] allows clients to implement OpenXR extensions with GDExtension.
 * The extension should be registered with [registerExtensionWrapper].
 */
@GodotBaseType
public open class OpenXRExtensionWrapperExtension : Object() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_OPENXREXTENSIONWRAPPEREXTENSION, scriptIndex)
  }

  /**
   * Returns a [Dictionary] of OpenXR extensions related to this extension. The [Dictionary] should
   * contain the name of the extension, mapped to a `bool *` cast to an integer:
   * - If the `bool *` is a `nullptr` this extension is mandatory.
   * - If the `bool *` points to a boolean, the boolean will be updated to `true` if the extension
   * is enabled.
   */
  public open fun _getRequestedExtensions(): Dictionary<Any?, Any?> {
    throw NotImplementedError("_get_requested_extensions is not implemented for OpenXRExtensionWrapperExtension")
  }

  /**
   * Returns the number of composition layers this extension wrapper provides via
   * [_getCompositionLayer].
   * This will only be called if the extension previously registered itself with
   * [OpenXRAPIExtension.registerCompositionLayerProvider].
   */
  public open fun _getCompositionLayerCount(): Int {
    throw NotImplementedError("_get_composition_layer_count is not implemented for OpenXRExtensionWrapperExtension")
  }

  /**
   * Returns a pointer to an `XrCompositionLayerBaseHeader` struct to provide the given composition
   * layer.
   * This will only be called if the extension previously registered itself with
   * [OpenXRAPIExtension.registerCompositionLayerProvider].
   */
  public open fun _getCompositionLayer(index: Int): Long {
    throw NotImplementedError("_get_composition_layer is not implemented for OpenXRExtensionWrapperExtension")
  }

  /**
   * Returns an integer that will be used to sort the given composition layer provided via
   * [_getCompositionLayer]. Lower numbers will move the layer to the front of the list, and higher
   * numbers to the end. The default projection layer has an order of `0`, so layers provided by this
   * method should probably be above or below (but not exactly) `0`.
   * This will only be called if the extension previously registered itself with
   * [OpenXRAPIExtension.registerCompositionLayerProvider].
   */
  public open fun _getCompositionLayerOrder(index: Int): Int {
    throw NotImplementedError("_get_composition_layer_order is not implemented for OpenXRExtensionWrapperExtension")
  }

  /**
   * Returns a [PackedStringArray] of positional tracker names that are used within the extension
   * wrapper.
   */
  public open fun _getSuggestedTrackerNames(): PackedStringArray {
    throw NotImplementedError("_get_suggested_tracker_names is not implemented for OpenXRExtensionWrapperExtension")
  }

  /**
   * Allows extensions to register additional controller metadata. This function is called even when
   * the OpenXR API is not constructed as the metadata needs to be available to the editor.
   * Extensions should also provide metadata regardless of whether they are supported on the host
   * system. The controller data is used to setup action maps for users who may have access to the
   * relevant hardware.
   */
  public open fun _onRegisterMetadata(): Unit {
  }

  /**
   * Called before the OpenXR instance is created.
   */
  public open fun _onBeforeInstanceCreated(): Unit {
  }

  /**
   * Called right after the OpenXR instance is created.
   */
  public open fun _onInstanceCreated(instance: Long): Unit {
  }

  /**
   * Called right before the OpenXR instance is destroyed.
   */
  public open fun _onInstanceDestroyed(): Unit {
  }

  /**
   * Called right after the OpenXR session is created.
   */
  public open fun _onSessionCreated(session: Long): Unit {
  }

  /**
   * Called as part of the OpenXR process handling. This happens right before general and physics
   * processing steps of the main loop. During this step controller data is queried and made available
   * to game logic.
   */
  public open fun _onProcess(): Unit {
  }

  /**
   * Called right before the XR viewports begin their rendering step.
   */
  public open fun _onPreRender(): Unit {
  }

  /**
   * Called right after the main swapchains are (re)created.
   */
  public open fun _onMainSwapchainsCreated(): Unit {
  }

  /**
   * Called right before the OpenXR session is destroyed.
   */
  public open fun _onSessionDestroyed(): Unit {
  }

  /**
   * Called when the OpenXR session state is changed to idle.
   */
  public open fun _onStateIdle(): Unit {
  }

  /**
   * Called when the OpenXR session state is changed to ready. This means OpenXR is ready to set up
   * the session.
   */
  public open fun _onStateReady(): Unit {
  }

  /**
   * Called when the OpenXR session state is changed to synchronized. OpenXR also returns to this
   * state when the application loses focus.
   */
  public open fun _onStateSynchronized(): Unit {
  }

  /**
   * Called when the OpenXR session state is changed to visible. This means OpenXR is now ready to
   * receive frames.
   */
  public open fun _onStateVisible(): Unit {
  }

  /**
   * Called when the OpenXR session state is changed to focused. This state is the active state when
   * the game runs.
   */
  public open fun _onStateFocused(): Unit {
  }

  /**
   * Called when the OpenXR session state is changed to stopping.
   */
  public open fun _onStateStopping(): Unit {
  }

  /**
   * Called when the OpenXR session state is changed to loss pending.
   */
  public open fun _onStateLossPending(): Unit {
  }

  /**
   * Called when the OpenXR session state is changed to exiting.
   */
  public open fun _onStateExiting(): Unit {
  }

  /**
   * Gets an array of [Dictionary]s that represent properties, just like [Object.GetPropertyList],
   * that will be added to [OpenXRCompositionLayer] nodes.
   */
  public open fun _getViewportCompositionLayerExtensionProperties():
      VariantArray<Dictionary<Any?, Any?>> {
    throw NotImplementedError("_get_viewport_composition_layer_extension_properties is not implemented for OpenXRExtensionWrapperExtension")
  }

  /**
   * Gets a [Dictionary] containing the default values for the properties returned by
   * [_getViewportCompositionLayerExtensionProperties].
   */
  public open fun _getViewportCompositionLayerExtensionPropertyDefaults(): Dictionary<Any?, Any?> {
    throw NotImplementedError("_get_viewport_composition_layer_extension_property_defaults is not implemented for OpenXRExtensionWrapperExtension")
  }

  /**
   * Returns the created [OpenXRAPIExtension], which can be used to access the OpenXR API.
   */
  public fun getOpenxrApi(): OpenXRAPIExtension? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOpenxrApiPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as OpenXRAPIExtension?)
  }

  /**
   * Registers the extension. This should happen at core module initialization level.
   */
  public fun registerExtensionWrapper(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.registerExtensionWrapperPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val _getRequestedExtensionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRExtensionWrapperExtension", "_get_requested_extensions")

    public val _setSystemPropertiesAndGetNextPointerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRExtensionWrapperExtension", "_set_system_properties_and_get_next_pointer")

    public val _setInstanceCreateInfoAndGetNextPointerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRExtensionWrapperExtension", "_set_instance_create_info_and_get_next_pointer")

    public val _setSessionCreateAndGetNextPointerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRExtensionWrapperExtension", "_set_session_create_and_get_next_pointer")

    public val _setSwapchainCreateInfoAndGetNextPointerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRExtensionWrapperExtension", "_set_swapchain_create_info_and_get_next_pointer")

    public val _setHandJointLocationsAndGetNextPointerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRExtensionWrapperExtension", "_set_hand_joint_locations_and_get_next_pointer")

    public val _getCompositionLayerCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRExtensionWrapperExtension", "_get_composition_layer_count")

    public val _getCompositionLayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRExtensionWrapperExtension", "_get_composition_layer")

    public val _getCompositionLayerOrderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRExtensionWrapperExtension", "_get_composition_layer_order")

    public val _getSuggestedTrackerNamesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRExtensionWrapperExtension", "_get_suggested_tracker_names")

    public val _onRegisterMetadataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRExtensionWrapperExtension", "_on_register_metadata")

    public val _onBeforeInstanceCreatedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRExtensionWrapperExtension", "_on_before_instance_created")

    public val _onInstanceCreatedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRExtensionWrapperExtension", "_on_instance_created")

    public val _onInstanceDestroyedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRExtensionWrapperExtension", "_on_instance_destroyed")

    public val _onSessionCreatedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRExtensionWrapperExtension", "_on_session_created")

    public val _onProcessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRExtensionWrapperExtension", "_on_process")

    public val _onPreRenderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRExtensionWrapperExtension", "_on_pre_render")

    public val _onMainSwapchainsCreatedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRExtensionWrapperExtension", "_on_main_swapchains_created")

    public val _onSessionDestroyedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRExtensionWrapperExtension", "_on_session_destroyed")

    public val _onStateIdlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRExtensionWrapperExtension", "_on_state_idle")

    public val _onStateReadyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRExtensionWrapperExtension", "_on_state_ready")

    public val _onStateSynchronizedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRExtensionWrapperExtension", "_on_state_synchronized")

    public val _onStateVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRExtensionWrapperExtension", "_on_state_visible")

    public val _onStateFocusedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRExtensionWrapperExtension", "_on_state_focused")

    public val _onStateStoppingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRExtensionWrapperExtension", "_on_state_stopping")

    public val _onStateLossPendingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRExtensionWrapperExtension", "_on_state_loss_pending")

    public val _onStateExitingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRExtensionWrapperExtension", "_on_state_exiting")

    public val _onEventPolledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRExtensionWrapperExtension", "_on_event_polled")

    public val _setViewportCompositionLayerAndGetNextPointerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRExtensionWrapperExtension", "_set_viewport_composition_layer_and_get_next_pointer")

    public val _getViewportCompositionLayerExtensionPropertiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRExtensionWrapperExtension", "_get_viewport_composition_layer_extension_properties")

    public val _getViewportCompositionLayerExtensionPropertyDefaultsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRExtensionWrapperExtension", "_get_viewport_composition_layer_extension_property_defaults")

    public val _onViewportCompositionLayerDestroyedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRExtensionWrapperExtension", "_on_viewport_composition_layer_destroyed")

    public val getOpenxrApiPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRExtensionWrapperExtension", "get_openxr_api")

    public val registerExtensionWrapperPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRExtensionWrapperExtension", "register_extension_wrapper")
  }
}
