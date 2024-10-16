// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.TextServer.JustificationFlagValue
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
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
    createNativeObject(ENGINECLASS_LABEL, scriptIndex)
  }

  public final fun setHorizontalAlignment(alignment: HorizontalAlignment): Unit {
    TransferContext.writeArguments(LONG to alignment.id)
    TransferContext.callMethod(ptr, MethodBindings.setHorizontalAlignmentPtr, NIL)
  }

  public final fun getHorizontalAlignment(): HorizontalAlignment {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHorizontalAlignmentPtr, LONG)
    return HorizontalAlignment.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setVerticalAlignment(alignment: VerticalAlignment): Unit {
    TransferContext.writeArguments(LONG to alignment.id)
    TransferContext.callMethod(ptr, MethodBindings.setVerticalAlignmentPtr, NIL)
  }

  public final fun getVerticalAlignment(): VerticalAlignment {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVerticalAlignmentPtr, LONG)
    return VerticalAlignment.from(TransferContext.readReturnValue(LONG) as Long)
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

  public final fun setLabelSettings(settings: LabelSettings?): Unit {
    TransferContext.writeArguments(OBJECT to settings)
    TransferContext.callMethod(ptr, MethodBindings.setLabelSettingsPtr, NIL)
  }

  public final fun getLabelSettings(): LabelSettings? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLabelSettingsPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as LabelSettings?)
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

  public final fun setAutowrapMode(autowrapMode: TextServer.AutowrapMode): Unit {
    TransferContext.writeArguments(LONG to autowrapMode.id)
    TransferContext.callMethod(ptr, MethodBindings.setAutowrapModePtr, NIL)
  }

  public final fun getAutowrapMode(): TextServer.AutowrapMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAutowrapModePtr, LONG)
    return TextServer.AutowrapMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setJustificationFlags(justificationFlags: TextServer.JustificationFlag): Unit {
    TransferContext.writeArguments(LONG to justificationFlags.flag)
    TransferContext.callMethod(ptr, MethodBindings.setJustificationFlagsPtr, NIL)
  }

  public final fun getJustificationFlags(): TextServer.JustificationFlag {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getJustificationFlagsPtr, LONG)
    return JustificationFlagValue(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setClipText(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setClipTextPtr, NIL)
  }

  public final fun isClippingText(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isClippingTextPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setTabStops(tabStops: PackedFloat32Array): Unit {
    TransferContext.writeArguments(PACKED_FLOAT_32_ARRAY to tabStops)
    TransferContext.callMethod(ptr, MethodBindings.setTabStopsPtr, NIL)
  }

  public final fun getTabStops(): PackedFloat32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTabStopsPtr, PACKED_FLOAT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_FLOAT_32_ARRAY) as PackedFloat32Array)
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

  public final fun setEllipsisChar(char: String): Unit {
    TransferContext.writeArguments(STRING to char)
    TransferContext.callMethod(ptr, MethodBindings.setEllipsisCharPtr, NIL)
  }

  public final fun getEllipsisChar(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEllipsisCharPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setUppercase(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setUppercasePtr, NIL)
  }

  public final fun isUppercase(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isUppercasePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the height of the line [line].
   * If [line] is set to `-1`, returns the biggest line height.
   * If there are no lines, returns font size in pixels.
   */
  @JvmOverloads
  public final fun getLineHeight(line: Int = -1): Int {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getLineHeightPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the number of lines of text the Label has.
   */
  public final fun getLineCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLineCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the number of lines shown. Useful if the [Label]'s height cannot currently display all
   * lines.
   */
  public final fun getVisibleLineCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVisibleLineCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the total number of printable characters in the text (excluding spaces and newlines).
   */
  public final fun getTotalCharacterCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTotalCharacterCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setVisibleCharacters(amount: Int): Unit {
    TransferContext.writeArguments(LONG to amount.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setVisibleCharactersPtr, NIL)
  }

  public final fun getVisibleCharacters(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVisibleCharactersPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun getVisibleCharactersBehavior(): TextServer.VisibleCharactersBehavior {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVisibleCharactersBehaviorPtr, LONG)
    return TextServer.VisibleCharactersBehavior.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setVisibleCharactersBehavior(behavior: TextServer.VisibleCharactersBehavior):
      Unit {
    TransferContext.writeArguments(LONG to behavior.id)
    TransferContext.callMethod(ptr, MethodBindings.setVisibleCharactersBehaviorPtr, NIL)
  }

  public final fun setVisibleRatio(ratio: Float): Unit {
    TransferContext.writeArguments(DOUBLE to ratio.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setVisibleRatioPtr, NIL)
  }

  public final fun getVisibleRatio(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVisibleRatioPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setLinesSkipped(linesSkipped: Int): Unit {
    TransferContext.writeArguments(LONG to linesSkipped.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setLinesSkippedPtr, NIL)
  }

  public final fun getLinesSkipped(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLinesSkippedPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setMaxLinesVisible(linesVisible: Int): Unit {
    TransferContext.writeArguments(LONG to linesVisible.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setMaxLinesVisiblePtr, NIL)
  }

  public final fun getMaxLinesVisible(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMaxLinesVisiblePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setStructuredTextBidiOverride(parser: TextServer.StructuredTextParser): Unit {
    TransferContext.writeArguments(LONG to parser.id)
    TransferContext.callMethod(ptr, MethodBindings.setStructuredTextBidiOverridePtr, NIL)
  }

  public final fun getStructuredTextBidiOverride(): TextServer.StructuredTextParser {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getStructuredTextBidiOverridePtr, LONG)
    return TextServer.StructuredTextParser.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setStructuredTextBidiOverrideOptions(args: VariantArray<Any?>): Unit {
    TransferContext.writeArguments(ARRAY to args)
    TransferContext.callMethod(ptr, MethodBindings.setStructuredTextBidiOverrideOptionsPtr, NIL)
  }

  public final fun getStructuredTextBidiOverrideOptions(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getStructuredTextBidiOverrideOptionsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  /**
   * Returns the bounding rectangle of the character at position [pos]. If the character is a
   * non-visual character or [pos] is outside the valid range, an empty [Rect2] is returned. If the
   * character is a part of a composite grapheme, the bounding rectangle of the whole grapheme is
   * returned.
   */
  public final fun getCharacterBounds(pos: Int): Rect2 {
    TransferContext.writeArguments(LONG to pos.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getCharacterBoundsPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2) as Rect2)
  }

  public companion object

  internal object MethodBindings {
    public val setHorizontalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "set_horizontal_alignment", 2312603777)

    public val getHorizontalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "get_horizontal_alignment", 341400642)

    public val setVerticalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "set_vertical_alignment", 1796458609)

    public val getVerticalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "get_vertical_alignment", 3274884059)

    public val setTextPtr: VoidPtr = TypeManager.getMethodBindPtr("Label", "set_text", 83702148)

    public val getTextPtr: VoidPtr = TypeManager.getMethodBindPtr("Label", "get_text", 201670096)

    public val setLabelSettingsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "set_label_settings", 1030653839)

    public val getLabelSettingsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "get_label_settings", 826676056)

    public val setTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "set_text_direction", 119160795)

    public val getTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "get_text_direction", 797257663)

    public val setLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "set_language", 83702148)

    public val getLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "get_language", 201670096)

    public val setAutowrapModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "set_autowrap_mode", 3289138044)

    public val getAutowrapModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "get_autowrap_mode", 1549071663)

    public val setJustificationFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "set_justification_flags", 2877345813)

    public val getJustificationFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "get_justification_flags", 1583363614)

    public val setClipTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "set_clip_text", 2586408642)

    public val isClippingTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "is_clipping_text", 36873697)

    public val setTabStopsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "set_tab_stops", 2899603908)

    public val getTabStopsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "get_tab_stops", 675695659)

    public val setTextOverrunBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "set_text_overrun_behavior", 1008890932)

    public val getTextOverrunBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "get_text_overrun_behavior", 3779142101)

    public val setEllipsisCharPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "set_ellipsis_char", 83702148)

    public val getEllipsisCharPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "get_ellipsis_char", 201670096)

    public val setUppercasePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "set_uppercase", 2586408642)

    public val isUppercasePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "is_uppercase", 36873697)

    public val getLineHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "get_line_height", 181039630)

    public val getLineCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "get_line_count", 3905245786)

    public val getVisibleLineCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "get_visible_line_count", 3905245786)

    public val getTotalCharacterCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "get_total_character_count", 3905245786)

    public val setVisibleCharactersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "set_visible_characters", 1286410249)

    public val getVisibleCharactersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "get_visible_characters", 3905245786)

    public val getVisibleCharactersBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "get_visible_characters_behavior", 258789322)

    public val setVisibleCharactersBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "set_visible_characters_behavior", 3383839701)

    public val setVisibleRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "set_visible_ratio", 373806689)

    public val getVisibleRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "get_visible_ratio", 1740695150)

    public val setLinesSkippedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "set_lines_skipped", 1286410249)

    public val getLinesSkippedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "get_lines_skipped", 3905245786)

    public val setMaxLinesVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "set_max_lines_visible", 1286410249)

    public val getMaxLinesVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "get_max_lines_visible", 3905245786)

    public val setStructuredTextBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "set_structured_text_bidi_override", 55961453)

    public val getStructuredTextBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "get_structured_text_bidi_override", 3385126229)

    public val setStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "set_structured_text_bidi_override_options", 381264803)

    public val getStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "get_structured_text_bidi_override_options", 3995934104)

    public val getCharacterBoundsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Label", "get_character_bounds", 3327874267)
  }
}
