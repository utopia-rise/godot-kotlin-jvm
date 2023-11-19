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
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.Vector2
import godot.core.Vector2i
import godot.core.Vector3i
import godot.util.VoidPtr
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
 * Base class for custom [godot.TextServer] implementations (plugins).
 *
 * External [godot.TextServer] implementations should inherit from this class.
 */
@GodotBaseType
public open class TextServerExtension : TextServer() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TEXTSERVEREXTENSION, scriptIndex)
    return true
  }

  /**
   *
   */
  public open fun _hasFeature(feature: TextServer.Feature): Boolean {
    throw NotImplementedError("_has_feature is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _getName(): String {
    throw NotImplementedError("_get_name is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _getFeatures(): Long {
    throw NotImplementedError("_get_features is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _freeRid(rid: RID): Unit {
  }

  /**
   *
   */
  public open fun _has(rid: RID): Boolean {
    throw NotImplementedError("_has is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _loadSupportData(filename: String): Boolean {
    throw NotImplementedError("_load_support_data is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _getSupportDataFilename(): String {
    throw NotImplementedError("_get_support_data_filename is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _getSupportDataInfo(): String {
    throw NotImplementedError("_get_support_data_info is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _saveSupportData(filename: String): Boolean {
    throw NotImplementedError("_save_support_data is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _isLocaleRightToLeft(locale: String): Boolean {
    throw NotImplementedError("_is_locale_right_to_left is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _nameToTag(name: String): Long {
    throw NotImplementedError("_name_to_tag is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _tagToName(tag: Long): String {
    throw NotImplementedError("_tag_to_name is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _createFont(): RID {
    throw NotImplementedError("_create_font is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontSetData(fontRid: RID, `data`: PackedByteArray): Unit {
  }

  /**
   *
   */
  public open fun _fontSetFaceIndex(fontRid: RID, faceIndex: Long): Unit {
  }

  /**
   *
   */
  public open fun _fontGetFaceIndex(fontRid: RID): Long {
    throw NotImplementedError("_font_get_face_index is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontGetFaceCount(fontRid: RID): Long {
    throw NotImplementedError("_font_get_face_count is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontSetStyle(fontRid: RID, style: TextServer.FontStyle): Unit {
  }

  /**
   *
   */
  public open fun _fontGetStyle(fontRid: RID): TextServer.FontStyle {
    throw NotImplementedError("_font_get_style is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontSetName(fontRid: RID, name: String): Unit {
  }

  /**
   *
   */
  public open fun _fontGetName(fontRid: RID): String {
    throw NotImplementedError("_font_get_name is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontGetOtNameStrings(fontRid: RID): Dictionary<Any?, Any?> {
    throw NotImplementedError("_font_get_ot_name_strings is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontSetStyleName(fontRid: RID, nameStyle: String): Unit {
  }

  /**
   *
   */
  public open fun _fontGetStyleName(fontRid: RID): String {
    throw NotImplementedError("_font_get_style_name is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontSetWeight(fontRid: RID, weight: Long): Unit {
  }

  /**
   *
   */
  public open fun _fontGetWeight(fontRid: RID): Long {
    throw NotImplementedError("_font_get_weight is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontSetStretch(fontRid: RID, stretch: Long): Unit {
  }

  /**
   *
   */
  public open fun _fontGetStretch(fontRid: RID): Long {
    throw NotImplementedError("_font_get_stretch is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontSetAntialiasing(fontRid: RID, antialiasing: TextServer.FontAntialiasing):
      Unit {
  }

  /**
   *
   */
  public open fun _fontGetAntialiasing(fontRid: RID): TextServer.FontAntialiasing {
    throw NotImplementedError("_font_get_antialiasing is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontSetGenerateMipmaps(fontRid: RID, generateMipmaps: Boolean): Unit {
  }

  /**
   *
   */
  public open fun _fontGetGenerateMipmaps(fontRid: RID): Boolean {
    throw NotImplementedError("_font_get_generate_mipmaps is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontSetMultichannelSignedDistanceField(fontRid: RID, msdf: Boolean): Unit {
  }

  /**
   *
   */
  public open fun _fontIsMultichannelSignedDistanceField(fontRid: RID): Boolean {
    throw NotImplementedError("_font_is_multichannel_signed_distance_field is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontSetMsdfPixelRange(fontRid: RID, msdfPixelRange: Long): Unit {
  }

  /**
   *
   */
  public open fun _fontGetMsdfPixelRange(fontRid: RID): Long {
    throw NotImplementedError("_font_get_msdf_pixel_range is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontSetMsdfSize(fontRid: RID, msdfSize: Long): Unit {
  }

  /**
   *
   */
  public open fun _fontGetMsdfSize(fontRid: RID): Long {
    throw NotImplementedError("_font_get_msdf_size is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontSetFixedSize(fontRid: RID, fixedSize: Long): Unit {
  }

  /**
   *
   */
  public open fun _fontGetFixedSize(fontRid: RID): Long {
    throw NotImplementedError("_font_get_fixed_size is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontSetAllowSystemFallback(fontRid: RID, allowSystemFallback: Boolean): Unit {
  }

  /**
   *
   */
  public open fun _fontIsAllowSystemFallback(fontRid: RID): Boolean {
    throw NotImplementedError("_font_is_allow_system_fallback is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontSetForceAutohinter(fontRid: RID, forceAutohinter: Boolean): Unit {
  }

  /**
   *
   */
  public open fun _fontIsForceAutohinter(fontRid: RID): Boolean {
    throw NotImplementedError("_font_is_force_autohinter is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontSetHinting(fontRid: RID, hinting: TextServer.Hinting): Unit {
  }

  /**
   *
   */
  public open fun _fontGetHinting(fontRid: RID): TextServer.Hinting {
    throw NotImplementedError("_font_get_hinting is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontSetSubpixelPositioning(fontRid: RID,
      subpixelPositioning: TextServer.SubpixelPositioning): Unit {
  }

  /**
   *
   */
  public open fun _fontGetSubpixelPositioning(fontRid: RID): TextServer.SubpixelPositioning {
    throw NotImplementedError("_font_get_subpixel_positioning is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontSetEmbolden(fontRid: RID, strength: Double): Unit {
  }

  /**
   *
   */
  public open fun _fontGetEmbolden(fontRid: RID): Double {
    throw NotImplementedError("_font_get_embolden is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontSetTransform(fontRid: RID, transform: Transform2D): Unit {
  }

  /**
   *
   */
  public open fun _fontGetTransform(fontRid: RID): Transform2D {
    throw NotImplementedError("_font_get_transform is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontSetVariationCoordinates(fontRid: RID,
      variationCoordinates: Dictionary<Any?, Any?>): Unit {
  }

  /**
   *
   */
  public open fun _fontGetVariationCoordinates(fontRid: RID): Dictionary<Any?, Any?> {
    throw NotImplementedError("_font_get_variation_coordinates is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontSetOversampling(fontRid: RID, oversampling: Double): Unit {
  }

  /**
   *
   */
  public open fun _fontGetOversampling(fontRid: RID): Double {
    throw NotImplementedError("_font_get_oversampling is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontGetSizeCacheList(fontRid: RID): VariantArray<Vector2i> {
    throw NotImplementedError("_font_get_size_cache_list is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontClearSizeCache(fontRid: RID): Unit {
  }

  /**
   *
   */
  public open fun _fontRemoveSizeCache(fontRid: RID, size: Vector2i): Unit {
  }

  /**
   *
   */
  public open fun _fontSetAscent(
    fontRid: RID,
    size: Long,
    ascent: Double,
  ): Unit {
  }

  /**
   *
   */
  public open fun _fontGetAscent(fontRid: RID, size: Long): Double {
    throw NotImplementedError("_font_get_ascent is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontSetDescent(
    fontRid: RID,
    size: Long,
    descent: Double,
  ): Unit {
  }

  /**
   *
   */
  public open fun _fontGetDescent(fontRid: RID, size: Long): Double {
    throw NotImplementedError("_font_get_descent is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontSetUnderlinePosition(
    fontRid: RID,
    size: Long,
    underlinePosition: Double,
  ): Unit {
  }

  /**
   *
   */
  public open fun _fontGetUnderlinePosition(fontRid: RID, size: Long): Double {
    throw NotImplementedError("_font_get_underline_position is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontSetUnderlineThickness(
    fontRid: RID,
    size: Long,
    underlineThickness: Double,
  ): Unit {
  }

  /**
   *
   */
  public open fun _fontGetUnderlineThickness(fontRid: RID, size: Long): Double {
    throw NotImplementedError("_font_get_underline_thickness is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontSetScale(
    fontRid: RID,
    size: Long,
    scale: Double,
  ): Unit {
  }

  /**
   *
   */
  public open fun _fontGetScale(fontRid: RID, size: Long): Double {
    throw NotImplementedError("_font_get_scale is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontGetTextureCount(fontRid: RID, size: Vector2i): Long {
    throw NotImplementedError("_font_get_texture_count is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontClearTextures(fontRid: RID, size: Vector2i): Unit {
  }

  /**
   *
   */
  public open fun _fontRemoveTexture(
    fontRid: RID,
    size: Vector2i,
    textureIndex: Long,
  ): Unit {
  }

  /**
   *
   */
  public open fun _fontSetTextureImage(
    fontRid: RID,
    size: Vector2i,
    textureIndex: Long,
    image: Image,
  ): Unit {
  }

  /**
   *
   */
  public open fun _fontGetTextureImage(
    fontRid: RID,
    size: Vector2i,
    textureIndex: Long,
  ): Image? {
    throw NotImplementedError("_font_get_texture_image is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontSetTextureOffsets(
    fontRid: RID,
    size: Vector2i,
    textureIndex: Long,
    offset: PackedInt32Array,
  ): Unit {
  }

  /**
   *
   */
  public open fun _fontGetTextureOffsets(
    fontRid: RID,
    size: Vector2i,
    textureIndex: Long,
  ): PackedInt32Array {
    throw NotImplementedError("_font_get_texture_offsets is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontGetGlyphList(fontRid: RID, size: Vector2i): PackedInt32Array {
    throw NotImplementedError("_font_get_glyph_list is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontClearGlyphs(fontRid: RID, size: Vector2i): Unit {
  }

  /**
   *
   */
  public open fun _fontRemoveGlyph(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
  ): Unit {
  }

  /**
   *
   */
  public open fun _fontGetGlyphAdvance(
    fontRid: RID,
    size: Long,
    glyph: Long,
  ): Vector2 {
    throw NotImplementedError("_font_get_glyph_advance is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontSetGlyphAdvance(
    fontRid: RID,
    size: Long,
    glyph: Long,
    advance: Vector2,
  ): Unit {
  }

  /**
   *
   */
  public open fun _fontGetGlyphOffset(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
  ): Vector2 {
    throw NotImplementedError("_font_get_glyph_offset is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontSetGlyphOffset(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
    offset: Vector2,
  ): Unit {
  }

  /**
   *
   */
  public open fun _fontGetGlyphSize(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
  ): Vector2 {
    throw NotImplementedError("_font_get_glyph_size is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontSetGlyphSize(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
    glSize: Vector2,
  ): Unit {
  }

  /**
   *
   */
  public open fun _fontGetGlyphUvRect(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
  ): Rect2 {
    throw NotImplementedError("_font_get_glyph_uv_rect is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontSetGlyphUvRect(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
    uvRect: Rect2,
  ): Unit {
  }

  /**
   *
   */
  public open fun _fontGetGlyphTextureIdx(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
  ): Long {
    throw NotImplementedError("_font_get_glyph_texture_idx is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontSetGlyphTextureIdx(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
    textureIdx: Long,
  ): Unit {
  }

  /**
   *
   */
  public open fun _fontGetGlyphTextureRid(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
  ): RID {
    throw NotImplementedError("_font_get_glyph_texture_rid is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontGetGlyphTextureSize(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
  ): Vector2 {
    throw NotImplementedError("_font_get_glyph_texture_size is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontGetGlyphContours(
    fontRid: RID,
    size: Long,
    index: Long,
  ): Dictionary<Any?, Any?> {
    throw NotImplementedError("_font_get_glyph_contours is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontGetKerningList(fontRid: RID, size: Long): VariantArray<Vector2i> {
    throw NotImplementedError("_font_get_kerning_list is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontClearKerningMap(fontRid: RID, size: Long): Unit {
  }

  /**
   *
   */
  public open fun _fontRemoveKerning(
    fontRid: RID,
    size: Long,
    glyphPair: Vector2i,
  ): Unit {
  }

  /**
   *
   */
  public open fun _fontSetKerning(
    fontRid: RID,
    size: Long,
    glyphPair: Vector2i,
    kerning: Vector2,
  ): Unit {
  }

  /**
   *
   */
  public open fun _fontGetKerning(
    fontRid: RID,
    size: Long,
    glyphPair: Vector2i,
  ): Vector2 {
    throw NotImplementedError("_font_get_kerning is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontGetGlyphIndex(
    fontRid: RID,
    size: Long,
    char: Long,
    variationSelector: Long,
  ): Long {
    throw NotImplementedError("_font_get_glyph_index is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontGetCharFromGlyphIndex(
    fontRid: RID,
    size: Long,
    glyphIndex: Long,
  ): Long {
    throw NotImplementedError("_font_get_char_from_glyph_index is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontHasChar(fontRid: RID, char: Long): Boolean {
    throw NotImplementedError("_font_has_char is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontGetSupportedChars(fontRid: RID): String {
    throw NotImplementedError("_font_get_supported_chars is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontRenderRange(
    fontRid: RID,
    size: Vector2i,
    start: Long,
    end: Long,
  ): Unit {
  }

  /**
   *
   */
  public open fun _fontRenderGlyph(
    fontRid: RID,
    size: Vector2i,
    index: Long,
  ): Unit {
  }

  /**
   *
   */
  public open fun _fontDrawGlyph(
    fontRid: RID,
    canvas: RID,
    size: Long,
    pos: Vector2,
    index: Long,
    color: Color,
  ): Unit {
  }

  /**
   *
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
  }

  /**
   *
   */
  public open fun _fontIsLanguageSupported(fontRid: RID, language: String): Boolean {
    throw NotImplementedError("_font_is_language_supported is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontSetLanguageSupportOverride(
    fontRid: RID,
    language: String,
    supported: Boolean,
  ): Unit {
  }

  /**
   *
   */
  public open fun _fontGetLanguageSupportOverride(fontRid: RID, language: String): Boolean {
    throw NotImplementedError("_font_get_language_support_override is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontRemoveLanguageSupportOverride(fontRid: RID, language: String): Unit {
  }

  /**
   *
   */
  public open fun _fontGetLanguageSupportOverrides(fontRid: RID): PackedStringArray {
    throw NotImplementedError("_font_get_language_support_overrides is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontIsScriptSupported(fontRid: RID, script: String): Boolean {
    throw NotImplementedError("_font_is_script_supported is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontSetScriptSupportOverride(
    fontRid: RID,
    script: String,
    supported: Boolean,
  ): Unit {
  }

  /**
   *
   */
  public open fun _fontGetScriptSupportOverride(fontRid: RID, script: String): Boolean {
    throw NotImplementedError("_font_get_script_support_override is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontRemoveScriptSupportOverride(fontRid: RID, script: String): Unit {
  }

  /**
   *
   */
  public open fun _fontGetScriptSupportOverrides(fontRid: RID): PackedStringArray {
    throw NotImplementedError("_font_get_script_support_overrides is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontSetOpentypeFeatureOverrides(fontRid: RID, overrides: Dictionary<Any?, Any?>):
      Unit {
  }

  /**
   *
   */
  public open fun _fontGetOpentypeFeatureOverrides(fontRid: RID): Dictionary<Any?, Any?> {
    throw NotImplementedError("_font_get_opentype_feature_overrides is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontSupportedFeatureList(fontRid: RID): Dictionary<Any?, Any?> {
    throw NotImplementedError("_font_supported_feature_list is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontSupportedVariationList(fontRid: RID): Dictionary<Any?, Any?> {
    throw NotImplementedError("_font_supported_variation_list is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontGetGlobalOversampling(): Double {
    throw NotImplementedError("_font_get_global_oversampling is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _fontSetGlobalOversampling(oversampling: Double): Unit {
  }

  /**
   *
   */
  public open fun _getHexCodeBoxSize(size: Long, index: Long): Vector2 {
    throw NotImplementedError("_get_hex_code_box_size is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _drawHexCodeBox(
    canvas: RID,
    size: Long,
    pos: Vector2,
    index: Long,
    color: Color,
  ): Unit {
  }

  /**
   *
   */
  public open fun _createShapedText(direction: TextServer.Direction,
      orientation: TextServer.Orientation): RID {
    throw NotImplementedError("_create_shaped_text is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _shapedTextClear(shaped: RID): Unit {
  }

  /**
   *
   */
  public open fun _shapedTextSetDirection(shaped: RID, direction: TextServer.Direction): Unit {
  }

  /**
   *
   */
  public open fun _shapedTextGetDirection(shaped: RID): TextServer.Direction {
    throw NotImplementedError("_shaped_text_get_direction is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _shapedTextGetInferredDirection(shaped: RID): TextServer.Direction {
    throw NotImplementedError("_shaped_text_get_inferred_direction is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _shapedTextSetBidiOverride(shaped: RID, `override`: VariantArray<Any?>): Unit {
  }

  /**
   *
   */
  public open fun _shapedTextSetCustomPunctuation(shaped: RID, punct: String): Unit {
  }

  /**
   *
   */
  public open fun _shapedTextGetCustomPunctuation(shaped: RID): String {
    throw NotImplementedError("_shaped_text_get_custom_punctuation is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _shapedTextSetOrientation(shaped: RID, orientation: TextServer.Orientation):
      Unit {
  }

  /**
   *
   */
  public open fun _shapedTextGetOrientation(shaped: RID): TextServer.Orientation {
    throw NotImplementedError("_shaped_text_get_orientation is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _shapedTextSetPreserveInvalid(shaped: RID, enabled: Boolean): Unit {
  }

  /**
   *
   */
  public open fun _shapedTextGetPreserveInvalid(shaped: RID): Boolean {
    throw NotImplementedError("_shaped_text_get_preserve_invalid is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _shapedTextSetPreserveControl(shaped: RID, enabled: Boolean): Unit {
  }

  /**
   *
   */
  public open fun _shapedTextGetPreserveControl(shaped: RID): Boolean {
    throw NotImplementedError("_shaped_text_get_preserve_control is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _shapedTextSetSpacing(
    shaped: RID,
    spacing: TextServer.SpacingType,
    `value`: Long,
  ): Unit {
  }

  /**
   *
   */
  public open fun _shapedTextGetSpacing(shaped: RID, spacing: TextServer.SpacingType): Long {
    throw NotImplementedError("_shaped_text_get_spacing is not implemented for TextServerExtension")
  }

  /**
   *
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
    throw NotImplementedError("_shaped_text_add_string is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _shapedTextAddObject(
    shaped: RID,
    key: Any?,
    size: Vector2,
    inlineAlign: InlineAlignment,
    length: Long,
    baseline: Double,
  ): Boolean {
    throw NotImplementedError("_shaped_text_add_object is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _shapedTextResizeObject(
    shaped: RID,
    key: Any?,
    size: Vector2,
    inlineAlign: InlineAlignment,
    baseline: Double,
  ): Boolean {
    throw NotImplementedError("_shaped_text_resize_object is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _shapedGetSpanCount(shaped: RID): Long {
    throw NotImplementedError("_shaped_get_span_count is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _shapedGetSpanMeta(shaped: RID, index: Long): Any? {
    throw NotImplementedError("_shaped_get_span_meta is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _shapedSetSpanUpdateFont(
    shaped: RID,
    index: Long,
    fonts: VariantArray<RID>,
    size: Long,
    opentypeFeatures: Dictionary<Any?, Any?>,
  ): Unit {
  }

  /**
   *
   */
  public open fun _shapedTextSubstr(
    shaped: RID,
    start: Long,
    length: Long,
  ): RID {
    throw NotImplementedError("_shaped_text_substr is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _shapedTextGetParent(shaped: RID): RID {
    throw NotImplementedError("_shaped_text_get_parent is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _shapedTextFitToWidth(
    shaped: RID,
    width: Double,
    justificationFlags: TextServer.JustificationFlag,
  ): Double {
    throw NotImplementedError("_shaped_text_fit_to_width is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _shapedTextTabAlign(shaped: RID, tabStops: PackedFloat32Array): Double {
    throw NotImplementedError("_shaped_text_tab_align is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _shapedTextShape(shaped: RID): Boolean {
    throw NotImplementedError("_shaped_text_shape is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _shapedTextUpdateBreaks(shaped: RID): Boolean {
    throw NotImplementedError("_shaped_text_update_breaks is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _shapedTextUpdateJustificationOps(shaped: RID): Boolean {
    throw NotImplementedError("_shaped_text_update_justification_ops is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _shapedTextIsReady(shaped: RID): Boolean {
    throw NotImplementedError("_shaped_text_is_ready is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _shapedTextGetGlyphCount(shaped: RID): Long {
    throw NotImplementedError("_shaped_text_get_glyph_count is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _shapedTextGetRange(shaped: RID): Vector2i {
    throw NotImplementedError("_shaped_text_get_range is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _shapedTextGetLineBreaksAdv(
    shaped: RID,
    width: PackedFloat32Array,
    start: Long,
    once: Boolean,
    breakFlags: TextServer.LineBreakFlag,
  ): PackedInt32Array {
    throw NotImplementedError("_shaped_text_get_line_breaks_adv is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _shapedTextGetLineBreaks(
    shaped: RID,
    width: Double,
    start: Long,
    breakFlags: TextServer.LineBreakFlag,
  ): PackedInt32Array {
    throw NotImplementedError("_shaped_text_get_line_breaks is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _shapedTextGetWordBreaks(shaped: RID, graphemeFlags: TextServer.GraphemeFlag):
      PackedInt32Array {
    throw NotImplementedError("_shaped_text_get_word_breaks is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _shapedTextGetTrimPos(shaped: RID): Long {
    throw NotImplementedError("_shaped_text_get_trim_pos is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _shapedTextGetEllipsisPos(shaped: RID): Long {
    throw NotImplementedError("_shaped_text_get_ellipsis_pos is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _shapedTextGetEllipsisGlyphCount(shaped: RID): Long {
    throw NotImplementedError("_shaped_text_get_ellipsis_glyph_count is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _shapedTextOverrunTrimToWidth(
    shaped: RID,
    width: Double,
    trimFlags: TextServer.TextOverrunFlag,
  ): Unit {
  }

  /**
   *
   */
  public open fun _shapedTextGetObjects(shaped: RID): VariantArray<Any?> {
    throw NotImplementedError("_shaped_text_get_objects is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _shapedTextGetObjectRect(shaped: RID, key: Any?): Rect2 {
    throw NotImplementedError("_shaped_text_get_object_rect is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _shapedTextGetSize(shaped: RID): Vector2 {
    throw NotImplementedError("_shaped_text_get_size is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _shapedTextGetAscent(shaped: RID): Double {
    throw NotImplementedError("_shaped_text_get_ascent is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _shapedTextGetDescent(shaped: RID): Double {
    throw NotImplementedError("_shaped_text_get_descent is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _shapedTextGetWidth(shaped: RID): Double {
    throw NotImplementedError("_shaped_text_get_width is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _shapedTextGetUnderlinePosition(shaped: RID): Double {
    throw NotImplementedError("_shaped_text_get_underline_position is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _shapedTextGetUnderlineThickness(shaped: RID): Double {
    throw NotImplementedError("_shaped_text_get_underline_thickness is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _shapedTextGetDominantDirectionInRange(
    shaped: RID,
    start: Long,
    end: Long,
  ): Long {
    throw NotImplementedError("_shaped_text_get_dominant_direction_in_range is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _shapedTextGetSelection(
    shaped: RID,
    start: Long,
    end: Long,
  ): PackedVector2Array {
    throw NotImplementedError("_shaped_text_get_selection is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _shapedTextHitTestGrapheme(shaped: RID, coord: Double): Long {
    throw NotImplementedError("_shaped_text_hit_test_grapheme is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _shapedTextHitTestPosition(shaped: RID, coord: Double): Long {
    throw NotImplementedError("_shaped_text_hit_test_position is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _shapedTextDraw(
    shaped: RID,
    canvas: RID,
    pos: Vector2,
    clipL: Double,
    clipR: Double,
    color: Color,
  ): Unit {
  }

  /**
   *
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
  }

  /**
   *
   */
  public open fun _shapedTextGetGraphemeBounds(shaped: RID, pos: Long): Vector2 {
    throw NotImplementedError("_shaped_text_get_grapheme_bounds is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _shapedTextNextGraphemePos(shaped: RID, pos: Long): Long {
    throw NotImplementedError("_shaped_text_next_grapheme_pos is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _shapedTextPrevGraphemePos(shaped: RID, pos: Long): Long {
    throw NotImplementedError("_shaped_text_prev_grapheme_pos is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _formatNumber(string: String, language: String): String {
    throw NotImplementedError("_format_number is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _parseNumber(string: String, language: String): String {
    throw NotImplementedError("_parse_number is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _percentSign(language: String): String {
    throw NotImplementedError("_percent_sign is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _stripDiacritics(string: String): String {
    throw NotImplementedError("_strip_diacritics is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _isValidIdentifier(string: String): Boolean {
    throw NotImplementedError("_is_valid_identifier is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _stringGetWordBreaks(
    string: String,
    language: String,
    charsPerLine: Long,
  ): PackedInt32Array {
    throw NotImplementedError("_string_get_word_breaks is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _isConfusable(string: String, dict: PackedStringArray): Long {
    throw NotImplementedError("_is_confusable is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _spoofCheck(string: String): Boolean {
    throw NotImplementedError("_spoof_check is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _stringToUpper(string: String, language: String): String {
    throw NotImplementedError("_string_to_upper is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _stringToLower(string: String, language: String): String {
    throw NotImplementedError("_string_to_lower is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _parseStructuredText(
    parserType: TextServer.StructuredTextParser,
    args: VariantArray<Any?>,
    text: String,
  ): VariantArray<Vector3i> {
    throw NotImplementedError("_parse_structured_text is not implemented for TextServerExtension")
  }

  /**
   *
   */
  public open fun _cleanup(): Unit {
  }

  public companion object

  internal object MethodBindings {
    public val _hasFeaturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_has_feature")

    public val _getNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_get_name")

    public val _getFeaturesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_get_features")

    public val _freeRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_free_rid")

    public val _hasPtr: VoidPtr = TypeManager.getMethodBindPtr("TextServerExtension", "_has")

    public val _loadSupportDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_load_support_data")

    public val _getSupportDataFilenamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_get_support_data_filename")

    public val _getSupportDataInfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_get_support_data_info")

    public val _saveSupportDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_save_support_data")

    public val _isLocaleRightToLeftPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_is_locale_right_to_left")

    public val _nameToTagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_name_to_tag")

    public val _tagToNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_tag_to_name")

    public val _createFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_create_font")

    public val _fontSetDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_set_data")

    public val _fontSetDataPtrPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_set_data_ptr")

    public val _fontSetFaceIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_set_face_index")

    public val _fontGetFaceIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_face_index")

    public val _fontGetFaceCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_face_count")

    public val _fontSetStylePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_set_style")

    public val _fontGetStylePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_style")

    public val _fontSetNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_set_name")

    public val _fontGetNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_name")

    public val _fontGetOtNameStringsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_ot_name_strings")

    public val _fontSetStyleNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_set_style_name")

    public val _fontGetStyleNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_style_name")

    public val _fontSetWeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_set_weight")

    public val _fontGetWeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_weight")

    public val _fontSetStretchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_set_stretch")

    public val _fontGetStretchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_stretch")

    public val _fontSetAntialiasingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_set_antialiasing")

    public val _fontGetAntialiasingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_antialiasing")

    public val _fontSetGenerateMipmapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_set_generate_mipmaps")

    public val _fontGetGenerateMipmapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_generate_mipmaps")

    public val _fontSetMultichannelSignedDistanceFieldPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_set_multichannel_signed_distance_field")

    public val _fontIsMultichannelSignedDistanceFieldPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_is_multichannel_signed_distance_field")

    public val _fontSetMsdfPixelRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_set_msdf_pixel_range")

    public val _fontGetMsdfPixelRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_msdf_pixel_range")

    public val _fontSetMsdfSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_set_msdf_size")

    public val _fontGetMsdfSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_msdf_size")

    public val _fontSetFixedSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_set_fixed_size")

    public val _fontGetFixedSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_fixed_size")

    public val _fontSetAllowSystemFallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_set_allow_system_fallback")

    public val _fontIsAllowSystemFallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_is_allow_system_fallback")

    public val _fontSetForceAutohinterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_set_force_autohinter")

    public val _fontIsForceAutohinterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_is_force_autohinter")

    public val _fontSetHintingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_set_hinting")

    public val _fontGetHintingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_hinting")

    public val _fontSetSubpixelPositioningPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_set_subpixel_positioning")

    public val _fontGetSubpixelPositioningPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_subpixel_positioning")

    public val _fontSetEmboldenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_set_embolden")

    public val _fontGetEmboldenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_embolden")

    public val _fontSetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_set_transform")

    public val _fontGetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_transform")

    public val _fontSetVariationCoordinatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_set_variation_coordinates")

    public val _fontGetVariationCoordinatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_variation_coordinates")

    public val _fontSetOversamplingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_set_oversampling")

    public val _fontGetOversamplingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_oversampling")

    public val _fontGetSizeCacheListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_size_cache_list")

    public val _fontClearSizeCachePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_clear_size_cache")

    public val _fontRemoveSizeCachePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_remove_size_cache")

    public val _fontSetAscentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_set_ascent")

    public val _fontGetAscentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_ascent")

    public val _fontSetDescentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_set_descent")

    public val _fontGetDescentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_descent")

    public val _fontSetUnderlinePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_set_underline_position")

    public val _fontGetUnderlinePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_underline_position")

    public val _fontSetUnderlineThicknessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_set_underline_thickness")

    public val _fontGetUnderlineThicknessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_underline_thickness")

    public val _fontSetScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_set_scale")

    public val _fontGetScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_scale")

    public val _fontGetTextureCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_texture_count")

    public val _fontClearTexturesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_clear_textures")

    public val _fontRemoveTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_remove_texture")

    public val _fontSetTextureImagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_set_texture_image")

    public val _fontGetTextureImagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_texture_image")

    public val _fontSetTextureOffsetsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_set_texture_offsets")

    public val _fontGetTextureOffsetsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_texture_offsets")

    public val _fontGetGlyphListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_glyph_list")

    public val _fontClearGlyphsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_clear_glyphs")

    public val _fontRemoveGlyphPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_remove_glyph")

    public val _fontGetGlyphAdvancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_glyph_advance")

    public val _fontSetGlyphAdvancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_set_glyph_advance")

    public val _fontGetGlyphOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_glyph_offset")

    public val _fontSetGlyphOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_set_glyph_offset")

    public val _fontGetGlyphSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_glyph_size")

    public val _fontSetGlyphSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_set_glyph_size")

    public val _fontGetGlyphUvRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_glyph_uv_rect")

    public val _fontSetGlyphUvRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_set_glyph_uv_rect")

    public val _fontGetGlyphTextureIdxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_glyph_texture_idx")

    public val _fontSetGlyphTextureIdxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_set_glyph_texture_idx")

    public val _fontGetGlyphTextureRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_glyph_texture_rid")

    public val _fontGetGlyphTextureSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_glyph_texture_size")

    public val _fontGetGlyphContoursPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_glyph_contours")

    public val _fontGetKerningListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_kerning_list")

    public val _fontClearKerningMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_clear_kerning_map")

    public val _fontRemoveKerningPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_remove_kerning")

    public val _fontSetKerningPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_set_kerning")

    public val _fontGetKerningPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_kerning")

    public val _fontGetGlyphIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_glyph_index")

    public val _fontGetCharFromGlyphIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_char_from_glyph_index")

    public val _fontHasCharPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_has_char")

    public val _fontGetSupportedCharsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_supported_chars")

    public val _fontRenderRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_render_range")

    public val _fontRenderGlyphPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_render_glyph")

    public val _fontDrawGlyphPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_draw_glyph")

    public val _fontDrawGlyphOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_draw_glyph_outline")

    public val _fontIsLanguageSupportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_is_language_supported")

    public val _fontSetLanguageSupportOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_set_language_support_override")

    public val _fontGetLanguageSupportOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_language_support_override")

    public val _fontRemoveLanguageSupportOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_remove_language_support_override")

    public val _fontGetLanguageSupportOverridesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_language_support_overrides")

    public val _fontIsScriptSupportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_is_script_supported")

    public val _fontSetScriptSupportOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_set_script_support_override")

    public val _fontGetScriptSupportOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_script_support_override")

    public val _fontRemoveScriptSupportOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_remove_script_support_override")

    public val _fontGetScriptSupportOverridesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_script_support_overrides")

    public val _fontSetOpentypeFeatureOverridesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_set_opentype_feature_overrides")

    public val _fontGetOpentypeFeatureOverridesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_opentype_feature_overrides")

    public val _fontSupportedFeatureListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_supported_feature_list")

    public val _fontSupportedVariationListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_supported_variation_list")

    public val _fontGetGlobalOversamplingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_get_global_oversampling")

    public val _fontSetGlobalOversamplingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_font_set_global_oversampling")

    public val _getHexCodeBoxSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_get_hex_code_box_size")

    public val _drawHexCodeBoxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_draw_hex_code_box")

    public val _createShapedTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_create_shaped_text")

    public val _shapedTextClearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_clear")

    public val _shapedTextSetDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_set_direction")

    public val _shapedTextGetDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_get_direction")

    public val _shapedTextGetInferredDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_get_inferred_direction")

    public val _shapedTextSetBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_set_bidi_override")

    public val _shapedTextSetCustomPunctuationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_set_custom_punctuation")

    public val _shapedTextGetCustomPunctuationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_get_custom_punctuation")

    public val _shapedTextSetOrientationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_set_orientation")

    public val _shapedTextGetOrientationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_get_orientation")

    public val _shapedTextSetPreserveInvalidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_set_preserve_invalid")

    public val _shapedTextGetPreserveInvalidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_get_preserve_invalid")

    public val _shapedTextSetPreserveControlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_set_preserve_control")

    public val _shapedTextGetPreserveControlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_get_preserve_control")

    public val _shapedTextSetSpacingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_set_spacing")

    public val _shapedTextGetSpacingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_get_spacing")

    public val _shapedTextAddStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_add_string")

    public val _shapedTextAddObjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_add_object")

    public val _shapedTextResizeObjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_resize_object")

    public val _shapedGetSpanCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_get_span_count")

    public val _shapedGetSpanMetaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_get_span_meta")

    public val _shapedSetSpanUpdateFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_set_span_update_font")

    public val _shapedTextSubstrPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_substr")

    public val _shapedTextGetParentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_get_parent")

    public val _shapedTextFitToWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_fit_to_width")

    public val _shapedTextTabAlignPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_tab_align")

    public val _shapedTextShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_shape")

    public val _shapedTextUpdateBreaksPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_update_breaks")

    public val _shapedTextUpdateJustificationOpsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_update_justification_ops")

    public val _shapedTextIsReadyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_is_ready")

    public val _shapedTextGetGlyphsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_get_glyphs")

    public val _shapedTextSortLogicalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_sort_logical")

    public val _shapedTextGetGlyphCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_get_glyph_count")

    public val _shapedTextGetRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_get_range")

    public val _shapedTextGetLineBreaksAdvPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_get_line_breaks_adv")

    public val _shapedTextGetLineBreaksPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_get_line_breaks")

    public val _shapedTextGetWordBreaksPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_get_word_breaks")

    public val _shapedTextGetTrimPosPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_get_trim_pos")

    public val _shapedTextGetEllipsisPosPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_get_ellipsis_pos")

    public val _shapedTextGetEllipsisGlyphCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_get_ellipsis_glyph_count")

    public val _shapedTextGetEllipsisGlyphsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_get_ellipsis_glyphs")

    public val _shapedTextOverrunTrimToWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_overrun_trim_to_width")

    public val _shapedTextGetObjectsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_get_objects")

    public val _shapedTextGetObjectRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_get_object_rect")

    public val _shapedTextGetSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_get_size")

    public val _shapedTextGetAscentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_get_ascent")

    public val _shapedTextGetDescentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_get_descent")

    public val _shapedTextGetWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_get_width")

    public val _shapedTextGetUnderlinePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_get_underline_position")

    public val _shapedTextGetUnderlineThicknessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_get_underline_thickness")

    public val _shapedTextGetDominantDirectionInRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_get_dominant_direction_in_range")

    public val _shapedTextGetCaretsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_get_carets")

    public val _shapedTextGetSelectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_get_selection")

    public val _shapedTextHitTestGraphemePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_hit_test_grapheme")

    public val _shapedTextHitTestPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_hit_test_position")

    public val _shapedTextDrawPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_draw")

    public val _shapedTextDrawOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_draw_outline")

    public val _shapedTextGetGraphemeBoundsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_get_grapheme_bounds")

    public val _shapedTextNextGraphemePosPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_next_grapheme_pos")

    public val _shapedTextPrevGraphemePosPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_shaped_text_prev_grapheme_pos")

    public val _formatNumberPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_format_number")

    public val _parseNumberPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_parse_number")

    public val _percentSignPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_percent_sign")

    public val _stripDiacriticsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_strip_diacritics")

    public val _isValidIdentifierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_is_valid_identifier")

    public val _stringGetWordBreaksPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_string_get_word_breaks")

    public val _isConfusablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_is_confusable")

    public val _spoofCheckPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_spoof_check")

    public val _stringToUpperPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_string_to_upper")

    public val _stringToLowerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_string_to_lower")

    public val _parseStructuredTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_parse_structured_text")

    public val _cleanupPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServerExtension", "_cleanup")
  }
}
