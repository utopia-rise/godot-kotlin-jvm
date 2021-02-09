// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress

@GodotBaseType
open class ConeTwistJoint : Joint() {
  open var bias: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONETWISTJOINT_GET_BIAS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONETWISTJOINT_SET_BIAS, NIL)
    }

  open var relaxation: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONETWISTJOINT_GET_RELAXATION,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONETWISTJOINT_SET_RELAXATION,
          NIL)
    }

  open var softness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONETWISTJOINT_GET_SOFTNESS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CONETWISTJOINT_SET_SOFTNESS, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_CONETWISTJOINT)

  open fun _getSwingSpan(): Double {
    throw NotImplementedError("_get_swing_span is not implemented for ConeTwistJoint")
  }

  open fun _getTwistSpan(): Double {
    throw NotImplementedError("_get_twist_span is not implemented for ConeTwistJoint")
  }

  open fun _setSwingSpan(swingSpan: Double) {
  }

  open fun _setTwistSpan(twistSpan: Double) {
  }

  enum class Param(
    id: Long
  ) {
    PARAM_SWING_SPAN(0),

    PARAM_TWIST_SPAN(1),

    PARAM_BIAS(2),

    PARAM_SOFTNESS(3),

    PARAM_RELAXATION(4),

    PARAM_MAX(5);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val PARAM_BIAS: Long = 2

    final const val PARAM_MAX: Long = 5

    final const val PARAM_RELAXATION: Long = 4

    final const val PARAM_SOFTNESS: Long = 3

    final const val PARAM_SWING_SPAN: Long = 0

    final const val PARAM_TWIST_SPAN: Long = 1
  }
}
