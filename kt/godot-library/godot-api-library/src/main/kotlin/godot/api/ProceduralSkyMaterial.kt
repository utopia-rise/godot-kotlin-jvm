// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Color
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.getEnergyMultiplierPtr
import godot.getGroundBottomColorPtr
import godot.getGroundCurvePtr
import godot.getGroundEnergyMultiplierPtr
import godot.getGroundHorizonColorPtr
import godot.getSkyCoverModulatePtr
import godot.getSkyCoverPtr
import godot.getSkyCurvePtr
import godot.getSkyEnergyMultiplierPtr
import godot.getSkyHorizonColorPtr
import godot.getSkyTopColorPtr
import godot.getSunAngleMaxPtr
import godot.getSunCurvePtr
import godot.getUseDebandingPtr
import godot.setEnergyMultiplierPtr
import godot.setGroundBottomColorPtr
import godot.setGroundCurvePtr
import godot.setGroundEnergyMultiplierPtr
import godot.setGroundHorizonColorPtr
import godot.setSkyCoverModulatePtr
import godot.setSkyCoverPtr
import godot.setSkyCurvePtr
import godot.setSkyEnergyMultiplierPtr
import godot.setSkyHorizonColorPtr
import godot.setSkyTopColorPtr
import godot.setSunAngleMaxPtr
import godot.setSunCurvePtr
import godot.setUseDebandingPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINECLASS_PROCEDURALSKYMATERIAL: Int = 504

/**
 * [ProceduralSkyMaterial] provides a way to create an effective background quickly by defining
 * procedural parameters for the sun, the sky and the ground. The sky and ground are defined by a main
 * color, a color at the horizon, and an easing curve to interpolate between them. Suns are described
 * by a position in the sky, a color, and a max angle from the sun at which the easing curve ends. The
 * max angle therefore defines the size of the sun in the sky.
 * [ProceduralSkyMaterial] supports up to 4 suns, using the color, and energy, direction, and
 * angular distance of the first four [DirectionalLight3D] nodes in the scene. This means that the suns
 * are defined individually by the properties of their corresponding [DirectionalLight3D]s and globally
 * by [sunAngleMax] and [sunCurve].
 * [ProceduralSkyMaterial] uses a lightweight shader to draw the sky and is therefore suited for
 * real-time updates. This makes it a great option for a sky that is simple and computationally cheap,
 * but unrealistic. If you need a more realistic procedural option, use [PhysicalSkyMaterial].
 */
@GodotBaseType
public open class ProceduralSkyMaterial : Material() {
  /**
   * Color of the sky at the top. Blends with [skyHorizonColor].
   */
  @CoreTypeLocalCopy
  public final inline var skyTopColor: Color
    @JvmName("skyTopColorProperty")
    get() = getSkyTopColor()
    @JvmName("skyTopColorProperty")
    set(`value`) {
      setSkyTopColor(value)
    }

  /**
   * Color of the sky at the horizon. Blends with [skyTopColor].
   */
  @CoreTypeLocalCopy
  public final inline var skyHorizonColor: Color
    @JvmName("skyHorizonColorProperty")
    get() = getSkyHorizonColor()
    @JvmName("skyHorizonColorProperty")
    set(`value`) {
      setSkyHorizonColor(value)
    }

  /**
   * How quickly the [skyHorizonColor] fades into the [skyTopColor].
   */
  public final inline var skyCurve: Float
    @JvmName("skyCurveProperty")
    get() = getSkyCurve()
    @JvmName("skyCurveProperty")
    set(`value`) {
      setSkyCurve(value)
    }

  /**
   * Multiplier for sky color. A higher value will make the sky brighter.
   */
  public final inline var skyEnergyMultiplier: Float
    @JvmName("skyEnergyMultiplierProperty")
    get() = getSkyEnergyMultiplier()
    @JvmName("skyEnergyMultiplierProperty")
    set(`value`) {
      setSkyEnergyMultiplier(value)
    }

  /**
   * The sky cover texture to use. This texture must use an equirectangular projection (similar to
   * [PanoramaSkyMaterial]). The texture's colors will be *added* to the existing sky color, and will
   * be multiplied by [skyEnergyMultiplier] and [skyCoverModulate]. This is mainly suited to displaying
   * stars at night, but it can also be used to display clouds at day or night (with a
   * non-physically-accurate look).
   */
  public final inline var skyCover: Texture2D?
    @JvmName("skyCoverProperty")
    get() = getSkyCover()
    @JvmName("skyCoverProperty")
    set(`value`) {
      setSkyCover(value)
    }

