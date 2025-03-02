// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Dictionary
import godot.core.Transform2D
import godot.core.VariantParser.DICTIONARY
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.TRANSFORM2D
import kotlin.Any
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.UninitializedPropertyAccessException
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Provides OpenType variations, simulated bold / slant, and additional font settings like OpenType
 * features and extra spacing.
 * To use simulated bold font variant:
 *
 * gdscript:
 * ```gdscript
 * var fv = FontVariation.new()
 * fv.base_font = load("res://BarlowCondensed-Regular.ttf")
 * fv.variation_embolden = 1.2
 * $Label.add_theme_font_override("font", fv)
 * $Label.add_theme_font_size_override("font_size", 64)
 * ```
 * csharp:
 * ```csharp
 * var fv = new FontVariation();
 * fv.SetBaseFont(ResourceLoader.Load<FontFile>("res://BarlowCondensed-Regular.ttf"));
 * fv.SetVariationEmbolden(1.2);
 * GetNode("Label").AddThemeFontOverride("font", fv);
 * GetNode("Label").AddThemeFontSizeOverride("font_size", 64);
 * ```
 *
 * To set the coordinate of multiple variation axes:
 * [codeblock]
 * var fv = FontVariation.new();
 * var ts = TextServerManager.get_primary_interface()
 * fv.base_font = load("res://BarlowCondensed-Regular.ttf")
 * fv.variation_opentype = { ts.name_to_tag("wght"): 900, ts.name_to_tag("custom_hght"): 900 }
 * [/codeblock]
 */
@GodotBaseType
public open class FontVariation : Font() {
  /**
   * Base font used to create a variation. If not set, default [Theme] font is used.
   */
  public final inline var baseFont: Font?
    @JvmName("baseFontProperty")
    get() = getBaseFont()
    @JvmName("baseFontProperty")
    set(`value`) {
      setBaseFont(value)
    }

  /**
   * Font OpenType variation coordinates. More info:
   * [url=https://docs.microsoft.com/en-us/typography/opentype/spec/dvaraxisreg]OpenType variation
   * tags[/url].
   * **Note:** This [Dictionary] uses OpenType tags as keys. Variation axes can be identified both
   * by tags ([int], e.g. `0x77678674`) and names ([String], e.g. `wght`). Some axes might be
   * accessible by multiple names. For example, `wght` refers to the same axis as `weight`. Tags on the
   * other hand are unique. To convert between names and tags, use [TextServer.nameToTag] and
   * [TextServer.tagToName].
   * **Note:** To get available variation axes of a font, use [Font.getSupportedVariationList].
   */
  public final inline var variationOpentype: Dictionary<Any?, Any?>
    @JvmName("variationOpentypeProperty")
    get() = getVariationOpentype()
    @JvmName("variationOpentypeProperty")
    set(`value`) {
      setVariationOpentype(value)
    }

  /**
   * Active face index in the TrueType / OpenType collection file.
   */
  public final inline var variationFaceIndex: Int
    @JvmName("variationFaceIndexProperty")
    get() = getVariationFaceIndex()
    @JvmName("variationFaceIndexProperty")
    set(`value`) {
      setVariationFaceIndex(value)
    }

  /**
   * If is not equal to zero, emboldens the font outlines. Negative values reduce the outline
   * thickness.
   * **Note:** Emboldened fonts might have self-intersecting outlines, which will prevent MSDF fonts
   * and [TextMesh] from working correctly.
   */
  public final inline var variationEmbolden: Float
    @JvmName("variationEmboldenProperty")
    get() = getVariationEmbolden()
    @JvmName("variationEmboldenProperty")
    set(`value`) {
      setVariationEmbolden(value)
    }

  /**
   * 2D transform, applied to the font outlines, can be used for slanting, flipping and rotating
   * glyphs.
   * For example, to simulate italic typeface by slanting, apply the following transform
   * `Transform2D(1.0, slant, 0.0, 1.0, 0.0, 0.0)`.
   */
  @CoreTypeLocalCopy
  public final inline var variationTransform: Transform2D
    @JvmName("variationTransformProperty")
    get() = getVariationTransform()
    @JvmName("variationTransformProperty")
    set(`value`) {
      setVariationTransform(value)
    }

  /**
   * A set of OpenType feature tags. More info:
   * [url=https://docs.microsoft.com/en-us/typography/opentype/spec/featuretags]OpenType feature
   * tags[/url].
   */
  public final inline var opentypeFeatures: Dictionary<Any?, Any?>
    @JvmName("opentypeFeaturesProperty")
    get() = getOpentypeFeatures()
    @JvmName("opentypeFeaturesProperty")
    set(`value`) {
      setOpentypeFeatures(value)
    }

  /**
   * Extra spacing between graphical glyphs.
   */
  public final val spacingGlyph: Int
    get() {
      throw
          UninitializedPropertyAccessException("Cannot access property spacingGlyph: has no getter")
    }

