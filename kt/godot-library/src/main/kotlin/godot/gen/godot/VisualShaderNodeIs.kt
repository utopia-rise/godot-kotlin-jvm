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

/**
 * A boolean comparison operator to be used within the visual shader graph.
 *
 * Returns the boolean result of the comparison between `INF` or `NaN` and a scalar parameter.
 */
@GodotBaseType
open class VisualShaderNodeIs : VisualShaderNode() {
  /**
   * The comparison function. See [enum Function] for options.
   */
  open var function: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEIS_GET_FUNCTION,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEIS_SET_FUNCTION,
          NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_VISUALSHADERNODEIS)

  enum class Function(
    id: Long
  ) {
    /**
     * Comparison with `INF` (Infinity).
     */
    FUNC_IS_INF(0),

    /**
     * Comparison with `NaN` (Not a Number; denotes invalid numeric results, e.g. division by zero).
     */
    FUNC_IS_NAN(1);

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
     * Comparison with `INF` (Infinity).
     */
    final const val FUNC_IS_INF: Long = 0

    /**
     * Comparison with `NaN` (Not a Number; denotes invalid numeric results, e.g. division by zero).
     */
    final const val FUNC_IS_NAN: Long = 1
  }
}
