// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.Color
import godot.core.TransferContext
import godot.core.VariantType.COLOR
import godot.core.VariantType.NIL
import kotlin.Suppress
import kotlin.Unit

/**
 * A [godot.core.Color] constant to be used within the visual shader graph.
 * 
 * Has two output ports representing RGB and alpha channels of [godot.core.Color].
 *
 * Translated to `vec3 rgb` and `float alpha` in the shader language.
 */
@GodotBaseType
open class VisualShaderNodeColorConstant : VisualShaderNode() {
  /**
   * A [godot.core.Color] constant which represents a state of this node.
   */
  open var constant: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODECOLORCONSTANT_GET_CONSTANT, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(value) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODECOLORCONSTANT_SET_CONSTANT, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_VISUALSHADERNODECOLORCONSTANT)
  }

  open fun constant(schedule: Color.() -> Unit): Color = constant.apply{
      schedule(this)
      constant = this
  }

}
