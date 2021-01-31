// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Color
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.PoolStringArray
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class RichTextLabel : Control() {
  val metaClicked: Signal1<Any> by signal("meta")

  val metaHoverEnded: Signal1<Any> by signal("meta")

  val metaHoverStarted: Signal1<Any> by signal("meta")

  open var bbcodeEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_BBCODE_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_BBCODE_ENABLED,
          NIL)
    }

  open var bbcodeText: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_BBCODE_TEXT,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_BBCODE_TEXT,
          NIL)
    }

  open var customEffects: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_CUSTOM_EFFECTS,
          ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
    }
    set(value) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_CUSTOM_EFFECTS,
          NIL)
    }

  open var metaUnderlined: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_META_UNDERLINED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_META_UNDERLINED,
          NIL)
    }

  open var overrideSelectedFontColor: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_OVERRIDE_SELECTED_FONT_COLOR, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_OVERRIDE_SELECTED_FONT_COLOR, NIL)
    }

  open var percentVisible: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_PERCENT_VISIBLE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_PERCENT_VISIBLE,
          NIL)
    }

  open var scrollActive: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_SCROLL_ACTIVE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_SCROLL_ACTIVE,
          NIL)
    }

  open var scrollFollowing: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_SCROLL_FOLLOWING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_SCROLL_FOLLOWING, NIL)
    }

  open var selectionEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_SELECTION_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_SELECTION_ENABLED, NIL)
    }

  open var tabSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_TAB_SIZE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_TAB_SIZE, NIL)
    }

  open var text: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_TEXT, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(value) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_TEXT, NIL)
    }

  open var visibleCharacters: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_VISIBLE_CHARACTERS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_VISIBLE_CHARACTERS, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_RICHTEXTLABEL)

  override fun _gui_input(event: InputEvent) {
  }

  open fun _scroll_changed(arg0: Double) {
  }

  open fun addImage(
    image: Texture,
    width: Long = 0,
    height: Long = 0
  ) {
    TransferContext.writeArguments(OBJECT to image, LONG to width, LONG to height)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_ADD_IMAGE, NIL)
  }

  open fun addText(text: String) {
    TransferContext.writeArguments(STRING to text)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_ADD_TEXT, NIL)
  }

  open fun appendBbcode(bbcode: String): GodotError {
    TransferContext.writeArguments(STRING to bbcode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_APPEND_BBCODE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun clear() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_CLEAR, NIL)
  }

  open fun getContentHeight(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_CONTENT_HEIGHT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getLineCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_LINE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getTotalCharacterCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_TOTAL_CHARACTER_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getVScroll(): VScrollBar? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_V_SCROLL, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as VScrollBar?
  }

  open fun getVisibleLineCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_VISIBLE_LINE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun installEffect(effect: Any) {
    TransferContext.writeArguments(ANY to effect)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_INSTALL_EFFECT, NIL)
  }

  open fun newline() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_NEWLINE, NIL)
  }

  open fun parseBbcode(bbcode: String): GodotError {
    TransferContext.writeArguments(STRING to bbcode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PARSE_BBCODE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun parseExpressionsForValues(expressions: PoolStringArray): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(POOL_STRING_ARRAY to expressions)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PARSE_EXPRESSIONS_FOR_VALUES, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  open fun pop() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_POP, NIL)
  }

  open fun pushAlign(align: Long) {
    TransferContext.writeArguments(LONG to align)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_ALIGN, NIL)
  }

  open fun pushBold() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_BOLD, NIL)
  }

  open fun pushBoldItalics() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_BOLD_ITALICS,
        NIL)
  }

  open fun pushCell() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_CELL, NIL)
  }

  open fun pushColor(color: Color) {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_COLOR, NIL)
  }

  open fun pushFont(font: Font) {
    TransferContext.writeArguments(OBJECT to font)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_FONT, NIL)
  }

  open fun pushIndent(level: Long) {
    TransferContext.writeArguments(LONG to level)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_INDENT, NIL)
  }

  open fun pushItalics() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_ITALICS, NIL)
  }

  open fun pushList(type: Long) {
    TransferContext.writeArguments(LONG to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_LIST, NIL)
  }

  open fun pushMeta(data: Any) {
    TransferContext.writeArguments(ANY to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_META, NIL)
  }

  open fun pushMono() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_MONO, NIL)
  }

  open fun pushNormal() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_NORMAL, NIL)
  }

  open fun pushStrikethrough() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_STRIKETHROUGH,
        NIL)
  }

  open fun pushTable(columns: Long) {
    TransferContext.writeArguments(LONG to columns)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_TABLE, NIL)
  }

  open fun pushUnderline() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_UNDERLINE, NIL)
  }

  open fun removeLine(line: Long): Boolean {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_REMOVE_LINE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun scrollToLine(line: Long) {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SCROLL_TO_LINE, NIL)
  }

  open fun setTableColumnExpand(
    column: Long,
    expand: Boolean,
    ratio: Long
  ) {
    TransferContext.writeArguments(LONG to column, BOOL to expand, LONG to ratio)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_TABLE_COLUMN_EXPAND, NIL)
  }

  enum class Align(
    id: Long
  ) {
    ALIGN_LEFT(0),

    ALIGN_CENTER(1),

    ALIGN_RIGHT(2),

    ALIGN_FILL(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ListType(
    id: Long
  ) {
    LIST_NUMBERS(0),

    LIST_LETTERS(1),

    LIST_DOTS(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ItemType(
    id: Long
  ) {
    ITEM_FRAME(0),

    ITEM_TEXT(1),

    ITEM_IMAGE(2),

    ITEM_NEWLINE(3),

    ITEM_FONT(4),

    ITEM_COLOR(5),

    ITEM_UNDERLINE(6),

    ITEM_STRIKETHROUGH(7),

    ITEM_ALIGN(8),

    ITEM_INDENT(9),

    ITEM_LIST(10),

    ITEM_TABLE(11),

    ITEM_FADE(12),

    ITEM_SHAKE(13),

    ITEM_WAVE(14),

    ITEM_TORNADO(15),

    ITEM_RAINBOW(16),

    ITEM_META(17),

    ITEM_CUSTOMFX(18);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val ALIGN_CENTER: Long = 1

    final const val ALIGN_FILL: Long = 3

    final const val ALIGN_LEFT: Long = 0

    final const val ALIGN_RIGHT: Long = 2

    final const val ITEM_ALIGN: Long = 8

    final const val ITEM_COLOR: Long = 5

    final const val ITEM_CUSTOMFX: Long = 18

    final const val ITEM_FADE: Long = 12

    final const val ITEM_FONT: Long = 4

    final const val ITEM_FRAME: Long = 0

    final const val ITEM_IMAGE: Long = 2

    final const val ITEM_INDENT: Long = 9

    final const val ITEM_LIST: Long = 10

    final const val ITEM_META: Long = 17

    final const val ITEM_NEWLINE: Long = 3

    final const val ITEM_RAINBOW: Long = 16

    final const val ITEM_SHAKE: Long = 13

    final const val ITEM_STRIKETHROUGH: Long = 7

    final const val ITEM_TABLE: Long = 11

    final const val ITEM_TEXT: Long = 1

    final const val ITEM_TORNADO: Long = 15

    final const val ITEM_UNDERLINE: Long = 6

    final const val ITEM_WAVE: Long = 14

    final const val LIST_DOTS: Long = 2

    final const val LIST_LETTERS: Long = 1

    final const val LIST_NUMBERS: Long = 0
  }
}
