// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

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
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANDOMNUMBERGENERATOR_GET_SEED,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANDOMNUMBERGENERATOR_SET_SEED,
          NIL)
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
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANDOMNUMBERGENERATOR_GET_STATE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANDOMNUMBERGENERATOR_SET_STATE,
          NIL)
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
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANDOMNUMBERGENERATOR_RANDI, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns a pseudo-random float between `0.0` and `1.0` (inclusive).
   */
  public fun randf(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANDOMNUMBERGENERATOR_RANDF, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns a [normally-distributed](https://en.wikipedia.org/wiki/Normal_distribution) pseudo-random number, using Box-Muller transform with the specified [mean] and a standard [deviation]. This is also called Gaussian distribution.
   */
  public fun randfn(mean: Double = 0.0, deviation: Double = 1.0): Double {
    TransferContext.writeArguments(DOUBLE to mean, DOUBLE to deviation)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANDOMNUMBERGENERATOR_RANDFN,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns a pseudo-random float between [from] and [to] (inclusive).
   */
  public fun randfRange(from: Double, to: Double): Double {
    TransferContext.writeArguments(DOUBLE to from, DOUBLE to to)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANDOMNUMBERGENERATOR_RANDF_RANGE,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns a pseudo-random 32-bit signed integer between [from] and [to] (inclusive).
   */
  public fun randiRange(from: Long, to: Long): Long {
    TransferContext.writeArguments(LONG to from, LONG to to)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANDOMNUMBERGENERATOR_RANDI_RANGE,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Setups a time-based seed to for this [godot.RandomNumberGenerator] instance. Unlike the [@GlobalScope] random number generation functions, different [godot.RandomNumberGenerator] instances can use different seeds.
   */
  public fun randomize(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANDOMNUMBERGENERATOR_RANDOMIZE,
        NIL)
  }

  public companion object
}
