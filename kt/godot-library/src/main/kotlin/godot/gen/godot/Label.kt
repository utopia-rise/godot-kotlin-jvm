// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
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
   * Controls the text's horizontal align. Supports left, center, right, and fill, or justify. Set it to one of the [enum Align] constants.
   */
  public open var align: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_ALIGN, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_ALIGN, NIL)
    }

  /**
   * If `true`, wraps the text inside the node's bounding rectangle. If you resize the node, it will change its height automatically to show all the text.
   */
  public open var autowrap: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_AUTOWRAP, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_AUTOWRAP, NIL)
    }

  /**
   * If `true`, the Label only shows the text that fits inside its bounding rectangle and will clip text horizontally.
   */
  public open var clipText: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_CLIP_TEXT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_CLIP_TEXT, NIL)
    }

  /**
   * The node ignores the first `lines_skipped` lines before it starts to display text.
   */
  public open var linesSkipped: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_LINES_SKIPPED, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_LINES_SKIPPED, NIL)
    }

  /**
   * Limits the lines of text the node shows on screen.
   */
  public open var maxLinesVisible: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_MAX_LINES_VISIBLE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_MAX_LINES_VISIBLE, NIL)
    }

  /**
   * Limits the amount of visible characters. If you set `percent_visible` to 0.5, only up to half of the text's characters will display on screen. Useful to animate the text in a dialog box.
   */
  public open var percentVisible: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_PERCENT_VISIBLE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_PERCENT_VISIBLE, NIL)
    }

  /**
   * The text to display on screen.
   */
  public open var text: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_TEXT, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_TEXT, NIL)
    }

  /**
   * If `true`, all the text displays as UPPERCASE.
   */
  public open var uppercase: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_UPPERCASE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_UPPERCASE, NIL)
    }

  /**
   * Controls the text's vertical align. Supports top, center, bottom, and fill. Set it to one of the [enum VAlign] constants.
   */
  public open var valign: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_VALIGN, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_VALIGN, NIL)
    }

  /**
   * Restricts the number of characters to display. Set to -1 to disable.
   */
  public open var visibleCharacters: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_VISIBLE_CHARACTERS,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_VISIBLE_CHARACTERS, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_LABEL)
  }

  /**
   * Returns the amount of lines of text the Label has.
   */
  public open fun getLineCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_LINE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the font size in pixels.
   */
  public open fun getLineHeight(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_LINE_HEIGHT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the total number of printable characters in the text (excluding spaces and newlines).
   */
  public open fun getTotalCharacterCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_TOTAL_CHARACTER_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the number of lines shown. Useful if the [godot.Label]'s height cannot currently display all lines.
   */
  public open fun getVisibleLineCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_VISIBLE_LINE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public enum class Align(
    id: Long
  ) {
    /**
     * Align rows to the left (default).
     */
    ALIGN_LEFT(0),
    /**
     * Align rows centered.
     */
    ALIGN_CENTER(1),
    /**
     * Align rows to the right.
     */
    ALIGN_RIGHT(2),
    /**
     * Expand row whitespaces to fit the width.
     */
    ALIGN_FILL(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class VAlign(
    id: Long
  ) {
    /**
     * Align the whole text to the top.
     */
    VALIGN_TOP(0),
    /**
     * Align the whole text to the center.
     */
    VALIGN_CENTER(1),
    /**
     * Align the whole text to the bottom.
     */
    VALIGN_BOTTOM(2),
    /**
     * Align the whole text by spreading the rows.
     */
    VALIGN_FILL(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Align rows centered.
     */
    public final const val ALIGN_CENTER: Long = 1

    /**
     * Expand row whitespaces to fit the width.
     */
    public final const val ALIGN_FILL: Long = 3

    /**
     * Align rows to the left (default).
     */
    public final const val ALIGN_LEFT: Long = 0

    /**
     * Align rows to the right.
     */
    public final const val ALIGN_RIGHT: Long = 2

    /**
     * Align the whole text to the bottom.
     */
    public final const val VALIGN_BOTTOM: Long = 2

    /**
     * Align the whole text to the center.
     */
    public final const val VALIGN_CENTER: Long = 1

    /**
     * Align the whole text by spreading the rows.
     */
    public final const val VALIGN_FILL: Long = 3

    /**
     * Align the whole text to the top.
     */
    public final const val VALIGN_TOP: Long = 0
  }
}
