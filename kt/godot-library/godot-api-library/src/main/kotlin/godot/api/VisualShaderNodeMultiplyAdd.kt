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
import godot.core.GodotEnum
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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

  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(784, scriptPtr)
  }

  public final fun setOpType(type: OpType): Unit {
    TransferContext.writeArguments(LONG to type.value)
    TransferContext.callMethod(ptr, MethodBindings.setOpTypePtr, NIL)
  }

  public final fun getOpType(): OpType {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOpTypePtr, LONG)
    return OpType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class OpType(
    `value`: Long,
  ) : GodotEnum {
    /**
     * A floating-point scalar type.
     */
    SCALAR(0),
    /**
     * A 2D vector type.
     */
    VECTOR_2D(1),
    /**
     * A 3D vector type.
     */
    VECTOR_3D(2),
    /**
     * A 4D vector type.
     */
    VECTOR_4D(3),
    /**
     * Represents the size of the [OpType] enum.
     */
    MAX(4),
    ;

    public override val `value`: Long
    init {
      this.`value` = `value`
    }

    public companion object {
      public fun from(`value`: Long): OpType = entries.single { it.`value` == `value` }
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
