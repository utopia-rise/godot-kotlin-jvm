// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class OpenXRExtensionWrapperExtension : Object() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_OPENXREXTENSIONWRAPPEREXTENSION, scriptIndex)
    return true
  }

  public open fun _getRequestedExtensions(): Dictionary<Any?, Any?> {
    throw NotImplementedError("_get_requested_extensions is not implemented for OpenXRExtensionWrapperExtension")
  }

  public open fun _onRegisterMetadata(): Unit {
  }

  public open fun _onBeforeInstanceCreated(): Unit {
  }

  public open fun _onInstanceCreated(instance: Long): Unit {
  }

  public open fun _onInstanceDestroyed(): Unit {
  }

  public open fun _onSessionCreated(session: Long): Unit {
  }

  public open fun _onProcess(): Unit {
  }

  public open fun _onPreRender(): Unit {
  }

  public open fun _onSessionDestroyed(): Unit {
  }

  public open fun _onStateIdle(): Unit {
  }

  public open fun _onStateReady(): Unit {
  }

  public open fun _onStateSynchronized(): Unit {
  }

  public open fun _onStateVisible(): Unit {
  }

  public open fun _onStateFocused(): Unit {
  }

  public open fun _onStateStopping(): Unit {
  }

  public open fun _onStateLossPending(): Unit {
  }

  public open fun _onStateExiting(): Unit {
  }

  public fun getOpenxrApi(): OpenXRAPIExtension? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOpenxrApiPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as OpenXRAPIExtension?)
  }

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

    public val getOpenxrApiPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRExtensionWrapperExtension", "get_openxr_api")

    public val registerExtensionWrapperPtr: VoidPtr =
        TypeManager.getMethodBindPtr("OpenXRExtensionWrapperExtension", "register_extension_wrapper")
  }
}
