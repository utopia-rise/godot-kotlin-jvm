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
import kotlin.jvm.JvmName

/**
 * This class generates noise using the FastNoiseLite library, which is a collection of several
 * noise algorithms including Cellular, Perlin, Value, and more.
 * Most generated noise values are in the range of `[-1, 1]`, but not always. Some of the cellular
 * noise algorithms return results above `1`.
 */
@GodotBaseType
public open class FastNoiseLite : Noise() {
  /**
   * The noise algorithm used. See [NoiseType].
   */
  public var noiseType: NoiseType
    @JvmName("noiseTypeProperty")
    get() = getNoiseType()
    @JvmName("noiseTypeProperty")
    set(`value`) {
      setNoiseType(value)
    }

  /**
   * The random number seed for all noise types.
   */
  public var seed: Int
    @JvmName("seedProperty")
    get() = getSeed()
    @JvmName("seedProperty")
    set(`value`) {
      setSeed(value)
    }

  /**
   * The frequency for all noise types. Low frequency results in smooth noise while high frequency
   * results in rougher, more granular noise.
   */
  public var frequency: Float
    @JvmName("frequencyProperty")
    get() = getFrequency()
    @JvmName("frequencyProperty")
    set(`value`) {
      setFrequency(value)
    }

  /**
   * Translate the noise input coordinates by the given [Vector3].
   */
  @CoreTypeLocalCopy
  public var offset: Vector3
    @JvmName("offsetProperty")
    get() = getOffset()
    @JvmName("offsetProperty")
    set(`value`) {
      setOffset(value)
    }

  /**
   * The method for combining octaves into a fractal. See [FractalType].
   */
  public var fractalType: FractalType
    @JvmName("fractalTypeProperty")
    get() = getFractalType()
    @JvmName("fractalTypeProperty")
    set(`value`) {
      setFractalType(value)
    }

  /**
   * The number of noise layers that are sampled to get the final value for fractal noise types.
   */
  public var fractalOctaves: Int
    @JvmName("fractalOctavesProperty")
    get() = getFractalOctaves()
    @JvmName("fractalOctavesProperty")
    set(`value`) {
      setFractalOctaves(value)
    }

  /**
   * Frequency multiplier between subsequent octaves. Increasing this value results in higher
   * octaves producing noise with finer details and a rougher appearance.
   */
  public var fractalLacunarity: Float
    @JvmName("fractalLacunarityProperty")
    get() = getFractalLacunarity()
    @JvmName("fractalLacunarityProperty")
    set(`value`) {
      setFractalLacunarity(value)
    }

  /**
   * Determines the strength of each subsequent layer of noise in fractal noise.
   * A low value places more emphasis on the lower frequency base layers, while a high value puts
   * more emphasis on the higher frequency layers.
   */
  public var fractalGain: Float
    @JvmName("fractalGainProperty")
    get() = getFractalGain()
    @JvmName("fractalGainProperty")
    set(`value`) {
      setFractalGain(value)
    }

  /**
   * Higher weighting means higher octaves have less impact if lower octaves have a large impact.
   */
  public var fractalWeightedStrength: Float
    @JvmName("fractalWeightedStrengthProperty")
    get() = getFractalWeightedStrength()
    @JvmName("fractalWeightedStrengthProperty")
    set(`value`) {
      setFractalWeightedStrength(value)
    }

  /**
   * Sets the strength of the fractal ping pong type.
   */
  public var fractalPingPongStrength: Float
    @JvmName("fractalPingPongStrengthProperty")
    get() = getFractalPingPongStrength()
    @JvmName("fractalPingPongStrengthProperty")
    set(`value`) {
      setFractalPingPongStrength(value)
    }

  /**
   * Determines how the distance to the nearest/second-nearest point is computed. See
   * [CellularDistanceFunction] for options.
   */
  public var cellularDistanceFunction: CellularDistanceFunction
    @JvmName("cellularDistanceFunctionProperty")
    get() = getCellularDistanceFunction()
    @JvmName("cellularDistanceFunctionProperty")
    set(`value`) {
      setCellularDistanceFunction(value)
    }

  /**
   * Maximum distance a point can move off of its grid position. Set to `0` for an even grid.
   */
  public var cellularJitter: Float
    @JvmName("cellularJitterProperty")
    get() = getCellularJitter()
    @JvmName("cellularJitterProperty")
    set(`value`) {
      setCellularJitter(value)
    }

