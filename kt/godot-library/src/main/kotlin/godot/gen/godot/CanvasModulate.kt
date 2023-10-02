// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.VariantType.COLOR
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * A node that applies a color tint to a canvas.
 *
 * [godot.CanvasModulate] applies a color tint to all nodes on a canvas. Only one can be used to tint a canvas, but [godot.CanvasLayer]s can be used to render things independently.
 */
@GodotBaseType
public open class CanvasModulate : Node2D() {
  /**
   * The tint color to apply.
   */
  public var color: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASMODULATE_GET_COLOR, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CANVASMODULATE_SET_COLOR, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CANVASMODULATE, scriptIndex)
    return true
  }

  /**
   * The tint color to apply.
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
   * val myCoreType = canvasmodulate.color
   * //Your changes
   * canvasmodulate.color = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun color(block: Color.() -> Unit): Color = color.apply{
      block(this)
      color = this
  }


  public companion object
}
