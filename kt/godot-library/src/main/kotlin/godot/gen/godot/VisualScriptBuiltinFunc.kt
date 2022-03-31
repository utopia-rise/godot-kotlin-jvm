// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

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
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTBUILTINFUNC_GET_FUNC,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTBUILTINFUNC_SET_FUNC,
          NIL)
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
    MATH_STEP_DECIMALS(24),
    MATH_SNAPPED(25),
    MATH_LERP(26),
    MATH_CUBIC_INTERPOLATE(27),
    MATH_INVERSE_LERP(28),
    MATH_RANGE_LERP(29),
    MATH_MOVE_TOWARD(30),
    MATH_RANDOMIZE(31),
    MATH_RANDI(32),
    MATH_RANDF(33),
    MATH_RANDI_RANGE(34),
    MATH_RANDF_RANGE(35),
    MATH_RANDFN(36),
    MATH_SEED(37),
    MATH_RANDSEED(38),
    MATH_DEG2RAD(39),
    MATH_RAD2DEG(40),
    MATH_LINEAR2DB(41),
    MATH_DB2LINEAR(42),
    MATH_WRAP(43),
    MATH_WRAPF(44),
    MATH_PINGPONG(45),
    LOGIC_MAX(46),
    LOGIC_MIN(47),
    LOGIC_CLAMP(48),
    LOGIC_NEAREST_PO2(49),
    OBJ_WEAKREF(50),
    TYPE_CONVERT(51),
    TYPE_OF(52),
    TYPE_EXISTS(53),
    TEXT_CHAR(54),
    TEXT_STR(55),
    TEXT_PRINT(56),
    TEXT_PRINTERR(57),
    TEXT_PRINTRAW(58),
    TEXT_PRINT_VERBOSE(59),
    VAR_TO_STR(60),
    STR_TO_VAR(61),
    VAR_TO_BYTES(62),
    BYTES_TO_VAR(63),
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

  public companion object
}
