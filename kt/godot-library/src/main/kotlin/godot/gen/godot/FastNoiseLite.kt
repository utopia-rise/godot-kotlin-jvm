// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class FastNoiseLite : Noise() {
  public var noiseType: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_GET_NOISE_TYPE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_SET_NOISE_TYPE, NIL)
    }

  public var seed: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_GET_SEED, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_SET_SEED, NIL)
    }

  public var frequency: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_GET_FREQUENCY,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_SET_FREQUENCY, NIL)
    }

  public var in3dSpace: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_IS_IN_3D_SPACE,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_SET_IN_3D_SPACE,
          NIL)
    }

  public var offset: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_GET_OFFSET, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_SET_OFFSET, NIL)
    }

  public var colorRamp: Gradient?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_GET_COLOR_RAMP,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Gradient?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_SET_COLOR_RAMP, NIL)
    }

  public var fractalType: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_GET_FRACTAL_TYPE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_SET_FRACTAL_TYPE,
          NIL)
    }

  public var fractalOctaves: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_GET_FRACTAL_OCTAVES,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_SET_FRACTAL_OCTAVES,
          NIL)
    }

  public var fractalLacunarity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_GET_FRACTAL_LACUNARITY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_SET_FRACTAL_LACUNARITY, NIL)
    }

  public var fractalGain: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_GET_FRACTAL_GAIN,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_SET_FRACTAL_GAIN,
          NIL)
    }

  public var fractalWeightedStrength: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_GET_FRACTAL_WEIGHTED_STRENGTH, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_SET_FRACTAL_WEIGHTED_STRENGTH, NIL)
    }

  public var fractalPingPongStrength: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_GET_FRACTAL_PING_PONG_STRENGTH, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_SET_FRACTAL_PING_PONG_STRENGTH, NIL)
    }

  public var cellularDistanceFunction: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_GET_CELLULAR_DISTANCE_FUNCTION, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_SET_CELLULAR_DISTANCE_FUNCTION, NIL)
    }

  public var cellularJitter: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_GET_CELLULAR_JITTER,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_SET_CELLULAR_JITTER,
          NIL)
    }

  public var cellularReturnType: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_GET_CELLULAR_RETURN_TYPE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_SET_CELLULAR_RETURN_TYPE, NIL)
    }

  public var domainWarpEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_IS_DOMAIN_WARP_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_SET_DOMAIN_WARP_ENABLED, NIL)
    }

  public var domainWarpType: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_GET_DOMAIN_WARP_TYPE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_SET_DOMAIN_WARP_TYPE, NIL)
    }

  public var domainWarpAmplitude: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_GET_DOMAIN_WARP_AMPLITUDE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_SET_DOMAIN_WARP_AMPLITUDE, NIL)
    }

  public var domainWarpFrequency: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_GET_DOMAIN_WARP_FREQUENCY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_SET_DOMAIN_WARP_FREQUENCY, NIL)
    }

  public var domainWarpFractalType: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_GET_DOMAIN_WARP_FRACTAL_TYPE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_SET_DOMAIN_WARP_FRACTAL_TYPE, NIL)
    }

  public var domainWarpFractalOctaves: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_GET_DOMAIN_WARP_FRACTAL_OCTAVES, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_SET_DOMAIN_WARP_FRACTAL_OCTAVES, NIL)
    }

  public var domainWarpFractalLacunarity: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_GET_DOMAIN_WARP_FRACTAL_LACUNARITY, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_SET_DOMAIN_WARP_FRACTAL_LACUNARITY, NIL)
    }

  public var domainWarpFractalGain: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_GET_DOMAIN_WARP_FRACTAL_GAIN, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FASTNOISELITE_SET_DOMAIN_WARP_FRACTAL_GAIN, NIL)
    }

  public override fun __new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_FASTNOISELITE, scriptIndex)
  }

  public enum class DomainWarpType(
    id: Long
  ) {
    DOMAIN_WARP_SIMPLEX(0),
    DOMAIN_WARP_SIMPLEX_REDUCED(1),
    DOMAIN_WARP_BASIC_GRID(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class CellularDistanceFunction(
    id: Long
  ) {
    DISTANCE_EUCLIDEAN(0),
    DISTANCE_EUCLIDEAN_SQUARED(1),
    DISTANCE_MANHATTAN(2),
    DISTANCE_HYBRID(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class CellularReturnType(
    id: Long
  ) {
    RETURN_CELL_VALUE(0),
    RETURN_DISTANCE(1),
    RETURN_DISTANCE2(2),
    RETURN_DISTANCE2_ADD(3),
    RETURN_DISTANCE2_SUB(4),
    RETURN_DISTANCE2_MUL(5),
    RETURN_DISTANCE2_DIV(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class FractalType(
    id: Long
  ) {
    FRACTAL_NONE(0),
    FRACTAL_FBM(1),
    FRACTAL_RIDGED(2),
    FRACTAL_PING_PONG(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class NoiseType(
    id: Long
  ) {
    TYPE_VALUE(5),
    TYPE_VALUE_CUBIC(4),
    TYPE_PERLIN(3),
    TYPE_CELLULAR(2),
    TYPE_SIMPLEX(0),
    TYPE_SIMPLEX_SMOOTH(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class DomainWarpFractalType(
    id: Long
  ) {
    DOMAIN_WARP_FRACTAL_NONE(0),
    DOMAIN_WARP_FRACTAL_PROGRESSIVE(1),
    DOMAIN_WARP_FRACTAL_INDEPENDENT(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
