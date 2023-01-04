// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
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
public open class EditorDebuggerPlugin internal constructor() : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORDEBUGGERPLUGIN, scriptIndex)
    return true
  }

  /**
   * Override this method to be notified whenever a new [godot.EditorDebuggerSession] is created (the session may be inactive during this stage).
   */
  public open fun _setupSession(sessionId: Long): Unit {
  }

  /**
   * Override this method to enable receiving messages from the debugger. If [capture] is "my_message" then messages starting with "my_message:" will be passes to the [_capture] method.
   */
  public open fun _hasCapture(capture: String): Boolean {
    throw NotImplementedError("_has_capture is not implemented for EditorDebuggerPlugin")
  }

  /**
   * Override this method to process incoming messages. The [sessionId] is the ID of the [godot.EditorDebuggerSession] that received the message (which you can retrieve via [getSession]).
   */
  public open fun _capture(
    message: String,
    `data`: VariantArray<Any?>,
    sessionId: Long
  ): Boolean {
    throw NotImplementedError("_capture is not implemented for EditorDebuggerPlugin")
  }

  /**
   * Returns the [godot.EditorDebuggerSession] with the given [id].
   */
  public fun getSession(id: Long): EditorDebuggerSession? {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORDEBUGGERPLUGIN_GET_SESSION,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as EditorDebuggerSession?
  }

  /**
   * Returns an array of [godot.EditorDebuggerSession] currently available to this debugger plugin.
   *
   * Note: Not sessions in the array may be inactive, check their state via [godot.EditorDebuggerSession.isActive]
   */
  public fun getSessions(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORDEBUGGERPLUGIN_GET_SESSIONS,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  public companion object
}
