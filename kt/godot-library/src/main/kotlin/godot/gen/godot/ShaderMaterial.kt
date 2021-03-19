// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress

/**
 * A material that uses a custom [godot.Shader] program.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/shading/index.html](https://docs.godotengine.org/en/latest/tutorials/shading/index.html)
 *
 * A material that uses a custom [godot.Shader] program to render either items to screen or process particles. You can create multiple materials for the same shader but configure different values for the uniforms defined in the shader.
 */
@GodotBaseType
open class ShaderMaterial : Material() {
  /**
   * The [godot.Shader] program used to render this material.
   */
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

  override fun __new() {
    callConstructor(ENGINECLASS_SHADERMATERIAL)
  }

  open fun _shaderChanged() {
  }

  /**
   * Returns the current value set for this material of a uniform in the shader.
   */
  open fun getShaderParam(param: String): Any? {
    TransferContext.writeArguments(STRING to param)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHADERMATERIAL_GET_SHADER_PARAM,
        ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns `true` if the property identified by `name` can be reverted to a default value.
   */
  open fun propertyCanRevert(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHADERMATERIAL_PROPERTY_CAN_REVERT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the default value of the material property with given `name`.
   */
  open fun propertyGetRevert(name: String): Any? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHADERMATERIAL_PROPERTY_GET_REVERT,
        ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Changes the value set for this material of a uniform in the shader. **Note:** `param` must match the name of the uniform in the code exactly.
   */
  open fun setShaderParam(param: String, value: Any?) {
    TransferContext.writeArguments(STRING to param, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHADERMATERIAL_SET_SHADER_PARAM,
        NIL)
  }
}
