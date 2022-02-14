// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class VisualScriptVariableSet : VisualScriptNode() {
  public open var varName: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTVARIABLESET_GET_VAR_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTVARIABLESET_SET_VAR_NAME, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSCRIPTVARIABLESET)
  }

  public companion object
}
