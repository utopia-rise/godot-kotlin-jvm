// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Double
import kotlin.Long
import kotlin.Suppress

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
 */
@GodotBaseType
open class RandomNumberGenerator : Reference() {
  /**
   * The seed used by the random number generator. A given seed will give a reproducible sequence of pseudo-random numbers.
   *
   * **Note:** The RNG does not have an avalanche effect, and can output similar random streams given similar seeds. Consider using a hash function to improve your seed quality if they're sourced externally.
   */
  open var seed: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANDOMNUMBERGENERATOR_GET_SEED,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANDOMNUMBERGENERATOR_SET_SEED,
          NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_RANDOMNUMBERGENERATOR)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  /**
   * Generates a pseudo-random float between `0.0` and `1.0` (inclusive).
   */
  open fun randf(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANDOMNUMBERGENERATOR_RANDF, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Generates a pseudo-random float between `from` and `to` (inclusive).
   */
  open fun randfRange(from: Double, to: Double): Double {
    TransferContext.writeArguments(DOUBLE to from, DOUBLE to to)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANDOMNUMBERGENERATOR_RANDF_RANGE,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Generates a [normally-distributed](https://en.wikipedia.org/wiki/Normal_distribution) pseudo-random number, using Box-Muller transform with the specified `mean` and a standard `deviation`. This is also called Gaussian distribution.
   */
  open fun randfn(mean: Double = 0.0, deviation: Double = 1.0): Double {
    TransferContext.writeArguments(DOUBLE to mean, DOUBLE to deviation)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANDOMNUMBERGENERATOR_RANDFN,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Generates a pseudo-random 32-bit unsigned integer between `0` and `4294967295` (inclusive).
   */
  open fun randi(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANDOMNUMBERGENERATOR_RANDI, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Generates a pseudo-random 32-bit signed integer between `from` and `to` (inclusive).
   */
  open fun randiRange(from: Long, to: Long): Long {
    TransferContext.writeArguments(LONG to from, LONG to to)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANDOMNUMBERGENERATOR_RANDI_RANGE,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Setups a time-based seed to generator.
   */
  open fun randomize() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANDOMNUMBERGENERATOR_RANDOMIZE,
        NIL)
  }
}
