// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_INPUTEVENTKEY_INDEX: Int = 319

/**
 * An input event for keys on a keyboard. Supports key presses, key releases and [echo] events. It
 * can also be received in [Node.UnhandledKeyInput].
 * **Note:** Events received from the keyboard usually have all properties set. Event mappings
 * should have only one of the [keycode], [physicalKeycode] or [unicode] set.
 * When events are compared, properties are checked in the following priority - [keycode],
 * [physicalKeycode] and [unicode]. Events with the first matching value will be considered equal.
 */
@GodotBaseType
public open class InputEventKey : InputEventWithModifiers() {
  /**
   * If `true`, the key's state is pressed. If `false`, the key's state is released.
   */
  public final inline var pressed: Boolean
    @JvmName("pressedProperty")
    get() = isPressed()
    @JvmName("pressedProperty")
    set(`value`) {
      setPressed(value)
    }

  /**
   * Latin label printed on the key in the current keyboard layout, which corresponds to one of the
   * [Key] constants.
   * To get a human-readable representation of the [InputEventKey], use
   * `OS.get_keycode_string(event.keycode)` where `event` is the [InputEventKey].
   * [codeblock lang=text]
   *     +-----+ +-----+
   *     | Q   | | Q   | - "Q" - keycode
   *     |   Й | |  ض | - "Й" and "ض" - key_label
   *     +-----+ +-----+
   * [/codeblock]
   */
  public final inline var keycode: Key
    @JvmName("keycodeProperty")
    get() = getKeycode()
    @JvmName("keycodeProperty")
    set(`value`) {
      setKeycode(value)
    }

  /**
   * Represents the physical location of a key on the 101/102-key US QWERTY keyboard, which
   * corresponds to one of the [Key] constants.
   * To get a human-readable representation of the [InputEventKey], use [OS.getKeycodeString] in
   * combination with [DisplayServer.keyboardGetKeycodeFromPhysical]:
   *
   * gdscript:
   * ```gdscript
   * func _input(event):
   *     if event is InputEventKey:
   *         var keycode = DisplayServer.keyboard_get_keycode_from_physical(event.physical_keycode)
   *         print(OS.get_keycode_string(keycode))
   * ```
   * csharp:
   * ```csharp
   * public override void _Input(InputEvent @event)
   * {
   *     if (@event is InputEventKey inputEventKey)
   *     {
   *         var keycode =
   * DisplayServer.KeyboardGetKeycodeFromPhysical(inputEventKey.PhysicalKeycode);
   *         GD.Print(OS.GetKeycodeString(keycode));
   *     }
   * }
   * ```
   */
  public final inline var physicalKeycode: Key
    @JvmName("physicalKeycodeProperty")
    get() = getPhysicalKeycode()
    @JvmName("physicalKeycodeProperty")
    set(`value`) {
      setPhysicalKeycode(value)
    }

  /**
   * Represents the localized label printed on the key in the current keyboard layout, which
   * corresponds to one of the [Key] constants or any valid Unicode character.
   * For keyboard layouts with a single label on the key, it is equivalent to [keycode].
   * To get a human-readable representation of the [InputEventKey], use
   * `OS.get_keycode_string(event.key_label)` where `event` is the [InputEventKey].
   * [codeblock lang=text]
   *     +-----+ +-----+
   *     | Q   | | Q   | - "Q" - keycode
   *     |   Й | |  ض | - "Й" and "ض" - key_label
   *     +-----+ +-----+
   * [/codeblock]
   */
  public final inline var keyLabel: Key
    @JvmName("keyLabelProperty")
    get() = getKeyLabel()
    @JvmName("keyLabelProperty")
    set(`value`) {
      setKeyLabel(value)
    }

  /**
   * The key Unicode character code (when relevant), shifted by modifier keys. Unicode character
   * codes for composite characters and complex scripts may not be available unless IME input mode is
   * active. See [Window.setImeActive] for more information.
   */
  public final inline var unicode: Long
    @JvmName("unicodeProperty")
    get() = getUnicode()
    @JvmName("unicodeProperty")
    set(`value`) {
      setUnicode(value)
    }

  /**
   * Represents the location of a key which has both left and right versions, such as
   * [kbd]Shift[/kbd] or [kbd]Alt[/kbd].
   */
  public final inline var location: KeyLocation
    @JvmName("locationProperty")
    get() = getLocation()
    @JvmName("locationProperty")
    set(`value`) {
      setLocation(value)
    }

  /**
   * If `true`, the key was already pressed before this event. An echo event is a repeated key event
   * sent when the user is holding down the key.
   * **Note:** The rate at which echo events are sent is typically around 20 events per second
   * (after holding down the key for roughly half a second). However, the key repeat delay/speed can be
   * changed by the user or disabled entirely in the operating system settings. To ensure your project
   * works correctly on all configurations, do not assume the user has a specific key repeat
   * configuration in your project's behavior.
   */
  public final inline var echo: Boolean
    @JvmName("echoProperty")
    get() = isEcho()
    @JvmName("echoProperty")
    set(`value`) {
      setEcho(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_INPUTEVENTKEY_INDEX, scriptIndex)
  }

  public final fun setPressed(pressed: Boolean): Unit {
    Internals.writeArguments(BOOL to pressed)
    Internals.callMethod(rawPtr, MethodBindings.setPressedPtr, NIL)
  }

  public final fun setKeycode(keycode: Key): Unit {
    Internals.writeArguments(LONG to keycode.id)
    Internals.callMethod(rawPtr, MethodBindings.setKeycodePtr, NIL)
  }

