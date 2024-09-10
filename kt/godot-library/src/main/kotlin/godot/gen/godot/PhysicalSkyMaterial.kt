// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
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
 * The [PhysicalSkyMaterial] uses the Preetham analytic daylight model to draw a sky based on
 * physical properties. This results in a substantially more realistic sky than the
 * [ProceduralSkyMaterial], but it is slightly slower and less flexible.
 * The [PhysicalSkyMaterial] only supports one sun. The color, energy, and direction of the sun are
 * taken from the first [DirectionalLight3D] in the scene tree.
 */
@GodotBaseType
public open class PhysicalSkyMaterial : Material() {
  /**
   * Controls the strength of the [url=https://en.wikipedia.org/wiki/Rayleigh_scattering]Rayleigh
   * scattering[/url]. Rayleigh scattering results from light colliding with small particles. It is
   * responsible for the blue color of the sky.
   */
  public var rayleighCoefficient: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRayleighCoefficientPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRayleighCoefficientPtr, NIL)
    }

  /**
   * Controls the [Color] of the [url=https://en.wikipedia.org/wiki/Rayleigh_scattering]Rayleigh
   * scattering[/url]. While not physically accurate, this allows for the creation of alien-looking
   * planets. For example, setting this to a red [Color] results in a Mars-looking atmosphere with a
   * corresponding blue sunset.
   */
  @CoreTypeLocalCopy
  public var rayleighColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRayleighColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRayleighColorPtr, NIL)
    }

  /**
   * Controls the strength of [url=https://en.wikipedia.org/wiki/Mie_scattering]Mie scattering[/url]
   * for the sky. Mie scattering results from light colliding with larger particles (like water). On
   * earth, Mie scattering results in a whitish color around the sun and horizon.
   */
  public var mieCoefficient: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMieCoefficientPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMieCoefficientPtr, NIL)
    }

  /**
   * Controls the direction of the [url=https://en.wikipedia.org/wiki/Mie_scattering]Mie
   * scattering[/url]. A value of `1` means that when light hits a particle it's passing through
   * straight forward. A value of `-1` means that all light is scatter backwards.
   */
  public var mieEccentricity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMieEccentricityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMieEccentricityPtr, NIL)
    }

  /**
   * Controls the [Color] of the [url=https://en.wikipedia.org/wiki/Mie_scattering]Mie
   * scattering[/url] effect. While not physically accurate, this allows for the creation of
   * alien-looking planets.
   */
  @CoreTypeLocalCopy
  public var mieColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMieColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMieColorPtr, NIL)
    }

  /**
   * Sets the thickness of the atmosphere. High turbidity creates a foggy-looking atmosphere, while
   * a low turbidity results in a clearer atmosphere.
   */
  public var turbidity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTurbidityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTurbidityPtr, NIL)
    }

  /**
   * Sets the size of the sun disk. Default value is based on Sol's perceived size from Earth.
   */
  public var sunDiskScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSunDiskScalePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSunDiskScalePtr, NIL)
    }

  /**
   * Modulates the [Color] on the bottom half of the sky to represent the ground.
   */
  @CoreTypeLocalCopy
  public var groundColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGroundColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGroundColorPtr, NIL)
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

  /**
   * If `true`, enables debanding. Debanding adds a small amount of noise which helps reduce banding
   * that appears from the smooth changes in color in the sky.
   */
  public var useDebanding: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUseDebandingPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseDebandingPtr, NIL)
    }

  /**
   * [Texture2D] for the night sky. This is added to the sky, so if it is bright enough, it may be
   * visible during the day.
   */
  public var nightSky: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNightSkyPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setNightSkyPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_PHYSICALSKYMATERIAL, scriptIndex)
  }

  /**
   * Controls the [Color] of the [url=https://en.wikipedia.org/wiki/Rayleigh_scattering]Rayleigh
   * scattering[/url]. While not physically accurate, this allows for the creation of alien-looking
   * planets. For example, setting this to a red [Color] results in a Mars-looking atmosphere with a
   * corresponding blue sunset.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = physicalskymaterial.rayleighColor
   * //Your changes
   * physicalskymaterial.rayleighColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun rayleighColorMutate(block: Color.() -> Unit): Color = rayleighColor.apply{
      block(this)
      rayleighColor = this
  }


  /**
   * Controls the [Color] of the [url=https://en.wikipedia.org/wiki/Mie_scattering]Mie
   * scattering[/url] effect. While not physically accurate, this allows for the creation of
   * alien-looking planets.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = physicalskymaterial.mieColor
   * //Your changes
   * physicalskymaterial.mieColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun mieColorMutate(block: Color.() -> Unit): Color = mieColor.apply{
      block(this)
      mieColor = this
  }


  /**
   * Modulates the [Color] on the bottom half of the sky to represent the ground.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = physicalskymaterial.groundColor
   * //Your changes
   * physicalskymaterial.groundColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun groundColorMutate(block: Color.() -> Unit): Color = groundColor.apply{
      block(this)
      groundColor = this
  }


  public companion object

  internal object MethodBindings {
    public val setRayleighCoefficientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "set_rayleigh_coefficient", 373806689)

    public val getRayleighCoefficientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "get_rayleigh_coefficient", 1740695150)

    public val setRayleighColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "set_rayleigh_color", 2920490490)

    public val getRayleighColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "get_rayleigh_color", 3444240500)

    public val setMieCoefficientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "set_mie_coefficient", 373806689)

    public val getMieCoefficientPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "get_mie_coefficient", 1740695150)

    public val setMieEccentricityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "set_mie_eccentricity", 373806689)

    public val getMieEccentricityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "get_mie_eccentricity", 1740695150)

    public val setMieColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "set_mie_color", 2920490490)

    public val getMieColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "get_mie_color", 3444240500)

    public val setTurbidityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "set_turbidity", 373806689)

    public val getTurbidityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "get_turbidity", 1740695150)

    public val setSunDiskScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "set_sun_disk_scale", 373806689)

    public val getSunDiskScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "get_sun_disk_scale", 1740695150)

    public val setGroundColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "set_ground_color", 2920490490)

    public val getGroundColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "get_ground_color", 3444240500)

    public val setEnergyMultiplierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "set_energy_multiplier", 373806689)

    public val getEnergyMultiplierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "get_energy_multiplier", 1740695150)

    public val setUseDebandingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "set_use_debanding", 2586408642)

    public val getUseDebandingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "get_use_debanding", 36873697)

    public val setNightSkyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "set_night_sky", 4051416890)

    public val getNightSkyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicalSkyMaterial", "get_night_sky", 3635182373)
  }
}
