// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.TextServer.JustificationFlagValue
import godot.`annotation`.GodotBaseType
import godot.core.PackedFloat32Array
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_FLOAT_32_ARRAY
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

/**
 * A control for displaying plain text.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/515](https://godotengine.org/asset-library/asset/515)
 *
 * A control for displaying plain text. It gives you control over the horizontal and vertical alignment and can wrap the text inside the node's bounding rectangle. It doesn't support bold, italics, or other rich text formatting. For that, use [godot.RichTextLabel] instead.
 */
@GodotBaseType
public open class Label : Control() {
  /**
   * The text to display on screen.
   */
  public var text: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_TEXT, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_TEXT, NIL)
    }

  /**
   * A [godot.LabelSettings] resource that can be shared between multiple [godot.Label] nodes. Takes priority over theme properties.
   */
  public var labelSettings: LabelSettings?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_LABEL_SETTINGS, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as LabelSettings?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_LABEL_SETTINGS, NIL)
    }

  /**
   * Controls the text's horizontal alignment. Supports left, center, right, and fill, or justify. Set it to one of the [enum HorizontalAlignment] constants.
   */
  public var horizontalAlignment: HorizontalAlignment
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_HORIZONTAL_ALIGNMENT,
          LONG)
      return HorizontalAlignment.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_HORIZONTAL_ALIGNMENT,
          NIL)
    }

  /**
   * Controls the text's vertical alignment. Supports top, center, bottom, and fill. Set it to one of the [enum VerticalAlignment] constants.
   */
  public var verticalAlignment: VerticalAlignment
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_VERTICAL_ALIGNMENT,
          LONG)
      return VerticalAlignment.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_VERTICAL_ALIGNMENT, NIL)
    }

  /**
   * If set to something other than [godot.TextServer.AUTOWRAP_OFF], the text gets wrapped inside the node's bounding rectangle. If you resize the node, it will change its height automatically to show all the text. To see how each mode behaves, see [enum TextServer.AutowrapMode].
   */
  public var autowrapMode: TextServer.AutowrapMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_AUTOWRAP_MODE, LONG)
      return TextServer.AutowrapMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_AUTOWRAP_MODE, NIL)
    }

  /**
   * Line fill alignment rules. For more info see [enum TextServer.JustificationFlag].
   */
  public var justificationFlags: TextServer.JustificationFlag
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_JUSTIFICATION_FLAGS,
          LONG)
      return JustificationFlagValue(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.flag)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_JUSTIFICATION_FLAGS,
          NIL)
    }

  /**
   * If `true`, the Label only shows the text that fits inside its bounding rectangle and will clip text horizontally.
   */
  public var clipText: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_IS_CLIPPING_TEXT, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_CLIP_TEXT, NIL)
    }

  /**
   * Sets the clipping behavior when the text exceeds the node's bounding rectangle. See [enum TextServer.OverrunBehavior] for a description of all modes.
   */
  public var textOverrunBehavior: TextServer.OverrunBehavior
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_TEXT_OVERRUN_BEHAVIOR,
          LONG)
      return TextServer.OverrunBehavior.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_TEXT_OVERRUN_BEHAVIOR,
          NIL)
    }

  /**
   * If `true`, all the text displays as UPPERCASE.
   */
  public var uppercase: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_IS_UPPERCASE, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_UPPERCASE, NIL)
    }

  /**
   * Aligns text to the given tab-stops.
   */
  public var tabStops: PackedFloat32Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_TAB_STOPS,
          PACKED_FLOAT_32_ARRAY)
      return (TransferContext.readReturnValue(PACKED_FLOAT_32_ARRAY, false) as PackedFloat32Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_FLOAT_32_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_TAB_STOPS, NIL)
    }

  /**
   * The node ignores the first `lines_skipped` lines before it starts to display text.
   */
  public var linesSkipped: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_LINES_SKIPPED, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_LINES_SKIPPED, NIL)
    }

  /**
   * Limits the lines of text the node shows on screen.
   */
  public var maxLinesVisible: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_MAX_LINES_VISIBLE, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_MAX_LINES_VISIBLE, NIL)
    }

  /**
   * The number of characters to display. If set to `-1`, all characters are displayed. This can be useful when animating the text appearing in a dialog box.
   *
   * **Note:** Setting this property updates [visibleRatio] accordingly.
   */
  public var visibleCharacters: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_VISIBLE_CHARACTERS,
          LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_VISIBLE_CHARACTERS, NIL)
    }

  /**
   * Sets the clipping behavior when [visibleCharacters] or [visibleRatio] is set. See [enum TextServer.VisibleCharactersBehavior] for more info.
   */
  public var visibleCharactersBehavior: TextServer.VisibleCharactersBehavior
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LABEL_GET_VISIBLE_CHARACTERS_BEHAVIOR, LONG)
      return TextServer.VisibleCharactersBehavior.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LABEL_SET_VISIBLE_CHARACTERS_BEHAVIOR, NIL)
    }

  /**
   * The fraction of characters to display, relative to the total number of characters (see [getTotalCharacterCount]). If set to `1.0`, all characters are displayed. If set to `0.5`, only half of the characters will be displayed. This can be useful when animating the text appearing in a dialog box.
   *
   * **Note:** Setting this property updates [visibleCharacters] accordingly.
   */
  public var visibleRatio: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_VISIBLE_RATIO, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_VISIBLE_RATIO, NIL)
    }

  /**
   * Base text writing direction.
   */
  public var textDirection: Control.TextDirection
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_TEXT_DIRECTION, LONG)
      return Control.TextDirection.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_TEXT_DIRECTION, NIL)
    }

  /**
   * Language code used for line-breaking and text shaping algorithms, if left empty current locale is used instead.
   */
  public var language: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_LANGUAGE, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_SET_LANGUAGE, NIL)
    }

  /**
   * Set BiDi algorithm override for the structured text.
   */
  public var structuredTextBidiOverride: TextServer.StructuredTextParser
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LABEL_GET_STRUCTURED_TEXT_BIDI_OVERRIDE, LONG)
      return TextServer.StructuredTextParser.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LABEL_SET_STRUCTURED_TEXT_BIDI_OVERRIDE, NIL)
    }

  /**
   * Set additional options for BiDi override.
   */
  public var structuredTextBidiOverrideOptions: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LABEL_GET_STRUCTURED_TEXT_BIDI_OVERRIDE_OPTIONS, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_LABEL_SET_STRUCTURED_TEXT_BIDI_OVERRIDE_OPTIONS, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_LABEL, scriptIndex)
    return true
  }

  /**
   * Returns the height of the line [line].
   *
   * If [line] is set to `-1`, returns the biggest line height.
   *
   * If there are no lines, returns font size in pixels.
   */
  @JvmOverloads
  public fun getLineHeight(line: Int = -1): Int {
    TransferContext.writeArguments(LONG to line.toLong())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_LINE_HEIGHT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the number of lines of text the Label has.
   */
  public fun getLineCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_LINE_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the number of lines shown. Useful if the [godot.Label]'s height cannot currently display all lines.
   */
  public fun getVisibleLineCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_VISIBLE_LINE_COUNT, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the total number of printable characters in the text (excluding spaces and newlines).
   */
  public fun getTotalCharacterCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_LABEL_GET_TOTAL_CHARACTER_COUNT,
        LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public companion object
}
