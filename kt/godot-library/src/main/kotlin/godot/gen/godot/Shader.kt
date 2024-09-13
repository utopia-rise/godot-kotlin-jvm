// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

/**
 * A custom shader program implemented in the Godot shading language, saved with the `.gdshader`
 * extension.
 * This class is used by a [ShaderMaterial] and allows you to write your own custom behavior for
 * rendering visual items or updating particle information. For a detailed explanation and usage,
 * please see the tutorials linked below.
 */
@GodotBaseType
public open class Shader : Resource() {
  /**
   * Returns the shader's code as the user has written it, not the full generated code used
   * internally.
   */
  public final inline var code: String
    @JvmName("codeProperty")
    get() = getCode()
    @JvmName("codeProperty")
    set(`value`) {
      setCode(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_SHADER, scriptIndex)
  }

  /**
   * Returns the shader mode for the shader.
   */
  public final fun getMode(): Mode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getModePtr, LONG)
    return Shader.Mode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setCode(code: String): Unit {
    TransferContext.writeArguments(STRING to code)
    TransferContext.callMethod(rawPtr, MethodBindings.setCodePtr, NIL)
  }

  public final fun getCode(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCodePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Sets the default texture to be used with a texture uniform. The default is used if a texture is
   * not set in the [ShaderMaterial].
   * **Note:** [name] must match the name of the uniform in the code exactly.
   * **Note:** If the sampler array is used use [index] to access the specified texture.
   */
  @JvmOverloads
  public final fun setDefaultTextureParameter(
    name: StringName,
    texture: Texture2D?,
    index: Int = 0,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to texture, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setDefaultTextureParameterPtr, NIL)
  }

  /**
   * Returns the texture that is set as default for the specified parameter.
   * **Note:** [name] must match the name of the uniform in the code exactly.
   * **Note:** If the sampler array is used use [index] to access the specified texture.
   */
  @JvmOverloads
  public final fun getDefaultTextureParameter(name: StringName, index: Int = 0): Texture2D? {
    TransferContext.writeArguments(STRING_NAME to name, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getDefaultTextureParameterPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  /**
   * Get the list of shader uniforms that can be assigned to a [ShaderMaterial], for use with
   * [ShaderMaterial.setShaderParameter] and [ShaderMaterial.getShaderParameter]. The parameters
   * returned are contained in dictionaries in a similar format to the ones returned by
   * [Object.getPropertyList].
   * If argument [getGroups] is true, parameter grouping hints will be provided.
   */
  @JvmOverloads
  public final fun getShaderUniformList(getGroups: Boolean = false): VariantArray<Any?> {
    TransferContext.writeArguments(BOOL to getGroups)
    TransferContext.callMethod(rawPtr, MethodBindings.getShaderUniformListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  public enum class Mode(
    id: Long,
  ) {
    /**
     * Mode used to draw all 3D objects.
     */
    MODE_SPATIAL(0),
    /**
     * Mode used to draw all 2D objects.
     */
    MODE_CANVAS_ITEM(1),
    /**
     * Mode used to calculate particle information on a per-particle basis. Not used for drawing.
     */
    MODE_PARTICLES(2),
    /**
     * Mode used for drawing skies. Only works with shaders attached to [Sky] objects.
     */
    MODE_SKY(3),
    /**
     * Mode used for setting the color and density of volumetric fog effect.
     */
    MODE_FOG(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Mode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val getModePtr: VoidPtr = TypeManager.getMethodBindPtr("Shader", "get_mode", 3392948163)

    public val setCodePtr: VoidPtr = TypeManager.getMethodBindPtr("Shader", "set_code", 83702148)

    public val getCodePtr: VoidPtr = TypeManager.getMethodBindPtr("Shader", "get_code", 201670096)

    public val setDefaultTextureParameterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Shader", "set_default_texture_parameter", 2750740428)

    public val getDefaultTextureParameterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Shader", "get_default_texture_parameter", 3090538643)

    public val getShaderUniformListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Shader", "get_shader_uniform_list", 1230511656)
  }
}
