// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Suppress
import kotlin.Unit

/**
 * 6-sided texture typically used in 3D rendering.
 *
 * A cubemap is a 6-sided texture typically used for faking reflections in 3D rendering. It can be used to make an object look as if it's reflecting its surroundings. This usually delivers much better performance than other reflection methods.
 *
 * This resource is typically used as a uniform in custom shaders. Few core Godot methods make use of Cubemap resources.
 *
 * **Note:** Godot doesn't support using cubemaps as a [godot.PanoramaSkyMaterial]. You can use [this tool](https://danilw.github.io/GLSL-howto/cubemap_to_panorama_js/cubemap_to_panorama.html) to convert a cube map to an equirectangular sky map.
 */
@GodotBaseType
public open class Cubemap : ImageTextureLayered() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_CUBEMAP)
  }

  public companion object
}
