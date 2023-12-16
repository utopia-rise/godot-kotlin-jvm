// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * A material defined by a custom [godot.Shader] program and the values of its shader parameters.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/shaders/index.html]($DOCS_URL/tutorials/shaders/index.html)
 *
 * A material that uses a custom [godot.Shader] program to render visual items (canvas items, meshes, skies, fog), or to process particles. Compared to other materials, [godot.ShaderMaterial] gives deeper control over the generated shader code. For more information, see the shaders documentation index below.
 *
 * Multiple [godot.ShaderMaterial]s can use the same shader and configure different values for the shader uniforms.
 *
 * **Note:** For performance reasons, the [godot.Resource.changed] signal is only emitted when the [godot.Resource.resourceName] changes. Only in editor, it is also emitted for [shader] changes.
 */
@GodotBaseType
public open class ShaderMaterial : Material() {
  /**
   * The [godot.Shader] program used to render this material.
   */
  public var shader: Shader?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getShaderPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Shader?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShaderPtr, NIL)
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
  public fun setShaderParameter(`param`: StringName, `value`: Any?): Unit {
    TransferContext.writeArguments(STRING_NAME to param, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setShaderParameterPtr, NIL)
  }

  /**
   * Returns the current value set for this material of a uniform in the shader.
   */
  public fun getShaderParameter(`param`: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to param)
    TransferContext.callMethod(rawPtr, MethodBindings.getShaderParameterPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  public companion object

  internal object MethodBindings {
    public val setShaderPtr: VoidPtr = TypeManager.getMethodBindPtr("ShaderMaterial", "set_shader")

    public val getShaderPtr: VoidPtr = TypeManager.getMethodBindPtr("ShaderMaterial", "get_shader")

    public val setShaderParameterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShaderMaterial", "set_shader_parameter")

    public val getShaderParameterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShaderMaterial", "get_shader_parameter")
  }
}
