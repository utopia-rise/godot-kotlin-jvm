// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.Transform2D
import godot.core.VariantArray
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.TRANSFORM2D
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A variation of a font with additional settings.
 *
 * Provides OpenType variations, simulated bold / slant, and additional font settings like OpenType features and extra spacing.
 *
 * To use simulated bold font variant:
 *
 * [codeblocks]
 *
 * [gdscript]
 *
 * var fv = FontVariation.new()
 *
 * fv.set_base_font(load("res://BarlowCondensed-Regular.ttf"))
 *
 * fv.set_variation_embolden(1.2)
 *
 * $Label.add_theme_font_override("font", fv)
 *
 * $Label.add_theme_font_size_override("font_size", 64)
 *
 * [/gdscript]
 *
 * [csharp]
 *
 * var fv = new FontVariation();
 *
 * fv.SetBaseFont(ResourceLoader.Load<FontFile>("res://BarlowCondensed-Regular.ttf"));
 *
 * fv.SetVariationEmbolden(1.2);
 *
 * GetNode("Label").AddThemeFontOverride("font", fv);
 *
 * GetNode("Label").AddThemeFontSizeOverride("font_size", 64);
 *
 * [/csharp]
 *
 * [/codeblocks]
 *
 * To set the coordinate of multiple variation axes:
 *
 * ```
 * 		var fv = FontVariation.new();
 * 		var ts = TextServerManager.get_primary_interface()
 * 		fv.base_font = load("res://BarlowCondensed-Regular.ttf")
 * 		fv.variation_opentype = { ts.name_to_tag("wght"): 900, ts.name_to_tag("custom_hght"): 900 }
 * 		```
 */
@GodotBaseType
public open class FontVariation : Font() {
  /**
   * Base font used to create a variation. If not set, default [godot.Theme] font is used.
   */
  public var baseFont: Font?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTVARIATION_GET_BASE_FONT,
          OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Font?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTVARIATION_SET_BASE_FONT, NIL)
    }

  /**
   * Array of fallback [godot.Font]s to use as a substitute if a glyph is not found in this [godot.FontVariation]. If not set, [baseFont]'s fallbacks are used instead.
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

  /**
   * Font OpenType variation coordinates. More info: [godot.OpenType variation tags](https://docs.microsoft.com/en-us/typography/opentype/spec/dvaraxisreg).
   *
   * **Note:** This [godot.core.Dictionary] uses OpenType tags as keys. Variation axes can be identified both by tags(`int`) and names (`string`). Some axes might be accessible by multiple names. For example, `wght` refers to the same axis as `weight`. Tags on the other hand are unique. To convert between names and tags, use [godot.TextServer.nameToTag] and [godot.TextServer.tagToName].
   *
   * **Note:** To get available variation axes of a font, use [godot.Font.getSupportedVariationList].
   */
  public var variationOpentype: Dictionary<Any?, Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FONTVARIATION_GET_VARIATION_OPENTYPE, DICTIONARY)
      return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
    }
    set(`value`) {
      TransferContext.writeArguments(DICTIONARY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FONTVARIATION_SET_VARIATION_OPENTYPE, NIL)
    }

  /**
   * Active face index in the TrueType / OpenType collection file.
   */
  public var variationFaceIndex: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FONTVARIATION_GET_VARIATION_FACE_INDEX, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FONTVARIATION_SET_VARIATION_FACE_INDEX, NIL)
    }

  /**
   * If is not equal to zero, emboldens the font outlines. Negative values reduce the outline thickness.
   *
   * **Note:** Emboldened fonts might have self-intersecting outlines, which will prevent MSDF fonts and [godot.TextMesh] from working correctly.
   */
  public var variationEmbolden: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FONTVARIATION_GET_VARIATION_EMBOLDEN, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FONTVARIATION_SET_VARIATION_EMBOLDEN, NIL)
    }

  /**
   * 2D transform, applied to the font outlines, can be used for slanting, flipping and rotating glyphs.
   *
   * For example, to simulate italic typeface by slanting, apply the following transform `Transform2D(1.0, slant, 0.0, 1.0, 0.0, 0.0)`.
   */
  public var variationTransform: Transform2D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FONTVARIATION_GET_VARIATION_TRANSFORM, TRANSFORM2D)
      return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM2D to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FONTVARIATION_SET_VARIATION_TRANSFORM, NIL)
    }

  /**
   * A set of OpenType feature tags. More info: [godot.OpenType feature tags](https://docs.microsoft.com/en-us/typography/opentype/spec/featuretags).
   */
  public var opentypeFeatures: Dictionary<Any?, Any?>
    @JvmName("getOpentypeFeatures_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getOpentypeFeatures()
    set(`value`) {
      TransferContext.writeArguments(DICTIONARY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FONTVARIATION_SET_OPENTYPE_FEATURES, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_FONTVARIATION, scriptIndex)
    return true
  }

  /**
   * 2D transform, applied to the font outlines, can be used for slanting, flipping and rotating glyphs.
   *
   * For example, to simulate italic typeface by slanting, apply the following transform `Transform2D(1.0, slant, 0.0, 1.0, 0.0, 0.0)`.
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
  public open fun variationTransform(block: Transform2D.() -> Unit): Transform2D =
      variationTransform.apply{
      block(this)
      variationTransform = this
  }


  /**
   * Sets the spacing for `type` (see [enum TextServer.SpacingType]) to [value] in pixels (not relative to the font size).
   */
  public fun setSpacing(spacing: TextServer.SpacingType, `value`: Int): Unit {
    TransferContext.writeArguments(LONG to spacing.id, LONG to value.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTVARIATION_SET_SPACING, NIL)
  }

  public companion object
}
