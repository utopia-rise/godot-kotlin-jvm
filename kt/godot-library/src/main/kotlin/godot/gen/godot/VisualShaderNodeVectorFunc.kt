// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.util.VoidPtr
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class VisualShaderNodeVectorFunc : VisualShaderNode() {
  open var function: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEVECTORFUNC_GET_FUNCTION, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEVECTORFUNC_SET_FUNCTION, NIL)
    }

  override fun __new(): VoidPtr =
      TransferContext.invokeConstructor(ENGINECLASS_VISUALSHADERNODEVECTORFUNC)

  enum class Function(
    id: Long
  ) {
    FUNC_NORMALIZE(0),

    FUNC_SATURATE(1),

    FUNC_NEGATE(2),

    FUNC_RECIPROCAL(3),

    FUNC_RGB2HSV(4),

    FUNC_HSV2RGB(5),

    FUNC_ABS(6),

    FUNC_ACOS(7),

    FUNC_ACOSH(8),

    FUNC_ASIN(9),

    FUNC_ASINH(10),

    FUNC_ATAN(11),

    FUNC_ATANH(12),

    FUNC_CEIL(13),

    FUNC_COS(14),

    FUNC_COSH(15),

    FUNC_DEGREES(16),

    FUNC_EXP(17),

    FUNC_EXP2(18),

    FUNC_FLOOR(19),

    FUNC_FRAC(20),

    FUNC_INVERSE_SQRT(21),

    FUNC_LOG(22),

    FUNC_LOG2(23),

    FUNC_RADIANS(24),

    FUNC_ROUND(25),

    FUNC_ROUNDEVEN(26),

    FUNC_SIGN(27),

    FUNC_SIN(28),

    FUNC_SINH(29),

    FUNC_SQRT(30),

    FUNC_TAN(31),

    FUNC_TANH(32),

    FUNC_TRUNC(33),

    FUNC_ONEMINUS(34);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val FUNC_ABS: Long = 6

    final const val FUNC_ACOS: Long = 7

    final const val FUNC_ACOSH: Long = 8

    final const val FUNC_ASIN: Long = 9

    final const val FUNC_ASINH: Long = 10

    final const val FUNC_ATAN: Long = 11

    final const val FUNC_ATANH: Long = 12

    final const val FUNC_CEIL: Long = 13

    final const val FUNC_COS: Long = 14

    final const val FUNC_COSH: Long = 15

    final const val FUNC_DEGREES: Long = 16

    final const val FUNC_EXP: Long = 17

    final const val FUNC_EXP2: Long = 18

    final const val FUNC_FLOOR: Long = 19

    final const val FUNC_FRAC: Long = 20

    final const val FUNC_HSV2RGB: Long = 5

    final const val FUNC_INVERSE_SQRT: Long = 21

    final const val FUNC_LOG: Long = 22

    final const val FUNC_LOG2: Long = 23

    final const val FUNC_NEGATE: Long = 2

    final const val FUNC_NORMALIZE: Long = 0

    final const val FUNC_ONEMINUS: Long = 34

    final const val FUNC_RADIANS: Long = 24

    final const val FUNC_RECIPROCAL: Long = 3

    final const val FUNC_RGB2HSV: Long = 4

    final const val FUNC_ROUND: Long = 25

    final const val FUNC_ROUNDEVEN: Long = 26

    final const val FUNC_SATURATE: Long = 1

    final const val FUNC_SIGN: Long = 27

    final const val FUNC_SIN: Long = 28

    final const val FUNC_SINH: Long = 29

    final const val FUNC_SQRT: Long = 30

    final const val FUNC_TAN: Long = 31

    final const val FUNC_TANH: Long = 32

    final const val FUNC_TRUNC: Long = 33
  }
}
