// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Dictionary
import godot.core.RID
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
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

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
  public var range: Vector2i
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARFXTRANSFORM_GET_RANGE,
          VECTOR2I)
      return TransferContext.readReturnValue(VECTOR2I, false) as Vector2i
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2I to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARFXTRANSFORM_SET_RANGE, NIL)
    }

  /**
   * The time elapsed since the [godot.RichTextLabel] was added to the scene tree (in seconds). Time stops when the [godot.RichTextLabel] is paused (see [godot.Node.processMode]). Resets when the text in the [godot.RichTextLabel] is changed.
   *
   * **Note:** Time still passes while the [godot.RichTextLabel] is hidden.
   */
  public var elapsedTime: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARFXTRANSFORM_GET_ELAPSED_TIME,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARFXTRANSFORM_SET_ELAPSED_TIME,
          NIL)
    }

  /**
   * If `true`, the character will be drawn. If `false`, the character will be hidden. Characters around hidden characters will reflow to take the space of hidden characters. If this is not desired, set their [color] to `Color(1, 1, 1, 0)` instead.
   */
  public var visible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARFXTRANSFORM_IS_VISIBLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARFXTRANSFORM_SET_VISIBILITY,
          NIL)
    }

  /**
   * If `true`, FX transform is called for outline drawing. Setting this property won't affect drawing.
   */
  public var outline: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARFXTRANSFORM_IS_OUTLINE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARFXTRANSFORM_SET_OUTLINE, NIL)
    }

  /**
   * The position offset the character will be drawn with (in pixels).
   */
  public var offset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARFXTRANSFORM_GET_OFFSET,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARFXTRANSFORM_SET_OFFSET, NIL)
    }

  /**
   * The color the character will be drawn with.
   */
  public var color: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARFXTRANSFORM_GET_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARFXTRANSFORM_SET_COLOR, NIL)
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
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARFXTRANSFORM_GET_ENVIRONMENT,
          DICTIONARY)
      return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(DICTIONARY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARFXTRANSFORM_SET_ENVIRONMENT,
          NIL)
    }

  /**
   * Font specific glyph index.
   */
  public var glyphIndex: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARFXTRANSFORM_GET_GLYPH_INDEX,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARFXTRANSFORM_SET_GLYPH_INDEX,
          NIL)
    }

  /**
   * Number of glyphs in the grapheme cluster. This value is set in the first glyph of a cluster. Setting this property won't affect drawing.
   */
  public var glyphCount: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARFXTRANSFORM_GET_GLYPH_COUNT,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARFXTRANSFORM_SET_GLYPH_COUNT,
          NIL)
    }

  /**
   * Glyph flags. See [enum TextServer.GraphemeFlag] for more info. Setting this property won't affect drawing.
   */
  public var glyphFlags: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARFXTRANSFORM_GET_GLYPH_FLAGS,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARFXTRANSFORM_SET_GLYPH_FLAGS,
          NIL)
    }

  /**
   * The character offset of the glyph, relative to the current [godot.RichTextEffect] custom block. Setting this property won't affect drawing.
   */
  public var relativeIndex: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARFXTRANSFORM_GET_RELATIVE_INDEX, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARFXTRANSFORM_SET_RELATIVE_INDEX, NIL)
    }

  /**
   * Font resource used to render glyph.
   */
  public var font: RID
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARFXTRANSFORM_GET_FONT, _RID)
      return TransferContext.readReturnValue(_RID, false) as RID
    }
    set(`value`) {
      TransferContext.writeArguments(_RID to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARFXTRANSFORM_SET_FONT, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CHARFXTRANSFORM, scriptIndex)
    return true
  }

  public companion object
}
