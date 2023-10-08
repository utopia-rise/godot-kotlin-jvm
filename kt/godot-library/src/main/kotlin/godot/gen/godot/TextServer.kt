// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Dictionary
import godot.core.PackedByteArray
import godot.core.PackedFloat32Array
import godot.core.PackedInt32Array
import godot.core.PackedStringArray
import godot.core.PackedVector2Array
import godot.core.RID
import godot.core.Rect2
import godot.core.Transform2D
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
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.PACKED_FLOAT_32_ARRAY
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR2I
import godot.core.VariantType._RID
import godot.core.Vector2
import godot.core.Vector2i
import godot.core.Vector3i
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * A server interface for font management and text rendering.
 *
 * [godot.TextServer] is the API backend for managing fonts and rendering text.
 */
@GodotBaseType
public open class TextServer internal constructor() : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TEXTSERVER, scriptIndex)
    return true
  }

  /**
   * Returns `true` if the server supports a feature.
   */
  public fun hasFeature(feature: Feature): Boolean {
    TransferContext.writeArguments(LONG to feature.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_HAS_FEATURE, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the name of the server interface.
   */
  public fun getName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_GET_NAME, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns text server features, see [enum Feature].
   */
  public fun getFeatures(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_GET_FEATURES, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Loads optional TextServer database (e.g. ICU break iterators and dictionaries).
   *
   * **Note:** This function should be called before any other TextServer functions used, otherwise it won't have any effect.
   */
  public fun loadSupportData(filename: String): Boolean {
    TransferContext.writeArguments(STRING to filename)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_LOAD_SUPPORT_DATA, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns default TextServer database (e.g. ICU break iterators and dictionaries) filename.
   */
  public fun getSupportDataFilename(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_GET_SUPPORT_DATA_FILENAME, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns TextServer database (e.g. ICU break iterators and dictionaries) description.
   */
  public fun getSupportDataInfo(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_GET_SUPPORT_DATA_INFO,
        STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Saves optional TextServer database (e.g. ICU break iterators and dictionaries) to the file.
   *
   * **Note:** This function is used by during project export, to include TextServer database.
   */
  public fun saveSupportData(filename: String): Boolean {
    TransferContext.writeArguments(STRING to filename)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SAVE_SUPPORT_DATA, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if locale is right-to-left.
   */
  public fun isLocaleRightToLeft(locale: String): Boolean {
    TransferContext.writeArguments(STRING to locale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_IS_LOCALE_RIGHT_TO_LEFT,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Converts readable feature, variation, script or language name to OpenType tag.
   */
  public fun nameToTag(name: String): Long {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_NAME_TO_TAG, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Converts OpenType tag to readable feature, variation, script or language name.
   */
  public fun tagToName(tag: Long): String {
    TransferContext.writeArguments(LONG to tag)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_TAG_TO_NAME, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns `true` if [rid] is valid resource owned by this text server.
   */
  public fun has(rid: RID): Boolean {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_HAS, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Frees an object created by this [godot.TextServer].
   */
  public fun freeRid(rid: RID): Unit {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FREE_RID, NIL)
  }

  /**
   * Creates a new, empty font cache entry resource. To free the resulting resource, use the [freeRid] method.
   */
  public fun createFont(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_CREATE_FONT, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets font source data, e.g contents of the dynamic font source file.
   */
  public fun fontSetData(fontRid: RID, `data`: PackedByteArray): Unit {
    TransferContext.writeArguments(_RID to fontRid, PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_SET_DATA, NIL)
  }

  /**
   * Sets an active face index in the TrueType / OpenType collection.
   */
  public fun fontSetFaceIndex(fontRid: RID, faceIndex: Long): Unit {
    TransferContext.writeArguments(_RID to fontRid, LONG to faceIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_SET_FACE_INDEX, NIL)
  }

  /**
   * Recturns an active face index in the TrueType / OpenType collection.
   */
  public fun fontGetFaceIndex(fontRid: RID): Long {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_FACE_INDEX,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns number of faces in the TrueType / OpenType collection.
   */
  public fun fontGetFaceCount(fontRid: RID): Long {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_FACE_COUNT,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Sets the font style flags, see [enum FontStyle].
   *
   * **Note:** This value is used for font matching only and will not affect font rendering. Use [fontSetFaceIndex], [fontSetVariationCoordinates], [fontSetEmbolden], or [fontSetTransform] instead.
   */
  public fun fontSetStyle(fontRid: RID, style: Long): Unit {
    TransferContext.writeArguments(_RID to fontRid, OBJECT to style)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_SET_STYLE, NIL)
  }

  /**
   * Returns font style flags, see [enum FontStyle].
   */
  public fun fontGetStyle(fontRid: RID): Long {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_STYLE, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, false) as Long)
  }

  /**
   * Sets the font family name.
   */
  public fun fontSetName(fontRid: RID, name: String): Unit {
    TransferContext.writeArguments(_RID to fontRid, STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_SET_NAME, NIL)
  }

  /**
   * Returns font family name.
   */
  public fun fontGetName(fontRid: RID): String {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_NAME, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns [godot.core.Dictionary] with OpenType font name strings (localized font names, version, description, license information, sample text, etc.).
   */
  public fun fontGetOtNameStrings(fontRid: RID): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_OT_NAME_STRINGS,
        DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Sets the font style name.
   */
  public fun fontSetStyleName(fontRid: RID, name: String): Unit {
    TransferContext.writeArguments(_RID to fontRid, STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_SET_STYLE_NAME, NIL)
  }

  /**
   * Returns font style name.
   */
  public fun fontGetStyleName(fontRid: RID): String {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_STYLE_NAME,
        STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Sets weight (boldness) of the font. A value in the `100...999` range, normal font weight is `400`, bold font weight is `700`.
   *
   * **Note:** This value is used for font matching only and will not affect font rendering. Use [fontSetFaceIndex], [fontSetVariationCoordinates], or [fontSetEmbolden] instead.
   */
  public fun fontSetWeight(fontRid: RID, weight: Long): Unit {
    TransferContext.writeArguments(_RID to fontRid, LONG to weight)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_SET_WEIGHT, NIL)
  }

  /**
   * Returns weight (boldness) of the font. A value in the `100...999` range, normal font weight is `400`, bold font weight is `700`.
   */
  public fun fontGetWeight(fontRid: RID): Long {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_WEIGHT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Sets font stretch amount, compared to a normal width. A percentage value between `50%` and `200%`.
   *
   * **Note:** This value is used for font matching only and will not affect font rendering. Use [fontSetFaceIndex], [fontSetVariationCoordinates], or [fontSetTransform] instead.
   */
  public fun fontSetStretch(fontRid: RID, weight: Long): Unit {
    TransferContext.writeArguments(_RID to fontRid, LONG to weight)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_SET_STRETCH, NIL)
  }

  /**
   * Returns font stretch amount, compared to a normal width. A percentage value between `50%` and `200%`.
   */
  public fun fontGetStretch(fontRid: RID): Long {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_STRETCH, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Sets font anti-aliasing mode.
   */
  public fun fontSetAntialiasing(fontRid: RID, antialiasing: FontAntialiasing): Unit {
    TransferContext.writeArguments(_RID to fontRid, LONG to antialiasing.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_SET_ANTIALIASING,
        NIL)
  }

  /**
   * Returns font anti-aliasing mode.
   */
  public fun fontGetAntialiasing(fontRid: RID): FontAntialiasing {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_ANTIALIASING,
        LONG)
    return TextServer.FontAntialiasing.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * If set to `true` font texture mipmap generation is enabled.
   */
  public fun fontSetGenerateMipmaps(fontRid: RID, generateMipmaps: Boolean): Unit {
    TransferContext.writeArguments(_RID to fontRid, BOOL to generateMipmaps)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_SET_GENERATE_MIPMAPS, NIL)
  }

  /**
   * Returns `true` if font texture mipmap generation is enabled.
   */
  public fun fontGetGenerateMipmaps(fontRid: RID): Boolean {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_GENERATE_MIPMAPS, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * If set to `true`, glyphs of all sizes are rendered using single multichannel signed distance field generated from the dynamic font vector data. MSDF rendering allows displaying the font at any scaling factor without blurriness, and without incurring a CPU cost when the font size changes (since the font no longer needs to be rasterized on the CPU). As a downside, font hinting is not available with MSDF. The lack of font hinting may result in less crisp and less readable fonts at small sizes.
   *
   * **Note:** MSDF font rendering does not render glyphs with overlapping shapes correctly. Overlapping shapes are not valid per the OpenType standard, but are still commonly found in many font files, especially those converted by Google Fonts. To avoid issues with overlapping glyphs, consider downloading the font file directly from the type foundry instead of relying on Google Fonts.
   */
  public fun fontSetMultichannelSignedDistanceField(fontRid: RID, msdf: Boolean): Unit {
    TransferContext.writeArguments(_RID to fontRid, BOOL to msdf)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_SET_MULTICHANNEL_SIGNED_DISTANCE_FIELD, NIL)
  }

  /**
   * Returns `true` if glyphs of all sizes are rendered using single multichannel signed distance field generated from the dynamic font vector data.
   */
  public fun fontIsMultichannelSignedDistanceField(fontRid: RID): Boolean {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_IS_MULTICHANNEL_SIGNED_DISTANCE_FIELD, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets the width of the range around the shape between the minimum and maximum representable signed distance.
   */
  public fun fontSetMsdfPixelRange(fontRid: RID, msdfPixelRange: Long): Unit {
    TransferContext.writeArguments(_RID to fontRid, LONG to msdfPixelRange)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_SET_MSDF_PIXEL_RANGE, NIL)
  }

  /**
   * Returns the width of the range around the shape between the minimum and maximum representable signed distance.
   */
  public fun fontGetMsdfPixelRange(fontRid: RID): Long {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_MSDF_PIXEL_RANGE, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Sets source font size used to generate MSDF textures.
   */
  public fun fontSetMsdfSize(fontRid: RID, msdfSize: Long): Unit {
    TransferContext.writeArguments(_RID to fontRid, LONG to msdfSize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_SET_MSDF_SIZE, NIL)
  }

  /**
   * Returns source font size used to generate MSDF textures.
   */
  public fun fontGetMsdfSize(fontRid: RID): Long {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_MSDF_SIZE, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Sets bitmap font fixed size. If set to value greater than zero, same cache entry will be used for all font sizes.
   */
  public fun fontSetFixedSize(fontRid: RID, fixedSize: Long): Unit {
    TransferContext.writeArguments(_RID to fontRid, LONG to fixedSize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_SET_FIXED_SIZE, NIL)
  }

  /**
   * Returns bitmap font fixed size.
   */
  public fun fontGetFixedSize(fontRid: RID): Long {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_FIXED_SIZE,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * If set to `true`, system fonts can be automatically used as fallbacks.
   */
  public fun fontSetAllowSystemFallback(fontRid: RID, allowSystemFallback: Boolean): Unit {
    TransferContext.writeArguments(_RID to fontRid, BOOL to allowSystemFallback)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_SET_ALLOW_SYSTEM_FALLBACK, NIL)
  }

  /**
   * Returns `true` if system fonts can be automatically used as fallbacks.
   */
  public fun fontIsAllowSystemFallback(fontRid: RID): Boolean {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_IS_ALLOW_SYSTEM_FALLBACK, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * If set to `true` auto-hinting is preferred over font built-in hinting.
   */
  public fun fontSetForceAutohinter(fontRid: RID, forceAutohinter: Boolean): Unit {
    TransferContext.writeArguments(_RID to fontRid, BOOL to forceAutohinter)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_SET_FORCE_AUTOHINTER, NIL)
  }

  /**
   * Returns `true` if auto-hinting is supported and preferred over font built-in hinting. Used by dynamic fonts only.
   */
  public fun fontIsForceAutohinter(fontRid: RID): Boolean {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_IS_FORCE_AUTOHINTER,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets font hinting mode. Used by dynamic fonts only.
   */
  public fun fontSetHinting(fontRid: RID, hinting: Hinting): Unit {
    TransferContext.writeArguments(_RID to fontRid, LONG to hinting.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_SET_HINTING, NIL)
  }

  /**
   * Returns the font hinting mode. Used by dynamic fonts only.
   */
  public fun fontGetHinting(fontRid: RID): Hinting {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_HINTING, LONG)
    return TextServer.Hinting.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets font subpixel glyph positioning mode.
   */
  public fun fontSetSubpixelPositioning(fontRid: RID, subpixelPositioning: SubpixelPositioning):
      Unit {
    TransferContext.writeArguments(_RID to fontRid, LONG to subpixelPositioning.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_SET_SUBPIXEL_POSITIONING, NIL)
  }

  /**
   * Returns font subpixel glyph positioning mode.
   */
  public fun fontGetSubpixelPositioning(fontRid: RID): SubpixelPositioning {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_SUBPIXEL_POSITIONING, LONG)
    return TextServer.SubpixelPositioning.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets font embolden strength. If [strength] is not equal to zero, emboldens the font outlines. Negative values reduce the outline thickness.
   */
  public fun fontSetEmbolden(fontRid: RID, strength: Double): Unit {
    TransferContext.writeArguments(_RID to fontRid, DOUBLE to strength)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_SET_EMBOLDEN, NIL)
  }

  /**
   * Returns font embolden strength.
   */
  public fun fontGetEmbolden(fontRid: RID): Double {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_EMBOLDEN,
        DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Sets 2D transform, applied to the font outlines, can be used for slanting, flipping and rotating glyphs.
   *
   * For example, to simulate italic typeface by slanting, apply the following transform `Transform2D(1.0, slant, 0.0, 1.0, 0.0, 0.0)`.
   */
  public fun fontSetTransform(fontRid: RID, transform: Transform2D): Unit {
    TransferContext.writeArguments(_RID to fontRid, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_SET_TRANSFORM, NIL)
  }

  /**
   * Returns 2D transform applied to the font outlines.
   */
  public fun fontGetTransform(fontRid: RID): Transform2D {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_TRANSFORM,
        TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
  }

  /**
   * Sets variation coordinates for the specified font cache entry. See [fontSupportedVariationList] for more info.
   */
  public fun fontSetVariationCoordinates(fontRid: RID,
      variationCoordinates: Dictionary<Any?, Any?>): Unit {
    TransferContext.writeArguments(_RID to fontRid, DICTIONARY to variationCoordinates)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_SET_VARIATION_COORDINATES, NIL)
  }

  /**
   * Returns variation coordinates for the specified font cache entry. See [fontSupportedVariationList] for more info.
   */
  public fun fontGetVariationCoordinates(fontRid: RID): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_VARIATION_COORDINATES, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Sets font oversampling factor, if set to `0.0` global oversampling factor is used instead. Used by dynamic fonts only.
   */
  public fun fontSetOversampling(fontRid: RID, oversampling: Double): Unit {
    TransferContext.writeArguments(_RID to fontRid, DOUBLE to oversampling)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_SET_OVERSAMPLING,
        NIL)
  }

  /**
   * Returns font oversampling factor, if set to `0.0` global oversampling factor is used instead. Used by dynamic fonts only.
   */
  public fun fontGetOversampling(fontRid: RID): Double {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_OVERSAMPLING,
        DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Returns list of the font sizes in the cache. Each size is `Vector2i` with font size and outline size.
   */
  public fun fontGetSizeCacheList(fontRid: RID): VariantArray<Vector2i> {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_SIZE_CACHE_LIST,
        ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Vector2i>)
  }

  /**
   * Removes all font sizes from the cache entry.
   */
  public fun fontClearSizeCache(fontRid: RID): Unit {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_CLEAR_SIZE_CACHE,
        NIL)
  }

  /**
   * Removes specified font size from the cache entry.
   */
  public fun fontRemoveSizeCache(fontRid: RID, size: Vector2i): Unit {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_REMOVE_SIZE_CACHE,
        NIL)
  }

  /**
   * Sets the font ascent (number of pixels above the baseline).
   */
  public fun fontSetAscent(
    fontRid: RID,
    size: Long,
    ascent: Double,
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, LONG to size, DOUBLE to ascent)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_SET_ASCENT, NIL)
  }

  /**
   * Returns the font ascent (number of pixels above the baseline).
   */
  public fun fontGetAscent(fontRid: RID, size: Long): Double {
    TransferContext.writeArguments(_RID to fontRid, LONG to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_ASCENT, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Sets the font descent (number of pixels below the baseline).
   */
  public fun fontSetDescent(
    fontRid: RID,
    size: Long,
    descent: Double,
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, LONG to size, DOUBLE to descent)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_SET_DESCENT, NIL)
  }

  /**
   * Returns the font descent (number of pixels below the baseline).
   */
  public fun fontGetDescent(fontRid: RID, size: Long): Double {
    TransferContext.writeArguments(_RID to fontRid, LONG to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_DESCENT, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Sets pixel offset of the underline below the baseline.
   */
  public fun fontSetUnderlinePosition(
    fontRid: RID,
    size: Long,
    underlinePosition: Double,
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, LONG to size, DOUBLE to underlinePosition)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_SET_UNDERLINE_POSITION, NIL)
  }

  /**
   * Returns pixel offset of the underline below the baseline.
   */
  public fun fontGetUnderlinePosition(fontRid: RID, size: Long): Double {
    TransferContext.writeArguments(_RID to fontRid, LONG to size)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_UNDERLINE_POSITION, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Sets thickness of the underline in pixels.
   */
  public fun fontSetUnderlineThickness(
    fontRid: RID,
    size: Long,
    underlineThickness: Double,
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, LONG to size, DOUBLE to underlineThickness)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_SET_UNDERLINE_THICKNESS, NIL)
  }

  /**
   * Returns thickness of the underline in pixels.
   */
  public fun fontGetUnderlineThickness(fontRid: RID, size: Long): Double {
    TransferContext.writeArguments(_RID to fontRid, LONG to size)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_UNDERLINE_THICKNESS, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Sets scaling factor of the color bitmap font.
   */
  public fun fontSetScale(
    fontRid: RID,
    size: Long,
    scale: Double,
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, LONG to size, DOUBLE to scale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_SET_SCALE, NIL)
  }

  /**
   * Returns scaling factor of the color bitmap font.
   */
  public fun fontGetScale(fontRid: RID, size: Long): Double {
    TransferContext.writeArguments(_RID to fontRid, LONG to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_SCALE, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Returns number of textures used by font cache entry.
   */
  public fun fontGetTextureCount(fontRid: RID, size: Vector2i): Long {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_TEXTURE_COUNT,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Removes all textures from font cache entry.
   *
   * **Note:** This function will not remove glyphs associated with the texture, use [fontRemoveGlyph] to remove them manually.
   */
  public fun fontClearTextures(fontRid: RID, size: Vector2i): Unit {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_CLEAR_TEXTURES, NIL)
  }

  /**
   * Removes specified texture from the cache entry.
   *
   * **Note:** This function will not remove glyphs associated with the texture, remove them manually, using [fontRemoveGlyph].
   */
  public fun fontRemoveTexture(
    fontRid: RID,
    size: Vector2i,
    textureIndex: Long,
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size, LONG to textureIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_REMOVE_TEXTURE, NIL)
  }

  /**
   * Sets font cache texture image data.
   */
  public fun fontSetTextureImage(
    fontRid: RID,
    size: Vector2i,
    textureIndex: Long,
    image: Image,
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size, LONG to textureIndex, OBJECT to image)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_SET_TEXTURE_IMAGE,
        NIL)
  }

  /**
   * Returns font cache texture image data.
   */
  public fun fontGetTextureImage(
    fontRid: RID,
    size: Vector2i,
    textureIndex: Long,
  ): Image? {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size, LONG to textureIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_TEXTURE_IMAGE,
        OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Image?)
  }

  /**
   * Sets array containing glyph packing data.
   */
  public fun fontSetTextureOffsets(
    fontRid: RID,
    size: Vector2i,
    textureIndex: Long,
    offset: PackedInt32Array,
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size, LONG to textureIndex, PACKED_INT_32_ARRAY to offset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_SET_TEXTURE_OFFSETS,
        NIL)
  }

  /**
   * Returns array containing glyph packing data.
   */
  public fun fontGetTextureOffsets(
    fontRid: RID,
    size: Vector2i,
    textureIndex: Long,
  ): PackedInt32Array {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size, LONG to textureIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_TEXTURE_OFFSETS,
        PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Returns list of rendered glyphs in the cache entry.
   */
  public fun fontGetGlyphList(fontRid: RID, size: Vector2i): PackedInt32Array {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_GLYPH_LIST,
        PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Removes all rendered glyphs information from the cache entry.
   *
   * **Note:** This function will not remove textures associated with the glyphs, use [fontRemoveTexture] to remove them manually.
   */
  public fun fontClearGlyphs(fontRid: RID, size: Vector2i): Unit {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_CLEAR_GLYPHS, NIL)
  }

  /**
   * Removes specified rendered glyph information from the cache entry.
   *
   * **Note:** This function will not remove textures associated with the glyphs, use [fontRemoveTexture] to remove them manually.
   */
  public fun fontRemoveGlyph(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size, LONG to glyph)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_REMOVE_GLYPH, NIL)
  }

  /**
   * Returns glyph advance (offset of the next glyph).
   *
   * **Note:** Advance for glyphs outlines is the same as the base glyph advance and is not saved.
   */
  public fun fontGetGlyphAdvance(
    fontRid: RID,
    size: Long,
    glyph: Long,
  ): Vector2 {
    TransferContext.writeArguments(_RID to fontRid, LONG to size, LONG to glyph)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_GLYPH_ADVANCE,
        VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Sets glyph advance (offset of the next glyph).
   *
   * **Note:** Advance for glyphs outlines is the same as the base glyph advance and is not saved.
   */
  public fun fontSetGlyphAdvance(
    fontRid: RID,
    size: Long,
    glyph: Long,
    advance: Vector2,
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, LONG to size, LONG to glyph, VECTOR2 to advance)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_SET_GLYPH_ADVANCE,
        NIL)
  }

  /**
   * Returns glyph offset from the baseline.
   */
  public fun fontGetGlyphOffset(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
  ): Vector2 {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size, LONG to glyph)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_GLYPH_OFFSET,
        VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Sets glyph offset from the baseline.
   */
  public fun fontSetGlyphOffset(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
    offset: Vector2,
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size, LONG to glyph, VECTOR2 to offset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_SET_GLYPH_OFFSET,
        NIL)
  }

  /**
   * Returns size of the glyph.
   */
  public fun fontGetGlyphSize(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
  ): Vector2 {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size, LONG to glyph)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_GLYPH_SIZE,
        VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Sets size of the glyph.
   */
  public fun fontSetGlyphSize(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
    glSize: Vector2,
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size, LONG to glyph, VECTOR2 to glSize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_SET_GLYPH_SIZE, NIL)
  }

  /**
   * Returns rectangle in the cache texture containing the glyph.
   */
  public fun fontGetGlyphUvRect(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
  ): Rect2 {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size, LONG to glyph)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_GLYPH_UV_RECT,
        RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  /**
   * Sets rectangle in the cache texture containing the glyph.
   */
  public fun fontSetGlyphUvRect(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
    uvRect: Rect2,
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size, LONG to glyph, RECT2 to uvRect)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_SET_GLYPH_UV_RECT,
        NIL)
  }

  /**
   * Returns index of the cache texture containing the glyph.
   */
  public fun fontGetGlyphTextureIdx(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
  ): Long {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size, LONG to glyph)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_GLYPH_TEXTURE_IDX, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Sets index of the cache texture containing the glyph.
   */
  public fun fontSetGlyphTextureIdx(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
    textureIdx: Long,
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size, LONG to glyph, LONG to textureIdx)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_SET_GLYPH_TEXTURE_IDX, NIL)
  }

  /**
   * Returns resource ID of the cache texture containing the glyph.
   *
   * **Note:** If there are pending glyphs to render, calling this function might trigger the texture cache update.
   */
  public fun fontGetGlyphTextureRid(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
  ): RID {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size, LONG to glyph)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_GLYPH_TEXTURE_RID, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns size of the cache texture containing the glyph.
   *
   * **Note:** If there are pending glyphs to render, calling this function might trigger the texture cache update.
   */
  public fun fontGetGlyphTextureSize(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
  ): Vector2 {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size, LONG to glyph)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_GLYPH_TEXTURE_SIZE, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns outline contours of the glyph as a `Dictionary` with the following contents:
   *
   * `points`         - [godot.PackedVector3Array], containing outline points. `x` and `y` are point coordinates. `z` is the type of the point, using the [enum ContourPointTag] values.
   *
   * `contours`       - [godot.PackedInt32Array], containing indices the end points of each contour.
   *
   * `orientation`    - [bool], contour orientation. If `true`, clockwise contours must be filled.
   */
  public fun fontGetGlyphContours(
    font: RID,
    size: Long,
    index: Long,
  ): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(_RID to font, LONG to size, LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_GLYPH_CONTOURS,
        DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns list of the kerning overrides.
   */
  public fun fontGetKerningList(fontRid: RID, size: Long): VariantArray<Vector2i> {
    TransferContext.writeArguments(_RID to fontRid, LONG to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_KERNING_LIST,
        ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Vector2i>)
  }

  /**
   * Removes all kerning overrides.
   */
  public fun fontClearKerningMap(fontRid: RID, size: Long): Unit {
    TransferContext.writeArguments(_RID to fontRid, LONG to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_CLEAR_KERNING_MAP,
        NIL)
  }

  /**
   * Removes kerning override for the pair of glyphs.
   */
  public fun fontRemoveKerning(
    fontRid: RID,
    size: Long,
    glyphPair: Vector2i,
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, LONG to size, VECTOR2I to glyphPair)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_REMOVE_KERNING, NIL)
  }

  /**
   * Sets kerning for the pair of glyphs.
   */
  public fun fontSetKerning(
    fontRid: RID,
    size: Long,
    glyphPair: Vector2i,
    kerning: Vector2,
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, LONG to size, VECTOR2I to glyphPair, VECTOR2 to kerning)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_SET_KERNING, NIL)
  }

  /**
   * Returns kerning for the pair of glyphs.
   */
  public fun fontGetKerning(
    fontRid: RID,
    size: Long,
    glyphPair: Vector2i,
  ): Vector2 {
    TransferContext.writeArguments(_RID to fontRid, LONG to size, VECTOR2I to glyphPair)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_KERNING,
        VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the glyph index of a [char], optionally modified by the [variationSelector].  See [fontGetCharFromGlyphIndex].
   */
  public fun fontGetGlyphIndex(
    fontRid: RID,
    size: Long,
    char: Long,
    variationSelector: Long,
  ): Long {
    TransferContext.writeArguments(_RID to fontRid, LONG to size, LONG to char, LONG to variationSelector)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_GLYPH_INDEX,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns character code associated with [glyphIndex], or `0` if [glyphIndex] is invalid. See [fontGetGlyphIndex].
   */
  public fun fontGetCharFromGlyphIndex(
    fontRid: RID,
    size: Long,
    glyphIndex: Long,
  ): Long {
    TransferContext.writeArguments(_RID to fontRid, LONG to size, LONG to glyphIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_CHAR_FROM_GLYPH_INDEX, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns `true` if a Unicode [char] is available in the font.
   */
  public fun fontHasChar(fontRid: RID, char: Long): Boolean {
    TransferContext.writeArguments(_RID to fontRid, LONG to char)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_HAS_CHAR, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns a string containing all the characters available in the font.
   */
  public fun fontGetSupportedChars(fontRid: RID): String {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_SUPPORTED_CHARS,
        STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Renders the range of characters to the font cache texture.
   */
  public fun fontRenderRange(
    fontRid: RID,
    size: Vector2i,
    start: Long,
    end: Long,
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size, LONG to start, LONG to end)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_RENDER_RANGE, NIL)
  }

  /**
   * Renders specified glyph to the font cache texture.
   */
  public fun fontRenderGlyph(
    fontRid: RID,
    size: Vector2i,
    index: Long,
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size, LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_RENDER_GLYPH, NIL)
  }

  /**
   * Draws single glyph into a canvas item at the position, using [fontRid] at the size [size].
   *
   * **Note:** Glyph index is specific to the font, use glyphs indices returned by [shapedTextGetGlyphs] or [fontGetGlyphIndex].
   *
   * **Note:** If there are pending glyphs to render, calling this function might trigger the texture cache update.
   */
  @JvmOverloads
  public fun fontDrawGlyph(
    fontRid: RID,
    canvas: RID,
    size: Long,
    pos: Vector2,
    index: Long,
    color: Color = Color(Color(1, 1, 1, 1)),
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, _RID to canvas, LONG to size, VECTOR2 to pos, LONG to index, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_DRAW_GLYPH, NIL)
  }

  /**
   * Draws single glyph outline of size [outlineSize] into a canvas item at the position, using [fontRid] at the size [size].
   *
   * **Note:** Glyph index is specific to the font, use glyphs indices returned by [shapedTextGetGlyphs] or [fontGetGlyphIndex].
   *
   * **Note:** If there are pending glyphs to render, calling this function might trigger the texture cache update.
   */
  @JvmOverloads
  public fun fontDrawGlyphOutline(
    fontRid: RID,
    canvas: RID,
    size: Long,
    outlineSize: Long,
    pos: Vector2,
    index: Long,
    color: Color = Color(Color(1, 1, 1, 1)),
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, _RID to canvas, LONG to size, LONG to outlineSize, VECTOR2 to pos, LONG to index, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_DRAW_GLYPH_OUTLINE,
        NIL)
  }

  /**
   * Returns `true`, if font supports given language ([godot.ISO 639](https://en.wikipedia.org/wiki/ISO_639-1) code).
   */
  public fun fontIsLanguageSupported(fontRid: RID, language: String): Boolean {
    TransferContext.writeArguments(_RID to fontRid, STRING to language)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_IS_LANGUAGE_SUPPORTED, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Adds override for [fontIsLanguageSupported].
   */
  public fun fontSetLanguageSupportOverride(
    fontRid: RID,
    language: String,
    supported: Boolean,
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, STRING to language, BOOL to supported)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_SET_LANGUAGE_SUPPORT_OVERRIDE, NIL)
  }

  /**
   * Returns `true` if support override is enabled for the [language].
   */
  public fun fontGetLanguageSupportOverride(fontRid: RID, language: String): Boolean {
    TransferContext.writeArguments(_RID to fontRid, STRING to language)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_LANGUAGE_SUPPORT_OVERRIDE, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Remove language support override.
   */
  public fun fontRemoveLanguageSupportOverride(fontRid: RID, language: String): Unit {
    TransferContext.writeArguments(_RID to fontRid, STRING to language)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_REMOVE_LANGUAGE_SUPPORT_OVERRIDE, NIL)
  }

  /**
   * Returns list of language support overrides.
   */
  public fun fontGetLanguageSupportOverrides(fontRid: RID): PackedStringArray {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_LANGUAGE_SUPPORT_OVERRIDES,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Returns `true`, if font supports given script (ISO 15924 code).
   */
  public fun fontIsScriptSupported(fontRid: RID, script: String): Boolean {
    TransferContext.writeArguments(_RID to fontRid, STRING to script)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_IS_SCRIPT_SUPPORTED,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Adds override for [fontIsScriptSupported].
   */
  public fun fontSetScriptSupportOverride(
    fontRid: RID,
    script: String,
    supported: Boolean,
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, STRING to script, BOOL to supported)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_SET_SCRIPT_SUPPORT_OVERRIDE, NIL)
  }

  /**
   * Returns `true` if support override is enabled for the [script].
   */
  public fun fontGetScriptSupportOverride(fontRid: RID, script: String): Boolean {
    TransferContext.writeArguments(_RID to fontRid, STRING to script)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_SCRIPT_SUPPORT_OVERRIDE, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Removes script support override.
   */
  public fun fontRemoveScriptSupportOverride(fontRid: RID, script: String): Unit {
    TransferContext.writeArguments(_RID to fontRid, STRING to script)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_REMOVE_SCRIPT_SUPPORT_OVERRIDE, NIL)
  }

  /**
   * Returns list of script support overrides.
   */
  public fun fontGetScriptSupportOverrides(fontRid: RID): PackedStringArray {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_SCRIPT_SUPPORT_OVERRIDES, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Sets font OpenType feature set override.
   */
  public fun fontSetOpentypeFeatureOverrides(fontRid: RID, overrides: Dictionary<Any?, Any?>):
      Unit {
    TransferContext.writeArguments(_RID to fontRid, DICTIONARY to overrides)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_SET_OPENTYPE_FEATURE_OVERRIDES, NIL)
  }

  /**
   * Returns font OpenType feature set override.
   */
  public fun fontGetOpentypeFeatureOverrides(fontRid: RID): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_OPENTYPE_FEATURE_OVERRIDES, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns the dictionary of the supported OpenType features.
   */
  public fun fontSupportedFeatureList(fontRid: RID): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_SUPPORTED_FEATURE_LIST, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns the dictionary of the supported OpenType variation coordinates.
   */
  public fun fontSupportedVariationList(fontRid: RID): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_SUPPORTED_VARIATION_LIST, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns the font oversampling factor, shared by all fonts in the TextServer.
   */
  public fun fontGetGlobalOversampling(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_GET_GLOBAL_OVERSAMPLING, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Sets oversampling factor, shared by all font in the TextServer.
   *
   * **Note:** This value can be automatically changed by display server.
   */
  public fun fontSetGlobalOversampling(oversampling: Double): Unit {
    TransferContext.writeArguments(DOUBLE to oversampling)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FONT_SET_GLOBAL_OVERSAMPLING, NIL)
  }

  /**
   * Returns size of the replacement character (box with character hexadecimal code that is drawn in place of invalid characters).
   */
  public fun getHexCodeBoxSize(size: Long, index: Long): Vector2 {
    TransferContext.writeArguments(LONG to size, LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_GET_HEX_CODE_BOX_SIZE,
        VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Draws box displaying character hexadecimal code. Used for replacing missing characters.
   */
  public fun drawHexCodeBox(
    canvas: RID,
    size: Long,
    pos: Vector2,
    index: Long,
    color: Color,
  ): Unit {
    TransferContext.writeArguments(_RID to canvas, LONG to size, VECTOR2 to pos, LONG to index, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_DRAW_HEX_CODE_BOX, NIL)
  }

  /**
   * Creates new buffer for complex text layout, with the given [direction] and [orientation]. To free the resulting buffer, use [freeRid] method.
   *
   * **Note:** Direction is ignored if server does not support [FEATURE_BIDI_LAYOUT] feature (supported by [godot.TextServerAdvanced]).
   *
   * **Note:** Orientation is ignored if server does not support [FEATURE_VERTICAL_LAYOUT] feature (supported by [godot.TextServerAdvanced]).
   */
  @JvmOverloads
  public fun createShapedText(direction: Direction = TextServer.Direction.DIRECTION_AUTO,
      orientation: Orientation = TextServer.Orientation.ORIENTATION_HORIZONTAL): RID {
    TransferContext.writeArguments(LONG to direction.id, LONG to orientation.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_CREATE_SHAPED_TEXT, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Clears text buffer (removes text and inline objects).
   */
  public fun shapedTextClear(rid: RID): Unit {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_CLEAR, NIL)
  }

  /**
   * Sets desired text direction. If set to [DIRECTION_AUTO], direction will be detected based on the buffer contents and current locale.
   *
   * **Note:** Direction is ignored if server does not support [FEATURE_BIDI_LAYOUT] feature (supported by [godot.TextServerAdvanced]).
   */
  @JvmOverloads
  public fun shapedTextSetDirection(shaped: RID, direction: Direction =
      TextServer.Direction.DIRECTION_AUTO): Unit {
    TransferContext.writeArguments(_RID to shaped, LONG to direction.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_SET_DIRECTION, NIL)
  }

  /**
   * Returns direction of the text.
   */
  public fun shapedTextGetDirection(shaped: RID): Direction {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_GET_DIRECTION, LONG)
    return TextServer.Direction.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns direction of the text, inferred by the BiDi algorithm.
   */
  public fun shapedTextGetInferredDirection(shaped: RID): Direction {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_GET_INFERRED_DIRECTION, LONG)
    return TextServer.Direction.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Overrides BiDi for the structured text.
   *
   * Override ranges should cover full source text without overlaps. BiDi algorithm will be used on each range separately.
   */
  public fun shapedTextSetBidiOverride(shaped: RID, `override`: VariantArray<Any?>): Unit {
    TransferContext.writeArguments(_RID to shaped, ARRAY to override)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_SET_BIDI_OVERRIDE, NIL)
  }

  /**
   * Sets custom punctuation character list, used for word breaking. If set to empty string, server defaults are used.
   */
  public fun shapedTextSetCustomPunctuation(shaped: RID, punct: String): Unit {
    TransferContext.writeArguments(_RID to shaped, STRING to punct)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_SET_CUSTOM_PUNCTUATION, NIL)
  }

  /**
   * Returns custom punctuation character list, used for word breaking. If set to empty string, server defaults are used.
   */
  public fun shapedTextGetCustomPunctuation(shaped: RID): String {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_GET_CUSTOM_PUNCTUATION, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Sets desired text orientation.
   *
   * **Note:** Orientation is ignored if server does not support [FEATURE_VERTICAL_LAYOUT] feature (supported by [godot.TextServerAdvanced]).
   */
  @JvmOverloads
  public fun shapedTextSetOrientation(shaped: RID, orientation: Orientation =
      TextServer.Orientation.ORIENTATION_HORIZONTAL): Unit {
    TransferContext.writeArguments(_RID to shaped, LONG to orientation.id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_SET_ORIENTATION, NIL)
  }

  /**
   * Returns text orientation.
   */
  public fun shapedTextGetOrientation(shaped: RID): Orientation {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_GET_ORIENTATION, LONG)
    return TextServer.Orientation.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * If set to `true` text buffer will display invalid characters as hexadecimal codes, otherwise nothing is displayed.
   */
  public fun shapedTextSetPreserveInvalid(shaped: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to shaped, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_SET_PRESERVE_INVALID, NIL)
  }

  /**
   * Returns `true` if text buffer is configured to display hexadecimal codes in place of invalid characters.
   *
   * **Note:** If set to `false`, nothing is displayed in place of invalid characters.
   */
  public fun shapedTextGetPreserveInvalid(shaped: RID): Boolean {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_GET_PRESERVE_INVALID, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * If set to `true` text buffer will display control characters.
   */
  public fun shapedTextSetPreserveControl(shaped: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to shaped, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_SET_PRESERVE_CONTROL, NIL)
  }

  /**
   * Returns `true` if text buffer is configured to display control characters.
   */
  public fun shapedTextGetPreserveControl(shaped: RID): Boolean {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_GET_PRESERVE_CONTROL, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets extra spacing added between glyphs or lines in pixels.
   */
  public fun shapedTextSetSpacing(
    shaped: RID,
    spacing: SpacingType,
    `value`: Long,
  ): Unit {
    TransferContext.writeArguments(_RID to shaped, LONG to spacing.id, LONG to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_SET_SPACING,
        NIL)
  }

  /**
   * Returns extra spacing added between glyphs or lines in pixels.
   */
  public fun shapedTextGetSpacing(shaped: RID, spacing: SpacingType): Long {
    TransferContext.writeArguments(_RID to shaped, LONG to spacing.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_GET_SPACING,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Adds text span and font to draw it to the text buffer.
   */
  @JvmOverloads
  public fun shapedTextAddString(
    shaped: RID,
    text: String,
    fonts: VariantArray<RID>,
    size: Long,
    opentypeFeatures: Dictionary<Any?, Any?> = Dictionary(),
    language: String = "",
    meta: Any? = null,
  ): Boolean {
    TransferContext.writeArguments(_RID to shaped, STRING to text, ARRAY to fonts, LONG to size, DICTIONARY to opentypeFeatures, STRING to language, ANY to meta)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_ADD_STRING,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Adds inline object to the text buffer, [key] must be unique. In the text, object is represented as [length] object replacement characters.
   */
  @JvmOverloads
  public fun shapedTextAddObject(
    shaped: RID,
    key: Any?,
    size: Vector2,
    inlineAlign: InlineAlignment = InlineAlignment.INLINE_ALIGNMENT_CENTER,
    length: Long = 1,
    baseline: Double = 0.0,
  ): Boolean {
    TransferContext.writeArguments(_RID to shaped, ANY to key, VECTOR2 to size, LONG to inlineAlign.id, LONG to length, DOUBLE to baseline)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_ADD_OBJECT,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Sets new size and alignment of embedded object.
   */
  @JvmOverloads
  public fun shapedTextResizeObject(
    shaped: RID,
    key: Any?,
    size: Vector2,
    inlineAlign: InlineAlignment = InlineAlignment.INLINE_ALIGNMENT_CENTER,
    baseline: Double = 0.0,
  ): Boolean {
    TransferContext.writeArguments(_RID to shaped, ANY to key, VECTOR2 to size, LONG to inlineAlign.id, DOUBLE to baseline)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_RESIZE_OBJECT, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns number of text spans added using [shapedTextAddString] or [shapedTextAddObject].
   */
  public fun shapedGetSpanCount(shaped: RID): Long {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_GET_SPAN_COUNT,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns text span metadata.
   */
  public fun shapedGetSpanMeta(shaped: RID, index: Long): Any? {
    TransferContext.writeArguments(_RID to shaped, LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_GET_SPAN_META,
        ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Changes text span font, font size and OpenType features, without changing the text.
   */
  @JvmOverloads
  public fun shapedSetSpanUpdateFont(
    shaped: RID,
    index: Long,
    fonts: VariantArray<RID>,
    size: Long,
    opentypeFeatures: Dictionary<Any?, Any?> = Dictionary(),
  ): Unit {
    TransferContext.writeArguments(_RID to shaped, LONG to index, ARRAY to fonts, LONG to size, DICTIONARY to opentypeFeatures)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_SET_SPAN_UPDATE_FONT, NIL)
  }

  /**
   * Returns text buffer for the substring of the text in the [shaped] text buffer (including inline objects).
   */
  public fun shapedTextSubstr(
    shaped: RID,
    start: Long,
    length: Long,
  ): RID {
    TransferContext.writeArguments(_RID to shaped, LONG to start, LONG to length)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_SUBSTR, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the parent buffer from which the substring originates.
   */
  public fun shapedTextGetParent(shaped: RID): RID {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_GET_PARENT,
        _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Adjusts text width to fit to specified width, returns new text width.
   */
  @JvmOverloads
  public fun shapedTextFitToWidth(
    shaped: RID,
    width: Double,
    justificationFlags: Long = 3,
  ): Double {
    TransferContext.writeArguments(_RID to shaped, DOUBLE to width, OBJECT to justificationFlags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_FIT_TO_WIDTH,
        DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Aligns shaped text to the given tab-stops.
   */
  public fun shapedTextTabAlign(shaped: RID, tabStops: PackedFloat32Array): Double {
    TransferContext.writeArguments(_RID to shaped, PACKED_FLOAT_32_ARRAY to tabStops)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_TAB_ALIGN,
        DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Shapes buffer if it's not shaped. Returns `true` if the string is shaped successfully.
   *
   * **Note:** It is not necessary to call this function manually, buffer will be shaped automatically as soon as any of its output data is requested.
   */
  public fun shapedTextShape(shaped: RID): Boolean {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_SHAPE, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if buffer is successfully shaped.
   */
  public fun shapedTextIsReady(shaped: RID): Boolean {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_IS_READY,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true`, if text buffer contents any visible characters.
   */
  public fun shapedTextHasVisibleChars(shaped: RID): Boolean {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_HAS_VISIBLE_CHARS, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns an array of glyphs in the visual order.
   */
  public fun shapedTextGetGlyphs(shaped: RID): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_GET_GLYPHS,
        ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Returns text glyphs in the logical order.
   */
  public fun shapedTextSortLogical(shaped: RID): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_SORT_LOGICAL,
        ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Returns number of glyphs in the buffer.
   */
  public fun shapedTextGetGlyphCount(shaped: RID): Long {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_GET_GLYPH_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns substring buffer character range in the parent buffer.
   */
  public fun shapedTextGetRange(shaped: RID): Vector2i {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_GET_RANGE,
        VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
  }

  /**
   * Breaks text to the lines and columns. Returns character ranges for each segment.
   */
  @JvmOverloads
  public fun shapedTextGetLineBreaksAdv(
    shaped: RID,
    width: PackedFloat32Array,
    start: Long = 0,
    once: Boolean = true,
    breakFlags: Long = 3,
  ): PackedInt32Array {
    TransferContext.writeArguments(_RID to shaped, PACKED_FLOAT_32_ARRAY to width, LONG to start, BOOL to once, OBJECT to breakFlags)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_GET_LINE_BREAKS_ADV, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Breaks text to the lines and returns character ranges for each line.
   */
  @JvmOverloads
  public fun shapedTextGetLineBreaks(
    shaped: RID,
    width: Double,
    start: Long = 0,
    breakFlags: Long = 3,
  ): PackedInt32Array {
    TransferContext.writeArguments(_RID to shaped, DOUBLE to width, LONG to start, OBJECT to breakFlags)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_GET_LINE_BREAKS, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Breaks text into words and returns array of character ranges. Use [graphemeFlags] to set what characters are used for breaking (see [enum GraphemeFlag]).
   */
  @JvmOverloads
  public fun shapedTextGetWordBreaks(shaped: RID, graphemeFlags: Long = 264): PackedInt32Array {
    TransferContext.writeArguments(_RID to shaped, OBJECT to graphemeFlags)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_GET_WORD_BREAKS, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Returns the position of the overrun trim.
   */
  public fun shapedTextGetTrimPos(shaped: RID): Long {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_GET_TRIM_POS,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns position of the ellipsis.
   */
  public fun shapedTextGetEllipsisPos(shaped: RID): Long {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_GET_ELLIPSIS_POS, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns array of the glyphs in the ellipsis.
   */
  public fun shapedTextGetEllipsisGlyphs(shaped: RID): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_GET_ELLIPSIS_GLYPHS, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Returns number of glyphs in the ellipsis.
   */
  public fun shapedTextGetEllipsisGlyphCount(shaped: RID): Long {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_GET_ELLIPSIS_GLYPH_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Trims text if it exceeds the given width.
   */
  @JvmOverloads
  public fun shapedTextOverrunTrimToWidth(
    shaped: RID,
    width: Double = 0.0,
    overrunTrimFlags: Long = 0,
  ): Unit {
    TransferContext.writeArguments(_RID to shaped, DOUBLE to width, OBJECT to overrunTrimFlags)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_OVERRUN_TRIM_TO_WIDTH, NIL)
  }

  /**
   * Returns array of inline objects.
   */
  public fun shapedTextGetObjects(shaped: RID): VariantArray<Any?> {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_GET_OBJECTS,
        ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  /**
   * Returns bounding rectangle of the inline object.
   */
  public fun shapedTextGetObjectRect(shaped: RID, key: Any?): Rect2 {
    TransferContext.writeArguments(_RID to shaped, ANY to key)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_GET_OBJECT_RECT, RECT2)
    return (TransferContext.readReturnValue(RECT2, false) as Rect2)
  }

  /**
   * Returns size of the text.
   */
  public fun shapedTextGetSize(shaped: RID): Vector2 {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_GET_SIZE,
        VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns the text ascent (number of pixels above the baseline for horizontal layout or to the left of baseline for vertical).
   *
   * **Note:** Overall ascent can be higher than font ascent, if some glyphs are displaced from the baseline.
   */
  public fun shapedTextGetAscent(shaped: RID): Double {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_GET_ASCENT,
        DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Returns the text descent (number of pixels below the baseline for horizontal layout or to the right of baseline for vertical).
   *
   * **Note:** Overall descent can be higher than font descent, if some glyphs are displaced from the baseline.
   */
  public fun shapedTextGetDescent(shaped: RID): Double {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_GET_DESCENT,
        DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Returns width (for horizontal layout) or height (for vertical) of the text.
   */
  public fun shapedTextGetWidth(shaped: RID): Double {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_GET_WIDTH,
        DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Returns pixel offset of the underline below the baseline.
   */
  public fun shapedTextGetUnderlinePosition(shaped: RID): Double {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_GET_UNDERLINE_POSITION, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Returns thickness of the underline.
   */
  public fun shapedTextGetUnderlineThickness(shaped: RID): Double {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_GET_UNDERLINE_THICKNESS, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double)
  }

  /**
   * Returns shapes of the carets corresponding to the character offset [position] in the text. Returned caret shape is 1 pixel wide rectangle.
   */
  public fun shapedTextGetCarets(shaped: RID, position: Long): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(_RID to shaped, LONG to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_GET_CARETS,
        DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns selection rectangles for the specified character range.
   */
  public fun shapedTextGetSelection(
    shaped: RID,
    start: Long,
    end: Long,
  ): PackedVector2Array {
    TransferContext.writeArguments(_RID to shaped, LONG to start, LONG to end)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_GET_SELECTION, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
  }

  /**
   * Returns grapheme index at the specified pixel offset at the baseline, or `-1` if none is found.
   */
  public fun shapedTextHitTestGrapheme(shaped: RID, coords: Double): Long {
    TransferContext.writeArguments(_RID to shaped, DOUBLE to coords)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_HIT_TEST_GRAPHEME, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns caret character offset at the specified pixel offset at the baseline. This function always returns a valid position.
   */
  public fun shapedTextHitTestPosition(shaped: RID, coords: Double): Long {
    TransferContext.writeArguments(_RID to shaped, DOUBLE to coords)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_HIT_TEST_POSITION, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns composite character's bounds as offsets from the start of the line.
   */
  public fun shapedTextGetGraphemeBounds(shaped: RID, pos: Long): Vector2 {
    TransferContext.writeArguments(_RID to shaped, LONG to pos)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_GET_GRAPHEME_BOUNDS, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Returns composite character end position closest to the [pos].
   */
  public fun shapedTextNextGraphemePos(shaped: RID, pos: Long): Long {
    TransferContext.writeArguments(_RID to shaped, LONG to pos)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_NEXT_GRAPHEME_POS, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns composite character start position closest to the [pos].
   */
  public fun shapedTextPrevGraphemePos(shaped: RID, pos: Long): Long {
    TransferContext.writeArguments(_RID to shaped, LONG to pos)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_PREV_GRAPHEME_POS, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Draw shaped text into a canvas item at a given position, with [color]. [pos] specifies the leftmost point of the baseline (for horizontal layout) or topmost point of the baseline (for vertical layout).
   */
  @JvmOverloads
  public fun shapedTextDraw(
    shaped: RID,
    canvas: RID,
    pos: Vector2,
    clipL: Double = -1.0,
    clipR: Double = -1.0,
    color: Color = Color(Color(1, 1, 1, 1)),
  ): Unit {
    TransferContext.writeArguments(_RID to shaped, _RID to canvas, VECTOR2 to pos, DOUBLE to clipL, DOUBLE to clipR, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_DRAW, NIL)
  }

  /**
   * Draw the outline of the shaped text into a canvas item at a given position, with [color]. [pos] specifies the leftmost point of the baseline (for horizontal layout) or topmost point of the baseline (for vertical layout).
   */
  @JvmOverloads
  public fun shapedTextDrawOutline(
    shaped: RID,
    canvas: RID,
    pos: Vector2,
    clipL: Double = -1.0,
    clipR: Double = -1.0,
    outlineSize: Long = 1,
    color: Color = Color(Color(1, 1, 1, 1)),
  ): Unit {
    TransferContext.writeArguments(_RID to shaped, _RID to canvas, VECTOR2 to pos, DOUBLE to clipL, DOUBLE to clipR, LONG to outlineSize, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_DRAW_OUTLINE,
        NIL)
  }

  /**
   * Returns dominant direction of in the range of text.
   */
  public fun shapedTextGetDominantDirectionInRange(
    shaped: RID,
    start: Long,
    end: Long,
  ): Direction {
    TransferContext.writeArguments(_RID to shaped, LONG to start, LONG to end)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SHAPED_TEXT_GET_DOMINANT_DIRECTION_IN_RANGE, LONG)
    return TextServer.Direction.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Converts a number from the Western Arabic (0..9) to the numeral systems used in [language].
   *
   * If [language] is omitted, the active locale will be used.
   */
  @JvmOverloads
  public fun formatNumber(number: String, language: String = ""): String {
    TransferContext.writeArguments(STRING to number, STRING to language)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_FORMAT_NUMBER, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Converts [number] from the numeral systems used in [language] to Western Arabic (0..9).
   */
  @JvmOverloads
  public fun parseNumber(number: String, language: String = ""): String {
    TransferContext.writeArguments(STRING to number, STRING to language)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_PARSE_NUMBER, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns percent sign used in the [language].
   */
  @JvmOverloads
  public fun percentSign(language: String = ""): String {
    TransferContext.writeArguments(STRING to language)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_PERCENT_SIGN, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns an array of the word break boundaries. Elements in the returned array are the offsets of the start and end of words. Therefore the length of the array is always even.
   *
   * When [charsPerLine] is greater than zero, line break boundaries are returned instead.
   *
   * ```
   * 				var ts = TextServerManager.get_primary_interface()
   * 				print(ts.string_get_word_breaks("Godot Engine")) # Prints [0, 5, 6, 12]
   * 				print(ts.string_get_word_breaks("Godot Engine", "en", 5)) # Prints [0, 5, 6, 11, 11, 12]
   * 				```
   */
  @JvmOverloads
  public fun stringGetWordBreaks(
    string: String,
    language: String = "",
    charsPerLine: Long = 0,
  ): PackedInt32Array {
    TransferContext.writeArguments(STRING to string, STRING to language, LONG to charsPerLine)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_STRING_GET_WORD_BREAKS,
        PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array)
  }

  /**
   * Returns index of the first string in [dict] which is visually confusable with the [string], or `-1` if none is found.
   *
   * **Note:** This method doesn't detect invisible characters, for spoof detection use it in combination with [spoofCheck].
   *
   * **Note:** Always returns `-1` if the server does not support the [FEATURE_UNICODE_SECURITY] feature.
   */
  public fun isConfusable(string: String, dict: PackedStringArray): Long {
    TransferContext.writeArguments(STRING to string, PACKED_STRING_ARRAY to dict)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_IS_CONFUSABLE, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns `true` if [string] is likely to be an attempt at confusing the reader.
   *
   * **Note:** Always returns `false` if the server does not support the [FEATURE_UNICODE_SECURITY] feature.
   */
  public fun spoofCheck(string: String): Boolean {
    TransferContext.writeArguments(STRING to string)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_SPOOF_CHECK, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Strips diacritics from the string.
   *
   * **Note:** The result may be longer or shorter than the original.
   */
  public fun stripDiacritics(string: String): String {
    TransferContext.writeArguments(STRING to string)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_STRIP_DIACRITICS, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns `true` if [string] is a valid identifier.
   *
   * If the text server supports the [FEATURE_UNICODE_IDENTIFIERS] feature, a valid identifier must:
   *
   * - Conform to normalization form C.
   *
   * - Begin with a Unicode character of class XID_Start or `"_"`.
   *
   * - May contain Unicode characters of class XID_Continue in the other positions.
   *
   * - Use UAX #31 recommended scripts only (mixed scripts are allowed).
   *
   * If the [FEATURE_UNICODE_IDENTIFIERS] feature is not supported, a valid identifier must:
   *
   * - Begin with a Unicode character of class XID_Start or `"_"`.
   *
   * - May contain Unicode characters of class XID_Continue in the other positions.
   */
  public fun isValidIdentifier(string: String): Boolean {
    TransferContext.writeArguments(STRING to string)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_IS_VALID_IDENTIFIER,
        BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the string converted to uppercase.
   *
   * **Note:** Casing is locale dependent and context sensitive if server support [FEATURE_CONTEXT_SENSITIVE_CASE_CONVERSION] feature (supported by [godot.TextServerAdvanced]).
   *
   * **Note:** The result may be longer or shorter than the original.
   */
  @JvmOverloads
  public fun stringToUpper(string: String, language: String = ""): String {
    TransferContext.writeArguments(STRING to string, STRING to language)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_STRING_TO_UPPER, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the string converted to lowercase.
   *
   * **Note:** Casing is locale dependent and context sensitive if server support [FEATURE_CONTEXT_SENSITIVE_CASE_CONVERSION] feature (supported by [godot.TextServerAdvanced]).
   *
   * **Note:** The result may be longer or shorter than the original.
   */
  @JvmOverloads
  public fun stringToLower(string: String, language: String = ""): String {
    TransferContext.writeArguments(STRING to string, STRING to language)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_STRING_TO_LOWER, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Default implementation of the BiDi algorithm override function. See [enum StructuredTextParser] for more info.
   */
  public fun parseStructuredText(
    parserType: StructuredTextParser,
    args: VariantArray<Any?>,
    text: String,
  ): VariantArray<Vector3i> {
    TransferContext.writeArguments(LONG to parserType.id, ARRAY to args, STRING to text)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTSERVER_PARSE_STRUCTURED_TEXT,
        ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Vector3i>)
  }

  public enum class FontAntialiasing(
    id: Long,
  ) {
    /**
     * Font glyphs are rasterized as 1-bit bitmaps.
     */
    FONT_ANTIALIASING_NONE(0),
    /**
     * Font glyphs are rasterized as 8-bit grayscale anti-aliased bitmaps.
     */
    FONT_ANTIALIASING_GRAY(1),
    /**
     * Font glyphs are rasterized for LCD screens.
     *
     * LCD subpixel layout is determined by the value of `gui/theme/lcd_subpixel_layout` project settings.
     *
     * LCD subpixel anti-aliasing mode is suitable only for rendering horizontal, unscaled text in 2D.
     */
    FONT_ANTIALIASING_LCD(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class FontLCDSubpixelLayout(
    id: Long,
  ) {
    /**
     * Unknown or unsupported subpixel layout, LCD subpixel antialiasing is disabled.
     */
    FONT_LCD_SUBPIXEL_LAYOUT_NONE(0),
    /**
     * Horizontal RGB subpixel layout.
     */
    FONT_LCD_SUBPIXEL_LAYOUT_HRGB(1),
    /**
     * Horizontal BGR subpixel layout.
     */
    FONT_LCD_SUBPIXEL_LAYOUT_HBGR(2),
    /**
     * Vertical RGB subpixel layout.
     */
    FONT_LCD_SUBPIXEL_LAYOUT_VRGB(3),
    /**
     * Vertical BGR subpixel layout.
     */
    FONT_LCD_SUBPIXEL_LAYOUT_VBGR(4),
    /**
     *
     */
    FONT_LCD_SUBPIXEL_LAYOUT_MAX(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class Direction(
    id: Long,
  ) {
    /**
     * Text direction is determined based on contents and current locale.
     */
    DIRECTION_AUTO(0),
    /**
     * Text is written from left to right.
     */
    DIRECTION_LTR(1),
    /**
     * Text is written from right to left.
     */
    DIRECTION_RTL(2),
    /**
     * Text writing direction is the same as base string writing direction. Used for BiDi override only.
     */
    DIRECTION_INHERITED(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class Orientation(
    id: Long,
  ) {
    /**
     * Text is written horizontally.
     */
    ORIENTATION_HORIZONTAL(0),
    /**
     * Left to right text is written vertically from top to bottom.
     *
     * Right to left text is written vertically from bottom to top.
     */
    ORIENTATION_VERTICAL(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class JustificationFlag(
    id: Long,
  ) {
    /**
     * Do not justify text.
     */
    JUSTIFICATION_NONE(0),
    /**
     * Justify text by adding and removing kashidas.
     */
    JUSTIFICATION_KASHIDA(1),
    /**
     * Justify text by changing width of the spaces between the words.
     */
    JUSTIFICATION_WORD_BOUND(2),
    /**
     * Remove trailing and leading spaces from the justified text.
     */
    JUSTIFICATION_TRIM_EDGE_SPACES(4),
    /**
     * Only apply justification to the part of the text after the last tab.
     */
    JUSTIFICATION_AFTER_LAST_TAB(8),
    /**
     * Apply justification to the trimmed line with ellipsis.
     */
    JUSTIFICATION_CONSTRAIN_ELLIPSIS(16),
    /**
     * Do not apply justification to the last line of the paragraph.
     */
    JUSTIFICATION_SKIP_LAST_LINE(32),
    /**
     * Do not apply justification to the last line of the paragraph with visible characters (takes precedence over [JUSTIFICATION_SKIP_LAST_LINE]).
     */
    JUSTIFICATION_SKIP_LAST_LINE_WITH_VISIBLE_CHARS(64),
    /**
     * Always apply justification to the paragraphs with a single line ([JUSTIFICATION_SKIP_LAST_LINE] and [JUSTIFICATION_SKIP_LAST_LINE_WITH_VISIBLE_CHARS] are ignored).
     */
    JUSTIFICATION_DO_NOT_SKIP_SINGLE_LINE(128),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class AutowrapMode(
    id: Long,
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class LineBreakFlag(
    id: Long,
  ) {
    /**
     * Do not break the line.
     */
    BREAK_NONE(0),
    /**
     * Break the line at the line mandatory break characters (e.g. `"\n"`).
     */
    BREAK_MANDATORY(1),
    /**
     * Break the line between the words.
     */
    BREAK_WORD_BOUND(2),
    /**
     * Break the line between any unconnected graphemes.
     */
    BREAK_GRAPHEME_BOUND(4),
    /**
     * Should be used only in conjunction with [BREAK_WORD_BOUND], break the line between any unconnected graphemes, if it's impossible to break it between the words.
     */
    BREAK_ADAPTIVE(8),
    /**
     * Remove edge spaces from the broken line segments.
     */
    BREAK_TRIM_EDGE_SPACES(16),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class VisibleCharactersBehavior(
    id: Long,
  ) {
    /**
     * Trims text before the shaping. e.g, increasing [godot.Label.visibleCharacters] or [godot.RichTextLabel.visibleCharacters] value is visually identical to typing the text.
     */
    VC_CHARS_BEFORE_SHAPING(0),
    /**
     * Displays glyphs that are mapped to the first [godot.Label.visibleCharacters] or [godot.RichTextLabel.visibleCharacters] characters from the beginning of the text.
     */
    VC_CHARS_AFTER_SHAPING(1),
    /**
     * Displays [godot.Label.visibleRatio] or [godot.RichTextLabel.visibleRatio] glyphs, starting from the left or from the right, depending on [godot.Control.layoutDirection] value.
     */
    VC_GLYPHS_AUTO(2),
    /**
     * Displays [godot.Label.visibleRatio] or [godot.RichTextLabel.visibleRatio] glyphs, starting from the left.
     */
    VC_GLYPHS_LTR(3),
    /**
     * Displays [godot.Label.visibleRatio] or [godot.RichTextLabel.visibleRatio] glyphs, starting from the right.
     */
    VC_GLYPHS_RTL(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class OverrunBehavior(
    id: Long,
  ) {
    /**
     * No text trimming is performed.
     */
    OVERRUN_NO_TRIMMING(0),
    /**
     * Trims the text per character.
     */
    OVERRUN_TRIM_CHAR(1),
    /**
     * Trims the text per word.
     */
    OVERRUN_TRIM_WORD(2),
    /**
     * Trims the text per character and adds an ellipsis to indicate that parts are hidden.
     */
    OVERRUN_TRIM_ELLIPSIS(3),
    /**
     * Trims the text per word and adds an ellipsis to indicate that parts are hidden.
     */
    OVERRUN_TRIM_WORD_ELLIPSIS(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class TextOverrunFlag(
    id: Long,
  ) {
    /**
     * No trimming is performed.
     */
    OVERRUN_NO_TRIM(0),
    /**
     * Trims the text when it exceeds the given width.
     */
    OVERRUN_TRIM(1),
    /**
     * Trims the text per word instead of per grapheme.
     */
    OVERRUN_TRIM_WORD_ONLY(2),
    /**
     * Determines whether an ellipsis should be added at the end of the text.
     */
    OVERRUN_ADD_ELLIPSIS(4),
    /**
     * Determines whether the ellipsis at the end of the text is enforced and may not be hidden.
     */
    OVERRUN_ENFORCE_ELLIPSIS(8),
    /**
     *
     */
    OVERRUN_JUSTIFICATION_AWARE(16),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class GraphemeFlag(
    id: Long,
  ) {
    /**
     * Grapheme is supported by the font, and can be drawn.
     */
    GRAPHEME_IS_VALID(1),
    /**
     * Grapheme is part of right-to-left or bottom-to-top run.
     */
    GRAPHEME_IS_RTL(2),
    /**
     * Grapheme is not part of source text, it was added by justification process.
     */
    GRAPHEME_IS_VIRTUAL(4),
    /**
     * Grapheme is whitespace.
     */
    GRAPHEME_IS_SPACE(8),
    /**
     * Grapheme is mandatory break point (e.g. `"\n"`).
     */
    GRAPHEME_IS_BREAK_HARD(16),
    /**
     * Grapheme is optional break point (e.g. space).
     */
    GRAPHEME_IS_BREAK_SOFT(32),
    /**
     * Grapheme is the tabulation character.
     */
    GRAPHEME_IS_TAB(64),
    /**
     * Grapheme is kashida.
     */
    GRAPHEME_IS_ELONGATION(128),
    /**
     * Grapheme is punctuation character.
     */
    GRAPHEME_IS_PUNCTUATION(256),
    /**
     * Grapheme is underscore character.
     */
    GRAPHEME_IS_UNDERSCORE(512),
    /**
     * Grapheme is connected to the previous grapheme. Breaking line before this grapheme is not safe.
     */
    GRAPHEME_IS_CONNECTED(1024),
    /**
     * It is safe to insert a U+0640 before this grapheme for elongation.
     */
    GRAPHEME_IS_SAFE_TO_INSERT_TATWEEL(2048),
    /**
     * Grapheme is an object replacement character for the embedded object.
     */
    GRAPHEME_IS_EMBEDDED_OBJECT(4096),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class Hinting(
    id: Long,
  ) {
    /**
     * Disables font hinting (smoother but less crisp).
     */
    HINTING_NONE(0),
    /**
     * Use the light font hinting mode.
     */
    HINTING_LIGHT(1),
    /**
     * Use the default font hinting mode (crisper but less smooth).
     *
     * **Note:** This hinting mode changes both horizontal and vertical glyph metrics. If applied to monospace font, some glyphs might have different width.
     */
    HINTING_NORMAL(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class SubpixelPositioning(
    id: Long,
  ) {
    /**
     * Glyph horizontal position is rounded to the whole pixel size, each glyph is rasterized once.
     */
    SUBPIXEL_POSITIONING_DISABLED(0),
    /**
     * Glyph horizontal position is rounded based on font size.
     *
     * - To one quarter of the pixel size if font size is smaller or equal to [SUBPIXEL_POSITIONING_ONE_QUARTER_MAX_SIZE].
     *
     * - To one half of the pixel size if font size is smaller or equal to [SUBPIXEL_POSITIONING_ONE_HALF_MAX_SIZE].
     *
     * - To the whole pixel size for larger fonts.
     */
    SUBPIXEL_POSITIONING_AUTO(1),
    /**
     * Glyph horizontal position is rounded to one half of the pixel size, each glyph is rasterized up to two times.
     */
    SUBPIXEL_POSITIONING_ONE_HALF(2),
    /**
     * Glyph horizontal position is rounded to one quarter of the pixel size, each glyph is rasterized up to four times.
     */
    SUBPIXEL_POSITIONING_ONE_QUARTER(3),
    /**
     * Maximum font size which will use one half of the pixel subpixel positioning in [SUBPIXEL_POSITIONING_AUTO] mode.
     */
    SUBPIXEL_POSITIONING_ONE_HALF_MAX_SIZE(20),
    /**
     * Maximum font size which will use one quarter of the pixel subpixel positioning in [SUBPIXEL_POSITIONING_AUTO] mode.
     */
    SUBPIXEL_POSITIONING_ONE_QUARTER_MAX_SIZE(16),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class Feature(
    id: Long,
  ) {
    /**
     * TextServer supports simple text layouts.
     */
    FEATURE_SIMPLE_LAYOUT(1),
    /**
     * TextServer supports bidirectional text layouts.
     */
    FEATURE_BIDI_LAYOUT(2),
    /**
     * TextServer supports vertical layouts.
     */
    FEATURE_VERTICAL_LAYOUT(4),
    /**
     * TextServer supports complex text shaping.
     */
    FEATURE_SHAPING(8),
    /**
     * TextServer supports justification using kashidas.
     */
    FEATURE_KASHIDA_JUSTIFICATION(16),
    /**
     * TextServer supports complex line/word breaking rules (e.g. dictionary based).
     */
    FEATURE_BREAK_ITERATORS(32),
    /**
     * TextServer supports loading bitmap fonts.
     */
    FEATURE_FONT_BITMAP(64),
    /**
     * TextServer supports loading dynamic (TrueType, OpeType, etc.) fonts.
     */
    FEATURE_FONT_DYNAMIC(128),
    /**
     * TextServer supports multichannel signed distance field dynamic font rendering.
     */
    FEATURE_FONT_MSDF(256),
    /**
     * TextServer supports loading system fonts.
     */
    FEATURE_FONT_SYSTEM(512),
    /**
     * TextServer supports variable fonts.
     */
    FEATURE_FONT_VARIABLE(1024),
    /**
     * TextServer supports locale dependent and context sensitive case conversion.
     */
    FEATURE_CONTEXT_SENSITIVE_CASE_CONVERSION(2048),
    /**
     * TextServer require external data file for some features, see [loadSupportData].
     */
    FEATURE_USE_SUPPORT_DATA(4096),
    /**
     * TextServer supports UAX #31 identifier validation, see [isValidIdentifier].
     */
    FEATURE_UNICODE_IDENTIFIERS(8192),
    /**
     * TextServer supports [godot.Unicode Technical Report #36](https://unicode.org/reports/tr36/) and [godot.Unicode Technical Standard #39](https://unicode.org/reports/tr39/) based spoof detection features.
     */
    FEATURE_UNICODE_SECURITY(16384),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class ContourPointTag(
    id: Long,
  ) {
    /**
     * Contour point is on the curve.
     */
    CONTOUR_CURVE_TAG_ON(1),
    /**
     * Contour point isn't on the curve, but serves as a control point for a conic (quadratic) Bézier arc.
     */
    CONTOUR_CURVE_TAG_OFF_CONIC(0),
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class SpacingType(
    id: Long,
  ) {
    /**
     * Spacing for each glyph.
     */
    SPACING_GLYPH(0),
    /**
     * Spacing for the space character.
     */
    SPACING_SPACE(1),
    /**
     * Spacing at the top of the line.
     */
    SPACING_TOP(2),
    /**
     * Spacing at the bottom of the line.
     */
    SPACING_BOTTOM(3),
    /**
     *
     */
    SPACING_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class FontStyle(
    id: Long,
  ) {
    /**
     * Font is bold.
     */
    FONT_BOLD(1),
    /**
     * Font is italic or oblique.
     */
    FONT_ITALIC(2),
    /**
     * Font have fixed-width characters.
     */
    FONT_FIXED_WIDTH(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class StructuredTextParser(
    id: Long,
  ) {
    /**
     * Use default Unicode BiDi algorithm.
     */
    STRUCTURED_TEXT_DEFAULT(0),
    /**
     * BiDi override for URI.
     */
    STRUCTURED_TEXT_URI(1),
    /**
     * BiDi override for file path.
     */
    STRUCTURED_TEXT_FILE(2),
    /**
     * BiDi override for email.
     */
    STRUCTURED_TEXT_EMAIL(3),
    /**
     * BiDi override for lists.
     *
     * Structured text options: list separator `String`.
     */
    STRUCTURED_TEXT_LIST(4),
    /**
     * BiDi override for GDScript.
     */
    STRUCTURED_TEXT_GDSCRIPT(5),
    /**
     * User defined structured text BiDi override function.
     */
    STRUCTURED_TEXT_CUSTOM(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object
}
