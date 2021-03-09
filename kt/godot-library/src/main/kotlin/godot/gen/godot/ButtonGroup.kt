// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.OBJECT
import kotlin.Any
import kotlin.Suppress

@GodotBaseType
open class ButtonGroup : Resource() {
  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_BUTTONGROUP)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun getButtons(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTONGROUP_GET_BUTTONS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  open fun getPressedButton(): BaseButton? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTONGROUP_GET_PRESSED_BUTTON,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as BaseButton?
  }
}
