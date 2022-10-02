// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Dictionary
import godot.core.RID
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Internationalized font and text drawing support.
 *
 * Font contains a Unicode-compatible character set, as well as the ability to draw it with variable width, ascent, descent and kerning. For creating fonts from TTF files (or other font formats), see the editor support for fonts.
 *
 * **Note:** If a [godot.DynamicFont] doesn't contain a character used in a string, the character in question will be replaced with codepoint `0xfffd` if it's available in the [godot.DynamicFont]. If this replacement character isn't available in the DynamicFont, the character will be hidden without displaying any replacement character in the string.
 *
 * **Note:** If a [godot.BitmapFont] doesn't contain a character used in a string, the character in question will be hidden without displaying any replacement character in the string.
 *
 * **Note:** Unicode characters after `0xffff` (such as most emoji) are *not* supported on Windows. They will display as unknown characters instead. This will be resolved in Godot 4.0.
 */
@GodotBaseType
public open class Font : Resource() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_FONT)
  }

  /**
   * Draw `string` into a canvas item using the font at a given position, with `modulate` color, and optionally clipping the width. `position` specifies the baseline, not the top. To draw from the top, *ascent* must be added to the Y axis.
   *
   * See also [godot.CanvasItem.drawString].
   */
  public open fun draw(
    canvasItem: RID,
    position: Vector2,
    string: String,
    modulate: Color = Color(1,1,1,1),
    clipW: Long = -1,
    outlineModulate: Color = Color(1,1,1,1)
  ): Unit {
    TransferContext.writeArguments(_RID to canvasItem, VECTOR2 to position, STRING to string, COLOR
        to modulate, LONG to clipW, COLOR to outlineModulate)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_DRAW, NIL)
  }

  /**
   * Draw character `char` into a canvas item using the font at a given position, with `modulate` color, and optionally kerning if `next` is passed. clipping the width. `position` specifies the baseline, not the top. To draw from the top, *ascent* must be added to the Y axis. The width used by the character is returned, making this function useful for drawing strings character by character.
   *
   * If `outline` is `true`, the outline of the character is drawn instead of the character itself.
   */
  public open fun drawChar(
    canvasItem: RID,
    position: Vector2,
    char: Long,
    next: Long = -1,
    modulate: Color = Color(1,1,1,1),
    outline: Boolean = false
  ): Double {
    TransferContext.writeArguments(_RID to canvasItem, VECTOR2 to position, LONG to char, LONG to
        next, COLOR to modulate, BOOL to outline)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_DRAW_CHAR, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the font ascent (number of pixels above the baseline).
   */
  public open fun getAscent(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_ASCENT, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns outline contours of the glyph as a `Dictionary` with the following contents:
   *
   * `points`         - [godot.core.PoolVector3Array], containing outline points. `x` and `y` are point coordinates. `z` is the type of the point, using the [enum ContourPointTag] values.
   *
   * `contours`       - [godot.core.PoolIntArray], containing indices the end points of each contour.
   *
   * `orientation`    - [bool], contour orientation. If `true`, clockwise contours must be filled.
   */
  public open fun getCharContours(char: Long, next: Long = 0): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to char, LONG to next)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_CHAR_CONTOURS, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Returns the size of a character, optionally taking kerning into account if the next character is provided. Note that the height returned is the font height (see [getHeight]) and has no relation to the glyph height.
   */
  public open fun getCharSize(char: Long, next: Long = 0): Vector2 {
    TransferContext.writeArguments(LONG to char, LONG to next)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_CHAR_SIZE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns resource id of the cache texture containing the char.
   */
  public open fun getCharTexture(
    char: Long,
    next: Long = 0,
    outline: Boolean = false
  ): RID {
    TransferContext.writeArguments(LONG to char, LONG to next, BOOL to outline)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_CHAR_TEXTURE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns size of the cache texture containing the char.
   */
  public open fun getCharTextureSize(
    char: Long,
    next: Long = 0,
    outline: Boolean = false
  ): Vector2 {
    TransferContext.writeArguments(LONG to char, LONG to next, BOOL to outline)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_CHAR_TEXTURE_SIZE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns char offset from the baseline.
   */
  public open fun getCharTxOffset(
    char: Long,
    next: Long = 0,
    outline: Boolean = false
  ): Vector2 {
    TransferContext.writeArguments(LONG to char, LONG to next, BOOL to outline)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_CHAR_TX_OFFSET, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns size of the char.
   */
  public open fun getCharTxSize(
    char: Long,
    next: Long = 0,
    outline: Boolean = false
  ): Vector2 {
    TransferContext.writeArguments(LONG to char, LONG to next, BOOL to outline)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_CHAR_TX_SIZE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns rectangle in the cache texture containing the char.
   */
  public open fun getCharTxUvRect(
    char: Long,
    next: Long = 0,
    outline: Boolean = false
  ): Rect2 {
    TransferContext.writeArguments(LONG to char, LONG to next, BOOL to outline)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_CHAR_TX_UV_RECT, RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  /**
   * Returns the font descent (number of pixels below the baseline).
   */
  public open fun getDescent(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_DESCENT, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the total font height (ascent plus descent) in pixels.
   */
  public open fun getHeight(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_HEIGHT, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the size of a string, taking kerning and advance into account. Note that the height returned is the font height (see [getHeight]) and has no relation to the string.
   */
  public open fun getStringSize(string: String): Vector2 {
    TransferContext.writeArguments(STRING to string)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_STRING_SIZE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the size that the string would have with word wrapping enabled with a fixed `width`.
   */
  public open fun getWordwrapStringSize(string: String, width: Double): Vector2 {
    TransferContext.writeArguments(STRING to string, DOUBLE to width)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_GET_WORDWRAP_STRING_SIZE,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns `true` if the font has an outline.
   */
  public open fun hasOutline(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_HAS_OUTLINE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   *
   */
  public open fun isDistanceFieldHint(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_IS_DISTANCE_FIELD_HINT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * After editing a font (changing size, ascent, char rects, etc.). Call this function to propagate changes to controls that might use it.
   */
  public open fun updateChanges(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONT_UPDATE_CHANGES, NIL)
  }

  public enum class ContourPointTag(
    id: Long
  ) {
    /**
     * Contour point isn't on the curve, but serves as a control point for a conic (quadratic) Bézier arc.
     */
    CONTOUR_CURVE_TAG_OFF_CONIC(0),
    /**
     * Contour point is on the curve.
     */
    CONTOUR_CURVE_TAG_ON(1),
    /**
     * Contour point isn't on the curve, but serves as a control point for a cubic Bézier arc.
     */
    CONTOUR_CURVE_TAG_OFF_CUBIC(2),
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
     * Contour point isn't on the curve, but serves as a control point for a conic (quadratic) Bézier arc.
     */
    public final const val CONTOUR_CURVE_TAG_OFF_CONIC: Long = 0

    /**
     * Contour point isn't on the curve, but serves as a control point for a cubic Bézier arc.
     */
    public final const val CONTOUR_CURVE_TAG_OFF_CUBIC: Long = 2

    /**
     * Contour point is on the curve.
     */
    public final const val CONTOUR_CURVE_TAG_ON: Long = 1
  }
}
