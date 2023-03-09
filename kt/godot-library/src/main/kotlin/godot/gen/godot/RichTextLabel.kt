// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Dictionary
import godot.core.PackedStringArray
import godot.core.Rect2
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
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.signals.Signal0
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
 * **Note:** Assignments to [text] clear the tag stack and reconstruct it from the property's contents. Any edits made to [text] will erase previous edits made from other manual sources such as [appendText] and the `push_*` / [pop] methods.
 *
 * **Note:** RichTextLabel doesn't support entangled BBCode tags. For example, instead of using `**bold*bold italic**italic*`, use `**bold*bold italic****italic*`.
 *
 * **Note:** `push_* / pop` functions won't affect BBCode.
 *
 * **Note:** Unlike [godot.Label], RichTextLabel doesn't have a *property* to horizontally align text to the center. Instead, enable [bbcodeEnabled] and surround the text in a `[center]` tag as follows: `[center]Example[/center]`. There is currently no built-in way to vertically align text either, but this can be emulated by relying on anchors/containers and the [fitContent] property.
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
   * Triggered when the document is fully loaded.
   */
  public val finished: Signal0 by signal()

  /**
   * If `true`, the label uses BBCode formatting.
   */
  public var bbcodeEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_IS_USING_BBCODE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_USE_BBCODE, NIL)
    }

  /**
   * The label's text in BBCode format. Is not representative of manual modifications to the internal tag stack. Erases changes made by other methods when edited.
   *
   * **Note:** If [bbcodeEnabled] is `true`, it is unadvised to use the `+=` operator with `text` (e.g. `text += "some string"`) as it replaces the whole text and can cause slowdowns. It will also erase all BBCode that was added to stack using `push_*` methods. Use [appendText] for adding text instead, unless you absolutely need to close a tag that was opened in an earlier method call.
   */
  public var text: String
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
   * If `true`, the label's minimum size will be automatically updated to fit its content, matching the behavior of [godot.Label].
   */
  public var fitContent: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_IS_FIT_CONTENT_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_FIT_CONTENT,
          NIL)
    }

  /**
   * If `true`, the scrollbar is visible. Setting this to `false` does not block scrolling completely. See [scrollToLine].
   */
  public var scrollActive: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_IS_SCROLL_ACTIVE,
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
  public var scrollFollowing: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_IS_SCROLL_FOLLOWING,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_SCROLL_FOLLOW,
          NIL)
    }

  /**
   * If set to something other than [godot.TextServer.AUTOWRAP_OFF], the text gets wrapped inside the node's bounding rectangle. To see how each mode behaves, see [enum TextServer.AutowrapMode].
   */
  public var autowrapMode: TextServer.AutowrapMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_AUTOWRAP_MODE,
          LONG)
      return TextServer.AutowrapMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_AUTOWRAP_MODE,
          NIL)
    }

  /**
   * The number of spaces associated with a single tab length. Does not affect `\t` in text tags, only indent tags.
   */
  public var tabSize: Long
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
   * If `true`, a right-click displays the context menu.
   */
  public var contextMenuEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_IS_CONTEXT_MENU_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_CONTEXT_MENU_ENABLED, NIL)
    }

  /**
   * If `true`, shortcut keys for context menu items are enabled, even if the context menu is disabled.
   */
  public var shortcutKeysEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_IS_SHORTCUT_KEYS_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_SHORTCUT_KEYS_ENABLED, NIL)
    }

  /**
   * The currently installed custom effects. This is an array of [godot.RichTextEffect]s.
   *
   * To add a custom effect, it's more convenient to use [installEffect].
   */
  public var customEffects: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_EFFECTS, ARRAY)
      return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_EFFECTS, NIL)
    }

  /**
   * If `true`, the label underlines meta tags such as `[url]{text}[/url]`.
   */
  public var metaUnderlined: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_IS_META_UNDERLINED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_META_UNDERLINE,
          NIL)
    }

  /**
   * If `true`, the label underlines hint tags such as `[hint=description]{text}[/hint]`.
   */
  public var hintUnderlined: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_IS_HINT_UNDERLINED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_HINT_UNDERLINE,
          NIL)
    }

  /**
   * If `true`, text processing is done in a background thread.
   */
  public var threaded: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_IS_THREADED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_THREADED, NIL)
    }

  /**
   * The delay after which the loading progress bar is displayed, in milliseconds. Set to `-1` to disable progress bar entirely.
   *
   * **Note:** Progress bar is displayed only if [threaded] is enabled.
   */
  public var progressBarDelay: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_PROGRESS_BAR_DELAY, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_PROGRESS_BAR_DELAY, NIL)
    }

  /**
   * If `true`, the label allows text selection.
   */
  public var selectionEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_IS_SELECTION_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_SELECTION_ENABLED, NIL)
    }

  /**
   * If `true`, the selected text will be deselected when focus is lost.
   */
  public var deselectOnFocusLossEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_IS_DESELECT_ON_FOCUS_LOSS_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_DESELECT_ON_FOCUS_LOSS_ENABLED, NIL)
    }

  /**
   * The number of characters to display. If set to `-1`, all characters are displayed. This can be useful when animating the text appearing in a dialog box.
   *
   * **Note:** Setting this property updates [visibleRatio] accordingly.
   */
  public var visibleCharacters: Long
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
   * Sets the clipping behavior when [visibleCharacters] or [visibleRatio] is set. See [enum TextServer.VisibleCharactersBehavior] for more info.
   */
  public var visibleCharactersBehavior: TextServer.VisibleCharactersBehavior
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_VISIBLE_CHARACTERS_BEHAVIOR, LONG)
      return TextServer.VisibleCharactersBehavior.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_VISIBLE_CHARACTERS_BEHAVIOR, NIL)
    }

  /**
   * The fraction of characters to display, relative to the total number of characters (see [getTotalCharacterCount]). If set to `1.0`, all characters are displayed. If set to `0.5`, only half of the characters will be displayed. This can be useful when animating the text appearing in a dialog box.
   *
   * **Note:** Setting this property updates [visibleCharacters] accordingly.
   */
  public var visibleRatio: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_VISIBLE_RATIO,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_VISIBLE_RATIO,
          NIL)
    }

  /**
   * Base text writing direction.
   */
  public var textDirection: Control.TextDirection
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_TEXT_DIRECTION,
          LONG)
      return Control.TextDirection.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_TEXT_DIRECTION,
          NIL)
    }

  /**
   * Language code used for line-breaking and text shaping algorithms, if left empty current locale is used instead.
   */
  public var language: String
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
   * Set BiDi algorithm override for the structured text.
   */
  public var structuredTextBidiOverride: TextServer.StructuredTextParser
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_STRUCTURED_TEXT_BIDI_OVERRIDE, LONG)
      return TextServer.StructuredTextParser.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_STRUCTURED_TEXT_BIDI_OVERRIDE, NIL)
    }

  /**
   * Set additional options for BiDi override.
   */
  public var structuredTextBidiOverrideOptions: VariantArray<Any?>
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

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RICHTEXTLABEL, scriptIndex)
    return true
  }

  /**
   * Returns the text without BBCode mark-up.
   */
  public fun getParsedText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_PARSED_TEXT,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Adds raw non-BBCode-parsed text to the tag stack.
   */
  public fun addText(text: String): Unit {
    TransferContext.writeArguments(STRING to text)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_ADD_TEXT, NIL)
  }

  /**
   * Adds an image's opening and closing tags to the tag stack, optionally providing a [width] and [height] to resize the image, a [color] to tint the image and a [region] to only use parts of the image.
   *
   * If [width] or [height] is set to 0, the image size will be adjusted in order to keep the original aspect ratio.
   *
   * If [width] and [height] are not set, but [region] is, the region's rect will be used.
   */
  public fun addImage(
    image: Texture2D,
    width: Long = 0,
    height: Long = 0,
    color: Color = Color(Color(1, 1, 1, 1)),
    inlineAlign: InlineAlignment = InlineAlignment.INLINE_ALIGNMENT_CENTER,
    region: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0),
  ): Unit {
    TransferContext.writeArguments(OBJECT to image, LONG to width, LONG to height, COLOR to color, LONG to inlineAlign.id, RECT2 to region)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_ADD_IMAGE, NIL)
  }

  /**
   * Adds a newline tag to the tag stack.
   */
  public fun newline(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_NEWLINE, NIL)
  }

  /**
   * Removes a paragraph of content from the label. Returns `true` if the paragraph exists.
   *
   * The [paragraph] argument is the index of the paragraph to remove, it can take values in the interval `[0, get_paragraph_count() - 1]`.
   */
  public fun removeParagraph(paragraph: Long): Boolean {
    TransferContext.writeArguments(LONG to paragraph)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_REMOVE_PARAGRAPH,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Adds a `[font]` tag to the tag stack. Overrides default fonts for its duration.
   */
  public fun pushFont(font: Font, fontSize: Long): Unit {
    TransferContext.writeArguments(OBJECT to font, LONG to fontSize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_FONT, NIL)
  }

  /**
   * Adds a `[font_size]` tag to the tag stack. Overrides default font size for its duration.
   */
  public fun pushFontSize(fontSize: Long): Unit {
    TransferContext.writeArguments(LONG to fontSize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_FONT_SIZE, NIL)
  }

  /**
   * Adds a `[font]` tag with a normal font to the tag stack.
   */
  public fun pushNormal(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_NORMAL, NIL)
  }

  /**
   * Adds a `[font]` tag with a bold font to the tag stack. This is the same as adding a `**` tag if not currently in a `*` tag.
   */
  public fun pushBold(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_BOLD, NIL)
  }

  /**
   * Adds a `[font]` tag with a bold italics font to the tag stack.
   */
  public fun pushBoldItalics(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_BOLD_ITALICS,
        NIL)
  }

  /**
   * Adds a `[font]` tag with a italics font to the tag stack. This is the same as adding a `*` tag if not currently in a `**` tag.
   */
  public fun pushItalics(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_ITALICS, NIL)
  }

  /**
   * Adds a `[font]` tag with a monospace font to the tag stack.
   */
  public fun pushMono(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_MONO, NIL)
  }

  /**
   * Adds a `[color]` tag to the tag stack.
   */
  public fun pushColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_COLOR, NIL)
  }

  /**
   * Adds a `[outline_size]` tag to the tag stack. Overrides default text outline size for its duration.
   */
  public fun pushOutlineSize(outlineSize: Long): Unit {
    TransferContext.writeArguments(LONG to outlineSize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_OUTLINE_SIZE,
        NIL)
  }

  /**
   * Adds a `[outline_color]` tag to the tag stack. Adds text outline for its duration.
   */
  public fun pushOutlineColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_OUTLINE_COLOR,
        NIL)
  }

  /**
   * Adds a `[p]` tag to the tag stack.
   */
  public fun pushParagraph(
    alignment: HorizontalAlignment,
    baseDirection: Control.TextDirection = Control.TextDirection.TEXT_DIRECTION_AUTO,
    language: String = "",
    stParser: TextServer.StructuredTextParser =
        TextServer.StructuredTextParser.STRUCTURED_TEXT_DEFAULT,
  ): Unit {
    TransferContext.writeArguments(LONG to alignment.id, LONG to baseDirection.id, STRING to language, LONG to stParser.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_PARAGRAPH, NIL)
  }

  /**
   * Adds an `[indent]` tag to the tag stack. Multiplies [level] by current [tabSize] to determine new margin length.
   */
  public fun pushIndent(level: Long): Unit {
    TransferContext.writeArguments(LONG to level)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_INDENT, NIL)
  }

  /**
   * Adds `[ol]` or `[ul]` tag to the tag stack. Multiplies [level] by current [tabSize] to determine new margin length.
   */
  public fun pushList(
    level: Long,
    type: ListType,
    capitalize: Boolean,
  ): Unit {
    TransferContext.writeArguments(LONG to level, LONG to type.id, BOOL to capitalize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_LIST, NIL)
  }

  /**
   * Adds a meta tag to the tag stack. Similar to the BBCode `[{text}](something)`, but supports non-[godot.String] metadata types.
   */
  public fun pushMeta(`data`: Any): Unit {
    TransferContext.writeArguments(ANY to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_META, NIL)
  }

  /**
   * Adds a `[hint]` tag to the tag stack. Same as BBCode `[hint=something]{text}[/hint]`.
   */
  public fun pushHint(description: String): Unit {
    TransferContext.writeArguments(STRING to description)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_HINT, NIL)
  }

  /**
   * Adds a `<u>` tag to the tag stack.
   */
  public fun pushUnderline(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_UNDERLINE, NIL)
  }

  /**
   * Adds a `~~` tag to the tag stack.
   */
  public fun pushStrikethrough(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_STRIKETHROUGH,
        NIL)
  }

  /**
   * Adds a `[table=columns,inline_align]` tag to the tag stack.
   */
  public fun pushTable(
    columns: Long,
    inlineAlign: InlineAlignment = InlineAlignment.INLINE_ALIGNMENT_TOP_TO,
    alignToRow: Long = -1,
  ): Unit {
    TransferContext.writeArguments(LONG to columns, LONG to inlineAlign.id, LONG to alignToRow)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_TABLE, NIL)
  }

  /**
   * Adds a `[dropcap]` tag to the tag stack. Drop cap (dropped capital) is a decorative element at the beginning of a paragraph that is larger than the rest of the text.
   */
  public fun pushDropcap(
    string: String,
    font: Font,
    size: Long,
    dropcapMargins: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0),
    color: Color = Color(Color(1, 1, 1, 1)),
    outlineSize: Long = 0,
    outlineColor: Color = Color(Color(0, 0, 0, 0)),
  ): Unit {
    TransferContext.writeArguments(STRING to string, OBJECT to font, LONG to size, RECT2 to dropcapMargins, COLOR to color, LONG to outlineSize, COLOR to outlineColor)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_DROPCAP, NIL)
  }

  /**
   * Edits the selected column's expansion options. If [expand] is `true`, the column expands in proportion to its expansion ratio versus the other columns' ratios.
   *
   * For example, 2 columns with ratios 3 and 4 plus 70 pixels in available width would expand 30 and 40 pixels, respectively.
   *
   * If [expand] is `false`, the column will not contribute to the total ratio.
   */
  public fun setTableColumnExpand(
    column: Long,
    expand: Boolean,
    ratio: Long,
  ): Unit {
    TransferContext.writeArguments(LONG to column, BOOL to expand, LONG to ratio)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_TABLE_COLUMN_EXPAND, NIL)
  }

  /**
   * Sets color of a table cell. Separate colors for alternating rows can be specified.
   */
  public fun setCellRowBackgroundColor(oddRowBg: Color, evenRowBg: Color): Unit {
    TransferContext.writeArguments(COLOR to oddRowBg, COLOR to evenRowBg)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_CELL_ROW_BACKGROUND_COLOR, NIL)
  }

  /**
   * Sets color of a table cell border.
   */
  public fun setCellBorderColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_CELL_BORDER_COLOR,
        NIL)
  }

  /**
   * Sets minimum and maximum size overrides for a table cell.
   */
  public fun setCellSizeOverride(minSize: Vector2, maxSize: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to minSize, VECTOR2 to maxSize)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_CELL_SIZE_OVERRIDE, NIL)
  }

  /**
   * Sets inner padding of a table cell.
   */
  public fun setCellPadding(padding: Rect2): Unit {
    TransferContext.writeArguments(RECT2 to padding)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SET_CELL_PADDING, NIL)
  }

  /**
   * Adds a `[cell]` tag to the tag stack. Must be inside a `[table]` tag. See [pushTable] for details.
   */
  public fun pushCell(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_CELL, NIL)
  }

  /**
   * Adds a `[fgcolor]` tag to the tag stack.
   */
  public fun pushFgcolor(fgcolor: Color): Unit {
    TransferContext.writeArguments(COLOR to fgcolor)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_FGCOLOR, NIL)
  }

  /**
   * Adds a `[bgcolor]` tag to the tag stack.
   */
  public fun pushBgcolor(bgcolor: Color): Unit {
    TransferContext.writeArguments(COLOR to bgcolor)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_BGCOLOR, NIL)
  }

  /**
   * Adds a custom effect tag to the tag stack. The effect does not need to be in [customEffects]. The environment is directly passed to the effect.
   */
  public fun pushCustomfx(effect: RichTextEffect, env: Dictionary<Any?, Any?>): Unit {
    TransferContext.writeArguments(OBJECT to effect, DICTIONARY to env)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PUSH_CUSTOMFX, NIL)
  }

  /**
   * Terminates the current tag. Use after `push_*` methods to close BBCodes manually. Does not need to follow `add_*` methods.
   */
  public fun pop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_POP, NIL)
  }

  /**
   * Clears the tag stack and sets [text] to an empty string.
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_CLEAR, NIL)
  }

  /**
   * Returns the vertical scrollbar.
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If you wish to hide it or any of its children, use their [godot.CanvasItem.visible] property.
   */
  public fun getVScrollBar(): VScrollBar? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_V_SCROLL_BAR,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as VScrollBar?
  }

  /**
   * Scrolls the window's top line to match [line].
   */
  public fun scrollToLine(line: Long): Unit {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SCROLL_TO_LINE, NIL)
  }

  /**
   * Scrolls the window's top line to match first line of the [paragraph].
   */
  public fun scrollToParagraph(paragraph: Long): Unit {
    TransferContext.writeArguments(LONG to paragraph)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SCROLL_TO_PARAGRAPH,
        NIL)
  }

  /**
   * Scrolls to the beginning of the current selection.
   */
  public fun scrollToSelection(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SCROLL_TO_SELECTION,
        NIL)
  }

  /**
   * Returns the current selection first character index if a selection is active, `-1` otherwise. Does not include BBCodes.
   */
  public fun getSelectionFrom(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_SELECTION_FROM,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the current selection last character index if a selection is active, `-1` otherwise. Does not include BBCodes.
   */
  public fun getSelectionTo(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_SELECTION_TO,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Select all the text.
   *
   * If [selectionEnabled] is `false`, no selection will occur.
   */
  public fun selectAll(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_SELECT_ALL, NIL)
  }

  /**
   * Returns the current selection text. Does not include BBCodes.
   */
  public fun getSelectedText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_SELECTED_TEXT,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Clears the current selection.
   */
  public fun deselect(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_DESELECT, NIL)
  }

  /**
   * The assignment version of [appendText]. Clears the tag stack and inserts the new content.
   */
  public fun parseBbcode(bbcode: String): Unit {
    TransferContext.writeArguments(STRING to bbcode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PARSE_BBCODE, NIL)
  }

  /**
   * Parses [bbcode] and adds tags to the tag stack as needed.
   *
   * **Note:** Using this method, you can't close a tag that was opened in a previous [appendText] call. This is done to improve performance, especially when updating large RichTextLabels since rebuilding the whole BBCode every time would be slower. If you absolutely need to close a tag in a future method call, append the [text] instead of using [appendText].
   */
  public fun appendText(bbcode: String): Unit {
    TransferContext.writeArguments(STRING to bbcode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_APPEND_TEXT, NIL)
  }

  /**
   * If [threaded] is enabled, returns `true` if the background thread has finished text processing, otherwise always return `true`.
   */
  public fun isReady(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_IS_READY, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the line number of the character position provided.
   *
   * **Note:** If [threaded] is enabled, this method returns a value for the loaded part of the document. Use [isReady] or [finished] to determine whether document is fully loaded.
   */
  public fun getCharacterLine(character: Long): Long {
    TransferContext.writeArguments(LONG to character)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_CHARACTER_LINE,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the paragraph number of the character position provided.
   *
   * **Note:** If [threaded] is enabled, this method returns a value for the loaded part of the document. Use [isReady] or [finished] to determine whether document is fully loaded.
   */
  public fun getCharacterParagraph(character: Long): Long {
    TransferContext.writeArguments(LONG to character)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_CHARACTER_PARAGRAPH, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the total number of characters from text tags. Does not include BBCodes.
   */
  public fun getTotalCharacterCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_TOTAL_CHARACTER_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the total number of lines in the text. Wrapped text is counted as multiple lines.
   *
   * **Note:** If [threaded] is enabled, this method returns a value for the loaded part of the document. Use [isReady] or [finished] to determine whether document is fully loaded.
   */
  public fun getLineCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_LINE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the number of visible lines.
   *
   * **Note:** If [threaded] is enabled, this method returns a value for the loaded part of the document. Use [isReady] or [finished] to determine whether document is fully loaded.
   */
  public fun getVisibleLineCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_VISIBLE_LINE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the total number of paragraphs (newlines or `p` tags in the tag stack's text tags). Considers wrapped text as one paragraph.
   */
  public fun getParagraphCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_PARAGRAPH_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the number of visible paragraphs. A paragraph is considered visible if at least one of its lines is visible.
   *
   * **Note:** If [threaded] is enabled, this method returns a value for the loaded part of the document. Use [isReady] or [finished] to determine whether document is fully loaded.
   */
  public fun getVisibleParagraphCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_VISIBLE_PARAGRAPH_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the height of the content.
   *
   * **Note:** If [threaded] is enabled, this method returns a value for the loaded part of the document. Use [isReady] or [finished] to determine whether document is fully loaded.
   */
  public fun getContentHeight(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_CONTENT_HEIGHT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the width of the content.
   *
   * **Note:** If [threaded] is enabled, this method returns a value for the loaded part of the document. Use [isReady] or [finished] to determine whether document is fully loaded.
   */
  public fun getContentWidth(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_CONTENT_WIDTH,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the vertical offset of the line found at the provided index.
   *
   * **Note:** If [threaded] is enabled, this method returns a value for the loaded part of the document. Use [isReady] or [finished] to determine whether document is fully loaded.
   */
  public fun getLineOffset(line: Long): Double {
    TransferContext.writeArguments(LONG to line)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_LINE_OFFSET,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the vertical offset of the paragraph found at the provided index.
   *
   * **Note:** If [threaded] is enabled, this method returns a value for the loaded part of the document. Use [isReady] or [finished] to determine whether document is fully loaded.
   */
  public fun getParagraphOffset(paragraph: Long): Double {
    TransferContext.writeArguments(LONG to paragraph)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_PARAGRAPH_OFFSET,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Parses BBCode parameter [expressions] into a dictionary.
   */
  public fun parseExpressionsForValues(expressions: PackedStringArray): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(PACKED_STRING_ARRAY to expressions)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_PARSE_EXPRESSIONS_FOR_VALUES, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Installs a custom effect. [effect] should be a valid [godot.RichTextEffect].
   */
  public fun installEffect(effect: Any): Unit {
    TransferContext.writeArguments(ANY to effect)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_INSTALL_EFFECT, NIL)
  }

  /**
   * Returns the [godot.PopupMenu] of this [godot.RichTextLabel]. By default, this menu is displayed when right-clicking on the [godot.RichTextLabel].
   *
   * You can add custom menu items or remove standard ones. Make sure your IDs don't conflict with the standard ones (see [enum MenuItems]). For example:
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * func _ready():
   *
   *     var menu = get_menu()
   *
   *     # Remove "Select All" item.
   *
   *     menu.remove_item(MENU_SELECT_ALL)
   *
   *     # Add custom items.
   *
   *     menu.add_separator()
   *
   *     menu.add_item("Duplicate Text", MENU_MAX + 1)
   *
   *     # Connect callback.
   *
   *     menu.id_pressed.connect(_on_item_pressed)
   *
   *
   *
   * func _on_item_pressed(id):
   *
   *     if id == MENU_MAX + 1:
   *
   *         add_text("\n" + get_parsed_text())
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * public override void _Ready()
   *
   * {
   *
   *     var menu = GetMenu();
   *
   *     // Remove "Select All" item.
   *
   *     menu.RemoveItem(RichTextLabel.MenuItems.SelectAll);
   *
   *     // Add custom items.
   *
   *     menu.AddSeparator();
   *
   *     menu.AddItem("Duplicate Text", RichTextLabel.MenuItems.Max + 1);
   *
   *     // Add event handler.
   *
   *     menu.IdPressed += OnItemPressed;
   *
   * }
   *
   *
   *
   * public void OnItemPressed(int id)
   *
   * {
   *
   *     if (id == TextEdit.MenuItems.Max + 1)
   *
   *     {
   *
   *         AddText("\n" + GetParsedText());
   *
   *     }
   *
   * }
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If you wish to hide it or any of its children, use their [godot.Window.visible] property.
   */
  public fun getMenu(): PopupMenu? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_GET_MENU, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as PopupMenu?
  }

  /**
   * Returns whether the menu is visible. Use this instead of `get_menu().visible` to improve performance (so the creation of the menu is avoided).
   */
  public fun isMenuVisible(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_IS_MENU_VISIBLE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Executes a given action as defined in the [enum MenuItems] enum.
   */
  public fun menuOption(option: Long): Unit {
    TransferContext.writeArguments(LONG to option)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RICHTEXTLABEL_MENU_OPTION, NIL)
  }

  public enum class ListType(
    id: Long,
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

  public enum class MenuItems(
    id: Long,
  ) {
    /**
     * Copies the selected text.
     */
    MENU_COPY(0),
    /**
     * Selects the whole [godot.RichTextLabel] text.
     */
    MENU_SELECT_ALL(1),
    /**
     * Represents the size of the [enum MenuItems] enum.
     */
    MENU_MAX(2),
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
