// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.TransferContext
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Type of [godot.Sky] that is generated procedurally based on user input parameters.
 *
 * ProceduralSky provides a way to create an effective background quickly by defining procedural parameters for the sun, the sky and the ground. The sky and ground are very similar, they are defined by a color at the horizon, another color, and finally an easing curve to interpolate between these two colors. Similarly, the sun is described by a position in the sky, a color, and an easing curve. However, the sun also defines a minimum and maximum angle, these two values define at what distance the easing curve begins and ends from the sun, and thus end up defining the size of the sun in the sky.
 *
 * The ProceduralSky is updated on the CPU after the parameters change. It is stored in a texture and then displayed as a background in the scene. This makes it relatively unsuitable for real-time updates during gameplay. However, with a small enough texture size, it can still be updated relatively frequently, as it is updated on a background thread when multi-threading is available.
 */
@GodotBaseType
public open class ProceduralSky : Sky() {
  /**
   * Color of the ground at the bottom.
   */
  public open var groundBottomColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_GET_GROUND_BOTTOM_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_SET_GROUND_BOTTOM_COLOR, NIL)
    }

  /**
   * How quickly the [groundHorizonColor] fades into the [groundBottomColor].
   */
  public open var groundCurve: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_GET_GROUND_CURVE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_SET_GROUND_CURVE,
          NIL)
    }

  /**
   * Amount of energy contribution from the ground.
   */
  public open var groundEnergy: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_GET_GROUND_ENERGY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_SET_GROUND_ENERGY,
          NIL)
    }

  /**
   * Color of the ground at the horizon.
   */
  public open var groundHorizonColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_GET_GROUND_HORIZON_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_SET_GROUND_HORIZON_COLOR, NIL)
    }

  /**
   * How quickly the [skyHorizonColor] fades into the [skyTopColor].
   */
  public open var skyCurve: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_GET_SKY_CURVE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_SET_SKY_CURVE, NIL)
    }

  /**
   * Amount of energy contribution from the sky.
   */
  public open var skyEnergy: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_GET_SKY_ENERGY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_SET_SKY_ENERGY, NIL)
    }

  /**
   * Color of the sky at the horizon.
   */
  public open var skyHorizonColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_GET_SKY_HORIZON_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_SET_SKY_HORIZON_COLOR, NIL)
    }

  /**
   * Color of the sky at the top.
   */
  public open var skyTopColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_GET_SKY_TOP_COLOR,
          COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_SET_SKY_TOP_COLOR,
          NIL)
    }

  /**
   * Distance from center of sun where it fades out completely.
   */
  public open var sunAngleMax: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_GET_SUN_ANGLE_MAX,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_SET_SUN_ANGLE_MAX,
          NIL)
    }

  /**
   * Distance from sun where it goes from solid to starting to fade.
   */
  public open var sunAngleMin: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_GET_SUN_ANGLE_MIN,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_SET_SUN_ANGLE_MIN,
          NIL)
    }

  /**
   * The sun's color.
   */
  public open var sunColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_GET_SUN_COLOR,
          COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_SET_SUN_COLOR, NIL)
    }

  /**
   * How quickly the sun fades away between [sunAngleMin] and [sunAngleMax].
   */
  public open var sunCurve: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_GET_SUN_CURVE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_SET_SUN_CURVE, NIL)
    }

  /**
   * Amount of energy contribution from the sun.
   */
  public open var sunEnergy: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_GET_SUN_ENERGY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_SET_SUN_ENERGY, NIL)
    }

  /**
   * The sun's height using polar coordinates.
   */
  public open var sunLatitude: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_GET_SUN_LATITUDE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_SET_SUN_LATITUDE,
          NIL)
    }

  /**
   * The direction of the sun using polar coordinates.
   */
  public open var sunLongitude: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_GET_SUN_LONGITUDE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_SET_SUN_LONGITUDE,
          NIL)
    }

  /**
   * Size of [godot.Texture] that the ProceduralSky will generate. The size is set using [enum TextureSize].
   */
  public open var textureSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_GET_TEXTURE_SIZE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PROCEDURALSKY_SET_TEXTURE_SIZE,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_PROCEDURALSKY)
  }

  @CoreTypeHelper
  public open fun groundBottomColor(schedule: Color.() -> Unit): Color = groundBottomColor.apply{
      schedule(this)
      groundBottomColor = this
  }


  @CoreTypeHelper
  public open fun groundHorizonColor(schedule: Color.() -> Unit): Color = groundHorizonColor.apply{
      schedule(this)
      groundHorizonColor = this
  }


  @CoreTypeHelper
  public open fun skyHorizonColor(schedule: Color.() -> Unit): Color = skyHorizonColor.apply{
      schedule(this)
      skyHorizonColor = this
  }


  @CoreTypeHelper
  public open fun skyTopColor(schedule: Color.() -> Unit): Color = skyTopColor.apply{
      schedule(this)
      skyTopColor = this
  }


  @CoreTypeHelper
  public open fun sunColor(schedule: Color.() -> Unit): Color = sunColor.apply{
      schedule(this)
      sunColor = this
  }


  public open fun _threadDone(image: Image): Unit {
  }

  public open fun _updateSky(): Unit {
  }

  public enum class TextureSize(
    id: Long
  ) {
    /**
     * Sky texture will be 256x128.
     */
    TEXTURE_SIZE_256(0),
    /**
     * Sky texture will be 512x256.
     */
    TEXTURE_SIZE_512(1),
    /**
     * Sky texture will be 1024x512. This is the default size.
     */
    TEXTURE_SIZE_1024(2),
    /**
     * Sky texture will be 2048x1024.
     */
    TEXTURE_SIZE_2048(3),
    /**
     * Sky texture will be 4096x2048.
     */
    TEXTURE_SIZE_4096(4),
    /**
     * Represents the size of the [enum TextureSize] enum.
     */
    TEXTURE_SIZE_MAX(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Sky texture will be 1024x512. This is the default size.
     */
    public final const val TEXTURE_SIZE_1024: Long = 2

    /**
     * Sky texture will be 2048x1024.
     */
    public final const val TEXTURE_SIZE_2048: Long = 3

    /**
     * Sky texture will be 256x128.
     */
    public final const val TEXTURE_SIZE_256: Long = 0

    /**
     * Sky texture will be 4096x2048.
     */
    public final const val TEXTURE_SIZE_4096: Long = 4

    /**
     * Sky texture will be 512x256.
     */
    public final const val TEXTURE_SIZE_512: Long = 1

    /**
     * Represents the size of the [enum TextureSize] enum.
     */
    public final const val TEXTURE_SIZE_MAX: Long = 5
  }
}
