// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class FastNoiseLite : Noise() {
  public var noiseType: NoiseType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNoiseTypePtr, LONG)
      return FastNoiseLite.NoiseType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setNoiseTypePtr, NIL)
    }

  public var seed: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSeedPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setSeedPtr, NIL)
    }

  public var frequency: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFrequencyPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFrequencyPtr, NIL)
    }

  @CoreTypeLocalCopy
  public var offset: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOffsetPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOffsetPtr, NIL)
    }

  public var fractalType: FractalType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFractalTypePtr, LONG)
      return FastNoiseLite.FractalType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setFractalTypePtr, NIL)
    }

  public var fractalOctaves: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFractalOctavesPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setFractalOctavesPtr, NIL)
    }

  public var fractalLacunarity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFractalLacunarityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFractalLacunarityPtr, NIL)
    }

  public var fractalGain: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFractalGainPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFractalGainPtr, NIL)
    }

  public var fractalWeightedStrength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFractalWeightedStrengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFractalWeightedStrengthPtr, NIL)
    }

  public var fractalPingPongStrength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getFractalPingPongStrengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setFractalPingPongStrengthPtr, NIL)
    }

  public var cellularDistanceFunction: CellularDistanceFunction
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCellularDistanceFunctionPtr, LONG)
      return FastNoiseLite.CellularDistanceFunction.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setCellularDistanceFunctionPtr, NIL)
    }

  public var cellularJitter: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCellularJitterPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setCellularJitterPtr, NIL)
    }

  public var cellularReturnType: CellularReturnType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCellularReturnTypePtr, LONG)
      return FastNoiseLite.CellularReturnType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setCellularReturnTypePtr, NIL)
    }

  public var domainWarpEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDomainWarpEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDomainWarpEnabledPtr, NIL)
    }

  public var domainWarpType: DomainWarpType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDomainWarpTypePtr, LONG)
      return FastNoiseLite.DomainWarpType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDomainWarpTypePtr, NIL)
    }

  public var domainWarpAmplitude: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDomainWarpAmplitudePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDomainWarpAmplitudePtr, NIL)
    }

  public var domainWarpFrequency: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDomainWarpFrequencyPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDomainWarpFrequencyPtr, NIL)
    }

  public var domainWarpFractalType: DomainWarpFractalType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDomainWarpFractalTypePtr, LONG)
      return FastNoiseLite.DomainWarpFractalType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setDomainWarpFractalTypePtr, NIL)
    }

  public var domainWarpFractalOctaves: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDomainWarpFractalOctavesPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setDomainWarpFractalOctavesPtr, NIL)
    }

  public var domainWarpFractalLacunarity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDomainWarpFractalLacunarityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDomainWarpFractalLacunarityPtr, NIL)
    }

  public var domainWarpFractalGain: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDomainWarpFractalGainPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDomainWarpFractalGainPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_FASTNOISELITE, scriptIndex)
    return true
  }

  /**
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = fastnoiselite.offset
   * //Your changes
   * fastnoiselite.offset = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun offsetMutate(block: Vector3.() -> Unit): Vector3 = offset.apply{
      block(this)
      offset = this
  }


  public enum class NoiseType(
    id: Long,
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class FractalType(
    id: Long,
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class CellularDistanceFunction(
    id: Long,
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class CellularReturnType(
    id: Long,
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class DomainWarpType(
    id: Long,
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class DomainWarpFractalType(
    id: Long,
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setNoiseTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_noise_type")

    public val getNoiseTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_noise_type")

    public val setSeedPtr: VoidPtr = TypeManager.getMethodBindPtr("FastNoiseLite", "set_seed")

    public val getSeedPtr: VoidPtr = TypeManager.getMethodBindPtr("FastNoiseLite", "get_seed")

    public val setFrequencyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_frequency")

    public val getFrequencyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_frequency")

    public val setOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("FastNoiseLite", "set_offset")

    public val getOffsetPtr: VoidPtr = TypeManager.getMethodBindPtr("FastNoiseLite", "get_offset")

    public val setFractalTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_fractal_type")

    public val getFractalTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_fractal_type")

    public val setFractalOctavesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_fractal_octaves")

    public val getFractalOctavesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_fractal_octaves")

    public val setFractalLacunarityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_fractal_lacunarity")

    public val getFractalLacunarityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_fractal_lacunarity")

    public val setFractalGainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_fractal_gain")

    public val getFractalGainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_fractal_gain")

    public val setFractalWeightedStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_fractal_weighted_strength")

    public val getFractalWeightedStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_fractal_weighted_strength")

    public val setFractalPingPongStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_fractal_ping_pong_strength")

    public val getFractalPingPongStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_fractal_ping_pong_strength")

    public val setCellularDistanceFunctionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_cellular_distance_function")

    public val getCellularDistanceFunctionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_cellular_distance_function")

    public val setCellularJitterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_cellular_jitter")

    public val getCellularJitterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_cellular_jitter")

    public val setCellularReturnTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_cellular_return_type")

    public val getCellularReturnTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_cellular_return_type")

    public val setDomainWarpEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_domain_warp_enabled")

    public val isDomainWarpEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "is_domain_warp_enabled")

    public val setDomainWarpTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_domain_warp_type")

    public val getDomainWarpTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_domain_warp_type")

    public val setDomainWarpAmplitudePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_domain_warp_amplitude")

    public val getDomainWarpAmplitudePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_domain_warp_amplitude")

    public val setDomainWarpFrequencyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_domain_warp_frequency")

    public val getDomainWarpFrequencyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_domain_warp_frequency")

    public val setDomainWarpFractalTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_domain_warp_fractal_type")

    public val getDomainWarpFractalTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_domain_warp_fractal_type")

    public val setDomainWarpFractalOctavesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_domain_warp_fractal_octaves")

    public val getDomainWarpFractalOctavesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_domain_warp_fractal_octaves")

    public val setDomainWarpFractalLacunarityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_domain_warp_fractal_lacunarity")

    public val getDomainWarpFractalLacunarityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_domain_warp_fractal_lacunarity")

    public val setDomainWarpFractalGainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_domain_warp_fractal_gain")

    public val getDomainWarpFractalGainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_domain_warp_fractal_gain")
  }
}
