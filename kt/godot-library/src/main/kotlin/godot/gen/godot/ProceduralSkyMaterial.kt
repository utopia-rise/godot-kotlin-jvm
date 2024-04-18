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
 * A material that defines a simple sky for a [godot.Sky] resource.
 *
 * [godot.ProceduralSkyMaterial] provides a way to create an effective background quickly by defining procedural parameters for the sun, the sky and the ground. The sky and ground are defined by a main color, a color at the horizon, and an easing curve to interpolate between them. Suns are described by a position in the sky, a color, and a max angle from the sun at which the easing curve ends. The max angle therefore defines the size of the sun in the sky.
 *
 * [godot.ProceduralSkyMaterial] supports up to 4 suns, using the color, and energy, direction, and angular distance of the first four [godot.DirectionalLight3D] nodes in the scene. This means that the suns are defined individually by the properties of their corresponding [godot.DirectionalLight3D]s and globally by [sunAngleMax] and [sunCurve].
 *
 * [godot.ProceduralSkyMaterial] uses a lightweight shader to draw the sky and is therefore suited for real-time updates. This makes it a great option for a sky that is simple and computationally cheap, but unrealistic. If you need a more realistic procedural option, use [godot.PhysicalSkyMaterial].
 */
@GodotBaseType
public open class ProceduralSkyMaterial : Material() {
  /**
   * Color of the sky at the top. Blends with [skyHorizonColor].
   */
  @CoreTypeLocalCopy
  public var skyTopColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSkyTopColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSkyTopColorPtr, NIL)
    }

  /**
   * Color of the sky at the horizon. Blends with [skyTopColor].
   */
  @CoreTypeLocalCopy
  public var skyHorizonColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSkyHorizonColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSkyHorizonColorPtr, NIL)
    }

  /**
   * How quickly the [skyHorizonColor] fades into the [skyTopColor].
   */
  public var skyCurve: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSkyCurvePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSkyCurvePtr, NIL)
    }

  /**
   * Multiplier for sky color. A higher value will make the sky brighter.
   */
  public var skyEnergyMultiplier: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSkyEnergyMultiplierPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSkyEnergyMultiplierPtr, NIL)
    }

  /**
   * The sky cover texture to use. This texture must use an equirectangular projection (similar to [godot.PanoramaSkyMaterial]). The texture's colors will be *added* to the existing sky color, and will be multiplied by [skyEnergyMultiplier] and [skyCoverModulate]. This is mainly suited to displaying stars at night, but it can also be used to display clouds at day or night (with a non-physically-accurate look).
   */
  public var skyCover: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSkyCoverPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSkyCoverPtr, NIL)
    }

  /**
   * The tint to apply to the [skyCover] texture. This can be used to change the sky cover's colors or opacity independently of the sky energy, which is useful for day/night or weather transitions. Only effective if a texture is defined in [skyCover].
   */
  @CoreTypeLocalCopy
  public var skyCoverModulate: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSkyCoverModulatePtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSkyCoverModulatePtr, NIL)
    }

  /**
   * Color of the ground at the bottom. Blends with [groundHorizonColor].
   */
  @CoreTypeLocalCopy
  public var groundBottomColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGroundBottomColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGroundBottomColorPtr, NIL)
    }

  /**
   * Color of the ground at the horizon. Blends with [groundBottomColor].
   */
  @CoreTypeLocalCopy
  public var groundHorizonColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGroundHorizonColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGroundHorizonColorPtr, NIL)
    }

  /**
   * How quickly the [groundHorizonColor] fades into the [groundBottomColor].
   */
  public var groundCurve: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGroundCurvePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setGroundCurvePtr, NIL)
    }

  /**
   * Multiplier for ground color. A higher value will make the ground brighter.
   */
  public var groundEnergyMultiplier: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGroundEnergyMultiplierPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setGroundEnergyMultiplierPtr, NIL)
    }

  /**
   * Distance from center of sun where it fades out completely.
   */
  public var sunAngleMax: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSunAngleMaxPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSunAngleMaxPtr, NIL)
    }

  /**
   * How quickly the sun fades away between the edge of the sun disk and [sunAngleMax].
   */
  public var sunCurve: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSunCurvePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSunCurvePtr, NIL)
    }

  /**
   * If `true`, enables debanding. Debanding adds a small amount of noise which helps reduce banding that appears from the smooth changes in color in the sky.
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

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PROCEDURALSKYMATERIAL, scriptIndex)
    return true
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
  public open fun skyTopColorMutate(block: Color.() -> Unit): Color = skyTopColor.apply{
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
  public open fun skyHorizonColorMutate(block: Color.() -> Unit): Color = skyHorizonColor.apply{
      block(this)
      skyHorizonColor = this
  }


  /**
   * The tint to apply to the [skyCover] texture. This can be used to change the sky cover's colors or opacity independently of the sky energy, which is useful for day/night or weather transitions. Only effective if a texture is defined in [skyCover].
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
  public open fun skyCoverModulateMutate(block: Color.() -> Unit): Color = skyCoverModulate.apply{
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
  public open fun groundBottomColorMutate(block: Color.() -> Unit): Color = groundBottomColor.apply{
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
  public open fun groundHorizonColorMutate(block: Color.() -> Unit): Color =
      groundHorizonColor.apply{
      block(this)
      groundHorizonColor = this
  }


  public companion object

  internal object MethodBindings {
    public val setSkyTopColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "set_sky_top_color")

    public val getSkyTopColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "get_sky_top_color")

    public val setSkyHorizonColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "set_sky_horizon_color")

    public val getSkyHorizonColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "get_sky_horizon_color")

    public val setSkyCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "set_sky_curve")

    public val getSkyCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "get_sky_curve")

    public val setSkyEnergyMultiplierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "set_sky_energy_multiplier")

    public val getSkyEnergyMultiplierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "get_sky_energy_multiplier")

    public val setSkyCoverPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "set_sky_cover")

    public val getSkyCoverPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "get_sky_cover")

    public val setSkyCoverModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "set_sky_cover_modulate")

    public val getSkyCoverModulatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "get_sky_cover_modulate")

    public val setGroundBottomColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "set_ground_bottom_color")

    public val getGroundBottomColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "get_ground_bottom_color")

    public val setGroundHorizonColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "set_ground_horizon_color")

    public val getGroundHorizonColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "get_ground_horizon_color")

    public val setGroundCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "set_ground_curve")

    public val getGroundCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "get_ground_curve")

    public val setGroundEnergyMultiplierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "set_ground_energy_multiplier")

    public val getGroundEnergyMultiplierPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "get_ground_energy_multiplier")

    public val setSunAngleMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "set_sun_angle_max")

    public val getSunAngleMaxPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "get_sun_angle_max")

    public val setSunCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "set_sun_curve")

    public val getSunCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "get_sun_curve")

    public val setUseDebandingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "set_use_debanding")

    public val getUseDebandingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("ProceduralSkyMaterial", "get_use_debanding")
  }
}
