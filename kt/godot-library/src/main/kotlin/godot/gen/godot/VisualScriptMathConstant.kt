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
public open class VisualScriptMathConstant : VisualScriptNode() {
  public open var constant: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTMATHCONSTANT_GET_CONSTANT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTMATHCONSTANT_SET_CONSTANT, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSCRIPTMATHCONSTANT)
  }

  public enum class MathConstant(
    id: Long
  ) {
    MATH_CONSTANT_ONE(0),
    MATH_CONSTANT_PI(1),
    MATH_CONSTANT_HALF_PI(2),
    MATH_CONSTANT_TAU(3),
    MATH_CONSTANT_E(4),
    MATH_CONSTANT_SQRT2(5),
    MATH_CONSTANT_INF(6),
    MATH_CONSTANT_NAN(7),
    MATH_CONSTANT_MAX(8),
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
    public final const val MATH_CONSTANT_E: Long = 4

    public final const val MATH_CONSTANT_HALF_PI: Long = 2

    public final const val MATH_CONSTANT_INF: Long = 6

    public final const val MATH_CONSTANT_MAX: Long = 8

    public final const val MATH_CONSTANT_NAN: Long = 7

    public final const val MATH_CONSTANT_ONE: Long = 0

    public final const val MATH_CONSTANT_PI: Long = 1

    public final const val MATH_CONSTANT_SQRT2: Long = 5

    public final const val MATH_CONSTANT_TAU: Long = 3
  }
}
