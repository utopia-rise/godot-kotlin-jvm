// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.Double
import kotlin.String
import kotlin.Suppress
import kotlin.UninitializedPropertyAccessException

/**
 * Input event type for actions.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/inputs/inputevent.html#actions](https://docs.godotengine.org/en/latest/tutorials/inputs/inputevent.html#actions)
 *
 * Contains a generic action which can be targeted from several types of inputs. Actions can be created from the **Input Map** tab in the **Project > Project Settings** menu. See [godot.Node.Input].
 */
@GodotBaseType
open class InputEventAction : InputEvent() {
  /**
   * The action's name. Actions are accessed via this [godot.String].
   */
  open var action: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTACTION_GET_ACTION,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTACTION_SET_ACTION, NIL)
    }

  /**
   * If `true`, the action's state is pressed. If `false`, the action's state is released.
   */
  open var pressed: Boolean
    get() {
      throw UninitializedPropertyAccessException("Cannot access property pressed: has no getter")
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTACTION_SET_PRESSED, NIL)
    }

  /**
   * The action's strength between 0 and 1. This value is considered as equal to 0 if pressed is `false`. The event strength allows faking analog joypad motion events, by precising how strongly is the joypad axis bent or pressed.
   */
  open var strength: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTACTION_GET_STRENGTH,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTACTION_SET_STRENGTH,
          NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_INPUTEVENTACTION)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }
}
