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
 * Calculates a scalar derivative within the visual shader graph.
 *
 * This node is only available in `Fragment` and `Light` visual shaders.
 */
@GodotBaseType
open class VisualShaderNodeScalarDerivativeFunc : VisualShaderNode() {
  /**
   * The derivative type. See [enum Function] for options.
   */
  open var function: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODESCALARDERIVATIVEFUNC_GET_FUNCTION, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODESCALARDERIVATIVEFUNC_SET_FUNCTION, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_VISUALSHADERNODESCALARDERIVATIVEFUNC,
        ____DO_NOT_TOUCH_THIS_isRef____())
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  enum class Function(
    id: Long
  ) {
    /**
     * Sum of absolute derivative in `x` and `y`.
     */
    FUNC_SUM(0),

    /**
     * Derivative in `x` using local differencing.
     */
    FUNC_X(1),

    /**
     * Derivative in `y` using local differencing.
     */
    FUNC_Y(2);

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
     * Sum of absolute derivative in `x` and `y`.
     */
    final const val FUNC_SUM: Long = 0

    /**
     * Derivative in `x` using local differencing.
     */
    final const val FUNC_X: Long = 1

    /**
     * Derivative in `y` using local differencing.
     */
    final const val FUNC_Y: Long = 2
  }
}
