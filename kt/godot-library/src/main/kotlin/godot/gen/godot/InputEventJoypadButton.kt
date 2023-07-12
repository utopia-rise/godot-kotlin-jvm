// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmName

/**
 * Input event for gamepad buttons.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/inputs/inputevent.html]($DOCS_URL/tutorials/inputs/inputevent.html)
 *
 * Input event type for gamepad buttons. For gamepad analog sticks and joysticks, see [godot.InputEventJoypadMotion].
 */
@GodotBaseType
public open class InputEventJoypadButton : InputEvent() {
  /**
   * Button identifier. One of the [enum JoyButton] button constants.
   */
  public var buttonIndex: JoyButton
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTJOYPADBUTTON_GET_BUTTON_INDEX, LONG)
      return JoyButton.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTJOYPADBUTTON_SET_BUTTON_INDEX, NIL)
    }

  /**
   * Represents the pressure the user puts on the button with their finger, if the controller supports it. Ranges from `0` to `1`.
   */
  public var pressure: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTJOYPADBUTTON_GET_PRESSURE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTJOYPADBUTTON_SET_PRESSURE, NIL)
    }

  /**
   * If `true`, the button's state is pressed. If `false`, the button's state is released.
   */
  public var pressed: Boolean
    @JvmName("isPressed_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.isPressed()
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTJOYPADBUTTON_SET_PRESSED, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_INPUTEVENTJOYPADBUTTON, scriptIndex)
    return true
  }

  public companion object
}
