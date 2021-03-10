// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import kotlin.Boolean
import kotlin.Suppress

@GodotBaseType
open class Reference : Object() {
  override fun ____DO_NOT_TOUCH_THIS_isRef____() = true

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_REFERENCE)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  open fun initRef(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFERENCE_INIT_REF, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun reference(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFERENCE_REFERENCE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun unreference(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_REFERENCE_UNREFERENCE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }
}
