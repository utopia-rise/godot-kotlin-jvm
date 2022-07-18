// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit

/**
 * A [godot.Material] used with [godot.Sky] to draw a background texture.
 *
 * A resource referenced in a [godot.Sky] that is used to draw a background. The Panorama sky material functions similar to skyboxes in other engines, except it uses an equirectangular sky map instead of a cube map.
 *
 * Using an HDR panorama is strongly recommended for accurate, high-quality reflections. Godot supports the Radiance HDR (`.hdr`) and OpenEXR (`.exr`) image formats for this purpose.
 *
 * You can use [this tool](https://danilw.github.io/GLSL-howto/cubemap_to_panorama_js/cubemap_to_panorama.html) to convert a cube map to an equirectangular sky map.
 */
@GodotBaseType
public open class PanoramaSkyMaterial : Material() {
  /**
   * [godot.Texture2D] to be applied to the [godot.PanoramaSkyMaterial].
   */
  public var panorama: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PANORAMASKYMATERIAL_GET_PANORAMA,
          OBJECT.ordinal)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_PANORAMASKYMATERIAL_SET_PANORAMA,
          NIL.ordinal)
    }

  /**
   * A boolean value to determine if the background texture should be filtered or not.
   */
  public var filter: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PANORAMASKYMATERIAL_IS_FILTERING_ENABLED, BOOL.ordinal)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.icall(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PANORAMASKYMATERIAL_SET_FILTERING_ENABLED, NIL.ordinal)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PANORAMASKYMATERIAL)
  }

  public companion object
}
