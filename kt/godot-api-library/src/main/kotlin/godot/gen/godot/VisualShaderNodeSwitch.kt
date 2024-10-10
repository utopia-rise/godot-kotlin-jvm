// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_VISUALSHADERNODESWITCH_INDEX: Int = 775

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
    Internals.callConstructor(this, ENGINE_CLASS_VISUALSHADERNODESWITCH_INDEX, scriptIndex)
  }

  public final fun setOpType(type: OpType): Unit {
    Internals.writeArguments(LONG to type.id)
    Internals.callMethod(rawPtr, MethodBindings.setOpTypePtr, NIL)
  }

  public final fun getOpType(): OpType {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getOpTypePtr, LONG)
    return VisualShaderNodeSwitch.OpType.from(Internals.readReturnValue(LONG) as Long)
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
        Internals.getMethodBindPtr("VisualShaderNodeSwitch", "set_op_type", 510471861)

    public val getOpTypePtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeSwitch", "get_op_type", 2517845071)
  }
}
