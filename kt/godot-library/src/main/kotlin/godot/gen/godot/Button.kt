// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Standard themed Button.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/677](https://godotengine.org/asset-library/asset/677)
 *
 * Button is the standard themed button. It can contain text and an icon, and will display them according to the current [godot.Theme].
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
 *     button.connect("pressed", self, "_button_pressed")
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
 *     button.Connect("pressed", this, nameof(ButtonPressed));
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
 * Buttons (like all Control nodes) can also be created in the editor, but some situations may require creating them from code.
 *
 * See also [godot.BaseButton] which contains common properties and methods associated with this node.
 *
 * **Note:** Buttons do not interpret touch input and therefore don't support multitouch, since mouse emulation can only press one button at a given time. Use [godot.TouchScreenButton] for buttons that trigger gameplay movement or actions, as [godot.TouchScreenButton] supports multitouch.
 */
@GodotBaseType
public open class Button : BaseButton() {
  /**
   * The button's text that will be displayed inside the button's area.
   */
  public open var text: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_GET_TEXT, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_SET_TEXT, NIL)
    }

  /**
   * Base text writing direction.
   */
  public open var textDirection: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_GET_TEXT_DIRECTION, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_SET_TEXT_DIRECTION, NIL)
    }

  /**
   * Language code used for line-breaking and text shaping algorithms, if left empty current locale is used instead.
   */
  public open var language: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_GET_LANGUAGE, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_SET_LANGUAGE, NIL)
    }

  /**
   * Button's icon, if text is present the icon will be placed before the text.
   *
   * To edit margin and spacing of the icon, use [theme_item hseparation] theme property and `content_margin_*` properties of the used [godot.StyleBox]es.
   */
  public open var icon: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_GET_ICON, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_SET_ICON, NIL)
    }

  /**
   * Flat buttons don't display decoration.
   */
  public open var flat: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_GET_FLAT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_SET_FLAT, NIL)
    }

  /**
   * When this property is enabled, text that is too large to fit the button is clipped, when disabled the Button will always be wide enough to hold the text.
   */
  public open var clipText: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_GET_CLIP_TEXT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_SET_CLIP_TEXT, NIL)
    }

  /**
   * Text alignment policy for the button's text, use one of the [enum @GlobalScope.HorizontalAlignment] constants.
   */
  public open var alignment: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_GET_ALIGNMENT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_SET_ALIGNMENT, NIL)
    }

  /**
   * Specifies if the icon should be aligned to the left, right, or center of a button. Uses the same [enum @GlobalScope.HorizontalAlignment] constants as the text alignment. If centered, text will draw on top of the icon.
   */
  public open var iconAlignment: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_GET_ICON_ALIGNMENT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_SET_ICON_ALIGNMENT, NIL)
    }

  /**
   * When enabled, the button's icon will expand/shrink to fit the button's size while keeping its aspect.
   */
  public open var expandIcon: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_GET_EXPAND_ICON, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_SET_EXPAND_ICON, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_BUTTON)
  }

  /**
   * Sets OpenType feature `tag`. More info: [godot.OpenType feature tags](https://docs.microsoft.com/en-us/typography/opentype/spec/featuretags).
   */
  public open fun setOpentypeFeature(tag: String, `value`: Long): Unit {
    TransferContext.writeArguments(STRING to tag, LONG to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_SET_OPENTYPE_FEATURE, NIL)
  }

  /**
   * Returns OpenType feature `tag`.
   */
  public open fun getOpentypeFeature(tag: String): Long {
    TransferContext.writeArguments(STRING to tag)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_GET_OPENTYPE_FEATURE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Removes all OpenType features.
   */
  public open fun clearOpentypeFeatures(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BUTTON_CLEAR_OPENTYPE_FEATURES, NIL)
  }

  public companion object
}
