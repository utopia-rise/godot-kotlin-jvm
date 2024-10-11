// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.TextServer.JustificationFlagValue
import godot.`annotation`.GodotBaseType
import godot.core.PackedFloat32Array
import godot.core.Rect2
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_FLOAT_32_ARRAY
import godot.core.VariantParser.RECT2
import godot.core.VariantParser.STRING
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_LABEL_INDEX: Int = 345

/**
 * A control for displaying plain text. It gives you control over the horizontal and vertical
 * alignment and can wrap the text inside the node's bounding rectangle. It doesn't support bold,
 * italics, or other rich text formatting. For that, use [RichTextLabel] instead.
 */
@GodotBaseType
public open class Label : Control() {
  /**
   * The text to display on screen.
   */
  public final inline var text: String
    @JvmName("textProperty")
    get() = getText()
    @JvmName("textProperty")
    set(`value`) {
      setText(value)
    }

  /**
   * A [LabelSettings] resource that can be shared between multiple [Label] nodes. Takes priority
   * over theme properties.
   */
  public final inline var labelSettings: LabelSettings?
    @JvmName("labelSettingsProperty")
    get() = getLabelSettings()
    @JvmName("labelSettingsProperty")
    set(`value`) {
      setLabelSettings(value)
    }

  /**
   * Controls the text's horizontal alignment. Supports left, center, right, and fill, or justify.
   * Set it to one of the [HorizontalAlignment] constants.
   */
  public final inline var horizontalAlignment: HorizontalAlignment
    @JvmName("horizontalAlignmentProperty")
    get() = getHorizontalAlignment()
    @JvmName("horizontalAlignmentProperty")
    set(`value`) {
      setHorizontalAlignment(value)
    }

  /**
   * Controls the text's vertical alignment. Supports top, center, bottom, and fill. Set it to one
   * of the [VerticalAlignment] constants.
   */
  public final inline var verticalAlignment: VerticalAlignment
    @JvmName("verticalAlignmentProperty")
    get() = getVerticalAlignment()
    @JvmName("verticalAlignmentProperty")
    set(`value`) {
      setVerticalAlignment(value)
    }

  /**
   * If set to something other than [TextServer.AUTOWRAP_OFF], the text gets wrapped inside the
   * node's bounding rectangle. If you resize the node, it will change its height automatically to show
   * all the text. To see how each mode behaves, see [TextServer.AutowrapMode].
   */
  public final inline var autowrapMode: TextServer.AutowrapMode
    @JvmName("autowrapModeProperty")
    get() = getAutowrapMode()
    @JvmName("autowrapModeProperty")
    set(`value`) {
      setAutowrapMode(value)
    }

  /**
   * Line fill alignment rules. For more info see [TextServer.JustificationFlag].
   */
  public final inline var justificationFlags: TextServer.JustificationFlag
    @JvmName("justificationFlagsProperty")
    get() = getJustificationFlags()
    @JvmName("justificationFlagsProperty")
    set(`value`) {
      setJustificationFlags(value)
    }

