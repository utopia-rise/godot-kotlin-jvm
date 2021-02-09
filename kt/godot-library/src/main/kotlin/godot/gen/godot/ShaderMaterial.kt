// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class ShaderMaterial : Material() {
  open var shader: Shader?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHADERMATERIAL_GET_SHADER, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Shader?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHADERMATERIAL_SET_SHADER, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_SHADERMATERIAL)

  open fun _shaderChanged() {
  }

  open fun getShaderParam(param: String): Any? {
    TransferContext.writeArguments(STRING to param)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHADERMATERIAL_GET_SHADER_PARAM,
        ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  open fun propertyCanRevert(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHADERMATERIAL_PROPERTY_CAN_REVERT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun propertyGetRevert(name: String): Any? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHADERMATERIAL_PROPERTY_GET_REVERT,
        ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  open fun setShaderParam(param: String, value: Any) {
    TransferContext.writeArguments(STRING to param, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHADERMATERIAL_SET_SHADER_PARAM,
        NIL)
  }
}
