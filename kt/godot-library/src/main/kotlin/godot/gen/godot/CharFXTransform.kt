// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Dictionary
import godot.core.RID
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR2I
import godot.core.VariantType._RID
import godot.core.Vector2
import godot.core.Vector2i
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Controls how an individual character will be displayed in a [godot.RichTextEffect].
 *
 * Tutorials:
 * [https://github.com/Eoin-ONeill-Yokai/Godot-Rich-Text-Effect-Test-Project](https://github.com/Eoin-ONeill-Yokai/Godot-Rich-Text-Effect-Test-Project)
 *
 * By setting various properties on this object, you can control how individual characters will be displayed in a [godot.RichTextEffect].
 */
@GodotBaseType
public open class CharFXTransform : RefCounted() {
  /**
   * Absolute character range in the string, corresponding to the glyph. Setting this property won't affect drawing.
   */
  @CoreTypeLocalCopy
  public var range: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRangePtr, VECTOR2I)
      return (TransferContext.readReturnValue(VECTOR2I, false) as Vector2i)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRangePtr, NIL)
    }

  /**
   * The time elapsed since the [godot.RichTextLabel] was added to the scene tree (in seconds). Time stops when the [godot.RichTextLabel] is paused (see [godot.Node.processMode]). Resets when the text in the [godot.RichTextLabel] is changed.
   *
   * **Note:** Time still passes while the [godot.RichTextLabel] is hidden.
   */
  public var elapsedTime: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getElapsedTimePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double)
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setElapsedTimePtr, NIL)
    }

  /**
   * If `true`, the character will be drawn. If `false`, the character will be hidden. Characters around hidden characters will reflow to take the space of hidden characters. If this is not desired, set their [color] to `Color(1, 1, 1, 0)` instead.
   */
  public var visible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isVisiblePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVisibilityPtr, NIL)
    }

  /**
   * If `true`, FX transform is called for outline drawing. Setting this property won't affect drawing.
   */
  public var outline: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isOutlinePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOutlinePtr, NIL)
    }

  /**
   * The position offset the character will be drawn with (in pixels).
   */
  @CoreTypeLocalCopy
  public var offset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOffsetPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOffsetPtr, NIL)
    }

  /**
   * The color the character will be drawn with.
   */
  @CoreTypeLocalCopy
  public var color: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setColorPtr, NIL)
    }

  /**
   * Contains the arguments passed in the opening BBCode tag. By default, arguments are strings; if their contents match a type such as [bool], [int] or [float], they will be converted automatically. Color codes in the form `#rrggbb` or `#rgb` will be converted to an opaque [godot.core.Color]. String arguments may not contain spaces, even if they're quoted. If present, quotes will also be present in the final string.
   *
   * For example, the opening BBCode tag `[example foo=hello bar=true baz=42 color=#ffffff]` will map to the following [godot.core.Dictionary]:
   *
   * ```
   * 			{"foo": "hello", "bar": true, "baz": 42, "color": Color(1, 1, 1, 1)}
   * 			```
   */
  public var env: Dictionary<Any?, Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEnvironmentPtr, DICTIONARY)
      return (TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>)
    }
    set(`value`) {
      TransferContext.writeArguments(DICTIONARY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnvironmentPtr, NIL)
    }

  /**
   * Font specific glyph index.
   */
  public var glyphIndex: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlyphIndexPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGlyphIndexPtr, NIL)
    }

  /**
   * Number of glyphs in the grapheme cluster. This value is set in the first glyph of a cluster. Setting this property won't affect drawing.
   */
  public var glyphCount: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlyphCountPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setGlyphCountPtr, NIL)
    }

  /**
   * Glyph flags. See [enum TextServer.GraphemeFlag] for more info. Setting this property won't affect drawing.
   */
  public var glyphFlags: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGlyphFlagsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setGlyphFlagsPtr, NIL)
    }

  /**
   * The character offset of the glyph, relative to the current [godot.RichTextEffect] custom block. Setting this property won't affect drawing.
   */
  public var relativeIndex: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRelativeIndexPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setRelativeIndexPtr, NIL)
    }

  /**
   * Font resource used to render glyph.
   */
  public var font: RID
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFontPtr, _RID)
      return (TransferContext.readReturnValue(_RID, false) as RID)
    }
    set(`value`) {
      TransferContext.writeArguments(_RID to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFontPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CHARFXTRANSFORM, scriptIndex)
    return true
  }

  /**
   * Absolute character range in the string, corresponding to the glyph. Setting this property won't affect drawing.
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
   * val myCoreType = charfxtransform.range
   * //Your changes
   * charfxtransform.range = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun rangeMutate(block: Vector2i.() -> Unit): Vector2i = range.apply{
      block(this)
      range = this
  }


  /**
   * The position offset the character will be drawn with (in pixels).
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
   * val myCoreType = charfxtransform.offset
   * //Your changes
   * charfxtransform.offset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun offsetMutate(block: Vector2.() -> Unit): Vector2 = offset.apply{
      block(this)
      offset = this
  }


  /**
   * The color the character will be drawn with.
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
   * val myCoreType = charfxtransform.color
   * //Your changes
   * charfxtransform.color = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun colorMutate(block: Color.() -> Unit): Color = color.apply{
      block(this)
      color = this
  }


  public companion object

  internal object MethodBindings {
    public val getRangePtr: VoidPtr = TypeManager.getMethodBindPtr("CharFXTransform", "get_range")

    public val setRangePtr: VoidPtr = TypeManager.getMethodBindPtr("CharFXTransform", "set_range")

    public val getElapsedTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "get_elapsed_time")

    public val setElapsedTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "set_elapsed_time")

    public val isVisiblePtr: VoidPtr = TypeManager.getMethodBindPtr("CharFXTransform", "is_visible")

    public val setVisibilityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "set_visibility")

    public val isOutlinePtr: VoidPtr = TypeManager.getMethodBindPtr("CharFXTransform", "is_outline")

    public val setOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "set_outline")

    public val getOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("CharFXTransform", "get_offset")

    public val setOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("CharFXTransform", "set_offset")

    public val getColorPtr: VoidPtr = TypeManager.getMethodBindPtr("CharFXTransform", "get_color")

    public val setColorPtr: VoidPtr = TypeManager.getMethodBindPtr("CharFXTransform", "set_color")

    public val getEnvironmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "get_environment")

    public val setEnvironmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "set_environment")

    public val getGlyphIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "get_glyph_index")

    public val setGlyphIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "set_glyph_index")

    public val getRelativeIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "get_relative_index")

    public val setRelativeIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "set_relative_index")

    public val getGlyphCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "get_glyph_count")

    public val setGlyphCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "set_glyph_count")

    public val getGlyphFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "get_glyph_flags")

    public val setGlyphFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "set_glyph_flags")

    public val getFontPtr: VoidPtr = TypeManager.getMethodBindPtr("CharFXTransform", "get_font")

    public val setFontPtr: VoidPtr = TypeManager.getMethodBindPtr("CharFXTransform", "set_font")
  }
}
