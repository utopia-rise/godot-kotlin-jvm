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
open class SliderJoint : Joint() {
  open var angularLimit_damping: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_GET_ANGULAR_LIMIT_DAMPING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_SET_ANGULAR_LIMIT_DAMPING, NIL)
    }

  open var angularLimit_restitution: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_GET_ANGULAR_LIMIT_RESTITUTION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_SET_ANGULAR_LIMIT_RESTITUTION, NIL)
    }

  open var angularLimit_softness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_GET_ANGULAR_LIMIT_SOFTNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_SET_ANGULAR_LIMIT_SOFTNESS, NIL)
    }

  open var angularMotion_damping: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_GET_ANGULAR_MOTION_DAMPING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_SET_ANGULAR_MOTION_DAMPING, NIL)
    }

  open var angularMotion_restitution: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_GET_ANGULAR_MOTION_RESTITUTION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_SET_ANGULAR_MOTION_RESTITUTION, NIL)
    }

  open var angularMotion_softness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_GET_ANGULAR_MOTION_SOFTNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_SET_ANGULAR_MOTION_SOFTNESS, NIL)
    }

  open var angularOrtho_damping: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_GET_ANGULAR_ORTHO_DAMPING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_SET_ANGULAR_ORTHO_DAMPING, NIL)
    }

  open var angularOrtho_restitution: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_GET_ANGULAR_ORTHO_RESTITUTION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_SET_ANGULAR_ORTHO_RESTITUTION, NIL)
    }

  open var angularOrtho_softness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_GET_ANGULAR_ORTHO_SOFTNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_SET_ANGULAR_ORTHO_SOFTNESS, NIL)
    }

  open var linearLimit_damping: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_GET_LINEAR_LIMIT_DAMPING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_SET_LINEAR_LIMIT_DAMPING, NIL)
    }

  open var linearLimit_lowerDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_GET_LINEAR_LIMIT_LOWER_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_SET_LINEAR_LIMIT_LOWER_DISTANCE, NIL)
    }

  open var linearLimit_restitution: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_GET_LINEAR_LIMIT_RESTITUTION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_SET_LINEAR_LIMIT_RESTITUTION, NIL)
    }

  open var linearLimit_softness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_GET_LINEAR_LIMIT_SOFTNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_SET_LINEAR_LIMIT_SOFTNESS, NIL)
    }

  open var linearLimit_upperDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_GET_LINEAR_LIMIT_UPPER_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_SET_LINEAR_LIMIT_UPPER_DISTANCE, NIL)
    }

  open var linearMotion_damping: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_GET_LINEAR_MOTION_DAMPING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_SET_LINEAR_MOTION_DAMPING, NIL)
    }

  open var linearMotion_restitution: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_GET_LINEAR_MOTION_RESTITUTION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_SET_LINEAR_MOTION_RESTITUTION, NIL)
    }

  open var linearMotion_softness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_GET_LINEAR_MOTION_SOFTNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_SET_LINEAR_MOTION_SOFTNESS, NIL)
    }

  open var linearOrtho_damping: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_GET_LINEAR_ORTHO_DAMPING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_SET_LINEAR_ORTHO_DAMPING, NIL)
    }

  open var linearOrtho_restitution: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_GET_LINEAR_ORTHO_RESTITUTION, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_SET_LINEAR_ORTHO_RESTITUTION, NIL)
    }

  open var linearOrtho_softness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_GET_LINEAR_ORTHO_SOFTNESS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SLIDERJOINT_SET_LINEAR_ORTHO_SOFTNESS, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_SLIDERJOINT)

  open fun _getLowerLimitAngular(): Double {
    throw NotImplementedError("_get_lower_limit_angular is not implemented for SliderJoint")
  }

  open fun _getUpperLimitAngular(): Double {
    throw NotImplementedError("_get_upper_limit_angular is not implemented for SliderJoint")
  }

  open fun _setLowerLimitAngular(lowerLimitAngular: Double) {
  }

  open fun _setUpperLimitAngular(upperLimitAngular: Double) {
  }

  enum class Param(
    id: Long
  ) {
    PARAM_LINEAR_LIMIT_UPPER(0),

    PARAM_LINEAR_LIMIT_LOWER(1),

    PARAM_LINEAR_LIMIT_SOFTNESS(2),

    PARAM_LINEAR_LIMIT_RESTITUTION(3),

    PARAM_LINEAR_LIMIT_DAMPING(4),

    PARAM_LINEAR_MOTION_SOFTNESS(5),

    PARAM_LINEAR_MOTION_RESTITUTION(6),

    PARAM_LINEAR_MOTION_DAMPING(7),

    PARAM_LINEAR_ORTHOGONAL_SOFTNESS(8),

    PARAM_LINEAR_ORTHOGONAL_RESTITUTION(9),

    PARAM_LINEAR_ORTHOGONAL_DAMPING(10),

    PARAM_ANGULAR_LIMIT_UPPER(11),

    PARAM_ANGULAR_LIMIT_LOWER(12),

    PARAM_ANGULAR_LIMIT_SOFTNESS(13),

    PARAM_ANGULAR_LIMIT_RESTITUTION(14),

    PARAM_ANGULAR_LIMIT_DAMPING(15),

    PARAM_ANGULAR_MOTION_SOFTNESS(16),

    PARAM_ANGULAR_MOTION_RESTITUTION(17),

    PARAM_ANGULAR_MOTION_DAMPING(18),

    PARAM_ANGULAR_ORTHOGONAL_SOFTNESS(19),

    PARAM_ANGULAR_ORTHOGONAL_RESTITUTION(20),

    PARAM_ANGULAR_ORTHOGONAL_DAMPING(21),

    PARAM_MAX(22);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val PARAM_ANGULAR_LIMIT_DAMPING: Long = 15

    final const val PARAM_ANGULAR_LIMIT_LOWER: Long = 12

    final const val PARAM_ANGULAR_LIMIT_RESTITUTION: Long = 14

    final const val PARAM_ANGULAR_LIMIT_SOFTNESS: Long = 13

    final const val PARAM_ANGULAR_LIMIT_UPPER: Long = 11

    final const val PARAM_ANGULAR_MOTION_DAMPING: Long = 18

    final const val PARAM_ANGULAR_MOTION_RESTITUTION: Long = 17

    final const val PARAM_ANGULAR_MOTION_SOFTNESS: Long = 16

    final const val PARAM_ANGULAR_ORTHOGONAL_DAMPING: Long = 21

    final const val PARAM_ANGULAR_ORTHOGONAL_RESTITUTION: Long = 20

    final const val PARAM_ANGULAR_ORTHOGONAL_SOFTNESS: Long = 19

    final const val PARAM_LINEAR_LIMIT_DAMPING: Long = 4

    final const val PARAM_LINEAR_LIMIT_LOWER: Long = 1

    final const val PARAM_LINEAR_LIMIT_RESTITUTION: Long = 3

    final const val PARAM_LINEAR_LIMIT_SOFTNESS: Long = 2

    final const val PARAM_LINEAR_LIMIT_UPPER: Long = 0

    final const val PARAM_LINEAR_MOTION_DAMPING: Long = 7

    final const val PARAM_LINEAR_MOTION_RESTITUTION: Long = 6

    final const val PARAM_LINEAR_MOTION_SOFTNESS: Long = 5

    final const val PARAM_LINEAR_ORTHOGONAL_DAMPING: Long = 10

    final const val PARAM_LINEAR_ORTHOGONAL_RESTITUTION: Long = 9

    final const val PARAM_LINEAR_ORTHOGONAL_SOFTNESS: Long = 8

    final const val PARAM_MAX: Long = 22
  }
}
