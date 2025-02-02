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
 * Returns an associated value of the [opType] type if the provided boolean value is `true` or
 * `false`.
 */
@GodotBaseType
public open class VisualShaderNodeSwitch : VisualShaderNode() {
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
    createNativeObject(775, scriptIndex)
  }

  public final fun setOpType(type: OpType): Unit {
    TransferContext.writeArguments(LONG to type.id)
    TransferContext.callMethod(ptr, MethodBindings.setOpTypePtr, NIL)
  }

  public final fun getOpType(): OpType {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOpTypePtr, LONG)
    return VisualShaderNodeSwitch.OpType.from(TransferContext.readReturnValue(LONG) as Long)
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

  public object MethodBindings {
    internal val setOpTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeSwitch", "set_op_type", 510471861)

    internal val getOpTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeSwitch", "get_op_type", 2517845071)
  }
}
