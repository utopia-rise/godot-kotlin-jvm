// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.TransferContext
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Double
import kotlin.Suppress
import kotlin.Unit

/**
 * [godot.Sky] [godot.Material] used for a physically based sky.
 *
 * The [godot.PhysicalSkyMaterial] uses the Preetham analytic daylight model to draw a sky based on physical properties. This results in a substantially more realistic sky than the [godot.ProceduralSkyMaterial], but it is slightly slower and less flexible.
 *
 * The [godot.PhysicalSkyMaterial] only supports one sun. The color, energy, and direction of the sun are taken from the first [godot.DirectionalLight3D] in the scene tree.
 *
 * As it is based on a daylight model, the sky fades to black as the sunset ends. If you want a full day/night cycle, you will have to add a night sky by converting this to a [godot.ShaderMaterial] and adding a night sky directly into the resulting shader.
 */
@GodotBaseType
public open class PhysicalSkyMaterial : Material() {
  /**
   * Controls the strength of the Rayleigh scattering. Rayleigh scattering results from light colliding with small particles. It is responsible for the blue color of the sky.
   */
  public open var rayleighCoefficient: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_GET_RAYLEIGH_COEFFICIENT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_SET_RAYLEIGH_COEFFICIENT, NIL)
    }

  /**
   * Controls the [godot.core.Color] of the Rayleigh scattering. While not physically accurate, this allows for the creation of alien looking planets. For example, setting this to a red [godot.core.Color] results in a Mars looking atmosphere with a corresponding blue sunset.
   */
  public open var rayleighColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_GET_RAYLEIGH_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_SET_RAYLEIGH_COLOR, NIL)
    }

  /**
   * Controls the strength of mie scattering for the sky. Mie scattering results from light colliding with larger particles (like water). On earth, mie scattering results in a whitish color around the sun and horizon.
   */
  public open var mieCoefficient: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_GET_MIE_COEFFICIENT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_SET_MIE_COEFFICIENT, NIL)
    }

  /**
   * Controls the direction of the mie scattering. A value of `1` means that when light hits a particle it's passing through straight forward. A value of `-1` means that all light is scatter backwards.
   */
  public open var mieEccentricity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_GET_MIE_ECCENTRICITY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_SET_MIE_ECCENTRICITY, NIL)
    }

  /**
   * Controls the [godot.core.Color] of the mie scattering effect. While not physically accurate, this allows for the creation of alien looking planets.
   */
  public open var mieColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_GET_MIE_COLOR,
          COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_SET_MIE_COLOR,
          NIL)
    }

  /**
   * Sets the thickness of the atmosphere. High turbidity creates a foggy looking atmosphere, while a low turbidity results in a clearer atmosphere.
   */
  public open var turbidity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_GET_TURBIDITY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_SET_TURBIDITY,
          NIL)
    }

  /**
   * Sets the size of the sun disk. Default value is based on Sol's perceived size from Earth.
   */
  public open var sunDiskScale: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_GET_SUN_DISK_SCALE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_SET_SUN_DISK_SCALE, NIL)
    }

  /**
   * Modulates the [godot.core.Color] on the bottom half of the sky to represent the ground.
   */
  public open var groundColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_GET_GROUND_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_SET_GROUND_COLOR, NIL)
    }

  /**
   * Sets the exposure of the sky. Higher exposure values make the entire sky brighter.
   */
  public open var exposure: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_GET_EXPOSURE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_SET_EXPOSURE,
          NIL)
    }

  /**
   * Sets the amount of dithering to use. Dithering helps reduce banding that appears from the smooth changes in color in the sky. Use the lowest value possible, higher amounts may add fuzziness to the sky.
   */
  public open var ditherStrength: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_GET_DITHER_STRENGTH, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_SET_DITHER_STRENGTH, NIL)
    }

  /**
   * [godot.Texture2D] for the night sky. This is added to the sky, so if it is bright enough, it may be visible during the day.
   */
  public open var nightSky: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_GET_NIGHT_SKY,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture2D?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_SET_NIGHT_SKY,
          NIL)
      return TransferContext.readReturnValue(NIL, true) as Unit?
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PHYSICALSKYMATERIAL)
  }

  public companion object
}
