// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.Color
import godot.core.Dictionary
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Controls how an individual character will be displayed in a [godot.RichTextEffect].
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/gui/bbcode_in_richtextlabel.html](https://docs.godotengine.org/en/latest/tutorials/gui/bbcode_in_richtextlabel.html)
 * [https://github.com/Eoin-ONeill-Yokai/Godot-Rich-Text-Effect-Test-Project](https://github.com/Eoin-ONeill-Yokai/Godot-Rich-Text-Effect-Test-Project)
 *
 * By setting various properties on this object, you can control how individual characters will be displayed in a [godot.RichTextEffect].
 */
@GodotBaseType
open class CharFXTransform : Reference() {
  /**
   * The index of the current character (starting from 0). Setting this property won't affect drawing.
   */
  open var absoluteIndex: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARFXTRANSFORM_GET_ABSOLUTE_INDEX, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARFXTRANSFORM_SET_ABSOLUTE_INDEX, NIL)
    }

  /**
   * The Unicode codepoint the character will use. This only affects non-whitespace characters. [@GDScript.ord] can be useful here. For example, the following will replace all characters with asterisks:
   *
   * ```
   * 			# `char_fx` is the CharFXTransform parameter from `_process_custom_fx()`.
   * 			# See the RichTextEffect documentation for details.
   * 			char_fx.character = ord("*")
   * 			```
   */
  open var character: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARFXTRANSFORM_GET_CHARACTER,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARFXTRANSFORM_SET_CHARACTER,
          NIL)
    }

  /**
   * The color the character will be drawn with.
   */
  open var color: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARFXTRANSFORM_GET_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARFXTRANSFORM_SET_COLOR, NIL)
    }

  /**
   * The time elapsed since the [godot.RichTextLabel] was added to the scene tree (in seconds). Time stops when the project is paused, unless the [godot.RichTextLabel]'s [godot.Node.pauseMode] is set to [godot.Node.PAUSE_MODE_PROCESS].
   *
   * **Note:** Time still passes while the [godot.RichTextLabel] is hidden.
   */
  open var elapsedTime: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARFXTRANSFORM_GET_ELAPSED_TIME,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARFXTRANSFORM_SET_ELAPSED_TIME,
          NIL)
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
  open var env: Dictionary<Any?, Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARFXTRANSFORM_GET_ENV,
          DICTIONARY)
      return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
    }
    set(value) {
      TransferContext.writeArguments(DICTIONARY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARFXTRANSFORM_SET_ENV, NIL)
    }

  /**
   * The position offset the character will be drawn with (in pixels).
   */
  open var offset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARFXTRANSFORM_GET_OFFSET,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARFXTRANSFORM_SET_OFFSET, NIL)
    }

  /**
   * The index of the current character (starting from 0). Setting this property won't affect drawing.
   */
  open var relativeIndex: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARFXTRANSFORM_GET_RELATIVE_INDEX, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_CHARFXTRANSFORM_SET_RELATIVE_INDEX, NIL)
    }

  /**
   * If `true`, the character will be drawn. If `false`, the character will be hidden. Characters around hidden characters will reflow to take the space of hidden characters. If this is not desired, set their [color] to `Color(1, 1, 1, 0)` instead.
   */
  open var visible: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARFXTRANSFORM_GET_VISIBLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CHARFXTRANSFORM_SET_VISIBLE, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_CHARFXTRANSFORM)

  open fun color(schedule: Color.() -> Unit): Color = color.apply{
      schedule(this)
      color = this
  }


  open fun offset(schedule: Vector2.() -> Unit): Vector2 = offset.apply{
      schedule(this)
      offset = this
  }

}
