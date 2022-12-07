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

  public open fun _hasFeature(feature: TextServer.Feature): Boolean {
    throw NotImplementedError("has_feature is not implemented for TextServerExtension")
  }

  public open fun _getName(): String {
    throw NotImplementedError("get_name is not implemented for TextServerExtension")
  }

  public open fun _getFeatures(): Long {
    throw NotImplementedError("get_features is not implemented for TextServerExtension")
  }

  public open fun _freeRid(rid: RID): Unit {
  }

  public open fun _has(rid: RID): Boolean {
    throw NotImplementedError("has is not implemented for TextServerExtension")
  }

  public open fun _loadSupportData(filename: String): Boolean {
    throw NotImplementedError("load_support_data is not implemented for TextServerExtension")
  }

  public open fun _getSupportDataFilename(): String {
    throw NotImplementedError("get_support_data_filename is not implemented for TextServerExtension")
  }

  public open fun _getSupportDataInfo(): String {
    throw NotImplementedError("get_support_data_info is not implemented for TextServerExtension")
  }

  public open fun _saveSupportData(filename: String): Boolean {
    throw NotImplementedError("save_support_data is not implemented for TextServerExtension")
  }

  public open fun _isLocaleRightToLeft(locale: String): Boolean {
    throw NotImplementedError("is_locale_right_to_left is not implemented for TextServerExtension")
  }

  public open fun _nameToTag(name: String): Long {
    throw NotImplementedError("name_to_tag is not implemented for TextServerExtension")
  }

  public open fun _tagToName(tag: Long): String {
    throw NotImplementedError("tag_to_name is not implemented for TextServerExtension")
  }

  public open fun _createFont(): RID {
    throw NotImplementedError("create_font is not implemented for TextServerExtension")
  }

  public open fun _fontSetData(fontRid: RID, `data`: PackedByteArray): Unit {
  }

  public open fun _fontSetStyle(fontRid: RID, style: Long): Unit {
  }

  public open fun _fontGetStyle(fontRid: RID): Long {
    throw NotImplementedError("font_get_style is not implemented for TextServerExtension")
  }

  public open fun _fontSetName(fontRid: RID, name: String): Unit {
  }

  public open fun _fontGetName(fontRid: RID): String {
    throw NotImplementedError("font_get_name is not implemented for TextServerExtension")
  }

  public open fun _fontSetStyleName(fontRid: RID, nameStyle: String): Unit {
  }

  public open fun _fontGetStyleName(fontRid: RID): String {
    throw NotImplementedError("font_get_style_name is not implemented for TextServerExtension")
  }

  public open fun _fontSetAntialiased(fontRid: RID, antialiased: Boolean): Unit {
  }

  public open fun _fontIsAntialiased(fontRid: RID): Boolean {
    throw NotImplementedError("font_is_antialiased is not implemented for TextServerExtension")
  }

  public open fun _fontSetMultichannelSignedDistanceField(fontRid: RID, msdf: Boolean): Unit {
  }

  public open fun _fontIsMultichannelSignedDistanceField(fontRid: RID): Boolean {
    throw NotImplementedError("font_is_multichannel_signed_distance_field is not implemented for TextServerExtension")
  }

  public open fun _fontSetMsdfPixelRange(fontRid: RID, msdfPixelRange: Long): Unit {
  }

  public open fun _fontGetMsdfPixelRange(fontRid: RID): Long {
    throw NotImplementedError("font_get_msdf_pixel_range is not implemented for TextServerExtension")
  }

  public open fun _fontSetMsdfSize(fontRid: RID, msdfSize: Long): Unit {
  }

  public open fun _fontGetMsdfSize(fontRid: RID): Long {
    throw NotImplementedError("font_get_msdf_size is not implemented for TextServerExtension")
  }

  public open fun _fontSetFixedSize(fontRid: RID, fixedSize: Long): Unit {
  }

  public open fun _fontGetFixedSize(fontRid: RID): Long {
    throw NotImplementedError("font_get_fixed_size is not implemented for TextServerExtension")
  }

  public open fun _fontSetForceAutohinter(fontRid: RID, forceAutohinter: Boolean): Unit {
  }

  public open fun _fontIsForceAutohinter(fontRid: RID): Boolean {
    throw NotImplementedError("font_is_force_autohinter is not implemented for TextServerExtension")
  }

  public open fun _fontSetHinting(fontRid: RID, hinting: TextServer.Hinting): Unit {
  }

  public open fun _fontGetHinting(fontRid: RID): TextServer.Hinting {
    throw NotImplementedError("font_get_hinting is not implemented for TextServerExtension")
  }

  public open fun _fontSetSubpixelPositioning(fontRid: RID,
      subpixelPositioning: TextServer.SubpixelPositioning): Unit {
  }

  public open fun _fontGetSubpixelPositioning(fontRid: RID): TextServer.SubpixelPositioning {
    throw NotImplementedError("font_get_subpixel_positioning is not implemented for TextServerExtension")
  }

  public open fun _fontSetEmbolden(fontRid: RID, strength: Double): Unit {
  }

  public open fun _fontGetEmbolden(fontRid: RID): Double {
    throw NotImplementedError("font_get_embolden is not implemented for TextServerExtension")
  }

  public open fun _fontSetTransform(fontRid: RID, transform: Transform2D): Unit {
  }

  public open fun _fontGetTransform(fontRid: RID): Transform2D {
    throw NotImplementedError("font_get_transform is not implemented for TextServerExtension")
  }

  public open fun _fontSetVariationCoordinates(fontRid: RID,
      variationCoordinates: Dictionary<Any?, Any?>): Unit {
  }

  public open fun _fontGetVariationCoordinates(fontRid: RID): Dictionary<Any?, Any?> {
    throw NotImplementedError("font_get_variation_coordinates is not implemented for TextServerExtension")
  }

  public open fun _fontSetOversampling(fontRid: RID, oversampling: Double): Unit {
  }

  public open fun _fontGetOversampling(fontRid: RID): Double {
    throw NotImplementedError("font_get_oversampling is not implemented for TextServerExtension")
  }

  public open fun _fontGetSizeCacheList(fontRid: RID): VariantArray<Any?> {
    throw NotImplementedError("font_get_size_cache_list is not implemented for TextServerExtension")
  }

  public open fun _fontClearSizeCache(fontRid: RID): Unit {
  }

  public open fun _fontRemoveSizeCache(fontRid: RID, size: Vector2i): Unit {
  }

  public open fun _fontSetAscent(
    fontRid: RID,
    size: Long,
    ascent: Double
  ): Unit {
  }

  public open fun _fontGetAscent(fontRid: RID, size: Long): Double {
    throw NotImplementedError("font_get_ascent is not implemented for TextServerExtension")
  }

  public open fun _fontSetDescent(
    fontRid: RID,
    size: Long,
    descent: Double
  ): Unit {
  }

  public open fun _fontGetDescent(fontRid: RID, size: Long): Double {
    throw NotImplementedError("font_get_descent is not implemented for TextServerExtension")
  }

  public open fun _fontSetUnderlinePosition(
    fontRid: RID,
    size: Long,
    underlinePosition: Double
  ): Unit {
  }

  public open fun _fontGetUnderlinePosition(fontRid: RID, size: Long): Double {
    throw NotImplementedError("font_get_underline_position is not implemented for TextServerExtension")
  }

  public open fun _fontSetUnderlineThickness(
    fontRid: RID,
    size: Long,
    underlineThickness: Double
  ): Unit {
  }

  public open fun _fontGetUnderlineThickness(fontRid: RID, size: Long): Double {
    throw NotImplementedError("font_get_underline_thickness is not implemented for TextServerExtension")
  }

  public open fun _fontSetScale(
    fontRid: RID,
    size: Long,
    scale: Double
  ): Unit {
  }

  public open fun _fontGetScale(fontRid: RID, size: Long): Double {
    throw NotImplementedError("font_get_scale is not implemented for TextServerExtension")
  }

  public open fun _fontSetSpacing(
    fontRid: RID,
    size: Long,
    spacing: TextServer.SpacingType,
    `value`: Long
  ): Unit {
  }

  public open fun _fontGetSpacing(
    fontRid: RID,
    size: Long,
    spacing: TextServer.SpacingType
  ): Long {
    throw NotImplementedError("font_get_spacing is not implemented for TextServerExtension")
  }

  public open fun _fontGetTextureCount(fontRid: RID, size: Vector2i): Long {
    throw NotImplementedError("font_get_texture_count is not implemented for TextServerExtension")
  }

  public open fun _fontClearTextures(fontRid: RID, size: Vector2i): Unit {
  }

  public open fun _fontRemoveTexture(
    fontRid: RID,
    size: Vector2i,
    textureIndex: Long
  ): Unit {
  }

  public open fun _fontSetTextureImage(
    fontRid: RID,
    size: Vector2i,
    textureIndex: Long,
    image: Image
  ): Unit {
  }

  public open fun _fontGetTextureImage(
    fontRid: RID,
    size: Vector2i,
    textureIndex: Long
  ): Image? {
    throw NotImplementedError("font_get_texture_image is not implemented for TextServerExtension")
  }

  public open fun _fontSetTextureOffsets(
    fontRid: RID,
    size: Vector2i,
    textureIndex: Long,
    offset: PackedInt32Array
  ): Unit {
  }

  public open fun _fontGetTextureOffsets(
    fontRid: RID,
    size: Vector2i,
    textureIndex: Long
  ): PackedInt32Array {
    throw NotImplementedError("font_get_texture_offsets is not implemented for TextServerExtension")
  }

  public open fun _fontGetGlyphList(fontRid: RID, size: Vector2i): VariantArray<Any?> {
    throw NotImplementedError("font_get_glyph_list is not implemented for TextServerExtension")
  }

  public open fun _fontClearGlyphs(fontRid: RID, size: Vector2i): Unit {
  }

  public open fun _fontRemoveGlyph(
    fontRid: RID,
    size: Vector2i,
    glyph: Long
  ): Unit {
  }

  public open fun _fontGetGlyphAdvance(
    fontRid: RID,
    size: Long,
    glyph: Long
  ): Vector2 {
    throw NotImplementedError("font_get_glyph_advance is not implemented for TextServerExtension")
  }

  public open fun _fontSetGlyphAdvance(
    fontRid: RID,
    size: Long,
    glyph: Long,
    advance: Vector2
  ): Unit {
  }

  public open fun _fontGetGlyphOffset(
    fontRid: RID,
    size: Vector2i,
    glyph: Long
  ): Vector2 {
    throw NotImplementedError("font_get_glyph_offset is not implemented for TextServerExtension")
  }

  public open fun _fontSetGlyphOffset(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
    offset: Vector2
  ): Unit {
  }

  public open fun _fontGetGlyphSize(
    fontRid: RID,
    size: Vector2i,
    glyph: Long
  ): Vector2 {
    throw NotImplementedError("font_get_glyph_size is not implemented for TextServerExtension")
  }

  public open fun _fontSetGlyphSize(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
    glSize: Vector2
  ): Unit {
  }

  public open fun _fontGetGlyphUvRect(
    fontRid: RID,
    size: Vector2i,
    glyph: Long
  ): Rect2 {
    throw NotImplementedError("font_get_glyph_uv_rect is not implemented for TextServerExtension")
  }

  public open fun _fontSetGlyphUvRect(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
    uvRect: Rect2
  ): Unit {
  }

  public open fun _fontGetGlyphTextureIdx(
    fontRid: RID,
    size: Vector2i,
    glyph: Long
  ): Long {
    throw NotImplementedError("font_get_glyph_texture_idx is not implemented for TextServerExtension")
  }

  public open fun _fontSetGlyphTextureIdx(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
    textureIdx: Long
  ): Unit {
  }

  public open fun _fontGetGlyphContours(
    fontRid: RID,
    size: Long,
    index: Long
  ): Dictionary<Any?, Any?> {
    throw NotImplementedError("font_get_glyph_contours is not implemented for TextServerExtension")
  }

  public open fun _fontGetKerningList(fontRid: RID, size: Long): VariantArray<Any?> {
    throw NotImplementedError("font_get_kerning_list is not implemented for TextServerExtension")
  }

  public open fun _fontClearKerningMap(fontRid: RID, size: Long): Unit {
  }

  public open fun _fontRemoveKerning(
    fontRid: RID,
    size: Long,
    glyphPair: Vector2i
  ): Unit {
  }

  public open fun _fontSetKerning(
    fontRid: RID,
    size: Long,
    glyphPair: Vector2i,
    kerning: Vector2
  ): Unit {
  }

  public open fun _fontGetKerning(
    fontRid: RID,
    size: Long,
    glyphPair: Vector2i
  ): Vector2 {
    throw NotImplementedError("font_get_kerning is not implemented for TextServerExtension")
  }

  public open fun _fontGetGlyphIndex(
    fontRid: RID,
    size: Long,
    char: Long,
    variationSelector: Long
  ): Long {
    throw NotImplementedError("font_get_glyph_index is not implemented for TextServerExtension")
  }

  public open fun _fontHasChar(fontRid: RID, char: Long): Boolean {
    throw NotImplementedError("font_has_char is not implemented for TextServerExtension")
  }

  public open fun _fontGetSupportedChars(fontRid: RID): String {
    throw NotImplementedError("font_get_supported_chars is not implemented for TextServerExtension")
  }

  public open fun _fontRenderRange(
    fontRid: RID,
    size: Vector2i,
    start: Long,
    end: Long
  ): Unit {
  }

  public open fun _fontRenderGlyph(
    fontRid: RID,
    size: Vector2i,
    index: Long
  ): Unit {
  }

  public open fun _fontDrawGlyph(
    fontRid: RID,
    canvas: RID,
    size: Long,
    pos: Vector2,
    index: Long,
    color: Color
  ): Unit {
  }

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

  public open fun _fontIsLanguageSupported(fontRid: RID, language: String): Boolean {
    throw NotImplementedError("font_is_language_supported is not implemented for TextServerExtension")
  }

  public open fun _fontSetLanguageSupportOverride(
    fontRid: RID,
    language: String,
    supported: Boolean
  ): Unit {
  }

  public open fun _fontGetLanguageSupportOverride(fontRid: RID, language: String): Boolean {
    throw NotImplementedError("font_get_language_support_override is not implemented for TextServerExtension")
  }

  public open fun _fontRemoveLanguageSupportOverride(fontRid: RID, language: String): Unit {
  }

  public open fun _fontGetLanguageSupportOverrides(fontRid: RID): PackedStringArray {
    throw NotImplementedError("font_get_language_support_overrides is not implemented for TextServerExtension")
  }

  public open fun _fontIsScriptSupported(fontRid: RID, script: String): Boolean {
    throw NotImplementedError("font_is_script_supported is not implemented for TextServerExtension")
  }

  public open fun _fontSetScriptSupportOverride(
    fontRid: RID,
    script: String,
    supported: Boolean
  ): Unit {
  }

  public open fun _fontGetScriptSupportOverride(fontRid: RID, script: String): Boolean {
    throw NotImplementedError("font_get_script_support_override is not implemented for TextServerExtension")
  }

  public open fun _fontRemoveScriptSupportOverride(fontRid: RID, script: String): Unit {
  }

  public open fun _fontGetScriptSupportOverrides(fontRid: RID): PackedStringArray {
    throw NotImplementedError("font_get_script_support_overrides is not implemented for TextServerExtension")
  }

  public open fun _fontSetOpentypeFeatureOverrides(fontRid: RID, overrides: Dictionary<Any?, Any?>):
      Unit {
  }

  public open fun _fontGetOpentypeFeatureOverrides(fontRid: RID): Dictionary<Any?, Any?> {
    throw NotImplementedError("font_get_opentype_feature_overrides is not implemented for TextServerExtension")
  }

  public open fun _fontSupportedFeatureList(fontRid: RID): Dictionary<Any?, Any?> {
    throw NotImplementedError("font_supported_feature_list is not implemented for TextServerExtension")
  }

  public open fun _fontSupportedVariationList(fontRid: RID): Dictionary<Any?, Any?> {
    throw NotImplementedError("font_supported_variation_list is not implemented for TextServerExtension")
  }

  public open fun _fontGetGlobalOversampling(): Double {
    throw NotImplementedError("font_get_global_oversampling is not implemented for TextServerExtension")
  }

  public open fun _fontSetGlobalOversampling(oversampling: Double): Unit {
  }

  public open fun _getHexCodeBoxSize(size: Long, index: Long): Vector2 {
    throw NotImplementedError("get_hex_code_box_size is not implemented for TextServerExtension")
  }

  public open fun _drawHexCodeBox(
    canvas: RID,
    size: Long,
    pos: Vector2,
    index: Long,
    color: Color
  ): Unit {
  }

  public open fun _createShapedText(direction: TextServer.Direction,
      orientation: TextServer.Orientation): RID {
    throw NotImplementedError("create_shaped_text is not implemented for TextServerExtension")
  }

  public open fun _shapedTextClear(shaped: RID): Unit {
  }

  public open fun _shapedTextSetDirection(shaped: RID, direction: TextServer.Direction): Unit {
  }

  public open fun _shapedTextGetDirection(shaped: RID): TextServer.Direction {
    throw NotImplementedError("shaped_text_get_direction is not implemented for TextServerExtension")
  }

  public open fun _shapedTextGetInferredDirection(shaped: RID): TextServer.Direction {
    throw NotImplementedError("shaped_text_get_inferred_direction is not implemented for TextServerExtension")
  }

  public open fun _shapedTextSetBidiOverride(shaped: RID, `override`: VariantArray<Any?>): Unit {
  }

  public open fun _shapedTextSetCustomPunctuation(shaped: RID, punct: String): Unit {
  }

  public open fun _shapedTextGetCustomPunctuation(shaped: RID): String {
    throw NotImplementedError("shaped_text_get_custom_punctuation is not implemented for TextServerExtension")
  }

  public open fun _shapedTextSetOrientation(shaped: RID, orientation: TextServer.Orientation):
      Unit {
  }

  public open fun _shapedTextGetOrientation(shaped: RID): TextServer.Orientation {
    throw NotImplementedError("shaped_text_get_orientation is not implemented for TextServerExtension")
  }

  public open fun _shapedTextSetPreserveInvalid(shaped: RID, enabled: Boolean): Unit {
  }

  public open fun _shapedTextGetPreserveInvalid(shaped: RID): Boolean {
    throw NotImplementedError("shaped_text_get_preserve_invalid is not implemented for TextServerExtension")
  }

  public open fun _shapedTextSetPreserveControl(shaped: RID, enabled: Boolean): Unit {
  }

  public open fun _shapedTextGetPreserveControl(shaped: RID): Boolean {
    throw NotImplementedError("shaped_text_get_preserve_control is not implemented for TextServerExtension")
  }

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

  public open fun _shapedTextAddObject(
    shaped: RID,
    key: Any,
    size: Vector2,
    inlineAlign: InlineAlignment,
    length: Long
  ): Boolean {
    throw NotImplementedError("shaped_text_add_object is not implemented for TextServerExtension")
  }

  public open fun _shapedTextResizeObject(
    shaped: RID,
    key: Any,
    size: Vector2,
    inlineAlign: InlineAlignment
  ): Boolean {
    throw NotImplementedError("shaped_text_resize_object is not implemented for TextServerExtension")
  }

  public open fun _shapedGetSpanCount(shaped: RID): Long {
    throw NotImplementedError("shaped_get_span_count is not implemented for TextServerExtension")
  }

  public open fun _shapedGetSpanMeta(shaped: RID, index: Long): Any? {
    throw NotImplementedError("shaped_get_span_meta is not implemented for TextServerExtension")
  }

  public open fun _shapedSetSpanUpdateFont(
    shaped: RID,
    index: Long,
    fonts: VariantArray<Any?>,
    size: Long,
    opentypeFeatures: Dictionary<Any?, Any?>
  ): Unit {
  }

  public open fun _shapedTextSubstr(
    shaped: RID,
    start: Long,
    length: Long
  ): RID {
    throw NotImplementedError("shaped_text_substr is not implemented for TextServerExtension")
  }

  public open fun _shapedTextGetParent(shaped: RID): RID {
    throw NotImplementedError("shaped_text_get_parent is not implemented for TextServerExtension")
  }

  public open fun _shapedTextFitToWidth(
    shaped: RID,
    width: Double,
    jstFlags: Long
  ): Double {
    throw NotImplementedError("shaped_text_fit_to_width is not implemented for TextServerExtension")
  }

  public open fun _shapedTextTabAlign(shaped: RID, tabStops: PackedFloat32Array): Double {
    throw NotImplementedError("shaped_text_tab_align is not implemented for TextServerExtension")
  }

  public open fun _shapedTextShape(shaped: RID): Boolean {
    throw NotImplementedError("shaped_text_shape is not implemented for TextServerExtension")
  }

  public open fun _shapedTextUpdateBreaks(shaped: RID): Boolean {
    throw NotImplementedError("shaped_text_update_breaks is not implemented for TextServerExtension")
  }

  public open fun _shapedTextUpdateJustificationOps(shaped: RID): Boolean {
    throw NotImplementedError("shaped_text_update_justification_ops is not implemented for TextServerExtension")
  }

  public open fun _shapedTextIsReady(shaped: RID): Boolean {
    throw NotImplementedError("shaped_text_is_ready is not implemented for TextServerExtension")
  }

  public open fun _shapedTextGetGlyphCount(shaped: RID): Long {
    throw NotImplementedError("shaped_text_get_glyph_count is not implemented for TextServerExtension")
  }

  public open fun _shapedTextGetRange(shaped: RID): Vector2i {
    throw NotImplementedError("shaped_text_get_range is not implemented for TextServerExtension")
  }

  public open fun _shapedTextGetLineBreaksAdv(
    shaped: RID,
    width: PackedFloat32Array,
    start: Long,
    once: Boolean,
    breakFlags: Long
  ): PackedInt32Array {
    throw NotImplementedError("shaped_text_get_line_breaks_adv is not implemented for TextServerExtension")
  }

  public open fun _shapedTextGetLineBreaks(
    shaped: RID,
    width: Double,
    start: Long,
    breakFlags: Long
  ): PackedInt32Array {
    throw NotImplementedError("shaped_text_get_line_breaks is not implemented for TextServerExtension")
  }

  public open fun _shapedTextGetWordBreaks(shaped: RID, graphemeFlags: Long): PackedInt32Array {
    throw NotImplementedError("shaped_text_get_word_breaks is not implemented for TextServerExtension")
  }

  public open fun _shapedTextGetTrimPos(shaped: RID): Long {
    throw NotImplementedError("shaped_text_get_trim_pos is not implemented for TextServerExtension")
  }

  public open fun _shapedTextGetEllipsisPos(shaped: RID): Long {
    throw NotImplementedError("shaped_text_get_ellipsis_pos is not implemented for TextServerExtension")
  }

  public open fun _shapedTextGetEllipsisGlyphCount(shaped: RID): Long {
    throw NotImplementedError("shaped_text_get_ellipsis_glyph_count is not implemented for TextServerExtension")
  }

  public open fun _shapedTextOverrunTrimToWidth(
    shaped: RID,
    width: Double,
    trimFlags: Long
  ): Unit {
  }

  public open fun _shapedTextGetObjects(shaped: RID): VariantArray<Any?> {
    throw NotImplementedError("shaped_text_get_objects is not implemented for TextServerExtension")
  }

  public open fun _shapedTextGetObjectRect(shaped: RID, key: Any): Rect2 {
    throw NotImplementedError("shaped_text_get_object_rect is not implemented for TextServerExtension")
  }

  public open fun _shapedTextGetSize(shaped: RID): Vector2 {
    throw NotImplementedError("shaped_text_get_size is not implemented for TextServerExtension")
  }

  public open fun _shapedTextGetAscent(shaped: RID): Double {
    throw NotImplementedError("shaped_text_get_ascent is not implemented for TextServerExtension")
  }

  public open fun _shapedTextGetDescent(shaped: RID): Double {
    throw NotImplementedError("shaped_text_get_descent is not implemented for TextServerExtension")
  }

  public open fun _shapedTextGetWidth(shaped: RID): Double {
    throw NotImplementedError("shaped_text_get_width is not implemented for TextServerExtension")
  }

  public open fun _shapedTextGetUnderlinePosition(shaped: RID): Double {
    throw NotImplementedError("shaped_text_get_underline_position is not implemented for TextServerExtension")
  }

  public open fun _shapedTextGetUnderlineThickness(shaped: RID): Double {
    throw NotImplementedError("shaped_text_get_underline_thickness is not implemented for TextServerExtension")
  }

  public open fun _shapedTextGetDominantDirectionInRange(
    shaped: RID,
    start: Long,
    end: Long
  ): Long {
    throw NotImplementedError("shaped_text_get_dominant_direction_in_range is not implemented for TextServerExtension")
  }

  public open fun _shapedTextGetSelection(
    shaped: RID,
    start: Long,
    end: Long
  ): PackedVector2Array {
    throw NotImplementedError("shaped_text_get_selection is not implemented for TextServerExtension")
  }

  public open fun _shapedTextHitTestGrapheme(shaped: RID, coord: Double): Long {
    throw NotImplementedError("shaped_text_hit_test_grapheme is not implemented for TextServerExtension")
  }

  public open fun _shapedTextHitTestPosition(shaped: RID, coord: Double): Long {
    throw NotImplementedError("shaped_text_hit_test_position is not implemented for TextServerExtension")
  }

  public open fun _shapedTextDraw(
    shaped: RID,
    canvas: RID,
    pos: Vector2,
    clipL: Double,
    clipR: Double,
    color: Color
  ): Unit {
  }

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

  public open fun _shapedTextGetGraphemeBounds(shaped: RID, pos: Long): Vector2 {
    throw NotImplementedError("shaped_text_get_grapheme_bounds is not implemented for TextServerExtension")
  }

  public open fun _shapedTextNextGraphemePos(shaped: RID, pos: Long): Long {
    throw NotImplementedError("shaped_text_next_grapheme_pos is not implemented for TextServerExtension")
  }

  public open fun _shapedTextPrevGraphemePos(shaped: RID, pos: Long): Long {
    throw NotImplementedError("shaped_text_prev_grapheme_pos is not implemented for TextServerExtension")
  }

  public open fun _formatNumber(string: String, language: String): String {
    throw NotImplementedError("format_number is not implemented for TextServerExtension")
  }

  public open fun _parseNumber(string: String, language: String): String {
    throw NotImplementedError("parse_number is not implemented for TextServerExtension")
  }

  public open fun _percentSign(language: String): String {
    throw NotImplementedError("percent_sign is not implemented for TextServerExtension")
  }

  public open fun _stripDiacritics(string: String): String {
    throw NotImplementedError("strip_diacritics is not implemented for TextServerExtension")
  }

  public open fun _stringToUpper(string: String, language: String): String {
    throw NotImplementedError("string_to_upper is not implemented for TextServerExtension")
  }

  public open fun _stringToLower(string: String, language: String): String {
    throw NotImplementedError("string_to_lower is not implemented for TextServerExtension")
  }

  public companion object
}
