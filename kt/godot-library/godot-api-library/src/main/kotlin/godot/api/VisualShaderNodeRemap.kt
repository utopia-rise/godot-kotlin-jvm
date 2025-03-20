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
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Remap will transform the input range into output range, e.g. you can change a `0..1` value to
 * `-2..2` etc. See [@GlobalScope.remap] for more details.
 */
@GodotBaseType
public open class VisualShaderNodeRemap : VisualShaderNode() {
  public final inline var opType: OpType
    @JvmName("opTypeProperty")
    get() = getOpType()
    @JvmName("opTypeProperty")
    set(`value`) {
      setOpType(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(788, scriptIndex)
  }

  public final fun setOpType(opType: OpType): Unit {
    TransferContext.writeArguments(LONG to opType.id)
    TransferContext.callMethod(ptr, MethodBindings.setOpTypePtr, NIL)
  }

  public final fun getOpType(): OpType {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOpTypePtr, LONG)
    return OpType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class OpType(
    id: Long,
  ) {
    /**
     * A floating-point scalar type.
     */
    SCALAR(0),
    /**
     * A 2D vector type.
     */
    VECTOR_2D(1),
    /**
     * The `value` port uses a 2D vector type, while the `input min`, `input max`, `output min`, and
     * `output max` ports use a floating-point scalar type.
     */
    VECTOR_2D_SCALAR(2),
    /**
     * A 3D vector type.
     */
    VECTOR_3D(3),
    /**
     * The `value` port uses a 3D vector type, while the `input min`, `input max`, `output min`, and
     * `output max` ports use a floating-point scalar type.
     */
    VECTOR_3D_SCALAR(4),
    /**
     * A 4D vector type.
     */
    VECTOR_4D(5),
    /**
     * The `value` port uses a 4D vector type, while the `input min`, `input max`, `output min`, and
     * `output max` ports use a floating-point scalar type.
     */
    VECTOR_4D_SCALAR(6),
    /**
     * Represents the size of the [OpType] enum.
     */
    MAX(7),
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
        TypeManager.getMethodBindPtr("VisualShaderNodeRemap", "set_op_type", 1703697889)

    internal val getOpTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeRemap", "get_op_type", 1678380563)
  }
}
