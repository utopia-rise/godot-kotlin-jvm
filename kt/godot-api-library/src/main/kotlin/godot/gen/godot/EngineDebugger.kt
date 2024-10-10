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
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.CALLABLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

private const val ENGINE_CLASS_ENGINEDEBUGGER_INDEX: Int = 20

/**
 * [EngineDebugger] handles the communication between the editor and the running game. It is active
 * in the running game. Messages can be sent/received through it. It also manages the profilers.
 */
@GodotBaseType
public object EngineDebugger : Object() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.getSingleton(this, ENGINE_CLASS_ENGINEDEBUGGER_INDEX)
  }

  /**
   * Returns `true` if the debugger is active otherwise `false`.
   */
  @JvmStatic
  public final fun isActive(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isActivePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Registers a profiler with the given [name]. See [EngineProfiler] for more information.
   */
  @JvmStatic
  public final fun registerProfiler(name: StringName, profiler: EngineProfiler?): Unit {
    Internals.writeArguments(STRING_NAME to name, OBJECT to profiler)
    Internals.callMethod(rawPtr, MethodBindings.registerProfilerPtr, NIL)
  }

  /**
   * Unregisters a profiler with given [name].
   */
  @JvmStatic
  public final fun unregisterProfiler(name: StringName): Unit {
    Internals.writeArguments(STRING_NAME to name)
    Internals.callMethod(rawPtr, MethodBindings.unregisterProfilerPtr, NIL)
  }

  /**
   * Returns `true` if a profiler with the given name is present and active otherwise `false`.
   */
  @JvmStatic
  public final fun isProfiling(name: StringName): Boolean {
    Internals.writeArguments(STRING_NAME to name)
    Internals.callMethod(rawPtr, MethodBindings.isProfilingPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if a profiler with the given name is present otherwise `false`.
   */
  @JvmStatic
  public final fun hasProfiler(name: StringName): Boolean {
    Internals.writeArguments(STRING_NAME to name)
    Internals.callMethod(rawPtr, MethodBindings.hasProfilerPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Calls the `add` callable of the profiler with given [name] and [data].
   */
  @JvmStatic
  public final fun profilerAddFrameData(name: StringName, `data`: VariantArray<Any?>): Unit {
    Internals.writeArguments(STRING_NAME to name, ARRAY to data)
    Internals.callMethod(rawPtr, MethodBindings.profilerAddFrameDataPtr, NIL)
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
    Internals.writeArguments(STRING_NAME to name, BOOL to enable, ARRAY to arguments)
    Internals.callMethod(rawPtr, MethodBindings.profilerEnablePtr, NIL)
  }

  /**
   * Registers a message capture with given [name]. If [name] is "my_message" then messages starting
   * with "my_message:" will be called with the given callable.
   * Callable must accept a message string and a data array as argument. If the message and data are
   * valid then callable must return `true` otherwise `false`.
   */
  @JvmStatic
  public final fun registerMessageCapture(name: StringName, callable: Callable): Unit {
    Internals.writeArguments(STRING_NAME to name, CALLABLE to callable)
    Internals.callMethod(rawPtr, MethodBindings.registerMessageCapturePtr, NIL)
  }

  /**
   * Unregisters the message capture with given [name].
   */
  @JvmStatic
  public final fun unregisterMessageCapture(name: StringName): Unit {
    Internals.writeArguments(STRING_NAME to name)
    Internals.callMethod(rawPtr, MethodBindings.unregisterMessageCapturePtr, NIL)
  }

  /**
   * Returns `true` if a capture with the given name is present otherwise `false`.
   */
  @JvmStatic
  public final fun hasCapture(name: StringName): Boolean {
    Internals.writeArguments(STRING_NAME to name)
    Internals.callMethod(rawPtr, MethodBindings.hasCapturePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Forces a processing loop of debugger events. The purpose of this method is just processing
   * events every now and then when the script might get too busy, so that bugs like infinite loops can
   * be caught
   */
  @JvmStatic
  public final fun linePoll(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.linePollPtr, NIL)
  }

  /**
   * Sends a message with given [message] and [data] array.
   */
  @JvmStatic
  public final fun sendMessage(message: String, `data`: VariantArray<Any?>): Unit {
    Internals.writeArguments(STRING to message, ARRAY to data)
    Internals.callMethod(rawPtr, MethodBindings.sendMessagePtr, NIL)
  }

  /**
   * Starts a debug break in script execution, optionally specifying whether the program can
   * continue based on [canContinue] and whether the break was due to a breakpoint.
   */
  @JvmOverloads
  @JvmStatic
  public final fun debug(canContinue: Boolean = true, isErrorBreakpoint: Boolean = false): Unit {
    Internals.writeArguments(BOOL to canContinue, BOOL to isErrorBreakpoint)
    Internals.callMethod(rawPtr, MethodBindings.debugPtr, NIL)
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
    Internals.writeArguments(OBJECT to language, BOOL to canContinue, BOOL to isErrorBreakpoint)
    Internals.callMethod(rawPtr, MethodBindings.scriptDebugPtr, NIL)
  }

  /**
   * Sets the current debugging lines that remain.
   */
  @JvmStatic
  public final fun setLinesLeft(lines: Int): Unit {
    Internals.writeArguments(LONG to lines.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setLinesLeftPtr, NIL)
  }

  /**
   * Returns the number of lines that remain.
   */
  @JvmStatic
  public final fun getLinesLeft(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLinesLeftPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Sets the current debugging depth.
   */
  @JvmStatic
  public final fun setDepth(depth: Int): Unit {
    Internals.writeArguments(LONG to depth.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setDepthPtr, NIL)
  }

  /**
   * Returns the current debug depth.
   */
  @JvmStatic
  public final fun getDepth(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDepthPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns `true` if the given [source] and [line] represent an existing breakpoint.
   */
  @JvmStatic
  public final fun isBreakpoint(line: Int, source: StringName): Boolean {
    Internals.writeArguments(LONG to line.toLong(), STRING_NAME to source)
    Internals.callMethod(rawPtr, MethodBindings.isBreakpointPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the debugger is skipping breakpoints otherwise `false`.
   */
  @JvmStatic
  public final fun isSkippingBreakpoints(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isSkippingBreakpointsPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Inserts a new breakpoint with the given [source] and [line].
   */
  @JvmStatic
  public final fun insertBreakpoint(line: Int, source: StringName): Unit {
    Internals.writeArguments(LONG to line.toLong(), STRING_NAME to source)
    Internals.callMethod(rawPtr, MethodBindings.insertBreakpointPtr, NIL)
  }

  /**
   * Removes a breakpoint with the given [source] and [line].
   */
  @JvmStatic
  public final fun removeBreakpoint(line: Int, source: StringName): Unit {
    Internals.writeArguments(LONG to line.toLong(), STRING_NAME to source)
    Internals.callMethod(rawPtr, MethodBindings.removeBreakpointPtr, NIL)
  }

  /**
   * Clears all breakpoints.
   */
  @JvmStatic
  public final fun clearBreakpoints(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.clearBreakpointsPtr, NIL)
  }

  internal object MethodBindings {
    public val isActivePtr: VoidPtr =
        Internals.getMethodBindPtr("EngineDebugger", "is_active", 2240911060)

    public val registerProfilerPtr: VoidPtr =
        Internals.getMethodBindPtr("EngineDebugger", "register_profiler", 3651669560)

    public val unregisterProfilerPtr: VoidPtr =
        Internals.getMethodBindPtr("EngineDebugger", "unregister_profiler", 3304788590)

    public val isProfilingPtr: VoidPtr =
        Internals.getMethodBindPtr("EngineDebugger", "is_profiling", 2041966384)

    public val hasProfilerPtr: VoidPtr =
        Internals.getMethodBindPtr("EngineDebugger", "has_profiler", 2041966384)

    public val profilerAddFrameDataPtr: VoidPtr =
        Internals.getMethodBindPtr("EngineDebugger", "profiler_add_frame_data", 1895267858)

    public val profilerEnablePtr: VoidPtr =
        Internals.getMethodBindPtr("EngineDebugger", "profiler_enable", 3192561009)

    public val registerMessageCapturePtr: VoidPtr =
        Internals.getMethodBindPtr("EngineDebugger", "register_message_capture", 1874754934)

    public val unregisterMessageCapturePtr: VoidPtr =
        Internals.getMethodBindPtr("EngineDebugger", "unregister_message_capture", 3304788590)

    public val hasCapturePtr: VoidPtr =
        Internals.getMethodBindPtr("EngineDebugger", "has_capture", 2041966384)

    public val linePollPtr: VoidPtr =
        Internals.getMethodBindPtr("EngineDebugger", "line_poll", 3218959716)

    public val sendMessagePtr: VoidPtr =
        Internals.getMethodBindPtr("EngineDebugger", "send_message", 1209351045)

    public val debugPtr: VoidPtr = Internals.getMethodBindPtr("EngineDebugger", "debug", 2751962654)

    public val scriptDebugPtr: VoidPtr =
        Internals.getMethodBindPtr("EngineDebugger", "script_debug", 2442343672)

    public val setLinesLeftPtr: VoidPtr =
        Internals.getMethodBindPtr("EngineDebugger", "set_lines_left", 1286410249)

    public val getLinesLeftPtr: VoidPtr =
        Internals.getMethodBindPtr("EngineDebugger", "get_lines_left", 3905245786)

    public val setDepthPtr: VoidPtr =
        Internals.getMethodBindPtr("EngineDebugger", "set_depth", 1286410249)

    public val getDepthPtr: VoidPtr =
        Internals.getMethodBindPtr("EngineDebugger", "get_depth", 3905245786)

    public val isBreakpointPtr: VoidPtr =
        Internals.getMethodBindPtr("EngineDebugger", "is_breakpoint", 921227809)

    public val isSkippingBreakpointsPtr: VoidPtr =
        Internals.getMethodBindPtr("EngineDebugger", "is_skipping_breakpoints", 36873697)

    public val insertBreakpointPtr: VoidPtr =
        Internals.getMethodBindPtr("EngineDebugger", "insert_breakpoint", 3780747571)

    public val removeBreakpointPtr: VoidPtr =
        Internals.getMethodBindPtr("EngineDebugger", "remove_breakpoint", 3780747571)

    public val clearBreakpointsPtr: VoidPtr =
        Internals.getMethodBindPtr("EngineDebugger", "clear_breakpoints", 3218959716)
  }
}
