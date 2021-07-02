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

/**
 * Calculates a scalar derivative within the visual shader graph.
 *
 * This node is only available in `Fragment` and `Light` visual shaders.
 */
@GodotBaseType
public open class VisualShaderNodeScalarDerivativeFunc : VisualShaderNode() {
  /**
   * The derivative type. See [enum Function] for options.
   */
  public open var function: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODESCALARDERIVATIVEFUNC_GET_FUNCTION, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODESCALARDERIVATIVEFUNC_SET_FUNCTION, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODESCALARDERIVATIVEFUNC)
  }

  public enum class Function(
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
    FUNC_Y(2),
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
    /**
     * Sum of absolute derivative in `x` and `y`.
     */
    public final const val FUNC_SUM: Long = 0

    /**
     * Derivative in `x` using local differencing.
     */
    public final const val FUNC_X: Long = 1

    /**
     * Derivative in `y` using local differencing.
     */
    public final const val FUNC_Y: Long = 2
  }
}
