// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * [Button] is the standard themed button. It can contain text and an icon, and it will display them
 * according to the current [Theme].
 * **Example of creating a button and assigning an action when pressed by code:**
 *
 * gdscript:
 * ```gdscript
 * func _ready():
 *     var button = Button.new()
 *     button.text = "Click me"
 *     button.pressed.connect(self._button_pressed)
 *     add_child(button)
 *
 * func _button_pressed():
 *     print("Hello world!")
 * ```
 * csharp:
 * ```csharp
 * public override void _Ready()
 * {
 *     var button = new Button();
 *     button.Text = "Click me";
 *     button.Pressed += ButtonPressed;
 *     AddChild(button);
 * }
 *
 * private void ButtonPressed()
 * {
 *     GD.Print("Hello world!");
 * }
 * ```
 *
 * See also [BaseButton] which contains common properties and methods associated with this node.
 * **Note:** Buttons do not interpret touch input and therefore don't support multitouch, since
 * mouse emulation can only press one button at a given time. Use [TouchScreenButton] for buttons that
 * trigger gameplay movement or actions.
 */
@GodotBaseType
public open class Button : BaseButton() {
  /**
   * The button's text that will be displayed inside the button's area.
   */
  public var text: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextPtr, NIL)
    }

  /**
   * Button's icon, if text is present the icon will be placed before the text.
   * To edit margin and spacing of the icon, use [theme_item h_separation] theme property and
   * `content_margin_*` properties of the used [StyleBox]es.
   */
  public var icon: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getButtonIconPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setButtonIconPtr, NIL)
    }

  /**
   * Flat buttons don't display decoration.
   */
  public var flat: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFlatPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFlatPtr, NIL)
    }

  /**
   * Text alignment policy for the button's text, use one of the [enum HorizontalAlignment]
   * constants.
   */
  public var alignment: HorizontalAlignment
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextAlignmentPtr, LONG)
      return HorizontalAlignment.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextAlignmentPtr, NIL)
    }

  /**
   * Sets the clipping behavior when the text exceeds the node's bounding rectangle. See [enum
   * TextServer.OverrunBehavior] for a description of all modes.
   */
  public var textOverrunBehavior: TextServer.OverrunBehavior
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextOverrunBehaviorPtr, LONG)
      return TextServer.OverrunBehavior.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextOverrunBehaviorPtr, NIL)
    }

  /**
   * When this property is enabled, text that is too large to fit the button is clipped, when
   * disabled the Button will always be wide enough to hold the text.
   */
  public var clipText: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getClipTextPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setClipTextPtr, NIL)
    }

  /**
   * Specifies if the icon should be aligned horizontally to the left, right, or center of a button.
   * Uses the same [enum HorizontalAlignment] constants as the text alignment. If centered horizontally
   * and vertically, text will draw on top of the icon.
   */
  public var iconAlignment: HorizontalAlignment
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getIconAlignmentPtr, LONG)
      return HorizontalAlignment.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setIconAlignmentPtr, NIL)
    }

  /**
   * Specifies if the icon should be aligned vertically to the top, bottom, or center of a button.
   * Uses the same [enum VerticalAlignment] constants as the text alignment. If centered horizontally
   * and vertically, text will draw on top of the icon.
   */
  public var verticalIconAlignment: VerticalAlignment
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVerticalIconAlignmentPtr, LONG)
      return VerticalAlignment.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setVerticalIconAlignmentPtr, NIL)
    }

  /**
   * When enabled, the button's icon will expand/shrink to fit the button's size while keeping its
   * aspect. See also [theme_item icon_max_width].
   */
  public var expandIcon: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isExpandIconPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setExpandIconPtr, NIL)
    }

  /**
   * Base text writing direction.
   */
  public var textDirection: Control.TextDirection
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextDirectionPtr, LONG)
      return Control.TextDirection.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextDirectionPtr, NIL)
    }

  /**
   * Language code used for line-breaking and text shaping algorithms, if left empty current locale
   * is used instead.
   */
  public var language: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLanguagePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLanguagePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_BUTTON, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setTextPtr: VoidPtr = TypeManager.getMethodBindPtr("Button", "set_text")

    public val getTextPtr: VoidPtr = TypeManager.getMethodBindPtr("Button", "get_text")

    public val setTextOverrunBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Button", "set_text_overrun_behavior")

    public val getTextOverrunBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Button", "get_text_overrun_behavior")

    public val setTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Button", "set_text_direction")

    public val getTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Button", "get_text_direction")

    public val setLanguagePtr: VoidPtr = TypeManager.getMethodBindPtr("Button", "set_language")

    public val getLanguagePtr: VoidPtr = TypeManager.getMethodBindPtr("Button", "get_language")

    public val setButtonIconPtr: VoidPtr = TypeManager.getMethodBindPtr("Button", "set_button_icon")

    public val getButtonIconPtr: VoidPtr = TypeManager.getMethodBindPtr("Button", "get_button_icon")

    public val setFlatPtr: VoidPtr = TypeManager.getMethodBindPtr("Button", "set_flat")

    public val isFlatPtr: VoidPtr = TypeManager.getMethodBindPtr("Button", "is_flat")

    public val setClipTextPtr: VoidPtr = TypeManager.getMethodBindPtr("Button", "set_clip_text")

    public val getClipTextPtr: VoidPtr = TypeManager.getMethodBindPtr("Button", "get_clip_text")

    public val setTextAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Button", "set_text_alignment")

    public val getTextAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Button", "get_text_alignment")

    public val setIconAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Button", "set_icon_alignment")

    public val getIconAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Button", "get_icon_alignment")

    public val setVerticalIconAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Button", "set_vertical_icon_alignment")

    public val getVerticalIconAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Button", "get_vertical_icon_alignment")

    public val setExpandIconPtr: VoidPtr = TypeManager.getMethodBindPtr("Button", "set_expand_icon")

    public val isExpandIconPtr: VoidPtr = TypeManager.getMethodBindPtr("Button", "is_expand_icon")
  }
}
