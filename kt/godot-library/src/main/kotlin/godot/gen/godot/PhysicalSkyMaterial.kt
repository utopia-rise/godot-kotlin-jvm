// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.Color
import godot.core.TypeManager
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
  public final inline var rayleighCoefficient: Float
    @JvmName("rayleighCoefficientProperty")
    get() = getRayleighCoefficient()
    @JvmName("rayleighCoefficientProperty")
    set(`value`) {
      setRayleighCoefficient(value)
    }

  /**
   * Controls the [Color] of the [url=https://en.wikipedia.org/wiki/Rayleigh_scattering]Rayleigh
   * scattering[/url]. While not physically accurate, this allows for the creation of alien-looking
   * planets. For example, setting this to a red [Color] results in a Mars-looking atmosphere with a
   * corresponding blue sunset.
   */
  @CoreTypeLocalCopy
  public final inline var rayleighColor: Color
    @JvmName("rayleighColorProperty")
    get() = getRayleighColor()
    @JvmName("rayleighColorProperty")
    set(`value`) {
      setRayleighColor(value)
    }

  /**
   * Controls the strength of [url=https://en.wikipedia.org/wiki/Mie_scattering]Mie scattering[/url]
   * for the sky. Mie scattering results from light colliding with larger particles (like water). On
   * earth, Mie scattering results in a whitish color around the sun and horizon.
   */
  public final inline var mieCoefficient: Float
    @JvmName("mieCoefficientProperty")
    get() = getMieCoefficient()
    @JvmName("mieCoefficientProperty")
    set(`value`) {
      setMieCoefficient(value)
    }

  /**
   * Controls the direction of the [url=https://en.wikipedia.org/wiki/Mie_scattering]Mie
   * scattering[/url]. A value of `1` means that when light hits a particle it's passing through
   * straight forward. A value of `-1` means that all light is scatter backwards.
   */
  public final inline var mieEccentricity: Float
    @JvmName("mieEccentricityProperty")
    get() = getMieEccentricity()
    @JvmName("mieEccentricityProperty")
    set(`value`) {
      setMieEccentricity(value)
    }

  /**
   * Controls the [Color] of the [url=https://en.wikipedia.org/wiki/Mie_scattering]Mie
   * scattering[/url] effect. While not physically accurate, this allows for the creation of
   * alien-looking planets.
   */
  @CoreTypeLocalCopy
  public final inline var mieColor: Color
    @JvmName("mieColorProperty")
    get() = getMieColor()
    @JvmName("mieColorProperty")
    set(`value`) {
      setMieColor(value)
    }

  /**
   * Sets the thickness of the atmosphere. High turbidity creates a foggy-looking atmosphere, while
   * a low turbidity results in a clearer atmosphere.
   */
  public final inline var turbidity: Float
    @JvmName("turbidityProperty")
    get() = getTurbidity()
    @JvmName("turbidityProperty")
    set(`value`) {
      setTurbidity(value)
    }

  /**
   * Sets the size of the sun disk. Default value is based on Sol's perceived size from Earth.
   */
  public final inline var sunDiskScale: Float
    @JvmName("sunDiskScaleProperty")
    get() = getSunDiskScale()
    @JvmName("sunDiskScaleProperty")
    set(`value`) {
      setSunDiskScale(value)
    }

  /**
   * Modulates the [Color] on the bottom half of the sky to represent the ground.
   */
  @CoreTypeLocalCopy
  public final inline var groundColor: Color
    @JvmName("groundColorProperty")
    get() = getGroundColor()
    @JvmName("groundColorProperty")
    set(`value`) {
      setGroundColor(value)
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

  /**
   * If `true`, enables debanding. Debanding adds a small amount of noise which helps reduce banding
   * that appears from the smooth changes in color in the sky.
   */
  public final inline var useDebanding: Boolean
    @JvmName("useDebandingProperty")
    get() = getUseDebanding()
    @JvmName("useDebandingProperty")
    set(`value`) {
      setUseDebanding(value)
    }

  /**
   * [Texture2D] for the night sky. This is added to the sky, so if it is bright enough, it may be
   * visible during the day.
   */
  public final inline var nightSky: Texture2D?
    @JvmName("nightSkyProperty")
    get() = getNightSky()
    @JvmName("nightSkyProperty")
    set(`value`) {
      setNightSky(value)
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
  public final fun rayleighColorMutate(block: Color.() -> Unit): Color = rayleighColor.apply{
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
  public final fun mieColorMutate(block: Color.() -> Unit): Color = mieColor.apply{
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
  public final fun groundColorMutate(block: Color.() -> Unit): Color = groundColor.apply{
      block(this)
      groundColor = this
  }


  public final fun setRayleighCoefficient(rayleigh: Float): Unit {
    TransferContext.writeArguments(DOUBLE to rayleigh.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setRayleighCoefficientPtr, NIL)
  }

  public final fun getRayleighCoefficient(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRayleighCoefficientPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setRayleighColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setRayleighColorPtr, NIL)
  }

  public final fun getRayleighColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRayleighColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setMieCoefficient(mie: Float): Unit {
    TransferContext.writeArguments(DOUBLE to mie.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setMieCoefficientPtr, NIL)
  }

  public final fun getMieCoefficient(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMieCoefficientPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setMieEccentricity(eccentricity: Float): Unit {
    TransferContext.writeArguments(DOUBLE to eccentricity.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setMieEccentricityPtr, NIL)
  }

  public final fun getMieEccentricity(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMieEccentricityPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setMieColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setMieColorPtr, NIL)
  }

  public final fun getMieColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMieColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setTurbidity(turbidity: Float): Unit {
    TransferContext.writeArguments(DOUBLE to turbidity.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setTurbidityPtr, NIL)
  }

  public final fun getTurbidity(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTurbidityPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSunDiskScale(scale: Float): Unit {
    TransferContext.writeArguments(DOUBLE to scale.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSunDiskScalePtr, NIL)
  }

  public final fun getSunDiskScale(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSunDiskScalePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setGroundColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setGroundColorPtr, NIL)
  }

  public final fun getGroundColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGroundColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setEnergyMultiplier(multiplier: Float): Unit {
    TransferContext.writeArguments(DOUBLE to multiplier.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setEnergyMultiplierPtr, NIL)
  }

  public final fun getEnergyMultiplier(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEnergyMultiplierPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setUseDebanding(useDebanding: Boolean): Unit {
    TransferContext.writeArguments(BOOL to useDebanding)
    TransferContext.callMethod(ptr, MethodBindings.setUseDebandingPtr, NIL)
  }

  public final fun getUseDebanding(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getUseDebandingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setNightSky(nightSky: Texture2D?): Unit {
    TransferContext.writeArguments(OBJECT to nightSky)
    TransferContext.callMethod(ptr, MethodBindings.setNightSkyPtr, NIL)
  }

  public final fun getNightSky(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNightSkyPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
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
