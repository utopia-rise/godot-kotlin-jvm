// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.STRING
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Helper class for creating and parsing JSON data.
 *
 * The [JSON] enables all data types to be converted to and from a JSON string. This useful for serializing data to save to a file or send over the network.
 *
 * [stringify] is used to convert any data type into a JSON string.
 *
 * [parse] is used to convert any existing JSON data into a [Variant] that can be used within Godot. If successfully parsed, use [getData] to retrieve the [Variant], and use `typeof` to check if the Variant's type is what you expect. JSON Objects are converted into a [godot.core.Dictionary], but JSON data can be used to store [godot.Array]s, numbers, [godot.String]s and even just a boolean.
 *
 * **Example**
 *
 * ```
 * 		var data_to_send = ["a", "b", "c"]
 * 		var json = JSON.new()
 * 		var json_string = json.stringify(data_to_send)
 * 		# Save data
 * 		# ...
 * 		# Retrieve data
 * 		var error = json.parse(json_string)
 * 		if error == OK:
 * 		    var data_received = json.get_data()
 * 		    if typeof(data_received) == TYPE_ARRAY:
 * 		        print(data_received) # Prints array
 * 		    else:
 * 		        print("Unexpected data")
 * 		else:
 * 		    print("JSON Parse Error: ", json.get_error_message(), " in ", json_string, " at line ", json.get_error_line())
 * 		```
 */
@GodotBaseType
public open class JSON : RefCounted() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_JSON)
  }

  /**
   * Converts a [Variant] var to JSON text and returns the result. Useful for serializing data to store or send over the network.
   *
   * **Note:** The JSON specification does not define integer or float types, but only a *number* type. Therefore, converting a Variant to JSON text will convert all numerical values to [float] types.
   *
   * **Note:** If `full_precision` is true, when stringifying floats, the unreliable digits are stringified in addition to the reliable digits to guarantee exact decoding.
   *
   * The `indent` parameter controls if and how something is indented, the string used for this parameter will be used where there should be an indent in the output, even spaces like `"   "` will work. `\t` and `\n` can also be used for a tab indent, or to make a newline for each indent respectively.
   *
   * **Example output:**
   *
   * ```
   * 				## JSON.stringify(my_dictionary)
   * 				{"name":"my_dictionary","version":"1.0.0","entities":[{"name":"entity_0","value":"value_0"},{"name":"entity_1","value":"value_1"}]}
   *
   * 				## JSON.stringify(my_dictionary, "\t")
   * 				{
   * 				    "name": "my_dictionary",
   * 				    "version": "1.0.0",
   * 				    "entities": [
   * 				        {
   * 				            "name": "entity_0",
   * 				            "value": "value_0"
   * 				        },
   * 				        {
   * 				            "name": "entity_1",
   * 				            "value": "value_1"
   * 				        }
   * 				    ]
   * 				}
   *
   * 				## JSON.stringify(my_dictionary, "...")
   * 				{
   * 				..."name": "my_dictionary",
   * 				..."version": "1.0.0",
   * 				..."entities": [
   * 				......{
   * 				........."name": "entity_0",
   * 				........."value": "value_0"
   * 				......},
   * 				......{
   * 				........."name": "entity_1",
   * 				........."value": "value_1"
   * 				......}
   * 				...]
   * 				}
   * 				```
   */
  public open fun stringify(
    `data`: Any,
    indent: String = "",
    sortKeys: Boolean = true,
    fullPrecision: Boolean = false
  ): String {
    TransferContext.writeArguments(ANY to data, STRING to indent, BOOL to sortKeys, BOOL to
        fullPrecision)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JSON_STRINGIFY, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Attempts to parse the `json_string` provided.
   *
   * Returns an [enum Error]. If the parse was successful, it returns `OK` and the result can be retrieved using [getData]. If unsuccessful, use [getErrorLine] and [getErrorMessage] for identifying the source of the failure.
   */
  public open fun parse(jsonString: String): GodotError {
    TransferContext.writeArguments(STRING to jsonString)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JSON_PARSE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the [Variant] containing the data of a successful [parse].
   *
   * **Note:** It will return `Null` if the last call to parse was unsuccessful or [parse] has not yet been called.
   */
  public open fun getData(): Any? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JSON_GET_DATA, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns `0` if the last call to [parse] was successful, or the line number where the parse failed.
   */
  public open fun getErrorLine(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JSON_GET_ERROR_LINE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns an empty string if the last call to [parse] was successful, or the error message if it failed.
   */
  public open fun getErrorMessage(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_JSON_GET_ERROR_MESSAGE, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  public companion object
}
