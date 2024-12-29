// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.getOpTypePtr
import godot.setOpTypePtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINECLASS_VISUALSHADERNODEMULTIPLYADD: Int = 746

/**
 * Uses three operands to compute `(a * b + c)` expression.
 */
@GodotBaseType
public open class VisualShaderNodeMultiplyAdd : VisualShaderNode() {
  /**
   * A type of operands and returned value.
   */
  public final inline var opType: OpType
    @JvmName("opTypeProperty")
    get() = getOpType()
    @JvmName("opTypeProperty")
    set(`value`) {
      setOpType(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(ENGINECLASS_VISUALSHADERNODEMULTIPLYADD, scriptIndex)
  }

  public final fun setOpType(type: OpType): Unit {
    TransferContext.writeArguments(LONG to type.id)
    TransferContext.callMethod(ptr, MethodBindings.setOpTypePtr, NIL)
  }

  public final fun getOpType(): OpType {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOpTypePtr, LONG)
    return VisualShaderNodeMultiplyAdd.OpType.from(TransferContext.readReturnValue(LONG) as Long)
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
     * A 3D vector type.
     */
    OP_TYPE_VECTOR_3D(2),
    /**
     * A 4D vector type.
     */
    OP_TYPE_VECTOR_4D(3),
    /**
     * Represents the size of the [OpType] enum.
     */
    OP_TYPE_MAX(4),
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

  public object MethodBindings {
    internal val setOpTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeMultiplyAdd", "set_op_type", 1409862380)

    internal val getOpTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeMultiplyAdd", "get_op_type", 2823201991)
  }
}
