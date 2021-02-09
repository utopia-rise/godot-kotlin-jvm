// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress

@GodotBaseType
object JSON : Object() {
  override fun __new(): VoidPtr = TransferContext.getSingleton(ENGINESINGLETON_JSON)

  override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  fun parse(json: String): JSONParseResult? {
    TransferContext.writeArguments(STRING to json)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__JSON_PARSE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as JSONParseResult?
  }

  fun print(
    value: Any,
    indent: String = "",
    sortKeys: Boolean = false
  ): String {
    TransferContext.writeArguments(ANY to value, STRING to indent, BOOL to sortKeys)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS__JSON_PRINT, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }
}
