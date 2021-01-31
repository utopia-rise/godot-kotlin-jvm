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
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class RandomNumberGenerator : Reference() {
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

  override fun __new(): VoidPtr =
      TransferContext.invokeConstructor(ENGINECLASS_RANDOMNUMBERGENERATOR)

  open fun randf(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANDOMNUMBERGENERATOR_RANDF, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun randfRange(from: Double, to: Double): Double {
    TransferContext.writeArguments(DOUBLE to from, DOUBLE to to)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANDOMNUMBERGENERATOR_RANDF_RANGE,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun randfn(mean: Double = 0.0, deviation: Double = 1.0): Double {
    TransferContext.writeArguments(DOUBLE to mean, DOUBLE to deviation)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANDOMNUMBERGENERATOR_RANDFN,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun randi(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANDOMNUMBERGENERATOR_RANDI, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun randiRange(from: Long, to: Long): Long {
    TransferContext.writeArguments(LONG to from, LONG to to)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANDOMNUMBERGENERATOR_RANDI_RANGE,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun randomize() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RANDOMNUMBERGENERATOR_RANDOMIZE,
        NIL)
  }

  companion object
}
