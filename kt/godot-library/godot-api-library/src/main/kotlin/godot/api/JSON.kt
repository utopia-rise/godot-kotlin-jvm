// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.Error
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import godot.getDataPtr
import godot.getErrorLinePtr
import godot.getErrorMessagePtr
import godot.getParsedTextPtr
import godot.parsePtr
import godot.parseStringPtr
import godot.setDataPtr
import godot.stringifyPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

private const val ENGINECLASS_JSON: Int = 334

/**
 * The [JSON] class enables all data types to be converted to and from a JSON string. This is useful
 * for serializing data, e.g. to save to a file or send over the network.
 * [stringify] is used to convert any data type into a JSON string.
 * [parse] is used to convert any existing JSON data into a [Variant] that can be used within Godot.
 * If successfully parsed, use [data] to retrieve the [Variant], and use `typeof` to check if the
 * Variant's type is what you expect. JSON Objects are converted into a [Dictionary], but JSON data can
 * be used to store [Array]s, numbers, [String]s and even just a boolean.
 * **Example**
 * [codeblock]
 * var data_to_send = ["a", "b", "c"]
 * var json_string = JSON.stringify(data_to_send)
 * # Save data
 * # ...
 * # Retrieve data
 * var json = JSON.new()
 * var error = json.parse(json_string)
 * if error == OK:
 *     var data_received = json.data
 *     if typeof(data_received) == TYPE_ARRAY:
 *         print(data_received) # Prints array
 *     else:
 *         print("Unexpected data")
 * else:
 *     print("JSON Parse Error: ", json.get_error_message(), " in ", json_string, " at line ",
 * json.get_error_line())
 * [/codeblock]
 * Alternatively, you can parse strings using the static [parseString] method, but it doesn't handle
 * errors.
 * [codeblock]
 * var data = JSON.parse_string(json_string) # Returns null if parsing failed.
 * [/codeblock]
 * **Note:** Both parse methods do not fully comply with the JSON specification:
 * - Trailing commas in arrays or objects are ignored, instead of causing a parser error.
 * - New line and tab characters are accepted in string literals, and are treated like their
 * corresponding escape sequences `\n` and `\t`.
 * - Numbers are parsed using [String.toFloat] which is generally more lax than the JSON
 * specification.
 * - Certain errors, such as invalid Unicode sequences, do not cause a parser error. Instead, the
 * string is cleansed and an error is logged to the console.
 */
@GodotBaseType
public open class JSON : Resource() {
  /**
   * Contains the parsed JSON data in [Variant] form.
   */
  public final inline var `data`: Any?
    @JvmName("dataProperty")
    get() = getData()
    @JvmName("dataProperty")
    set(`value`) {
      setData(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_JSON, scriptIndex)
  }

  /**
   * Attempts to parse the [jsonText] provided.
   * Returns an [Error]. If the parse was successful, it returns [OK] and the result can be
   * retrieved using [data]. If unsuccessful, use [getErrorLine] and [getErrorMessage] to identify the
   * source of the failure.
   * Non-static variant of [parseString], if you want custom error handling.
   * The optional [keepText] argument instructs the parser to keep a copy of the original text. This
   * text can be obtained later by using the [getParsedText] function and is used when saving the
   * resource (instead of generating new text from [data]).
   */
  @JvmOverloads
  public final fun parse(jsonText: String, keepText: Boolean = false): Error {
    TransferContext.writeArguments(STRING to jsonText, BOOL to keepText)
    TransferContext.callMethod(ptr, MethodBindings.parsePtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun getData(): Any? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDataPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  public final fun setData(`data`: Any?): Unit {
    TransferContext.writeArguments(ANY to data)
    TransferContext.callMethod(ptr, MethodBindings.setDataPtr, NIL)
  }

  /**
   * Return the text parsed by [parse] (requires passing `keep_text` to [parse]).
   */
  public final fun getParsedText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getParsedTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns `0` if the last call to [parse] was successful, or the line number where the parse
   * failed.
   */
  public final fun getErrorLine(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getErrorLinePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns an empty string if the last call to [parse] was successful, or the error message if it
   * failed.
   */
  public final fun getErrorMessage(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getErrorMessagePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public companion object {
    /**
     * Converts a [Variant] var to JSON text and returns the result. Useful for serializing data to
     * store or send over the network.
     * **Note:** The JSON specification does not define integer or float types, but only a *number*
     * type. Therefore, converting a Variant to JSON text will convert all numerical values to [float]
     * types.
     * **Note:** If [fullPrecision] is `true`, when stringifying floats, the unreliable digits are
     * stringified in addition to the reliable digits to guarantee exact decoding.
     * The [indent] parameter controls if and how something is indented; its contents will be used
     * where there should be an indent in the output. Even spaces like `"   "` will work. `\t` and `\n`
     * can also be used for a tab indent, or to make a newline for each indent respectively.
     * **Example output:**
     * [codeblock]
     * ## JSON.stringify(my_dictionary)
     * {"name":"my_dictionary","version":"1.0.0","entities":[{"name":"entity_0","value":"value_0"},{"name":"entity_1","value":"value_1"}]}
     *
     * ## JSON.stringify(my_dictionary, "\t")
     * {
     *     "name": "my_dictionary",
     *     "version": "1.0.0",
     *     "entities": [
     *         {
     *             "name": "entity_0",
     *             "value": "value_0"
     *         },
     *         {
     *             "name": "entity_1",
     *             "value": "value_1"
     *         }
     *     ]
     * }
     *
     * ## JSON.stringify(my_dictionary, "...")
     * {
     * ..."name": "my_dictionary",
     * ..."version": "1.0.0",
     * ..."entities": [
     * ......{
     * ........."name": "entity_0",
     * ........."value": "value_0"
     * ......},
     * ......{
     * ........."name": "entity_1",
     * ........."value": "value_1"
     * ......}
     * ...]
     * }
     * [/codeblock]
     */
    @JvmOverloads
    public final fun stringify(
      `data`: Any?,
      indent: String = "",
      sortKeys: Boolean = true,
      fullPrecision: Boolean = false,
    ): String {
      TransferContext.writeArguments(ANY to data, STRING to indent, BOOL to sortKeys, BOOL to fullPrecision)
      TransferContext.callMethod(0, MethodBindings.stringifyPtr, STRING)
      return (TransferContext.readReturnValue(STRING) as String)
    }

    /**
     * Attempts to parse the [jsonString] provided and returns the parsed data. Returns `null` if
     * parse failed.
     */
    public final fun parseString(jsonString: String): Any? {
      TransferContext.writeArguments(STRING to jsonString)
      TransferContext.callMethod(0, MethodBindings.parseStringPtr, ANY)
      return (TransferContext.readReturnValue(ANY) as Any?)
    }
  }

  public object MethodBindings {
    internal val stringifyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("JSON", "stringify", 462733549)

    internal val parseStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("JSON", "parse_string", 309047738)

    internal val parsePtr: VoidPtr = TypeManager.getMethodBindPtr("JSON", "parse", 885841341)

    internal val getDataPtr: VoidPtr = TypeManager.getMethodBindPtr("JSON", "get_data", 1214101251)

    internal val setDataPtr: VoidPtr = TypeManager.getMethodBindPtr("JSON", "set_data", 1114965689)

    internal val getParsedTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("JSON", "get_parsed_text", 201670096)

    internal val getErrorLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("JSON", "get_error_line", 3905245786)

    internal val getErrorMessagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("JSON", "get_error_message", 201670096)
  }
}
