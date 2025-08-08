// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Dictionary
import godot.core.InlineAlignment
import godot.core.PackedInt32Array
import godot.core.RID
import godot.core.Rect2
import godot.core.VariantArray
import godot.core.Vector2
import godot.core.Vector2i
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress

/**
 * An implementation of [TextServer] that uses HarfBuzz, ICU and SIL Graphite to support BiDi, complex text layouts and contextual OpenType features. This is Godot's default primary [TextServer] interface.
 */
@GodotBaseType
public open class TextServerAdvanced : TextServerExtension() {
  override fun new(scriptIndex: Int) {
    createNativeObject(660, scriptIndex)
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _hasFeature(feature: TextServer.Feature): Boolean {
    throw NotImplementedError("TextServerAdvanced::_hasFeature can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _getName(): String {
    throw NotImplementedError("TextServerAdvanced::_getName can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _getFeatures(): Long {
    throw NotImplementedError("TextServerAdvanced::_getFeatures can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _freeRid(rid: RID): Unit {
    throw NotImplementedError("TextServerAdvanced::_freeRid can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _has(rid: RID): Boolean {
    throw NotImplementedError("TextServerAdvanced::_has can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _createFont(): RID {
    throw NotImplementedError("TextServerAdvanced::_createFont can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontSetFixedSize(fontRid: RID, fixedSize: Long): Unit {
    throw NotImplementedError("TextServerAdvanced::_fontSetFixedSize can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontGetFixedSize(fontRid: RID): Long {
    throw NotImplementedError("TextServerAdvanced::_fontGetFixedSize can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontSetFixedSizeScaleMode(fontRid: RID,
      fixedSizeScaleMode: TextServer.FixedSizeScaleMode): Unit {
    throw NotImplementedError("TextServerAdvanced::_fontSetFixedSizeScaleMode can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontGetFixedSizeScaleMode(fontRid: RID): TextServer.FixedSizeScaleMode {
    throw NotImplementedError("TextServerAdvanced::_fontGetFixedSizeScaleMode can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontGetSizeCacheList(fontRid: RID): VariantArray<Vector2i> {
    throw NotImplementedError("TextServerAdvanced::_fontGetSizeCacheList can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontClearSizeCache(fontRid: RID): Unit {
    throw NotImplementedError("TextServerAdvanced::_fontClearSizeCache can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontRemoveSizeCache(fontRid: RID, size: Vector2i): Unit {
    throw NotImplementedError("TextServerAdvanced::_fontRemoveSizeCache can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontSetAscent(
    fontRid: RID,
    size: Long,
    ascent: Double,
  ): Unit {
    throw NotImplementedError("TextServerAdvanced::_fontSetAscent can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontGetAscent(fontRid: RID, size: Long): Double {
    throw NotImplementedError("TextServerAdvanced::_fontGetAscent can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontSetDescent(
    fontRid: RID,
    size: Long,
    descent: Double,
  ): Unit {
    throw NotImplementedError("TextServerAdvanced::_fontSetDescent can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontGetDescent(fontRid: RID, size: Long): Double {
    throw NotImplementedError("TextServerAdvanced::_fontGetDescent can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontSetUnderlinePosition(
    fontRid: RID,
    size: Long,
    underlinePosition: Double,
  ): Unit {
    throw NotImplementedError("TextServerAdvanced::_fontSetUnderlinePosition can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontGetUnderlinePosition(fontRid: RID, size: Long): Double {
    throw NotImplementedError("TextServerAdvanced::_fontGetUnderlinePosition can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontSetUnderlineThickness(
    fontRid: RID,
    size: Long,
    underlineThickness: Double,
  ): Unit {
    throw NotImplementedError("TextServerAdvanced::_fontSetUnderlineThickness can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontGetUnderlineThickness(fontRid: RID, size: Long): Double {
    throw NotImplementedError("TextServerAdvanced::_fontGetUnderlineThickness can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontSetScale(
    fontRid: RID,
    size: Long,
    scale: Double,
  ): Unit {
    throw NotImplementedError("TextServerAdvanced::_fontSetScale can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontGetScale(fontRid: RID, size: Long): Double {
    throw NotImplementedError("TextServerAdvanced::_fontGetScale can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontGetTextureCount(fontRid: RID, size: Vector2i): Long {
    throw NotImplementedError("TextServerAdvanced::_fontGetTextureCount can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontClearTextures(fontRid: RID, size: Vector2i): Unit {
    throw NotImplementedError("TextServerAdvanced::_fontClearTextures can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontRemoveTexture(
    fontRid: RID,
    size: Vector2i,
    textureIndex: Long,
  ): Unit {
    throw NotImplementedError("TextServerAdvanced::_fontRemoveTexture can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontSetTextureImage(
    fontRid: RID,
    size: Vector2i,
    textureIndex: Long,
    image: Image?,
  ): Unit {
    throw NotImplementedError("TextServerAdvanced::_fontSetTextureImage can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontGetTextureImage(
    fontRid: RID,
    size: Vector2i,
    textureIndex: Long,
  ): Image? {
    throw NotImplementedError("TextServerAdvanced::_fontGetTextureImage can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontGetGlyphList(fontRid: RID, size: Vector2i): PackedInt32Array {
    throw NotImplementedError("TextServerAdvanced::_fontGetGlyphList can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontClearGlyphs(fontRid: RID, size: Vector2i): Unit {
    throw NotImplementedError("TextServerAdvanced::_fontClearGlyphs can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontRemoveGlyph(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
  ): Unit {
    throw NotImplementedError("TextServerAdvanced::_fontRemoveGlyph can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontGetGlyphAdvance(
    fontRid: RID,
    size: Long,
    glyph: Long,
  ): Vector2 {
    throw NotImplementedError("TextServerAdvanced::_fontGetGlyphAdvance can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontSetGlyphAdvance(
    fontRid: RID,
    size: Long,
    glyph: Long,
    advance: Vector2,
  ): Unit {
    throw NotImplementedError("TextServerAdvanced::_fontSetGlyphAdvance can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontGetGlyphOffset(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
  ): Vector2 {
    throw NotImplementedError("TextServerAdvanced::_fontGetGlyphOffset can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontSetGlyphOffset(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
    offset: Vector2,
  ): Unit {
    throw NotImplementedError("TextServerAdvanced::_fontSetGlyphOffset can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontGetGlyphSize(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
  ): Vector2 {
    throw NotImplementedError("TextServerAdvanced::_fontGetGlyphSize can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontSetGlyphSize(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
    glSize: Vector2,
  ): Unit {
    throw NotImplementedError("TextServerAdvanced::_fontSetGlyphSize can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontGetGlyphUvRect(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
  ): Rect2 {
    throw NotImplementedError("TextServerAdvanced::_fontGetGlyphUvRect can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontSetGlyphUvRect(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
    uvRect: Rect2,
  ): Unit {
    throw NotImplementedError("TextServerAdvanced::_fontSetGlyphUvRect can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontGetGlyphTextureIdx(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
  ): Long {
    throw NotImplementedError("TextServerAdvanced::_fontGetGlyphTextureIdx can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontSetGlyphTextureIdx(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
    textureIdx: Long,
  ): Unit {
    throw NotImplementedError("TextServerAdvanced::_fontSetGlyphTextureIdx can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontGetGlyphTextureRid(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
  ): RID {
    throw NotImplementedError("TextServerAdvanced::_fontGetGlyphTextureRid can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontGetGlyphTextureSize(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
  ): Vector2 {
    throw NotImplementedError("TextServerAdvanced::_fontGetGlyphTextureSize can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontGetGlyphIndex(
    fontRid: RID,
    size: Long,
    char: Long,
    variationSelector: Long,
  ): Long {
    throw NotImplementedError("TextServerAdvanced::_fontGetGlyphIndex can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontGetCharFromGlyphIndex(
    fontRid: RID,
    size: Long,
    glyphIndex: Long,
  ): Long {
    throw NotImplementedError("TextServerAdvanced::_fontGetCharFromGlyphIndex can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontHasChar(fontRid: RID, char: Long): Boolean {
    throw NotImplementedError("TextServerAdvanced::_fontHasChar can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontGetSupportedChars(fontRid: RID): String {
    throw NotImplementedError("TextServerAdvanced::_fontGetSupportedChars can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontGetSupportedGlyphs(fontRid: RID): PackedInt32Array {
    throw NotImplementedError("TextServerAdvanced::_fontGetSupportedGlyphs can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontDrawGlyph(
    fontRid: RID,
    canvas: RID,
    size: Long,
    pos: Vector2,
    index: Long,
    color: Color,
  ): Unit {
    throw NotImplementedError("TextServerAdvanced::_fontDrawGlyph can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _fontDrawGlyphOutline(
    fontRid: RID,
    canvas: RID,
    size: Long,
    outlineSize: Long,
    pos: Vector2,
    index: Long,
    color: Color,
  ): Unit {
    throw NotImplementedError("TextServerAdvanced::_fontDrawGlyphOutline can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _createShapedText(direction: TextServer.Direction,
      orientation: TextServer.Orientation): RID {
    throw NotImplementedError("TextServerAdvanced::_createShapedText can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _shapedTextClear(shaped: RID): Unit {
    throw NotImplementedError("TextServerAdvanced::_shapedTextClear can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _shapedTextAddString(
    shaped: RID,
    text: String,
    fonts: VariantArray<RID>,
    size: Long,
    opentypeFeatures: Dictionary<Any?, Any?>,
    language: String,
    meta: Any?,
  ): Boolean {
    throw NotImplementedError("TextServerAdvanced::_shapedTextAddString can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _shapedTextAddObject(
    shaped: RID,
    key: Any?,
    size: Vector2,
    inlineAlign: InlineAlignment,
    length: Long,
    baseline: Double,
  ): Boolean {
    throw NotImplementedError("TextServerAdvanced::_shapedTextAddObject can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _shapedTextResizeObject(
    shaped: RID,
    key: Any?,
    size: Vector2,
    inlineAlign: InlineAlignment,
    baseline: Double,
  ): Boolean {
    throw NotImplementedError("TextServerAdvanced::_shapedTextResizeObject can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _shapedGetSpanCount(shaped: RID): Long {
    throw NotImplementedError("TextServerAdvanced::_shapedGetSpanCount can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _shapedGetSpanMeta(shaped: RID, index: Long): Any? {
    throw NotImplementedError("TextServerAdvanced::_shapedGetSpanMeta can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _shapedGetSpanEmbeddedObject(shaped: RID, index: Long): Any? {
    throw NotImplementedError("TextServerAdvanced::_shapedGetSpanEmbeddedObject can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _shapedSetSpanUpdateFont(
    shaped: RID,
    index: Long,
    fonts: VariantArray<RID>,
    size: Long,
    opentypeFeatures: Dictionary<Any?, Any?>,
  ): Unit {
    throw NotImplementedError("TextServerAdvanced::_shapedSetSpanUpdateFont can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _shapedTextSubstr(
    shaped: RID,
    start: Long,
    length: Long,
  ): RID {
    throw NotImplementedError("TextServerAdvanced::_shapedTextSubstr can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _shapedTextGetParent(shaped: RID): RID {
    throw NotImplementedError("TextServerAdvanced::_shapedTextGetParent can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _shapedTextShape(shaped: RID): Boolean {
    throw NotImplementedError("TextServerAdvanced::_shapedTextShape can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _shapedTextIsReady(shaped: RID): Boolean {
    throw NotImplementedError("TextServerAdvanced::_shapedTextIsReady can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _shapedTextGetGlyphCount(shaped: RID): Long {
    throw NotImplementedError("TextServerAdvanced::_shapedTextGetGlyphCount can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _shapedTextGetRange(shaped: RID): Vector2i {
    throw NotImplementedError("TextServerAdvanced::_shapedTextGetRange can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _shapedTextGetTrimPos(shaped: RID): Long {
    throw NotImplementedError("TextServerAdvanced::_shapedTextGetTrimPos can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _shapedTextGetEllipsisPos(shaped: RID): Long {
    throw NotImplementedError("TextServerAdvanced::_shapedTextGetEllipsisPos can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _shapedTextGetEllipsisGlyphCount(shaped: RID): Long {
    throw NotImplementedError("TextServerAdvanced::_shapedTextGetEllipsisGlyphCount can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _shapedTextGetObjects(shaped: RID): VariantArray<Any?> {
    throw NotImplementedError("TextServerAdvanced::_shapedTextGetObjects can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _shapedTextGetObjectRect(shaped: RID, key: Any?): Rect2 {
    throw NotImplementedError("TextServerAdvanced::_shapedTextGetObjectRect can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _shapedTextGetObjectRange(shaped: RID, key: Any?): Vector2i {
    throw NotImplementedError("TextServerAdvanced::_shapedTextGetObjectRange can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _shapedTextGetObjectGlyph(shaped: RID, key: Any?): Long {
    throw NotImplementedError("TextServerAdvanced::_shapedTextGetObjectGlyph can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _shapedTextGetSize(shaped: RID): Vector2 {
    throw NotImplementedError("TextServerAdvanced::_shapedTextGetSize can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _shapedTextGetAscent(shaped: RID): Double {
    throw NotImplementedError("TextServerAdvanced::_shapedTextGetAscent can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _shapedTextGetDescent(shaped: RID): Double {
    throw NotImplementedError("TextServerAdvanced::_shapedTextGetDescent can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _shapedTextGetWidth(shaped: RID): Double {
    throw NotImplementedError("TextServerAdvanced::_shapedTextGetWidth can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _shapedTextGetUnderlinePosition(shaped: RID): Double {
    throw NotImplementedError("TextServerAdvanced::_shapedTextGetUnderlinePosition can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _shapedTextGetUnderlineThickness(shaped: RID): Double {
    throw NotImplementedError("TextServerAdvanced::_shapedTextGetUnderlineThickness can't be called from the JVM.")
  }

  public companion object

  public object MethodBindings
}
