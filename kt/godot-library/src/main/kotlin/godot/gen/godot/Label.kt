// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
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

/**
 * Displays plain text in a line or wrapped inside a rectangle. For formatted text, use [godot.RichTextLabel].
 *
 * Label displays plain text on the screen. It gives you control over the horizontal and vertical alignment, and can wrap the text inside the node's bounding rectangle. It doesn't support bold, italics or other formatting. For that, use [godot.RichTextLabel] instead.
 *
 * **Note:** Contrarily to most other [godot.Control]s, Label's [godot.Control.mouseFilter] defaults to [godot.Control.MOUSE_FILTER_IGNORE] (i.e. it doesn't react to mouse input events). This implies that a label won't display any configured [godot.Control.hintTooltip], unless you change its mouse filter.
 */
@GodotBaseType
open class Label : Control() {
  /**
   * Controls the text's horizontal align. Supports left, center, right, and fill, or justify. Set it to one of the [enum Align] constants.
   */
  open var align: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_ALIGN, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_ALIGN, NIL)
    }

  /**
   * If `true`, wraps the text inside the node's bounding rectangle. If you resize the node, it will change its height automatically to show all the text.
   */
  open var autowrap: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_AUTOWRAP, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_AUTOWRAP, NIL)
    }

  /**
   * If `true`, the Label only shows the text that fits inside its bounding rectangle. It also lets you scale the node down freely.
   */
  open var clipText: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_CLIP_TEXT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_CLIP_TEXT, NIL)
    }

  /**
   * The node ignores the first `lines_skipped` lines before it starts to display text.
   */
  open var linesSkipped: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_LINES_SKIPPED, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_LINES_SKIPPED, NIL)
    }

  /**
   * Limits the lines of text the node shows on screen.
   */
  open var maxLinesVisible: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_MAX_LINES_VISIBLE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_MAX_LINES_VISIBLE, NIL)
    }

  /**
   * Limits the amount of visible characters. If you set `percent_visible` to 0.5, only up to half of the text's characters will display on screen. Useful to animate the text in a dialog box.
   */
  open var percentVisible: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_PERCENT_VISIBLE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_PERCENT_VISIBLE, NIL)
    }

  /**
   * The text to display on screen.
   */
  open var text: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_TEXT, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_TEXT, NIL)
    }

  /**
   * If `true`, all the text displays as UPPERCASE.
   */
  open var uppercase: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_UPPERCASE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_UPPERCASE, NIL)
    }

  /**
   * Controls the text's vertical align. Supports top, center, bottom, and fill. Set it to one of the [enum VAlign] constants.
   */
  open var valign: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_VALIGN, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_VALIGN, NIL)
    }

  /**
   * Restricts the number of characters to display. Set to -1 to disable.
   */
  open var visibleCharacters: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_VISIBLE_CHARACTERS,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_VISIBLE_CHARACTERS, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_LABEL)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  /**
   * Returns the amount of lines of text the Label has.
   */
  open fun getLineCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_LINE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the font size in pixels.
   */
  open fun getLineHeight(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_LINE_HEIGHT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the total number of printable characters in the text (excluding spaces and newlines).
   */
  open fun getTotalCharacterCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_TOTAL_CHARACTER_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the number of lines shown. Useful if the [godot.Label]'s height cannot currently display all lines.
   */
  open fun getVisibleLineCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_VISIBLE_LINE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  enum class Align(
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
    ALIGN_FILL(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class VAlign(
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
    VALIGN_FILL(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * Align rows centered.
     */
    final const val ALIGN_CENTER: Long = 1

    /**
     * Expand row whitespaces to fit the width.
     */
    final const val ALIGN_FILL: Long = 3

    /**
     * Align rows to the left (default).
     */
    final const val ALIGN_LEFT: Long = 0

    /**
     * Align rows to the right.
     */
    final const val ALIGN_RIGHT: Long = 2

    /**
     * Align the whole text to the bottom.
     */
    final const val VALIGN_BOTTOM: Long = 2

    /**
     * Align the whole text to the center.
     */
    final const val VALIGN_CENTER: Long = 1

    /**
     * Align the whole text by spreading the rows.
     */
    final const val VALIGN_FILL: Long = 3

    /**
     * Align the whole text to the top.
     */
    final const val VALIGN_TOP: Long = 0
  }
}
