// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedStringArray
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

/**
 * A class that stores an expression you can execute.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/scripting/evaluating_expressions.html]($DOCS_URL/tutorials/scripting/evaluating_expressions.html)
 *
 * An expression can be made of any arithmetic operation, built-in math function call, method call of a passed instance, or built-in type construction call.
 *
 * An example expression text using the built-in math functions could be `sqrt(pow(3, 2) + pow(4, 2))`.
 *
 * In the following example we use a [godot.LineEdit] node to write our expression and show the result.
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * var expression = Expression.new()
 *
 *
 *
 * func _ready():
 *
 *     $LineEdit.text_submitted.connect(self._on_text_submitted)
 *
 *
 *
 * func _on_text_submitted(command):
 *
 *     var error = expression.parse(command)
 *
 *     if error != OK:
 *
 *         print(expression.get_error_text())
 *
 *         return
 *
 *     var result = expression.execute()
 *
 *     if not expression.has_execute_failed():
 *
 *         $LineEdit.text = str(result)
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * private Expression _expression = new Expression();
 *
 *
 *
 * public override void _Ready()
 *
 * {
 *
 *     GetNode<LineEdit>("LineEdit").TextSubmitted += OnTextEntered;
 *
 * }
 *
 *
 *
 * private void OnTextEntered(string command)
 *
 * {
 *
 *     Error error = _expression.Parse(command);
 *
 *     if (error != Error.Ok)
 *
 *     {
 *
 *         GD.Print(_expression.GetErrorText());
 *
 *         return;
 *
 *     }
 *
 *     Variant result = _expression.Execute();
 *
 *     if (!_expression.HasExecuteFailed())
 *
 *     {
 *
 *         GetNode<LineEdit>("LineEdit").Text = result.ToString();
 *
 *     }
 *
 * }
 *
 * [/csharp]
 *
 * [/codeblocks]
 */
@GodotBaseType
public open class Expression : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_EXPRESSION, scriptIndex)
    return true
  }

  /**
   * Parses the expression and returns an [enum Error] code.
   *
   * You can optionally specify names of variables that may appear in the expression with [inputNames], so that you can bind them when it gets executed.
   */
  @JvmOverloads
  public fun parse(expression: String, inputNames: PackedStringArray = PackedStringArray()):
      GodotError {
    TransferContext.writeArguments(STRING to expression, PACKED_STRING_ARRAY to inputNames)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EXPRESSION_PARSE, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Executes the expression that was previously parsed by [parse] and returns the result. Before you use the returned object, you should check if the method failed by calling [hasExecuteFailed].
   *
   * If you defined input variables in [parse], you can specify their values in the inputs array, in the same order.
   */
  @JvmOverloads
  public fun execute(
    inputs: VariantArray<Any?> = godot.core.variantArrayOf(),
    baseInstance: Object? = null,
    showError: Boolean = true,
    constCallsOnly: Boolean = false,
  ): Any? {
    TransferContext.writeArguments(ARRAY to inputs, OBJECT to baseInstance, BOOL to showError, BOOL to constCallsOnly)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EXPRESSION_EXECUTE, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Returns `true` if [execute] has failed.
   */
  public fun hasExecuteFailed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EXPRESSION_HAS_EXECUTE_FAILED, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the error text if [parse] or [execute] has failed.
   */
  public fun getErrorText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EXPRESSION_GET_ERROR_TEXT, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public companion object
}
