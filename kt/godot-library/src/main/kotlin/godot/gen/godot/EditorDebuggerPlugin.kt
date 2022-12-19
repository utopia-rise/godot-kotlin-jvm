// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.StringName
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A base class to implement debugger plugins.
 *
 * [godot.EditorDebuggerPlugin] provides functions related to the editor side of the debugger.
 *
 * To interact with the debugger, an instance of this class must be added to the editor via [godot.EditorPlugin.addDebuggerPlugin].
 *
 * Once added, the [_setupSession] callback will be called for every [godot.EditorDebuggerSession] available to the plugin, and when new ones are created (the sessions may be inactive during this stage).
 *
 * You can retrieve the available [godot.EditorDebuggerSession]s via [getSessions] or get a specific one via [getSession].
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * @tool
 *
 * extends EditorPlugin
 *
 *
 *
 * class ExampleEditorDebugger extends EditorDebuggerPlugin:
 *
 *
 *
 *     func _has_capture(prefix):
 *
 *         # Return true if you wish to handle message with this prefix.
 *
 *         return prefix == "my_plugin"
 *
 *
 *
 *     func _capture(message, data, session_id):
 *
 *         if message == "my_plugin:ping":
 *
 *             get_session(session_id).send_message("my_plugin:echo", data)
 *
 *
 *
 *     func _setup_session(session_id):
 *
 *         # Add a new tab in the debugger session UI containing a label.
 *
 *         var label = Label.new()
 *
 *         label.name = "Example plugin"
 *
 *         label.text = "Example plugin"
 *
 *         var session = get_session(session_id)
 *
 *         # Listens to the session started and stopped signals.
 *
 *         session.started.connect(func (): print("Session started"))
 *
 *         session.stopped.connect(func (): print("Session stopped"))
 *
 *         session.add_session_tab(label)
 *
 *
 *
 * var debugger = ExampleEditorDebugger.new()
 *
 *
 *
 * func _enter_tree():
 *
 *     add_debugger_plugin(debugger)
 *
 *
 *
 * func _exit_tree():
 *
 *     remove_debugger_plugin(debugger)
 *
 * [/gdscript]
 *
 * [/codeblocks]
 */
@GodotBaseType
public open class EditorDebuggerPlugin internal constructor() : Control() {
  public val breaked: Signal1<Boolean> by signal("canDebug")

  public val stopped: Signal0 by signal()

  public val started: Signal0 by signal()

  public val continued: Signal0 by signal()

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORDEBUGGERPLUGIN, scriptIndex)
    return true
  }

  public fun sendMessage(message: String, `data`: VariantArray<Any?>): Unit {
    TransferContext.writeArguments(STRING to message, ARRAY to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORDEBUGGERPLUGIN_SEND_MESSAGE,
        NIL)
  }

  public fun registerMessageCapture(name: StringName, callable: Callable): Unit {
    TransferContext.writeArguments(STRING_NAME to name, CALLABLE to callable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORDEBUGGERPLUGIN_REGISTER_MESSAGE_CAPTURE, NIL)
  }

  public fun unregisterMessageCapture(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORDEBUGGERPLUGIN_UNREGISTER_MESSAGE_CAPTURE, NIL)
  }

  public fun hasCapture(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORDEBUGGERPLUGIN_HAS_CAPTURE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public fun isBreaked(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORDEBUGGERPLUGIN_IS_BREAKED,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public fun isDebuggable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORDEBUGGERPLUGIN_IS_DEBUGGABLE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public fun isSessionActive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_EDITORDEBUGGERPLUGIN_IS_SESSION_ACTIVE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public companion object
}
