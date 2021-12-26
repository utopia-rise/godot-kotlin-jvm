// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Array of textures stored in a single primitive.
 *
 * [godot.TextureArray]s store an array of [godot.Image]s in a single [godot.Texture] primitive. Each layer of the texture array has its own mipmap chain. This makes it is a good alternative to texture atlases. See also [godot.Texture3D].
 *
 * [godot.TextureArray]s must be displayed using shaders. After importing your file as a [godot.TextureArray] and setting the appropriate Horizontal and Vertical Slices, display it by setting it as a uniform to a shader, for example (2D):
 *
 * ```
 * 		shader_type canvas_item;
 *
 * 		uniform sampler2DArray tex;
 * 		uniform int index;
 *
 * 		void fragment() {
 * 		    COLOR = texture(tex, vec3(UV.x, UV.y, float(index)));
 * 		}
 * 		```
 *
 * Set the integer uniform "index" to show a particular part of the texture as defined by the Horizontal and Vertical Slices in the importer.
 *
 * **Note:** When sampling an albedo texture from a texture array in 3D, the sRGB -> linear conversion hint (`hint_albedo`) should be used to prevent colors from looking washed out:
 *
 * ```
 * 		shader_type spatial;
 *
 * 		uniform sampler2DArray tex : hint_albedo;
 * 		uniform int index;
 *
 * 		void fragment() {
 * 		    ALBEDO = texture(tex, vec3(UV.x, UV.y, float(index)));
 * 		}
 * 		```
 *
 * **Note:** [godot.TextureArray]s can only be sampled in shaders in the GLES3 backend. In GLES2, their data can be accessed via scripting, but there is no way to render them in a hardware-accelerated manner.
 */
@GodotBaseType
public open class TextureArray : TextureLayered() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_TEXTUREARRAY)
  }

  /**
   * Creates the TextureArray with specified `width`, `height`, and `depth`. See [enum Image.Format] for `format` options. See [enum TextureLayered.Flags] enumerator for `flags` options.
   */
  public open fun create(
    width: Long,
    height: Long,
    depth: Long,
    format: Long,
    flags: Long = 7
  ): Unit {
    TransferContext.writeArguments(LONG to width, LONG to height, LONG to depth, LONG to format,
        LONG to flags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTUREARRAY_CREATE, NIL)
  }
}
