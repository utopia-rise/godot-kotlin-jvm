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
import godot.core.PackedStringArray
import godot.core.RID
import godot.core.VariantArray
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
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
    createNativeObject(438, scriptIndex)
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
    throw NotImplementedError("_onRegisterMetadata is not implemented for OpenXRExtensionWrapperExtension")
  }

  /**
   * Called before the OpenXR instance is created.
   */
  public open fun _onBeforeInstanceCreated(): Unit {
    throw NotImplementedError("_onBeforeInstanceCreated is not implemented for OpenXRExtensionWrapperExtension")
  }

  /**
   * Called right after the OpenXR instance is created.
   */
  public open fun _onInstanceCreated(instance: Long): Unit {
    throw NotImplementedError("_onInstanceCreated is not implemented for OpenXRExtensionWrapperExtension")
  }

  /**
   * Called right before the OpenXR instance is destroyed.
   */
  public open fun _onInstanceDestroyed(): Unit {
    throw NotImplementedError("_onInstanceDestroyed is not implemented for OpenXRExtensionWrapperExtension")
  }

  /**
   * Called right after the OpenXR session is created.
   */
  public open fun _onSessionCreated(session: Long): Unit {
    throw NotImplementedError("_onSessionCreated is not implemented for OpenXRExtensionWrapperExtension")
  }

  /**
   * Called as part of the OpenXR process handling. This happens right before general and physics
   * processing steps of the main loop. During this step controller data is queried and made available
   * to game logic.
   */
  public open fun _onProcess(): Unit {
    throw NotImplementedError("_onProcess is not implemented for OpenXRExtensionWrapperExtension")
  }

  /**
   * Called right before the XR viewports begin their rendering step.
   */
  public open fun _onPreRender(): Unit {
    throw NotImplementedError("_onPreRender is not implemented for OpenXRExtensionWrapperExtension")
  }

  /**
   * Called right after the main swapchains are (re)created.
   */
  public open fun _onMainSwapchainsCreated(): Unit {
    throw NotImplementedError("_onMainSwapchainsCreated is not implemented for OpenXRExtensionWrapperExtension")
  }

  /**
   * Called right before the given viewport is rendered.
   */
  public open fun _onPreDrawViewport(viewport: RID): Unit {
    throw NotImplementedError("_onPreDrawViewport is not implemented for OpenXRExtensionWrapperExtension")
  }

  /**
   * Called right after the given viewport is rendered.
   * **Note:** The draw commands might only be queued at this point, not executed.
   */
  public open fun _onPostDrawViewport(viewport: RID): Unit {
    throw NotImplementedError("_onPostDrawViewport is not implemented for OpenXRExtensionWrapperExtension")
  }

  /**
   * Called right before the OpenXR session is destroyed.
   */
  public open fun _onSessionDestroyed(): Unit {
    throw NotImplementedError("_onSessionDestroyed is not implemented for OpenXRExtensionWrapperExtension")
  }

  /**
   * Called when the OpenXR session state is changed to idle.
   */
  public open fun _onStateIdle(): Unit {
    throw NotImplementedError("_onStateIdle is not implemented for OpenXRExtensionWrapperExtension")
  }

  /**
   * Called when the OpenXR session state is changed to ready. This means OpenXR is ready to set up
   * the session.
   */
  public open fun _onStateReady(): Unit {
    throw NotImplementedError("_onStateReady is not implemented for OpenXRExtensionWrapperExtension")
  }

  /**
   * Called when the OpenXR session state is changed to synchronized. OpenXR also returns to this
   * state when the application loses focus.
   */
  public open fun _onStateSynchronized(): Unit {
    throw NotImplementedError("_onStateSynchronized is not implemented for OpenXRExtensionWrapperExtension")
  }

  /**
   * Called when the OpenXR session state is changed to visible. This means OpenXR is now ready to
   * receive frames.
   */
  public open fun _onStateVisible(): Unit {
    throw NotImplementedError("_onStateVisible is not implemented for OpenXRExtensionWrapperExtension")
  }

  /**
   * Called when the OpenXR session state is changed to focused. This state is the active state when
   * the game runs.
   */
  public open fun _onStateFocused(): Unit {
    throw NotImplementedError("_onStateFocused is not implemented for OpenXRExtensionWrapperExtension")
  }

  /**
   * Called when the OpenXR session state is changed to stopping.
   */
  public open fun _onStateStopping(): Unit {
    throw NotImplementedError("_onStateStopping is not implemented for OpenXRExtensionWrapperExtension")
  }

  /**
   * Called when the OpenXR session state is changed to loss pending.
   */
  public open fun _onStateLossPending(): Unit {
    throw NotImplementedError("_onStateLossPending is not implemented for OpenXRExtensionWrapperExtension")
  }

  /**
   * Called when the OpenXR session state is changed to exiting.
   */
  public open fun _onStateExiting(): Unit {
    throw NotImplementedError("_onStateExiting is not implemented for OpenXRExtensionWrapperExtension")
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
  public final fun getOpenxrApi(): OpenXRAPIExtension? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOpenxrApiPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as OpenXRAPIExtension?)
  }

  /**
   * Registers the extension. This should happen at core module initialization level.
   */
  public final fun registerExtensionWrapper(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.registerExtensionWrapperPtr, NIL)
  }

  public companion object

  public object MethodBindings {
    internal val getOpenxrApiPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRExtensionWrapperExtension", "get_openxr_api", 1637791613)

    internal val registerExtensionWrapperPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRExtensionWrapperExtension", "register_extension_wrapper", 3218959716)
  }
}
