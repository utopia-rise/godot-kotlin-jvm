// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * A [godot.StyleBox] that displays a single line of a given color and thickness.
 *
 * A [godot.StyleBox] that displays a single line of a given color and thickness. The line can be either horizontal or vertical. Useful for separators.
 */
@GodotBaseType
public open class StyleBoxLine : StyleBox() {
  /**
   * The line's color.
   */
  public var color: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXLINE_GET_COLOR, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXLINE_SET_COLOR, NIL)
    }

  /**
   * The number of pixels the line will extend before the [godot.StyleBoxLine]'s bounds. If set to a negative value, the line will begin inside the [godot.StyleBoxLine]'s bounds.
   */
  public var growBegin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXLINE_GET_GROW_BEGIN,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXLINE_SET_GROW_BEGIN, NIL)
    }

  /**
   * The number of pixels the line will extend past the [godot.StyleBoxLine]'s bounds. If set to a negative value, the line will end inside the [godot.StyleBoxLine]'s bounds.
   */
  public var growEnd: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXLINE_GET_GROW_END, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXLINE_SET_GROW_END, NIL)
    }

  /**
   * The line's thickness in pixels.
   */
  public var thickness: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXLINE_GET_THICKNESS, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXLINE_SET_THICKNESS, NIL)
    }

  /**
   * If `true`, the line will be vertical. If `false`, the line will be horizontal.
   */
  public var vertical: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXLINE_IS_VERTICAL, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXLINE_SET_VERTICAL, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_STYLEBOXLINE, scriptIndex)
    return true
  }

  public companion object
}
