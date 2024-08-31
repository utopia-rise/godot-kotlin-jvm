// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Dictionary
import godot.core.PackedFloat32Array
import godot.core.PackedStringArray
import godot.core.Rect2
import godot.core.TypeManager
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
import godot.core.VariantType.PACKED_FLOAT_32_ARRAY
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
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
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmOverloads

/**
 * A control for displaying text that can contain custom fonts, images, and basic formatting.
 * [RichTextLabel] manages these as an internal tag stack. It also adapts itself to given
 * width/heights.
 * **Note:** Assignments to [text] clear the tag stack and reconstruct it from the property's
 * contents. Any edits made to [text] will erase previous edits made from other manual sources such as
 * [appendText] and the `push_*` / [pop] methods.
 * **Note:** RichTextLabel doesn't support entangled BBCode tags. For example, instead of using
 * [code skip-lint]**bold*bold italic**italic*[/code], use [code skip-lint]**bold*bold
 * italic****italic*[/code].
 * **Note:** `push_*&#92;pop_*` functions won't affect BBCode.
 * **Note:** Unlike [Label], [RichTextLabel] doesn't have a *property* to horizontally align text to
 * the center. Instead, enable [bbcodeEnabled] and surround the text in a [code
 * skip-lint][center][/code] tag as follows: [code skip-lint][center]Example[/center][/code]. There is
 * currently no built-in way to vertically align text either, but this can be emulated by relying on
 * anchors/containers and the [fitContent] property.
 */
@GodotBaseType
public open class RichTextLabel : Control() {
  /**
   * Triggered when the user clicks on content between meta (URL) tags. If the meta is defined in
   * BBCode, e.g. [code skip-lint][url={"key": "value"}]Text[/url][/code], then the parameter for this
   * signal will always be a [String] type. If a particular type or an object is desired, the
   * [pushMeta] method must be used to manually insert the data into the tag stack. Alternatively, you
   * can convert the [String] input to the desired type based on its contents (such as calling
   * [JSON.parse] on it).
   * For example, the following method can be connected to [signal meta_clicked] to open clicked
   * URLs using the user's default web browser:
   *
   * gdscript:
   * ```gdscript
   * # This assumes RichTextLabel's `meta_clicked` signal was connected to
   * # the function below using the signal connection dialog.
   * func _richtextlabel_on_meta_clicked(meta):
   *     # `meta` is of Variant type, so convert it to a String to avoid script errors at run-time.
   *     OS.shell_open(str(meta))
   * ```
   */
  public val metaClicked: Signal1<Any?> by signal("meta")

  /**
   * Triggers when the mouse enters a meta tag.
   */
  public val metaHoverStarted: Signal1<Any?> by signal("meta")

  /**
   * Triggers when the mouse exits a meta tag.
   */
  public val metaHoverEnded: Signal1<Any?> by signal("meta")

  /**
   * Triggered when the document is fully loaded.
   */
  public val finished: Signal0 by signal()

