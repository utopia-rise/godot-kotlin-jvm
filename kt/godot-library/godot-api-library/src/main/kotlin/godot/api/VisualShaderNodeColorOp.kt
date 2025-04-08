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
 * Applies [operator] to two color inputs.
 */
@GodotBaseType
public open class VisualShaderNodeColorOp : VisualShaderNode() {
  /**
   * An operator to be applied to the inputs. See [Operator] for options.
   */
  public final inline var `operator`: Operator
    @JvmName("operatorProperty")
    get() = getOperator()
    @JvmName("operatorProperty")
    set(`value`) {
      setOperator(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(736, scriptIndex)
  }

  public final fun setOperator(op: Operator): Unit {
    TransferContext.writeArguments(LONG to op.id)
    TransferContext.callMethod(ptr, MethodBindings.setOperatorPtr, NIL)
  }

  public final fun getOperator(): Operator {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getOperatorPtr, LONG)
    return VisualShaderNodeColorOp.Operator.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class Operator(
    id: Long,
  ) {
    /**
     * Produce a screen effect with the following formula:
     *
     * ```
     * result = vec3(1.0) - (vec3(1.0) - a) * (vec3(1.0) - b);
     * ```
     */
    SCREEN(0),
    /**
     * Produce a difference effect with the following formula:
     *
     * ```
     * result = abs(a - b);
     * ```
     */
    DIFFERENCE(1),
    /**
     * Produce a darken effect with the following formula:
     *
     * ```
     * result = min(a, b);
     * ```
     */
    DARKEN(2),
    /**
     * Produce a lighten effect with the following formula:
     *
     * ```
     * result = max(a, b);
     * ```
     */
    LIGHTEN(3),
    /**
     * Produce an overlay effect with the following formula:
     *
     * ```
     * for (int i = 0; i < 3; i++) {
     *     float base = a[i];
     *     float blend = b[i];
     *     if (base < 0.5) {
     *         result[i] = 2.0 * base * blend;
     *     } else {
     *         result[i] = 1.0 - 2.0 * (1.0 - blend) * (1.0 - base);
     *     }
     * }
     * ```
     */
    OVERLAY(4),
    /**
     * Produce a dodge effect with the following formula:
     *
     * ```
     * result = a / (vec3(1.0) - b);
     * ```
     */
    DODGE(5),
    /**
     * Produce a burn effect with the following formula:
     *
     * ```
     * result = vec3(1.0) - (vec3(1.0) - a) / b;
     * ```
     */
    BURN(6),
    /**
     * Produce a soft light effect with the following formula:
     *
     * ```
     * for (int i = 0; i < 3; i++) {
     *     float base = a[i];
     *     float blend = b[i];
     *     if (base < 0.5) {
     *         result[i] = base * (blend + 0.5);
     *     } else {
     *         result[i] = 1.0 - (1.0 - base) * (1.0 - (blend - 0.5));
     *     }
     * }
     * ```
     */
    SOFT_LIGHT(7),
    /**
     * Produce a hard light effect with the following formula:
     *
     * ```
     * for (int i = 0; i < 3; i++) {
     *     float base = a[i];
     *     float blend = b[i];
     *     if (base < 0.5) {
     *         result[i] = base * (2.0 * blend);
     *     } else {
     *         result[i] = 1.0 - (1.0 - base) * (1.0 - 2.0 * (blend - 0.5));
     *     }
     * }
     * ```
     */
    HARD_LIGHT(8),
    /**
     * Represents the size of the [Operator] enum.
     */
    MAX(9),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Operator = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setOperatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeColorOp", "set_operator", 4260370673)

    internal val getOperatorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeColorOp", "get_operator", 1950956529)
  }
}
