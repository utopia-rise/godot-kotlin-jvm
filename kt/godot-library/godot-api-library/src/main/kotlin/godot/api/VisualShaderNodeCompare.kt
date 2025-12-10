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
 * Compares `a` and `b` of [type] by [function]. Returns a boolean scalar. Translates to `if`
 * instruction in shader code.
 */
@GodotBaseType
public open class VisualShaderNodeCompare : VisualShaderNode() {
  /**
   * The type to be used in the comparison.
   */
  public final inline var type: ComparisonType
    @JvmName("typeProperty")
    get() = getComparisonType()
    @JvmName("typeProperty")
    set(`value`) {
      setComparisonType(value)
    }

  /**
   * A comparison function.
   */
  public final inline var function: Function
    @JvmName("functionProperty")
    get() = getFunction()
    @JvmName("functionProperty")
    set(`value`) {
      setFunction(value)
    }

  /**
   * Extra condition which is applied if [type] is set to [CTYPE_VECTOR_3D].
   */
  public final inline var condition: Condition
    @JvmName("conditionProperty")
    get() = getCondition()
    @JvmName("conditionProperty")
    set(`value`) {
      setCondition(value)
    }

  public override fun new(scriptPtr: VoidPtr): Unit {
    createNativeObject(754, scriptPtr)
  }

  public final fun setComparisonType(type: ComparisonType): Unit {
    TransferContext.writeArguments(LONG to type.value)
    TransferContext.callMethod(ptr, MethodBindings.setComparisonTypePtr, NIL)
  }

  public final fun getComparisonType(): ComparisonType {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getComparisonTypePtr, LONG)
    return ComparisonType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setFunction(func: Function): Unit {
    TransferContext.writeArguments(LONG to func.value)
    TransferContext.callMethod(ptr, MethodBindings.setFunctionPtr, NIL)
  }

  public final fun getFunction(): Function {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFunctionPtr, LONG)
    return Function.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setCondition(condition: Condition): Unit {
    TransferContext.writeArguments(LONG to condition.value)
    TransferContext.callMethod(ptr, MethodBindings.setConditionPtr, NIL)
  }

  public final fun getCondition(): Condition {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getConditionPtr, LONG)
    return Condition.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public enum class ComparisonType(
    `value`: Long,
  ) : GodotEnum {
    /**
     * A floating-point scalar.
     */
    CTYPE_SCALAR(0),
    /**
     * An integer scalar.
     */
    CTYPE_SCALAR_INT(1),
    /**
     * An unsigned integer scalar.
     */
    CTYPE_SCALAR_UINT(2),
    /**
     * A 2D vector type.
     */
    CTYPE_VECTOR_2D(3),
    /**
     * A 3D vector type.
     */
    CTYPE_VECTOR_3D(4),
    /**
     * A 4D vector type.
     */
    CTYPE_VECTOR_4D(5),
    /**
     * A boolean type.
     */
    CTYPE_BOOLEAN(6),
    /**
     * A transform (`mat4`) type.
     */
    CTYPE_TRANSFORM(7),
    /**
     * Represents the size of the [ComparisonType] enum.
     */
    CTYPE_MAX(8),
    ;

    public override val `value`: Long
    init {
      this.`value` = `value`
    }

    public companion object {
      public fun from(`value`: Long): ComparisonType = entries.single { it.`value` == `value` }
    }
  }

  public enum class Function(
    `value`: Long,
  ) : GodotEnum {
    /**
     * Comparison for equality (`a == b`).
     */
    EQUAL(0),
    /**
     * Comparison for inequality (`a != b`).
     */
    NOT_EQUAL(1),
    /**
     * Comparison for greater than (`a > b`). Cannot be used if [type] set to [CTYPE_BOOLEAN] or
     * [CTYPE_TRANSFORM].
     */
    GREATER_THAN(2),
    /**
     * Comparison for greater than or equal (`a >= b`). Cannot be used if [type] set to
     * [CTYPE_BOOLEAN] or [CTYPE_TRANSFORM].
     */
    GREATER_THAN_EQUAL(3),
    /**
     * Comparison for less than (`a < b`). Cannot be used if [type] set to [CTYPE_BOOLEAN] or
     * [CTYPE_TRANSFORM].
     */
    LESS_THAN(4),
    /**
     * Comparison for less than or equal (`a <= b`). Cannot be used if [type] set to [CTYPE_BOOLEAN]
     * or [CTYPE_TRANSFORM].
     */
    LESS_THAN_EQUAL(5),
    /**
     * Represents the size of the [Function] enum.
     */
    MAX(6),
    ;

    public override val `value`: Long
    init {
      this.`value` = `value`
    }

    public companion object {
      public fun from(`value`: Long): Function = entries.single { it.`value` == `value` }
    }
  }

  public enum class Condition(
    `value`: Long,
  ) : GodotEnum {
    /**
     * The result will be `true` if all components in the vector satisfy the comparison condition.
     */
    ALL(0),
    /**
     * The result will be `true` if any component in the vector satisfies the comparison condition.
     */
    ANY(1),
    /**
     * Represents the size of the [Condition] enum.
     */
    MAX(2),
    ;

    public override val `value`: Long
    init {
      this.`value` = `value`
    }

    public companion object {
      public fun from(`value`: Long): Condition = entries.single { it.`value` == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val setComparisonTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCompare", "set_comparison_type", 516558320)

    internal val getComparisonTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCompare", "get_comparison_type", 3495315961)

    internal val setFunctionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCompare", "set_function", 2370951349)

    internal val getFunctionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCompare", "get_function", 4089164265)

    internal val setConditionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCompare", "set_condition", 918742392)

    internal val getConditionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeCompare", "get_condition", 3281078941)
  }
}
