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
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_COLORRECT_INDEX: Int = 194

/**
 * Displays a rectangle filled with a solid [color]. If you need to display the border alone,
 * consider using a [Panel] instead.
 */
@GodotBaseType
public open class ColorRect : Control() {
  /**
   * The fill color of the rectangle.
   */
  @CoreTypeLocalCopy
  public final inline var color: Color
    @JvmName("colorProperty")
    get() = getColor()
    @JvmName("colorProperty")
    set(`value`) {
      setColor(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_COLORRECT_INDEX, scriptIndex)
  }

  /**
   * The fill color of the rectangle.
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
   * val myCoreType = colorrect.color
   * //Your changes
   * colorrect.color = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun colorMutate(block: Color.() -> Unit): Color = color.apply{
      block(this)
      color = this
  }


  public final fun setColor(color: Color): Unit {
    Internals.writeArguments(COLOR to color)
    Internals.callMethod(rawPtr, MethodBindings.setColorPtr, NIL)
  }

  public final fun getColor(): Color {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getColorPtr, COLOR)
    return (Internals.readReturnValue(COLOR) as Color)
  }

  public companion object

  public object MethodBindings {
    internal val setColorPtr: VoidPtr =
        Internals.getMethodBindPtr("ColorRect", "set_color", 2920490490)

    internal val getColorPtr: VoidPtr =
        Internals.getMethodBindPtr("ColorRect", "get_color", 3444240500)
  }
}
