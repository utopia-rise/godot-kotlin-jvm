// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A boolean comparison operator to be used within the visual shader graph.
 *
 * Returns the boolean result of the comparison between `INF` or `NaN` and a scalar parameter.
 */
@GodotBaseType
public open class VisualShaderNodeIs : VisualShaderNode() {
  /**
   * The comparison function. See [enum Function] for options.
   */
  public open var function: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEIS_GET_FUNCTION,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEIS_SET_FUNCTION,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODEIS)
  }

  public enum class Function(
    id: Long
  ) {
    /**
     * Comparison with `INF` (Infinity).
     */
    FUNC_IS_INF(0),
    /**
     * Comparison with `NaN` (Not a Number; denotes invalid numeric results, e.g. division by zero).
     */
    FUNC_IS_NAN(1),
    /**
     * Represents the size of the [enum Function] enum.
     */
    FUNC_MAX(2),
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
