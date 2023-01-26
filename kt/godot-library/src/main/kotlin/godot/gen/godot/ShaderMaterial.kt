// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.VariantType.ANY
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
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
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHADERMATERIAL_GET_SHADER, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Shader?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHADERMATERIAL_SET_SHADER, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SHADERMATERIAL, scriptIndex)
    return true
  }

  /**
   * Changes the value set for this material of a uniform in the shader.
   *
   * **Note:** [param] is case-sensitive and must match the name of the uniform in the code exactly (not the capitalized name in the inspector).
   *
   * **Note:** Changes to the shader uniform will be effective on all instances using this [godot.ShaderMaterial]. To prevent this, use per-instance uniforms with [godot.GeometryInstance3D.setInstanceShaderParameter] or duplicate the [godot.ShaderMaterial] resource using [godot.Resource.duplicate]. Per-instance uniforms allow for better shader reuse and are therefore faster, so they should be preferred over duplicating the [godot.ShaderMaterial] when possible.
   */
  public fun setShaderParameter(`param`: StringName, `value`: Any): Unit {
    TransferContext.writeArguments(STRING_NAME to param, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHADERMATERIAL_SET_SHADER_PARAMETER,
        NIL)
  }

  /**
   * Returns the current value set for this material of a uniform in the shader.
   */
  public fun getShaderParameter(`param`: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to param)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHADERMATERIAL_GET_SHADER_PARAMETER,
        ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public companion object
}
