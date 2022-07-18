// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

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
  public fun isActive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINEDEBUGGER_IS_ACTIVE, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Registers a profiler with the given `name`. See [godot.EngineProfiler] for more information.
   */
  public fun registerProfiler(name: StringName, profiler: EngineProfiler): Unit {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to profiler)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINEDEBUGGER_REGISTER_PROFILER,
        NIL.ordinal)
  }

  /**
   * Unregisters a profiler with given `name`.
   */
  public fun unregisterProfiler(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINEDEBUGGER_UNREGISTER_PROFILER,
        NIL.ordinal)
  }

  /**
   * Returns `true` if a profiler with the given name is present and active otherwise `false`.
   */
  public fun isProfiling(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINEDEBUGGER_IS_PROFILING,
        BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if a profiler with the given name is present otherwise `false`.
   */
  public fun hasProfiler(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINEDEBUGGER_HAS_PROFILER,
        BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Calls the `add` callable of the profiler with given `name` and `data`.
   */
  public fun profilerAddFrameData(name: StringName, `data`: VariantArray<Any?>): Unit {
    TransferContext.writeArguments(STRING_NAME to name, ARRAY to data)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINEDEBUGGER_PROFILER_ADD_FRAME_DATA,
        NIL.ordinal)
  }

  /**
   * Calls the `toggle` callable of the profiler with given `name` and `arguments`. Enables/Disables the same profiler depending on `enable` argument.
   */
  public fun profilerEnable(
    name: StringName,
    enable: Boolean,
    arguments: VariantArray<Any?> = godot.core.variantArrayOf()
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, BOOL to enable, ARRAY to arguments)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINEDEBUGGER_PROFILER_ENABLE,
        NIL.ordinal)
  }

  /**
   * Registers a message capture with given `name`. If `name` is "my_message" then messages starting with "my_message:" will be called with the given callable.
   *
   * Callable must accept a message string and a data array as argument. If the message and data are valid then callable must return `true` otherwise `false`.
   */
  public fun registerMessageCapture(name: StringName, callable: Callable): Unit {
    TransferContext.writeArguments(STRING_NAME to name, CALLABLE to callable)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINEDEBUGGER_REGISTER_MESSAGE_CAPTURE,
        NIL.ordinal)
  }

  /**
   * Unregisters the message capture with given `name`.
   */
  public fun unregisterMessageCapture(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ENGINEDEBUGGER_UNREGISTER_MESSAGE_CAPTURE, NIL.ordinal)
  }

  /**
   * Returns `true` if a capture with the given name is present otherwise `false`.
   */
  public fun hasCapture(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINEDEBUGGER_HAS_CAPTURE, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sends a message with given `message` and `data` array.
   */
  public fun sendMessage(message: String, `data`: VariantArray<Any?>): Unit {
    TransferContext.writeArguments(STRING to message, ARRAY to data)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_ENGINEDEBUGGER_SEND_MESSAGE, NIL.ordinal)
  }
}
