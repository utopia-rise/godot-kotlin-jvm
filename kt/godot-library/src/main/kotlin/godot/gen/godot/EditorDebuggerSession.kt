// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * A class to interact with the editor debugger.
 *
 * This class cannot be directly instantiated and must be retrieved via a [godot.EditorDebuggerPlugin].
 *
 * You can add tabs to the session UI via [addSessionTab], send messages via [sendMessage], and toggle [godot.EngineProfiler]s via [toggleProfiler].
 */
@GodotBaseType
public open class EditorDebuggerSession internal constructor() : RefCounted() {
  /**
   * Emitted when a remote instance is attached to this session (i.e. the session becomes active).
   */
  public val started: Signal0 by signal()

  /**
   * Emitted when a remote instance is detached from this session (i.e. the session becomes inactive).
   */
  public val stopped: Signal0 by signal()

  /**
   * Emitted when the attached remote instance enters a break state. If [canDebug] is `true`, the remote instance will enter the debug loop.
   */
  public val breaked: Signal1<Boolean> by signal("canDebug")

  /**
   * Emitted when the attached remote instance exits a break state.
   */
  public val continued: Signal0 by signal()

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EDITORDEBUGGERSESSION, scriptIndex)
    return true
  }

  /**
   * Sends the given [message] to the attached remote instance, optionally passing additionally [data]. See [godot.EngineDebugger] for how to retrieve those messages.
   */
  @JvmOverloads
  public fun sendMessage(message: String, `data`: VariantArray<Any?> = godot.core.variantArrayOf()):
      Unit {
    TransferContext.writeArguments(STRING to message, ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.sendMessagePtr, NIL)
  }

  /**
   * Toggle the given [profiler] on the attached remote instance, optionally passing additionally [data]. See [godot.EngineProfiler] for more details.
   */
  @JvmOverloads
  public fun toggleProfiler(
    profiler: String,
    enable: Boolean,
    `data`: VariantArray<Any?> = godot.core.variantArrayOf(),
  ): Unit {
    TransferContext.writeArguments(STRING to profiler, BOOL to enable, ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.toggleProfilerPtr, NIL)
  }

  /**
   * Returns `true` if the attached remote instance is currently in the debug loop.
   */
  public fun isBreaked(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isBreakedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the attached remote instance can be debugged.
   */
  public fun isDebuggable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isDebuggablePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the debug session is currently attached to a remote instance.
   */
  public fun isActive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isActivePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Adds the given [control] to the debug session UI in the debugger bottom panel.
   */
  public fun addSessionTab(control: Control): Unit {
    TransferContext.writeArguments(OBJECT to control)
    TransferContext.callMethod(rawPtr, MethodBindings.addSessionTabPtr, NIL)
  }

  /**
   * Removes the given [control] from the debug session UI in the debugger bottom panel.
   */
  public fun removeSessionTab(control: Control): Unit {
    TransferContext.writeArguments(OBJECT to control)
    TransferContext.callMethod(rawPtr, MethodBindings.removeSessionTabPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val sendMessagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorDebuggerSession", "send_message")

    public val toggleProfilerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorDebuggerSession", "toggle_profiler")

    public val isBreakedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorDebuggerSession", "is_breaked")

    public val isDebuggablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorDebuggerSession", "is_debuggable")

    public val isActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorDebuggerSession", "is_active")

    public val addSessionTabPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorDebuggerSession", "add_session_tab")

    public val removeSessionTabPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EditorDebuggerSession", "remove_session_tab")
  }
}
