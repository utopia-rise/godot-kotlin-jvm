// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.UninitializedPropertyAccessException

/**
 * Input event type for keyboard events.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/3.3/tutorials/inputs/inputevent.html](https://docs.godotengine.org/en/3.3/tutorials/inputs/inputevent.html)
 *
 * Stores key presses on the keyboard. Supports key presses, key releases and [echo] events.
 */
@GodotBaseType
open class InputEventKey : InputEventWithModifiers() {
  /**
   * If `true`, the key was already pressed before this event. It means the user is holding the key down.
   */
  open var echo: Boolean
    get() {
      throw UninitializedPropertyAccessException("Cannot access property echo: has no getter")
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_SET_ECHO, NIL)
    }

  /**
   * If `true`, the key's state is pressed. If `false`, the key's state is released.
   */
  open var pressed: Boolean
    get() {
      throw UninitializedPropertyAccessException("Cannot access property pressed: has no getter")
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_SET_PRESSED, NIL)
    }

  /**
   * The key scancode, which corresponds to one of the [enum KeyList] constants.
   *
   * To get a human-readable representation of the [godot.InputEventKey], use `OS.get_scancode_string(event.scancode)` where `event` is the [godot.InputEventKey].
   */
  open var scancode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_GET_SCANCODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_SET_SCANCODE, NIL)
    }

  /**
   * The key Unicode identifier (when relevant). Unicode identifiers for the composite characters and complex scripts may not be available unless IME input mode is active. See [godot.OS.setImeActive] for more information.
   */
  open var unicode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_GET_UNICODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_SET_UNICODE, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_INPUTEVENTKEY)
  }

  /**
   * Returns the scancode combined with modifier keys such as `Shift` or `Alt`. See also [godot.InputEventWithModifiers].
   *
   * To get a human-readable representation of the [godot.InputEventKey] with modifiers, use `OS.get_scancode_string(event.get_scancode_with_modifiers())` where `event` is the [godot.InputEventKey].
   */
  open fun getScancodeWithModifiers(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_GET_SCANCODE_WITH_MODIFIERS, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }
}
