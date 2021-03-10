// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class VisualScriptMathConstant : VisualScriptNode() {
  open var constant: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTMATHCONSTANT_GET_CONSTANT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTMATHCONSTANT_SET_CONSTANT, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_VISUALSCRIPTMATHCONSTANT)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  enum class MathConstant(
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

    MATH_CONSTANT_MAX(8);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val MATH_CONSTANT_E: Long = 4

    final const val MATH_CONSTANT_HALF_PI: Long = 2

    final const val MATH_CONSTANT_INF: Long = 6

    final const val MATH_CONSTANT_MAX: Long = 8

    final const val MATH_CONSTANT_NAN: Long = 7

    final const val MATH_CONSTANT_ONE: Long = 0

    final const val MATH_CONSTANT_PI: Long = 1

    final const val MATH_CONSTANT_SQRT2: Long = 5

    final const val MATH_CONSTANT_TAU: Long = 3
  }
}
