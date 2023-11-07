// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * A group of [BaseButton]-derived buttons. The buttons in a [ButtonGroup] are treated like radio
 * buttons: No more than one button can be pressed at a time. Some types of buttons (such as
 * [CheckBox]) may have a special appearance in this state.
 * Every member of a [ButtonGroup] should have [BaseButton.toggleMode] set to `true`.
 */
@GodotBaseType
public open class ButtonGroup : Resource() {
  /**
   * Emitted when one of the buttons of the group is pressed.
   */
  public val pressed: Signal1<BaseButton> by signal("button")

  /**
   * If `true`, it is possible to unpress all buttons in this [ButtonGroup].
   */
  public var allowUnpress: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isAllowUnpressPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAllowUnpressPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_BUTTONGROUP, scriptIndex)
    return true
  }

  /**
   * Returns the current pressed button.
   */
  public fun getPressedButton(): BaseButton? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPressedButtonPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as BaseButton?)
  }

  /**
   * Returns an [Array] of [Button]s who have this as their [ButtonGroup] (see
   * [BaseButton.buttonGroup]).
   */
  public fun getButtons(): VariantArray<BaseButton> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getButtonsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<BaseButton>)
  }

  public companion object

  internal object MethodBindings {
    public val getPressedButtonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ButtonGroup", "get_pressed_button")

    public val getButtonsPtr: VoidPtr = TypeManager.getMethodBindPtr("ButtonGroup", "get_buttons")

    public val setAllowUnpressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ButtonGroup", "set_allow_unpress")

    public val isAllowUnpressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ButtonGroup", "is_allow_unpress")
  }
}
