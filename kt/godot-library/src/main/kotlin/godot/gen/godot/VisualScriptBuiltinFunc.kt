// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class VisualScriptBuiltinFunc : VisualScriptNode() {
  public open var function: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTBUILTINFUNC_GET_FUNCTION, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTBUILTINFUNC_SET_FUNCTION, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSCRIPTBUILTINFUNC)
  }

  public enum class BuiltinFunc(
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
    FUNC_MAX(68),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    public final const val BYTES_TO_VAR: Long = 62

    public final const val COLORN: Long = 63

    public final const val FUNC_FUNCREF: Long = 50

    public final const val FUNC_MAX: Long = 68

    public final const val LOGIC_CLAMP: Long = 47

    public final const val LOGIC_MAX: Long = 45

    public final const val LOGIC_MIN: Long = 46

    public final const val LOGIC_NEAREST_PO2: Long = 48

    public final const val MATH_ABS: Long = 16

    public final const val MATH_ACOS: Long = 7

    public final const val MATH_ASIN: Long = 6

    public final const val MATH_ATAN: Long = 8

    public final const val MATH_ATAN2: Long = 9

    public final const val MATH_CARTESIAN2POLAR: Long = 42

    public final const val MATH_CEIL: Long = 14

    public final const val MATH_COS: Long = 1

    public final const val MATH_COSH: Long = 4

    public final const val MATH_DB2LINEAR: Long = 40

    public final const val MATH_DECIMALS: Long = 24

    public final const val MATH_DECTIME: Long = 30

    public final const val MATH_DEG2RAD: Long = 37

    public final const val MATH_EASE: Long = 23

    public final const val MATH_EXP: Long = 20

    public final const val MATH_FLOOR: Long = 13

    public final const val MATH_FMOD: Long = 11

    public final const val MATH_FPOSMOD: Long = 12

    public final const val MATH_INVERSE_LERP: Long = 27

    public final const val MATH_ISINF: Long = 22

    public final const val MATH_ISNAN: Long = 21

    public final const val MATH_LERP: Long = 26

    public final const val MATH_LERP_ANGLE: Long = 66

    public final const val MATH_LINEAR2DB: Long = 39

    public final const val MATH_LOG: Long = 19

    public final const val MATH_MOVE_TOWARD: Long = 29

    public final const val MATH_POLAR2CARTESIAN: Long = 41

    public final const val MATH_POSMOD: Long = 65

    public final const val MATH_POW: Long = 18

    public final const val MATH_RAD2DEG: Long = 38

    public final const val MATH_RAND: Long = 32

    public final const val MATH_RANDF: Long = 33

    public final const val MATH_RANDOM: Long = 34

    public final const val MATH_RANDOMIZE: Long = 31

    public final const val MATH_RANDSEED: Long = 36

    public final const val MATH_RANGE_LERP: Long = 28

    public final const val MATH_ROUND: Long = 15

    public final const val MATH_SEED: Long = 35

    public final const val MATH_SIGN: Long = 17

    public final const val MATH_SIN: Long = 0

    public final const val MATH_SINH: Long = 3

    public final const val MATH_SMOOTHSTEP: Long = 64

    public final const val MATH_SQRT: Long = 10

    public final const val MATH_STEPIFY: Long = 25

    public final const val MATH_TAN: Long = 2

    public final const val MATH_TANH: Long = 5

    public final const val MATH_WRAP: Long = 43

    public final const val MATH_WRAPF: Long = 44

    public final const val OBJ_WEAKREF: Long = 49

    public final const val STR_TO_VAR: Long = 60

    public final const val TEXT_CHAR: Long = 54

    public final const val TEXT_ORD: Long = 67

    public final const val TEXT_PRINT: Long = 56

    public final const val TEXT_PRINTERR: Long = 57

    public final const val TEXT_PRINTRAW: Long = 58

    public final const val TEXT_STR: Long = 55

    public final const val TYPE_CONVERT: Long = 51

    public final const val TYPE_EXISTS: Long = 53

    public final const val TYPE_OF: Long = 52

    public final const val VAR_TO_BYTES: Long = 61

    public final const val VAR_TO_STR: Long = 59
  }
}
