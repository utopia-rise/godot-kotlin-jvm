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
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.STRING
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * [ScriptBacktrace] holds an already captured backtrace of a specific script language, such as
 * GDScript or C#, which are captured using [Engine.captureScriptBacktraces].
 *
 * See [ProjectSettings.debug/settings/gdscript/alwaysTrackCallStacks] and
 * [ProjectSettings.debug/settings/gdscript/alwaysTrackLocalVariables] for ways of controlling the
 * contents of this class.
 */
@GodotBaseType
public open class ScriptBacktrace : RefCounted() {
  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(589, scriptPtr)
  }

  /**
   * Returns the name of the script language that this backtrace was captured from.
   */
  public final fun getLanguageName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLanguageNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns `true` if the backtrace has no stack frames.
   */
  public final fun isEmpty(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isEmptyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the number of stack frames in the backtrace.
   */
  public final fun getFrameCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFrameCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the name of the function called at the stack frame at the specified index.
   */
  public final fun getFrameFunction(index: Int): String {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getFrameFunctionPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the file name of the call site represented by the stack frame at the specified index.
   */
  public final fun getFrameFile(index: Int): String {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getFrameFilePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the line number of the call site represented by the stack frame at the specified index.
   */
  public final fun getFrameLine(index: Int): Int {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getFrameLinePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the number of global variables (e.g. autoload singletons) in the backtrace.
   *
   * **Note:** This will be non-zero only if the `include_variables` parameter was `true` when
   * capturing the backtrace with [Engine.captureScriptBacktraces].
   */
  public final fun getGlobalVariableCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGlobalVariableCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the name of the global variable at the specified index.
   */
  public final fun getGlobalVariableName(variableIndex: Int): String {
    TransferContext.writeArguments(LONG to variableIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getGlobalVariableNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the value of the global variable at the specified index.
   *
   * **Warning:** With GDScript backtraces, the returned [Variant] will be the variable's actual
   * value, including any object references. This means that storing the returned [Variant] will
   * prevent any such object from being deallocated, so it's generally recommended not to do so.
   */
  public final fun getGlobalVariableValue(variableIndex: Int): Any? {
    TransferContext.writeArguments(LONG to variableIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getGlobalVariableValuePtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Returns the number of local variables in the stack frame at the specified index.
   *
   * **Note:** This will be non-zero only if the `include_variables` parameter was `true` when
   * capturing the backtrace with [Engine.captureScriptBacktraces].
   */
  public final fun getLocalVariableCount(frameIndex: Int): Int {
    TransferContext.writeArguments(LONG to frameIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getLocalVariableCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the name of the local variable at the specified [variableIndex] in the stack frame at
   * the specified [frameIndex].
   */
  public final fun getLocalVariableName(frameIndex: Int, variableIndex: Int): String {
    TransferContext.writeArguments(LONG to frameIndex.toLong(), LONG to variableIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getLocalVariableNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the value of the local variable at the specified [variableIndex] in the stack frame at
   * the specified [frameIndex].
   *
   * **Warning:** With GDScript backtraces, the returned [Variant] will be the variable's actual
   * value, including any object references. This means that storing the returned [Variant] will
   * prevent any such object from being deallocated, so it's generally recommended not to do so.
   */
  public final fun getLocalVariableValue(frameIndex: Int, variableIndex: Int): Any? {
    TransferContext.writeArguments(LONG to frameIndex.toLong(), LONG to variableIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getLocalVariableValuePtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Returns the number of member variables in the stack frame at the specified index.
   *
   * **Note:** This will be non-zero only if the `include_variables` parameter was `true` when
   * capturing the backtrace with [Engine.captureScriptBacktraces].
   */
  public final fun getMemberVariableCount(frameIndex: Int): Int {
    TransferContext.writeArguments(LONG to frameIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getMemberVariableCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the name of the member variable at the specified [variableIndex] in the stack frame at
   * the specified [frameIndex].
   */
  public final fun getMemberVariableName(frameIndex: Int, variableIndex: Int): String {
    TransferContext.writeArguments(LONG to frameIndex.toLong(), LONG to variableIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getMemberVariableNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the value of the member variable at the specified [variableIndex] in the stack frame at
   * the specified [frameIndex].
   *
   * **Warning:** With GDScript backtraces, the returned [Variant] will be the variable's actual
   * value, including any object references. This means that storing the returned [Variant] will
   * prevent any such object from being deallocated, so it's generally recommended not to do so.
   */
  public final fun getMemberVariableValue(frameIndex: Int, variableIndex: Int): Any? {
    TransferContext.writeArguments(LONG to frameIndex.toLong(), LONG to variableIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getMemberVariableValuePtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Converts the backtrace to a [String], where the entire string will be indented by [indentAll]
   * number of spaces, and the individual stack frames will be additionally indented by [indentFrames]
   * number of spaces.
   *
   * **Note:** Calling [Object.toString] on a [ScriptBacktrace] will produce the same output as
   * calling [format] with all parameters left at their default values.
   */
  @JvmOverloads
  public final fun format(indentAll: Int = 0, indentFrames: Int = 4): String {
    TransferContext.writeArguments(LONG to indentAll.toLong(), LONG to indentFrames.toLong())
    TransferContext.callMethod(ptr, MethodBindings.formatPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public companion object

  public object MethodBindings {
    internal val getLanguageNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptBacktrace", "get_language_name", 201670096)

    internal val isEmptyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptBacktrace", "is_empty", 36873697)

    internal val getFrameCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptBacktrace", "get_frame_count", 3905245786)

    internal val getFrameFunctionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptBacktrace", "get_frame_function", 844755477)

    internal val getFrameFilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptBacktrace", "get_frame_file", 844755477)

    internal val getFrameLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptBacktrace", "get_frame_line", 923996154)

    internal val getGlobalVariableCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptBacktrace", "get_global_variable_count", 3905245786)

    internal val getGlobalVariableNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptBacktrace", "get_global_variable_name", 844755477)

    internal val getGlobalVariableValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptBacktrace", "get_global_variable_value", 4227898402)

    internal val getLocalVariableCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptBacktrace", "get_local_variable_count", 923996154)

    internal val getLocalVariableNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptBacktrace", "get_local_variable_name", 1391810591)

    internal val getLocalVariableValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptBacktrace", "get_local_variable_value", 678354945)

    internal val getMemberVariableCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptBacktrace", "get_member_variable_count", 923996154)

    internal val getMemberVariableNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptBacktrace", "get_member_variable_name", 1391810591)

    internal val getMemberVariableValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptBacktrace", "get_member_variable_value", 678354945)

    internal val formatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ScriptBacktrace", "format", 3464456933)
  }
}
