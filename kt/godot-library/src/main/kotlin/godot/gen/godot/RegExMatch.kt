// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Dictionary
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.LONG
import godot.core.VariantType.STRING
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class RegExMatch : Reference() {
  open val names: Dictionary<Any?, Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REGEXMATCH_GET_NAMES, DICTIONARY)
      return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
    }

  open val strings: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REGEXMATCH_GET_STRINGS, ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
    }

  open val subject: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REGEXMATCH_GET_SUBJECT, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_REGEXMATCH)

  open fun getEnd(name: Any = 0): Long {
    TransferContext.writeArguments(ANY to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REGEXMATCH_GET_END, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getGroupCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REGEXMATCH_GET_GROUP_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getStart(name: Any = 0): Long {
    TransferContext.writeArguments(ANY to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REGEXMATCH_GET_START, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getString(name: Any = 0): String {
    TransferContext.writeArguments(ANY to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REGEXMATCH_GET_STRING, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  companion object
}