  /**
   * Extra width of the space glyphs.
   */
  public final val spacingSpace: Int
    get() {
      throw
          UninitializedPropertyAccessException("Cannot access property spacingSpace: has no getter")
    }

  /**
   * Extra spacing at the top of the line in pixels.
   */
  public final val spacingTop: Int
    get() {
      throw UninitializedPropertyAccessException("Cannot access property spacingTop: has no getter")
    }

  /**
   * Extra spacing at the bottom of the line in pixels.
   */
  public final val spacingBottom: Int
    get() {
      throw
          UninitializedPropertyAccessException("Cannot access property spacingBottom: has no getter")
    }

  /**
   * Extra baseline offset (as a fraction of font height).
   */
  public final inline var baselineOffset: Float
    @JvmName("baselineOffsetProperty")
    get() = getBaselineOffset()
    @JvmName("baselineOffsetProperty")
    set(`value`) {
      setBaselineOffset(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(249, scriptIndex)
  }

  /**
   * 2D transform, applied to the font outlines, can be used for slanting, flipping and rotating
   * glyphs.
   * For example, to simulate italic typeface by slanting, apply the following transform
   * `Transform2D(1.0, slant, 0.0, 1.0, 0.0, 0.0)`.
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = fontvariation.variationTransform
   * //Your changes
   * fontvariation.variationTransform = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun variationTransformMutate(block: Transform2D.() -> Unit): Transform2D =
      variationTransform.apply{
      block(this)
      variationTransform = this
  }


  public final fun setBaseFont(font: Font?): Unit {
    TransferContext.writeArguments(OBJECT to font)
    TransferContext.callMethod(ptr, MethodBindings.setBaseFontPtr, NIL)
  }

  public final fun getBaseFont(): Font? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBaseFontPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Font?)
  }

  public final fun setVariationOpentype(coords: Dictionary<Any?, Any?>): Unit {
    TransferContext.writeArguments(DICTIONARY to coords)
    TransferContext.callMethod(ptr, MethodBindings.setVariationOpentypePtr, NIL)
  }

  public final fun getVariationOpentype(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVariationOpentypePtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  public final fun setVariationEmbolden(strength: Float): Unit {
    TransferContext.writeArguments(DOUBLE to strength.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setVariationEmboldenPtr, NIL)
  }

  public final fun getVariationEmbolden(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVariationEmboldenPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVariationFaceIndex(faceIndex: Int): Unit {
    TransferContext.writeArguments(LONG to faceIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setVariationFaceIndexPtr, NIL)
  }

  public final fun getVariationFaceIndex(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVariationFaceIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setVariationTransform(transform: Transform2D): Unit {
    TransferContext.writeArguments(TRANSFORM2D to transform)
    TransferContext.callMethod(ptr, MethodBindings.setVariationTransformPtr, NIL)
  }

  public final fun getVariationTransform(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getVariationTransformPtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D) as Transform2D)
  }

  public final fun setOpentypeFeatures(features: Dictionary<Any?, Any?>): Unit {
    TransferContext.writeArguments(DICTIONARY to features)
    TransferContext.callMethod(ptr, MethodBindings.setOpentypeFeaturesPtr, NIL)
  }

  /**
   * Sets the spacing for [spacing] (see [TextServer.SpacingType]) to [value] in pixels (not
   * relative to the font size).
   */
  public final fun setSpacing(spacing: TextServer.SpacingType, `value`: Int): Unit {
    TransferContext.writeArguments(LONG to spacing.id, LONG to value.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSpacingPtr, NIL)
  }

  public final fun setBaselineOffset(baselineOffset: Float): Unit {
    TransferContext.writeArguments(DOUBLE to baselineOffset.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setBaselineOffsetPtr, NIL)
  }

  public final fun getBaselineOffset(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBaselineOffsetPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  public object MethodBindings {
    internal val setBaseFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontVariation", "set_base_font", 1262170328)

    internal val getBaseFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontVariation", "get_base_font", 3229501585)

    internal val setVariationOpentypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontVariation", "set_variation_opentype", 4155329257)

    internal val getVariationOpentypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontVariation", "get_variation_opentype", 3102165223)

    internal val setVariationEmboldenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontVariation", "set_variation_embolden", 373806689)

    internal val getVariationEmboldenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontVariation", "get_variation_embolden", 1740695150)

    internal val setVariationFaceIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontVariation", "set_variation_face_index", 1286410249)

    internal val getVariationFaceIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontVariation", "get_variation_face_index", 3905245786)

    internal val setVariationTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontVariation", "set_variation_transform", 2761652528)

    internal val getVariationTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontVariation", "get_variation_transform", 3814499831)

    internal val setOpentypeFeaturesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontVariation", "set_opentype_features", 4155329257)

    internal val setSpacingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontVariation", "set_spacing", 3122339690)

    internal val setBaselineOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontVariation", "set_baseline_offset", 373806689)

    internal val getBaselineOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontVariation", "get_baseline_offset", 1740695150)
  }
}
