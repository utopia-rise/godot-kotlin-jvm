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
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
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
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
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
    createNativeObject(649, scriptIndex)
  }

  /**
   * This is a helper function for [color] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = styleboxline.color
   * //Your changes
   * styleboxline.color = myCoreType
   * ``````
   *
   * The line's color.
   */
  @CoreTypeHelper
  public final fun colorMutate(block: Color.() -> Unit): Color = color.apply {
     block(this)
     color = this
  }

  public final fun setColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setColorPtr, NIL)
  }

  public final fun getColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setThickness(thickness: Int): Unit {
    TransferContext.writeArguments(LONG to thickness.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setThicknessPtr, NIL)
  }

  public final fun getThickness(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getThicknessPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setGrowBegin(offset: Float): Unit {
    TransferContext.writeArguments(DOUBLE to offset.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setGrowBeginPtr, NIL)
  }

  public final fun getGrowBegin(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGrowBeginPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setGrowEnd(offset: Float): Unit {
    TransferContext.writeArguments(DOUBLE to offset.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setGrowEndPtr, NIL)
  }

  public final fun getGrowEnd(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGrowEndPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setVertical(vertical: Boolean): Unit {
    TransferContext.writeArguments(BOOL to vertical)
    TransferContext.callMethod(ptr, MethodBindings.setVerticalPtr, NIL)
  }

  public final fun isVertical(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isVerticalPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  public object MethodBindings {
    internal val setColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxLine", "set_color", 2920490490)

    internal val getColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxLine", "get_color", 3444240500)

    internal val setThicknessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxLine", "set_thickness", 1286410249)

    internal val getThicknessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxLine", "get_thickness", 3905245786)

    internal val setGrowBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxLine", "set_grow_begin", 373806689)

    internal val getGrowBeginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxLine", "get_grow_begin", 1740695150)

    internal val setGrowEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxLine", "set_grow_end", 373806689)

    internal val getGrowEndPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxLine", "get_grow_end", 1740695150)

    internal val setVerticalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxLine", "set_vertical", 2586408642)

    internal val isVerticalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("StyleBoxLine", "is_vertical", 36873697)
  }
}
