// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * A resource referenced in a [Sky] that is used to draw a background. [PanoramaSkyMaterial]
 * functions similar to skyboxes in other engines, except it uses an equirectangular sky map instead of
 * a [Cubemap].
 * Using an HDR panorama is strongly recommended for accurate, high-quality reflections. Godot
 * supports the Radiance HDR (`.hdr`) and OpenEXR (`.exr`) image formats for this purpose.
 * You can use
 * [url=https://danilw.github.io/GLSL-howto/cubemap_to_panorama_js/cubemap_to_panorama.html]this
 * tool[/url] to convert a cubemap to an equirectangular sky map.
 */
@GodotBaseType
public open class PanoramaSkyMaterial : Material() {
  /**
   * [Texture2D] to be applied to the [PanoramaSkyMaterial].
   */
  public var panorama: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPanoramaPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPanoramaPtr, NIL)
    }

  /**
   * A boolean value to determine if the background texture should be filtered or not.
   */
  public var filter: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isFilteringEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setFilteringEnabledPtr, NIL)
    }

  /**
   * The sky's overall brightness multiplier. Higher values result in a brighter sky.
   */
  public var energyMultiplier: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEnergyMultiplierPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setEnergyMultiplierPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_PANORAMASKYMATERIAL, scriptIndex)
  }

  public companion object

  internal object MethodBindings {
    public val setPanoramaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PanoramaSkyMaterial", "set_panorama")

    public val getPanoramaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PanoramaSkyMaterial", "get_panorama")

    public val setFilteringEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PanoramaSkyMaterial", "set_filtering_enabled")

    public val isFilteringEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PanoramaSkyMaterial", "is_filtering_enabled")

    public val setEnergyMultiplierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PanoramaSkyMaterial", "set_energy_multiplier")

    public val getEnergyMultiplierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PanoramaSkyMaterial", "get_energy_multiplier")
  }
}
