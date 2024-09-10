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
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

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
  public var borderColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBorderColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setBorderColorPtr, NIL)
    }

  /**
   * Sets the border width of the [ReferenceRect]. The border grows both inwards and outwards with
   * respect to the rectangle box.
   */
  public var borderWidth: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBorderWidthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setBorderWidthPtr, NIL)
    }

  /**
   * If `true`, the [ReferenceRect] will only be visible while in editor. Otherwise, [ReferenceRect]
   * will be visible in the running project.
   */
  public var editorOnly: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEditorOnlyPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEditorOnlyPtr, NIL)
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
  public open fun borderColorMutate(block: Color.() -> Unit): Color = borderColor.apply{
      block(this)
      borderColor = this
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
