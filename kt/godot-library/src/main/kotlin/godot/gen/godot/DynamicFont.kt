// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.Color
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * DynamicFont renders vector font files at runtime.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/676](https://godotengine.org/asset-library/asset/676)
 *
 * DynamicFont renders vector font files (such as TTF or OTF) dynamically at runtime instead of using a prerendered texture atlas like [godot.BitmapFont]. This trades the faster loading time of [godot.BitmapFont]s for the ability to change font parameters like size and spacing during runtime. [godot.DynamicFontData] is used for referencing the font file paths. DynamicFont also supports defining one or more fallback fonts, which will be used when displaying a character not supported by the main font.
 *
 * DynamicFont uses the [godot.FreeType](https://www.freetype.org/) library for rasterization.
 *
 * ```
 * 		var dynamic_font = DynamicFont.new()
 * 		dynamic_font.font_data = load("res://BarlowCondensed-Bold.ttf")
 * 		dynamic_font.size = 64
 * 		$"Label".set("custom_fonts/font", dynamic_font)
 * 		```
 *
 * **Note:** DynamicFont doesn't support features such as kerning, right-to-left typesetting, ligatures, text shaping, variable fonts and optional font features yet. If you wish to "bake" an optional font feature into a TTF font file, you can use [godot.FontForge](https://fontforge.org/) to do so. In FontForge, use **File > Generate Fonts**, click **Options**, choose the desired features then generate the font.
 */
@GodotBaseType
open class DynamicFont : Font() {
  /**
   * Extra spacing at the bottom in pixels.
   */
  open var extraSpacingBottom: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_GET_EXTRA_SPACING_BOTTOM, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_SET_EXTRA_SPACING_BOTTOM, NIL)
    }

  /**
   * Extra spacing for each character in pixels.
   *
   * This can be a negative number to make the distance between characters smaller.
   */
  open var extraSpacingChar: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_GET_EXTRA_SPACING_CHAR, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_SET_EXTRA_SPACING_CHAR, NIL)
    }

  /**
   * Extra spacing for the space character (in addition to [extraSpacingChar]) in pixels.
   *
   * This can be a negative number to make the distance between words smaller.
   */
  open var extraSpacingSpace: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_GET_EXTRA_SPACING_SPACE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_SET_EXTRA_SPACING_SPACE, NIL)
    }

  /**
   * Extra spacing at the top in pixels.
   */
  open var extraSpacingTop: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_GET_EXTRA_SPACING_TOP,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_SET_EXTRA_SPACING_TOP,
          NIL)
    }

  /**
   * The font data.
   */
  open var fontData: DynamicFontData?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_GET_FONT_DATA, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as DynamicFontData?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_SET_FONT_DATA, NIL)
    }

  /**
   * The font outline's color.
   *
   * **Note:** It's recommended to leave this at the default value so that you can adjust it in individual controls. For example, if the outline is made black here, it won't be possible to change its color using a Label's font outline modulate theme item.
   */
  open var outlineColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_GET_OUTLINE_COLOR,
          COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_SET_OUTLINE_COLOR,
          NIL)
    }

  /**
   * The font outline's thickness in pixels (not relative to the font size).
   */
  open var outlineSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_GET_OUTLINE_SIZE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_SET_OUTLINE_SIZE, NIL)
    }

  /**
   * The font size in pixels.
   */
  open var size: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_GET_SIZE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_SET_SIZE, NIL)
    }

  /**
   * If `true`, filtering is used. This makes the font blurry instead of pixelated when scaling it if font oversampling is disabled or ineffective. It's recommended to enable this when using the font in a control whose size changes over time, unless a pixel art aesthetic is desired.
   */
  open var useFilter: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_GET_USE_FILTER, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_SET_USE_FILTER, NIL)
    }

  /**
   * If `true`, mipmapping is used. This improves the font's appearance when downscaling it if font oversampling is disabled or ineffective.
   */
  open var useMipmaps: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_GET_USE_MIPMAPS, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_SET_USE_MIPMAPS, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_DYNAMICFONT)
  }

  open fun outlineColor(schedule: Color.() -> Unit): Color = outlineColor.apply{
      schedule(this)
      outlineColor = this
  }


  /**
   * Adds a fallback font.
   */
  open fun addFallback(data: DynamicFontData) {
    TransferContext.writeArguments(OBJECT to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_ADD_FALLBACK, NIL)
  }

  /**
   * Returns a string containing all the characters available in the main and all the fallback fonts.
   *
   * If a given character is included in more than one font, it appears only once in the returned string.
   */
  open fun getAvailableChars(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_GET_AVAILABLE_CHARS,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the fallback font at index `idx`.
   */
  open fun getFallback(idx: Long): DynamicFontData? {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_GET_FALLBACK, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as DynamicFontData?
  }

  /**
   * Returns the number of fallback fonts.
   */
  open fun getFallbackCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_GET_FALLBACK_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Removes the fallback font at index `idx`.
   */
  open fun removeFallback(idx: Long) {
    TransferContext.writeArguments(LONG to idx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_REMOVE_FALLBACK, NIL)
  }

  /**
   * Sets the fallback font at index `idx`.
   */
  open fun setFallback(idx: Long, data: DynamicFontData) {
    TransferContext.writeArguments(LONG to idx, OBJECT to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DYNAMICFONT_SET_FALLBACK, NIL)
  }

  enum class SpacingType(
    id: Long
  ) {
    /**
     * Spacing at the top.
     */
    SPACING_TOP(0),

    /**
     * Spacing at the bottom.
     */
    SPACING_BOTTOM(1),

    /**
     * Spacing for each character.
     */
    SPACING_CHAR(2),

    /**
     * Spacing for the space character.
     */
    SPACING_SPACE(3);

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
     * Spacing at the bottom.
     */
    final const val SPACING_BOTTOM: Long = 1

    /**
     * Spacing for each character.
     */
    final const val SPACING_CHAR: Long = 2

    /**
     * Spacing for the space character.
     */
    final const val SPACING_SPACE: Long = 3

    /**
     * Spacing at the top.
     */
    final const val SPACING_TOP: Long = 0
  }
}