  /**
   * If `true`, the Label only shows the text that fits inside its bounding rectangle and will clip
   * text horizontally.
   */
  public final inline var clipText: Boolean
    @JvmName("clipTextProperty")
    get() = isClippingText()
    @JvmName("clipTextProperty")
    set(`value`) {
      setClipText(value)
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
   * Ellipsis character used for text clipping.
   */
  public final inline var ellipsisChar: String
    @JvmName("ellipsisCharProperty")
    get() = getEllipsisChar()
    @JvmName("ellipsisCharProperty")
    set(`value`) {
      setEllipsisChar(value)
    }

  /**
   * If `true`, all the text displays as UPPERCASE.
   */
  public final inline var uppercase: Boolean
    @JvmName("uppercaseProperty")
    get() = isUppercase()
    @JvmName("uppercaseProperty")
    set(`value`) {
      setUppercase(value)
    }

  /**
   * Aligns text to the given tab-stops.
   */
  public final inline var tabStops: PackedFloat32Array
    @JvmName("tabStopsProperty")
    get() = getTabStops()
    @JvmName("tabStopsProperty")
    set(`value`) {
      setTabStops(value)
    }

  /**
   * The number of the lines ignored and not displayed from the start of the [text] value.
   */
  public final inline var linesSkipped: Int
    @JvmName("linesSkippedProperty")
    get() = getLinesSkipped()
    @JvmName("linesSkippedProperty")
    set(`value`) {
      setLinesSkipped(value)
    }

  /**
   * Limits the lines of text the node shows on screen.
   */
  public final inline var maxLinesVisible: Int
    @JvmName("maxLinesVisibleProperty")
    get() = getMaxLinesVisible()
    @JvmName("maxLinesVisibleProperty")
    set(`value`) {
      setMaxLinesVisible(value)
    }

  /**
   * The number of characters to display. If set to `-1`, all characters are displayed. This can be
   * useful when animating the text appearing in a dialog box.
   * **Note:** Setting this property updates [visibleRatio] accordingly.
   */
  public final inline var visibleCharacters: Int
    @JvmName("visibleCharactersProperty")
    get() = getVisibleCharacters()
    @JvmName("visibleCharactersProperty")
    set(`value`) {
      setVisibleCharacters(value)
    }

  /**
   * Sets the clipping behavior when [visibleCharacters] or [visibleRatio] is set. See
   * [TextServer.VisibleCharactersBehavior] for more info.
   */
  public final inline var visibleCharactersBehavior: TextServer.VisibleCharactersBehavior
    @JvmName("visibleCharactersBehaviorProperty")
    get() = getVisibleCharactersBehavior()
    @JvmName("visibleCharactersBehaviorProperty")
    set(`value`) {
      setVisibleCharactersBehavior(value)
    }

  /**
   * The fraction of characters to display, relative to the total number of characters (see
   * [getTotalCharacterCount]). If set to `1.0`, all characters are displayed. If set to `0.5`, only
   * half of the characters will be displayed. This can be useful when animating the text appearing in
   * a dialog box.
   * **Note:** Setting this property updates [visibleCharacters] accordingly.
   */
  public final inline var visibleRatio: Float
    @JvmName("visibleRatioProperty")
    get() = getVisibleRatio()
    @JvmName("visibleRatioProperty")
    set(`value`) {
      setVisibleRatio(value)
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

  /**
   * Set BiDi algorithm override for the structured text.
   */
  public final inline var structuredTextBidiOverride: TextServer.StructuredTextParser
    @JvmName("structuredTextBidiOverrideProperty")
    get() = getStructuredTextBidiOverride()
    @JvmName("structuredTextBidiOverrideProperty")
    set(`value`) {
      setStructuredTextBidiOverride(value)
    }

  /**
   * Set additional options for BiDi override.
   */
  public final inline var structuredTextBidiOverrideOptions: VariantArray<Any?>
    @JvmName("structuredTextBidiOverrideOptionsProperty")
    get() = getStructuredTextBidiOverrideOptions()
    @JvmName("structuredTextBidiOverrideOptionsProperty")
    set(`value`) {
      setStructuredTextBidiOverrideOptions(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_LABEL_INDEX, scriptIndex)
  }

  public final fun setHorizontalAlignment(alignment: HorizontalAlignment): Unit {
    Internals.writeArguments(LONG to alignment.id)
    Internals.callMethod(rawPtr, MethodBindings.setHorizontalAlignmentPtr, NIL)
  }

  public final fun getHorizontalAlignment(): HorizontalAlignment {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getHorizontalAlignmentPtr, LONG)
    return HorizontalAlignment.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setVerticalAlignment(alignment: VerticalAlignment): Unit {
    Internals.writeArguments(LONG to alignment.id)
    Internals.callMethod(rawPtr, MethodBindings.setVerticalAlignmentPtr, NIL)
  }

  public final fun getVerticalAlignment(): VerticalAlignment {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getVerticalAlignmentPtr, LONG)
    return VerticalAlignment.from(Internals.readReturnValue(LONG) as Long)
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

  public final fun setLabelSettings(settings: LabelSettings?): Unit {
    Internals.writeArguments(OBJECT to settings)
    Internals.callMethod(rawPtr, MethodBindings.setLabelSettingsPtr, NIL)
  }

  public final fun getLabelSettings(): LabelSettings? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLabelSettingsPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as LabelSettings?)
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

  public final fun setAutowrapMode(autowrapMode: TextServer.AutowrapMode): Unit {
    Internals.writeArguments(LONG to autowrapMode.id)
    Internals.callMethod(rawPtr, MethodBindings.setAutowrapModePtr, NIL)
  }

  public final fun getAutowrapMode(): TextServer.AutowrapMode {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAutowrapModePtr, LONG)
    return TextServer.AutowrapMode.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setJustificationFlags(justificationFlags: TextServer.JustificationFlag): Unit {
    Internals.writeArguments(LONG to justificationFlags.flag)
    Internals.callMethod(rawPtr, MethodBindings.setJustificationFlagsPtr, NIL)
  }

  public final fun getJustificationFlags(): TextServer.JustificationFlag {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getJustificationFlagsPtr, LONG)
    return JustificationFlagValue(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setClipText(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setClipTextPtr, NIL)
  }

  public final fun isClippingText(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isClippingTextPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setTabStops(tabStops: PackedFloat32Array): Unit {
    Internals.writeArguments(PACKED_FLOAT_32_ARRAY to tabStops)
    Internals.callMethod(rawPtr, MethodBindings.setTabStopsPtr, NIL)
  }

  public final fun getTabStops(): PackedFloat32Array {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTabStopsPtr, PACKED_FLOAT_32_ARRAY)
    return (Internals.readReturnValue(PACKED_FLOAT_32_ARRAY) as PackedFloat32Array)
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

  public final fun setEllipsisChar(char: String): Unit {
    Internals.writeArguments(STRING to char)
    Internals.callMethod(rawPtr, MethodBindings.setEllipsisCharPtr, NIL)
  }

  public final fun getEllipsisChar(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEllipsisCharPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public final fun setUppercase(enable: Boolean): Unit {
    Internals.writeArguments(BOOL to enable)
    Internals.callMethod(rawPtr, MethodBindings.setUppercasePtr, NIL)
  }

  public final fun isUppercase(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isUppercasePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the height of the line [line].
   * If [line] is set to `-1`, returns the biggest line height.
   * If there are no lines, returns font size in pixels.
   */
  @JvmOverloads
  public final fun getLineHeight(line: Int = -1): Int {
    Internals.writeArguments(LONG to line.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getLineHeightPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the number of lines of text the Label has.
   */
  public final fun getLineCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLineCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the number of lines shown. Useful if the [Label]'s height cannot currently display all
   * lines.
   */
  public final fun getVisibleLineCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getVisibleLineCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the total number of printable characters in the text (excluding spaces and newlines).
   */
  public final fun getTotalCharacterCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTotalCharacterCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setVisibleCharacters(amount: Int): Unit {
    Internals.writeArguments(LONG to amount.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setVisibleCharactersPtr, NIL)
  }

  public final fun getVisibleCharacters(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getVisibleCharactersPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun getVisibleCharactersBehavior(): TextServer.VisibleCharactersBehavior {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getVisibleCharactersBehaviorPtr, LONG)
    return TextServer.VisibleCharactersBehavior.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setVisibleCharactersBehavior(behavior: TextServer.VisibleCharactersBehavior):
      Unit {
    Internals.writeArguments(LONG to behavior.id)
    Internals.callMethod(rawPtr, MethodBindings.setVisibleCharactersBehaviorPtr, NIL)
  }

  public final fun setVisibleRatio(ratio: Float): Unit {
    Internals.writeArguments(DOUBLE to ratio.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setVisibleRatioPtr, NIL)
  }

  public final fun getVisibleRatio(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getVisibleRatioPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setLinesSkipped(linesSkipped: Int): Unit {
    Internals.writeArguments(LONG to linesSkipped.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setLinesSkippedPtr, NIL)
  }

  public final fun getLinesSkipped(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLinesSkippedPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setMaxLinesVisible(linesVisible: Int): Unit {
    Internals.writeArguments(LONG to linesVisible.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setMaxLinesVisiblePtr, NIL)
  }

  public final fun getMaxLinesVisible(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMaxLinesVisiblePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setStructuredTextBidiOverride(parser: TextServer.StructuredTextParser): Unit {
    Internals.writeArguments(LONG to parser.id)
    Internals.callMethod(rawPtr, MethodBindings.setStructuredTextBidiOverridePtr, NIL)
  }

  public final fun getStructuredTextBidiOverride(): TextServer.StructuredTextParser {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getStructuredTextBidiOverridePtr, LONG)
    return TextServer.StructuredTextParser.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setStructuredTextBidiOverrideOptions(args: VariantArray<Any?>): Unit {
    Internals.writeArguments(ARRAY to args)
    Internals.callMethod(rawPtr, MethodBindings.setStructuredTextBidiOverrideOptionsPtr, NIL)
  }

  public final fun getStructuredTextBidiOverrideOptions(): VariantArray<Any?> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getStructuredTextBidiOverrideOptionsPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  /**
   * Returns the bounding rectangle of the character at position [pos]. If the character is a
   * non-visual character or [pos] is outside the valid range, an empty [Rect2] is returned. If the
   * character is a part of a composite grapheme, the bounding rectangle of the whole grapheme is
   * returned.
   */
  public final fun getCharacterBounds(pos: Int): Rect2 {
    Internals.writeArguments(LONG to pos.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getCharacterBoundsPtr, RECT2)
    return (Internals.readReturnValue(RECT2) as Rect2)
  }

  public companion object

  public object MethodBindings {
    internal val setHorizontalAlignmentPtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "set_horizontal_alignment", 2312603777)

    internal val getHorizontalAlignmentPtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "get_horizontal_alignment", 341400642)

    internal val setVerticalAlignmentPtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "set_vertical_alignment", 1796458609)

    internal val getVerticalAlignmentPtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "get_vertical_alignment", 3274884059)

    internal val setTextPtr: VoidPtr = Internals.getMethodBindPtr("Label", "set_text", 83702148)

    internal val getTextPtr: VoidPtr = Internals.getMethodBindPtr("Label", "get_text", 201670096)

    internal val setLabelSettingsPtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "set_label_settings", 1030653839)

    internal val getLabelSettingsPtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "get_label_settings", 826676056)

    internal val setTextDirectionPtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "set_text_direction", 119160795)

    internal val getTextDirectionPtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "get_text_direction", 797257663)

    internal val setLanguagePtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "set_language", 83702148)

    internal val getLanguagePtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "get_language", 201670096)

    internal val setAutowrapModePtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "set_autowrap_mode", 3289138044)