  /**
   * The tint to apply to the [skyCover] texture. This can be used to change the sky cover's colors
   * or opacity independently of the sky energy, which is useful for day/night or weather transitions.
   * Only effective if a texture is defined in [skyCover].
   */
  @CoreTypeLocalCopy
  public final inline var skyCoverModulate: Color
    @JvmName("skyCoverModulateProperty")
    get() = getSkyCoverModulate()
    @JvmName("skyCoverModulateProperty")
    set(`value`) {
      setSkyCoverModulate(value)
    }

  /**
   * Color of the ground at the bottom. Blends with [groundHorizonColor].
   */
  @CoreTypeLocalCopy
  public final inline var groundBottomColor: Color
    @JvmName("groundBottomColorProperty")
    get() = getGroundBottomColor()
    @JvmName("groundBottomColorProperty")
    set(`value`) {
      setGroundBottomColor(value)
    }

  /**
   * Color of the ground at the horizon. Blends with [groundBottomColor].
   */
  @CoreTypeLocalCopy
  public final inline var groundHorizonColor: Color
    @JvmName("groundHorizonColorProperty")
    get() = getGroundHorizonColor()
    @JvmName("groundHorizonColorProperty")
    set(`value`) {
      setGroundHorizonColor(value)
    }

  /**
   * How quickly the [groundHorizonColor] fades into the [groundBottomColor].
   */
  public final inline var groundCurve: Float
    @JvmName("groundCurveProperty")
    get() = getGroundCurve()
    @JvmName("groundCurveProperty")
    set(`value`) {
      setGroundCurve(value)
    }

  /**
   * Multiplier for ground color. A higher value will make the ground brighter.
   */
  public final inline var groundEnergyMultiplier: Float
    @JvmName("groundEnergyMultiplierProperty")
    get() = getGroundEnergyMultiplier()
    @JvmName("groundEnergyMultiplierProperty")
    set(`value`) {
      setGroundEnergyMultiplier(value)
    }

  /**
   * Distance from center of sun where it fades out completely.
   */
  public final inline var sunAngleMax: Float
    @JvmName("sunAngleMaxProperty")
    get() = getSunAngleMax()
    @JvmName("sunAngleMaxProperty")
    set(`value`) {
      setSunAngleMax(value)
    }

  /**
   * How quickly the sun fades away between the edge of the sun disk and [sunAngleMax].
   */
  public final inline var sunCurve: Float
    @JvmName("sunCurveProperty")
    get() = getSunCurve()
    @JvmName("sunCurveProperty")
    set(`value`) {
      setSunCurve(value)
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
    createNativeObject(ENGINECLASS_PROCEDURALSKYMATERIAL, scriptIndex)
  }

