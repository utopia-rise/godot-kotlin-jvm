// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

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

/**
 * A [godot.Material] used with [godot.Sky] to generate a background based on user input parameters.
 *
 * ProceduralSkyMaterial provides a way to create an effective background quickly by defining procedural parameters for the sun, the sky and the ground. The sky and ground are very similar, they are defined by a color at the horizon, another color, and finally an easing curve to interpolate between these two colors. Similarly, the sun is described by a position in the sky, a color, and an easing curve. However, the sun also defines a minimum and maximum angle, these two values define at what distance the easing curve begins and ends from the sun, and thus end up defining the size of the sun in the sky.
 *
 * The [godot.ProceduralSkyMaterial] uses a lightweight shader to draw the sky and is thus suited for real time updates. When you do not need a quick sky that is not realistic, this is a good option. If you need a more realistic option, try using [godot.PhysicalSkyMaterial] instead.
 *
 * The [godot.ProceduralSkyMaterial] supports up to 4 suns. Each sun takes its color, energy, and direction from the corresponding [godot.DirectionalLight3D] in the scene.
 */
@GodotBaseType
public open class ProceduralSkyMaterial : Material() {
  /**
   * Color of the sky at the top. Blends with [skyHorizonColor].
   */
  public var skyTopColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PROCEDURALSKYMATERIAL_GET_SKY_TOP_COLOR, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PROCEDURALSKYMATERIAL_SET_SKY_TOP_COLOR, NIL)
    }

  /**
   * Color of the sky at the horizon. Blends with [skyTopColor].
   */
  public var skyHorizonColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PROCEDURALSKYMATERIAL_GET_SKY_HORIZON_COLOR, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PROCEDURALSKYMATERIAL_SET_SKY_HORIZON_COLOR, NIL)
    }

  /**
   * How quickly the [skyHorizonColor] fades into the [skyTopColor].
   */
  public var skyCurve: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PROCEDURALSKYMATERIAL_GET_SKY_CURVE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PROCEDURALSKYMATERIAL_SET_SKY_CURVE, NIL)
    }

  /**
   * Multiplier for sky color. A higher value will make the sky brighter.
   */
  public var skyEnergyMultiplier: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PROCEDURALSKYMATERIAL_GET_SKY_ENERGY_MULTIPLIER, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PROCEDURALSKYMATERIAL_SET_SKY_ENERGY_MULTIPLIER, NIL)
    }

  /**
   * The sky cover texture to use. This texture must use an equirectangular projection (similar to [godot.PanoramaSkyMaterial]). The texture's colors will be *added* to the existing sky color, and will be multiplied by [skyEnergyMultiplier] and [skyCoverModulate]. This is mainly suited to displaying stars at night, but it can also be used to display clouds at day or night (with a non-physically-accurate look).
   */
  public var skyCover: Texture2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PROCEDURALSKYMATERIAL_GET_SKY_COVER, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PROCEDURALSKYMATERIAL_SET_SKY_COVER, NIL)
    }

  /**
   * The tint to apply to the [skyCover] texture. This can be used to change the sky cover's colors or opacity independently of the sky energy, which is useful for day/night or weather transitions. Only effective if a texture is defined in [skyCover].
   */
  public var skyCoverModulate: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PROCEDURALSKYMATERIAL_GET_SKY_COVER_MODULATE, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PROCEDURALSKYMATERIAL_SET_SKY_COVER_MODULATE, NIL)
    }

  /**
   * Color of the ground at the bottom. Blends with [groundHorizonColor].
   */
  public var groundBottomColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PROCEDURALSKYMATERIAL_GET_GROUND_BOTTOM_COLOR, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PROCEDURALSKYMATERIAL_SET_GROUND_BOTTOM_COLOR, NIL)
    }

  /**
   * Color of the ground at the horizon. Blends with [groundBottomColor].
   */
  public var groundHorizonColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PROCEDURALSKYMATERIAL_GET_GROUND_HORIZON_COLOR, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PROCEDURALSKYMATERIAL_SET_GROUND_HORIZON_COLOR, NIL)
    }

  /**
   * How quickly the [groundHorizonColor] fades into the [groundBottomColor].
   */
  public var groundCurve: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PROCEDURALSKYMATERIAL_GET_GROUND_CURVE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PROCEDURALSKYMATERIAL_SET_GROUND_CURVE, NIL)
    }

  /**
   * Multiplier for ground color. A higher value will make the ground brighter.
   */
  public var groundEnergyMultiplier: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PROCEDURALSKYMATERIAL_GET_GROUND_ENERGY_MULTIPLIER, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PROCEDURALSKYMATERIAL_SET_GROUND_ENERGY_MULTIPLIER, NIL)
    }

  /**
   * Distance from center of sun where it fades out completely.
   */
  public var sunAngleMax: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PROCEDURALSKYMATERIAL_GET_SUN_ANGLE_MAX, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PROCEDURALSKYMATERIAL_SET_SUN_ANGLE_MAX, NIL)
    }

  /**
   * How quickly the sun fades away between the edge of the sun disk and [sunAngleMax].
   */
  public var sunCurve: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PROCEDURALSKYMATERIAL_GET_SUN_CURVE, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PROCEDURALSKYMATERIAL_SET_SUN_CURVE, NIL)
    }

  /**
   * If `true`, enables debanding. Debanding adds a small amount of noise which helps reduce banding that appears from the smooth changes in color in the sky.
   */
  public var useDebanding: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PROCEDURALSKYMATERIAL_GET_USE_DEBANDING, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PROCEDURALSKYMATERIAL_SET_USE_DEBANDING, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PROCEDURALSKYMATERIAL, scriptIndex)
    return true
  }

  public companion object
}
