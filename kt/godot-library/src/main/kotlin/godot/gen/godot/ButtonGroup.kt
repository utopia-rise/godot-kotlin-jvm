// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.OBJECT
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Any
import kotlin.Suppress
import kotlin.Unit

/**
 * Group of Buttons.
 *
 * Group of [godot.Button]. All direct and indirect children buttons become radios. Only one allows being pressed.
 *
 * [godot.BaseButton.toggleMode] should be `true`.
 */
@GodotBaseType
public open class ButtonGroup : Resource() {
  /**
   * Emitted when one of the buttons of the group is pressed.
   */
  public val pressed: Signal1<Object> by signal("button")

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_BUTTONGROUP)
  }

  /**
   * Returns an [godot.Array] of [godot.Button]s who have this as their [godot.ButtonGroup] (see [godot.BaseButton.group]).
   */
  public open fun getButtons(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTONGROUP_GET_BUTTONS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns the current pressed button.
   */
  public open fun getPressedButton(): BaseButton? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTONGROUP_GET_PRESSED_BUTTON,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as BaseButton?
  }
}
