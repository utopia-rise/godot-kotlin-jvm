// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Suppress
import kotlin.jvm.JvmName

/**
 * Input event type for mouse button events.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/inputs/mouse_and_input_coordinates.html]($DOCS_URL/tutorials/inputs/mouse_and_input_coordinates.html)
 *
 * Contains mouse click information. See [godot.Node.Input].
 */
@GodotBaseType
public open class InputEventMouseButton : InputEventMouse() {
  /**
   * The amount (or delta) of the event. When used for high-precision scroll events, this indicates the scroll amount (vertical or horizontal). This is only supported on some platforms; the reported sensitivity varies depending on the platform. May be `0` if not supported.
   */
  public var factor: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSEBUTTON_GET_FACTOR,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSEBUTTON_SET_FACTOR,
          NIL)
    }

  /**
   * The mouse button identifier, one of the [enum MouseButton] button or button wheel constants.
   */
  public var buttonIndex: MouseButton
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSEBUTTON_GET_BUTTON_INDEX, LONG)
      return MouseButton.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSEBUTTON_SET_BUTTON_INDEX, NIL)
    }

  /**
   * If `true`, the mouse button's state is pressed. If `false`, the mouse button's state is released.
   */
  public var pressed: Boolean
    @JvmName("isPressed_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.isPressed()
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSEBUTTON_SET_PRESSED,
          NIL)
    }

  /**
   * If `true`, the mouse button's state is a double-click.
   */
  public var doubleClick: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSEBUTTON_IS_DOUBLE_CLICK, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTMOUSEBUTTON_SET_DOUBLE_CLICK, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_INPUTEVENTMOUSEBUTTON, scriptIndex)
    return true
  }

  public companion object
}
