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
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A [StyleBox] that displays a single line of a given color and thickness. The line can be either
 * horizontal or vertical. Useful for separators.
 */
@GodotBaseType
public open class StyleBoxLine : StyleBox() {
  /**
   * The line's color.
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
   * The number of pixels the line will extend before the [StyleBoxLine]'s bounds. If set to a
   * negative value, the line will begin inside the [StyleBoxLine]'s bounds.
   */
  public var growBegin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGrowBeginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setGrowBeginPtr, NIL)
    }

  /**
   * The number of pixels the line will extend past the [StyleBoxLine]'s bounds. If set to a
   * negative value, the line will end inside the [StyleBoxLine]'s bounds.
   */
  public var growEnd: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGrowEndPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setGrowEndPtr, NIL)
    }

  /**
   * The line's thickness in pixels.
   */
  public var thickness: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getThicknessPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setThicknessPtr, NIL)
    }

  /**
   * If `true`, the line will be vertical. If `false`, the line will be horizontal.
   */
  public var vertical: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isVerticalPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVerticalPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_STYLEBOXLINE, scriptIndex)
    return true
  }

  /**
   * The line's color.
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
   * val myCoreType = styleboxline.color
   * //Your changes
   * styleboxline.color = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun colorMutate(block: Color.() -> Unit): Color = color.apply{
      block(this)
      color = this
  }


  public companion object

  internal object MethodBindings {
    public val setColorPtr: VoidPtr = TypeManager.getMethodBindPtr("StyleBoxLine", "set_color")

    public val getColorPtr: VoidPtr = TypeManager.getMethodBindPtr("StyleBoxLine", "get_color")

    public val setThicknessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxLine", "set_thickness")

    public val getThicknessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxLine", "get_thickness")

    public val setGrowBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxLine", "set_grow_begin")

    public val getGrowBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxLine", "get_grow_begin")

    public val setGrowEndPtr: VoidPtr = TypeManager.getMethodBindPtr("StyleBoxLine", "set_grow_end")

    public val getGrowEndPtr: VoidPtr = TypeManager.getMethodBindPtr("StyleBoxLine", "get_grow_end")

    public val setVerticalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxLine", "set_vertical")

    public val isVerticalPtr: VoidPtr = TypeManager.getMethodBindPtr("StyleBoxLine", "is_vertical")
  }
}
