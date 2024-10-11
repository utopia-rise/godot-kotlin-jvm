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
import godot.core.VariantParser.OBJECT
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

private const val ENGINE_CLASS_BUTTON_INDEX: Int = 147

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
  public final inline var text: String
    @JvmName("textProperty")
    get() = getText()
    @JvmName("textProperty")
    set(`value`) {
      setText(value)
    }

  /**
   * Button's icon, if text is present the icon will be placed before the text.
   * To edit margin and spacing of the icon, use [theme_item h_separation] theme property and
   * `content_margin_*` properties of the used [StyleBox]es.
   */
  public final inline var icon: Texture2D?
    @JvmName("iconProperty")
    get() = getButtonIcon()
    @JvmName("iconProperty")
    set(`value`) {
      setButtonIcon(value)
    }

  /**
   * Flat buttons don't display decoration.
   */
  public final inline var flat: Boolean
    @JvmName("flatProperty")
    get() = isFlat()
    @JvmName("flatProperty")
    set(`value`) {
      setFlat(value)
    }

  /**
   * Text alignment policy for the button's text, use one of the [HorizontalAlignment] constants.
   */
  public final inline var alignment: HorizontalAlignment
    @JvmName("alignmentProperty")
    get() = getTextAlignment()
    @JvmName("alignmentProperty")
    set(`value`) {
      setTextAlignment(value)
    }

  /**
   * Sets the clipping behavior when the text exceeds the node's bounding rectangle. See
   * [TextServer.OverrunBehavior] for a description of all modes.
   */
  public final inline var textOverrunBehavior: TextServer.OverrunBehavior
    @JvmName("textOverrunBehaviorProperty")
    get() = getTextOverrunBehavior()
    @JvmName("textOverrunBehaviorProperty")
    set(`value`) {
      setTextOverrunBehavior(value)
    }

  /**
   * If set to something other than [TextServer.AUTOWRAP_OFF], the text gets wrapped inside the
   * node's bounding rectangle.
   */
  public final inline var autowrapMode: TextServer.AutowrapMode
    @JvmName("autowrapModeProperty")
    get() = getAutowrapMode()
    @JvmName("autowrapModeProperty")
    set(`value`) {
      setAutowrapMode(value)
    }

  /**
   * When this property is enabled, text that is too large to fit the button is clipped, when
   * disabled the Button will always be wide enough to hold the text.
   */
  public final inline var clipText: Boolean
    @JvmName("clipTextProperty")
    get() = getClipText()
    @JvmName("clipTextProperty")
    set(`value`) {
      setClipText(value)
    }

  /**
   * Specifies if the icon should be aligned horizontally to the left, right, or center of a button.
   * Uses the same [HorizontalAlignment] constants as the text alignment. If centered horizontally and
   * vertically, text will draw on top of the icon.
   */
  public final inline var iconAlignment: HorizontalAlignment
    @JvmName("iconAlignmentProperty")
    get() = getIconAlignment()
    @JvmName("iconAlignmentProperty")
    set(`value`) {
      setIconAlignment(value)
    }

  /**
   * Specifies if the icon should be aligned vertically to the top, bottom, or center of a button.
   * Uses the same [VerticalAlignment] constants as the text alignment. If centered horizontally and
   * vertically, text will draw on top of the icon.
   */
  public final inline var verticalIconAlignment: VerticalAlignment
    @JvmName("verticalIconAlignmentProperty")
    get() = getVerticalIconAlignment()
    @JvmName("verticalIconAlignmentProperty")
    set(`value`) {
      setVerticalIconAlignment(value)
    }

  /**
   * When enabled, the button's icon will expand/shrink to fit the button's size while keeping its
   * aspect. See also [theme_item icon_max_width].
   */
  public final inline var expandIcon: Boolean
    @JvmName("expandIconProperty")
    get() = isExpandIcon()
    @JvmName("expandIconProperty")
    set(`value`) {
      setExpandIcon(value)
    }

  /**
   * Base text writing direction.
   */
  public final inline var textDirection: Control.TextDirection
    @JvmName("textDirectionProperty")
    get() = getTextDirection()
    @JvmName("textDirectionProperty")
    set(`value`) {
      setTextDirection(value)
    }

  /**
   * Language code used for line-breaking and text shaping algorithms, if left empty current locale
   * is used instead.
   */
  public final inline var language: String
    @JvmName("languageProperty")
    get() = getLanguage()
    @JvmName("languageProperty")
    set(`value`) {
      setLanguage(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_BUTTON_INDEX, scriptIndex)
  }

  public final fun setText(text: String): Unit {
    Internals.writeArguments(STRING to text)
    Internals.callMethod(rawPtr, MethodBindings.setTextPtr, NIL)
  }

  public final fun getText(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTextPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public final fun setTextOverrunBehavior(overrunBehavior: TextServer.OverrunBehavior): Unit {
    Internals.writeArguments(LONG to overrunBehavior.id)
    Internals.callMethod(rawPtr, MethodBindings.setTextOverrunBehaviorPtr, NIL)
  }

  public final fun getTextOverrunBehavior(): TextServer.OverrunBehavior {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTextOverrunBehaviorPtr, LONG)
    return TextServer.OverrunBehavior.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setAutowrapMode(autowrapMode: TextServer.AutowrapMode): Unit {
    Internals.writeArguments(LONG to autowrapMode.id)
    Internals.callMethod(rawPtr, MethodBindings.setAutowrapModePtr, NIL)
  }

  public final fun getAutowrapMode(): TextServer.AutowrapMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAutowrapModePtr, LONG)
    return TextServer.AutowrapMode.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setTextDirection(direction: Control.TextDirection): Unit {
    Internals.writeArguments(LONG to direction.id)
    Internals.callMethod(rawPtr, MethodBindings.setTextDirectionPtr, NIL)
  }

  public final fun getTextDirection(): Control.TextDirection {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTextDirectionPtr, LONG)
    return Control.TextDirection.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setLanguage(language: String): Unit {
    Internals.writeArguments(STRING to language)
    Internals.callMethod(rawPtr, MethodBindings.setLanguagePtr, NIL)
  }

  public final fun getLanguage(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLanguagePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public final fun setButtonIcon(texture: Texture2D?): Unit {
    Internals.writeArguments(OBJECT to texture)
    Internals.callMethod(rawPtr, MethodBindings.setButtonIconPtr, NIL)
  }

  public final fun getButtonIcon(): Texture2D? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getButtonIconPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun setFlat(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setFlatPtr, NIL)
  }

  public final fun isFlat(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isFlatPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setClipText(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setClipTextPtr, NIL)
  }

  public final fun getClipText(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getClipTextPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setTextAlignment(alignment: HorizontalAlignment): Unit {
    Internals.writeArguments(LONG to alignment.id)
    Internals.callMethod(rawPtr, MethodBindings.setTextAlignmentPtr, NIL)
  }

  public final fun getTextAlignment(): HorizontalAlignment {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTextAlignmentPtr, LONG)
    return HorizontalAlignment.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setIconAlignment(iconAlignment: HorizontalAlignment): Unit {
    Internals.writeArguments(LONG to iconAlignment.id)
    Internals.callMethod(rawPtr, MethodBindings.setIconAlignmentPtr, NIL)
  }

  public final fun getIconAlignment(): HorizontalAlignment {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getIconAlignmentPtr, LONG)
    return HorizontalAlignment.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setVerticalIconAlignment(verticalIconAlignment: VerticalAlignment): Unit {
    Internals.writeArguments(LONG to verticalIconAlignment.id)
    Internals.callMethod(rawPtr, MethodBindings.setVerticalIconAlignmentPtr, NIL)
  }

  public final fun getVerticalIconAlignment(): VerticalAlignment {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getVerticalIconAlignmentPtr, LONG)
    return VerticalAlignment.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setExpandIcon(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setExpandIconPtr, NIL)
  }

  public final fun isExpandIcon(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isExpandIconPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  public object MethodBindings {
    internal val setTextPtr: VoidPtr = Internals.getMethodBindPtr("Button", "set_text", 83702148)

    internal val getTextPtr: VoidPtr = Internals.getMethodBindPtr("Button", "get_text", 201670096)

    internal val setTextOverrunBehaviorPtr: VoidPtr =
        Internals.getMethodBindPtr("Button", "set_text_overrun_behavior", 1008890932)

    internal val getTextOverrunBehaviorPtr: VoidPtr =
        Internals.getMethodBindPtr("Button", "get_text_overrun_behavior", 3779142101)

    internal val setAutowrapModePtr: VoidPtr =
        Internals.getMethodBindPtr("Button", "set_autowrap_mode", 3289138044)

    internal val getAutowrapModePtr: VoidPtr =
        Internals.getMethodBindPtr("Button", "get_autowrap_mode", 1549071663)

    internal val setTextDirectionPtr: VoidPtr =
        Internals.getMethodBindPtr("Button", "set_text_direction", 119160795)

    internal val getTextDirectionPtr: VoidPtr =
        Internals.getMethodBindPtr("Button", "get_text_direction", 797257663)

    internal val setLanguagePtr: VoidPtr =
        Internals.getMethodBindPtr("Button", "set_language", 83702148)

    internal val getLanguagePtr: VoidPtr =
        Internals.getMethodBindPtr("Button", "get_language", 201670096)

    internal val setButtonIconPtr: VoidPtr =
        Internals.getMethodBindPtr("Button", "set_button_icon", 4051416890)

    internal val getButtonIconPtr: VoidPtr =
        Internals.getMethodBindPtr("Button", "get_button_icon", 3635182373)

    internal val setFlatPtr: VoidPtr = Internals.getMethodBindPtr("Button", "set_flat", 2586408642)

    internal val isFlatPtr: VoidPtr = Internals.getMethodBindPtr("Button", "is_flat", 36873697)

    internal val setClipTextPtr: VoidPtr =
        Internals.getMethodBindPtr("Button", "set_clip_text", 2586408642)

    internal val getClipTextPtr: VoidPtr =
        Internals.getMethodBindPtr("Button", "get_clip_text", 36873697)

    internal val setTextAlignmentPtr: VoidPtr =
        Internals.getMethodBindPtr("Button", "set_text_alignment", 2312603777)

    internal val getTextAlignmentPtr: VoidPtr =
        Internals.getMethodBindPtr("Button", "get_text_alignment", 341400642)

    internal val setIconAlignmentPtr: VoidPtr =
        Internals.getMethodBindPtr("Button", "set_icon_alignment", 2312603777)

    internal val getIconAlignmentPtr: VoidPtr =
        Internals.getMethodBindPtr("Button", "get_icon_alignment", 341400642)

    internal val setVerticalIconAlignmentPtr: VoidPtr =
        Internals.getMethodBindPtr("Button", "set_vertical_icon_alignment", 1796458609)

    internal val getVerticalIconAlignmentPtr: VoidPtr =
        Internals.getMethodBindPtr("Button", "get_vertical_icon_alignment", 3274884059)

    internal val setExpandIconPtr: VoidPtr =
        Internals.getMethodBindPtr("Button", "set_expand_icon", 2586408642)

    internal val isExpandIconPtr: VoidPtr =
        Internals.getMethodBindPtr("Button", "is_expand_icon", 36873697)
  }
}
