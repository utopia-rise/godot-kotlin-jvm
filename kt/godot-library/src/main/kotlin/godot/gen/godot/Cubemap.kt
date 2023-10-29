// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * Six square textures representing the faces of a cube. Commonly used as a skybox.
 *
 * A cubemap is made of 6 textures organized in layers. They are typically used for faking reflections in 3D rendering (see [godot.ReflectionProbe]). It can be used to make an object look as if it's reflecting its surroundings. This usually delivers much better performance than other reflection methods.
 *
 * This resource is typically used as a uniform in custom shaders. Few core Godot methods make use of [godot.Cubemap] resources.
 *
 * To create such a texture file yourself, reimport your image files using the Godot Editor import presets.
 *
 * **Note:** Godot doesn't support using cubemaps in a [godot.PanoramaSkyMaterial]. You can use [this tool](https://danilw.github.io/GLSL-howto/cubemap_to_panorama_js/cubemap_to_panorama.html) to convert a cubemap to an equirectangular sky map.
 */
@GodotBaseType
public open class Cubemap : ImageTextureLayered() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CUBEMAP, scriptIndex)
    return true
  }

  /**
   * Creates a placeholder version of this resource ([godot.PlaceholderCubemap]).
   */
  public fun createPlaceholder(): Resource? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CUBEMAP_CREATE_PLACEHOLDER, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Resource?)
  }

  public companion object
}
