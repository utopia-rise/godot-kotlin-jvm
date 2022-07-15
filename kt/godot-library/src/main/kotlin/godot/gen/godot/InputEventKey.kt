// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Input event type for keyboard events.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/inputs/inputevent.html]($DOCS_URL/tutorials/inputs/inputevent.html)
 *
 * Stores key presses on the keyboard. Supports key presses, key releases and [echo] events.
 */
@GodotBaseType
public open class InputEventKey : InputEventWithModifiers() {
  /**
   * If `true`, the key was already pressed before this event. It means the user is holding the key down.
   */
  public open var echo: Boolean
    @JvmName("isEcho_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.isEcho()
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_SET_ECHO, NIL)
    }

  /**
   * Key physical scancode, which corresponds to one of the [enum KeyList] constants. Represent the physical location of a key on the 101/102-key US QWERTY keyboard.
   *
   * To get a human-readable representation of the [godot.InputEventKey], use `OS.get_scancode_string(event.physical_scancode)` where `event` is the [godot.InputEventKey].
   */
  public open var physicalScancode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_GET_PHYSICAL_SCANCODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_SET_PHYSICAL_SCANCODE, NIL)
    }

  /**
   * If `true`, the key's state is pressed. If `false`, the key's state is released.
   */
  public open var pressed: Boolean
    @JvmName("isPressed_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.isPressed()
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_SET_PRESSED, NIL)
    }

  /**
   * The key scancode, which corresponds to one of the [enum KeyList] constants. Represent key in the current keyboard layout.
   *
   * To get a human-readable representation of the [godot.InputEventKey], use `OS.get_scancode_string(event.scancode)` where `event` is the [godot.InputEventKey].
   */
  public open var scancode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_GET_SCANCODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_SET_SCANCODE, NIL)
    }

  /**
   * The key Unicode identifier (when relevant). Unicode identifiers for the composite characters and complex scripts may not be available unless IME input mode is active. See [godot.OS.setImeActive] for more information.
   */
  public open var unicode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_GET_UNICODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_SET_UNICODE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_INPUTEVENTKEY)
  }

  /**
   * Returns the physical scancode combined with modifier keys such as `Shift` or `Alt`. See also [godot.InputEventWithModifiers].
   *
   * To get a human-readable representation of the [godot.InputEventKey] with modifiers, use `OS.get_scancode_string(event.get_physical_scancode_with_modifiers())` where `event` is the [godot.InputEventKey].
   */
  public open fun getPhysicalScancodeWithModifiers(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_GET_PHYSICAL_SCANCODE_WITH_MODIFIERS, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the scancode combined with modifier keys such as `Shift` or `Alt`. See also [godot.InputEventWithModifiers].
   *
   * To get a human-readable representation of the [godot.InputEventKey] with modifiers, use `OS.get_scancode_string(event.get_scancode_with_modifiers())` where `event` is the [godot.InputEventKey].
   */
  public open fun getScancodeWithModifiers(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_GET_SCANCODE_WITH_MODIFIERS, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }
}
