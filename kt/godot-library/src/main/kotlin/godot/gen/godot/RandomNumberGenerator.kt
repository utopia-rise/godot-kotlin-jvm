// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Provides methods for generating pseudo-random numbers.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/math/random_number_generation.html]($DOCS_URL/tutorials/math/random_number_generation.html)
 *
 * RandomNumberGenerator is a class for generating pseudo-random numbers. It currently uses [godot.PCG32](https://www.pcg-random.org/).
 *
 * **Note:** The underlying algorithm is an implementation detail and should not be depended upon.
 *
 * To generate a random float number (within a given range) based on a time-dependant seed:
 *
 * ```
 * 		var rng = RandomNumberGenerator.new()
 * 		func _ready():
 * 		    var my_random_number = rng.randf_range(-10.0, 10.0)
 * 		```
 */
@GodotBaseType
public open class RandomNumberGenerator : RefCounted() {
  /**
   * Initializes the random number generator state based on the given seed value. A given seed will give a reproducible sequence of pseudo-random numbers.
   *
   * **Note:** The RNG does not have an avalanche effect, and can output similar random streams given similar seeds. Consider using a hash function to improve your seed quality if they're sourced externally.
   *
   * **Note:** Setting this property produces a side effect of changing the internal [state], so make sure to initialize the seed *before* modifying the [state]:
   *
   * **Note:** The default value of this property is pseudo-random, and changes when calling [randomize]. The `0` value documented here is a placeholder, and not the actual default seed.
   *
   * ```
   * 			var rng = RandomNumberGenerator.new()
   * 			rng.seed = hash("Godot")
   * 			rng.state = 100 # Restore to some previously saved state.
   * 			```
   */
  public var seed: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSeedPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSeedPtr, NIL)
    }

  /**
   * The current state of the random number generator. Save and restore this property to restore the generator to a previous state:
   *
   * ```
   * 			var rng = RandomNumberGenerator.new()
   * 			print(rng.randf())
   * 			var saved_state = rng.state # Store current state.
   * 			print(rng.randf()) # Advance internal state.
   * 			rng.state = saved_state # Restore the state.
   * 			print(rng.randf()) # Prints the same value as in previous.
   * 			```
   *
   * **Note:** Do not set state to arbitrary values, since the random number generator requires the state to have certain qualities to behave properly. It should only be set to values that came from the state property itself. To initialize the random number generator with arbitrary input, use [seed] instead.
   *
   * **Note:** The default value of this property is pseudo-random, and changes when calling [randomize]. The `0` value documented here is a placeholder, and not the actual default seed.
   */
  public var state: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStatePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setStatePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RANDOMNUMBERGENERATOR, scriptIndex)
    return true
  }

  /**
   * Returns a pseudo-random 32-bit unsigned integer between `0` and `4294967295` (inclusive).
   */
  public fun randi(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.randiPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns a pseudo-random float between `0.0` and `1.0` (inclusive).
   */
  public fun randf(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.randfPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns a [normally-distributed](https://en.wikipedia.org/wiki/Normal_distribution) pseudo-random number, using Box-Muller transform with the specified [mean] and a standard [deviation]. This is also called Gaussian distribution.
   */
  @JvmOverloads
  public fun randfn(mean: Float = 0.0f, deviation: Float = 1.0f): Float {
    TransferContext.writeArguments(DOUBLE to mean.toDouble(), DOUBLE to deviation.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.randfnPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns a pseudo-random float between [from] and [to] (inclusive).
   */
  public fun randfRange(from: Float, to: Float): Float {
    TransferContext.writeArguments(DOUBLE to from.toDouble(), DOUBLE to to.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.randfRangePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns a pseudo-random 32-bit signed integer between [from] and [to] (inclusive).
   */
  public fun randiRange(from: Int, to: Int): Int {
    TransferContext.writeArguments(LONG to from.toLong(), LONG to to.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.randiRangePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Sets up a time-based seed for this [godot.RandomNumberGenerator] instance. Unlike the [@GlobalScope] random number generation functions, different [godot.RandomNumberGenerator] instances can use different seeds.
   */
  public fun randomize(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.randomizePtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val setSeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RandomNumberGenerator", "set_seed")

    public val getSeedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RandomNumberGenerator", "get_seed")

    public val setStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RandomNumberGenerator", "set_state")

    public val getStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RandomNumberGenerator", "get_state")

    public val randiPtr: VoidPtr = TypeManager.getMethodBindPtr("RandomNumberGenerator", "randi")

    public val randfPtr: VoidPtr = TypeManager.getMethodBindPtr("RandomNumberGenerator", "randf")

    public val randfnPtr: VoidPtr = TypeManager.getMethodBindPtr("RandomNumberGenerator", "randfn")

    public val randfRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RandomNumberGenerator", "randf_range")

    public val randiRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RandomNumberGenerator", "randi_range")

    public val randomizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RandomNumberGenerator", "randomize")
  }
}
