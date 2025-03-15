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
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.VECTOR3
import godot.core.Vector3
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
  public final inline var noiseType: NoiseType
    @JvmName("noiseTypeProperty")
    get() = getNoiseType()
    @JvmName("noiseTypeProperty")
    set(`value`) {
      setNoiseType(value)
    }

  /**
   * The random number seed for all noise types.
   */
  public final inline var seed: Int
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
  public final inline var frequency: Float
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
  public final inline var offset: Vector3
    @JvmName("offsetProperty")
    get() = getOffset()
    @JvmName("offsetProperty")
    set(`value`) {
      setOffset(value)
    }

  /**
   * The method for combining octaves into a fractal. See [FractalType].
   */
  public final inline var fractalType: FractalType
    @JvmName("fractalTypeProperty")
    get() = getFractalType()
    @JvmName("fractalTypeProperty")
    set(`value`) {
      setFractalType(value)
    }

  /**
   * The number of noise layers that are sampled to get the final value for fractal noise types.
   */
  public final inline var fractalOctaves: Int
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
  public final inline var fractalLacunarity: Float
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
  public final inline var fractalGain: Float
    @JvmName("fractalGainProperty")
    get() = getFractalGain()
    @JvmName("fractalGainProperty")
    set(`value`) {
      setFractalGain(value)
    }

  /**
   * Higher weighting means higher octaves have less impact if lower octaves have a large impact.
   */
  public final inline var fractalWeightedStrength: Float
    @JvmName("fractalWeightedStrengthProperty")
    get() = getFractalWeightedStrength()
    @JvmName("fractalWeightedStrengthProperty")
    set(`value`) {
      setFractalWeightedStrength(value)
    }

  /**
   * Sets the strength of the fractal ping pong type.
   */
  public final inline var fractalPingPongStrength: Float
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
  public final inline var cellularDistanceFunction: CellularDistanceFunction
    @JvmName("cellularDistanceFunctionProperty")
    get() = getCellularDistanceFunction()
    @JvmName("cellularDistanceFunctionProperty")
    set(`value`) {
      setCellularDistanceFunction(value)
    }

  /**
   * Maximum distance a point can move off of its grid position. Set to `0` for an even grid.
   */
  public final inline var cellularJitter: Float
    @JvmName("cellularJitterProperty")
    get() = getCellularJitter()
    @JvmName("cellularJitterProperty")
    set(`value`) {
      setCellularJitter(value)
    }

  /**
   * Return type from cellular noise calculations. See [CellularReturnType].
   */
  public final inline var cellularReturnType: CellularReturnType
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
  public final inline var domainWarpEnabled: Boolean
    @JvmName("domainWarpEnabledProperty")
    get() = isDomainWarpEnabled()
    @JvmName("domainWarpEnabledProperty")
    set(`value`) {
      setDomainWarpEnabled(value)
    }

  /**
   * Sets the warp algorithm. See [DomainWarpType].
   */
  public final inline var domainWarpType: DomainWarpType
    @JvmName("domainWarpTypeProperty")
    get() = getDomainWarpType()
    @JvmName("domainWarpTypeProperty")
    set(`value`) {
      setDomainWarpType(value)
    }

  /**
   * Sets the maximum warp distance from the origin.
   */
  public final inline var domainWarpAmplitude: Float
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
  public final inline var domainWarpFrequency: Float
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
  public final inline var domainWarpFractalType: DomainWarpFractalType
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
  public final inline var domainWarpFractalOctaves: Int
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
  public final inline var domainWarpFractalLacunarity: Float
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
  public final inline var domainWarpFractalGain: Float
    @JvmName("domainWarpFractalGainProperty")
    get() = getDomainWarpFractalGain()
    @JvmName("domainWarpFractalGainProperty")
    set(`value`) {
      setDomainWarpFractalGain(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(211, scriptIndex)
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
  public final fun offsetMutate(block: Vector3.() -> Unit): Vector3 = offset.apply{
      block(this)
      offset = this
  }


  public final fun setNoiseType(type: NoiseType): Unit {
    TransferContext.writeArguments(LONG to type.id)
    TransferContext.callMethod(ptr, MethodBindings.setNoiseTypePtr, NIL)
  }

  public final fun getNoiseType(): NoiseType {
    TransferContext.callMethod(ptr, MethodBindings.getNoiseTypePtr, LONG)
    return FastNoiseLite.NoiseType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setSeed(seed: Int): Unit {
    TransferContext.writeArguments(LONG to seed.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setSeedPtr, NIL)
  }

  public final fun getSeed(): Int {
    TransferContext.callMethod(ptr, MethodBindings.getSeedPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setFrequency(freq: Float): Unit {
    TransferContext.writeArguments(DOUBLE to freq.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setFrequencyPtr, NIL)
  }

  public final fun getFrequency(): Float {
    TransferContext.callMethod(ptr, MethodBindings.getFrequencyPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setOffset(offset: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to offset)
    TransferContext.callMethod(ptr, MethodBindings.setOffsetPtr, NIL)
  }

  public final fun getOffset(): Vector3 {
    TransferContext.callMethod(ptr, MethodBindings.getOffsetPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public final fun setFractalType(type: FractalType): Unit {
    TransferContext.writeArguments(LONG to type.id)
    TransferContext.callMethod(ptr, MethodBindings.setFractalTypePtr, NIL)
  }

  public final fun getFractalType(): FractalType {
    TransferContext.callMethod(ptr, MethodBindings.getFractalTypePtr, LONG)
    return FastNoiseLite.FractalType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setFractalOctaves(octaveCount: Int): Unit {
    TransferContext.writeArguments(LONG to octaveCount.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setFractalOctavesPtr, NIL)
  }

  public final fun getFractalOctaves(): Int {
    TransferContext.callMethod(ptr, MethodBindings.getFractalOctavesPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setFractalLacunarity(lacunarity: Float): Unit {
    TransferContext.writeArguments(DOUBLE to lacunarity.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setFractalLacunarityPtr, NIL)
  }

  public final fun getFractalLacunarity(): Float {
    TransferContext.callMethod(ptr, MethodBindings.getFractalLacunarityPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setFractalGain(gain: Float): Unit {
    TransferContext.writeArguments(DOUBLE to gain.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setFractalGainPtr, NIL)
  }

  public final fun getFractalGain(): Float {
    TransferContext.callMethod(ptr, MethodBindings.getFractalGainPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setFractalWeightedStrength(weightedStrength: Float): Unit {
    TransferContext.writeArguments(DOUBLE to weightedStrength.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setFractalWeightedStrengthPtr, NIL)
  }

  public final fun getFractalWeightedStrength(): Float {
    TransferContext.callMethod(ptr, MethodBindings.getFractalWeightedStrengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setFractalPingPongStrength(pingPongStrength: Float): Unit {
    TransferContext.writeArguments(DOUBLE to pingPongStrength.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setFractalPingPongStrengthPtr, NIL)
  }

  public final fun getFractalPingPongStrength(): Float {
    TransferContext.callMethod(ptr, MethodBindings.getFractalPingPongStrengthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setCellularDistanceFunction(func: CellularDistanceFunction): Unit {
    TransferContext.writeArguments(LONG to func.id)
    TransferContext.callMethod(ptr, MethodBindings.setCellularDistanceFunctionPtr, NIL)
  }

  public final fun getCellularDistanceFunction(): CellularDistanceFunction {
    TransferContext.callMethod(ptr, MethodBindings.getCellularDistanceFunctionPtr, LONG)
    return FastNoiseLite.CellularDistanceFunction.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setCellularJitter(jitter: Float): Unit {
    TransferContext.writeArguments(DOUBLE to jitter.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setCellularJitterPtr, NIL)
  }

  public final fun getCellularJitter(): Float {
    TransferContext.callMethod(ptr, MethodBindings.getCellularJitterPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setCellularReturnType(ret: CellularReturnType): Unit {
    TransferContext.writeArguments(LONG to ret.id)
    TransferContext.callMethod(ptr, MethodBindings.setCellularReturnTypePtr, NIL)
  }

  public final fun getCellularReturnType(): CellularReturnType {
    TransferContext.callMethod(ptr, MethodBindings.getCellularReturnTypePtr, LONG)
    return FastNoiseLite.CellularReturnType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setDomainWarpEnabled(domainWarpEnabled: Boolean): Unit {
    TransferContext.writeArguments(BOOL to domainWarpEnabled)
    TransferContext.callMethod(ptr, MethodBindings.setDomainWarpEnabledPtr, NIL)
  }

  public final fun isDomainWarpEnabled(): Boolean {
    TransferContext.callMethod(ptr, MethodBindings.isDomainWarpEnabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setDomainWarpType(domainWarpType: DomainWarpType): Unit {
    TransferContext.writeArguments(LONG to domainWarpType.id)
    TransferContext.callMethod(ptr, MethodBindings.setDomainWarpTypePtr, NIL)
  }

  public final fun getDomainWarpType(): DomainWarpType {
    TransferContext.callMethod(ptr, MethodBindings.getDomainWarpTypePtr, LONG)
    return FastNoiseLite.DomainWarpType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setDomainWarpAmplitude(domainWarpAmplitude: Float): Unit {
    TransferContext.writeArguments(DOUBLE to domainWarpAmplitude.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setDomainWarpAmplitudePtr, NIL)
  }

  public final fun getDomainWarpAmplitude(): Float {
    TransferContext.callMethod(ptr, MethodBindings.getDomainWarpAmplitudePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDomainWarpFrequency(domainWarpFrequency: Float): Unit {
    TransferContext.writeArguments(DOUBLE to domainWarpFrequency.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setDomainWarpFrequencyPtr, NIL)
  }

  public final fun getDomainWarpFrequency(): Float {
    TransferContext.callMethod(ptr, MethodBindings.getDomainWarpFrequencyPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDomainWarpFractalType(domainWarpFractalType: DomainWarpFractalType): Unit {
    TransferContext.writeArguments(LONG to domainWarpFractalType.id)
    TransferContext.callMethod(ptr, MethodBindings.setDomainWarpFractalTypePtr, NIL)
  }

  public final fun getDomainWarpFractalType(): DomainWarpFractalType {
    TransferContext.callMethod(ptr, MethodBindings.getDomainWarpFractalTypePtr, LONG)
    return FastNoiseLite.DomainWarpFractalType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setDomainWarpFractalOctaves(domainWarpOctaveCount: Int): Unit {
    TransferContext.writeArguments(LONG to domainWarpOctaveCount.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setDomainWarpFractalOctavesPtr, NIL)
  }

  public final fun getDomainWarpFractalOctaves(): Int {
    TransferContext.callMethod(ptr, MethodBindings.getDomainWarpFractalOctavesPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setDomainWarpFractalLacunarity(domainWarpLacunarity: Float): Unit {
    TransferContext.writeArguments(DOUBLE to domainWarpLacunarity.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setDomainWarpFractalLacunarityPtr, NIL)
  }

  public final fun getDomainWarpFractalLacunarity(): Float {
    TransferContext.callMethod(ptr, MethodBindings.getDomainWarpFractalLacunarityPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDomainWarpFractalGain(domainWarpGain: Float): Unit {
    TransferContext.writeArguments(DOUBLE to domainWarpGain.toDouble())
    TransferContext.callMethod(ptr, MethodBindings.setDomainWarpFractalGainPtr, NIL)
  }

  public final fun getDomainWarpFractalGain(): Float {
    TransferContext.callMethod(ptr, MethodBindings.getDomainWarpFractalGainPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
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
     * avoiding directional artifacts. Internally uses FastNoiseLite's OpenSimplex2 noise type.
     */
    TYPE_SIMPLEX(0),
    /**
     * Modified, higher quality version of [TYPE_SIMPLEX], but slower. Internally uses
     * FastNoiseLite's OpenSimplex2S noise type.
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
     * Blend of [DISTANCE_EUCLIDEAN] and [DISTANCE_MANHATTAN] to give curved cell boundaries.
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

  public object MethodBindings {
    internal val setNoiseTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_noise_type", 2624461392)

    internal val getNoiseTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_noise_type", 1458108610)

    internal val setSeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_seed", 1286410249)

    internal val getSeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_seed", 3905245786)

    internal val setFrequencyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_frequency", 373806689)

    internal val getFrequencyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_frequency", 1740695150)

    internal val setOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_offset", 3460891852)

    internal val getOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_offset", 3360562783)

    internal val setFractalTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_fractal_type", 4132731174)

    internal val getFractalTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_fractal_type", 1036889279)

    internal val setFractalOctavesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_fractal_octaves", 1286410249)

    internal val getFractalOctavesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_fractal_octaves", 3905245786)

    internal val setFractalLacunarityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_fractal_lacunarity", 373806689)

    internal val getFractalLacunarityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_fractal_lacunarity", 1740695150)

    internal val setFractalGainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_fractal_gain", 373806689)

    internal val getFractalGainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_fractal_gain", 1740695150)

    internal val setFractalWeightedStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_fractal_weighted_strength", 373806689)

    internal val getFractalWeightedStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_fractal_weighted_strength", 1740695150)

    internal val setFractalPingPongStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_fractal_ping_pong_strength", 373806689)

    internal val getFractalPingPongStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_fractal_ping_pong_strength", 1740695150)

    internal val setCellularDistanceFunctionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_cellular_distance_function", 1006013267)

    internal val getCellularDistanceFunctionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_cellular_distance_function", 2021274088)

    internal val setCellularJitterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_cellular_jitter", 373806689)

    internal val getCellularJitterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_cellular_jitter", 1740695150)

    internal val setCellularReturnTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_cellular_return_type", 2654169698)

    internal val getCellularReturnTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_cellular_return_type", 3699796343)

    internal val setDomainWarpEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_domain_warp_enabled", 2586408642)

    internal val isDomainWarpEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "is_domain_warp_enabled", 36873697)

    internal val setDomainWarpTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_domain_warp_type", 3629692980)

    internal val getDomainWarpTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_domain_warp_type", 2980162020)

    internal val setDomainWarpAmplitudePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_domain_warp_amplitude", 373806689)

    internal val getDomainWarpAmplitudePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_domain_warp_amplitude", 1740695150)

    internal val setDomainWarpFrequencyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_domain_warp_frequency", 373806689)

    internal val getDomainWarpFrequencyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_domain_warp_frequency", 1740695150)

    internal val setDomainWarpFractalTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_domain_warp_fractal_type", 3999408287)

    internal val getDomainWarpFractalTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_domain_warp_fractal_type", 407716934)

    internal val setDomainWarpFractalOctavesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_domain_warp_fractal_octaves", 1286410249)

    internal val getDomainWarpFractalOctavesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_domain_warp_fractal_octaves", 3905245786)

    internal val setDomainWarpFractalLacunarityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_domain_warp_fractal_lacunarity", 373806689)

    internal val getDomainWarpFractalLacunarityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_domain_warp_fractal_lacunarity", 1740695150)

    internal val setDomainWarpFractalGainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "set_domain_warp_fractal_gain", 373806689)

    internal val getDomainWarpFractalGainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("FastNoiseLite", "get_domain_warp_fractal_gain", 1740695150)
  }
}
