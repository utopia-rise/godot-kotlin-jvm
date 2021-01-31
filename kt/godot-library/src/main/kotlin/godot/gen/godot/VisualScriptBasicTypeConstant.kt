// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.util.VoidPtr
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class VisualScriptBasicTypeConstant : VisualScriptNode() {
  open var basicType: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTBASICTYPECONSTANT_GET_BASIC_TYPE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTBASICTYPECONSTANT_SET_BASIC_TYPE, NIL)
    }

  open var constant: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTBASICTYPECONSTANT_GET_CONSTANT, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTBASICTYPECONSTANT_SET_CONSTANT, NIL)
    }

  override fun __new(): VoidPtr =
      TransferContext.invokeConstructor(ENGINECLASS_VISUALSCRIPTBASICTYPECONSTANT)
}
