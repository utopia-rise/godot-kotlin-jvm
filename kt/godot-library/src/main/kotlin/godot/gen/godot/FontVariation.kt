// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.Transform2D
import godot.core.TypeManager
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.TRANSFORM2D
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.UninitializedPropertyAccessException
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
      TransferContext.callMethod(rawPtr, MethodBindings.getBaseFontPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Font?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBaseFontPtr, NIL)
    }

  /**
   * Font OpenType variation coordinates. More info: [godot.OpenType variation tags](https://docs.microsoft.com/en-us/typography/opentype/spec/dvaraxisreg).
   *
   * **Note:** This [godot.core.Dictionary] uses OpenType tags as keys. Variation axes can be identified both by tags ([int], e.g. `0x77678674`) and names ([godot.String], e.g. `wght`). Some axes might be accessible by multiple names. For example, `wght` refers to the same axis as `weight`. Tags on the other hand are unique. To convert between names and tags, use [godot.TextServer.nameToTag] and [godot.TextServer.tagToName].
   *
   * **Note:** To get available variation axes of a font, use [godot.Font.getSupportedVariationList].
   */
  public var variationOpentype: Dictionary<Any?, Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVariationOpentypePtr, DICTIONARY)
      return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
    }
    set(`value`) {
      TransferContext.writeArguments(DICTIONARY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVariationOpentypePtr, NIL)
    }

  /**
   * Active face index in the TrueType / OpenType collection file.
   */
  public var variationFaceIndex: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVariationFaceIndexPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setVariationFaceIndexPtr, NIL)
    }

  /**
   * If is not equal to zero, emboldens the font outlines. Negative values reduce the outline thickness.
   *
   * **Note:** Emboldened fonts might have self-intersecting outlines, which will prevent MSDF fonts and [godot.TextMesh] from working correctly.
   */
  public var variationEmbolden: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVariationEmboldenPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setVariationEmboldenPtr, NIL)
    }

  /**
   * 2D transform, applied to the font outlines, can be used for slanting, flipping and rotating glyphs.
   *
   * For example, to simulate italic typeface by slanting, apply the following transform `Transform2D(1.0, slant, 0.0, 1.0, 0.0, 0.0)`.
   */
  @CoreTypeLocalCopy
  public var variationTransform: Transform2D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVariationTransformPtr, TRANSFORM2D)
      return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM2D to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVariationTransformPtr, NIL)
    }

  /**
   * A set of OpenType feature tags. More info: [godot.OpenType feature tags](https://docs.microsoft.com/en-us/typography/opentype/spec/featuretags).
   */
  public var opentypeFeatures: Dictionary<Any?, Any?>
    @JvmName("getOpentypeFeatures_prop")
    get() = super.getOpentypeFeatures()
    set(`value`) {
      TransferContext.writeArguments(DICTIONARY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOpentypeFeaturesPtr, NIL)
    }

  /**
   * Extra spacing between graphical glyphs.
   */
  public var spacingGlyph: Long
    get() {
      throw
          UninitializedPropertyAccessException("Cannot access property spacingGlyph: has no getter")
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 0L, LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSpacingPtr, NIL)
    }

  /**
   * Extra width of the space glyphs.
   */
  public var spacingSpace: Long
    get() {
      throw
          UninitializedPropertyAccessException("Cannot access property spacingSpace: has no getter")
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 1L, LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSpacingPtr, NIL)
    }

  /**
   * Extra spacing at the top of the line in pixels.
   */
  public var spacingTop: Long
    get() {
      throw UninitializedPropertyAccessException("Cannot access property spacingTop: has no getter")
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 2L, LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSpacingPtr, NIL)
    }

  /**
   * Extra spacing at the bottom of the line in pixels.
   */
  public var spacingBottom: Long
    get() {
      throw
          UninitializedPropertyAccessException("Cannot access property spacingBottom: has no getter")
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to 3L, LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSpacingPtr, NIL)
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
  public open fun variationTransformMutate(block: Transform2D.() -> Unit): Transform2D =
      variationTransform.apply{
      block(this)
      variationTransform = this
  }


  public companion object

  internal object MethodBindings {
    public val setBaseFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontVariation", "set_base_font")

    public val getBaseFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontVariation", "get_base_font")

    public val setVariationOpentypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontVariation", "set_variation_opentype")

    public val getVariationOpentypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontVariation", "get_variation_opentype")

    public val setVariationEmboldenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontVariation", "set_variation_embolden")

    public val getVariationEmboldenPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontVariation", "get_variation_embolden")

    public val setVariationFaceIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontVariation", "set_variation_face_index")

    public val getVariationFaceIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontVariation", "get_variation_face_index")

    public val setVariationTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontVariation", "set_variation_transform")

    public val getVariationTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontVariation", "get_variation_transform")

    public val setOpentypeFeaturesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FontVariation", "set_opentype_features")

    public val setSpacingPtr: VoidPtr = TypeManager.getMethodBindPtr("FontVariation", "set_spacing")
  }
}
