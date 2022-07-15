// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

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
  public var constant: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTMATHCONSTANT_GET_MATH_CONSTANT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTMATHCONSTANT_SET_MATH_CONSTANT, NIL)
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

  public companion object
}
