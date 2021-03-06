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
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Suppress

/**
 * Group of Buttons.
 *
 * Group of [godot.Button]. All direct and indirect children buttons become radios. Only one allows being pressed.
 *
 * [godot.BaseButton.toggleMode] should be `true`.
 */
@GodotBaseType
open class ButtonGroup : Resource() {
  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_BUTTONGROUP)

  /**
   * Returns an [godot.Array] of [godot.Button]s who have this as their [godot.ButtonGroup] (see [godot.BaseButton.group]).
   */
  open fun getButtons(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTONGROUP_GET_BUTTONS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns the current pressed button.
   */
  open fun getPressedButton(): BaseButton? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTONGROUP_GET_PRESSED_BUTTON,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as BaseButton?
  }
}
