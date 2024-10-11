// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.VariantArray
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_STRING_ARRAY
import godot.core.VariantParser.STRING
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

private const val ENGINE_CLASS_EXPRESSION_INDEX: Int = 235

/**
 * An expression can be made of any arithmetic operation, built-in math function call, method call
 * of a passed instance, or built-in type construction call.
 * An example expression text using the built-in math functions could be `sqrt(pow(3, 2) + pow(4,
 * 2))`.
 * In the following example we use a [LineEdit] node to write our expression and show the result.
 *
 * gdscript:
 * ```gdscript
 * var expression = Expression.new()
 *
 * func _ready():
 *     $LineEdit.text_submitted.connect(self._on_text_submitted)
 *
 * func _on_text_submitted(command):
 *     var error = expression.parse(command)
 *     if error != OK:
 *         print(expression.get_error_text())
 *         return
 *     var result = expression.execute()
 *     if not expression.has_execute_failed():
 *         $LineEdit.text = str(result)
 * ```
 * csharp:
 * ```csharp
 * private Expression _expression = new Expression();
 *
 * public override void _Ready()
 * {
 *     GetNode<LineEdit>("LineEdit").TextSubmitted += OnTextEntered;
 * }
 *
 * private void OnTextEntered(string command)
 * {
 *     Error error = _expression.Parse(command);
 *     if (error != Error.Ok)
 *     {
 *         GD.Print(_expression.GetErrorText());
 *         return;
 *     }
 *     Variant result = _expression.Execute();
 *     if (!_expression.HasExecuteFailed())
 *     {
 *         GetNode<LineEdit>("LineEdit").Text = result.ToString();
 *     }
 * }
 * ```
 */
@GodotBaseType
public open class Expression : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_EXPRESSION_INDEX, scriptIndex)
  }

  /**
   * Parses the expression and returns an [Error] code.
   * You can optionally specify names of variables that may appear in the expression with
   * [inputNames], so that you can bind them when it gets executed.
   */
  @JvmOverloads
  public final fun parse(expression: String, inputNames: PackedStringArray = PackedStringArray()):
      Error {
    Internals.writeArguments(STRING to expression, PACKED_STRING_ARRAY to inputNames)
    Internals.callMethod(rawPtr, MethodBindings.parsePtr, LONG)
    return Error.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Executes the expression that was previously parsed by [parse] and returns the result. Before
   * you use the returned object, you should check if the method failed by calling [hasExecuteFailed].
   * If you defined input variables in [parse], you can specify their values in the inputs array, in
   * the same order.
   */
  @JvmOverloads
  public final fun execute(
    inputs: VariantArray<Any?> = godot.core.variantArrayOf(),
    baseInstance: Object? = null,
    showError: Boolean = true,
    constCallsOnly: Boolean = false,
  ): Any? {
    Internals.writeArguments(ARRAY to inputs, OBJECT to baseInstance, BOOL to showError, BOOL to constCallsOnly)
    Internals.callMethod(rawPtr, MethodBindings.executePtr, ANY)
    return (Internals.readReturnValue(ANY) as Any?)
  }

  /**
   * Returns `true` if [execute] has failed.
   */
  public final fun hasExecuteFailed(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.hasExecuteFailedPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the error text if [parse] or [execute] has failed.
   */
  public final fun getErrorText(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getErrorTextPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public companion object

  public object MethodBindings {
    internal val parsePtr: VoidPtr = Internals.getMethodBindPtr("Expression", "parse", 3069722906)

    internal val executePtr: VoidPtr =
        Internals.getMethodBindPtr("Expression", "execute", 3712471238)

    internal val hasExecuteFailedPtr: VoidPtr =
        Internals.getMethodBindPtr("Expression", "has_execute_failed", 36873697)

    internal val getErrorTextPtr: VoidPtr =
        Internals.getMethodBindPtr("Expression", "get_error_text", 201670096)
  }
}
