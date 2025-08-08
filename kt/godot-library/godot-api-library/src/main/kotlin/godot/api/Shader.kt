// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.StringName
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import godot.core.asCachedStringName
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
 * A custom shader program implemented in the Godot shading language, saved with the `.gdshader` extension.
 *
 * This class is used by a [ShaderMaterial] and allows you to write your own custom behavior for rendering visual items or updating particle information. For a detailed explanation and usage, please see the tutorials linked below.
 */
@GodotBaseType
public open class Shader : Resource() {
  /**
   * Returns the shader's code as the user has written it, not the full generated code used internally.
   */
  public final inline var code: String
    @JvmName("codeProperty")
    get() = getCode()
    @JvmName("codeProperty")
    set(`value`) {
      setCode(value)
    }

  override fun new(scriptIndex: Int) {
    createNativeObject(583, scriptIndex)
  }

  /**
   * Returns the shader mode for the shader.
   */
  public final fun getMode(): Mode {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getModePtr, LONG)
    return Mode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setCode(code: String) {
    TransferContext.writeArguments(STRING to code)
    TransferContext.callMethod(ptr, MethodBindings.setCodePtr, NIL)
  }

  public final fun getCode(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCodePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Sets the default texture to be used with a texture uniform. The default is used if a texture is not set in the [ShaderMaterial].
   *
   * **Note:** [name] must match the name of the uniform in the code exactly.
   *
   * **Note:** If the sampler array is used use [index] to access the specified texture.
   */
  @JvmOverloads
  public final fun setDefaultTextureParameter(
    name: StringName,
    texture: Texture?,
    index: Int = 0,
  ) {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to texture, LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setDefaultTextureParameterPtr, NIL)
  }

  /**
   * Returns the texture that is set as default for the specified parameter.
   *
   * **Note:** [name] must match the name of the uniform in the code exactly.
   *
   * **Note:** If the sampler array is used use [index] to access the specified texture.
   */
  @JvmOverloads
  public final fun getDefaultTextureParameter(name: StringName, index: Int = 0): Texture? {
    TransferContext.writeArguments(STRING_NAME to name, LONG to index.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getDefaultTextureParameterPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture?)
  }

  /**
   * Returns the list of shader uniforms that can be assigned to a [ShaderMaterial], for use with [ShaderMaterial.setShaderParameter] and [ShaderMaterial.getShaderParameter]. The parameters returned are contained in dictionaries in a similar format to the ones returned by [Object.getPropertyList].
   *
   * If argument [getGroups] is `true`, parameter grouping hints are also included in the list.
   */
  @JvmOverloads
  public final fun getShaderUniformList(getGroups: Boolean = false): VariantArray<Any?> {
    TransferContext.writeArguments(BOOL to getGroups)
    TransferContext.callMethod(ptr, MethodBindings.getShaderUniformListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  /**
   * Only available when running in the editor. Opens a popup that visualizes the generated shader code, including all variants and internal shader code. See also [Material.inspectNativeShaderCode].
   */
  public final fun inspectNativeShaderCode() {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.inspectNativeShaderCodePtr, NIL)
  }

  /**
   * Sets the default texture to be used with a texture uniform. The default is used if a texture is not set in the [ShaderMaterial].
   *
   * **Note:** [name] must match the name of the uniform in the code exactly.
   *
   * **Note:** If the sampler array is used use [index] to access the specified texture.
   */
  @JvmOverloads
  public final fun setDefaultTextureParameter(
    name: String,
    texture: Texture?,
    index: Int = 0,
  ): Unit = setDefaultTextureParameter(name.asCachedStringName(), texture, index)

  /**
   * Returns the texture that is set as default for the specified parameter.
   *
   * **Note:** [name] must match the name of the uniform in the code exactly.
   *
   * **Note:** If the sampler array is used use [index] to access the specified texture.
   */
  @JvmOverloads
  public final fun getDefaultTextureParameter(name: String, index: Int = 0): Texture? = getDefaultTextureParameter(name.asCachedStringName(), index)

  public enum class Mode(
    id: Long,
  ) {
    /**
     * Mode used to draw all 3D objects.
     */
    SPATIAL(0),
    /**
     * Mode used to draw all 2D objects.
     */
    CANVAS_ITEM(1),
    /**
     * Mode used to calculate particle information on a per-particle basis. Not used for drawing.
     */
    PARTICLES(2),
    /**
     * Mode used for drawing skies. Only works with shaders attached to [Sky] objects.
     */
    SKY(3),
    /**
     * Mode used for setting the color and density of volumetric fog effect.
     */
    FOG(4),
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

  public object MethodBindings {
    internal val getModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Shader", "get_mode", 3_392_948_163)

    internal val setCodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Shader", "set_code", 83_702_148)

    internal val getCodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Shader", "get_code", 201_670_096)

    internal val setDefaultTextureParameterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Shader", "set_default_texture_parameter", 3_850_209_648)

    internal val getDefaultTextureParameterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Shader", "get_default_texture_parameter", 4_213_877_425)

    internal val getShaderUniformListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Shader", "get_shader_uniform_list", 1_230_511_656)

    internal val inspectNativeShaderCodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Shader", "inspect_native_shader_code", 3_218_959_716)
  }
}
