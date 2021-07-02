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
 * Multiplies a [godot.core.Transform] and a [godot.core.Vector3] within the visual shader graph.
 *
 * A multiplication operation on a transform (4x4 matrix) and a vector, with support for different multiplication operators.
 */
@GodotBaseType
public open class VisualShaderNodeTransformVecMult : VisualShaderNode() {
  /**
   * The multiplication type to be performed. See [enum Operator] for options.
   */
  public open var `operator`: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETRANSFORMVECMULT_GET_OPERATOR, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETRANSFORMVECMULT_SET_OPERATOR, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODETRANSFORMVECMULT)
  }

  public enum class Operator(
    id: Long
  ) {
    /**
     * Multiplies transform `a` by the vector `b`.
     */
    OP_AxB(0),
    /**
     * Multiplies vector `b` by the transform `a`.
     */
    OP_BxA(1),
    /**
     * Multiplies transform `a` by the vector `b`, skipping the last row and column of the transform.
     */
    OP_3x3_AxB(2),
    /**
     * Multiplies vector `b` by the transform `a`, skipping the last row and column of the transform.
     */
    OP_3x3_BxA(3),
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
     * Multiplies transform `a` by the vector `b`, skipping the last row and column of the transform.
     */
    public final const val OP_3x3_AxB: Long = 2

    /**
     * Multiplies vector `b` by the transform `a`, skipping the last row and column of the transform.
     */
    public final const val OP_3x3_BxA: Long = 3

    /**
     * Multiplies transform `a` by the vector `b`.
     */
    public final const val OP_AxB: Long = 0

    /**
     * Multiplies vector `b` by the transform `a`.
     */
    public final const val OP_BxA: Long = 1
  }
}
