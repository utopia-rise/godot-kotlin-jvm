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
 * Returns an associated value of the [opType] type if the provided boolean value is `true` or
 * `false`.
 */
@GodotBaseType
public open class VisualShaderNodeSwitch : VisualShaderNode() {
  /**
   * A type of operands and returned value.
   */
  public var opType: OpType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOpTypePtr, LONG)
      return VisualShaderNodeSwitch.OpType.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setOpTypePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODESWITCH, scriptIndex)
    return true
  }

  public enum class OpType(
    id: Long,
  ) {
    /**
     * A floating-point scalar.
     */
    OP_TYPE_FLOAT(0),
    /**
     * An integer scalar.
     */
    OP_TYPE_INT(1),
    /**
     * An unsigned integer scalar.
     */
    OP_TYPE_UINT(2),
    /**
     * A 2D vector type.
     */
    OP_TYPE_VECTOR_2D(3),
    /**
     * A 3D vector type.
     */
    OP_TYPE_VECTOR_3D(4),
    /**
     * A 4D vector type.
     */
    OP_TYPE_VECTOR_4D(5),
    /**
     * A boolean type.
     */
    OP_TYPE_BOOLEAN(6),
    /**
     * A transform type.
     */
    OP_TYPE_TRANSFORM(7),
    /**
     * Represents the size of the [OpType] enum.
     */
    OP_TYPE_MAX(8),
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
        TypeManager.getMethodBindPtr("VisualShaderNodeSwitch", "set_op_type")

    public val getOpTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeSwitch", "get_op_type")
  }
}
