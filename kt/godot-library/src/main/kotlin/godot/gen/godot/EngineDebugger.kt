// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * [EngineDebugger] handles the communication between the editor and the running game. It is active
 * in the running game. Messages can be sent/received through it. It also manages the profilers.
 */
@GodotBaseType
public object EngineDebugger : Object() {
  public override fun new(scriptIndex: Int): Unit {
    getSingleton(ENGINECLASS_ENGINEDEBUGGER)
  }

  /**
   * Returns `true` if the debugger is active otherwise `false`.
   */
  public fun isActive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isActivePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Registers a profiler with the given [name]. See [EngineProfiler] for more information.
   */
  public fun registerProfiler(name: StringName, profiler: EngineProfiler): Unit {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to profiler)
    TransferContext.callMethod(rawPtr, MethodBindings.registerProfilerPtr, NIL)
  }

  /**
   * Unregisters a profiler with given [name].
   */
  public fun unregisterProfiler(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.unregisterProfilerPtr, NIL)
  }

  /**
   * Returns `true` if a profiler with the given name is present and active otherwise `false`.
   */
  public fun isProfiling(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.isProfilingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if a profiler with the given name is present otherwise `false`.
   */
  public fun hasProfiler(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasProfilerPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Calls the `add` callable of the profiler with given [name] and [data].
   */
  public fun profilerAddFrameData(name: StringName, `data`: VariantArray<Any?>): Unit {
    TransferContext.writeArguments(STRING_NAME to name, ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.profilerAddFrameDataPtr, NIL)
  }

  /**
   * Calls the `toggle` callable of the profiler with given [name] and [arguments]. Enables/Disables
   * the same profiler depending on [enable] argument.
   */
  @JvmOverloads
  public fun profilerEnable(
    name: StringName,
    enable: Boolean,
    arguments: VariantArray<Any?> = godot.core.variantArrayOf(),
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, BOOL to enable, ARRAY to arguments)
    TransferContext.callMethod(rawPtr, MethodBindings.profilerEnablePtr, NIL)
  }

  /**
   * Registers a message capture with given [name]. If [name] is "my_message" then messages starting
   * with "my_message:" will be called with the given callable.
   * Callable must accept a message string and a data array as argument. If the message and data are
   * valid then callable must return `true` otherwise `false`.
   */
  public fun registerMessageCapture(name: StringName, callable: Callable): Unit {
    TransferContext.writeArguments(STRING_NAME to name, CALLABLE to callable)
    TransferContext.callMethod(rawPtr, MethodBindings.registerMessageCapturePtr, NIL)
  }

  /**
   * Unregisters the message capture with given [name].
   */
  public fun unregisterMessageCapture(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.unregisterMessageCapturePtr, NIL)
  }

  /**
   * Returns `true` if a capture with the given name is present otherwise `false`.
   */
  public fun hasCapture(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, MethodBindings.hasCapturePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Forces a processing loop of debugger events. The purpose of this method is just processing
   * events every now and then when the script might get too busy, so that bugs like infinite loops can
   * be caught
   */
  public fun linePoll(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.linePollPtr, NIL)
  }

  /**
   * Sends a message with given [message] and [data] array.
   */
  public fun sendMessage(message: String, `data`: VariantArray<Any?>): Unit {
    TransferContext.writeArguments(STRING to message, ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.sendMessagePtr, NIL)
  }

  /**
   * Starts a debug break in script execution, optionally specifying whether the program can
   * continue based on [canContinue] and whether the break was due to a breakpoint.
   */
  @JvmOverloads
  public fun debug(canContinue: Boolean = true, isErrorBreakpoint: Boolean = false): Unit {
    TransferContext.writeArguments(BOOL to canContinue, BOOL to isErrorBreakpoint)
    TransferContext.callMethod(rawPtr, MethodBindings.debugPtr, NIL)
  }

  /**
   * Starts a debug break in script execution, optionally specifying whether the program can
   * continue based on [canContinue] and whether the break was due to a breakpoint.
   */
  @JvmOverloads
  public fun scriptDebug(
    language: ScriptLanguage,
    canContinue: Boolean = true,
    isErrorBreakpoint: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(OBJECT to language, BOOL to canContinue, BOOL to isErrorBreakpoint)
    TransferContext.callMethod(rawPtr, MethodBindings.scriptDebugPtr, NIL)
  }

  /**
   * Sets the current debugging lines that remain.
   */
  public fun setLinesLeft(lines: Int): Unit {
    TransferContext.writeArguments(LONG to lines.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setLinesLeftPtr, NIL)
  }

  /**
   * Returns the number of lines that remain.
   */
  public fun getLinesLeft(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLinesLeftPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets the current debugging depth.
   */
  public fun setDepth(depth: Int): Unit {
    TransferContext.writeArguments(LONG to depth.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setDepthPtr, NIL)
  }

  /**
   * Returns the current debug depth.
   */
  public fun getDepth(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDepthPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns `true` if the given [source] and [line] represent an existing breakpoint.
   */
  public fun isBreakpoint(line: Int, source: StringName): Boolean {
    TransferContext.writeArguments(LONG to line.toLong(), STRING_NAME to source)
    TransferContext.callMethod(rawPtr, MethodBindings.isBreakpointPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the debugger is skipping breakpoints otherwise `false`.
   */
  public fun isSkippingBreakpoints(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isSkippingBreakpointsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Inserts a new breakpoint with the given [source] and [line].
   */
  public fun insertBreakpoint(line: Int, source: StringName): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), STRING_NAME to source)
    TransferContext.callMethod(rawPtr, MethodBindings.insertBreakpointPtr, NIL)
  }

  /**
   * Removes a breakpoint with the given [source] and [line].
   */
  public fun removeBreakpoint(line: Int, source: StringName): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), STRING_NAME to source)
    TransferContext.callMethod(rawPtr, MethodBindings.removeBreakpointPtr, NIL)
  }

  /**
   * Clears all breakpoints.
   */
  public fun clearBreakpoints(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearBreakpointsPtr, NIL)
  }

  internal object MethodBindings {
    public val isActivePtr: VoidPtr = TypeManager.getMethodBindPtr("EngineDebugger", "is_active")

    public val registerProfilerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "register_profiler")

    public val unregisterProfilerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "unregister_profiler")

    public val isProfilingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "is_profiling")

    public val hasProfilerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "has_profiler")

    public val profilerAddFrameDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "profiler_add_frame_data")

    public val profilerEnablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "profiler_enable")

    public val registerMessageCapturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "register_message_capture")

    public val unregisterMessageCapturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "unregister_message_capture")

    public val hasCapturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "has_capture")

    public val linePollPtr: VoidPtr = TypeManager.getMethodBindPtr("EngineDebugger", "line_poll")

    public val sendMessagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "send_message")

    public val debugPtr: VoidPtr = TypeManager.getMethodBindPtr("EngineDebugger", "debug")

    public val scriptDebugPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "script_debug")

    public val setLinesLeftPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "set_lines_left")

    public val getLinesLeftPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "get_lines_left")

    public val setDepthPtr: VoidPtr = TypeManager.getMethodBindPtr("EngineDebugger", "set_depth")

    public val getDepthPtr: VoidPtr = TypeManager.getMethodBindPtr("EngineDebugger", "get_depth")

    public val isBreakpointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "is_breakpoint")

    public val isSkippingBreakpointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "is_skipping_breakpoints")

    public val insertBreakpointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "insert_breakpoint")

    public val removeBreakpointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "remove_breakpoint")

    public val clearBreakpointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "clear_breakpoints")
  }
}