    internal val getAutowrapModePtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "get_autowrap_mode", 1549071663)

    internal val setJustificationFlagsPtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "set_justification_flags", 2877345813)

    internal val getJustificationFlagsPtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "get_justification_flags", 1583363614)

    internal val setClipTextPtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "set_clip_text", 2586408642)

    internal val isClippingTextPtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "is_clipping_text", 36873697)

    internal val setTabStopsPtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "set_tab_stops", 2899603908)

    internal val getTabStopsPtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "get_tab_stops", 675695659)

    internal val setTextOverrunBehaviorPtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "set_text_overrun_behavior", 1008890932)

    internal val getTextOverrunBehaviorPtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "get_text_overrun_behavior", 3779142101)

    internal val setEllipsisCharPtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "set_ellipsis_char", 83702148)

    internal val getEllipsisCharPtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "get_ellipsis_char", 201670096)

    internal val setUppercasePtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "set_uppercase", 2586408642)

    internal val isUppercasePtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "is_uppercase", 36873697)

    internal val getLineHeightPtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "get_line_height", 181039630)

    internal val getLineCountPtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "get_line_count", 3905245786)

    internal val getVisibleLineCountPtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "get_visible_line_count", 3905245786)

    internal val getTotalCharacterCountPtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "get_total_character_count", 3905245786)

    internal val setVisibleCharactersPtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "set_visible_characters", 1286410249)

    internal val getVisibleCharactersPtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "get_visible_characters", 3905245786)

    internal val getVisibleCharactersBehaviorPtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "get_visible_characters_behavior", 258789322)

    internal val setVisibleCharactersBehaviorPtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "set_visible_characters_behavior", 3383839701)

    internal val setVisibleRatioPtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "set_visible_ratio", 373806689)

    internal val getVisibleRatioPtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "get_visible_ratio", 1740695150)

    internal val setLinesSkippedPtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "set_lines_skipped", 1286410249)

    internal val getLinesSkippedPtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "get_lines_skipped", 3905245786)

    internal val setMaxLinesVisiblePtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "set_max_lines_visible", 1286410249)

    internal val getMaxLinesVisiblePtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "get_max_lines_visible", 3905245786)

    internal val setStructuredTextBidiOverridePtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "set_structured_text_bidi_override", 55961453)

    internal val getStructuredTextBidiOverridePtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "get_structured_text_bidi_override", 3385126229)

    internal val setStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "set_structured_text_bidi_override_options", 381264803)

    internal val getStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "get_structured_text_bidi_override_options", 3995934104)

    internal val getCharacterBoundsPtr: VoidPtr =
        Internals.getMethodBindPtr("Label", "get_character_bounds", 3327874267)
  }
}
