// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * A [godot.Transform3D] operator to be used within the visual shader graph.
 *
 * Applies [operator] to two transform (4x4 matrices) inputs.
 */
@GodotBaseType
public open class VisualShaderNodeTransformOp : VisualShaderNode() {
  /**
   * The type of the operation to be performed on the transforms. See [enum Operator] for options.
   */
  public var `operator`: Operator
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETRANSFORMOP_GET_OPERATOR, LONG)
      return VisualShaderNodeTransformOp.Operator.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODETRANSFORMOP_SET_OPERATOR, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODETRANSFORMOP, scriptIndex)
    return true
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
    /**
     * Adds two transforms.
     */
    OP_ADD(4),
    /**
     * Subtracts the transform `a` from the transform `b`.
     */
    OP_A_MINUS_B(5),
    /**
     * Subtracts the transform `b` from the transform `a`.
     */
    OP_B_MINUS_A(6),
    /**
     * Divides the transform `a` by the transform `b`.
     */
    OP_A_DIV_B(7),
    /**
     * Divides the transform `b` by the transform `a`.
     */
    OP_B_DIV_A(8),
    /**
     * Represents the size of the [enum Operator] enum.
     */
    OP_MAX(9),
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
