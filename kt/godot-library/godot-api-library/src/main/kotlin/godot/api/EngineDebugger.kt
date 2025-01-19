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
import godot.core.Callable
import godot.core.StringName
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.CALLABLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * [EngineDebugger] handles the communication between the editor and the running game. It is active
 * in the running game. Messages can be sent/received through it. It also manages the profilers.
 */
@GodotBaseType
public object EngineDebugger : Object() {
  public override fun new(scriptIndex: Int): Unit {
    getSingleton(18)
  }

  /**
   * Returns `true` if the debugger is active otherwise `false`.
   */
  @JvmStatic
  public final fun isActive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isActivePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Registers a profiler with the given [name]. See [EngineProfiler] for more information.
   */
  @JvmStatic
  public final fun registerProfiler(name: StringName, profiler: EngineProfiler?): Unit {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to profiler)
    TransferContext.callMethod(ptr, MethodBindings.registerProfilerPtr, NIL)
  }

  /**
   * Unregisters a profiler with given [name].
   */
  @JvmStatic
  public final fun unregisterProfiler(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.unregisterProfilerPtr, NIL)
  }

  /**
   * Returns `true` if a profiler with the given name is present and active otherwise `false`.
   */
  @JvmStatic
  public final fun isProfiling(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.isProfilingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if a profiler with the given name is present otherwise `false`.
   */
  @JvmStatic
  public final fun hasProfiler(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.hasProfilerPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Calls the `add` callable of the profiler with given [name] and [data].
   */
  @JvmStatic
  public final fun profilerAddFrameData(name: StringName, `data`: VariantArray<Any?>): Unit {
    TransferContext.writeArguments(STRING_NAME to name, ARRAY to data)
    TransferContext.callMethod(ptr, MethodBindings.profilerAddFrameDataPtr, NIL)
  }

  /**
   * Calls the `toggle` callable of the profiler with given [name] and [arguments]. Enables/Disables
   * the same profiler depending on [enable] argument.
   */
  @JvmOverloads
  @JvmStatic
  public final fun profilerEnable(
    name: StringName,
    enable: Boolean,
    arguments: VariantArray<Any?> = godot.core.variantArrayOf(),
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, BOOL to enable, ARRAY to arguments)
    TransferContext.callMethod(ptr, MethodBindings.profilerEnablePtr, NIL)
  }

  /**
   * Registers a message capture with given [name]. If [name] is "my_message" then messages starting
   * with "my_message:" will be called with the given callable.
   * Callable must accept a message string and a data array as argument. If the message and data are
   * valid then callable must return `true` otherwise `false`.
   */
  @JvmStatic
  public final fun registerMessageCapture(name: StringName, callable: Callable): Unit {
    TransferContext.writeArguments(STRING_NAME to name, CALLABLE to callable)
    TransferContext.callMethod(ptr, MethodBindings.registerMessageCapturePtr, NIL)
  }

  /**
   * Unregisters the message capture with given [name].
   */
  @JvmStatic
  public final fun unregisterMessageCapture(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.unregisterMessageCapturePtr, NIL)
  }

  /**
   * Returns `true` if a capture with the given name is present otherwise `false`.
   */
  @JvmStatic
  public final fun hasCapture(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.hasCapturePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Forces a processing loop of debugger events. The purpose of this method is just processing
   * events every now and then when the script might get too busy, so that bugs like infinite loops can
   * be caught
   */
  @JvmStatic
  public final fun linePoll(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.linePollPtr, NIL)
  }

  /**
   * Sends a message with given [message] and [data] array.
   */
  @JvmStatic
  public final fun sendMessage(message: String, `data`: VariantArray<Any?>): Unit {
    TransferContext.writeArguments(STRING to message, ARRAY to data)
    TransferContext.callMethod(ptr, MethodBindings.sendMessagePtr, NIL)
  }

  /**
   * Starts a debug break in script execution, optionally specifying whether the program can
   * continue based on [canContinue] and whether the break was due to a breakpoint.
   */
  @JvmOverloads
  @JvmStatic
  public final fun debug(canContinue: Boolean = true, isErrorBreakpoint: Boolean = false): Unit {
    TransferContext.writeArguments(BOOL to canContinue, BOOL to isErrorBreakpoint)
    TransferContext.callMethod(ptr, MethodBindings.debugPtr, NIL)
  }

  /**
   * Starts a debug break in script execution, optionally specifying whether the program can
   * continue based on [canContinue] and whether the break was due to a breakpoint.
   */
  @JvmOverloads
  @JvmStatic
  public final fun scriptDebug(
    language: ScriptLanguage?,
    canContinue: Boolean = true,
    isErrorBreakpoint: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(OBJECT to language, BOOL to canContinue, BOOL to isErrorBreakpoint)
    TransferContext.callMethod(ptr, MethodBindings.scriptDebugPtr, NIL)
  }

  /**
   * Sets the current debugging lines that remain.
   */
  @JvmStatic
  public final fun setLinesLeft(lines: Int): Unit {
    TransferContext.writeArguments(LONG to lines.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setLinesLeftPtr, NIL)
  }

  /**
   * Returns the number of lines that remain.
   */
  @JvmStatic
  public final fun getLinesLeft(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLinesLeftPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the current debugging depth.
   */
  @JvmStatic
  public final fun setDepth(depth: Int): Unit {
    TransferContext.writeArguments(LONG to depth.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setDepthPtr, NIL)
  }

  /**
   * Returns the current debug depth.
   */
  @JvmStatic
  public final fun getDepth(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDepthPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns `true` if the given [source] and [line] represent an existing breakpoint.
   */
  @JvmStatic
  public final fun isBreakpoint(line: Int, source: StringName): Boolean {
    TransferContext.writeArguments(LONG to line.toLong(), STRING_NAME to source)
    TransferContext.callMethod(ptr, MethodBindings.isBreakpointPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the debugger is skipping breakpoints otherwise `false`.
   */
  @JvmStatic
  public final fun isSkippingBreakpoints(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isSkippingBreakpointsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Inserts a new breakpoint with the given [source] and [line].
   */
  @JvmStatic
  public final fun insertBreakpoint(line: Int, source: StringName): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), STRING_NAME to source)
    TransferContext.callMethod(ptr, MethodBindings.insertBreakpointPtr, NIL)
  }

  /**
   * Removes a breakpoint with the given [source] and [line].
   */
  @JvmStatic
  public final fun removeBreakpoint(line: Int, source: StringName): Unit {
    TransferContext.writeArguments(LONG to line.toLong(), STRING_NAME to source)
    TransferContext.callMethod(ptr, MethodBindings.removeBreakpointPtr, NIL)
  }

  /**
   * Clears all breakpoints.
   */
  @JvmStatic
  public final fun clearBreakpoints(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearBreakpointsPtr, NIL)
  }

  public object MethodBindings {
    internal val isActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "is_active", 2240911060)

    internal val registerProfilerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "register_profiler", 3651669560)

    internal val unregisterProfilerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "unregister_profiler", 3304788590)

    internal val isProfilingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "is_profiling", 2041966384)

    internal val hasProfilerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "has_profiler", 2041966384)

    internal val profilerAddFrameDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "profiler_add_frame_data", 1895267858)

    internal val profilerEnablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "profiler_enable", 3192561009)

    internal val registerMessageCapturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "register_message_capture", 1874754934)

    internal val unregisterMessageCapturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "unregister_message_capture", 3304788590)

    internal val hasCapturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "has_capture", 2041966384)

    internal val linePollPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "line_poll", 3218959716)

    internal val sendMessagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "send_message", 1209351045)

    internal val debugPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "debug", 2751962654)

    internal val scriptDebugPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "script_debug", 2442343672)

    internal val setLinesLeftPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "set_lines_left", 1286410249)

    internal val getLinesLeftPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "get_lines_left", 3905245786)

    internal val setDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "set_depth", 1286410249)

    internal val getDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "get_depth", 3905245786)

    internal val isBreakpointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "is_breakpoint", 921227809)

    internal val isSkippingBreakpointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "is_skipping_breakpoints", 36873697)

    internal val insertBreakpointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "insert_breakpoint", 3780747571)

    internal val removeBreakpointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "remove_breakpoint", 3780747571)

    internal val clearBreakpointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "clear_breakpoints", 3218959716)
  }
}
