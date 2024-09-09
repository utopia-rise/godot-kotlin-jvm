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
import godot.core.Transform2D
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.TRANSFORM2D
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
 * By setting various properties on this object, you can control how individual characters will be
 * displayed in a [RichTextEffect].
 */
@GodotBaseType
public open class CharFXTransform : RefCounted() {
  /**
   * The current transform of the current glyph. It can be overridden (for example, by driving the
   * position and rotation from a curve). You can also alter the existing value to apply transforms on
   * top of other effects.
   */
  @CoreTypeLocalCopy
  public var transform: Transform2D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTransformPtr, TRANSFORM2D)
      return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM2D to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTransformPtr, NIL)
    }

  /**
   * Absolute character range in the string, corresponding to the glyph. Setting this property won't
   * affect drawing.
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
   * The time elapsed since the [RichTextLabel] was added to the scene tree (in seconds). Time stops
   * when the [RichTextLabel] is paused (see [Node.processMode]). Resets when the text in the
   * [RichTextLabel] is changed.
   * **Note:** Time still passes while the [RichTextLabel] is hidden.
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
   * If `true`, the character will be drawn. If `false`, the character will be hidden. Characters
   * around hidden characters will reflow to take the space of hidden characters. If this is not
   * desired, set their [color] to `Color(1, 1, 1, 0)` instead.
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
   * If `true`, FX transform is called for outline drawing. Setting this property won't affect
   * drawing.
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
   * Contains the arguments passed in the opening BBCode tag. By default, arguments are strings; if
   * their contents match a type such as [bool], [int] or [float], they will be converted
   * automatically. Color codes in the form `#rrggbb` or `#rgb` will be converted to an opaque [Color].
   * String arguments may not contain spaces, even if they're quoted. If present, quotes will also be
   * present in the final string.
   * For example, the opening BBCode tag `[example foo=hello bar=true baz=42 color=#ffffff]` will
   * map to the following [Dictionary]:
   * [codeblock]
   * {"foo": "hello", "bar": true, "baz": 42, "color": Color(1, 1, 1, 1)}
   * [/codeblock]
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
   * Number of glyphs in the grapheme cluster. This value is set in the first glyph of a cluster.
   * Setting this property won't affect drawing.
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
   * Glyph flags. See [TextServer.GraphemeFlag] for more info. Setting this property won't affect
   * drawing.
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
   * The character offset of the glyph, relative to the current [RichTextEffect] custom block.
   * Setting this property won't affect drawing.
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

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_CHARFXTRANSFORM, scriptIndex)
  }

  /**
   * The current transform of the current glyph. It can be overridden (for example, by driving the
   * position and rotation from a curve). You can also alter the existing value to apply transforms on
   * top of other effects.
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
   * val myCoreType = charfxtransform.transform
   * //Your changes
   * charfxtransform.transform = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun transformMutate(block: Transform2D.() -> Unit): Transform2D = transform.apply{
      block(this)
      transform = this
  }


  /**
   * Absolute character range in the string, corresponding to the glyph. Setting this property won't
   * affect drawing.
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
    public val getTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "get_transform", 3761352769)

    public val setTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "set_transform", 2761652528)

    public val getRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "get_range", 2741790807)

    public val setRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "set_range", 1130785943)

    public val getElapsedTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "get_elapsed_time", 191475506)

    public val setElapsedTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "set_elapsed_time", 373806689)

    public val isVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "is_visible", 2240911060)

    public val setVisibilityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "set_visibility", 2586408642)

    public val isOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "is_outline", 2240911060)

    public val setOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "set_outline", 2586408642)

    public val getOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "get_offset", 1497962370)

    public val setOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "set_offset", 743155724)

    public val getColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "get_color", 3200896285)

    public val setColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "set_color", 2920490490)

    public val getEnvironmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "get_environment", 2382534195)

    public val setEnvironmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "set_environment", 4155329257)

    public val getGlyphIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "get_glyph_index", 3905245786)

    public val setGlyphIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "set_glyph_index", 1286410249)

    public val getRelativeIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "get_relative_index", 3905245786)

    public val setRelativeIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "set_relative_index", 1286410249)

    public val getGlyphCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "get_glyph_count", 3905245786)

    public val setGlyphCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "set_glyph_count", 1286410249)

    public val getGlyphFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "get_glyph_flags", 3905245786)

    public val setGlyphFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "set_glyph_flags", 1286410249)

    public val getFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "get_font", 2944877500)

    public val setFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "set_font", 2722037293)
  }
}
