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
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
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
  public override fun new(scriptIndex: Int): Boolean {
    getSingleton(ENGINECLASS_ENGINEDEBUGGER)
    return false
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
   * Sends a message with given [message] and [data] array.
   */
  public fun sendMessage(message: String, `data`: VariantArray<Any?>): Unit {
    TransferContext.writeArguments(STRING to message, ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.sendMessagePtr, NIL)
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

    public val sendMessagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("EngineDebugger", "send_message")
  }
}
