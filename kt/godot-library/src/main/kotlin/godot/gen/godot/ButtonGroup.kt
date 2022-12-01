// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.OBJECT
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

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
  public val pressed: Signal1<BaseButton> by signal("button")

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_BUTTONGROUP, scriptIndex)
    return true
  }

  /**
   * Returns the current pressed button.
   */
  public fun getPressedButton(): BaseButton? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTONGROUP_GET_PRESSED_BUTTON,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as BaseButton?
  }

  /**
   * Returns an [godot.Array] of [godot.Button]s who have this as their [godot.ButtonGroup] (see [godot.BaseButton.buttonGroup]).
   */
  public fun getButtons(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTONGROUP_GET_BUTTONS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  public companion object
}
