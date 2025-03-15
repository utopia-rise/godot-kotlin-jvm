// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
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
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DICTIONARY
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_BYTE_ARRAY
import godot.core.VariantParser.PACKED_FLOAT_32_ARRAY
import godot.core.VariantParser.PACKED_INT_32_ARRAY
import godot.core.VariantParser.PACKED_STRING_ARRAY
import godot.core.VariantParser.PACKED_VECTOR2_ARRAY
import godot.core.VariantParser.RECT2
import godot.core.VariantParser.STRING
import godot.core.VariantParser.TRANSFORM2D
import godot.core.VariantParser.VECTOR2
import godot.core.VariantParser.VECTOR2I
import godot.core.VariantParser._RID
import godot.core.Vector2
import godot.core.Vector2i
import godot.core.Vector3i
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmOverloads

public infix fun Long.or(other: TextServer.JustificationFlag): Long = this.or(other.flag)

public infix fun Long.xor(other: TextServer.JustificationFlag): Long = this.xor(other.flag)

public infix fun Long.and(other: TextServer.JustificationFlag): Long = this.and(other.flag)

public infix fun Long.or(other: TextServer.LineBreakFlag): Long = this.or(other.flag)

public infix fun Long.xor(other: TextServer.LineBreakFlag): Long = this.xor(other.flag)

public infix fun Long.and(other: TextServer.LineBreakFlag): Long = this.and(other.flag)

public infix fun Long.or(other: TextServer.TextOverrunFlag): Long = this.or(other.flag)

public infix fun Long.xor(other: TextServer.TextOverrunFlag): Long = this.xor(other.flag)

public infix fun Long.and(other: TextServer.TextOverrunFlag): Long = this.and(other.flag)

public infix fun Long.or(other: TextServer.GraphemeFlag): Long = this.or(other.flag)

public infix fun Long.xor(other: TextServer.GraphemeFlag): Long = this.xor(other.flag)

public infix fun Long.and(other: TextServer.GraphemeFlag): Long = this.and(other.flag)

public infix fun Long.or(other: TextServer.FontStyle): Long = this.or(other.flag)

public infix fun Long.xor(other: TextServer.FontStyle): Long = this.xor(other.flag)

public infix fun Long.and(other: TextServer.FontStyle): Long = this.and(other.flag)

/**
 * [TextServer] is the API backend for managing fonts and rendering text.
 * **Note:** This is a low-level API, consider using [TextLine], [TextParagraph], and [Font] classes
 * instead.
 * This is an abstract class, so to get the currently active [TextServer] instance, use the
 * following code:
 *
 * gdscript:
 * ```gdscript
 * var ts = TextServerManager.get_primary_interface()
 * ```
 * csharp:
 * ```csharp
 * var ts = TextServerManager.GetPrimaryInterface();
 * ```
 */
