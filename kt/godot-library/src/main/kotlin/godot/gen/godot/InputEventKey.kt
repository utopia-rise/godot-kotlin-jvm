// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
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
   * If `true`, the key's state is pressed. If `false`, the key's state is released.
   */
  public var pressed: Boolean
    @JvmName("isPressed_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.isPressed()
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_SET_PRESSED, NIL)
    }

  /**
   * The key keycode, which corresponds to one of the [enum Key] constants. Represent key in the current keyboard layout.
   *
   * To get a human-readable representation of the [godot.InputEventKey], use `OS.get_keycode_string(event.keycode)` where `event` is the [godot.InputEventKey].
   */
  public var keycode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_GET_KEYCODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_SET_KEYCODE, NIL)
    }

  /**
   * Key physical keycode, which corresponds to one of the [enum Key] constants. Represent the physical location of a key on the 101/102-key US QWERTY keyboard.
   *
   * To get a human-readable representation of the [godot.InputEventKey], use `OS.get_keycode_string(event.keycode)` where `event` is the [godot.InputEventKey].
   */
  public var physicalKeycode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_GET_PHYSICAL_KEYCODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_SET_PHYSICAL_KEYCODE, NIL)
    }

  /**
   * The key Unicode identifier (when relevant). Unicode identifiers for the composite characters and complex scripts may not be available unless IME input mode is active. See [godot.Window.setImeActive] for more information.
   */
  public var unicode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_GET_UNICODE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_SET_UNICODE, NIL)
    }

  /**
   * If `true`, the key was already pressed before this event. It means the user is holding the key down.
   */
  public var echo: Boolean
    @JvmName("isEcho_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.isEcho()
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_SET_ECHO, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_INPUTEVENTKEY, scriptIndex)
    return true
  }

  /**
   * Returns the keycode combined with modifier keys such as [kbd]Shift[/kbd] or [kbd]Alt[/kbd]. See also [godot.InputEventWithModifiers].
   *
   * To get a human-readable representation of the [godot.InputEventKey] with modifiers, use `OS.get_keycode_string(event.get_keycode_with_modifiers())` where `event` is the [godot.InputEventKey].
   */
  public fun getKeycodeWithModifiers(): Key {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_GET_KEYCODE_WITH_MODIFIERS, LONG)
    return Key.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the physical keycode combined with modifier keys such as [kbd]Shift[/kbd] or [kbd]Alt[/kbd]. See also [godot.InputEventWithModifiers].
   *
   * To get a human-readable representation of the [godot.InputEventKey] with modifiers, use `OS.get_keycode_string(event.get_physical_keycode_with_modifiers())` where `event` is the [godot.InputEventKey].
   */
  public fun getPhysicalKeycodeWithModifiers(): Key {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_INPUTEVENTKEY_GET_PHYSICAL_KEYCODE_WITH_MODIFIERS, LONG)
    return Key.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public companion object
}
