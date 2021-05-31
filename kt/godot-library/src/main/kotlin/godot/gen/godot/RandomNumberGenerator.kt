// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A class for generating pseudo-random numbers.
 *
 * RandomNumberGenerator is a class for generating pseudo-random numbers. It currently uses [godot.PCG32](http://www.pcg-random.org/).
 *
 * **Note:** The underlying algorithm is an implementation detail. As a result, it should not be depended upon for reproducible random streams across Godot versions.
 *
 * To generate a random float number (within a given range) based on a time-dependant seed:
 *
 * ```
 * 		var rng = RandomNumberGenerator.new()
 * 		func _ready():
 * 		    rng.randomize()
 * 		    var my_random_number = rng.randf_range(-10.0, 10.0)
 * 		```
 *
 * **Note:** The default values of [seed] and [state] properties are pseudo-random, and changes when calling [randomize]. The `0` value documented here is a placeholder, and not the actual default seed.
 */
@GodotBaseType
public open class RandomNumberGenerator : Reference() {
  /**
   * Initializes the random number generator state based on the given seed value. A given seed will give a reproducible sequence of pseudo-random numbers.
   *
   * **Note:** The RNG does not have an avalanche effect, and can output similar random streams given similar seeds. Consider using a hash function to improve your seed quality if they're sourced externally.
   *
   * **Note:** Setting this property produces a side effect of changing the internal [state], so make sure to initialize the seed *before* modifying the [state]:
   *
   * ```
   * 			var rng = RandomNumberGenerator.new()
   * 			rng.seed = hash("Godot")
   * 			rng.state = 100 # Restore to some previously saved state.
   * 			```
   *
   * **Warning:** the getter of this property returns the previous [state], and not the initial seed value, which is going to be fixed in Godot 4.0.
   */
  public open var seed: Long
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
   */
  public open var state: Long
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

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_RANDOMNUMBERGENERATOR)
  }

  /**
   * Generates a pseudo-random float between `0.0` and `1.0` (inclusive).
   */
  public open fun randf(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANDOMNUMBERGENERATOR_RANDF, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Generates a pseudo-random float between `from` and `to` (inclusive).
   */
  public open fun randfRange(from: Double, to: Double): Double {
    TransferContext.writeArguments(DOUBLE to from, DOUBLE to to)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANDOMNUMBERGENERATOR_RANDF_RANGE,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Generates a [normally-distributed](https://en.wikipedia.org/wiki/Normal_distribution) pseudo-random number, using Box-Muller transform with the specified `mean` and a standard `deviation`. This is also called Gaussian distribution.
   */
  public open fun randfn(mean: Double = 0.0, deviation: Double = 1.0): Double {
    TransferContext.writeArguments(DOUBLE to mean, DOUBLE to deviation)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANDOMNUMBERGENERATOR_RANDFN,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Generates a pseudo-random 32-bit unsigned integer between `0` and `4294967295` (inclusive).
   */
  public open fun randi(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANDOMNUMBERGENERATOR_RANDI, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Generates a pseudo-random 32-bit signed integer between `from` and `to` (inclusive).
   */
  public open fun randiRange(from: Long, to: Long): Long {
    TransferContext.writeArguments(LONG to from, LONG to to)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANDOMNUMBERGENERATOR_RANDI_RANGE,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Setups a time-based seed to generator.
   */
  public open fun randomize(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANDOMNUMBERGENERATOR_RANDOMIZE,
        NIL)
  }
}
