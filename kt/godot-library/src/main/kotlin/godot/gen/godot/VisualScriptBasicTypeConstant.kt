// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class VisualScriptBasicTypeConstant : VisualScriptNode() {
  public var basicType: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTBASICTYPECONSTANT_GET_BASIC_TYPE, LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTBASICTYPECONSTANT_SET_BASIC_TYPE, NIL.ordinal)
    }

  public var constant: String
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTBASICTYPECONSTANT_GET_BASIC_TYPE_CONSTANT,
          STRING.ordinal)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTBASICTYPECONSTANT_SET_BASIC_TYPE_CONSTANT,
          NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSCRIPTBASICTYPECONSTANT)
  }

  public companion object
}
