// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import kotlin.Double
import kotlin.Long
import kotlin.Suppress

/**
 * Pin joint for 3D shapes.
 * 
 * Pin joint for 3D rigid bodies. It pins 2 bodies (rigid or static) together.
 */
@GodotBaseType
open class PinJoint : Joint() {
  open var params_bias: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PINJOINT_GET_PARAMS_BIAS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PINJOINT_SET_PARAMS_BIAS, NIL)
    }

  open var params_damping: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PINJOINT_GET_PARAMS_DAMPING,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PINJOINT_SET_PARAMS_DAMPING, NIL)
    }

  open var params_impulseClamp: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PINJOINT_GET_PARAMS_IMPULSE_CLAMP,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_PINJOINT_SET_PARAMS_IMPULSE_CLAMP,
          NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_PINJOINT)
  }

  enum class Param(
    id: Long
  ) {
    /**
     * The force with which the pinned objects stay in positional relation to each other. The higher, the stronger.
     */
    PARAM_BIAS(0),

    /**
     * The force with which the pinned objects stay in velocity relation to each other. The higher, the stronger.
     */
    PARAM_DAMPING(1),

    /**
     * If above 0, this value is the maximum value for an impulse that this Joint produces.
     */
    PARAM_IMPULSE_CLAMP(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * The force with which the pinned objects stay in positional relation to each other. The higher, the stronger.
     */
    final const val PARAM_BIAS: Long = 0

    /**
     * The force with which the pinned objects stay in velocity relation to each other. The higher, the stronger.
     */
    final const val PARAM_DAMPING: Long = 1

    /**
     * If above 0, this value is the maximum value for an impulse that this Joint produces.
     */
    final const val PARAM_IMPULSE_CLAMP: Long = 2
  }
}
