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
 * Multiplies [godot.core.Transform] by [godot.core.Transform] within the visual shader graph.
 *
 * A multiplication operation on two transforms (4x4 matrices), with support for different multiplication operators.
 */
@GodotBaseType
public open class VisualShaderNodeTransformMult : VisualShaderNode() {
  /**
   * The multiplication type to be performed on the transforms. See [enum Operator] for options.
   */
  public open var `operator`: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETRANSFORMMULT_GET_OPERATOR, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETRANSFORMMULT_SET_OPERATOR, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODETRANSFORMMULT)
  }

  public enum class Operator(
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
    OP_BxA_COMP(3),
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
     * Multiplies transform `a` by the transform `b`.
     */
    public final const val OP_AxB: Long = 0

    /**
     * Performs a component-wise multiplication of transform `a` by the transform `b`.
     */
    public final const val OP_AxB_COMP: Long = 2

    /**
     * Multiplies transform `b` by the transform `a`.
     */
    public final const val OP_BxA: Long = 1

    /**
     * Performs a component-wise multiplication of transform `b` by the transform `a`.
     */
    public final const val OP_BxA_COMP: Long = 3
  }
}