  /**
   * Return type from cellular noise calculations. See [CellularReturnType].
   */
  public var cellularReturnType: CellularReturnType
    @JvmName("cellularReturnTypeProperty")
    get() = getCellularReturnType()
    @JvmName("cellularReturnTypeProperty")
    set(`value`) {
      setCellularReturnType(value)
    }

  /**
   * If enabled, another FastNoiseLite instance is used to warp the space, resulting in a distortion
   * of the noise.
   */
  public var domainWarpEnabled: Boolean
    @JvmName("domainWarpEnabledProperty")
    get() = isDomainWarpEnabled()
    @JvmName("domainWarpEnabledProperty")
    set(`value`) {
      setDomainWarpEnabled(value)
    }

  /**
   * Sets the warp algorithm. See [DomainWarpType].
   */
  public var domainWarpType: DomainWarpType
    @JvmName("domainWarpTypeProperty")
    get() = getDomainWarpType()
    @JvmName("domainWarpTypeProperty")
    set(`value`) {
      setDomainWarpType(value)
    }

  /**
   * Sets the maximum warp distance from the origin.
   */
  public var domainWarpAmplitude: Float
    @JvmName("domainWarpAmplitudeProperty")
    get() = getDomainWarpAmplitude()
    @JvmName("domainWarpAmplitudeProperty")
    set(`value`) {
      setDomainWarpAmplitude(value)
    }

  /**
   * Frequency of the noise which warps the space. Low frequency results in smooth noise while high
   * frequency results in rougher, more granular noise.
   */
  public var domainWarpFrequency: Float
    @JvmName("domainWarpFrequencyProperty")
    get() = getDomainWarpFrequency()
    @JvmName("domainWarpFrequencyProperty")
    set(`value`) {
      setDomainWarpFrequency(value)
    }

  /**
   * The method for combining octaves into a fractal which is used to warp the space. See
   * [DomainWarpFractalType].
   */
  public var domainWarpFractalType: DomainWarpFractalType
    @JvmName("domainWarpFractalTypeProperty")
    get() = getDomainWarpFractalType()
    @JvmName("domainWarpFractalTypeProperty")
    set(`value`) {
      setDomainWarpFractalType(value)
    }

  /**
   * The number of noise layers that are sampled to get the final value for the fractal noise which
   * warps the space.
   */
  public var domainWarpFractalOctaves: Int
    @JvmName("domainWarpFractalOctavesProperty")
    get() = getDomainWarpFractalOctaves()
    @JvmName("domainWarpFractalOctavesProperty")
    set(`value`) {
      setDomainWarpFractalOctaves(value)
    }

  /**
   * Octave lacunarity of the fractal noise which warps the space. Increasing this value results in
   * higher octaves producing noise with finer details and a rougher appearance.
   */
  public var domainWarpFractalLacunarity: Float
    @JvmName("domainWarpFractalLacunarityProperty")
    get() = getDomainWarpFractalLacunarity()
    @JvmName("domainWarpFractalLacunarityProperty")
    set(`value`) {
      setDomainWarpFractalLacunarity(value)
    }

  /**
   * Determines the strength of each subsequent layer of the noise which is used to warp the space.
   * A low value places more emphasis on the lower frequency base layers, while a high value puts
   * more emphasis on the higher frequency layers.
   */
  public var domainWarpFractalGain: Float
    @JvmName("domainWarpFractalGainProperty")
    get() = getDomainWarpFractalGain()
    @JvmName("domainWarpFractalGainProperty")
    set(`value`) {
      setDomainWarpFractalGain(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_FASTNOISELITE, scriptIndex)
  }