  /**
   * If `true`, the label uses BBCode formatting.
   * **Note:** This only affects the contents of [text], not the tag stack.
   */
  public var bbcodeEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsingBbcodePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseBbcodePtr, NIL)
    }

  /**
   * The label's text in BBCode format. Is not representative of manual modifications to the
   * internal tag stack. Erases changes made by other methods when edited.
   * **Note:** If [bbcodeEnabled] is `true`, it is unadvised to use the `+=` operator with [text]
   * (e.g. `text += "some string"`) as it replaces the whole text and can cause slowdowns. It will also
   * erase all BBCode that was added to stack using `push_*` methods. Use [appendText] for adding text
   * instead, unless you absolutely need to close a tag that was opened in an earlier method call.
   */
  public var text: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextPtr, NIL)
    }

  /**
   * If `true`, the label's minimum size will be automatically updated to fit its content, matching
   * the behavior of [Label].
   */
  public var fitContent: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFitContentEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFitContentPtr, NIL)
    }

  /**
   * If `true`, the scrollbar is visible. Setting this to `false` does not block scrolling
   * completely. See [scrollToLine].
   */
  public var scrollActive: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isScrollActivePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setScrollActivePtr, NIL)
    }

  /**
   * If `true`, the window scrolls down to display new content automatically.
   */
  public var scrollFollowing: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isScrollFollowingPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setScrollFollowPtr, NIL)
    }

  /**
   * If set to something other than [TextServer.AUTOWRAP_OFF], the text gets wrapped inside the
   * node's bounding rectangle. To see how each mode behaves, see [TextServer.AutowrapMode].
   */
  public var autowrapMode: TextServer.AutowrapMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAutowrapModePtr, LONG)
      return TextServer.AutowrapMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAutowrapModePtr, NIL)
    }

  /**
   * The number of spaces associated with a single tab length. Does not affect `\t` in text tags,
   * only indent tags.
   */
  public var tabSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTabSizePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setTabSizePtr, NIL)
    }

  /**
   * If `true`, a right-click displays the context menu.
   */
  public var contextMenuEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isContextMenuEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setContextMenuEnabledPtr, NIL)
    }

  /**
   * If `true`, shortcut keys for context menu items are enabled, even if the context menu is
   * disabled.
   */
  public var shortcutKeysEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isShortcutKeysEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShortcutKeysEnabledPtr, NIL)
    }

  /**
   * The currently installed custom effects. This is an array of [RichTextEffect]s.
   * To add a custom effect, it's more convenient to use [installEffect].
   */
  public var customEffects: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEffectsPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEffectsPtr, NIL)
    }

  /**
   * If `true`, the label underlines meta tags such as [code skip-lint][url]{text}[/url][/code].
   * These tags can call a function when clicked if [signal meta_clicked] is connected to a function.
   */
  public var metaUnderlined: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isMetaUnderlinedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMetaUnderlinePtr, NIL)
    }

  /**
   * If `true`, the label underlines hint tags such as [code
   * skip-lint][hint=description]{text}[/hint][/code].
   */
  public var hintUnderlined: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isHintUnderlinedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setHintUnderlinePtr, NIL)
    }

  /**
   * If `true`, text processing is done in a background thread.
   */
  public var threaded: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isThreadedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setThreadedPtr, NIL)
    }

  /**
   * The delay after which the loading progress bar is displayed, in milliseconds. Set to `-1` to
   * disable progress bar entirely.
   * **Note:** Progress bar is displayed only if [threaded] is enabled.
   */
  public var progressBarDelay: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getProgressBarDelayPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setProgressBarDelayPtr, NIL)
    }

  /**
   * If `true`, the label allows text selection.
   */
  public var selectionEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isSelectionEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSelectionEnabledPtr, NIL)
    }

  /**
   * If `true`, the selected text will be deselected when focus is lost.
   */
  public var deselectOnFocusLossEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDeselectOnFocusLossEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDeselectOnFocusLossEnabledPtr, NIL)
    }

  /**
   * If `true`, allow drag and drop of selected text.
   */
  public var dragAndDropSelectionEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDragAndDropSelectionEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDragAndDropSelectionEnabledPtr, NIL)
    }

  /**
   * The number of characters to display. If set to `-1`, all characters are displayed. This can be
   * useful when animating the text appearing in a dialog box.
   * **Note:** Setting this property updates [visibleRatio] accordingly.
   */
  public var visibleCharacters: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVisibleCharactersPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setVisibleCharactersPtr, NIL)
    }

  /**
   * Sets the clipping behavior when [visibleCharacters] or [visibleRatio] is set. See
   * [TextServer.VisibleCharactersBehavior] for more info.
   */
  public var visibleCharactersBehavior: TextServer.VisibleCharactersBehavior
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVisibleCharactersBehaviorPtr, LONG)
      return TextServer.VisibleCharactersBehavior.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setVisibleCharactersBehaviorPtr, NIL)
    }

  /**
   * The fraction of characters to display, relative to the total number of characters (see
   * [getTotalCharacterCount]). If set to `1.0`, all characters are displayed. If set to `0.5`, only
   * half of the characters will be displayed. This can be useful when animating the text appearing in
   * a dialog box.
   * **Note:** Setting this property updates [visibleCharacters] accordingly.
   */
  public var visibleRatio: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVisibleRatioPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVisibleRatioPtr, NIL)
    }

  /**
   * Base text writing direction.
   */
  public var textDirection: Control.TextDirection
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTextDirectionPtr, LONG)
      return Control.TextDirection.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setTextDirectionPtr, NIL)
    }

  /**
   * Language code used for line-breaking and text shaping algorithms, if left empty current locale
   * is used instead.
   */
  public var language: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLanguagePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setLanguagePtr, NIL)
    }

  /**
   * Set BiDi algorithm override for the structured text.
   */
  public var structuredTextBidiOverride: TextServer.StructuredTextParser
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStructuredTextBidiOverridePtr, LONG)
      return TextServer.StructuredTextParser.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setStructuredTextBidiOverridePtr, NIL)
    }

  /**
   * Set additional options for BiDi override.
   */
  public var structuredTextBidiOverrideOptions: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStructuredTextBidiOverrideOptionsPtr,
          ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStructuredTextBidiOverrideOptionsPtr,
          NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_RICHTEXTLABEL, scriptIndex)
  }

  /**
   * Returns the text without BBCode mark-up.
   */
  public fun getParsedText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getParsedTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Adds raw non-BBCode-parsed text to the tag stack.
   */
  public fun addText(text: String): Unit {
    TransferContext.writeArguments(STRING to text)
    TransferContext.callMethod(rawPtr, MethodBindings.addTextPtr, NIL)
  }

  /**
   * Adds an image's opening and closing tags to the tag stack, optionally providing a [width] and
   * [height] to resize the image, a [color] to tint the image and a [region] to only use parts of the
   * image.
   * If [width] or [height] is set to 0, the image size will be adjusted in order to keep the
   * original aspect ratio.
   * If [width] and [height] are not set, but [region] is, the region's rect will be used.
   * [key] is an optional identifier, that can be used to modify the image via [updateImage].
   * If [pad] is set, and the image is smaller than the size specified by [width] and [height], the
   * image padding is added to match the size instead of upscaling.
   * If [sizeInPercent] is set, [width] and [height] values are percentages of the control width
   * instead of pixels.
   */
  @JvmOverloads
  public fun addImage(
    image: Texture2D,
    width: Int = 0,
    height: Int = 0,
    color: Color = Color(Color(1, 1, 1, 1)),
    inlineAlign: InlineAlignment = InlineAlignment.INLINE_ALIGNMENT_CENTER,
    region: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0),
    key: Any? = null,
    pad: Boolean = false,
    tooltip: String = "",
    sizeInPercent: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(OBJECT to image, LONG to width.toLong(), LONG to height.toLong(), COLOR to color, LONG to inlineAlign.id, RECT2 to region, ANY to key, BOOL to pad, STRING to tooltip, BOOL to sizeInPercent)
    TransferContext.callMethod(rawPtr, MethodBindings.addImagePtr, NIL)
  }

  /**
   * Updates the existing images with the key [key]. Only properties specified by [mask] bits are
   * updated. See [addImage].
   */
  @JvmOverloads
  public fun updateImage(
    key: Any?,
    mask: ImageUpdateMask,
    image: Texture2D,
    width: Int = 0,
    height: Int = 0,
    color: Color = Color(Color(1, 1, 1, 1)),
    inlineAlign: InlineAlignment = InlineAlignment.INLINE_ALIGNMENT_CENTER,
    region: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0),
    pad: Boolean = false,
    tooltip: String = "",
    sizeInPercent: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(ANY to key, LONG to mask.flag, OBJECT to image, LONG to width.toLong(), LONG to height.toLong(), COLOR to color, LONG to inlineAlign.id, RECT2 to region, BOOL to pad, STRING to tooltip, BOOL to sizeInPercent)
    TransferContext.callMethod(rawPtr, MethodBindings.updateImagePtr, NIL)
  }

  /**
   * Adds a newline tag to the tag stack.
   */
  public fun newline(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.newlinePtr, NIL)
  }

  /**
   * Removes a paragraph of content from the label. Returns `true` if the paragraph exists.
   * The [paragraph] argument is the index of the paragraph to remove, it can take values in the
   * interval `[0, get_paragraph_count() - 1]`.
   * If [noInvalidate] is set to `true`, cache for the subsequent paragraphs is not invalidated. Use
   * it for faster updates if deleted paragraph is fully self-contained (have no unclosed tags), or
   * this call is part of the complex edit operation and [invalidateParagraph] will be called at the
   * end of operation.
   */
  @JvmOverloads
  public fun removeParagraph(paragraph: Int, noInvalidate: Boolean = false): Boolean {
    TransferContext.writeArguments(LONG to paragraph.toLong(), BOOL to noInvalidate)
    TransferContext.callMethod(rawPtr, MethodBindings.removeParagraphPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Invalidates [paragraph] and all subsequent paragraphs cache.
   */
  public fun invalidateParagraph(paragraph: Int): Boolean {
    TransferContext.writeArguments(LONG to paragraph.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.invalidateParagraphPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Adds a [code skip-lint][font][/code] tag to the tag stack. Overrides default fonts for its
   * duration.
   * Passing `0` to [fontSize] will use the existing default font size.
   */
  @JvmOverloads
  public fun pushFont(font: Font, fontSize: Int = 0): Unit {
    TransferContext.writeArguments(OBJECT to font, LONG to fontSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.pushFontPtr, NIL)
  }

  /**
   * Adds a [code skip-lint][font_size][/code] tag to the tag stack. Overrides default font size for
   * its duration.
   */
  public fun pushFontSize(fontSize: Int): Unit {
    TransferContext.writeArguments(LONG to fontSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.pushFontSizePtr, NIL)
  }

  /**
   * Adds a [code skip-lint][font][/code] tag with a normal font to the tag stack.
   */
  public fun pushNormal(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pushNormalPtr, NIL)
  }

  /**
   * Adds a [code skip-lint][font][/code] tag with a bold font to the tag stack. This is the same as
   * adding a [code skip-lint][b][/code] tag if not currently in a [code skip-lint][i][/code] tag.
   */
  public fun pushBold(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pushBoldPtr, NIL)
  }

  /**
   * Adds a [code skip-lint][font][/code] tag with a bold italics font to the tag stack.
   */
  public fun pushBoldItalics(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pushBoldItalicsPtr, NIL)
  }

  /**
   * Adds a [code skip-lint][font][/code] tag with an italics font to the tag stack. This is the
   * same as adding an [code skip-lint][i][/code] tag if not currently in a [code skip-lint][b][/code]
   * tag.
   */
  public fun pushItalics(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pushItalicsPtr, NIL)
  }

  /**
   * Adds a [code skip-lint][font][/code] tag with a monospace font to the tag stack.
   */
  public fun pushMono(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pushMonoPtr, NIL)
  }

  /**
   * Adds a [code skip-lint][color][/code] tag to the tag stack.
   */
  public fun pushColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.pushColorPtr, NIL)
  }

  /**
   * Adds a [code skip-lint][outline_size][/code] tag to the tag stack. Overrides default text
   * outline size for its duration.
   */
  public fun pushOutlineSize(outlineSize: Int): Unit {
    TransferContext.writeArguments(LONG to outlineSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.pushOutlineSizePtr, NIL)
  }

  /**
   * Adds a [code skip-lint][outline_color][/code] tag to the tag stack. Adds text outline for its
   * duration.
   */
  public fun pushOutlineColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.pushOutlineColorPtr, NIL)
  }

  /**
   * Adds a [code skip-lint][p][/code] tag to the tag stack.
   */
  @JvmOverloads
  public fun pushParagraph(
    alignment: HorizontalAlignment,
    baseDirection: Control.TextDirection = Control.TextDirection.TEXT_DIRECTION_AUTO,
    language: String = "",
    stParser: TextServer.StructuredTextParser =
        TextServer.StructuredTextParser.STRUCTURED_TEXT_DEFAULT,
    justificationFlags: TextServer.JustificationFlag = TextServer.JustificationFlagValue(163),
    tabStops: PackedFloat32Array = PackedFloat32Array(),
  ): Unit {
    TransferContext.writeArguments(LONG to alignment.id, LONG to baseDirection.id, STRING to language, LONG to stParser.id, LONG to justificationFlags.flag, PACKED_FLOAT_32_ARRAY to tabStops)
    TransferContext.callMethod(rawPtr, MethodBindings.pushParagraphPtr, NIL)
  }

  /**
   * Adds an [code skip-lint][indent][/code] tag to the tag stack. Multiplies [level] by current
   * [tabSize] to determine new margin length.
   */
  public fun pushIndent(level: Int): Unit {
    TransferContext.writeArguments(LONG to level.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.pushIndentPtr, NIL)
  }

  /**
   * Adds [code skip-lint][ol][/code] or [code skip-lint][ul][/code] tag to the tag stack.
   * Multiplies [level] by current [tabSize] to determine new margin length.
   */
  @JvmOverloads
  public fun pushList(
    level: Int,
    type: ListType,
    capitalize: Boolean,
    bullet: String = "•",
  ): Unit {
    TransferContext.writeArguments(LONG to level.toLong(), LONG to type.id, BOOL to capitalize, STRING to bullet)
    TransferContext.callMethod(rawPtr, MethodBindings.pushListPtr, NIL)
  }

  /**
   * Adds a meta tag to the tag stack. Similar to the BBCode [code
   * skip-lint][url=something]{text}[/url][/code], but supports non-[String] metadata types.
   * If [metaUnderlined] is `true`, meta tags display an underline. This behavior can be customized
   * with [underlineMode].
   * **Note:** Meta tags do nothing by default when clicked. To assign behavior when clicked,
   * connect [signal meta_clicked] to a function that is called when the meta tag is clicked.
   */
  @JvmOverloads
  public fun pushMeta(`data`: Any?, underlineMode: MetaUnderline =
      RichTextLabel.MetaUnderline.META_UNDERLINE_ALWAYS): Unit {
    TransferContext.writeArguments(ANY to data, LONG to underlineMode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.pushMetaPtr, NIL)
  }

  /**
   * Adds a [code skip-lint][hint][/code] tag to the tag stack. Same as BBCode [code
   * skip-lint][hint=something]{text}[/hint][/code].
   */
  public fun pushHint(description: String): Unit {
    TransferContext.writeArguments(STRING to description)
    TransferContext.callMethod(rawPtr, MethodBindings.pushHintPtr, NIL)
  }

  /**
   * Adds language code used for text shaping algorithm and Open-Type font features.
   */
  public fun pushLanguage(language: String): Unit {
    TransferContext.writeArguments(STRING to language)
    TransferContext.callMethod(rawPtr, MethodBindings.pushLanguagePtr, NIL)
  }

  /**
   * Adds a [code skip-lint][u][/code] tag to the tag stack.
   */
  public fun pushUnderline(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pushUnderlinePtr, NIL)
  }

  /**
   * Adds a [code skip-lint][s][/code] tag to the tag stack.
   */
  public fun pushStrikethrough(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pushStrikethroughPtr, NIL)
  }

  /**
   * Adds a [code skip-lint][table=columns,inline_align][/code] tag to the tag stack. Use
   * [setTableColumnExpand] to set column expansion ratio. Use [pushCell] to add cells.
   */
  @JvmOverloads
  public fun pushTable(
    columns: Int,
    inlineAlign: InlineAlignment = InlineAlignment.INLINE_ALIGNMENT_TOP_TO,
    alignToRow: Int = -1,
  ): Unit {
    TransferContext.writeArguments(LONG to columns.toLong(), LONG to inlineAlign.id, LONG to alignToRow.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.pushTablePtr, NIL)
  }

  /**
   * Adds a [code skip-lint][dropcap][/code] tag to the tag stack. Drop cap (dropped capital) is a
   * decorative element at the beginning of a paragraph that is larger than the rest of the text.
   */
  @JvmOverloads
  public fun pushDropcap(
    string: String,
    font: Font,
    size: Int,
    dropcapMargins: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0),
    color: Color = Color(Color(1, 1, 1, 1)),
    outlineSize: Int = 0,
    outlineColor: Color = Color(Color(0, 0, 0, 0)),
  ): Unit {
    TransferContext.writeArguments(STRING to string, OBJECT to font, LONG to size.toLong(), RECT2 to dropcapMargins, COLOR to color, LONG to outlineSize.toLong(), COLOR to outlineColor)
    TransferContext.callMethod(rawPtr, MethodBindings.pushDropcapPtr, NIL)
  }

  /**
   * Edits the selected column's expansion options. If [expand] is `true`, the column expands in
   * proportion to its expansion ratio versus the other columns' ratios.
   * For example, 2 columns with ratios 3 and 4 plus 70 pixels in available width would expand 30
   * and 40 pixels, respectively.
   * If [expand] is `false`, the column will not contribute to the total ratio.
   */
  @JvmOverloads
  public fun setTableColumnExpand(
    column: Int,
    expand: Boolean,
    ratio: Int = 1,
  ): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), BOOL to expand, LONG to ratio.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setTableColumnExpandPtr, NIL)
  }

  /**
   * Sets color of a table cell. Separate colors for alternating rows can be specified.
   */
  public fun setCellRowBackgroundColor(oddRowBg: Color, evenRowBg: Color): Unit {
    TransferContext.writeArguments(COLOR to oddRowBg, COLOR to evenRowBg)
    TransferContext.callMethod(rawPtr, MethodBindings.setCellRowBackgroundColorPtr, NIL)
  }

  /**
   * Sets color of a table cell border.
   */
  public fun setCellBorderColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.setCellBorderColorPtr, NIL)
  }

  /**
   * Sets minimum and maximum size overrides for a table cell.
   */
  public fun setCellSizeOverride(minSize: Vector2, maxSize: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to minSize, VECTOR2 to maxSize)
    TransferContext.callMethod(rawPtr, MethodBindings.setCellSizeOverridePtr, NIL)
  }

  /**
   * Sets inner padding of a table cell.
   */
  public fun setCellPadding(padding: Rect2): Unit {
    TransferContext.writeArguments(RECT2 to padding)
    TransferContext.callMethod(rawPtr, MethodBindings.setCellPaddingPtr, NIL)
  }

  /**
   * Adds a [code skip-lint][cell][/code] tag to the tag stack. Must be inside a [code
   * skip-lint][table][/code] tag. See [pushTable] for details. Use [setTableColumnExpand] to set
   * column expansion ratio, [setCellBorderColor] to set cell border, [setCellRowBackgroundColor] to
   * set cell background, [setCellSizeOverride] to override cell size, and [setCellPadding] to set
   * padding.
   */
  public fun pushCell(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pushCellPtr, NIL)
  }

  /**
   * Adds a [code skip-lint][fgcolor][/code] tag to the tag stack.
   */
  public fun pushFgcolor(fgcolor: Color): Unit {
    TransferContext.writeArguments(COLOR to fgcolor)
    TransferContext.callMethod(rawPtr, MethodBindings.pushFgcolorPtr, NIL)
  }

  /**
   * Adds a [code skip-lint][bgcolor][/code] tag to the tag stack.
   */
  public fun pushBgcolor(bgcolor: Color): Unit {
    TransferContext.writeArguments(COLOR to bgcolor)
    TransferContext.callMethod(rawPtr, MethodBindings.pushBgcolorPtr, NIL)
  }

  /**
   * Adds a custom effect tag to the tag stack. The effect does not need to be in [customEffects].
   * The environment is directly passed to the effect.
   */
  public fun pushCustomfx(effect: RichTextEffect, env: Dictionary<Any?, Any?>): Unit {
    TransferContext.writeArguments(OBJECT to effect, DICTIONARY to env)
    TransferContext.callMethod(rawPtr, MethodBindings.pushCustomfxPtr, NIL)
  }

  /**
   * Adds a context marker to the tag stack. See [popContext].
   */
  public fun pushContext(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.pushContextPtr, NIL)
  }

  /**
   * Terminates tags opened after the last [pushContext] call (including context marker), or all
   * tags if there's no context marker on the stack.
   */
  public fun popContext(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.popContextPtr, NIL)
  }

  /**
   * Terminates the current tag. Use after `push_*` methods to close BBCodes manually. Does not need
   * to follow `add_*` methods.
   */
  public fun pop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.popPtr, NIL)
  }

  /**
   * Terminates all tags opened by `push_*` methods.
   */
  public fun popAll(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.popAllPtr, NIL)
  }

  /**
   * Clears the tag stack, causing the label to display nothing.
   * **Note:** This method does not affect [text], and its contents will show again if the label is
   * redrawn. However, setting [text] to an empty [String] also clears the stack.
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Returns the vertical scrollbar.
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If
   * you wish to hide it or any of its children, use their [CanvasItem.visible] property.
   */
  public fun getVScrollBar(): VScrollBar? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVScrollBarPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as VScrollBar?)
  }

  /**
   * Scrolls the window's top line to match [line].
   */
  public fun scrollToLine(line: Int): Unit {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.scrollToLinePtr, NIL)
  }

  /**
   * Scrolls the window's top line to match first line of the [paragraph].
   */
  public fun scrollToParagraph(paragraph: Int): Unit {
    TransferContext.writeArguments(LONG to paragraph.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.scrollToParagraphPtr, NIL)
  }

  /**
   * Scrolls to the beginning of the current selection.
   */
  public fun scrollToSelection(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.scrollToSelectionPtr, NIL)
  }

  /**
   * Returns the current selection first character index if a selection is active, `-1` otherwise.
   * Does not include BBCodes.
   */
  public fun getSelectionFrom(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectionFromPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the current selection last character index if a selection is active, `-1` otherwise.
   * Does not include BBCodes.
   */
  public fun getSelectionTo(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectionToPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Select all the text.
   * If [selectionEnabled] is `false`, no selection will occur.
   */
  public fun selectAll(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.selectAllPtr, NIL)
  }

  /**
   * Returns the current selection text. Does not include BBCodes.
   */
  public fun getSelectedText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSelectedTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Clears the current selection.
   */
  public fun deselect(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.deselectPtr, NIL)
  }

  /**
   * The assignment version of [appendText]. Clears the tag stack and inserts the new content.
   */
  public fun parseBbcode(bbcode: String): Unit {
    TransferContext.writeArguments(STRING to bbcode)
    TransferContext.callMethod(rawPtr, MethodBindings.parseBbcodePtr, NIL)
  }

  /**
   * Parses [bbcode] and adds tags to the tag stack as needed.
   * **Note:** Using this method, you can't close a tag that was opened in a previous [appendText]
   * call. This is done to improve performance, especially when updating large RichTextLabels since
   * rebuilding the whole BBCode every time would be slower. If you absolutely need to close a tag in a
   * future method call, append the [text] instead of using [appendText].
   */
  public fun appendText(bbcode: String): Unit {
    TransferContext.writeArguments(STRING to bbcode)
    TransferContext.callMethod(rawPtr, MethodBindings.appendTextPtr, NIL)
  }

  /**
   * If [threaded] is enabled, returns `true` if the background thread has finished text processing,
   * otherwise always return `true`.
   */
  public fun isReady(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isReadyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the line number of the character position provided. Line and character numbers are both
   * zero-indexed.
   * **Note:** If [threaded] is enabled, this method returns a value for the loaded part of the
   * document. Use [isReady] or [signal finished] to determine whether document is fully loaded.
   */
  public fun getCharacterLine(character: Int): Int {
    TransferContext.writeArguments(LONG to character.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCharacterLinePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the paragraph number of the character position provided. Paragraph and character
   * numbers are both zero-indexed.
   * **Note:** If [threaded] is enabled, this method returns a value for the loaded part of the
   * document. Use [isReady] or [signal finished] to determine whether document is fully loaded.
   */
  public fun getCharacterParagraph(character: Int): Int {
    TransferContext.writeArguments(LONG to character.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCharacterParagraphPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the total number of characters from text tags. Does not include BBCodes.
   */
  public fun getTotalCharacterCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTotalCharacterCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the total number of lines in the text. Wrapped text is counted as multiple lines.
   * **Note:** If [threaded] is enabled, this method returns a value for the loaded part of the
   * document. Use [isReady] or [signal finished] to determine whether document is fully loaded.
   */
  public fun getLineCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLineCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the number of visible lines.
   * **Note:** If [threaded] is enabled, this method returns a value for the loaded part of the
   * document. Use [isReady] or [signal finished] to determine whether document is fully loaded.
   */
  public fun getVisibleLineCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVisibleLineCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the total number of paragraphs (newlines or `p` tags in the tag stack's text tags).
   * Considers wrapped text as one paragraph.
   */
  public fun getParagraphCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getParagraphCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the number of visible paragraphs. A paragraph is considered visible if at least one of
   * its lines is visible.
   * **Note:** If [threaded] is enabled, this method returns a value for the loaded part of the
   * document. Use [isReady] or [signal finished] to determine whether document is fully loaded.
   */
  public fun getVisibleParagraphCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getVisibleParagraphCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the height of the content.
   * **Note:** If [threaded] is enabled, this method returns a value for the loaded part of the
   * document. Use [isReady] or [signal finished] to determine whether document is fully loaded.
   */
  public fun getContentHeight(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getContentHeightPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the width of the content.
   * **Note:** If [threaded] is enabled, this method returns a value for the loaded part of the
   * document. Use [isReady] or [signal finished] to determine whether document is fully loaded.
   */
  public fun getContentWidth(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getContentWidthPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the vertical offset of the line found at the provided index.
   * **Note:** If [threaded] is enabled, this method returns a value for the loaded part of the
   * document. Use [isReady] or [signal finished] to determine whether document is fully loaded.
   */
  public fun getLineOffset(line: Int): Float {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLineOffsetPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the vertical offset of the paragraph found at the provided index.
   * **Note:** If [threaded] is enabled, this method returns a value for the loaded part of the
   * document. Use [isReady] or [signal finished] to determine whether document is fully loaded.
   */
  public fun getParagraphOffset(paragraph: Int): Float {
    TransferContext.writeArguments(LONG to paragraph.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getParagraphOffsetPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Parses BBCode parameter [expressions] into a dictionary.
   */
  public fun parseExpressionsForValues(expressions: PackedStringArray): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(PACKED_STRING_ARRAY to expressions)
    TransferContext.callMethod(rawPtr, MethodBindings.parseExpressionsForValuesPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Installs a custom effect. This can also be done in the RichTextLabel inspector using the
   * [customEffects] property. [effect] should be a valid [RichTextEffect].
   * Example RichTextEffect:
   * [codeblock]
   * # effect.gd
   * class_name MyCustomEffect
   * extends RichTextEffect
   *
   * var bbcode = "my_custom_effect"
   *
   * # ...
   * [/codeblock]
   * Registering the above effect in RichTextLabel from script:
   * [codeblock]
   * # rich_text_label.gd
   * extends RichTextLabel
   *
   * func _ready():
   *     install_effect(MyCustomEffect.new())
   *
   *     # Alternatively, if not using `class_name` in the script that extends RichTextEffect:
   *     install_effect(preload("res://effect.gd").new())
   * [/codeblock]
   */
  public fun installEffect(effect: Any?): Unit {
    TransferContext.writeArguments(ANY to effect)
    TransferContext.callMethod(rawPtr, MethodBindings.installEffectPtr, NIL)
  }

  /**
   * Returns the [PopupMenu] of this [RichTextLabel]. By default, this menu is displayed when
   * right-clicking on the [RichTextLabel].
   * You can add custom menu items or remove standard ones. Make sure your IDs don't conflict with
   * the standard ones (see [MenuItems]). For example:
   *
   * gdscript:
   * ```gdscript
   * func _ready():
   *     var menu = get_menu()
   *     # Remove "Select All" item.
   *     menu.remove_item(MENU_SELECT_ALL)
   *     # Add custom items.
   *     menu.add_separator()
   *     menu.add_item("Duplicate Text", MENU_MAX + 1)
   *     # Connect callback.
   *     menu.id_pressed.connect(_on_item_pressed)
   *
   * func _on_item_pressed(id):
   *     if id == MENU_MAX + 1:
   *         add_text("\n" + get_parsed_text())
   * ```
   * csharp:
   * ```csharp
   * public override void _Ready()
   * {
   *     var menu = GetMenu();
   *     // Remove "Select All" item.
   *     menu.RemoveItem(RichTextLabel.MenuItems.SelectAll);
   *     // Add custom items.
   *     menu.AddSeparator();
   *     menu.AddItem("Duplicate Text", RichTextLabel.MenuItems.Max + 1);
   *     // Add event handler.
   *     menu.IdPressed += OnItemPressed;
   * }
   *
   * public void OnItemPressed(int id)
   * {
   *     if (id == TextEdit.MenuItems.Max + 1)
   *     {
   *         AddText("\n" + GetParsedText());
   *     }
   * }
   * ```
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If
   * you wish to hide it or any of its children, use their [Window.visible] property.
   */
  public fun getMenu(): PopupMenu? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getMenuPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as PopupMenu?)
  }

  /**
   * Returns whether the menu is visible. Use this instead of `get_menu().visible` to improve
   * performance (so the creation of the menu is avoided).
   */
  public fun isMenuVisible(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isMenuVisiblePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Executes a given action as defined in the [MenuItems] enum.
   */
  public fun menuOption(option: Int): Unit {
    TransferContext.writeArguments(LONG to option.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.menuOptionPtr, NIL)
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
      public fun from(`value`: Long): ListType = entries.single { it.id == `value` }
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
     * Selects the whole [RichTextLabel] text.
     */
    MENU_SELECT_ALL(1),
    /**
     * Represents the size of the [MenuItems] enum.
     */
    MENU_MAX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): MenuItems = entries.single { it.id == `value` }
    }
  }

  public enum class MetaUnderline(
    id: Long,
  ) {
    /**
     * Meta tag does not display an underline, even if [metaUnderlined] is `true`.
     */
    META_UNDERLINE_NEVER(0),
    /**
     * If [metaUnderlined] is `true`, meta tag always display an underline.
     */
    META_UNDERLINE_ALWAYS(1),
    /**
     * If [metaUnderlined] is `true`, meta tag display an underline when the mouse cursor is over
     * it.
     */
    META_UNDERLINE_ON_HOVER(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public sealed interface ImageUpdateMask {
    public val flag: Long

    public infix fun or(other: ImageUpdateMask): ImageUpdateMask =
        ImageUpdateMaskValue(flag.or(other.flag))

    public infix fun or(other: Long): ImageUpdateMask = ImageUpdateMaskValue(flag.or(other))

    public infix fun xor(other: ImageUpdateMask): ImageUpdateMask =
        ImageUpdateMaskValue(flag.xor(other.flag))

    public infix fun xor(other: Long): ImageUpdateMask = ImageUpdateMaskValue(flag.xor(other))

    public infix fun and(other: ImageUpdateMask): ImageUpdateMask =
        ImageUpdateMaskValue(flag.and(other.flag))

    public infix fun and(other: Long): ImageUpdateMask = ImageUpdateMaskValue(flag.and(other))

    public operator fun plus(other: ImageUpdateMask): ImageUpdateMask =
        ImageUpdateMaskValue(flag.plus(other.flag))

    public operator fun plus(other: Long): ImageUpdateMask = ImageUpdateMaskValue(flag.plus(other))

    public operator fun minus(other: ImageUpdateMask): ImageUpdateMask =
        ImageUpdateMaskValue(flag.minus(other.flag))

    public operator fun minus(other: Long): ImageUpdateMask =
        ImageUpdateMaskValue(flag.minus(other))

    public operator fun times(other: ImageUpdateMask): ImageUpdateMask =
        ImageUpdateMaskValue(flag.times(other.flag))

    public operator fun times(other: Long): ImageUpdateMask =
        ImageUpdateMaskValue(flag.times(other))

    public operator fun div(other: ImageUpdateMask): ImageUpdateMask =
        ImageUpdateMaskValue(flag.div(other.flag))

    public operator fun div(other: Long): ImageUpdateMask = ImageUpdateMaskValue(flag.div(other))

    public operator fun rem(other: ImageUpdateMask): ImageUpdateMask =
        ImageUpdateMaskValue(flag.rem(other.flag))

    public operator fun rem(other: Long): ImageUpdateMask = ImageUpdateMaskValue(flag.rem(other))

    public fun unaryPlus(): ImageUpdateMask = ImageUpdateMaskValue(flag.unaryPlus())

    public fun unaryMinus(): ImageUpdateMask = ImageUpdateMaskValue(flag.unaryMinus())

    public fun inv(): ImageUpdateMask = ImageUpdateMaskValue(flag.inv())

    public infix fun shl(bits: Int): ImageUpdateMask = ImageUpdateMaskValue(flag shl bits)

    public infix fun shr(bits: Int): ImageUpdateMask = ImageUpdateMaskValue(flag shr bits)

    public infix fun ushr(bits: Int): ImageUpdateMask = ImageUpdateMaskValue(flag ushr bits)

    public companion object {
      public val UPDATE_TEXTURE: ImageUpdateMask = ImageUpdateMaskValue(1)

      public val UPDATE_SIZE: ImageUpdateMask = ImageUpdateMaskValue(2)

      public val UPDATE_COLOR: ImageUpdateMask = ImageUpdateMaskValue(4)

      public val UPDATE_ALIGNMENT: ImageUpdateMask = ImageUpdateMaskValue(8)

      public val UPDATE_REGION: ImageUpdateMask = ImageUpdateMaskValue(16)

      public val UPDATE_PAD: ImageUpdateMask = ImageUpdateMaskValue(32)

      public val UPDATE_TOOLTIP: ImageUpdateMask = ImageUpdateMaskValue(64)

      public val UPDATE_WIDTH_IN_PERCENT: ImageUpdateMask = ImageUpdateMaskValue(128)
    }
  }

  @JvmInline
  internal value class ImageUpdateMaskValue internal constructor(
    public override val flag: Long,
  ) : ImageUpdateMask

  public companion object

  internal object MethodBindings {
    public val getParsedTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_parsed_text")

    public val addTextPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "add_text")

    public val setTextPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "set_text")

    public val addImagePtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "add_image")

    public val updateImagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "update_image")

    public val newlinePtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "newline")

    public val removeParagraphPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "remove_paragraph")

    public val invalidateParagraphPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "invalidate_paragraph")

    public val pushFontPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "push_font")

    public val pushFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_font_size")

    public val pushNormalPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "push_normal")

    public val pushBoldPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "push_bold")

    public val pushBoldItalicsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_bold_italics")

    public val pushItalicsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_italics")

    public val pushMonoPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "push_mono")

    public val pushColorPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "push_color")

    public val pushOutlineSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_outline_size")

    public val pushOutlineColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_outline_color")

    public val pushParagraphPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_paragraph")

    public val pushIndentPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "push_indent")

    public val pushListPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "push_list")

    public val pushMetaPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "push_meta")

    public val pushHintPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "push_hint")

    public val pushLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_language")

    public val pushUnderlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_underline")

    public val pushStrikethroughPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_strikethrough")

    public val pushTablePtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "push_table")

    public val pushDropcapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_dropcap")

    public val setTableColumnExpandPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_table_column_expand")

    public val setCellRowBackgroundColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_cell_row_background_color")

    public val setCellBorderColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_cell_border_color")

    public val setCellSizeOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_cell_size_override")

    public val setCellPaddingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_cell_padding")

    public val pushCellPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "push_cell")

    public val pushFgcolorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_fgcolor")

    public val pushBgcolorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_bgcolor")

    public val pushCustomfxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_customfx")

    public val pushContextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_context")

    public val popContextPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "pop_context")

    public val popPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "pop")

    public val popAllPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "pop_all")

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "clear")

    public val setStructuredTextBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_structured_text_bidi_override")

    public val getStructuredTextBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_structured_text_bidi_override")

    public val setStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_structured_text_bidi_override_options")

    public val getStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_structured_text_bidi_override_options")

    public val setTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_text_direction")

    public val getTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_text_direction")

    public val setLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_language")

    public val getLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_language")

    public val setAutowrapModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_autowrap_mode")

    public val getAutowrapModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_autowrap_mode")

    public val setMetaUnderlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_meta_underline")

    public val isMetaUnderlinedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "is_meta_underlined")

    public val setHintUnderlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_hint_underline")

    public val isHintUnderlinedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "is_hint_underlined")

    public val setScrollActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_scroll_active")

    public val isScrollActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "is_scroll_active")

    public val setScrollFollowPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_scroll_follow")

    public val isScrollFollowingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "is_scroll_following")

    public val getVScrollBarPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_v_scroll_bar")

    public val scrollToLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "scroll_to_line")

    public val scrollToParagraphPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "scroll_to_paragraph")

    public val scrollToSelectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "scroll_to_selection")

    public val setTabSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_tab_size")

    public val getTabSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_tab_size")

    public val setFitContentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_fit_content")

    public val isFitContentEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "is_fit_content_enabled")

    public val setSelectionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_selection_enabled")

    public val isSelectionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "is_selection_enabled")

    public val setContextMenuEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_context_menu_enabled")

    public val isContextMenuEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "is_context_menu_enabled")

    public val setShortcutKeysEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_shortcut_keys_enabled")

    public val isShortcutKeysEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "is_shortcut_keys_enabled")

    public val setDeselectOnFocusLossEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_deselect_on_focus_loss_enabled")

    public val isDeselectOnFocusLossEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "is_deselect_on_focus_loss_enabled")

    public val setDragAndDropSelectionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_drag_and_drop_selection_enabled")

    public val isDragAndDropSelectionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "is_drag_and_drop_selection_enabled")

    public val getSelectionFromPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_selection_from")

    public val getSelectionToPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_selection_to")

    public val selectAllPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "select_all")

    public val getSelectedTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_selected_text")

    public val deselectPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "deselect")

    public val parseBbcodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "parse_bbcode")

    public val appendTextPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "append_text")

    public val getTextPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "get_text")

    public val isReadyPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "is_ready")

    public val setThreadedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_threaded")

    public val isThreadedPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "is_threaded")

    public val setProgressBarDelayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_progress_bar_delay")

    public val getProgressBarDelayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_progress_bar_delay")

    public val setVisibleCharactersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_visible_characters")

    public val getVisibleCharactersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_visible_characters")

    public val getVisibleCharactersBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_visible_characters_behavior")

    public val setVisibleCharactersBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_visible_characters_behavior")

    public val setVisibleRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_visible_ratio")

    public val getVisibleRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_visible_ratio")

    public val getCharacterLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_character_line")

    public val getCharacterParagraphPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_character_paragraph")

    public val getTotalCharacterCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_total_character_count")

    public val setUseBbcodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_use_bbcode")

    public val isUsingBbcodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "is_using_bbcode")

    public val getLineCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_line_count")

    public val getVisibleLineCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_visible_line_count")

    public val getParagraphCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_paragraph_count")

    public val getVisibleParagraphCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_visible_paragraph_count")

    public val getContentHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_content_height")

    public val getContentWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_content_width")

    public val getLineOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_line_offset")

    public val getParagraphOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_paragraph_offset")

    public val parseExpressionsForValuesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "parse_expressions_for_values")

    public val setEffectsPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "set_effects")

    public val getEffectsPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "get_effects")

    public val installEffectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "install_effect")

    public val getMenuPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "get_menu")

    public val isMenuVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "is_menu_visible")

    public val menuOptionPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "menu_option")
  }
}

public infix fun Long.or(other: godot.RichTextLabel.ImageUpdateMask): Long = this.or(other.flag)

public infix fun Long.xor(other: godot.RichTextLabel.ImageUpdateMask): Long = this.xor(other.flag)

public infix fun Long.and(other: godot.RichTextLabel.ImageUpdateMask): Long = this.and(other.flag)

public operator fun Long.plus(other: godot.RichTextLabel.ImageUpdateMask): Long =
    this.plus(other.flag)

public operator fun Long.minus(other: godot.RichTextLabel.ImageUpdateMask): Long =
    this.minus(other.flag)

public operator fun Long.times(other: godot.RichTextLabel.ImageUpdateMask): Long =
    this.times(other.flag)

public operator fun Long.div(other: godot.RichTextLabel.ImageUpdateMask): Long =
    this.div(other.flag)

public operator fun Long.rem(other: godot.RichTextLabel.ImageUpdateMask): Long =
    this.rem(other.flag)
