// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.RID
import godot.core.StringName
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING_NAME
import godot.core.asCachedStringName
import kotlin.Any
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A material that uses a custom [Shader] program to render visual items (canvas items, meshes,
 * skies, fog), or to process particles. Compared to other materials, [ShaderMaterial] gives deeper
 * control over the generated shader code. For more information, see the shaders documentation index
 * below.
 *
 * Multiple [ShaderMaterial]s can use the same shader and configure different values for the shader
 * uniforms.
 *
 * **Note:** For performance reasons, the [signal Resource.changed] signal is only emitted when the
 * [Resource.resourceName] changes. Only in editor, it is also emitted for [shader] changes.
 */
@GodotBaseType
public open class ShaderMaterial : Material() {
  /**
   * The [Shader] program used to render this material.
   */
  public final inline var shader: Shader?
    @JvmName("shaderProperty")
    get() = getShader()
    @JvmName("shaderProperty")
    set(`value`) {
      setShader(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(587, scriptIndex)
  }

  public final fun setShader(shader: Shader?): Unit {
    TransferContext.writeArguments(OBJECT to shader)
    TransferContext.callMethod(ptr, MethodBindings.setShaderPtr, NIL)
  }

  public final fun getShader(): Shader? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getShaderPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Shader?)
  }

  /**
   * Changes the value set for this material of a uniform in the shader.
   *
   * **Note:** [param] is case-sensitive and must match the name of the uniform in the code exactly
   * (not the capitalized name in the inspector).
   *
   * **Note:** Changes to the shader uniform will be effective on all instances using this
   * [ShaderMaterial]. To prevent this, use per-instance uniforms with
   * [GeometryInstance3D.setInstanceShaderParameter] or duplicate the [ShaderMaterial] resource using
   * [Resource.duplicate]. Per-instance uniforms allow for better shader reuse and are therefore
   * faster, so they should be preferred over duplicating the [ShaderMaterial] when possible.
   */
  public final fun setShaderParameter(`param`: StringName, `value`: Any?): Unit {
    TransferContext.writeArguments(STRING_NAME to param, ANY to value)
    TransferContext.callMethod(ptr, MethodBindings.setShaderParameterPtr, NIL)
  }

  /**
   * Returns the current value set for this material of a uniform in the shader.
   */
  public final fun getShaderParameter(`param`: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to param)
    TransferContext.callMethod(ptr, MethodBindings.getShaderParameterPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _getShaderRid(): RID {
    throw NotImplementedError("ShaderMaterial::_getShaderRid can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  public override fun _getShaderMode(): Shader.Mode {
    throw NotImplementedError("ShaderMaterial::_getShaderMode can't be called from the JVM.")
  }

  /**
   * Changes the value set for this material of a uniform in the shader.
   *
   * **Note:** [param] is case-sensitive and must match the name of the uniform in the code exactly
   * (not the capitalized name in the inspector).
   *
   * **Note:** Changes to the shader uniform will be effective on all instances using this
   * [ShaderMaterial]. To prevent this, use per-instance uniforms with
   * [GeometryInstance3D.setInstanceShaderParameter] or duplicate the [ShaderMaterial] resource using
   * [Resource.duplicate]. Per-instance uniforms allow for better shader reuse and are therefore
   * faster, so they should be preferred over duplicating the [ShaderMaterial] when possible.
   */
  public final fun setShaderParameter(`param`: String, `value`: Any?): Unit =
      setShaderParameter(param.asCachedStringName(), value)

  /**
   * Returns the current value set for this material of a uniform in the shader.
   */
  public final fun getShaderParameter(`param`: String): Any? =
      getShaderParameter(param.asCachedStringName())

  public companion object

  public object MethodBindings {
    internal val setShaderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShaderMaterial", "set_shader", 3341921675)

    internal val getShaderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShaderMaterial", "get_shader", 2078273437)

    internal val setShaderParameterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShaderMaterial", "set_shader_parameter", 3776071444)

    internal val getShaderParameterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ShaderMaterial", "get_shader_parameter", 2760726917)
  }
}
