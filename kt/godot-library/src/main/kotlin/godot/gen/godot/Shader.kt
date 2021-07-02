// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.Shader
import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A custom shader program.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/3.3/tutorials/shading/index.html](https://docs.godotengine.org/en/3.3/tutorials/shading/index.html)
 * [https://docs.godotengine.org/en/3.3/tutorials/shading/your_first_shader/what_are_shaders.html](https://docs.godotengine.org/en/3.3/tutorials/shading/your_first_shader/what_are_shaders.html)
 *
 * This class allows you to define a custom shader program that can be used by a [godot.ShaderMaterial]. Shaders allow you to write your own custom behavior for rendering objects or updating particle information. For a detailed explanation and usage, please see the tutorials linked below.
 */
@GodotBaseType
public open class Shader : Resource() {
  /**
   * Returns the shader's code as the user has written it, not the full generated code used internally.
   */
  public open var code: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHADER_GET_CODE, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHADER_SET_CODE, NIL)
    }

  /**
   * Returns the shader's custom defines. Custom defines can be used in Godot to add GLSL preprocessor directives (e.g: extensions) required for the shader logic.
   *
   * **Note:** Custom defines are not validated by the Godot shader parser, so care should be taken when using them.
   */
  public open var customDefines: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHADER_GET_CUSTOM_DEFINES, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHADER_SET_CUSTOM_DEFINES, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SHADER)
  }

  /**
   * Returns the texture that is set as default for the specified parameter.
   *
   * **Note:** `param` must match the name of the uniform in the code exactly.
   */
  public open fun getDefaultTextureParam(`param`: String): Texture? {
    TransferContext.writeArguments(STRING to param)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHADER_GET_DEFAULT_TEXTURE_PARAM,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Texture?
  }

  /**
   * Returns the shader mode for the shader, either [MODE_CANVAS_ITEM], [MODE_SPATIAL] or [MODE_PARTICLES].
   */
  public open fun getMode(): Shader.Mode {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHADER_GET_MODE, LONG)
    return Shader.Mode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns `true` if the shader has this param defined as a uniform in its code.
   *
   * **Note:** `param` must match the name of the uniform in the code exactly.
   */
  public open fun hasParam(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHADER_HAS_PARAM, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the default texture to be used with a texture uniform. The default is used if a texture is not set in the [godot.ShaderMaterial].
   *
   * **Note:** `param` must match the name of the uniform in the code exactly.
   */
  public open fun setDefaultTextureParam(`param`: String, texture: Texture): Unit {
    TransferContext.writeArguments(STRING to param, OBJECT to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SHADER_SET_DEFAULT_TEXTURE_PARAM,
        NIL)
  }

  public enum class Mode(
    id: Long
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
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Mode used to draw all 2D objects.
     */
    public final const val MODE_CANVAS_ITEM: Long = 1

    /**
     * Mode used to calculate particle information on a per-particle basis. Not used for drawing.
     */
    public final const val MODE_PARTICLES: Long = 2

    /**
     * Mode used to draw all 3D objects.
     */
    public final const val MODE_SPATIAL: Long = 0
  }
}
