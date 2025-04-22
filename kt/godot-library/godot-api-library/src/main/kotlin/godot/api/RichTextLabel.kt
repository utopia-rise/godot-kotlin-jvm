// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Color
import godot.core.Dictionary
import godot.core.HorizontalAlignment
import godot.core.InlineAlignment
import godot.core.PackedFloat32Array
import godot.core.PackedStringArray
import godot.core.Rect2
import godot.core.Signal0
import godot.core.Signal1
import godot.core.VariantArray
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DICTIONARY
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_FLOAT_32_ARRAY
import godot.core.VariantParser.PACKED_STRING_ARRAY
import godot.core.VariantParser.RECT2
import godot.core.VariantParser.STRING
import godot.core.VariantParser.VECTOR2
import godot.core.VariantParser.VECTOR2I
import godot.core.Vector2
import godot.core.Vector2i
import godot.core.VerticalAlignment
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmField
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

public infix fun Long.or(other: RichTextLabel.ImageUpdateMask): Long = this.or(other.flag)

public infix fun Long.xor(other: RichTextLabel.ImageUpdateMask): Long = this.xor(other.flag)

public infix fun Long.and(other: RichTextLabel.ImageUpdateMask): Long = this.and(other.flag)

/**
 * A control for displaying text that can contain custom fonts, images, and basic formatting.
 * [RichTextLabel] manages these as an internal tag stack. It also adapts itself to given
 * width/heights.
 *
 * **Note:** [newline], [pushParagraph], `"\n"`, `"\r\n"`, `p` tag, and alignment tags start a new
 * paragraph. Each paragraph is processed independently, in its own BiDi context. If you want to force
 * line wrapping within paragraph, any other line breaking character can be used, for example, Form
 * Feed (U+000C), Next Line (U+0085), Line Separator (U+2028).
 *
 * **Note:** Assignments to [text] clear the tag stack and reconstruct it from the property's
 * contents. Any edits made to [text] will erase previous edits made from other manual sources such as
 * [appendText] and the `push_*` / [pop] methods.
 *
 * **Note:** RichTextLabel doesn't support entangled BBCode tags. For example, instead of using
 * [code skip-lint]**bold*bold italic**italic*[/code], use [code skip-lint]**bold*bold
 * italic****italic*[/code].
 *
 * **Note:** `push_*&#92;pop_*` functions won't affect BBCode.
 *
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
   *
   * For example, the following method can be connected to [signal meta_clicked] to open clicked
   * URLs using the user's default web browser:
   *
   * ```gdscript
   * //gdscript
   * # This assumes RichTextLabel's `meta_clicked` signal was connected to
   * # the function below using the signal connection dialog.
   * func _richtextlabel_on_meta_clicked(meta):
   *     # `meta` is of Variant type, so convert it to a String to avoid script errors at run-time.
   *     OS.shell_open(str(meta))
   * ```
   */
  public val metaClicked: Signal1<Any> by Signal1

  /**
   * Triggers when the mouse enters a meta tag.
   */
  public val metaHoverStarted: Signal1<Any> by Signal1

  /**
   * Triggers when the mouse exits a meta tag.
   */
  public val metaHoverEnded: Signal1<Any> by Signal1

  /**
   * Triggered when the document is fully loaded.
   *
   * **Note:** This can happen before the text is processed for drawing. Scrolling values may not be
   * valid until the document is drawn for the first time after this signal.
   */
  public val finished: Signal0 by Signal0

  /**
   * If `true`, the label uses BBCode formatting.
   *
   * **Note:** This only affects the contents of [text], not the tag stack.
   */
  public final inline var bbcodeEnabled: Boolean
    @JvmName("bbcodeEnabledProperty")
    get() = isUsingBbcode()
    @JvmName("bbcodeEnabledProperty")
    set(`value`) {
      setUseBbcode(value)
    }

  /**
   * The label's text in BBCode format. Is not representative of manual modifications to the
   * internal tag stack. Erases changes made by other methods when edited.
   *
   * **Note:** If [bbcodeEnabled] is `true`, it is unadvised to use the `+=` operator with [text]
   * (e.g. `text += "some string"`) as it replaces the whole text and can cause slowdowns. It will also
   * erase all BBCode that was added to stack using `push_*` methods. Use [appendText] for adding text
   * instead, unless you absolutely need to close a tag that was opened in an earlier method call.
   */
  public final inline var text: String
    @JvmName("textProperty")
    get() = getText()
    @JvmName("textProperty")
    set(`value`) {
      setText(value)
    }

  /**
   * If `true`, the label's minimum size will be automatically updated to fit its content, matching
   * the behavior of [Label].
   */
  public final inline var fitContent: Boolean
    @JvmName("fitContentProperty")
    get() = isFitContentEnabled()
    @JvmName("fitContentProperty")
    set(`value`) {
      setFitContent(value)
    }

  /**
   * If `true`, the scrollbar is visible. Setting this to `false` does not block scrolling
   * completely. See [scrollToLine].
   */
  public final inline var scrollActive: Boolean
    @JvmName("scrollActiveProperty")
    get() = isScrollActive()
    @JvmName("scrollActiveProperty")
    set(`value`) {
      setScrollActive(value)
    }

  /**
   * If `true`, the window scrolls down to display new content automatically.
   */
  public final inline var scrollFollowing: Boolean
    @JvmName("scrollFollowingProperty")
    get() = isScrollFollowing()
    @JvmName("scrollFollowingProperty")
    set(`value`) {
      setScrollFollow(value)
    }

  /**
   * If set to something other than [TextServer.AUTOWRAP_OFF], the text gets wrapped inside the
   * node's bounding rectangle. To see how each mode behaves, see [TextServer.AutowrapMode].
   */
  public final inline var autowrapMode: TextServer.AutowrapMode
    @JvmName("autowrapModeProperty")
    get() = getAutowrapMode()
    @JvmName("autowrapModeProperty")
    set(`value`) {
      setAutowrapMode(value)
    }

  /**
   * The number of spaces associated with a single tab length. Does not affect `\t` in text tags,
   * only indent tags.
   */
  public final inline var tabSize: Int
    @JvmName("tabSizeProperty")
    get() = getTabSize()
    @JvmName("tabSizeProperty")
    set(`value`) {
      setTabSize(value)
    }

  /**
   * If `true`, a right-click displays the context menu.
   */
  public final inline var contextMenuEnabled: Boolean
    @JvmName("contextMenuEnabledProperty")
    get() = isContextMenuEnabled()
    @JvmName("contextMenuEnabledProperty")
    set(`value`) {
      setContextMenuEnabled(value)
    }

  /**
   * If `true`, shortcut keys for context menu items are enabled, even if the context menu is
   * disabled.
   */
  public final inline var shortcutKeysEnabled: Boolean
    @JvmName("shortcutKeysEnabledProperty")
    get() = isShortcutKeysEnabled()
    @JvmName("shortcutKeysEnabledProperty")
    set(`value`) {
      setShortcutKeysEnabled(value)
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
   * Line fill alignment rules. See [TextServer.JustificationFlag] for more information.
   */
  public final inline var justificationFlags: TextServer.JustificationFlag
    @JvmName("justificationFlagsProperty")
    get() = getJustificationFlags()
    @JvmName("justificationFlagsProperty")
    set(`value`) {
      setJustificationFlags(value)
    }

  /**
   * Aligns text to the given tab-stops.
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
  public final inline var tabStops: PackedFloat32Array
    @JvmName("tabStopsProperty")
    get() = getTabStops()
    @JvmName("tabStopsProperty")
    set(`value`) {
      setTabStops(value)
    }

  /**
   * The currently installed custom effects. This is an array of [RichTextEffect]s.
   *
   * To add a custom effect, it's more convenient to use [installEffect].
   */
  public final inline var customEffects: VariantArray<Any?>
    @JvmName("customEffectsProperty")
    get() = getEffects()
    @JvmName("customEffectsProperty")
    set(`value`) {
      setEffects(value)
    }

  /**
   * If `true`, the label underlines meta tags such as [code skip-lint][url]{text}[/url][/code].
   * These tags can call a function when clicked if [signal meta_clicked] is connected to a function.
   */
  public final inline var metaUnderlined: Boolean
    @JvmName("metaUnderlinedProperty")
    get() = isMetaUnderlined()
    @JvmName("metaUnderlinedProperty")
    set(`value`) {
      setMetaUnderline(value)
    }

  /**
   * If `true`, the label underlines hint tags such as [code
   * skip-lint][hint=description]{text}[/hint][/code].
   */
  public final inline var hintUnderlined: Boolean
    @JvmName("hintUnderlinedProperty")
    get() = isHintUnderlined()
    @JvmName("hintUnderlinedProperty")
    set(`value`) {
      setHintUnderline(value)
    }

  /**
   * If `true`, text processing is done in a background thread.
   */
  public final inline var threaded: Boolean
    @JvmName("threadedProperty")
    get() = isThreaded()
    @JvmName("threadedProperty")
    set(`value`) {
      setThreaded(value)
    }

  /**
   * The delay after which the loading progress bar is displayed, in milliseconds. Set to `-1` to
   * disable progress bar entirely.
   *
   * **Note:** Progress bar is displayed only if [threaded] is enabled.
   */
  public final inline var progressBarDelay: Int
    @JvmName("progressBarDelayProperty")
    get() = getProgressBarDelay()
    @JvmName("progressBarDelayProperty")
    set(`value`) {
      setProgressBarDelay(value)
    }

  /**
   * If `true`, the label allows text selection.
   */
  public final inline var selectionEnabled: Boolean
    @JvmName("selectionEnabledProperty")
    get() = isSelectionEnabled()
    @JvmName("selectionEnabledProperty")
    set(`value`) {
      setSelectionEnabled(value)
    }

  /**
   * If `true`, the selected text will be deselected when focus is lost.
   */
  public final inline var deselectOnFocusLossEnabled: Boolean
    @JvmName("deselectOnFocusLossEnabledProperty")
    get() = isDeselectOnFocusLossEnabled()
    @JvmName("deselectOnFocusLossEnabledProperty")
    set(`value`) {
      setDeselectOnFocusLossEnabled(value)
    }

  /**
   * If `true`, allow drag and drop of selected text.
   */
  public final inline var dragAndDropSelectionEnabled: Boolean
    @JvmName("dragAndDropSelectionEnabledProperty")
    get() = isDragAndDropSelectionEnabled()
    @JvmName("dragAndDropSelectionEnabledProperty")
    set(`value`) {
      setDragAndDropSelectionEnabled(value)
    }

  /**
   * The number of characters to display. If set to `-1`, all characters are displayed. This can be
   * useful when animating the text appearing in a dialog box.
   *
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
   *
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
    createNativeObject(563, scriptIndex)
  }

  /**
   * This is a helper function for [tabStops] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = richtextlabel.tabStops
   * //Your changes
   * richtextlabel.tabStops = myCoreType
   * ``````
   *
   * Aligns text to the given tab-stops.
   */
  @CoreTypeHelper
  public final fun tabStopsMutate(block: PackedFloat32Array.() -> Unit): PackedFloat32Array =
      tabStops.apply {
     block(this)
     tabStops = this
  }

  /**
   * This is a helper function for [tabStops] to make dealing with local copies easier.
   * Allow to directly modify each element of the local copy of the property and assign it back to
   * the Object.
   *
   * Aligns text to the given tab-stops.
   */
  @CoreTypeHelper
  public final fun tabStopsMutateEach(block: (index: Int, `value`: Float) -> Unit):
      PackedFloat32Array = tabStops.apply {
     this.forEachIndexed { index, value ->
         block(index, value)
         this[index] = value
     }
     tabStops = this
  }

  /**
   * Returns the text without BBCode mark-up.
   */
  public final fun getParsedText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getParsedTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Adds raw non-BBCode-parsed text to the tag stack.
   */
  public final fun addText(text: String): Unit {
    TransferContext.writeArguments(STRING to text)
    TransferContext.callMethod(ptr, MethodBindings.addTextPtr, NIL)
  }

  public final fun setText(text: String): Unit {
    TransferContext.writeArguments(STRING to text)
    TransferContext.callMethod(ptr, MethodBindings.setTextPtr, NIL)
  }

  /**
   * Adds an image's opening and closing tags to the tag stack, optionally providing a [width] and
   * [height] to resize the image, a [color] to tint the image and a [region] to only use parts of the
   * image.
   *
   * If [width] or [height] is set to 0, the image size will be adjusted in order to keep the
   * original aspect ratio.
   *
   * If [width] and [height] are not set, but [region] is, the region's rect will be used.
   *
   * [key] is an optional identifier, that can be used to modify the image via [updateImage].
   *
   * If [pad] is set, and the image is smaller than the size specified by [width] and [height], the
   * image padding is added to match the size instead of upscaling.
   *
   * If [sizeInPercent] is set, [width] and [height] values are percentages of the control width
   * instead of pixels.
   */
  @JvmOverloads
  public final fun addImage(
    image: Texture2D?,
    width: Int = 0,
    height: Int = 0,
    color: Color = Color(Color(1, 1, 1, 1)),
    inlineAlign: InlineAlignment = InlineAlignment.CENTER,
    region: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0),
    key: Any? = null,
    pad: Boolean = false,
    tooltip: String = "",
    sizeInPercent: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(OBJECT to image, LONG to width.toLong(), LONG to height.toLong(), COLOR to color, LONG to inlineAlign.id, RECT2 to region, ANY to key, BOOL to pad, STRING to tooltip, BOOL to sizeInPercent)
    TransferContext.callMethod(ptr, MethodBindings.addImagePtr, NIL)
  }

  /**
   * Updates the existing images with the key [key]. Only properties specified by [mask] bits are
   * updated. See [addImage].
   */
  @JvmOverloads
  public final fun updateImage(
    key: Any?,
    mask: ImageUpdateMask,
    image: Texture2D?,
    width: Int = 0,
    height: Int = 0,
    color: Color = Color(Color(1, 1, 1, 1)),
    inlineAlign: InlineAlignment = InlineAlignment.CENTER,
    region: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0),
    pad: Boolean = false,
    tooltip: String = "",
    sizeInPercent: Boolean = false,
  ): Unit {
    TransferContext.writeArguments(ANY to key, LONG to mask.flag, OBJECT to image, LONG to width.toLong(), LONG to height.toLong(), COLOR to color, LONG to inlineAlign.id, RECT2 to region, BOOL to pad, STRING to tooltip, BOOL to sizeInPercent)
    TransferContext.callMethod(ptr, MethodBindings.updateImagePtr, NIL)
  }

  /**
   * Adds a newline tag to the tag stack.
   */
  public final fun newline(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.newlinePtr, NIL)
  }

  /**
   * Removes a paragraph of content from the label. Returns `true` if the paragraph exists.
   *
   * The [paragraph] argument is the index of the paragraph to remove, it can take values in the
   * interval `[0, get_paragraph_count() - 1]`.
   *
   * If [noInvalidate] is set to `true`, cache for the subsequent paragraphs is not invalidated. Use
   * it for faster updates if deleted paragraph is fully self-contained (have no unclosed tags), or
   * this call is part of the complex edit operation and [invalidateParagraph] will be called at the
   * end of operation.
   */
  @JvmOverloads
  public final fun removeParagraph(paragraph: Int, noInvalidate: Boolean = false): Boolean {
    TransferContext.writeArguments(LONG to paragraph.toLong(), BOOL to noInvalidate)
    TransferContext.callMethod(ptr, MethodBindings.removeParagraphPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Invalidates [paragraph] and all subsequent paragraphs cache.
   */
  public final fun invalidateParagraph(paragraph: Int): Boolean {
    TransferContext.writeArguments(LONG to paragraph.toLong())
    TransferContext.callMethod(ptr, MethodBindings.invalidateParagraphPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Adds a [code skip-lint][font][/code] tag to the tag stack. Overrides default fonts for its
   * duration.
   *
   * Passing `0` to [fontSize] will use the existing default font size.
   */
  @JvmOverloads
  public final fun pushFont(font: Font?, fontSize: Int = 0): Unit {
    TransferContext.writeArguments(OBJECT to font, LONG to fontSize.toLong())
    TransferContext.callMethod(ptr, MethodBindings.pushFontPtr, NIL)
  }

  /**
   * Adds a [code skip-lint][font_size][/code] tag to the tag stack. Overrides default font size for
   * its duration.
   */
  public final fun pushFontSize(fontSize: Int): Unit {
    TransferContext.writeArguments(LONG to fontSize.toLong())
    TransferContext.callMethod(ptr, MethodBindings.pushFontSizePtr, NIL)
  }

  /**
   * Adds a [code skip-lint][font][/code] tag with a normal font to the tag stack.
   */
  public final fun pushNormal(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.pushNormalPtr, NIL)
  }

  /**
   * Adds a [code skip-lint][font][/code] tag with a bold font to the tag stack. This is the same as
   * adding a [code skip-lint][b][/code] tag if not currently in a [code skip-lint][i][/code] tag.
   */
  public final fun pushBold(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.pushBoldPtr, NIL)
  }

  /**
   * Adds a [code skip-lint][font][/code] tag with a bold italics font to the tag stack.
   */
  public final fun pushBoldItalics(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.pushBoldItalicsPtr, NIL)
  }

  /**
   * Adds a [code skip-lint][font][/code] tag with an italics font to the tag stack. This is the
   * same as adding an [code skip-lint][i][/code] tag if not currently in a [code skip-lint][b][/code]
   * tag.
   */
  public final fun pushItalics(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.pushItalicsPtr, NIL)
  }

  /**
   * Adds a [code skip-lint][font][/code] tag with a monospace font to the tag stack.
   */
  public final fun pushMono(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.pushMonoPtr, NIL)
  }

  /**
   * Adds a [code skip-lint][color][/code] tag to the tag stack.
   */
  public final fun pushColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.pushColorPtr, NIL)
  }

  /**
   * Adds a [code skip-lint][outline_size][/code] tag to the tag stack. Overrides default text
   * outline size for its duration.
   */
  public final fun pushOutlineSize(outlineSize: Int): Unit {
    TransferContext.writeArguments(LONG to outlineSize.toLong())
    TransferContext.callMethod(ptr, MethodBindings.pushOutlineSizePtr, NIL)
  }

  /**
   * Adds a [code skip-lint][outline_color][/code] tag to the tag stack. Adds text outline for its
   * duration.
   */
  public final fun pushOutlineColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.pushOutlineColorPtr, NIL)
  }

  /**
   * Adds a [code skip-lint][p][/code] tag to the tag stack.
   */
  @JvmOverloads
  public final fun pushParagraph(
    alignment: HorizontalAlignment,
    baseDirection: Control.TextDirection = Control.TextDirection.AUTO,
    language: String = "",
    stParser: TextServer.StructuredTextParser = TextServer.StructuredTextParser.DEFAULT,
    justificationFlags: TextServer.JustificationFlag = TextServer.JustificationFlag(163),
    tabStops: PackedFloat32Array = PackedFloat32Array(),
  ): Unit {
    TransferContext.writeArguments(LONG to alignment.id, LONG to baseDirection.id, STRING to language, LONG to stParser.id, LONG to justificationFlags.flag, PACKED_FLOAT_32_ARRAY to tabStops)
    TransferContext.callMethod(ptr, MethodBindings.pushParagraphPtr, NIL)
  }

  /**
   * Adds an [code skip-lint][indent][/code] tag to the tag stack. Multiplies [level] by current
   * [tabSize] to determine new margin length.
   */
  public final fun pushIndent(level: Int): Unit {
    TransferContext.writeArguments(LONG to level.toLong())
    TransferContext.callMethod(ptr, MethodBindings.pushIndentPtr, NIL)
  }

  /**
   * Adds [code skip-lint][ol][/code] or [code skip-lint][ul][/code] tag to the tag stack.
   * Multiplies [level] by current [tabSize] to determine new margin length.
   */
  @JvmOverloads
  public final fun pushList(
    level: Int,
    type: ListType,
    capitalize: Boolean,
    bullet: String = "•",
  ): Unit {
    TransferContext.writeArguments(LONG to level.toLong(), LONG to type.id, BOOL to capitalize, STRING to bullet)
    TransferContext.callMethod(ptr, MethodBindings.pushListPtr, NIL)
  }

  /**
   * Adds a meta tag to the tag stack. Similar to the BBCode [code
   * skip-lint][url=something]{text}[/url][/code], but supports non-[String] metadata types.
   *
   * If [metaUnderlined] is `true`, meta tags display an underline. This behavior can be customized
   * with [underlineMode].
   *
   * **Note:** Meta tags do nothing by default when clicked. To assign behavior when clicked,
   * connect [signal meta_clicked] to a function that is called when the meta tag is clicked.
   */
  @JvmOverloads
  public final fun pushMeta(
    `data`: Any?,
    underlineMode: MetaUnderline = RichTextLabel.MetaUnderline.ALWAYS,
    tooltip: String = "",
  ): Unit {
    TransferContext.writeArguments(ANY to data, LONG to underlineMode.id, STRING to tooltip)
    TransferContext.callMethod(ptr, MethodBindings.pushMetaPtr, NIL)
  }

  /**
   * Adds a [code skip-lint][hint][/code] tag to the tag stack. Same as BBCode [code
   * skip-lint][hint=something]{text}[/hint][/code].
   */
  public final fun pushHint(description: String): Unit {
    TransferContext.writeArguments(STRING to description)
    TransferContext.callMethod(ptr, MethodBindings.pushHintPtr, NIL)
  }

  /**
   * Adds language code used for text shaping algorithm and Open-Type font features.
   */
  public final fun pushLanguage(language: String): Unit {
    TransferContext.writeArguments(STRING to language)
    TransferContext.callMethod(ptr, MethodBindings.pushLanguagePtr, NIL)
  }

  /**
   * Adds a [code skip-lint][u][/code] tag to the tag stack.
   */
  public final fun pushUnderline(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.pushUnderlinePtr, NIL)
  }

  /**
   * Adds a [code skip-lint][s][/code] tag to the tag stack.
   */
  public final fun pushStrikethrough(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.pushStrikethroughPtr, NIL)
  }

  /**
   * Adds a [code skip-lint][table=columns,inline_align][/code] tag to the tag stack. Use
   * [setTableColumnExpand] to set column expansion ratio. Use [pushCell] to add cells.
   */
  @JvmOverloads
  public final fun pushTable(
    columns: Int,
    inlineAlign: InlineAlignment = InlineAlignment.TOP_TO,
    alignToRow: Int = -1,
  ): Unit {
    TransferContext.writeArguments(LONG to columns.toLong(), LONG to inlineAlign.id, LONG to alignToRow.toLong())
    TransferContext.callMethod(ptr, MethodBindings.pushTablePtr, NIL)
  }

  /**
   * Adds a [code skip-lint][dropcap][/code] tag to the tag stack. Drop cap (dropped capital) is a
   * decorative element at the beginning of a paragraph that is larger than the rest of the text.
   */
  @JvmOverloads
  public final fun pushDropcap(
    string: String,
    font: Font?,
    size: Int,
    dropcapMargins: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0),
    color: Color = Color(Color(1, 1, 1, 1)),
    outlineSize: Int = 0,
    outlineColor: Color = Color(Color(0, 0, 0, 0)),
  ): Unit {
    TransferContext.writeArguments(STRING to string, OBJECT to font, LONG to size.toLong(), RECT2 to dropcapMargins, COLOR to color, LONG to outlineSize.toLong(), COLOR to outlineColor)
    TransferContext.callMethod(ptr, MethodBindings.pushDropcapPtr, NIL)
  }

  /**
   * Edits the selected column's expansion options. If [expand] is `true`, the column expands in
   * proportion to its expansion ratio versus the other columns' ratios.
   *
   * For example, 2 columns with ratios 3 and 4 plus 70 pixels in available width would expand 30
   * and 40 pixels, respectively.
   *
   * If [expand] is `false`, the column will not contribute to the total ratio.
   */
  @JvmOverloads
  public final fun setTableColumnExpand(
    column: Int,
    expand: Boolean,
    ratio: Int = 1,
    shrink: Boolean = true,
  ): Unit {
    TransferContext.writeArguments(LONG to column.toLong(), BOOL to expand, LONG to ratio.toLong(), BOOL to shrink)
    TransferContext.callMethod(ptr, MethodBindings.setTableColumnExpandPtr, NIL)
  }

  /**
   * Sets color of a table cell. Separate colors for alternating rows can be specified.
   */
  public final fun setCellRowBackgroundColor(oddRowBg: Color, evenRowBg: Color): Unit {
    TransferContext.writeArguments(COLOR to oddRowBg, COLOR to evenRowBg)
    TransferContext.callMethod(ptr, MethodBindings.setCellRowBackgroundColorPtr, NIL)
  }

  /**
   * Sets color of a table cell border.
   */
  public final fun setCellBorderColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setCellBorderColorPtr, NIL)
  }

  /**
   * Sets minimum and maximum size overrides for a table cell.
   */
  public final fun setCellSizeOverride(minSize: Vector2, maxSize: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to minSize, VECTOR2 to maxSize)
    TransferContext.callMethod(ptr, MethodBindings.setCellSizeOverridePtr, NIL)
  }

  /**
   * Sets inner padding of a table cell.
   */
  public final fun setCellPadding(padding: Rect2): Unit {
    TransferContext.writeArguments(RECT2 to padding)
    TransferContext.callMethod(ptr, MethodBindings.setCellPaddingPtr, NIL)
  }

  /**
   * Adds a [code skip-lint][cell][/code] tag to the tag stack. Must be inside a [code
   * skip-lint][table][/code] tag. See [pushTable] for details. Use [setTableColumnExpand] to set
   * column expansion ratio, [setCellBorderColor] to set cell border, [setCellRowBackgroundColor] to
   * set cell background, [setCellSizeOverride] to override cell size, and [setCellPadding] to set
   * padding.
   */
  public final fun pushCell(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.pushCellPtr, NIL)
  }

  /**
   * Adds a [code skip-lint][fgcolor][/code] tag to the tag stack.
   */
  public final fun pushFgcolor(fgcolor: Color): Unit {
    TransferContext.writeArguments(COLOR to fgcolor)
    TransferContext.callMethod(ptr, MethodBindings.pushFgcolorPtr, NIL)
  }

  /**
   * Adds a [code skip-lint][bgcolor][/code] tag to the tag stack.
   */
  public final fun pushBgcolor(bgcolor: Color): Unit {
    TransferContext.writeArguments(COLOR to bgcolor)
    TransferContext.callMethod(ptr, MethodBindings.pushBgcolorPtr, NIL)
  }

  /**
   * Adds a custom effect tag to the tag stack. The effect does not need to be in [customEffects].
   * The environment is directly passed to the effect.
   */
  public final fun pushCustomfx(effect: RichTextEffect?, env: Dictionary<Any?, Any?>): Unit {
    TransferContext.writeArguments(OBJECT to effect, DICTIONARY to env)
    TransferContext.callMethod(ptr, MethodBindings.pushCustomfxPtr, NIL)
  }

  /**
   * Adds a context marker to the tag stack. See [popContext].
   */
  public final fun pushContext(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.pushContextPtr, NIL)
  }

  /**
   * Terminates tags opened after the last [pushContext] call (including context marker), or all
   * tags if there's no context marker on the stack.
   */
  public final fun popContext(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.popContextPtr, NIL)
  }

  /**
   * Terminates the current tag. Use after `push_*` methods to close BBCodes manually. Does not need
   * to follow `add_*` methods.
   */
  public final fun pop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.popPtr, NIL)
  }

  /**
   * Terminates all tags opened by `push_*` methods.
   */
  public final fun popAll(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.popAllPtr, NIL)
  }

  /**
   * Clears the tag stack, causing the label to display nothing.
   *
   * **Note:** This method does not affect [text], and its contents will show again if the label is
   * redrawn. However, setting [text] to an empty [String] also clears the stack.
   */
  public final fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.clearPtr, NIL)
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

  public final fun setJustificationFlags(justificationFlags: TextServer.JustificationFlag): Unit {
    TransferContext.writeArguments(LONG to justificationFlags.flag)
    TransferContext.callMethod(ptr, MethodBindings.setJustificationFlagsPtr, NIL)
  }

  public final fun getJustificationFlags(): TextServer.JustificationFlag {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getJustificationFlagsPtr, LONG)
    return TextServer.JustificationFlag(TransferContext.readReturnValue(LONG) as Long)
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

  public final fun setAutowrapMode(autowrapMode: TextServer.AutowrapMode): Unit {
    TransferContext.writeArguments(LONG to autowrapMode.id)
    TransferContext.callMethod(ptr, MethodBindings.setAutowrapModePtr, NIL)
  }

  public final fun getAutowrapMode(): TextServer.AutowrapMode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAutowrapModePtr, LONG)
    return TextServer.AutowrapMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setMetaUnderline(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setMetaUnderlinePtr, NIL)
  }

  public final fun isMetaUnderlined(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isMetaUnderlinedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setHintUnderline(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setHintUnderlinePtr, NIL)
  }

  public final fun isHintUnderlined(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isHintUnderlinedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setScrollActive(active: Boolean): Unit {
    TransferContext.writeArguments(BOOL to active)
    TransferContext.callMethod(ptr, MethodBindings.setScrollActivePtr, NIL)
  }

  public final fun isScrollActive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isScrollActivePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setScrollFollow(follow: Boolean): Unit {
    TransferContext.writeArguments(BOOL to follow)
    TransferContext.callMethod(ptr, MethodBindings.setScrollFollowPtr, NIL)
  }

  public final fun isScrollFollowing(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isScrollFollowingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the vertical scrollbar.
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If
   * you wish to hide it or any of its children, use their [CanvasItem.visible] property.
   */
  public final fun getVScrollBar(): VScrollBar? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVScrollBarPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as VScrollBar?)
  }

  /**
   * Scrolls the window's top line to match [line].
   */
  public final fun scrollToLine(line: Int): Unit {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(ptr, MethodBindings.scrollToLinePtr, NIL)
  }

  /**
   * Scrolls the window's top line to match first line of the [paragraph].
   */
  public final fun scrollToParagraph(paragraph: Int): Unit {
    TransferContext.writeArguments(LONG to paragraph.toLong())
    TransferContext.callMethod(ptr, MethodBindings.scrollToParagraphPtr, NIL)
  }

  /**
   * Scrolls to the beginning of the current selection.
   */
  public final fun scrollToSelection(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.scrollToSelectionPtr, NIL)
  }

  public final fun setTabSize(spaces: Int): Unit {
    TransferContext.writeArguments(LONG to spaces.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setTabSizePtr, NIL)
  }

  public final fun getTabSize(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTabSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setFitContent(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setFitContentPtr, NIL)
  }

  public final fun isFitContentEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isFitContentEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setSelectionEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setSelectionEnabledPtr, NIL)
  }

  public final fun isSelectionEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isSelectionEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setContextMenuEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setContextMenuEnabledPtr, NIL)
  }

  public final fun isContextMenuEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isContextMenuEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setShortcutKeysEnabled(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setShortcutKeysEnabledPtr, NIL)
  }

  public final fun isShortcutKeysEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isShortcutKeysEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDeselectOnFocusLossEnabled(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setDeselectOnFocusLossEnabledPtr, NIL)
  }

  public final fun isDeselectOnFocusLossEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isDeselectOnFocusLossEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDragAndDropSelectionEnabled(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setDragAndDropSelectionEnabledPtr, NIL)
  }

  public final fun isDragAndDropSelectionEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isDragAndDropSelectionEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the current selection first character index if a selection is active, `-1` otherwise.
   * Does not include BBCodes.
   */
  public final fun getSelectionFrom(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSelectionFromPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the current selection last character index if a selection is active, `-1` otherwise.
   * Does not include BBCodes.
   */
  public final fun getSelectionTo(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSelectionToPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the current selection vertical line offset if a selection is active, `-1.0` otherwise.
   */
  public final fun getSelectionLineOffset(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSelectionLineOffsetPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Select all the text.
   *
   * If [selectionEnabled] is `false`, no selection will occur.
   */
  public final fun selectAll(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.selectAllPtr, NIL)
  }

  /**
   * Returns the current selection text. Does not include BBCodes.
   */
  public final fun getSelectedText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSelectedTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Clears the current selection.
   */
  public final fun deselect(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.deselectPtr, NIL)
  }

  /**
   * The assignment version of [appendText]. Clears the tag stack and inserts the new content.
   */
  public final fun parseBbcode(bbcode: String): Unit {
    TransferContext.writeArguments(STRING to bbcode)
    TransferContext.callMethod(ptr, MethodBindings.parseBbcodePtr, NIL)
  }

  /**
   * Parses [bbcode] and adds tags to the tag stack as needed.
   *
   * **Note:** Using this method, you can't close a tag that was opened in a previous [appendText]
   * call. This is done to improve performance, especially when updating large RichTextLabels since
   * rebuilding the whole BBCode every time would be slower. If you absolutely need to close a tag in a
   * future method call, append the [text] instead of using [appendText].
   */
  public final fun appendText(bbcode: String): Unit {
    TransferContext.writeArguments(STRING to bbcode)
    TransferContext.callMethod(ptr, MethodBindings.appendTextPtr, NIL)
  }

  public final fun getText(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTextPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * If [threaded] is enabled, returns `true` if the background thread has finished text processing,
   * otherwise always return `true`.
   */
  public final fun isReady(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isReadyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If [threaded] is enabled, returns `true` if the background thread has finished text processing,
   * otherwise always return `true`.
   */
  public final fun isFinished(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isFinishedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setThreaded(threaded: Boolean): Unit {
    TransferContext.writeArguments(BOOL to threaded)
    TransferContext.callMethod(ptr, MethodBindings.setThreadedPtr, NIL)
  }

  public final fun isThreaded(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isThreadedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setProgressBarDelay(delayMs: Int): Unit {
    TransferContext.writeArguments(LONG to delayMs.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setProgressBarDelayPtr, NIL)
  }

  public final fun getProgressBarDelay(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getProgressBarDelayPtr, LONG)
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

  /**
   * Returns the line number of the character position provided. Line and character numbers are both
   * zero-indexed.
   *
   * **Note:** If [threaded] is enabled, this method returns a value for the loaded part of the
   * document. Use [isFinished] or [signal finished] to determine whether document is fully loaded.
   */
  public final fun getCharacterLine(character: Int): Int {
    TransferContext.writeArguments(LONG to character.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getCharacterLinePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the paragraph number of the character position provided. Paragraph and character
   * numbers are both zero-indexed.
   *
   * **Note:** If [threaded] is enabled, this method returns a value for the loaded part of the
   * document. Use [isFinished] or [signal finished] to determine whether document is fully loaded.
   */
  public final fun getCharacterParagraph(character: Int): Int {
    TransferContext.writeArguments(LONG to character.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getCharacterParagraphPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the total number of characters from text tags. Does not include BBCodes.
   */
  public final fun getTotalCharacterCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTotalCharacterCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setUseBbcode(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setUseBbcodePtr, NIL)
  }

  public final fun isUsingBbcode(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isUsingBbcodePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the total number of lines in the text. Wrapped text is counted as multiple lines.
   *
   * **Note:** If [visibleCharactersBehavior] is set to [TextServer.VC_CHARS_BEFORE_SHAPING] only
   * visible wrapped lines are counted.
   *
   * **Note:** If [threaded] is enabled, this method returns a value for the loaded part of the
   * document. Use [isFinished] or [signal finished] to determine whether document is fully loaded.
   */
  public final fun getLineCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLineCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the indexes of the first and last visible characters for the given [line], as a
   * [Vector2i].
   *
   * **Note:** If [visibleCharactersBehavior] is set to [TextServer.VC_CHARS_BEFORE_SHAPING] only
   * visible wrapped lines are counted.
   *
   * **Note:** If [threaded] is enabled, this method returns a value for the loaded part of the
   * document. Use [isFinished] or [signal finished] to determine whether document is fully loaded.
   */
  public final fun getLineRange(line: Int): Vector2i {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getLineRangePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Returns the number of visible lines.
   *
   * **Note:** If [threaded] is enabled, this method returns a value for the loaded part of the
   * document. Use [isFinished] or [signal finished] to determine whether document is fully loaded.
   */
  public final fun getVisibleLineCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVisibleLineCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the total number of paragraphs (newlines or `p` tags in the tag stack's text tags).
   * Considers wrapped text as one paragraph.
   */
  public final fun getParagraphCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getParagraphCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the number of visible paragraphs. A paragraph is considered visible if at least one of
   * its lines is visible.
   *
   * **Note:** If [threaded] is enabled, this method returns a value for the loaded part of the
   * document. Use [isFinished] or [signal finished] to determine whether document is fully loaded.
   */
  public final fun getVisibleParagraphCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVisibleParagraphCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the height of the content.
   *
   * **Note:** If [threaded] is enabled, this method returns a value for the loaded part of the
   * document. Use [isFinished] or [signal finished] to determine whether document is fully loaded.
   */
  public final fun getContentHeight(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getContentHeightPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the width of the content.
   *
   * **Note:** If [threaded] is enabled, this method returns a value for the loaded part of the
   * document. Use [isFinished] or [signal finished] to determine whether document is fully loaded.
   */
  public final fun getContentWidth(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getContentWidthPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the vertical offset of the line found at the provided index.
   *
   * **Note:** If [threaded] is enabled, this method returns a value for the loaded part of the
   * document. Use [isFinished] or [signal finished] to determine whether document is fully loaded.
   */
  public final fun getLineOffset(line: Int): Float {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getLineOffsetPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the vertical offset of the paragraph found at the provided index.
   *
   * **Note:** If [threaded] is enabled, this method returns a value for the loaded part of the
   * document. Use [isFinished] or [signal finished] to determine whether document is fully loaded.
   */
  public final fun getParagraphOffset(paragraph: Int): Float {
    TransferContext.writeArguments(LONG to paragraph.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getParagraphOffsetPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Parses BBCode parameter [expressions] into a dictionary.
   */
  public final fun parseExpressionsForValues(expressions: PackedStringArray):
      Dictionary<Any?, Any?> {
    TransferContext.writeArguments(PACKED_STRING_ARRAY to expressions)
    TransferContext.callMethod(ptr, MethodBindings.parseExpressionsForValuesPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  public final fun setEffects(effects: VariantArray<Any?>): Unit {
    TransferContext.writeArguments(ARRAY to effects)
    TransferContext.callMethod(ptr, MethodBindings.setEffectsPtr, NIL)
  }

  public final fun getEffects(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEffectsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  /**
   * Installs a custom effect. This can also be done in the Inspector through the [customEffects]
   * property. [effect] should be a valid [RichTextEffect].
   *
   * **Example:** With the following script extending from [RichTextEffect]:
   *
   * ```
   * # effect.gd
   * class_name MyCustomEffect
   * extends RichTextEffect
   *
   * var bbcode = "my_custom_effect"
   *
   * # ...
   * ```
   *
   * The above effect can be installed in [RichTextLabel] from a script:
   *
   * ```
   * # rich_text_label.gd
   * extends RichTextLabel
   *
   * func _ready():
   *     install_effect(MyCustomEffect.new())
   *
   *     # Alternatively, if not using `class_name` in the script that extends RichTextEffect:
   *     install_effect(preload("res://effect.gd").new())
   * ```
   */
  public final fun installEffect(effect: Any?): Unit {
    TransferContext.writeArguments(ANY to effect)
    TransferContext.callMethod(ptr, MethodBindings.installEffectPtr, NIL)
  }

  /**
   * Returns the [PopupMenu] of this [RichTextLabel]. By default, this menu is displayed when
   * right-clicking on the [RichTextLabel].
   *
   * You can add custom menu items or remove standard ones. Make sure your IDs don't conflict with
   * the standard ones (see [MenuItems]). For example:
   *
   * ```gdscript
   * //gdscript
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
   *
   * ```csharp
   * //csharp
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
  public final fun getMenu(): PopupMenu? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMenuPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as PopupMenu?)
  }

  /**
   * Returns whether the menu is visible. Use this instead of `get_menu().visible` to improve
   * performance (so the creation of the menu is avoided).
   */
  public final fun isMenuVisible(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isMenuVisiblePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Executes a given action as defined in the [MenuItems] enum.
   */
  public final fun menuOption(option: Int): Unit {
    TransferContext.writeArguments(LONG to option.toLong())
    TransferContext.callMethod(ptr, MethodBindings.menuOptionPtr, NIL)
  }

  public enum class ListType(
    id: Long,
  ) {
    /**
     * Each list item has a number marker.
     */
    NUMBERS(0),
    /**
     * Each list item has a letter marker.
     */
    LETTERS(1),
    /**
     * Each list item has a roman number marker.
     */
    ROMAN(2),
    /**
     * Each list item has a filled circle marker.
     */
    DOTS(3),
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
    COPY(0),
    /**
     * Selects the whole [RichTextLabel] text.
     */
    SELECT_ALL(1),
    /**
     * Represents the size of the [MenuItems] enum.
     */
    MAX(2),
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
    NEVER(0),
    /**
     * If [metaUnderlined] is `true`, meta tag always display an underline.
     */
    ALWAYS(1),
    /**
     * If [metaUnderlined] is `true`, meta tag display an underline when the mouse cursor is over
     * it.
     */
    ON_HOVER(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): MetaUnderline = entries.single { it.id == `value` }
    }
  }

  public class ImageUpdateMask(
    public val flag: Long,
  ) {
    public infix fun or(other: ImageUpdateMask): ImageUpdateMask =
        ImageUpdateMask(flag.or(other.flag))

    public infix fun or(other: Long): ImageUpdateMask = ImageUpdateMask(flag.or(other))

    public infix fun xor(other: ImageUpdateMask): ImageUpdateMask =
        ImageUpdateMask(flag.xor(other.flag))

    public infix fun xor(other: Long): ImageUpdateMask = ImageUpdateMask(flag.xor(other))

    public infix fun and(other: ImageUpdateMask): ImageUpdateMask =
        ImageUpdateMask(flag.and(other.flag))

    public infix fun and(other: Long): ImageUpdateMask = ImageUpdateMask(flag.and(other))

    public fun unaryPlus(): ImageUpdateMask = ImageUpdateMask(flag.unaryPlus())

    public fun unaryMinus(): ImageUpdateMask = ImageUpdateMask(flag.unaryMinus())

    public fun inv(): ImageUpdateMask = ImageUpdateMask(flag.inv())

    public infix fun shl(bits: Int): ImageUpdateMask = ImageUpdateMask(flag shl bits)

    public infix fun shr(bits: Int): ImageUpdateMask = ImageUpdateMask(flag shr bits)

    public infix fun ushr(bits: Int): ImageUpdateMask = ImageUpdateMask(flag ushr bits)

    public companion object {
      /**
       * If this bit is set, [updateImage] changes image texture.
       */
      @JvmField
      public val UPDATE_TEXTURE: ImageUpdateMask = ImageUpdateMask(1)

      /**
       * If this bit is set, [updateImage] changes image size.
       */
      @JvmField
      public val UPDATE_SIZE: ImageUpdateMask = ImageUpdateMask(2)

      /**
       * If this bit is set, [updateImage] changes image color.
       */
      @JvmField
      public val UPDATE_COLOR: ImageUpdateMask = ImageUpdateMask(4)

      /**
       * If this bit is set, [updateImage] changes image inline alignment.
       */
      @JvmField
      public val UPDATE_ALIGNMENT: ImageUpdateMask = ImageUpdateMask(8)

      /**
       * If this bit is set, [updateImage] changes image texture region.
       */
      @JvmField
      public val UPDATE_REGION: ImageUpdateMask = ImageUpdateMask(16)

      /**
       * If this bit is set, [updateImage] changes image padding.
       */
      @JvmField
      public val UPDATE_PAD: ImageUpdateMask = ImageUpdateMask(32)

      /**
       * If this bit is set, [updateImage] changes image tooltip.
       */
      @JvmField
      public val UPDATE_TOOLTIP: ImageUpdateMask = ImageUpdateMask(64)

      /**
       * If this bit is set, [updateImage] changes image width from/to percents.
       */
      @JvmField
      public val UPDATE_WIDTH_IN_PERCENT: ImageUpdateMask = ImageUpdateMask(128)
    }
  }

  public companion object

  public object MethodBindings {
    internal val getParsedTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_parsed_text", 201670096)

    internal val addTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "add_text", 83702148)

    internal val setTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_text", 83702148)

    internal val addImagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "add_image", 3017663154)

    internal val updateImagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "update_image", 815048486)

    internal val newlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "newline", 3218959716)

    internal val removeParagraphPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "remove_paragraph", 3262369265)

    internal val invalidateParagraphPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "invalidate_paragraph", 3067735520)

    internal val pushFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_font", 2347424842)

    internal val pushFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_font_size", 1286410249)

    internal val pushNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_normal", 3218959716)

    internal val pushBoldPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_bold", 3218959716)

    internal val pushBoldItalicsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_bold_italics", 3218959716)

    internal val pushItalicsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_italics", 3218959716)

    internal val pushMonoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_mono", 3218959716)

    internal val pushColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_color", 2920490490)

    internal val pushOutlineSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_outline_size", 1286410249)

    internal val pushOutlineColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_outline_color", 2920490490)

    internal val pushParagraphPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_paragraph", 3089306873)

    internal val pushIndentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_indent", 1286410249)

    internal val pushListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_list", 3017143144)

    internal val pushMetaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_meta", 3765356747)

    internal val pushHintPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_hint", 83702148)

    internal val pushLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_language", 83702148)

    internal val pushUnderlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_underline", 3218959716)

    internal val pushStrikethroughPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_strikethrough", 3218959716)

    internal val pushTablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_table", 2623499273)

    internal val pushDropcapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_dropcap", 4061635501)

    internal val setTableColumnExpandPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_table_column_expand", 117236061)

    internal val setCellRowBackgroundColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_cell_row_background_color", 3465483165)

    internal val setCellBorderColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_cell_border_color", 2920490490)

    internal val setCellSizeOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_cell_size_override", 3108078480)

    internal val setCellPaddingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_cell_padding", 2046264180)

    internal val pushCellPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_cell", 3218959716)

    internal val pushFgcolorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_fgcolor", 2920490490)

    internal val pushBgcolorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_bgcolor", 2920490490)

    internal val pushCustomfxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_customfx", 2337942958)

    internal val pushContextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "push_context", 3218959716)

    internal val popContextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "pop_context", 3218959716)

    internal val popPtr: VoidPtr = TypeManager.getMethodBindPtr("RichTextLabel", "pop", 3218959716)

    internal val popAllPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "pop_all", 3218959716)

    internal val clearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "clear", 3218959716)

    internal val setStructuredTextBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_structured_text_bidi_override", 55961453)

    internal val getStructuredTextBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_structured_text_bidi_override", 3385126229)

    internal val setStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_structured_text_bidi_override_options", 381264803)

    internal val getStructuredTextBidiOverrideOptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_structured_text_bidi_override_options", 3995934104)

    internal val setTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_text_direction", 119160795)

    internal val getTextDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_text_direction", 797257663)

    internal val setLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_language", 83702148)

    internal val getLanguagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_language", 201670096)

    internal val setHorizontalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_horizontal_alignment", 2312603777)

    internal val getHorizontalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_horizontal_alignment", 341400642)

    internal val setVerticalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_vertical_alignment", 1796458609)

    internal val getVerticalAlignmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_vertical_alignment", 3274884059)

    internal val setJustificationFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_justification_flags", 2877345813)

    internal val getJustificationFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_justification_flags", 1583363614)

    internal val setTabStopsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_tab_stops", 2899603908)

    internal val getTabStopsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_tab_stops", 675695659)

    internal val setAutowrapModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_autowrap_mode", 3289138044)

    internal val getAutowrapModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_autowrap_mode", 1549071663)

    internal val setMetaUnderlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_meta_underline", 2586408642)

    internal val isMetaUnderlinedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "is_meta_underlined", 36873697)

    internal val setHintUnderlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_hint_underline", 2586408642)

    internal val isHintUnderlinedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "is_hint_underlined", 36873697)

    internal val setScrollActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_scroll_active", 2586408642)

    internal val isScrollActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "is_scroll_active", 36873697)

    internal val setScrollFollowPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_scroll_follow", 2586408642)

    internal val isScrollFollowingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "is_scroll_following", 36873697)

    internal val getVScrollBarPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_v_scroll_bar", 2630340773)

    internal val scrollToLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "scroll_to_line", 1286410249)

    internal val scrollToParagraphPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "scroll_to_paragraph", 1286410249)

    internal val scrollToSelectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "scroll_to_selection", 3218959716)

    internal val setTabSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_tab_size", 1286410249)

    internal val getTabSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_tab_size", 3905245786)

    internal val setFitContentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_fit_content", 2586408642)

    internal val isFitContentEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "is_fit_content_enabled", 36873697)

    internal val setSelectionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_selection_enabled", 2586408642)

    internal val isSelectionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "is_selection_enabled", 36873697)

    internal val setContextMenuEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_context_menu_enabled", 2586408642)

    internal val isContextMenuEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "is_context_menu_enabled", 36873697)

    internal val setShortcutKeysEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_shortcut_keys_enabled", 2586408642)

    internal val isShortcutKeysEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "is_shortcut_keys_enabled", 36873697)

    internal val setDeselectOnFocusLossEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_deselect_on_focus_loss_enabled", 2586408642)

    internal val isDeselectOnFocusLossEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "is_deselect_on_focus_loss_enabled", 36873697)

    internal val setDragAndDropSelectionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_drag_and_drop_selection_enabled", 2586408642)

    internal val isDragAndDropSelectionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "is_drag_and_drop_selection_enabled", 36873697)

    internal val getSelectionFromPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_selection_from", 3905245786)

    internal val getSelectionToPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_selection_to", 3905245786)

    internal val getSelectionLineOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_selection_line_offset", 1740695150)

    internal val selectAllPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "select_all", 3218959716)

    internal val getSelectedTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_selected_text", 201670096)

    internal val deselectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "deselect", 3218959716)

    internal val parseBbcodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "parse_bbcode", 83702148)

    internal val appendTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "append_text", 83702148)

    internal val getTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_text", 201670096)

    internal val isReadyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "is_ready", 36873697)

    internal val isFinishedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "is_finished", 36873697)

    internal val setThreadedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_threaded", 2586408642)

    internal val isThreadedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "is_threaded", 36873697)

    internal val setProgressBarDelayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_progress_bar_delay", 1286410249)

    internal val getProgressBarDelayPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_progress_bar_delay", 3905245786)

    internal val setVisibleCharactersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_visible_characters", 1286410249)

    internal val getVisibleCharactersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_visible_characters", 3905245786)

    internal val getVisibleCharactersBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_visible_characters_behavior", 258789322)

    internal val setVisibleCharactersBehaviorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_visible_characters_behavior", 3383839701)

    internal val setVisibleRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_visible_ratio", 373806689)

    internal val getVisibleRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_visible_ratio", 1740695150)

    internal val getCharacterLinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_character_line", 3744713108)

    internal val getCharacterParagraphPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_character_paragraph", 3744713108)

    internal val getTotalCharacterCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_total_character_count", 3905245786)

    internal val setUseBbcodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_use_bbcode", 2586408642)

    internal val isUsingBbcodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "is_using_bbcode", 36873697)

    internal val getLineCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_line_count", 3905245786)

    internal val getLineRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_line_range", 3665014314)

    internal val getVisibleLineCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_visible_line_count", 3905245786)

    internal val getParagraphCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_paragraph_count", 3905245786)

    internal val getVisibleParagraphCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_visible_paragraph_count", 3905245786)

    internal val getContentHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_content_height", 3905245786)

    internal val getContentWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_content_width", 3905245786)

    internal val getLineOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_line_offset", 4025615559)

    internal val getParagraphOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_paragraph_offset", 4025615559)

    internal val parseExpressionsForValuesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "parse_expressions_for_values", 1522900837)

    internal val setEffectsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "set_effects", 381264803)

    internal val getEffectsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_effects", 2915620761)

    internal val installEffectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "install_effect", 1114965689)

    internal val getMenuPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "get_menu", 229722558)

    internal val isMenuVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "is_menu_visible", 36873697)

    internal val menuOptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RichTextLabel", "menu_option", 1286410249)
  }
}
