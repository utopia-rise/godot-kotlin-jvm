// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class VisualScriptLists internal constructor() : VisualScriptNode() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSCRIPTLISTS, scriptIndex)
    return true
  }

  public fun addInputDataPort(
    type: VariantType,
    name: String,
    index: Long
  ): Unit {
    TransferContext.writeArguments(LONG to type.id, STRING to name, LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTLISTS_ADD_INPUT_DATA_PORT, NIL)
  }

  public fun setInputDataPortName(index: Long, name: String): Unit {
    TransferContext.writeArguments(LONG to index, STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTLISTS_SET_INPUT_DATA_PORT_NAME, NIL)
  }

  public fun setInputDataPortType(index: Long, type: VariantType): Unit {
    TransferContext.writeArguments(LONG to index, LONG to type.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTLISTS_SET_INPUT_DATA_PORT_TYPE, NIL)
  }

  public fun removeInputDataPort(index: Long): Unit {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTLISTS_REMOVE_INPUT_DATA_PORT, NIL)
  }

  public fun addOutputDataPort(
    type: VariantType,
    name: String,
    index: Long
  ): Unit {
    TransferContext.writeArguments(LONG to type.id, STRING to name, LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTLISTS_ADD_OUTPUT_DATA_PORT, NIL)
  }

  public fun setOutputDataPortName(index: Long, name: String): Unit {
    TransferContext.writeArguments(LONG to index, STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTLISTS_SET_OUTPUT_DATA_PORT_NAME, NIL)
  }

  public fun setOutputDataPortType(index: Long, type: VariantType): Unit {
    TransferContext.writeArguments(LONG to index, LONG to type.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTLISTS_SET_OUTPUT_DATA_PORT_TYPE, NIL)
  }

  public fun removeOutputDataPort(index: Long): Unit {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTLISTS_REMOVE_OUTPUT_DATA_PORT, NIL)
  }

  public companion object
}
