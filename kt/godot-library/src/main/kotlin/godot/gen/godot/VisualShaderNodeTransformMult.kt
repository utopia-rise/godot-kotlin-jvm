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

/**
 * Multiplies [godot.core.Transform] by [godot.core.Transform] within the visual shader graph.
 *
 * A multiplication operation on two transforms (4x4 matrices), with support for different multiplication operators.
 */
@GodotBaseType
open class VisualShaderNodeTransformMult : VisualShaderNode() {
  /**
   * The multiplication type to be performed on the transforms. See [enum Operator] for options.
   */
  open var operator: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETRANSFORMMULT_GET_OPERATOR, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETRANSFORMMULT_SET_OPERATOR, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_VISUALSHADERNODETRANSFORMMULT)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  enum class Operator(
    id: Long
  ) {
    /**
     * Multiplies transform `a` by the transform `b`.
     */
    OP_AxB(0),

    /**
     * Multiplies transform `b` by the transform `a`.
     */
    OP_BxA(1),

    /**
     * Performs a component-wise multiplication of transform `a` by the transform `b`.
     */
    OP_AxB_COMP(2),

    /**
     * Performs a component-wise multiplication of transform `b` by the transform `a`.
     */
    OP_BxA_COMP(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * Multiplies transform `a` by the transform `b`.
     */
    final const val OP_AxB: Long = 0

    /**
     * Performs a component-wise multiplication of transform `a` by the transform `b`.
     */
    final const val OP_AxB_COMP: Long = 2

    /**
     * Multiplies transform `b` by the transform `a`.
     */
    final const val OP_BxA: Long = 1

    /**
     * Performs a component-wise multiplication of transform `b` by the transform `a`.
     */
    final const val OP_BxA_COMP: Long = 3
  }
}
