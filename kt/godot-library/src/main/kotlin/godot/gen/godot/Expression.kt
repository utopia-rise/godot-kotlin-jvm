// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedStringArray
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A class that stores an expression you can execute.
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
 *     $LineEdit.connect("text_submitted", self, "_on_text_submitted")
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
 * public Expression expression = new Expression();
 *
 *
 *
 * public override void _Ready()
 *
 * {
 *
 *     GetNode("LineEdit").Connect("text_submitted", this, nameof(OnTextEntered));
 *
 * }
 *
 *
 *
 * private void OnTextEntered(string command)
 *
 * {
 *
 *     Error error = expression.Parse(command);
 *
 *     if (error != Error.Ok)
 *
 *     {
 *
 *         GD.Print(expression.GetErrorText());
 *
 *         return;
 *
 *     }
 *
 *     object result = expression.Execute();
 *
 *     if (!expression.HasExecuteFailed())
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
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_EXPRESSION)
  }

  /**
   * Parses the expression and returns an [enum Error] code.
   *
   * You can optionally specify names of variables that may appear in the expression with `input_names`, so that you can bind them when it gets executed.
   */
  public fun parse(expression: String, inputNames: PackedStringArray = PackedStringArray()):
      GodotError {
    TransferContext.writeArguments(STRING to expression, PACKED_STRING_ARRAY to inputNames)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EXPRESSION_PARSE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Executes the expression that was previously parsed by [parse] and returns the result. Before you use the returned object, you should check if the method failed by calling [hasExecuteFailed].
   *
   * If you defined input variables in [parse], you can specify their values in the inputs array, in the same order.
   */
  public fun execute(
    inputs: VariantArray<Any?> = godot.core.variantArrayOf(),
    baseInstance: Object? = null,
    showError: Boolean = true
  ): Any? {
    TransferContext.writeArguments(ARRAY to inputs, OBJECT to baseInstance, BOOL to showError)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EXPRESSION_EXECUTE, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns `true` if [execute] has failed.
   */
  public fun hasExecuteFailed(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EXPRESSION_HAS_EXECUTE_FAILED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the error text if [parse] has failed.
   */
  public fun getErrorText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EXPRESSION_GET_ERROR_TEXT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  public companion object
}
