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
open class VisualShaderNodeVectorOp : VisualShaderNode() {
  open var operator: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEVECTOROP_GET_OPERATOR, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEVECTOROP_SET_OPERATOR, NIL)
    }

  override fun __new(): VoidPtr =
      TransferContext.invokeConstructor(ENGINECLASS_VISUALSHADERNODEVECTOROP)

  enum class Operator(
    id: Long
  ) {
    OP_ADD(0),

    OP_SUB(1),

    OP_MUL(2),

    OP_DIV(3),

    OP_MOD(4),

    OP_POW(5),

    OP_MAX(6),

    OP_MIN(7),

    OP_CROSS(8),

    OP_ATAN2(9),

    OP_REFLECT(10),

    OP_STEP(11);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val OP_ADD: Long = 0

    final const val OP_ATAN2: Long = 9

    final const val OP_CROSS: Long = 8

    final const val OP_DIV: Long = 3

    final const val OP_MAX: Long = 6

    final const val OP_MIN: Long = 7

    final const val OP_MOD: Long = 4

    final const val OP_MUL: Long = 2

    final const val OP_POW: Long = 5

    final const val OP_REFLECT: Long = 10

    final const val OP_STEP: Long = 11

    final const val OP_SUB: Long = 1
  }
}
