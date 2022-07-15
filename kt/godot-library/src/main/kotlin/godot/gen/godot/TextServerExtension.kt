// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.TextServer
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
import godot.core.Vector2
import godot.core.Vector2i
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class for TextServer custom implementations (plugins).
 *
 * External TextServer implementations should inherit from this class.
 */
@GodotBaseType
public open class TextServerExtension : TextServer() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_TEXTSERVEREXTENSION)
  }

  /**
   * Returns `true` if the server supports a feature.
   */
  public open fun _hasFeature(feature: TextServer.Feature): Boolean {
    throw NotImplementedError("has_feature is not implemented for TextServerExtension")
  }

  /**
   * Returns the name of the server interface.
   */
  public open fun _getName(): String {
    throw NotImplementedError("get_name is not implemented for TextServerExtension")
  }

  /**
   * Returns text server features, see [enum TextServer.Feature].
   */
  public open fun _getFeatures(): Long {
    throw NotImplementedError("get_features is not implemented for TextServerExtension")
  }

  /**
   * Frees an object created by this [godot.TextServer].
   */
  public open fun _freeRid(rid: RID): Unit {
  }

  /**
   * Returns `true` if `rid` is valid resource owned by this text server.
   */
  public open fun _has(rid: RID): Boolean {
    throw NotImplementedError("has is not implemented for TextServerExtension")
  }

  /**
   * Loads optional TextServer database (e.g. ICU break iterators and dictionaries).
   */
  public open fun _loadSupportData(filename: String): Boolean {
    throw NotImplementedError("load_support_data is not implemented for TextServerExtension")
  }

  /**
   * Returns default TextServer database (e.g. ICU break iterators and dictionaries) filename.
   */
  public open fun _getSupportDataFilename(): String {
    throw NotImplementedError("get_support_data_filename is not implemented for TextServerExtension")
  }

  /**
   * Returns TextServer database (e.g. ICU break iterators and dictionaries) description.
   */
  public open fun _getSupportDataInfo(): String {
    throw NotImplementedError("get_support_data_info is not implemented for TextServerExtension")
  }

  /**
   * Saves optional TextServer database (e.g. ICU break iterators and dictionaries) to the file.
   *
   * **Note:** This function is used by during project export, to include TextServer database.
   */
  public open fun _saveSupportData(filename: String): Boolean {
    throw NotImplementedError("save_support_data is not implemented for TextServerExtension")
  }

  /**
   * Returns `true` if locale is right-to-left.
   */
  public open fun _isLocaleRightToLeft(locale: String): Boolean {
    throw NotImplementedError("is_locale_right_to_left is not implemented for TextServerExtension")
  }

  /**
   * Converts readable feature, variation, script or language name to OpenType tag.
   */
  public open fun _nameToTag(name: String): Long {
    throw NotImplementedError("name_to_tag is not implemented for TextServerExtension")
  }

  /**
   * Converts OpenType tag to readable feature, variation, script or language name.
   */
  public open fun _tagToName(tag: Long): String {
    throw NotImplementedError("tag_to_name is not implemented for TextServerExtension")
  }

  /**
   * Creates new, empty font cache entry resource. To free the resulting resourec, use [freeRid] method.
   */
  public open fun _createFont(): RID {
    throw NotImplementedError("create_font is not implemented for TextServerExtension")
  }

  /**
   * Sets font source data, e.g contents of the dynamic font source file.
   */
  public open fun _fontSetData(fontRid: RID, `data`: PackedByteArray): Unit {
  }

  /**
   * Sets the font style flags, see [enum TextServer.FontStyle].
   */
  public open fun _fontSetStyle(fontRid: RID, style: Long): Unit {
  }

  /**
   * Returns font style flags, see [enum TextServer.FontStyle].
   */
  public open fun _fontGetStyle(fontRid: RID): Long {
    throw NotImplementedError("font_get_style is not implemented for TextServerExtension")
  }

  /**
   * Sets the font family name.
   */
  public open fun _fontSetName(fontRid: RID, name: String): Unit {
  }

  /**
   * Returns font family name.
   */
  public open fun _fontGetName(fontRid: RID): String {
    throw NotImplementedError("font_get_name is not implemented for TextServerExtension")
  }

  /**
   * Sets the font style name.
   */
  public open fun _fontSetStyleName(fontRid: RID, nameStyle: String): Unit {
  }

  /**
   * Returns font style name.
   */
  public open fun _fontGetStyleName(fontRid: RID): String {
    throw NotImplementedError("font_get_style_name is not implemented for TextServerExtension")
  }

  /**
   * If set to `true`, 8-bit antialiased glyph rendering is used, otherwise 1-bit rendering is used. Used by dynamic fonts only.
   */
  public open fun _fontSetAntialiased(fontRid: RID, antialiased: Boolean): Unit {
  }

  /**
   * Returns `true` if font 8-bit anitialiased glyph rendering is supported and enabled.
   */
  public open fun _fontIsAntialiased(fontRid: RID): Boolean {
    throw NotImplementedError("font_is_antialiased is not implemented for TextServerExtension")
  }

  /**
   * If set to `true`, glyphs of all sizes are rendered using single multichannel signed distance field generated from the dynamic font vector data. MSDF rendering allows displaying the font at any scaling factor without blurriness, and without incurring a CPU cost when the font size changes (since the font no longer needs to be rasterized on the CPU). As a downside, font hinting is not available with MSDF. The lack of font hinting may result in less crisp and less readable fonts at small sizes.
   *
   * **Note:** MSDF font rendering does not render glyphs with overlapping shapes correctly. Overlapping shapes are not valid per the OpenType standard, but are still commonly found in many font files, especially those converted by Google Fonts. To avoid issues with overlapping glyphs, consider downloading the font file directly from the type foundry instead of relying on Google Fonts.
   */
  public open fun _fontSetMultichannelSignedDistanceField(fontRid: RID, msdf: Boolean): Unit {
  }

  /**
   * Returns `true` if glyphs of all sizes are rendered using single multichannel signed distance field generated from the dynamic font vector data.
   */
  public open fun _fontIsMultichannelSignedDistanceField(fontRid: RID): Boolean {
    throw NotImplementedError("font_is_multichannel_signed_distance_field is not implemented for TextServerExtension")
  }

  /**
   * Sets the width of the range around the shape between the minimum and maximum representable signed distance.
   */
  public open fun _fontSetMsdfPixelRange(fontRid: RID, msdfPixelRange: Long): Unit {
  }

  /**
   * Returns the width of the range around the shape between the minimum and maximum representable signed distance.
   */
  public open fun _fontGetMsdfPixelRange(fontRid: RID): Long {
    throw NotImplementedError("font_get_msdf_pixel_range is not implemented for TextServerExtension")
  }

  /**
   * Sets source font size used to generate MSDF textures.
   */
  public open fun _fontSetMsdfSize(fontRid: RID, msdfSize: Long): Unit {
  }

  /**
   * Returns source font size used to generate MSDF textures.
   */
  public open fun _fontGetMsdfSize(fontRid: RID): Long {
    throw NotImplementedError("font_get_msdf_size is not implemented for TextServerExtension")
  }

  /**
   * Sets bitmap font fixed size. If set to value greater than zero, same cache entry will be used for all font sizes.
   */
  public open fun _fontSetFixedSize(fontRid: RID, fixedSize: Long): Unit {
  }

  /**
   * Returns bitmap font fixed size.
   */
  public open fun _fontGetFixedSize(fontRid: RID): Long {
    throw NotImplementedError("font_get_fixed_size is not implemented for TextServerExtension")
  }

  /**
   * If set to `true` auto-hinting is preferred over font built-in hinting.
   */
  public open fun _fontSetForceAutohinter(fontRid: RID, forceAutohinter: Boolean): Unit {
  }

  /**
   * Returns `true` if auto-hinting is supported and preferred over font built-in hinting. Used by dynamic fonts only.
   */
  public open fun _fontIsForceAutohinter(fontRid: RID): Boolean {
    throw NotImplementedError("font_is_force_autohinter is not implemented for TextServerExtension")
  }

  /**
   * Sets font hinting mode. Used by dynamic fonts only.
   */
  public open fun _fontSetHinting(fontRid: RID, hinting: TextServer.Hinting): Unit {
  }

  /**
   * Returns the font hinting mode. Used by dynamic fonts only.
   */
  public open fun _fontGetHinting(fontRid: RID): TextServer.Hinting {
    throw NotImplementedError("font_get_hinting is not implemented for TextServerExtension")
  }

  /**
   * Sets font sub-pixel glyph positioning mode.
   */
  public open fun _fontSetSubpixelPositioning(fontRid: RID,
      subpixelPositioning: TextServer.SubpixelPositioning): Unit {
  }

  /**
   * Returns font sub-pixel glyph positioning mode.
   */
  public open fun _fontGetSubpixelPositioning(fontRid: RID): TextServer.SubpixelPositioning {
    throw NotImplementedError("font_get_subpixel_positioning is not implemented for TextServerExtension")
  }

  /**
   * Sets font embolden strength. If `strength` is not equal to zero, emboldens the font outlines. Negative values reduce the outline thickness.
   */
  public open fun _fontSetEmbolden(fontRid: RID, strength: Double): Unit {
  }

  /**
   * Returns font embolden strength.
   */
  public open fun _fontGetEmbolden(fontRid: RID): Double {
    throw NotImplementedError("font_get_embolden is not implemented for TextServerExtension")
  }

  /**
   * Sets 2D transform, applied to the font outlines, can be used for slanting, flipping and rotating glyphs.
   *
   * For example, to simulate italic typeface by slanting, apply the following transform `Transform2D(1.0, slant, 0.0, 1.0, 0.0, 0.0)`.
   */
  public open fun _fontSetTransform(fontRid: RID, transform: Transform2D): Unit {
  }

  /**
   * Returns 2D transform applied to the font outlines.
   */
  public open fun _fontGetTransform(fontRid: RID): Transform2D {
    throw NotImplementedError("font_get_transform is not implemented for TextServerExtension")
  }

  /**
   * Sets variation coordinates for the specified font cache entry. See [fontSupportedVariationList] for more info.
   */
  public open fun _fontSetVariationCoordinates(fontRid: RID,
      variationCoordinates: Dictionary<Any?, Any?>): Unit {
  }

  /**
   * Returns variation coordinates for the specified font cache entry. See [fontSupportedVariationList] for more info.
   */
  public open fun _fontGetVariationCoordinates(fontRid: RID): Dictionary<Any?, Any?> {
    throw NotImplementedError("font_get_variation_coordinates is not implemented for TextServerExtension")
  }

  /**
   * Sets font oversampling factor, if set to `0.0` global oversampling factor is used instead. Used by dynamic fonts only.
   */
  public open fun _fontSetOversampling(fontRid: RID, oversampling: Double): Unit {
  }

  /**
   * Returns font oversampling factor, if set to `0.0` global oversampling factor is used instead. Used by dynamic fonts only.
   */
  public open fun _fontGetOversampling(fontRid: RID): Double {
    throw NotImplementedError("font_get_oversampling is not implemented for TextServerExtension")
  }

  /**
   * Returns list of the font sizes in the cache. Each size is `Vector2i` with font size and outline size.
   */
  public open fun _fontGetSizeCacheList(fontRid: RID): VariantArray<Any?> {
    throw NotImplementedError("font_get_size_cache_list is not implemented for TextServerExtension")
  }

  /**
   * Removes all font sizes from the cache entry.
   */
  public open fun _fontClearSizeCache(fontRid: RID): Unit {
  }

  /**
   * Removes specified font size from the cache entry.
   */
  public open fun _fontRemoveSizeCache(fontRid: RID, size: Vector2i): Unit {
  }

  /**
   * Sets the font ascent (number of pixels above the baseline).
   */
  public open fun _fontSetAscent(
    fontRid: RID,
    size: Long,
    ascent: Double
  ): Unit {
  }

  /**
   * Returns the font ascent (number of pixels above the baseline).
   */
  public open fun _fontGetAscent(fontRid: RID, size: Long): Double {
    throw NotImplementedError("font_get_ascent is not implemented for TextServerExtension")
  }

  /**
   * Sets the font descent (number of pixels below the baseline).
   */
  public open fun _fontSetDescent(
    fontRid: RID,
    size: Long,
    descent: Double
  ): Unit {
  }

  /**
   * Returns the font descent (number of pixels below the baseline).
   */
  public open fun _fontGetDescent(fontRid: RID, size: Long): Double {
    throw NotImplementedError("font_get_descent is not implemented for TextServerExtension")
  }

  /**
   * Sets pixel offset of the underline below the baseline.
   */
  public open fun _fontSetUnderlinePosition(
    fontRid: RID,
    size: Long,
    underlinePosition: Double
  ): Unit {
  }

  /**
   * Returns pixel offset of the underline below the baseline.
   */
  public open fun _fontGetUnderlinePosition(fontRid: RID, size: Long): Double {
    throw NotImplementedError("font_get_underline_position is not implemented for TextServerExtension")
  }

  /**
   * Sets thickness of the underline in pixels.
   */
  public open fun _fontSetUnderlineThickness(
    fontRid: RID,
    size: Long,
    underlineThickness: Double
  ): Unit {
  }

  /**
   * Returns thickness of the underline in pixels.
   */
  public open fun _fontGetUnderlineThickness(fontRid: RID, size: Long): Double {
    throw NotImplementedError("font_get_underline_thickness is not implemented for TextServerExtension")
  }

  /**
   * Sets scaling factor of the color bitmap font.
   */
  public open fun _fontSetScale(
    fontRid: RID,
    size: Long,
    scale: Double
  ): Unit {
  }

  /**
   * Returns scaling factor of the color bitmap font.
   */
  public open fun _fontGetScale(fontRid: RID, size: Long): Double {
    throw NotImplementedError("font_get_scale is not implemented for TextServerExtension")
  }

  /**
   * Sets extra spacing added between glyphs in pixels.
   */
  public open fun _fontSetSpacing(
    fontRid: RID,
    size: Long,
    spacing: TextServer.SpacingType,
    `value`: Long
  ): Unit {
  }

  /**
   * Returns extra spacing added between glyphs in pixels.
   */
  public open fun _fontGetSpacing(
    fontRid: RID,
    size: Long,
    spacing: TextServer.SpacingType
  ): Long {
    throw NotImplementedError("font_get_spacing is not implemented for TextServerExtension")
  }

  /**
   * Returns number of textures used by font cache entry.
   */
  public open fun _fontGetTextureCount(fontRid: RID, size: Vector2i): Long {
    throw NotImplementedError("font_get_texture_count is not implemented for TextServerExtension")
  }

  /**
   * Removes all textures from font cache entry.
   */
  public open fun _fontClearTextures(fontRid: RID, size: Vector2i): Unit {
  }

  /**
   * Removes specified texture from font cache entry.
   */
  public open fun _fontRemoveTexture(
    fontRid: RID,
    size: Vector2i,
    textureIndex: Long
  ): Unit {
  }

  /**
   * Sets font cache texture image data.
   */
  public open fun _fontSetTextureImage(
    fontRid: RID,
    size: Vector2i,
    textureIndex: Long,
    image: Image
  ): Unit {
  }

  /**
   * Returns font cache texture image data.
   */
  public open fun _fontGetTextureImage(
    fontRid: RID,
    size: Vector2i,
    textureIndex: Long
  ): Image? {
    throw NotImplementedError("font_get_texture_image is not implemented for TextServerExtension")
  }

  /**
   * Sets array containing the first free pixel in the each column of texture. Should be the same size as texture width or empty.
   */
  public open fun _fontSetTextureOffsets(
    fontRid: RID,
    size: Vector2i,
    textureIndex: Long,
    offset: PackedInt32Array
  ): Unit {
  }

  /**
   * Returns array containing the first free pixel in the each column of texture. Should be the same size as texture width or empty.
   */
  public open fun _fontGetTextureOffsets(
    fontRid: RID,
    size: Vector2i,
    textureIndex: Long
  ): PackedInt32Array {
    throw NotImplementedError("font_get_texture_offsets is not implemented for TextServerExtension")
  }

  /**
   * Returns list of rendered glyphs in the cache entry.
   */
  public open fun _fontGetGlyphList(fontRid: RID, size: Vector2i): VariantArray<Any?> {
    throw NotImplementedError("font_get_glyph_list is not implemented for TextServerExtension")
  }

  /**
   * Removes all rendered glyphs information from the cache entry.
   */
  public open fun _fontClearGlyphs(fontRid: RID, size: Vector2i): Unit {
  }

  /**
   * Removes specified rendered glyph information from the cache entry.
   */
  public open fun _fontRemoveGlyph(
    fontRid: RID,
    size: Vector2i,
    glyph: Long
  ): Unit {
  }

  /**
   * Returns glyph advance (offset of the next glyph).
   */
  public open fun _fontGetGlyphAdvance(
    fontRid: RID,
    size: Long,
    glyph: Long
  ): Vector2 {
    throw NotImplementedError("font_get_glyph_advance is not implemented for TextServerExtension")
  }

  /**
   * Sets glyph advance (offset of the next glyph).
   */
  public open fun _fontSetGlyphAdvance(
    fontRid: RID,
    size: Long,
    glyph: Long,
    advance: Vector2
  ): Unit {
  }

  /**
   * Returns glyph offset from the baseline.
   */
  public open fun _fontGetGlyphOffset(
    fontRid: RID,
    size: Vector2i,
    glyph: Long
  ): Vector2 {
    throw NotImplementedError("font_get_glyph_offset is not implemented for TextServerExtension")
  }

  /**
   * Sets glyph offset from the baseline.
   */
  public open fun _fontSetGlyphOffset(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
    offset: Vector2
  ): Unit {
  }

  /**
   * Returns size of the glyph.
   */
  public open fun _fontGetGlyphSize(
    fontRid: RID,
    size: Vector2i,
    glyph: Long
  ): Vector2 {
    throw NotImplementedError("font_get_glyph_size is not implemented for TextServerExtension")
  }

  /**
   * Sets size of the glyph.
   */
  public open fun _fontSetGlyphSize(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
    glSize: Vector2
  ): Unit {
  }

  /**
   * Returns rectangle in the cache texture containing the glyph.
   */
  public open fun _fontGetGlyphUvRect(
    fontRid: RID,
    size: Vector2i,
    glyph: Long
  ): Rect2 {
    throw NotImplementedError("font_get_glyph_uv_rect is not implemented for TextServerExtension")
  }

  /**
   * Sets rectangle in the cache texture containing the glyph.
   */
  public open fun _fontSetGlyphUvRect(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
    uvRect: Rect2
  ): Unit {
  }

  /**
   * Returns index of the cache texture containing the glyph.
   */
  public open fun _fontGetGlyphTextureIdx(
    fontRid: RID,
    size: Vector2i,
    glyph: Long
  ): Long {
    throw NotImplementedError("font_get_glyph_texture_idx is not implemented for TextServerExtension")
  }

  /**
   * Sets index of the cache texture containing the glyph.
   */
  public open fun _fontSetGlyphTextureIdx(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
    textureIdx: Long
  ): Unit {
  }

  /**
   * Returns outline contours of the glyph as a `Dictionary` with the following contents:
   *
   * `points`         - [godot.PackedVector3Array], containing outline points. `x` and `y` are point coordinates. `z` is the type of the point, using the [enum TextServer.ContourPointTag] values.
   *
   * `contours`       - [godot.PackedInt32Array], containing indices the end points of each contour.
   *
   * `orientation`    - [bool], contour orientation. If `true`, clockwise contours must be filled.
   */
  public open fun _fontGetGlyphContours(
    fontRid: RID,
    size: Long,
    index: Long
  ): Dictionary<Any?, Any?> {
    throw NotImplementedError("font_get_glyph_contours is not implemented for TextServerExtension")
  }

  /**
   * Returns list of the kerning overrides.
   */
  public open fun _fontGetKerningList(fontRid: RID, size: Long): VariantArray<Any?> {
    throw NotImplementedError("font_get_kerning_list is not implemented for TextServerExtension")
  }

  /**
   * Removes all kerning overrides.
   */
  public open fun _fontClearKerningMap(fontRid: RID, size: Long): Unit {
  }

  /**
   * Removes kerning override for the pair of glyphs.
   */
  public open fun _fontRemoveKerning(
    fontRid: RID,
    size: Long,
    glyphPair: Vector2i
  ): Unit {
  }

  /**
   * Sets kerning for the pair of glyphs.
   */
  public open fun _fontSetKerning(
    fontRid: RID,
    size: Long,
    glyphPair: Vector2i,
    kerning: Vector2
  ): Unit {
  }

  /**
   * Returns kerning for the pair of glyphs.
   */
  public open fun _fontGetKerning(
    fontRid: RID,
    size: Long,
    glyphPair: Vector2i
  ): Vector2 {
    throw NotImplementedError("font_get_kerning is not implemented for TextServerExtension")
  }

  /**
   * Returns the glyph index of a `char`, optionally modified by the `variation_selector`.
   */
  public open fun _fontGetGlyphIndex(
    fontRid: RID,
    size: Long,
    char: Long,
    variationSelector: Long
  ): Long {
    throw NotImplementedError("font_get_glyph_index is not implemented for TextServerExtension")
  }

  /**
   * Returns `true` if a Unicode `char` is available in the font.
   */
  public open fun _fontHasChar(fontRid: RID, char: Long): Boolean {
    throw NotImplementedError("font_has_char is not implemented for TextServerExtension")
  }

  /**
   * Returns a string containing all the characters available in the font.
   */
  public open fun _fontGetSupportedChars(fontRid: RID): String {
    throw NotImplementedError("font_get_supported_chars is not implemented for TextServerExtension")
  }

  /**
   * Renders the range of characters to the font cache texture.
   */
  public open fun _fontRenderRange(
    fontRid: RID,
    size: Vector2i,
    start: Long,
    end: Long
  ): Unit {
  }

  /**
   * Renders specified glyph to the font cache texture.
   */
  public open fun _fontRenderGlyph(
    fontRid: RID,
    size: Vector2i,
    index: Long
  ): Unit {
  }

  /**
   * Draws single glyph into a canvas item at the position, using `font_rid` at the size `size`.
   */
  public open fun _fontDrawGlyph(
    fontRid: RID,
    canvas: RID,
    size: Long,
    pos: Vector2,
    index: Long,
    color: Color
  ): Unit {
  }

  /**
   * Draws single glyph outline of size `outline_size` into a canvas item at the position, using `font_rid` at the size `size`.
   */
  public open fun _fontDrawGlyphOutline(
    fontRid: RID,
    canvas: RID,
    size: Long,
    outlineSize: Long,
    pos: Vector2,
    index: Long,
    color: Color
  ): Unit {
  }

  /**
   * Returns `true`, if font supports given language ([godot.ISO 639](https://en.wikipedia.org/wiki/ISO_639-1) code).
   */
  public open fun _fontIsLanguageSupported(fontRid: RID, language: String): Boolean {
    throw NotImplementedError("font_is_language_supported is not implemented for TextServerExtension")
  }

  /**
   * Adds override for [fontIsLanguageSupported].
   */
  public open fun _fontSetLanguageSupportOverride(
    fontRid: RID,
    language: String,
    supported: Boolean
  ): Unit {
  }

  /**
   * Returns `true` if support override is enabled for the `language`.
   */
  public open fun _fontGetLanguageSupportOverride(fontRid: RID, language: String): Boolean {
    throw NotImplementedError("font_get_language_support_override is not implemented for TextServerExtension")
  }

  /**
   * Remove language support override.
   */
  public open fun _fontRemoveLanguageSupportOverride(fontRid: RID, language: String): Unit {
  }

  /**
   * Returns list of language support overrides.
   */
  public open fun _fontGetLanguageSupportOverrides(fontRid: RID): PackedStringArray {
    throw NotImplementedError("font_get_language_support_overrides is not implemented for TextServerExtension")
  }

  /**
   * Returns `true`, if font supports given script (ISO 15924 code).
   */
  public open fun _fontIsScriptSupported(fontRid: RID, script: String): Boolean {
    throw NotImplementedError("font_is_script_supported is not implemented for TextServerExtension")
  }

  /**
   * Adds override for [fontIsScriptSupported].
   */
  public open fun _fontSetScriptSupportOverride(
    fontRid: RID,
    script: String,
    supported: Boolean
  ): Unit {
  }

  /**
   * Returns `true` if support override is enabled for the `script`.
   */
  public open fun _fontGetScriptSupportOverride(fontRid: RID, script: String): Boolean {
    throw NotImplementedError("font_get_script_support_override is not implemented for TextServerExtension")
  }

  /**
   * Removes script support override.
   */
  public open fun _fontRemoveScriptSupportOverride(fontRid: RID, script: String): Unit {
  }

  /**
   * Returns list of script support overrides.
   */
  public open fun _fontGetScriptSupportOverrides(fontRid: RID): PackedStringArray {
    throw NotImplementedError("font_get_script_support_overrides is not implemented for TextServerExtension")
  }

  /**
   * Sets font OpenType feature set override.
   */
  public open fun _fontSetOpentypeFeatureOverrides(fontRid: RID, overrides: Dictionary<Any?, Any?>):
      Unit {
  }

  /**
   * Returns font OpenType feature set override.
   */
  public open fun _fontGetOpentypeFeatureOverrides(fontRid: RID): Dictionary<Any?, Any?> {
    throw NotImplementedError("font_get_opentype_feature_overrides is not implemented for TextServerExtension")
  }

  /**
   * Returns the dictionary of the supported OpenType features.
   */
  public open fun _fontSupportedFeatureList(fontRid: RID): Dictionary<Any?, Any?> {
    throw NotImplementedError("font_supported_feature_list is not implemented for TextServerExtension")
  }

  /**
   * Returns the dictionary of the supported OpenType variation coordinates.
   */
  public open fun _fontSupportedVariationList(fontRid: RID): Dictionary<Any?, Any?> {
    throw NotImplementedError("font_supported_variation_list is not implemented for TextServerExtension")
  }

  /**
   * Returns the font oversampling factor, shared by all fonts in the TextServer.
   */
  public open fun _fontGetGlobalOversampling(): Double {
    throw NotImplementedError("font_get_global_oversampling is not implemented for TextServerExtension")
  }

  /**
   * Sets oversampling factor, shared by all font in the TextServer.
   *
   * **Note:** This value can be automatically changed by display server.
   */
  public open fun _fontSetGlobalOversampling(oversampling: Double): Unit {
  }

  /**
   * Returns size of the replacement character (box with character hexadecimal code that is drawn in place of invalid characters).
   *
   * **Note:** If this method is not implemented in the plugin, the default implementation will be used.
   */
  public open fun _getHexCodeBoxSize(size: Long, index: Long): Vector2 {
    throw NotImplementedError("get_hex_code_box_size is not implemented for TextServerExtension")
  }

  /**
   * Draws box displaying character hexadecimal code. Used for replacing missing characters.
   *
   * **Note:** If this method is not implemented in the plugin, the default implementation will be used.
   */
  public open fun _drawHexCodeBox(
    canvas: RID,
    size: Long,
    pos: Vector2,
    index: Long,
    color: Color
  ): Unit {
  }

  /**
   * Creates new buffer for complex text layout, with the given `direction` and `orientation`. To free the resulting buffer, use [freeRid] method.
   */
  public open fun _createShapedText(direction: TextServer.Direction,
      orientation: TextServer.Orientation): RID {
    throw NotImplementedError("create_shaped_text is not implemented for TextServerExtension")
  }

  /**
   * Clears text buffer (removes text and inline objects).
   */
  public open fun _shapedTextClear(shaped: RID): Unit {
  }

  /**
   * Sets desired text direction. If set to `TEXT_DIRECTION_AUTO`, direction will be detected based on the buffer contents and current locale.
   */
  public open fun _shapedTextSetDirection(shaped: RID, direction: TextServer.Direction): Unit {
  }

  /**
   * Returns direction of the text.
   */
  public open fun _shapedTextGetDirection(shaped: RID): TextServer.Direction {
    throw NotImplementedError("shaped_text_get_direction is not implemented for TextServerExtension")
  }

  /**
   * Returns direction of the text, inferred by the BiDi algorithm.
   */
  public open fun _shapedTextGetInferredDirection(shaped: RID): TextServer.Direction {
    throw NotImplementedError("shaped_text_get_inferred_direction is not implemented for TextServerExtension")
  }

  /**
   * Overrides BiDi for the structured text.
   *
   * Override ranges should cover full source text without overlaps. BiDi algorithm will be used on each range separately.
   */
  public open fun _shapedTextSetBidiOverride(shaped: RID, `override`: VariantArray<Any?>): Unit {
  }

  /**
   * Sets custom punctuation character list, used for word breaking. If set to empty string, server defaults are used.
   */
  public open fun _shapedTextSetCustomPunctuation(shaped: RID, punct: String): Unit {
  }

  /**
   * Returns custom punctuation character list, used for word breaking. If set to empty string, server defaults are used.
   */
  public open fun _shapedTextGetCustomPunctuation(shaped: RID): String {
    throw NotImplementedError("shaped_text_get_custom_punctuation is not implemented for TextServerExtension")
  }

  /**
   * Sets desired text orientation.
   */
  public open fun _shapedTextSetOrientation(shaped: RID, orientation: TextServer.Orientation):
      Unit {
  }

  /**
   * eturns text orientation.
   */
  public open fun _shapedTextGetOrientation(shaped: RID): TextServer.Orientation {
    throw NotImplementedError("shaped_text_get_orientation is not implemented for TextServerExtension")
  }

  /**
   * If set to `true` text buffer will display invalid characters as hexadecimal codes, otherwise nothing is displayed.
   */
  public open fun _shapedTextSetPreserveInvalid(shaped: RID, enabled: Boolean): Unit {
  }

  /**
   * Returns `true` if text buffer is configured to display hexadecimal codes in place of invalid characters.
   *
   * **Note:** If set to `false`, nothing is displayed in place of invalid characters.
   */
  public open fun _shapedTextGetPreserveInvalid(shaped: RID): Boolean {
    throw NotImplementedError("shaped_text_get_preserve_invalid is not implemented for TextServerExtension")
  }

  /**
   * If set to `true` text buffer will display control characters.
   */
  public open fun _shapedTextSetPreserveControl(shaped: RID, enabled: Boolean): Unit {
  }

  /**
   * Returns `true` if text buffer is configured to display control characters.
   */
  public open fun _shapedTextGetPreserveControl(shaped: RID): Boolean {
    throw NotImplementedError("shaped_text_get_preserve_control is not implemented for TextServerExtension")
  }

  /**
   * Adds text span and font to draw it to the text buffer.
   */
  public open fun _shapedTextAddString(
    shaped: RID,
    text: String,
    fonts: VariantArray<Any?>,
    size: Long,
    opentypeFeatures: Dictionary<Any?, Any?>,
    language: String,
    meta: Any
  ): Boolean {
    throw NotImplementedError("shaped_text_add_string is not implemented for TextServerExtension")
  }

  /**
   * Adds inline object to the text buffer, `key` must be unique. In the text, object is represented as `length` object replacement characters.
   */
  public open fun _shapedTextAddObject(
    shaped: RID,
    key: Any,
    size: Vector2,
    inlineAlign: InlineAlignment,
    length: Long
  ): Boolean {
    throw NotImplementedError("shaped_text_add_object is not implemented for TextServerExtension")
  }

  /**
   * Sets new size and alignment of embedded object.
   */
  public open fun _shapedTextResizeObject(
    shaped: RID,
    key: Any,
    size: Vector2,
    inlineAlign: InlineAlignment
  ): Boolean {
    throw NotImplementedError("shaped_text_resize_object is not implemented for TextServerExtension")
  }

  /**
   * Returns number of text spans added using [shapedTextAddString] or [shapedTextAddObject].
   */
  public open fun _shapedGetSpanCount(shaped: RID): Long {
    throw NotImplementedError("shaped_get_span_count is not implemented for TextServerExtension")
  }

  /**
   * Returns text span metadata.
   */
  public open fun _shapedGetSpanMeta(shaped: RID, index: Long): Any? {
    throw NotImplementedError("shaped_get_span_meta is not implemented for TextServerExtension")
  }

  /**
   * Changes text span font, font size and OpenType features, without changing the text.
   */
  public open fun _shapedSetSpanUpdateFont(
    shaped: RID,
    index: Long,
    fonts: VariantArray<Any?>,
    size: Long,
    opentypeFeatures: Dictionary<Any?, Any?>
  ): Unit {
  }

  /**
   * Returns text buffer for the substring of the text in the `shaped` text buffer (including inline objects).
   */
  public open fun _shapedTextSubstr(
    shaped: RID,
    start: Long,
    length: Long
  ): RID {
    throw NotImplementedError("shaped_text_substr is not implemented for TextServerExtension")
  }

  /**
   * Returns the parent buffer from which the substring originates.
   */
  public open fun _shapedTextGetParent(shaped: RID): RID {
    throw NotImplementedError("shaped_text_get_parent is not implemented for TextServerExtension")
  }

  /**
   * Adjusts text with to fit to specified width, returns new text width.
   */
  public open fun _shapedTextFitToWidth(
    shaped: RID,
    width: Double,
    jstFlags: Long
  ): Double {
    throw NotImplementedError("shaped_text_fit_to_width is not implemented for TextServerExtension")
  }

  /**
   * Aligns shaped text to the given tab-stops.
   */
  public open fun _shapedTextTabAlign(shaped: RID, tabStops: PackedFloat32Array): Double {
    throw NotImplementedError("shaped_text_tab_align is not implemented for TextServerExtension")
  }

  /**
   * Shapes buffer if it's not shaped. Returns `true` if the string is shaped successfully.
   */
  public open fun _shapedTextShape(shaped: RID): Boolean {
    throw NotImplementedError("shaped_text_shape is not implemented for TextServerExtension")
  }

  /**
   * Updates line breaking positions in the text buffer.
   *
   * **Note:** This method is used by default line/word breaking methods, and its implementation might be omitted if custom line breaking in implemented.
   */
  public open fun _shapedTextUpdateBreaks(shaped: RID): Boolean {
    throw NotImplementedError("shaped_text_update_breaks is not implemented for TextServerExtension")
  }

  /**
   * Updates line justification positions (word breaks and elongations) in the text buffer.
   *
   * **Note:** This method is used by default line/word breaking methods, and its implementation might be omitted if custom line breaking in implemented.
   */
  public open fun _shapedTextUpdateJustificationOps(shaped: RID): Boolean {
    throw NotImplementedError("shaped_text_update_justification_ops is not implemented for TextServerExtension")
  }

  /**
   * Returns `true` if buffer is successfully shaped.
   */
  public open fun _shapedTextIsReady(shaped: RID): Boolean {
    throw NotImplementedError("shaped_text_is_ready is not implemented for TextServerExtension")
  }

  /**
   * Returns number of glyphs in the buffer.
   */
  public open fun _shapedTextGetGlyphCount(shaped: RID): Long {
    throw NotImplementedError("shaped_text_get_glyph_count is not implemented for TextServerExtension")
  }

  /**
   * Returns substring buffer character range in the parent buffer.
   */
  public open fun _shapedTextGetRange(shaped: RID): Vector2i {
    throw NotImplementedError("shaped_text_get_range is not implemented for TextServerExtension")
  }

  /**
   * Breaks text to the lines and columns. Returns character ranges for each segment.
   *
   * **Note:** If this method is not implemented in the plugin, the default implementation will be used.
   */
  public open fun _shapedTextGetLineBreaksAdv(
    shaped: RID,
    width: PackedFloat32Array,
    start: Long,
    once: Boolean,
    breakFlags: Long
  ): PackedInt32Array {
    throw NotImplementedError("shaped_text_get_line_breaks_adv is not implemented for TextServerExtension")
  }

  /**
   * Breaks text to the lines and returns character ranges for each line.
   *
   * **Note:** If this method is not implemented in the plugin, the default implementation will be used.
   */
  public open fun _shapedTextGetLineBreaks(
    shaped: RID,
    width: Double,
    start: Long,
    breakFlags: Long
  ): PackedInt32Array {
    throw NotImplementedError("shaped_text_get_line_breaks is not implemented for TextServerExtension")
  }

  /**
   * Breaks text into words and returns array of character ranges.
   *
   * **Note:** If this method is not implemented in the plugin, the default implementation will be used.
   */
  public open fun _shapedTextGetWordBreaks(shaped: RID, graphemeFlags: Long): PackedInt32Array {
    throw NotImplementedError("shaped_text_get_word_breaks is not implemented for TextServerExtension")
  }

  /**
   * Returns the position of the overrun trim.
   */
  public open fun _shapedTextGetTrimPos(shaped: RID): Long {
    throw NotImplementedError("shaped_text_get_trim_pos is not implemented for TextServerExtension")
  }

  /**
   * Returns position of the ellipsis.
   */
  public open fun _shapedTextGetEllipsisPos(shaped: RID): Long {
    throw NotImplementedError("shaped_text_get_ellipsis_pos is not implemented for TextServerExtension")
  }

  /**
   * Returns number of glyphs in the ellipsis.
   */
  public open fun _shapedTextGetEllipsisGlyphCount(shaped: RID): Long {
    throw NotImplementedError("shaped_text_get_ellipsis_glyph_count is not implemented for TextServerExtension")
  }

  /**
   * Trims text if it exceeds the given width.
   */
  public open fun _shapedTextOverrunTrimToWidth(
    shaped: RID,
    width: Double,
    trimFlags: Long
  ): Unit {
  }

  /**
   * Returns array of inline objects.
   */
  public open fun _shapedTextGetObjects(shaped: RID): VariantArray<Any?> {
    throw NotImplementedError("shaped_text_get_objects is not implemented for TextServerExtension")
  }

  /**
   * Returns bounding rectangle of the inline object.
   */
  public open fun _shapedTextGetObjectRect(shaped: RID, key: Any): Rect2 {
    throw NotImplementedError("shaped_text_get_object_rect is not implemented for TextServerExtension")
  }

  /**
   * Returns size of the text.
   */
  public open fun _shapedTextGetSize(shaped: RID): Vector2 {
    throw NotImplementedError("shaped_text_get_size is not implemented for TextServerExtension")
  }

  /**
   * Returns the text ascent (number of pixels above the baseline for horizontal layout or to the left of baseline for vertical).
   */
  public open fun _shapedTextGetAscent(shaped: RID): Double {
    throw NotImplementedError("shaped_text_get_ascent is not implemented for TextServerExtension")
  }

  /**
   * Returns the text descent (number of pixels below the baseline for horizontal layout or to the right of baseline for vertical).
   */
  public open fun _shapedTextGetDescent(shaped: RID): Double {
    throw NotImplementedError("shaped_text_get_descent is not implemented for TextServerExtension")
  }

  /**
   * Returns width (for horizontal layout) or height (for vertical) of the text.
   */
  public open fun _shapedTextGetWidth(shaped: RID): Double {
    throw NotImplementedError("shaped_text_get_width is not implemented for TextServerExtension")
  }

  /**
   * Returns pixel offset of the underline below the baseline.
   */
  public open fun _shapedTextGetUnderlinePosition(shaped: RID): Double {
    throw NotImplementedError("shaped_text_get_underline_position is not implemented for TextServerExtension")
  }

  /**
   * Returns thickness of the underline.
   */
  public open fun _shapedTextGetUnderlineThickness(shaped: RID): Double {
    throw NotImplementedError("shaped_text_get_underline_thickness is not implemented for TextServerExtension")
  }

  /**
   * Returns dominant direction of in the range of text.
   *
   * **Note:** If this method is not implemented in the plugin, the default implementation will be used.
   */
  public open fun _shapedTextGetDominantDirectionInRange(
    shaped: RID,
    start: Long,
    end: Long
  ): Long {
    throw NotImplementedError("shaped_text_get_dominant_direction_in_range is not implemented for TextServerExtension")
  }

  /**
   * Returns selection rectangles for the specified character range.
   *
   * **Note:** If this method is not implemented in the plugin, the default implementation will be used.
   */
  public open fun _shapedTextGetSelection(
    shaped: RID,
    start: Long,
    end: Long
  ): PackedVector2Array {
    throw NotImplementedError("shaped_text_get_selection is not implemented for TextServerExtension")
  }

  /**
   * Returns grapheme index at the specified pixel offset at the baseline, or `-1` if none is found.
   *
   * **Note:** If this method is not implemented in the plugin, the default implementation will be used.
   */
  public open fun _shapedTextHitTestGrapheme(shaped: RID, coord: Double): Long {
    throw NotImplementedError("shaped_text_hit_test_grapheme is not implemented for TextServerExtension")
  }

  /**
   * Returns caret character offset at the specified pixel offset at the baseline. This function always returns a valid position.
   *
   * **Note:** If this method is not implemented in the plugin, the default implementation will be used.
   */
  public open fun _shapedTextHitTestPosition(shaped: RID, coord: Double): Long {
    throw NotImplementedError("shaped_text_hit_test_position is not implemented for TextServerExtension")
  }

  /**
   * Draw shaped text into a canvas item at a given position, with `color`. `pos` specifies the leftmost point of the baseline (for horizontal layout) or topmost point of the baseline (for vertical layout).
   *
   * **Note:** If this method is not implemented in the plugin, the default implementation will be used.
   */
  public open fun _shapedTextDraw(
    shaped: RID,
    canvas: RID,
    pos: Vector2,
    clipL: Double,
    clipR: Double,
    color: Color
  ): Unit {
  }

  /**
   * Draw the outline of the shaped text into a canvas item at a given position, with `color`. `pos` specifies the leftmost point of the baseline (for horizontal layout) or topmost point of the baseline (for vertical layout).
   *
   * **Note:** If this method is not implemented in the plugin, the default implementation will be used.
   */
  public open fun _shapedTextDrawOutline(
    shaped: RID,
    canvas: RID,
    pos: Vector2,
    clipL: Double,
    clipR: Double,
    outlineSize: Long,
    color: Color
  ): Unit {
  }

  /**
   * Returns composite character's bounds as offsets from the start of the line.
   *
   * **Note:** If this method is not implemented in the plugin, the default implementation will be used.
   */
  public open fun _shapedTextGetGraphemeBounds(shaped: RID, pos: Long): Vector2 {
    throw NotImplementedError("shaped_text_get_grapheme_bounds is not implemented for TextServerExtension")
  }

  /**
   * Returns composite character end position closest to the `pos`.
   *
   * **Note:** If this method is not implemented in the plugin, the default implementation will be used.
   */
  public open fun _shapedTextNextGraphemePos(shaped: RID, pos: Long): Long {
    throw NotImplementedError("shaped_text_next_grapheme_pos is not implemented for TextServerExtension")
  }

  /**
   * Returns composite character start position closest to the `pos`.
   *
   * **Note:** If this method is not implemented in the plugin, the default implementation will be used.
   */
  public open fun _shapedTextPrevGraphemePos(shaped: RID, pos: Long): Long {
    throw NotImplementedError("shaped_text_prev_grapheme_pos is not implemented for TextServerExtension")
  }

  /**
   * Converts a number from the Western Arabic (0..9) to the numeral systems used in `language`.
   */
  public open fun _formatNumber(string: String, language: String): String {
    throw NotImplementedError("format_number is not implemented for TextServerExtension")
  }

  /**
   * Converts a number from the numeral systems used in `language` to Western Arabic (0..9).
   */
  public open fun _parseNumber(string: String, language: String): String {
    throw NotImplementedError("parse_number is not implemented for TextServerExtension")
  }

  /**
   * Returns percent sign used in the `language`.
   */
  public open fun _percentSign(language: String): String {
    throw NotImplementedError("percent_sign is not implemented for TextServerExtension")
  }

  /**
   * Strips diacritics from the string.
   *
   * **Note:** If this method is not implemented in the plugin, the default implementation will be used.
   */
  public open fun _stripDiacritics(string: String): String {
    throw NotImplementedError("strip_diacritics is not implemented for TextServerExtension")
  }

  /**
   * Returns the string converted to uppercase.
   */
  public open fun _stringToUpper(string: String, language: String): String {
    throw NotImplementedError("string_to_upper is not implemented for TextServerExtension")
  }

  /**
   * Returns the string converted to lowercase.
   */
  public open fun _stringToLower(string: String, language: String): String {
    throw NotImplementedError("string_to_lower is not implemented for TextServerExtension")
  }

  public companion object
}
