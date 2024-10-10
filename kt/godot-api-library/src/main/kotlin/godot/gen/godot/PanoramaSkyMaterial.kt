// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_PANORAMASKYMATERIAL_INDEX: Int = 447

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
  public final inline var panorama: Texture2D?
    @JvmName("panoramaProperty")
    get() = getPanorama()
    @JvmName("panoramaProperty")
    set(`value`) {
      setPanorama(value)
    }

  /**
   * A boolean value to determine if the background texture should be filtered or not.
   */
  public final inline var filter: Boolean
    @JvmName("filterProperty")
    get() = isFilteringEnabled()
    @JvmName("filterProperty")
    set(`value`) {
      setFilteringEnabled(value)
    }

  /**
   * The sky's overall brightness multiplier. Higher values result in a brighter sky.
   */
  public final inline var energyMultiplier: Float
    @JvmName("energyMultiplierProperty")
    get() = getEnergyMultiplier()
    @JvmName("energyMultiplierProperty")
    set(`value`) {
      setEnergyMultiplier(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_PANORAMASKYMATERIAL_INDEX, scriptIndex)
  }

  public final fun setPanorama(texture: Texture2D?): Unit {
    Internals.writeArguments(OBJECT to texture)
    Internals.callMethod(rawPtr, MethodBindings.setPanoramaPtr, NIL)
  }

  public final fun getPanorama(): Texture2D? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPanoramaPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun setFilteringEnabled(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setFilteringEnabledPtr, NIL)
  }

  public final fun isFilteringEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isFilteringEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setEnergyMultiplier(multiplier: Float): Unit {
    Internals.writeArguments(DOUBLE to multiplier.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setEnergyMultiplierPtr, NIL)
  }

  public final fun getEnergyMultiplier(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getEnergyMultiplierPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  internal object MethodBindings {
    public val setPanoramaPtr: VoidPtr =
        Internals.getMethodBindPtr("PanoramaSkyMaterial", "set_panorama", 4051416890)

    public val getPanoramaPtr: VoidPtr =
        Internals.getMethodBindPtr("PanoramaSkyMaterial", "get_panorama", 3635182373)

    public val setFilteringEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("PanoramaSkyMaterial", "set_filtering_enabled", 2586408642)

    public val isFilteringEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("PanoramaSkyMaterial", "is_filtering_enabled", 36873697)

    public val setEnergyMultiplierPtr: VoidPtr =
        Internals.getMethodBindPtr("PanoramaSkyMaterial", "set_energy_multiplier", 373806689)

    public val getEnergyMultiplierPtr: VoidPtr =
        Internals.getMethodBindPtr("PanoramaSkyMaterial", "get_energy_multiplier", 1740695150)
  }
}
