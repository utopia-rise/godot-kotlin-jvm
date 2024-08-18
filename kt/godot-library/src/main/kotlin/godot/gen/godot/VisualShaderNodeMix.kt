// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Translates to `mix(a, b, weight)` in the shader language.
 */
@GodotBaseType
public open class VisualShaderNodeMix : VisualShaderNode() {
  /**
   * A type of operands and returned value.
   */
  public var opType: OpType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOpTypePtr, LONG)
      return VisualShaderNodeMix.OpType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setOpTypePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEMIX, scriptIndex)
    return true
  }

  public enum class OpType(
    id: Long,
  ) {
    /**
     * A floating-point scalar.
     */
    OP_TYPE_SCALAR(0),
    /**
     * A 2D vector type.
     */
    OP_TYPE_VECTOR_2D(1),
    /**
     * The `a` and `b` ports use a 2D vector type. The `weight` port uses a scalar type.
     */
    OP_TYPE_VECTOR_2D_SCALAR(2),
    /**
     * A 3D vector type.
     */
    OP_TYPE_VECTOR_3D(3),
    /**
     * The `a` and `b` ports use a 3D vector type. The `weight` port uses a scalar type.
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
     * Represents the size of the [OpType] enum.
     */
    OP_TYPE_MAX(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): OpType = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setOpTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeMix", "set_op_type")

    public val getOpTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeMix", "get_op_type")
  }
}
