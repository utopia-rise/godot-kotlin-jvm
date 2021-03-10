// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Suppress

@GodotBaseType
open class WorldEnvironment : Node() {
  open var environment: Environment?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLDENVIRONMENT_GET_ENVIRONMENT,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Environment?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLDENVIRONMENT_SET_ENVIRONMENT,
          NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_WORLDENVIRONMENT)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }
}
