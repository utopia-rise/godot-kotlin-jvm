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
import godot.util.VoidPtr
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
open class VisualShaderNodeTransformConstant : VisualShaderNode() {
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

  override fun __new(): VoidPtr =
      TransferContext.invokeConstructor(ENGINECLASS_VISUALSHADERNODETRANSFORMCONSTANT)

  open fun constant(schedule: Transform.() -> Unit): Transform = constant.apply{
      schedule(this)
      constant = this
  }

}
