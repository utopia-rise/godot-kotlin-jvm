// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Helper class for parsing JSON data.
 *
 * Helper class for parsing JSON data. For usage example and other important hints, see [godot.JSONParseResult].
 */
@GodotBaseType
public object JSON : Object() {
  public override fun __new(): Unit {
    rawPtr = TransferContext.getSingleton(ENGINESINGLETON_JSON)
  }

  public override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  /**
   * Parses a JSON-encoded string and returns a [godot.JSONParseResult] containing the result.
   */
  public fun parse(json: String): JSONParseResult? {
    TransferContext.writeArguments(STRING to json)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__JSON_PARSE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as JSONParseResult?
  }

  /**
   * Converts a [Variant] var to JSON text and returns the result. Useful for serializing data to store or send over the network.
   *
   * **Note:** The JSON specification does not define integer or float types, but only a *number* type. Therefore, converting a Variant to JSON text will convert all numerical values to [float] types.
   *
   * The `indent` parameter controls if and how something is indented, the string used for this parameter will be used where there should be an indent in the output, even spaces like `"   "` will work. `\t` and `\n` can also be used for a tab indent, or to make a newline for each indent respectively.
   *
   * **Example output:**
   *
   * ```
   * 				## JSON.print(my_dictionary)
   * 				{"name":"my_dictionary","version":"1.0.0","entities":[{"name":"entity_0","value":"value_0"},{"name":"entity_1","value":"value_1"}]}
   *
   * 				## JSON.print(my_dictionary, "\t")
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
   * 				## JSON.print(my_dictionary, "...")
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
  public fun print(
    `value`: Any?,
    indent: String = "",
    sortKeys: Boolean = false
  ): String {
    TransferContext.writeArguments(ANY to value, STRING to indent, BOOL to sortKeys)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__JSON_PRINT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }
}
