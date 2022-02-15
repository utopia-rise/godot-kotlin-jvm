// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Exposes the internal debugger.
 *
 * [godot.EngineDebugger] handles the communication between the editor and the running game. It is active in the running game. Messages can be sent/received through it. It also manages the profilers.
 */
@GodotBaseType
public object EngineDebugger : Object() {
  public override fun __new(): Unit {
    rawPtr = TransferContext.getSingleton(ENGINECLASS_ENGINEDEBUGGER)
  }

  public override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  /**
   * Returns `true` if the debugger is active otherwise `false`.
   */
  public open fun isActive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINEDEBUGGER_IS_ACTIVE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Registers a profiler with the given `name`.
   *
   * `toggle` callable is called when the profiler is enabled/disabled. It must take an argument array as an argument.
   *
   * `add` callable is called when data is added to profiler using [godot.EngineDebugger.profilerAddFrameData]. It must take a data array as argument.
   *
   * `tick` callable is called at every active profiler iteration. It must take frame time, idle time, physics time, and physics idle time as arguments.
   */
  public open fun registerProfiler(
    name: StringName,
    toggle: Callable,
    add: Callable,
    tick: Callable
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to toggle, OBJECT to add, OBJECT to
        tick)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINEDEBUGGER_REGISTER_PROFILER,
        NIL)
  }

  /**
   * Unregisters a profiler with given `name`.
   */
  public open fun unregisterProfiler(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINEDEBUGGER_UNREGISTER_PROFILER,
        NIL)
  }

  /**
   * Returns `true` if a profiler with the given name is present and active otherwise `false`.
   */
  public open fun isProfiling(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINEDEBUGGER_IS_PROFILING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if a profiler with the given name is present otherwise `false`.
   */
  public open fun hasProfiler(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINEDEBUGGER_HAS_PROFILER, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Calls the `add` callable of the profiler with given `name` and `data`.
   */
  public open fun profilerAddFrameData(name: StringName, `data`: VariantArray<Any?>): Unit {
    TransferContext.writeArguments(STRING_NAME to name, ARRAY to data)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ENGINEDEBUGGER_PROFILER_ADD_FRAME_DATA, NIL)
  }

  /**
   * Calls the `toggle` callable of the profiler with given `name` and `arguments`. Enables/Disables the same profiler depending on `enable` argument.
   */
  public open fun profilerEnable(
    name: StringName,
    enable: Boolean,
    arguments: VariantArray<Any?> = Array()
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, BOOL to enable, ARRAY to arguments)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINEDEBUGGER_PROFILER_ENABLE, NIL)
  }

  /**
   * Registers a message capture with given `name`. If `name` is "my_message" then messages starting with "my_message:" will be called with the given callable.
   *
   * Callable must accept a message string and a data array as argument. If the message and data are valid then callable must return `true` otherwise `false`.
   */
  public open fun registerMessageCapture(name: StringName, callable: Callable): Unit {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to callable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ENGINEDEBUGGER_REGISTER_MESSAGE_CAPTURE, NIL)
  }

  /**
   * Unregisters the message capture with given `name`.
   */
  public open fun unregisterMessageCapture(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ENGINEDEBUGGER_UNREGISTER_MESSAGE_CAPTURE, NIL)
  }

  /**
   * Returns `true` if a capture with the given name is present otherwise `false`.
   */
  public open fun hasCapture(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINEDEBUGGER_HAS_CAPTURE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sends a message with given `message` and `data` array.
   */
  public open fun sendMessage(message: String, `data`: VariantArray<Any?>): Unit {
    TransferContext.writeArguments(STRING to message, ARRAY to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINEDEBUGGER_SEND_MESSAGE, NIL)
  }
}
