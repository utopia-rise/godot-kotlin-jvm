// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A shader implemented in the Godot shading language.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/shaders/index.html]($DOCS_URL/tutorials/shaders/index.html)
 *
 * A custom shader program implemented in the Godot shading language, saved with the `.gdshader` extension.
 *
 * This class is used by a [godot.ShaderMaterial] and allows you to write your own custom behavior for rendering visual items or updating particle information. For a detailed explanation and usage, please see the tutorials linked below.
 */
@GodotBaseType
public open class Shader : Resource() {
  /**
   * Returns the shader's code as the user has written it, not the full generated code used internally.
   */
  public var code: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHADER_GET_CODE, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHADER_SET_CODE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SHADER, scriptIndex)
    return true
  }

  /**
   * Returns the shader mode for the shader.
   */
  public fun getMode(): Mode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHADER_GET_MODE, LONG)
    return Shader.Mode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Sets the default texture to be used with a texture uniform. The default is used if a texture is not set in the [godot.ShaderMaterial].
   *
   * **Note:** [name] must match the name of the uniform in the code exactly.
   *
   * **Note:** If the sampler array is used use [index] to access the specified texture.
   */
  public fun setDefaultTextureParameter(
    name: StringName,
    texture: Texture2D,
    index: Long = 0,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to texture, LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SHADER_SET_DEFAULT_TEXTURE_PARAMETER, NIL)
  }

  /**
   * Returns the texture that is set as default for the specified parameter.
   *
   * **Note:** [name] must match the name of the uniform in the code exactly.
   *
   * **Note:** If the sampler array is used use [index] to access the specified texture.
   */
  public fun getDefaultTextureParameter(name: StringName, index: Long = 0): Texture2D? {
    TransferContext.writeArguments(STRING_NAME to name, LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SHADER_GET_DEFAULT_TEXTURE_PARAMETER, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
  }

  /**
   * Get the list of shader uniforms that can be assigned to a [godot.ShaderMaterial], for use with [godot.ShaderMaterial.setShaderParameter] and [godot.ShaderMaterial.getShaderParameter]. The parameters returned are contained in dictionaries in a similar format to the ones returned by [godot.Object.getPropertyList].
   *
   * If argument [getGroups] is true, parameter grouping hints will be provided.
   */
  public fun getShaderUniformList(getGroups: Boolean = false): VariantArray<Any?> {
    TransferContext.writeArguments(BOOL to getGroups)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHADER_GET_SHADER_UNIFORM_LIST,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
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
     * Mode used for drawing skies. Only works with shaders attached to [godot.Sky] objects.
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
