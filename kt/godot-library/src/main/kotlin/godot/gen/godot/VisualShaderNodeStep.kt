// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Calculates a Step function within the visual shader graph.
 *
 * Translates to `step(edge, x)` in the shader language.
 *
 * Returns `0.0` if `x` is smaller than `edge` and `1.0` otherwise.
 */
@GodotBaseType
public open class VisualShaderNodeStep : VisualShaderNode() {
  /**
   * A type of operands and returned value.
   */
  public var opType: OpType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODESTEP_GET_OP_TYPE,
          LONG)
      return VisualShaderNodeStep.OpType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODESTEP_SET_OP_TYPE,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODESTEP, scriptIndex)
    return true
  }

  public enum class OpType(
    id: Long,
  ) {
    /**
     * A floating-point scalar type.
     */
    OP_TYPE_SCALAR(0),
    /**
     * A 2D vector type.
     */
    OP_TYPE_VECTOR_2D(1),
    /**
     * The `x` port uses a 2D vector type, while the `edge` port uses a floating-point scalar type.
     */
    OP_TYPE_VECTOR_2D_SCALAR(2),
    /**
     * A 3D vector type.
     */
    OP_TYPE_VECTOR_3D(3),
    /**
     * The `x` port uses a 3D vector type, while the `edge` port uses a floating-point scalar type.
     */
    OP_TYPE_VECTOR_3D_SCALAR(4),
    /**
     * A 4D vector type.
     */
    OP_TYPE_VECTOR_4D(5),
    /**
     * The `a` and `b` ports use a 4D vector type. The `weight` port uses a scalar type.
     */
    OP_TYPE_VECTOR_4D_SCALAR(6),
    /**
     * Represents the size of the [enum OpType] enum.
     */
    OP_TYPE_MAX(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object
}
