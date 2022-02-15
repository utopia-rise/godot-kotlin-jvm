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
    MATH_STEP_DECIMALS(24),
    MATH_SNAPPED(25),
    MATH_LERP(26),
    MATH_INVERSE_LERP(27),
    MATH_RANGE_LERP(28),
    MATH_MOVE_TOWARD(29),
    MATH_RANDOMIZE(30),
    MATH_RANDI(31),
    MATH_RANDF(32),
    MATH_RANDI_RANGE(33),
    MATH_RANDF_RANGE(34),
    MATH_RANDFN(35),
    MATH_SEED(36),
    MATH_RANDSEED(37),
    MATH_DEG2RAD(38),
    MATH_RAD2DEG(39),
    MATH_LINEAR2DB(40),
    MATH_DB2LINEAR(41),
    MATH_WRAP(42),
    MATH_WRAPF(43),
    MATH_PINGPONG(44),
    LOGIC_MAX(45),
    LOGIC_MIN(46),
    LOGIC_CLAMP(47),
    LOGIC_NEAREST_PO2(48),
    OBJ_WEAKREF(49),
    TYPE_CONVERT(50),
    TYPE_OF(51),
    TYPE_EXISTS(52),
    TEXT_CHAR(53),
    TEXT_STR(54),
    TEXT_PRINT(55),
    TEXT_PRINTERR(56),
    TEXT_PRINTRAW(57),
    TEXT_PRINT_VERBOSE(58),
    VAR_TO_STR(59),
    STR_TO_VAR(60),
    VAR_TO_BYTES(61),
    BYTES_TO_VAR(62),
    MATH_SMOOTHSTEP(63),
    MATH_POSMOD(64),
    MATH_LERP_ANGLE(65),
    TEXT_ORD(66),
    FUNC_MAX(67),
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
