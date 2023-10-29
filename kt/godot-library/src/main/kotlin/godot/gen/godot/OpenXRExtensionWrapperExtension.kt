// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
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
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_OPENXREXTENSIONWRAPPEREXTENSION_GET_OPENXR_API, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as OpenXRAPIExtension?)
  }

  public fun registerExtensionWrapper(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_OPENXREXTENSIONWRAPPEREXTENSION_REGISTER_EXTENSION_WRAPPER, NIL)
  }

  public companion object
}
