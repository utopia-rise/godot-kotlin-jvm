// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
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
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Label that displays rich text.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/677](https://godotengine.org/asset-library/asset/677)
 *
 * Rich text can contain custom text, fonts, images and some basic formatting. The label manages these as an internal tag stack. It also adapts itself to given width/heights.
 *
 * **Note:** Assignments to [bbcodeText] clear the tag stack and reconstruct it from the property's contents. Any edits made to [bbcodeText] will erase previous edits made from other manual sources such as [appendBbcode] and the `push_*` / [pop] methods.
 *
 * **Note:** RichTextLabel doesn't support entangled BBCode tags. For example, instead of using `**bold*bold italic**italic*`, use `**bold*bold italic****italic*`.
 *
 * **Note:** `push_* / pop` functions won't affect BBCode.
 *
 * **Note:** Unlike [godot.Label], RichTextLabel doesn't have a *property* to horizontally align text to the center. Instead, enable [bbcodeEnabled] and surround the text in a `[center]` tag as follows: `[center]Example[/center]`. There is currently no built-in way to vertically align text either, but this can be emulated by relying on anchors/containers and the [fitContentHeight] property.
 *
 * **Note:** Unicode characters after `0xffff` (such as most emoji) are *not* supported on Windows. They will display as unknown characters instead. This will be resolved in Godot 4.0.
 */
@GodotBaseType
public open class RichTextLabel : Control() {
  /**
   * Triggered when the user clicks on content between meta tags. If the meta is defined in text, e.g. `[hi]({"data"="hi"})`, then the parameter for this signal will be a [godot.String] type. If a particular type or an object is desired, the [pushMeta] method must be used to manually insert the data into the tag stack.
   */
  public val metaClicked: Signal1<Any> by signal("meta")

  /**
   * Triggers when the mouse exits a meta tag.
   */
  public val metaHoverEnded: Signal1<Any> by signal("meta")

  /**
   * Triggers when the mouse enters a meta tag.
   */
  public val metaHoverStarted: Signal1<Any> by signal("meta")

  /**
   * If `true`, the label uses BBCode formatting.
   *
   * **Note:** Trying to alter the [godot.RichTextLabel]'s text with [addText] will reset this to `false`. Use instead [appendBbcode] to preserve BBCode formatting.
   */
  public open var bbcodeEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_BBCODE_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_BBCODE_ENABLED,
          NIL)
    }

  /**
   * The label's text in BBCode format. Is not representative of manual modifications to the internal tag stack. Erases changes made by other methods when edited.
   *
   * **Note:** It is unadvised to use the `+=` operator with `bbcode_text` (e.g. `bbcode_text += "some string"`) as it replaces the whole text and can cause slowdowns. It will also erase all BBCode that was added to stack using `push_*` methods. Use [appendBbcode] for adding text instead, unless you absolutely need to close a tag that was opened in an earlier method call.
   */
  public open var bbcodeText: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_BBCODE_TEXT,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_BBCODE_TEXT,
          NIL)
    }

  /**
   * The currently installed custom effects. This is an array of [godot.RichTextEffect]s.
   *
   * To add a custom effect, it's more convenient to use [installEffect].
   */
  public open var customEffects: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_CUSTOM_EFFECTS,
          ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_CUSTOM_EFFECTS,
          NIL)
    }

  /**
   * If `true`, the label's height will be automatically updated to fit its content.
   *
   * **Note:** This property is used as a workaround to fix issues with [godot.RichTextLabel] in [godot.Container]s, but it's unreliable in some cases and will be removed in future versions.
   */
  public open var fitContentHeight: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_FIT_CONTENT_HEIGHT, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_FIT_CONTENT_HEIGHT, NIL)
    }

  /**
   * If `true`, the label underlines meta tags such as `[url]{text}[/url]`.
   */
  public open var metaUnderlined: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_META_UNDERLINED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_META_UNDERLINED,
          NIL)
    }

  /**
   * If `true`, the label uses the custom font color.
   */
  public open var overrideSelectedFontColor: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_OVERRIDE_SELECTED_FONT_COLOR, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_OVERRIDE_SELECTED_FONT_COLOR, NIL)
    }

  /**
   * The range of characters to display, as a [float] between 0.0 and 1.0. When assigned an out of range value, it's the same as assigning 1.0.
   *
   * **Note:** Setting this property updates [visibleCharacters] based on current [getTotalCharacterCount].
   */
  public open var percentVisible: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_PERCENT_VISIBLE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_PERCENT_VISIBLE,
          NIL)
    }

  /**
   * If `true`, the scrollbar is visible. Setting this to `false` does not block scrolling completely. See [scrollToLine].
   */
  public open var scrollActive: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_SCROLL_ACTIVE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_SCROLL_ACTIVE,
          NIL)
    }

  /**
   * If `true`, the window scrolls down to display new content automatically.
   */
  public open var scrollFollowing: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_SCROLL_FOLLOWING, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_SCROLL_FOLLOWING, NIL)
    }

  /**
   * If `true`, the label allows text selection.
   */
  public open var selectionEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_SELECTION_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_SELECTION_ENABLED, NIL)
    }

  /**
   * The number of spaces associated with a single tab length. Does not affect `\t` in text tags, only indent tags.
   */
  public open var tabSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_TAB_SIZE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_TAB_SIZE, NIL)
    }

  /**
   * The raw text of the label.
   *
   * When set, clears the tag stack and adds a raw text tag to the top of it. Does not parse BBCodes. Does not modify [bbcodeText].
   */
  public open var text: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_TEXT, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_TEXT, NIL)
    }

  /**
   * The restricted number of characters to display in the label. If `-1`, all characters will be displayed.
   *
   * **Note:** Setting this property updates [percentVisible] based on current [getTotalCharacterCount].
   */
  public open var visibleCharacters: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_VISIBLE_CHARACTERS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_VISIBLE_CHARACTERS, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_RICHTEXTLABEL)
  }

  public override fun _guiInput(event: InputEvent): Unit {
  }

  public open fun _scrollChanged(arg0: Double): Unit {
  }

  /**
   * Adds an image's opening and closing tags to the tag stack, optionally providing a `width` and `height` to resize the image.
   *
   * If `width` or `height` is set to 0, the image size will be adjusted in order to keep the original aspect ratio.
   */
  public open fun addImage(
    image: Texture,
    width: Long = 0,
    height: Long = 0
  ): Unit {
    TransferContext.writeArguments(OBJECT to image, LONG to width, LONG to height)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_ADD_IMAGE, NIL)
  }

  /**
   * Adds raw non-BBCode-parsed text to the tag stack.
   */
  public open fun addText(text: String): Unit {
    TransferContext.writeArguments(STRING to text)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_ADD_TEXT, NIL)
  }

  /**
   * Parses `bbcode` and adds tags to the tag stack as needed. Returns the result of the parsing, [OK] if successful.
   *
   * **Note:** Using this method, you can't close a tag that was opened in a previous [appendBbcode] call. This is done to improve performance, especially when updating large RichTextLabels since rebuilding the whole BBCode every time would be slower. If you absolutely need to close a tag in a future method call, append the [bbcodeText] instead of using [appendBbcode].
   */
  public open fun appendBbcode(bbcode: String): GodotError {
    TransferContext.writeArguments(STRING to bbcode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_APPEND_BBCODE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Clears the tag stack and sets [bbcodeText] to an empty string.
   */
  public open fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_CLEAR, NIL)
  }

  /**
   * Returns the height of the content.
   */
  public open fun getContentHeight(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_CONTENT_HEIGHT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the total number of newlines in the tag stack's text tags. Considers wrapped text as one line.
   */
  public open fun getLineCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_LINE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the total number of characters from text tags. Does not include BBCodes.
   */
  public open fun getTotalCharacterCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_TOTAL_CHARACTER_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the vertical scrollbar.
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If you wish to hide it or any of its children, use their [godot.CanvasItem.visible] property.
   */
  public open fun getVScroll(): VScrollBar? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_V_SCROLL, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as VScrollBar?
  }

  /**
   * Returns the number of visible lines.
   */
  public open fun getVisibleLineCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_VISIBLE_LINE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Installs a custom effect. `effect` should be a valid [godot.RichTextEffect].
   */
  public open fun installEffect(effect: Any?): Unit {
    TransferContext.writeArguments(ANY to effect)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_INSTALL_EFFECT, NIL)
  }

  /**
   * Adds a newline tag to the tag stack.
   */
  public open fun newline(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_NEWLINE, NIL)
  }

  /**
   * The assignment version of [appendBbcode]. Clears the tag stack and inserts the new content. Returns [OK] if parses `bbcode` successfully.
   */
  public open fun parseBbcode(bbcode: String): GodotError {
    TransferContext.writeArguments(STRING to bbcode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PARSE_BBCODE, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Parses BBCode parameter `expressions` into a dictionary.
   */
  public open fun parseExpressionsForValues(expressions: PoolStringArray): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(POOL_STRING_ARRAY to expressions)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PARSE_EXPRESSIONS_FOR_VALUES, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Terminates the current tag. Use after `push_*` methods to close BBCodes manually. Does not need to follow `add_*` methods.
   */
  public open fun pop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_POP, NIL)
  }

  /**
   * Adds an `[align]` tag based on the given `align` value. See [enum Align] for possible values.
   */
  public open fun pushAlign(align: Long): Unit {
    TransferContext.writeArguments(LONG to align)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_ALIGN, NIL)
  }

  /**
   * Adds a `[font]` tag with a bold font to the tag stack. This is the same as adding a `**` tag if not currently in a `*` tag.
   */
  public open fun pushBold(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_BOLD, NIL)
  }

  /**
   * Adds a `[font]` tag with a bold italics font to the tag stack.
   */
  public open fun pushBoldItalics(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_BOLD_ITALICS,
        NIL)
  }

  /**
   * Adds a `[cell]` tag to the tag stack. Must be inside a `[table]` tag. See [pushTable] for details.
   */
  public open fun pushCell(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_CELL, NIL)
  }

  /**
   * Adds a `[color]` tag to the tag stack.
   */
  public open fun pushColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_COLOR, NIL)
  }

  /**
   * Adds a `[font]` tag to the tag stack. Overrides default fonts for its duration.
   */
  public open fun pushFont(font: Font): Unit {
    TransferContext.writeArguments(OBJECT to font)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_FONT, NIL)
  }

  /**
   * Adds an `[indent]` tag to the tag stack. Multiplies `level` by current [tabSize] to determine new margin length.
   */
  public open fun pushIndent(level: Long): Unit {
    TransferContext.writeArguments(LONG to level)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_INDENT, NIL)
  }

  /**
   * Adds a `[font]` tag with a italics font to the tag stack. This is the same as adding a `*` tag if not currently in a `**` tag.
   */
  public open fun pushItalics(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_ITALICS, NIL)
  }

  /**
   * Adds a `[list]` tag to the tag stack. Similar to the BBCodes `[ol]` or `[ul]`, but supports more list types. Not fully implemented!
   */
  public open fun pushList(type: Long): Unit {
    TransferContext.writeArguments(LONG to type)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_LIST, NIL)
  }

  /**
   * Adds a `[meta]` tag to the tag stack. Similar to the BBCode `[{text}](something)`, but supports non-[godot.String] metadata types.
   */
  public open fun pushMeta(`data`: Any?): Unit {
    TransferContext.writeArguments(ANY to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_META, NIL)
  }

  /**
   * Adds a `[font]` tag with a monospace font to the tag stack.
   */
  public open fun pushMono(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_MONO, NIL)
  }

  /**
   * Adds a `[font]` tag with a normal font to the tag stack.
   */
  public open fun pushNormal(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_NORMAL, NIL)
  }

  /**
   * Adds a `~~` tag to the tag stack.
   */
  public open fun pushStrikethrough(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_STRIKETHROUGH,
        NIL)
  }

  /**
   * Adds a `[table=columns]` tag to the tag stack.
   */
  public open fun pushTable(columns: Long): Unit {
    TransferContext.writeArguments(LONG to columns)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_TABLE, NIL)
  }

  /**
   * Adds a `<u>` tag to the tag stack.
   */
  public open fun pushUnderline(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_UNDERLINE, NIL)
  }

  /**
   * Removes a line of content from the label. Returns `true` if the line exists.
   *
   * The `line` argument is the index of the line to remove, it can take values in the interval `[0, get_line_count() - 1]`.
   */
  public open fun removeLine(line: Long): Boolean {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_REMOVE_LINE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Scrolls the window's top line to match `line`.
   */
  public open fun scrollToLine(line: Long): Unit {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SCROLL_TO_LINE, NIL)
  }

  /**
   * Edits the selected column's expansion options. If `expand` is `true`, the column expands in proportion to its expansion ratio versus the other columns' ratios.
   *
   * For example, 2 columns with ratios 3 and 4 plus 70 pixels in available width would expand 30 and 40 pixels, respectively.
   *
   * If `expand` is `false`, the column will not contribute to the total ratio.
   */
  public open fun setTableColumnExpand(
    column: Long,
    expand: Boolean,
    ratio: Long
  ): Unit {
    TransferContext.writeArguments(LONG to column, BOOL to expand, LONG to ratio)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_TABLE_COLUMN_EXPAND, NIL)
  }

  public enum class Align(
    id: Long
  ) {
    /**
     * Makes text left aligned.
     */
    ALIGN_LEFT(0),
    /**
     * Makes text centered.
     */
    ALIGN_CENTER(1),
    /**
     * Makes text right aligned.
     */
    ALIGN_RIGHT(2),
    /**
     * Makes text fill width.
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

  public enum class ListType(
    id: Long
  ) {
    /**
     * Each list item has a number marker.
     */
    LIST_NUMBERS(0),
    /**
     * Each list item has a letter marker.
     */
    LIST_LETTERS(1),
    /**
     * Each list item has a filled circle marker.
     */
    LIST_DOTS(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ItemType(
    id: Long
  ) {
    /**
     *
     */
    ITEM_FRAME(0),
    /**
     *
     */
    ITEM_TEXT(1),
    /**
     *
     */
    ITEM_IMAGE(2),
    /**
     *
     */
    ITEM_NEWLINE(3),
    /**
     *
     */
    ITEM_FONT(4),
    /**
     *
     */
    ITEM_COLOR(5),
    /**
     *
     */
    ITEM_UNDERLINE(6),
    /**
     *
     */
    ITEM_STRIKETHROUGH(7),
    /**
     *
     */
    ITEM_ALIGN(8),
    /**
     *
     */
    ITEM_INDENT(9),
    /**
     *
     */
    ITEM_LIST(10),
    /**
     *
     */
    ITEM_TABLE(11),
    /**
     *
     */
    ITEM_FADE(12),
    /**
     *
     */
    ITEM_SHAKE(13),
    /**
     *
     */
    ITEM_WAVE(14),
    /**
     *
     */
    ITEM_TORNADO(15),
    /**
     *
     */
    ITEM_RAINBOW(16),
    /**
     *
     */
    ITEM_META(17),
    /**
     *
     */
    ITEM_CUSTOMFX(18),
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
     * Makes text centered.
     */
    public final const val ALIGN_CENTER: Long = 1

    /**
     * Makes text fill width.
     */
    public final const val ALIGN_FILL: Long = 3

    /**
     * Makes text left aligned.
     */
    public final const val ALIGN_LEFT: Long = 0

    /**
     * Makes text right aligned.
     */
    public final const val ALIGN_RIGHT: Long = 2

    /**
     *
     */
    public final const val ITEM_ALIGN: Long = 8

    /**
     *
     */
    public final const val ITEM_COLOR: Long = 5

    /**
     *
     */
    public final const val ITEM_CUSTOMFX: Long = 18

    /**
     *
     */
    public final const val ITEM_FADE: Long = 12

    /**
     *
     */
    public final const val ITEM_FONT: Long = 4

    /**
     *
     */
    public final const val ITEM_FRAME: Long = 0

    /**
     *
     */
    public final const val ITEM_IMAGE: Long = 2

    /**
     *
     */
    public final const val ITEM_INDENT: Long = 9

    /**
     *
     */
    public final const val ITEM_LIST: Long = 10

    /**
     *
     */
    public final const val ITEM_META: Long = 17

    /**
     *
     */
    public final const val ITEM_NEWLINE: Long = 3

    /**
     *
     */
    public final const val ITEM_RAINBOW: Long = 16

    /**
     *
     */
    public final const val ITEM_SHAKE: Long = 13

    /**
     *
     */
    public final const val ITEM_STRIKETHROUGH: Long = 7

    /**
     *
     */
    public final const val ITEM_TABLE: Long = 11

    /**
     *
     */
    public final const val ITEM_TEXT: Long = 1

    /**
     *
     */
    public final const val ITEM_TORNADO: Long = 15

    /**
     *
     */
    public final const val ITEM_UNDERLINE: Long = 6

    /**
     *
     */
    public final const val ITEM_WAVE: Long = 14

    /**
     * Each list item has a filled circle marker.
     */
    public final const val LIST_DOTS: Long = 2

    /**
     * Each list item has a letter marker.
     */
    public final const val LIST_LETTERS: Long = 1

    /**
     * Each list item has a number marker.
     */
    public final const val LIST_NUMBERS: Long = 0
  }
}
