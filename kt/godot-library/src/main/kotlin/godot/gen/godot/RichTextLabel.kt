// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Dictionary
import godot.core.PackedStringArray
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
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
 * **Note:** Assignments to [text] clear the tag stack and reconstruct it from the property's contents. Any edits made to [text] will erase previous edits made from other manual sources such as [appendText] and the `push_*` / [pop] methods.
 *
 * **Note:** RichTextLabel doesn't support entangled BBCode tags. For example, instead of using `**bold*bold italic**italic*`, use `**bold*bold italic****italic*`.
 *
 * **Note:** `push_* / pop` functions won't affect BBCode.
 *
 * **Note:** Unlike [godot.Label], RichTextLabel doesn't have a *property* to horizontally align text to the center. Instead, enable [bbcodeEnabled] and surround the text in a `[center]` tag as follows: `[center]Example[/center]`. There is currently no built-in way to vertically align text either, but this can be emulated by relying on anchors/containers and the [fitContentHeight] property.
 */
@GodotBaseType
public open class RichTextLabel : Control() {
  /**
   * Triggered when the user clicks on content between meta tags. If the meta is defined in text, e.g. `[hi]({"data"="hi"})`, then the parameter for this signal will be a [godot.String] type. If a particular type or an object is desired, the [pushMeta] method must be used to manually insert the data into the tag stack.
   */
  public val metaClicked: Signal1<Any> by signal("meta")

  /**
   * Triggers when the mouse enters a meta tag.
   */
  public val metaHoverStarted: Signal1<Any> by signal("meta")

