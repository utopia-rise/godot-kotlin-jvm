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
import godot.core.Color
import godot.core.Dictionary
import godot.core.RID
import godot.core.Transform2D
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DICTIONARY
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.TRANSFORM2D
import godot.core.VariantParser.VECTOR2
import godot.core.VariantParser.VECTOR2I
import godot.core.VariantParser._RID
import godot.core.Vector2
import godot.core.Vector2i
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
  public final inline var transform: Transform2D
    @JvmName("transformProperty")
    get() = getTransform()
    @JvmName("transformProperty")
    set(`value`) {
      setTransform(value)
    }

  /**
   * Absolute character range in the string, corresponding to the glyph. Setting this property won't
   * affect drawing.
   */
  @CoreTypeLocalCopy
  public final inline var range: Vector2i
    @JvmName("rangeProperty")
    get() = getRange()
    @JvmName("rangeProperty")
    set(`value`) {
      setRange(value)
    }

  /**
   * The time elapsed since the [RichTextLabel] was added to the scene tree (in seconds). Time stops
   * when the [RichTextLabel] is paused (see [Node.processMode]). Resets when the text in the
   * [RichTextLabel] is changed.
   * **Note:** Time still passes while the [RichTextLabel] is hidden.
   */
  public final inline var elapsedTime: Double
    @JvmName("elapsedTimeProperty")
    get() = getElapsedTime()
    @JvmName("elapsedTimeProperty")
    set(`value`) {
      setElapsedTime(value)
    }

  /**
   * If `true`, the character will be drawn. If `false`, the character will be hidden. Characters
   * around hidden characters will reflow to take the space of hidden characters. If this is not
   * desired, set their [color] to `Color(1, 1, 1, 0)` instead.
   */
  public final inline var visible: Boolean
    @JvmName("visibleProperty")
    get() = isVisible()
    @JvmName("visibleProperty")
    set(`value`) {
      setVisibility(value)
    }

  /**
   * If `true`, FX transform is called for outline drawing. Setting this property won't affect
   * drawing.
   */
  public final inline var outline: Boolean
    @JvmName("outlineProperty")
    get() = isOutline()
    @JvmName("outlineProperty")
    set(`value`) {
      setOutline(value)
    }

  /**
   * The position offset the character will be drawn with (in pixels).
   */
  @CoreTypeLocalCopy
  public final inline var offset: Vector2
    @JvmName("offsetProperty")
    get() = getOffset()
    @JvmName("offsetProperty")
    set(`value`) {
      setOffset(value)
    }

  /**
   * The color the character will be drawn with.
   */
  @CoreTypeLocalCopy
  public final inline var color: Color
    @JvmName("colorProperty")
    get() = getColor()
    @JvmName("colorProperty")
    set(`value`) {
      setColor(value)
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
  public final inline var env: Dictionary<Any?, Any?>
    @JvmName("envProperty")
    get() = getEnvironment()
    @JvmName("envProperty")
    set(`value`) {
      setEnvironment(value)
    }

  /**
   * Font specific glyph index.
   */
  public final inline var glyphIndex: Long
    @JvmName("glyphIndexProperty")
    get() = getGlyphIndex()
    @JvmName("glyphIndexProperty")
    set(`value`) {
      setGlyphIndex(value)
    }

  /**
   * Number of glyphs in the grapheme cluster. This value is set in the first glyph of a cluster.
   * Setting this property won't affect drawing.
   */
  public final inline var glyphCount: Int
    @JvmName("glyphCountProperty")
    get() = getGlyphCount()
    @JvmName("glyphCountProperty")
    set(`value`) {
      setGlyphCount(value)
    }

  /**
   * Glyph flags. See [TextServer.GraphemeFlag] for more info. Setting this property won't affect
   * drawing.
   */
  public final inline var glyphFlags: Int
    @JvmName("glyphFlagsProperty")
    get() = getGlyphFlags()
    @JvmName("glyphFlagsProperty")
    set(`value`) {
      setGlyphFlags(value)
    }

  /**
   * The character offset of the glyph, relative to the current [RichTextEffect] custom block.
   * Setting this property won't affect drawing.
   */
  public final inline var relativeIndex: Int
    @JvmName("relativeIndexProperty")
    get() = getRelativeIndex()
    @JvmName("relativeIndexProperty")
    set(`value`) {
      setRelativeIndex(value)
    }

  /**
   * Font resource used to render glyph.
   */
  public final inline var font: RID
    @JvmName("fontProperty")
    get() = getFont()
    @JvmName("fontProperty")
    set(`value`) {
      setFont(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(178, scriptIndex)
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
  public final fun transformMutate(block: Transform2D.() -> Unit): Transform2D = transform.apply{
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
  public final fun rangeMutate(block: Vector2i.() -> Unit): Vector2i = range.apply{
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
  public final fun offsetMutate(block: Vector2.() -> Unit): Vector2 = offset.apply{
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
  public final fun colorMutate(block: Color.() -> Unit): Color = color.apply{
      block(this)
      color = this
  }


  public final fun getTransform(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTransformPtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D) as Transform2D)
  }

  public final fun setTransform(transform: Transform2D): Unit {
    TransferContext.writeArguments(TRANSFORM2D to transform)
    TransferContext.callMethod(ptr, MethodBindings.setTransformPtr, NIL)
  }

  public final fun getRange(): Vector2i {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRangePtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  public final fun setRange(range: Vector2i): Unit {
    TransferContext.writeArguments(VECTOR2I to range)
    TransferContext.callMethod(ptr, MethodBindings.setRangePtr, NIL)
  }

  public final fun getElapsedTime(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getElapsedTimePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  public final fun setElapsedTime(time: Double): Unit {
    TransferContext.writeArguments(DOUBLE to time)
    TransferContext.callMethod(ptr, MethodBindings.setElapsedTimePtr, NIL)
  }

  public final fun isVisible(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isVisiblePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setVisibility(visibility: Boolean): Unit {
    TransferContext.writeArguments(BOOL to visibility)
    TransferContext.callMethod(ptr, MethodBindings.setVisibilityPtr, NIL)
  }

  public final fun isOutline(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isOutlinePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setOutline(outline: Boolean): Unit {
    TransferContext.writeArguments(BOOL to outline)
    TransferContext.callMethod(ptr, MethodBindings.setOutlinePtr, NIL)
  }

  public final fun getOffset(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOffsetPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  public final fun setOffset(offset: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to offset)
    TransferContext.callMethod(ptr, MethodBindings.setOffsetPtr, NIL)
  }

  public final fun getColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setColorPtr, NIL)
  }

  public final fun getEnvironment(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEnvironmentPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  public final fun setEnvironment(environment: Dictionary<Any?, Any?>): Unit {
    TransferContext.writeArguments(DICTIONARY to environment)
    TransferContext.callMethod(ptr, MethodBindings.setEnvironmentPtr, NIL)
  }

  public final fun getGlyphIndex(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGlyphIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setGlyphIndex(glyphIndex: Long): Unit {
    TransferContext.writeArguments(LONG to glyphIndex)
    TransferContext.callMethod(ptr, MethodBindings.setGlyphIndexPtr, NIL)
  }

  public final fun getRelativeIndex(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRelativeIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setRelativeIndex(relativeIndex: Int): Unit {
    TransferContext.writeArguments(LONG to relativeIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setRelativeIndexPtr, NIL)
  }

  public final fun getGlyphCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGlyphCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setGlyphCount(glyphCount: Int): Unit {
    TransferContext.writeArguments(LONG to glyphCount.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setGlyphCountPtr, NIL)
  }

  public final fun getGlyphFlags(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGlyphFlagsPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setGlyphFlags(glyphFlags: Int): Unit {
    TransferContext.writeArguments(LONG to glyphFlags.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setGlyphFlagsPtr, NIL)
  }

  public final fun getFont(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFontPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  public final fun setFont(font: RID): Unit {
    TransferContext.writeArguments(_RID to font)
    TransferContext.callMethod(ptr, MethodBindings.setFontPtr, NIL)
  }

  public companion object

  public object MethodBindings {
    internal val getTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "get_transform", 3761352769)

    internal val setTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "set_transform", 2761652528)

    internal val getRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "get_range", 2741790807)

    internal val setRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "set_range", 1130785943)

    internal val getElapsedTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "get_elapsed_time", 191475506)

    internal val setElapsedTimePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "set_elapsed_time", 373806689)

    internal val isVisiblePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "is_visible", 2240911060)

    internal val setVisibilityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "set_visibility", 2586408642)

    internal val isOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "is_outline", 2240911060)

    internal val setOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "set_outline", 2586408642)

    internal val getOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "get_offset", 1497962370)

    internal val setOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "set_offset", 743155724)

    internal val getColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "get_color", 3200896285)

    internal val setColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "set_color", 2920490490)

    internal val getEnvironmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "get_environment", 2382534195)

    internal val setEnvironmentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "set_environment", 4155329257)

    internal val getGlyphIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "get_glyph_index", 3905245786)

    internal val setGlyphIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "set_glyph_index", 1286410249)

    internal val getRelativeIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "get_relative_index", 3905245786)

    internal val setRelativeIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "set_relative_index", 1286410249)

    internal val getGlyphCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "get_glyph_count", 3905245786)

    internal val setGlyphCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "set_glyph_count", 1286410249)

    internal val getGlyphFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "get_glyph_flags", 3905245786)

    internal val setGlyphFlagsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "set_glyph_flags", 1286410249)

    internal val getFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "get_font", 2944877500)

    internal val setFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CharFXTransform", "set_font", 2722037293)
  }
}
