// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A material that uses a custom [godot.Shader] program.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/shaders/index.html]($DOCS_URL/tutorials/shaders/index.html)
 *
 * A material that uses a custom [godot.Shader] program to render either items to screen or process particles. You can create multiple materials for the same shader but configure different values for the uniforms defined in the shader.
 */
@GodotBaseType
public open class ShaderMaterial : Material() {
  /**
   * The [godot.Shader] program used to render this material.
   */
  public var shader: Shader?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SHADERMATERIAL_GET_SHADER,
          OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as Shader?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SHADERMATERIAL_SET_SHADER, NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SHADERMATERIAL)
  }

  /**
   * Changes the value set for this material of a uniform in the shader.
   *
   * **Note:** `param` must match the name of the uniform in the code exactly.
   */
  public fun setShaderParam(`param`: StringName, `value`: Any): Unit {
    TransferContext.writeArguments(STRING_NAME to param, ANY to value)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SHADERMATERIAL_SET_SHADER_PARAM,
        NIL.ordinal)
  }

  /**
   * Returns the current value set for this material of a uniform in the shader.
   */
  public fun getShaderParam(`param`: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to param)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SHADERMATERIAL_GET_SHADER_PARAM,
        ANY.ordinal)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns `true` if the property identified by `name` can be reverted to a default value.
   */
  public fun propertyCanRevert(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SHADERMATERIAL_PROPERTY_CAN_REVERT,
        BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the default value of the material property with given `name`.
   */
  public fun propertyGetRevert(name: String): Any? {
    TransferContext.writeArguments(STRING to name)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_SHADERMATERIAL_PROPERTY_GET_REVERT,
        ANY.ordinal)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  public companion object
}