@GodotBaseType
public open class TextServer internal constructor() : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(662, scriptIndex)
  }

  /**
   * Returns `true` if the server supports a feature.
   */
  public final fun hasFeature(feature: Feature): Boolean {
    TransferContext.writeArguments(LONG to feature.id)
    TransferContext.callMethod(ptr, MethodBindings.hasFeaturePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the name of the server interface.
   */
  public final fun getName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns text server features, see [Feature].
   */
  public final fun getFeatures(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFeaturesPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Loads optional TextServer database (e.g. ICU break iterators and dictionaries).
   * **Note:** This function should be called before any other TextServer functions used, otherwise
   * it won't have any effect.
   */
  public final fun loadSupportData(filename: String): Boolean {
    TransferContext.writeArguments(STRING to filename)
    TransferContext.callMethod(ptr, MethodBindings.loadSupportDataPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns default TextServer database (e.g. ICU break iterators and dictionaries) filename.
   */
  public final fun getSupportDataFilename(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSupportDataFilenamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns TextServer database (e.g. ICU break iterators and dictionaries) description.
   */
  public final fun getSupportDataInfo(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSupportDataInfoPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Saves optional TextServer database (e.g. ICU break iterators and dictionaries) to the file.
   * **Note:** This function is used by during project export, to include TextServer database.
   */
  public final fun saveSupportData(filename: String): Boolean {
    TransferContext.writeArguments(STRING to filename)
    TransferContext.callMethod(ptr, MethodBindings.saveSupportDataPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns default TextServer database (e.g. ICU break iterators and dictionaries).
   */
  public final fun getSupportData(): PackedByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSupportDataPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY) as PackedByteArray)
  }

  /**
   * Returns `true` if locale is right-to-left.
   */
  public final fun isLocaleRightToLeft(locale: String): Boolean {
    TransferContext.writeArguments(STRING to locale)
    TransferContext.callMethod(ptr, MethodBindings.isLocaleRightToLeftPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Converts readable feature, variation, script, or language name to OpenType tag.
   */
  public final fun nameToTag(name: String): Long {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(ptr, MethodBindings.nameToTagPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Converts OpenType tag to readable feature, variation, script, or language name.
   */
  public final fun tagToName(tag: Long): String {
    TransferContext.writeArguments(LONG to tag)
    TransferContext.callMethod(ptr, MethodBindings.tagToNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns `true` if [rid] is valid resource owned by this text server.
   */
  public final fun has(rid: RID): Boolean {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(ptr, MethodBindings.hasPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Frees an object created by this [TextServer].
   */
  public final fun freeRid(rid: RID): Unit {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(ptr, MethodBindings.freeRidPtr, NIL)
  }

  /**
   * Creates a new, empty font cache entry resource. To free the resulting resource, use the
   * [freeRid] method.
   */
  public final fun createFont(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.createFontPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Creates a new variation existing font which is reusing the same glyph cache and font data. To
   * free the resulting resource, use the [freeRid] method.
   */
  public final fun createFontLinkedVariation(fontRid: RID): RID {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(ptr, MethodBindings.createFontLinkedVariationPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Sets font source data, e.g contents of the dynamic font source file.
   */
  public final fun fontSetData(fontRid: RID, `data`: PackedByteArray): Unit {
    TransferContext.writeArguments(_RID to fontRid, PACKED_BYTE_ARRAY to data)
    TransferContext.callMethod(ptr, MethodBindings.fontSetDataPtr, NIL)
  }

  /**
   * Sets an active face index in the TrueType / OpenType collection.
   */
  public final fun fontSetFaceIndex(fontRid: RID, faceIndex: Long): Unit {
    TransferContext.writeArguments(_RID to fontRid, LONG to faceIndex)
    TransferContext.callMethod(ptr, MethodBindings.fontSetFaceIndexPtr, NIL)
  }

  /**
   * Returns an active face index in the TrueType / OpenType collection.
   */
  public final fun fontGetFaceIndex(fontRid: RID): Long {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(ptr, MethodBindings.fontGetFaceIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns number of faces in the TrueType / OpenType collection.
   */
  public final fun fontGetFaceCount(fontRid: RID): Long {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(ptr, MethodBindings.fontGetFaceCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the font style flags, see [FontStyle].
   * **Note:** This value is used for font matching only and will not affect font rendering. Use
   * [fontSetFaceIndex], [fontSetVariationCoordinates], [fontSetEmbolden], or [fontSetTransform]
   * instead.
   */
  public final fun fontSetStyle(fontRid: RID, style: FontStyle): Unit {
    TransferContext.writeArguments(_RID to fontRid, LONG to style.flag)
    TransferContext.callMethod(ptr, MethodBindings.fontSetStylePtr, NIL)
  }

  /**
   * Returns font style flags, see [FontStyle].
   */
  public final fun fontGetStyle(fontRid: RID): FontStyle {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(ptr, MethodBindings.fontGetStylePtr, LONG)
    return FontStyle(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the font family name.
   */
  public final fun fontSetName(fontRid: RID, name: String): Unit {
    TransferContext.writeArguments(_RID to fontRid, STRING to name)
    TransferContext.callMethod(ptr, MethodBindings.fontSetNamePtr, NIL)
  }

  /**
   * Returns font family name.
   */
  public final fun fontGetName(fontRid: RID): String {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(ptr, MethodBindings.fontGetNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns [Dictionary] with OpenType font name strings (localized font names, version,
   * description, license information, sample text, etc.).
   */
  public final fun fontGetOtNameStrings(fontRid: RID): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(ptr, MethodBindings.fontGetOtNameStringsPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  /**
   * Sets the font style name.
   */
  public final fun fontSetStyleName(fontRid: RID, name: String): Unit {
    TransferContext.writeArguments(_RID to fontRid, STRING to name)
    TransferContext.callMethod(ptr, MethodBindings.fontSetStyleNamePtr, NIL)
  }

  /**
   * Returns font style name.
   */
  public final fun fontGetStyleName(fontRid: RID): String {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(ptr, MethodBindings.fontGetStyleNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Sets weight (boldness) of the font. A value in the `100...999` range, normal font weight is
   * `400`, bold font weight is `700`.
   * **Note:** This value is used for font matching only and will not affect font rendering. Use
   * [fontSetFaceIndex], [fontSetVariationCoordinates], or [fontSetEmbolden] instead.
   */
  public final fun fontSetWeight(fontRid: RID, weight: Long): Unit {
    TransferContext.writeArguments(_RID to fontRid, LONG to weight)
    TransferContext.callMethod(ptr, MethodBindings.fontSetWeightPtr, NIL)
  }

  /**
   * Returns weight (boldness) of the font. A value in the `100...999` range, normal font weight is
   * `400`, bold font weight is `700`.
   */
  public final fun fontGetWeight(fontRid: RID): Long {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(ptr, MethodBindings.fontGetWeightPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets font stretch amount, compared to a normal width. A percentage value between `50&#37;` and
   * `200&#37;`.
   * **Note:** This value is used for font matching only and will not affect font rendering. Use
   * [fontSetFaceIndex], [fontSetVariationCoordinates], or [fontSetTransform] instead.
   */
  public final fun fontSetStretch(fontRid: RID, weight: Long): Unit {
    TransferContext.writeArguments(_RID to fontRid, LONG to weight)
    TransferContext.callMethod(ptr, MethodBindings.fontSetStretchPtr, NIL)
  }

  /**
   * Returns font stretch amount, compared to a normal width. A percentage value between `50&#37;`
   * and `200&#37;`.
   */
  public final fun fontGetStretch(fontRid: RID): Long {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(ptr, MethodBindings.fontGetStretchPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets font anti-aliasing mode.
   */
  public final fun fontSetAntialiasing(fontRid: RID, antialiasing: FontAntialiasing): Unit {
    TransferContext.writeArguments(_RID to fontRid, LONG to antialiasing.id)
    TransferContext.callMethod(ptr, MethodBindings.fontSetAntialiasingPtr, NIL)
  }

  /**
   * Returns font anti-aliasing mode.
   */
  public final fun fontGetAntialiasing(fontRid: RID): FontAntialiasing {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(ptr, MethodBindings.fontGetAntialiasingPtr, LONG)
    return TextServer.FontAntialiasing.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * If set to `true`, embedded font bitmap loading is disabled (bitmap-only and color fonts ignore
   * this property).
   */
  public final fun fontSetDisableEmbeddedBitmaps(fontRid: RID, disableEmbeddedBitmaps: Boolean):
      Unit {
    TransferContext.writeArguments(_RID to fontRid, BOOL to disableEmbeddedBitmaps)
    TransferContext.callMethod(ptr, MethodBindings.fontSetDisableEmbeddedBitmapsPtr, NIL)
  }

  /**
   * Returns whether the font's embedded bitmap loading is disabled.
   */
  public final fun fontGetDisableEmbeddedBitmaps(fontRid: RID): Boolean {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(ptr, MethodBindings.fontGetDisableEmbeddedBitmapsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If set to `true` font texture mipmap generation is enabled.
   */
  public final fun fontSetGenerateMipmaps(fontRid: RID, generateMipmaps: Boolean): Unit {
    TransferContext.writeArguments(_RID to fontRid, BOOL to generateMipmaps)
    TransferContext.callMethod(ptr, MethodBindings.fontSetGenerateMipmapsPtr, NIL)
  }

  /**
   * Returns `true` if font texture mipmap generation is enabled.
   */
  public final fun fontGetGenerateMipmaps(fontRid: RID): Boolean {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(ptr, MethodBindings.fontGetGenerateMipmapsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If set to `true`, glyphs of all sizes are rendered using single multichannel signed distance
   * field generated from the dynamic font vector data. MSDF rendering allows displaying the font at
   * any scaling factor without blurriness, and without incurring a CPU cost when the font size changes
   * (since the font no longer needs to be rasterized on the CPU). As a downside, font hinting is not
   * available with MSDF. The lack of font hinting may result in less crisp and less readable fonts at
   * small sizes.
   * **Note:** MSDF font rendering does not render glyphs with overlapping shapes correctly.
   * Overlapping shapes are not valid per the OpenType standard, but are still commonly found in many
   * font files, especially those converted by Google Fonts. To avoid issues with overlapping glyphs,
   * consider downloading the font file directly from the type foundry instead of relying on Google
   * Fonts.
   */
  public final fun fontSetMultichannelSignedDistanceField(fontRid: RID, msdf: Boolean): Unit {
    TransferContext.writeArguments(_RID to fontRid, BOOL to msdf)
    TransferContext.callMethod(ptr, MethodBindings.fontSetMultichannelSignedDistanceFieldPtr, NIL)
  }

  /**
   * Returns `true` if glyphs of all sizes are rendered using single multichannel signed distance
   * field generated from the dynamic font vector data.
   */
  public final fun fontIsMultichannelSignedDistanceField(fontRid: RID): Boolean {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(ptr, MethodBindings.fontIsMultichannelSignedDistanceFieldPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the width of the range around the shape between the minimum and maximum representable
   * signed distance.
   */
  public final fun fontSetMsdfPixelRange(fontRid: RID, msdfPixelRange: Long): Unit {
    TransferContext.writeArguments(_RID to fontRid, LONG to msdfPixelRange)
    TransferContext.callMethod(ptr, MethodBindings.fontSetMsdfPixelRangePtr, NIL)
  }

  /**
   * Returns the width of the range around the shape between the minimum and maximum representable
   * signed distance.
   */
  public final fun fontGetMsdfPixelRange(fontRid: RID): Long {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(ptr, MethodBindings.fontGetMsdfPixelRangePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets source font size used to generate MSDF textures.
   */
  public final fun fontSetMsdfSize(fontRid: RID, msdfSize: Long): Unit {
    TransferContext.writeArguments(_RID to fontRid, LONG to msdfSize)
    TransferContext.callMethod(ptr, MethodBindings.fontSetMsdfSizePtr, NIL)
  }

  /**
   * Returns source font size used to generate MSDF textures.
   */
  public final fun fontGetMsdfSize(fontRid: RID): Long {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(ptr, MethodBindings.fontGetMsdfSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets bitmap font fixed size. If set to value greater than zero, same cache entry will be used
   * for all font sizes.
   */
  public final fun fontSetFixedSize(fontRid: RID, fixedSize: Long): Unit {
    TransferContext.writeArguments(_RID to fontRid, LONG to fixedSize)
    TransferContext.callMethod(ptr, MethodBindings.fontSetFixedSizePtr, NIL)
  }

  /**
   * Returns bitmap font fixed size.
   */
  public final fun fontGetFixedSize(fontRid: RID): Long {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(ptr, MethodBindings.fontGetFixedSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets bitmap font scaling mode. This property is used only if `fixed_size` is greater than zero.
   */
  public final fun fontSetFixedSizeScaleMode(fontRid: RID, fixedSizeScaleMode: FixedSizeScaleMode):
      Unit {
    TransferContext.writeArguments(_RID to fontRid, LONG to fixedSizeScaleMode.id)
    TransferContext.callMethod(ptr, MethodBindings.fontSetFixedSizeScaleModePtr, NIL)
  }

  /**
   * Returns bitmap font scaling mode.
   */
  public final fun fontGetFixedSizeScaleMode(fontRid: RID): FixedSizeScaleMode {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(ptr, MethodBindings.fontGetFixedSizeScaleModePtr, LONG)
    return TextServer.FixedSizeScaleMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * If set to `true`, system fonts can be automatically used as fallbacks.
   */
  public final fun fontSetAllowSystemFallback(fontRid: RID, allowSystemFallback: Boolean): Unit {
    TransferContext.writeArguments(_RID to fontRid, BOOL to allowSystemFallback)
    TransferContext.callMethod(ptr, MethodBindings.fontSetAllowSystemFallbackPtr, NIL)
  }

  /**
   * Returns `true` if system fonts can be automatically used as fallbacks.
   */
  public final fun fontIsAllowSystemFallback(fontRid: RID): Boolean {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(ptr, MethodBindings.fontIsAllowSystemFallbackPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If set to `true` auto-hinting is preferred over font built-in hinting.
   */
  public final fun fontSetForceAutohinter(fontRid: RID, forceAutohinter: Boolean): Unit {
    TransferContext.writeArguments(_RID to fontRid, BOOL to forceAutohinter)
    TransferContext.callMethod(ptr, MethodBindings.fontSetForceAutohinterPtr, NIL)
  }

  /**
   * Returns `true` if auto-hinting is supported and preferred over font built-in hinting. Used by
   * dynamic fonts only.
   */
  public final fun fontIsForceAutohinter(fontRid: RID): Boolean {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(ptr, MethodBindings.fontIsForceAutohinterPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets font hinting mode. Used by dynamic fonts only.
   */
  public final fun fontSetHinting(fontRid: RID, hinting: Hinting): Unit {
    TransferContext.writeArguments(_RID to fontRid, LONG to hinting.id)
    TransferContext.callMethod(ptr, MethodBindings.fontSetHintingPtr, NIL)
  }

  /**
   * Returns the font hinting mode. Used by dynamic fonts only.
   */
  public final fun fontGetHinting(fontRid: RID): Hinting {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(ptr, MethodBindings.fontGetHintingPtr, LONG)
    return TextServer.Hinting.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets font subpixel glyph positioning mode.
   */
  public final fun fontSetSubpixelPositioning(fontRid: RID,
      subpixelPositioning: SubpixelPositioning): Unit {
    TransferContext.writeArguments(_RID to fontRid, LONG to subpixelPositioning.id)
    TransferContext.callMethod(ptr, MethodBindings.fontSetSubpixelPositioningPtr, NIL)
  }

  /**
   * Returns font subpixel glyph positioning mode.
   */
  public final fun fontGetSubpixelPositioning(fontRid: RID): SubpixelPositioning {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(ptr, MethodBindings.fontGetSubpixelPositioningPtr, LONG)
    return TextServer.SubpixelPositioning.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets glyph position rounding behavior. If set to `true`, when aligning glyphs to the pixel
   * boundaries rounding remainders are accumulated to ensure more uniform glyph distribution. This
   * setting has no effect if subpixel positioning is enabled.
   */
  public final fun fontSetKeepRoundingRemainders(fontRid: RID, keepRoundingRemainders: Boolean):
      Unit {
    TransferContext.writeArguments(_RID to fontRid, BOOL to keepRoundingRemainders)
    TransferContext.callMethod(ptr, MethodBindings.fontSetKeepRoundingRemaindersPtr, NIL)
  }

  /**
   * Returns glyph position rounding behavior. If set to `true`, when aligning glyphs to the pixel
   * boundaries rounding remainders are accumulated to ensure more uniform glyph distribution. This
   * setting has no effect if subpixel positioning is enabled.
   */
  public final fun fontGetKeepRoundingRemainders(fontRid: RID): Boolean {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(ptr, MethodBindings.fontGetKeepRoundingRemaindersPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets font embolden strength. If [strength] is not equal to zero, emboldens the font outlines.
   * Negative values reduce the outline thickness.
   */
  public final fun fontSetEmbolden(fontRid: RID, strength: Double): Unit {
    TransferContext.writeArguments(_RID to fontRid, DOUBLE to strength)
    TransferContext.callMethod(ptr, MethodBindings.fontSetEmboldenPtr, NIL)
  }

  /**
   * Returns font embolden strength.
   */
  public final fun fontGetEmbolden(fontRid: RID): Double {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(ptr, MethodBindings.fontGetEmboldenPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  /**
   * Sets the spacing for [spacing] (see [TextServer.SpacingType]) to [value] in pixels (not
   * relative to the font size).
   */
  public final fun fontSetSpacing(
    fontRid: RID,
    spacing: SpacingType,
    `value`: Long,
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, LONG to spacing.id, LONG to value)
    TransferContext.callMethod(ptr, MethodBindings.fontSetSpacingPtr, NIL)
  }

  /**
   * Returns the spacing for [spacing] (see [TextServer.SpacingType]) in pixels (not relative to the
   * font size).
   */
  public final fun fontGetSpacing(fontRid: RID, spacing: SpacingType): Long {
    TransferContext.writeArguments(_RID to fontRid, LONG to spacing.id)
    TransferContext.callMethod(ptr, MethodBindings.fontGetSpacingPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets extra baseline offset (as a fraction of font height).
   */
  public final fun fontSetBaselineOffset(fontRid: RID, baselineOffset: Double): Unit {
    TransferContext.writeArguments(_RID to fontRid, DOUBLE to baselineOffset)
    TransferContext.callMethod(ptr, MethodBindings.fontSetBaselineOffsetPtr, NIL)
  }

  /**
   * Returns extra baseline offset (as a fraction of font height).
   */
  public final fun fontGetBaselineOffset(fontRid: RID): Double {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(ptr, MethodBindings.fontGetBaselineOffsetPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  /**
   * Sets 2D transform, applied to the font outlines, can be used for slanting, flipping, and
   * rotating glyphs.
   * For example, to simulate italic typeface by slanting, apply the following transform
   * `Transform2D(1.0, slant, 0.0, 1.0, 0.0, 0.0)`.
   */
  public final fun fontSetTransform(fontRid: RID, transform: Transform2D): Unit {
    TransferContext.writeArguments(_RID to fontRid, TRANSFORM2D to transform)
    TransferContext.callMethod(ptr, MethodBindings.fontSetTransformPtr, NIL)
  }

  /**
   * Returns 2D transform applied to the font outlines.
   */
  public final fun fontGetTransform(fontRid: RID): Transform2D {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(ptr, MethodBindings.fontGetTransformPtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D) as Transform2D)
  }

  /**
   * Sets variation coordinates for the specified font cache entry. See [fontSupportedVariationList]
   * for more info.
   */
  public final fun fontSetVariationCoordinates(fontRid: RID,
      variationCoordinates: Dictionary<Any?, Any?>): Unit {
    TransferContext.writeArguments(_RID to fontRid, DICTIONARY to variationCoordinates)
    TransferContext.callMethod(ptr, MethodBindings.fontSetVariationCoordinatesPtr, NIL)
  }

  /**
   * Returns variation coordinates for the specified font cache entry. See
   * [fontSupportedVariationList] for more info.
   */
  public final fun fontGetVariationCoordinates(fontRid: RID): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(ptr, MethodBindings.fontGetVariationCoordinatesPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  /**
   * Sets font oversampling factor, if set to `0.0` global oversampling factor is used instead. Used
   * by dynamic fonts only.
   */
  public final fun fontSetOversampling(fontRid: RID, oversampling: Double): Unit {
    TransferContext.writeArguments(_RID to fontRid, DOUBLE to oversampling)
    TransferContext.callMethod(ptr, MethodBindings.fontSetOversamplingPtr, NIL)
  }

  /**
   * Returns font oversampling factor, if set to `0.0` global oversampling factor is used instead.
   * Used by dynamic fonts only.
   */
  public final fun fontGetOversampling(fontRid: RID): Double {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(ptr, MethodBindings.fontGetOversamplingPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  /**
   * Returns list of the font sizes in the cache. Each size is [Vector2i] with font size and outline
   * size.
   */
  public final fun fontGetSizeCacheList(fontRid: RID): VariantArray<Vector2i> {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(ptr, MethodBindings.fontGetSizeCacheListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Vector2i>)
  }

  /**
   * Removes all font sizes from the cache entry.
   */
  public final fun fontClearSizeCache(fontRid: RID): Unit {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(ptr, MethodBindings.fontClearSizeCachePtr, NIL)
  }

  /**
   * Removes specified font size from the cache entry.
   */
  public final fun fontRemoveSizeCache(fontRid: RID, size: Vector2i): Unit {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size)
    TransferContext.callMethod(ptr, MethodBindings.fontRemoveSizeCachePtr, NIL)
  }

  /**
   * Sets the font ascent (number of pixels above the baseline).
   */
  public final fun fontSetAscent(
    fontRid: RID,
    size: Long,
    ascent: Double,
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, LONG to size, DOUBLE to ascent)
    TransferContext.callMethod(ptr, MethodBindings.fontSetAscentPtr, NIL)
  }

  /**
   * Returns the font ascent (number of pixels above the baseline).
   */
  public final fun fontGetAscent(fontRid: RID, size: Long): Double {
    TransferContext.writeArguments(_RID to fontRid, LONG to size)
    TransferContext.callMethod(ptr, MethodBindings.fontGetAscentPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  /**
   * Sets the font descent (number of pixels below the baseline).
   */
  public final fun fontSetDescent(
    fontRid: RID,
    size: Long,
    descent: Double,
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, LONG to size, DOUBLE to descent)
    TransferContext.callMethod(ptr, MethodBindings.fontSetDescentPtr, NIL)
  }

  /**
   * Returns the font descent (number of pixels below the baseline).
   */
  public final fun fontGetDescent(fontRid: RID, size: Long): Double {
    TransferContext.writeArguments(_RID to fontRid, LONG to size)
    TransferContext.callMethod(ptr, MethodBindings.fontGetDescentPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  /**
   * Sets pixel offset of the underline below the baseline.
   */
  public final fun fontSetUnderlinePosition(
    fontRid: RID,
    size: Long,
    underlinePosition: Double,
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, LONG to size, DOUBLE to underlinePosition)
    TransferContext.callMethod(ptr, MethodBindings.fontSetUnderlinePositionPtr, NIL)
  }

  /**
   * Returns pixel offset of the underline below the baseline.
   */
  public final fun fontGetUnderlinePosition(fontRid: RID, size: Long): Double {
    TransferContext.writeArguments(_RID to fontRid, LONG to size)
    TransferContext.callMethod(ptr, MethodBindings.fontGetUnderlinePositionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  /**
   * Sets thickness of the underline in pixels.
   */
  public final fun fontSetUnderlineThickness(
    fontRid: RID,
    size: Long,
    underlineThickness: Double,
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, LONG to size, DOUBLE to underlineThickness)
    TransferContext.callMethod(ptr, MethodBindings.fontSetUnderlineThicknessPtr, NIL)
  }

  /**
   * Returns thickness of the underline in pixels.
   */
  public final fun fontGetUnderlineThickness(fontRid: RID, size: Long): Double {
    TransferContext.writeArguments(_RID to fontRid, LONG to size)
    TransferContext.callMethod(ptr, MethodBindings.fontGetUnderlineThicknessPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  /**
   * Sets scaling factor of the color bitmap font.
   */
  public final fun fontSetScale(
    fontRid: RID,
    size: Long,
    scale: Double,
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, LONG to size, DOUBLE to scale)
    TransferContext.callMethod(ptr, MethodBindings.fontSetScalePtr, NIL)
  }

  /**
   * Returns scaling factor of the color bitmap font.
   */
  public final fun fontGetScale(fontRid: RID, size: Long): Double {
    TransferContext.writeArguments(_RID to fontRid, LONG to size)
    TransferContext.callMethod(ptr, MethodBindings.fontGetScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  /**
   * Returns number of textures used by font cache entry.
   */
  public final fun fontGetTextureCount(fontRid: RID, size: Vector2i): Long {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size)
    TransferContext.callMethod(ptr, MethodBindings.fontGetTextureCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Removes all textures from font cache entry.
   * **Note:** This function will not remove glyphs associated with the texture, use
   * [fontRemoveGlyph] to remove them manually.
   */
  public final fun fontClearTextures(fontRid: RID, size: Vector2i): Unit {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size)
    TransferContext.callMethod(ptr, MethodBindings.fontClearTexturesPtr, NIL)
  }

  /**
   * Removes specified texture from the cache entry.
   * **Note:** This function will not remove glyphs associated with the texture, remove them
   * manually, using [fontRemoveGlyph].
   */
  public final fun fontRemoveTexture(
    fontRid: RID,
    size: Vector2i,
    textureIndex: Long,
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size, LONG to textureIndex)
    TransferContext.callMethod(ptr, MethodBindings.fontRemoveTexturePtr, NIL)
  }

  /**
   * Sets font cache texture image data.
   */
  public final fun fontSetTextureImage(
    fontRid: RID,
    size: Vector2i,
    textureIndex: Long,
    image: Image?,
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size, LONG to textureIndex, OBJECT to image)
    TransferContext.callMethod(ptr, MethodBindings.fontSetTextureImagePtr, NIL)
  }

  /**
   * Returns font cache texture image data.
   */
  public final fun fontGetTextureImage(
    fontRid: RID,
    size: Vector2i,
    textureIndex: Long,
  ): Image? {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size, LONG to textureIndex)
    TransferContext.callMethod(ptr, MethodBindings.fontGetTextureImagePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Image?)
  }

  /**
   * Sets array containing glyph packing data.
   */
  public final fun fontSetTextureOffsets(
    fontRid: RID,
    size: Vector2i,
    textureIndex: Long,
    offset: PackedInt32Array,
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size, LONG to textureIndex, PACKED_INT_32_ARRAY to offset)
    TransferContext.callMethod(ptr, MethodBindings.fontSetTextureOffsetsPtr, NIL)
  }

  /**
   * Returns array containing glyph packing data.
   */
  public final fun fontGetTextureOffsets(
    fontRid: RID,
    size: Vector2i,
    textureIndex: Long,
  ): PackedInt32Array {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size, LONG to textureIndex)
    TransferContext.callMethod(ptr, MethodBindings.fontGetTextureOffsetsPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  /**
   * Returns list of rendered glyphs in the cache entry.
   */
  public final fun fontGetGlyphList(fontRid: RID, size: Vector2i): PackedInt32Array {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size)
    TransferContext.callMethod(ptr, MethodBindings.fontGetGlyphListPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  /**
   * Removes all rendered glyph information from the cache entry.
   * **Note:** This function will not remove textures associated with the glyphs, use
   * [fontRemoveTexture] to remove them manually.
   */
  public final fun fontClearGlyphs(fontRid: RID, size: Vector2i): Unit {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size)
    TransferContext.callMethod(ptr, MethodBindings.fontClearGlyphsPtr, NIL)
  }

  /**
   * Removes specified rendered glyph information from the cache entry.
   * **Note:** This function will not remove textures associated with the glyphs, use
   * [fontRemoveTexture] to remove them manually.
   */
  public final fun fontRemoveGlyph(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size, LONG to glyph)
    TransferContext.callMethod(ptr, MethodBindings.fontRemoveGlyphPtr, NIL)
  }

  /**
   * Returns glyph advance (offset of the next glyph).
   * **Note:** Advance for glyphs outlines is the same as the base glyph advance and is not saved.
   */
  public final fun fontGetGlyphAdvance(
    fontRid: RID,
    size: Long,
    glyph: Long,
  ): Vector2 {
    TransferContext.writeArguments(_RID to fontRid, LONG to size, LONG to glyph)
    TransferContext.callMethod(ptr, MethodBindings.fontGetGlyphAdvancePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Sets glyph advance (offset of the next glyph).
   * **Note:** Advance for glyphs outlines is the same as the base glyph advance and is not saved.
   */
  public final fun fontSetGlyphAdvance(
    fontRid: RID,
    size: Long,
    glyph: Long,
    advance: Vector2,
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, LONG to size, LONG to glyph, VECTOR2 to advance)
    TransferContext.callMethod(ptr, MethodBindings.fontSetGlyphAdvancePtr, NIL)
  }

  /**
   * Returns glyph offset from the baseline.
   */
  public final fun fontGetGlyphOffset(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
  ): Vector2 {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size, LONG to glyph)
    TransferContext.callMethod(ptr, MethodBindings.fontGetGlyphOffsetPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Sets glyph offset from the baseline.
   */
  public final fun fontSetGlyphOffset(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
    offset: Vector2,
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size, LONG to glyph, VECTOR2 to offset)
    TransferContext.callMethod(ptr, MethodBindings.fontSetGlyphOffsetPtr, NIL)
  }

  /**
   * Returns size of the glyph.
   */
  public final fun fontGetGlyphSize(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
  ): Vector2 {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size, LONG to glyph)
    TransferContext.callMethod(ptr, MethodBindings.fontGetGlyphSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Sets size of the glyph.
   */
  public final fun fontSetGlyphSize(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
    glSize: Vector2,
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size, LONG to glyph, VECTOR2 to glSize)
    TransferContext.callMethod(ptr, MethodBindings.fontSetGlyphSizePtr, NIL)
  }

  /**
   * Returns rectangle in the cache texture containing the glyph.
   */
  public final fun fontGetGlyphUvRect(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
  ): Rect2 {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size, LONG to glyph)
    TransferContext.callMethod(ptr, MethodBindings.fontGetGlyphUvRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2) as Rect2)
  }

  /**
   * Sets rectangle in the cache texture containing the glyph.
   */
  public final fun fontSetGlyphUvRect(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
    uvRect: Rect2,
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size, LONG to glyph, RECT2 to uvRect)
    TransferContext.callMethod(ptr, MethodBindings.fontSetGlyphUvRectPtr, NIL)
  }

  /**
   * Returns index of the cache texture containing the glyph.
   */
  public final fun fontGetGlyphTextureIdx(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
  ): Long {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size, LONG to glyph)
    TransferContext.callMethod(ptr, MethodBindings.fontGetGlyphTextureIdxPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets index of the cache texture containing the glyph.
   */
  public final fun fontSetGlyphTextureIdx(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
    textureIdx: Long,
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size, LONG to glyph, LONG to textureIdx)
    TransferContext.callMethod(ptr, MethodBindings.fontSetGlyphTextureIdxPtr, NIL)
  }

  /**
   * Returns resource ID of the cache texture containing the glyph.
   * **Note:** If there are pending glyphs to render, calling this function might trigger the
   * texture cache update.
   */
  public final fun fontGetGlyphTextureRid(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
  ): RID {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size, LONG to glyph)
    TransferContext.callMethod(ptr, MethodBindings.fontGetGlyphTextureRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Returns size of the cache texture containing the glyph.
   * **Note:** If there are pending glyphs to render, calling this function might trigger the
   * texture cache update.
   */
  public final fun fontGetGlyphTextureSize(
    fontRid: RID,
    size: Vector2i,
    glyph: Long,
  ): Vector2 {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size, LONG to glyph)
    TransferContext.callMethod(ptr, MethodBindings.fontGetGlyphTextureSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns outline contours of the glyph as a [Dictionary] with the following contents:
   * `points`         - [PackedVector3Array], containing outline points. `x` and `y` are point
   * coordinates. `z` is the type of the point, using the [ContourPointTag] values.
   * `contours`       - [PackedInt32Array], containing indices the end points of each contour.
   * `orientation`    - [bool], contour orientation. If `true`, clockwise contours must be filled.
   * - Two successive [CONTOUR_CURVE_TAG_ON] points indicate a line segment.
   * - One [CONTOUR_CURVE_TAG_OFF_CONIC] point between two [CONTOUR_CURVE_TAG_ON] points indicates a
   * single conic (quadratic) Bézier arc.
   * - Two [CONTOUR_CURVE_TAG_OFF_CUBIC] points between two [CONTOUR_CURVE_TAG_ON] points indicate a
   * single cubic Bézier arc.
   * - Two successive [CONTOUR_CURVE_TAG_OFF_CONIC] points indicate two successive conic (quadratic)
   * Bézier arcs with a virtual [CONTOUR_CURVE_TAG_ON] point at their middle.
   * - Each contour is closed. The last point of a contour uses the first point of a contour as its
   * next point, and vice versa. The first point can be [CONTOUR_CURVE_TAG_OFF_CONIC] point.
   */
  public final fun fontGetGlyphContours(
    font: RID,
    size: Long,
    index: Long,
  ): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(_RID to font, LONG to size, LONG to index)
    TransferContext.callMethod(ptr, MethodBindings.fontGetGlyphContoursPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns list of the kerning overrides.
   */
  public final fun fontGetKerningList(fontRid: RID, size: Long): VariantArray<Vector2i> {
    TransferContext.writeArguments(_RID to fontRid, LONG to size)
    TransferContext.callMethod(ptr, MethodBindings.fontGetKerningListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Vector2i>)
  }

  /**
   * Removes all kerning overrides.
   */
  public final fun fontClearKerningMap(fontRid: RID, size: Long): Unit {
    TransferContext.writeArguments(_RID to fontRid, LONG to size)
    TransferContext.callMethod(ptr, MethodBindings.fontClearKerningMapPtr, NIL)
  }

  /**
   * Removes kerning override for the pair of glyphs.
   */
  public final fun fontRemoveKerning(
    fontRid: RID,
    size: Long,
    glyphPair: Vector2i,
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, LONG to size, VECTOR2I to glyphPair)
    TransferContext.callMethod(ptr, MethodBindings.fontRemoveKerningPtr, NIL)
  }

  /**
   * Sets kerning for the pair of glyphs.
   */
  public final fun fontSetKerning(
    fontRid: RID,
    size: Long,
    glyphPair: Vector2i,
    kerning: Vector2,
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, LONG to size, VECTOR2I to glyphPair, VECTOR2 to kerning)
    TransferContext.callMethod(ptr, MethodBindings.fontSetKerningPtr, NIL)
  }

  /**
   * Returns kerning for the pair of glyphs.
   */
  public final fun fontGetKerning(
    fontRid: RID,
    size: Long,
    glyphPair: Vector2i,
  ): Vector2 {
    TransferContext.writeArguments(_RID to fontRid, LONG to size, VECTOR2I to glyphPair)
    TransferContext.callMethod(ptr, MethodBindings.fontGetKerningPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns the glyph index of a [char], optionally modified by the [variationSelector]. See
   * [fontGetCharFromGlyphIndex].
   */
  public final fun fontGetGlyphIndex(
    fontRid: RID,
    size: Long,
    char: Long,
    variationSelector: Long,
  ): Long {
    TransferContext.writeArguments(_RID to fontRid, LONG to size, LONG to char, LONG to variationSelector)
    TransferContext.callMethod(ptr, MethodBindings.fontGetGlyphIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns character code associated with [glyphIndex], or `0` if [glyphIndex] is invalid. See
   * [fontGetGlyphIndex].
   */
  public final fun fontGetCharFromGlyphIndex(
    fontRid: RID,
    size: Long,
    glyphIndex: Long,
  ): Long {
    TransferContext.writeArguments(_RID to fontRid, LONG to size, LONG to glyphIndex)
    TransferContext.callMethod(ptr, MethodBindings.fontGetCharFromGlyphIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if a Unicode [char] is available in the font.
   */
  public final fun fontHasChar(fontRid: RID, char: Long): Boolean {
    TransferContext.writeArguments(_RID to fontRid, LONG to char)
    TransferContext.callMethod(ptr, MethodBindings.fontHasCharPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns a string containing all the characters available in the font.
   */
  public final fun fontGetSupportedChars(fontRid: RID): String {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(ptr, MethodBindings.fontGetSupportedCharsPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns an array containing all glyph indices in the font.
   */
  public final fun fontGetSupportedGlyphs(fontRid: RID): PackedInt32Array {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(ptr, MethodBindings.fontGetSupportedGlyphsPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  /**
   * Renders the range of characters to the font cache texture.
   */
  public final fun fontRenderRange(
    fontRid: RID,
    size: Vector2i,
    start: Long,
    end: Long,
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size, LONG to start, LONG to end)
    TransferContext.callMethod(ptr, MethodBindings.fontRenderRangePtr, NIL)
  }

  /**
   * Renders specified glyph to the font cache texture.
   */
  public final fun fontRenderGlyph(
    fontRid: RID,
    size: Vector2i,
    index: Long,
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, VECTOR2I to size, LONG to index)
    TransferContext.callMethod(ptr, MethodBindings.fontRenderGlyphPtr, NIL)
  }

  /**
   * Draws single glyph into a canvas item at the position, using [fontRid] at the size [size].
   * **Note:** Glyph index is specific to the font, use glyphs indices returned by
   * [shapedTextGetGlyphs] or [fontGetGlyphIndex].
   * **Note:** If there are pending glyphs to render, calling this function might trigger the
   * texture cache update.
   */
  @JvmOverloads
  public final fun fontDrawGlyph(
    fontRid: RID,
    canvas: RID,
    size: Long,
    pos: Vector2,
    index: Long,
    color: Color = Color(Color(1, 1, 1, 1)),
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, _RID to canvas, LONG to size, VECTOR2 to pos, LONG to index, COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.fontDrawGlyphPtr, NIL)
  }

  /**
   * Draws single glyph outline of size [outlineSize] into a canvas item at the position, using
   * [fontRid] at the size [size].
   * **Note:** Glyph index is specific to the font, use glyphs indices returned by
   * [shapedTextGetGlyphs] or [fontGetGlyphIndex].
   * **Note:** If there are pending glyphs to render, calling this function might trigger the
   * texture cache update.
   */
  @JvmOverloads
  public final fun fontDrawGlyphOutline(
    fontRid: RID,
    canvas: RID,
    size: Long,
    outlineSize: Long,
    pos: Vector2,
    index: Long,
    color: Color = Color(Color(1, 1, 1, 1)),
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, _RID to canvas, LONG to size, LONG to outlineSize, VECTOR2 to pos, LONG to index, COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.fontDrawGlyphOutlinePtr, NIL)
  }

  /**
   * Returns `true`, if font supports given language
   * ([url=https://en.wikipedia.org/wiki/ISO_639-1]ISO 639[/url] code).
   */
  public final fun fontIsLanguageSupported(fontRid: RID, language: String): Boolean {
    TransferContext.writeArguments(_RID to fontRid, STRING to language)
    TransferContext.callMethod(ptr, MethodBindings.fontIsLanguageSupportedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Adds override for [fontIsLanguageSupported].
   */
  public final fun fontSetLanguageSupportOverride(
    fontRid: RID,
    language: String,
    supported: Boolean,
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, STRING to language, BOOL to supported)
    TransferContext.callMethod(ptr, MethodBindings.fontSetLanguageSupportOverridePtr, NIL)
  }

  /**
   * Returns `true` if support override is enabled for the [language].
   */
  public final fun fontGetLanguageSupportOverride(fontRid: RID, language: String): Boolean {
    TransferContext.writeArguments(_RID to fontRid, STRING to language)
    TransferContext.callMethod(ptr, MethodBindings.fontGetLanguageSupportOverridePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Remove language support override.
   */
  public final fun fontRemoveLanguageSupportOverride(fontRid: RID, language: String): Unit {
    TransferContext.writeArguments(_RID to fontRid, STRING to language)
    TransferContext.callMethod(ptr, MethodBindings.fontRemoveLanguageSupportOverridePtr, NIL)
  }

  /**
   * Returns list of language support overrides.
   */
  public final fun fontGetLanguageSupportOverrides(fontRid: RID): PackedStringArray {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(ptr, MethodBindings.fontGetLanguageSupportOverridesPtr,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Returns `true`, if font supports given script (ISO 15924 code).
   */
  public final fun fontIsScriptSupported(fontRid: RID, script: String): Boolean {
    TransferContext.writeArguments(_RID to fontRid, STRING to script)
    TransferContext.callMethod(ptr, MethodBindings.fontIsScriptSupportedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Adds override for [fontIsScriptSupported].
   */
  public final fun fontSetScriptSupportOverride(
    fontRid: RID,
    script: String,
    supported: Boolean,
  ): Unit {
    TransferContext.writeArguments(_RID to fontRid, STRING to script, BOOL to supported)
    TransferContext.callMethod(ptr, MethodBindings.fontSetScriptSupportOverridePtr, NIL)
  }

  /**
   * Returns `true` if support override is enabled for the [script].
   */
  public final fun fontGetScriptSupportOverride(fontRid: RID, script: String): Boolean {
    TransferContext.writeArguments(_RID to fontRid, STRING to script)
    TransferContext.callMethod(ptr, MethodBindings.fontGetScriptSupportOverridePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Removes script support override.
   */
  public final fun fontRemoveScriptSupportOverride(fontRid: RID, script: String): Unit {
    TransferContext.writeArguments(_RID to fontRid, STRING to script)
    TransferContext.callMethod(ptr, MethodBindings.fontRemoveScriptSupportOverridePtr, NIL)
  }

  /**
   * Returns list of script support overrides.
   */
  public final fun fontGetScriptSupportOverrides(fontRid: RID): PackedStringArray {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(ptr, MethodBindings.fontGetScriptSupportOverridesPtr,
        PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY) as PackedStringArray)
  }

  /**
   * Sets font OpenType feature set override.
   */
  public final fun fontSetOpentypeFeatureOverrides(fontRid: RID, overrides: Dictionary<Any?, Any?>):
      Unit {
    TransferContext.writeArguments(_RID to fontRid, DICTIONARY to overrides)
    TransferContext.callMethod(ptr, MethodBindings.fontSetOpentypeFeatureOverridesPtr, NIL)
  }

  /**
   * Returns font OpenType feature set override.
   */
  public final fun fontGetOpentypeFeatureOverrides(fontRid: RID): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(ptr, MethodBindings.fontGetOpentypeFeatureOverridesPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns the dictionary of the supported OpenType features.
   */
  public final fun fontSupportedFeatureList(fontRid: RID): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(ptr, MethodBindings.fontSupportedFeatureListPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns the dictionary of the supported OpenType variation coordinates.
   */
  public final fun fontSupportedVariationList(fontRid: RID): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(_RID to fontRid)
    TransferContext.callMethod(ptr, MethodBindings.fontSupportedVariationListPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns the font oversampling factor, shared by all fonts in the TextServer.
   */
  public final fun fontGetGlobalOversampling(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.fontGetGlobalOversamplingPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  /**
   * Sets oversampling factor, shared by all font in the TextServer.
   * **Note:** This value can be automatically changed by display server.
   */
  public final fun fontSetGlobalOversampling(oversampling: Double): Unit {
    TransferContext.writeArguments(DOUBLE to oversampling)
    TransferContext.callMethod(ptr, MethodBindings.fontSetGlobalOversamplingPtr, NIL)
  }

  /**
   * Returns size of the replacement character (box with character hexadecimal code that is drawn in
   * place of invalid characters).
   */
  public final fun getHexCodeBoxSize(size: Long, index: Long): Vector2 {
    TransferContext.writeArguments(LONG to size, LONG to index)
    TransferContext.callMethod(ptr, MethodBindings.getHexCodeBoxSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Draws box displaying character hexadecimal code. Used for replacing missing characters.
   */
  public final fun drawHexCodeBox(
    canvas: RID,
    size: Long,
    pos: Vector2,
    index: Long,
    color: Color,
  ): Unit {
    TransferContext.writeArguments(_RID to canvas, LONG to size, VECTOR2 to pos, LONG to index, COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.drawHexCodeBoxPtr, NIL)
  }

  /**
   * Creates a new buffer for complex text layout, with the given [direction] and [orientation]. To
   * free the resulting buffer, use [freeRid] method.
   * **Note:** Direction is ignored if server does not support [FEATURE_BIDI_LAYOUT] feature
   * (supported by [TextServerAdvanced]).
   * **Note:** Orientation is ignored if server does not support [FEATURE_VERTICAL_LAYOUT] feature
   * (supported by [TextServerAdvanced]).
   */
  @JvmOverloads
  public final fun createShapedText(direction: Direction = TextServer.Direction.DIRECTION_AUTO,
      orientation: Orientation = TextServer.Orientation.ORIENTATION_HORIZONTAL): RID {
    TransferContext.writeArguments(LONG to direction.id, LONG to orientation.id)
    TransferContext.callMethod(ptr, MethodBindings.createShapedTextPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Clears text buffer (removes text and inline objects).
   */
  public final fun shapedTextClear(rid: RID): Unit {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextClearPtr, NIL)
  }

  /**
   * Sets desired text direction. If set to [DIRECTION_AUTO], direction will be detected based on
   * the buffer contents and current locale.
   * **Note:** Direction is ignored if server does not support [FEATURE_BIDI_LAYOUT] feature
   * (supported by [TextServerAdvanced]).
   */
  @JvmOverloads
  public final fun shapedTextSetDirection(shaped: RID, direction: Direction =
      TextServer.Direction.DIRECTION_AUTO): Unit {
    TransferContext.writeArguments(_RID to shaped, LONG to direction.id)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextSetDirectionPtr, NIL)
  }

  /**
   * Returns direction of the text.
   */
  public final fun shapedTextGetDirection(shaped: RID): Direction {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextGetDirectionPtr, LONG)
    return TextServer.Direction.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns direction of the text, inferred by the BiDi algorithm.
   */
  public final fun shapedTextGetInferredDirection(shaped: RID): Direction {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextGetInferredDirectionPtr, LONG)
    return TextServer.Direction.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Overrides BiDi for the structured text.
   * Override ranges should cover full source text without overlaps. BiDi algorithm will be used on
   * each range separately.
   */
  public final fun shapedTextSetBidiOverride(shaped: RID, `override`: VariantArray<Any?>): Unit {
    TransferContext.writeArguments(_RID to shaped, ARRAY to override)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextSetBidiOverridePtr, NIL)
  }

  /**
   * Sets custom punctuation character list, used for word breaking. If set to empty string, server
   * defaults are used.
   */
  public final fun shapedTextSetCustomPunctuation(shaped: RID, punct: String): Unit {
    TransferContext.writeArguments(_RID to shaped, STRING to punct)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextSetCustomPunctuationPtr, NIL)
  }

  /**
   * Returns custom punctuation character list, used for word breaking. If set to empty string,
   * server defaults are used.
   */
  public final fun shapedTextGetCustomPunctuation(shaped: RID): String {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextGetCustomPunctuationPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Sets ellipsis character used for text clipping.
   */
  public final fun shapedTextSetCustomEllipsis(shaped: RID, char: Long): Unit {
    TransferContext.writeArguments(_RID to shaped, LONG to char)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextSetCustomEllipsisPtr, NIL)
  }

  /**
   * Returns ellipsis character used for text clipping.
   */
  public final fun shapedTextGetCustomEllipsis(shaped: RID): Long {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextGetCustomEllipsisPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets desired text orientation.
   * **Note:** Orientation is ignored if server does not support [FEATURE_VERTICAL_LAYOUT] feature
   * (supported by [TextServerAdvanced]).
   */
  @JvmOverloads
  public final fun shapedTextSetOrientation(shaped: RID, orientation: Orientation =
      TextServer.Orientation.ORIENTATION_HORIZONTAL): Unit {
    TransferContext.writeArguments(_RID to shaped, LONG to orientation.id)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextSetOrientationPtr, NIL)
  }

  /**
   * Returns text orientation.
   */
  public final fun shapedTextGetOrientation(shaped: RID): Orientation {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextGetOrientationPtr, LONG)
    return TextServer.Orientation.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * If set to `true` text buffer will display invalid characters as hexadecimal codes, otherwise
   * nothing is displayed.
   */
  public final fun shapedTextSetPreserveInvalid(shaped: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to shaped, BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextSetPreserveInvalidPtr, NIL)
  }

  /**
   * Returns `true` if text buffer is configured to display hexadecimal codes in place of invalid
   * characters.
   * **Note:** If set to `false`, nothing is displayed in place of invalid characters.
   */
  public final fun shapedTextGetPreserveInvalid(shaped: RID): Boolean {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextGetPreserveInvalidPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If set to `true` text buffer will display control characters.
   */
  public final fun shapedTextSetPreserveControl(shaped: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to shaped, BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextSetPreserveControlPtr, NIL)
  }

  /**
   * Returns `true` if text buffer is configured to display control characters.
   */
  public final fun shapedTextGetPreserveControl(shaped: RID): Boolean {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextGetPreserveControlPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets extra spacing added between glyphs or lines in pixels.
   */
  public final fun shapedTextSetSpacing(
    shaped: RID,
    spacing: SpacingType,
    `value`: Long,
  ): Unit {
    TransferContext.writeArguments(_RID to shaped, LONG to spacing.id, LONG to value)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextSetSpacingPtr, NIL)
  }

  /**
   * Returns extra spacing added between glyphs or lines in pixels.
   */
  public final fun shapedTextGetSpacing(shaped: RID, spacing: SpacingType): Long {
    TransferContext.writeArguments(_RID to shaped, LONG to spacing.id)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextGetSpacingPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Adds text span and font to draw it to the text buffer.
   */
  @JvmOverloads
  public final fun shapedTextAddString(
    shaped: RID,
    text: String,
    fonts: VariantArray<RID>,
    size: Long,
    opentypeFeatures: Dictionary<Any?, Any?> = Dictionary(),
    language: String = "",
    meta: Any? = null,
  ): Boolean {
    TransferContext.writeArguments(_RID to shaped, STRING to text, ARRAY to fonts, LONG to size, DICTIONARY to opentypeFeatures, STRING to language, ANY to meta)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextAddStringPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Adds inline object to the text buffer, [key] must be unique. In the text, object is represented
   * as [length] object replacement characters.
   */
  @JvmOverloads
  public final fun shapedTextAddObject(
    shaped: RID,
    key: Any?,
    size: Vector2,
    inlineAlign: InlineAlignment = InlineAlignment.INLINE_ALIGNMENT_CENTER,
    length: Long = 1,
    baseline: Double = 0.0,
  ): Boolean {
    TransferContext.writeArguments(_RID to shaped, ANY to key, VECTOR2 to size, LONG to inlineAlign.id, LONG to length, DOUBLE to baseline)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextAddObjectPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets new size and alignment of embedded object.
   */
  @JvmOverloads
  public final fun shapedTextResizeObject(
    shaped: RID,
    key: Any?,
    size: Vector2,
    inlineAlign: InlineAlignment = InlineAlignment.INLINE_ALIGNMENT_CENTER,
    baseline: Double = 0.0,
  ): Boolean {
    TransferContext.writeArguments(_RID to shaped, ANY to key, VECTOR2 to size, LONG to inlineAlign.id, DOUBLE to baseline)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextResizeObjectPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns number of text spans added using [shapedTextAddString] or [shapedTextAddObject].
   */
  public final fun shapedGetSpanCount(shaped: RID): Long {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(ptr, MethodBindings.shapedGetSpanCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns text span metadata.
   */
  public final fun shapedGetSpanMeta(shaped: RID, index: Long): Any? {
    TransferContext.writeArguments(_RID to shaped, LONG to index)
    TransferContext.callMethod(ptr, MethodBindings.shapedGetSpanMetaPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Returns text embedded object key.
   */
  public final fun shapedGetSpanEmbeddedObject(shaped: RID, index: Long): Any? {
    TransferContext.writeArguments(_RID to shaped, LONG to index)
    TransferContext.callMethod(ptr, MethodBindings.shapedGetSpanEmbeddedObjectPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Changes text span font, font size, and OpenType features, without changing the text.
   */
  @JvmOverloads
  public final fun shapedSetSpanUpdateFont(
    shaped: RID,
    index: Long,
    fonts: VariantArray<RID>,
    size: Long,
    opentypeFeatures: Dictionary<Any?, Any?> = Dictionary(),
  ): Unit {
    TransferContext.writeArguments(_RID to shaped, LONG to index, ARRAY to fonts, LONG to size, DICTIONARY to opentypeFeatures)
    TransferContext.callMethod(ptr, MethodBindings.shapedSetSpanUpdateFontPtr, NIL)
  }

  /**
   * Returns text buffer for the substring of the text in the [shaped] text buffer (including inline
   * objects).
   */
  public final fun shapedTextSubstr(
    shaped: RID,
    start: Long,
    length: Long,
  ): RID {
    TransferContext.writeArguments(_RID to shaped, LONG to start, LONG to length)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextSubstrPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Returns the parent buffer from which the substring originates.
   */
  public final fun shapedTextGetParent(shaped: RID): RID {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextGetParentPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Adjusts text width to fit to specified width, returns new text width.
   */
  @JvmOverloads
  public final fun shapedTextFitToWidth(
    shaped: RID,
    width: Double,
    justificationFlags: JustificationFlag = TextServer.JustificationFlag(3),
  ): Double {
    TransferContext.writeArguments(_RID to shaped, DOUBLE to width, LONG to justificationFlags.flag)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextFitToWidthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  /**
   * Aligns shaped text to the given tab-stops.
   */
  public final fun shapedTextTabAlign(shaped: RID, tabStops: PackedFloat32Array): Double {
    TransferContext.writeArguments(_RID to shaped, PACKED_FLOAT_32_ARRAY to tabStops)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextTabAlignPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  /**
   * Shapes buffer if it's not shaped. Returns `true` if the string is shaped successfully.
   * **Note:** It is not necessary to call this function manually, buffer will be shaped
   * automatically as soon as any of its output data is requested.
   */
  public final fun shapedTextShape(shaped: RID): Boolean {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextShapePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if buffer is successfully shaped.
   */
  public final fun shapedTextIsReady(shaped: RID): Boolean {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextIsReadyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if text buffer contains any visible characters.
   */
  public final fun shapedTextHasVisibleChars(shaped: RID): Boolean {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextHasVisibleCharsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns an array of glyphs in the visual order.
   */
  public final fun shapedTextGetGlyphs(shaped: RID): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextGetGlyphsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Returns text glyphs in the logical order.
   */
  public final fun shapedTextSortLogical(shaped: RID): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextSortLogicalPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Returns number of glyphs in the buffer.
   */
  public final fun shapedTextGetGlyphCount(shaped: RID): Long {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextGetGlyphCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns substring buffer character range in the parent buffer.
   */
  public final fun shapedTextGetRange(shaped: RID): Vector2i {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextGetRangePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Breaks text to the lines and columns. Returns character ranges for each segment.
   */
  @JvmOverloads
  public final fun shapedTextGetLineBreaksAdv(
    shaped: RID,
    width: PackedFloat32Array,
    start: Long = 0,
    once: Boolean = true,
    breakFlags: LineBreakFlag = TextServer.LineBreakFlag(3),
  ): PackedInt32Array {
    TransferContext.writeArguments(_RID to shaped, PACKED_FLOAT_32_ARRAY to width, LONG to start, BOOL to once, LONG to breakFlags.flag)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextGetLineBreaksAdvPtr,
        PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  /**
   * Breaks text to the lines and returns character ranges for each line.
   */
  @JvmOverloads
  public final fun shapedTextGetLineBreaks(
    shaped: RID,
    width: Double,
    start: Long = 0,
    breakFlags: LineBreakFlag = TextServer.LineBreakFlag(3),
  ): PackedInt32Array {
    TransferContext.writeArguments(_RID to shaped, DOUBLE to width, LONG to start, LONG to breakFlags.flag)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextGetLineBreaksPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  /**
   * Breaks text into words and returns array of character ranges. Use [graphemeFlags] to set what
   * characters are used for breaking (see [GraphemeFlag]).
   */
  @JvmOverloads
  public final fun shapedTextGetWordBreaks(
    shaped: RID,
    graphemeFlags: GraphemeFlag = TextServer.GraphemeFlag(264),
    skipGraphemeFlags: GraphemeFlag = TextServer.GraphemeFlag.GRAPHEME_IS_VIRTUAL,
  ): PackedInt32Array {
    TransferContext.writeArguments(_RID to shaped, LONG to graphemeFlags.flag, LONG to skipGraphemeFlags.flag)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextGetWordBreaksPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  /**
   * Returns the position of the overrun trim.
   */
  public final fun shapedTextGetTrimPos(shaped: RID): Long {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextGetTrimPosPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns position of the ellipsis.
   */
  public final fun shapedTextGetEllipsisPos(shaped: RID): Long {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextGetEllipsisPosPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns array of the glyphs in the ellipsis.
   */
  public final fun shapedTextGetEllipsisGlyphs(shaped: RID): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextGetEllipsisGlyphsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Returns number of glyphs in the ellipsis.
   */
  public final fun shapedTextGetEllipsisGlyphCount(shaped: RID): Long {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextGetEllipsisGlyphCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Trims text if it exceeds the given width.
   */
  @JvmOverloads
  public final fun shapedTextOverrunTrimToWidth(
    shaped: RID,
    width: Double = 0.0,
    overrunTrimFlags: TextOverrunFlag = TextServer.TextOverrunFlag.OVERRUN_NO_TRIM,
  ): Unit {
    TransferContext.writeArguments(_RID to shaped, DOUBLE to width, LONG to overrunTrimFlags.flag)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextOverrunTrimToWidthPtr, NIL)
  }

  /**
   * Returns array of inline objects.
   */
  public final fun shapedTextGetObjects(shaped: RID): VariantArray<Any?> {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextGetObjectsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  /**
   * Returns bounding rectangle of the inline object.
   */
  public final fun shapedTextGetObjectRect(shaped: RID, key: Any?): Rect2 {
    TransferContext.writeArguments(_RID to shaped, ANY to key)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextGetObjectRectPtr, RECT2)
    return (TransferContext.readReturnValue(RECT2) as Rect2)
  }

  /**
   * Returns the character range of the inline object.
   */
  public final fun shapedTextGetObjectRange(shaped: RID, key: Any?): Vector2i {
    TransferContext.writeArguments(_RID to shaped, ANY to key)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextGetObjectRangePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Returns the glyph index of the inline object.
   */
  public final fun shapedTextGetObjectGlyph(shaped: RID, key: Any?): Long {
    TransferContext.writeArguments(_RID to shaped, ANY to key)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextGetObjectGlyphPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns size of the text.
   */
  public final fun shapedTextGetSize(shaped: RID): Vector2 {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextGetSizePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns the text ascent (number of pixels above the baseline for horizontal layout or to the
   * left of baseline for vertical).
   * **Note:** Overall ascent can be higher than font ascent, if some glyphs are displaced from the
   * baseline.
   */
  public final fun shapedTextGetAscent(shaped: RID): Double {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextGetAscentPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  /**
   * Returns the text descent (number of pixels below the baseline for horizontal layout or to the
   * right of baseline for vertical).
   * **Note:** Overall descent can be higher than font descent, if some glyphs are displaced from
   * the baseline.
   */
  public final fun shapedTextGetDescent(shaped: RID): Double {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextGetDescentPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  /**
   * Returns width (for horizontal layout) or height (for vertical) of the text.
   */
  public final fun shapedTextGetWidth(shaped: RID): Double {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextGetWidthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  /**
   * Returns pixel offset of the underline below the baseline.
   */
  public final fun shapedTextGetUnderlinePosition(shaped: RID): Double {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextGetUnderlinePositionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  /**
   * Returns thickness of the underline.
   */
  public final fun shapedTextGetUnderlineThickness(shaped: RID): Double {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextGetUnderlineThicknessPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  /**
   * Returns shapes of the carets corresponding to the character offset [position] in the text.
   * Returned caret shape is 1 pixel wide rectangle.
   */
  public final fun shapedTextGetCarets(shaped: RID, position: Long): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(_RID to shaped, LONG to position)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextGetCaretsPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  /**
   * Returns selection rectangles for the specified character range.
   */
  public final fun shapedTextGetSelection(
    shaped: RID,
    start: Long,
    end: Long,
  ): PackedVector2Array {
    TransferContext.writeArguments(_RID to shaped, LONG to start, LONG to end)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextGetSelectionPtr, PACKED_VECTOR2_ARRAY)
    return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY) as PackedVector2Array)
  }

  /**
   * Returns grapheme index at the specified pixel offset at the baseline, or `-1` if none is found.
   */
  public final fun shapedTextHitTestGrapheme(shaped: RID, coords: Double): Long {
    TransferContext.writeArguments(_RID to shaped, DOUBLE to coords)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextHitTestGraphemePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns caret character offset at the specified pixel offset at the baseline. This function
   * always returns a valid position.
   */
  public final fun shapedTextHitTestPosition(shaped: RID, coords: Double): Long {
    TransferContext.writeArguments(_RID to shaped, DOUBLE to coords)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextHitTestPositionPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns composite character's bounds as offsets from the start of the line.
   */
  public final fun shapedTextGetGraphemeBounds(shaped: RID, pos: Long): Vector2 {
    TransferContext.writeArguments(_RID to shaped, LONG to pos)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextGetGraphemeBoundsPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns grapheme end position closest to the [pos].
   */
  public final fun shapedTextNextGraphemePos(shaped: RID, pos: Long): Long {
    TransferContext.writeArguments(_RID to shaped, LONG to pos)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextNextGraphemePosPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns grapheme start position closest to the [pos].
   */
  public final fun shapedTextPrevGraphemePos(shaped: RID, pos: Long): Long {
    TransferContext.writeArguments(_RID to shaped, LONG to pos)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextPrevGraphemePosPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns array of the composite character boundaries.
   */
  public final fun shapedTextGetCharacterBreaks(shaped: RID): PackedInt32Array {
    TransferContext.writeArguments(_RID to shaped)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextGetCharacterBreaksPtr,
        PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  /**
   * Returns composite character end position closest to the [pos].
   */
  public final fun shapedTextNextCharacterPos(shaped: RID, pos: Long): Long {
    TransferContext.writeArguments(_RID to shaped, LONG to pos)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextNextCharacterPosPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns composite character start position closest to the [pos].
   */
  public final fun shapedTextPrevCharacterPos(shaped: RID, pos: Long): Long {
    TransferContext.writeArguments(_RID to shaped, LONG to pos)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextPrevCharacterPosPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns composite character position closest to the [pos].
   */
  public final fun shapedTextClosestCharacterPos(shaped: RID, pos: Long): Long {
    TransferContext.writeArguments(_RID to shaped, LONG to pos)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextClosestCharacterPosPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Draw shaped text into a canvas item at a given position, with [color]. [pos] specifies the
   * leftmost point of the baseline (for horizontal layout) or topmost point of the baseline (for
   * vertical layout).
   */
  @JvmOverloads
  public final fun shapedTextDraw(
    shaped: RID,
    canvas: RID,
    pos: Vector2,
    clipL: Double = -1.0,
    clipR: Double = -1.0,
    color: Color = Color(Color(1, 1, 1, 1)),
  ): Unit {
    TransferContext.writeArguments(_RID to shaped, _RID to canvas, VECTOR2 to pos, DOUBLE to clipL, DOUBLE to clipR, COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextDrawPtr, NIL)
  }

  /**
   * Draw the outline of the shaped text into a canvas item at a given position, with [color]. [pos]
   * specifies the leftmost point of the baseline (for horizontal layout) or topmost point of the
   * baseline (for vertical layout).
   */
  @JvmOverloads
  public final fun shapedTextDrawOutline(
    shaped: RID,
    canvas: RID,
    pos: Vector2,
    clipL: Double = -1.0,
    clipR: Double = -1.0,
    outlineSize: Long = 1,
    color: Color = Color(Color(1, 1, 1, 1)),
  ): Unit {
    TransferContext.writeArguments(_RID to shaped, _RID to canvas, VECTOR2 to pos, DOUBLE to clipL, DOUBLE to clipR, LONG to outlineSize, COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextDrawOutlinePtr, NIL)
  }

  /**
   * Returns dominant direction of in the range of text.
   */
  public final fun shapedTextGetDominantDirectionInRange(
    shaped: RID,
    start: Long,
    end: Long,
  ): Direction {
    TransferContext.writeArguments(_RID to shaped, LONG to start, LONG to end)
    TransferContext.callMethod(ptr, MethodBindings.shapedTextGetDominantDirectionInRangePtr, LONG)
    return TextServer.Direction.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Converts a number from the Western Arabic (0..9) to the numeral systems used in [language].
   * If [language] is omitted, the active locale will be used.
   */
  @JvmOverloads
  public final fun formatNumber(number: String, language: String = ""): String {
    TransferContext.writeArguments(STRING to number, STRING to language)
    TransferContext.callMethod(ptr, MethodBindings.formatNumberPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Converts [number] from the numeral systems used in [language] to Western Arabic (0..9).
   */
  @JvmOverloads
  public final fun parseNumber(number: String, language: String = ""): String {
    TransferContext.writeArguments(STRING to number, STRING to language)
    TransferContext.callMethod(ptr, MethodBindings.parseNumberPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns percent sign used in the [language].
   */
  @JvmOverloads
  public final fun percentSign(language: String = ""): String {
    TransferContext.writeArguments(STRING to language)
    TransferContext.callMethod(ptr, MethodBindings.percentSignPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns an array of the word break boundaries. Elements in the returned array are the offsets
   * of the start and end of words. Therefore the length of the array is always even.
   * When [charsPerLine] is greater than zero, line break boundaries are returned instead.
   * [codeblock]
   * var ts = TextServerManager.get_primary_interface()
   * # Corresponds to the substrings "The", "Godot", "Engine", and "4".
   * print(ts.string_get_word_breaks("The Godot Engine, 4")) # Prints [0, 3, 4, 9, 10, 16, 18, 19]
   * # Corresponds to the substrings "The", "Godot", "Engin", and "e, 4".
   * print(ts.string_get_word_breaks("The Godot Engine, 4", "en", 5)) # Prints [0, 3, 4, 9, 10, 15,
   * 15, 19]
   * # Corresponds to the substrings "The Godot" and "Engine, 4".
   * print(ts.string_get_word_breaks("The Godot Engine, 4", "en", 10)) # Prints [0, 9, 10, 19]
   * [/codeblock]
   */
  @JvmOverloads
  public final fun stringGetWordBreaks(
    string: String,
    language: String = "",
    charsPerLine: Long = 0,
  ): PackedInt32Array {
    TransferContext.writeArguments(STRING to string, STRING to language, LONG to charsPerLine)
    TransferContext.callMethod(ptr, MethodBindings.stringGetWordBreaksPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  /**
   * Returns array of the composite character boundaries.
   * [codeblock]
   * var ts = TextServerManager.get_primary_interface()
   * print(ts.string_get_character_breaks("Test ❤️‍🔥 Test")) # Prints [1, 2, 3, 4, 5, 9, 10, 11,
   * 12, 13, 14]
   * [/codeblock]
   */
  @JvmOverloads
  public final fun stringGetCharacterBreaks(string: String, language: String = ""):
      PackedInt32Array {
    TransferContext.writeArguments(STRING to string, STRING to language)
    TransferContext.callMethod(ptr, MethodBindings.stringGetCharacterBreaksPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  /**
   * Returns index of the first string in [dict] which is visually confusable with the [string], or
   * `-1` if none is found.
   * **Note:** This method doesn't detect invisible characters, for spoof detection use it in
   * combination with [spoofCheck].
   * **Note:** Always returns `-1` if the server does not support the [FEATURE_UNICODE_SECURITY]
   * feature.
   */
  public final fun isConfusable(string: String, dict: PackedStringArray): Long {
    TransferContext.writeArguments(STRING to string, PACKED_STRING_ARRAY to dict)
    TransferContext.callMethod(ptr, MethodBindings.isConfusablePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns `true` if [string] is likely to be an attempt at confusing the reader.
   * **Note:** Always returns `false` if the server does not support the [FEATURE_UNICODE_SECURITY]
   * feature.
   */
  public final fun spoofCheck(string: String): Boolean {
    TransferContext.writeArguments(STRING to string)
    TransferContext.callMethod(ptr, MethodBindings.spoofCheckPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Strips diacritics from the string.
   * **Note:** The result may be longer or shorter than the original.
   */
  public final fun stripDiacritics(string: String): String {
    TransferContext.writeArguments(STRING to string)
    TransferContext.callMethod(ptr, MethodBindings.stripDiacriticsPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns `true` if [string] is a valid identifier.
   * If the text server supports the [FEATURE_UNICODE_IDENTIFIERS] feature, a valid identifier must:
   * - Conform to normalization form C.
   * - Begin with a Unicode character of class XID_Start or `"_"`.
   * - May contain Unicode characters of class XID_Continue in the other positions.
   * - Use UAX #31 recommended scripts only (mixed scripts are allowed).
   * If the [FEATURE_UNICODE_IDENTIFIERS] feature is not supported, a valid identifier must:
   * - Begin with a Unicode character of class XID_Start or `"_"`.
   * - May contain Unicode characters of class XID_Continue in the other positions.
   */
  public final fun isValidIdentifier(string: String): Boolean {
    TransferContext.writeArguments(STRING to string)
    TransferContext.callMethod(ptr, MethodBindings.isValidIdentifierPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the given code point is a valid letter, i.e. it belongs to the Unicode
   * category "L".
   */
  public final fun isValidLetter(unicode: Long): Boolean {
    TransferContext.writeArguments(LONG to unicode)
    TransferContext.callMethod(ptr, MethodBindings.isValidLetterPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the string converted to uppercase.
   * **Note:** Casing is locale dependent and context sensitive if server support
   * [FEATURE_CONTEXT_SENSITIVE_CASE_CONVERSION] feature (supported by [TextServerAdvanced]).
   * **Note:** The result may be longer or shorter than the original.
   */
  @JvmOverloads
  public final fun stringToUpper(string: String, language: String = ""): String {
    TransferContext.writeArguments(STRING to string, STRING to language)
    TransferContext.callMethod(ptr, MethodBindings.stringToUpperPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the string converted to lowercase.
   * **Note:** Casing is locale dependent and context sensitive if server support
   * [FEATURE_CONTEXT_SENSITIVE_CASE_CONVERSION] feature (supported by [TextServerAdvanced]).
   * **Note:** The result may be longer or shorter than the original.
   */
  @JvmOverloads
  public final fun stringToLower(string: String, language: String = ""): String {
    TransferContext.writeArguments(STRING to string, STRING to language)
    TransferContext.callMethod(ptr, MethodBindings.stringToLowerPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the string converted to title case.
   * **Note:** Casing is locale dependent and context sensitive if server support
   * [FEATURE_CONTEXT_SENSITIVE_CASE_CONVERSION] feature (supported by [TextServerAdvanced]).
   * **Note:** The result may be longer or shorter than the original.
   */
  @JvmOverloads
  public final fun stringToTitle(string: String, language: String = ""): String {
    TransferContext.writeArguments(STRING to string, STRING to language)
    TransferContext.callMethod(ptr, MethodBindings.stringToTitlePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Default implementation of the BiDi algorithm override function. See [StructuredTextParser] for
   * more info.
   */
  public final fun parseStructuredText(
    parserType: StructuredTextParser,
    args: VariantArray<Any?>,
    text: String,
  ): VariantArray<Vector3i> {
    TransferContext.writeArguments(LONG to parserType.id, ARRAY to args, STRING to text)
    TransferContext.callMethod(ptr, MethodBindings.parseStructuredTextPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Vector3i>)
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
     * LCD subpixel layout is determined by the value of `gui/theme/lcd_subpixel_layout` project
     * settings.
     * LCD subpixel anti-aliasing mode is suitable only for rendering horizontal, unscaled text in
     * 2D.
     */
    FONT_ANTIALIASING_LCD(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): FontAntialiasing = entries.single { it.id == `value` }
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
     * Represents the size of the [FontLCDSubpixelLayout] enum.
     */
    FONT_LCD_SUBPIXEL_LAYOUT_MAX(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): FontLCDSubpixelLayout = entries.single { it.id == `value` }
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
     * Text writing direction is the same as base string writing direction. Used for BiDi override
     * only.
     */
    DIRECTION_INHERITED(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Direction = entries.single { it.id == `value` }
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
     * Right to left text is written vertically from bottom to top.
     */
    ORIENTATION_VERTICAL(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Orientation = entries.single { it.id == `value` }
    }
  }

  @JvmInline
  public value class JustificationFlag(
    public val flag: Long,
  ) {
    public infix fun or(other: JustificationFlag): JustificationFlag =
        JustificationFlag(flag.or(other.flag))

    public infix fun or(other: Long): JustificationFlag = JustificationFlag(flag.or(other))

    public infix fun xor(other: JustificationFlag): JustificationFlag =
        JustificationFlag(flag.xor(other.flag))

    public infix fun xor(other: Long): JustificationFlag = JustificationFlag(flag.xor(other))

    public infix fun and(other: JustificationFlag): JustificationFlag =
        JustificationFlag(flag.and(other.flag))

    public infix fun and(other: Long): JustificationFlag = JustificationFlag(flag.and(other))

    public fun unaryPlus(): JustificationFlag = JustificationFlag(flag.unaryPlus())

    public fun unaryMinus(): JustificationFlag = JustificationFlag(flag.unaryMinus())

    public fun inv(): JustificationFlag = JustificationFlag(flag.inv())

    public infix fun shl(bits: Int): JustificationFlag = JustificationFlag(flag shl bits)

    public infix fun shr(bits: Int): JustificationFlag = JustificationFlag(flag shr bits)

    public infix fun ushr(bits: Int): JustificationFlag = JustificationFlag(flag ushr bits)

    public companion object {
      /**
       * Do not justify text.
       */
      public val JUSTIFICATION_NONE: JustificationFlag = JustificationFlag(0)

      /**
       * Justify text by adding and removing kashidas.
       */
      public val JUSTIFICATION_KASHIDA: JustificationFlag = JustificationFlag(1)

      /**
       * Justify text by changing width of the spaces between the words.
       */
      public val JUSTIFICATION_WORD_BOUND: JustificationFlag = JustificationFlag(2)

      /**
       * Remove trailing and leading spaces from the justified text.
       */
      public val JUSTIFICATION_TRIM_EDGE_SPACES: JustificationFlag = JustificationFlag(4)

      /**
       * Only apply justification to the part of the text after the last tab.
       */
      public val JUSTIFICATION_AFTER_LAST_TAB: JustificationFlag = JustificationFlag(8)

      /**
       * Apply justification to the trimmed line with ellipsis.
       */
      public val JUSTIFICATION_CONSTRAIN_ELLIPSIS: JustificationFlag = JustificationFlag(16)

      /**
       * Do not apply justification to the last line of the paragraph.
       */
      public val JUSTIFICATION_SKIP_LAST_LINE: JustificationFlag = JustificationFlag(32)

      /**
       * Do not apply justification to the last line of the paragraph with visible characters (takes
       * precedence over [JUSTIFICATION_SKIP_LAST_LINE]).
       */
      public val JUSTIFICATION_SKIP_LAST_LINE_WITH_VISIBLE_CHARS: JustificationFlag =
          JustificationFlag(64)

      /**
       * Always apply justification to the paragraphs with a single line
       * ([JUSTIFICATION_SKIP_LAST_LINE] and [JUSTIFICATION_SKIP_LAST_LINE_WITH_VISIBLE_CHARS] are
       * ignored).
       */
      public val JUSTIFICATION_DO_NOT_SKIP_SINGLE_LINE: JustificationFlag = JustificationFlag(128)
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
     * Wraps the text inside the node's bounding rectangle by allowing to break lines at arbitrary
     * positions, which is useful when very limited space is available.
     */
    AUTOWRAP_ARBITRARY(1),
    /**
     * Wraps the text inside the node's bounding rectangle by soft-breaking between words.
     */
    AUTOWRAP_WORD(2),
    /**
     * Behaves similarly to [AUTOWRAP_WORD], but force-breaks a word if that single word does not
     * fit in one line.
     */
    AUTOWRAP_WORD_SMART(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): AutowrapMode = entries.single { it.id == `value` }
    }
  }

  @JvmInline
  public value class LineBreakFlag(
    public val flag: Long,
  ) {
    public infix fun or(other: LineBreakFlag): LineBreakFlag = LineBreakFlag(flag.or(other.flag))

    public infix fun or(other: Long): LineBreakFlag = LineBreakFlag(flag.or(other))

    public infix fun xor(other: LineBreakFlag): LineBreakFlag = LineBreakFlag(flag.xor(other.flag))

    public infix fun xor(other: Long): LineBreakFlag = LineBreakFlag(flag.xor(other))

    public infix fun and(other: LineBreakFlag): LineBreakFlag = LineBreakFlag(flag.and(other.flag))

    public infix fun and(other: Long): LineBreakFlag = LineBreakFlag(flag.and(other))

    public fun unaryPlus(): LineBreakFlag = LineBreakFlag(flag.unaryPlus())

    public fun unaryMinus(): LineBreakFlag = LineBreakFlag(flag.unaryMinus())

    public fun inv(): LineBreakFlag = LineBreakFlag(flag.inv())

    public infix fun shl(bits: Int): LineBreakFlag = LineBreakFlag(flag shl bits)

    public infix fun shr(bits: Int): LineBreakFlag = LineBreakFlag(flag shr bits)

    public infix fun ushr(bits: Int): LineBreakFlag = LineBreakFlag(flag ushr bits)

    public companion object {
      /**
       * Do not break the line.
       */
      public val BREAK_NONE: LineBreakFlag = LineBreakFlag(0)

      /**
       * Break the line at the line mandatory break characters (e.g. `"\n"`).
       */
      public val BREAK_MANDATORY: LineBreakFlag = LineBreakFlag(1)

      /**
       * Break the line between the words.
       */
      public val BREAK_WORD_BOUND: LineBreakFlag = LineBreakFlag(2)

      /**
       * Break the line between any unconnected graphemes.
       */
      public val BREAK_GRAPHEME_BOUND: LineBreakFlag = LineBreakFlag(4)

      /**
       * Should be used only in conjunction with [BREAK_WORD_BOUND], break the line between any
       * unconnected graphemes, if it's impossible to break it between the words.
       */
      public val BREAK_ADAPTIVE: LineBreakFlag = LineBreakFlag(8)

      /**
       * Remove edge spaces from the broken line segments.
       */
      public val BREAK_TRIM_EDGE_SPACES: LineBreakFlag = LineBreakFlag(16)

      /**
       * Subtract first line indentation width from all lines after the first one.
       */
      public val BREAK_TRIM_INDENT: LineBreakFlag = LineBreakFlag(32)
    }
  }

  public enum class VisibleCharactersBehavior(
    id: Long,
  ) {
    /**
     * Trims text before the shaping. e.g, increasing [Label.visibleCharacters] or
     * [RichTextLabel.visibleCharacters] value is visually identical to typing the text.
     * **Note:** In this mode, trimmed text is not processed at all. It is not accounted for in line
     * breaking and size calculations.
     */
    VC_CHARS_BEFORE_SHAPING(0),
    /**
     * Displays glyphs that are mapped to the first [Label.visibleCharacters] or
     * [RichTextLabel.visibleCharacters] characters from the beginning of the text.
     */
    VC_CHARS_AFTER_SHAPING(1),
    /**
     * Displays [Label.visibleRatio] or [RichTextLabel.visibleRatio] glyphs, starting from the left
     * or from the right, depending on [Control.layoutDirection] value.
     */
    VC_GLYPHS_AUTO(2),
    /**
     * Displays [Label.visibleRatio] or [RichTextLabel.visibleRatio] glyphs, starting from the left.
     */
    VC_GLYPHS_LTR(3),
    /**
     * Displays [Label.visibleRatio] or [RichTextLabel.visibleRatio] glyphs, starting from the
     * right.
     */
    VC_GLYPHS_RTL(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): VisibleCharactersBehavior =
          entries.single { it.id == `value` }
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
      public fun from(`value`: Long): OverrunBehavior = entries.single { it.id == `value` }
    }
  }

  @JvmInline
  public value class TextOverrunFlag(
    public val flag: Long,
  ) {
    public infix fun or(other: TextOverrunFlag): TextOverrunFlag =
        TextOverrunFlag(flag.or(other.flag))

    public infix fun or(other: Long): TextOverrunFlag = TextOverrunFlag(flag.or(other))

    public infix fun xor(other: TextOverrunFlag): TextOverrunFlag =
        TextOverrunFlag(flag.xor(other.flag))

    public infix fun xor(other: Long): TextOverrunFlag = TextOverrunFlag(flag.xor(other))

    public infix fun and(other: TextOverrunFlag): TextOverrunFlag =
        TextOverrunFlag(flag.and(other.flag))

    public infix fun and(other: Long): TextOverrunFlag = TextOverrunFlag(flag.and(other))

    public fun unaryPlus(): TextOverrunFlag = TextOverrunFlag(flag.unaryPlus())

    public fun unaryMinus(): TextOverrunFlag = TextOverrunFlag(flag.unaryMinus())

    public fun inv(): TextOverrunFlag = TextOverrunFlag(flag.inv())

    public infix fun shl(bits: Int): TextOverrunFlag = TextOverrunFlag(flag shl bits)

    public infix fun shr(bits: Int): TextOverrunFlag = TextOverrunFlag(flag shr bits)

    public infix fun ushr(bits: Int): TextOverrunFlag = TextOverrunFlag(flag ushr bits)

    public companion object {
      /**
       * No trimming is performed.
       */
      public val OVERRUN_NO_TRIM: TextOverrunFlag = TextOverrunFlag(0)

      /**
       * Trims the text when it exceeds the given width.
       */
      public val OVERRUN_TRIM: TextOverrunFlag = TextOverrunFlag(1)

      /**
       * Trims the text per word instead of per grapheme.
       */
      public val OVERRUN_TRIM_WORD_ONLY: TextOverrunFlag = TextOverrunFlag(2)

      /**
       * Determines whether an ellipsis should be added at the end of the text.
       */
      public val OVERRUN_ADD_ELLIPSIS: TextOverrunFlag = TextOverrunFlag(4)

      /**
       * Determines whether the ellipsis at the end of the text is enforced and may not be hidden.
       */
      public val OVERRUN_ENFORCE_ELLIPSIS: TextOverrunFlag = TextOverrunFlag(8)

      /**
       * Accounts for the text being justified before attempting to trim it (see
       * [JustificationFlag]).
       */
      public val OVERRUN_JUSTIFICATION_AWARE: TextOverrunFlag = TextOverrunFlag(16)
    }
  }

  @JvmInline
  public value class GraphemeFlag(
    public val flag: Long,
  ) {
    public infix fun or(other: GraphemeFlag): GraphemeFlag = GraphemeFlag(flag.or(other.flag))

    public infix fun or(other: Long): GraphemeFlag = GraphemeFlag(flag.or(other))

    public infix fun xor(other: GraphemeFlag): GraphemeFlag = GraphemeFlag(flag.xor(other.flag))

    public infix fun xor(other: Long): GraphemeFlag = GraphemeFlag(flag.xor(other))

    public infix fun and(other: GraphemeFlag): GraphemeFlag = GraphemeFlag(flag.and(other.flag))

    public infix fun and(other: Long): GraphemeFlag = GraphemeFlag(flag.and(other))

    public fun unaryPlus(): GraphemeFlag = GraphemeFlag(flag.unaryPlus())

    public fun unaryMinus(): GraphemeFlag = GraphemeFlag(flag.unaryMinus())

    public fun inv(): GraphemeFlag = GraphemeFlag(flag.inv())

    public infix fun shl(bits: Int): GraphemeFlag = GraphemeFlag(flag shl bits)

    public infix fun shr(bits: Int): GraphemeFlag = GraphemeFlag(flag shr bits)

    public infix fun ushr(bits: Int): GraphemeFlag = GraphemeFlag(flag ushr bits)

    public companion object {
      /**
       * Grapheme is supported by the font, and can be drawn.
       */
      public val GRAPHEME_IS_VALID: GraphemeFlag = GraphemeFlag(1)

      /**
       * Grapheme is part of right-to-left or bottom-to-top run.
       */
      public val GRAPHEME_IS_RTL: GraphemeFlag = GraphemeFlag(2)

      /**
       * Grapheme is not part of source text, it was added by justification process.
       */
      public val GRAPHEME_IS_VIRTUAL: GraphemeFlag = GraphemeFlag(4)

      /**
       * Grapheme is whitespace.
       */
      public val GRAPHEME_IS_SPACE: GraphemeFlag = GraphemeFlag(8)

      /**
       * Grapheme is mandatory break point (e.g. `"\n"`).
       */
      public val GRAPHEME_IS_BREAK_HARD: GraphemeFlag = GraphemeFlag(16)

      /**
       * Grapheme is optional break point (e.g. space).
       */
      public val GRAPHEME_IS_BREAK_SOFT: GraphemeFlag = GraphemeFlag(32)

      /**
       * Grapheme is the tabulation character.
       */
      public val GRAPHEME_IS_TAB: GraphemeFlag = GraphemeFlag(64)

      /**
       * Grapheme is kashida.
       */
      public val GRAPHEME_IS_ELONGATION: GraphemeFlag = GraphemeFlag(128)

      /**
       * Grapheme is punctuation character.
       */
      public val GRAPHEME_IS_PUNCTUATION: GraphemeFlag = GraphemeFlag(256)

      /**
       * Grapheme is underscore character.
       */
      public val GRAPHEME_IS_UNDERSCORE: GraphemeFlag = GraphemeFlag(512)

      /**
       * Grapheme is connected to the previous grapheme. Breaking line before this grapheme is not
       * safe.
       */
      public val GRAPHEME_IS_CONNECTED: GraphemeFlag = GraphemeFlag(1024)

      /**
       * It is safe to insert a U+0640 before this grapheme for elongation.
       */
      public val GRAPHEME_IS_SAFE_TO_INSERT_TATWEEL: GraphemeFlag = GraphemeFlag(2048)

      /**
       * Grapheme is an object replacement character for the embedded object.
       */
      public val GRAPHEME_IS_EMBEDDED_OBJECT: GraphemeFlag = GraphemeFlag(4096)

      /**
       * Grapheme is a soft hyphen.
       */
      public val GRAPHEME_IS_SOFT_HYPHEN: GraphemeFlag = GraphemeFlag(8192)
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
     * **Note:** This hinting mode changes both horizontal and vertical glyph metrics. If applied to
     * monospace font, some glyphs might have different width.
     */
    HINTING_NORMAL(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Hinting = entries.single { it.id == `value` }
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
     * - To one quarter of the pixel size if font size is smaller or equal to
     * [SUBPIXEL_POSITIONING_ONE_QUARTER_MAX_SIZE].
     * - To one half of the pixel size if font size is smaller or equal to
     * [SUBPIXEL_POSITIONING_ONE_HALF_MAX_SIZE].
     * - To the whole pixel size for larger fonts.
     */
    SUBPIXEL_POSITIONING_AUTO(1),
    /**
     * Glyph horizontal position is rounded to one half of the pixel size, each glyph is rasterized
     * up to two times.
     */
    SUBPIXEL_POSITIONING_ONE_HALF(2),
    /**
     * Glyph horizontal position is rounded to one quarter of the pixel size, each glyph is
     * rasterized up to four times.
     */
    SUBPIXEL_POSITIONING_ONE_QUARTER(3),
    /**
     * Maximum font size which will use one half of the pixel subpixel positioning in
     * [SUBPIXEL_POSITIONING_AUTO] mode.
     */
    SUBPIXEL_POSITIONING_ONE_HALF_MAX_SIZE(20),
    /**
     * Maximum font size which will use one quarter of the pixel subpixel positioning in
     * [SUBPIXEL_POSITIONING_AUTO] mode.
     */
    SUBPIXEL_POSITIONING_ONE_QUARTER_MAX_SIZE(16),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SubpixelPositioning = entries.single { it.id == `value` }
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
     * TextServer supports [url=https://unicode.org/reports/tr36/]Unicode Technical Report #36[/url]
     * and [url=https://unicode.org/reports/tr39/]Unicode Technical Standard #39[/url] based spoof
     * detection features.
     */
    FEATURE_UNICODE_SECURITY(16384),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Feature = entries.single { it.id == `value` }
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
     * Contour point isn't on the curve, but serves as a control point for a conic (quadratic)
     * Bézier arc.
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
      public fun from(`value`: Long): ContourPointTag = entries.single { it.id == `value` }
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
     * Represents the size of the [SpacingType] enum.
     */
    SPACING_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SpacingType = entries.single { it.id == `value` }
    }
  }

  @JvmInline
  public value class FontStyle(
    public val flag: Long,
  ) {
    public infix fun or(other: FontStyle): FontStyle = FontStyle(flag.or(other.flag))

    public infix fun or(other: Long): FontStyle = FontStyle(flag.or(other))

    public infix fun xor(other: FontStyle): FontStyle = FontStyle(flag.xor(other.flag))

    public infix fun xor(other: Long): FontStyle = FontStyle(flag.xor(other))

    public infix fun and(other: FontStyle): FontStyle = FontStyle(flag.and(other.flag))

    public infix fun and(other: Long): FontStyle = FontStyle(flag.and(other))

    public fun unaryPlus(): FontStyle = FontStyle(flag.unaryPlus())

    public fun unaryMinus(): FontStyle = FontStyle(flag.unaryMinus())

    public fun inv(): FontStyle = FontStyle(flag.inv())

    public infix fun shl(bits: Int): FontStyle = FontStyle(flag shl bits)

    public infix fun shr(bits: Int): FontStyle = FontStyle(flag shr bits)

    public infix fun ushr(bits: Int): FontStyle = FontStyle(flag ushr bits)

    public companion object {
      /**
       * Font is bold.
       */
      public val FONT_BOLD: FontStyle = FontStyle(1)

      /**
       * Font is italic or oblique.
       */
      public val FONT_ITALIC: FontStyle = FontStyle(2)

      /**
       * Font have fixed-width characters.
       */
      public val FONT_FIXED_WIDTH: FontStyle = FontStyle(4)
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
     * BiDi override for lists. Structured text options: list separator [String].
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
      public fun from(`value`: Long): StructuredTextParser = entries.single { it.id == `value` }
    }
  }

  public enum class FixedSizeScaleMode(
    id: Long,
  ) {
    /**
     * Bitmap font is not scaled.
     */
    FIXED_SIZE_SCALE_DISABLE(0),
    /**
     * Bitmap font is scaled to the closest integer multiple of the font's fixed size. This is the
     * recommended option for pixel art fonts.
     */
    FIXED_SIZE_SCALE_INTEGER_ONLY(1),
    /**
     * Bitmap font is scaled to an arbitrary (fractional) size. This is the recommended option for
     * non-pixel art fonts.
     */
    FIXED_SIZE_SCALE_ENABLED(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): FixedSizeScaleMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val hasFeaturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "has_feature", 3967367083)

    internal val getNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "get_name", 201670096)

    internal val getFeaturesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "get_features", 3905245786)

    internal val loadSupportDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "load_support_data", 2323990056)

    internal val getSupportDataFilenamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "get_support_data_filename", 201670096)

    internal val getSupportDataInfoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "get_support_data_info", 201670096)

    internal val saveSupportDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "save_support_data", 3927539163)

    internal val getSupportDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "get_support_data", 2362200018)

    internal val isLocaleRightToLeftPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "is_locale_right_to_left", 3927539163)

    internal val nameToTagPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "name_to_tag", 1321353865)

    internal val tagToNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "tag_to_name", 844755477)

    internal val hasPtr: VoidPtr = TypeManager.getMethodBindPtr("TextServer", "has", 3521089500)

    internal val freeRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "free_rid", 2722037293)

    internal val createFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "create_font", 529393457)

    internal val createFontLinkedVariationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "create_font_linked_variation", 41030802)

    internal val fontSetDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_data", 1355495400)

    internal val fontSetFaceIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_face_index", 3411492887)

    internal val fontGetFaceIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_face_index", 2198884583)

    internal val fontGetFaceCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_face_count", 2198884583)

    internal val fontSetStylePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_style", 898466325)

    internal val fontGetStylePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_style", 3082502592)

    internal val fontSetNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_name", 2726140452)

    internal val fontGetNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_name", 642473191)

    internal val fontGetOtNameStringsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_ot_name_strings", 1882737106)

    internal val fontSetStyleNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_style_name", 2726140452)

    internal val fontGetStyleNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_style_name", 642473191)

    internal val fontSetWeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_weight", 3411492887)

    internal val fontGetWeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_weight", 2198884583)

    internal val fontSetStretchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_stretch", 3411492887)

    internal val fontGetStretchPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_stretch", 2198884583)

    internal val fontSetAntialiasingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_antialiasing", 958337235)

    internal val fontGetAntialiasingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_antialiasing", 3389420495)

    internal val fontSetDisableEmbeddedBitmapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_disable_embedded_bitmaps", 1265174801)

    internal val fontGetDisableEmbeddedBitmapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_disable_embedded_bitmaps", 4155700596)

    internal val fontSetGenerateMipmapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_generate_mipmaps", 1265174801)

    internal val fontGetGenerateMipmapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_generate_mipmaps", 4155700596)

    internal val fontSetMultichannelSignedDistanceFieldPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_multichannel_signed_distance_field", 1265174801)

    internal val fontIsMultichannelSignedDistanceFieldPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_is_multichannel_signed_distance_field", 4155700596)

    internal val fontSetMsdfPixelRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_msdf_pixel_range", 3411492887)

    internal val fontGetMsdfPixelRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_msdf_pixel_range", 2198884583)

    internal val fontSetMsdfSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_msdf_size", 3411492887)

    internal val fontGetMsdfSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_msdf_size", 2198884583)

    internal val fontSetFixedSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_fixed_size", 3411492887)

    internal val fontGetFixedSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_fixed_size", 2198884583)

    internal val fontSetFixedSizeScaleModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_fixed_size_scale_mode", 1029390307)

    internal val fontGetFixedSizeScaleModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_fixed_size_scale_mode", 4113120379)

    internal val fontSetAllowSystemFallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_allow_system_fallback", 1265174801)

    internal val fontIsAllowSystemFallbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_is_allow_system_fallback", 4155700596)

    internal val fontSetForceAutohinterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_force_autohinter", 1265174801)

    internal val fontIsForceAutohinterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_is_force_autohinter", 4155700596)

    internal val fontSetHintingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_hinting", 1520010864)

    internal val fontGetHintingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_hinting", 3971592737)

    internal val fontSetSubpixelPositioningPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_subpixel_positioning", 3830459669)

    internal val fontGetSubpixelPositioningPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_subpixel_positioning", 2752233671)

    internal val fontSetKeepRoundingRemaindersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_keep_rounding_remainders", 1265174801)

    internal val fontGetKeepRoundingRemaindersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_keep_rounding_remainders", 4155700596)

    internal val fontSetEmboldenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_embolden", 1794382983)

    internal val fontGetEmboldenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_embolden", 866169185)

    internal val fontSetSpacingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_spacing", 1307259930)

    internal val fontGetSpacingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_spacing", 1213653558)

    internal val fontSetBaselineOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_baseline_offset", 1794382983)

    internal val fontGetBaselineOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_baseline_offset", 866169185)

    internal val fontSetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_transform", 1246044741)

    internal val fontGetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_transform", 213527486)

    internal val fontSetVariationCoordinatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_variation_coordinates", 1217542888)

    internal val fontGetVariationCoordinatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_variation_coordinates", 1882737106)

    internal val fontSetOversamplingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_oversampling", 1794382983)

    internal val fontGetOversamplingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_oversampling", 866169185)

    internal val fontGetSizeCacheListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_size_cache_list", 2684255073)

    internal val fontClearSizeCachePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_clear_size_cache", 2722037293)

    internal val fontRemoveSizeCachePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_remove_size_cache", 2450610377)

    internal val fontSetAscentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_ascent", 1892459533)

    internal val fontGetAscentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_ascent", 755457166)

    internal val fontSetDescentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_descent", 1892459533)

    internal val fontGetDescentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_descent", 755457166)

    internal val fontSetUnderlinePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_underline_position", 1892459533)

    internal val fontGetUnderlinePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_underline_position", 755457166)

    internal val fontSetUnderlineThicknessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_underline_thickness", 1892459533)

    internal val fontGetUnderlineThicknessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_underline_thickness", 755457166)

    internal val fontSetScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_scale", 1892459533)

    internal val fontGetScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_scale", 755457166)

    internal val fontGetTextureCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_texture_count", 1311001310)

    internal val fontClearTexturesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_clear_textures", 2450610377)

    internal val fontRemoveTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_remove_texture", 3810512262)

    internal val fontSetTextureImagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_texture_image", 2354485091)

    internal val fontGetTextureImagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_texture_image", 2451761155)

    internal val fontSetTextureOffsetsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_texture_offsets", 3005398047)

    internal val fontGetTextureOffsetsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_texture_offsets", 3420028887)

    internal val fontGetGlyphListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_glyph_list", 46086620)

    internal val fontClearGlyphsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_clear_glyphs", 2450610377)

    internal val fontRemoveGlyphPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_remove_glyph", 3810512262)

    internal val fontGetGlyphAdvancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_glyph_advance", 2555689501)

    internal val fontSetGlyphAdvancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_glyph_advance", 3219397315)

    internal val fontGetGlyphOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_glyph_offset", 513728628)

    internal val fontSetGlyphOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_glyph_offset", 1812632090)

    internal val fontGetGlyphSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_glyph_size", 513728628)

    internal val fontSetGlyphSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_glyph_size", 1812632090)

    internal val fontGetGlyphUvRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_glyph_uv_rect", 2274268786)

    internal val fontSetGlyphUvRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_glyph_uv_rect", 1973324081)

    internal val fontGetGlyphTextureIdxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_glyph_texture_idx", 4292800474)

    internal val fontSetGlyphTextureIdxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_glyph_texture_idx", 4254580980)

    internal val fontGetGlyphTextureRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_glyph_texture_rid", 1451696141)

    internal val fontGetGlyphTextureSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_glyph_texture_size", 513728628)

    internal val fontGetGlyphContoursPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_glyph_contours", 2903964473)

    internal val fontGetKerningListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_kerning_list", 1778388067)

    internal val fontClearKerningMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_clear_kerning_map", 3411492887)

    internal val fontRemoveKerningPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_remove_kerning", 2141860016)

    internal val fontSetKerningPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_kerning", 3630965883)

    internal val fontGetKerningPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_kerning", 1019980169)

    internal val fontGetGlyphIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_glyph_index", 1765635060)

    internal val fontGetCharFromGlyphIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_char_from_glyph_index", 2156738276)

    internal val fontHasCharPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_has_char", 3120086654)

    internal val fontGetSupportedCharsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_supported_chars", 642473191)

    internal val fontGetSupportedGlyphsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_supported_glyphs", 788230395)

    internal val fontRenderRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_render_range", 4254580980)

    internal val fontRenderGlyphPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_render_glyph", 3810512262)

    internal val fontDrawGlyphPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_draw_glyph", 1339057948)

    internal val fontDrawGlyphOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_draw_glyph_outline", 2626165733)

    internal val fontIsLanguageSupportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_is_language_supported", 3199320846)

    internal val fontSetLanguageSupportOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_language_support_override", 2313957094)

    internal val fontGetLanguageSupportOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_language_support_override", 2829184646)

    internal val fontRemoveLanguageSupportOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_remove_language_support_override", 2726140452)

    internal val fontGetLanguageSupportOverridesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_language_support_overrides", 2801473409)

    internal val fontIsScriptSupportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_is_script_supported", 3199320846)

    internal val fontSetScriptSupportOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_script_support_override", 2313957094)

    internal val fontGetScriptSupportOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_script_support_override", 2829184646)

    internal val fontRemoveScriptSupportOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_remove_script_support_override", 2726140452)

    internal val fontGetScriptSupportOverridesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_script_support_overrides", 2801473409)

    internal val fontSetOpentypeFeatureOverridesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_opentype_feature_overrides", 1217542888)

    internal val fontGetOpentypeFeatureOverridesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_opentype_feature_overrides", 1882737106)

    internal val fontSupportedFeatureListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_supported_feature_list", 1882737106)

    internal val fontSupportedVariationListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_supported_variation_list", 1882737106)

    internal val fontGetGlobalOversamplingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_get_global_oversampling", 1740695150)

    internal val fontSetGlobalOversamplingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "font_set_global_oversampling", 373806689)

    internal val getHexCodeBoxSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "get_hex_code_box_size", 3016396712)

    internal val drawHexCodeBoxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "draw_hex_code_box", 1602046441)

    internal val createShapedTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "create_shaped_text", 1231398698)

    internal val shapedTextClearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_clear", 2722037293)

    internal val shapedTextSetDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_set_direction", 1551430183)

    internal val shapedTextGetDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_get_direction", 3065904362)

    internal val shapedTextGetInferredDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_get_inferred_direction", 3065904362)

    internal val shapedTextSetBidiOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_set_bidi_override", 684822712)

    internal val shapedTextSetCustomPunctuationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_set_custom_punctuation", 2726140452)

    internal val shapedTextGetCustomPunctuationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_get_custom_punctuation", 642473191)

    internal val shapedTextSetCustomEllipsisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_set_custom_ellipsis", 3411492887)

    internal val shapedTextGetCustomEllipsisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_get_custom_ellipsis", 2198884583)

    internal val shapedTextSetOrientationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_set_orientation", 3019609126)

    internal val shapedTextGetOrientationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_get_orientation", 3142708106)

    internal val shapedTextSetPreserveInvalidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_set_preserve_invalid", 1265174801)

    internal val shapedTextGetPreserveInvalidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_get_preserve_invalid", 4155700596)

    internal val shapedTextSetPreserveControlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_set_preserve_control", 1265174801)

    internal val shapedTextGetPreserveControlPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_get_preserve_control", 4155700596)

    internal val shapedTextSetSpacingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_set_spacing", 1307259930)

    internal val shapedTextGetSpacingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_get_spacing", 1213653558)

    internal val shapedTextAddStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_add_string", 623473029)

    internal val shapedTextAddObjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_add_object", 3664424789)

    internal val shapedTextResizeObjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_resize_object", 790361552)

    internal val shapedGetSpanCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_get_span_count", 2198884583)

    internal val shapedGetSpanMetaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_get_span_meta", 4069510997)

    internal val shapedGetSpanEmbeddedObjectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_get_span_embedded_object", 4069510997)

    internal val shapedSetSpanUpdateFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_set_span_update_font", 2022725822)

    internal val shapedTextSubstrPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_substr", 1937682086)

    internal val shapedTextGetParentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_get_parent", 3814569979)

    internal val shapedTextFitToWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_fit_to_width", 530670926)

    internal val shapedTextTabAlignPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_tab_align", 1283669550)

    internal val shapedTextShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_shape", 3521089500)

    internal val shapedTextIsReadyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_is_ready", 4155700596)

    internal val shapedTextHasVisibleCharsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_has_visible_chars", 4155700596)

    internal val shapedTextGetGlyphsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_get_glyphs", 2684255073)

    internal val shapedTextSortLogicalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_sort_logical", 2670461153)

    internal val shapedTextGetGlyphCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_get_glyph_count", 2198884583)

    internal val shapedTextGetRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_get_range", 733700038)

    internal val shapedTextGetLineBreaksAdvPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_get_line_breaks_adv", 2376991424)

    internal val shapedTextGetLineBreaksPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_get_line_breaks", 2651359741)

    internal val shapedTextGetWordBreaksPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_get_word_breaks", 4099476853)

    internal val shapedTextGetTrimPosPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_get_trim_pos", 2198884583)

    internal val shapedTextGetEllipsisPosPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_get_ellipsis_pos", 2198884583)

    internal val shapedTextGetEllipsisGlyphsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_get_ellipsis_glyphs", 2684255073)

    internal val shapedTextGetEllipsisGlyphCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_get_ellipsis_glyph_count", 2198884583)

    internal val shapedTextOverrunTrimToWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_overrun_trim_to_width", 2723146520)

    internal val shapedTextGetObjectsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_get_objects", 2684255073)

    internal val shapedTextGetObjectRectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_get_object_rect", 447978354)

    internal val shapedTextGetObjectRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_get_object_range", 2524675647)

    internal val shapedTextGetObjectGlyphPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_get_object_glyph", 1260085030)

    internal val shapedTextGetSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_get_size", 2440833711)

    internal val shapedTextGetAscentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_get_ascent", 866169185)

    internal val shapedTextGetDescentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_get_descent", 866169185)

    internal val shapedTextGetWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_get_width", 866169185)

    internal val shapedTextGetUnderlinePositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_get_underline_position", 866169185)

    internal val shapedTextGetUnderlineThicknessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_get_underline_thickness", 866169185)

    internal val shapedTextGetCaretsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_get_carets", 1574219346)

    internal val shapedTextGetSelectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_get_selection", 3714187733)

    internal val shapedTextHitTestGraphemePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_hit_test_grapheme", 3149310417)

    internal val shapedTextHitTestPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_hit_test_position", 3149310417)

    internal val shapedTextGetGraphemeBoundsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_get_grapheme_bounds", 2546185844)

    internal val shapedTextNextGraphemePosPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_next_grapheme_pos", 1120910005)

    internal val shapedTextPrevGraphemePosPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_prev_grapheme_pos", 1120910005)

    internal val shapedTextGetCharacterBreaksPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_get_character_breaks", 788230395)

    internal val shapedTextNextCharacterPosPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_next_character_pos", 1120910005)

    internal val shapedTextPrevCharacterPosPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_prev_character_pos", 1120910005)

    internal val shapedTextClosestCharacterPosPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_closest_character_pos", 1120910005)

    internal val shapedTextDrawPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_draw", 880389142)

    internal val shapedTextDrawOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_draw_outline", 2559184194)

    internal val shapedTextGetDominantDirectionInRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "shaped_text_get_dominant_direction_in_range", 3326907668)

    internal val formatNumberPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "format_number", 2664628024)

    internal val parseNumberPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "parse_number", 2664628024)

    internal val percentSignPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "percent_sign", 993269549)

    internal val stringGetWordBreaksPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "string_get_word_breaks", 581857818)

    internal val stringGetCharacterBreaksPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "string_get_character_breaks", 2333794773)

    internal val isConfusablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "is_confusable", 1433197768)

    internal val spoofCheckPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "spoof_check", 3927539163)

    internal val stripDiacriticsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "strip_diacritics", 3135753539)

    internal val isValidIdentifierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "is_valid_identifier", 3927539163)

    internal val isValidLetterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "is_valid_letter", 1116898809)

    internal val stringToUpperPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "string_to_upper", 2664628024)

    internal val stringToLowerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "string_to_lower", 2664628024)

    internal val stringToTitlePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "string_to_title", 2664628024)

    internal val parseStructuredTextPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextServer", "parse_structured_text", 3310685015)
  }
}
