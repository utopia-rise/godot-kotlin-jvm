// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
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
   * Controls the strength of the [godot.Rayleigh scattering](https://en.wikipedia.org/wiki/Rayleigh_scattering). Rayleigh scattering results from light colliding with small particles. It is responsible for the blue color of the sky.
   */
  public var rayleighCoefficient: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_GET_RAYLEIGH_COEFFICIENT, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_SET_RAYLEIGH_COEFFICIENT, NIL)
    }

  /**
   * Controls the [godot.core.Color] of the [godot.Rayleigh scattering](https://en.wikipedia.org/wiki/Rayleigh_scattering). While not physically accurate, this allows for the creation of alien-looking planets. For example, setting this to a red [godot.core.Color] results in a Mars-looking atmosphere with a corresponding blue sunset.
   */
  public var rayleighColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_GET_RAYLEIGH_COLOR, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_SET_RAYLEIGH_COLOR, NIL)
    }

  /**
   * Controls the strength of [godot.Mie scattering](https://en.wikipedia.org/wiki/Mie_scattering) for the sky. Mie scattering results from light colliding with larger particles (like water). On earth, Mie scattering results in a whitish color around the sun and horizon.
   */
  public var mieCoefficient: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_GET_MIE_COEFFICIENT, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_SET_MIE_COEFFICIENT, NIL)
    }

  /**
   * Controls the direction of the [godot.Mie scattering](https://en.wikipedia.org/wiki/Mie_scattering). A value of `1` means that when light hits a particle it's passing through straight forward. A value of `-1` means that all light is scatter backwards.
   */
  public var mieEccentricity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_GET_MIE_ECCENTRICITY, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_SET_MIE_ECCENTRICITY, NIL)
    }

  /**
   * Controls the [godot.core.Color] of the [godot.Mie scattering](https://en.wikipedia.org/wiki/Mie_scattering) effect. While not physically accurate, this allows for the creation of alien-looking planets.
   */
  public var mieColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_GET_MIE_COLOR,
          COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_SET_MIE_COLOR,
          NIL)
    }

  /**
   * Sets the thickness of the atmosphere. High turbidity creates a foggy-looking atmosphere, while a low turbidity results in a clearer atmosphere.
   */
  public var turbidity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_GET_TURBIDITY,
          DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_SET_TURBIDITY,
          NIL)
    }

  /**
   * Sets the size of the sun disk. Default value is based on Sol's perceived size from Earth.
   */
  public var sunDiskScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_GET_SUN_DISK_SCALE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_SET_SUN_DISK_SCALE, NIL)
    }

  /**
   * Modulates the [godot.core.Color] on the bottom half of the sky to represent the ground.
   */
  public var groundColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_GET_GROUND_COLOR, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_SET_GROUND_COLOR, NIL)
    }

  /**
   * The sky's overall brightness multiplier. Higher values result in a brighter sky.
   */
  public var energyMultiplier: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_GET_ENERGY_MULTIPLIER, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_SET_ENERGY_MULTIPLIER, NIL)
    }

  /**
   * If `true`, enables debanding. Debanding adds a small amount of noise which helps reduce banding that appears from the smooth changes in color in the sky.
   */
  public var useDebanding: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_GET_USE_DEBANDING, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_SET_USE_DEBANDING, NIL)
    }

  /**
   * [godot.Texture2D] for the night sky. This is added to the sky, so if it is bright enough, it may be visible during the day.
   */
  public var nightSky: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_GET_NIGHT_SKY,
          OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PHYSICALSKYMATERIAL_SET_NIGHT_SKY,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PHYSICALSKYMATERIAL, scriptIndex)
    return true
  }

  /**
   * Controls the [godot.core.Color] of the [godot.Rayleigh scattering](https://en.wikipedia.org/wiki/Rayleigh_scattering). While not physically accurate, this allows for the creation of alien-looking planets. For example, setting this to a red [godot.core.Color] results in a Mars-looking atmosphere with a corresponding blue sunset.
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
  public open fun rayleighColor(block: Color.() -> Unit): Color = rayleighColor.apply{
      block(this)
      rayleighColor = this
  }


  /**
   * Controls the [godot.core.Color] of the [godot.Mie scattering](https://en.wikipedia.org/wiki/Mie_scattering) effect. While not physically accurate, this allows for the creation of alien-looking planets.
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
  public open fun mieColor(block: Color.() -> Unit): Color = mieColor.apply{
      block(this)
      mieColor = this
  }


  /**
   * Modulates the [godot.core.Color] on the bottom half of the sky to represent the ground.
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
  public open fun groundColor(block: Color.() -> Unit): Color = groundColor.apply{
      block(this)
      groundColor = this
  }


  public companion object
}
