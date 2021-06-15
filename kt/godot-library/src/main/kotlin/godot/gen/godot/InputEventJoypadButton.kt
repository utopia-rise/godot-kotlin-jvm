// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmName

/**
 * Input event for gamepad buttons.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/3.3/tutorials/inputs/inputevent.html](https://docs.godotengine.org/en/3.3/tutorials/inputs/inputevent.html)
 *
 * Input event type for gamepad buttons. For gamepad analog sticks and joysticks, see [godot.InputEventJoypadMotion].
 */
@GodotBaseType
open class InputEventJoypadButton : InputEvent() {
  /**
   * Button identifier. One of the [enum JoystickList] button constants.
   */
  open var buttonIndex: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTJOYPADBUTTON_GET_BUTTON_INDEX, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTJOYPADBUTTON_SET_BUTTON_INDEX, NIL)
    }

  /**
   * If `true`, the button's state is pressed. If `false`, the button's state is released.
   */
  open var pressed: Boolean
    @JvmName("isPressed_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.isPressed()
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTJOYPADBUTTON_SET_PRESSED, NIL)
    }

  /**
   * Represents the pressure the user puts on the button with his finger, if the controller supports it. Ranges from `0` to `1`.
   */
  open var pressure: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTJOYPADBUTTON_GET_PRESSURE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTJOYPADBUTTON_SET_PRESSURE, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_INPUTEVENTJOYPADBUTTON)
  }
}
