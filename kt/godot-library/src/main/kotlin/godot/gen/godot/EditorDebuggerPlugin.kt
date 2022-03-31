// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.StringName
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A base class to implement debugger plugins.
 *
 * [godot.EditorDebuggerPlugin] provides functions related to the editor side of the debugger.
 *
 * You don't need to instantiate this class; that is automatically handled by the debugger. [godot.Control] nodes can be added as child nodes to provide a GUI for the plugin.
 *
 * Do not free or reparent this node, otherwise it becomes unusable.
 *
 * To use [godot.EditorDebuggerPlugin], register it using the [godot.EditorPlugin.addDebuggerPlugin] method first.
 */
@GodotBaseType
public open abstract class EditorDebuggerPlugin : Control() {
  /**
   * Emitted when the game enters a break state.
   */
  public val breaked: Signal1<Boolean> by signal("canDebug")

  /**
   * Emitted when the debugging stops.
   */
  public val stopped: Signal0 by signal()

  /**
   * Emitted when the debugging starts.
   */
  public val started: Signal0 by signal()

  /**
   * Emitted when the game exists a break state.
   */
  public val continued: Signal0 by signal()

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_EDITORDEBUGGERPLUGIN)
  }

  /**
   * Sends a message with given `message` and `data` array.
   */
  public open fun sendMessage(message: String, `data`: VariantArray<Any?>): Unit {
    TransferContext.writeArguments(STRING to message, ARRAY to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORDEBUGGERPLUGIN_SEND_MESSAGE,
        NIL)
  }

  /**
   * Registers a message capture with given `name`. If `name` is "my_message" then messages starting with "my_message:" will be called with the given callable.
   *
   * Callable must accept a message string and a data array as argument. If the message and data are valid then callable must return `true` otherwise `false`.
   */
  public open fun registerMessageCapture(name: StringName, callable: Callable): Unit {
    TransferContext.writeArguments(STRING_NAME to name, CALLABLE to callable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORDEBUGGERPLUGIN_REGISTER_MESSAGE_CAPTURE, NIL)
  }

  /**
   * Unregisters the message capture with given name.
   */
  public open fun unregisterMessageCapture(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORDEBUGGERPLUGIN_UNREGISTER_MESSAGE_CAPTURE, NIL)
  }

  /**
   * Returns `true` if a message capture with given name is present otherwise `false`.
   */
  public open fun hasCapture(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORDEBUGGERPLUGIN_HAS_CAPTURE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the game is in break state otherwise `false`.
   */
  public open fun isBreaked(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORDEBUGGERPLUGIN_IS_BREAKED,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the game can be debugged otherwise `false`.
   */
  public open fun isDebuggable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORDEBUGGERPLUGIN_IS_DEBUGGABLE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if there is an instance of the game running with the attached debugger otherwise `false`.
   */
  public open fun isSessionActive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORDEBUGGERPLUGIN_IS_SESSION_ACTIVE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public companion object
}