  /**
   * Translate the noise input coordinates by the given [Vector3].
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


  public fun setNoiseType(type: NoiseType): Unit {
    TransferContext.writeArguments(LONG to type.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setNoiseTypePtr, NIL)
  }

  public fun getNoiseType(): NoiseType {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNoiseTypePtr, LONG)
    return FastNoiseLite.NoiseType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setSeed(seed: Int): Unit {
    TransferContext.writeArguments(LONG to seed.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setSeedPtr, NIL)
  }

  public fun getSeed(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getSeedPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setFrequency(freq: Float): Unit {
    TransferContext.writeArguments(DOUBLE to freq.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setFrequencyPtr, NIL)
  }

  public fun getFrequency(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFrequencyPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setOffset(offset: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to offset)
    TransferContext.callMethod(rawPtr, MethodBindings.setOffsetPtr, NIL)
  }

  public fun getOffset(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOffsetPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  public fun setFractalType(type: FractalType): Unit {
    TransferContext.writeArguments(LONG to type.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setFractalTypePtr, NIL)
  }

  public fun getFractalType(): FractalType {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFractalTypePtr, LONG)
    return FastNoiseLite.FractalType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setFractalOctaves(octaveCount: Int): Unit {
    TransferContext.writeArguments(LONG to octaveCount.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setFractalOctavesPtr, NIL)
  }

  public fun getFractalOctaves(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFractalOctavesPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setFractalLacunarity(lacunarity: Float): Unit {
    TransferContext.writeArguments(DOUBLE to lacunarity.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setFractalLacunarityPtr, NIL)
  }

  public fun getFractalLacunarity(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFractalLacunarityPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setFractalGain(gain: Float): Unit {
    TransferContext.writeArguments(DOUBLE to gain.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setFractalGainPtr, NIL)
  }

  public fun getFractalGain(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFractalGainPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setFractalWeightedStrength(weightedStrength: Float): Unit {
    TransferContext.writeArguments(DOUBLE to weightedStrength.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setFractalWeightedStrengthPtr, NIL)
  }

  public fun getFractalWeightedStrength(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFractalWeightedStrengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setFractalPingPongStrength(pingPongStrength: Float): Unit {
    TransferContext.writeArguments(DOUBLE to pingPongStrength.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setFractalPingPongStrengthPtr, NIL)
  }

  public fun getFractalPingPongStrength(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFractalPingPongStrengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setCellularDistanceFunction(func: CellularDistanceFunction): Unit {
    TransferContext.writeArguments(LONG to func.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setCellularDistanceFunctionPtr, NIL)
  }

  public fun getCellularDistanceFunction(): CellularDistanceFunction {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCellularDistanceFunctionPtr, LONG)
    return FastNoiseLite.CellularDistanceFunction.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setCellularJitter(jitter: Float): Unit {
    TransferContext.writeArguments(DOUBLE to jitter.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setCellularJitterPtr, NIL)
  }

  public fun getCellularJitter(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCellularJitterPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setCellularReturnType(ret: CellularReturnType): Unit {
    TransferContext.writeArguments(LONG to ret.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setCellularReturnTypePtr, NIL)
  }

  public fun getCellularReturnType(): CellularReturnType {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCellularReturnTypePtr, LONG)
    return FastNoiseLite.CellularReturnType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setDomainWarpEnabled(domainWarpEnabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to domainWarpEnabled)
    TransferContext.callMethod(rawPtr, MethodBindings.setDomainWarpEnabledPtr, NIL)
  }

  public fun isDomainWarpEnabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isDomainWarpEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public fun setDomainWarpType(domainWarpType: DomainWarpType): Unit {
    TransferContext.writeArguments(LONG to domainWarpType.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setDomainWarpTypePtr, NIL)
  }

  public fun getDomainWarpType(): DomainWarpType {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDomainWarpTypePtr, LONG)
    return FastNoiseLite.DomainWarpType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setDomainWarpAmplitude(domainWarpAmplitude: Float): Unit {
    TransferContext.writeArguments(DOUBLE to domainWarpAmplitude.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setDomainWarpAmplitudePtr, NIL)
  }

  public fun getDomainWarpAmplitude(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDomainWarpAmplitudePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setDomainWarpFrequency(domainWarpFrequency: Float): Unit {
    TransferContext.writeArguments(DOUBLE to domainWarpFrequency.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setDomainWarpFrequencyPtr, NIL)
  }

  public fun getDomainWarpFrequency(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDomainWarpFrequencyPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setDomainWarpFractalType(domainWarpFractalType: DomainWarpFractalType): Unit {
    TransferContext.writeArguments(LONG to domainWarpFractalType.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setDomainWarpFractalTypePtr, NIL)
  }

  public fun getDomainWarpFractalType(): DomainWarpFractalType {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDomainWarpFractalTypePtr, LONG)
    return FastNoiseLite.DomainWarpFractalType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public fun setDomainWarpFractalOctaves(domainWarpOctaveCount: Int): Unit {
    TransferContext.writeArguments(LONG to domainWarpOctaveCount.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setDomainWarpFractalOctavesPtr, NIL)
  }

  public fun getDomainWarpFractalOctaves(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDomainWarpFractalOctavesPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun setDomainWarpFractalLacunarity(domainWarpLacunarity: Float): Unit {
    TransferContext.writeArguments(DOUBLE to domainWarpLacunarity.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setDomainWarpFractalLacunarityPtr, NIL)
  }

  public fun getDomainWarpFractalLacunarity(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDomainWarpFractalLacunarityPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public fun setDomainWarpFractalGain(domainWarpGain: Float): Unit {
    TransferContext.writeArguments(DOUBLE to domainWarpGain.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setDomainWarpFractalGainPtr, NIL)
  }

  public fun getDomainWarpFractalGain(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDomainWarpFractalGainPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public enum class NoiseType(
    id: Long,
  ) {
    /**
     * A lattice of points are assigned random values then interpolated based on neighboring values.
     */
    TYPE_VALUE(5),
    /**
     * Similar to Value noise, but slower. Has more variance in peaks and valleys.
     * Cubic noise can be used to avoid certain artifacts when using value noise to create a
     * bumpmap. In general, you should always use this mode if the value noise is being used for a
     * heightmap or bumpmap.
     */
    TYPE_VALUE_CUBIC(4),
    /**
     * A lattice of random gradients. Their dot products are interpolated to obtain values in
     * between the lattices.
     */
    TYPE_PERLIN(3),
    /**
     * Cellular includes both Worley noise and Voronoi diagrams which creates various regions of the
     * same value.
     */
    TYPE_CELLULAR(2),
    /**
     * As opposed to [TYPE_PERLIN], gradients exist in a simplex lattice rather than a grid lattice,
     * avoiding directional artifacts.
     */
    TYPE_SIMPLEX(0),
    /**
     * Modified, higher quality version of [TYPE_SIMPLEX], but slower.
     */
    TYPE_SIMPLEX_SMOOTH(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): NoiseType = entries.single { it.id == `value` }
    }
  }

  public enum class FractalType(
    id: Long,
  ) {
    /**
     * No fractal noise.
     */
    FRACTAL_NONE(0),
    /**
     * Method using Fractional Brownian Motion to combine octaves into a fractal.
     */
    FRACTAL_FBM(1),
    /**
     * Method of combining octaves into a fractal resulting in a "ridged" look.
     */
    FRACTAL_RIDGED(2),
    /**
     * Method of combining octaves into a fractal with a ping pong effect.
     */
    FRACTAL_PING_PONG(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): FractalType = entries.single { it.id == `value` }
    }
  }

  public enum class CellularDistanceFunction(
    id: Long,
  ) {
    /**
     * Euclidean distance to the nearest point.
     */
    DISTANCE_EUCLIDEAN(0),
    /**
     * Squared Euclidean distance to the nearest point.
     */
    DISTANCE_EUCLIDEAN_SQUARED(1),
    /**
     * Manhattan distance (taxicab metric) to the nearest point.
     */
    DISTANCE_MANHATTAN(2),
    /**
     * Blend of [DISTANCE_EUCLIDEAN] and [DISTANCE_MANHATTAN] to give curved cell boundaries
     */
    DISTANCE_HYBRID(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CellularDistanceFunction = entries.single { it.id == `value` }
    }
  }

  public enum class CellularReturnType(
    id: Long,
  ) {
    /**
     * The cellular distance function will return the same value for all points within a cell.
     */
    RETURN_CELL_VALUE(0),
    /**
     * The cellular distance function will return a value determined by the distance to the nearest
     * point.
     */
    RETURN_DISTANCE(1),
    /**
     * The cellular distance function returns the distance to the second-nearest point.
     */
    RETURN_DISTANCE2(2),
    /**
     * The distance to the nearest point is added to the distance to the second-nearest point.
     */
    RETURN_DISTANCE2_ADD(3),
    /**
     * The distance to the nearest point is subtracted from the distance to the second-nearest
     * point.
     */
    RETURN_DISTANCE2_SUB(4),
    /**
     * The distance to the nearest point is multiplied with the distance to the second-nearest
     * point.
     */
    RETURN_DISTANCE2_MUL(5),
    /**
     * The distance to the nearest point is divided by the distance to the second-nearest point.
     */
    RETURN_DISTANCE2_DIV(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): CellularReturnType = entries.single { it.id == `value` }
    }
  }

  public enum class DomainWarpType(
    id: Long,
  ) {
    /**
     * The domain is warped using the simplex noise algorithm.
     */
    DOMAIN_WARP_SIMPLEX(0),
    /**
     * The domain is warped using a simplified version of the simplex noise algorithm.
     */
    DOMAIN_WARP_SIMPLEX_REDUCED(1),
    /**
     * The domain is warped using a simple noise grid (not as smooth as the other methods, but more
     * performant).
     */
    DOMAIN_WARP_BASIC_GRID(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DomainWarpType = entries.single { it.id == `value` }
    }
  }

  public enum class DomainWarpFractalType(
    id: Long,
  ) {
    /**
     * No fractal noise for warping the space.
     */
    DOMAIN_WARP_FRACTAL_NONE(0),
    /**
     * Warping the space progressively, octave for octave, resulting in a more "liquified"
     * distortion.
     */
    DOMAIN_WARP_FRACTAL_PROGRESSIVE(1),
    /**
     * Warping the space independently for each octave, resulting in a more chaotic distortion.
     */
    DOMAIN_WARP_FRACTAL_INDEPENDENT(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DomainWarpFractalType = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setNoiseTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_noise_type", 2624461392)

    public val getNoiseTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_noise_type", 1458108610)

    public val setSeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_seed", 1286410249)

    public val getSeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_seed", 3905245786)

    public val setFrequencyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_frequency", 373806689)

    public val getFrequencyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_frequency", 1740695150)

    public val setOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_offset", 3460891852)

    public val getOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_offset", 3360562783)

    public val setFractalTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_fractal_type", 4132731174)

    public val getFractalTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_fractal_type", 1036889279)

    public val setFractalOctavesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_fractal_octaves", 1286410249)

    public val getFractalOctavesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_fractal_octaves", 3905245786)

    public val setFractalLacunarityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_fractal_lacunarity", 373806689)

    public val getFractalLacunarityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_fractal_lacunarity", 1740695150)

    public val setFractalGainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_fractal_gain", 373806689)

    public val getFractalGainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_fractal_gain", 1740695150)

    public val setFractalWeightedStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_fractal_weighted_strength", 373806689)

    public val getFractalWeightedStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_fractal_weighted_strength", 1740695150)

    public val setFractalPingPongStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_fractal_ping_pong_strength", 373806689)

    public val getFractalPingPongStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_fractal_ping_pong_strength", 1740695150)

    public val setCellularDistanceFunctionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_cellular_distance_function", 1006013267)

    public val getCellularDistanceFunctionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_cellular_distance_function", 2021274088)

    public val setCellularJitterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_cellular_jitter", 373806689)

    public val getCellularJitterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_cellular_jitter", 1740695150)

    public val setCellularReturnTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_cellular_return_type", 2654169698)

    public val getCellularReturnTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_cellular_return_type", 3699796343)

    public val setDomainWarpEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_domain_warp_enabled", 2586408642)

    public val isDomainWarpEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "is_domain_warp_enabled", 36873697)

    public val setDomainWarpTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_domain_warp_type", 3629692980)

    public val getDomainWarpTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_domain_warp_type", 2980162020)

    public val setDomainWarpAmplitudePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_domain_warp_amplitude", 373806689)

    public val getDomainWarpAmplitudePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_domain_warp_amplitude", 1740695150)

    public val setDomainWarpFrequencyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_domain_warp_frequency", 373806689)

    public val getDomainWarpFrequencyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_domain_warp_frequency", 1740695150)

    public val setDomainWarpFractalTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_domain_warp_fractal_type", 3999408287)

    public val getDomainWarpFractalTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_domain_warp_fractal_type", 407716934)

    public val setDomainWarpFractalOctavesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_domain_warp_fractal_octaves", 1286410249)

    public val getDomainWarpFractalOctavesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_domain_warp_fractal_octaves", 3905245786)

    public val setDomainWarpFractalLacunarityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_domain_warp_fractal_lacunarity", 373806689)

    public val getDomainWarpFractalLacunarityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_domain_warp_fractal_lacunarity", 1740695150)

    public val setDomainWarpFractalGainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_domain_warp_fractal_gain", 373806689)

    public val getDomainWarpFractalGainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_domain_warp_fractal_gain", 1740695150)
  }
}
