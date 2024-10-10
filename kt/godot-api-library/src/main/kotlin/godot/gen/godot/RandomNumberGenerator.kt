// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedFloat32Array
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.PACKED_FLOAT_32_ARRAY
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_RANDOMNUMBERGENERATOR_INDEX: Int = 475

/**
 * RandomNumberGenerator is a class for generating pseudo-random numbers. It currently uses
 * [url=https://www.pcg-random.org/]PCG32[/url].
 * **Note:** The underlying algorithm is an implementation detail and should not be depended upon.
 * To generate a random float number (within a given range) based on a time-dependent seed:
 * [codeblock]
 * var rng = RandomNumberGenerator.new()
 * func _ready():
 *     var my_random_number = rng.randf_range(-10.0, 10.0)
 * [/codeblock]
 */
@GodotBaseType
public open class RandomNumberGenerator : RefCounted() {
  /**
   * Initializes the random number generator state based on the given seed value. A given seed will
   * give a reproducible sequence of pseudo-random numbers.
   * **Note:** The RNG does not have an avalanche effect, and can output similar random streams
   * given similar seeds. Consider using a hash function to improve your seed quality if they're
   * sourced externally.
   * **Note:** Setting this property produces a side effect of changing the internal [state], so
   * make sure to initialize the seed *before* modifying the [state]:
   * **Note:** The default value of this property is pseudo-random, and changes when calling
   * [randomize]. The `0` value documented here is a placeholder, and not the actual default seed.
   * [codeblock]
   * var rng = RandomNumberGenerator.new()
   * rng.seed = hash("Godot")
   * rng.state = 100 # Restore to some previously saved state.
   * [/codeblock]
   */
  public final inline var seed: Long
    @JvmName("seedProperty")
    get() = getSeed()
    @JvmName("seedProperty")
    set(`value`) {
      setSeed(value)
    }

  /**
   * The current state of the random number generator. Save and restore this property to restore the
   * generator to a previous state:
   * [codeblock]
   * var rng = RandomNumberGenerator.new()
   * print(rng.randf())
   * var saved_state = rng.state # Store current state.
   * print(rng.randf()) # Advance internal state.
   * rng.state = saved_state # Restore the state.
   * print(rng.randf()) # Prints the same value as in previous.
   * [/codeblock]
   * **Note:** Do not set state to arbitrary values, since the random number generator requires the
   * state to have certain qualities to behave properly. It should only be set to values that came from
   * the state property itself. To initialize the random number generator with arbitrary input, use
   * [seed] instead.
   * **Note:** The default value of this property is pseudo-random, and changes when calling
   * [randomize]. The `0` value documented here is a placeholder, and not the actual default seed.
   */
  public final inline var state: Long
    @JvmName("stateProperty")
    get() = getState()
    @JvmName("stateProperty")
    set(`value`) {
      setState(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_RANDOMNUMBERGENERATOR_INDEX, scriptIndex)
  }

  public final fun setSeed(seed: Long): Unit {
    Internals.writeArguments(LONG to seed)
    Internals.callMethod(rawPtr, MethodBindings.setSeedPtr, NIL)
  }

  public final fun getSeed(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSeedPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  public final fun setState(state: Long): Unit {
    Internals.writeArguments(LONG to state)
    Internals.callMethod(rawPtr, MethodBindings.setStatePtr, NIL)
  }

  public final fun getState(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getStatePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns a pseudo-random 32-bit unsigned integer between `0` and `4294967295` (inclusive).
   */
  public final fun randi(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.randiPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns a pseudo-random float between `0.0` and `1.0` (inclusive).
   */
  public final fun randf(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.randfPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns a [url=https://en.wikipedia.org/wiki/Normal_distribution]normally-distributed[/url],
   * pseudo-random floating-point number from the specified [mean] and a standard [deviation]. This is
   * also known as a Gaussian distribution.
   * **Note:** This method uses the
   * [url=https://en.wikipedia.org/wiki/Box&#37;E2&#37;80&#37;93Muller_transform]Box-Muller
   * transform[/url] algorithm.
   */
  @JvmOverloads
  public final fun randfn(mean: Float = 0.0f, deviation: Float = 1.0f): Float {
    Internals.writeArguments(DOUBLE to mean.toDouble(), DOUBLE to deviation.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.randfnPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns a pseudo-random float between [from] and [to] (inclusive).
   */
  public final fun randfRange(from: Float, to: Float): Float {
    Internals.writeArguments(DOUBLE to from.toDouble(), DOUBLE to to.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.randfRangePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns a pseudo-random 32-bit signed integer between [from] and [to] (inclusive).
   */
  public final fun randiRange(from: Int, to: Int): Int {
    Internals.writeArguments(LONG to from.toLong(), LONG to to.toLong())
    Internals.callMethod(rawPtr, MethodBindings.randiRangePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns a random index with non-uniform weights. Prints an error and returns `-1` if the array
   * is empty.
   *
   * gdscript:
   * ```gdscript
   * var rng = RandomNumberGenerator.new()
   *
   * var my_array = ["one", "two", "three", "four"]
   * var weights = PackedFloat32Array([0.5, 1, 1, 2])
   *
   * # Prints one of the four elements in `my_array`.
   * # It is more likely to print "four", and less likely to print "one".
   * print(my_array[rng.rand_weighted(weights)])
   * ```
   */
  public final fun randWeighted(weights: PackedFloat32Array): Long {
    Internals.writeArguments(PACKED_FLOAT_32_ARRAY to weights)
    Internals.callMethod(rawPtr, MethodBindings.randWeightedPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Sets up a time-based seed for this [RandomNumberGenerator] instance. Unlike the [@GlobalScope]
   * random number generation functions, different [RandomNumberGenerator] instances can use different
   * seeds.
   */
  public final fun randomize(): Unit {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.randomizePtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val setSeedPtr: VoidPtr =
        Internals.getMethodBindPtr("RandomNumberGenerator", "set_seed", 1286410249)

    public val getSeedPtr: VoidPtr =
        Internals.getMethodBindPtr("RandomNumberGenerator", "get_seed", 2455072627)

    public val setStatePtr: VoidPtr =
        Internals.getMethodBindPtr("RandomNumberGenerator", "set_state", 1286410249)

    public val getStatePtr: VoidPtr =
        Internals.getMethodBindPtr("RandomNumberGenerator", "get_state", 3905245786)

    public val randiPtr: VoidPtr =
        Internals.getMethodBindPtr("RandomNumberGenerator", "randi", 2455072627)

    public val randfPtr: VoidPtr =
        Internals.getMethodBindPtr("RandomNumberGenerator", "randf", 191475506)

    public val randfnPtr: VoidPtr =
        Internals.getMethodBindPtr("RandomNumberGenerator", "randfn", 837325100)

    public val randfRangePtr: VoidPtr =
        Internals.getMethodBindPtr("RandomNumberGenerator", "randf_range", 4269894367)

    public val randiRangePtr: VoidPtr =
        Internals.getMethodBindPtr("RandomNumberGenerator", "randi_range", 50157827)

    public val randWeightedPtr: VoidPtr =
        Internals.getMethodBindPtr("RandomNumberGenerator", "rand_weighted", 4189642986)

    public val randomizePtr: VoidPtr =
        Internals.getMethodBindPtr("RandomNumberGenerator", "randomize", 3218959716)
  }
}
