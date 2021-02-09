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
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class JSONParseResult : Reference() {
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

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_JSONPARSERESULT)
}
