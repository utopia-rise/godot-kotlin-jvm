// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Suppress
import kotlin.Unit

/**
 * A type of [godot.Sky] used to draw a background texture.
 *
 * A resource referenced in an [godot.Environment] that is used to draw a background. The Panorama sky functions similar to skyboxes in other engines, except it uses an equirectangular sky map instead of a cube map.
 *
 * Using an HDR panorama is strongly recommended for accurate, high-quality reflections. Godot supports the Radiance HDR (`.hdr`) and OpenEXR (`.exr`) image formats for this purpose.
 *
 * You can use [this tool](https://danilw.github.io/GLSL-howto/cubemap_to_panorama_js/cubemap_to_panorama.html) to convert a cube map to an equirectangular sky map.
 */
@GodotBaseType
public open class PanoramaSky : Sky() {
  /**
   * [godot.Texture] to be applied to the PanoramaSky.
   */
  public open var panorama: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PANORAMASKY_GET_PANORAMA, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PANORAMASKY_SET_PANORAMA, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PANORAMASKY)
  }
}
