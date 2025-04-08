// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Dictionary
import godot.core.InlineAlignment
import godot.core.PackedByteArray
import godot.core.PackedFloat32Array
import godot.core.PackedInt32Array
import godot.core.PackedStringArray
import godot.core.PackedVector2Array
import godot.core.RID
import godot.core.Rect2
import godot.core.Transform2D
import godot.core.VariantArray
import godot.core.Vector2
import godot.core.Vector2i
import godot.core.Vector3i
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * External [TextServer] implementations should inherit from this class.
 */
@GodotBaseType
public open class TextServerExtension : TextServer() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(662, scriptIndex)
  }

  /**
   * **Required.**
   *
   * Returns `true` if the server supports a feature.
   */
  public open fun _hasFeature(feature: TextServer.Feature): Boolean {
    throw NotImplementedError("_hasFeature is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns the name of the server interface.
   */
  public open fun _getName(): String {
    throw NotImplementedError("_getName is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns text server features, see [TextServer.Feature].
   */
  public open fun _getFeatures(): Long {
    throw NotImplementedError("_getFeatures is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Frees an object created by this [TextServer].
   */
  public open fun _freeRid(rid: RID): Unit {
    throw NotImplementedError("_freeRid is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns `true` if [rid] is valid resource owned by this text server.
   */
  public open fun _has(rid: RID): Boolean {
    throw NotImplementedError("_has is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Loads optional TextServer database (e.g. ICU break iterators and dictionaries).
   */
  public open fun _loadSupportData(filename: String): Boolean {
    throw NotImplementedError("_loadSupportData is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns default TextServer database (e.g. ICU break iterators and dictionaries) filename.
   */
  public open fun _getSupportDataFilename(): String {
    throw NotImplementedError("_getSupportDataFilename is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns TextServer database (e.g. ICU break iterators and dictionaries) description.
   */
  public open fun _getSupportDataInfo(): String {
    throw NotImplementedError("_getSupportDataInfo is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Saves optional TextServer database (e.g. ICU break iterators and dictionaries) to the file.
   */
  public open fun _saveSupportData(filename: String): Boolean {
    throw NotImplementedError("_saveSupportData is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns default TextServer database (e.g. ICU break iterators and dictionaries).
   */
  public open fun _getSupportData(): PackedByteArray {
    throw NotImplementedError("_getSupportData is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns `true` if locale is right-to-left.
   */
  public open fun _isLocaleRightToLeft(locale: String): Boolean {
    throw NotImplementedError("_isLocaleRightToLeft is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Converts readable feature, variation, script, or language name to OpenType tag.
   */
  public open fun _nameToTag(name: String): Long {
    throw NotImplementedError("_nameToTag is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Converts OpenType tag to readable feature, variation, script, or language name.
   */
  public open fun _tagToName(tag: Long): String {
    throw NotImplementedError("_tagToName is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Creates a new, empty font cache entry resource.
   */
  public open fun _createFont(): RID {
    throw NotImplementedError("_createFont is not implemented for TextServerExtension")
  }

  /**
   * Optional, implement if font supports extra spacing or baseline offset.
   *
   * Creates a new variation existing font which is reusing the same glyph cache and font data.
   */
  public open fun _createFontLinkedVariation(fontRid: RID): RID {
    throw NotImplementedError("_createFontLinkedVariation is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Sets font source data, e.g contents of the dynamic font source file.
   */
  public open fun _fontSetData(fontRid: RID, `data`: PackedByteArray): Unit {
    throw NotImplementedError("_fontSetData is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Sets an active face index in the TrueType / OpenType collection.
   */
  public open fun _fontSetFaceIndex(fontRid: RID, faceIndex: Long): Unit {
    throw NotImplementedError("_fontSetFaceIndex is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns an active face index in the TrueType / OpenType collection.
   */
  public open fun _fontGetFaceIndex(fontRid: RID): Long {
    throw NotImplementedError("_fontGetFaceIndex is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns number of faces in the TrueType / OpenType collection.
   */
  public open fun _fontGetFaceCount(fontRid: RID): Long {
    throw NotImplementedError("_fontGetFaceCount is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Sets the font style flags, see [TextServer.FontStyle].
   */
  public open fun _fontSetStyle(fontRid: RID, style: TextServer.FontStyle): Unit {
    throw NotImplementedError("_fontSetStyle is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns font style flags, see [TextServer.FontStyle].
   */
  public open fun _fontGetStyle(fontRid: RID): TextServer.FontStyle {
    throw NotImplementedError("_fontGetStyle is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Sets the font family name.
   */
  public open fun _fontSetName(fontRid: RID, name: String): Unit {
    throw NotImplementedError("_fontSetName is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns font family name.
   */
  public open fun _fontGetName(fontRid: RID): String {
    throw NotImplementedError("_fontGetName is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns [Dictionary] with OpenType font name strings (localized font names, version,
   * description, license information, sample text, etc.).
   */
  public open fun _fontGetOtNameStrings(fontRid: RID): Dictionary<Any?, Any?> {
    throw NotImplementedError("_fontGetOtNameStrings is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Sets the font style name.
   */
  public open fun _fontSetStyleName(fontRid: RID, nameStyle: String): Unit {
    throw NotImplementedError("_fontSetStyleName is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns font style name.
   */
  public open fun _fontGetStyleName(fontRid: RID): String {
    throw NotImplementedError("_fontGetStyleName is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Sets weight (boldness) of the font. A value in the `100...999` range, normal font weight is
   * `400`, bold font weight is `700`.
   */
  public open fun _fontSetWeight(fontRid: RID, weight: Long): Unit {
    throw NotImplementedError("_fontSetWeight is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns weight (boldness) of the font. A value in the `100...999` range, normal font weight is
   * `400`, bold font weight is `700`.
   */
  public open fun _fontGetWeight(fontRid: RID): Long {
    throw NotImplementedError("_fontGetWeight is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Sets font stretch amount, compared to a normal width. A percentage value between `50&#37;` and
   * `200&#37;`.
   */
  public open fun _fontSetStretch(fontRid: RID, stretch: Long): Unit {
    throw NotImplementedError("_fontSetStretch is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns font stretch amount, compared to a normal width. A percentage value between `50&#37;`
   * and `200&#37;`.
   */
  public open fun _fontGetStretch(fontRid: RID): Long {
    throw NotImplementedError("_fontGetStretch is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Sets font anti-aliasing mode.
   */
  public open fun _fontSetAntialiasing(fontRid: RID, antialiasing: TextServer.FontAntialiasing):
      Unit {
    throw NotImplementedError("_fontSetAntialiasing is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns font anti-aliasing mode.
   */
  public open fun _fontGetAntialiasing(fontRid: RID): TextServer.FontAntialiasing {
    throw NotImplementedError("_fontGetAntialiasing is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * If set to `true`, embedded font bitmap loading is disabled.
   */
  public open fun _fontSetDisableEmbeddedBitmaps(fontRid: RID, disableEmbeddedBitmaps: Boolean):
      Unit {
    throw NotImplementedError("_fontSetDisableEmbeddedBitmaps is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns whether the font's embedded bitmap loading is disabled.
   */
  public open fun _fontGetDisableEmbeddedBitmaps(fontRid: RID): Boolean {
    throw NotImplementedError("_fontGetDisableEmbeddedBitmaps is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * If set to `true` font texture mipmap generation is enabled.
   */
  public open fun _fontSetGenerateMipmaps(fontRid: RID, generateMipmaps: Boolean): Unit {
    throw NotImplementedError("_fontSetGenerateMipmaps is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns `true` if font texture mipmap generation is enabled.
   */
  public open fun _fontGetGenerateMipmaps(fontRid: RID): Boolean {
    throw NotImplementedError("_fontGetGenerateMipmaps is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * If set to `true`, glyphs of all sizes are rendered using single multichannel signed distance
   * field generated from the dynamic font vector data. MSDF rendering allows displaying the font at
   * any scaling factor without blurriness, and without incurring a CPU cost when the font size changes
   * (since the font no longer needs to be rasterized on the CPU). As a downside, font hinting is not
   * available with MSDF. The lack of font hinting may result in less crisp and less readable fonts at
   * small sizes.
   */
  public open fun _fontSetMultichannelSignedDistanceField(fontRid: RID, msdf: Boolean): Unit {
    throw NotImplementedError("_fontSetMultichannelSignedDistanceField is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns `true` if glyphs of all sizes are rendered using single multichannel signed distance
   * field generated from the dynamic font vector data.
   */
  public open fun _fontIsMultichannelSignedDistanceField(fontRid: RID): Boolean {
    throw NotImplementedError("_fontIsMultichannelSignedDistanceField is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Sets the width of the range around the shape between the minimum and maximum representable
   * signed distance.
   */
  public open fun _fontSetMsdfPixelRange(fontRid: RID, msdfPixelRange: Long): Unit {
    throw NotImplementedError("_fontSetMsdfPixelRange is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns the width of the range around the shape between the minimum and maximum representable
   * signed distance.
   */
  public open fun _fontGetMsdfPixelRange(fontRid: RID): Long {
    throw NotImplementedError("_fontGetMsdfPixelRange is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Sets source font size used to generate MSDF textures.
   */
  public open fun _fontSetMsdfSize(fontRid: RID, msdfSize: Long): Unit {
    throw NotImplementedError("_fontSetMsdfSize is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns source font size used to generate MSDF textures.
   */
  public open fun _fontGetMsdfSize(fontRid: RID): Long {
    throw NotImplementedError("_fontGetMsdfSize is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Sets bitmap font fixed size. If set to value greater than zero, same cache entry will be used
   * for all font sizes.
   */
  public open fun _fontSetFixedSize(fontRid: RID, fixedSize: Long): Unit {
    throw NotImplementedError("_fontSetFixedSize is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns bitmap font fixed size.
   */
  public open fun _fontGetFixedSize(fontRid: RID): Long {
    throw NotImplementedError("_fontGetFixedSize is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Sets bitmap font scaling mode. This property is used only if `fixed_size` is greater than zero.
   */
  public open fun _fontSetFixedSizeScaleMode(fontRid: RID,
      fixedSizeScaleMode: TextServer.FixedSizeScaleMode): Unit {
    throw NotImplementedError("_fontSetFixedSizeScaleMode is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns bitmap font scaling mode.
   */
  public open fun _fontGetFixedSizeScaleMode(fontRid: RID): TextServer.FixedSizeScaleMode {
    throw NotImplementedError("_fontGetFixedSizeScaleMode is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * If set to `true`, system fonts can be automatically used as fallbacks.
   */
  public open fun _fontSetAllowSystemFallback(fontRid: RID, allowSystemFallback: Boolean): Unit {
    throw NotImplementedError("_fontSetAllowSystemFallback is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns `true` if system fonts can be automatically used as fallbacks.
   */
  public open fun _fontIsAllowSystemFallback(fontRid: RID): Boolean {
    throw NotImplementedError("_fontIsAllowSystemFallback is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * If set to `true` auto-hinting is preferred over font built-in hinting.
   */
  public open fun _fontSetForceAutohinter(fontRid: RID, forceAutohinter: Boolean): Unit {
    throw NotImplementedError("_fontSetForceAutohinter is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns `true` if auto-hinting is supported and preferred over font built-in hinting.
   */
  public open fun _fontIsForceAutohinter(fontRid: RID): Boolean {
    throw NotImplementedError("_fontIsForceAutohinter is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Sets font hinting mode. Used by dynamic fonts only.
   */
  public open fun _fontSetHinting(fontRid: RID, hinting: TextServer.Hinting): Unit {
    throw NotImplementedError("_fontSetHinting is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns the font hinting mode. Used by dynamic fonts only.
   */
  public open fun _fontGetHinting(fontRid: RID): TextServer.Hinting {
    throw NotImplementedError("_fontGetHinting is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Sets font subpixel glyph positioning mode.
   */
  public open fun _fontSetSubpixelPositioning(fontRid: RID,
      subpixelPositioning: TextServer.SubpixelPositioning): Unit {
    throw NotImplementedError("_fontSetSubpixelPositioning is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns font subpixel glyph positioning mode.
   */
  public open fun _fontGetSubpixelPositioning(fontRid: RID): TextServer.SubpixelPositioning {
    throw NotImplementedError("_fontGetSubpixelPositioning is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Sets glyph position rounding behavior. If set to `true`, when aligning glyphs to the pixel
   * boundaries rounding remainders are accumulated to ensure more uniform glyph distribution. This
   * setting has no effect if subpixel positioning is enabled.
   */
  public open fun _fontSetKeepRoundingRemainders(fontRid: RID, keepRoundingRemainders: Boolean):
      Unit {
    throw NotImplementedError("_fontSetKeepRoundingRemainders is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns glyph position rounding behavior. If set to `true`, when aligning glyphs to the pixel
   * boundaries rounding remainders are accumulated to ensure more uniform glyph distribution. This
   * setting has no effect if subpixel positioning is enabled.
   */
  public open fun _fontGetKeepRoundingRemainders(fontRid: RID): Boolean {
    throw NotImplementedError("_fontGetKeepRoundingRemainders is not implemented for TextServerExtension")
  }

  /**
   * Sets font embolden strength. If [strength] is not equal to zero, emboldens the font outlines.
   * Negative values reduce the outline thickness.
   */
  public open fun _fontSetEmbolden(fontRid: RID, strength: Double): Unit {
    throw NotImplementedError("_fontSetEmbolden is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns font embolden strength.
   */
  public open fun _fontGetEmbolden(fontRid: RID): Double {
    throw NotImplementedError("_fontGetEmbolden is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Sets the spacing for [spacing] (see [TextServer.SpacingType]) to [value] in pixels (not
   * relative to the font size).
   */
  public open fun _fontSetSpacing(
    fontRid: RID,
    spacing: TextServer.SpacingType,
    `value`: Long,
  ): Unit {
    throw NotImplementedError("_fontSetSpacing is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns the spacing for [spacing] (see [TextServer.SpacingType]) in pixels (not relative to the
   * font size).
   */
  public open fun _fontGetSpacing(fontRid: RID, spacing: TextServer.SpacingType): Long {
    throw NotImplementedError("_fontGetSpacing is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Sets extra baseline offset (as a fraction of font height).
   */
  public open fun _fontSetBaselineOffset(fontRid: RID, baselineOffset: Double): Unit {
    throw NotImplementedError("_fontSetBaselineOffset is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns extra baseline offset (as a fraction of font height).
   */
  public open fun _fontGetBaselineOffset(fontRid: RID): Double {
    throw NotImplementedError("_fontGetBaselineOffset is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Sets 2D transform, applied to the font outlines, can be used for slanting, flipping, and
   * rotating glyphs.
   */
  public open fun _fontSetTransform(fontRid: RID, transform: Transform2D): Unit {
    throw NotImplementedError("_fontSetTransform is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns 2D transform applied to the font outlines.
   */
  public open fun _fontGetTransform(fontRid: RID): Transform2D {
    throw NotImplementedError("_fontGetTransform is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Sets variation coordinates for the specified font cache entry.
   */
  public open fun _fontSetVariationCoordinates(fontRid: RID,
      variationCoordinates: Dictionary<Any?, Any?>): Unit {
    throw NotImplementedError("_fontSetVariationCoordinates is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns variation coordinates for the specified font cache entry.
   */
  public open fun _fontGetVariationCoordinates(fontRid: RID): Dictionary<Any?, Any?> {
    throw NotImplementedError("_fontGetVariationCoordinates is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Sets font oversampling factor, if set to `0.0` global oversampling factor is used instead. Used
   * by dynamic fonts only.
   */
  public open fun _fontSetOversampling(fontRid: RID, oversampling: Double): Unit {
    throw NotImplementedError("_fontSetOversampling is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns font oversampling factor, if set to `0.0` global oversampling factor is used instead.
   * Used by dynamic fonts only.
   */
  public open fun _fontGetOversampling(fontRid: RID): Double {
    throw NotImplementedError("_fontGetOversampling is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns list of the font sizes in the cache. Each size is [Vector2i] with font size and outline
   * size.
   */
  public open fun _fontGetSizeCacheList(fontRid: RID): VariantArray<Vector2i> {
    throw NotImplementedError("_fontGetSizeCacheList is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Removes all font sizes from the cache entry.
   */
  public open fun _fontClearSizeCache(fontRid: RID): Unit {
    throw NotImplementedError("_fontClearSizeCache is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Removes specified font size from the cache entry.
   */
  public open fun _fontRemoveSizeCache(fontRid: RID, size: Vector2i): Unit {
    throw NotImplementedError("_fontRemoveSizeCache is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Sets the font ascent (number of pixels above the baseline).
   */
  public open fun _fontSetAscent(
    fontRid: RID,
    size: Long,
    ascent: Double,
  ): Unit {
    throw NotImplementedError("_fontSetAscent is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns the font ascent (number of pixels above the baseline).
   */
  public open fun _fontGetAscent(fontRid: RID, size: Long): Double {
    throw NotImplementedError("_fontGetAscent is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Sets the font descent (number of pixels below the baseline).
   */
  public open fun _fontSetDescent(
    fontRid: RID,
    size: Long,
    descent: Double,
  ): Unit {
    throw NotImplementedError("_fontSetDescent is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns the font descent (number of pixels below the baseline).
   */
  public open fun _fontGetDescent(fontRid: RID, size: Long): Double {
    throw NotImplementedError("_fontGetDescent is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Sets pixel offset of the underline below the baseline.
   */
  public open fun _fontSetUnderlinePosition(
    fontRid: RID,
    size: Long,
    underlinePosition: Double,
  ): Unit {
    throw NotImplementedError("_fontSetUnderlinePosition is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns pixel offset of the underline below the baseline.
   */
  public open fun _fontGetUnderlinePosition(fontRid: RID, size: Long): Double {
    throw NotImplementedError("_fontGetUnderlinePosition is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Sets thickness of the underline in pixels.
   */
  public open fun _fontSetUnderlineThickness(
    fontRid: RID,
    size: Long,
    underlineThickness: Double,
  ): Unit {
    throw NotImplementedError("_fontSetUnderlineThickness is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns thickness of the underline in pixels.
   */
  public open fun _fontGetUnderlineThickness(fontRid: RID, size: Long): Double {
    throw NotImplementedError("_fontGetUnderlineThickness is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Sets scaling factor of the color bitmap font.
   */
  public open fun _fontSetScale(
    fontRid: RID,
    size: Long,
    scale: Double,
  ): Unit {
    throw NotImplementedError("_fontSetScale is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns scaling factor of the color bitmap font.
   */
  public open fun _fontGetScale(fontRid: RID, size: Long): Double {
    throw NotImplementedError("_fontGetScale is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns number of textures used by font cache entry.
   */
  public open fun _fontGetTextureCount(fontRid: RID, size: Vector2i): Long {
    throw NotImplementedError("_fontGetTextureCount is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Removes all textures from font cache entry.
   */
  public open fun _fontClearTextures(fontRid: RID, size: Vector2i): Unit {
    throw NotImplementedError("_fontClearTextures is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Removes specified texture from the cache entry.
   */
  public open fun _fontRemoveTexture(
    fontRid: RID,
    size: Vector2i,
    textureIndex: Long,
  ): Unit {
    throw NotImplementedError("_fontRemoveTexture is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Sets font cache texture image data.
   */
  public open fun _fontSetTextureImage(
    fontRid: RID,
    size: Vector2i,
    textureIndex: Long,
    image: Image?,
  ): Unit {
    throw NotImplementedError("_fontSetTextureImage is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns font cache texture image data.
   */
  public open fun _fontGetTextureImage(
    fontRid: RID,
    size: Vector2i,
    textureIndex: Long,
  ): Image? {
    throw NotImplementedError("_fontGetTextureImage is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Sets array containing glyph packing data.
   */
  public open fun _fontSetTextureOffsets(
    fontRid: RID,
    size: Vector2i,
    textureIndex: Long,
    offset: PackedInt32Array,
  ): Unit {
    throw NotImplementedError("_fontSetTextureOffsets is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns array containing glyph packing data.
   */
  public open fun _fontGetTextureOffsets(
    fontRid: RID,
    size: Vector2i,
    textureIndex: Long,
  ): PackedInt32Array {
    throw NotImplementedError("_fontGetTextureOffsets is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns list of rendered glyphs in the cache entry.
   */
  public open fun _fontGetGlyphList(fontRid: RID, size: Vector2i): PackedInt32Array {
    throw NotImplementedError("_fontGetGlyphList is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Removes all rendered glyph information from the cache entry.
   */
  public open fun _fontClearGlyphs(fontRid: RID, size: Vector2i): Unit {
    throw NotImplementedError("_fontClearGlyphs is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Removes specified rendered glyph information from the cache entry.
   */
  public open fun _fontRemoveGlyph(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
  ): Unit {
    throw NotImplementedError("_fontRemoveGlyph is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns glyph advance (offset of the next glyph).
   */
  public open fun _fontGetGlyphAdvance(
    fontRid: RID,
    size: Long,
    glyph: Long,
  ): Vector2 {
    throw NotImplementedError("_fontGetGlyphAdvance is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Sets glyph advance (offset of the next glyph).
   */
  public open fun _fontSetGlyphAdvance(
    fontRid: RID,
    size: Long,
    glyph: Long,
    advance: Vector2,
  ): Unit {
    throw NotImplementedError("_fontSetGlyphAdvance is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns glyph offset from the baseline.
   */
  public open fun _fontGetGlyphOffset(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
  ): Vector2 {
    throw NotImplementedError("_fontGetGlyphOffset is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Sets glyph offset from the baseline.
   */
  public open fun _fontSetGlyphOffset(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
    offset: Vector2,
  ): Unit {
    throw NotImplementedError("_fontSetGlyphOffset is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns size of the glyph.
   */
  public open fun _fontGetGlyphSize(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
  ): Vector2 {
    throw NotImplementedError("_fontGetGlyphSize is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Sets size of the glyph.
   */
  public open fun _fontSetGlyphSize(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
    glSize: Vector2,
  ): Unit {
    throw NotImplementedError("_fontSetGlyphSize is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns rectangle in the cache texture containing the glyph.
   */
  public open fun _fontGetGlyphUvRect(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
  ): Rect2 {
    throw NotImplementedError("_fontGetGlyphUvRect is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Sets rectangle in the cache texture containing the glyph.
   */
  public open fun _fontSetGlyphUvRect(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
    uvRect: Rect2,
  ): Unit {
    throw NotImplementedError("_fontSetGlyphUvRect is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns index of the cache texture containing the glyph.
   */
  public open fun _fontGetGlyphTextureIdx(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
  ): Long {
    throw NotImplementedError("_fontGetGlyphTextureIdx is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Sets index of the cache texture containing the glyph.
   */
  public open fun _fontSetGlyphTextureIdx(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
    textureIdx: Long,
  ): Unit {
    throw NotImplementedError("_fontSetGlyphTextureIdx is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns resource ID of the cache texture containing the glyph.
   */
  public open fun _fontGetGlyphTextureRid(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
  ): RID {
    throw NotImplementedError("_fontGetGlyphTextureRid is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns size of the cache texture containing the glyph.
   */
  public open fun _fontGetGlyphTextureSize(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
  ): Vector2 {
    throw NotImplementedError("_fontGetGlyphTextureSize is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns outline contours of the glyph.
   */
  public open fun _fontGetGlyphContours(
    fontRid: RID,
    size: Long,
    index: Long,
  ): Dictionary<Any?, Any?> {
    throw NotImplementedError("_fontGetGlyphContours is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns list of the kerning overrides.
   */
  public open fun _fontGetKerningList(fontRid: RID, size: Long): VariantArray<Vector2i> {
    throw NotImplementedError("_fontGetKerningList is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Removes all kerning overrides.
   */
  public open fun _fontClearKerningMap(fontRid: RID, size: Long): Unit {
    throw NotImplementedError("_fontClearKerningMap is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Removes kerning override for the pair of glyphs.
   */
  public open fun _fontRemoveKerning(
    fontRid: RID,
    size: Long,
    glyphPair: Vector2i,
  ): Unit {
    throw NotImplementedError("_fontRemoveKerning is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Sets kerning for the pair of glyphs.
   */
  public open fun _fontSetKerning(
    fontRid: RID,
    size: Long,
    glyphPair: Vector2i,
    kerning: Vector2,
  ): Unit {
    throw NotImplementedError("_fontSetKerning is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns kerning for the pair of glyphs.
   */
  public open fun _fontGetKerning(
    fontRid: RID,
    size: Long,
    glyphPair: Vector2i,
  ): Vector2 {
    throw NotImplementedError("_fontGetKerning is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns the glyph index of a [char], optionally modified by the [variationSelector].
   */
  public open fun _fontGetGlyphIndex(
    fontRid: RID,
    size: Long,
    char: Long,
    variationSelector: Long,
  ): Long {
    throw NotImplementedError("_fontGetGlyphIndex is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns character code associated with [glyphIndex], or `0` if [glyphIndex] is invalid.
   */
  public open fun _fontGetCharFromGlyphIndex(
    fontRid: RID,
    size: Long,
    glyphIndex: Long,
  ): Long {
    throw NotImplementedError("_fontGetCharFromGlyphIndex is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns `true` if a Unicode [char] is available in the font.
   */
  public open fun _fontHasChar(fontRid: RID, char: Long): Boolean {
    throw NotImplementedError("_fontHasChar is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns a string containing all the characters available in the font.
   */
  public open fun _fontGetSupportedChars(fontRid: RID): String {
    throw NotImplementedError("_fontGetSupportedChars is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns an array containing all glyph indices in the font.
   */
  public open fun _fontGetSupportedGlyphs(fontRid: RID): PackedInt32Array {
    throw NotImplementedError("_fontGetSupportedGlyphs is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Renders the range of characters to the font cache texture.
   */
  public open fun _fontRenderRange(
    fontRid: RID,
    size: Vector2i,
    start: Long,
    end: Long,
  ): Unit {
    throw NotImplementedError("_fontRenderRange is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Renders specified glyph to the font cache texture.
   */
  public open fun _fontRenderGlyph(
    fontRid: RID,
    size: Vector2i,
    index: Long,
  ): Unit {
    throw NotImplementedError("_fontRenderGlyph is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Draws single glyph into a canvas item at the position, using [fontRid] at the size [size].
   */
  public open fun _fontDrawGlyph(
    fontRid: RID,
    canvas: RID,
    size: Long,
    pos: Vector2,
    index: Long,
    color: Color,
  ): Unit {
    throw NotImplementedError("_fontDrawGlyph is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Draws single glyph outline of size [outlineSize] into a canvas item at the position, using
   * [fontRid] at the size [size].
   */
  public open fun _fontDrawGlyphOutline(
    fontRid: RID,
    canvas: RID,
    size: Long,
    outlineSize: Long,
    pos: Vector2,
    index: Long,
    color: Color,
  ): Unit {
    throw NotImplementedError("_fontDrawGlyphOutline is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns `true`, if font supports given language
   * ([url=https://en.wikipedia.org/wiki/ISO_639-1]ISO 639[/url] code).
   */
  public open fun _fontIsLanguageSupported(fontRid: RID, language: String): Boolean {
    throw NotImplementedError("_fontIsLanguageSupported is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Adds override for [_fontIsLanguageSupported].
   */
  public open fun _fontSetLanguageSupportOverride(
    fontRid: RID,
    language: String,
    supported: Boolean,
  ): Unit {
    throw NotImplementedError("_fontSetLanguageSupportOverride is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns `true` if support override is enabled for the [language].
   */
  public open fun _fontGetLanguageSupportOverride(fontRid: RID, language: String): Boolean {
    throw NotImplementedError("_fontGetLanguageSupportOverride is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Remove language support override.
   */
  public open fun _fontRemoveLanguageSupportOverride(fontRid: RID, language: String): Unit {
    throw NotImplementedError("_fontRemoveLanguageSupportOverride is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns list of language support overrides.
   */
  public open fun _fontGetLanguageSupportOverrides(fontRid: RID): PackedStringArray {
    throw NotImplementedError("_fontGetLanguageSupportOverrides is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns `true`, if font supports given script (ISO 15924 code).
   */
  public open fun _fontIsScriptSupported(fontRid: RID, script: String): Boolean {
    throw NotImplementedError("_fontIsScriptSupported is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Adds override for [_fontIsScriptSupported].
   */
  public open fun _fontSetScriptSupportOverride(
    fontRid: RID,
    script: String,
    supported: Boolean,
  ): Unit {
    throw NotImplementedError("_fontSetScriptSupportOverride is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns `true` if support override is enabled for the [script].
   */
  public open fun _fontGetScriptSupportOverride(fontRid: RID, script: String): Boolean {
    throw NotImplementedError("_fontGetScriptSupportOverride is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Removes script support override.
   */
  public open fun _fontRemoveScriptSupportOverride(fontRid: RID, script: String): Unit {
    throw NotImplementedError("_fontRemoveScriptSupportOverride is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns list of script support overrides.
   */
  public open fun _fontGetScriptSupportOverrides(fontRid: RID): PackedStringArray {
    throw NotImplementedError("_fontGetScriptSupportOverrides is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Sets font OpenType feature set override.
   */
  public open fun _fontSetOpentypeFeatureOverrides(fontRid: RID, overrides: Dictionary<Any?, Any?>):
      Unit {
    throw NotImplementedError("_fontSetOpentypeFeatureOverrides is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns font OpenType feature set override.
   */
  public open fun _fontGetOpentypeFeatureOverrides(fontRid: RID): Dictionary<Any?, Any?> {
    throw NotImplementedError("_fontGetOpentypeFeatureOverrides is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns the dictionary of the supported OpenType features.
   */
  public open fun _fontSupportedFeatureList(fontRid: RID): Dictionary<Any?, Any?> {
    throw NotImplementedError("_fontSupportedFeatureList is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns the dictionary of the supported OpenType variation coordinates.
   */
  public open fun _fontSupportedVariationList(fontRid: RID): Dictionary<Any?, Any?> {
    throw NotImplementedError("_fontSupportedVariationList is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns the font oversampling factor, shared by all fonts in the TextServer.
   */
  public open fun _fontGetGlobalOversampling(): Double {
    throw NotImplementedError("_fontGetGlobalOversampling is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Sets oversampling factor, shared by all font in the TextServer.
   */
  public open fun _fontSetGlobalOversampling(oversampling: Double): Unit {
    throw NotImplementedError("_fontSetGlobalOversampling is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns size of the replacement character (box with character hexadecimal code that is drawn in
   * place of invalid characters).
   */
  public open fun _getHexCodeBoxSize(size: Long, index: Long): Vector2 {
    throw NotImplementedError("_getHexCodeBoxSize is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Draws box displaying character hexadecimal code.
   */
  public open fun _drawHexCodeBox(
    canvas: RID,
    size: Long,
    pos: Vector2,
    index: Long,
    color: Color,
  ): Unit {
    throw NotImplementedError("_drawHexCodeBox is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Creates a new buffer for complex text layout, with the given [direction] and [orientation].
   */
  public open fun _createShapedText(direction: TextServer.Direction,
      orientation: TextServer.Orientation): RID {
    throw NotImplementedError("_createShapedText is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Clears text buffer (removes text and inline objects).
   */
  public open fun _shapedTextClear(shaped: RID): Unit {
    throw NotImplementedError("_shapedTextClear is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Sets desired text direction. If set to [TextServer.DIRECTION_AUTO], direction will be detected
   * based on the buffer contents and current locale.
   */
  public open fun _shapedTextSetDirection(shaped: RID, direction: TextServer.Direction): Unit {
    throw NotImplementedError("_shapedTextSetDirection is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns direction of the text.
   */
  public open fun _shapedTextGetDirection(shaped: RID): TextServer.Direction {
    throw NotImplementedError("_shapedTextGetDirection is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns direction of the text, inferred by the BiDi algorithm.
   */
  public open fun _shapedTextGetInferredDirection(shaped: RID): TextServer.Direction {
    throw NotImplementedError("_shapedTextGetInferredDirection is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Overrides BiDi for the structured text.
   */
  public open fun _shapedTextSetBidiOverride(shaped: RID, `override`: VariantArray<Any?>): Unit {
    throw NotImplementedError("_shapedTextSetBidiOverride is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Sets custom punctuation character list, used for word breaking. If set to empty string, server
   * defaults are used.
   */
  public open fun _shapedTextSetCustomPunctuation(shaped: RID, punct: String): Unit {
    throw NotImplementedError("_shapedTextSetCustomPunctuation is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns custom punctuation character list, used for word breaking. If set to empty string,
   * server defaults are used.
   */
  public open fun _shapedTextGetCustomPunctuation(shaped: RID): String {
    throw NotImplementedError("_shapedTextGetCustomPunctuation is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Sets ellipsis character used for text clipping.
   */
  public open fun _shapedTextSetCustomEllipsis(shaped: RID, char: Long): Unit {
    throw NotImplementedError("_shapedTextSetCustomEllipsis is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns ellipsis character used for text clipping.
   */
  public open fun _shapedTextGetCustomEllipsis(shaped: RID): Long {
    throw NotImplementedError("_shapedTextGetCustomEllipsis is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Sets desired text orientation.
   */
  public open fun _shapedTextSetOrientation(shaped: RID, orientation: TextServer.Orientation):
      Unit {
    throw NotImplementedError("_shapedTextSetOrientation is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns text orientation.
   */
  public open fun _shapedTextGetOrientation(shaped: RID): TextServer.Orientation {
    throw NotImplementedError("_shapedTextGetOrientation is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * If set to `true` text buffer will display invalid characters as hexadecimal codes, otherwise
   * nothing is displayed.
   */
  public open fun _shapedTextSetPreserveInvalid(shaped: RID, enabled: Boolean): Unit {
    throw NotImplementedError("_shapedTextSetPreserveInvalid is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns `true` if text buffer is configured to display hexadecimal codes in place of invalid
   * characters.
   */
  public open fun _shapedTextGetPreserveInvalid(shaped: RID): Boolean {
    throw NotImplementedError("_shapedTextGetPreserveInvalid is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * If set to `true` text buffer will display control characters.
   */
  public open fun _shapedTextSetPreserveControl(shaped: RID, enabled: Boolean): Unit {
    throw NotImplementedError("_shapedTextSetPreserveControl is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns `true` if text buffer is configured to display control characters.
   */
  public open fun _shapedTextGetPreserveControl(shaped: RID): Boolean {
    throw NotImplementedError("_shapedTextGetPreserveControl is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Sets extra spacing added between glyphs or lines in pixels.
   */
  public open fun _shapedTextSetSpacing(
    shaped: RID,
    spacing: TextServer.SpacingType,
    `value`: Long,
  ): Unit {
    throw NotImplementedError("_shapedTextSetSpacing is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns extra spacing added between glyphs or lines in pixels.
   */
  public open fun _shapedTextGetSpacing(shaped: RID, spacing: TextServer.SpacingType): Long {
    throw NotImplementedError("_shapedTextGetSpacing is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Adds text span and font to draw it to the text buffer.
   */
  public open fun _shapedTextAddString(
    shaped: RID,
    text: String,
    fonts: VariantArray<RID>,
    size: Long,
    opentypeFeatures: Dictionary<Any?, Any?>,
    language: String,
    meta: Any?,
  ): Boolean {
    throw NotImplementedError("_shapedTextAddString is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Adds inline object to the text buffer, [key] must be unique. In the text, object is represented
   * as [length] object replacement characters.
   */
  public open fun _shapedTextAddObject(
    shaped: RID,
    key: Any?,
    size: Vector2,
    inlineAlign: InlineAlignment,
    length: Long,
    baseline: Double,
  ): Boolean {
    throw NotImplementedError("_shapedTextAddObject is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Sets new size and alignment of embedded object.
   */
  public open fun _shapedTextResizeObject(
    shaped: RID,
    key: Any?,
    size: Vector2,
    inlineAlign: InlineAlignment,
    baseline: Double,
  ): Boolean {
    throw NotImplementedError("_shapedTextResizeObject is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns number of text spans added using [_shapedTextAddString] or [_shapedTextAddObject].
   */
  public open fun _shapedGetSpanCount(shaped: RID): Long {
    throw NotImplementedError("_shapedGetSpanCount is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns text span metadata.
   */
  public open fun _shapedGetSpanMeta(shaped: RID, index: Long): Any? {
    throw NotImplementedError("_shapedGetSpanMeta is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns text embedded object key.
   */
  public open fun _shapedGetSpanEmbeddedObject(shaped: RID, index: Long): Any? {
    throw NotImplementedError("_shapedGetSpanEmbeddedObject is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Changes text span font, font size, and OpenType features, without changing the text.
   */
  public open fun _shapedSetSpanUpdateFont(
    shaped: RID,
    index: Long,
    fonts: VariantArray<RID>,
    size: Long,
    opentypeFeatures: Dictionary<Any?, Any?>,
  ): Unit {
    throw NotImplementedError("_shapedSetSpanUpdateFont is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns text buffer for the substring of the text in the [shaped] text buffer (including inline
   * objects).
   */
  public open fun _shapedTextSubstr(
    shaped: RID,
    start: Long,
    length: Long,
  ): RID {
    throw NotImplementedError("_shapedTextSubstr is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns the parent buffer from which the substring originates.
   */
  public open fun _shapedTextGetParent(shaped: RID): RID {
    throw NotImplementedError("_shapedTextGetParent is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Adjusts text width to fit to specified width, returns new text width.
   */
  public open fun _shapedTextFitToWidth(
    shaped: RID,
    width: Double,
    justificationFlags: TextServer.JustificationFlag,
  ): Double {
    throw NotImplementedError("_shapedTextFitToWidth is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Aligns shaped text to the given tab-stops.
   */
  public open fun _shapedTextTabAlign(shaped: RID, tabStops: PackedFloat32Array): Double {
    throw NotImplementedError("_shapedTextTabAlign is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Shapes buffer if it's not shaped. Returns `true` if the string is shaped successfully.
   */
  public open fun _shapedTextShape(shaped: RID): Boolean {
    throw NotImplementedError("_shapedTextShape is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Updates break points in the shaped text. This method is called by default implementation of
   * text breaking functions.
   */
  public open fun _shapedTextUpdateBreaks(shaped: RID): Boolean {
    throw NotImplementedError("_shapedTextUpdateBreaks is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Updates justification points in the shaped text. This method is called by default
   * implementation of text justification functions.
   */
  public open fun _shapedTextUpdateJustificationOps(shaped: RID): Boolean {
    throw NotImplementedError("_shapedTextUpdateJustificationOps is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns `true` if buffer is successfully shaped.
   */
  public open fun _shapedTextIsReady(shaped: RID): Boolean {
    throw NotImplementedError("_shapedTextIsReady is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns number of glyphs in the buffer.
   */
  public open fun _shapedTextGetGlyphCount(shaped: RID): Long {
    throw NotImplementedError("_shapedTextGetGlyphCount is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns substring buffer character range in the parent buffer.
   */
  public open fun _shapedTextGetRange(shaped: RID): Vector2i {
    throw NotImplementedError("_shapedTextGetRange is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Breaks text to the lines and columns. Returns character ranges for each segment.
   */
  public open fun _shapedTextGetLineBreaksAdv(
    shaped: RID,
    width: PackedFloat32Array,
    start: Long,
    once: Boolean,
    breakFlags: TextServer.LineBreakFlag,
  ): PackedInt32Array {
    throw NotImplementedError("_shapedTextGetLineBreaksAdv is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Breaks text to the lines and returns character ranges for each line.
   */
  public open fun _shapedTextGetLineBreaks(
    shaped: RID,
    width: Double,
    start: Long,
    breakFlags: TextServer.LineBreakFlag,
  ): PackedInt32Array {
    throw NotImplementedError("_shapedTextGetLineBreaks is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Breaks text into words and returns array of character ranges. Use [graphemeFlags] to set what
   * characters are used for breaking (see [TextServer.GraphemeFlag]).
   */
  public open fun _shapedTextGetWordBreaks(
    shaped: RID,
    graphemeFlags: TextServer.GraphemeFlag,
    skipGraphemeFlags: TextServer.GraphemeFlag,
  ): PackedInt32Array {
    throw NotImplementedError("_shapedTextGetWordBreaks is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns the position of the overrun trim.
   */
  public open fun _shapedTextGetTrimPos(shaped: RID): Long {
    throw NotImplementedError("_shapedTextGetTrimPos is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns position of the ellipsis.
   */
  public open fun _shapedTextGetEllipsisPos(shaped: RID): Long {
    throw NotImplementedError("_shapedTextGetEllipsisPos is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns number of glyphs in the ellipsis.
   */
  public open fun _shapedTextGetEllipsisGlyphCount(shaped: RID): Long {
    throw NotImplementedError("_shapedTextGetEllipsisGlyphCount is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Trims text if it exceeds the given width.
   */
  public open fun _shapedTextOverrunTrimToWidth(
    shaped: RID,
    width: Double,
    trimFlags: TextServer.TextOverrunFlag,
  ): Unit {
    throw NotImplementedError("_shapedTextOverrunTrimToWidth is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns array of inline objects.
   */
  public open fun _shapedTextGetObjects(shaped: RID): VariantArray<Any?> {
    throw NotImplementedError("_shapedTextGetObjects is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns bounding rectangle of the inline object.
   */
  public open fun _shapedTextGetObjectRect(shaped: RID, key: Any?): Rect2 {
    throw NotImplementedError("_shapedTextGetObjectRect is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns the character range of the inline object.
   */
  public open fun _shapedTextGetObjectRange(shaped: RID, key: Any?): Vector2i {
    throw NotImplementedError("_shapedTextGetObjectRange is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns the glyph index of the inline object.
   */
  public open fun _shapedTextGetObjectGlyph(shaped: RID, key: Any?): Long {
    throw NotImplementedError("_shapedTextGetObjectGlyph is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns size of the text.
   */
  public open fun _shapedTextGetSize(shaped: RID): Vector2 {
    throw NotImplementedError("_shapedTextGetSize is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns the text ascent (number of pixels above the baseline for horizontal layout or to the
   * left of baseline for vertical).
   */
  public open fun _shapedTextGetAscent(shaped: RID): Double {
    throw NotImplementedError("_shapedTextGetAscent is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns the text descent (number of pixels below the baseline for horizontal layout or to the
   * right of baseline for vertical).
   */
  public open fun _shapedTextGetDescent(shaped: RID): Double {
    throw NotImplementedError("_shapedTextGetDescent is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns width (for horizontal layout) or height (for vertical) of the text.
   */
  public open fun _shapedTextGetWidth(shaped: RID): Double {
    throw NotImplementedError("_shapedTextGetWidth is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns pixel offset of the underline below the baseline.
   */
  public open fun _shapedTextGetUnderlinePosition(shaped: RID): Double {
    throw NotImplementedError("_shapedTextGetUnderlinePosition is not implemented for TextServerExtension")
  }

  /**
   * **Required.**
   *
   * Returns thickness of the underline.
   */
  public open fun _shapedTextGetUnderlineThickness(shaped: RID): Double {
    throw NotImplementedError("_shapedTextGetUnderlineThickness is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns dominant direction of in the range of text.
   */
  public open fun _shapedTextGetDominantDirectionInRange(
    shaped: RID,
    start: Long,
    end: Long,
  ): Long {
    throw NotImplementedError("_shapedTextGetDominantDirectionInRange is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns selection rectangles for the specified character range.
   */
  public open fun _shapedTextGetSelection(
    shaped: RID,
    start: Long,
    end: Long,
  ): PackedVector2Array {
    throw NotImplementedError("_shapedTextGetSelection is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns grapheme index at the specified pixel offset at the baseline, or `-1` if none is found.
   */
  public open fun _shapedTextHitTestGrapheme(shaped: RID, coord: Double): Long {
    throw NotImplementedError("_shapedTextHitTestGrapheme is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns caret character offset at the specified pixel offset at the baseline. This function
   * always returns a valid position.
   */
  public open fun _shapedTextHitTestPosition(shaped: RID, coord: Double): Long {
    throw NotImplementedError("_shapedTextHitTestPosition is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Draw shaped text into a canvas item at a given position, with [color]. [pos] specifies the
   * leftmost point of the baseline (for horizontal layout) or topmost point of the baseline (for
   * vertical layout).
   */
  public open fun _shapedTextDraw(
    shaped: RID,
    canvas: RID,
    pos: Vector2,
    clipL: Double,
    clipR: Double,
    color: Color,
  ): Unit {
    throw NotImplementedError("_shapedTextDraw is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Draw the outline of the shaped text into a canvas item at a given position, with [color]. [pos]
   * specifies the leftmost point of the baseline (for horizontal layout) or topmost point of the
   * baseline (for vertical layout).
   */
  public open fun _shapedTextDrawOutline(
    shaped: RID,
    canvas: RID,
    pos: Vector2,
    clipL: Double,
    clipR: Double,
    outlineSize: Long,
    color: Color,
  ): Unit {
    throw NotImplementedError("_shapedTextDrawOutline is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns composite character's bounds as offsets from the start of the line.
   */
  public open fun _shapedTextGetGraphemeBounds(shaped: RID, pos: Long): Vector2 {
    throw NotImplementedError("_shapedTextGetGraphemeBounds is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns grapheme end position closest to the [pos].
   */
  public open fun _shapedTextNextGraphemePos(shaped: RID, pos: Long): Long {
    throw NotImplementedError("_shapedTextNextGraphemePos is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns grapheme start position closest to the [pos].
   */
  public open fun _shapedTextPrevGraphemePos(shaped: RID, pos: Long): Long {
    throw NotImplementedError("_shapedTextPrevGraphemePos is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns array of the composite character boundaries.
   */
  public open fun _shapedTextGetCharacterBreaks(shaped: RID): PackedInt32Array {
    throw NotImplementedError("_shapedTextGetCharacterBreaks is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns composite character end position closest to the [pos].
   */
  public open fun _shapedTextNextCharacterPos(shaped: RID, pos: Long): Long {
    throw NotImplementedError("_shapedTextNextCharacterPos is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns composite character start position closest to the [pos].
   */
  public open fun _shapedTextPrevCharacterPos(shaped: RID, pos: Long): Long {
    throw NotImplementedError("_shapedTextPrevCharacterPos is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns composite character position closest to the [pos].
   */
  public open fun _shapedTextClosestCharacterPos(shaped: RID, pos: Long): Long {
    throw NotImplementedError("_shapedTextClosestCharacterPos is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Converts a number from the Western Arabic (0..9) to the numeral systems used in [language].
   */
  public open fun _formatNumber(number: String, language: String): String {
    throw NotImplementedError("_formatNumber is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Converts [number] from the numeral systems used in [language] to Western Arabic (0..9).
   */
  public open fun _parseNumber(number: String, language: String): String {
    throw NotImplementedError("_parseNumber is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns percent sign used in the [language].
   */
  public open fun _percentSign(language: String): String {
    throw NotImplementedError("_percentSign is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Strips diacritics from the string.
   */
  public open fun _stripDiacritics(string: String): String {
    throw NotImplementedError("_stripDiacritics is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns `true` if [string] is a valid identifier.
   */
  public open fun _isValidIdentifier(string: String): Boolean {
    throw NotImplementedError("_isValidIdentifier is not implemented for TextServerExtension")
  }

  public open fun _isValidLetter(unicode: Long): Boolean {
    throw NotImplementedError("_isValidLetter is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns an array of the word break boundaries. Elements in the returned array are the offsets
   * of the start and end of words. Therefore the length of the array is always even.
   */
  public open fun _stringGetWordBreaks(
    string: String,
    language: String,
    charsPerLine: Long,
  ): PackedInt32Array {
    throw NotImplementedError("_stringGetWordBreaks is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns array of the composite character boundaries.
   */
  public open fun _stringGetCharacterBreaks(string: String, language: String): PackedInt32Array {
    throw NotImplementedError("_stringGetCharacterBreaks is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns index of the first string in [dict] which is visually confusable with the [string], or
   * `-1` if none is found.
   */
  public open fun _isConfusable(string: String, dict: PackedStringArray): Long {
    throw NotImplementedError("_isConfusable is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns `true` if [string] is likely to be an attempt at confusing the reader.
   */
  public open fun _spoofCheck(string: String): Boolean {
    throw NotImplementedError("_spoofCheck is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns the string converted to uppercase.
   */
  public open fun _stringToUpper(string: String, language: String): String {
    throw NotImplementedError("_stringToUpper is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns the string converted to lowercase.
   */
  public open fun _stringToLower(string: String, language: String): String {
    throw NotImplementedError("_stringToLower is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Returns the string converted to title case.
   */
  public open fun _stringToTitle(string: String, language: String): String {
    throw NotImplementedError("_stringToTitle is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * Default implementation of the BiDi algorithm override function. See
   * [TextServer.StructuredTextParser] for more info.
   */
  public open fun _parseStructuredText(
    parserType: TextServer.StructuredTextParser,
    args: VariantArray<Any?>,
    text: String,
  ): VariantArray<Vector3i> {
    throw NotImplementedError("_parseStructuredText is not implemented for TextServerExtension")
  }

  /**
   * **Optional.**
   *
   * This method is called before text server is unregistered.
   */
  public open fun _cleanup(): Unit {
    throw NotImplementedError("_cleanup is not implemented for TextServerExtension")
  }

  public companion object

  public object MethodBindings
}