  /**
   * Color of the sky at the top. Blends with [skyHorizonColor].
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
   * val myCoreType = proceduralskymaterial.skyTopColor
   * //Your changes
   * proceduralskymaterial.skyTopColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun skyTopColorMutate(block: Color.() -> Unit): Color = skyTopColor.apply{
      block(this)
      skyTopColor = this
  }


  /**
   * Color of the sky at the horizon. Blends with [skyTopColor].
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
   * val myCoreType = proceduralskymaterial.skyHorizonColor
   * //Your changes
   * proceduralskymaterial.skyHorizonColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun skyHorizonColorMutate(block: Color.() -> Unit): Color = skyHorizonColor.apply{
      block(this)
      skyHorizonColor = this
  }


  /**
   * The tint to apply to the [skyCover] texture. This can be used to change the sky cover's colors
   * or opacity independently of the sky energy, which is useful for day/night or weather transitions.
   * Only effective if a texture is defined in [skyCover].
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
   * val myCoreType = proceduralskymaterial.skyCoverModulate
   * //Your changes
   * proceduralskymaterial.skyCoverModulate = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun skyCoverModulateMutate(block: Color.() -> Unit): Color = skyCoverModulate.apply{
      block(this)
      skyCoverModulate = this
  }


  /**
   * Color of the ground at the bottom. Blends with [groundHorizonColor].
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
   * val myCoreType = proceduralskymaterial.groundBottomColor
   * //Your changes
   * proceduralskymaterial.groundBottomColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun groundBottomColorMutate(block: Color.() -> Unit): Color =
      groundBottomColor.apply{
      block(this)
      groundBottomColor = this
  }


  /**
   * Color of the ground at the horizon. Blends with [groundBottomColor].
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
   * val myCoreType = proceduralskymaterial.groundHorizonColor
   * //Your changes
   * proceduralskymaterial.groundHorizonColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun groundHorizonColorMutate(block: Color.() -> Unit): Color =
      groundHorizonColor.apply{
      block(this)
      groundHorizonColor = this
  }


  public final fun setSkyTopColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setSkyTopColorPtr, NIL)
  }

  public final fun getSkyTopColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSkyTopColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setSkyHorizonColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setSkyHorizonColorPtr, NIL)
  }

  public final fun getSkyHorizonColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSkyHorizonColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setSkyCurve(curve: Float): Unit {
    TransferContext.writeArguments(DOUBLE to curve.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSkyCurvePtr, NIL)
  }

  public final fun getSkyCurve(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSkyCurvePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSkyEnergyMultiplier(multiplier: Float): Unit {
    TransferContext.writeArguments(DOUBLE to multiplier.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSkyEnergyMultiplierPtr, NIL)
  }

  public final fun getSkyEnergyMultiplier(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSkyEnergyMultiplierPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSkyCover(skyCover: Texture2D?): Unit {
    TransferContext.writeArguments(OBJECT to skyCover)
    TransferContext.callMethod(ptr, MethodBindings.setSkyCoverPtr, NIL)
  }

  public final fun getSkyCover(): Texture2D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSkyCoverPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Texture2D?)
  }

  public final fun setSkyCoverModulate(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setSkyCoverModulatePtr, NIL)
  }

  public final fun getSkyCoverModulate(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSkyCoverModulatePtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setGroundBottomColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setGroundBottomColorPtr, NIL)
  }

  public final fun getGroundBottomColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGroundBottomColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setGroundHorizonColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(ptr, MethodBindings.setGroundHorizonColorPtr, NIL)
  }

  public final fun getGroundHorizonColor(): Color {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGroundHorizonColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR) as Color)
  }

  public final fun setGroundCurve(curve: Float): Unit {
    TransferContext.writeArguments(DOUBLE to curve.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setGroundCurvePtr, NIL)
  }

  public final fun getGroundCurve(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGroundCurvePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setGroundEnergyMultiplier(energy: Float): Unit {
    TransferContext.writeArguments(DOUBLE to energy.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setGroundEnergyMultiplierPtr, NIL)
  }

  public final fun getGroundEnergyMultiplier(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGroundEnergyMultiplierPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSunAngleMax(degrees: Float): Unit {
    TransferContext.writeArguments(DOUBLE to degrees.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSunAngleMaxPtr, NIL)
  }

  public final fun getSunAngleMax(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSunAngleMaxPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setSunCurve(curve: Float): Unit {
    TransferContext.writeArguments(DOUBLE to curve.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setSunCurvePtr, NIL)
  }

  public final fun getSunCurve(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSunCurvePtr, DOUBLE)
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

  public final fun setEnergyMultiplier(multiplier: Float): Unit {
    TransferContext.writeArguments(DOUBLE to multiplier.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setEnergyMultiplierPtr, NIL)
  }

  public final fun getEnergyMultiplier(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getEnergyMultiplierPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  public object MethodBindings {
    internal val setSkyTopColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "set_sky_top_color", 2920490490)

    internal val getSkyTopColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "get_sky_top_color", 3444240500)

    internal val setSkyHorizonColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "set_sky_horizon_color", 2920490490)

    internal val getSkyHorizonColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "get_sky_horizon_color", 3444240500)

    internal val setSkyCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "set_sky_curve", 373806689)

    internal val getSkyCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "get_sky_curve", 1740695150)

    internal val setSkyEnergyMultiplierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "set_sky_energy_multiplier", 373806689)

    internal val getSkyEnergyMultiplierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "get_sky_energy_multiplier", 1740695150)

    internal val setSkyCoverPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "set_sky_cover", 4051416890)

    internal val getSkyCoverPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "get_sky_cover", 3635182373)

    internal val setSkyCoverModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "set_sky_cover_modulate", 2920490490)

    internal val getSkyCoverModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "get_sky_cover_modulate", 3444240500)

    internal val setGroundBottomColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "set_ground_bottom_color", 2920490490)

    internal val getGroundBottomColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "get_ground_bottom_color", 3444240500)

    internal val setGroundHorizonColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "set_ground_horizon_color", 2920490490)

    internal val getGroundHorizonColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "get_ground_horizon_color", 3444240500)

    internal val setGroundCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "set_ground_curve", 373806689)

    internal val getGroundCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "get_ground_curve", 1740695150)

    internal val setGroundEnergyMultiplierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "set_ground_energy_multiplier", 373806689)

    internal val getGroundEnergyMultiplierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "get_ground_energy_multiplier", 1740695150)

    internal val setSunAngleMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "set_sun_angle_max", 373806689)

    internal val getSunAngleMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "get_sun_angle_max", 1740695150)

    internal val setSunCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "set_sun_curve", 373806689)

    internal val getSunCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "get_sun_curve", 1740695150)

    internal val setUseDebandingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "set_use_debanding", 2586408642)

    internal val getUseDebandingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "get_use_debanding", 36873697)

    internal val setEnergyMultiplierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "set_energy_multiplier", 373806689)

    internal val getEnergyMultiplierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "get_energy_multiplier", 1740695150)
  }
}
