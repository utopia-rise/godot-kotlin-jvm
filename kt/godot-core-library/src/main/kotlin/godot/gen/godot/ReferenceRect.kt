// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.Color
import godot.internal.reflection.TypeManager
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.internal.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A rectangle box that displays only a colored border around its rectangle. It is used to visualize
 * the extents of a [Control].
 */
@GodotBaseType
public open class ReferenceRect : Control() {
  /**
   * Sets the border color of the [ReferenceRect].
   */
  @CoreTypeLocalCopy
  public final inline var borderColor: Color
    @JvmName("borderColorProperty")
    get() = getBorderColor()
    @JvmName("borderColorProperty")
    set(`value`) {
      setBorderColor(value)
    }

  /**
   * Sets the border width of the [ReferenceRect]. The border grows both inwards and outwards with
   * respect to the rectangle box.
   */
  public final inline var borderWidth: Float
    @JvmName("borderWidthProperty")
    get() = getBorderWidth()
    @JvmName("borderWidthProperty")
    set(`value`) {
      setBorderWidth(value)
    }

  /**
   * If `true`, the [ReferenceRect] will only be visible while in editor. Otherwise, [ReferenceRect]
   * will be visible in the running project.
   */
  public final inline var editorOnly: Boolean
    @JvmName("editorOnlyProperty")
    get() = getEditorOnly()
    @JvmName("editorOnlyProperty")
    set(`value`) {
      setEditorOnly(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_REFERENCERECT, scriptIndex)
  }

  /**
   * Sets the border color of the [ReferenceRect].
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
   * val myCoreType = referencerect.borderColor
   * //Your changes
   * referencerect.borderColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun borderColorMutate(block: Color.() -> Unit): Color = borderColor.apply{
      block(this)
      borderColor = this
  }


  public final fun getBorderColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBorderColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setBorderColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setBorderColorPtr, NIL)
  }

  public final fun getBorderWidth(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBorderWidthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setBorderWidth(width: Float): Unit {
    TransferContext.writeArguments(DOUBLE to width.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setBorderWidthPtr, NIL)
  }

  public final fun getEditorOnly(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEditorOnlyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setEditorOnly(enabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enabled)
    TransferContext.callMethod(ptr, MethodBindings.setEditorOnlyPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val getBorderColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReferenceRect", "get_border_color", 3444240500)

    public val setBorderColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReferenceRect", "set_border_color", 2920490490)

    public val getBorderWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReferenceRect", "get_border_width", 1740695150)

    public val setBorderWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReferenceRect", "set_border_width", 373806689)

    public val getEditorOnlyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReferenceRect", "get_editor_only", 36873697)

    public val setEditorOnlyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ReferenceRect", "set_editor_only", 2586408642)
  }
}
