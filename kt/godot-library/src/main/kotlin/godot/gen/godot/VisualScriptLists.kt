// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class VisualScriptLists internal constructor() : VisualScriptNode() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSCRIPTLISTS)
  }

  public fun addInputDataPort(
    type: VariantType,
    name: String,
    index: Long
  ): Unit {
    TransferContext.writeArguments(LONG to type.id, STRING to name, LONG to index)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTLISTS_ADD_INPUT_DATA_PORT,
        NIL.ordinal)
  }

  public fun setInputDataPortName(index: Long, name: String): Unit {
    TransferContext.writeArguments(LONG to index, STRING to name)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTLISTS_SET_INPUT_DATA_PORT_NAME, NIL.ordinal)
  }

  public fun setInputDataPortType(index: Long, type: VariantType): Unit {
    TransferContext.writeArguments(LONG to index, LONG to type.id)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTLISTS_SET_INPUT_DATA_PORT_TYPE, NIL.ordinal)
  }

  public fun removeInputDataPort(index: Long): Unit {
    TransferContext.writeArguments(LONG to index)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTLISTS_REMOVE_INPUT_DATA_PORT,
        NIL.ordinal)
  }

  public fun addOutputDataPort(
    type: VariantType,
    name: String,
    index: Long
  ): Unit {
    TransferContext.writeArguments(LONG to type.id, STRING to name, LONG to index)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTLISTS_ADD_OUTPUT_DATA_PORT,
        NIL.ordinal)
  }

  public fun setOutputDataPortName(index: Long, name: String): Unit {
    TransferContext.writeArguments(LONG to index, STRING to name)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTLISTS_SET_OUTPUT_DATA_PORT_NAME, NIL.ordinal)
  }

  public fun setOutputDataPortType(index: Long, type: VariantType): Unit {
    TransferContext.writeArguments(LONG to index, LONG to type.id)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTLISTS_SET_OUTPUT_DATA_PORT_TYPE, NIL.ordinal)
  }

  public fun removeOutputDataPort(index: Long): Unit {
    TransferContext.writeArguments(LONG to index)
    TransferContext.icall(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTLISTS_REMOVE_OUTPUT_DATA_PORT, NIL.ordinal)
  }

  public companion object
}
