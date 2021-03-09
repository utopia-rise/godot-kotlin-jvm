// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import kotlin.Any
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * Data class wrapper for decoded JSON.
 *
 * Returned by [godot.JSON.parse], [godot.JSONParseResult] contains the decoded JSON or error information if the JSON source wasn't successfully parsed. You can check if the JSON source was successfully parsed with `if json_result.error == OK`.
 */
@GodotBaseType
open class JSONParseResult : Reference() {
  /**
   * The error type if the JSON source was not successfully parsed. See the [enum Error] constants.
   */
  open var error: Object?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JSONPARSERESULT_GET_ERROR, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Object?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JSONPARSERESULT_SET_ERROR, NIL)
    }

  /**
   * The line number where the error occurred if the JSON source was not successfully parsed.
   */
  open var errorLine: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JSONPARSERESULT_GET_ERROR_LINE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JSONPARSERESULT_SET_ERROR_LINE,
          NIL)
    }

  /**
   * The error message if the JSON source was not successfully parsed. See the [enum Error] constants.
   */
  open var errorString: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JSONPARSERESULT_GET_ERROR_STRING,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JSONPARSERESULT_SET_ERROR_STRING,
          NIL)
    }

  /**
   * A [Variant] containing the parsed JSON. Use [@GDScript.typeof] or the `is` keyword to check if it is what you expect. For example, if the JSON source starts with curly braces (`{}`), a [godot.core.Dictionary] will be returned. If the JSON source starts with brackets (`[]`), an [godot.Array] will be returned.
   *
   * **Note:** The JSON specification does not define integer or float types, but only a *number* type. Therefore, parsing a JSON text will convert all numerical values to [float] types.
   *
   * **Note:** JSON objects do not preserve key order like Godot dictionaries, thus, you should not rely on keys being in a certain order if a dictionary is constructed from JSON. In contrast, JSON arrays retain the order of their elements:
   *
   * ```
   * 			var p = JSON.parse('["hello", "world", "!"]')
   * 			if typeof(p.result) == TYPE_ARRAY:
   * 			    print(p.result[0]) # Prints "hello"
   * 			else:
   * 			    push_error("Unexpected results.")
   * 			```
   */
  open var result: Any?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JSONPARSERESULT_GET_RESULT, ANY)
      return TransferContext.readReturnValue(ANY, true) as Any?
    }
    set(value) {
      TransferContext.writeArguments(ANY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JSONPARSERESULT_SET_RESULT, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_JSONPARSERESULT)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }
}