  /**
   * Triggers when the mouse exits a meta tag.
   */
  public val metaHoverEnded: Signal1<Any> by signal("meta")

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
   * Sets the clipping behavior when [visibleCharacters] or [percentVisible] is set. See [enum VisibleCharactersBehavior] for more info.
   */
  public open var visibleCharactersBehavior: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_VISIBLE_CHARACTERS_BEHAVIOR, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_VISIBLE_CHARACTERS_BEHAVIOR, NIL)
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
   * The label's text in BBCode format. Is not representative of manual modifications to the internal tag stack. Erases changes made by other methods when edited.
   *
   * **Note:** If [bbcodeEnabled] is `true`, it is unadvised to use the `+=` operator with `text` (e.g. `text += "some string"`) as it replaces the whole text and can cause slowdowns. It will also erase all BBCode that was added to stack using `push_*` methods. Use [appendText] for adding text instead, unless you absolutely need to close a tag that was opened in an earlier method call.
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
   * If `true`, the label uses BBCode formatting.
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
   * If `true`, the selected text will be deselected when focus is lost.
   */
  public open var deselectOnFocusLossEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_DESELECT_ON_FOCUS_LOSS_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_DESELECT_ON_FOCUS_LOSS_ENABLED, NIL)
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
   * Base text writing direction.
   */
  public open var textDirection: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_TEXT_DIRECTION,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_TEXT_DIRECTION,
          NIL)
    }

  /**
   * Language code used for line-breaking and text shaping algorithms, if left empty current locale is used instead.
   */
  public open var language: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_LANGUAGE,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_LANGUAGE, NIL)
    }

  /**
   * If set to something other than [AUTOWRAP_OFF], the text gets wrapped inside the node's bounding rectangle. To see how each mode behaves, see [enum AutowrapMode].
   */
  public open var autowrapMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_AUTOWRAP_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_AUTOWRAP_MODE,
          NIL)
    }

  /**
   * Set BiDi algorithm override for the structured text.
   */
  public open var structuredTextBidiOverride: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_STRUCTURED_TEXT_BIDI_OVERRIDE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_STRUCTURED_TEXT_BIDI_OVERRIDE, NIL)
    }

  /**
   * Set additional options for BiDi override.
   */
  public open var structuredTextBidiOverrideOptions: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_STRUCTURED_TEXT_BIDI_OVERRIDE_OPTIONS, ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_STRUCTURED_TEXT_BIDI_OVERRIDE_OPTIONS, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_RICHTEXTLABEL)
  }

  /**
   * Returns the text without BBCode mark-up.
   */
  public open fun getParsedText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_PARSED_TEXT,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Adds raw non-BBCode-parsed text to the tag stack.
   */
  public open fun addText(text: String): Unit {
    TransferContext.writeArguments(STRING to text)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_ADD_TEXT, NIL)
  }

  /**
   * Adds an image's opening and closing tags to the tag stack, optionally providing a `width` and `height` to resize the image and a `color` to tint the image.
   *
   * If `width` or `height` is set to 0, the image size will be adjusted in order to keep the original aspect ratio.
   */
  public open fun addImage(
    image: Texture2D,
    width: Long = 0,
    height: Long = 0,
    color: Color = Color(Color(1, 1, 1, 1)),
    inlineAlign: InlineAlignment = InlineAlignment.INLINE_ALIGNMENT_CENTER
  ): Unit {
    TransferContext.writeArguments(OBJECT to image, LONG to width, LONG to height, COLOR to color,
        LONG to inlineAlign.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_ADD_IMAGE, NIL)
  }

  /**
   * Adds a newline tag to the tag stack.
   */
  public open fun newline(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_NEWLINE, NIL)
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
   * Adds a `[font]` tag to the tag stack. Overrides default fonts for its duration.
   */
  public open fun pushFont(font: Font): Unit {
    TransferContext.writeArguments(OBJECT to font)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_FONT, NIL)
  }

  /**
   * Adds a `[font_size]` tag to the tag stack. Overrides default font size for its duration.
   */
  public open fun pushFontSize(fontSize: Long): Unit {
    TransferContext.writeArguments(LONG to fontSize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_FONT_SIZE, NIL)
  }

  /**
   * Adds a `[ot_feature]` tag to the tag stack. Overrides default OpenType font feature for its duration.
   */
  public open fun pushFontFeatures(opentypeFeatures: Dictionary<Any?, Any?>): Unit {
    TransferContext.writeArguments(DICTIONARY to opentypeFeatures)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_FONT_FEATURES,
        NIL)
  }

  /**
   * Adds a `[font]` tag with a normal font to the tag stack.
   */
  public open fun pushNormal(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_NORMAL, NIL)
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
   * Adds a `[font]` tag with a italics font to the tag stack. This is the same as adding a `*` tag if not currently in a `**` tag.
   */
  public open fun pushItalics(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_ITALICS, NIL)
  }

  /**
   * Adds a `[font]` tag with a monospace font to the tag stack.
   */
  public open fun pushMono(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_MONO, NIL)
  }

  /**
   * Adds a `[color]` tag to the tag stack.
   */
  public open fun pushColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_COLOR, NIL)
  }

  /**
   * Adds a `[outline_size]` tag to the tag stack. Overrides default text outline size for its duration.
   */
  public open fun pushOutlineSize(outlineSize: Long): Unit {
    TransferContext.writeArguments(LONG to outlineSize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_OUTLINE_SIZE,
        NIL)
  }

  /**
   * Adds a `[outline_color]` tag to the tag stack. Adds text outline for its duration.
   */
  public open fun pushOutlineColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_OUTLINE_COLOR,
        NIL)
  }

  /**
   * Adds a `[p]` tag to the tag stack.
   */
  public open fun pushParagraph(
    alignment: HorizontalAlignment,
    baseDirection: Control.TextDirection = TextDirection.TEXT_DIRECTION_AUTO,
    language: String = "",
    stParser: Control.StructuredTextParser = StructuredTextParser.STRUCTURED_TEXT_DEFAULT
  ): Unit {
    TransferContext.writeArguments(LONG to alignment.id, LONG to baseDirection.id, STRING to
        language, LONG to stParser.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_PARAGRAPH, NIL)
  }

  /**
   * Adds an `[indent]` tag to the tag stack. Multiplies `level` by current [tabSize] to determine new margin length.
   */
  public open fun pushIndent(level: Long): Unit {
    TransferContext.writeArguments(LONG to level)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_INDENT, NIL)
  }

  /**
   * Adds `[ol]` or `[ul]` tag to the tag stack. Multiplies `level` by current [tabSize] to determine new margin length.
   */
  public open fun pushList(
    level: Long,
    type: RichTextLabel.ListType,
    capitalize: Boolean
  ): Unit {
    TransferContext.writeArguments(LONG to level, LONG to type.id, BOOL to capitalize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_LIST, NIL)
  }

  /**
   * Adds a `[meta]` tag to the tag stack. Similar to the BBCode `[{text}](something)`, but supports non-[godot.String] metadata types.
   */
  public open fun pushMeta(`data`: Any): Unit {
    TransferContext.writeArguments(ANY to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_META, NIL)
  }

  /**
   * Adds a `<u>` tag to the tag stack.
   */
  public open fun pushUnderline(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_UNDERLINE, NIL)
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
   * Adds a `[table=columns,inline_align]` tag to the tag stack.
   */
  public open fun pushTable(columns: Long, inlineAlign: InlineAlignment =
      InlineAlignment.INLINE_ALIGNMENT_TOP_TO): Unit {
    TransferContext.writeArguments(LONG to columns, LONG to inlineAlign.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_TABLE, NIL)
  }

  /**
   * Adds a `[dropcap]` tag to the tag stack. Drop cap (dropped capital) is a decorative element at the beginning of a paragraph that is larger than the rest of the text.
   */
  public open fun pushDropcap(
    string: String,
    font: Font,
    size: Long,
    dropcapMargins: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0),
    color: Color = Color(Color(1, 1, 1, 1)),
    outlineSize: Long = 0,
    outlineColor: Color = Color(Color(0, 0, 0, 0))
  ): Unit {
    TransferContext.writeArguments(STRING to string, OBJECT to font, LONG to size, RECT2 to
        dropcapMargins, COLOR to color, LONG to outlineSize, COLOR to outlineColor)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_DROPCAP, NIL)
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

  /**
   * Sets color of a table cell. Separate colors for alternating rows can be specified.
   */
  public open fun setCellRowBackgroundColor(oddRowBg: Color, evenRowBg: Color): Unit {
    TransferContext.writeArguments(COLOR to oddRowBg, COLOR to evenRowBg)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_CELL_ROW_BACKGROUND_COLOR, NIL)
  }

  /**
   * Sets color of a table cell border.
   */
  public open fun setCellBorderColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_CELL_BORDER_COLOR,
        NIL)
  }

  /**
   * Sets minimum and maximum size overrides for a table cell.
   */
  public open fun setCellSizeOverride(minSize: Vector2, maxSize: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to minSize, VECTOR2 to maxSize)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_CELL_SIZE_OVERRIDE, NIL)
  }

  /**
   * Sets inner padding of a table cell.
   */
  public open fun setCellPadding(padding: Rect2): Unit {
    TransferContext.writeArguments(RECT2 to padding)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_CELL_PADDING, NIL)
  }

  /**
   * Adds a `[cell]` tag to the tag stack. Must be inside a `[table]` tag. See [pushTable] for details.
   */
  public open fun pushCell(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_CELL, NIL)
  }

  /**
   * Adds a `[fgcolor]` tag to the tag stack.
   */
  public open fun pushFgcolor(fgcolor: Color): Unit {
    TransferContext.writeArguments(COLOR to fgcolor)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_FGCOLOR, NIL)
  }

  /**
   * Adds a `[bgcolor]` tag to the tag stack.
   */
  public open fun pushBgcolor(bgcolor: Color): Unit {
    TransferContext.writeArguments(COLOR to bgcolor)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_BGCOLOR, NIL)
  }

  /**
   * Terminates the current tag. Use after `push_*` methods to close BBCodes manually. Does not need to follow `add_*` methods.
   */
  public open fun pop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_POP, NIL)
  }

  /**
   * Clears the tag stack and sets [text] to an empty string.
   */
  public open fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_CLEAR, NIL)
  }

  /**
   * Returns the vertical scrollbar.
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If you wish to hide it or any of its children, use their [godot.CanvasItem.visible] property.
   */
  public open fun getVScrollBar(): VScrollBar? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_V_SCROLL_BAR,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as VScrollBar?
  }

  /**
   * Scrolls the window's top line to match `line`.
   */
  public open fun scrollToLine(line: Long): Unit {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SCROLL_TO_LINE, NIL)
  }

  /**
   * Scrolls the window's top line to match first line of the `paragraph`.
   */
  public open fun scrollToParagraph(paragraph: Long): Unit {
    TransferContext.writeArguments(LONG to paragraph)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SCROLL_TO_PARAGRAPH,
        NIL)
  }

  /**
   * Returns the current selection first character index if a selection is active, `-1` otherwise. Does not include BBCodes.
   */
  public open fun getSelectionFrom(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_SELECTION_FROM,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the current selection last character index if a selection is active, `-1` otherwise. Does not include BBCodes.
   */
  public open fun getSelectionTo(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_SELECTION_TO,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the current selection text. Does not include BBCodes.
   */
  public open fun getSelectedText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_SELECTED_TEXT,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * The assignment version of [appendText]. Clears the tag stack and inserts the new content.
   */
  public open fun parseBbcode(bbcode: String): Unit {
    TransferContext.writeArguments(STRING to bbcode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PARSE_BBCODE, NIL)
  }

  /**
   * Parses `bbcode` and adds tags to the tag stack as needed.
   *
   * **Note:** Using this method, you can't close a tag that was opened in a previous [appendText] call. This is done to improve performance, especially when updating large RichTextLabels since rebuilding the whole BBCode every time would be slower. If you absolutely need to close a tag in a future method call, append the [text] instead of using [appendText].
   */
  public open fun appendText(bbcode: String): Unit {
    TransferContext.writeArguments(STRING to bbcode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_APPEND_TEXT, NIL)
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
   * Returns the total number of lines in the text. Wrapped text is counted as multiple lines.
   */
  public open fun getLineCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_LINE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
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
   * Returns the total number of paragraphs (newlines or `p` tags in the tag stack's text tags). Considers wrapped text as one paragraph.
   */
  public open fun getParagraphCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_PARAGRAPH_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the number of visible paragraphs. A paragraph is considered visible if at least one of its lines is visible.
   */
  public open fun getVisibleParagraphCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_VISIBLE_PARAGRAPH_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
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
   * Parses BBCode parameter `expressions` into a dictionary.
   */
  public open fun parseExpressionsForValues(expressions: PackedStringArray):
      Dictionary<Any?, Any?> {
    TransferContext.writeArguments(PACKED_STRING_ARRAY to expressions)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PARSE_EXPRESSIONS_FOR_VALUES, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Installs a custom effect. `effect` should be a valid [godot.RichTextEffect].
   */
  public open fun installEffect(effect: Any): Unit {
    TransferContext.writeArguments(ANY to effect)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_INSTALL_EFFECT, NIL)
  }

  public enum class VisibleCharactersBehavior(
    id: Long
  ) {
    /**
     * Trims text before the shaping. e.g, increasing [visibleCharacters] value is visually identical to typing the text.
     */
    VC_CHARS_BEFORE_SHAPING(0),
    /**
     * Displays glyphs that are mapped to the first [visibleCharacters] characters from the beginning of the text.
     */
    VC_CHARS_AFTER_SHAPING(1),
    /**
     * Displays [percentVisible] glyphs, starting from the left or from the right, depending on [godot.Control.layoutDirection] value.
     */
    VC_GLYPHS_AUTO(2),
    /**
     * Displays [percentVisible] glyphs, starting from the left.
     */
    VC_GLYPHS_LTR(3),
    /**
     * Displays [percentVisible] glyphs, starting from the right.
     */
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
     * Each list item has a roman number marker.
     */
    LIST_ROMAN(2),
    /**
     * Each list item has a filled circle marker.
     */
    LIST_DOTS(3),
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
    /**
     * Autowrap is disabled.
     */
    AUTOWRAP_OFF(0),
    /**
     * Wraps the text inside the node's bounding rectangle by allowing to break lines at arbitrary positions, which is useful when very limited space is available.
     */
    AUTOWRAP_ARBITRARY(1),
    /**
     * Wraps the text inside the node's bounding rectangle by soft-breaking between words.
     */
    AUTOWRAP_WORD(2),
    /**
     * Behaves similarly to [AUTOWRAP_WORD], but force-breaks a word if that single word does not fit in one line.
     */
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
    ITEM_FONT_SIZE(5),
    /**
     *
     */
    ITEM_FONT_FEATURES(6),
    /**
     *
     */
    ITEM_COLOR(7),
    /**
     *
     */
    ITEM_OUTLINE_SIZE(8),
    /**
     *
     */
    ITEM_OUTLINE_COLOR(9),
    /**
     *
     */
    ITEM_UNDERLINE(10),
    /**
     *
     */
    ITEM_STRIKETHROUGH(11),
    /**
     *
     */
    ITEM_PARAGRAPH(12),
    /**
     *
     */
    ITEM_INDENT(13),
    /**
     *
     */
    ITEM_LIST(14),
    /**
     *
     */
    ITEM_TABLE(15),
    /**
     *
     */
    ITEM_FADE(16),
    /**
     *
     */
    ITEM_SHAKE(17),
    /**
     *
     */
    ITEM_WAVE(18),
    /**
     *
     */
    ITEM_TORNADO(19),
    /**
     *
     */
    ITEM_RAINBOW(20),
    /**
     *
     */
    ITEM_BGCOLOR(21),
    /**
     *
     */
    ITEM_FGCOLOR(22),
    /**
     *
     */
    ITEM_META(23),
    /**
     *
     */
    ITEM_DROPCAP(24),
    /**
     *
     */
    ITEM_CUSTOMFX(25),
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
