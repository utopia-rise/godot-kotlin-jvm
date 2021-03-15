// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.Transform
import godot.core.VariantType.NIL
import godot.core.VariantType.TRANSFORM
import kotlin.Suppress
import kotlin.Unit

/**
 * A [godot.core.Transform] constant for use within the visual shader graph.
 *
 * A constant [godot.core.Transform], which can be used as an input node.
 */
@GodotBaseType
open class VisualShaderNodeTransformConstant : VisualShaderNode() {
  /**
   * A [godot.core.Transform] constant which represents the state of this node.
   */
  open var constant: Transform
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETRANSFORMCONSTANT_GET_CONSTANT, TRANSFORM)
      return TransferContext.readReturnValue(TRANSFORM, false) as Transform
    }
    set(value) {
      TransferContext.writeArguments(TRANSFORM to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETRANSFORMCONSTANT_SET_CONSTANT, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_VISUALSHADERNODETRANSFORMCONSTANT,
        ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun constant(schedule: Transform.() -> Unit): Transform = constant.apply{
      schedule(this)
      constant = this
  }

}
