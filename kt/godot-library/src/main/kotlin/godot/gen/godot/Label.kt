// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Displays plain text in a line or wrapped inside a rectangle. For formatted text, use [godot.RichTextLabel].
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/515](https://godotengine.org/asset-library/asset/515)
 *
 * Label displays plain text on the screen. It gives you control over the horizontal and vertical alignment and can wrap the text inside the node's bounding rectangle. It doesn't support bold, italics, or other formatting. For that, use [godot.RichTextLabel] instead.
 *
 * **Note:** Contrarily to most other [godot.Control]s, Label's [godot.Control.mouseFilter] defaults to [godot.Control.MOUSE_FILTER_IGNORE] (i.e. it doesn't react to mouse input events). This implies that a label won't display any configured [godot.Control.hintTooltip], unless you change its mouse filter.
 */
@GodotBaseType
public open class Label : Control() {
  /**
   * The text to display on screen.
   */
  public var text: String
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_TEXT, STRING.ordinal)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_TEXT, NIL.ordinal)
    }

  /**
   * Controls the text's horizontal alignment. Supports left, center, right, and fill, or justify. Set it to one of the [enum HorizontalAlignment] constants.
   */
  public var horizontalAlignment: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_HORIZONTAL_ALIGNMENT,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_HORIZONTAL_ALIGNMENT,
          NIL.ordinal)
    }

  /**
   * Controls the text's vertical alignment. Supports top, center, bottom, and fill. Set it to one of the [enum VerticalAlignment] constants.
   */
  public var verticalAlignment: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_VERTICAL_ALIGNMENT,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_VERTICAL_ALIGNMENT,
          NIL.ordinal)
    }

  /**
   * If set to something other than [godot.TextServer.AUTOWRAP_OFF], the text gets wrapped inside the node's bounding rectangle. If you resize the node, it will change its height automatically to show all the text. To see how each mode behaves, see [enum TextServer.AutowrapMode].
   */
  public var autowrapMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_AUTOWRAP_MODE, LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_AUTOWRAP_MODE, NIL.ordinal)
    }

  /**
   * If `true`, the Label only shows the text that fits inside its bounding rectangle and will clip text horizontally.
   */
  public var clipText: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_IS_CLIPPING_TEXT, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_CLIP_TEXT, NIL.ordinal)
    }

  /**
   * Sets the clipping behavior when the text exceeds the node's bounding rectangle. See [enum TextServer.OverrunBehavior] for a description of all modes.
   */
  public var textOverrunBehavior: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_TEXT_OVERRUN_BEHAVIOR,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_TEXT_OVERRUN_BEHAVIOR,
          NIL.ordinal)
    }

  /**
   * If `true`, all the text displays as UPPERCASE.
   */
  public var uppercase: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_IS_UPPERCASE, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_UPPERCASE, NIL.ordinal)
    }

  /**
   * The node ignores the first `lines_skipped` lines before it starts to display text.
   */
  public var linesSkipped: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_LINES_SKIPPED, LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_LINES_SKIPPED, NIL.ordinal)
    }

  /**
   * Limits the lines of text the node shows on screen.
   */
  public var maxLinesVisible: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_MAX_LINES_VISIBLE,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_MAX_LINES_VISIBLE,
          NIL.ordinal)
    }

  /**
   * Restricts the number of characters to display. Set to -1 to disable.
   *
   * **Note:** Setting this property updates [percentVisible] based on current [getTotalCharacterCount].
   */
  public var visibleCharacters: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_VISIBLE_CHARACTERS,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_VISIBLE_CHARACTERS,
          NIL.ordinal)
    }

  /**
   * Sets the clipping behavior when [visibleCharacters] or [percentVisible] is set. See [enum TextServer.VisibleCharactersBehavior] for more info.
   */
  public var visibleCharactersBehavior: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_VISIBLE_CHARACTERS_BEHAVIOR,
          LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_VISIBLE_CHARACTERS_BEHAVIOR,
          NIL.ordinal)
    }

  /**
   * Limits the amount of visible characters. If you set `percent_visible` to 0.5, only up to half of the text's characters will display on screen. Useful to animate the text in a dialog box.
   *
   * **Note:** Setting this property updates [visibleCharacters] based on current [getTotalCharacterCount].
   */
  public var percentVisible: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_PERCENT_VISIBLE,
          DOUBLE.ordinal)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_PERCENT_VISIBLE, NIL.ordinal)
    }

  /**
   * Base text writing direction.
   */
  public var textDirection: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_TEXT_DIRECTION, LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_TEXT_DIRECTION, NIL.ordinal)
    }

  /**
   * Language code used for line-breaking and text shaping algorithms, if left empty current locale is used instead.
   */
  public var language: String
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_LANGUAGE, STRING.ordinal)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_LANGUAGE, NIL.ordinal)
    }

  /**
   * Set BiDi algorithm override for the structured text.
   */
  public var structuredTextBidiOverride: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LABEL_GET_STRUCTURED_TEXT_BIDI_OVERRIDE, LONG.ordinal)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LABEL_SET_STRUCTURED_TEXT_BIDI_OVERRIDE, NIL.ordinal)
    }

  /**
   * Set additional options for BiDi override.
   */
  public var structuredTextBidiOverrideOptions: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LABEL_GET_STRUCTURED_TEXT_BIDI_OVERRIDE_OPTIONS, ARRAY.ordinal)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LABEL_SET_STRUCTURED_TEXT_BIDI_OVERRIDE_OPTIONS, NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_LABEL)
  }

  public fun setOpentypeFeature(tag: String, `value`: Long): Unit {
    TransferContext.writeArguments(STRING to tag, LONG to value)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_OPENTYPE_FEATURE, NIL.ordinal)
  }

  public fun getOpentypeFeature(tag: String): Long {
    TransferContext.writeArguments(STRING to tag)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_OPENTYPE_FEATURE, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public fun clearOpentypeFeatures(): Unit {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_CLEAR_OPENTYPE_FEATURES,
        NIL.ordinal)
  }

  /**
   * Returns the height of the line `line`.
   *
   * If `line` is set to `-1`, returns the biggest line height.
   *
   * If there're no lines returns font size in pixels.
   */
  public fun getLineHeight(line: Long = -1): Long {
    TransferContext.writeArguments(LONG to line)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_LINE_HEIGHT, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the amount of lines of text the Label has.
   */
  public fun getLineCount(): Long {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_LINE_COUNT, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the number of lines shown. Useful if the [godot.Label]'s height cannot currently display all lines.
   */
  public fun getVisibleLineCount(): Long {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_VISIBLE_LINE_COUNT,
        LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the total number of printable characters in the text (excluding spaces and newlines).
   */
  public fun getTotalCharacterCount(): Long {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_TOTAL_CHARACTER_COUNT,
        LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public enum class VisibleCharactersBehavior(
    id: Long
  ) {
    VC_CHARS_BEFORE_SHAPING(0),
    VC_CHARS_AFTER_SHAPING(1),
    VC_GLYPHS_AUTO(2),
    VC_GLYPHS_LTR(3),
    VC_GLYPHS_RTL(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class AutowrapMode(
    id: Long
  ) {
    AUTOWRAP_OFF(0),
    AUTOWRAP_ARBITRARY(1),
    AUTOWRAP_WORD(2),
    AUTOWRAP_WORD_SMART(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class OverrunBehavior(
    id: Long
  ) {
    OVERRUN_NO_TRIMMING(0),
    OVERRUN_TRIM_CHAR(1),
    OVERRUN_TRIM_WORD(2),
    OVERRUN_TRIM_ELLIPSIS(3),
    OVERRUN_TRIM_WORD_ELLIPSIS(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
