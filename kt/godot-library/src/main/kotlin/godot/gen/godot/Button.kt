// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * A themed button that can contain text and an icon.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/677](https://godotengine.org/asset-library/asset/677)
 *
 * [godot.Button] is the standard themed button. It can contain text and an icon, and it will display them according to the current [godot.Theme].
 *
 * **Example of creating a button and assigning an action when pressed by code:**
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * func _ready():
 *
 *     var button = Button.new()
 *
 *     button.text = "Click me"
 *
 *     button.pressed.connect(self._button_pressed)
 *
 *     add_child(button)
 *
 *
 *
 * func _button_pressed():
 *
 *     print("Hello world!")
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * public override void _Ready()
 *
 * {
 *
 *     var button = new Button();
 *
 *     button.Text = "Click me";
 *
 *     button.Pressed += ButtonPressed;
 *
 *     AddChild(button);
 *
 * }
 *
 *
 *
 * private void ButtonPressed()
 *
 * {
 *
 *     GD.Print("Hello world!");
 *
 * }
 *
 * [/csharp]
 *
 * [/codeblocks]
 *
 * See also [godot.BaseButton] which contains common properties and methods associated with this node.
 *
 * **Note:** Buttons do not interpret touch input and therefore don't support multitouch, since mouse emulation can only press one button at a given time. Use [godot.TouchScreenButton] for buttons that trigger gameplay movement or actions.
 */
@GodotBaseType
public open class Button : BaseButton() {
  /**
   * The button's text that will be displayed inside the button's area.
   */
  public var text: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_GET_TEXT, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_SET_TEXT, NIL)
    }

  /**
   * Button's icon, if text is present the icon will be placed before the text.
   *
   * To edit margin and spacing of the icon, use [theme_item h_separation] theme property and `content_margin_*` properties of the used [godot.StyleBox]es.
   */
  public var icon: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_GET_BUTTON_ICON, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_SET_BUTTON_ICON, NIL)
    }

  /**
   * Flat buttons don't display decoration.
   */
  public var flat: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_IS_FLAT, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_SET_FLAT, NIL)
    }

  /**
   * Text alignment policy for the button's text, use one of the [enum HorizontalAlignment] constants.
   */
  public var alignment: HorizontalAlignment
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_GET_TEXT_ALIGNMENT, LONG)
      return HorizontalAlignment.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_SET_TEXT_ALIGNMENT, NIL)
    }

  /**
   * Sets the clipping behavior when the text exceeds the node's bounding rectangle. See [enum TextServer.OverrunBehavior] for a description of all modes.
   */
  public var textOverrunBehavior: TextServer.OverrunBehavior
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_GET_TEXT_OVERRUN_BEHAVIOR,
          LONG)
      return TextServer.OverrunBehavior.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_SET_TEXT_OVERRUN_BEHAVIOR,
          NIL)
    }

  /**
   * When this property is enabled, text that is too large to fit the button is clipped, when disabled the Button will always be wide enough to hold the text.
   */
  public var clipText: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_GET_CLIP_TEXT, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_SET_CLIP_TEXT, NIL)
    }

  /**
   * Specifies if the icon should be aligned horizontally to the left, right, or center of a button. Uses the same [enum HorizontalAlignment] constants as the text alignment. If centered horizontally and vertically, text will draw on top of the icon.
   */
  public var iconAlignment: HorizontalAlignment
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_GET_ICON_ALIGNMENT, LONG)
      return HorizontalAlignment.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_SET_ICON_ALIGNMENT, NIL)
    }

  /**
   * Specifies if the icon should be aligned vertically to the top, bottom, or center of a button. Uses the same [enum VerticalAlignment] constants as the text alignment. If centered horizontally and vertically, text will draw on top of the icon.
   */
  public var verticalIconAlignment: VerticalAlignment
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BUTTON_GET_VERTICAL_ICON_ALIGNMENT, LONG)
      return VerticalAlignment.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_BUTTON_SET_VERTICAL_ICON_ALIGNMENT, NIL)
    }

  /**
   * When enabled, the button's icon will expand/shrink to fit the button's size while keeping its aspect. See also [theme_item icon_max_width].
   */
  public var expandIcon: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_IS_EXPAND_ICON, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_SET_EXPAND_ICON, NIL)
    }

  /**
   * Base text writing direction.
   */
  public var textDirection: Control.TextDirection
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_GET_TEXT_DIRECTION, LONG)
      return Control.TextDirection.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_SET_TEXT_DIRECTION, NIL)
    }

  /**
   * Language code used for line-breaking and text shaping algorithms, if left empty current locale is used instead.
   */
  public var language: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_GET_LANGUAGE, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_SET_LANGUAGE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_BUTTON, scriptIndex)
    return true
  }

  public companion object
}
