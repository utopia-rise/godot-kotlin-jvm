// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class VisualScriptBuiltinFunc : VisualScriptNode() {
  open var function: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTBUILTINFUNC_GET_FUNCTION, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTBUILTINFUNC_SET_FUNCTION, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_VISUALSCRIPTBUILTINFUNC)
  }

  enum class BuiltinFunc(
    id: Long
  ) {
    MATH_SIN(0),

    MATH_COS(1),

    MATH_TAN(2),

    MATH_SINH(3),

    MATH_COSH(4),

    MATH_TANH(5),

    MATH_ASIN(6),

    MATH_ACOS(7),

    MATH_ATAN(8),

    MATH_ATAN2(9),

    MATH_SQRT(10),

    MATH_FMOD(11),

    MATH_FPOSMOD(12),

    MATH_FLOOR(13),

    MATH_CEIL(14),

    MATH_ROUND(15),

    MATH_ABS(16),

    MATH_SIGN(17),

    MATH_POW(18),

    MATH_LOG(19),

    MATH_EXP(20),

    MATH_ISNAN(21),

    MATH_ISINF(22),

    MATH_EASE(23),

    MATH_DECIMALS(24),

    MATH_STEPIFY(25),

    MATH_LERP(26),

    MATH_INVERSE_LERP(27),

    MATH_RANGE_LERP(28),

    MATH_MOVE_TOWARD(29),

    MATH_DECTIME(30),

    MATH_RANDOMIZE(31),

    MATH_RAND(32),

    MATH_RANDF(33),

    MATH_RANDOM(34),

    MATH_SEED(35),

    MATH_RANDSEED(36),

    MATH_DEG2RAD(37),

    MATH_RAD2DEG(38),

    MATH_LINEAR2DB(39),

    MATH_DB2LINEAR(40),

    MATH_POLAR2CARTESIAN(41),

    MATH_CARTESIAN2POLAR(42),

    MATH_WRAP(43),

    MATH_WRAPF(44),

    LOGIC_MAX(45),

    LOGIC_MIN(46),

    LOGIC_CLAMP(47),

    LOGIC_NEAREST_PO2(48),

    OBJ_WEAKREF(49),

    FUNC_FUNCREF(50),

    TYPE_CONVERT(51),

    TYPE_OF(52),

    TYPE_EXISTS(53),

    TEXT_CHAR(54),

    TEXT_STR(55),

    TEXT_PRINT(56),

    TEXT_PRINTERR(57),

    TEXT_PRINTRAW(58),

    VAR_TO_STR(59),

    STR_TO_VAR(60),

    VAR_TO_BYTES(61),

    BYTES_TO_VAR(62),

    COLORN(63),

    MATH_SMOOTHSTEP(64),

    MATH_POSMOD(65),

    MATH_LERP_ANGLE(66),

    TEXT_ORD(67),

    FUNC_MAX(68);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val BYTES_TO_VAR: Long = 62

    final const val COLORN: Long = 63

    final const val FUNC_FUNCREF: Long = 50

    final const val FUNC_MAX: Long = 68

    final const val LOGIC_CLAMP: Long = 47

    final const val LOGIC_MAX: Long = 45

    final const val LOGIC_MIN: Long = 46

    final const val LOGIC_NEAREST_PO2: Long = 48

    final const val MATH_ABS: Long = 16

    final const val MATH_ACOS: Long = 7

    final const val MATH_ASIN: Long = 6

    final const val MATH_ATAN: Long = 8

    final const val MATH_ATAN2: Long = 9

    final const val MATH_CARTESIAN2POLAR: Long = 42

    final const val MATH_CEIL: Long = 14

    final const val MATH_COS: Long = 1

    final const val MATH_COSH: Long = 4

    final const val MATH_DB2LINEAR: Long = 40

    final const val MATH_DECIMALS: Long = 24

    final const val MATH_DECTIME: Long = 30

    final const val MATH_DEG2RAD: Long = 37

    final const val MATH_EASE: Long = 23

    final const val MATH_EXP: Long = 20

    final const val MATH_FLOOR: Long = 13

    final const val MATH_FMOD: Long = 11

    final const val MATH_FPOSMOD: Long = 12

    final const val MATH_INVERSE_LERP: Long = 27

    final const val MATH_ISINF: Long = 22

    final const val MATH_ISNAN: Long = 21

    final const val MATH_LERP: Long = 26

    final const val MATH_LERP_ANGLE: Long = 66

    final const val MATH_LINEAR2DB: Long = 39

    final const val MATH_LOG: Long = 19

    final const val MATH_MOVE_TOWARD: Long = 29

    final const val MATH_POLAR2CARTESIAN: Long = 41

    final const val MATH_POSMOD: Long = 65

    final const val MATH_POW: Long = 18

    final const val MATH_RAD2DEG: Long = 38

    final const val MATH_RAND: Long = 32

    final const val MATH_RANDF: Long = 33

    final const val MATH_RANDOM: Long = 34

    final const val MATH_RANDOMIZE: Long = 31

    final const val MATH_RANDSEED: Long = 36

    final const val MATH_RANGE_LERP: Long = 28

    final const val MATH_ROUND: Long = 15

    final const val MATH_SEED: Long = 35

    final const val MATH_SIGN: Long = 17

    final const val MATH_SIN: Long = 0

    final const val MATH_SINH: Long = 3

    final const val MATH_SMOOTHSTEP: Long = 64

    final const val MATH_SQRT: Long = 10

    final const val MATH_STEPIFY: Long = 25

    final const val MATH_TAN: Long = 2

    final const val MATH_TANH: Long = 5

    final const val MATH_WRAP: Long = 43

    final const val MATH_WRAPF: Long = 44

    final const val OBJ_WEAKREF: Long = 49

    final const val STR_TO_VAR: Long = 60

    final const val TEXT_CHAR: Long = 54

    final const val TEXT_ORD: Long = 67

    final const val TEXT_PRINT: Long = 56

    final const val TEXT_PRINTERR: Long = 57

    final const val TEXT_PRINTRAW: Long = 58

    final const val TEXT_STR: Long = 55

    final const val TYPE_CONVERT: Long = 51

    final const val TYPE_EXISTS: Long = 53

    final const val TYPE_OF: Long = 52

    final const val VAR_TO_BYTES: Long = 61

    final const val VAR_TO_STR: Long = 59
  }
}
