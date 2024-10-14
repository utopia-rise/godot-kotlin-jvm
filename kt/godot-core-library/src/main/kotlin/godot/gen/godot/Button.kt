// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.TypeManager
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
    callConstructor(ENGINECLASS_BUTTON, scriptIndex)
  }

  public final fun setText(text: String): Unit {
    TransferContext.writeArguments(STRING to text)
    TransferContext.callMethod(ptr, MethodBindings.setTextPtr, NIL)
  }

  public final fun getText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setTextOverrunBehavior(overrunBehavior: TextServer.OverrunBehavior): Unit {
    TransferContext.writeArguments(LONG to overrunBehavior.id)
    TransferContext.callMethod(ptr, MethodBindings.setTextOverrunBehaviorPtr, NIL)
  }

  public final fun getTextOverrunBehavior(): TextServer.OverrunBehavior {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTextOverrunBehaviorPtr, LONG)
    return TextServer.OverrunBehavior.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setAutowrapMode(autowrapMode: TextServer.AutowrapMode): Unit {
    TransferContext.writeArguments(LONG to autowrapMode.id)
    TransferContext.callMethod(ptr, MethodBindings.setAutowrapModePtr, NIL)
  }

  public final fun getAutowrapMode(): TextServer.AutowrapMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAutowrapModePtr, LONG)
    return TextServer.AutowrapMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setTextDirection(direction: Control.TextDirection): Unit {
    TransferContext.writeArguments(LONG to direction.id)
    TransferContext.callMethod(ptr, MethodBindings.setTextDirectionPtr, NIL)
  }

  public final fun getTextDirection(): Control.TextDirection {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTextDirectionPtr, LONG)
    return Control.TextDirection.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setLanguage(language: String): Unit {
    TransferContext.writeArguments(STRING to language)
    TransferContext.callMethod(ptr, MethodBindings.setLanguagePtr, NIL)
  }

  public final fun getLanguage(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLanguagePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setButtonIcon(texture: Texture2D?): Unit {
    TransferContext.writeArguments(OBJECT to texture)
    TransferContext.callMethod(ptr, MethodBindings.setButtonIconPtr, NIL)
  }

  public final fun getButtonIcon(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getButtonIconPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun setFlat(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setFlatPtr, NIL)
  }

  public final fun isFlat(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isFlatPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setClipText(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setClipTextPtr, NIL)
  }

  public final fun getClipText(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getClipTextPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setTextAlignment(alignment: HorizontalAlignment): Unit {
    TransferContext.writeArguments(LONG to alignment.id)
    TransferContext.callMethod(ptr, MethodBindings.setTextAlignmentPtr, NIL)
  }

  public final fun getTextAlignment(): HorizontalAlignment {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTextAlignmentPtr, LONG)
    return HorizontalAlignment.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setIconAlignment(iconAlignment: HorizontalAlignment): Unit {
    TransferContext.writeArguments(LONG to iconAlignment.id)
    TransferContext.callMethod(ptr, MethodBindings.setIconAlignmentPtr, NIL)
  }

  public final fun getIconAlignment(): HorizontalAlignment {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getIconAlignmentPtr, LONG)
    return HorizontalAlignment.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setVerticalIconAlignment(verticalIconAlignment: VerticalAlignment): Unit {
    TransferContext.writeArguments(LONG to verticalIconAlignment.id)
    TransferContext.callMethod(ptr, MethodBindings.setVerticalIconAlignmentPtr, NIL)
  }

  public final fun getVerticalIconAlignment(): VerticalAlignment {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVerticalIconAlignmentPtr, LONG)
    return VerticalAlignment.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setExpandIcon(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setExpandIconPtr, NIL)
  }

  public final fun isExpandIcon(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isExpandIconPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setTextPtr: VoidPtr = TypeManager.getMethodBindPtr("Button", "set_text", 83702148)

    public val getTextPtr: VoidPtr = TypeManager.getMethodBindPtr("Button", "get_text", 201670096)

    public val setTextOverrunBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Button", "set_text_overrun_behavior", 1008890932)

    public val getTextOverrunBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Button", "get_text_overrun_behavior", 3779142101)

    public val setAutowrapModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Button", "set_autowrap_mode", 3289138044)

    public val getAutowrapModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Button", "get_autowrap_mode", 1549071663)

    public val setTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Button", "set_text_direction", 119160795)

    public val getTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Button", "get_text_direction", 797257663)

    public val setLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Button", "set_language", 83702148)

    public val getLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Button", "get_language", 201670096)

    public val setButtonIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Button", "set_button_icon", 4051416890)

    public val getButtonIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Button", "get_button_icon", 3635182373)

    public val setFlatPtr: VoidPtr = TypeManager.getMethodBindPtr("Button", "set_flat", 2586408642)

    public val isFlatPtr: VoidPtr = TypeManager.getMethodBindPtr("Button", "is_flat", 36873697)

    public val setClipTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Button", "set_clip_text", 2586408642)

    public val getClipTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Button", "get_clip_text", 36873697)

    public val setTextAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Button", "set_text_alignment", 2312603777)

    public val getTextAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Button", "get_text_alignment", 341400642)

    public val setIconAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Button", "set_icon_alignment", 2312603777)

    public val getIconAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Button", "get_icon_alignment", 341400642)

    public val setVerticalIconAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Button", "set_vertical_icon_alignment", 1796458609)

    public val getVerticalIconAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Button", "get_vertical_icon_alignment", 3274884059)

    public val setExpandIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Button", "set_expand_icon", 2586408642)

    public val isExpandIconPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Button", "is_expand_icon", 36873697)
  }
}
