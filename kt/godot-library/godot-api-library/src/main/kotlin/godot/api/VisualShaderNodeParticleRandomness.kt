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
import godot.core.MethodStringName0
import godot.core.MethodStringName1
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmStatic

/**
 * Randomness node will output pseudo-random values of the given type based on the specified minimum
 * and maximum values.
 */
@GodotBaseType
public open class VisualShaderNodeParticleRandomness : VisualShaderNode() {
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
    createNativeObject(780, scriptIndex)
  }

  public final fun setOpType(type: OpType): Unit {
    TransferContext.writeArguments(LONG to type.id)
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
     * A floating-point scalar.
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

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): OpType = entries.single { it.id == `value` }
    }
  }

  public companion object {
    @JvmStatic
    public val setOpTypeName: MethodStringName1<VisualShaderNodeParticleRandomness, Unit, OpType> =
        MethodStringName1<VisualShaderNodeParticleRandomness, Unit, OpType>("set_op_type")

    @JvmStatic
    public val getOpTypeName: MethodStringName0<VisualShaderNodeParticleRandomness, OpType> =
        MethodStringName0<VisualShaderNodeParticleRandomness, OpType>("get_op_type")
  }

  public object MethodBindings {
    internal val setOpTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParticleRandomness", "set_op_type", 2060089061)

    internal val getOpTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeParticleRandomness", "get_op_type", 3597061078)
  }
}