  public final fun getKeycode(): Key {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getKeycodePtr, LONG)
    return Key.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setPhysicalKeycode(physicalKeycode: Key): Unit {
    Internals.writeArguments(LONG to physicalKeycode.id)
    Internals.callMethod(rawPtr, MethodBindings.setPhysicalKeycodePtr, NIL)
  }

  public final fun getPhysicalKeycode(): Key {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPhysicalKeycodePtr, LONG)
    return Key.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setKeyLabel(keyLabel: Key): Unit {
    Internals.writeArguments(LONG to keyLabel.id)
    Internals.callMethod(rawPtr, MethodBindings.setKeyLabelPtr, NIL)
  }

  public final fun getKeyLabel(): Key {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getKeyLabelPtr, LONG)
    return Key.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setUnicode(unicode: Long): Unit {
    Internals.writeArguments(LONG to unicode)
    Internals.callMethod(rawPtr, MethodBindings.setUnicodePtr, NIL)
  }

  public final fun getUnicode(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getUnicodePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  public final fun setLocation(location: KeyLocation): Unit {
    Internals.writeArguments(LONG to location.id)
    Internals.callMethod(rawPtr, MethodBindings.setLocationPtr, NIL)
  }

  public final fun getLocation(): KeyLocation {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLocationPtr, LONG)
    return KeyLocation.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setEcho(echo: Boolean): Unit {
    Internals.writeArguments(BOOL to echo)
    Internals.callMethod(rawPtr, MethodBindings.setEchoPtr, NIL)
  }

  /**
   * Returns the Latin keycode combined with modifier keys such as [kbd]Shift[/kbd] or
   * [kbd]Alt[/kbd]. See also [InputEventWithModifiers].
   * To get a human-readable representation of the [InputEventKey] with modifiers, use
   * `OS.get_keycode_string(event.get_keycode_with_modifiers())` where `event` is the [InputEventKey].
   */
  public final fun getKeycodeWithModifiers(): Key {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getKeycodeWithModifiersPtr, LONG)
    return Key.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the physical keycode combined with modifier keys such as [kbd]Shift[/kbd] or
   * [kbd]Alt[/kbd]. See also [InputEventWithModifiers].
   * To get a human-readable representation of the [InputEventKey] with modifiers, use
   * `OS.get_keycode_string(event.get_physical_keycode_with_modifiers())` where `event` is the
   * [InputEventKey].
   */
  public final fun getPhysicalKeycodeWithModifiers(): Key {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPhysicalKeycodeWithModifiersPtr, LONG)
    return Key.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the localized key label combined with modifier keys such as [kbd]Shift[/kbd] or
   * [kbd]Alt[/kbd]. See also [InputEventWithModifiers].
   * To get a human-readable representation of the [InputEventKey] with modifiers, use
   * `OS.get_keycode_string(event.get_key_label_with_modifiers())` where `event` is the
   * [InputEventKey].
   */
  public final fun getKeyLabelWithModifiers(): Key {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getKeyLabelWithModifiersPtr, LONG)
    return Key.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns a [String] representation of the event's [keycode] and modifiers.
   */
  public final fun asTextKeycode(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.asTextKeycodePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns a [String] representation of the event's [physicalKeycode] and modifiers.
   */
  public final fun asTextPhysicalKeycode(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.asTextPhysicalKeycodePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns a [String] representation of the event's [keyLabel] and modifiers.
   */
  public final fun asTextKeyLabel(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.asTextKeyLabelPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  /**
   * Returns a [String] representation of the event's [location]. This will be a blank string if the
   * event is not specific to a location.
   */
  public final fun asTextLocation(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.asTextLocationPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public companion object

  internal object MethodBindings {
    public val setPressedPtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventKey", "set_pressed", 2586408642)

    public val setKeycodePtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventKey", "set_keycode", 888074362)

    public val getKeycodePtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventKey", "get_keycode", 1585896689)

    public val setPhysicalKeycodePtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventKey", "set_physical_keycode", 888074362)

    public val getPhysicalKeycodePtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventKey", "get_physical_keycode", 1585896689)

    public val setKeyLabelPtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventKey", "set_key_label", 888074362)

    public val getKeyLabelPtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventKey", "get_key_label", 1585896689)

    public val setUnicodePtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventKey", "set_unicode", 1286410249)

    public val getUnicodePtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventKey", "get_unicode", 3905245786)

    public val setLocationPtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventKey", "set_location", 634453155)

    public val getLocationPtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventKey", "get_location", 211810873)

    public val setEchoPtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventKey", "set_echo", 2586408642)

    public val getKeycodeWithModifiersPtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventKey", "get_keycode_with_modifiers", 1585896689)

    public val getPhysicalKeycodeWithModifiersPtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventKey", "get_physical_keycode_with_modifiers", 1585896689)

    public val getKeyLabelWithModifiersPtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventKey", "get_key_label_with_modifiers", 1585896689)

    public val asTextKeycodePtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventKey", "as_text_keycode", 201670096)

    public val asTextPhysicalKeycodePtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventKey", "as_text_physical_keycode", 201670096)

    public val asTextKeyLabelPtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventKey", "as_text_key_label", 201670096)

    public val asTextLocationPtr: VoidPtr =
        Internals.getMethodBindPtr("InputEventKey", "as_text_location", 201670096)
  }
}
