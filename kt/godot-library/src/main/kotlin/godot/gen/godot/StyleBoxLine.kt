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
import kotlin.jvm.JvmName

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
  public final inline var color: Color
    @JvmName("colorProperty")
    get() = getColor()
    @JvmName("colorProperty")
    set(`value`) {
      setColor(value)
    }

  /**
   * The number of pixels the line will extend before the [StyleBoxLine]'s bounds. If set to a
   * negative value, the line will begin inside the [StyleBoxLine]'s bounds.
   */
  public final inline var growBegin: Float
    @JvmName("growBeginProperty")
    get() = getGrowBegin()
    @JvmName("growBeginProperty")
    set(`value`) {
      setGrowBegin(value)
    }

  /**
   * The number of pixels the line will extend past the [StyleBoxLine]'s bounds. If set to a
   * negative value, the line will end inside the [StyleBoxLine]'s bounds.
   */
  public final inline var growEnd: Float
    @JvmName("growEndProperty")
    get() = getGrowEnd()
    @JvmName("growEndProperty")
    set(`value`) {
      setGrowEnd(value)
    }

  /**
   * The line's thickness in pixels.
   */
  public final inline var thickness: Int
    @JvmName("thicknessProperty")
    get() = getThickness()
    @JvmName("thicknessProperty")
    set(`value`) {
      setThickness(value)
    }

  /**
   * If `true`, the line will be vertical. If `false`, the line will be horizontal.
   */
  public final inline var vertical: Boolean
    @JvmName("verticalProperty")
    get() = isVertical()
    @JvmName("verticalProperty")
    set(`value`) {
      setVertical(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_STYLEBOXLINE, scriptIndex)
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
  public final fun colorMutate(block: Color.() -> Unit): Color = color.apply{
      block(this)
      color = this
  }


  public final fun setColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.setColorPtr, NIL)
  }

  public final fun getColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setThickness(thickness: Int): Unit {
    TransferContext.writeArguments(LONG to thickness.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setThicknessPtr, NIL)
  }

  public final fun getThickness(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getThicknessPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setGrowBegin(offset: Float): Unit {
    TransferContext.writeArguments(DOUBLE to offset.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setGrowBeginPtr, NIL)
  }

  public final fun getGrowBegin(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getGrowBeginPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setGrowEnd(offset: Float): Unit {
    TransferContext.writeArguments(DOUBLE to offset.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setGrowEndPtr, NIL)
  }

  public final fun getGrowEnd(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getGrowEndPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVertical(vertical: Boolean): Unit {
    TransferContext.writeArguments(BOOL to vertical)
    TransferContext.callMethod(rawPtr, MethodBindings.setVerticalPtr, NIL)
  }

  public final fun isVertical(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isVerticalPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxLine", "set_color", 2920490490)

    public val getColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxLine", "get_color", 3444240500)

    public val setThicknessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxLine", "set_thickness", 1286410249)

    public val getThicknessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxLine", "get_thickness", 3905245786)

    public val setGrowBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxLine", "set_grow_begin", 373806689)

    public val getGrowBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxLine", "get_grow_begin", 1740695150)

    public val setGrowEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxLine", "set_grow_end", 373806689)

    public val getGrowEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxLine", "get_grow_end", 1740695150)

    public val setVerticalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxLine", "set_vertical", 2586408642)

    public val isVerticalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxLine", "is_vertical", 36873697)
  }
}
