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

private const val ENGINE_CLASS_VISUALSHADERNODECOMPARE_INDEX: Int = 716

/**
 * Compares `a` and `b` of [type] by [function]. Returns a boolean scalar. Translates to `if`
 * instruction in shader code.
 */
@GodotBaseType
public open class VisualShaderNodeCompare : VisualShaderNode() {
  /**
   * The type to be used in the comparison. See [ComparisonType] for options.
   */
  public final inline var type: ComparisonType
    @JvmName("typeProperty")
    get() = getComparisonType()
    @JvmName("typeProperty")
    set(`value`) {
      setComparisonType(value)
    }

  /**
   * A comparison function. See [Function] for options.
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

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_VISUALSHADERNODECOMPARE_INDEX, scriptIndex)
  }

  public final fun setComparisonType(type: ComparisonType): Unit {
    Internals.writeArguments(LONG to type.id)
    Internals.callMethod(rawPtr, MethodBindings.setComparisonTypePtr, NIL)
  }

  public final fun getComparisonType(): ComparisonType {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getComparisonTypePtr, LONG)
    return VisualShaderNodeCompare.ComparisonType.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setFunction(func: Function): Unit {
    Internals.writeArguments(LONG to func.id)
    Internals.callMethod(rawPtr, MethodBindings.setFunctionPtr, NIL)
  }

  public final fun getFunction(): Function {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFunctionPtr, LONG)
    return VisualShaderNodeCompare.Function.from(Internals.readReturnValue(LONG) as Long)
  }

  public final fun setCondition(condition: Condition): Unit {
    Internals.writeArguments(LONG to condition.id)
    Internals.callMethod(rawPtr, MethodBindings.setConditionPtr, NIL)
  }

  public final fun getCondition(): Condition {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getConditionPtr, LONG)
    return VisualShaderNodeCompare.Condition.from(Internals.readReturnValue(LONG) as Long)
  }

  public enum class ComparisonType(
    id: Long,
  ) {
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

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): ComparisonType = entries.single { it.id == `value` }
    }
  }

  public enum class Function(
    id: Long,
  ) {
    /**
     * Comparison for equality (`a == b`).
     */
    FUNC_EQUAL(0),
    /**
     * Comparison for inequality (`a != b`).
     */
    FUNC_NOT_EQUAL(1),
    /**
     * Comparison for greater than (`a > b`). Cannot be used if [type] set to [CTYPE_BOOLEAN] or
     * [CTYPE_TRANSFORM].
     */
    FUNC_GREATER_THAN(2),
    /**
     * Comparison for greater than or equal (`a >= b`). Cannot be used if [type] set to
     * [CTYPE_BOOLEAN] or [CTYPE_TRANSFORM].
     */
    FUNC_GREATER_THAN_EQUAL(3),
    /**
     * Comparison for less than (`a < b`). Cannot be used if [type] set to [CTYPE_BOOLEAN] or
     * [CTYPE_TRANSFORM].
     */
    FUNC_LESS_THAN(4),
    /**
     * Comparison for less than or equal (`a <= b`). Cannot be used if [type] set to [CTYPE_BOOLEAN]
     * or [CTYPE_TRANSFORM].
     */
    FUNC_LESS_THAN_EQUAL(5),
    /**
     * Represents the size of the [Function] enum.
     */
    FUNC_MAX(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Function = entries.single { it.id == `value` }
    }
  }

  public enum class Condition(
    id: Long,
  ) {
    /**
     * The result will be true if all of component in vector satisfy the comparison condition.
     */
    COND_ALL(0),
    /**
     * The result will be true if any of component in vector satisfy the comparison condition.
     */
    COND_ANY(1),
    /**
     * Represents the size of the [Condition] enum.
     */
    COND_MAX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Condition = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setComparisonTypePtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeCompare", "set_comparison_type", 516558320)

    public val getComparisonTypePtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeCompare", "get_comparison_type", 3495315961)

    public val setFunctionPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeCompare", "set_function", 2370951349)

    public val getFunctionPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeCompare", "get_function", 4089164265)

    public val setConditionPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeCompare", "set_condition", 918742392)

    public val getConditionPtr: VoidPtr =
        Internals.getMethodBindPtr("VisualShaderNodeCompare", "get_condition", 3281078941)
  }
}
