// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.VariantArray
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmName

/**
 * A font loaded from a system font. Falls back to a default theme font if not implemented on the host OS.
 *
 * [godot.SystemFont] loads a font from a system font with the first matching name from [fontNames].
 *
 * It will attempt to match font style, but it's not guaranteed.
 *
 * The returned font might be part of a font collection or be a variable font with OpenType "weight", "width" and/or "italic" features set.
 *
 * You can create [godot.FontVariation] of the system font for fine control over its features.
 *
 * **Note:** This class is implemented on iOS, Linux, macOS and Windows, on other platforms it will fallback to default theme font.
 */
@GodotBaseType
public open class SystemFont : Font() {
  /**
   * Array of font family names to search, first matching font found is used.
   */
  public var fontNames: PackedStringArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SYSTEMFONT_GET_FONT_NAMES,
          PACKED_STRING_ARRAY)
      return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_STRING_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SYSTEMFONT_SET_FONT_NAMES, NIL)
    }

  /**
   * If set to `true`, italic or oblique font is preferred.
   */
  public var fontItalic: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SYSTEMFONT_GET_FONT_ITALIC, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SYSTEMFONT_SET_FONT_ITALIC, NIL)
    }

  /**
   * Preferred weight (boldness) of the font. A value in the `100...999` range, normal font weight is `400`, bold font weight is `700`.
   */
  public var fontWeight: Long
    @JvmName("getFontWeight_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getFontWeight()
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SYSTEMFONT_SET_FONT_WEIGHT, NIL)
    }

  /**
   * Preferred font stretch amount, compared to a normal width. A percentage value between `50%` and `200%`.
   */
  public var fontStretch: Long
    @JvmName("getFontStretch_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getFontStretch()
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SYSTEMFONT_SET_FONT_STRETCH, NIL)
    }

  /**
   * Font anti-aliasing mode.
   */
  public var antialiasing: TextServer.FontAntialiasing
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SYSTEMFONT_GET_ANTIALIASING, LONG)
      return TextServer.FontAntialiasing.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SYSTEMFONT_SET_ANTIALIASING, NIL)
    }

  /**
   * If set to `true`, generate mipmaps for the font textures.
   */
  public var generateMipmaps: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SYSTEMFONT_GET_GENERATE_MIPMAPS,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SYSTEMFONT_SET_GENERATE_MIPMAPS,
          NIL)
    }

  /**
   * If set to `true`, system fonts can be automatically used as fallbacks.
   */
  public var allowSystemFallback: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SYSTEMFONT_IS_ALLOW_SYSTEM_FALLBACK, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SYSTEMFONT_SET_ALLOW_SYSTEM_FALLBACK, NIL)
    }

  /**
   * If set to `true`, auto-hinting is supported and preferred over font built-in hinting.
   */
  public var forceAutohinter: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SYSTEMFONT_IS_FORCE_AUTOHINTER,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SYSTEMFONT_SET_FORCE_AUTOHINTER,
          NIL)
    }

  /**
   * Font hinting mode.
   */
  public var hinting: TextServer.Hinting
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SYSTEMFONT_GET_HINTING, LONG)
      return TextServer.Hinting.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SYSTEMFONT_SET_HINTING, NIL)
    }

  /**
   * Font glyph subpixel positioning mode. Subpixel positioning provides shaper text and better kerning for smaller font sizes, at the cost of memory usage and font rasterization speed. Use [godot.TextServer.SUBPIXEL_POSITIONING_AUTO] to automatically enable it based on the font size.
   */
  public var subpixelPositioning: TextServer.SubpixelPositioning
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SYSTEMFONT_GET_SUBPIXEL_POSITIONING, LONG)
      return TextServer.SubpixelPositioning.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SYSTEMFONT_SET_SUBPIXEL_POSITIONING, NIL)
    }

  /**
   * If set to `true`, glyphs of all sizes are rendered using single multichannel signed distance field generated from the dynamic font vector data.
   */
  public var multichannelSignedDistanceField: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SYSTEMFONT_IS_MULTICHANNEL_SIGNED_DISTANCE_FIELD, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SYSTEMFONT_SET_MULTICHANNEL_SIGNED_DISTANCE_FIELD, NIL)
    }

  /**
   * The width of the range around the shape between the minimum and maximum representable signed distance. If using font outlines, [msdfPixelRange] must be set to at least *twice* the size of the largest font outline. The default [msdfPixelRange] value of `16` allows outline sizes up to `8` to look correct.
   */
  public var msdfPixelRange: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SYSTEMFONT_GET_MSDF_PIXEL_RANGE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SYSTEMFONT_SET_MSDF_PIXEL_RANGE,
          NIL)
    }

  /**
   * Source font size used to generate MSDF textures. Higher values allow for more precision, but are slower to render and require more memory. Only increase this value if you notice a visible lack of precision in glyph rendering.
   */
  public var msdfSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SYSTEMFONT_GET_MSDF_SIZE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SYSTEMFONT_SET_MSDF_SIZE, NIL)
    }

  /**
   * Font oversampling factor, if set to `0.0` global oversampling factor is used instead.
   */
  public var oversampling: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SYSTEMFONT_GET_OVERSAMPLING,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SYSTEMFONT_SET_OVERSAMPLING, NIL)
    }

  /**
   * Array of fallback [godot.Font]s.
   */
  public var fallbacks: VariantArray<Font>
    @JvmName("getFallbacks_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getFallbacks()
    @JvmName("setFallbacks_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    set(`value`) {
      super.setFallbacks(value)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SYSTEMFONT, scriptIndex)
    return true
  }

  public companion object
}
